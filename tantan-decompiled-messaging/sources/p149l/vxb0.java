package p149l;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreAudioMatch;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchManager;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchMatchUser;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.newquickchat.searchingPage.QuickChatSearchingAct;
import com.p046p1.mobile.putong.data.User;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Ll/vxb0;", "Ll/jq2;", "Ll/cyb0;", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/searchingPage/QuickChatSearchingAct;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/searchingPage/QuickChatSearchingAct;)V", "", "a0", "()V", "Z", "destroy", "Lcom/p1/mobile/android/app/Act;", "", "type", "y0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "z0", "a", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/searchingPage/QuickChatSearchingAct;", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class vxb0 extends jq2<cyb0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final QuickChatSearchingAct act;

    /* JADX INFO: renamed from: l.vxb0$a */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C20756a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f183439a;

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
            f183439a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxb0(@NotNull QuickChatSearchingAct quickChatSearchingAct) {
        super(quickChatSearchingAct);
        quickChatSearchingAct.getClass();
        this.act = quickChatSearchingAct;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m200522e0(Throwable th) {
    }

    /* JADX INFO: renamed from: g0 */
    public static j760 m200524g0(j760 j760Var, Pair pair) {
        return new j760(j760Var, pair);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    public static void m200525h0(final vxb0 vxb0Var, j760 j760Var) {
        S s;
        String str = (String) j760Var.f116564a;
        if (Intrinsics.m87488d(str, "match_timeout")) {
            ak50.INSTANCE.m97144a().m97136H(vxb0Var.act, "match_timeout");
            OnlineMatchManager.m50143z().f32594I.m132487l(new j760<>("notify_normal_state", null));
            ((cyb0) vxb0Var.viewModel).m109273z();
        } else {
            if (!Intrinsics.m87488d(str, "match_success") || (s = j760Var.f116565b) == 0) {
                return;
            }
            final String str2 = ((OnlineMatchMatchUser) s).userId;
            C22306c c22306cDuringCreated = vxb0Var.act.duringCreated(CoreModule.f17545c.f19673p1.m30052r3(str2));
            final Function1 function1 = new Function1() { // from class: l.rxb0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return vxb0.m200535r0(str2, (User) obj);
                }
            };
            c22306cDuringCreated.flatMap(new w9j() { // from class: l.sxb0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return vxb0.m200536s0(function1, obj);
                }
            }).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.txb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    vxb0.m200537t0(this.f172500a, str2, (roj0) obj);
                }
            }, new e30() { // from class: l.uxb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    vxb0.m200539x0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public static void m200526i0(vxb0 vxb0Var, j760 j760Var) {
        Object obj;
        if (TextUtils.equals(vxb0Var.act.getCom.p1.mobile.putong.core.data.Active.TYPE java.lang.String(), "voice_quick_chat")) {
            Pair pair = (Pair) j760Var.f116565b;
            CoreAudioMatch.AudioMatchStatus audioMatchStatus = pair != null ? (CoreAudioMatch.AudioMatchStatus) pair.first : null;
            int i = audioMatchStatus == null ? -1 : C20756a.f183439a[audioMatchStatus.ordinal()];
            if (i == 1) {
                Pair pair2 = (Pair) j760Var.f116565b;
                if (pair2 != null && (obj = pair2.second) != null) {
                    sqb0.Companion companion = sqb0.INSTANCE;
                    companion.m185577f().m185547M(vxb0Var.act, (String) obj);
                    companion.m185577f().m185567u0(CoreAudioMatch.AudioMatchStatus.IDLE, null);
                }
            } else if (i == 2) {
                ((cyb0) vxb0Var.viewModel).m109256A();
            } else if (i == 3) {
                Pair pair3 = (Pair) j760Var.f116565b;
                if ((pair3 != null ? pair3.second : null) == CoreAudioMatch.AudioMatchError.TIMEOUT) {
                    ak50.INSTANCE.m97144a().m97137I(vxb0Var.act, "match_timeout", true);
                }
                sqb0.INSTANCE.m185577f().m185567u0(CoreAudioMatch.AudioMatchStatus.IDLE, null);
                ((cyb0) vxb0Var.viewModel).m109273z();
            } else if (i == 4) {
                ((cyb0) vxb0Var.viewModel).m109273z();
            }
        }
        if (TextUtils.equals(vxb0Var.act.getCom.p1.mobile.putong.core.data.Active.TYPE java.lang.String(), "text_quick_chat")) {
            j760 j760Var2 = (j760) j760Var.f116564a;
            String str = j760Var2 != null ? (String) j760Var2.f116564a : null;
            if (Intrinsics.m87488d(str, "default")) {
                ((cyb0) vxb0Var.viewModel).m109273z();
            } else if (Intrinsics.m87488d(str, "matching")) {
                ((cyb0) vxb0Var.viewModel).m109256A();
            }
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static void m200531n0(Throwable th) {
    }

    /* JADX INFO: renamed from: o0 */
    public static Unit m200532o0(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p0 */
    public static void m200533p0(Boolean bool) {
        CoreModule.f17545c.f19570H0.m210361k5();
    }

    /* JADX INFO: renamed from: q0 */
    public static j760 m200534q0(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C22306c m200535r0(String str, User user) {
        return CoreModule.f17545c.f19642f0.m32902ap(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C22306c m200536s0(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t0 */
    public static final void m200537t0(final vxb0 vxb0Var, final String str, roj0 roj0Var) {
        e51.m114743H(vxb0Var.act, new Runnable() { // from class: l.lxb0
            @Override // java.lang.Runnable
            public final void run() {
                vxb0.m200538u0(this.f130404a, str);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: u0 */
    public static final void m200538u0(vxb0 vxb0Var, String str) {
        Intent intentM48949p2 = MessagesAct.m48949p2(vxb0Var.act, str, false, false, false, false, null, 7, null);
        intentM48949p2.getClass();
        vxb0Var.act.startActivity(intentM48949p2);
        OnlineMatchManager.m50143z().f32594I.m132487l(new j760<>("notify_normal_state", null));
        vxb0Var.act.m66873d2();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        CoreModule.f17545c.f19555C0.m210112u4();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        C22306c<j760<String, OnlineMatchManager.QuickChatProduce>> c22306cDistinctUntilChanged = OnlineMatchManager.m50143z().m50148E().distinctUntilChanged();
        C22306c<Pair<CoreAudioMatch.AudioMatchStatus, Object>> c22306cM185557b0 = sqb0.INSTANCE.m185577f().m185557b0();
        final Function2 function2 = new Function2() { // from class: l.ixb0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return vxb0.m200524g0((j760) obj, (Pair) obj2);
            }
        };
        duringCreated(mkd0.m154984r(c22306cDistinctUntilChanged, c22306cM185557b0, new x9j() { // from class: l.mxb0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return vxb0.m200534q0(function2, obj, obj2);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.nxb0
            @Override // p149l.e30
            public final void call(Object obj) {
                vxb0.m200526i0(this.f141010a, (j760) obj);
            }
        }, new e30() { // from class: l.oxb0
            @Override // p149l.e30
            public final void call(Object obj) {
                vxb0.m200531n0((Throwable) obj);
            }
        }));
        duringCreated(OnlineMatchManager.m50143z().f32594I.distinctUntilChanged()).subscribe(mkd0.m154956H(new e30() { // from class: l.pxb0
            @Override // p149l.e30
            public final void call(Object obj) {
                vxb0.m200525h0(this.f151654a, (j760) obj);
            }
        }, new e30() { // from class: l.qxb0
            @Override // p149l.e30
            public final void call(Object obj) {
                vxb0.m200522e0((Throwable) obj);
            }
        }));
        m200541z0();
    }

    /* JADX INFO: renamed from: y0 */
    public final void m200540y0(@NotNull Act act, @NotNull String type) {
        act.getClass();
        type.getClass();
        if (Intrinsics.m87488d(type, "text_quick_chat")) {
            OnlineMatchManager.m50143z().m50190u0(act, new e30() { // from class: l.jxb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    vxb0.m200533p0((Boolean) obj);
                }
            });
        } else if (Intrinsics.m87488d(type, "voice_quick_chat")) {
            sqb0.m185491B0(sqb0.INSTANCE.m185577f(), act, false, false, new Function1() { // from class: l.kxb0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return vxb0.m200532o0(((Boolean) obj).booleanValue());
                }
            }, 6, null);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m200541z0() {
        if (wxb0.m205979a()) {
            return;
        }
        QuickChatSearchingAct quickChatSearchingAct = this.act;
        m200540y0(quickChatSearchingAct, quickChatSearchingAct.getCom.p1.mobile.putong.core.data.Active.TYPE java.lang.String());
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final void m200539x0(Throwable th) {
    }
}
