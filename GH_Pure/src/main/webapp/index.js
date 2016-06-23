$(function(){ 

}); 
function s(){
	$.ajax({
		  type: 'POST',
		  url: 'test/a',
		  data: JSON3.stringify({
				org_id:1
				}),
		  success: function(result){
			  debugger;
		  },
		  dataType: "json",
		  contentType:"application/json"
	});
}