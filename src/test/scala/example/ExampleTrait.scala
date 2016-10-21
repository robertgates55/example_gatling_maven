package example

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

trait ExampleTrait extends Simulation {

  object Example {

    def welcomePageLoad() : ChainBuilder = {

      exec(http("ACT_001 - Welcome Page")
        .post("http://52.59.232.169:8780/konakart/Welcome.action")
        .check(status.is(200))
      )

    }

  }
}