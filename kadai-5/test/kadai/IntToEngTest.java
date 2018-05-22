package kadai;



import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class IntToEngTest {

	@Test
	public void 一を英語にする() {
		IntToEng ite = new IntToEng();
		String expected="one";
		String actual=ite.translateEng(1);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void 二十五を英語にする() {
		IntToEng ite = new IntToEng();
		String expected="twenty five";
		String actual=ite.translateEng(25);
		assertThat(actual,is(expected));
	}

	@Test
	public void 四十五を英語にする() {
		IntToEng ite = new IntToEng();
		String expected="fourty five";
		String actual=ite.translateEng(45);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void 百三十五を英語にする() {
		IntToEng ite = new IntToEng();
		String expected="one hundred thirty five";
		String actual=ite.translateEng(135);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void 千二百四十五を英語にする() {
		IntToEng ite = new IntToEng();
		String expected="one thousand two hundred fourty five";
		String actual=ite.translateEng(1245);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void 二万千二百四十五を英語にする() {
		IntToEng ite = new IntToEng();
		String expected="twenty one thousand two hundred fourty five";
		String actual=ite.translateEng(21245);
		assertThat(actual,is(expected));
	}


}