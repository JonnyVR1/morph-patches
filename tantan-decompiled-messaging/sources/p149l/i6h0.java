package p149l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.p053ui.pricerecall.PriceRecallGetSurprise2Dialog;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010)\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$¨\u0006*"}, m87232d2 = {"Ll/i6h0;", "", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "e", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchidise", "", "j", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/Merchandise;)V", "", "deadLine", RXScreenCaptureService.KEY_INDEX, "(I)V", "Lv/VImage;", "a", "Lv/VImage;", "g", "()Lv/VImage;", "set_close", "(Lv/VImage;)V", "_close", "Lv/VText;", "b", "Lv/VText;", "h", "()Lv/VText;", "set_sub_title", "(Lv/VText;)V", "_sub_title", "c", "f", "set_btn", "_btn", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class i6h0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VImage _close;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _sub_title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _btn;

    /* JADX INFO: renamed from: a */
    public static boolean m134611a(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4 || dialogInterface == null) {
            return false;
        }
        dialogInterface.cancel();
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static void m134612b(szd szdVar, View view) {
        szdVar.cancel();
    }

    /* JADX INFO: renamed from: c */
    public static void m134613c(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.m133796e(cwf0Var);
        rxa0.m181505z(false);
    }

    /* JADX INFO: renamed from: d */
    public static void m134614d(Merchandise merchandise, Act act, szd szdVar, View view) {
        if (NullChecker.m81303a(merchandise)) {
            m6h0.m153225k(act, merchandise);
            zvf0.m220396r("e_get_svip_freetrial", "p_get_svip_freetrial");
            szdVar.dismiss();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m134615e(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM140030b = j6h0.m140030b(this, inflater, parent);
        viewM140030b.getClass();
        return viewM140030b;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final VText m134616f() {
        VText vText = this._btn;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final VImage m134617g() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final VText m134618h() {
        VText vText = this._sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_sub_title");
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final void m134619i(int deadLine) {
        VText vTextM134618h = m134618h();
        vTextM134618h.setText(i0g0.m133861b0("优惠将于" + deadLine + "天后到期", CollectionsKt.arrayListOf(deadLine + "天"), Color.parseColor("#FE7E1D"), eqh0.m117752c(2)));
    }

    /* JADX INFO: renamed from: j */
    public final void m134620j(@NotNull final Act act, @Nullable final Merchandise merchidise) {
        act.getClass();
        LayoutInflater layoutInflaterInflater = act.inflater();
        layoutInflaterInflater.getClass();
        View viewM134615e = m134615e(layoutInflaterInflater, null);
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_get_svip_freetrial", PriceRecallGetSurprise2Dialog.class.getName());
        final Dialog dialogM20567z = act.dialog().m20520P(viewM134615e, false).m20530Z(17).m20496B(false).m20539i0(new DialogInterface.OnKeyListener() { // from class: l.e6h0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return i6h0.m134611a(dialogInterface, i, keyEvent);
            }
        }).m20516L(y7c0.f196699i).m20551r(act.color(b1c0.f72550g0)).m20526V(new DialogInterface.OnDismissListener() { // from class: l.f6h0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i6h0.m134613c(cwf0VarM133794c, dialogInterface);
            }
        }).m20567z();
        dialogM20567z.getClass();
        xdl0.m208329E0(m134617g(), new View.OnClickListener() { // from class: l.g6h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i6h0.m134612b(dialogM20567z, view);
            }
        });
        if (merchidise == null || vwb.m200296J(merchidise.localCoupons)) {
            m134619i(1);
        } else {
            m134619i(m6h0.m153218d((long) merchidise.localCoupons.get(0).endTime));
        }
        xdl0.m208329E0(m134616f(), new View.OnClickListener() { // from class: l.h6h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i6h0.m134614d(merchidise, act, dialogM20567z, view);
            }
        });
        i0e.m133797f(cwf0VarM133794c);
        dialogM20567z.show();
    }
}
