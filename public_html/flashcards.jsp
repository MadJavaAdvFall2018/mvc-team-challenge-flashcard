
<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <meta name="generator" content="HTML Tidy, see www.w3.org" />
    <link rel="stylesheet" type="text/css" href="flashcardDesign.css">

    <title>Flashcards</title>
  </head>

  <body>

    <!-- HTML Comment -->
    <%-- This is a JSP comment --%>

    <h3>Flash cards Teamwork.</h3>

    <!--<p> ${questionAnswer.randomQuestion}</p>-->
    <!--<p style="color:blue;"> ${questionAnswer.data}</p>-->
    <p id="question"> question: ${questionAnswer.question}</p>
    <button onclick="myFunction()">Click here to view answer</button>
    <p id="answer"></p>

    <!--<p><a href="/java112">Home</a></p>-->

    <script>
        function myFunction() {
            document.getElementById("answer").innerHTML = "answer: ${questionAnswer.answer}";

        }
    </script>

  </body>
</html>
