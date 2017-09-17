<html>
<head>
<style> 
input {
    width: 300px;
}
</style>
<title></title>
</head>
<body>
	<form action="/SendMsg" method="post">
		<input type="hidden" name="type" value="SendMsg">
		Input your Line UserID and what message you want send.
		<br />
		User ID:<br />
		<input type="text" name="uid">
		<br />
	    <br />
	    Message:<br />
	    <textarea rows="4" cols="50" name="msg">
		</textarea>
		<br />
	    <br />
	    <button class="btn-clear">Submit</button>
	</form>
</body>
</html>