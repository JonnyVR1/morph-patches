package p149l;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.CoreAssetsSettings;
import com.p046p1.mobile.putong.core.data.RateAlertSetting;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.core.p053ui.p055gp.C8346a;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public final class mx0 {

    /* JADX INFO: renamed from: n */
    public static volatile mx0 f136100n;

    /* JADX INFO: renamed from: a */
    public zpd0 f136101a = new zpd0("LastAPPStartTime", 0L);

    /* JADX INFO: renamed from: b */
    public zpd0 f136102b = new zpd0("AppActiveTimeOneDay", 0L);

    /* JADX INFO: renamed from: c */
    public tpd0 f136103c = new tpd0("APPStartCountOneDay", 0);

    /* JADX INFO: renamed from: d */
    public tpd0 f136104d = new tpd0("ContinuousActiveDays", 0);

    /* JADX INFO: renamed from: e */
    public hpd0 f136105e = new hpd0("CanShowAPPGuideDlg", Boolean.TRUE);

    /* JADX INFO: renamed from: f */
    public hpd0 f136106f = new hpd0("hasRank", Boolean.FALSE);

    /* JADX INFO: renamed from: g */
    @SuppressLint({"SV_USE_DUP_ID"})
    public zpd0 f136107g = new zpd0("LastShowAPPStoreGuideDlgTime", 0L);

    /* JADX INFO: renamed from: h */
    @SuppressLint({"SV_USE_DUP_ID"})
    public tpd0 f136108h = new tpd0("AppStoreGuideDlgShowCount", 0);

    /* JADX INFO: renamed from: i */
    public RateAlertSetting f136109i;

    /* JADX INFO: renamed from: j */
    public RateAlertSetting f136110j;

    /* JADX INFO: renamed from: k */
    public RateAlertSetting f136111k;

    /* JADX INFO: renamed from: l */
    public RateAlertSetting f136112l;

    /* JADX INFO: renamed from: m */
    public RateAlertSetting f136113m;

    /* JADX INFO: renamed from: l.mx0$a */
    public class C18581a implements RatingBar.OnRatingBarChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f136114a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ dd80 f136115b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f136116c;

        public C18581a(Act act, dd80 dd80Var, String str) {
            this.f136114a = act;
            this.f136115b = dd80Var;
            this.f136116c = str;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m156825a(float f, dd80 dd80Var, Act act, String str) {
            if (f >= 3.1f) {
                dd80Var.dismiss();
                mx0.m156782I(act, true, f, str);
            } else {
                dd80Var.dismiss();
                mx0.m156786N(act, f);
                mx0.m156802o().f136105e.put(Boolean.FALSE);
            }
        }

        @Override // android.widget.RatingBar.OnRatingBarChangeListener
        public void onRatingChanged(RatingBar ratingBar, final float f, boolean z) {
            if (z) {
                mx0.m156802o().f136106f.put(Boolean.TRUE);
                o6j0.m162859c("e_inapp_rating_star_selector", "p_appstore_rating_filter_popup", o6j0.C18854a.m162878h("inapp_rating_star_num", f + ""));
                final Act act = this.f136114a;
                final dd80 dd80Var = this.f136115b;
                final String str = this.f136116c;
                e51.m114743H(act, new Runnable() { // from class: l.lx0
                    @Override // java.lang.Runnable
                    public final void run() {
                        mx0.C18581a.m156825a(f, dd80Var, act, str);
                    }
                }, 300L);
            }
        }
    }

    public mx0() {
        CoreAssetsSettings coreAssetsSettingsM95177g = CoreModule.f17546d.m95177g();
        if (NullChecker.m81303a(coreAssetsSettingsM95177g) && NullChecker.m81303a(coreAssetsSettingsM95177g.rateAlertSetting)) {
            for (RateAlertSetting rateAlertSetting : coreAssetsSettingsM95177g.rateAlertSetting) {
                if (NullChecker.m81303a(rateAlertSetting)) {
                    if (rateAlertSetting.activeDays > 0 && m156823y(rateAlertSetting)) {
                        this.f136109i = rateAlertSetting;
                    } else if (rateAlertSetting.appOpenTimes > 0 && m156823y(rateAlertSetting)) {
                        this.f136110j = rateAlertSetting;
                    } else if (rateAlertSetting.useMinutes > 0 && m156823y(rateAlertSetting)) {
                        this.f136111k = rateAlertSetting;
                    } else if (m156823y(rateAlertSetting)) {
                        this.f136112l = rateAlertSetting;
                    } else if (rateAlertSetting.profilePictures > 0) {
                        this.f136113m = rateAlertSetting;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m156782I(final Act act, boolean z, float f, String str) {
        if (act.isFinishing() || act.isDestroyed()) {
            return;
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_promote_appstore_review_popup", "showAPPStoreRankGuideDlg");
        cwf0VarM133794c.m109039o(m156801n("passive", "alert", "alert_self_definition_basic", "appstore_rating", "swipe_page", "null", str, z ? "thanks" : "later"));
        View viewInflate = o7r.m163037a(act).inflate(f6c0.f95310Cb, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(u4c0.f174268ge);
        VText vText2 = (VText) viewInflate.findViewById(u4c0.f174148Zc);
        vText.setText(z ? R$string.f17588Al : R$string.f17648Cl);
        vText2.setText(R$string.f19040wl);
        dd80 dd80VarM110989r0 = new dd80.C16336a(act).m110963R(viewInflate).m110976e0(true).m110972a0(R$string.f19010vl, new Runnable() { // from class: l.cx0
            @Override // java.lang.Runnable
            public final void run() {
                mx0.m156794g(act);
            }
        }).m110967V(R$string.f19077xs, new Object[0]).m110961P(false).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.dx0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m110989r0();
        i0e.m133797f(cwf0VarM133794c);
        m156802o().f136108h.put(Integer.valueOf(m156802o().f136108h.get().intValue() + 1));
        m156802o().f136107g.put(Long.valueOf(mqi0.m155944o()));
        RatingBar ratingBar = (RatingBar) dd80VarM110989r0.m110906L().findViewById(u4c0.f173869J);
        if (!z) {
            f = 5.0f;
        }
        ratingBar.setRating(f);
        ratingBar.setIsIndicator(true);
    }

    /* JADX INFO: renamed from: J */
    public static void m156783J(final Act act) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        act.duringCreated(CoreModule.f17545c.f19552B0.m31611j4()).subscribe(mkd0.m154955G(new e30() { // from class: l.hx0
            @Override // p149l.e30
            public final void call(Object obj) {
                mx0.m156789b(atomicBoolean, act, (VerificationCenter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public static void m156784L(final Act act, final float f) {
        if (act.isFinishing() || act.isDestroyed()) {
            return;
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_feedback_input_popup", "showRankFeedbackDlg");
        cwf0VarM133794c.m109039o(m156800m("passive", "alert", "alert_self_definition_basic", "appstore_rating", "swipe_page", "null", null));
        final dd80 dd80VarM110960O = new dd80.C16336a(act).m110962Q(f6c0.f95294Bb).m110961P(false).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.ix0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m110960O();
        dd80VarM110960O.show();
        i0e.m133797f(cwf0VarM133794c);
        View viewM110906L = dd80VarM110960O.m110906L();
        TextView textView = (TextView) viewM110906L.findViewById(u4c0.f174181bc);
        final EditText editText = (EditText) viewM110906L.findViewById(u4c0.f174308j4);
        final InputMethodManager inputMethodManager = (InputMethodManager) act.getSystemService("input_method");
        inputMethodManager.toggleSoftInput(2, 0);
        editText.requestFocus();
        ImageView imageView = (ImageView) viewM110906L.findViewById(u4c0.f174292i4);
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.jx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mx0.m156796i(editText, dd80VarM110960O, act, f, inputMethodManager, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.kx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mx0.m156788a(dd80VarM110960O, inputMethodManager, view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public static void m156785M(Act act) {
        if (act.isFinishing() || act.isDestroyed()) {
            return;
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_feedback_acknowledge_popup", "showRankFeedbackFinishedDlg");
        cwf0VarM133794c.m109039o(m156800m("passive", "alert", "alert_self_definition_basic", "appstore_rating", "swipe_page", "null", null));
        new dd80.C16336a(act).m110995x0(R$string.f18462dm, new Object[0]).m110990s0(R$string.f18980ul, new Object[0]).m110961P(false).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.bx0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m110971Z(R$string.f18715m).m110960O().show();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: N */
    public static void m156786N(final Act act, final float f) {
        if (act.isFinishing() || act.isDestroyed()) {
            return;
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_go_to_feedback_popup", "showRankFeedbackGuideDlg");
        cwf0VarM133794c.m109039o(m156800m("passive", "alert", "alert_self_definition_basic", "appstore_rating", "swipe_page", "null", null));
        new dd80.C16336a(act).m110995x0(R$string.f19100yl, new Object[0]).m110990s0(R$string.f19070xl, new Object[0]).m110961P(false).m110972a0(R$string.f17768Gl, new Runnable() { // from class: l.fx0
            @Override // java.lang.Runnable
            public final void run() {
                mx0.m156792e(act, f);
            }
        }).m110967V(R$string.f19077xs, new Object[0]).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.gx0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m110989r0();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: O */
    public static void m156787O(Act act, String str) {
        if (act.isFinishing() || act.isDestroyed()) {
            return;
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_appstore_rating_filter_popup", "showRankGuideDlg");
        cwf0VarM133794c.m109039o(m156800m("passive", "alert", "alert_self_definition_basic", "appstore_rating", "swipe_page", "null", str));
        View viewInflate = o7r.m163037a(act).inflate(f6c0.f95310Cb, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(u4c0.f174268ge);
        VText vText2 = (VText) viewInflate.findViewById(u4c0.f174148Zc);
        vText.setText(R$string.f19130zl);
        vText2.setText(R$string.f17618Bl);
        dd80 dd80VarM110989r0 = new dd80.C16336a(act).m110963R(viewInflate).m110961P(true).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.ex0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m110989r0();
        i0e.m133797f(cwf0VarM133794c);
        m156802o().f136107g.put(Long.valueOf(mqi0.m155944o()));
        ((RatingBar) dd80VarM110989r0.m110906L().findViewById(u4c0.f173869J)).setOnRatingBarChangeListener(new C18581a(act, dd80VarM110989r0, str));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m156788a(dd80 dd80Var, InputMethodManager inputMethodManager, View view) {
        dd80Var.dismiss();
        inputMethodManager.hideSoftInputFromWindow(dd80Var.m110906L().getWindowToken(), 0);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m156789b(AtomicBoolean atomicBoolean, Act act, VerificationCenter verificationCenter) {
        if (atomicBoolean.get()) {
            return;
        }
        if (TEnum.equals((NullChecker.m81303a(verificationCenter) && NullChecker.m81303a(verificationCenter.picVerificationInfo)) ? verificationCenter.picVerificationInfo.status : null, "verified")) {
            atomicBoolean.set(true);
            if (CoreModule.f17545c.f19639e0.m169527p9().pictures.size() > m156802o().m156814p()) {
                if (m156802o().m156807E()) {
                    m156787O(act, "verification");
                }
                if (m156802o().m156824z()) {
                    m156782I(act, false, 5.0f, "verification");
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m156792e(Act act, float f) {
        o6j0.m162859c("e_go_to_feedback_button", "p_go_to_feedback_popup", new o6j0.C18854a[0]);
        m156784L(act, f);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m156794g(Act act) {
        o6j0.m162859c("e_promote_appstore_popup_five_star_button", "p_promote_appstore_review_popup", new o6j0.C18854a[0]);
        m156802o().f136105e.put(Boolean.FALSE);
        try {
            vuw.m200138d(act);
            e = null;
        } catch (Exception e) {
            e = e;
            CrashHelper.m81296c(e);
        }
        if (NullChecker.m81303a(e)) {
            lsi0.m151578h(R$string.f17858Jl);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m156796i(EditText editText, dd80 dd80Var, Act act, float f, InputMethodManager inputMethodManager, View view) {
        if (TextUtils.isEmpty(editText.getText())) {
            return;
        }
        o6j0.m162859c("e_feedback_input_popup_submit_button", "p_feedback_input_popup", new o6j0.C18854a[0]);
        String string = editText.getText().toString();
        dd80Var.dismiss();
        m156785M(act);
        CoreModule.f17545c.f19618X.m113773i3(string, f);
        inputMethodManager.hideSoftInputFromWindow(dd80Var.m110906L().getWindowToken(), 0);
    }

    /* JADX INFO: renamed from: m */
    public static JSONObject m156800m(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tooltips_trigger_mode", str);
            jSONObject.put("tooltips_type", str2);
            jSONObject.put("tooltips_type_ui", str3);
            jSONObject.put("tooltips_trigger_module", str6);
            jSONObject.put("tooltips_trigger_page", str5);
            jSONObject.put("tooltips_trigger_reason", str4);
            if (TextUtils.isEmpty(str7)) {
                return jSONObject;
            }
            jSONObject.put("inapp_rating_trigger_type", str7);
            return jSONObject;
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: n */
    public static JSONObject m156801n(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tooltips_trigger_mode", str);
            jSONObject.put("tooltips_type", str2);
            jSONObject.put("tooltips_type_ui", str3);
            jSONObject.put("tooltips_trigger_module", str6);
            jSONObject.put("tooltips_trigger_page", str5);
            jSONObject.put("tooltips_trigger_reason", str4);
            if (!TextUtils.isEmpty(str7)) {
                jSONObject.put("inapp_rating_trigger_type", str7);
            }
            jSONObject.put("review_popup_type", str8);
            return jSONObject;
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: o */
    public static mx0 m156802o() {
        if (f136100n == null) {
            synchronized (mx0.class) {
                try {
                    if (f136100n == null) {
                        f136100n = new mx0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f136100n;
    }

    /* JADX INFO: renamed from: A */
    public boolean m156803A() {
        return false;
    }

    /* JADX INFO: renamed from: B */
    public boolean m156804B() {
        return false;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m156805C() {
        return false;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m156806D() {
        return false;
    }

    /* JADX INFO: renamed from: E */
    public boolean m156807E() {
        return false;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m156808F(int i) {
        return i >= 0 && this.f136104d.get().intValue() >= i;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m156809G(int i) {
        return qqi0.m175940h(mqi0.m155944o(), (long) CoreModule.f17545c.f19639e0.m169527p9().createdTime, i - 1);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m156810H(Act act) {
        if (act.isFinishing() || act.isDestroyed()) {
            return;
        }
        if (ogl0.m164227F() && m156802o().m156803A()) {
            m156782I(act, false, 5.0f, m156815q());
            ic50.m135327j().m135333f().m145241b0(OmsDialog.p_appstore_rating_filter_popup_store.getIdentifier(), 0, true);
        } else if (m156802o().m156824z()) {
            m156782I(act, false, 5.0f, m156815q());
        }
        if (ogl0.m164227F() && m156802o().m156806D()) {
            ic50.m135327j().m135333f().m145241b0(OmsDialog.p_appstore_rating_filter_popup.getIdentifier(), 0, true);
            m156787O(act, m156815q());
        } else if (m156802o().m156805C()) {
            m156787O(act, m156815q());
        }
    }

    /* JADX INFO: renamed from: K */
    public void m156811K(final Act act) {
        e51.m114742G(new Runnable() { // from class: l.ax0
            @Override // java.lang.Runnable
            public final void run() {
                this.f72088a.m156810H(act);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public void m156812P() {
        if (m156802o().f136101a.get().longValue() == 0) {
            m156802o().f136101a.put(Long.valueOf(mqi0.m155944o()));
            m156802o().f136104d.put(1);
        }
        if (mqi0.m155929D(m156802o().f136101a.get().longValue())) {
            m156802o().f136103c.put(Integer.valueOf(m156802o().f136103c.get().intValue() + 1));
        } else if (qqi0.m175940h(mqi0.m155944o(), m156802o().f136101a.get().longValue(), 2)) {
            m156802o().f136104d.put(1);
            m156802o().f136103c.put(1);
            m156802o().f136102b.put(0L);
        } else {
            m156802o().f136104d.put(Integer.valueOf(m156802o().f136104d.get().intValue() + 1));
            m156802o().f136103c.put(1);
            m156802o().f136102b.put(0L);
        }
        m156802o().f136101a.put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: Q */
    public void m156813Q() {
        if (m156802o().f136101a.get().longValue() == 0) {
            m156802o().f136101a.put(Long.valueOf(mqi0.m155944o()));
        } else {
            m156802o().f136102b.put(Long.valueOf(m156802o().f136102b.get().longValue() + ((mqi0.m155944o() - (mqi0.m155929D(m156802o().f136101a.get().longValue()) ? m156802o().f136101a.get().longValue() : mqi0.m155943n())) / 1000)));
        }
    }

    /* JADX INFO: renamed from: p */
    public int m156814p() {
        RateAlertSetting rateAlertSetting = this.f136113m;
        if (rateAlertSetting != null) {
            return rateAlertSetting.profilePictures;
        }
        return 4;
    }

    /* JADX INFO: renamed from: q */
    public final String m156815q() {
        if (m156818t()) {
            return "retention";
        }
        if (m156819u()) {
            return "app_opens";
        }
        if (m156820v()) {
            return "time_spent";
        }
        return m156821w() ? "received_message" : "";
    }

    /* JADX INFO: renamed from: r */
    public final boolean m156816r(int i) {
        return i > 0 && this.f136103c.get().intValue() > i;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m156817s(int i) {
        return i > 0 && this.f136102b.get().longValue() > ((long) (i * 60));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0090 A[RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x005d, please report this as an issue */
    /* JADX INFO: renamed from: t */
    public final boolean m156818t() {
        int iIntValue;
        RateAlertSetting rateAlertSetting;
        int i;
        int iIntValue2;
        RateAlertSetting rateAlertSetting2;
        if (CoreModule.m29931H().signedIn_()) {
            RateAlertSetting rateAlertSetting3 = this.f136109i;
            if (m156808F(rateAlertSetting3 != null ? rateAlertSetting3.activeDays : 4)) {
                RateAlertSetting rateAlertSetting4 = this.f136109i;
                if (m156809G(rateAlertSetting4 != null ? rateAlertSetting4.registerDays.get(0).get(0).intValue() : 1)) {
                    RateAlertSetting rateAlertSetting5 = this.f136109i;
                    if (!m156809G(rateAlertSetting5 != null ? rateAlertSetting5.registerDays.get(0).get(1).intValue() : 10)) {
                        iIntValue = C8346a.m45563j().f29309l.get().intValue();
                        rateAlertSetting = this.f136109i;
                        if (rateAlertSetting != null) {
                            i = rateAlertSetting.sentMessages;
                        } else {
                            i = 5;
                        }
                        if (iIntValue > i) {
                            iIntValue2 = C8346a.m45563j().f29308k.get().intValue();
                            rateAlertSetting2 = this.f136109i;
                            if (iIntValue2 > (rateAlertSetting2 != null ? rateAlertSetting2.receivedMessages : 5)) {
                                return true;
                            }
                        }
                    } else if (m156822x()) {
                        iIntValue = C8346a.m45563j().f29309l.get().intValue();
                        rateAlertSetting = this.f136109i;
                        if (rateAlertSetting != null) {
                            i = rateAlertSetting.sentMessages;
                        } else {
                            i = 5;
                        }
                        if (iIntValue > i) {
                            iIntValue2 = C8346a.m45563j().f29308k.get().intValue();
                            rateAlertSetting2 = this.f136109i;
                            if (iIntValue2 > (rateAlertSetting2 != null ? rateAlertSetting2.receivedMessages : 5)) {
                                return true;
                            }
                        }
                    }
                } else if (m156822x()) {
                    iIntValue = C8346a.m45563j().f29309l.get().intValue();
                    rateAlertSetting = this.f136109i;
                    if (rateAlertSetting != null) {
                        i = rateAlertSetting.sentMessages;
                    } else {
                        i = 5;
                    }
                    if (iIntValue > i) {
                        iIntValue2 = C8346a.m45563j().f29308k.get().intValue();
                        rateAlertSetting2 = this.f136109i;
                        if (iIntValue2 > (rateAlertSetting2 != null ? rateAlertSetting2.receivedMessages : 5)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0090 A[RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x005d, please report this as an issue */
    /* JADX INFO: renamed from: u */
    public final boolean m156819u() {
        int iIntValue;
        RateAlertSetting rateAlertSetting;
        int i;
        int iIntValue2;
        RateAlertSetting rateAlertSetting2;
        if (CoreModule.m29931H().signedIn_()) {
            RateAlertSetting rateAlertSetting3 = this.f136110j;
            if (m156816r(rateAlertSetting3 != null ? rateAlertSetting3.appOpenTimes : 16)) {
                RateAlertSetting rateAlertSetting4 = this.f136110j;
                if (m156809G(rateAlertSetting4 != null ? rateAlertSetting4.registerDays.get(0).get(0).intValue() : 2)) {
                    RateAlertSetting rateAlertSetting5 = this.f136110j;
                    if (!m156809G(rateAlertSetting5 != null ? rateAlertSetting5.registerDays.get(0).get(1).intValue() : 7)) {
                        iIntValue = C8346a.m45563j().f29309l.get().intValue();
                        rateAlertSetting = this.f136110j;
                        if (rateAlertSetting != null) {
                            i = rateAlertSetting.sentMessages;
                        } else {
                            i = 5;
                        }
                        if (iIntValue > i) {
                            iIntValue2 = C8346a.m45563j().f29308k.get().intValue();
                            rateAlertSetting2 = this.f136110j;
                            if (iIntValue2 > (rateAlertSetting2 != null ? rateAlertSetting2.receivedMessages : 5)) {
                                return true;
                            }
                        }
                    } else if (m156822x()) {
                        iIntValue = C8346a.m45563j().f29309l.get().intValue();
                        rateAlertSetting = this.f136110j;
                        if (rateAlertSetting != null) {
                            i = rateAlertSetting.sentMessages;
                        } else {
                            i = 5;
                        }
                        if (iIntValue > i) {
                            iIntValue2 = C8346a.m45563j().f29308k.get().intValue();
                            rateAlertSetting2 = this.f136110j;
                            if (iIntValue2 > (rateAlertSetting2 != null ? rateAlertSetting2.receivedMessages : 5)) {
                                return true;
                            }
                        }
                    }
                } else if (m156822x()) {
                    iIntValue = C8346a.m45563j().f29309l.get().intValue();
                    rateAlertSetting = this.f136110j;
                    if (rateAlertSetting != null) {
                        i = rateAlertSetting.sentMessages;
                    } else {
                        i = 5;
                    }
                    if (iIntValue > i) {
                        iIntValue2 = C8346a.m45563j().f29308k.get().intValue();
                        rateAlertSetting2 = this.f136110j;
                        if (iIntValue2 > (rateAlertSetting2 != null ? rateAlertSetting2.receivedMessages : 5)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0090 A[RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x005d, please report this as an issue */
    /* JADX INFO: renamed from: v */
    public final boolean m156820v() {
        int iIntValue;
        RateAlertSetting rateAlertSetting;
        int i;
        int iIntValue2;
        RateAlertSetting rateAlertSetting2;
        if (CoreModule.m29931H().signedIn_()) {
            RateAlertSetting rateAlertSetting3 = this.f136111k;
            if (m156817s(rateAlertSetting3 != null ? rateAlertSetting3.useMinutes : 22)) {
                RateAlertSetting rateAlertSetting4 = this.f136111k;
                if (m156809G(rateAlertSetting4 != null ? rateAlertSetting4.registerDays.get(0).get(0).intValue() : 2)) {
                    RateAlertSetting rateAlertSetting5 = this.f136111k;
                    if (!m156809G(rateAlertSetting5 != null ? rateAlertSetting5.registerDays.get(0).get(1).intValue() : 7)) {
                        iIntValue = C8346a.m45563j().f29309l.get().intValue();
                        rateAlertSetting = this.f136111k;
                        if (rateAlertSetting != null) {
                            i = rateAlertSetting.sentMessages;
                        } else {
                            i = 5;
                        }
                        if (iIntValue > i) {
                            iIntValue2 = C8346a.m45563j().f29308k.get().intValue();
                            rateAlertSetting2 = this.f136111k;
                            if (iIntValue2 > (rateAlertSetting2 != null ? rateAlertSetting2.receivedMessages : 5)) {
                                return true;
                            }
                        }
                    } else if (m156822x()) {
                        iIntValue = C8346a.m45563j().f29309l.get().intValue();
                        rateAlertSetting = this.f136111k;
                        if (rateAlertSetting != null) {
                            i = rateAlertSetting.sentMessages;
                        } else {
                            i = 5;
                        }
                        if (iIntValue > i) {
                            iIntValue2 = C8346a.m45563j().f29308k.get().intValue();
                            rateAlertSetting2 = this.f136111k;
                            if (iIntValue2 > (rateAlertSetting2 != null ? rateAlertSetting2.receivedMessages : 5)) {
                                return true;
                            }
                        }
                    }
                } else if (m156822x()) {
                    iIntValue = C8346a.m45563j().f29309l.get().intValue();
                    rateAlertSetting = this.f136111k;
                    if (rateAlertSetting != null) {
                        i = rateAlertSetting.sentMessages;
                    } else {
                        i = 5;
                    }
                    if (iIntValue > i) {
                        iIntValue2 = C8346a.m45563j().f29308k.get().intValue();
                        rateAlertSetting2 = this.f136111k;
                        if (iIntValue2 > (rateAlertSetting2 != null ? rateAlertSetting2.receivedMessages : 5)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083 A[RETURN] */
    /* JADX INFO: renamed from: w */
    public final boolean m156821w() {
        int iIntValue;
        RateAlertSetting rateAlertSetting;
        int i;
        int iIntValue2;
        RateAlertSetting rateAlertSetting2;
        int i2;
        if (CoreModule.m29931H().signedIn_()) {
            RateAlertSetting rateAlertSetting3 = this.f136112l;
            if (m156809G(rateAlertSetting3 != null ? rateAlertSetting3.registerDays.get(0).get(0).intValue() : 2)) {
                RateAlertSetting rateAlertSetting4 = this.f136112l;
                if (!m156809G(rateAlertSetting4 != null ? rateAlertSetting4.registerDays.get(0).get(1).intValue() : 7)) {
                    iIntValue = C8346a.m45563j().f29309l.get().intValue();
                    rateAlertSetting = this.f136112l;
                    if (rateAlertSetting != null) {
                        i = rateAlertSetting.sentMessages;
                    } else {
                        i = 5;
                    }
                    if (iIntValue > i) {
                        iIntValue2 = C8346a.m45563j().f29308k.get().intValue();
                        rateAlertSetting2 = this.f136112l;
                        if (rateAlertSetting2 != null) {
                            i2 = rateAlertSetting2.receivedMessages;
                        } else {
                            i2 = 22;
                        }
                        if (iIntValue2 > i2) {
                            return true;
                        }
                    }
                } else if (m156822x()) {
                    iIntValue = C8346a.m45563j().f29309l.get().intValue();
                    rateAlertSetting = this.f136112l;
                    if (rateAlertSetting != null) {
                        i = rateAlertSetting.sentMessages;
                    } else {
                        i = 5;
                    }
                    if (iIntValue > i) {
                        iIntValue2 = C8346a.m45563j().f29308k.get().intValue();
                        rateAlertSetting2 = this.f136112l;
                        if (rateAlertSetting2 != null) {
                            i2 = rateAlertSetting2.receivedMessages;
                        } else {
                            i2 = 22;
                        }
                        if (iIntValue2 > i2) {
                            return true;
                        }
                    }
                }
            } else if (m156822x()) {
                iIntValue = C8346a.m45563j().f29309l.get().intValue();
                rateAlertSetting = this.f136112l;
                if (rateAlertSetting != null) {
                    i = rateAlertSetting.sentMessages;
                } else {
                    i = 5;
                }
                if (iIntValue > i) {
                    iIntValue2 = C8346a.m45563j().f29308k.get().intValue();
                    rateAlertSetting2 = this.f136112l;
                    if (rateAlertSetting2 != null) {
                        i2 = rateAlertSetting2.receivedMessages;
                    } else {
                        i2 = 22;
                    }
                    if (iIntValue2 > i2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m156822x() {
        return qqi0.m175940h(mqi0.m155944o(), (long) CoreModule.f17545c.f19639e0.m169527p9().createdTime, 365);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m156823y(RateAlertSetting rateAlertSetting) {
        List<List<Integer>> list;
        return (rateAlertSetting == null || (list = rateAlertSetting.registerDays) == null || list.size() <= 0 || rateAlertSetting.registerDays.get(0) == null || rateAlertSetting.registerDays.get(0).size() != 2) ? false : true;
    }

    /* JADX INFO: renamed from: z */
    public boolean m156824z() {
        return false;
    }
}
