package p007l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ab70 {

    /* JADX INFO: renamed from: a */
    public Map<String, C2321a> f5691a;

    /* JADX INFO: renamed from: l.ab70$a */
    public static class C2321a {

        /* JADX INFO: renamed from: a */
        public boolean f5692a;

        /* JADX INFO: renamed from: b */
        public boolean f5693b;

        /* JADX INFO: renamed from: c */
        public boolean f5694c;

        public C2321a(boolean z, boolean z2, boolean z3) {
            this.f5692a = z;
            this.f5693b = z2;
            this.f5694c = z3;
        }
    }

    /* JADX INFO: renamed from: l.ab70$b */
    public static class C2322b {

        /* JADX INFO: renamed from: a */
        public static final ab70 f5695a = new ab70();
    }

    public ab70() {
        HashMap map = new HashMap();
        this.f5691a = map;
        map.put("from_nearby_focus", new C2321a(false, false, true));
        this.f5691a.put("from_nearby_focus_single", new C2321a(false, true, false));
        this.f5691a.put("from_nearby_falls_feed", new C2321a(true, false, true));
        this.f5691a.put("from_nearby_falls_feed_single", new C2321a(false, true, false));
        this.f5691a.put("from_profile", new C2321a(false, true, false));
        this.f5691a.put("from_card_profile", new C2321a(false, true, false));
        this.f5691a.put("from_activities_profile", new C2321a(false, true, false));
        this.f5691a.put("from_activities_moment", new C2321a(false, false, false));
        this.f5691a.put("mute_list", new C2321a(false, true, false));
        this.f5691a.put("push", new C2321a(false, true, false));
        this.f5691a.put("photo_album_activities", new C2321a(false, true, false));
        this.f5691a.put("all_comment_detail_item", new C2321a(false, true, false));
        this.f5691a.put("fan_list", new C2321a(false, true, false));
        this.f5691a.put("from_following_list", new C2321a(false, true, false));
        this.f5691a.put("my_tab", new C2321a(false, true, false));
        this.f5691a.put("comment_list", new C2321a(false, true, false));
        this.f5691a.put("push_new_moment", new C2321a(true, false, true));
        this.f5691a.put("original_moments", new C2321a(false, false, true));
        this.f5691a.put("original_personal_moments", new C2321a(false, false, false));
        this.f5691a.put("aggregate_page", new C2321a(false, true, false));
        this.f5691a.put("recommend_only_video", new C2321a(true, false, true));
        this.f5691a.put("recommend_multiple", new C2321a(true, false, true));
        this.f5691a.put("recommend_falls_to_detail", new C2321a(false, true, false));
        this.f5691a.put("from_profile_opt", new C2321a(false, false, true));
        this.f5691a.put("from_profile_opt_single", new C2321a(false, true, false));
        this.f5691a.put("from_topic_nearby_header", new C2321a(true, true, false));
        this.f5691a.put("from_topic_official", new C2321a(true, true, false));
        this.f5691a.put("from_no_topic_aggregation_list", new C2321a(true, true, false));
        this.f5691a.put("from_topic_aggregation", new C2321a(false, true, false));
        this.f5691a.put("viewers_item", new C2321a(false, true, false));
        this.f5691a.put("from_h5_topic_aggregation", new C2321a(true, true, false));
        this.f5691a.put("fromh5_topic_vote_aggregation", new C2321a(true, true, false));
        this.f5691a.put("from_qa_topic_aggregation", new C2321a(false, false, false));
        this.f5691a.put("from_all_topic_newest", new C2321a(true, false, true));
        this.f5691a.put("FROM_ALL_TOPIC_RECOMMENDED", new C2321a(true, false, true));
        this.f5691a.put("from_kan_kan", new C2321a(false, true, false));
        this.f5691a.put("from_look_more", new C2321a(false, true, false));
        this.f5691a.put("from_kan_chat", new C2321a(false, true, false));
        this.f5691a.put("qa_recommend", new C2321a(true, false, false));
        this.f5691a.put("topic_recommend", new C2321a(true, true, false));
        this.f5691a.put("from_online_match", new C2321a(false, true, false));
        this.f5691a.put("qa_latest", new C2321a(true, false, false));
        this.f5691a.put("topic_latest", new C2321a(true, true, false));
        this.f5691a.put("from_moment_detail_album", new C2321a(true, false, false));
        this.f5691a.put("from_group_detail_recommend", new C2321a(true, false, false));
        this.f5691a.put("from_group_detail_new", new C2321a(true, false, false));
        this.f5691a.put("from_discover_dating", new C2321a(true, false, true));
        this.f5691a.put("from_discover_discussion", new C2321a(true, false, true));
        this.f5691a.put("from_activity_tab_one", new C2321a(true, false, true));
        this.f5691a.put("from_activity_tab_two", new C2321a(true, false, true));
        this.f5691a.put("from_poi_aggregation", new C2321a(true, false, true));
        this.f5691a.put("p_friend_moment", new C2321a(true, true, true));
    }

    /* JADX INFO: renamed from: a */
    public static ab70 m8476a() {
        return C2322b.f5695a;
    }

    /* JADX INFO: renamed from: b */
    public Map<String, C2321a> m8477b() {
        return this.f5691a;
    }
}
