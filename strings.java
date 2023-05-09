//criando strings
String strVazia = "";

String str1 = "Ola";
String str2 = new String("Ola");
String str3 = "\u004f\u006C\u0061";

//str1, str2 e str3 são equivalentes

//A classe String representa cadeia de caracteres (UNICODE) 
// Todas as strings literals em JAVA são implementadas como instância dessa classe
//String são imutáveis: seus valores não podem ser mudados depois de criados
// ## A classe String
// * Comparação de Strings
 // * Método equals
  //* Método equalsIgnoreCase
  
  String str1 = "Uncisal";
  String str2 = new String("uncisal");
  
  if (str1.equals(str2))
    System.out.println("Str1 equals Str2");
  if (str1.equalsIgnoreCase(str2))
     System.out.println("Str1 equalsIgnoreCase Str2");
  
  System.out.println("Uncisal".equals(str1) ? "Uncisal equals str1" : "Uncisal not equals str1");

// A classe String inclui alguns métodos
// Ex.: 
// * Examinar caracteres individuais 
// * Comparação de Strings
// * Busca de Strings
// * Extrair substrings
// * Criar copias com caracteres minúsculos/maiúsculos
