package com.p051p1.mobile.putong.core.newui.home.intlslguide;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.home.intlslguide.IntlSlGuideDialog;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import p153l.agc0;
import p153l.c4s;
import p153l.i4g0;
import p153l.jyb;
import p153l.kec0;
import p153l.l4g0;
import p153l.lhn;
import p153l.pf60;
import p153l.qa00;
import p153l.w1e;
import p153l.x20;

/* JADX INFO: loaded from: classes11.dex */
public class IntlSlGuideDialog {

    /* JADX INFO: renamed from: a */
    public Dialog f23791a;

    /* JADX INFO: renamed from: b */
    public IntlSlGuideDialogView f23792b;

    /* JADX INFO: renamed from: c */
    public l4g0 f23793c;

    /* JADX INFO: renamed from: d */
    public GuideType f23794d;

    public enum GuideType {
        TYPE_A,
        TYPE_B,
        TYPE_C,
        TYPE_D
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.intlslguide.IntlSlGuideDialog$a */
    public static /* synthetic */ class C8153a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23795a;

        static {
            int[] iArr = new int[GuideType.values().length];
            f23795a = iArr;
            try {
                iArr[GuideType.TYPE_A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23795a[GuideType.TYPE_B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23795a[GuideType.TYPE_C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23795a[GuideType.TYPE_D.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m39618b(x20 x20Var, DialogInterface dialogInterface) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: o */
    public static IntlSlGuideDialog m39620o(Act act, User user, GuideType guideType, x20 x20Var, x20 x20Var2) {
        if (!NullChecker.m82486a(act) || act.isFinishing() || act.isDestroyed() || !NullChecker.m82486a(user)) {
            return null;
        }
        IntlSlGuideDialog intlSlGuideDialog = new IntlSlGuideDialog();
        intlSlGuideDialog.f23794d = guideType;
        intlSlGuideDialog.m39632p(act, user, x20Var, x20Var2);
        return intlSlGuideDialog;
    }

    /* JADX INFO: renamed from: d */
    public void m39621d() {
        if (NullChecker.m82486a(this.f23791a) && this.f23791a.isShowing()) {
            this.f23791a.dismiss();
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m39622e(User user) {
        if (!NullChecker.m82486a(user) || jyb.m147479J(user.pictures)) {
            return null;
        }
        return user.m61308fp().profile180().formatted();
    }

    /* JADX INFO: renamed from: f */
    public final String m39623f() {
        int i = C8153a.f23795a[this.f23794d.ordinal()];
        if (i == 2) {
            return "B";
        }
        if (i != 3) {
            return i != 4 ? "A" : "D";
        }
        return c4s.C_ZONE;
    }

    /* JADX INFO: renamed from: g */
    public final String m39624g(User user) {
        lhn.C18395a c18395aM154230a;
        String strM39625h = m39625h(user);
        return (TextUtils.isEmpty(strM39625h) || (c18395aM154230a = lhn.INSTANCE.m154230a(strM39625h)) == null) ? "" : App.f16088e.getString(c18395aM154230a.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
    }

    /* JADX INFO: renamed from: h */
    public final String m39625h(User user) {
        if (NullChecker.m82486a(user) && NullChecker.m82486a(user.profile) && NullChecker.m82486a(user.profile.extensions) && NullChecker.m82486a(user.profile.extensions.basic)) {
            boolean zM147479J = jyb.m147479J(user.profile.extensions.basic.intlFriendPurposeV2);
            Profile profile = user.profile;
            if (!zM147479J) {
                return profile.extensions.basic.intlFriendPurposeV2.get(0);
            }
            if (!jyb.m147479J(profile.extensions.basic.intlFriendPurpose)) {
                return user.profile.extensions.basic.intlFriendPurpose.get(0);
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: i */
    public final String m39626i(Act act, boolean z) {
        return act.getString(z ? R$string.f18726O9 : R$string.f19049Z2);
    }

    /* JADX INFO: renamed from: j */
    public final String m39627j(Act act, User user, GuideType guideType, boolean z, String str) {
        int i = C8153a.f23795a[guideType.ordinal()];
        if (i == 1) {
            return act.getString(z ? R$string.f18939Vc : R$string.f18909Uc, str);
        }
        if (i == 2) {
            return act.getString(z ? R$string.f18999Xc : R$string.f18969Wc, m39624g(user), str);
        }
        if (i == 3) {
            return act.getString(z ? R$string.f19059Zc : R$string.f19029Yc, str);
        }
        if (i != 4) {
            return act.getString(R$string.f18909Uc, str);
        }
        return act.getString(z ? R$string.f19121bd : R$string.f19090ad, str);
    }

    /* JADX INFO: renamed from: k */
    public final String m39628k(Act act, GuideType guideType, boolean z) {
        int i = C8153a.f23795a[guideType.ordinal()];
        if (i == 1) {
            return act.getString(z ? R$string.f19183dd : R$string.f19152cd);
        }
        if (i == 2) {
            return act.getString(R$string.f19213ed);
        }
        if (i != 3) {
            return i != 4 ? act.getString(R$string.f19152cd) : act.getString(R$string.f19275gd);
        }
        return act.getString(R$string.f19244fd);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m39629l(x20 x20Var, View view) {
        m39631n();
        m39621d();
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m39630m(x20 x20Var, View view) {
        m39621d();
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m39631n() {
        String str;
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        pf60 pf60VarM147494Y = jyb.m147494Y("sl_scene_type", m39623f());
        if (userM116600p9.isNonBinary()) {
            str = "all";
        } else {
            str = userM116600p9.isFemale() ? "female" : "male";
        }
        i4g0.m138523u("e_sl_guide_impression_click", "p_sl_guide_impression_pop", pf60VarM147494Y, jyb.m147494Y("gender", str));
    }

    /* JADX INFO: renamed from: p */
    public final void m39632p(Act act, User user, final x20 x20Var, final x20 x20Var2) {
        View viewInflate = act.inflater().inflate(kec0.f125534N5, (ViewGroup) null);
        this.f23792b = (IntlSlGuideDialogView) viewInflate;
        String strM39622e = m39622e(user);
        if (!TextUtils.isEmpty(strM39622e)) {
            this.f23792b.setAvatar(strM39622e);
        }
        String str = NullChecker.m82486a(user) ? user.name : "";
        boolean zM29125v = IntlCountryCodeController.m29125v();
        this.f23792b.setTitle(m39628k(act, this.f23794d, zM29125v));
        this.f23792b.setSubtitle(m39627j(act, user, this.f23794d, zM29125v, str));
        this.f23792b.setSendButtonText(m39626i(act, zM29125v));
        this.f23792b.setSkipButtonText(act.getString(R$string.f19641s9));
        this.f23792b.setOnSendClickListener(new View.OnClickListener() { // from class: l.odp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146936a.m39629l(x20Var, view);
            }
        });
        this.f23792b.setOnSkipClickListener(new View.OnClickListener() { // from class: l.pdp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151820a.m39630m(x20Var2, view);
            }
        });
        Dialog dialogM21566z = act.dialog().m21515L(agc0.f71129o).m21518O(viewInflate).m21497C(qa00.m175859d(32.0f), 0, qa00.m175859d(32.0f), 0).m21495B(true).m21566z();
        this.f23791a = dialogM21566z;
        dialogM21566z.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.qdp
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                IntlSlGuideDialog.m39618b(x20Var2, dialogInterface);
            }
        });
        l4g0 l4g0Var = new l4g0("p_sl_guide_impression_pop", IntlSlGuideDialog.class.getName());
        this.f23793c = l4g0Var;
        l4g0Var.m152781p(jyb.m147494Y("sl_scene_type", m39623f()));
        this.f23791a.show();
        w1e.m204402f(this.f23793c);
    }
}
