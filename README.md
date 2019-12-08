# sponge
## What is it?
Sponge is a website crawler and links downloader command line tool.
## How to build and run it?
You will need a Java JDK 8+ and maven 3+.
~~~
mvn clean package assembly:single

cd target && unzip sponge-0.1-SNAPSHOT.zip && cd sponge-0.1-SNAPSHOT

./sponge [OPTIONS]
~~~
## How to use it?
~~~
Usage: sponge [OPTIONS]

Options:
  -u, --uri VALUE       URI (example: https://www.google.com)
  -o, --output PATH     Output directory where files are downloaded
  -t, --mime-type TEXT  Mime types to download (example: text/plain)
  -d, --depth INT       Search depth
  -h, --help            Show this message and exit
~~~
~~~
./sponge --uri https://www.gutenberg.org/ebooks/search/%3Fsort_order%3Drelease_date \
         --output output \
         --mime-type application/pdf \
         --mime-type text/plain \
         --depth 4

...
﹫ https://www.gutenberg.org/ebooks/send/dropbox/50921.epub.images
﹫ https://www.gutenberg.org/ebooks/send/gdrive/50921.epub.images
﹫ https://www.gutenberg.org/ebooks/send/msdrive/50921.epub.images
﹫ https://www.gutenberg.org/ebooks/send/dropbox/50921.epub.noimages
﹫ https://www.gutenberg.org/ebooks/send/gdrive/50921.epub.noimages
﹫ https://www.gutenberg.org/ebooks/send/msdrive/50921.epub.noimages
﹫ https://www.gutenberg.org/ebooks/send/dropbox/50921.kindle.images
﹫ https://www.gutenberg.org/ebooks/send/gdrive/50921.kindle.images
﹫ https://www.gutenberg.org/ebooks/send/msdrive/50921.kindle.images
﹫ https://www.gutenberg.org/ebooks/send/dropbox/50921.kindle.noimages
﹫ https://www.gutenberg.org/ebooks/send/gdrive/50921.kindle.noimages
﹫ https://www.gutenberg.org/ebooks/send/msdrive/50921.kindle.noimages
⬇ /home/tux/output/50921.txt.utf-8 [304 bytes]
﹫ https://www.gutenberg.org/files/50921/
﹫ https://www.gutenberg.org/wiki/Main_Page
...
~~~
## What about license?
This project is licensed under the WTFPL (Do What The Fuck You Want To Public License, Version 2)

[![WTFPL](http://www.wtfpl.net/wp-content/uploads/2012/12/logo-220x1601.png)](http://www.wtfpl.net/)

Copyright © 2019 spypunk [spypunk@gmail.com](mailto:spypunk@gmail.com)

This work is free. You can redistribute it and/or modify it under the terms of the Do What The Fuck You Want To Public License, Version 2, as published by Sam Hocevar. See the COPYING file for more details.