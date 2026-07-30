package p149l;

import android.app.Dialog;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.AdConfiguration;
import com.p046p1.mobile.putong.data.AdReward;
import com.p046p1.mobile.putong.data.AdRewardExt;
import com.p046p1.mobile.putong.data.AdScenes;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 !2\u00020\u0001:\u0002\u001b\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, m87232d2 = {"Ll/p0d0;", "", "<init>", "()V", "Lcom/p1/mobile/putong/data/AdConfiguration;", "adConfiguration", "", BLiveStormDanmakuGiftResourceType.f44444l, "(Lcom/p1/mobile/putong/data/AdConfiguration;)Z", "j", "", "h", "(Lcom/p1/mobile/putong/data/AdConfiguration;)I", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "from", "Ll/d30;", "cancelClickAction", "", "n", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/d30;)V", "m", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "o", "()Z", "Ll/uqd0;", "a", "Ll/uqd0;", "swipeMaxTaskNum", "b", "Z", "canPollingRefresh", "Companion", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class p0d0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @Nullable
    public static volatile p0d0 f146582c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public uqd0 swipeMaxTaskNum = new uqd0("core_swipe_max_task_num_" + qib0.f154714c0.userId(), "0,0");

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean canPollingRefresh;

    /* JADX INFO: renamed from: l.p0d0$b */
    @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"Ll/p0d0$b;", "Ll/i2m;", "", "replay", "<init>", "(Z)V", "a", "Z", "getReplay", "()Z", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static class C19093b extends i2m {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final boolean replay;

        public C19093b(boolean z) {
            this.replay = z;
        }
    }

    /* JADX INFO: renamed from: l.p0d0$c */
    @Metadata(m87231d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m87232d2 = {"l/p0d0$c", "Ll/p0d0$b;", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C19094c extends C19093b {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f146586b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19094c(Act act) {
            super(false);
            this.f146586b = act;
        }
    }

    /* JADX INFO: renamed from: l.p0d0$d */
    @Metadata(m87231d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m87232d2 = {"l/p0d0$d", "Ll/p0d0$b;", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C19095d extends C19093b {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f146587b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19095d(Act act) {
            super(false);
            this.f146587b = act;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m166966a(cwf0 cwf0Var) {
        i0e.m133796e(cwf0Var);
    }

    /* JADX INFO: renamed from: b */
    public static void m166967b(Act act) {
        zvf0.m220396r("e_choose_incentive_ad", "p_incentive_ad_choose_page");
        kkh0.INSTANCE.m146330a().m146328c().m150269b(act, "swipe", new C19094c(act));
    }

    /* JADX INFO: renamed from: c */
    public static void m166968c(Act act) {
        zvf0.m220396r("e_choose_incentive_ad", "p_incentive_ad_choose_page");
        kkh0.INSTANCE.m146330a().m146328c().m150269b(act, "swipe", new C19095d(act));
    }

    /* JADX INFO: renamed from: d */
    public static void m166969d(cwf0 cwf0Var) {
        i0e.m133796e(cwf0Var);
    }

    /* JADX INFO: renamed from: e */
    public static void m166970e(d30 d30Var) {
        zvf0.m220396r("e_choose_purchase_vas", "p_incentive_ad_choose_page");
        if (d30Var != null) {
            d30Var.call();
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final p0d0 m166973i() {
        return INSTANCE.m166981a();
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m166974k() {
        INSTANCE.m166982b();
    }

    /* JADX INFO: renamed from: h */
    public final int m166975h(@Nullable AdConfiguration adConfiguration) {
        AdReward adReward;
        AdScenes adScenes;
        AdRewardExt adRewardExt;
        if (adConfiguration == null || (adReward = adConfiguration.adReward) == null || (adScenes = adReward.swipe) == null || (adRewardExt = adScenes.ext) == null) {
            return 0;
        }
        return adRewardExt.swipeRewardCardCount;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m166976j(@Nullable AdConfiguration adConfiguration) {
        AdReward adReward;
        AdScenes adScenes;
        AdRewardExt adRewardExt;
        return (adConfiguration == null || (adReward = adConfiguration.adReward) == null || (adScenes = adReward.swipe) == null || (adRewardExt = adScenes.ext) == null || adRewardExt.swipeGuideStyle != 1) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m166977l(@Nullable AdConfiguration adConfiguration) {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m166978m(@NotNull final Act act, @NotNull String from) {
        act.getClass();
        from.getClass();
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_incentive_ad_choose_page", Dialog.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("purchaseShowFrom", from));
        int iM166975h = m166975h(jkh0.INSTANCE.m141877a().m141876c());
        new i0d0.C17448a(act).m133790q("观看广告多滑" + iM166975h + "张卡片").m133787n("观看视频广告，即可获得更多免费滑卡数量！").m133786m("看广告继续滑卡").m133789p(zz6.m221004u0() ? b3c0.f73034e : b3c0.f73026d).m133785l(new d30() { // from class: l.n0d0
            @Override // p149l.d30
            public final void call() {
                p0d0.m166967b(act);
            }
        }).m133788o(new d30() { // from class: l.o0d0
            @Override // p149l.d30
            public final void call() {
                p0d0.m166969d(cwf0VarM133794c);
            }
        }).m133791r();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: n */
    public final void m166979n(@NotNull final Act act, @NotNull String from, @Nullable final d30 cancelClickAction) {
        act.getClass();
        from.getClass();
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_incentive_ad_choose_page", Dialog.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("purchaseShowFrom", from));
        int iM166975h = m166975h(jkh0.INSTANCE.m141877a().m141876c());
        new i0d0.C17448a(act).m133790q("观看广告多滑" + iM166975h + "张卡片").m133787n("观看视频广告，即可获得更多免费滑卡数量！").m133786m("看广告继续滑卡").m133784k("会员解锁无限右滑").m133789p(zz6.m221004u0() ? b3c0.f73034e : b3c0.f73026d).m133785l(new d30() { // from class: l.k0d0
            @Override // p149l.d30
            public final void call() {
                p0d0.m166968c(act);
            }
        }).m133783j(new d30() { // from class: l.l0d0
            @Override // p149l.d30
            public final void call() {
                p0d0.m166970e(cancelClickAction);
            }
        }).m133788o(new d30() { // from class: l.m0d0
            @Override // p149l.d30
            public final void call() {
                p0d0.m166966a(cwf0VarM133794c);
            }
        }).m133791r();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getCanPollingRefresh() {
        return this.canPollingRefresh;
    }

    /* JADX INFO: renamed from: l.p0d0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\u0003R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Ll/p0d0$a;", "", "<init>", "()V", "Ll/p0d0;", "a", "()Ll/p0d0;", "", "b", "instance", "Ll/p0d0;", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final p0d0 m166981a() {
            p0d0 p0d0Var;
            p0d0 p0d0Var2 = p0d0.f146582c;
            if (p0d0Var2 != null) {
                return p0d0Var2;
            }
            synchronized (this) {
                p0d0Var = p0d0.f146582c;
                if (p0d0Var == null) {
                    p0d0Var = new p0d0();
                    p0d0.f146582c = p0d0Var;
                }
            }
            return p0d0Var;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m166982b() {
            p0d0.f146582c = null;
        }

        public Companion() {
        }
    }
}
