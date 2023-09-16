var count=0; 
var button=document.getElementById("articleButton");
var article =document.getElementById("article");

var articleArray = [/*ABC EVERYDAY*/"<a href = 'https://www.abc.net.au/everyday/misogyny-and-abuse-in-online-gaming/12154620' target = _blank> ABC Everyday</a>", /*WASHINGTON POST 1*/"<a href = 'https://www.washingtonpost.com/graphics/2019/sports/toxic-online-culture-women-esports/' target = _blank> Washington Post</a>",/*THE GUARDIAN*/ "<a href = 'https://www.theguardian.com/games/2020/jul/22/is-the-video-games-industry-finally-reckoning-with-sexism' target = _blank> The Guardian</a>",/*ZENERATIONS*/ "<a href = 'https://zenerations.org/2021/07/21/sexism-in-gaming-communities/' target = _blank> ZENERATIONS</a>", "<a href = 'https://www.dailycal.org/2021/03/08/girl-gamers-rise-up-combatting-sexism-in-the-gaming-community/' target = _blank>The Daily Californian</a>"];


button.addEventListener("click", runArticle); 

function runArticle(){
	article.innerHTML = articleArray[count]; 
	count++; 
	if(count == articleArray.length){
		count=0;
	}
}