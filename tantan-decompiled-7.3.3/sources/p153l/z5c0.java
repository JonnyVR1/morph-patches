package p153l;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreAudioMatch;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchManager;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchMatchUser;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.newquickchat.searchingPage.QuickChatSearchingAct;
import com.p051p1.mobile.putong.data.User;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Ll/z5c0;", "Ll/ar2;", "Ll/g6c0;", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/searchingPage/QuickChatSearchingAct;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/searchingPage/QuickChatSearchingAct;)V", "", "a0", "()V", "Z", "destroy", "Lcom/p1/mobile/android/app/Act;", "", "type", "y0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "z0", "a", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/searchingPage/QuickChatSearchingAct;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class z5c0 extends ar2<g6c0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final QuickChatSearchingAct act;

    /* JADX INFO: renamed from: l.z5c0$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C21766a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f203023a;

        static {
            int[] iArr = new int[CoreAudioMatch.AudioMatchStatus.values().length];
            try {
                iArr[CoreAudioMatch.AudioMatchStatus.MATCHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoreAudioMatch.AudioMatchStatus.SEARCHING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoreAudioMatch.AudioMatchStatus.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoreAudioMatch.AudioMatchStatus.IDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f203023a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5c0(@NotNull QuickChatSearchingAct quickChatSearchingAct) {
        super(quickChatSearchingAct);
        quickChatSearchingAct.getClass();
        this.act = quickChatSearchingAct;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m218636e0(Throwable th) {
    }

    /* JADX INFO: renamed from: g0 */
    public static pf60 m218638g0(pf60 pf60Var, Pair pair) {
        return new pf60(pf60Var, pair);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    public static void m218639h0(final z5c0 z5c0Var, pf60 pf60Var) {
        S s;
        String str = (String) pf60Var.f152156a;
        if (Intrinsics.m88377d(str, "match_timeout")) {
            gs50.INSTANCE.m132001a().m131993H(z5c0Var.act, "match_timeout");
            OnlineMatchManager.m51326z().f33442I.m137019l(new pf60<>("notify_normal_state", null));
            ((g6c0) z5c0Var.viewModel).m129243z();
        } else {
            if (!Intrinsics.m88377d(str, "match_success") || (s = pf60Var.f152157b) == 0) {
                return;
            }
            final String str2 = ((OnlineMatchMatchUser) s).userId;
            C22421c c22421cDuringCreated = z5c0Var.act.duringCreated(CoreModule.f18264c.f20415p1.m31050r3(str2));
            final Function1 function1 = new Function1() { // from class: l.v5c0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return z5c0.m218649r0(str2, (User) obj);
                }
            };
            c22421cDuringCreated.flatMap(new qcj() { // from class: l.w5c0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return z5c0.m218650s0(function1, obj);
                }
            }).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.x5c0
                @Override // p153l.y20
                public final void call(Object obj) {
                    z5c0.m218651t0(this.f192471a, str2, (uxj0) obj);
                }
            }, new y20() { // from class: l.y5c0
                @Override // p153l.y20
                public final void call(Object obj) {
                    z5c0.m218653x0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public static void m218640i0(z5c0 z5c0Var, pf60 pf60Var) {
        Object obj;
        if (TextUtils.equals(z5c0Var.act.getCom.p1.mobile.putong.core.data.Active.TYPE java.lang.String(), "voice_quick_chat")) {
            Pair pair = (Pair) pf60Var.f152157b;
            CoreAudioMatch.AudioMatchStatus audioMatchStatus = pair != null ? (CoreAudioMatch.AudioMatchStatus) pair.first : null;
            int i = audioMatchStatus == null ? -1 : C21766a.f203023a[audioMatchStatus.ordinal()];
            if (i == 1) {
                Pair pair2 = (Pair) pf60Var.f152157b;
                if (pair2 != null && (obj = pair2.second) != null) {
                    wyb0.Companion companion = wyb0.INSTANCE;
                    companion.m208572f().m208542M(z5c0Var.act, (String) obj);
                    companion.m208572f().m208562u0(CoreAudioMatch.AudioMatchStatus.IDLE, null);
                }
            } else if (i == 2) {
                ((g6c0) z5c0Var.viewModel).m129226A();
            } else if (i == 3) {
                Pair pair3 = (Pair) pf60Var.f152157b;
                if ((pair3 != null ? pair3.second : null) == CoreAudioMatch.AudioMatchError.TIMEOUT) {
                    gs50.INSTANCE.m132001a().m131994I(z5c0Var.act, "match_timeout", true);
                }
                wyb0.INSTANCE.m208572f().m208562u0(CoreAudioMatch.AudioMatchStatus.IDLE, null);
                ((g6c0) z5c0Var.viewModel).m129243z();
            } else if (i == 4) {
                ((g6c0) z5c0Var.viewModel).m129243z();
            }
        }
        if (TextUtils.equals(z5c0Var.act.getCom.p1.mobile.putong.core.data.Active.TYPE java.lang.String(), "text_quick_chat")) {
            pf60 pf60Var2 = (pf60) pf60Var.f152156a;
            String str = pf60Var2 != null ? (String) pf60Var2.f152156a : null;
            if (Intrinsics.m88377d(str, "default")) {
                ((g6c0) z5c0Var.viewModel).m129243z();
            } else if (Intrinsics.m88377d(str, "matching")) {
                ((g6c0) z5c0Var.viewModel).m129226A();
            }
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static void m218645n0(Throwable th) {
    }

    /* JADX INFO: renamed from: o0 */
    public static Unit m218646o0(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p0 */
    public static void m218647p0(Boolean bool) {
        CoreModule.f18264c.f20312H0.m155449k5();
    }

    /* JADX INFO: renamed from: q0 */
    public static pf60 m218648q0(Function2 function2, Object obj, Object obj2) {
        return (pf60) function2.invoke(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C22421c m218649r0(String str, User user) {
        return CoreModule.f18264c.f20384f0.m33905ap(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C22421c m218650s0(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t0 */
    public static final void m218651t0(final z5c0 z5c0Var, final String str, uxj0 uxj0Var) {
        l51.m152888H(z5c0Var.act, new Runnable() { // from class: l.p5c0
            @Override // java.lang.Runnable
            public final void run() {
                z5c0.m218652u0(this.f150633a, str);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: u0 */
    public static final void m218652u0(z5c0 z5c0Var, String str) {
        Intent intentM50132q2 = MessagesAct.m50132q2(z5c0Var.act, str, false, false, false, false, null, 7, null);
        intentM50132q2.getClass();
        z5c0Var.act.startActivity(intentM50132q2);
        OnlineMatchManager.m51326z().f33442I.m137019l(new pf60<>("notify_normal_state", null));
        z5c0Var.act.m68056e2();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        CoreModule.f18264c.f20297C0.m146425v4();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        C22421c<pf60<String, OnlineMatchManager.QuickChatProduce>> c22421cDistinctUntilChanged = OnlineMatchManager.m51326z().m51331E().distinctUntilChanged();
        C22421c<Pair<CoreAudioMatch.AudioMatchStatus, Object>> c22421cM208552b0 = wyb0.INSTANCE.m208572f().m208552b0();
        final Function2 function2 = new Function2() { // from class: l.m5c0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return z5c0.m218638g0((pf60) obj, (Pair) obj2);
            }
        };
        duringCreated(psd0.m173625r(c22421cDistinctUntilChanged, c22421cM208552b0, new rcj() { // from class: l.q5c0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return z5c0.m218648q0(function2, obj, obj2);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.r5c0
            @Override // p153l.y20
            public final void call(Object obj) {
                z5c0.m218640i0(this.f161337a, (pf60) obj);
            }
        }, new y20() { // from class: l.s5c0
            @Override // p153l.y20
            public final void call(Object obj) {
                z5c0.m218645n0((Throwable) obj);
            }
        }));
        duringCreated(OnlineMatchManager.m51326z().f33442I.distinctUntilChanged()).subscribe(psd0.m173597H(new y20() { // from class: l.t5c0
            @Override // p153l.y20
            public final void call(Object obj) {
                z5c0.m218639h0(this.f172193a, (pf60) obj);
            }
        }, new y20() { // from class: l.u5c0
            @Override // p153l.y20
            public final void call(Object obj) {
                z5c0.m218636e0((Throwable) obj);
            }
        }));
        m218655z0();
    }

    /* JADX INFO: renamed from: y0 */
    public final void m218654y0(@NotNull Act act, @NotNull String type) {
        act.getClass();
        type.getClass();
        if (Intrinsics.m88377d(type, "text_quick_chat")) {
            OnlineMatchManager.m51326z().m51373u0(act, new y20() { // from class: l.n5c0
                @Override // p153l.y20
                public final void call(Object obj) {
                    z5c0.m218647p0((Boolean) obj);
                }
            });
        } else if (Intrinsics.m88377d(type, "voice_quick_chat")) {
            wyb0.m208486B0(wyb0.INSTANCE.m208572f(), act, false, false, new Function1() { // from class: l.o5c0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return z5c0.m218646o0(((Boolean) obj).booleanValue());
                }
            }, 6, null);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m218655z0() {
        if (a6c0.m96321a()) {
            return;
        }
        QuickChatSearchingAct quickChatSearchingAct = this.act;
        m218654y0(quickChatSearchingAct, quickChatSearchingAct.getCom.p1.mobile.putong.core.data.Active.TYPE java.lang.String());
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final void m218653x0(Throwable th) {
    }
}
