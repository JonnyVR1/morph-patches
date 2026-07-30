package p153l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class gj70 {

    /* JADX INFO: renamed from: a */
    public Map<String, C17230a> f104608a;

    /* JADX INFO: renamed from: l.gj70$a */
    public static class C17230a {

        /* JADX INFO: renamed from: a */
        public boolean f104609a;

        /* JADX INFO: renamed from: b */
        public boolean f104610b;

        /* JADX INFO: renamed from: c */
        public boolean f104611c;

        public C17230a(boolean z, boolean z2, boolean z3) {
            this.f104609a = z;
            this.f104610b = z2;
            this.f104611c = z3;
        }
    }

    /* JADX INFO: renamed from: l.gj70$b */
    public static class C17231b {

        /* JADX INFO: renamed from: a */
        public static final gj70 f104612a = new gj70();
    }

    public gj70() {
        HashMap map = new HashMap();
        this.f104608a = map;
        map.put("from_nearby_focus", new C17230a(false, false, true));
        this.f104608a.put("from_nearby_focus_single", new C17230a(false, true, false));
        this.f104608a.put("from_nearby_falls_feed", new C17230a(true, false, true));
        this.f104608a.put("from_nearby_falls_feed_single", new C17230a(false, true, false));
        this.f104608a.put("from_profile", new C17230a(false, true, false));
        this.f104608a.put("from_card_profile", new C17230a(false, true, false));
        this.f104608a.put("from_activities_profile", new C17230a(false, true, false));
        this.f104608a.put("from_activities_moment", new C17230a(false, false, false));
        this.f104608a.put("mute_list", new C17230a(false, true, false));
        this.f104608a.put("push", new C17230a(false, true, false));
        this.f104608a.put("photo_album_activities", new C17230a(false, true, false));
        this.f104608a.put("all_comment_detail_item", new C17230a(false, true, false));
        this.f104608a.put("fan_list", new C17230a(false, true, false));
        this.f104608a.put("from_following_list", new C17230a(false, true, false));
        this.f104608a.put("my_tab", new C17230a(false, true, false));
        this.f104608a.put("comment_list", new C17230a(false, true, false));
        this.f104608a.put("push_new_moment", new C17230a(true, false, true));
        this.f104608a.put("original_moments", new C17230a(false, false, true));
        this.f104608a.put("original_personal_moments", new C17230a(false, false, false));
        this.f104608a.put("aggregate_page", new C17230a(false, true, false));
        this.f104608a.put("recommend_only_video", new C17230a(true, false, true));
        this.f104608a.put("recommend_multiple", new C17230a(true, false, true));
        this.f104608a.put("recommend_falls_to_detail", new C17230a(false, true, false));
        this.f104608a.put("from_profile_opt", new C17230a(false, false, true));
        this.f104608a.put("from_profile_opt_single", new C17230a(false, true, false));
        this.f104608a.put("from_topic_nearby_header", new C17230a(true, true, false));
        this.f104608a.put("from_topic_official", new C17230a(true, true, false));
        this.f104608a.put("from_no_topic_aggregation_list", new C17230a(true, true, false));
        this.f104608a.put("from_topic_aggregation", new C17230a(false, true, false));
        this.f104608a.put("viewers_item", new C17230a(false, true, false));
        this.f104608a.put("from_h5_topic_aggregation", new C17230a(true, true, false));
        this.f104608a.put("fromh5_topic_vote_aggregation", new C17230a(true, true, false));
        this.f104608a.put("from_qa_topic_aggregation", new C17230a(false, false, false));
        this.f104608a.put("from_all_topic_newest", new C17230a(true, false, true));
        this.f104608a.put("FROM_ALL_TOPIC_RECOMMENDED", new C17230a(true, false, true));
        this.f104608a.put("from_kan_kan", new C17230a(false, true, false));
        this.f104608a.put("from_look_more", new C17230a(false, true, false));
        this.f104608a.put("from_kan_chat", new C17230a(false, true, false));
        this.f104608a.put("qa_recommend", new C17230a(true, false, false));
        this.f104608a.put("topic_recommend", new C17230a(true, true, false));
        this.f104608a.put("from_online_match", new C17230a(false, true, false));
        this.f104608a.put("qa_latest", new C17230a(true, false, false));
        this.f104608a.put("topic_latest", new C17230a(true, true, false));
        this.f104608a.put("from_moment_detail_album", new C17230a(true, false, false));
        this.f104608a.put("from_group_detail_recommend", new C17230a(true, false, false));
        this.f104608a.put("from_group_detail_new", new C17230a(true, false, false));
        this.f104608a.put("from_discover_dating", new C17230a(true, false, true));
        this.f104608a.put("from_discover_discussion", new C17230a(true, false, true));
        this.f104608a.put("from_activity_tab_one", new C17230a(true, false, true));
        this.f104608a.put("from_activity_tab_two", new C17230a(true, false, true));
        this.f104608a.put("from_poi_aggregation", new C17230a(true, false, true));
        this.f104608a.put("p_friend_moment", new C17230a(true, true, true));
    }

    /* JADX INFO: renamed from: a */
    public static gj70 m130463a() {
        return C17231b.f104612a;
    }

    /* JADX INFO: renamed from: b */
    public Map<String, C17230a> m130464b() {
        return this.f104608a;
    }
}
