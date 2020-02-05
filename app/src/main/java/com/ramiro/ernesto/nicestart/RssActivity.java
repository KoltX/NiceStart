//package com.ramiro.ernesto.nicestart;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import com.prof.rssparser.Article;
//import com.prof.rssparser.Channel;
//import com.prof.rssparser.OnTaskCompleted;
//import com.prof.rssparser.Parser;
//
//public class RssActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_rss);
//
//        String urlString = "http://www.androidcentral.com/feed";
//        Parser parser = new Parser();
//        parser.onFinish(new OnTaskCompleted() {
//
//            //what to do when the parsing is done
//            @Override
//            public void onTaskCompleted(Channel channel) {
//                // Use the channel info
//            }
//
//            //what to do in case of error
//            @Override
//            public void onError(Exception e) {
//                // Handle the exception
//            }
//        });
//
//        parser.execute(urlString);
//
////        RSSReader reader = new RSSReader();
////        String uri = "http://feeds.bbci.co.uk/news/world/rss.xml";
////        RSSFeed feed = reader.load(uri);
//
//    }
//}
