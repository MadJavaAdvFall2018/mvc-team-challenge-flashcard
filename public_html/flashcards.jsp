
<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <meta name="generator" content="HTML Tidy, see www.w3.org" />

    <title>Flashcards</title>
  </head>

  <body>

    <!-- HTML Comment -->
    <%-- This is a JSP comment --%>

    <h3>This is a simple first look at a JSP page.</h3>

    <!--<p> ${questionAnswer.randomQuestion}</p>-->
    <!--<p style="color:blue;"> ${questionAnswer.data}</p>-->
    <p style="color:red; padding: 5px; border: 5px;"> question: ${questionAnswer.question}</p>
    <p style="color:red; padding: 5px; border: 5px;"> answer: ${questionAnswer.answer}</p>

    <p><a href="/java112">Home</a></p>
  </body>
</html>
