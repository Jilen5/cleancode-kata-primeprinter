function optionChoice(buildUrl) {
    if (options.path) {
            builtUrl += '/' + options.path;
          }

          if (options.queryParams) {
            for (key in options.queryParams) {
              if (options.queryParams.hasOwnProperty(key)) {
                queryString.push(key + '=' + options.queryParams[key]);
              }
            }
            builtUrl += '?' + queryString.join('&');
          }

          if (options.hash) {
            builtUrl += '#' + options.hash;
          }
}


function F_buildUrl(url, options) {
    var queryString = [];
    var key;
    var builtUrl;

    if (url === null || typeof(url) === 'object') {
      builtUrl = '';
      options = url;
    } else {
      builtUrl = url;
    }

    if (options) {
        optionChoice();
    }

    return builtUrl;
};