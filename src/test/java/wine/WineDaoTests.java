package wine;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import wine.domain.Country;
import wine.domain.CountryDAO;
import wine.domain.User;
import wine.domain.UserDAO;
import wine.domain.Wine;
import wine.domain.WineDAO;

@RunWith(SpringJUnit4ClassRunner.class)
public class WineDaoTests {

	@Autowired
	private WineDAO winedao;

	@Autowired
	private CountryDAO countrydao;

	@Autowired
	private UserDAO userdao;

	@Test
	public void findAllWinesTest() {
		List<Wine> wines = winedao.findAll();
		assertThat(wines);
	}
	
	@Test
	public void findWineByIdTest() {
		Wine wine = winedao.findOne(1L);
		assertThat(wine);
	}

	@Test
	public void findAllCountriesTest() {
		List <Country> countries = countrydao.findAllCountries();
		assertThat(countries).hasSize(1);
	}

	@Test
	public void findUserByNameTest() {
		User user = userdao.findOne("admin");
		assertThat(user.getRole()).isEqualTo("ROLE_ADMIN");
	}

	@Test
	public void createWineTest() {
		Wine wine = new Wine("Testiviini", new Country(1, "Bolivia"), 1993, "Testierä", "Testaamo", "Ei muistiinpanoja" );
		winedao.save(wine);
		assertThat(wine.getWineid()).isNotNull();
	}
	
	
	@Test
	public void deleteWineTest() {
		winedao.delete(1L);
		assertThat(winedao.findOne(1L)).isEqualTo(null);
	}
}
