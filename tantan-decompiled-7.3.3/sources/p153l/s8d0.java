package p153l;

import android.app.Dialog;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.AdConfiguration;
import com.p051p1.mobile.putong.data.AdReward;
import com.p051p1.mobile.putong.data.AdRewardExt;
import com.p051p1.mobile.putong.data.AdScenes;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 !2\u00020\u0001:\u0002\u001b\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, m88121d2 = {"Ll/s8d0;", "", "<init>", "()V", "Lcom/p1/mobile/putong/data/AdConfiguration;", "adConfiguration", "", BLiveStormDanmakuGiftResourceType.f45292l, "(Lcom/p1/mobile/putong/data/AdConfiguration;)Z", "j", "", "h", "(Lcom/p1/mobile/putong/data/AdConfiguration;)I", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "from", "Ll/x20;", "cancelClickAction", "", "n", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/x20;)V", "m", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "o", "()Z", "Ll/wyd0;", "a", "Ll/wyd0;", "swipeMaxTaskNum", "b", "Z", "canPollingRefresh", "Companion", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class s8d0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @Nullable
    public static volatile s8d0 f166808c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public wyd0 swipeMaxTaskNum = new wyd0("core_swipe_max_task_num_" + uqb0.f180397c0.userId(), "0,0");

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean canPollingRefresh;

    /* JADX INFO: renamed from: l.s8d0$b */
    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m88121d2 = {"Ll/s8d0$b;", "Ll/b5m;", "", "replay", "<init>", "(Z)V", "a", "Z", "getReplay", "()Z", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static class C20005b extends b5m {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final boolean replay;

        public C20005b(boolean z) {
            this.replay = z;
        }
    }

    /* JADX INFO: renamed from: l.s8d0$c */
    @Metadata(m88120d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m88121d2 = {"l/s8d0$c", "Ll/s8d0$b;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20006c extends C20005b {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f166812b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20006c(Act act) {
            super(false);
            this.f166812b = act;
        }
    }

    /* JADX INFO: renamed from: l.s8d0$d */
    @Metadata(m88120d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m88121d2 = {"l/s8d0$d", "Ll/s8d0$b;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20007d extends C20005b {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f166813b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20007d(Act act) {
            super(false);
            this.f166813b = act;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m185060a(l4g0 l4g0Var) {
        w1e.m204401e(l4g0Var);
    }

    /* JADX INFO: renamed from: b */
    public static void m185061b(Act act) {
        i4g0.m138520r("e_choose_incentive_ad", "p_incentive_ad_choose_page");
        rsh0.INSTANCE.m182979a().m182977c().m187711b(act, "swipe", new C20006c(act));
    }

    /* JADX INFO: renamed from: c */
    public static void m185062c(Act act) {
        i4g0.m138520r("e_choose_incentive_ad", "p_incentive_ad_choose_page");
        rsh0.INSTANCE.m182979a().m182977c().m187711b(act, "swipe", new C20007d(act));
    }

    /* JADX INFO: renamed from: d */
    public static void m185063d(l4g0 l4g0Var) {
        w1e.m204401e(l4g0Var);
    }

    /* JADX INFO: renamed from: e */
    public static void m185064e(x20 x20Var) {
        i4g0.m138520r("e_choose_purchase_vas", "p_incentive_ad_choose_page");
        if (x20Var != null) {
            x20Var.call();
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final s8d0 m185067i() {
        return INSTANCE.m185075a();
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m185068k() {
        INSTANCE.m185076b();
    }

    /* JADX INFO: renamed from: h */
    public final int m185069h(@Nullable AdConfiguration adConfiguration) {
        AdReward adReward;
        AdScenes adScenes;
        AdRewardExt adRewardExt;
        if (adConfiguration == null || (adReward = adConfiguration.adReward) == null || (adScenes = adReward.swipe) == null || (adRewardExt = adScenes.ext) == null) {
            return 0;
        }
        return adRewardExt.swipeRewardCardCount;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m185070j(@Nullable AdConfiguration adConfiguration) {
        AdReward adReward;
        AdScenes adScenes;
        AdRewardExt adRewardExt;
        return (adConfiguration == null || (adReward = adConfiguration.adReward) == null || (adScenes = adReward.swipe) == null || (adRewardExt = adScenes.ext) == null || adRewardExt.swipeGuideStyle != 1) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m185071l(@Nullable AdConfiguration adConfiguration) {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m185072m(@NotNull final Act act, @NotNull String from) {
        act.getClass();
        from.getClass();
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_incentive_ad_choose_page", Dialog.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("purchaseShowFrom", from));
        int iM185069h = m185069h(qsh0.INSTANCE.m177810a().m177809c());
        new l8d0.C18362a(act).m153200q("观看广告多滑" + iM185069h + "张卡片").m153197n("观看视频广告，即可获得更多免费滑卡数量！").m153196m("看广告继续滑卡").m153199p(c17.m107528u0() ? gbc0.f103285e : gbc0.f103277d).m153195l(new x20() { // from class: l.q8d0
            @Override // p153l.x20
            public final void call() {
                s8d0.m185061b(act);
            }
        }).m153198o(new x20() { // from class: l.r8d0
            @Override // p153l.x20
            public final void call() {
                s8d0.m185063d(l4g0VarM204399c);
            }
        }).m153201r();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: n */
    public final void m185073n(@NotNull final Act act, @NotNull String from, @Nullable final x20 cancelClickAction) {
        act.getClass();
        from.getClass();
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_incentive_ad_choose_page", Dialog.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("purchaseShowFrom", from));
        int iM185069h = m185069h(qsh0.INSTANCE.m177810a().m177809c());
        new l8d0.C18362a(act).m153200q("观看广告多滑" + iM185069h + "张卡片").m153197n("观看视频广告，即可获得更多免费滑卡数量！").m153196m("看广告继续滑卡").m153194k("会员解锁无限右滑").m153199p(c17.m107528u0() ? gbc0.f103285e : gbc0.f103277d).m153195l(new x20() { // from class: l.n8d0
            @Override // p153l.x20
            public final void call() {
                s8d0.m185062c(act);
            }
        }).m153193j(new x20() { // from class: l.o8d0
            @Override // p153l.x20
            public final void call() {
                s8d0.m185064e(cancelClickAction);
            }
        }).m153198o(new x20() { // from class: l.p8d0
            @Override // p153l.x20
            public final void call() {
                s8d0.m185060a(l4g0VarM204399c);
            }
        }).m153201r();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getCanPollingRefresh() {
        return this.canPollingRefresh;
    }

    /* JADX INFO: renamed from: l.s8d0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\u0003R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/s8d0$a;", "", "<init>", "()V", "Ll/s8d0;", "a", "()Ll/s8d0;", "", "b", "instance", "Ll/s8d0;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final s8d0 m185075a() {
            s8d0 s8d0Var;
            s8d0 s8d0Var2 = s8d0.f166808c;
            if (s8d0Var2 != null) {
                return s8d0Var2;
            }
            synchronized (this) {
                s8d0Var = s8d0.f166808c;
                if (s8d0Var == null) {
                    s8d0Var = new s8d0();
                    s8d0.f166808c = s8d0Var;
                }
            }
            return s8d0Var;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m185076b() {
            s8d0.f166808c = null;
        }

        public Companion() {
        }
    }
}
