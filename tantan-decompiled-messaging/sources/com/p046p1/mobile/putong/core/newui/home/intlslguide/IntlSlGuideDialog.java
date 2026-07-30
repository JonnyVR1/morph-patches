package com.p046p1.mobile.putong.core.newui.home.intlslguide;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.home.intlslguide.IntlSlGuideDialog;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import p149l.b2s;
import p149l.cwf0;
import p149l.d30;
import p149l.f6c0;
import p149l.i0e;
import p149l.j760;
import p149l.lfn;
import p149l.t100;
import p149l.v7c0;
import p149l.vwb;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class IntlSlGuideDialog {

    /* JADX INFO: renamed from: a */
    public Dialog f23049a;

    /* JADX INFO: renamed from: b */
    public IntlSlGuideDialogView f23050b;

    /* JADX INFO: renamed from: c */
    public cwf0 f23051c;

    /* JADX INFO: renamed from: d */
    public GuideType f23052d;

    public enum GuideType {
        TYPE_A,
        TYPE_B,
        TYPE_C,
        TYPE_D
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.intlslguide.IntlSlGuideDialog$a */
    public static /* synthetic */ class C8002a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23053a;

        static {
            int[] iArr = new int[GuideType.values().length];
            f23053a = iArr;
            try {
                iArr[GuideType.TYPE_A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23053a[GuideType.TYPE_B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23053a[GuideType.TYPE_C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23053a[GuideType.TYPE_D.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m38615b(d30 d30Var, DialogInterface dialogInterface) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: o */
    public static IntlSlGuideDialog m38617o(Act act, User user, GuideType guideType, d30 d30Var, d30 d30Var2) {
        if (!NullChecker.m81303a(act) || act.isFinishing() || act.isDestroyed() || !NullChecker.m81303a(user)) {
            return null;
        }
        IntlSlGuideDialog intlSlGuideDialog = new IntlSlGuideDialog();
        intlSlGuideDialog.f23052d = guideType;
        intlSlGuideDialog.m38629p(act, user, d30Var, d30Var2);
        return intlSlGuideDialog;
    }

    /* JADX INFO: renamed from: d */
    public void m38618d() {
        if (NullChecker.m81303a(this.f23049a) && this.f23049a.isShowing()) {
            this.f23049a.dismiss();
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m38619e(User user) {
        if (!NullChecker.m81303a(user) || vwb.m200296J(user.pictures)) {
            return null;
        }
        return user.m60124fp().profile180().formatted();
    }

    /* JADX INFO: renamed from: f */
    public final String m38620f() {
        int i = C8002a.f23053a[this.f23052d.ordinal()];
        if (i == 2) {
            return "B";
        }
        if (i != 3) {
            return i != 4 ? "A" : "D";
        }
        return b2s.C_ZONE;
    }

    /* JADX INFO: renamed from: g */
    public final String m38621g(User user) {
        lfn.C18216a c18216aM149726a;
        String strM38622h = m38622h(user);
        return (TextUtils.isEmpty(strM38622h) || (c18216aM149726a = lfn.INSTANCE.m149726a(strM38622h)) == null) ? "" : App.f15369e.getString(c18216aM149726a.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
    }

    /* JADX INFO: renamed from: h */
    public final String m38622h(User user) {
        if (NullChecker.m81303a(user) && NullChecker.m81303a(user.profile) && NullChecker.m81303a(user.profile.extensions) && NullChecker.m81303a(user.profile.extensions.basic)) {
            boolean zM200296J = vwb.m200296J(user.profile.extensions.basic.intlFriendPurposeV2);
            Profile profile = user.profile;
            if (!zM200296J) {
                return profile.extensions.basic.intlFriendPurposeV2.get(0);
            }
            if (!vwb.m200296J(profile.extensions.basic.intlFriendPurpose)) {
                return user.profile.extensions.basic.intlFriendPurpose.get(0);
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: i */
    public final String m38623i(Act act, boolean z) {
        return act.getString(z ? R$string.f17726F9 : R$string.f18259X2);
    }

    /* JADX INFO: renamed from: j */
    public final String m38624j(Act act, User user, GuideType guideType, boolean z, String str) {
        int i = C8002a.f23053a[guideType.ordinal()];
        if (i == 1) {
            return act.getString(z ? R$string.f17759Gc : R$string.f17729Fc, str);
        }
        if (i == 2) {
            return act.getString(z ? R$string.f17819Ic : R$string.f17789Hc, m38621g(user), str);
        }
        if (i == 3) {
            return act.getString(z ? R$string.f17879Kc : R$string.f17849Jc, str);
        }
        if (i != 4) {
            return act.getString(R$string.f17729Fc, str);
        }
        return act.getString(z ? R$string.f17939Mc : R$string.f17909Lc, str);
    }

    /* JADX INFO: renamed from: k */
    public final String m38625k(Act act, GuideType guideType, boolean z) {
        int i = C8002a.f23053a[guideType.ordinal()];
        if (i == 1) {
            return act.getString(z ? R$string.f17999Oc : R$string.f17969Nc);
        }
        if (i == 2) {
            return act.getString(R$string.f18029Pc);
        }
        if (i != 3) {
            return i != 4 ? act.getString(R$string.f17969Nc) : act.getString(R$string.f18089Rc);
        }
        return act.getString(R$string.f18059Qc);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m38626l(d30 d30Var, View view) {
        m38628n();
        m38618d();
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m38627m(d30 d30Var, View view) {
        m38618d();
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m38628n() {
        String str;
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        j760 j760VarM200311Y = vwb.m200311Y("sl_scene_type", m38620f());
        if (userM169527p9.isNonBinary()) {
            str = "all";
        } else {
            str = userM169527p9.isFemale() ? "female" : "male";
        }
        zvf0.m220399u("e_sl_guide_impression_click", "p_sl_guide_impression_pop", j760VarM200311Y, vwb.m200311Y("gender", str));
    }

    /* JADX INFO: renamed from: p */
    public final void m38629p(Act act, User user, final d30 d30Var, final d30 d30Var2) {
        View viewInflate = act.inflater().inflate(f6c0.f95464M5, (ViewGroup) null);
        this.f23050b = (IntlSlGuideDialogView) viewInflate;
        String strM38619e = m38619e(user);
        if (!TextUtils.isEmpty(strM38619e)) {
            this.f23050b.setAvatar(strM38619e);
        }
        String str = NullChecker.m81303a(user) ? user.name : "";
        boolean zM28126v = IntlCountryCodeController.m28126v();
        this.f23050b.setTitle(m38625k(act, this.f23052d, zM28126v));
        this.f23050b.setSubtitle(m38624j(act, user, this.f23052d, zM28126v, str));
        this.f23050b.setSendButtonText(m38623i(act, zM28126v));
        this.f23050b.setSkipButtonText(act.getString(R$string.f18725m9));
        this.f23050b.setOnSendClickListener(new View.OnClickListener() { // from class: l.obp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142968a.m38626l(d30Var, view);
            }
        });
        this.f23050b.setOnSkipClickListener(new View.OnClickListener() { // from class: l.pbp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148101a.m38627m(d30Var2, view);
            }
        });
        Dialog dialogM20567z = act.dialog().m20516L(v7c0.f180368o).m20519O(viewInflate).m20498C(t100.m186890d(32.0f), 0, t100.m186890d(32.0f), 0).m20496B(true).m20567z();
        this.f23049a = dialogM20567z;
        dialogM20567z.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.qbp
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                IntlSlGuideDialog.m38615b(d30Var2, dialogInterface);
            }
        });
        cwf0 cwf0Var = new cwf0("p_sl_guide_impression_pop", IntlSlGuideDialog.class.getName());
        this.f23051c = cwf0Var;
        cwf0Var.m109040p(vwb.m200311Y("sl_scene_type", m38620f()));
        this.f23049a.show();
        i0e.m133797f(this.f23051c);
    }
}
