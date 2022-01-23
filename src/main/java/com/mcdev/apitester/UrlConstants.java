package com.mcdev.apitester;

import com.mcdev.twitterapikit.field.SpaceField;

public class UrlConstants {
    final static String searchSpacesUrl = "https://api.twitter.com/2/spaces/search?" +
            "query=tech" +
            "&state=all" +
            "&space.fields=" +SpaceField.ALL.getValue() +
            //"&space.fields=created_at,creator_id,ended_at,host_ids,id,invited_user_ids,is_ticketed,lang,participant_count,scheduled_start,speaker_ids,started_at,state,title,topic_ids,updated_at" +
            "&expansions=invited_user_ids,speaker_ids,creator_id,host_ids" +
            "&user.fields=created_at,description,entities,id,location,name,pinned_tweet_id,profile_image_url,protected,public_metrics,url,username,verified,withheld" +
            "&topic.fields=id,name,description";


    final static String getSpacesById = "https://api.twitter.com/2/spaces/1mrGmazzMQnGy?" +
            "space.fields=created_at,creator_id,ended_at,host_ids,id,invited_user_ids,is_ticketed,lang,participant_count,scheduled_start,speaker_ids,started_at,state,subscriber_count,title,topic_ids,updated_at" +
            "&expansions=invited_user_ids,speaker_ids,creator_id,host_ids,topic_ids" +
            "&user.fields=created_at,description,entities,id,location,name,pinned_tweet_id,profile_image_url,protected,public_metrics,url,username,verified,withheld" +
            "&topic.fields=id,name,description";


    final static String getSpacesByIdList = "https://api.twitter.com/2/spaces?" +
            "ids=1mrGmazzMQnGy,1mrGmazzMQnGy" +
            "&space.fields=created_at,creator_id,ended_at,host_ids,id,invited_user_ids,is_ticketed,lang,participant_count,scheduled_start,speaker_ids,started_at,state,subscriber_count,title,topic_ids,updated_at" +
            "&expansions=invited_user_ids,speaker_ids,creator_id,host_ids,topic_ids" +
            "&user.fields=created_at,description,entities,id,location,name,pinned_tweet_id,profile_image_url,protected,public_metrics,url,username,verified,withheld" +
            "&topic.fields=id,name,description";

    final static String getSpacesByCreatorList = "https://api.twitter.com/2/spaces/by/creator_ids?" +
            "user_ids=104582823,508658764" +
            "&space.fields=created_at,creator_id,ended_at,host_ids,id,invited_user_ids,is_ticketed,lang,participant_count,scheduled_start,speaker_ids,started_at,state,subscriber_count,title,topic_ids,updated_at" +
            "&expansions=invited_user_ids,speaker_ids,creator_id,host_ids,topic_ids" +
            "&user.fields=created_at,description,entities,id,location,name,pinned_tweet_id,profile_image_url,protected,public_metrics,url,username,verified,withheld" +
            "&topic.fields=id,name,description";

    final static String getSpacesBuyers = "https://api.twitter.com/2/spaces/104582823/buyers?" +
            "&tweet.fields=attachments,author_id,context_annotations,conversation_id,created_at,entities,geo,id,in_reply_to_user_id,lang,possibly_sensitive,public_metrics,referenced_tweets,source,text,withheld" +
            "&expansions=pinned_tweet_id" +
            "&user.fields=created_at,description,entities,id,location,name,pinned_tweet_id,profile_image_url,protected,public_metrics,url,username,verified,withheld";
}