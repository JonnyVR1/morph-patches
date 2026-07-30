package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.StickerInfo;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.ActivityActionApi;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.MomentActivity;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class pv60 {

    /* JADX INFO: renamed from: a */
    public static Map<String, TopicMoment> f151422a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m171578b(String str, Envelope envelope) {
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C22306c m171581e(int i, final String str, String str2) {
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
            CrashHelper.m81296c(e);
            string = "";
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, string);
        final String strM165075f = omg.m165075f(str2);
        return new la20(new v9j() { // from class: l.bv60
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.auth().m185893l(utc0VarCreate).m185898q(strM165075f + "&method=patch").m185883b();
            }
        }).compose(xh5.m208775w()).map(new w9j() { // from class: l.cv60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return pv60.m171578b(str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ roj0 m171586j(Envelope envelope) {
        ijb0.m136563c();
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ C22306c m171588l(String str, String str2) {
        final String strM165075f = TextUtils.isEmpty(str) ? omg.m165075f(str2) : omg.m165073e(str, str2);
        return new la20(new v9j() { // from class: l.lv60
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.auth().m185893l(utc0.create(Network.JSON, "{\"read\": true}")).m185898q(strM165075f + "&method=patch").m185883b();
            }
        }).compose(xh5.m208775w()).map(new w9j() { // from class: l.mv60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return pv60.m171586j((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ roj0 m171594r(Envelope envelope) {
        ijb0.m136565e();
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: t */
    public static String m171596t(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return omg.m165085k("/activities?limit=20&filter=momentLike&with=" + omg.f144644v + Constants.SEPARATOR_COMMA + omg.f144642t + Constants.SEPARATOR_COMMA + omg.f144643u + str2);
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ C22306c m171597A(final Links links) {
        return new la20((v9j<stc0>) new v9j() { // from class: l.nv60
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.auth().m185898q(xh5.m208755c(links.next)).m185887f().m185883b();
            }
        }, xh5.MESSAGE_IN_MOMENTS).compose(xh5.m208775w()).map(new w9j() { // from class: l.ov60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f145787a.m171615z((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ j760 m171598B(Envelope envelope) {
        FeedModule.f38855d.m209550sd(envelope);
        ijb0.m136554R(envelope.counters);
        m171609M(envelope);
        List<MomentActivity> list = ((FeedData) envelope.getModuleData(FeedData.class)).activities;
        m171600D(list, ((FeedData) envelope.getModuleData(FeedData.class)).messages);
        return new j760(envelope.pagination.links, list);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ C22306c m171599C(final String str) {
        return new la20((v9j<stc0>) new v9j() { // from class: l.jv60
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.auth().m185898q(str).m185887f().m185883b();
            }
        }, xh5.MESSAGE_IN_MOMENTS).compose(xh5.m208775w()).map(new w9j() { // from class: l.kv60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f124754a.m171598B((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public final void m171600D(List<MomentActivity> list, List<MomentMessage> list2) {
        for (final MomentActivity momentActivity : list) {
            MomentMessage momentMessage = (MomentMessage) vwb.m200346r(list2, new w9j() { // from class: l.xu60
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(momentActivity.messageid, ((MomentMessage) obj).f56008id));
                }
            });
            if (NullChecker.m81303a(momentMessage)) {
                if (TEnum.equals(momentMessage.messageType, "sticker")) {
                    StickerInfo stickerInfo = FeedModule.f38855d.f192993I0.get(momentMessage.accessory.f39213id);
                    if (NullChecker.m81303a(stickerInfo)) {
                        momentActivity.stickerInfo = stickerInfo;
                    }
                } else if (TEnum.equals(momentMessage.messageType, "picture")) {
                    List<Media> list3 = momentMessage.media;
                    if (!vwb.m200296J(list3)) {
                        momentActivity.media = list3.get(0);
                    }
                }
                if (!TextUtils.isEmpty(momentActivity.replyMessageId) && m171614y(momentActivity)) {
                    MomentMessage momentMessage2 = FeedModule.f38855d.f192990H0.get(momentActivity.replyMessageId);
                    if (NullChecker.m81303a(momentMessage2) && TEnum.equals(momentMessage2.messageType, "sticker")) {
                        StickerInfo stickerInfo2 = FeedModule.f38855d.f192993I0.get(momentMessage2.accessory.f39213id);
                        if (NullChecker.m81303a(stickerInfo2)) {
                            momentActivity.replyStickerInfo = stickerInfo2;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public C22306c<j760<Links, List<MomentActivity>>> m171601E(final Links links) {
        return FeedModule.f38855d.scheduled("photo/album/activity/poll", 0, new v9j() { // from class: l.hv60
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f109624a.m171597A(links);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public C22306c<j760<Links, List<MomentActivity>>> m171602F(String str) {
        return m171603G(omg.m165067b("limit=20", str), "photo/album/activity/poll" + str);
    }

    /* JADX INFO: renamed from: G */
    public C22306c<j760<Links, List<MomentActivity>>> m171603G(final String str, String str2) {
        return FeedModule.f38855d.scheduled(str2, 0, new v9j() { // from class: l.gv60
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f104535a.m171599C(str);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public C22306c<xaj0<Links, List<User>, Integer>> m171604H() {
        return FeedModule.f38855d.m209577wc(omg.m165077g("limit=20"));
    }

    /* JADX INFO: renamed from: I */
    public C22306c<xaj0<Links, List<x8h>, Integer>> m171605I() {
        return FeedModule.f38855d.m209585xc(omg.m165077g("limit=20"));
    }

    /* JADX INFO: renamed from: J */
    public C22306c<j760<Links, List<MomentActivity>>> m171606J(Links links) {
        return m171603G(m171596t(links.next), "photo/album/likes/poll");
    }

    /* JADX INFO: renamed from: K */
    public C22306c<j760<Links, List<MomentActivity>>> m171607K() {
        return m171603G(m171596t(""), "photo/album/likes/poll");
    }

    /* JADX INFO: renamed from: L */
    public C22306c<roj0> m171608L() {
        return FeedModule.f38855d.scheduled("un/read/likes/patch", -1, new v9j() { // from class: l.iv60
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20(new v9j() { // from class: l.yu60
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return qib0.f154693H.auth().m185898q(xh5.m208758f() + "&method=patch").m185893l(utc0.create(Network.JSON, "{\"read\": true}")).m185883b();
                    }
                }).compose(xh5.m208775w()).map(new w9j() { // from class: l.zu60
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return pv60.m171594r((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final void m171609M(Envelope envelope) {
        if (!NullChecker.m81304b(((FeedData) envelope.getModuleData(FeedData.class)).momentTopics) || ((FeedData) envelope.getModuleData(FeedData.class)).momentTopics.size() <= 0) {
            return;
        }
        for (int i = 0; i < ((FeedData) envelope.getModuleData(FeedData.class)).momentTopics.size(); i++) {
            TopicMoment topicMoment = ((FeedData) envelope.getModuleData(FeedData.class)).momentTopics.get(i);
            if (f151422a.containsKey(topicMoment.f39247id)) {
                topicMoment.mergeData(f151422a.get(topicMoment.f39247id));
            }
            f151422a.put(topicMoment.f39247id, topicMoment);
        }
    }

    /* JADX INFO: renamed from: u */
    public C22306c<roj0> m171610u(final String str) {
        return FeedModule.f38855d.scheduled("photo/album/activity/delete/by/id" + str, -1, new v9j() { // from class: l.dv60
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20((v9j<stc0>) new v9j() { // from class: l.ev60
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return qib0.f154693H.auth().m185898q(omg.m165079h(str)).m185885d().m185883b();
                    }
                }, 0).compose(xh5.m208775w()).map(new w9j() { // from class: l.fv60
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public C22306c<roj0> m171611v(final String str, final String str2) {
        return FeedModule.f38855d.scheduled("photo/album/activity/patch", -1, new v9j() { // from class: l.wu60
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return pv60.m171588l(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public C22306c<String> m171612w(String str, String str2) {
        return m171613x(str, str2, 0);
    }

    /* JADX INFO: renamed from: x */
    public C22306c<String> m171613x(final String str, final String str2, final int i) {
        return FeedModule.f38855d.scheduled("photo/album/activity/patch/" + str2, -1, new v9j() { // from class: l.av60
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return pv60.m171581e(i, str2, str);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public final boolean m171614y(MomentActivity momentActivity) {
        return TEnum.equals(momentActivity.action, "comment") || TEnum.equals(momentActivity.action, ActivityActionApi.comment_reply) || TEnum.equals(momentActivity.action, ActivityActionApi.topic_comment_reply);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ j760 m171615z(Envelope envelope) {
        FeedModule.f38855d.m209550sd(envelope);
        ijb0.m136554R(envelope.counters);
        m171609M(envelope);
        return new j760(envelope.pagination.links, ((FeedData) envelope.getModuleData(FeedData.class)).activities);
    }
}
