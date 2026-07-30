package p149l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class ab70 {

    /* JADX INFO: renamed from: a */
    public Map<String, C15567a> f68628a;

    /* JADX INFO: renamed from: l.ab70$a */
    public static class C15567a {

        /* JADX INFO: renamed from: a */
        public boolean f68629a;

        /* JADX INFO: renamed from: b */
        public boolean f68630b;

        /* JADX INFO: renamed from: c */
        public boolean f68631c;

        public C15567a(boolean z, boolean z2, boolean z3) {
            this.f68629a = z;
            this.f68630b = z2;
            this.f68631c = z3;
        }
    }

    /* JADX INFO: renamed from: l.ab70$b */
    public static class C15568b {

        /* JADX INFO: renamed from: a */
        public static final ab70 f68632a = new ab70();
    }

    public ab70() {
        HashMap map = new HashMap();
        this.f68628a = map;
        map.put("from_nearby_focus", new C15567a(false, false, true));
        this.f68628a.put("from_nearby_focus_single", new C15567a(false, true, false));
        this.f68628a.put("from_nearby_falls_feed", new C15567a(true, false, true));
        this.f68628a.put("from_nearby_falls_feed_single", new C15567a(false, true, false));
        this.f68628a.put("from_profile", new C15567a(false, true, false));
        this.f68628a.put("from_card_profile", new C15567a(false, true, false));
        this.f68628a.put("from_activities_profile", new C15567a(false, true, false));
        this.f68628a.put("from_activities_moment", new C15567a(false, false, false));
        this.f68628a.put("mute_list", new C15567a(false, true, false));
        this.f68628a.put("push", new C15567a(false, true, false));
        this.f68628a.put("photo_album_activities", new C15567a(false, true, false));
        this.f68628a.put("all_comment_detail_item", new C15567a(false, true, false));
        this.f68628a.put("fan_list", new C15567a(false, true, false));
        this.f68628a.put("from_following_list", new C15567a(false, true, false));
        this.f68628a.put("my_tab", new C15567a(false, true, false));
        this.f68628a.put("comment_list", new C15567a(false, true, false));
        this.f68628a.put("push_new_moment", new C15567a(true, false, true));
        this.f68628a.put("original_moments", new C15567a(false, false, true));
        this.f68628a.put("original_personal_moments", new C15567a(false, false, false));
        this.f68628a.put("aggregate_page", new C15567a(false, true, false));
        this.f68628a.put("recommend_only_video", new C15567a(true, false, true));
        this.f68628a.put("recommend_multiple", new C15567a(true, false, true));
        this.f68628a.put("recommend_falls_to_detail", new C15567a(false, true, false));
        this.f68628a.put("from_profile_opt", new C15567a(false, false, true));
        this.f68628a.put("from_profile_opt_single", new C15567a(false, true, false));
        this.f68628a.put("from_topic_nearby_header", new C15567a(true, true, false));
        this.f68628a.put("from_topic_official", new C15567a(true, true, false));
        this.f68628a.put("from_no_topic_aggregation_list", new C15567a(true, true, false));
        this.f68628a.put("from_topic_aggregation", new C15567a(false, true, false));
        this.f68628a.put("viewers_item", new C15567a(false, true, false));
        this.f68628a.put("from_h5_topic_aggregation", new C15567a(true, true, false));
        this.f68628a.put("fromh5_topic_vote_aggregation", new C15567a(true, true, false));
        this.f68628a.put("from_qa_topic_aggregation", new C15567a(false, false, false));
        this.f68628a.put("from_all_topic_newest", new C15567a(true, false, true));
        this.f68628a.put("FROM_ALL_TOPIC_RECOMMENDED", new C15567a(true, false, true));
        this.f68628a.put("from_kan_kan", new C15567a(false, true, false));
        this.f68628a.put("from_look_more", new C15567a(false, true, false));
        this.f68628a.put("from_kan_chat", new C15567a(false, true, false));
        this.f68628a.put("qa_recommend", new C15567a(true, false, false));
        this.f68628a.put("topic_recommend", new C15567a(true, true, false));
        this.f68628a.put("from_online_match", new C15567a(false, true, false));
        this.f68628a.put("qa_latest", new C15567a(true, false, false));
        this.f68628a.put("topic_latest", new C15567a(true, true, false));
        this.f68628a.put("from_moment_detail_album", new C15567a(true, false, false));
        this.f68628a.put("from_group_detail_recommend", new C15567a(true, false, false));
        this.f68628a.put("from_group_detail_new", new C15567a(true, false, false));
        this.f68628a.put("from_discover_dating", new C15567a(true, false, true));
        this.f68628a.put("from_discover_discussion", new C15567a(true, false, true));
        this.f68628a.put("from_activity_tab_one", new C15567a(true, false, true));
        this.f68628a.put("from_activity_tab_two", new C15567a(true, false, true));
        this.f68628a.put("from_poi_aggregation", new C15567a(true, false, true));
        this.f68628a.put("p_friend_moment", new C15567a(true, true, true));
    }

    /* JADX INFO: renamed from: a */
    public static ab70 m95586a() {
        return C15568b.f68632a;
    }

    /* JADX INFO: renamed from: b */
    public Map<String, C15567a> m95587b() {
        return this.f68628a;
    }
}
