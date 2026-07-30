package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.StringRes;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallManageItemView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ)\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0013\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J)\u0010\u0014\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\tJ\u001f\u0010\u0018\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010!\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00162\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b%\u0010$J\u001f\u0010'\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u0016H\u0002¢\u0006\u0004\b'\u0010\u0019J\u001f\u0010(\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u0016H\u0002¢\u0006\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, m88121d2 = {"Ll/yj10;", "Ll/w7t;", "Ll/zk10;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "X", "()V", "init", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "call", "", "selfRole", "", "deputyCount", "P", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;Ljava/lang/String;I)V", p7f.LATITUDE_SOUTH, "U", "L", "", "isVisible", "W", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;Z)V", "Q", "isEnable", "M", "(Z)I", "isMute", "nameId", "enable", p7f.GPS_MEASUREMENT_INTERRUPTED, "(ZIZ)V", "N", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;Ljava/lang/String;)V", "K", "isAudienceSelfAndVoiceCall", p7f.GPS_DIRECTION_TRUE, "R", Constants.KEY_T, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "u", "Ljava/lang/String;", "operationType", "Ll/th0;", ResourceDirection.f39656v, "Ll/th0;", "switchVideoCallDlg", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class yj10 extends w7t<zk10<?>> {

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public String operationType;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public th0 switchVideoCallDlg;

    public yj10(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.operationType = "";
    }

    /* JADX INFO: renamed from: A */
    public static Boolean m216355A(BLiveMultiCall bLiveMultiCall, String str) {
        return Boolean.valueOf(TextUtils.equals(bLiveMultiCall.userId, str));
    }

    /* JADX INFO: renamed from: B */
    public static Unit m216356B(yj10 yj10Var, BLiveMultiCall bLiveMultiCall, String str, View view) {
        view.getClass();
        yj10Var.m216375N(bLiveMultiCall, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static Boolean m216357C(BLiveMultiCall bLiveMultiCall, String str) {
        return Boolean.valueOf(TextUtils.equals(bLiveMultiCall.ownerUserId, str));
    }

    /* JADX INFO: renamed from: E */
    public static Unit m216358E(yj10 yj10Var, BLiveMultiCall bLiveMultiCall, Pair pair, View view) {
        view.getClass();
        ((zk10) yj10Var.f48554b).m220032E4(bLiveMultiCall, pair, yj10Var.operationType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static Unit m216359F(boolean z, yj10 yj10Var, View view) {
        view.getClass();
        if (z) {
            ((zk10) yj10Var.f48554b).m220030C4();
        } else {
            o1j0.m165649w(R$string.f47500E7);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static Unit m216360G(yj10 yj10Var, BLiveMultiCall bLiveMultiCall, View view) {
        view.getClass();
        ((zk10) yj10Var.f48554b).m220031D4(bLiveMultiCall.userId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public static Unit m216361H(yj10 yj10Var, BLiveMultiCall bLiveMultiCall, View view) {
        view.getClass();
        ((zk10) yj10Var.f48554b).m220034G4(bLiveMultiCall);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O */
    public static final void m216364O(yj10 yj10Var, BLiveMultiCall bLiveMultiCall, String str, View view) {
        yj10Var.m216372K(bLiveMultiCall, str);
    }

    /* JADX INFO: renamed from: X */
    private final void m216365X() {
        Act act = getAct();
        if (act != null) {
            th0 th0VarM191142a = new th0.C20312a(act).m191150i(R$string.f47522F7).m191146e(R$string.f47690N1).m191158q(R$string.f48167j8).m191156o(new View.OnClickListener() { // from class: l.mj10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    yj10.m216366Y(this.f137049a, view);
                }
            }).m191142a();
            this.switchVideoCallDlg = th0VarM191142a;
            if (th0VarM191142a != null) {
                th0VarM191142a.m191141g();
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public static final void m216366Y(yj10 yj10Var, View view) {
        ((zk10) yj10Var.f48554b).m220039L4();
    }

    /* JADX INFO: renamed from: v */
    public static Unit m216367v(yj10 yj10Var, BLiveMultiCall bLiveMultiCall, View view) {
        view.getClass();
        ((zk10) yj10Var.f48554b).m220040p4(bLiveMultiCall);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static Unit m216368w(boolean z, yj10 yj10Var, View view) {
        view.getClass();
        if (z) {
            ((zk10) yj10Var.f48554b).m220038K4();
        } else {
            o1j0.m165649w(R$string.f47500E7);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static Unit m216369x(yj10 yj10Var, View view) {
        view.getClass();
        yj10Var.m216365X();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static Unit m216370y(yj10 yj10Var, BLiveMultiCall bLiveMultiCall, View view) {
        view.getClass();
        P p = yj10Var.f48554b;
        p.getClass();
        jr10.m146657d(p, "invite_change_video", bLiveMultiCall);
        ((zk10) yj10Var.f48554b).m220029A4(bLiveMultiCall);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static Unit m216371z(BLiveMultiCall bLiveMultiCall, yj10 yj10Var, View view) {
        view.getClass();
        if (bLiveMultiCall.isLeadRole) {
            ((zk10) yj10Var.f48554b).m220041s4(bLiveMultiCall);
        } else {
            ((zk10) yj10Var.f48554b).m220036I4(bLiveMultiCall);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public final void m216372K(BLiveMultiCall call, String selfRole) {
        if (fn10.m126343k(selfRole) && bf10.m103817W(call.userId)) {
            ((zk10) this.f48554b).m220042t4();
        }
        zk10 zk10Var = (zk10) this.f48554b;
        String str = call.f45248id;
        str.getClass();
        zk10Var.m220048z4(str);
        mo72910j();
    }

    /* JADX INFO: renamed from: L */
    public final void m216373L() {
        th0 th0Var = this.switchVideoCallDlg;
        if (th0Var != null) {
            th0Var.m191137c();
        }
    }

    /* JADX INFO: renamed from: M */
    public final int m216374M(boolean isEnable) {
        return isEnable ? n9c0.f140798U0 : n9c0.f140806Y0;
    }

    /* JADX INFO: renamed from: N */
    public final void m216375N(final BLiveMultiCall call, final String selfRole) {
        String strM209910t;
        P p = this.f48554b;
        p.getClass();
        jr10.m146657d(p, "connect_end", call);
        if (!Intrinsics.m88377d(call.userId, zrv.f205799a.m207631D0()) && bu10.m106416a(this.f48554b, call.userId)) {
            r1j0.m179420g("PK中，请稍后再试");
            mo72910j();
            return;
        }
        Act act = getAct();
        if (act != null) {
            if (!fn10.m126343k(selfRole) || bf10.m103817W(call.userId)) {
                strM209910t = xau.m209910t(R$string.f48080f8);
                strM209910t.getClass();
            } else {
                int i = R$string.f48102g8;
                String str = call.userName;
                str.getClass();
                strM209910t = xau.m209911u(i, bf10.m103845w(str, 8));
                strM209910t.getClass();
            }
            if (bu10.m106416a(this.f48554b, zrv.f205799a.m207631D0())) {
                strM209910t = xau.m209910t(R$string.f48300p9);
                strM209910t.getClass();
            }
            new th0.C20312a(act.act()).m191151j(strM209910t).m191157p(n9c0.f140855p0).m191158q(R$string.f48425v2).m191156o(new View.OnClickListener() { // from class: l.oj10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    yj10.m216364O(this.f147628a, call, selfRole, view);
                }
            }).m191145d(n9c0.f140804X0).m191146e(R$string.f47690N1).m191148g(false).m191142a().m191141g();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: P */
    public final void m216376P(@NotNull BLiveMultiCall call, @Nullable String selfRole, int deputyCount) {
        boolean zM103817W;
        call.getClass();
        if (Intrinsics.m88377d("friends", ((zk10) this.f48554b).m213810E2().mo183435j().liveMode)) {
            if (fn10.m126343k(selfRole)) {
                zM103817W = !bf10.m103817W(call.userId);
            } else {
                zM103817W = bf10.m103817W(call.userId);
            }
            bnl0.m105524M(this.f187803s, zM103817W);
        } else {
            bnl0.m105524M(this.f187803s, fn10.m126343k(selfRole) || bf10.m103817W(call.userId));
        }
        bnl0.m105524M(this.f187800p, bf10.m103817W(call.userId) && fp10.INSTANCE.m126519f(call));
        boolean z = bf10.m103817W(call.userId) && fn10.m126338f(call);
        m216383W(call, z);
        m216377Q(call, z);
        m216379S(call, selfRole, deputyCount);
        m216380T(call, fn10.m126343k(selfRole) && !bf10.m103817W(call.userId) && fp10.INSTANCE.m126519f(call));
        m216378R(call, z);
        this.f187793i.setText(n3d0.m161280d(((civ) zrv.m221194l(htd0.f111524f)).m109970n() ? R$string.f47828Td : R$string.f47862V5));
    }

    /* JADX INFO: renamed from: Q */
    public final void m216377Q(BLiveMultiCall call, boolean isVisible) {
        bnl0.m105524M(this.f187798n, isVisible);
        if (isVisible) {
            final boolean zM126518e = fp10.m126518e(call);
            CallManageItemView callManageItemView = this.f187798n;
            callManageItemView.getClass();
            czq.m113347c(callManageItemView, new Function1() { // from class: l.vj10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return yj10.m216359F(zM126518e, this, (View) obj);
                }
            });
            this.f187798n.m77088g(R$string.f47449C0).m77090i(n3d0.m161277a(m216374M(zM126518e))).m77083b(zM126518e ? obc0.f146423n1 : obc0.f146435o1);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m216378R(final BLiveMultiCall call, boolean isAudienceSelfAndVoiceCall) {
        bnl0.m105524M(this.f187802r, isAudienceSelfAndVoiceCall);
        if (isAudienceSelfAndVoiceCall) {
            this.f187802r.m77088g(R$string.f47738P7).m77090i(n3d0.m161277a(m216374M(true))).m77083b(obc0.f146125N3).m77087f(true).m77085d(xau.m209911u(R$string.f47780R7, Long.valueOf(call.pushRemainCount))).m77086e(n3d0.m161277a(n9c0.f140800V0));
            CallManageItemView callManageItemView = this.f187802r;
            callManageItemView.getClass();
            czq.m113347c(callManageItemView, new Function1() { // from class: l.xj10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return yj10.m216367v(this.f194532a, call, (View) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m216379S(@NotNull final BLiveMultiCall call, @Nullable final String selfRole, int deputyCount) {
        call.getClass();
        this.f187792h.setText(call.userName);
        this.f187794j.setText(yau.m214935c(call.receivedRewardPoint));
        izs.m142868s("context_common", this.f187791g, call.userAvatar);
        LinearLayout linearLayout = this.f187790f;
        linearLayout.getClass();
        czq.m113347c(linearLayout, new Function1() { // from class: l.pj10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return yj10.m216360G(this.f152645a, call, (View) obj);
            }
        });
        CallManageItemView callManageItemView = this.f187795k;
        callManageItemView.getClass();
        czq.m113347c(callManageItemView, new Function1() { // from class: l.qj10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return yj10.m216361H(this.f157912a, call, (View) obj);
            }
        });
        CallManageItemView callManageItemView2 = this.f187803s;
        callManageItemView2.getClass();
        czq.m113347c(callManageItemView2, new Function1() { // from class: l.rj10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return yj10.m216356B(this.f163408a, call, selfRole, (View) obj);
            }
        });
        m216378R(call, bf10.m103817W(call.userId) && Intrinsics.m88377d(cd10.f81078f, selfRole));
        m216381U(call, selfRole, deputyCount);
        final Pair<String, Boolean> pairM103800F = bf10.m103800F(call, selfRole);
        CallManageItemView callManageItemView3 = this.f187796l;
        if (pairM103800F == null) {
            bnl0.m105524M(callManageItemView3, false);
            return;
        }
        bnl0.m105524M(callManageItemView3, true);
        if (fn10.m126344l((String) pairM103800F.first) || fn10.m126337e((String) pairM103800F.first) || fn10.m126336d((String) pairM103800F.first)) {
            if (((Boolean) pairM103800F.second).booleanValue()) {
                this.operationType = "open_other_voice";
                m216382V(true, R$string.f47993b9, true);
            } else {
                this.operationType = "close_other_voice";
                m216382V(false, R$string.f47633K8, true);
            }
        } else if (fn10.m126345m((String) pairM103800F.first)) {
            if (jyb.m147476G(call.mutedByUserIds, new qcj() { // from class: l.sj10
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return yj10.m216355A(call, (String) obj);
                }
            }) >= 0) {
                m216382V(true, R$string.f47567H8, false);
            } else if (((Boolean) pairM103800F.second).booleanValue()) {
                this.operationType = "open_other_micro";
                m216382V(true, R$string.f47971a9, true);
            } else {
                this.operationType = "close_other_micro";
                m216382V(false, R$string.f48124h8, true);
            }
        } else if (!fn10.m126340h((String) pairM103800F.first)) {
            bnl0.m105524M(this.f187796l, false);
        } else if (jyb.m147476G(call.mutedByUserIds, new qcj() { // from class: l.tj10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return yj10.m216357C(call, (String) obj);
            }
        }) >= 0) {
            m216382V(true, R$string.f47589I8, false);
        } else if (((Boolean) pairM103800F.second).booleanValue()) {
            this.operationType = "open_own_micro";
            m216382V(true, R$string.f48015c9, true);
        } else {
            this.operationType = "close_own_micro";
            m216382V(false, R$string.f48146i8, true);
        }
        CallManageItemView callManageItemView4 = this.f187796l;
        callManageItemView4.getClass();
        czq.m113347c(callManageItemView4, new Function1() { // from class: l.uj10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return yj10.m216358E(this.f179169a, call, pairM103800F, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public final void m216380T(final BLiveMultiCall call, boolean isAudienceSelfAndVoiceCall) {
        bnl0.m105524M(this.f187801q, isAudienceSelfAndVoiceCall);
        if (isAudienceSelfAndVoiceCall) {
            this.f187801q.m77088g(R$string.f47674M6).m77090i(n3d0.m161277a(m216374M(true))).m77083b(obc0.f146447p1);
            CallManageItemView callManageItemView = this.f187801q;
            callManageItemView.getClass();
            czq.m113347c(callManageItemView, new Function1() { // from class: l.wj10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return yj10.m216370y(this.f189409a, call, (View) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m216381U(@NotNull final BLiveMultiCall call, @Nullable String selfRole, int deputyCount) {
        call.getClass();
        boolean z = deputyCount > 4 && fn10.m126343k(selfRole);
        bnl0.m105524M(this.f187797m, z);
        if (z) {
            this.f187797m.m77088g(call.isLeadRole ? R$string.f47864V7 : R$string.f48212l9);
        }
        CallManageItemView callManageItemView = this.f187797m;
        callManageItemView.getClass();
        czq.m113347c(callManageItemView, new Function1() { // from class: l.nj10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return yj10.m216371z(call, this, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public final void m216382V(boolean isMute, @StringRes int nameId, boolean enable) {
        int i = isMute ? obc0.f146203U3 : obc0.f146555y1;
        bnl0.m105591y(this.f187796l, enable);
        this.f187796l.m77083b(i).m77089h(xau.m209910t(nameId)).m77090i(n3d0.m161277a(m216374M(!isMute)));
    }

    /* JADX INFO: renamed from: W */
    public final void m216383W(BLiveMultiCall call, boolean isVisible) {
        bnl0.m105524M(this.f187799o, isVisible);
        if (isVisible) {
            final boolean zM126518e = fp10.m126518e(call);
            this.f187799o.m77088g(R$string.f47431B4).m77090i(n3d0.m161277a(m216374M(zM126518e))).m77083b(zM126518e ? obc0.f145991C1 : obc0.f146003D1);
            CallManageItemView callManageItemView = this.f187799o;
            callManageItemView.getClass();
            czq.m113347c(callManageItemView, new Function1() { // from class: l.lj10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return yj10.m216368w(zM126518e, this, (View) obj);
                }
            });
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p153l.isl
    public void init() {
        super.init();
        this.f187795k.m77088g(R$string.f48238md).m77083b(obc0.f146269a3);
        this.f187803s.m77088g(R$string.f47409A4).m77083b(obc0.f146483s1);
        this.f187800p.m77088g(R$string.f47478D7).m77083b(obc0.f146447p1);
        this.f187797m.m77083b(obc0.f146225W3);
        CallManageItemView callManageItemView = this.f187800p;
        callManageItemView.getClass();
        czq.m113347c(callManageItemView, new Function1() { // from class: l.kj10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return yj10.m216369x(this.f127063a, (View) obj);
            }
        });
    }
}
