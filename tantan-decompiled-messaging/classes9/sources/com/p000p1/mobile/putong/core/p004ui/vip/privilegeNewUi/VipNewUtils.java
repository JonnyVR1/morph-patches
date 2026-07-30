package com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.vip.VipItemDetailPage;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.VipNewUtils;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import l.b3c0;
import l.cok;
import l.cwf0;
import l.d30;
import l.i0e;
import l.j760;
import l.k6c0;
import l.mb90;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p006l.qib0;
import p006l.ura;
import p006l.wx80;
import p006l.xma;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VipNewUtils {

    public enum SVipIconSize {
        SMALL,
        MID,
        LARGE
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.VipNewUtils$a */
    public static /* synthetic */ class C0454a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f7650a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f7650a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7650a[PurchaseType.TYPE_GET_VIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7650a[PurchaseType.TYPE_GET_BOOST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7650a[PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7650a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7650a[PurchaseType.TYPE_ROAMING_PKG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7650a[PurchaseType.TYPE_SUPERLIKE_PKG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7650a[PurchaseType.TYPE_LIKENOLIMIT_PKG.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7650a[PurchaseType.TYPE_UNDO_PKG.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10996a(Dialog dialog, PurchaseType purchaseType, Act act) {
        dialog.dismiss();
        if (PurchaseType.TYPE_GET_BOOST == purchaseType) {
            CoreModule.m1854P().m11711g().m7003na(act, "p_wallet,vas");
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m10998c(String str, Context context, View view) {
        if (TextUtils.equals(str, CoreModule.m1854P().m11706a().m5276Ie()) || TextUtils.equals(str, CoreModule.m1854P().m11706a().m5252F0()) || TextUtils.equals(str, CoreModule.m1854P().m11706a().m5384Y3()) || TextUtils.equals(str, CoreModule.m1854P().m11706a().m5253F2()) || TextUtils.equals(str, CoreModule.m1854P().m11706a().m5318O1()) || TextUtils.equals(str, CoreModule.m1854P().m11706a().m5267H9())) {
            if (TextUtils.equals(str, CoreModule.m1854P().m11706a().m5267H9()) && (xdl0.D(context) instanceof Act)) {
                CoreModule.m1854P().m11706a().m5506qd(context, "p_navigation_view,e_intl_ultra_badge,click", str);
            } else if (!TextUtils.equals(str, CoreModule.m1854P().m11706a().m5253F2()) || CoreModule.m1854P().m11711g().m6988cf()) {
                CoreModule.m1854P().m11706a().m5506qd(context, "p_privilege,icon", str);
            } else {
                CoreModule.m1854P().m11706a().m5506qd(context, "p_privilege,icon", CoreModule.m1854P().m11706a().m5384Y3());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m10999d(final Context context, View view, final String str) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.dll0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VipNewUtils.m10998c(str, context, view2);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static String m11000e(Context context) {
        return context == null ? "" : String.format("%s\n%s", context.getString(R.string.C0), context.getString(R.string.J));
    }

    @DrawableRes
    /* JADX INFO: renamed from: f */
    public static int m11001f() {
        return CoreModule.m1854P().m11706a().m5444h5() ? b3c0.y5 : b3c0.x5;
    }

    @DrawableRes
    /* JADX INFO: renamed from: g */
    public static int m11002g() {
        return m11003h(null);
    }

    @DrawableRes
    /* JADX INFO: renamed from: h */
    public static int m11003h(SVipIconSize sVipIconSize) {
        return b3c0.j0;
    }

    @DrawableRes
    /* JADX INFO: renamed from: i */
    public static int m11004i() {
        if (ura.m25555e().m25559d().m5636I4()) {
            return b3c0.x1;
        }
        return CoreModule.m1854P().m11706a().m5444h5() ? b3c0.E5 : b3c0.i0;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m11005j(PurchaseType purchaseType) {
        switch (C0454a.f7650a[purchaseType.ordinal()]) {
            case 1:
                return CoreModule.m1854P().m11706a().m5230Bn() - qib0.f19784H.guessedCurrentServerTime() >= 0;
            case 2:
                if (NullChecker.a(CoreModule.f1534c.f3628e0.m21490p9())) {
                    return CoreModule.f1534c.f3628e0.m21490p9().isVIP();
                }
                return false;
            case CameraSticker.STATE_COMPLETE /* 3 */:
                return !CoreModule.m1854P().m11706a().m5523s8();
            case CameraSticker.STATE_ERROR /* 4 */:
                return CoreModule.m1854P().m11706a().m5571z9() && CoreModule.m1854P().m11706a().m5481m9() > 0;
            case 5:
                return !xma.m27379e4();
            case 6:
            case 7:
            case 8:
            case 9:
                return mb90.a(purchaseType);
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m11006k(Context context, User user, ImageView imageView, boolean z) {
        if (!user.isMe() && (user.isHideIconFromSVip() || user.gpHideVip())) {
            xdl0.M(imageView, false);
            return;
        }
        xdl0.M(imageView, true);
        if (!xma.m27379e4()) {
            if (ura.m25555e().m25559d().m5636I4()) {
                imageView.setImageDrawable(context.getDrawable(b3c0.t1));
            } else {
                imageView.setImageDrawable(context.getDrawable(b3c0.o5));
            }
            m10999d(context, imageView, CoreModule.m1854P().m11706a().m5276Ie());
            return;
        }
        if (!z) {
            xdl0.M(imageView, false);
            return;
        }
        if (user.isVIP()) {
            if (ura.m25555e().m25559d().m5636I4()) {
                imageView.setImageDrawable(context.getDrawable(b3c0.u1));
                return;
            } else {
                imageView.setImageDrawable(context.getDrawable(b3c0.B5));
                return;
            }
        }
        if (CoreModule.m1854P().m11711g().m6988cf() && xma.m27369Z3()) {
            imageView.setImageDrawable(context.getDrawable(ura.m25555e().m25559d().m5636I4() ? b3c0.v1 : b3c0.R1));
            m10999d(context, imageView, CoreModule.m1854P().m11706a().m5253F2());
        } else if (xma.m27381f4()) {
            imageView.setImageDrawable(context.getDrawable(ura.m25555e().m25559d().m5636I4() ? b3c0.w1 : b3c0.D5));
            m10999d(context, imageView, CoreModule.m1854P().m11706a().m5276Ie());
        } else if (user.isVIPUsed()) {
            imageView.setImageDrawable(context.getDrawable(m11004i()));
            m10999d(context, imageView, CoreModule.m1854P().m11706a().m5384Y3());
        } else {
            imageView.setImageDrawable(context.getDrawable(ura.m25555e().m25559d().m5636I4() ? b3c0.y1 : b3c0.C5));
            m10999d(context, imageView, CoreModule.m1854P().m11706a().m5384Y3());
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m11007l(Context context, User user, ImageView imageView, boolean z, boolean z2) {
        m11008m(context, user, imageView, z, z2, false);
    }

    /* JADX INFO: renamed from: m */
    public static void m11008m(Context context, User user, ImageView imageView, boolean z, boolean z2, boolean z3) {
        if (!user.isMe() && (user.isHideIconFromSVip() || user.gpHideVip())) {
            xdl0.M(imageView, false);
            return;
        }
        xdl0.M(imageView, true);
        if (CoreModule.f1546o.m25559d().m5874ve(user)) {
            imageView.setImageDrawable(imageView.getContext().getDrawable(b3c0.h0));
            zvf0.r("e_intl_ultra_badge", xdl0.D(context).pageId());
            m10999d(context, imageView, CoreModule.m1854P().m11706a().m5267H9());
            return;
        }
        if ((!CoreModule.m1854P().m11706a().m5444h5() && !CoreModule.m1854P().m11706a().m5379Xi()) || !user.isMe()) {
            if (CoreModule.m1854P().m11706a().m5444h5() && user.isSVIP()) {
                if (ura.m25555e().m25559d().m5636I4()) {
                    imageView.setImageDrawable(context.getDrawable(b3c0.t1));
                } else {
                    imageView.setImageDrawable(context.getDrawable(b3c0.o5));
                }
                m10999d(context, imageView, CoreModule.m1854P().m11706a().m5276Ie());
                return;
            }
            if (user.isVIP() && (!user.gpHideVip() || z2)) {
                if (CoreModule.m1854P().m11706a().m5379Xi() && user.isSVIP()) {
                    imageView.setImageDrawable(context.getDrawable(b3c0.f0));
                } else {
                    imageView.setImageDrawable(context.getDrawable(m11003h(SVipIconSize.MID)));
                }
                m10999d(context, imageView, CoreModule.m1854P().m11706a().m5384Y3());
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
            if (CoreModule.m1854P().m11706a().m5379Xi() && user.isSVIP()) {
                imageView.setImageDrawable(context.getDrawable(b3c0.g0));
            } else {
                imageView.setImageDrawable(context.getDrawable(m11004i()));
            }
            m10999d(context, imageView, CoreModule.m1854P().m11706a().m5384Y3());
            return;
        }
        if (!xma.m27379e4()) {
            if (CoreModule.m1854P().m11706a().m5379Xi()) {
                imageView.setImageDrawable(context.getDrawable(b3c0.f0));
            } else {
                imageView.setImageDrawable(context.getDrawable(b3c0.o5));
            }
            m10999d(context, imageView, CoreModule.m1854P().m11706a().m5276Ie());
            return;
        }
        if (!z2) {
            if (CoreModule.m1854P().m11706a().m5379Xi() && user.isSVIP()) {
                imageView.setImageDrawable(context.getDrawable(b3c0.f0));
                return;
            } else if (user.isVIP()) {
                imageView.setImageDrawable(context.getDrawable(m11003h(SVipIconSize.MID)));
                m10999d(context, imageView, CoreModule.m1854P().m11706a().m5384Y3());
                return;
            } else {
                imageView.setImageDrawable(null);
                imageView.setVisibility(z ? 8 : 4);
                return;
            }
        }
        if (user.isVIP()) {
            if (CoreModule.m1854P().m11706a().m5379Xi() && user.isSVIP()) {
                imageView.setImageDrawable(context.getDrawable(b3c0.f0));
            } else {
                imageView.setImageDrawable(context.getDrawable(m11003h(SVipIconSize.MID)));
            }
            m10999d(context, imageView, CoreModule.m1854P().m11706a().m5384Y3());
            return;
        }
        if (CoreModule.f1546o.m25559d().m5703Vd() && xma.m27391k4()) {
            imageView.setImageDrawable(context.getDrawable(b3c0.g0));
            m10999d(context, imageView, CoreModule.m1854P().m11706a().m5267H9());
            return;
        }
        if (xma.m27381f4()) {
            imageView.setImageDrawable(context.getDrawable(b3c0.D5));
            if (CoreModule.m1854P().m11706a().m5379Xi()) {
                imageView.setImageDrawable(context.getDrawable(b3c0.g0));
            }
            m10999d(context, imageView, CoreModule.m1854P().m11706a().m5276Ie());
            return;
        }
        if (user.isVIPUsed()) {
            imageView.setImageDrawable(context.getDrawable(m11004i()));
            m10999d(context, imageView, CoreModule.m1854P().m11706a().m5384Y3());
        } else {
            xdl0.M(imageView, false);
            imageView.setImageDrawable(null);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m11009n(User user, ImageView imageView) {
        if (!user.isMe() && (user.isHideIconFromSVip() || user.gpHideVip())) {
            imageView.setVisibility(8);
            return;
        }
        xdl0.M(imageView, true);
        if (CoreModule.f1546o.m25559d().m5874ve(user)) {
            imageView.setImageDrawable(imageView.getContext().getDrawable(b3c0.h0));
            return;
        }
        if ((CoreModule.m1854P().m11706a().m5444h5() || CoreModule.m1854P().m11706a().m5379Xi()) && user.isSVIP()) {
            if (CoreModule.m1854P().m11706a().m5379Xi()) {
                imageView.setImageDrawable(imageView.getContext().getDrawable(b3c0.f0));
                return;
            } else {
                imageView.setImageDrawable(imageView.getContext().getDrawable(b3c0.n5));
                return;
            }
        }
        if (user.isVIP() && !user.gpHideVip()) {
            imageView.setImageDrawable(imageView.getContext().getDrawable(m11003h(SVipIconSize.LARGE)));
        } else if (!TEnum.equals(user.membership.name, "vip")) {
            xdl0.M(imageView, false);
        } else {
            imageView.setImageDrawable(null);
            xdl0.M(imageView, false);
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m11010o(final Act act, final PurchaseType purchaseType, Privilege privilege, d30 d30Var) {
        VipItemDetailPage vipItemDetailPage = (VipItemDetailPage) act.inflater().inflate(k6c0.r2, (ViewGroup) null, false);
        final Dialog dialogZ = act.dialog().u().O(vipItemDetailPage).z();
        wx80 wx80VarM6996ej = CoreModule.m1854P().m11711g().m6996ej(privilege);
        d30 d30Var2 = new d30() { // from class: l.ell0
            public final void call() {
                VipNewUtils.m10996a(dialogZ, purchaseType, act);
            }
        };
        Objects.requireNonNull(dialogZ);
        vipItemDetailPage.m9708h(act, wx80VarM6996ej, purchaseType, d30Var2, new cok(dialogZ), d30Var);
        final cwf0 cwf0VarC = i0e.c("p_boost_confirm_use", dialogZ.getClass().getName());
        cwf0VarC.p(new j760[]{vwb.Y("tooltips_trigger_mode", "passive")});
        i0e.f(cwf0VarC);
        dialogZ.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.fll0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        });
        dialogZ.show();
    }
}
