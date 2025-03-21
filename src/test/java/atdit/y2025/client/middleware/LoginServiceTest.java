package atdit.y2025.client.middleware;

import atdit.y2025.client.domain.LoginFailedException;
import atdit.y2025.client.domain.ServiceException;
import atdit.y2025.client.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginServiceTest {
  @Test
  public void ifUserInitial_ThenLoginFailed() {
    User user = null;
    try {
      user = new LoginService().login( "", "" );
      } catch( ServiceException e ) {
      Assertions.fail( "Should have thrown LoginFailedException but got " + e );
    } catch( LoginFailedException e ) {
      //expected case => test succeeded
    }

    Assertions.assertEquals( null, user );
  }

  @Test
  public void ifUserName_ThenLoginFailed() {
  }
}
