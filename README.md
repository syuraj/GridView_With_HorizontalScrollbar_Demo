GridView_With_HorizontalScrollbar_Demo
======================================

Android GridView with continuous Horizontal Scrollbar demo

Uses modal dialog box instead of full screen activity

![alt tag](https://31.media.tumblr.com/d8b53e009c4ad033c3268d3541a68b58/tumblr_inline_n5dtu6e28d1qjld0j.png)

http://esuraj.tumblr.com/post/85363918038/android-gridview-with-continuous-horizontal-scrollbar


By default, Gridview does vertical scrollbar when the GridView items are more than it can show in its initial view.

So, the trick here is to include GridView inside LinerLayout element which is included inside HorizontalScrollView element.

And have GridView width large enough to include all elements horizontally so that vertical scrollbar does not appear.

