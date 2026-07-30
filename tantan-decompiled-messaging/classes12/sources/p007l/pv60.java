package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.StickerInfo;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.ActivityActionApi;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.MomentActivity;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p1.mobile.putong.api.api.Network;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.j760;
import l.la20;
import l.qib0;
import l.roj0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.xaj0;
import l.xh5;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class pv60 {

    /* JADX INFO: renamed from: a */
    public static Map<String, TopicMoment> f11990a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m13231b(String str, Envelope envelope) {
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ c m13234e(int i, final String str, String str2) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("read", true);
            if (i != 0) {
                jSONObject.put("count", i);
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("id", str);
            }
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.c(e);
            string = "";
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, string);
        final String strM12693f = omg.m12693f(str2);
        return new la20(new v9j() { // from class: l.bv60
            public final Object call() {
                return qib0.H.auth().l(utc0VarCreate).q(strM12693f + "&method=patch").b();
            }
        }).compose(xh5.w()).map(new w9j() { // from class: l.cv60
            public final Object call(Object obj) {
                return pv60.m13231b(str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ roj0 m13239j(Envelope envelope) {
        ijb0.m10916c();
        return roj0.a;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ c m13241l(String str, String str2) {
        final String strM12693f = TextUtils.isEmpty(str) ? omg.m12693f(str2) : omg.m12691e(str, str2);
        return new la20(new v9j() { // from class: l.lv60
            public final Object call() {
                return qib0.H.auth().l(utc0.create(Network.JSON, "{\"read\": true}")).q(strM12693f + "&method=patch").b();
            }
        }).compose(xh5.w()).map(new w9j() { // from class: l.mv60
            public final Object call(Object obj) {
                return pv60.m13239j((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ roj0 m13247r(Envelope envelope) {
        ijb0.m10918e();
        return roj0.a;
    }

    /* JADX INFO: renamed from: t */
    public static String m13249t(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return omg.m12703k("/activities?limit=20&filter=momentLike&with=" + omg.f11531v + "," + omg.f11529t + "," + omg.f11530u + str2);
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ c m13250A(final Links links) {
        return new la20(new v9j() { // from class: l.nv60
            public final Object call() {
                return qib0.H.auth().q(xh5.c(links.next)).f().b();
            }
        }, xh5.MESSAGE_IN_MOMENTS).compose(xh5.w()).map(new w9j() { // from class: l.ov60
            public final Object call(Object obj) {
                return this.f11623a.m13268z((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ j760 m13251B(Envelope envelope) {
        FeedModule.f316d.m16731sd(envelope);
        ijb0.m10907R(envelope.counters);
        m13262M(envelope);
        List<MomentActivity> list = ((FeedData) envelope.getModuleData(FeedData.class)).activities;
        m13253D(list, ((FeedData) envelope.getModuleData(FeedData.class)).messages);
        return new j760(envelope.pagination.links, list);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ c m13252C(final String str) {
        return new la20(new v9j() { // from class: l.jv60
            public final Object call() {
                return qib0.H.auth().q(str).f().b();
            }
        }, xh5.MESSAGE_IN_MOMENTS).compose(xh5.w()).map(new w9j() { // from class: l.kv60
            public final Object call(Object obj) {
                return this.f9804a.m13251B((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public final void m13253D(List<MomentActivity> list, List<MomentMessage> list2) {
        for (final MomentActivity momentActivity : list) {
            MomentMessage momentMessage = (MomentMessage) vwb.r(list2, new w9j() { // from class: l.xu60
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(momentActivity.messageid, ((CopyObject) ((MomentMessage) obj)).id));
                }
            });
            if (NullChecker.a(momentMessage)) {
                if (TEnum.equals(momentMessage.messageType, "sticker")) {
                    StickerInfo stickerInfo = FeedModule.f316d.f14928I0.get(momentMessage.accessory.f674id);
                    if (NullChecker.a(stickerInfo)) {
                        momentActivity.stickerInfo = stickerInfo;
                    }
                } else if (TEnum.equals(momentMessage.messageType, "picture")) {
                    List<Media> list3 = momentMessage.media;
                    if (!vwb.J(list3)) {
                        momentActivity.media = list3.get(0);
                    }
                }
                if (!TextUtils.isEmpty(momentActivity.replyMessageId) && m13267y(momentActivity)) {
                    MomentMessage momentMessage2 = FeedModule.f316d.f14925H0.get(momentActivity.replyMessageId);
                    if (NullChecker.a(momentMessage2) && TEnum.equals(momentMessage2.messageType, "sticker")) {
                        StickerInfo stickerInfo2 = FeedModule.f316d.f14928I0.get(momentMessage2.accessory.f674id);
                        if (NullChecker.a(stickerInfo2)) {
                            momentActivity.replyStickerInfo = stickerInfo2;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public c<j760<Links, List<MomentActivity>>> m13254E(final Links links) {
        return FeedModule.f316d.scheduled("photo/album/activity/poll", 0, new v9j() { // from class: l.hv60
            public final Object call() {
                return this.f8823a.m13250A(links);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public c<j760<Links, List<MomentActivity>>> m13255F(String str) {
        return m13256G(omg.m12685b("limit=20", str), "photo/album/activity/poll" + str);
    }

    /* JADX INFO: renamed from: G */
    public c<j760<Links, List<MomentActivity>>> m13256G(final String str, String str2) {
        return FeedModule.f316d.scheduled(str2, 0, new v9j() { // from class: l.gv60
            public final Object call() {
                return this.f8525a.m13252C(str);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public c<xaj0<Links, List<User>, Integer>> m13257H() {
        return FeedModule.f316d.m16758wc(omg.m12695g("limit=20"));
    }

    /* JADX INFO: renamed from: I */
    public c<xaj0<Links, List<x8h>, Integer>> m13258I() {
        return FeedModule.f316d.m16766xc(omg.m12695g("limit=20"));
    }

    /* JADX INFO: renamed from: J */
    public c<j760<Links, List<MomentActivity>>> m13259J(Links links) {
        return m13256G(m13249t(links.next), "photo/album/likes/poll");
    }

    /* JADX INFO: renamed from: K */
    public c<j760<Links, List<MomentActivity>>> m13260K() {
        return m13256G(m13249t(""), "photo/album/likes/poll");
    }

    /* JADX INFO: renamed from: L */
    public c<roj0> m13261L() {
        return FeedModule.f316d.scheduled("un/read/likes/patch", -1, new v9j() { // from class: l.iv60
            public final Object call() {
                return new la20(new v9j() { // from class: l.yu60
                    public final Object call() {
                        return qib0.H.auth().q(xh5.f() + "&method=patch").l(utc0.create(Network.JSON, "{\"read\": true}")).b();
                    }
                }).compose(xh5.w()).map(new w9j() { // from class: l.zu60
                    public final Object call(Object obj) {
                        return pv60.m13247r((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final void m13262M(Envelope envelope) {
        if (!NullChecker.b(((FeedData) envelope.getModuleData(FeedData.class)).momentTopics) || ((FeedData) envelope.getModuleData(FeedData.class)).momentTopics.size() <= 0) {
            return;
        }
        for (int i = 0; i < ((FeedData) envelope.getModuleData(FeedData.class)).momentTopics.size(); i++) {
            TopicMoment topicMoment = ((FeedData) envelope.getModuleData(FeedData.class)).momentTopics.get(i);
            if (f11990a.containsKey(topicMoment.f708id)) {
                topicMoment.mergeData(f11990a.get(topicMoment.f708id));
            }
            f11990a.put(topicMoment.f708id, topicMoment);
        }
    }

    /* JADX INFO: renamed from: u */
    public c<roj0> m13263u(final String str) {
        return FeedModule.f316d.scheduled("photo/album/activity/delete/by/id" + str, -1, new v9j() { // from class: l.dv60
            public final Object call() {
                return new la20(new v9j() { // from class: l.ev60
                    public final Object call() {
                        return qib0.H.auth().q(omg.m12697h(str)).d().b();
                    }
                }, 0).compose(xh5.w()).map(new w9j() { // from class: l.fv60
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public c<roj0> m13264v(final String str, final String str2) {
        return FeedModule.f316d.scheduled("photo/album/activity/patch", -1, new v9j() { // from class: l.wu60
            public final Object call() {
                return pv60.m13241l(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public c<String> m13265w(String str, String str2) {
        return m13266x(str, str2, 0);
    }

    /* JADX INFO: renamed from: x */
    public c<String> m13266x(final String str, final String str2, final int i) {
        return FeedModule.f316d.scheduled("photo/album/activity/patch/" + str2, -1, new v9j() { // from class: l.av60
            public final Object call() {
                return pv60.m13234e(i, str2, str);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public final boolean m13267y(MomentActivity momentActivity) {
        return TEnum.equals(momentActivity.action, "comment") || TEnum.equals(momentActivity.action, ActivityActionApi.comment_reply) || TEnum.equals(momentActivity.action, ActivityActionApi.topic_comment_reply);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ j760 m13268z(Envelope envelope) {
        FeedModule.f316d.m16731sd(envelope);
        ijb0.m10907R(envelope.counters);
        m13262M(envelope);
        return new j760(envelope.pagination.links, ((FeedData) envelope.getModuleData(FeedData.class)).activities);
    }
}
