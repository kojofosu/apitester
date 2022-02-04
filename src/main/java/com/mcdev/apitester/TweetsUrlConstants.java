package com.mcdev.apitester;

public class TweetsUrlConstants {
    final static String findTweetByIdWithPremiumAccess = "https://api.twitter.com/2/tweets/1489321257875214336?" +
            "tweet.fields=attachments,author_id,context_annotations,conversation_id,created_at,entities,geo,id,in_reply_to_user_id,lang,non_public_metrics,organic_metrics,public_metrics,withheld,possibly_sensitive,referenced_tweets,promoted_metrics,source,text" +
            "&expansions=attachments.poll_ids,attachments.media_keys,author_id,entities.mentions.username,geo.place_id,in_reply_to_user_id,referenced_tweets.id,referenced_tweets.id.author_id" +
            "&media.fields=duration_ms,height,media_key,preview_image_url,non_public_metrics,public_metrics,width,url,type,organic_metrics,promoted_metrics,alt_text" +
            "&place.fields=contained_within,geo,id,name,place_type,country,country_code,full_name" +
            "&poll.fields=options,id,end_datetime,duration_minutes,voting_status" +
            "&user.fields=name,pinned_tweet_id,profile_image_url,protected,location,id,entities,description,created_at,public_metrics,url,username,verified,withheld";


    final static String findTweetById = "https://api.twitter.com/2/tweets/1489321257875214336?" +
            "tweet.fields=attachments,author_id,context_annotations,conversation_id,created_at,entities,geo,id,in_reply_to_user_id,lang,public_metrics,withheld,possibly_sensitive,referenced_tweets,source,text" +
            "&expansions=attachments.poll_ids,attachments.media_keys,author_id,entities.mentions.username,geo.place_id,in_reply_to_user_id,referenced_tweets.id,referenced_tweets.id.author_id" +
            "&media.fields=duration_ms,height,media_key,preview_image_url,public_metrics,width,url,type,alt_text" +
            "&place.fields=contained_within,geo,id,name,place_type,country,country_code,full_name" +
            "&poll.fields=options,id,end_datetime,duration_minutes,voting_status" +
            "&user.fields=name,pinned_tweet_id,profile_image_url,protected,location,id,entities,description,created_at,public_metrics,url,username,verified,withheld";

    final static String findTweetsListByIdWithPremiumAccess = "https://api.twitter.com/2/tweets?" +
            "ids=1489321257875214336,1489321257875214336,1484890550687961094" +
            "&tweet.fields=attachments,author_id,context_annotations,conversation_id,created_at,entities,geo,id,in_reply_to_user_id,lang,non_public_metrics,organic_metrics,public_metrics,withheld,possibly_sensitive,referenced_tweets,promoted_metrics,source,text" +
            "&expansions=attachments.poll_ids,attachments.media_keys,author_id,entities.mentions.username,geo.place_id,in_reply_to_user_id,referenced_tweets.id,referenced_tweets.id.author_id" +
            "&media.fields=duration_ms,height,media_key,preview_image_url,non_public_metrics,public_metrics,width,url,type,organic_metrics,promoted_metrics,alt_text" +
            "&place.fields=contained_within,geo,id,name,place_type,country,country_code,full_name" +
            "&poll.fields=options,id,end_datetime,duration_minutes,voting_status" +
            "&user.fields=name,pinned_tweet_id,profile_image_url,protected,location,id,entities,description,created_at,public_metrics,url,username,verified,withheld";



    final static String findTweetListById = "https://api.twitter.com/2/tweets?" +
            "ids=1489321257875214336,1489321257875214336,1484890550687961094" +
            "&tweet.fields=attachments,author_id,context_annotations,conversation_id,created_at,entities,geo,id,in_reply_to_user_id,lang,public_metrics,withheld,possibly_sensitive,referenced_tweets,source,text" +
            "&expansions=attachments.poll_ids,attachments.media_keys,author_id,entities.mentions.username,geo.place_id,in_reply_to_user_id,referenced_tweets.id,referenced_tweets.id.author_id" +
            "&media.fields=duration_ms,height,media_key,preview_image_url,public_metrics,width,url,type,alt_text" +
            "&place.fields=contained_within,geo,id,name,place_type,country,country_code,full_name" +
            "&poll.fields=options,id,end_datetime,duration_minutes,voting_status" +
            "&user.fields=name,pinned_tweet_id,profile_image_url,protected,location,id,entities,description,created_at,public_metrics,url,username,verified,withheld";



    final static String searchRecentTweets = "https://api.twitter.com/2/tweets/search/recent?" +
            "query=king" +
            "&tweet.fields=attachments,author_id,context_annotations,conversation_id,created_at,entities,geo,id,in_reply_to_user_id,lang,public_metrics,withheld,possibly_sensitive,referenced_tweets,source,text" +
            "&expansions=attachments.poll_ids,attachments.media_keys,author_id,entities.mentions.username,geo.place_id,in_reply_to_user_id,referenced_tweets.id,referenced_tweets.id.author_id" +
            "&media.fields=duration_ms,height,media_key,preview_image_url,public_metrics,width,url,type,alt_text" +
            "&place.fields=contained_within,geo,id,name,place_type,country,country_code,full_name" +
            "&poll.fields=options,id,end_datetime,duration_minutes,voting_status" +
            "&user.fields=name,pinned_tweet_id,profile_image_url,protected,location,id,entities,description,created_at,public_metrics,url,username,verified,withheld";
}
