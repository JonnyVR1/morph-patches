package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.StringRes;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallManageItemView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ)\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0013\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J)\u0010\u0014\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\tJ\u001f\u0010\u0018\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010!\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00162\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b%\u0010$J\u001f\u0010'\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u0016H\u0002¢\u0006\u0004\b'\u0010\u0019J\u001f\u0010(\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u0016H\u0002¢\u0006\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, m87232d2 = {"Ll/ob10;", "Ll/v5t;", "Ll/pc10;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "X", "()V", "init", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "call", "", "selfRole", "", "deputyCount", "P", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;Ljava/lang/String;I)V", j6f.LATITUDE_SOUTH, "U", "L", "", "isVisible", "W", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;Z)V", "Q", "isEnable", "M", "(Z)I", "isMute", "nameId", "enable", j6f.GPS_MEASUREMENT_INTERRUPTED, "(ZIZ)V", "N", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;Ljava/lang/String;)V", "K", "isAudienceSelfAndVoiceCall", j6f.GPS_DIRECTION_TRUE, "R", Constants.KEY_T, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "u", "Ljava/lang/String;", "operationType", "Ll/xh0;", ResourceDirection.f38808v, "Ll/xh0;", "switchVideoCallDlg", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ob10 extends v5t<pc10<?>> {

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public String operationType;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public xh0 switchVideoCallDlg;

    public ob10(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.operationType = "";
    }

    /* JADX INFO: renamed from: A */
    public static Boolean m163381A(BLiveMultiCall bLiveMultiCall, String str) {
        return Boolean.valueOf(TextUtils.equals(bLiveMultiCall.userId, str));
    }

    /* JADX INFO: renamed from: B */
    public static Unit m163382B(ob10 ob10Var, BLiveMultiCall bLiveMultiCall, String str, View view) {
        view.getClass();
        ob10Var.m163401N(bLiveMultiCall, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static Boolean m163383C(BLiveMultiCall bLiveMultiCall, String str) {
        return Boolean.valueOf(TextUtils.equals(bLiveMultiCall.ownerUserId, str));
    }

    /* JADX INFO: renamed from: E */
    public static Unit m163384E(ob10 ob10Var, BLiveMultiCall bLiveMultiCall, Pair pair, View view) {
        view.getClass();
        ((pc10) ob10Var.f47706b).m168289E4(bLiveMultiCall, pair, ob10Var.operationType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static Unit m163385F(boolean z, ob10 ob10Var, View view) {
        view.getClass();
        if (z) {
            ((pc10) ob10Var.f47706b).m168287C4();
        } else {
            lsi0.m151593w(R$string.f46652E7);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static Unit m163386G(ob10 ob10Var, BLiveMultiCall bLiveMultiCall, View view) {
        view.getClass();
        ((pc10) ob10Var.f47706b).m168288D4(bLiveMultiCall.userId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public static Unit m163387H(ob10 ob10Var, BLiveMultiCall bLiveMultiCall, View view) {
        view.getClass();
        ((pc10) ob10Var.f47706b).m168291G4(bLiveMultiCall);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O */
    public static final void m163390O(ob10 ob10Var, BLiveMultiCall bLiveMultiCall, String str, View view) {
        ob10Var.m163398K(bLiveMultiCall, str);
    }

    /* JADX INFO: renamed from: X */
    private final void m163391X() {
        Act act = getAct();
        if (act != null) {
            xh0 xh0VarM208722a = new xh0.C21150a(act).m208730i(R$string.f46674F7).m208726e(R$string.f46842N1).m208738q(R$string.f47319j8).m208736o(new View.OnClickListener() { // from class: l.cb10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ob10.m163392Y(this.f80096a, view);
                }
            }).m208722a();
            this.switchVideoCallDlg = xh0VarM208722a;
            if (xh0VarM208722a != null) {
                xh0VarM208722a.m208721g();
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public static final void m163392Y(ob10 ob10Var, View view) {
        ((pc10) ob10Var.f47706b).m168296L4();
    }

    /* JADX INFO: renamed from: v */
    public static Unit m163393v(ob10 ob10Var, BLiveMultiCall bLiveMultiCall, View view) {
        view.getClass();
        ((pc10) ob10Var.f47706b).m168297p4(bLiveMultiCall);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static Unit m163394w(boolean z, ob10 ob10Var, View view) {
        view.getClass();
        if (z) {
            ((pc10) ob10Var.f47706b).m168295K4();
        } else {
            lsi0.m151593w(R$string.f46652E7);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static Unit m163395x(ob10 ob10Var, View view) {
        view.getClass();
        ob10Var.m163391X();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static Unit m163396y(ob10 ob10Var, BLiveMultiCall bLiveMultiCall, View view) {
        view.getClass();
        P p = ob10Var.f47706b;
        p.getClass();
        zi10.m218893d(p, "invite_change_video", bLiveMultiCall);
        ((pc10) ob10Var.f47706b).m168286A4(bLiveMultiCall);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static Unit m163397z(BLiveMultiCall bLiveMultiCall, ob10 ob10Var, View view) {
        view.getClass();
        if (bLiveMultiCall.isLeadRole) {
            ((pc10) ob10Var.f47706b).m168298s4(bLiveMultiCall);
        } else {
            ((pc10) ob10Var.f47706b).m168293I4(bLiveMultiCall);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public final void m163398K(BLiveMultiCall call, String selfRole) {
        if (ve10.m198137k(selfRole) && r610.m177988W(call.userId)) {
            ((pc10) this.f47706b).m168299t4();
        }
        pc10 pc10Var = (pc10) this.f47706b;
        String str = call.f44400id;
        str.getClass();
        pc10Var.m168305z4(str);
        mo71727j();
    }

    /* JADX INFO: renamed from: L */
    public final void m163399L() {
        xh0 xh0Var = this.switchVideoCallDlg;
        if (xh0Var != null) {
            xh0Var.m208717c();
        }
    }

    /* JADX INFO: renamed from: M */
    public final int m163400M(boolean isEnable) {
        return isEnable ? h1c0.f105337U0 : h1c0.f105345Y0;
    }

    /* JADX INFO: renamed from: N */
    public final void m163401N(final BLiveMultiCall call, final String selfRole) {
        String strM202217t;
        P p = this.f47706b;
        p.getClass();
        zi10.m218893d(p, "connect_end", call);
        if (!Intrinsics.m87488d(call.userId, ypv.f199493a.m199309D0()) && rl10.m179774a(this.f47706b, call.userId)) {
            osi0.m165783g("PK中，请稍后再试");
            mo71727j();
            return;
        }
        Act act = getAct();
        if (act != null) {
            if (!ve10.m198137k(selfRole) || r610.m177988W(call.userId)) {
                strM202217t = w8u.m202217t(R$string.f47232f8);
                strM202217t.getClass();
            } else {
                int i = R$string.f47254g8;
                String str = call.userName;
                str.getClass();
                strM202217t = w8u.m202218u(i, r610.m178016w(str, 8));
                strM202217t.getClass();
            }
            if (rl10.m179774a(this.f47706b, ypv.f199493a.m199309D0())) {
                strM202217t = w8u.m202217t(R$string.f47452p9);
                strM202217t.getClass();
            }
            new xh0.C21150a(act.act()).m208731j(strM202217t).m208737p(h1c0.f105394p0).m208738q(R$string.f47577v2).m208736o(new View.OnClickListener() { // from class: l.eb10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ob10.m163390O(this.f90283a, call, selfRole, view);
                }
            }).m208725d(h1c0.f105343X0).m208726e(R$string.f46842N1).m208728g(false).m208722a().m208721g();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: P */
    public final void m163402P(@NotNull BLiveMultiCall call, @Nullable String selfRole, int deputyCount) {
        boolean zM177988W;
        call.getClass();
        if (Intrinsics.m87488d("friends", ((pc10) this.f47706b).m206027E2().mo149813j().liveMode)) {
            if (ve10.m198137k(selfRole)) {
                zM177988W = !r610.m177988W(call.userId);
            } else {
                zM177988W = r610.m177988W(call.userId);
            }
            xdl0.m208344M(this.f180126s, zM177988W);
        } else {
            xdl0.m208344M(this.f180126s, ve10.m198137k(selfRole) || r610.m177988W(call.userId));
        }
        xdl0.m208344M(this.f180123p, r610.m177988W(call.userId) && vg10.INSTANCE.m198314f(call));
        boolean z = r610.m177988W(call.userId) && ve10.m198132f(call);
        m163409W(call, z);
        m163403Q(call, z);
        m163405S(call, selfRole, deputyCount);
        m163406T(call, ve10.m198137k(selfRole) && !r610.m177988W(call.userId) && vg10.INSTANCE.m198314f(call));
        m163404R(call, z);
        this.f180116i.setText(kvc0.m147355d(((bgv) ypv.m215673l(fld0.f98151f)).m101734n() ? R$string.f46980Td : R$string.f47014V5));
    }

    /* JADX INFO: renamed from: Q */
    public final void m163403Q(BLiveMultiCall call, boolean isVisible) {
        xdl0.m208344M(this.f180121n, isVisible);
        if (isVisible) {
            final boolean zM198313e = vg10.m198313e(call);
            CallManageItemView callManageItemView = this.f180121n;
            callManageItemView.getClass();
            cxq.m109105c(callManageItemView, new Function1() { // from class: l.lb10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ob10.m163385F(zM198313e, this, (View) obj);
                }
            });
            this.f180121n.m75905g(R$string.f46601C0).m75907i(kvc0.m147352a(m163400M(zM198313e))).m75900b(zM198313e ? i3c0.f111095n1 : i3c0.f111107o1);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m163404R(final BLiveMultiCall call, boolean isAudienceSelfAndVoiceCall) {
        xdl0.m208344M(this.f180125r, isAudienceSelfAndVoiceCall);
        if (isAudienceSelfAndVoiceCall) {
            this.f180125r.m75905g(R$string.f46890P7).m75907i(kvc0.m147352a(m163400M(true))).m75900b(i3c0.f110797N3).m75904f(true).m75902d(w8u.m202218u(R$string.f46932R7, Long.valueOf(call.pushRemainCount))).m75903e(kvc0.m147352a(h1c0.f105339V0));
            CallManageItemView callManageItemView = this.f180125r;
            callManageItemView.getClass();
            cxq.m109105c(callManageItemView, new Function1() { // from class: l.nb10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ob10.m163393v(this.f137997a, call, (View) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m163405S(@NotNull final BLiveMultiCall call, @Nullable final String selfRole, int deputyCount) {
        call.getClass();
        this.f180115h.setText(call.userName);
        this.f180117j.setText(x8u.m207433c(call.receivedRewardPoint));
        hxs.m133406s("context_common", this.f180114g, call.userAvatar);
        LinearLayout linearLayout = this.f180113f;
        linearLayout.getClass();
        cxq.m109105c(linearLayout, new Function1() { // from class: l.fb10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ob10.m163386G(this.f96688a, call, (View) obj);
            }
        });
        CallManageItemView callManageItemView = this.f180118k;
        callManageItemView.getClass();
        cxq.m109105c(callManageItemView, new Function1() { // from class: l.gb10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ob10.m163387H(this.f101787a, call, (View) obj);
            }
        });
        CallManageItemView callManageItemView2 = this.f180126s;
        callManageItemView2.getClass();
        cxq.m109105c(callManageItemView2, new Function1() { // from class: l.hb10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ob10.m163382B(this.f106874a, call, selfRole, (View) obj);
            }
        });
        m163404R(call, r610.m177988W(call.userId) && Intrinsics.m87488d(s410.f162240f, selfRole));
        m163407U(call, selfRole, deputyCount);
        final Pair<String, Boolean> pairM177971F = r610.m177971F(call, selfRole);
        CallManageItemView callManageItemView3 = this.f180119l;
        if (pairM177971F == null) {
            xdl0.m208344M(callManageItemView3, false);
            return;
        }
        xdl0.m208344M(callManageItemView3, true);
        if (ve10.m198138l((String) pairM177971F.first) || ve10.m198131e((String) pairM177971F.first) || ve10.m198130d((String) pairM177971F.first)) {
            if (((Boolean) pairM177971F.second).booleanValue()) {
                this.operationType = "open_other_voice";
                m163408V(true, R$string.f47145b9, true);
            } else {
                this.operationType = "close_other_voice";
                m163408V(false, R$string.f46785K8, true);
            }
        } else if (ve10.m198139m((String) pairM177971F.first)) {
            if (vwb.m200293G(call.mutedByUserIds, new w9j() { // from class: l.ib10
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ob10.m163381A(call, (String) obj);
                }
            }) >= 0) {
                m163408V(true, R$string.f46719H8, false);
            } else if (((Boolean) pairM177971F.second).booleanValue()) {
                this.operationType = "open_other_micro";
                m163408V(true, R$string.f47123a9, true);
            } else {
                this.operationType = "close_other_micro";
                m163408V(false, R$string.f47276h8, true);
            }
        } else if (!ve10.m198134h((String) pairM177971F.first)) {
            xdl0.m208344M(this.f180119l, false);
        } else if (vwb.m200293G(call.mutedByUserIds, new w9j() { // from class: l.jb10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ob10.m163383C(call, (String) obj);
            }
        }) >= 0) {
            m163408V(true, R$string.f46741I8, false);
        } else if (((Boolean) pairM177971F.second).booleanValue()) {
            this.operationType = "open_own_micro";
            m163408V(true, R$string.f47167c9, true);
        } else {
            this.operationType = "close_own_micro";
            m163408V(false, R$string.f47298i8, true);
        }
        CallManageItemView callManageItemView4 = this.f180119l;
        callManageItemView4.getClass();
        cxq.m109105c(callManageItemView4, new Function1() { // from class: l.kb10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ob10.m163384E(this.f122179a, call, pairM177971F, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public final void m163406T(final BLiveMultiCall call, boolean isAudienceSelfAndVoiceCall) {
        xdl0.m208344M(this.f180124q, isAudienceSelfAndVoiceCall);
        if (isAudienceSelfAndVoiceCall) {
            this.f180124q.m75905g(R$string.f46826M6).m75907i(kvc0.m147352a(m163400M(true))).m75900b(i3c0.f111119p1);
            CallManageItemView callManageItemView = this.f180124q;
            callManageItemView.getClass();
            cxq.m109105c(callManageItemView, new Function1() { // from class: l.mb10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ob10.m163396y(this.f132981a, call, (View) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m163407U(@NotNull final BLiveMultiCall call, @Nullable String selfRole, int deputyCount) {
        call.getClass();
        boolean z = deputyCount > 4 && ve10.m198137k(selfRole);
        xdl0.m208344M(this.f180120m, z);
        if (z) {
            this.f180120m.m75905g(call.isLeadRole ? R$string.f47016V7 : R$string.f47364l9);
        }
        CallManageItemView callManageItemView = this.f180120m;
        callManageItemView.getClass();
        cxq.m109105c(callManageItemView, new Function1() { // from class: l.db10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ob10.m163397z(call, this, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public final void m163408V(boolean isMute, @StringRes int nameId, boolean enable) {
        int i = isMute ? i3c0.f110875U3 : i3c0.f111227y1;
        xdl0.m208411y(this.f180119l, enable);
        this.f180119l.m75900b(i).m75906h(w8u.m202217t(nameId)).m75907i(kvc0.m147352a(m163400M(!isMute)));
    }

    /* JADX INFO: renamed from: W */
    public final void m163409W(BLiveMultiCall call, boolean isVisible) {
        xdl0.m208344M(this.f180122o, isVisible);
        if (isVisible) {
            final boolean zM198313e = vg10.m198313e(call);
            this.f180122o.m75905g(R$string.f46583B4).m75907i(kvc0.m147352a(m163400M(zM198313e))).m75900b(zM198313e ? i3c0.f110663C1 : i3c0.f110675D1);
            CallManageItemView callManageItemView = this.f180122o;
            callManageItemView.getClass();
            cxq.m109105c(callManageItemView, new Function1() { // from class: l.bb10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ob10.m163394w(zM198313e, this, (View) obj);
                }
            });
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p149l.vpl
    public void init() {
        super.init();
        this.f180118k.m75905g(R$string.f47390md).m75900b(i3c0.f110941a3);
        this.f180126s.m75905g(R$string.f46561A4).m75900b(i3c0.f111155s1);
        this.f180123p.m75905g(R$string.f46630D7).m75900b(i3c0.f111119p1);
        this.f180120m.m75900b(i3c0.f110897W3);
        CallManageItemView callManageItemView = this.f180123p;
        callManageItemView.getClass();
        cxq.m109105c(callManageItemView, new Function1() { // from class: l.ab10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ob10.m163395x(this.f68618a, (View) obj);
            }
        });
    }
}
