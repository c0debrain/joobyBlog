package com.viator.tgds;

import com.typesafe.config.ConfigValueFactory;
import org.jooby.Jooby;
import org.jooby.Results;
import org.jooby.ftl.Ftl;

/**
 * @author jooby generator
 */
public class App extends Jooby {

  {
    use(new Ftl());
    assets("/assets/**");

    get("/", req -> Results.html("index").put("appName",ConfigValueFactory.fromAnyRef("app.name")));
  }

  public static void main(final String[] args) throws Exception {
    new App().start(args);
  }

}
