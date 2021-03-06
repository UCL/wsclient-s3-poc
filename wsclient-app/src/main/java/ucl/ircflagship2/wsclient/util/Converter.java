/*
 * The MIT License
 *
 * Copyright 2017 David Guzman <d.guzman at ucl.ac.uk>.
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
package ucl.ircflagship2.wsclient.util;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

/**
 *
 * @author David Guzman <d.guzman at ucl.ac.uk>
 */
public class Converter {

  public static Optional<String> timerInfoToString(final Serializable input) {
    if (input instanceof String) {
      return Optional.of((String) input);
    } else {
      return Optional.empty();
    }
  }

  public static Optional<String> encodeRfc1738(final String input) {
    try {
      return Optional.of(URLEncoder.encode(input, StandardCharsets.UTF_8.name()));
    } catch (UnsupportedEncodingException ex) {
      return Optional.empty();
    }
  }

  public static Optional<String> encodeRfc3986(final String input) {
    try {
      URI uri = new URI(null, input, null);
      return Optional.of(uri.toASCIIString());
    } catch (URISyntaxException ex) {
      return Optional.empty();
    }
  }

}
