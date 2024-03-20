package Demo

object ex2 {

  type Entry = (String, String, String)
  type LTelef = List[Entry]

  def emailsWithPrefix(lst: LTelef, prefix: Char): List[String] = {
    def isFixedNetwork(entry: Entry): Boolean = entry._2.startsWith(prefix.toString)

    lst.filter(isFixedNetwork).map(_._3)
  }

  def removeEntries(lst: LTelef, condition: Entry => Boolean): LTelef = {
    lst.filterNot(condition)
  }

  // Exemplo de uso:
  val phoneBook: LTelef = List(
    ("John", "123456", "john@example.com"),
    ("Alice", "234567", "alice@example.com"),
    ("Bob", "212345", "bob@example.com"),
    ("Charlie", "298765", "charlie@example.com")
  )

  // Teste 1: Obter endereços de e-mail com prefixo '2'
  val fixedNetworkEmails: List[String] = emailsWithPrefix(phoneBook, '2')
  println("Emails com prefixo '2': " + fixedNetworkEmails)

  // Teste 2: Remover entradas com números de telefone que começam com '2'
  val phoneBookAtualizado: LTelef = removeEntries(phoneBook, entry => entry._2.startsWith("2"))
  println("Lista de telefones atualizada após remover entradas com prefixo '2': " + phoneBookAtualizado)


  def main(args: Array[String]): Unit = {

    val x:Entry = ("sa", "saf", "asfaf")

    println(transf(List(1,2,3,4,54)))
    println(transf(List('1','2','3','4','5')))
    println(product(List(1,2,3)))
    println(sumEl((1,2),(1,2),(2,2),(1,2),(3,2),(1,2)))
    println("Hello Word")
  }

}
