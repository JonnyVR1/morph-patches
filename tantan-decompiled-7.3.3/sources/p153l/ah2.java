package p153l;

import android.text.TextUtils;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.buzz.R$string;
import com.p051p1.mobile.putong.core.data.LoveBuzzData;
import com.p051p1.mobile.putong.core.data.LoveBuzzPushData;
import com.p051p1.mobile.putong.core.data.StickerBundle;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.media.BuzzMediaCallManager;
import com.p051p1.mobile.putong.data.Careers;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 X2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u000fJ#\u0010\u001a\u001a\u00020\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0010H&¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\u00020\u000b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u0014J\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u000fJ\r\u0010\u001f\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010\u0017J\r\u0010 \u001a\u00020\u0015¢\u0006\u0004\b \u0010\u0017J\r\u0010!\u001a\u00020\u000b¢\u0006\u0004\b!\u0010\u000fJ\u000f\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\"\u0010\u000fJ\r\u0010#\u001a\u00020\u000b¢\u0006\u0004\b#\u0010\u000fJ\u0015\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020)0\u00100(¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R$\u00109\u001a\u0004\u0018\u0001008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u00102\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010?\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010'R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010M\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010\u0017\"\u0004\bK\u0010LR\"\u0010Q\u001a\u00020@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010B\u001a\u0004\bO\u0010D\"\u0004\bP\u0010FR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010T¨\u0006Y"}, m88121d2 = {"Ll/ah2;", "Ll/ar2;", "Ll/kg2;", "Ll/ner;", "lifecycleProvider", "", "pageType", "<init>", "(Ll/ner;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/core/data/LoveBuzzPushData;", "data", "", "G0", "(Lcom/p1/mobile/putong/core/data/LoveBuzzPushData;)V", "s0", "()V", "Ll/pf60;", "", Careers.f39580it, "F0", "(Ll/pf60;)V", "", "z0", "()Z", "H0", "pair", "A0", "(Ll/pf60;)Z", "u0", "U0", "V0", "t0", "J0", "L0", "destroy", "W0", "", NotificationCompat.CATEGORY_STATUS, "I0", "(I)V", "", "Ll/x20;", "x0", "()Ljava/util/Collection;", "a", "Ljava/lang/String;", "D0", "()Ljava/lang/String;", "Ll/kcg0;", "b", "Ll/kcg0;", "inviteSubscribe", "c", "getSearchSubscribe$buzz_intlGmsRelease", "()Ll/kcg0;", "R0", "(Ll/kcg0;)V", "searchSubscribe", Constants.INAPP_DATA_TAG, "I", "E0", "()I", "Q0", "searchPageStatus", "", "e", "J", "C0", "()J", "setConnectTime", "(J)V", "connectTime", "f", "Z", "getLocalJoined", "P0", "(Z)V", "localJoined", "g", "getStartSearchTime", "S0", "startSearchTime", "Ljava/lang/Runnable;", "h", "Ljava/lang/Runnable;", "searchTimeOutRunnable", RXScreenCaptureService.KEY_INDEX, "connectTimeOutRunnable", "Companion", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public abstract class ah2 extends ar2<kg2> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String pageType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public kcg0 inviteSubscribe;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public kcg0 searchSubscribe;

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
    public ah2(@NotNull ner nerVar, @NotNull String str) {
        super(nerVar);
        nerVar.getClass();
        str.getClass();
        this.pageType = str;
        this.searchTimeOutRunnable = new Runnable() { // from class: l.vg2
            @Override // java.lang.Runnable
            public final void run() {
                ah2.m97743k0(this.f183995a);
            }
        };
        this.connectTimeOutRunnable = new Runnable() { // from class: l.wg2
            @Override // java.lang.Runnable
            public final void run() {
                ah2.m97747o0(this.f188908a);
            }
        };
    }

    /* JADX INFO: renamed from: N0 */
    public static final Unit m97735N0(ah2 ah2Var) {
        Act act;
        if (k8w.INSTANCE.m148752a(ah2Var.act()) && (act = ah2Var.act()) != null) {
            act.m68056e2();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O0 */
    public static final Unit m97736O0(ah2 ah2Var) {
        ah2Var.searchPageStatus ^= 1;
        ah2Var.mo97766U0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e0 */
    public static Unit m97737e0(ah2 ah2Var) {
        nbw.INSTANCE.m162253q(ah2Var.pageType);
        ah2Var.searchPageStatus ^= 2;
        ah2Var.mo97766U0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g0 */
    public static Boolean m97739g0(ah2 ah2Var, pf60 pf60Var) {
        pf60Var.getClass();
        return Boolean.valueOf(ah2Var.mo97752A0(pf60Var));
    }

    /* JADX INFO: renamed from: h0 */
    public static void m97740h0(final ah2 ah2Var) {
        Dialog.C4460e c4460eDialog;
        Dialog.C4460e c4460eM21534e0;
        Dialog.C4460e c4460eM21536g0;
        Dialog dialogM21566z;
        Act act = ah2Var.act();
        if (act == null || (c4460eDialog = act.dialog()) == null || (c4460eM21534e0 = c4460eDialog.m21534e0(jyb.m147507f0("media buzz 对方接受", "media buzz 对方拒绝"))) == null || (c4460eM21536g0 = c4460eM21534e0.m21536g0(new Dialog.InterfaceC4462g() { // from class: l.og2
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                ah2.m97751y0(this.f147182a, dialog, view, i, charSequence);
            }
        })) == null || (dialogM21566z = c4460eM21536g0.m21566z()) == null) {
            return;
        }
        dialogM21566z.show();
    }

    /* JADX INFO: renamed from: i0 */
    public static Boolean m97741i0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m97742j0(String str, ah2 ah2Var, Throwable th) {
        xa2.INSTANCE.m209830a("BaseBuzzSearchPresenter", "handlerReaction error ,uid " + str + " msg is " + th.getMessage());
        ((kg2) ah2Var.viewModel).m149717d0(str);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m97743k0(final ah2 ah2Var) {
        if (k8w.INSTANCE.m148752a(ah2Var.act())) {
            ah2Var.mo97767V0();
            ah2Var.searchPageStatus |= 1;
            d8w.INSTANCE.m114977Z(ah2Var.act(), ah2Var.pageType, new Function0() { // from class: l.pg2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ah2.m97735N0(this.f152222a);
                }
            }, new Function0() { // from class: l.qg2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ah2.m97736O0(this.f157372a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static void m97744l0(ah2 ah2Var, String str, uxj0 uxj0Var) {
        ((kg2) ah2Var.viewModel).m149717d0(str);
    }

    /* JADX INFO: renamed from: m0 */
    public static void m97745m0(ah2 ah2Var) {
        kg2 kg2Var;
        if (!k8w.INSTANCE.m148752a(ah2Var.act()) || (kg2Var = (kg2) ah2Var.viewModel) == null) {
            return;
        }
        kg2Var.mo99386q();
    }

    /* JADX INFO: renamed from: o0 */
    public static void m97747o0(ah2 ah2Var) {
        if (k8w.INSTANCE.m148752a(ah2Var.act())) {
            if (!Intrinsics.m88377d(ah2Var.pageType, "textBuzz")) {
                eqx eqxVarM134264B0 = haw.INSTANCE.m134320a().m134264B0();
                nbw.INSTANCE.m162229Y(ah2Var.pageType, eqxVarM134264B0.getUserId(), eqxVarM134264B0.getChannelToken(), ah2Var.localJoined);
            }
            ah2Var.m97769s0();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static Unit m97749q0(ah2 ah2Var) {
        Act act;
        if (k8w.INSTANCE.m148752a(ah2Var.act()) && (act = ah2Var.act()) != null) {
            act.m68056e2();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    public static void m97750r0(ah2 ah2Var, pf60 pf60Var) {
        if (Intrinsics.m88377d(ah2Var.pageType, "textBuzz")) {
            pf60Var.getClass();
            ah2Var.m97756F0(pf60Var);
            return;
        }
        String str = (String) pf60Var.f152156a;
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
                        S s = pf60Var.f152157b;
                        LoveBuzzPushData loveBuzzPushData = s instanceof LoveBuzzPushData ? (LoveBuzzPushData) s : null;
                        if (loveBuzzPushData != null) {
                            ah2Var.m97757G0(loveBuzzPushData);
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
            if (ah2Var.startSearchTime != 0) {
                nbw.INSTANCE.m162228X(pzi0.m174454o() - ah2Var.startSearchTime, ah2Var.pageType);
                ah2Var.startSearchTime = 0L;
            }
            ah2Var.m97756F0(pf60Var);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public static final void m97751y0(ah2 ah2Var, Dialog dialog, View view, int i, CharSequence charSequence) {
        LoveBuzzPushData loveBuzzPushData;
        if (i == 0) {
            LoveBuzzPushData loveBuzzPushData2 = new LoveBuzzPushData();
            pf60<String, Object> pf60VarM149696G = ((kg2) ah2Var.viewModel).m149696G();
            Object obj = pf60VarM149696G != null ? pf60VarM149696G.f152157b : null;
            loveBuzzPushData = obj instanceof LoveBuzzPushData ? (LoveBuzzPushData) obj : null;
            if (loveBuzzPushData != null) {
                loveBuzzPushData2.biz = loveBuzzPushData.biz;
                loveBuzzPushData2.channelToken = loveBuzzPushData.channelToken;
                loveBuzzPushData2.reaction = "accepted";
            }
            loveBuzzPushData2.buzzIntent = "intl.lovebuzz.react";
            i8w.INSTANCE.m139034f(loveBuzzPushData2);
            return;
        }
        if (i != 1) {
            return;
        }
        LoveBuzzPushData loveBuzzPushData3 = new LoveBuzzPushData();
        pf60<String, Object> pf60VarM149696G2 = ((kg2) ah2Var.viewModel).m149696G();
        Object obj2 = pf60VarM149696G2 != null ? pf60VarM149696G2.f152157b : null;
        loveBuzzPushData = obj2 instanceof LoveBuzzPushData ? (LoveBuzzPushData) obj2 : null;
        if (loveBuzzPushData != null) {
            loveBuzzPushData3.biz = loveBuzzPushData.biz;
            loveBuzzPushData3.channelToken = loveBuzzPushData.channelToken;
            loveBuzzPushData3.reaction = "rejected";
        }
        loveBuzzPushData3.buzzIntent = "intl.lovebuzz.react";
        i8w.INSTANCE.m139034f(loveBuzzPushData3);
    }

    /* JADX INFO: renamed from: A0 */
    public abstract boolean mo97752A0(@NotNull pf60<String, Object> pair);

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
    public final void m97756F0(pf60<String, Object> it) {
        boolean z;
        this.searchPageStatus |= 4;
        l51.m152890J(this.searchTimeOutRunnable);
        Object obj = it.f152157b;
        LoveBuzzPushData loveBuzzPushData = obj instanceof LoveBuzzPushData ? (LoveBuzzPushData) obj : null;
        if (NullChecker.m82486a(loveBuzzPushData)) {
            if (!Intrinsics.m88377d(loveBuzzPushData != null ? loveBuzzPushData.subType : null, StickerBundle.TYPE) || TextUtils.isEmpty(loveBuzzPushData.otherUsers)) {
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
        ((kg2) this.viewModel).mo99385j0(it, z);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m97757G0(LoveBuzzPushData data) {
        C22421c c22421cDuringCreated;
        C22421c c22421cObserveOn;
        final String str = data.userId;
        int i = this.searchPageStatus;
        if ((i & 16) > 0) {
            if (!Intrinsics.m88377d(haw.INSTANCE.m134320a().m134268F0(((kg2) this.viewModel).m149697H()), "rejected")) {
                ((kg2) this.viewModel).mo99381B();
                return;
            } else {
                o1j0.m165649w(R$string.f20999u0);
                ((kg2) this.viewModel).mo99386q();
                return;
            }
        }
        if ((i & 8) <= 0) {
            if (!data.needReact && TextUtils.isEmpty(data.subType) && Intrinsics.m88377d(data.reaction, "rejected")) {
                m97769s0();
                return;
            }
            return;
        }
        if (Intrinsics.m88377d(data.reaction, "accepted")) {
            ((kg2) this.viewModel).m149721k0();
            Act act = act();
            if (act == null || (c22421cDuringCreated = act.duringCreated(CoreModule.f18264c.f20381e0.m116527W9(str).timeout(5L, TimeUnit.SECONDS))) == null || (c22421cObserveOn = c22421cDuringCreated.observeOn(fo0.m126432a())) == null) {
                return;
            }
            c22421cObserveOn.subscribe(psd0.m173597H(new y20() { // from class: l.zg2
                @Override // p153l.y20
                public final void call(Object obj) {
                    ah2.m97744l0(this.f204250a, str, (uxj0) obj);
                }
            }, new y20() { // from class: l.ng2
                @Override // p153l.y20
                public final void call(Object obj) {
                    ah2.m97742j0(str, this, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005e  */
    /* JADX INFO: renamed from: H0 */
    public void mo97758H0() {
        kcg0 kcg0VarSubscribe;
        xa2.INSTANCE.m209830a("BaseBuzzSearchPresenter", "initData " + this);
        Act act = act();
        if (act == null) {
            kcg0VarSubscribe = null;
        } else {
            C22421c c22421cDuringCreated = act.duringCreated((C22421c) (Intrinsics.m88377d(this.pageType, "textBuzz") ? haw.INSTANCE.m134320a().m134319z0() : haw.INSTANCE.m134320a().m134266D0()));
            if (c22421cDuringCreated != null) {
                final Function1 function1 = new Function1() { // from class: l.sg2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ah2.m97739g0(this.f167786a, (pf60) obj);
                    }
                };
                C22421c c22421cFilter = c22421cDuringCreated.filter(new qcj() { // from class: l.tg2
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ah2.m97741i0(function1, obj);
                    }
                });
                if (c22421cFilter != null) {
                    kcg0VarSubscribe = c22421cFilter.subscribe(psd0.m173596G(new y20() { // from class: l.ug2
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            ah2.m97750r0(this.f178853a, (pf60) obj);
                        }
                    }));
                } else {
                    kcg0VarSubscribe = null;
                }
            } else {
                kcg0VarSubscribe = null;
            }
        }
        this.inviteSubscribe = kcg0VarSubscribe;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m97759I0(int status) {
        this.searchPageStatus = status | this.searchPageStatus;
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m97760J0() {
        return (this.searchPageStatus & 32) > 0;
    }

    /* JADX INFO: renamed from: L0 */
    public final void m97761L0() {
        l51.m152890J(this.connectTimeOutRunnable);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m97762P0(boolean z) {
        this.localJoined = z;
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m97763Q0(int i) {
        this.searchPageStatus = i;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m97764R0(@Nullable kcg0 kcg0Var) {
        this.searchSubscribe = kcg0Var;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m97765S0(long j) {
        this.startSearchTime = j;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX INFO: renamed from: U0 */
    public void mo97766U0() {
        int i;
        LoveBuzzData loveBuzzDataM134315v0;
        String str = this.pageType;
        int iHashCode = str.hashCode();
        if (iHashCode != -1019560155) {
            if (iHashCode != 1332422126) {
                if (iHashCode == 1740758636 && str.equals("memojiBuzz")) {
                    LoveBuzzData loveBuzzDataM134315v1 = haw.INSTANCE.m134320a().m134315v0();
                    if (loveBuzzDataM134315v1 != null) {
                        i = loveBuzzDataM134315v1.memojiBuzzPairFailHintTimeout;
                    } else {
                        i = 20;
                    }
                } else {
                    loveBuzzDataM134315v0 = haw.INSTANCE.m134320a().m134315v0();
                    if (loveBuzzDataM134315v0 != null) {
                        i = loveBuzzDataM134315v0.textBuzzPairFailHintTimeout;
                    } else {
                        i = 20;
                    }
                }
            } else if (str.equals("videoBuzz")) {
                LoveBuzzData loveBuzzDataM134315v2 = haw.INSTANCE.m134320a().m134315v0();
                if (loveBuzzDataM134315v2 != null) {
                    i = loveBuzzDataM134315v2.videoBuzzPairFailHintTimeout;
                } else {
                    i = 20;
                }
            } else {
                loveBuzzDataM134315v0 = haw.INSTANCE.m134320a().m134315v0();
                if (loveBuzzDataM134315v0 != null) {
                    i = loveBuzzDataM134315v0.textBuzzPairFailHintTimeout;
                } else {
                    i = 20;
                }
            }
        } else if (str.equals("voiceBuzz")) {
            LoveBuzzData loveBuzzDataM134315v3 = haw.INSTANCE.m134320a().m134315v0();
            if (loveBuzzDataM134315v3 != null) {
                i = loveBuzzDataM134315v3.voiceBuzzPairFailHintTimeout;
            } else {
                i = 20;
            }
        } else {
            loveBuzzDataM134315v0 = haw.INSTANCE.m134320a().m134315v0();
            if (loveBuzzDataM134315v0 != null) {
                i = loveBuzzDataM134315v0.textBuzzPairFailHintTimeout;
            } else {
                i = 20;
            }
        }
        xa2.INSTANCE.m209830a("BaseBuzzSearchPresenter", "startSearch page " + this.pageType + " time " + i);
        int i2 = i > 0 ? i : 20;
        l51.m152890J(this.searchTimeOutRunnable);
        l51.m152888H(act(), this.searchTimeOutRunnable, ((long) i2) * 1000);
    }

    /* JADX INFO: renamed from: V0 */
    public void mo97767V0() {
        l51.m152890J(this.searchTimeOutRunnable);
    }

    /* JADX INFO: renamed from: W0 */
    public final void m97768W0() {
        mo97767V0();
        this.searchPageStatus |= 2;
        if (k8w.INSTANCE.m148752a(act())) {
            d8w.INSTANCE.m114973V(act(), new Function0() { // from class: l.mg2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ah2.m97737e0(this.f136690a);
                }
            }, new Function0() { // from class: l.rg2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ah2.m97749q0(this.f162896a);
                }
            });
        }
    }

    @Override // p153l.k3m
    public void destroy() {
        if (!Intrinsics.m88377d(this.pageType, "textBuzz") && !m97773z0()) {
            BuzzMediaCallManager.m48119v(BuzzMediaCallManager.INSTANCE, 0, 1, null);
        }
        l51.m152890J(this.connectTimeOutRunnable);
        psd0.m173633z(this.inviteSubscribe);
        psd0.m173633z(this.searchSubscribe);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m97769s0() {
        kg2 kg2Var = (kg2) this.viewModel;
        if (kg2Var != null) {
            kg2Var.m149721k0();
        }
        o1j0.m165649w(R$string.f20954c1);
        BuzzMediaCallManager.INSTANCE.m48140V();
        l51.m152888H(act(), new Runnable() { // from class: l.yg2
            @Override // java.lang.Runnable
            public final void run() {
                ah2.m97745m0(this.f199697a);
            }
        }, 2000L);
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m97770t0() {
        int i = this.searchPageStatus;
        return (i & 4) <= 0 && (i & 8) <= 0 && (i & 1) <= 0 && (i & 2) <= 0 && (i & 128) <= 0 && (i & 64) <= 0;
    }

    /* JADX INFO: renamed from: u0 */
    public void mo97771u0(@NotNull pf60<String, Object> pair) {
        pair.getClass();
        this.searchPageStatus |= 64;
        int iM148756e = k8w.INSTANCE.m148756e(this.pageType);
        xa2.INSTANCE.m209830a("BaseBuzzSearchPresenter", "connectBuzz page " + this.pageType + " time " + iM148756e);
        l51.m152890J(this.connectTimeOutRunnable);
        l51.m152888H(act(), this.connectTimeOutRunnable, ((long) iM148756e) * 1000);
        this.connectTime = System.currentTimeMillis();
    }

    @NotNull
    /* JADX INFO: renamed from: x0 */
    public final Collection<pf60<String, x20>> m97772x0() {
        ArrayList arrayListM147507f0 = jyb.m147507f0(jyb.m147494Y("media buzz debug", new x20() { // from class: l.xg2
            @Override // p153l.x20
            public final void call() {
                ah2.m97740h0(this.f194128a);
            }
        }));
        arrayListM147507f0.getClass();
        return arrayListM147507f0;
    }

    /* JADX INFO: renamed from: z0 */
    public final boolean m97773z0() {
        return (this.searchPageStatus & 128) > 0;
    }
}
