<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Simplilearn Registration Form</title>
</head>
<body>

		<h1>Passionate about teaching?You've come to the right place.</h1>
		<h2>Teach. Create. Earn.</h2>
		<h3>INTERESTED IN WORKING WITH US?</h3>
		
		<form action="<%= request.getContextPath()%>/become-our-trainer" method="post">
			First Name : <input type="text" name="firstname"/>
			<br><br>
			Last Name : <input type="text" name="lastname"/>
			<br><br>
			Email ID : <input type="email" name="emailid"/>
			<br><br>
			Password : <input type="password" name="password"/>
			<br><br>
			
			Gender :
				<input type="radio" name="gender" value="Male"/> Male
				<input type="radio" name="gender" value="Female"/> Female
			<br><br>
			
			<tr>
				<td>
					<td> Timing </td>
					<td> 
						<select name="timing">
							<option value="01:00AM-02:00AM">01:00 AM - 02:00 AM </option>
							<option value="02:00AM-03:00AM">02:00 AM - 03:00 AM </option>
							<option value="03:00AM-04:00AM">03:00 AM - 04:00 AM </option>
							<option value="04:00AM-05:00AM">04:00 AM - 05:00 AM </option>
						</select>
					</td>
				</td>
			</tr>
			<br><br>
			
			<td> Course </td>
			
			<td>
				<input type="checkbox" name="course" value="JAVA"/> JAVA <br>
				<input type="checkbox" name="course" value="JDBC"/> JDBC <br>
				<input type="checkbox" name="course" value="HIBERNATE"/> HIBERNATE <br>
				<input type="checkbox" name="course" value="SERVLET"/> SERVLET <br>
				<input type="checkbox" name="course" value="JSP"/> JSP <br>
				<input type="checkbox" name="course" value="SPRING"/> SPRING <br>
			</td>
			<br><br>
			
			<tr>
				<td> 
					<td> Remarks</td>
				</td>
				<td> 
					<textarea rows="6" cols="20" name="remarks"></textarea>
				</td>
			</tr>
			
			<br><br>
			
			
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="Register"/>
				</td>
			</tr>
		
		</form>
</body>
</html>