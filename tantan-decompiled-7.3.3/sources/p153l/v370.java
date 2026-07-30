package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.StickerInfo;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.ActivityActionApi;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.MomentActivity;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class v370 {

    /* JADX INFO: renamed from: a */
    public static Map<String, TopicMoment> f182168a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m199211b(String str, Envelope envelope) {
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C22421c m199214e(int i, final String str, String str2) {
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
            CrashHelper.m82479c(e);
            string = "";
        }
        final z1d0 z1d0VarCreate = z1d0.create(Network.JSON, string);
        final String strM117236f = dog.m117236f(str2);
        return new ti20(new pcj() { // from class: l.h370
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.auth().m209038l(z1d0VarCreate).m209043q(strM117236f + "&method=patch").m209028b();
            }
        }).compose(xi5.m211121w()).map(new qcj() { // from class: l.i370
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return v370.m199211b(str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ uxj0 m199219j(Envelope envelope) {
        mrb0.m159649c();
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ C22421c m199221l(String str, String str2) {
        final String strM117236f = TextUtils.isEmpty(str) ? dog.m117236f(str2) : dog.m117234e(str, str2);
        return new ti20(new pcj() { // from class: l.r370
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.auth().m209038l(z1d0.create(Network.JSON, "{\"read\": true}")).m209043q(strM117236f + "&method=patch").m209028b();
            }
        }).compose(xi5.m211121w()).map(new qcj() { // from class: l.s370
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return v370.m199219j((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ uxj0 m199227r(Envelope envelope) {
        mrb0.m159651e();
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: t */
    public static String m199229t(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return dog.m117246k("/activities?limit=20&filter=momentLike&with=" + dog.f89951v + Constants.SEPARATOR_COMMA + dog.f89949t + Constants.SEPARATOR_COMMA + dog.f89950u + str2);
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ C22421c m199230A(final Links links) {
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.t370
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.auth().m209043q(xi5.m211101c(links.next)).m209032f().m209028b();
            }
        }, xi5.MESSAGE_IN_MOMENTS).compose(xi5.m211121w()).map(new qcj() { // from class: l.u370
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f177316a.m199248z((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ pf60 m199231B(Envelope envelope) {
        FeedModule.f39703d.m145791sd(envelope);
        mrb0.m159640R(envelope.counters);
        m199242M(envelope);
        List<MomentActivity> list = ((FeedData) envelope.getModuleData(FeedData.class)).activities;
        m199233D(list, ((FeedData) envelope.getModuleData(FeedData.class)).messages);
        return new pf60(envelope.pagination.links, list);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ C22421c m199232C(final String str) {
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.p370
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.auth().m209043q(str).m209032f().m209028b();
            }
        }, xi5.MESSAGE_IN_MOMENTS).compose(xi5.m211121w()).map(new qcj() { // from class: l.q370
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f155429a.m199231B((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public final void m199233D(List<MomentActivity> list, List<MomentMessage> list2) {
        for (final MomentActivity momentActivity : list) {
            MomentMessage momentMessage = (MomentMessage) jyb.m147529r(list2, new qcj() { // from class: l.d370
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(momentActivity.messageid, ((MomentMessage) obj).f56856id));
                }
            });
            if (NullChecker.m82486a(momentMessage)) {
                if (TEnum.equals(momentMessage.messageType, "sticker")) {
                    StickerInfo stickerInfo = FeedModule.f39703d.f121303I0.get(momentMessage.accessory.f40061id);
                    if (NullChecker.m82486a(stickerInfo)) {
                        momentActivity.stickerInfo = stickerInfo;
                    }
                } else if (TEnum.equals(momentMessage.messageType, "picture")) {
                    List<Media> list3 = momentMessage.media;
                    if (!jyb.m147479J(list3)) {
                        momentActivity.media = list3.get(0);
                    }
                }
                if (!TextUtils.isEmpty(momentActivity.replyMessageId) && m199247y(momentActivity)) {
                    MomentMessage momentMessage2 = FeedModule.f39703d.f121300H0.get(momentActivity.replyMessageId);
                    if (NullChecker.m82486a(momentMessage2) && TEnum.equals(momentMessage2.messageType, "sticker")) {
                        StickerInfo stickerInfo2 = FeedModule.f39703d.f121303I0.get(momentMessage2.accessory.f40061id);
                        if (NullChecker.m82486a(stickerInfo2)) {
                            momentActivity.replyStickerInfo = stickerInfo2;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public C22421c<pf60<Links, List<MomentActivity>>> m199234E(final Links links) {
        return FeedModule.f39703d.scheduled("photo/album/activity/poll", 0, new pcj() { // from class: l.n370
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f139949a.m199230A(links);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public C22421c<pf60<Links, List<MomentActivity>>> m199235F(String str) {
        return m199236G(dog.m117228b("limit=20", str), "photo/album/activity/poll" + str);
    }

    /* JADX INFO: renamed from: G */
    public C22421c<pf60<Links, List<MomentActivity>>> m199236G(final String str, String str2) {
        return FeedModule.f39703d.scheduled(str2, 0, new pcj() { // from class: l.m370
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f134649a.m199232C(str);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public C22421c<bkj0<Links, List<User>, Integer>> m199237H() {
        return FeedModule.f39703d.m145818wc(dog.m117238g("limit=20"));
    }

    /* JADX INFO: renamed from: I */
    public C22421c<bkj0<Links, List<mah>, Integer>> m199238I() {
        return FeedModule.f39703d.m145826xc(dog.m117238g("limit=20"));
    }

    /* JADX INFO: renamed from: J */
    public C22421c<pf60<Links, List<MomentActivity>>> m199239J(Links links) {
        return m199236G(m199229t(links.next), "photo/album/likes/poll");
    }

    /* JADX INFO: renamed from: K */
    public C22421c<pf60<Links, List<MomentActivity>>> m199240K() {
        return m199236G(m199229t(""), "photo/album/likes/poll");
    }

    /* JADX INFO: renamed from: L */
    public C22421c<uxj0> m199241L() {
        return FeedModule.f39703d.scheduled("un/read/likes/patch", -1, new pcj() { // from class: l.o370
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20(new pcj() { // from class: l.e370
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return uqb0.f180376H.auth().m209043q(xi5.m211104f() + "&method=patch").m209038l(z1d0.create(Network.JSON, "{\"read\": true}")).m209028b();
                    }
                }).compose(xi5.m211121w()).map(new qcj() { // from class: l.f370
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return v370.m199227r((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final void m199242M(Envelope envelope) {
        if (!NullChecker.m82487b(((FeedData) envelope.getModuleData(FeedData.class)).momentTopics) || ((FeedData) envelope.getModuleData(FeedData.class)).momentTopics.size() <= 0) {
            return;
        }
        for (int i = 0; i < ((FeedData) envelope.getModuleData(FeedData.class)).momentTopics.size(); i++) {
            TopicMoment topicMoment = ((FeedData) envelope.getModuleData(FeedData.class)).momentTopics.get(i);
            if (f182168a.containsKey(topicMoment.f40095id)) {
                topicMoment.mergeData(f182168a.get(topicMoment.f40095id));
            }
            f182168a.put(topicMoment.f40095id, topicMoment);
        }
    }

    /* JADX INFO: renamed from: u */
    public C22421c<uxj0> m199243u(final String str) {
        return FeedModule.f39703d.scheduled("photo/album/activity/delete/by/id" + str, -1, new pcj() { // from class: l.j370
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20((pcj<x1d0>) new pcj() { // from class: l.k370
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return uqb0.f180376H.auth().m209043q(dog.m117240h(str)).m209030d().m209028b();
                    }
                }, 0).compose(xi5.m211121w()).map(new qcj() { // from class: l.l370
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public C22421c<uxj0> m199244v(final String str, final String str2) {
        return FeedModule.f39703d.scheduled("photo/album/activity/patch", -1, new pcj() { // from class: l.c370
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return v370.m199221l(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public C22421c<String> m199245w(String str, String str2) {
        return m199246x(str, str2, 0);
    }

    /* JADX INFO: renamed from: x */
    public C22421c<String> m199246x(final String str, final String str2, final int i) {
        return FeedModule.f39703d.scheduled("photo/album/activity/patch/" + str2, -1, new pcj() { // from class: l.g370
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return v370.m199214e(i, str2, str);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public final boolean m199247y(MomentActivity momentActivity) {
        return TEnum.equals(momentActivity.action, "comment") || TEnum.equals(momentActivity.action, ActivityActionApi.comment_reply) || TEnum.equals(momentActivity.action, ActivityActionApi.topic_comment_reply);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ pf60 m199248z(Envelope envelope) {
        FeedModule.f39703d.m145791sd(envelope);
        mrb0.m159640R(envelope.counters);
        m199242M(envelope);
        return new pf60(envelope.pagination.links, ((FeedData) envelope.getModuleData(FeedData.class)).activities);
    }
}
