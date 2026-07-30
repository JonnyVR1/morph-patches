package p006l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.ui.pricerecall.PriceRecallGetSurprise2Dialog;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import l.b1c0;
import l.cwf0;
import l.eqh0;
import l.i0e;
import l.i0g0;
import l.j6h0;
import l.m6h0;
import l.rxa0;
import l.szd;
import l.vwb;
import l.xdl0;
import l.y7c0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010)\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$¨\u0006*"}, d2 = {"Ll/i6h0;", "", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "e", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchidise", "", "j", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/Merchandise;)V", "", "deadLine", "i", "(I)V", "Lv/VImage;", "a", "Lv/VImage;", "g", "()Lv/VImage;", "set_close", "(Lv/VImage;)V", "_close", "Lv/VText;", "b", "Lv/VText;", "h", "()Lv/VText;", "set_sub_title", "(Lv/VText;)V", "_sub_title", "c", "f", "set_btn", "_btn", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i6h0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VImage _close;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _sub_title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _btn;

    /* JADX INFO: renamed from: a */
    public static boolean m16489a(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4 || dialogInterface == null) {
            return false;
        }
        dialogInterface.cancel();
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static void m16490b(szd szdVar, View view) {
        szdVar.cancel();
    }

    /* JADX INFO: renamed from: c */
    public static void m16491c(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.e(cwf0Var);
        rxa0.z(false);
    }

    /* JADX INFO: renamed from: d */
    public static void m16492d(Merchandise merchandise, Act act, szd szdVar, View view) {
        if (NullChecker.a(merchandise)) {
            m6h0.k(act, merchandise);
            zvf0.r("e_get_svip_freetrial", "p_get_svip_freetrial");
            szdVar.dismiss();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m16493e(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = j6h0.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final VText m16494f() {
        VText vText = this._btn;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final VImage m16495g() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final VText m16496h() {
        VText vText = this._sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_sub_title");
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final void m16497i(int deadLine) {
        VText vTextM16496h = m16496h();
        vTextM16496h.setText(i0g0.b0("优惠将于" + deadLine + "天后到期", CollectionsKt.arrayListOf(new String[]{deadLine + "天"}), Color.parseColor("#FE7E1D"), eqh0.c(2)));
    }

    /* JADX INFO: renamed from: j */
    public final void m16498j(@NotNull final Act act, @Nullable final Merchandise merchidise) {
        act.getClass();
        LayoutInflater layoutInflaterInflater = act.inflater();
        layoutInflaterInflater.getClass();
        View viewM16493e = m16493e(layoutInflaterInflater, null);
        final cwf0 cwf0VarC = i0e.c("p_get_svip_freetrial", PriceRecallGetSurprise2Dialog.class.getName());
        final Dialog dialogZ = act.dialog().P(viewM16493e, false).Z(17).B(false).i0(new DialogInterface.OnKeyListener() { // from class: l.e6h0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return i6h0.m16489a(dialogInterface, i, keyEvent);
            }
        }).L(y7c0.i).r(act.color(b1c0.g0)).V(new DialogInterface.OnDismissListener() { // from class: l.f6h0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i6h0.m16491c(cwf0VarC, dialogInterface);
            }
        }).z();
        dialogZ.getClass();
        xdl0.E0(m16495g(), new View.OnClickListener() { // from class: l.g6h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i6h0.m16490b(dialogZ, view);
            }
        });
        if (merchidise == null || vwb.J(merchidise.localCoupons)) {
            m16497i(1);
        } else {
            m16497i(m6h0.d((long) ((Coupon) merchidise.localCoupons.get(0)).endTime));
        }
        xdl0.E0(m16494f(), new View.OnClickListener() { // from class: l.h6h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i6h0.m16492d(merchidise, act, dialogZ, view);
            }
        });
        i0e.f(cwf0VarC);
        dialogZ.show();
    }
}
