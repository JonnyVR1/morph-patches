package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreAudioMatch;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchManager;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchMatchUser;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.DropDownAct;
import com.p051p1.mobile.putong.data.UnlockConversationType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\tJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eJ\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m88121d2 = {"Ll/pee;", "Ll/ar2;", "Ll/mj2;", "Lcom/p1/mobile/putong/core/ui/quickaudio/DropDownAct;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/putong/core/ui/quickaudio/DropDownAct;)V", "", "Z", "()V", "a0", "t0", "", "E0", "()Z", "F0", "Lrx/c;", "Ll/uxj0;", "s0", "()Lrx/c;", "C0", "destroy", "a", "Lcom/p1/mobile/putong/core/ui/quickaudio/DropDownAct;", "getAct", "()Lcom/p1/mobile/putong/core/ui/quickaudio/DropDownAct;", "b", "D0", "setHideBotBtn", "(Z)V", "isHideBotBtn", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class pee extends ar2<mj2> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final DropDownAct act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean isHideBotBtn;

    /* JADX INFO: renamed from: l.pee$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C19356a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f152064a;

        static {
            int[] iArr = new int[CoreAudioMatch.AudioMatchStatus.values().length];
            try {
                iArr[CoreAudioMatch.AudioMatchStatus.MATCHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoreAudioMatch.AudioMatchStatus.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f152064a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pee(@NotNull DropDownAct dropDownAct) {
        super(dropDownAct);
        dropDownAct.getClass();
        this.act = dropDownAct;
    }

    /* JADX INFO: renamed from: f0 */
    public static void m171939f0(pee peeVar, Bundle bundle) {
        String stringExtra = peeVar.act.getIntent().getStringExtra(Active.TYPE);
        boolean booleanExtra = peeVar.act.getIntent().getBooleanExtra("hie_bot_btn", false);
        peeVar.isHideBotBtn = booleanExtra;
        ((mj2) peeVar.viewModel).mo149488n(!booleanExtra);
        if (TextUtils.equals(UnlockConversationType.quick_chat, stringExtra)) {
            ((mj2) peeVar.viewModel).mo149475e();
        } else if (TextUtils.equals("voice_quick_chat", stringExtra)) {
            ((mj2) peeVar.viewModel).mo149477f();
        } else if (TextUtils.equals("heart_beat_chat", stringExtra)) {
            ((mj2) peeVar.viewModel).mo149473d();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static void m171940g0(Throwable th) {
    }

    /* JADX INFO: renamed from: h0 */
    public static pf60 m171941h0(pf60 pf60Var, Pair pair) {
        return new pf60(pf60Var, pair);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public static void m171942i0(pee peeVar, pf60 pf60Var) {
        Object obj;
        pf60 pf60Var2 = (pf60) pf60Var.f152156a;
        if (Intrinsics.m88377d(pf60Var2 != null ? (String) pf60Var2.f152156a : null, "matching")) {
            mj2 mj2Var = (mj2) peeVar.viewModel;
            F f = pf60Var.f152156a;
            f.getClass();
            mj2Var.mo149493q((OnlineMatchManager.QuickChatProduce) ((pf60) f).f152157b);
        } else {
            Pair pair = (Pair) pf60Var.f152157b;
            if ((pair != null ? (CoreAudioMatch.AudioMatchStatus) pair.first : null) == CoreAudioMatch.AudioMatchStatus.SEARCHING) {
                ((mj2) peeVar.viewModel).mo149493q(OnlineMatchManager.QuickChatProduce.QuickAudioChat);
            } else {
                ((mj2) peeVar.viewModel).mo149471c();
            }
        }
        Pair pair2 = (Pair) pf60Var.f152157b;
        CoreAudioMatch.AudioMatchStatus audioMatchStatus = pair2 != null ? (CoreAudioMatch.AudioMatchStatus) pair2.first : null;
        int i = audioMatchStatus == null ? -1 : C19356a.f152064a[audioMatchStatus.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            Pair pair3 = (Pair) pf60Var.f152157b;
            if ((pair3 != null ? pair3.second : null) == CoreAudioMatch.AudioMatchError.TIMEOUT) {
                gs50.INSTANCE.m132001a().m131994I(peeVar.act, "match_timeout", true);
            }
            wyb0.INSTANCE.m208572f().m208562u0(CoreAudioMatch.AudioMatchStatus.IDLE, null);
            return;
        }
        Pair pair4 = (Pair) pf60Var.f152157b;
        if (pair4 == null || (obj = pair4.second) == null) {
            return;
        }
        wyb0.Companion companion = wyb0.INSTANCE;
        wyb0 wyb0VarM208572f = companion.m208572f();
        Act act = peeVar.act();
        act.getClass();
        wyb0VarM208572f.m208542M(act, (String) obj);
        companion.m208572f().m208562u0(CoreAudioMatch.AudioMatchStatus.IDLE, null);
    }

    /* JADX INFO: renamed from: j0 */
    public static C22421c m171943j0(uxj0 uxj0Var) {
        return CoreModule.f18264c.f20300D0.m35835H4();
    }

    /* JADX INFO: renamed from: n0 */
    public static C22421c m171947n0(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o0 */
    public static pf60 m171948o0(Function2 function2, Object obj, Object obj2) {
        return (pf60) function2.invoke(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    public static void m171949p0(final pee peeVar, pf60 pf60Var) {
        S s;
        String str = (String) pf60Var.f152156a;
        if (Intrinsics.m88377d(str, "match_timeout")) {
            gs50.INSTANCE.m132001a().m131993H(peeVar.act, "match_timeout");
            OnlineMatchManager.m51326z().f33442I.onNext(new pf60<>("notify_normal_state", null));
        } else {
            if (!Intrinsics.m88377d(str, "match_success") || (s = pf60Var.f152157b) == 0) {
                return;
            }
            final String str2 = ((OnlineMatchMatchUser) s).userId;
            C22421c c22421cDuringCreated = peeVar.act.duringCreated(CoreModule.f18264c.f20415p1.m31050r3(str2));
            final Function1 function1 = new Function1() { // from class: l.mee
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return pee.m171952u0(str2, (User) obj);
                }
            };
            c22421cDuringCreated.flatMap(new qcj() { // from class: l.nee
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return pee.m171953x0(function1, obj);
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.oee
                @Override // p153l.y20
                public final void call(Object obj) {
                    pee.m171954y0(this.f146982a, str2, (uxj0) obj);
                }
            }, new y20() { // from class: l.cee
                @Override // p153l.y20
                public final void call(Object obj) {
                    pee.m171937A0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static void m171951r0(Throwable th) {
    }

    /* JADX INFO: renamed from: u0 */
    public static final C22421c m171952u0(String str, User user) {
        return CoreModule.f18264c.f20384f0.m33905ap(str);
    }

    /* JADX INFO: renamed from: x0 */
    public static final C22421c m171953x0(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y0 */
    public static final void m171954y0(final pee peeVar, final String str, uxj0 uxj0Var) {
        l51.m152888H(peeVar.act, new Runnable() { // from class: l.fee
            @Override // java.lang.Runnable
            public final void run() {
                pee.m171955z0(this.f98656a, str);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: z0 */
    public static final void m171955z0(pee peeVar, String str) {
        Intent intentM50132q2 = MessagesAct.m50132q2(peeVar.act, str, false, false, false, false, null, 7, null);
        intentM50132q2.getClass();
        boolean zM171956C0 = peeVar.m171956C0();
        DropDownAct dropDownAct = peeVar.act;
        if (zM171956C0) {
            dropDownAct.startActivityForResult(intentM50132q2, 1911);
        } else {
            dropDownAct.startActivity(intentM50132q2);
        }
        OnlineMatchManager.m51326z().f33442I.onNext(new pf60<>("notify_normal_state", null));
        if (peeVar.m171956C0()) {
            return;
        }
        peeVar.act.finishWithoutCustomAnimation();
    }

    /* JADX INFO: renamed from: C0 */
    public final boolean m171956C0() {
        V v2 = this.viewModel;
        if (!(v2 instanceof kfe)) {
            return false;
        }
        v2.getClass();
        return ((kfe) v2).m149457N0();
    }

    /* JADX INFO: renamed from: D0, reason: from getter */
    public final boolean getIsHideBotBtn() {
        return this.isHideBotBtn;
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m171958E0() {
        return Intrinsics.m88377d(OnlineMatchManager.m51326z().m51329C(), "matching") || wyb0.INSTANCE.m208572f().m208543P() == CoreAudioMatch.AudioMatchStatus.SEARCHING;
    }

    /* JADX INFO: renamed from: F0 */
    public final boolean m171959F0() {
        if (C8772a.m51418S() > 0 && NullChecker.m82486a(CoreModule.f18264c.f20300D0.m35855o4())) {
            return Intrinsics.m88377d("on", CoreModule.f18264c.f20300D0.m35855o4().status);
        }
        return false;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        CoreModule.f18264c.f20297C0.m146425v4();
        C22421c<pf60<String, OnlineMatchManager.QuickChatProduce>> c22421cDistinctUntilChanged = OnlineMatchManager.m51326z().m51331E().distinctUntilChanged();
        C22421c<Pair<CoreAudioMatch.AudioMatchStatus, Object>> c22421cM208552b0 = wyb0.INSTANCE.m208572f().m208552b0();
        final Function2 function2 = new Function2() { // from class: l.bee
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return pee.m171941h0((pf60) obj, (Pair) obj2);
            }
        };
        duringCreated(psd0.m173625r(c22421cDistinctUntilChanged, c22421cM208552b0, new rcj() { // from class: l.gee
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return pee.m171948o0(function2, obj, obj2);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.hee
            @Override // p153l.y20
            public final void call(Object obj) {
                pee.m171942i0(this.f109144a, (pf60) obj);
            }
        }, new y20() { // from class: l.iee
            @Override // p153l.y20
            public final void call(Object obj) {
                pee.m171951r0((Throwable) obj);
            }
        }));
        duringCreated(OnlineMatchManager.m51326z().f33442I.distinctUntilChanged()).subscribe(psd0.m173597H(new y20() { // from class: l.jee
            @Override // p153l.y20
            public final void call(Object obj) {
                pee.m171949p0(this.f120481a, (pf60) obj);
            }
        }, new y20() { // from class: l.kee
            @Override // p153l.y20
            public final void call(Object obj) {
                pee.m171940g0((Throwable) obj);
            }
        }));
        m171961t0();
        creates(new y20() { // from class: l.lee
            @Override // p153l.y20
            public final void call(Object obj) {
                pee.m171939f0(this.f131729a, (Bundle) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: s0 */
    public final C22421c<uxj0> m171960s0() {
        String str;
        if (NullChecker.m82486a(CoreModule.f18264c.f20300D0.m35855o4())) {
            str = CoreModule.f18264c.f20300D0.m35855o4().status;
            str.getClass();
        } else {
            str = BLiveOperationTitleShowType.off;
        }
        C22421c<uxj0> c22421cM35853m4 = CoreModule.f18264c.f20300D0.m35853m4(!Intrinsics.m88377d("on", str));
        final Function1 function1 = new Function1() { // from class: l.dee
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return pee.m171943j0((uxj0) obj);
            }
        };
        C22421c c22421cDuringCreated = duringCreated((C22421c) c22421cM35853m4.flatMap(new qcj() { // from class: l.eee
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return pee.m171947n0(function1, obj);
            }
        }));
        c22421cDuringCreated.getClass();
        return c22421cDuringCreated;
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: t0 */
    public final void m171961t0() {
    }

    /* JADX INFO: renamed from: A0 */
    public static final void m171937A0(Throwable th) {
    }
}
