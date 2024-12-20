<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign In</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: url('background.jpg') no-repeat center center fixed;
            background-size: cover;
            color: white;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .signin-form {
            background-color: rgba(255, 255, 255, 0.9); /* Semi-transparent white background */
            color: #333;
            border-radius: 10px;
            padding: 20px 30px;
            width: 350px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            text-align: center;
        }

        .signin-form h2 {
            margin-bottom: 20px;
        }

        .signin-form label {
            display: block;
            text-align: left;
            margin-bottom: 5px;
            font-size: 14px;
        }

        .signin-form input {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 14px;
        }

        .signin-form button {
            width: 100%;
            padding: 10px;
            background-color: #9575cd;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
        }

        .signin-form button:hover {
            background-color: #7e57c2;
        }

        .signin-form a {
            text-decoration: none;
            color: #9575cd;
            font-size: 14px;
        }

        .signin-form a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="signin-form">
        <h2>Sign In</h2>
        <form action="#" method="post">
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" placeholder="Enter your email" required>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" placeholder="Enter your password" required>

            <button type="submit">Sign In</button>
            <p><a href="#">Forgot Password?</a></p>
        </form>
    </div>
</body>
</html>
