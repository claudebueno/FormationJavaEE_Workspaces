<!DOCTYPE html>
<html>

<head>
    <title>Page d'accueil | Mon site</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/style/knacss.css" /> 
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/style/main.css" />
    <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Aref+Ruqaa">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
 
    <body>
        <a id="debut"></a>
        <div class="center w90">
            <h1>Bonjour et bienvenue !</h1>

            <nav class="navigation">
                <ul>
                    <li><a href="index.html">Accueil</a></li>
                    <li><a href="index.html">Services</a></li>
                    <li><a href="index.html">Références</a></li>
                    <li><a href="index.html">Contact</a></li>
                </ul>
            </nav>

            <p>
                Illud tamen te esse admonitum volo, primum ut qualis es talem te esse omnes existiment ut, quantum a rerum turpitudine abes, tantum te a verborum libertate seiungas; deinde ut ea in alterum ne dicas, quae cum tibi falso responsa sint, erubescas.
            </p>


            <table>
                <caption>Passagers du vol 377</caption>

                <thead>
                    <!-- En-tête du tableau -->
                    <tr>
                        <th>Nom</th>
                        <th>Prénom</th>
                        <th>Code Postal</th>
                        <th>Ville</th>
                    </tr>
                </thead>

                <tbody>
                    <!-- Corps du tableau -->
                    <tr>
                        <td class="name">Ferreira</td>
                        <td>Carmen</td>
                        <td>37100</td>
                        <td>Tours</td>
                    </tr>
                    <tr>
                        <td class="name">Dupond</td>
                        <td>Jéremie</td>
                        <td>75010</td>
                        <td>Paris</td>
                    </tr>
                    <tr>
                        <td class="name">Durand</td>
                        <td>Jean-Pascal</td>
                        <td>69010</td>
                        <td>Lyon</td>
                    </tr>
                    <tr>
                        <td class="name">Thomaso</td>
                        <td>Pierre-Alain</td>
                        <td>44000</td>
                        <td>Nantes</td>
                    </tr>
                    <tr>
                        <td class="name">Guerin</td>
                        <td>Françoise</td>
                        <td>49010</td>
                        <td>Angers</td>
                    </tr>

                </tbody>
            </table>

            <div class="grid-3">
                <!-- parent div (ou autre) de 3 colonnes -->
                <div class="txtcenter">
                    <img src="image/plane.png" alt="Décollage immédiat" />
                    <div>Fuerit toto in consulatu sine provincia, cui fuerit, antequam designatus est, decreta provincia. Sortietur an non?</div>
                </div>
                <div class="txtcenter">
                    <img src="image/computer.png" class="txtcenter" alt="Décollage immédiat" />
                    <div>Fuerit toto in consulatu sine provincia, cui fuerit, antequam designatus est, decreta provincia. Sortietur an non?</div>
                </div>
                <div class="txtcenter">
                    <img src="image/online-shop.png" alt="Décollage immédiat" />
                    <div>Fuerit toto in consulatu sine provincia, cui fuerit, antequam designatus est, decreta provincia. Sortietur an non?</div>
                </div>
            </div>
            <section>
                <form method="post" class="center w90" action="fichier-destination.html">
                    <fieldset>
                        <legend>Saisissez vos informations</legend>
                        <label class="label" name="email">E-mail :</label>
                        <input class="input-required" type="text" name="email" id="email" required="required" />

                        <label class="label" name="pass">Mot de passe :</label>
                        <input class="input" type="password" name="pass" id="pass" required="required" />

                        <label class="label" name="fonction">Fonction :</label>
                        <select class="combo" name="fonction" id="fonction" required="required">
                      <option class="combo" value="vide">Sélectionner</option>
                      <option class="combo" value="administrateur">Concepteur</option>
                      <option class="combo" value="developpeur">Developpeur</option>
                      <option class="combo" value="designer">Designer</option>
                      <option class="combo" value="testeur">Testeur</option>
                   </select>

                        <input class="btn-submit" type="submit" value="Envoyer" />
                    </fieldset>
                </form>
            </section>



            <blockquote>
                Qum est, et, quod sortitus sis, non habere. Proficiscetur paludatus? Quo? Quo pervenire ante certam diem non licebit. Fuerit toto in consulatu sine provincia, cui fuerit, antequam designatus est, decreta provincia. Sortietur an non? Fuerit toto in consulatu
                sine provincia, cui fuerit, antequam designatus est, decreta provincia. Sortietur an non? Fuerit toto in consulatu sine provincia, cui fuerit, antequam designatus est, decreta provincia. Sortietur an non? Fuerit toto in consulatu sine
                provincia, cui fuerit, antequam designatus est, decreta provincia. Sortietur an non?
            </blockquote>
            <p>
                Fuerit toto in consulatu sine provincia, cui fuerit, antequam designatus est, decreta provincia. Sortietur an non? Fuerit toto in consulatu sine provincia, cui fuerit, antequam designatus est, decreta provincia. Sortietur an non?
            </p>



            <footer>
                <a class="top" href="#debut">retour en haut</a>
                <p>
                	Fuerit toto in consulatu sine provincia, cui fuerit, antequam designatus est, decreta provincia. Sortietur an non? Fuerit toto in consulatu sine provincia, cui fuerit, antequam designatus est, decreta provincia. Sortietur an non?
            	</p>
            	<p>
                	Fuerit toto in consulatu sine provincia, cui fuerit, antequam designatus est, decreta provincia. Sortietur an non? Fuerit toto in consulatu sine provincia, cui fuerit, antequam designatus est, decreta provincia. Sortietur an non?
            	</p>
            </footer>

    </body>

</html>

