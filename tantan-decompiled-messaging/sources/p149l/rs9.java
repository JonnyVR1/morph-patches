package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.Moments;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Extra;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.data.VoteOptions;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.data.JsonAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m87231d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u000f\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rj\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000e\"\u0004\b\u0000\u0010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u0019¢\u0006\u0004\b%\u0010&J\u001d\u0010)\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004¢\u0006\u0004\b)\u0010*J\u0019\u0010-\u001a\u0004\u0018\u00010,2\b\u0010+\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b-\u0010.R\u0016\u00102\u001a\u00020/8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b0\u00101Rj\u00105\u001aV\u0012\u0004\u0012\u00020\u0004\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\rj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006`\u000e0\rj*\u0012\u0004\u0012\u00020\u0004\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\rj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006`\u000e`\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u009b\u0001\u0010=\u001a\u0086\u0001\u0012<\u0012:\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000409 :*\u001c\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000409\u0018\u00010707 :*B\u0012<\u0012:\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000409 :*\u001c\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000409\u0018\u00010707\u0018\u000106068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b;\u0010<Rj\u0010@\u001aV\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015 :*\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0018\u00010>0> :**\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015 :*\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0018\u00010>0>\u0018\u000106068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b?\u0010<R:\u0010B\u001a&\u0012\f\u0012\n :*\u0004\u0018\u00010\u00040\u0004 :*\u0012\u0012\f\u0012\n :*\u0004\u0018\u00010\u00040\u0004\u0018\u000106068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bA\u0010<R:\u0010E\u001a&\u0012\f\u0012\n :*\u0004\u0018\u00010C0C :*\u0012\u0012\f\u0012\n :*\u0004\u0018\u00010C0C\u0018\u000106068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bD\u0010<R\u0018\u0010H\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bF\u0010GR:\u0010K\u001a&\u0012\f\u0012\n :*\u0004\u0018\u00010I0I :*\u0012\u0012\f\u0012\n :*\u0004\u0018\u00010I0I\u0018\u000106068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bJ\u0010<¨\u0006L"}, m87232d2 = {"Ll/rs9;", "Ll/omg;", "<init>", "()V", "", "category", "", "data", Constants.KEY_KEY, "", "B0", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", j6f.GPS_DIRECTION_TRUE, "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "u0", "(Ljava/lang/String;)Ljava/util/HashMap;", "Lcom/tantanapp/common/data/JsonAdapter;", "adapter", "v0", "(Ljava/lang/String;Ljava/lang/String;Lcom/tantanapp/common/data/JsonAdapter;)Ljava/lang/Object;", "", "t0", "(Ljava/lang/String;Ljava/lang/String;)Z", "momentId", "Lcom/p1/mobile/putong/feed/data/Moment;", "x0", "(Ljava/lang/String;)Lcom/p1/mobile/putong/feed/data/Moment;", "userId", "Lcom/p1/mobile/putong/data/User;", "z0", "(Ljava/lang/String;)Lcom/p1/mobile/putong/data/User;", Oauth2AccessToken.KEY_UID, "Lcom/p1/mobile/putong/data/Relationship;", "y0", "(Ljava/lang/String;)Lcom/p1/mobile/putong/data/Relationship;", "moment", "A0", "(Lcom/p1/mobile/putong/feed/data/Moment;)V", "topicId", "voteId", "C0", "(Ljava/lang/String;Ljava/lang/String;)V", "feedId", "Lcom/p1/mobile/putong/feed/data/RawFeed;", "w0", "(Ljava/lang/String;)Lcom/p1/mobile/putong/feed/data/RawFeed;", "Ll/tpd0;", "H", "Ll/tpd0;", "lastDetectedMediaCount", "I", "Ljava/util/HashMap;", "feedCachePool", "Lrx/subjects/b;", "Ll/xaj0;", "", "", "kotlin.jvm.PlatformType", "J", "Lrx/subjects/b;", "unreadRedPoint", "Ll/j760;", "K", "refreshIconObs", "L", "currentPageId", "Lcom/p1/mobile/putong/feed/data/Extra;", "M", "followConfigSub", "N", "Lcom/p1/mobile/putong/feed/data/Extra;", "followConfig", "Ll/roj0;", BloodType.f38728O, "closePostBasePopWindowSub", "b_feed_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public class rs9 extends omg {

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public Extra followConfig;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public tpd0 lastDetectedMediaCount = new tpd0("last_detected_media_count_" + FeedModule.m60221F().userId(), 0);

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public HashMap<String, HashMap<String, Object>> feedCachePool = new HashMap<>();

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @JvmField
    public C22393b<xaj0<Integer, Boolean, List<String>>> unreadRedPoint = C22393b.m221521b();

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @JvmField
    public C22393b<j760<Boolean, Boolean>> refreshIconObs = C22393b.m221521b();

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @JvmField
    public C22393b<String> currentPageId = C22393b.m221521b();

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @JvmField
    public C22393b<Extra> followConfigSub = C22393b.m221521b();

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @JvmField
    public C22393b<roj0> closePostBasePopWindowSub = C22393b.m221521b();

    /* JADX INFO: renamed from: A0 */
    public final void m180641A0(@NotNull Moment moment) {
        moment.getClass();
        m180642B0(Moments.TYPE, buw.m104003a(moment, Moment.JSON_ADAPTER), moment.f56011id);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m180642B0(@Nullable String category, @Nullable Object data, @Nullable String key) {
        if (data == null || TextUtils.isEmpty(category) || TextUtils.isEmpty(key)) {
            return;
        }
        HashMap<String, Object> map = this.feedCachePool.get(category);
        if (map == null) {
            map = new HashMap<>();
            HashMap<String, HashMap<String, Object>> map2 = this.feedCachePool;
            category.getClass();
            map2.put(category, map);
        }
        key.getClass();
        map.put(key, data);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m180643C0(@NotNull String topicId, @NotNull String voteId) {
        topicId.getClass();
        voteId.getClass();
        if (TextUtils.isEmpty(topicId) || TextUtils.isEmpty(voteId)) {
            return;
        }
        JsonAdapter<TopicMoment> jsonAdapter = TopicMoment.JSON_ADAPTER;
        jsonAdapter.getClass();
        TopicMoment topicMoment = (TopicMoment) m180646v0("momentTopics", topicId, jsonAdapter);
        if ((topicMoment != null ? topicMoment.options : null) != null) {
            List<VoteOptions> list = topicMoment.options;
            Boolean boolValueOf = list != null ? Boolean.valueOf(list.isEmpty()) : null;
            boolValueOf.getClass();
            if (boolValueOf.booleanValue()) {
                return;
            }
            List<VoteOptions> list2 = topicMoment.options;
            list2.getClass();
            for (VoteOptions voteOptions : list2) {
                if (TextUtils.equals(voteOptions.f39253id, voteId)) {
                    voteOptions.haveliked = true;
                    voteOptions.counter++;
                }
            }
            m180642B0("momentTopics", buw.m104003a(topicMoment, TopicMoment.JSON_ADAPTER), topicId);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m180644t0(@Nullable String category, @Nullable String key) {
        HashMap<String, Object> map;
        return (TextUtils.isEmpty(category) || TextUtils.isEmpty(key) || (map = this.feedCachePool.get(category)) == null || map.get(key) == null) ? false : true;
    }

    @Nullable
    /* JADX INFO: renamed from: u0 */
    public final <T> HashMap<String, T> m180645u0(@Nullable String category) {
        if (TextUtils.isEmpty(category)) {
            return null;
        }
        HashMap<String, T> map = (HashMap) this.feedCachePool.get(category);
        if (map != null) {
            return map;
        }
        HashMap<String, T> map2 = new HashMap<>();
        HashMap<String, HashMap<String, Object>> map3 = this.feedCachePool;
        category.getClass();
        map3.put(category, map2);
        return map2;
    }

    @Nullable
    /* JADX INFO: renamed from: v0 */
    public final <T> T m180646v0(@Nullable String category, @Nullable String key, @NotNull JsonAdapter<T> adapter) {
        HashMap<String, Object> map;
        Object obj;
        adapter.getClass();
        if (TextUtils.isEmpty(category) || TextUtils.isEmpty(key) || (map = this.feedCachePool.get(category)) == null || (obj = map.get(key)) == null) {
            return null;
        }
        return (T) buw.m104004b((Map) obj, adapter);
    }

    @Nullable
    /* JADX INFO: renamed from: w0 */
    public final RawFeed m180647w0(@Nullable String feedId) {
        if (TextUtils.isEmpty(feedId)) {
            return null;
        }
        JsonAdapter<RawFeed> jsonAdapter = RawFeed.JSON_ADAPTER;
        jsonAdapter.getClass();
        return (RawFeed) m180646v0("feeds", feedId, jsonAdapter);
    }

    @Nullable
    /* JADX INFO: renamed from: x0 */
    public final Moment m180648x0(@Nullable String momentId) {
        if (TextUtils.isEmpty(momentId)) {
            return null;
        }
        JsonAdapter<Moment> jsonAdapter = Moment.JSON_ADAPTER;
        jsonAdapter.getClass();
        return (Moment) m180646v0(Moments.TYPE, momentId, jsonAdapter);
    }

    @Nullable
    /* JADX INFO: renamed from: y0 */
    public final Relationship m180649y0(@Nullable String uid) {
        if (TextUtils.isEmpty(uid)) {
            return null;
        }
        JsonAdapter<Relationship> jsonAdapter = Relationship.JSON_ADAPTER;
        jsonAdapter.getClass();
        return (Relationship) m180646v0("relationships", uid, jsonAdapter);
    }

    @Nullable
    /* JADX INFO: renamed from: z0 */
    public final User m180650z0(@Nullable String userId) {
        if (TextUtils.isEmpty(userId)) {
            return null;
        }
        JsonAdapter<User> jsonAdapter = User.JSON_ADAPTER;
        jsonAdapter.getClass();
        User user = (User) m180646v0("users", userId, jsonAdapter);
        userId.getClass();
        Relationship relationshipM180649y0 = m180649y0(userId);
        if ((user != null ? user.localRelationship : null) == null && user != null) {
            user.localRelationship = relationshipM180649y0;
        }
        return user;
    }
}
