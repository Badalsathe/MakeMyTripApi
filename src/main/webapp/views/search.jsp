<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ticket Information</title>
</head>
<body>
    <h2>Get Your Ticket Info</h2>

    <form action="searchTicket" method="GET">
        Ticket ID: <input type="text" name="ticketId">
        <input type="submit" value="Search">
    </form>

    <hr/>

    <table border="1">
        <tr>
            <th>From</th>
            <td>${ticket.from}</td>
        </tr>
        <tr>
            <th>To</th>
            <td>${ticket.to}</td>
        </tr>
        <tr>
            <th>Status</th>
            <td>${ticket.ticketStatus}</td>
        </tr>
        <tr>
            <th>Cost</th>
            <td>${ticket.tktCost}</td>
        </tr>
        <tr>
            <th>Train Number</th>
            <td>${ticket.trainNum}</td>
        </tr>
    </table>

    <a href="/">Go Back</a>
</body>
</html>