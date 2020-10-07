<!DOCTYPE html>
<html>
<head>

<%--CSS only --%>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

<%-- JS, Popper.js, and jQuery --%>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>


<script>
	$(document).ready(function() {
		$("#submitUpload").click(function(event) {
			
			event.preventDefault();
			
			
			var form = $('#uploadForm')[0];
			var data = new FormData(form);
			
			$("#submitUpload").prop("disabled", true);
			
			url = "/savingFile",
			
			$("#uploadModal").modal('hide');
			
			$.post({
				url : url,
				enctype: 'multipart/form-data',
				data : data,
		        processData: false,  
		        contentType: false,
		        cache: false,
				
				success : function(response) {

					$('#uploadModal form :input').val("");
					alert("success");
				}
			})

			return false;
		});
	});
</script>
<title>Insert title here</title>
</head>
<body>
<div class="modal fade" id="uploadModal">
		<div class="modal-dialog modal-md">
			<div class="modal-content">
				<form id="uploadForm">
					<div class="modal-header">
						<h3>Please select the book that you wish to upload.</h3>
					</div>
					<div class="modal-body">
						<fieldset>
							<div class="modal-body">
								<input name="file" id="filename" type="file" />
							</div>
						</fieldset>
					</div>
					<div class="modal-footer">
						<button type=submit class="btn btn-success" id="submitUpload">Upload</button>
						<button class="btn btn-danger" id="closeUpload"data-dismiss="modal">Close</button>
					</div>
				</form>
			</div>
		</div>
	</div>

</body>
</html>