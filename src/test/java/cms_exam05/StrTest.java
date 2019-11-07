package cms_exam05;

import static org.junit.Assert.assertFalse;

import org.junit.Test;
import com.bawei.myTest.StringUtils;

public class StrTest {

	@Test
	public void strNull() {		
		assertFalse(StringUtils.notNull("aaa"));
	}
}
