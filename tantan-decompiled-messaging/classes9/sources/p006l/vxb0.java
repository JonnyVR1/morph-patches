package p006l;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreAudioMatch;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.newquickchat.searchingPage.QuickChatSearchingAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchManager;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchMatchUser;
import com.p1.mobile.putong.data.User;
import kotlin.Metadata;
import kotlin.Unit;
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
import l.w9j;
import l.x9j;
import org.jetbrains.annotations.NotNull;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ll/vxb0;", "Ll/jq2;", "Ll/cyb0;", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/searchingPage/QuickChatSearchingAct;", "act", "<init>", "(Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/searchingPage/QuickChatSearchingAct;)V", "", "a0", "()V", "Z", "destroy", "Lcom/p1/mobile/android/app/Act;", "", "type", "y0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "z0", "a", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/searchingPage/QuickChatSearchingAct;", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class vxb0 extends jq2<cyb0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final QuickChatSearchingAct act;

    /* JADX INFO: renamed from: l.vxb0$a */
    @Metadata(k = CameraSticker.STATE_COMPLETE, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C1391a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24518a;

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
            f24518a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxb0(@NotNull QuickChatSearchingAct quickChatSearchingAct) {
        super(quickChatSearchingAct);
        quickChatSearchingAct.getClass();
        this.act = quickChatSearchingAct;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m25990e0(Throwable th) {
    }

    /* JADX INFO: renamed from: g0 */
    public static j760 m25992g0(j760 j760Var, Pair pair) {
        return new j760(j760Var, pair);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m25993h0(final vxb0 vxb0Var, j760 j760Var) {
        Object obj;
        String str = (String) j760Var.a;
        if (Intrinsics.d(str, "match_timeout")) {
            ak50.Companion.a().H(vxb0Var.act, "match_timeout");
            OnlineMatchManager.z().I.onNext(new j760("notify_normal_state", (Object) null));
            ((cyb0) ((jq2) vxb0Var).viewModel).m13713z();
        } else {
            if (!Intrinsics.d(str, "match_success") || (obj = j760Var.b) == null) {
                return;
            }
            final String str2 = ((OnlineMatchMatchUser) obj).userId;
            c cVarDuringCreated = vxb0Var.act.duringCreated(CoreModule.f1534c.f3662p1.m1980r3(str2));
            final Function1 function1 = new Function1() { // from class: l.rxb0
                public final Object invoke(Object obj2) {
                    return vxb0.m26003r0(str2, (User) obj2);
                }
            };
            cVarDuringCreated.flatMap(new w9j() { // from class: l.sxb0
                public final Object call(Object obj2) {
                    return vxb0.m26004s0(function1, obj2);
                }
            }).take(1).subscribe(mkd0.H(new e30() { // from class: l.txb0
                public final void call(Object obj2) {
                    vxb0.m26005t0(this.f22322a, str2, (roj0) obj2);
                }
            }, new e30() { // from class: l.uxb0
                public final void call(Object obj2) {
                    vxb0.m26007x0((Throwable) obj2);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static void m25994i0(vxb0 vxb0Var, j760 j760Var) {
        Object obj;
        if (TextUtils.equals(vxb0Var.act.getActive(), "voice_quick_chat")) {
            Pair pair = (Pair) j760Var.b;
            CoreAudioMatch.AudioMatchStatus audioMatchStatus = pair != null ? (CoreAudioMatch.AudioMatchStatus) pair.first : null;
            int i = audioMatchStatus == null ? -1 : C1391a.f24518a[audioMatchStatus.ordinal()];
            if (i == 1) {
                Pair pair2 = (Pair) j760Var.b;
                if (pair2 != null && (obj = pair2.second) != null) {
                    sqb0.Companion companion = sqb0.INSTANCE;
                    companion.m24115f().m24085M(vxb0Var.act, (String) obj);
                    companion.m24115f().m24105u0(CoreAudioMatch.AudioMatchStatus.IDLE, null);
                }
            } else if (i == 2) {
                ((cyb0) ((jq2) vxb0Var).viewModel).m13694A();
            } else if (i == 3) {
                Pair pair3 = (Pair) j760Var.b;
                if ((pair3 != null ? pair3.second : null) == CoreAudioMatch.AudioMatchError.TIMEOUT) {
                    ak50.Companion.a().I(vxb0Var.act, "match_timeout", true);
                }
                sqb0.INSTANCE.m24115f().m24105u0(CoreAudioMatch.AudioMatchStatus.IDLE, null);
                ((cyb0) ((jq2) vxb0Var).viewModel).m13713z();
            } else if (i == 4) {
                ((cyb0) ((jq2) vxb0Var).viewModel).m13713z();
            }
        }
        if (TextUtils.equals(vxb0Var.act.getActive(), "text_quick_chat")) {
            j760 j760Var2 = (j760) j760Var.a;
            String str = j760Var2 != null ? (String) j760Var2.a : null;
            if (Intrinsics.d(str, CameraSticker.CATEGORY_DEFAULT_FILTER)) {
                ((cyb0) ((jq2) vxb0Var).viewModel).m13713z();
            } else if (Intrinsics.d(str, "matching")) {
                ((cyb0) ((jq2) vxb0Var).viewModel).m13694A();
            }
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static void m25999n0(Throwable th) {
    }

    /* JADX INFO: renamed from: o0 */
    public static Unit m26000o0(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p0 */
    public static void m26001p0(Boolean bool) {
        CoreModule.f1534c.f3559H0.m27536k5();
    }

    /* JADX INFO: renamed from: q0 */
    public static j760 m26002q0(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final c m26003r0(String str, User user) {
        return CoreModule.f1534c.f3631f0.m4832ap(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final c m26004s0(Function1 function1, Object obj) {
        return (c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t0 */
    public static final void m26005t0(final vxb0 vxb0Var, final String str, roj0 roj0Var) {
        e51.H(vxb0Var.act, new Runnable() { // from class: l.lxb0
            @Override // java.lang.Runnable
            public final void run() {
                vxb0.m26006u0(this.f16703a, str);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: u0 */
    public static final void m26006u0(vxb0 vxb0Var, String str) {
        Intent intentP2 = MessagesAct.p2(vxb0Var.act, str, false, false, false, false, (Intent) null, 7, (String) null);
        intentP2.getClass();
        vxb0Var.act.startActivity(intentP2);
        OnlineMatchManager.z().I.onNext(new j760("notify_normal_state", (Object) null));
        vxb0Var.act.finish();
    }

    /* JADX INFO: renamed from: Z */
    public void m26008Z() {
        super.Z();
        CoreModule.f1534c.f3544C0.m27420u4();
    }

    /* JADX INFO: renamed from: a0 */
    public void m26009a0() {
        super.a0();
        c cVarDistinctUntilChanged = OnlineMatchManager.z().E().distinctUntilChanged();
        c<Pair<CoreAudioMatch.AudioMatchStatus, Object>> cVarM24095b0 = sqb0.INSTANCE.m24115f().m24095b0();
        final Function2 function2 = new Function2() { // from class: l.ixb0
            public final Object invoke(Object obj, Object obj2) {
                return vxb0.m25992g0((j760) obj, (Pair) obj2);
            }
        };
        duringCreated(mkd0.r(cVarDistinctUntilChanged, cVarM24095b0, new x9j() { // from class: l.mxb0
            public final Object call(Object obj, Object obj2) {
                return vxb0.m26002q0(function2, obj, obj2);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.nxb0
            public final void call(Object obj) {
                vxb0.m25994i0(this.f17914a, (j760) obj);
            }
        }, new e30() { // from class: l.oxb0
            public final void call(Object obj) {
                vxb0.m25999n0((Throwable) obj);
            }
        }));
        duringCreated(OnlineMatchManager.z().I.distinctUntilChanged()).subscribe(mkd0.H(new e30() { // from class: l.pxb0
            public final void call(Object obj) {
                vxb0.m25993h0(this.f19409a, (j760) obj);
            }
        }, new e30() { // from class: l.qxb0
            public final void call(Object obj) {
                vxb0.m25990e0((Throwable) obj);
            }
        }));
        m26011z0();
    }

    /* JADX INFO: renamed from: y0 */
    public final void m26010y0(@NotNull Act act, @NotNull String type) {
        act.getClass();
        type.getClass();
        if (Intrinsics.d(type, "text_quick_chat")) {
            OnlineMatchManager.z().u0(act, new e30() { // from class: l.jxb0
                public final void call(Object obj) {
                    vxb0.m26001p0((Boolean) obj);
                }
            });
        } else if (Intrinsics.d(type, "voice_quick_chat")) {
            sqb0.m24029B0(sqb0.INSTANCE.m24115f(), act, false, false, new Function1() { // from class: l.kxb0
                public final Object invoke(Object obj) {
                    return vxb0.m26000o0(((Boolean) obj).booleanValue());
                }
            }, 6, null);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m26011z0() {
        if (wxb0.m26856a()) {
            return;
        }
        QuickChatSearchingAct quickChatSearchingAct = this.act;
        m26010y0(quickChatSearchingAct, quickChatSearchingAct.getActive());
    }

    public void destroy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final void m26007x0(Throwable th) {
    }
}
