package p149l;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.Banners;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.apibean.LiveSquareActiveGiftBean;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveActivityCounter;
import com.p046p1.mobile.putong.live.base.data.BLiveCounter;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlPushSwitch;
import com.p046p1.mobile.putong.live.base.data.BLiveRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.external.module.api.LiveExternalApi;
import com.p046p1.mobile.putong.live.external.square.api.LiveSquareBannersBean;
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
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m87232d2 = {"Ll/fbn;", "", "<init>", "()V", "Companion", "a", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class fbn {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l.fbn$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0018\u0010\rJ\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\t¢\u0006\u0004\b\u001a\u0010\u0010J#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\t2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!¨\u0006\""}, m87232d2 = {"Ll/fbn$a;", "", "<init>", "()V", "", ResourceDirection.f38808v, "()Z", "", "userId", "Lrx/c;", "", "Ll/wq2;", "m", "(Ljava/lang/String;)Lrx/c;", "Lcom/p1/mobile/putong/live/base/apibean/LiveSquareActiveGiftBean;", BLiveStormDanmakuGiftResourceType.f44444l, "()Lrx/c;", "tabLabel", "bannerType", "source", "Lcom/p1/mobile/putong/live/external/square/api/LiveSquareBannersBean;", "q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;", BLiveStormDanmakuGiftResourceType.f44446s, "Lcom/p1/mobile/putong/live/base/data/BLiveIntlPushSwitch;", "r", "operateButton", NotificationCompat.CATEGORY_STATUS, "u", "(Ljava/lang/String;Z)Lrx/c;", "b", Constants.KEY_T, "(Z)Z", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static void m120362b(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: d */
        public static List m120364d(Function1 function1, Object obj) {
            return (List) function1.invoke(obj);
        }

        /* JADX INFO: renamed from: e */
        public static List m120365e(BLiveEnvelope bLiveEnvelope) {
            bLiveEnvelope.getClass();
            ArrayList arrayList = new ArrayList();
            int size = bLiveEnvelope.data.users.size();
            for (int i = 0; i < size; i++) {
                final User user = bLiveEnvelope.data.users.get(i);
                ((nj3) s9s.m182763m(gld0.f103312b)).m159622d(user);
                wq2 wq2Var = new wq2(user, (BLiveAbsRoom) vwb.m200346r(bLiveEnvelope.data.rooms, new w9j() { // from class: l.dbn
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return fbn.Companion.m120372n(user, (BLiveRoom) obj);
                    }
                }), (BLiveAbsData) vwb.m200346r(bLiveEnvelope.data.lives, new w9j() { // from class: l.ebn
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return fbn.Companion.m120373o(user, (BLive) obj);
                    }
                }), (Followship) vwb.m200346r(bLiveEnvelope.data.followships, new w9j() { // from class: l.van
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return fbn.Companion.m120374p(user, (Followship) obj);
                    }
                }));
                wq2Var.toString();
                arrayList.add(wq2Var);
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: f */
        public static Boolean m120366f(BLiveEnvelope bLiveEnvelope) {
            bLiveEnvelope.getClass();
            return Boolean.valueOf(!vwb.m200296J(bLiveEnvelope.data.users));
        }

        /* JADX INFO: renamed from: g */
        public static Boolean m120367g(Function1 function1, Object obj) {
            return (Boolean) function1.invoke(obj);
        }

        /* JADX INFO: renamed from: h */
        public static Unit m120368h(BLiveEnvelope bLiveEnvelope) {
            l9s.m149048K(bLiveEnvelope);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: i */
        public static BLiveIntlPushSwitch m120369i(Function1 function1, Object obj) {
            return (BLiveIntlPushSwitch) function1.invoke(obj);
        }

        /* JADX INFO: renamed from: k */
        public static BLiveIntlPushSwitch m120371k(BLiveEnvelope bLiveEnvelope) {
            return bLiveEnvelope.data.userPushSwitch;
        }

        /* JADX INFO: renamed from: n */
        public static final Boolean m120372n(User user, BLiveRoom bLiveRoom) {
            bLiveRoom.getClass();
            return Boolean.valueOf(TextUtils.equals(bLiveRoom.owner.f44419id, user.f56011id));
        }

        /* JADX INFO: renamed from: o */
        public static final Boolean m120373o(User user, BLive bLive) {
            bLive.getClass();
            return Boolean.valueOf(TextUtils.equals(bLive.anchor.f44419id, user.f56011id));
        }

        /* JADX INFO: renamed from: p */
        public static final Boolean m120374p(User user, Followship followship) {
            followship.getClass();
            return Boolean.valueOf(TextUtils.equals(followship.otherUser, user.f56011id));
        }

        @Nullable
        /* JADX INFO: renamed from: l */
        public final C22306c<LiveSquareActiveGiftBean> m120375l() {
            return LiveExternalApi.buildLiveRead(LiveApiBuilder.m67307m(ytr.m216073b("/feed/live/popup?source=activity-rewards")).m107537d(), "getActiveGiftRequest", g7t.m124730c(LiveSquareActiveGiftBean.class, "livePopup"));
        }

        @Nullable
        /* JADX INFO: renamed from: m */
        public final C22306c<List<wq2>> m120376m(@NotNull String userId) {
            userId.getClass();
            cll cllVarM107501r = cll.m107501r(ytr.m216073b("/feed/liveroom-browse-history/" + userId));
            cllVarM107501r.getClass();
            cll.C16188a c16188aM107524p = cllVarM107501r.m107524p();
            c16188aM107524p.m107536c("with", "followships,rooms,users");
            C22306c<BLiveEnvelope> c22306cBuildLiveReadReq = LiveExternalApi.buildLiveReadReq(c16188aM107524p.m107537d(), "get_browser_history_" + userId);
            final Function1 function1 = new Function1() { // from class: l.zan
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return fbn.Companion.m120366f((BLiveEnvelope) obj);
                }
            };
            C22306c<BLiveEnvelope> c22306cFilter = c22306cBuildLiveReadReq.filter(new w9j() { // from class: l.abn
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return fbn.Companion.m120367g(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: l.bbn
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return fbn.Companion.m120365e((BLiveEnvelope) obj);
                }
            };
            return c22306cFilter.map(new w9j() { // from class: l.cbn
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return fbn.Companion.m120364d(function2, obj);
                }
            });
        }

        @Nullable
        /* JADX INFO: renamed from: q */
        public final C22306c<LiveSquareBannersBean> m120377q(@NotNull String tabLabel, @Nullable String bannerType, @Nullable String source) {
            tabLabel.getClass();
            cll cllVarM107501r = cll.m107501r(ytr.m216073b("/feed/live-banners"));
            cllVarM107501r.getClass();
            return LiveExternalApi.buildLiveRead(cllVarM107501r.m107524p().m107536c(FirebaseAnalytics.Event.SEARCH, tabLabel).m107536c("bannerType", bannerType).m107536c("source", source).m107537d(), Banners.TYPE + tabLabel, g7t.m124729b(LiveSquareBannersBean.class));
        }

        @NotNull
        /* JADX INFO: renamed from: r */
        public final C22306c<BLiveIntlPushSwitch> m120378r() {
            C22306c<BLiveEnvelope> c22306cBuildLiveReadReq = LiveExternalApi.buildLiveReadReq(cll.m107499l(ytr.m216073b("/feed/user-push-switch")), "getMediaNoticeDefaultToggle");
            final Function1 function1 = new Function1() { // from class: l.uan
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return fbn.Companion.m120371k((BLiveEnvelope) obj);
                }
            };
            C22306c map = c22306cBuildLiveReadReq.map(new w9j() { // from class: l.wan
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return fbn.Companion.m120369i(function1, obj);
                }
            });
            map.getClass();
            return map;
        }

        @Nullable
        /* JADX INFO: renamed from: s */
        public final C22306c<BLiveEnvelope> m120379s(@Nullable String source) {
            cll.C16188a c16188aM107536c = cll.m107499l(ytr.m216073b("/feed/live-square-summaries")).m107524p().m107536c("with", "lives,rooms,users,followships,relationships");
            if (!((jj3) s9s.m182763m(gld0.f103314d)).f118220a.get().booleanValue()) {
                c16188aM107536c.m107536c("localDot", "init");
            } else if (m120380t(true)) {
                c16188aM107536c.m107536c("localDot", "video");
            }
            if (!TextUtils.isEmpty(source)) {
                c16188aM107536c.m107536c("source", source);
            }
            C22306c<BLiveEnvelope> c22306cBuildLiveReadReqIO = LiveExternalApi.buildLiveReadReqIO(c16188aM107536c.m107537d(), "live-square-summaries");
            final Function1 function1 = new Function1() { // from class: l.xan
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return fbn.Companion.m120368h((BLiveEnvelope) obj);
                }
            };
            return c22306cBuildLiveReadReqIO.doOnNext(new e30() { // from class: l.yan
                @Override // p149l.e30
                public final void call(Object obj) {
                    fbn.Companion.m120362b(function1, obj);
                }
            }).compose(mkd0.m154951C());
        }

        /* JADX INFO: renamed from: t */
        public final boolean m120380t(boolean b) {
            int iM195919q3;
            BLiveActivityCounter bLiveActivityCounter;
            BLiveCounter bLiveCounterM159627i = ((nj3) s9s.m182763m(gld0.f103312b)).m159627i();
            if ((bLiveCounterM159627i != null && (bLiveActivityCounter = bLiveCounterM159627i.activity) != null && bLiveActivityCounter.total <= 0) || (iM195919q3 = s9s.f163228b.m195919q3()) == 0) {
                return false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long l2 = ((gl3) s9s.m182763m(gld0.f103315e)).f103280a.get();
            l2.getClass();
            return jCurrentTimeMillis - l2.longValue() >= ((long) iM195919q3) * 86400000;
        }

        @NotNull
        /* JADX INFO: renamed from: u */
        public final C22306c<BLiveEnvelope> m120381u(@NotNull String operateButton, boolean status) {
            operateButton.getClass();
            cll cllVarM107499l = cll.m107499l(ytr.m216073b("/feed/user-push-switch"));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("operateButton", operateButton);
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, status ? "open" : "close");
            } catch (JSONException e) {
                CrashHelper.m81296c(e);
            }
            C22306c<BLiveEnvelope> c22306cBuildLivePostNetReqObs = LiveExternalApi.buildLivePostNetReqObs(cllVarM107499l, "toggleMediaPush" + operateButton + status, jSONObject.toString());
            c22306cBuildLivePostNetReqObs.getClass();
            return c22306cBuildLivePostNetReqObs;
        }

        /* JADX INFO: renamed from: v */
        public final boolean m120382v() {
            return uvr.m196087d().m162669G0();
        }

        public Companion() {
        }
    }
}
