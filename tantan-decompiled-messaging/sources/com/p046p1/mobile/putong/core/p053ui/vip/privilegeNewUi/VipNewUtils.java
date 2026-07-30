package com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.p053ui.vip.VipItemDetailPage;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.VipNewUtils;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p149l.b3c0;
import p149l.cok;
import p149l.cwf0;
import p149l.d30;
import p149l.i0e;
import p149l.k6c0;
import p149l.mb90;
import p149l.qib0;
import p149l.ura;
import p149l.vwb;
import p149l.wx80;
import p149l.xdl0;
import p149l.xma;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class VipNewUtils {

    public enum SVipIconSize {
        SMALL,
        MID,
        LARGE
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.VipNewUtils$a */
    public static /* synthetic */ class C9018a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37869a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f37869a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37869a[PurchaseType.TYPE_GET_VIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37869a[PurchaseType.TYPE_GET_BOOST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37869a[PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37869a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37869a[PurchaseType.TYPE_ROAMING_PKG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37869a[PurchaseType.TYPE_SUPERLIKE_PKG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37869a[PurchaseType.TYPE_LIKENOLIMIT_PKG.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37869a[PurchaseType.TYPE_UNDO_PKG.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m57504a(Dialog dialog, PurchaseType purchaseType, Act act) {
        dialog.dismiss();
        if (PurchaseType.TYPE_GET_BOOST == purchaseType) {
            CoreModule.m29935P().m94656g().mo35066na(act, "p_wallet,vas");
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m57506c(String str, Context context, View view) {
        if (TextUtils.equals(str, CoreModule.m29935P().m94651a().mo33339Ie()) || TextUtils.equals(str, CoreModule.m29935P().m94651a().mo33315F0()) || TextUtils.equals(str, CoreModule.m29935P().m94651a().mo33447Y3()) || TextUtils.equals(str, CoreModule.m29935P().m94651a().mo33316F2()) || TextUtils.equals(str, CoreModule.m29935P().m94651a().mo33381O1()) || TextUtils.equals(str, CoreModule.m29935P().m94651a().mo33330H9())) {
            if (TextUtils.equals(str, CoreModule.m29935P().m94651a().mo33330H9()) && (xdl0.m208326D(context) instanceof Act)) {
                CoreModule.m29935P().m94651a().mo33569qd(context, "p_navigation_view,e_intl_ultra_badge,click", str);
            } else if (!TextUtils.equals(str, CoreModule.m29935P().m94651a().mo33316F2()) || CoreModule.m29935P().m94656g().mo35051cf()) {
                CoreModule.m29935P().m94651a().mo33569qd(context, "p_privilege,icon", str);
            } else {
                CoreModule.m29935P().m94651a().mo33569qd(context, "p_privilege,icon", CoreModule.m29935P().m94651a().mo33447Y3());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m57507d(final Context context, View view, final String str) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.dll0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VipNewUtils.m57506c(str, context, view2);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static String m57508e(Context context) {
        return context == null ? "" : String.format("%s\n%s", context.getString(R$string.f20570C0), context.getString(R$string.f20590J));
    }

    @DrawableRes
    /* JADX INFO: renamed from: f */
    public static int m57509f() {
        return CoreModule.m29935P().m94651a().mo33507h5() ? b3c0.f73195y5 : b3c0.f73188x5;
    }

    @DrawableRes
    /* JADX INFO: renamed from: g */
    public static int m57510g() {
        return m57511h(null);
    }

    @DrawableRes
    /* JADX INFO: renamed from: h */
    public static int m57511h(SVipIconSize sVipIconSize) {
        return b3c0.f73075j0;
    }

    @DrawableRes
    /* JADX INFO: renamed from: i */
    public static int m57512i() {
        if (ura.m195053e().m195057d().mo33699I4()) {
            return b3c0.f73184x1;
        }
        return CoreModule.m29935P().m94651a().mo33507h5() ? b3c0.f72854E5 : b3c0.f73067i0;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m57513j(PurchaseType purchaseType) {
        switch (C9018a.f37869a[purchaseType.ordinal()]) {
            case 1:
                return CoreModule.m29935P().m94651a().mo33293Bn() - qib0.f154693H.guessedCurrentServerTime() >= 0;
            case 2:
                if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169527p9())) {
                    return CoreModule.f17545c.f19639e0.m169527p9().isVIP();
                }
                return false;
            case 3:
                return !CoreModule.m29935P().m94651a().mo33586s8();
            case 4:
                return CoreModule.m29935P().m94651a().mo33634z9() && CoreModule.m29935P().m94651a().mo33544m9() > 0;
            case 5:
                return !xma.m210071e4();
            case 6:
            case 7:
            case 8:
            case 9:
                return mb90.m153865a(purchaseType);
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m57514k(Context context, User user, ImageView imageView, boolean z) {
        if (!user.isMe() && (user.isHideIconFromSVip() || user.gpHideVip())) {
            xdl0.m208344M(imageView, false);
            return;
        }
        xdl0.m208344M(imageView, true);
        if (!xma.m210071e4()) {
            if (ura.m195053e().m195057d().mo33699I4()) {
                imageView.setImageDrawable(context.getDrawable(b3c0.f73156t1));
            } else {
                imageView.setImageDrawable(context.getDrawable(b3c0.f73120o5));
            }
            m57507d(context, imageView, CoreModule.m29935P().m94651a().mo33339Ie());
            return;
        }
        if (!z) {
            xdl0.m208344M(imageView, false);
            return;
        }
        if (user.isVIP()) {
            if (ura.m195053e().m195057d().mo33699I4()) {
                imageView.setImageDrawable(context.getDrawable(b3c0.f73163u1));
                return;
            } else {
                imageView.setImageDrawable(context.getDrawable(b3c0.f72833B5));
                return;
            }
        }
        if (CoreModule.m29935P().m94656g().mo35051cf() && xma.m210061Z3()) {
            imageView.setImageDrawable(context.getDrawable(ura.m195053e().m195057d().mo33699I4() ? b3c0.f73170v1 : b3c0.f72941R1));
            m57507d(context, imageView, CoreModule.m29935P().m94651a().mo33316F2());
        } else if (xma.m210073f4()) {
            imageView.setImageDrawable(context.getDrawable(ura.m195053e().m195057d().mo33699I4() ? b3c0.f73177w1 : b3c0.f72847D5));
            m57507d(context, imageView, CoreModule.m29935P().m94651a().mo33339Ie());
        } else if (user.isVIPUsed()) {
            imageView.setImageDrawable(context.getDrawable(m57512i()));
            m57507d(context, imageView, CoreModule.m29935P().m94651a().mo33447Y3());
        } else {
            imageView.setImageDrawable(context.getDrawable(ura.m195053e().m195057d().mo33699I4() ? b3c0.f73191y1 : b3c0.f72840C5));
            m57507d(context, imageView, CoreModule.m29935P().m94651a().mo33447Y3());
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m57515l(Context context, User user, ImageView imageView, boolean z, boolean z2) {
        m57516m(context, user, imageView, z, z2, false);
    }

    /* JADX INFO: renamed from: m */
    public static void m57516m(Context context, User user, ImageView imageView, boolean z, boolean z2, boolean z3) {
        if (!user.isMe() && (user.isHideIconFromSVip() || user.gpHideVip())) {
            xdl0.m208344M(imageView, false);
            return;
        }
        xdl0.m208344M(imageView, true);
        if (CoreModule.f17557o.m195057d().mo33937ve(user)) {
            imageView.setImageDrawable(imageView.getContext().getDrawable(b3c0.f73059h0));
            zvf0.m220396r("e_intl_ultra_badge", ((Act) xdl0.m208326D(context)).pageId());
            m57507d(context, imageView, CoreModule.m29935P().m94651a().mo33330H9());
            return;
        }
        if ((!CoreModule.m29935P().m94651a().mo33507h5() && !CoreModule.m29935P().m94651a().mo33442Xi()) || !user.isMe()) {
            if (CoreModule.m29935P().m94651a().mo33507h5() && user.isSVIP()) {
                if (ura.m195053e().m195057d().mo33699I4()) {
                    imageView.setImageDrawable(context.getDrawable(b3c0.f73156t1));
                } else {
                    imageView.setImageDrawable(context.getDrawable(b3c0.f73120o5));
                }
                m57507d(context, imageView, CoreModule.m29935P().m94651a().mo33339Ie());
                return;
            }
            if (user.isVIP() && (!user.gpHideVip() || z2)) {
                if (CoreModule.m29935P().m94651a().mo33442Xi() && user.isSVIP()) {
                    imageView.setImageDrawable(context.getDrawable(b3c0.f73043f0));
                } else {
                    imageView.setImageDrawable(context.getDrawable(m57511h(SVipIconSize.MID)));
                }
                m57507d(context, imageView, CoreModule.m29935P().m94651a().mo33447Y3());
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
            if (CoreModule.m29935P().m94651a().mo33442Xi() && user.isSVIP()) {
                imageView.setImageDrawable(context.getDrawable(b3c0.f73051g0));
            } else {
                imageView.setImageDrawable(context.getDrawable(m57512i()));
            }
            m57507d(context, imageView, CoreModule.m29935P().m94651a().mo33447Y3());
            return;
        }
        if (!xma.m210071e4()) {
            if (CoreModule.m29935P().m94651a().mo33442Xi()) {
                imageView.setImageDrawable(context.getDrawable(b3c0.f73043f0));
            } else {
                imageView.setImageDrawable(context.getDrawable(b3c0.f73120o5));
            }
            m57507d(context, imageView, CoreModule.m29935P().m94651a().mo33339Ie());
            return;
        }
        if (!z2) {
            if (CoreModule.m29935P().m94651a().mo33442Xi() && user.isSVIP()) {
                imageView.setImageDrawable(context.getDrawable(b3c0.f73043f0));
                return;
            } else if (user.isVIP()) {
                imageView.setImageDrawable(context.getDrawable(m57511h(SVipIconSize.MID)));
                m57507d(context, imageView, CoreModule.m29935P().m94651a().mo33447Y3());
                return;
            } else {
                imageView.setImageDrawable(null);
                imageView.setVisibility(z ? 8 : 4);
                return;
            }
        }
        if (user.isVIP()) {
            if (CoreModule.m29935P().m94651a().mo33442Xi() && user.isSVIP()) {
                imageView.setImageDrawable(context.getDrawable(b3c0.f73043f0));
            } else {
                imageView.setImageDrawable(context.getDrawable(m57511h(SVipIconSize.MID)));
            }
            m57507d(context, imageView, CoreModule.m29935P().m94651a().mo33447Y3());
            return;
        }
        if (CoreModule.f17557o.m195057d().mo33766Vd() && xma.m210083k4()) {
            imageView.setImageDrawable(context.getDrawable(b3c0.f73051g0));
            m57507d(context, imageView, CoreModule.m29935P().m94651a().mo33330H9());
            return;
        }
        if (xma.m210073f4()) {
            imageView.setImageDrawable(context.getDrawable(b3c0.f72847D5));
            if (CoreModule.m29935P().m94651a().mo33442Xi()) {
                imageView.setImageDrawable(context.getDrawable(b3c0.f73051g0));
            }
            m57507d(context, imageView, CoreModule.m29935P().m94651a().mo33339Ie());
            return;
        }
        if (user.isVIPUsed()) {
            imageView.setImageDrawable(context.getDrawable(m57512i()));
            m57507d(context, imageView, CoreModule.m29935P().m94651a().mo33447Y3());
        } else {
            xdl0.m208344M(imageView, false);
            imageView.setImageDrawable(null);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m57517n(User user, ImageView imageView) {
        if (!user.isMe() && (user.isHideIconFromSVip() || user.gpHideVip())) {
            imageView.setVisibility(8);
            return;
        }
        xdl0.m208344M(imageView, true);
        if (CoreModule.f17557o.m195057d().mo33937ve(user)) {
            imageView.setImageDrawable(imageView.getContext().getDrawable(b3c0.f73059h0));
            return;
        }
        if ((CoreModule.m29935P().m94651a().mo33507h5() || CoreModule.m29935P().m94651a().mo33442Xi()) && user.isSVIP()) {
            if (CoreModule.m29935P().m94651a().mo33442Xi()) {
                imageView.setImageDrawable(imageView.getContext().getDrawable(b3c0.f73043f0));
                return;
            } else {
                imageView.setImageDrawable(imageView.getContext().getDrawable(b3c0.f73112n5));
                return;
            }
        }
        if (user.isVIP() && !user.gpHideVip()) {
            imageView.setImageDrawable(imageView.getContext().getDrawable(m57511h(SVipIconSize.LARGE)));
        } else if (!TEnum.equals(user.membership.name, "vip")) {
            xdl0.m208344M(imageView, false);
        } else {
            imageView.setImageDrawable(null);
            xdl0.m208344M(imageView, false);
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m57518o(final Act act, final PurchaseType purchaseType, Privilege privilege, d30 d30Var) {
        VipItemDetailPage vipItemDetailPage = (VipItemDetailPage) act.inflater().inflate(k6c0.f121428r2, (ViewGroup) null, false);
        final Dialog dialogM20567z = act.dialog().m20557u().m20519O(vipItemDetailPage).m20567z();
        wx80 wx80VarMo35059ej = CoreModule.m29935P().m94656g().mo35059ej(privilege);
        d30 d30Var2 = new d30() { // from class: l.ell0
            @Override // p149l.d30
            public final void call() {
                VipNewUtils.m57504a(dialogM20567z, purchaseType, act);
            }
        };
        Objects.requireNonNull(dialogM20567z);
        vipItemDetailPage.m56274h(act, wx80VarMo35059ej, purchaseType, d30Var2, new cok(dialogM20567z), d30Var);
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_boost_confirm_use", dialogM20567z.getClass().getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("tooltips_trigger_mode", "passive"));
        i0e.m133797f(cwf0VarM133794c);
        dialogM20567z.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.fll0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        dialogM20567z.show();
    }
}
