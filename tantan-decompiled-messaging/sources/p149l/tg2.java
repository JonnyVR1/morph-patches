package p149l;

import android.text.TextUtils;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.buzz.R$string;
import com.p046p1.mobile.putong.core.data.LoveBuzzData;
import com.p046p1.mobile.putong.core.data.LoveBuzzPushData;
import com.p046p1.mobile.putong.core.data.StickerBundle;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.media.BuzzMediaCallManager;
import com.p046p1.mobile.putong.data.Careers;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 X2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u000fJ#\u0010\u001a\u001a\u00020\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0010H&¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\u00020\u000b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u0014J\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u000fJ\r\u0010\u001f\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010\u0017J\r\u0010 \u001a\u00020\u0015¢\u0006\u0004\b \u0010\u0017J\r\u0010!\u001a\u00020\u000b¢\u0006\u0004\b!\u0010\u000fJ\u000f\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\"\u0010\u000fJ\r\u0010#\u001a\u00020\u000b¢\u0006\u0004\b#\u0010\u000fJ\u0015\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020)0\u00100(¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R$\u00109\u001a\u0004\u0018\u0001008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u00102\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010?\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010'R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010M\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010\u0017\"\u0004\bK\u0010LR\"\u0010Q\u001a\u00020@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010B\u001a\u0004\bO\u0010D\"\u0004\bP\u0010FR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010T¨\u0006Y"}, m87232d2 = {"Ll/tg2;", "Ll/jq2;", "Ll/dg2;", "Ll/mcr;", "lifecycleProvider", "", "pageType", "<init>", "(Ll/mcr;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/core/data/LoveBuzzPushData;", "data", "", "G0", "(Lcom/p1/mobile/putong/core/data/LoveBuzzPushData;)V", "s0", "()V", "Ll/j760;", "", Careers.f38732it, "F0", "(Ll/j760;)V", "", "z0", "()Z", "H0", "pair", "A0", "(Ll/j760;)Z", "u0", "U0", "V0", "t0", "J0", "L0", "destroy", "W0", "", NotificationCompat.CATEGORY_STATUS, "I0", "(I)V", "", "Ll/d30;", "x0", "()Ljava/util/Collection;", "a", "Ljava/lang/String;", "D0", "()Ljava/lang/String;", "Ll/c4g0;", "b", "Ll/c4g0;", "inviteSubscribe", "c", "getSearchSubscribe$buzz_intlGmsRelease", "()Ll/c4g0;", "R0", "(Ll/c4g0;)V", "searchSubscribe", Constants.INAPP_DATA_TAG, "I", "E0", "()I", "Q0", "searchPageStatus", "", "e", "J", "C0", "()J", "setConnectTime", "(J)V", "connectTime", "f", "Z", "getLocalJoined", "P0", "(Z)V", "localJoined", "g", "getStartSearchTime", "S0", "startSearchTime", "Ljava/lang/Runnable;", "h", "Ljava/lang/Runnable;", "searchTimeOutRunnable", RXScreenCaptureService.KEY_INDEX, "connectTimeOutRunnable", "Companion", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public abstract class tg2 extends jq2<dg2> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String pageType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public c4g0 inviteSubscribe;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public c4g0 searchSubscribe;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int searchPageStatus;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public long connectTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean localJoined;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long startSearchTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Runnable searchTimeOutRunnable;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Runnable connectTimeOutRunnable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg2(@NotNull mcr mcrVar, @NotNull String str) {
        super(mcrVar);
        mcrVar.getClass();
        str.getClass();
        this.pageType = str;
        this.searchTimeOutRunnable = new Runnable() { // from class: l.og2
            @Override // java.lang.Runnable
            public final void run() {
                tg2.m188773k0(this.f143798a);
            }
        };
        this.connectTimeOutRunnable = new Runnable() { // from class: l.pg2
            @Override // java.lang.Runnable
            public final void run() {
                tg2.m188777o0(this.f148607a);
            }
        };
    }

    /* JADX INFO: renamed from: N0 */
    public static final Unit m188765N0(tg2 tg2Var) {
        Act act;
        if (m6w.INSTANCE.m153296a(tg2Var.act()) && (act = tg2Var.act()) != null) {
            act.m66873d2();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O0 */
    public static final Unit m188766O0(tg2 tg2Var) {
        tg2Var.searchPageStatus ^= 1;
        tg2Var.mo136403U0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e0 */
    public static Unit m188767e0(tg2 tg2Var) {
        p9w.INSTANCE.m167949q(tg2Var.pageType);
        tg2Var.searchPageStatus ^= 2;
        tg2Var.mo136403U0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g0 */
    public static Boolean m188769g0(tg2 tg2Var, j760 j760Var) {
        j760Var.getClass();
        return Boolean.valueOf(tg2Var.mo116414A0(j760Var));
    }

    /* JADX INFO: renamed from: h0 */
    public static void m188770h0(final tg2 tg2Var) {
        Dialog.C4309e c4309eDialog;
        Dialog.C4309e c4309eM20535e0;
        Dialog.C4309e c4309eM20537g0;
        Dialog dialogM20567z;
        Act act = tg2Var.act();
        if (act == null || (c4309eDialog = act.dialog()) == null || (c4309eM20535e0 = c4309eDialog.m20535e0(vwb.m200324f0("media buzz 对方接受", "media buzz 对方拒绝"))) == null || (c4309eM20537g0 = c4309eM20535e0.m20537g0(new Dialog.InterfaceC4311g() { // from class: l.hg2
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                tg2.m188781y0(this.f107556a, dialog, view, i, charSequence);
            }
        })) == null || (dialogM20567z = c4309eM20537g0.m20567z()) == null) {
            return;
        }
        dialogM20567z.show();
    }

    /* JADX INFO: renamed from: i0 */
    public static Boolean m188771i0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m188772j0(String str, tg2 tg2Var, Throwable th) {
        qa2.INSTANCE.m173681a("BaseBuzzSearchPresenter", "handlerReaction error ,uid " + str + " msg is " + th.getMessage());
        ((dg2) tg2Var.viewModel).m111586d0(str);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m188773k0(final tg2 tg2Var) {
        if (m6w.INSTANCE.m153296a(tg2Var.act())) {
            tg2Var.mo136404V0();
            tg2Var.searchPageStatus |= 1;
            f6w.INSTANCE.m119692Z(tg2Var.act(), tg2Var.pageType, new Function0() { // from class: l.ig2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return tg2.m188765N0(this.f113065a);
                }
            }, new Function0() { // from class: l.jg2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return tg2.m188766O0(this.f117705a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static void m188774l0(tg2 tg2Var, String str, roj0 roj0Var) {
        ((dg2) tg2Var.viewModel).m111586d0(str);
    }

    /* JADX INFO: renamed from: m0 */
    public static void m188775m0(tg2 tg2Var) {
        dg2 dg2Var;
        if (!m6w.INSTANCE.m153296a(tg2Var.act()) || (dg2Var = (dg2) tg2Var.viewModel) == null) {
            return;
        }
        dg2Var.mo111598q();
    }

    /* JADX INFO: renamed from: o0 */
    public static void m188777o0(tg2 tg2Var) {
        if (m6w.INSTANCE.m153296a(tg2Var.act())) {
            if (!Intrinsics.m87488d(tg2Var.pageType, "textBuzz")) {
                hhx hhxVarM140417B0 = j8w.INSTANCE.m140473a().m140417B0();
                p9w.INSTANCE.m167925Y(tg2Var.pageType, hhxVarM140417B0.getUserId(), hhxVarM140417B0.getChannelToken(), tg2Var.localJoined);
            }
            tg2Var.m188795s0();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static Unit m188779q0(tg2 tg2Var) {
        Act act;
        if (m6w.INSTANCE.m153296a(tg2Var.act()) && (act = tg2Var.act()) != null) {
            act.m66873d2();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    public static void m188780r0(tg2 tg2Var, j760 j760Var) {
        if (Intrinsics.m87488d(tg2Var.pageType, "textBuzz")) {
            j760Var.getClass();
            tg2Var.m188785F0(j760Var);
            return;
        }
        String str = (String) j760Var.f116564a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1972529222:
                    if (!str.equals("intl.memojiBuzz.notify")) {
                        return;
                    }
                    break;
                case -1635877469:
                    if (!str.equals("intl.voiceBuzz.notify")) {
                        return;
                    }
                    break;
                case 130013434:
                    if (str.equals("media_buzz_reaction")) {
                        S s = j760Var.f116565b;
                        LoveBuzzPushData loveBuzzPushData = s instanceof LoveBuzzPushData ? (LoveBuzzPushData) s : null;
                        if (loveBuzzPushData != null) {
                            tg2Var.m188786G0(loveBuzzPushData);
                            return;
                        }
                        return;
                    }
                    return;
                case 1140560570:
                    if (!str.equals("intl.videoBuzz.notify")) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            if (tg2Var.startSearchTime != 0) {
                p9w.INSTANCE.m167924X(mqi0.m155944o() - tg2Var.startSearchTime, tg2Var.pageType);
                tg2Var.startSearchTime = 0L;
            }
            tg2Var.m188785F0(j760Var);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public static final void m188781y0(tg2 tg2Var, Dialog dialog, View view, int i, CharSequence charSequence) {
        LoveBuzzPushData loveBuzzPushData;
        if (i == 0) {
            LoveBuzzPushData loveBuzzPushData2 = new LoveBuzzPushData();
            j760<String, Object> j760VarM111563G = ((dg2) tg2Var.viewModel).m111563G();
            Object obj = j760VarM111563G != null ? j760VarM111563G.f116565b : null;
            loveBuzzPushData = obj instanceof LoveBuzzPushData ? (LoveBuzzPushData) obj : null;
            if (loveBuzzPushData != null) {
                loveBuzzPushData2.biz = loveBuzzPushData.biz;
                loveBuzzPushData2.channelToken = loveBuzzPushData.channelToken;
                loveBuzzPushData2.reaction = "accepted";
            }
            loveBuzzPushData2.buzzIntent = "intl.lovebuzz.react";
            k6w.INSTANCE.m144637f(loveBuzzPushData2);
            return;
        }
        if (i != 1) {
            return;
        }
        LoveBuzzPushData loveBuzzPushData3 = new LoveBuzzPushData();
        j760<String, Object> j760VarM111563G2 = ((dg2) tg2Var.viewModel).m111563G();
        Object obj2 = j760VarM111563G2 != null ? j760VarM111563G2.f116565b : null;
        loveBuzzPushData = obj2 instanceof LoveBuzzPushData ? (LoveBuzzPushData) obj2 : null;
        if (loveBuzzPushData != null) {
            loveBuzzPushData3.biz = loveBuzzPushData.biz;
            loveBuzzPushData3.channelToken = loveBuzzPushData.channelToken;
            loveBuzzPushData3.reaction = "rejected";
        }
        loveBuzzPushData3.buzzIntent = "intl.lovebuzz.react";
        k6w.INSTANCE.m144637f(loveBuzzPushData3);
    }

    /* JADX INFO: renamed from: A0 */
    public abstract boolean mo116414A0(@NotNull j760<String, Object> pair);

    /* JADX INFO: renamed from: C0, reason: from getter */
    public final long getConnectTime() {
        return this.connectTime;
    }

    @NotNull
    /* JADX INFO: renamed from: D0, reason: from getter */
    public final String getPageType() {
        return this.pageType;
    }

    /* JADX INFO: renamed from: E0, reason: from getter */
    public final int getSearchPageStatus() {
        return this.searchPageStatus;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    /* JADX INFO: renamed from: F0 */
    public final void m188785F0(j760<String, Object> it) {
        boolean z;
        this.searchPageStatus |= 4;
        e51.m114745J(this.searchTimeOutRunnable);
        Object obj = it.f116565b;
        LoveBuzzPushData loveBuzzPushData = obj instanceof LoveBuzzPushData ? (LoveBuzzPushData) obj : null;
        if (NullChecker.m81303a(loveBuzzPushData)) {
            if (!Intrinsics.m87488d(loveBuzzPushData != null ? loveBuzzPushData.subType : null, StickerBundle.TYPE) || TextUtils.isEmpty(loveBuzzPushData.otherUsers)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (z) {
            this.searchPageStatus |= 8;
        }
        ((dg2) this.viewModel).mo111591j0(it, z);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m188786G0(LoveBuzzPushData data) {
        C22306c c22306cDuringCreated;
        C22306c c22306cObserveOn;
        final String str = data.userId;
        int i = this.searchPageStatus;
        if ((i & 16) > 0) {
            if (!Intrinsics.m87488d(j8w.INSTANCE.m140473a().m140421F0(((dg2) this.viewModel).m111564H()), "rejected")) {
                ((dg2) this.viewModel).mo111561B();
                return;
            } else {
                lsi0.m151593w(R$string.f20257u0);
                ((dg2) this.viewModel).mo111598q();
                return;
            }
        }
        if ((i & 8) <= 0) {
            if (!data.needReact && TextUtils.isEmpty(data.subType) && Intrinsics.m87488d(data.reaction, "rejected")) {
                m188795s0();
                return;
            }
            return;
        }
        if (Intrinsics.m87488d(data.reaction, "accepted")) {
            ((dg2) this.viewModel).m111592k0();
            Act act = act();
            if (act == null || (c22306cDuringCreated = act.duringCreated(CoreModule.f17545c.f19639e0.m169454W9(str).timeout(5L, TimeUnit.SECONDS))) == null || (c22306cObserveOn = c22306cDuringCreated.observeOn(jo0.m142408a())) == null) {
                return;
            }
            c22306cObserveOn.subscribe(mkd0.m154956H(new e30() { // from class: l.sg2
                @Override // p149l.e30
                public final void call(Object obj) {
                    tg2.m188774l0(this.f164362a, str, (roj0) obj);
                }
            }, new e30() { // from class: l.gg2
                @Override // p149l.e30
                public final void call(Object obj) {
                    tg2.m188772j0(str, this, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005e  */
    /* JADX INFO: renamed from: H0 */
    public void mo146810H0() {
        c4g0 c4g0VarSubscribe;
        qa2.INSTANCE.m173681a("BaseBuzzSearchPresenter", "initData " + this);
        Act act = act();
        if (act == null) {
            c4g0VarSubscribe = null;
        } else {
            C22306c c22306cDuringCreated = act.duringCreated((C22306c) (Intrinsics.m87488d(this.pageType, "textBuzz") ? j8w.INSTANCE.m140473a().m140472z0() : j8w.INSTANCE.m140473a().m140419D0()));
            if (c22306cDuringCreated != null) {
                final Function1 function1 = new Function1() { // from class: l.lg2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return tg2.m188769g0(this.f127945a, (j760) obj);
                    }
                };
                C22306c c22306cFilter = c22306cDuringCreated.filter(new w9j() { // from class: l.mg2
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return tg2.m188771i0(function1, obj);
                    }
                });
                if (c22306cFilter != null) {
                    c4g0VarSubscribe = c22306cFilter.subscribe(mkd0.m154955G(new e30() { // from class: l.ng2
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            tg2.m188780r0(this.f138833a, (j760) obj);
                        }
                    }));
                } else {
                    c4g0VarSubscribe = null;
                }
            } else {
                c4g0VarSubscribe = null;
            }
        }
        this.inviteSubscribe = c4g0VarSubscribe;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m188787I0(int status) {
        this.searchPageStatus = status | this.searchPageStatus;
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m188788J0() {
        return (this.searchPageStatus & 32) > 0;
    }

    /* JADX INFO: renamed from: L0 */
    public final void m188789L0() {
        e51.m114745J(this.connectTimeOutRunnable);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m188790P0(boolean z) {
        this.localJoined = z;
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m188791Q0(int i) {
        this.searchPageStatus = i;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m188792R0(@Nullable c4g0 c4g0Var) {
        this.searchSubscribe = c4g0Var;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m188793S0(long j) {
        this.startSearchTime = j;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX INFO: renamed from: U0 */
    public void mo136403U0() {
        int i;
        LoveBuzzData loveBuzzDataM140468v0;
        String str = this.pageType;
        int iHashCode = str.hashCode();
        if (iHashCode != -1019560155) {
            if (iHashCode != 1332422126) {
                if (iHashCode == 1740758636 && str.equals("memojiBuzz")) {
                    LoveBuzzData loveBuzzDataM140468v1 = j8w.INSTANCE.m140473a().m140468v0();
                    if (loveBuzzDataM140468v1 != null) {
                        i = loveBuzzDataM140468v1.memojiBuzzPairFailHintTimeout;
                    } else {
                        i = 20;
                    }
                } else {
                    loveBuzzDataM140468v0 = j8w.INSTANCE.m140473a().m140468v0();
                    if (loveBuzzDataM140468v0 != null) {
                        i = loveBuzzDataM140468v0.textBuzzPairFailHintTimeout;
                    } else {
                        i = 20;
                    }
                }
            } else if (str.equals("videoBuzz")) {
                LoveBuzzData loveBuzzDataM140468v2 = j8w.INSTANCE.m140473a().m140468v0();
                if (loveBuzzDataM140468v2 != null) {
                    i = loveBuzzDataM140468v2.videoBuzzPairFailHintTimeout;
                } else {
                    i = 20;
                }
            } else {
                loveBuzzDataM140468v0 = j8w.INSTANCE.m140473a().m140468v0();
                if (loveBuzzDataM140468v0 != null) {
                    i = loveBuzzDataM140468v0.textBuzzPairFailHintTimeout;
                } else {
                    i = 20;
                }
            }
        } else if (str.equals("voiceBuzz")) {
            LoveBuzzData loveBuzzDataM140468v3 = j8w.INSTANCE.m140473a().m140468v0();
            if (loveBuzzDataM140468v3 != null) {
                i = loveBuzzDataM140468v3.voiceBuzzPairFailHintTimeout;
            } else {
                i = 20;
            }
        } else {
            loveBuzzDataM140468v0 = j8w.INSTANCE.m140473a().m140468v0();
            if (loveBuzzDataM140468v0 != null) {
                i = loveBuzzDataM140468v0.textBuzzPairFailHintTimeout;
            } else {
                i = 20;
            }
        }
        qa2.INSTANCE.m173681a("BaseBuzzSearchPresenter", "startSearch page " + this.pageType + " time " + i);
        int i2 = i > 0 ? i : 20;
        e51.m114745J(this.searchTimeOutRunnable);
        e51.m114743H(act(), this.searchTimeOutRunnable, ((long) i2) * 1000);
    }

    /* JADX INFO: renamed from: V0 */
    public void mo136404V0() {
        e51.m114745J(this.searchTimeOutRunnable);
    }

    /* JADX INFO: renamed from: W0 */
    public final void m188794W0() {
        mo136404V0();
        this.searchPageStatus |= 2;
        if (m6w.INSTANCE.m153296a(act())) {
            f6w.INSTANCE.m119688V(act(), new Function0() { // from class: l.fg2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return tg2.m188767e0(this.f97327a);
                }
            }, new Function0() { // from class: l.kg2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return tg2.m188779q0(this.f122992a);
                }
            });
        }
    }

    @Override // p149l.q0m
    public void destroy() {
        if (!Intrinsics.m87488d(this.pageType, "textBuzz") && !m188798z0()) {
            BuzzMediaCallManager.m46936v(BuzzMediaCallManager.INSTANCE, 0, 1, null);
        }
        e51.m114745J(this.connectTimeOutRunnable);
        mkd0.m154992z(this.inviteSubscribe);
        mkd0.m154992z(this.searchSubscribe);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m188795s0() {
        dg2 dg2Var = (dg2) this.viewModel;
        if (dg2Var != null) {
            dg2Var.m111592k0();
        }
        lsi0.m151593w(R$string.f20212c1);
        BuzzMediaCallManager.INSTANCE.m46957V();
        e51.m114743H(act(), new Runnable() { // from class: l.rg2
            @Override // java.lang.Runnable
            public final void run() {
                tg2.m188775m0(this.f159222a);
            }
        }, 2000L);
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m188796t0() {
        int i = this.searchPageStatus;
        return (i & 4) <= 0 && (i & 8) <= 0 && (i & 1) <= 0 && (i & 2) <= 0 && (i & 128) <= 0 && (i & 64) <= 0;
    }

    /* JADX INFO: renamed from: u0 */
    public void mo136406u0(@NotNull j760<String, Object> pair) {
        pair.getClass();
        this.searchPageStatus |= 64;
        int iM153300e = m6w.INSTANCE.m153300e(this.pageType);
        qa2.INSTANCE.m173681a("BaseBuzzSearchPresenter", "connectBuzz page " + this.pageType + " time " + iM153300e);
        e51.m114745J(this.connectTimeOutRunnable);
        e51.m114743H(act(), this.connectTimeOutRunnable, ((long) iM153300e) * 1000);
        this.connectTime = System.currentTimeMillis();
    }

    @NotNull
    /* JADX INFO: renamed from: x0 */
    public final Collection<j760<String, d30>> m188797x0() {
        ArrayList arrayListM200324f0 = vwb.m200324f0(vwb.m200311Y("media buzz debug", new d30() { // from class: l.qg2
            @Override // p149l.d30
            public final void call() {
                tg2.m188770h0(this.f154305a);
            }
        }));
        arrayListM200324f0.getClass();
        return arrayListM200324f0;
    }

    /* JADX INFO: renamed from: z0 */
    public final boolean m188798z0() {
        return (this.searchPageStatus & 128) > 0;
    }
}
