$(document)
		.ready(
				function() {
					$('#viewLink').click(function() {
						$("#viewForm").hide();
						$("#openForm").hide();
						$("#openResults").hide();
						$("#viewResults").hide();
					});
					$('#openLink').click(function() {
						$("#openForm").show();
						$("#viewForm").hide();
						$("#openResults").hide();
						$("#viewResults").hide();
					});
					$('#openButton')
							.click(
									function() {
										var name = $("#name").val();
										var email = $("#email")
												.val();
										var data = {
											name : name,
											email : email
										};
										$
												.ajax({
													url : 'http://localhost:8080/blogging/online/blog/Createlogin',
													type : 'post',
													contentType : 'application/json',
													success : function(response) {
														$("#openResults")
																.html(
																		"email: "
																				+ response);
														$("#openForm").hide();
														$("#openResults")
																.show();
													},
													data : JSON.stringify(data)
												});
									});
					$('#viewButton')
							.click(
									function() {
										$
												.ajax({
													url : 'http://localhost:8080/blogging/online/blog/Createlogin/'
															+ $('#email')
																	.val(),
													type : 'get',
													accept : 'application/json',
													success : function(response) {
														$("#viewForm").hide();
														$("#name")
																.html(
																		response.data.name);
														$("#email")
																.html(
																		response.number);
													
													}
												});
									});
				});