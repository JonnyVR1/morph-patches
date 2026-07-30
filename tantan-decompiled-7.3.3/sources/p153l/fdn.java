package p153l;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.data.Banners;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.apibean.LiveSquareActiveGiftBean;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveActivityCounter;
import com.p051p1.mobile.putong.live.base.data.BLiveCounter;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlPushSwitch;
import com.p051p1.mobile.putong.live.base.data.BLiveRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.external.module.api.LiveExternalApi;
import com.p051p1.mobile.putong.live.external.square.api.LiveSquareBannersBean;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Ll/fdn;", "", "<init>", "()V", "Companion", "a", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class fdn {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l.fdn$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0018\u0010\rJ\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\t¢\u0006\u0004\b\u001a\u0010\u0010J#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\t2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!¨\u0006\""}, m88121d2 = {"Ll/fdn$a;", "", "<init>", "()V", "", ResourceDirection.f39656v, "()Z", "", "userId", "Lrx/c;", "", "Ll/mr2;", "m", "(Ljava/lang/String;)Lrx/c;", "Lcom/p1/mobile/putong/live/base/apibean/LiveSquareActiveGiftBean;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lrx/c;", "tabLabel", "bannerType", "source", "Lcom/p1/mobile/putong/live/external/square/api/LiveSquareBannersBean;", "q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;", BLiveStormDanmakuGiftResourceType.f45294s, "Lcom/p1/mobile/putong/live/base/data/BLiveIntlPushSwitch;", "r", "operateButton", NotificationCompat.CATEGORY_STATUS, "u", "(Ljava/lang/String;Z)Lrx/c;", "b", Constants.KEY_T, "(Z)Z", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static void m125106b(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: d */
        public static List m125108d(Function1 function1, Object obj) {
            return (List) function1.invoke(obj);
        }

        /* JADX INFO: renamed from: e */
        public static List m125109e(BLiveEnvelope bLiveEnvelope) {
            bLiveEnvelope.getClass();
            ArrayList arrayList = new ArrayList();
            int size = bLiveEnvelope.data.users.size();
            for (int i = 0; i < size; i++) {
                final User user = bLiveEnvelope.data.users.get(i);
                ((fk3) tbs.m190077m(itd0.f116820b)).m125953d(user);
                mr2 mr2Var = new mr2(user, (BLiveAbsRoom) jyb.m147529r(bLiveEnvelope.data.rooms, new qcj() { // from class: l.ddn
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return fdn.Companion.m125116n(user, (BLiveRoom) obj);
                    }
                }), (BLiveAbsData) jyb.m147529r(bLiveEnvelope.data.lives, new qcj() { // from class: l.edn
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return fdn.Companion.m125117o(user, (BLive) obj);
                    }
                }), (Followship) jyb.m147529r(bLiveEnvelope.data.followships, new qcj() { // from class: l.vcn
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return fdn.Companion.m125118p(user, (Followship) obj);
                    }
                }));
                mr2Var.toString();
                arrayList.add(mr2Var);
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: f */
        public static Boolean m125110f(BLiveEnvelope bLiveEnvelope) {
            bLiveEnvelope.getClass();
            return Boolean.valueOf(!jyb.m147479J(bLiveEnvelope.data.users));
        }

        /* JADX INFO: renamed from: g */
        public static Boolean m125111g(Function1 function1, Object obj) {
            return (Boolean) function1.invoke(obj);
        }

        /* JADX INFO: renamed from: h */
        public static Unit m125112h(BLiveEnvelope bLiveEnvelope) {
            mbs.m157825K(bLiveEnvelope);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: i */
        public static BLiveIntlPushSwitch m125113i(Function1 function1, Object obj) {
            return (BLiveIntlPushSwitch) function1.invoke(obj);
        }

        /* JADX INFO: renamed from: k */
        public static BLiveIntlPushSwitch m125115k(BLiveEnvelope bLiveEnvelope) {
            return bLiveEnvelope.data.userPushSwitch;
        }

        /* JADX INFO: renamed from: n */
        public static final Boolean m125116n(User user, BLiveRoom bLiveRoom) {
            bLiveRoom.getClass();
            return Boolean.valueOf(TextUtils.equals(bLiveRoom.owner.f45267id, user.f56859id));
        }

        /* JADX INFO: renamed from: o */
        public static final Boolean m125117o(User user, BLive bLive) {
            bLive.getClass();
            return Boolean.valueOf(TextUtils.equals(bLive.anchor.f45267id, user.f56859id));
        }

        /* JADX INFO: renamed from: p */
        public static final Boolean m125118p(User user, Followship followship) {
            followship.getClass();
            return Boolean.valueOf(TextUtils.equals(followship.otherUser, user.f56859id));
        }

        @Nullable
        /* JADX INFO: renamed from: l */
        public final C22421c<LiveSquareActiveGiftBean> m125119l() {
            return LiveExternalApi.buildLiveRead(LiveApiBuilder.m68490m(zvr.m221802b("/feed/live/popup?source=activity-rewards")).m182301d(), "getActiveGiftRequest", h9t.m134086c(LiveSquareActiveGiftBean.class, "livePopup"));
        }

        @Nullable
        /* JADX INFO: renamed from: m */
        public final C22421c<List<mr2>> m125120m(@NotNull String userId) {
            userId.getClass();
            rnl rnlVarM182265r = rnl.m182265r(zvr.m221802b("/feed/liveroom-browse-history/" + userId));
            rnlVarM182265r.getClass();
            rnl.C19886a c19886aM182288p = rnlVarM182265r.m182288p();
            c19886aM182288p.m182300c("with", "followships,rooms,users");
            C22421c<BLiveEnvelope> c22421cBuildLiveReadReq = LiveExternalApi.buildLiveReadReq(c19886aM182288p.m182301d(), "get_browser_history_" + userId);
            final Function1 function1 = new Function1() { // from class: l.zcn
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return fdn.Companion.m125110f((BLiveEnvelope) obj);
                }
            };
            C22421c<BLiveEnvelope> c22421cFilter = c22421cBuildLiveReadReq.filter(new qcj() { // from class: l.adn
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return fdn.Companion.m125111g(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: l.bdn
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return fdn.Companion.m125109e((BLiveEnvelope) obj);
                }
            };
            return c22421cFilter.map(new qcj() { // from class: l.cdn
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return fdn.Companion.m125108d(function2, obj);
                }
            });
        }

        @Nullable
        /* JADX INFO: renamed from: q */
        public final C22421c<LiveSquareBannersBean> m125121q(@NotNull String tabLabel, @Nullable String bannerType, @Nullable String source) {
            tabLabel.getClass();
            rnl rnlVarM182265r = rnl.m182265r(zvr.m221802b("/feed/live-banners"));
            rnlVarM182265r.getClass();
            return LiveExternalApi.buildLiveRead(rnlVarM182265r.m182288p().m182300c(FirebaseAnalytics.Event.SEARCH, tabLabel).m182300c("bannerType", bannerType).m182300c("source", source).m182301d(), Banners.TYPE + tabLabel, h9t.m134085b(LiveSquareBannersBean.class));
        }

        @NotNull
        /* JADX INFO: renamed from: r */
        public final C22421c<BLiveIntlPushSwitch> m125122r() {
            C22421c<BLiveEnvelope> c22421cBuildLiveReadReq = LiveExternalApi.buildLiveReadReq(rnl.m182263l(zvr.m221802b("/feed/user-push-switch")), "getMediaNoticeDefaultToggle");
            final Function1 function1 = new Function1() { // from class: l.ucn
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return fdn.Companion.m125115k((BLiveEnvelope) obj);
                }
            };
            C22421c map = c22421cBuildLiveReadReq.map(new qcj() { // from class: l.wcn
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return fdn.Companion.m125113i(function1, obj);
                }
            });
            map.getClass();
            return map;
        }

        @Nullable
        /* JADX INFO: renamed from: s */
        public final C22421c<BLiveEnvelope> m125123s(@Nullable String source) {
            rnl.C19886a c19886aM182300c = rnl.m182263l(zvr.m221802b("/feed/live-square-summaries")).m182288p().m182300c("with", "lives,rooms,users,followships,relationships");
            if (!((bk3) tbs.m190077m(itd0.f116822d)).f77038a.get().booleanValue()) {
                c19886aM182300c.m182300c("localDot", "init");
            } else if (m125124t(true)) {
                c19886aM182300c.m182300c("localDot", "video");
            }
            if (!TextUtils.isEmpty(source)) {
                c19886aM182300c.m182300c("source", source);
            }
            C22421c<BLiveEnvelope> c22421cBuildLiveReadReqIO = LiveExternalApi.buildLiveReadReqIO(c19886aM182300c.m182301d(), "live-square-summaries");
            final Function1 function1 = new Function1() { // from class: l.xcn
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return fdn.Companion.m125112h((BLiveEnvelope) obj);
                }
            };
            return c22421cBuildLiveReadReqIO.doOnNext(new y20() { // from class: l.ycn
                @Override // p153l.y20
                public final void call(Object obj) {
                    fdn.Companion.m125106b(function1, obj);
                }
            }).compose(psd0.m173592C());
        }

        /* JADX INFO: renamed from: t */
        public final boolean m125124t(boolean b) {
            int iM203706q3;
            BLiveActivityCounter bLiveActivityCounter;
            BLiveCounter bLiveCounterM125958i = ((fk3) tbs.m190077m(itd0.f116820b)).m125958i();
            if ((bLiveCounterM125958i != null && (bLiveActivityCounter = bLiveCounterM125958i.activity) != null && bLiveActivityCounter.total <= 0) || (iM203706q3 = tbs.f172989b.m203706q3()) == 0) {
                return false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long l2 = ((fm3) tbs.m190077m(itd0.f116823e)).f99711a.get();
            l2.getClass();
            return jCurrentTimeMillis - l2.longValue() >= ((long) iM203706q3) * 86400000;
        }

        @NotNull
        /* JADX INFO: renamed from: u */
        public final C22421c<BLiveEnvelope> m125125u(@NotNull String operateButton, boolean status) {
            operateButton.getClass();
            rnl rnlVarM182263l = rnl.m182263l(zvr.m221802b("/feed/user-push-switch"));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("operateButton", operateButton);
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, status ? "open" : "close");
            } catch (JSONException e) {
                CrashHelper.m82479c(e);
            }
            C22421c<BLiveEnvelope> c22421cBuildLivePostNetReqObs = LiveExternalApi.buildLivePostNetReqObs(rnlVarM182263l, "toggleMediaPush" + operateButton + status, jSONObject.toString());
            c22421cBuildLivePostNetReqObs.getClass();
            return c22421cBuildLivePostNetReqObs;
        }

        /* JADX INFO: renamed from: v */
        public final boolean m125126v() {
            return vxr.m203876d().m170976G0();
        }

        public Companion() {
        }
    }
}
