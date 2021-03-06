/*
 * The MIT License
 *
 * Copyright 2018 David Guzman <d.guzman at ucl.ac.uk>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package ucl.ircflagship2.wsclient.apicall;

import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author David Guzman <d.guzman at ucl.ac.uk>
 */
@ApplicationScoped
public class MsGraphSettings {

  private final String MSGRAPH_REFRESH = System.getenv("MSGRAPH_REFRESH");
  private final String MSAPP_SECRET = System.getenv("MSAPP_SECRET");
  private final String MSAPP_ID = System.getenv("MSAPP_ID");
  private final String AUTH_BASE_URL = "https://login.microsoftonline.com";
  private final String AUTH_PATH = "/common/oauth2/v2.0/token";
  private final String MSGRAPH_BASE_URL = "https://graph.microsoft.com/v1.0";
  private final String UPLOAD_PATH = "/me/drive/items/root:/{filename}:/content";
  private final String REDIRECT_URI = "http://localhost/wsclient";

  public String getAuthBaseUrl() {
    return AUTH_BASE_URL;
  }

  public String getAuthPath() {
    return AUTH_PATH;
  }

  public String getMsAppId() {
    return MSAPP_ID;
  }

  public String getRedirectUri() {
    return REDIRECT_URI;
  }

  public String getMsGraphRefresh() {
    return MSGRAPH_REFRESH;
  }

  public String getMsAppSecret() {
    return MSAPP_SECRET;
  }

  public String getMsGraphBaseUrl() {
    return MSGRAPH_BASE_URL;
  }

  public String getUploadPath() {
    return UPLOAD_PATH;
  }

}
