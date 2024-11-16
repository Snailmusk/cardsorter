package org.snailmusk.cards
import org.scalatest._,  wordspec._, matchers._


import Cards.*


class CardsTest  extends AnyWordSpec with should.Matchers :
  "list cards" should {"work" in {

    listCollection()
  }}


  