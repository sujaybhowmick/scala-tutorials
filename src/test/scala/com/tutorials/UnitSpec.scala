package com.tutorials

import org.scalatest._
/**
 * Created by sujay on 3/23/14.
 */
abstract class UnitSpec extends FlatSpec with Matchers
            with OptionValues with Inside with Inspectors {

}
