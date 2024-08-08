<!DOCTYPE html>
<html>
<head>
    <title>My Web App</title>
</head>
<body>
    <h1>Formulario GET</h1>
    <form action="myServlet" method="get">
        <input type="submit" value="Enviar GET">
    </form>

    <h1>Formulario POST</h1>
    <form action="myServlet" method="post">
        <label for="param">Parametro:</label>
        <input type="text" id="param" name="param">
        <input type="submit" value="Enviar POST">
    </form>
</body>
</html>
