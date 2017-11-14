<!DOCTYPE html>
<html >
<head>
    <meta charset="UTF-8">
    <title>Inicio sesion</title>
    <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">


    <link rel="stylesheet" href="/resources/css/style_login.css">


</head>

<body>
<div class="form">

    <ul class="tab-group">
        <li class="tab active"><a href="#login">Iniciar sesion</a></li>
        <li class="tab"><a href="#signup">Registro</a></li>
    </ul>

    <div class="tab-content">
        <div id="login">
            <h1>Bienvenido</h1>

            <form action="/usuario/login"  method="post">

                <div class="field-wrap">
                    <label>
                        Correo electronico<span class="req">*</span>
                    </label>
                    <input type="email"required autocomplete="off" name="email">
                </div>

                <div class="field-wrap">
                    <label>
                        Contraseña<span class="req">*</span>
                    </label>
                    <input type="password"required autocomplete="off" name="password">
                </div>

                <%--<p class="forgot"><a href="#">Forgot Password?</a></p>--%>

                <button type="submit" class="button button-block"/>Ingresar</button>

            </form>

        </div>
        <div id="signup">
            <h1>Sign Up for Free</h1>

            <form action="/" method="post">

                <div class="top-row">
                    <div class="field-wrap">
                        <label>
                            First Name<span class="req">*</span>
                        </label>
                        <input type="text" required autocomplete="off" />
                    </div>

                    <div class="field-wrap">
                        <label>
                            Last Name<span class="req">*</span>
                        </label>
                        <input type="text"required autocomplete="off"/>
                    </div>
                </div>

                <div class="field-wrap">
                    <label>
                        Email Address<span class="req">*</span>
                    </label>
                    <input type="email"required autocomplete="off"/>
                </div>

                <div class="field-wrap">
                    <label>
                        Set A Password<span class="req">*</span>
                    </label>
                    <input type="password"required autocomplete="off"/>
                </div>

                <button type="submit" class="button button-block"/>Get Started</button>

            </form>

        </div>

    </div><!-- tab-content -->

</div> <!-- /form -->
<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

<script  src="/resources/js/index.js"></script>

</body>
</html>
