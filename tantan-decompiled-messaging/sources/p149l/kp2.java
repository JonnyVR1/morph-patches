package p149l;

import android.app.Application;
import android.text.TextUtils;
import com.immomo.momomediaext.utils.MMLiveUserConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.LoveBuzzData;
import com.p046p1.mobile.putong.core.data.LoveBuzzPushData;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.media.BuzzCallState;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.media.BuzzMediaCallManager;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\nJ\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\nJ\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\nJ\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\nJ\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\nR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 ¨\u0006$"}, m87232d2 = {"Ll/kp2;", "Ll/tg2;", "Ll/mcr;", "lifecycleProvider", "", "pageType", "<init>", "(Ll/mcr;Ljava/lang/String;)V", "", "H0", "()V", "Lcom/p1/mobile/putong/core/ui/lovebuzz/media/BuzzCallState;", "state", "", "f1", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/media/BuzzCallState;)Z", "Ll/j760;", "", "pair", "u0", "(Ll/j760;)V", "e1", "U0", "g1", "V0", "destroy", "Ll/c4g0;", "j", "Ll/c4g0;", "connectSub", "Ljava/util/concurrent/atomic/AtomicBoolean;", "k", "Ljava/util/concurrent/atomic/AtomicBoolean;", "inSearch", BLiveStormDanmakuGiftResourceType.f44444l, "sdkInit", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public abstract class kp2 extends tg2 {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public c4g0 connectSub;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public AtomicBoolean inSearch;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public AtomicBoolean sdkInit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp2(@NotNull mcr mcrVar, @NotNull String str) {
        super(mcrVar, str);
        mcrVar.getClass();
        str.getClass();
        this.inSearch = new AtomicBoolean(false);
        this.sdkInit = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: X0 */
    public static void m146804X0(kp2 kp2Var) {
        j760<String, Object> j760VarM111563G = ((dg2) kp2Var.viewModel).m111563G();
        if (j760VarM111563G != null) {
            kp2Var.mo136406u0(j760VarM111563G);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public static void m146805Y0(int i, kp2 kp2Var, Object obj) {
        Objects.toString(obj);
        if (!Intrinsics.m87488d(obj, 0)) {
            j8w.INSTANCE.m140473a().m140450i1(i + 1);
            return;
        }
        kp2Var.sdkInit.set(true);
        if (i > 0) {
            j8w.INSTANCE.m140473a().m140450i1(i - 1);
        }
        kp2Var.mo116417g1();
    }

    /* JADX INFO: renamed from: a1 */
    public static void m146806a1(String str, kp2 kp2Var, String str2, z3g0 z3g0Var) {
        BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
        MMLiveUserConfig mMLiveUserConfigM46941E = buzzMediaCallManager.m46941E(str, "");
        Application application = CoreModule.f17544b;
        application.getClass();
        buzzMediaCallManager.m46948L(mMLiveUserConfigM46941E, application, kp2Var.getPageType(), str2);
        z3g0Var.onNext(0);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: b1 */
    public static void m146807b1(kp2 kp2Var, BuzzCallState buzzCallState) {
        buzzCallState.getClass();
        if (!kp2Var.mo116416f1(buzzCallState)) {
            if (buzzCallState == BuzzCallState.LOCAL_JOINED_STATE) {
                kp2Var.m188790P0(true);
                return;
            }
            return;
        }
        qa2.INSTANCE.m173681a("BaseBuzzSearchPresenter", "initData " + buzzCallState);
        mkd0.m154992z(kp2Var.connectSub);
        kp2Var.m188791Q0(kp2Var.getSearchPageStatus() | 128);
        j8w.INSTANCE.m140473a().m140464s0(kp2Var.getPageType());
        kp2Var.mo116415e1();
    }

    /* JADX INFO: renamed from: c1 */
    public static void m146808c1(int i, Throwable th) {
        j8w.INSTANCE.m140473a().m140450i1(i + 1);
        Objects.toString(th);
    }

    /* JADX INFO: renamed from: d1 */
    public static void m146809d1(Throwable th) {
    }

    @Override // p149l.tg2
    /* JADX INFO: renamed from: H0 */
    public void mo146810H0() {
        C22306c c22306cDuringCreated;
        C22306c c22306cObserveOn;
        super.mo146810H0();
        Act act = act();
        this.connectSub = (act == null || (c22306cDuringCreated = act.duringCreated((C22306c) BuzzMediaCallManager.INSTANCE.m46990y(), false)) == null || (c22306cObserveOn = c22306cDuringCreated.observeOn(jo0.m142408a())) == null) ? null : c22306cObserveOn.subscribe(mkd0.m154955G(new e30() { // from class: l.ep2
            @Override // p149l.e30
            public final void call(Object obj) {
                kp2.m146807b1(this.f92530a, (BuzzCallState) obj);
            }
        }));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00f2  */
    @Override // p149l.tg2
    /* JADX INFO: renamed from: U0 */
    public void mo136403U0() {
        String str;
        c4g0 c4g0VarSubscribe;
        C22306c c22306cObserveOn;
        C22306c c22306cDoOnError;
        if (m188796t0()) {
            super.mo136403U0();
            m188793S0(mqi0.m155944o());
            j8w.Companion companion = j8w.INSTANCE;
            LoveBuzzData loveBuzzDataM140468v0 = companion.m140473a().m140468v0();
            String pageType = getPageType();
            final String str2 = "1";
            if (!Intrinsics.m87488d(pageType, "voiceBuzz") ? !Intrinsics.m87488d(pageType, "videoBuzz") || loveBuzzDataM140468v0 == null || (str = loveBuzzDataM140468v0.videoBuzzRTCVendor) == null : loveBuzzDataM140468v0 == null || (str = loveBuzzDataM140468v0.voiceBuzzRTCVendor) == null) {
                str = "1";
            }
            BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
            if (buzzMediaCallManager.m46990y().m221515e() != BuzzCallState.UN_INIT_STATE) {
                buzzMediaCallManager.m46963b0(getPageType());
                this.sdkInit.set(true);
                mo116417g1();
                return;
            }
            final int iM140418C0 = companion.m140473a().m140418C0();
            CoreModule.m29931H().userId();
            final String str3 = CoreModule.f17545c.f19639e0.m169527p9().publicId;
            str3.getClass();
            if (iM140418C0 <= 0 && !NullChecker.m81303a(((dg2) this.viewModel).m111563G())) {
                this.inSearch.set(true);
                companion.m140473a().m140447g1(getPageType());
            }
            if (!TextUtils.isEmpty(str) && !Intrinsics.m87488d("0", str)) {
                str2 = str;
            }
            Act act = act();
            if (act != null) {
                C22306c c22306cDuringCreated = act.duringCreated(C22306c.create(new C22306c.a() { // from class: l.fp2
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        kp2.m146806a1(str3, this, str2, (z3g0) obj);
                    }
                }).timeout(8L, TimeUnit.SECONDS, C22306c.just(400)).compose(mkd0.m154964P()));
                if (c22306cDuringCreated == null || (c22306cObserveOn = c22306cDuringCreated.observeOn(jo0.m142408a())) == null || (c22306cDoOnError = c22306cObserveOn.doOnError(new e30() { // from class: l.gp2
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        kp2.m146808c1(iM140418C0, (Throwable) obj);
                    }
                })) == null) {
                    c4g0VarSubscribe = null;
                } else {
                    c4g0VarSubscribe = c22306cDoOnError.subscribe(mkd0.m154956H(new e30() { // from class: l.hp2
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            kp2.m146805Y0(iM140418C0, this, obj);
                        }
                    }, new e30() { // from class: l.ip2
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            kp2.m146809d1((Throwable) obj);
                        }
                    }));
                }
            } else {
                c4g0VarSubscribe = null;
            }
            m188792R0(c4g0VarSubscribe);
        }
    }

    @Override // p149l.tg2
    /* JADX INFO: renamed from: V0 */
    public void mo136404V0() {
        super.mo136404V0();
        m188793S0(0L);
        this.inSearch.set(false);
        j8w.INSTANCE.m140473a().m140457n1(getPageType());
    }

    @Override // p149l.tg2, p149l.q0m
    public void destroy() {
        this.sdkInit.set(false);
        super.destroy();
        mkd0.m154992z(this.connectSub);
    }

    /* JADX INFO: renamed from: e1 */
    public void mo116415e1() {
        p9w p9wVar = p9w.INSTANCE;
        String pageType = getPageType();
        j8w.Companion companion = j8w.INSTANCE;
        p9wVar.m167927a0(pageType, companion.m140473a().m140417B0().getChannelToken(), C15167a.m87600f(System.currentTimeMillis() - getConnectTime(), 20000L));
        m188789L0();
        if (companion.m140473a().m140417B0().getStartTime() == 0) {
            companion.m140473a().m140417B0().m131190p(mqi0.m155944o());
        }
    }

    /* JADX INFO: renamed from: f1 */
    public abstract boolean mo116416f1(@NotNull BuzzCallState state);

    /* JADX INFO: renamed from: g1 */
    public void mo116417g1() {
        if (!NullChecker.m81303a(((dg2) this.viewModel).m111563G())) {
            if (this.inSearch.get()) {
                return;
            }
            this.inSearch.set(true);
            j8w.INSTANCE.m140473a().m140447g1(getPageType());
            return;
        }
        if (!m188788J0()) {
            mo136404V0();
            return;
        }
        ((dg2) this.viewModel).m111592k0();
        if (!Intrinsics.m87488d(getPageType(), "voiceBuzz")) {
            e51.m114743H(act(), new Runnable() { // from class: l.jp2
                @Override // java.lang.Runnable
                public final void run() {
                    kp2.m146804X0(this.f119049a);
                }
            }, 200L);
            return;
        }
        j760<String, Object> j760VarM111563G = ((dg2) this.viewModel).m111563G();
        if (j760VarM111563G != null) {
            mo136406u0(j760VarM111563G);
        }
    }

    @Override // p149l.tg2
    /* JADX INFO: renamed from: u0 */
    public void mo136406u0(@NotNull j760<String, Object> pair) {
        pair.getClass();
        if (this.sdkInit.get()) {
            super.mo136406u0(pair);
            j8w.Companion companion = j8w.INSTANCE;
            hhx hhxVarM140417B0 = companion.m140473a().m140417B0();
            Object obj = pair.f116565b;
            hhxVarM140417B0.m131192s(obj instanceof LoveBuzzPushData ? (LoveBuzzPushData) obj : null);
            p9w.INSTANCE.m167926Z(getPageType(), companion.m140473a().m140417B0().getChannelToken());
            Object obj2 = pair.f116565b;
            if (obj2 instanceof LoveBuzzPushData) {
                LoveBuzzPushData loveBuzzPushData = (LoveBuzzPushData) obj2;
                boolean zM87488d = Intrinsics.m87488d(loveBuzzPushData.mode, "passive");
                if (Intrinsics.m87488d(((dg2) this.viewModel).getModeType(), Active.TYPE) && zM87488d) {
                    companion.m140473a().m140437Z(loveBuzzPushData.channelToken, getPageType());
                }
                BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
                String strUserId = CoreModule.m29931H().userId();
                strUserId.getClass();
                int i = loveBuzzPushData.vendor;
                String str = loveBuzzPushData.channelToken;
                str.getClass();
                String str2 = loveBuzzPushData.channelKey;
                str2.getClass();
                String str3 = loveBuzzPushData.appId;
                str3.getClass();
                String str4 = loveBuzzPushData.vendor == 2 ? loveBuzzPushData.channelKey : "";
                str4.getClass();
                buzzMediaCallManager.m46986t(strUserId, i, str, str2, str3, str4);
            }
        }
    }
}
