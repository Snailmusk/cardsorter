package org.snailmusk.cards

object Cards :

  enum Color(cost:Int=1):
    case Red(cost:Int=1)   extends Color(cost)
    case Green(cost:Int=1) extends Color(cost)
    case Blue(cost:Int=1)  extends Color(cost)
    case Yellow(cost:Int=1) extends Color(cost)
    case Purple(cost:Int=1) extends Color(cost)


  enum Kind() :
    case Commander extends Kind
    case Operation extends Kind
    case Summon extends Kind
    case Structure extends Kind
    case Source extends Kind
    case Weapon extends Kind  

  enum Rarity () :
    case Common extends Rarity
    case UnCommon extends Rarity
    case Rare extends Rarity
    case Sublime extends Rarity  


  case class Card (kind:Kind, name:String, color:List[Color])


  import Kind.*
  import Color.*
  import Rarity.*
  val cardCollection = List(
    Card(Summon,"Abyssal Lurker",List(Blue(3),Purple(3))),
    Card(Summon,"Agent 77",List(Red(),Blue(),Yellow(2))),

  )



  
  def search()  = ???
  
  
  /**
    * lists all cards in my collection
    */
  def listCollection() =
    cardCollection.foreach(println)





  
