package com.p000p1.mobile.putong.core.newui.home.intlslguide;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.home.intlslguide.IntlSlGuideDialog;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.d30;
import l.f6c0;
import l.j760;
import l.t100;
import l.v7c0;
import l.vwb;
import l.zvf0;
import p009l.i0e;
import p009l.lfn;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntlSlGuideDialog {

    /* JADX INFO: renamed from: a */
    public Dialog f1827a;

    /* JADX INFO: renamed from: b */
    public IntlSlGuideDialogView f1828b;

    /* JADX INFO: renamed from: c */
    public cwf0 f1829c;

    /* JADX INFO: renamed from: d */
    public GuideType f1830d;

    public enum GuideType {
        TYPE_A,
        TYPE_B,
        TYPE_C,
        TYPE_D
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.intlslguide.IntlSlGuideDialog$a */
    public static /* synthetic */ class C0166a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1831a;

        static {
            int[] iArr = new int[GuideType.values().length];
            f1831a = iArr;
            try {
                iArr[GuideType.TYPE_A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1831a[GuideType.TYPE_B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1831a[GuideType.TYPE_C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1831a[GuideType.TYPE_D.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2601b(d30 d30Var, DialogInterface dialogInterface) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: o */
    public static IntlSlGuideDialog m2603o(Act act, User user, GuideType guideType, d30 d30Var, d30 d30Var2) {
        if (!NullChecker.a(act) || act.isFinishing() || act.isDestroyed() || !NullChecker.a(user)) {
            return null;
        }
        IntlSlGuideDialog intlSlGuideDialog = new IntlSlGuideDialog();
        intlSlGuideDialog.f1830d = guideType;
        intlSlGuideDialog.m2615p(act, user, d30Var, d30Var2);
        return intlSlGuideDialog;
    }

    /* JADX INFO: renamed from: d */
    public void m2604d() {
        if (NullChecker.a(this.f1827a) && this.f1827a.isShowing()) {
            this.f1827a.dismiss();
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m2605e(User user) {
        if (!NullChecker.a(user) || vwb.J(user.pictures)) {
            return null;
        }
        return user.fp().profile180().formatted();
    }

    /* JADX INFO: renamed from: f */
    public final String m2606f() {
        int i = C0166a.f1831a[this.f1830d.ordinal()];
        if (i == 2) {
            return "B";
        }
        if (i != 3) {
            return i != 4 ? "A" : "D";
        }
        return "C";
    }

    /* JADX INFO: renamed from: g */
    public final String m2607g(User user) {
        lfn.C1015a c1015aM17877a;
        String strM2608h = m2608h(user);
        return (TextUtils.isEmpty(strM2608h) || (c1015aM17877a = lfn.INSTANCE.m17877a(strM2608h)) == null) ? "" : App.e.getString(c1015aM17877a.getName());
    }

    /* JADX INFO: renamed from: h */
    public final String m2608h(User user) {
        if (NullChecker.a(user) && NullChecker.a(user.profile) && NullChecker.a(user.profile.extensions) && NullChecker.a(user.profile.extensions.basic)) {
            boolean zJ = vwb.J(user.profile.extensions.basic.intlFriendPurposeV2);
            Profile profile = user.profile;
            if (!zJ) {
                return (String) profile.extensions.basic.intlFriendPurposeV2.get(0);
            }
            if (!vwb.J(profile.extensions.basic.intlFriendPurpose)) {
                return (String) user.profile.extensions.basic.intlFriendPurpose.get(0);
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: i */
    public final String m2609i(Act act, boolean z) {
        return act.getString(z ? R.string.F9 : R.string.X2);
    }

    /* JADX INFO: renamed from: j */
    public final String m2610j(Act act, User user, GuideType guideType, boolean z, String str) {
        int i = C0166a.f1831a[guideType.ordinal()];
        if (i == 1) {
            return act.getString(z ? R.string.Gc : R.string.Fc, str);
        }
        if (i == 2) {
            return act.getString(z ? R.string.Ic : R.string.Hc, m2607g(user), str);
        }
        if (i == 3) {
            return act.getString(z ? R.string.Kc : R.string.Jc, str);
        }
        if (i != 4) {
            return act.getString(R.string.Fc, str);
        }
        return act.getString(z ? R.string.Mc : R.string.Lc, str);
    }

    /* JADX INFO: renamed from: k */
    public final String m2611k(Act act, GuideType guideType, boolean z) {
        int i = C0166a.f1831a[guideType.ordinal()];
        if (i == 1) {
            return act.getString(z ? R.string.Oc : R.string.Nc);
        }
        if (i == 2) {
            return act.getString(R.string.Pc);
        }
        if (i != 3) {
            return i != 4 ? act.getString(R.string.Nc) : act.getString(R.string.Rc);
        }
        return act.getString(R.string.Qc);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m2612l(d30 d30Var, View view) {
        m2614n();
        m2604d();
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m2613m(d30 d30Var, View view) {
        m2604d();
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m2614n() {
        String str;
        User userP9 = CoreModule.c.e0.p9();
        j760 j760VarY = vwb.Y("sl_scene_type", m2606f());
        if (userP9.isNonBinary()) {
            str = "all";
        } else {
            str = userP9.isFemale() ? "female" : "male";
        }
        zvf0.u("e_sl_guide_impression_click", "p_sl_guide_impression_pop", new j760[]{j760VarY, vwb.Y("gender", str)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public final void m2615p(Act act, User user, final d30 d30Var, final d30 d30Var2) {
        View viewInflate = act.inflater().inflate(f6c0.M5, (ViewGroup) null);
        this.f1828b = (IntlSlGuideDialogView) viewInflate;
        String strM2605e = m2605e(user);
        if (!TextUtils.isEmpty(strM2605e)) {
            this.f1828b.setAvatar(strM2605e);
        }
        String str = NullChecker.a(user) ? user.name : "";
        boolean zV = IntlCountryCodeController.v();
        this.f1828b.setTitle(m2611k(act, this.f1830d, zV));
        this.f1828b.setSubtitle(m2610j(act, user, this.f1830d, zV, str));
        this.f1828b.setSendButtonText(m2609i(act, zV));
        this.f1828b.setSkipButtonText(act.getString(R.string.m9));
        this.f1828b.setOnSendClickListener(new View.OnClickListener() { // from class: l.obp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17891a.m2612l(d30Var, view);
            }
        });
        this.f1828b.setOnSkipClickListener(new View.OnClickListener() { // from class: l.pbp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18458a.m2613m(d30Var2, view);
            }
        });
        Dialog dialogZ = act.dialog().L(v7c0.o).O(viewInflate).C(t100.d(32.0f), 0, t100.d(32.0f), 0).B(true).z();
        this.f1827a = dialogZ;
        dialogZ.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.qbp
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                IntlSlGuideDialog.m2601b(d30Var2, dialogInterface);
            }
        });
        cwf0 cwf0Var = new cwf0("p_sl_guide_impression_pop", IntlSlGuideDialog.class.getName());
        this.f1829c = cwf0Var;
        cwf0Var.p(new j760[]{vwb.Y("sl_scene_type", m2606f())});
        this.f1827a.show();
        i0e.m16065f(this.f1829c);
    }
}
