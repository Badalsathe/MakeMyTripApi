<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Train Booking Form</title>
</head>
<body>
    <h2>Train Booking Form</h2>
    <form action="/bookTicket" method="post">
        <label for="doj">Date of Journey:</label>
        <input type="date" id="doj" name="doj" required><br><br>

        <label for="fname">First Name:</label>
        <input type="text" id="fname" name="fname" required><br><br>

        <label for="lname">Last Name:</label>
        <input type="text" id="lname" name="lname" required><br><br>

        <label for="from">From:</label>
        <input type="text" id="from" name="from" required><br><br>

        <label for="to">To:</label>
        <input type="text" id="to" name="to" required><br><br>

        <label for="trainNum">Train Number:</label>
        <input type="text" id="trainNum" name="trainNum" required><br><br>

        <input type="submit" value="Book Ticket">
    </form>
    <a href="Search">Search Ticket</a>
</body>
</html>
