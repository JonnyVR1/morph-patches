package p153l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.p058ui.pricerecall.PriceRecallGetSurprise2Dialog;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010)\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$¨\u0006*"}, m88121d2 = {"Ll/qeh0;", "", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "e", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchidise", "", "j", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/Merchandise;)V", "", "deadLine", RXScreenCaptureService.KEY_INDEX, "(I)V", "Lv/VImage;", "a", "Lv/VImage;", "g", "()Lv/VImage;", "set_close", "(Lv/VImage;)V", "_close", "Lv/VText;", "b", "Lv/VText;", "h", "()Lv/VText;", "set_sub_title", "(Lv/VText;)V", "_sub_title", "c", "f", "set_btn", "_btn", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class qeh0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VImage _close;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _sub_title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _btn;

    /* JADX INFO: renamed from: a */
    public static boolean m176240a(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4 || dialogInterface == null) {
            return false;
        }
        dialogInterface.cancel();
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static void m176241b(g1e g1eVar, View view) {
        g1eVar.cancel();
    }

    /* JADX INFO: renamed from: c */
    public static void m176242c(l4g0 l4g0Var, DialogInterface dialogInterface) {
        w1e.m204401e(l4g0Var);
        v5b0.m199800z(false);
    }

    /* JADX INFO: renamed from: d */
    public static void m176243d(Merchandise merchandise, Act act, g1e g1eVar, View view) {
        if (NullChecker.m82486a(merchandise)) {
            ueh0.m195757k(act, merchandise);
            i4g0.m138520r("e_get_svip_freetrial", "p_get_svip_freetrial");
            g1eVar.dismiss();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m176244e(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM181031b = reh0.m181031b(this, inflater, parent);
        viewM181031b.getClass();
        return viewM181031b;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final VText m176245f() {
        VText vText = this._btn;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final VImage m176246g() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final VText m176247h() {
        VText vText = this._sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_sub_title");
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final void m176248i(int deadLine) {
        VText vTextM176247h = m176247h();
        vTextM176247h.setText(q8g0.m175796b0("优惠将于" + deadLine + "天后到期", CollectionsKt.arrayListOf(deadLine + "天"), Color.parseColor("#FE7E1D"), lyh0.m156283c(2)));
    }

    /* JADX INFO: renamed from: j */
    public final void m176249j(@NotNull final Act act, @Nullable final Merchandise merchidise) {
        act.getClass();
        LayoutInflater layoutInflaterInflater = act.inflater();
        layoutInflaterInflater.getClass();
        View viewM176244e = m176244e(layoutInflaterInflater, null);
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_get_svip_freetrial", PriceRecallGetSurprise2Dialog.class.getName());
        final Dialog dialogM21566z = act.dialog().m21519P(viewM176244e, false).m21529Z(17).m21495B(false).m21538i0(new DialogInterface.OnKeyListener() { // from class: l.meh0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return qeh0.m176240a(dialogInterface, i, keyEvent);
            }
        }).m21515L(dgc0.f88285j).m21550r(act.color(h9c0.f108370g0)).m21525V(new DialogInterface.OnDismissListener() { // from class: l.neh0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                qeh0.m176242c(l4g0VarM204399c, dialogInterface);
            }
        }).m21566z();
        dialogM21566z.getClass();
        bnl0.m105509E0(m176246g(), new View.OnClickListener() { // from class: l.oeh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qeh0.m176241b(dialogM21566z, view);
            }
        });
        if (merchidise == null || jyb.m147479J(merchidise.localCoupons)) {
            m176248i(1);
        } else {
            m176248i(ueh0.m195750d((long) merchidise.localCoupons.get(0).endTime));
        }
        bnl0.m105509E0(m176245f(), new View.OnClickListener() { // from class: l.peh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qeh0.m176243d(merchidise, act, dialogM21566z, view);
            }
        });
        w1e.m204402f(l4g0VarM204399c);
        dialogM21566z.show();
    }
}
