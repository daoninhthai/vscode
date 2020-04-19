function getExtension(filename) {
    var path = require('path');
    var text = path.extname(filename);
    return text;
  }
  console.log(getExtension('index.md'));