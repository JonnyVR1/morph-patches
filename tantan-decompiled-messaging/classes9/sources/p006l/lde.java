package p006l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreAudioMatch;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.DropDownAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchManager;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchMatchUser;
import com.p1.mobile.putong.core.ui.onlinematch.a;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l.ak50;
import l.e30;
import l.e51;
import l.j760;
import l.jq2;
import l.mkd0;
import l.roj0;
import l.s7m;
import l.w9j;
import l.x9j;
import org.jetbrains.annotations.NotNull;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\tJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eJ\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Ll/lde;", "Ll/jq2;", "Ll/ej2;", "Lcom/p1/mobile/putong/core/ui/quickaudio/DropDownAct;", "act", "<init>", "(Lcom/p1/mobile/putong/core/ui/quickaudio/DropDownAct;)V", "", "Z", "()V", "a0", "t0", "", "E0", "()Z", "F0", "Lrx/c;", "Ll/roj0;", "s0", "()Lrx/c;", "C0", "destroy", "a", "Lcom/p1/mobile/putong/core/ui/quickaudio/DropDownAct;", "getAct", "()Lcom/p1/mobile/putong/core/ui/quickaudio/DropDownAct;", "b", "D0", "setHideBotBtn", "(Z)V", "isHideBotBtn", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class lde extends jq2<ej2> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final DropDownAct act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean isHideBotBtn;

    /* JADX INFO: renamed from: l.lde$a */
    @Metadata(k = CameraSticker.STATE_COMPLETE, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0970a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16340a;

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
            f16340a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lde(@NotNull DropDownAct dropDownAct) {
        super(dropDownAct);
        dropDownAct.getClass();
        this.act = dropDownAct;
    }

    /* JADX INFO: renamed from: f0 */
    public static void m18661f0(lde ldeVar, Bundle bundle) {
        String stringExtra = ldeVar.act.getIntent().getStringExtra("active");
        boolean booleanExtra = ldeVar.act.getIntent().getBooleanExtra("hie_bot_btn", false);
        ldeVar.isHideBotBtn = booleanExtra;
        ((ej2) ((jq2) ldeVar).viewModel).mo14566n(!booleanExtra);
        if (TextUtils.equals("quick_chat", stringExtra)) {
            ((ej2) ((jq2) ldeVar).viewModel).mo14559e();
        } else if (TextUtils.equals("voice_quick_chat", stringExtra)) {
            ((ej2) ((jq2) ldeVar).viewModel).mo14560f();
        } else if (TextUtils.equals("heart_beat_chat", stringExtra)) {
            ((ej2) ((jq2) ldeVar).viewModel).mo14558d();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static void m18662g0(Throwable th) {
    }

    /* JADX INFO: renamed from: h0 */
    public static j760 m18663h0(j760 j760Var, Pair pair) {
        return new j760(j760Var, pair);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m18664i0(lde ldeVar, j760 j760Var) {
        Object obj;
        j760 j760Var2 = (j760) j760Var.a;
        if (Intrinsics.d(j760Var2 != null ? (String) j760Var2.a : null, "matching")) {
            ej2 ej2Var = (ej2) ((jq2) ldeVar).viewModel;
            Object obj2 = j760Var.a;
            obj2.getClass();
            ej2Var.mo14568q((OnlineMatchManager.QuickChatProduce) ((j760) obj2).b);
        } else {
            Pair pair = (Pair) j760Var.b;
            if ((pair != null ? (CoreAudioMatch.AudioMatchStatus) pair.first : null) == CoreAudioMatch.AudioMatchStatus.SEARCHING) {
                ((ej2) ((jq2) ldeVar).viewModel).mo14568q(OnlineMatchManager.QuickChatProduce.QuickAudioChat);
            } else {
                ((ej2) ((jq2) ldeVar).viewModel).mo14557c();
            }
        }
        Pair pair2 = (Pair) j760Var.b;
        CoreAudioMatch.AudioMatchStatus audioMatchStatus = pair2 != null ? (CoreAudioMatch.AudioMatchStatus) pair2.first : null;
        int i = audioMatchStatus == null ? -1 : C0970a.f16340a[audioMatchStatus.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            Pair pair3 = (Pair) j760Var.b;
            if ((pair3 != null ? pair3.second : null) == CoreAudioMatch.AudioMatchError.TIMEOUT) {
                ak50.Companion.a().I(ldeVar.act, "match_timeout", true);
            }
            sqb0.INSTANCE.m24115f().m24105u0(CoreAudioMatch.AudioMatchStatus.IDLE, null);
            return;
        }
        Pair pair4 = (Pair) j760Var.b;
        if (pair4 == null || (obj = pair4.second) == null) {
            return;
        }
        sqb0.Companion companion = sqb0.INSTANCE;
        sqb0 sqb0VarM24115f = companion.m24115f();
        Act act = ldeVar.act();
        act.getClass();
        sqb0VarM24115f.m24085M(act, (String) obj);
        companion.m24115f().m24105u0(CoreAudioMatch.AudioMatchStatus.IDLE, null);
    }

    /* JADX INFO: renamed from: j0 */
    public static c m18665j0(roj0 roj0Var) {
        return CoreModule.f1534c.f3547D0.m6769H4();
    }

    /* JADX INFO: renamed from: n0 */
    public static c m18669n0(Function1 function1, Object obj) {
        return (c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o0 */
    public static j760 m18670o0(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: p0 */
    public static void m18671p0(final lde ldeVar, j760 j760Var) {
        Object obj;
        String str = (String) j760Var.a;
        if (Intrinsics.d(str, "match_timeout")) {
            ak50.Companion.a().H(ldeVar.act, "match_timeout");
            OnlineMatchManager.z().I.onNext(new j760("notify_normal_state", (Object) null));
        } else {
            if (!Intrinsics.d(str, "match_success") || (obj = j760Var.b) == null) {
                return;
            }
            final String str2 = ((OnlineMatchMatchUser) obj).userId;
            c cVarDuringCreated = ldeVar.act.duringCreated(CoreModule.f1534c.f3662p1.m1980r3(str2));
            final Function1 function1 = new Function1() { // from class: l.ide
                public final Object invoke(Object obj2) {
                    return lde.m18674u0(str2, (User) obj2);
                }
            };
            cVarDuringCreated.flatMap(new w9j() { // from class: l.jde
                public final Object call(Object obj2) {
                    return lde.m18675x0(function1, obj2);
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.kde
                public final void call(Object obj2) {
                    lde.m18676y0(this.f15754a, str2, (roj0) obj2);
                }
            }, new e30() { // from class: l.yce
                public final void call(Object obj2) {
                    lde.m18659A0((Throwable) obj2);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static void m18673r0(Throwable th) {
    }

    /* JADX INFO: renamed from: u0 */
    public static final c m18674u0(String str, User user) {
        return CoreModule.f1534c.f3631f0.m4832ap(str);
    }

    /* JADX INFO: renamed from: x0 */
    public static final c m18675x0(Function1 function1, Object obj) {
        return (c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y0 */
    public static final void m18676y0(final lde ldeVar, final String str, roj0 roj0Var) {
        e51.H(ldeVar.act, new Runnable() { // from class: l.bde
            @Override // java.lang.Runnable
            public final void run() {
                lde.m18677z0(this.f8826a, str);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: z0 */
    public static final void m18677z0(lde ldeVar, String str) {
        Intent intentP2 = MessagesAct.p2(ldeVar.act, str, false, false, false, false, (Intent) null, 7, (String) null);
        intentP2.getClass();
        boolean zM18678C0 = ldeVar.m18678C0();
        Act act = ldeVar.act;
        if (zM18678C0) {
            act.startActivityForResult(intentP2, 1911);
        } else {
            act.startActivity(intentP2);
        }
        OnlineMatchManager.z().I.onNext(new j760("notify_normal_state", (Object) null));
        if (ldeVar.m18678C0()) {
            return;
        }
        ldeVar.act.finishWithoutCustomAnimation();
    }

    /* JADX INFO: renamed from: C0 */
    public final boolean m18678C0() {
        s7m s7mVar = ((jq2) this).viewModel;
        if (!(s7mVar instanceof gee)) {
            return false;
        }
        s7mVar.getClass();
        return ((gee) s7mVar).m15753N0();
    }

    /* JADX INFO: renamed from: D0, reason: from getter */
    public final boolean getIsHideBotBtn() {
        return this.isHideBotBtn;
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m18680E0() {
        return Intrinsics.d(OnlineMatchManager.z().C(), "matching") || sqb0.INSTANCE.m24115f().m24086P() == CoreAudioMatch.AudioMatchStatus.SEARCHING;
    }

    /* JADX INFO: renamed from: F0 */
    public final boolean m18681F0() {
        if (a.S() > 0 && NullChecker.a(CoreModule.f1534c.f3547D0.m6789o4())) {
            return Intrinsics.d("on", CoreModule.f1534c.f3547D0.m6789o4().status);
        }
        return false;
    }

    /* JADX INFO: renamed from: Z */
    public void m18682Z() {
        super.Z();
    }

    /* JADX INFO: renamed from: a0 */
    public void m18683a0() {
        super.a0();
        CoreModule.f1534c.f3544C0.m27420u4();
        c cVarDistinctUntilChanged = OnlineMatchManager.z().E().distinctUntilChanged();
        c<Pair<CoreAudioMatch.AudioMatchStatus, Object>> cVarM24095b0 = sqb0.INSTANCE.m24115f().m24095b0();
        final Function2 function2 = new Function2() { // from class: l.xce
            public final Object invoke(Object obj, Object obj2) {
                return lde.m18663h0((j760) obj, (Pair) obj2);
            }
        };
        duringCreated(mkd0.r(cVarDistinctUntilChanged, cVarM24095b0, new x9j() { // from class: l.cde
            public final Object call(Object obj, Object obj2) {
                return lde.m18670o0(function2, obj, obj2);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.dde
            public final void call(Object obj) {
                lde.m18664i0(this.f10295a, (j760) obj);
            }
        }, new e30() { // from class: l.ede
            public final void call(Object obj) {
                lde.m18673r0((Throwable) obj);
            }
        }));
        duringCreated(OnlineMatchManager.z().I.distinctUntilChanged()).subscribe(mkd0.H(new e30() { // from class: l.fde
            public final void call(Object obj) {
                lde.m18671p0(this.f12665a, (j760) obj);
            }
        }, new e30() { // from class: l.gde
            public final void call(Object obj) {
                lde.m18662g0((Throwable) obj);
            }
        }));
        m18685t0();
        creates(new e30() { // from class: l.hde
            public final void call(Object obj) {
                lde.m18661f0(this.f13842a, (Bundle) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: s0 */
    public final c<roj0> m18684s0() {
        String str;
        if (NullChecker.a(CoreModule.f1534c.f3547D0.m6789o4())) {
            str = CoreModule.f1534c.f3547D0.m6789o4().status;
            str.getClass();
        } else {
            str = "off";
        }
        c<roj0> cVarM6787m4 = CoreModule.f1534c.f3547D0.m6787m4(!Intrinsics.d("on", str));
        final Function1 function1 = new Function1() { // from class: l.zce
            public final Object invoke(Object obj) {
                return lde.m18665j0((roj0) obj);
            }
        };
        c<roj0> cVarDuringCreated = duringCreated(cVarM6787m4.flatMap(new w9j() { // from class: l.ade
            public final Object call(Object obj) {
                return lde.m18669n0(function1, obj);
            }
        }));
        cVarDuringCreated.getClass();
        return cVarDuringCreated;
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: t0 */
    public final void m18685t0() {
    }

    /* JADX INFO: renamed from: A0 */
    public static final void m18659A0(Throwable th) {
    }
}
