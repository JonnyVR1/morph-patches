package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreAudioMatch;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchManager;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchMatchUser;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.DropDownAct;
import com.p046p1.mobile.putong.data.UnlockConversationType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\tJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eJ\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m87232d2 = {"Ll/lde;", "Ll/jq2;", "Ll/ej2;", "Lcom/p1/mobile/putong/core/ui/quickaudio/DropDownAct;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/putong/core/ui/quickaudio/DropDownAct;)V", "", "Z", "()V", "a0", "t0", "", "E0", "()Z", "F0", "Lrx/c;", "Ll/roj0;", "s0", "()Lrx/c;", "C0", "destroy", "a", "Lcom/p1/mobile/putong/core/ui/quickaudio/DropDownAct;", "getAct", "()Lcom/p1/mobile/putong/core/ui/quickaudio/DropDownAct;", "b", "D0", "setHideBotBtn", "(Z)V", "isHideBotBtn", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class lde extends jq2<ej2> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final DropDownAct act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean isHideBotBtn;

    /* JADX INFO: renamed from: l.lde$a */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C18196a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f127542a;

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
            f127542a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lde(@NotNull DropDownAct dropDownAct) {
        super(dropDownAct);
        dropDownAct.getClass();
        this.act = dropDownAct;
    }

    /* JADX INFO: renamed from: f0 */
    public static void m149410f0(lde ldeVar, Bundle bundle) {
        String stringExtra = ldeVar.act.getIntent().getStringExtra(Active.TYPE);
        boolean booleanExtra = ldeVar.act.getIntent().getBooleanExtra("hie_bot_btn", false);
        ldeVar.isHideBotBtn = booleanExtra;
        ((ej2) ldeVar.viewModel).mo116764n(!booleanExtra);
        if (TextUtils.equals(UnlockConversationType.quick_chat, stringExtra)) {
            ((ej2) ldeVar.viewModel).mo116757e();
        } else if (TextUtils.equals("voice_quick_chat", stringExtra)) {
            ((ej2) ldeVar.viewModel).mo116758f();
        } else if (TextUtils.equals("heart_beat_chat", stringExtra)) {
            ((ej2) ldeVar.viewModel).mo116756d();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static void m149411g0(Throwable th) {
    }

    /* JADX INFO: renamed from: h0 */
    public static j760 m149412h0(j760 j760Var, Pair pair) {
        return new j760(j760Var, pair);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public static void m149413i0(lde ldeVar, j760 j760Var) {
        Object obj;
        j760 j760Var2 = (j760) j760Var.f116564a;
        if (Intrinsics.m87488d(j760Var2 != null ? (String) j760Var2.f116564a : null, "matching")) {
            ej2 ej2Var = (ej2) ldeVar.viewModel;
            F f = j760Var.f116564a;
            f.getClass();
            ej2Var.mo116766q((OnlineMatchManager.QuickChatProduce) ((j760) f).f116565b);
        } else {
            Pair pair = (Pair) j760Var.f116565b;
            if ((pair != null ? (CoreAudioMatch.AudioMatchStatus) pair.first : null) == CoreAudioMatch.AudioMatchStatus.SEARCHING) {
                ((ej2) ldeVar.viewModel).mo116766q(OnlineMatchManager.QuickChatProduce.QuickAudioChat);
            } else {
                ((ej2) ldeVar.viewModel).mo116755c();
            }
        }
        Pair pair2 = (Pair) j760Var.f116565b;
        CoreAudioMatch.AudioMatchStatus audioMatchStatus = pair2 != null ? (CoreAudioMatch.AudioMatchStatus) pair2.first : null;
        int i = audioMatchStatus == null ? -1 : C18196a.f127542a[audioMatchStatus.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            Pair pair3 = (Pair) j760Var.f116565b;
            if ((pair3 != null ? pair3.second : null) == CoreAudioMatch.AudioMatchError.TIMEOUT) {
                ak50.INSTANCE.m97144a().m97137I(ldeVar.act, "match_timeout", true);
            }
            sqb0.INSTANCE.m185577f().m185567u0(CoreAudioMatch.AudioMatchStatus.IDLE, null);
            return;
        }
        Pair pair4 = (Pair) j760Var.f116565b;
        if (pair4 == null || (obj = pair4.second) == null) {
            return;
        }
        sqb0.Companion companion = sqb0.INSTANCE;
        sqb0 sqb0VarM185577f = companion.m185577f();
        Act act = ldeVar.act();
        act.getClass();
        sqb0VarM185577f.m185547M(act, (String) obj);
        companion.m185577f().m185567u0(CoreAudioMatch.AudioMatchStatus.IDLE, null);
    }

    /* JADX INFO: renamed from: j0 */
    public static C22306c m149414j0(roj0 roj0Var) {
        return CoreModule.f17545c.f19558D0.m34832H4();
    }

    /* JADX INFO: renamed from: n0 */
    public static C22306c m149418n0(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o0 */
    public static j760 m149419o0(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    public static void m149420p0(final lde ldeVar, j760 j760Var) {
        S s;
        String str = (String) j760Var.f116564a;
        if (Intrinsics.m87488d(str, "match_timeout")) {
            ak50.INSTANCE.m97144a().m97136H(ldeVar.act, "match_timeout");
            OnlineMatchManager.m50143z().f32594I.onNext(new j760<>("notify_normal_state", null));
        } else {
            if (!Intrinsics.m87488d(str, "match_success") || (s = j760Var.f116565b) == 0) {
                return;
            }
            final String str2 = ((OnlineMatchMatchUser) s).userId;
            C22306c c22306cDuringCreated = ldeVar.act.duringCreated(CoreModule.f17545c.f19673p1.m30052r3(str2));
            final Function1 function1 = new Function1() { // from class: l.ide
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return lde.m149423u0(str2, (User) obj);
                }
            };
            c22306cDuringCreated.flatMap(new w9j() { // from class: l.jde
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return lde.m149424x0(function1, obj);
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.kde
                @Override // p149l.e30
                public final void call(Object obj) {
                    lde.m149425y0(this.f122551a, str2, (roj0) obj);
                }
            }, new e30() { // from class: l.yce
                @Override // p149l.e30
                public final void call(Object obj) {
                    lde.m149408A0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static void m149422r0(Throwable th) {
    }

    /* JADX INFO: renamed from: u0 */
    public static final C22306c m149423u0(String str, User user) {
        return CoreModule.f17545c.f19642f0.m32902ap(str);
    }

    /* JADX INFO: renamed from: x0 */
    public static final C22306c m149424x0(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y0 */
    public static final void m149425y0(final lde ldeVar, final String str, roj0 roj0Var) {
        e51.m114743H(ldeVar.act, new Runnable() { // from class: l.bde
            @Override // java.lang.Runnable
            public final void run() {
                lde.m149426z0(this.f75027a, str);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: z0 */
    public static final void m149426z0(lde ldeVar, String str) {
        Intent intentM48949p2 = MessagesAct.m48949p2(ldeVar.act, str, false, false, false, false, null, 7, null);
        intentM48949p2.getClass();
        boolean zM149427C0 = ldeVar.m149427C0();
        DropDownAct dropDownAct = ldeVar.act;
        if (zM149427C0) {
            dropDownAct.startActivityForResult(intentM48949p2, 1911);
        } else {
            dropDownAct.startActivity(intentM48949p2);
        }
        OnlineMatchManager.m50143z().f32594I.onNext(new j760<>("notify_normal_state", null));
        if (ldeVar.m149427C0()) {
            return;
        }
        ldeVar.act.finishWithoutCustomAnimation();
    }

    /* JADX INFO: renamed from: C0 */
    public final boolean m149427C0() {
        V v2 = this.viewModel;
        if (!(v2 instanceof gee)) {
            return false;
        }
        v2.getClass();
        return ((gee) v2).m125731N0();
    }

    /* JADX INFO: renamed from: D0, reason: from getter */
    public final boolean getIsHideBotBtn() {
        return this.isHideBotBtn;
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m149429E0() {
        return Intrinsics.m87488d(OnlineMatchManager.m50143z().m50146C(), "matching") || sqb0.INSTANCE.m185577f().m185548P() == CoreAudioMatch.AudioMatchStatus.SEARCHING;
    }

    /* JADX INFO: renamed from: F0 */
    public final boolean m149430F0() {
        if (C8609a.m50235S() > 0 && NullChecker.m81303a(CoreModule.f17545c.f19558D0.m34852o4())) {
            return Intrinsics.m87488d("on", CoreModule.f17545c.f19558D0.m34852o4().status);
        }
        return false;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        CoreModule.f17545c.f19555C0.m210112u4();
        C22306c<j760<String, OnlineMatchManager.QuickChatProduce>> c22306cDistinctUntilChanged = OnlineMatchManager.m50143z().m50148E().distinctUntilChanged();
        C22306c<Pair<CoreAudioMatch.AudioMatchStatus, Object>> c22306cM185557b0 = sqb0.INSTANCE.m185577f().m185557b0();
        final Function2 function2 = new Function2() { // from class: l.xce
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return lde.m149412h0((j760) obj, (Pair) obj2);
            }
        };
        duringCreated(mkd0.m154984r(c22306cDistinctUntilChanged, c22306cM185557b0, new x9j() { // from class: l.cde
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return lde.m149419o0(function2, obj, obj2);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.dde
            @Override // p149l.e30
            public final void call(Object obj) {
                lde.m149413i0(this.f85589a, (j760) obj);
            }
        }, new e30() { // from class: l.ede
            @Override // p149l.e30
            public final void call(Object obj) {
                lde.m149422r0((Throwable) obj);
            }
        }));
        duringCreated(OnlineMatchManager.m50143z().f32594I.distinctUntilChanged()).subscribe(mkd0.m154956H(new e30() { // from class: l.fde
            @Override // p149l.e30
            public final void call(Object obj) {
                lde.m149420p0(this.f97030a, (j760) obj);
            }
        }, new e30() { // from class: l.gde
            @Override // p149l.e30
            public final void call(Object obj) {
                lde.m149411g0((Throwable) obj);
            }
        }));
        m149432t0();
        creates(new e30() { // from class: l.hde
            @Override // p149l.e30
            public final void call(Object obj) {
                lde.m149410f0(this.f107233a, (Bundle) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: s0 */
    public final C22306c<roj0> m149431s0() {
        String str;
        if (NullChecker.m81303a(CoreModule.f17545c.f19558D0.m34852o4())) {
            str = CoreModule.f17545c.f19558D0.m34852o4().status;
            str.getClass();
        } else {
            str = BLiveOperationTitleShowType.off;
        }
        C22306c<roj0> c22306cM34850m4 = CoreModule.f17545c.f19558D0.m34850m4(!Intrinsics.m87488d("on", str));
        final Function1 function1 = new Function1() { // from class: l.zce
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lde.m149414j0((roj0) obj);
            }
        };
        C22306c c22306cDuringCreated = duringCreated((C22306c) c22306cM34850m4.flatMap(new w9j() { // from class: l.ade
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return lde.m149418n0(function1, obj);
            }
        }));
        c22306cDuringCreated.getClass();
        return c22306cDuringCreated;
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: renamed from: t0 */
    public final void m149432t0() {
    }

    /* JADX INFO: renamed from: A0 */
    public static final void m149408A0(Throwable th) {
    }
}
