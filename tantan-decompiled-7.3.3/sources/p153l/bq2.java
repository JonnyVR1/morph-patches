package p153l;

import android.app.Application;
import android.text.TextUtils;
import com.immomo.momomediaext.utils.MMLiveUserConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.LoveBuzzData;
import com.p051p1.mobile.putong.core.data.LoveBuzzPushData;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.media.BuzzCallState;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.media.BuzzMediaCallManager;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\nJ\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\nJ\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\nJ\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\nJ\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\nR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 ¨\u0006$"}, m88121d2 = {"Ll/bq2;", "Ll/ah2;", "Ll/ner;", "lifecycleProvider", "", "pageType", "<init>", "(Ll/ner;Ljava/lang/String;)V", "", "H0", "()V", "Lcom/p1/mobile/putong/core/ui/lovebuzz/media/BuzzCallState;", "state", "", "f1", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/media/BuzzCallState;)Z", "Ll/pf60;", "", "pair", "u0", "(Ll/pf60;)V", "e1", "U0", "g1", "V0", "destroy", "Ll/kcg0;", "j", "Ll/kcg0;", "connectSub", "Ljava/util/concurrent/atomic/AtomicBoolean;", "k", "Ljava/util/concurrent/atomic/AtomicBoolean;", "inSearch", BLiveStormDanmakuGiftResourceType.f45292l, "sdkInit", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public abstract class bq2 extends ah2 {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public kcg0 connectSub;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public AtomicBoolean inSearch;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public AtomicBoolean sdkInit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq2(@NotNull ner nerVar, @NotNull String str) {
        super(nerVar, str);
        nerVar.getClass();
        str.getClass();
        this.inSearch = new AtomicBoolean(false);
        this.sdkInit = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: X0 */
    public static void m105869X0(bq2 bq2Var) {
        pf60<String, Object> pf60VarM149696G = ((kg2) bq2Var.viewModel).m149696G();
        if (pf60VarM149696G != null) {
            bq2Var.mo97771u0(pf60VarM149696G);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public static void m105870Y0(int i, bq2 bq2Var, Object obj) {
        Objects.toString(obj);
        if (!Intrinsics.m88377d(obj, 0)) {
            haw.INSTANCE.m134320a().m134297i1(i + 1);
            return;
        }
        bq2Var.sdkInit.set(true);
        if (i > 0) {
            haw.INSTANCE.m134320a().m134297i1(i - 1);
        }
        bq2Var.mo105861g1();
    }

    /* JADX INFO: renamed from: a1 */
    public static void m105871a1(String str, bq2 bq2Var, String str2, gcg0 gcg0Var) {
        BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
        MMLiveUserConfig mMLiveUserConfigM48124E = buzzMediaCallManager.m48124E(str, "");
        Application application = CoreModule.f18263b;
        application.getClass();
        buzzMediaCallManager.m48131L(mMLiveUserConfigM48124E, application, bq2Var.getPageType(), str2);
        gcg0Var.onNext(0);
        gcg0Var.onCompleted();
    }

    /* JADX INFO: renamed from: b1 */
    public static void m105872b1(bq2 bq2Var, BuzzCallState buzzCallState) {
        buzzCallState.getClass();
        if (!bq2Var.mo105860f1(buzzCallState)) {
            if (buzzCallState == BuzzCallState.LOCAL_JOINED_STATE) {
                bq2Var.m97762P0(true);
                return;
            }
            return;
        }
        xa2.INSTANCE.m209830a("BaseBuzzSearchPresenter", "initData " + buzzCallState);
        psd0.m173633z(bq2Var.connectSub);
        bq2Var.m97763Q0(bq2Var.getSearchPageStatus() | 128);
        haw.INSTANCE.m134320a().m134311s0(bq2Var.getPageType());
        bq2Var.mo105859e1();
    }

    /* JADX INFO: renamed from: c1 */
    public static void m105873c1(int i, Throwable th) {
        haw.INSTANCE.m134320a().m134297i1(i + 1);
        Objects.toString(th);
    }

    /* JADX INFO: renamed from: d1 */
    public static void m105874d1(Throwable th) {
    }

    @Override // p153l.ah2
    /* JADX INFO: renamed from: H0 */
    public void mo97758H0() {
        C22421c c22421cDuringCreated;
        C22421c c22421cObserveOn;
        super.mo97758H0();
        Act act = act();
        this.connectSub = (act == null || (c22421cDuringCreated = act.duringCreated((C22421c) BuzzMediaCallManager.INSTANCE.m48173y(), false)) == null || (c22421cObserveOn = c22421cDuringCreated.observeOn(fo0.m126432a())) == null) ? null : c22421cObserveOn.subscribe(psd0.m173596G(new y20() { // from class: l.vp2
            @Override // p153l.y20
            public final void call(Object obj) {
                bq2.m105872b1(this.f185206a, (BuzzCallState) obj);
            }
        }));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00f2  */
    @Override // p153l.ah2
    /* JADX INFO: renamed from: U0 */
    public void mo97766U0() {
        String str;
        kcg0 kcg0VarSubscribe;
        C22421c c22421cObserveOn;
        C22421c c22421cDoOnError;
        if (m97770t0()) {
            super.mo97766U0();
            m97765S0(pzi0.m174454o());
            haw.Companion companion = haw.INSTANCE;
            LoveBuzzData loveBuzzDataM134315v0 = companion.m134320a().m134315v0();
            String pageType = getPageType();
            final String str2 = "1";
            if (!Intrinsics.m88377d(pageType, "voiceBuzz") ? !Intrinsics.m88377d(pageType, "videoBuzz") || loveBuzzDataM134315v0 == null || (str = loveBuzzDataM134315v0.videoBuzzRTCVendor) == null : loveBuzzDataM134315v0 == null || (str = loveBuzzDataM134315v0.voiceBuzzRTCVendor) == null) {
                str = "1";
            }
            BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
            if (buzzMediaCallManager.m48173y().m222761e() != BuzzCallState.UN_INIT_STATE) {
                buzzMediaCallManager.m48146b0(getPageType());
                this.sdkInit.set(true);
                mo105861g1();
                return;
            }
            final int iM134265C0 = companion.m134320a().m134265C0();
            CoreModule.m30929H().userId();
            final String str3 = CoreModule.f18264c.f20381e0.m116600p9().publicId;
            str3.getClass();
            if (iM134265C0 <= 0 && !NullChecker.m82486a(((kg2) this.viewModel).m149696G())) {
                this.inSearch.set(true);
                companion.m134320a().m134294g1(getPageType());
            }
            if (!TextUtils.isEmpty(str) && !Intrinsics.m88377d("0", str)) {
                str2 = str;
            }
            Act act = act();
            if (act != null) {
                C22421c c22421cDuringCreated = act.duringCreated(C22421c.create(new C22421c.a() { // from class: l.wp2
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        bq2.m105871a1(str3, this, str2, (gcg0) obj);
                    }
                }).timeout(8L, TimeUnit.SECONDS, C22421c.just(400)).compose(psd0.m173605P()));
                if (c22421cDuringCreated == null || (c22421cObserveOn = c22421cDuringCreated.observeOn(fo0.m126432a())) == null || (c22421cDoOnError = c22421cObserveOn.doOnError(new y20() { // from class: l.xp2
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        bq2.m105873c1(iM134265C0, (Throwable) obj);
                    }
                })) == null) {
                    kcg0VarSubscribe = null;
                } else {
                    kcg0VarSubscribe = c22421cDoOnError.subscribe(psd0.m173597H(new y20() { // from class: l.yp2
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            bq2.m105870Y0(iM134265C0, this, obj);
                        }
                    }, new y20() { // from class: l.zp2
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            bq2.m105874d1((Throwable) obj);
                        }
                    }));
                }
            } else {
                kcg0VarSubscribe = null;
            }
            m97764R0(kcg0VarSubscribe);
        }
    }

    @Override // p153l.ah2
    /* JADX INFO: renamed from: V0 */
    public void mo97767V0() {
        super.mo97767V0();
        m97765S0(0L);
        this.inSearch.set(false);
        haw.INSTANCE.m134320a().m134304n1(getPageType());
    }

    @Override // p153l.ah2, p153l.k3m
    public void destroy() {
        this.sdkInit.set(false);
        super.destroy();
        psd0.m173633z(this.connectSub);
    }

    /* JADX INFO: renamed from: e1 */
    public void mo105859e1() {
        nbw nbwVar = nbw.INSTANCE;
        String pageType = getPageType();
        haw.Companion companion = haw.INSTANCE;
        nbwVar.m162231a0(pageType, companion.m134320a().m134264B0().getChannelToken(), C15274a.m88490f(System.currentTimeMillis() - getConnectTime(), 20000L));
        m97761L0();
        if (companion.m134320a().m134264B0().getStartTime() == 0) {
            companion.m134320a().m134264B0().m122087p(pzi0.m174454o());
        }
    }

    /* JADX INFO: renamed from: f1 */
    public abstract boolean mo105860f1(@NotNull BuzzCallState state);

    /* JADX INFO: renamed from: g1 */
    public void mo105861g1() {
        if (!NullChecker.m82486a(((kg2) this.viewModel).m149696G())) {
            if (this.inSearch.get()) {
                return;
            }
            this.inSearch.set(true);
            haw.INSTANCE.m134320a().m134294g1(getPageType());
            return;
        }
        if (!m97760J0()) {
            mo97767V0();
            return;
        }
        ((kg2) this.viewModel).m149721k0();
        if (!Intrinsics.m88377d(getPageType(), "voiceBuzz")) {
            l51.m152888H(act(), new Runnable() { // from class: l.aq2
                @Override // java.lang.Runnable
                public final void run() {
                    bq2.m105869X0(this.f72781a);
                }
            }, 200L);
            return;
        }
        pf60<String, Object> pf60VarM149696G = ((kg2) this.viewModel).m149696G();
        if (pf60VarM149696G != null) {
            mo97771u0(pf60VarM149696G);
        }
    }

    @Override // p153l.ah2
    /* JADX INFO: renamed from: u0 */
    public void mo97771u0(@NotNull pf60<String, Object> pair) {
        pair.getClass();
        if (this.sdkInit.get()) {
            super.mo97771u0(pair);
            haw.Companion companion = haw.INSTANCE;
            eqx eqxVarM134264B0 = companion.m134320a().m134264B0();
            Object obj = pair.f152157b;
            eqxVarM134264B0.m122089s(obj instanceof LoveBuzzPushData ? (LoveBuzzPushData) obj : null);
            nbw.INSTANCE.m162230Z(getPageType(), companion.m134320a().m134264B0().getChannelToken());
            Object obj2 = pair.f152157b;
            if (obj2 instanceof LoveBuzzPushData) {
                LoveBuzzPushData loveBuzzPushData = (LoveBuzzPushData) obj2;
                boolean zM88377d = Intrinsics.m88377d(loveBuzzPushData.mode, "passive");
                if (Intrinsics.m88377d(((kg2) this.viewModel).getModeType(), Active.TYPE) && zM88377d) {
                    companion.m134320a().m134284Z(loveBuzzPushData.channelToken, getPageType());
                }
                BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
                String strUserId = CoreModule.m30929H().userId();
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
                buzzMediaCallManager.m48169t(strUserId, i, str, str2, str3, str4);
            }
        }
    }
}
