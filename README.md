# AndroidVSCode
[Visual Studio Code](https://code.visualstudio.com/) on Android with [code-server](https://github.com/cdr/code-server) on [Termux](https://termux.com/)

⚠️ *You also need at least Node 12 installed.*
### Installation :
  * Install code-server globally : `npm i code-server -g`
  * Install the app in release (or compile it yourself)
  
  
⚠️ *You should do this steps whenever you want to use VSCode.*
### Usage :
  * Run code-server, if you don't want auth : `code-server --auth none`, else `code-server --auth password` and get the password in `~/.config/code-server/config.yaml`
  * Open the app (and enter the password if there is one)
  * Use VSCode 🎉🎉

⚠️ *Don't forget to exit the Termux process*
**To close :**
  * Close the app
  * Exit Termux
