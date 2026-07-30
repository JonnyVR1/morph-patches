package p006l;

import android.app.Dialog;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.AdConfiguration;
import com.p1.mobile.putong.data.AdReward;
import com.p1.mobile.putong.data.AdRewardExt;
import com.p1.mobile.putong.data.AdScenes;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import l.b3c0;
import l.cwf0;
import l.d30;
import l.i0e;
import l.j760;
import l.uqd0;
import l.vwb;
import l.zvf0;
import l.zz6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 !2\u00020\u0001:\u0002\u001b\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Ll/p0d0;", "", "<init>", "()V", "Lcom/p1/mobile/putong/data/AdConfiguration;", "adConfiguration", "", "l", "(Lcom/p1/mobile/putong/data/AdConfiguration;)Z", "j", "", "h", "(Lcom/p1/mobile/putong/data/AdConfiguration;)I", "Lcom/p1/mobile/android/app/Act;", "act", "", "from", "Ll/d30;", "cancelClickAction", "", "n", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/d30;)V", "m", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "o", "()Z", "Ll/uqd0;", "a", "Ll/uqd0;", "swipeMaxTaskNum", "b", "Z", "canPollingRefresh", "Companion", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p0d0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @Nullable
    public static volatile p0d0 f18534c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public uqd0 swipeMaxTaskNum = new uqd0("core_swipe_max_task_num_" + qib0.f19805c0.userId(), "0,0");

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean canPollingRefresh;

    /* JADX INFO: renamed from: l.p0d0$b */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ll/p0d0$b;", "Ll/i2m;", "", "replay", "<init>", "(Z)V", "a", "Z", "getReplay", "()Z", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static class C1114b extends i2m {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final boolean replay;

        public C1114b(boolean z) {
            this.replay = z;
        }
    }

    /* JADX INFO: renamed from: l.p0d0$c */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"l/p0d0$c", "Ll/p0d0$b;", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1115c extends C1114b {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f18538b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1115c(Act act) {
            super(false);
            this.f18538b = act;
        }
    }

    /* JADX INFO: renamed from: l.p0d0$d */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"l/p0d0$d", "Ll/p0d0$b;", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1116d extends C1114b {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f18539b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1116d(Act act) {
            super(false);
            this.f18539b = act;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m20990a(cwf0 cwf0Var) {
        i0e.e(cwf0Var);
    }

    /* JADX INFO: renamed from: b */
    public static void m20991b(Act act) {
        zvf0.r("e_choose_incentive_ad", "p_incentive_ad_choose_page");
        kkh0.INSTANCE.m18157a().m18155c().m18852b(act, "swipe", new C1115c(act));
    }

    /* JADX INFO: renamed from: c */
    public static void m20992c(Act act) {
        zvf0.r("e_choose_incentive_ad", "p_incentive_ad_choose_page");
        kkh0.INSTANCE.m18157a().m18155c().m18852b(act, "swipe", new C1116d(act));
    }

    /* JADX INFO: renamed from: d */
    public static void m20993d(cwf0 cwf0Var) {
        i0e.e(cwf0Var);
    }

    /* JADX INFO: renamed from: e */
    public static void m20994e(d30 d30Var) {
        zvf0.r("e_choose_purchase_vas", "p_incentive_ad_choose_page");
        if (d30Var != null) {
            d30Var.call();
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final p0d0 m20997i() {
        return INSTANCE.m21005a();
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m20998k() {
        INSTANCE.m21006b();
    }

    /* JADX INFO: renamed from: h */
    public final int m20999h(@Nullable AdConfiguration adConfiguration) {
        AdReward adReward;
        AdScenes adScenes;
        AdRewardExt adRewardExt;
        if (adConfiguration == null || (adReward = adConfiguration.adReward) == null || (adScenes = adReward.swipe) == null || (adRewardExt = adScenes.ext) == null) {
            return 0;
        }
        return adRewardExt.swipeRewardCardCount;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m21000j(@Nullable AdConfiguration adConfiguration) {
        AdReward adReward;
        AdScenes adScenes;
        AdRewardExt adRewardExt;
        return (adConfiguration == null || (adReward = adConfiguration.adReward) == null || (adScenes = adReward.swipe) == null || (adRewardExt = adScenes.ext) == null || adRewardExt.swipeGuideStyle != 1) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m21001l(@Nullable AdConfiguration adConfiguration) {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m21002m(@NotNull final Act act, @NotNull String from) {
        act.getClass();
        from.getClass();
        final cwf0 cwf0VarC = i0e.c("p_incentive_ad_choose_page", Dialog.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("purchaseShowFrom", from)});
        int iM20999h = m20999h(jkh0.INSTANCE.m17526a().m17525c());
        new i0d0.C0825a(act).m16450q("观看广告多滑" + iM20999h + "张卡片").m16447n("观看视频广告，即可获得更多免费滑卡数量！").m16446m("看广告继续滑卡").m16449p(zz6.u0() ? b3c0.e : b3c0.d).m16445l(new d30() { // from class: l.n0d0
            public final void call() {
                p0d0.m20991b(act);
            }
        }).m16448o(new d30() { // from class: l.o0d0
            public final void call() {
                p0d0.m20993d(cwf0VarC);
            }
        }).m16451r();
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: n */
    public final void m21003n(@NotNull final Act act, @NotNull String from, @Nullable final d30 cancelClickAction) {
        act.getClass();
        from.getClass();
        final cwf0 cwf0VarC = i0e.c("p_incentive_ad_choose_page", Dialog.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("purchaseShowFrom", from)});
        int iM20999h = m20999h(jkh0.INSTANCE.m17526a().m17525c());
        new i0d0.C0825a(act).m16450q("观看广告多滑" + iM20999h + "张卡片").m16447n("观看视频广告，即可获得更多免费滑卡数量！").m16446m("看广告继续滑卡").m16444k("会员解锁无限右滑").m16449p(zz6.u0() ? b3c0.e : b3c0.d).m16445l(new d30() { // from class: l.k0d0
            public final void call() {
                p0d0.m20992c(act);
            }
        }).m16443j(new d30() { // from class: l.l0d0
            public final void call() {
                p0d0.m20994e(cancelClickAction);
            }
        }).m16448o(new d30() { // from class: l.m0d0
            public final void call() {
                p0d0.m20990a(cwf0VarC);
            }
        }).m16451r();
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getCanPollingRefresh() {
        return this.canPollingRefresh;
    }

    /* JADX INFO: renamed from: l.p0d0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\u0003R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ll/p0d0$a;", "", "<init>", "()V", "Ll/p0d0;", "a", "()Ll/p0d0;", "", "b", "instance", "Ll/p0d0;", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final p0d0 m21005a() {
            p0d0 p0d0Var;
            p0d0 p0d0Var2 = p0d0.f18534c;
            if (p0d0Var2 != null) {
                return p0d0Var2;
            }
            synchronized (this) {
                p0d0Var = p0d0.f18534c;
                if (p0d0Var == null) {
                    p0d0Var = new p0d0();
                    p0d0.f18534c = p0d0Var;
                }
            }
            return p0d0Var;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m21006b() {
            p0d0.f18534c = null;
        }

        public Companion() {
        }
    }
}
