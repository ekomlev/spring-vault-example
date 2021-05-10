import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.eduard.config.VaultConfig;
import com.eduard.pojo.UserCredentials;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = VaultConfig.class)
@Slf4j
public class VaultTest {
  @Autowired
  private UserCredentials userCredentials;

  @Test
  public void userCredentialsTest() {
    Assert.assertNotNull("User name is null", userCredentials.getUsername());
    Assert.assertEquals(String.format("User name is %s", userCredentials.getUsername()), "some_username", userCredentials.getUsername());

    Assert.assertNotNull("Password is null", userCredentials.getPassword());
    Assert.assertEquals(String.format("Password is %s", userCredentials.getUsername()), "some_password", userCredentials.getPassword());
  }
}