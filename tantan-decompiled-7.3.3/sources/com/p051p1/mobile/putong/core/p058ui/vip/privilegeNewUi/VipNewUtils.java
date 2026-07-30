package com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.p058ui.vip.VipItemDetailPage;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.VipNewUtils;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p153l.a690;
import p153l.bnl0;
import p153l.gbc0;
import p153l.gta;
import p153l.i4g0;
import p153l.joa;
import p153l.jyb;
import p153l.l4g0;
import p153l.pec0;
import p153l.qj90;
import p153l.sqk;
import p153l.uqb0;
import p153l.w1e;
import p153l.x20;

/* JADX INFO: loaded from: classes12.dex */
public class VipNewUtils {

    public enum SVipIconSize {
        SMALL,
        MID,
        LARGE
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.VipNewUtils$a */
    public static /* synthetic */ class C9181a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38717a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f38717a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38717a[PurchaseType.TYPE_GET_VIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38717a[PurchaseType.TYPE_GET_BOOST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38717a[PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38717a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38717a[PurchaseType.TYPE_ROAMING_PKG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f38717a[PurchaseType.TYPE_SUPERLIKE_PKG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f38717a[PurchaseType.TYPE_LIKENOLIMIT_PKG.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f38717a[PurchaseType.TYPE_UNDO_PKG.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m58687a(Dialog dialog, PurchaseType purchaseType, Act act) {
        dialog.dismiss();
        if (PurchaseType.TYPE_GET_BOOST == purchaseType) {
            CoreModule.m30933P().m143410g().mo36069na(act, "p_wallet,vas");
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m58689c(String str, Context context, View view) {
        if (TextUtils.equals(str, CoreModule.m30933P().m143405a().mo34342Ie()) || TextUtils.equals(str, CoreModule.m30933P().m143405a().mo34318F0()) || TextUtils.equals(str, CoreModule.m30933P().m143405a().mo34450Y3()) || TextUtils.equals(str, CoreModule.m30933P().m143405a().mo34319F2()) || TextUtils.equals(str, CoreModule.m30933P().m143405a().mo34384O1()) || TextUtils.equals(str, CoreModule.m30933P().m143405a().mo34333H9())) {
            if (TextUtils.equals(str, CoreModule.m30933P().m143405a().mo34333H9()) && (bnl0.m105506D(context) instanceof Act)) {
                CoreModule.m30933P().m143405a().mo34572qd(context, "p_navigation_view,e_intl_ultra_badge,click", str);
            } else if (!TextUtils.equals(str, CoreModule.m30933P().m143405a().mo34319F2()) || CoreModule.m30933P().m143410g().mo36054cf()) {
                CoreModule.m30933P().m143405a().mo34572qd(context, "p_privilege,icon", str);
            } else {
                CoreModule.m30933P().m143405a().mo34572qd(context, "p_privilege,icon", CoreModule.m30933P().m143405a().mo34450Y3());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m58690d(final Context context, View view, final String str) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.hul0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VipNewUtils.m58689c(str, context, view2);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static String m58691e(Context context) {
        return context == null ? "" : String.format("%s\n%s", context.getString(R$string.f21312C0), context.getString(R$string.f21332J));
    }

    @DrawableRes
    /* JADX INFO: renamed from: f */
    public static int m58692f() {
        return CoreModule.m30933P().m143405a().mo34510h5() ? gbc0.f103446y5 : gbc0.f103439x5;
    }

    @DrawableRes
    /* JADX INFO: renamed from: g */
    public static int m58693g() {
        return m58694h(null);
    }

    @DrawableRes
    /* JADX INFO: renamed from: h */
    public static int m58694h(SVipIconSize sVipIconSize) {
        return gbc0.f103326j0;
    }

    @DrawableRes
    /* JADX INFO: renamed from: i */
    public static int m58695i() {
        if (gta.m132210e().m132214d().mo34702I4()) {
            return gbc0.f103435x1;
        }
        return CoreModule.m30933P().m143405a().mo34510h5() ? gbc0.f103105E5 : gbc0.f103318i0;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m58696j(PurchaseType purchaseType) {
        switch (C9181a.f38717a[purchaseType.ordinal()]) {
            case 1:
                return CoreModule.m30933P().m143405a().mo34296Bn() - uqb0.f180376H.guessedCurrentServerTime() >= 0;
            case 2:
                if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9())) {
                    return CoreModule.f18264c.f20381e0.m116600p9().isVIP();
                }
                return false;
            case 3:
                return !CoreModule.m30933P().m143405a().mo34589s8();
            case 4:
                return CoreModule.m30933P().m143405a().mo34637z9() && CoreModule.m30933P().m143405a().mo34547m9() > 0;
            case 5:
                return !joa.m146386f4();
            case 6:
            case 7:
            case 8:
            case 9:
                return qj90.m176829a(purchaseType);
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m58697k(Context context, User user, ImageView imageView, boolean z) {
        if (!user.isMe() && (user.isHideIconFromSVip() || user.gpHideVip())) {
            bnl0.m105524M(imageView, false);
            return;
        }
        bnl0.m105524M(imageView, true);
        if (!joa.m146386f4()) {
            if (gta.m132210e().m132214d().mo34702I4()) {
                imageView.setImageDrawable(context.getDrawable(gbc0.f103407t1));
            } else {
                imageView.setImageDrawable(context.getDrawable(gbc0.f103371o5));
            }
            m58690d(context, imageView, CoreModule.m30933P().m143405a().mo34342Ie());
            return;
        }
        if (!z) {
            bnl0.m105524M(imageView, false);
            return;
        }
        if (user.isVIP()) {
            if (gta.m132210e().m132214d().mo34702I4()) {
                imageView.setImageDrawable(context.getDrawable(gbc0.f103414u1));
                return;
            } else {
                imageView.setImageDrawable(context.getDrawable(gbc0.f103084B5));
                return;
            }
        }
        if (CoreModule.m30933P().m143410g().mo36054cf() && joa.m146376a4()) {
            imageView.setImageDrawable(context.getDrawable(gta.m132210e().m132214d().mo34702I4() ? gbc0.f103421v1 : gbc0.f103192R1));
            m58690d(context, imageView, CoreModule.m30933P().m143405a().mo34319F2());
        } else if (joa.m146388g4()) {
            imageView.setImageDrawable(context.getDrawable(gta.m132210e().m132214d().mo34702I4() ? gbc0.f103428w1 : gbc0.f103098D5));
            m58690d(context, imageView, CoreModule.m30933P().m143405a().mo34342Ie());
        } else if (user.isVIPUsed()) {
            imageView.setImageDrawable(context.getDrawable(m58695i()));
            m58690d(context, imageView, CoreModule.m30933P().m143405a().mo34450Y3());
        } else {
            imageView.setImageDrawable(context.getDrawable(gta.m132210e().m132214d().mo34702I4() ? gbc0.f103442y1 : gbc0.f103091C5));
            m58690d(context, imageView, CoreModule.m30933P().m143405a().mo34450Y3());
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m58698l(Context context, User user, ImageView imageView, boolean z, boolean z2) {
        m58699m(context, user, imageView, z, z2, false);
    }

    /* JADX INFO: renamed from: m */
    public static void m58699m(Context context, User user, ImageView imageView, boolean z, boolean z2, boolean z3) {
        if (!user.isMe() && (user.isHideIconFromSVip() || user.gpHideVip())) {
            bnl0.m105524M(imageView, false);
            return;
        }
        bnl0.m105524M(imageView, true);
        if (CoreModule.f18276o.m132214d().mo34940ve(user)) {
            imageView.setImageDrawable(imageView.getContext().getDrawable(gbc0.f103310h0));
            i4g0.m138520r("e_intl_ultra_badge", ((Act) bnl0.m105506D(context)).pageId());
            m58690d(context, imageView, CoreModule.m30933P().m143405a().mo34333H9());
            return;
        }
        if ((!CoreModule.m30933P().m143405a().mo34510h5() && !CoreModule.m30933P().m143405a().mo34445Xi()) || !user.isMe()) {
            if (CoreModule.m30933P().m143405a().mo34510h5() && user.isSVIP()) {
                if (gta.m132210e().m132214d().mo34702I4()) {
                    imageView.setImageDrawable(context.getDrawable(gbc0.f103407t1));
                } else {
                    imageView.setImageDrawable(context.getDrawable(gbc0.f103371o5));
                }
                m58690d(context, imageView, CoreModule.m30933P().m143405a().mo34342Ie());
                return;
            }
            if (user.isVIP() && (!user.gpHideVip() || z2)) {
                if (CoreModule.m30933P().m143405a().mo34445Xi() && user.isSVIP()) {
                    imageView.setImageDrawable(context.getDrawable(gbc0.f103294f0));
                } else {
                    imageView.setImageDrawable(context.getDrawable(m58694h(SVipIconSize.MID)));
                }
                m58690d(context, imageView, CoreModule.m30933P().m143405a().mo34450Y3());
                return;
            }
            if (!TEnum.equals(user.membership.name, "vip")) {
                imageView.setVisibility(z ? 8 : 4);
                return;
            }
            if (!z2) {
                imageView.setImageDrawable(null);
                imageView.setVisibility(z ? 8 : 4);
                return;
            }
            if (CoreModule.m30933P().m143405a().mo34445Xi() && user.isSVIP()) {
                imageView.setImageDrawable(context.getDrawable(gbc0.f103302g0));
            } else {
                imageView.setImageDrawable(context.getDrawable(m58695i()));
            }
            m58690d(context, imageView, CoreModule.m30933P().m143405a().mo34450Y3());
            return;
        }
        if (!joa.m146386f4()) {
            if (CoreModule.m30933P().m143405a().mo34445Xi()) {
                imageView.setImageDrawable(context.getDrawable(gbc0.f103294f0));
            } else {
                imageView.setImageDrawable(context.getDrawable(gbc0.f103371o5));
            }
            m58690d(context, imageView, CoreModule.m30933P().m143405a().mo34342Ie());
            return;
        }
        if (!z2) {
            if (CoreModule.m30933P().m143405a().mo34445Xi() && user.isSVIP()) {
                imageView.setImageDrawable(context.getDrawable(gbc0.f103294f0));
                return;
            } else if (user.isVIP()) {
                imageView.setImageDrawable(context.getDrawable(m58694h(SVipIconSize.MID)));
                m58690d(context, imageView, CoreModule.m30933P().m143405a().mo34450Y3());
                return;
            } else {
                imageView.setImageDrawable(null);
                imageView.setVisibility(z ? 8 : 4);
                return;
            }
        }
        if (user.isVIP()) {
            if (CoreModule.m30933P().m143405a().mo34445Xi() && user.isSVIP()) {
                imageView.setImageDrawable(context.getDrawable(gbc0.f103294f0));
            } else {
                imageView.setImageDrawable(context.getDrawable(m58694h(SVipIconSize.MID)));
            }
            m58690d(context, imageView, CoreModule.m30933P().m143405a().mo34450Y3());
            return;
        }
        if (CoreModule.f18276o.m132214d().mo34769Vd() && joa.m146398l4()) {
            imageView.setImageDrawable(context.getDrawable(gbc0.f103302g0));
            m58690d(context, imageView, CoreModule.m30933P().m143405a().mo34333H9());
            return;
        }
        if (joa.m146388g4()) {
            imageView.setImageDrawable(context.getDrawable(gbc0.f103098D5));
            if (CoreModule.m30933P().m143405a().mo34445Xi()) {
                imageView.setImageDrawable(context.getDrawable(gbc0.f103302g0));
            }
            m58690d(context, imageView, CoreModule.m30933P().m143405a().mo34342Ie());
            return;
        }
        if (user.isVIPUsed()) {
            imageView.setImageDrawable(context.getDrawable(m58695i()));
            m58690d(context, imageView, CoreModule.m30933P().m143405a().mo34450Y3());
        } else {
            bnl0.m105524M(imageView, false);
            imageView.setImageDrawable(null);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m58700n(User user, ImageView imageView) {
        if (!user.isMe() && (user.isHideIconFromSVip() || user.gpHideVip())) {
            imageView.setVisibility(8);
            return;
        }
        bnl0.m105524M(imageView, true);
        if (CoreModule.f18276o.m132214d().mo34940ve(user)) {
            imageView.setImageDrawable(imageView.getContext().getDrawable(gbc0.f103310h0));
            return;
        }
        if ((CoreModule.m30933P().m143405a().mo34510h5() || CoreModule.m30933P().m143405a().mo34445Xi()) && user.isSVIP()) {
            if (CoreModule.m30933P().m143405a().mo34445Xi()) {
                imageView.setImageDrawable(imageView.getContext().getDrawable(gbc0.f103294f0));
                return;
            } else {
                imageView.setImageDrawable(imageView.getContext().getDrawable(gbc0.f103363n5));
                return;
            }
        }
        if (user.isVIP() && !user.gpHideVip()) {
            imageView.setImageDrawable(imageView.getContext().getDrawable(m58694h(SVipIconSize.LARGE)));
        } else if (!TEnum.equals(user.membership.name, "vip")) {
            bnl0.m105524M(imageView, false);
        } else {
            imageView.setImageDrawable(null);
            bnl0.m105524M(imageView, false);
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m58701o(final Act act, final PurchaseType purchaseType, Privilege privilege, x20 x20Var) {
        VipItemDetailPage vipItemDetailPage = (VipItemDetailPage) act.inflater().inflate(pec0.f152036r2, (ViewGroup) null, false);
        final Dialog dialogM21566z = act.dialog().m21556u().m21518O(vipItemDetailPage).m21566z();
        a690 a690VarMo36062ej = CoreModule.m30933P().m143410g().mo36062ej(privilege);
        x20 x20Var2 = new x20() { // from class: l.iul0
            @Override // p153l.x20
            public final void call() {
                VipNewUtils.m58687a(dialogM21566z, purchaseType, act);
            }
        };
        Objects.requireNonNull(dialogM21566z);
        vipItemDetailPage.m57457h(act, a690VarMo36062ej, purchaseType, x20Var2, new sqk(dialogM21566z), x20Var);
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_boost_confirm_use", dialogM21566z.getClass().getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("tooltips_trigger_mode", "passive"));
        w1e.m204402f(l4g0VarM204399c);
        dialogM21566z.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.jul0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        dialogM21566z.show();
    }
}
