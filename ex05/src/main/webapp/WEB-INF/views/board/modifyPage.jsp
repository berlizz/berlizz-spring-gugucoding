<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ include file="../include/header.jsp" %>


	<section class="content">
		<div class="row">
			<!-- left column -->
			<div class="col-md-12">
				<!--  general form elements -->
				
				<div class="box">
					<div class="box-header with-border">
						<h3 class="box-title">MODIFY BOARD</h3>
					</div>

					<form role="form" method="post">
						<input type="hidden" name="page" value="${cri.page}">
						<input type="hidden" name="perPageNum" value="${cri.perPageNum}">
					
						<div class="box-body">
							<div class="form-group">
								<label for="exampleInputEmail1">BNO</label>
								<input type="text" name="bno" class="form-control" value="${boardVO.bno}" readonly="readonly">
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">Title</label>
								<input type="text" name="title" class="form-control" value="${boardVO.title}">
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Content</label>
								<textarea class="form-control" name="content" rows="3">${boardVO.content}</textarea>
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">writer</label>
								<input type="text" name="writer" class="form-control" value="${boardVO.writer}">
							</div>
						</div>
						<!-- /.box-body -->
					</form>
					
					<div class="dox-footer">
						<button type="submit" class="btn btn-primary">SAVE</button>
						<button type="submit" class="btn btn-warning">CANCEL</button>
					</div>
				</div>
			</div>
		</div>
	</section>

	


<%@ include file="../include/footer.jsp" %>


<script>
	$(document).ready(function() {
		
		var formObj = $("form[role='form']");
		
		console.log(formObj);
		
		$(".btn-warning").on("click", function() {
			self.location = "/board/listPage?page=${cri.page}&perPageNum=${cri.perPageNum}";
		});
		
		$(".btn-primary").on("click", function() {
			formObj.submit();
		});
		
	});
</script>













