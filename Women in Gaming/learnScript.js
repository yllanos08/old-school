
var count=0; 
var button=document.getElementById("streamerButton");
var streamer=document.getElementById("streamers");

var streamArray = ["<a href = 'https://www.youtube.com/channel/UCWxlUwW9BgGISaakjGM37aw' target = _blank> Valkyrae</a>", "<a href = 'https://www.twitch.tv/pokimane' target = _blank> pokimane</a>", "<a href = 'https://www.twitch.tv/lilypichu ' target = _blank>lilypichu</a>", "<a href = 'https://www.twitch.tv/quarterjade' target = _blank>QuarterJade</a>", "<a href = 'https://www.twitch.tv/itshafu' target = _blank>itsHafu</a>", "<a href = 'https://www.twitch.tv/kyedae' target= _blank>Kyedae</a>", "<a href = 'https://www.twitch.tv/xchocobars' target = _blank>xChocoBars</a>"];

 button.addEventListener("click", runStream); 


function runStream(){
	streamers.innerHTML = streamArray[count]; 
	count++; 
	if(count == streamArray.length){
		count=0;
	}
}