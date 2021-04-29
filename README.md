# Bashdio
Audio player on local terminal-styled website.
Some preview screens can be found in preview folder.
Help command might be usefull.

To start playing audio the fastest way to do it is:
Type "load" <- file load windows will be opened then and select as many songs as u want.
Then just type "start".

Audio visualizer is based on microphone, the reason for it is that "push" command, which is actally more user friendly, after creating song list with scripts, adds only filepaths.
With fileppaths only you are not able to create audio visualizer due to some CORS (if i remember correctly) restrictions. 
If you are using only load command u are free to connect audio ctx to audio element.
Also to visualize not microphone input but system audio check out this: 
https://superuser.com/questions/1133750/set-output-audio-of-windows-as-input-audio-of-microphone/1133762
(probably thats also possible in linux).


To use push command, create music folder, inside it push clips into subfolders, after that run makeList script.
Use "RAW" view to see folder structure.
Example:
Bashdio:
  music:
    folder1:
      clip1.webm
      clip2.webm
    folder2:
      clip3.webm
      clip4.webm
      
