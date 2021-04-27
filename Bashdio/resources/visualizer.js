var audioCtx=new AudioContext();
var analyser=audioCtx.createAnalyser();
analyser.fftSize=2048;
var source=audioCtx.createMediaElementSource(AUDIO);
source.connect(analyser);
source.connect(audioCtx.destination);
function getData(){
	return data=new Uint8Array(analyser.frequencyBinCount);
}
