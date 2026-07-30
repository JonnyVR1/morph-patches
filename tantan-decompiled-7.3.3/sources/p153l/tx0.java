package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.CoreAssetsSettings;
import com.p051p1.mobile.putong.core.data.RateAlertSetting;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.core.p058ui.p060gp.C8509a;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public final class tx0 {

    /* JADX INFO: renamed from: n */
    public static volatile tx0 f176470n;

    /* JADX INFO: renamed from: a */
    public byd0 f176471a = new byd0("LastAPPStartTime", 0L);

    /* JADX INFO: renamed from: b */
    public byd0 f176472b = new byd0("AppActiveTimeOneDay", 0L);

    /* JADX INFO: renamed from: c */
    public vxd0 f176473c = new vxd0("APPStartCountOneDay", 0);

    /* JADX INFO: renamed from: d */
    public vxd0 f176474d = new vxd0("ContinuousActiveDays", 0);

    /* JADX INFO: renamed from: e */
    public jxd0 f176475e = new jxd0("CanShowAPPGuideDlg", Boolean.TRUE);

    /* JADX INFO: renamed from: f */
    public jxd0 f176476f = new jxd0("hasRank", Boolean.FALSE);

    /* JADX INFO: renamed from: g */
    @SuppressLint({"SV_USE_DUP_ID"})
    public byd0 f176477g = new byd0("LastShowAPPStoreGuideDlgTime", 0L);

    /* JADX INFO: renamed from: h */
    @SuppressLint({"SV_USE_DUP_ID"})
    public vxd0 f176478h = new vxd0("AppStoreGuideDlgShowCount", 0);

    /* JADX INFO: renamed from: i */
    public RateAlertSetting f176479i;

    /* JADX INFO: renamed from: j */
    public RateAlertSetting f176480j;

    /* JADX INFO: renamed from: k */
    public RateAlertSetting f176481k;

    /* JADX INFO: renamed from: l */
    public RateAlertSetting f176482l;

    /* JADX INFO: renamed from: m */
    public RateAlertSetting f176483m;

    /* JADX INFO: renamed from: l.tx0$a */
    public class C20417a implements RatingBar.OnRatingBarChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f176484a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ jl80 f176485b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f176486c;

        public C20417a(Act act, jl80 jl80Var, String str) {
            this.f176484a = act;
            this.f176485b = jl80Var;
            this.f176486c = str;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m193462a(float f, jl80 jl80Var, Act act, String str) {
            if (f >= 3.1f) {
                jl80Var.dismiss();
                tx0.m193419I(act, true, f, str);
            } else {
                jl80Var.dismiss();
                tx0.m193423N(act, f);
                tx0.m193439o().f176475e.put(Boolean.FALSE);
            }
        }

        @Override // android.widget.RatingBar.OnRatingBarChangeListener
        public void onRatingChanged(RatingBar ratingBar, final float f, boolean z) {
            if (z) {
                tx0.m193439o().f176476f.put(Boolean.TRUE);
                sfj0.m185596c("e_inapp_rating_star_selector", "p_appstore_rating_filter_popup", sfj0.C20032a.m185615h("inapp_rating_star_num", f + ""));
                final Act act = this.f176484a;
                final jl80 jl80Var = this.f176485b;
                final String str = this.f176486c;
                l51.m152888H(act, new Runnable() { // from class: l.sx0
                    @Override // java.lang.Runnable
                    public final void run() {
                        tx0.C20417a.m193462a(f, jl80Var, act, str);
                    }
                }, 300L);
            }
        }
    }

    public tx0() {
        CoreAssetsSettings coreAssetsSettingsM144645g = CoreModule.f18265d.m144645g();
        if (NullChecker.m82486a(coreAssetsSettingsM144645g) && NullChecker.m82486a(coreAssetsSettingsM144645g.rateAlertSetting)) {
            for (RateAlertSetting rateAlertSetting : coreAssetsSettingsM144645g.rateAlertSetting) {
                if (NullChecker.m82486a(rateAlertSetting)) {
                    if (rateAlertSetting.activeDays > 0 && m193460y(rateAlertSetting)) {
                        this.f176479i = rateAlertSetting;
                    } else if (rateAlertSetting.appOpenTimes > 0 && m193460y(rateAlertSetting)) {
                        this.f176480j = rateAlertSetting;
                    } else if (rateAlertSetting.useMinutes > 0 && m193460y(rateAlertSetting)) {
                        this.f176481k = rateAlertSetting;
                    } else if (m193460y(rateAlertSetting)) {
                        this.f176482l = rateAlertSetting;
                    } else if (rateAlertSetting.profilePictures > 0) {
                        this.f176483m = rateAlertSetting;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m193419I(final Act act, boolean z, float f, String str) {
        if (act.isFinishing() || act.isDestroyed()) {
            return;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_promote_appstore_review_popup", "showAPPStoreRankGuideDlg");
        l4g0VarM204399c.m152780o(m193438n("passive", "alert", "alert_self_definition_basic", "appstore_rating", "swipe_page", "null", str, z ? "thanks" : "later"));
        View viewInflate = p9r.m171370a(act).inflate(kec0.f125476Jb, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(adc0.f70409je);
        VText vText2 = (VText) viewInflate.findViewById(adc0.f70273bd);
        vText.setText(z ? R$string.f18978Wl : R$string.f19038Yl);
        vText2.setText(R$string.f18858Sl);
        jl80 jl80VarM146049r0 = new jl80.C17971a(act).m146023R(viewInflate).m146036e0(true).m146032a0(R$string.f18828Rl, new Runnable() { // from class: l.jx0
            @Override // java.lang.Runnable
            public final void run() {
                tx0.m193431g(act);
            }
        }).m146027V(R$string.f18895Ts, new Object[0]).m146021P(false).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.kx0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m146049r0();
        w1e.m204402f(l4g0VarM204399c);
        m193439o().f176478h.put(Integer.valueOf(m193439o().f176478h.get().intValue() + 1));
        m193439o().f176477g.put(Long.valueOf(pzi0.m174454o()));
        RatingBar ratingBar = (RatingBar) jl80VarM146049r0.m145966L().findViewById(adc0.f69957J);
        if (!z) {
            f = 5.0f;
        }
        ratingBar.setRating(f);
        ratingBar.setIsIndicator(true);
    }

    /* JADX INFO: renamed from: J */
    public static void m193420J(final Act act) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        act.duringCreated(CoreModule.f18264c.f20294B0.m32614j4()).subscribe(psd0.m173596G(new y20() { // from class: l.ox0
            @Override // p153l.y20
            public final void call(Object obj) {
                tx0.m193426b(atomicBoolean, act, (VerificationCenter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public static void m193421L(final Act act, final float f) {
        if (act.isFinishing() || act.isDestroyed()) {
            return;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_feedback_input_popup", "showRankFeedbackDlg");
        l4g0VarM204399c.m152780o(m193437m("passive", "alert", "alert_self_definition_basic", "appstore_rating", "swipe_page", "null", null));
        final jl80 jl80VarM146020O = new jl80.C17971a(act).m146022Q(kec0.f125460Ib).m146021P(false).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.px0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m146020O();
        jl80VarM146020O.show();
        w1e.m204402f(l4g0VarM204399c);
        View viewM145966L = jl80VarM146020O.m145966L();
        TextView textView = (TextView) viewM145966L.findViewById(adc0.f70306dc);
        final EditText editText = (EditText) viewM145966L.findViewById(adc0.f70433l4);
        final InputMethodManager inputMethodManager = (InputMethodManager) act.getSystemService("input_method");
        inputMethodManager.toggleSoftInput(2, 0);
        editText.requestFocus();
        ImageView imageView = (ImageView) viewM145966L.findViewById(adc0.f70416k4);
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.qx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tx0.m193433i(editText, jl80VarM146020O, act, f, inputMethodManager, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.rx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tx0.m193425a(jl80VarM146020O, inputMethodManager, view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public static void m193422M(Act act) {
        if (act.isFinishing() || act.isDestroyed()) {
            return;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_feedback_acknowledge_popup", "showRankFeedbackFinishedDlg");
        l4g0VarM204399c.m152780o(m193437m("passive", "alert", "alert_self_definition_basic", "appstore_rating", "swipe_page", "null", null));
        new jl80.C17971a(act).m146055x0(R$string.f19871zm, new Object[0]).m146050s0(R$string.f18798Ql, new Object[0]).m146021P(false).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.ix0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m146031Z(R$string.f19445m).m146020O().show();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: N */
    public static void m193423N(final Act act, final float f) {
        if (act.isFinishing() || act.isDestroyed()) {
            return;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_go_to_feedback_popup", "showRankFeedbackGuideDlg");
        l4g0VarM204399c.m152780o(m193437m("passive", "alert", "alert_self_definition_basic", "appstore_rating", "swipe_page", "null", null));
        new jl80.C17971a(act).m146055x0(R$string.f18918Ul, new Object[0]).m146050s0(R$string.f18888Tl, new Object[0]).m146021P(false).m146032a0(R$string.f19161cm, new Runnable() { // from class: l.mx0
            @Override // java.lang.Runnable
            public final void run() {
                tx0.m193429e(act, f);
            }
        }).m146027V(R$string.f18895Ts, new Object[0]).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.nx0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m146049r0();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: O */
    public static void m193424O(Act act, String str) {
        if (act.isFinishing() || act.isDestroyed()) {
            return;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_appstore_rating_filter_popup", "showRankGuideDlg");
        l4g0VarM204399c.m152780o(m193437m("passive", "alert", "alert_self_definition_basic", "appstore_rating", "swipe_page", "null", str));
        View viewInflate = p9r.m171370a(act).inflate(kec0.f125476Jb, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(adc0.f70409je);
        VText vText2 = (VText) viewInflate.findViewById(adc0.f70273bd);
        vText.setText(R$string.f18948Vl);
        vText2.setText(R$string.f19008Xl);
        jl80 jl80VarM146049r0 = new jl80.C17971a(act).m146023R(viewInflate).m146021P(true).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.lx0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m146049r0();
        w1e.m204402f(l4g0VarM204399c);
        m193439o().f176477g.put(Long.valueOf(pzi0.m174454o()));
        ((RatingBar) jl80VarM146049r0.m145966L().findViewById(adc0.f69957J)).setOnRatingBarChangeListener(new C20417a(act, jl80VarM146049r0, str));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m193425a(jl80 jl80Var, InputMethodManager inputMethodManager, View view) {
        jl80Var.dismiss();
        inputMethodManager.hideSoftInputFromWindow(jl80Var.m145966L().getWindowToken(), 0);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m193426b(AtomicBoolean atomicBoolean, Act act, VerificationCenter verificationCenter) {
        if (atomicBoolean.get()) {
            return;
        }
        if (TEnum.equals((NullChecker.m82486a(verificationCenter) && NullChecker.m82486a(verificationCenter.picVerificationInfo)) ? verificationCenter.picVerificationInfo.status : null, "verified")) {
            atomicBoolean.set(true);
            if (CoreModule.f18264c.f20381e0.m116600p9().pictures.size() > m193439o().m193451p()) {
                if (m193439o().m193444E()) {
                    m193424O(act, "verification");
                }
                if (m193439o().m193461z()) {
                    m193419I(act, false, 5.0f, "verification");
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m193429e(Act act, float f) {
        sfj0.m185596c("e_go_to_feedback_button", "p_go_to_feedback_popup", new sfj0.C20032a[0]);
        m193421L(act, f);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m193431g(Act act) {
        sfj0.m185596c("e_promote_appstore_popup_five_star_button", "p_promote_appstore_review_popup", new sfj0.C20032a[0]);
        m193439o().f176475e.put(Boolean.FALSE);
        try {
            uxw.m198548d(act);
            e = null;
        } catch (Exception e) {
            e = e;
            CrashHelper.m82479c(e);
        }
        if (NullChecker.m82486a(e)) {
            o1j0.m165634h(R$string.f19253fm);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m193433i(EditText editText, jl80 jl80Var, Act act, float f, InputMethodManager inputMethodManager, View view) {
        if (TextUtils.isEmpty(editText.getText())) {
            return;
        }
        sfj0.m185596c("e_feedback_input_popup_submit_button", "p_feedback_input_popup", new sfj0.C20032a[0]);
        String string = editText.getText().toString();
        jl80Var.dismiss();
        m193422M(act);
        CoreModule.f18264c.f20360X.m174052i3(string, f);
        inputMethodManager.hideSoftInputFromWindow(jl80Var.m145966L().getWindowToken(), 0);
    }

    /* JADX INFO: renamed from: m */
    public static JSONObject m193437m(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
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
            CrashHelper.m82479c(e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: n */
    public static JSONObject m193438n(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
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
            CrashHelper.m82479c(e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: o */
    public static tx0 m193439o() {
        if (f176470n == null) {
            synchronized (tx0.class) {
                try {
                    if (f176470n == null) {
                        f176470n = new tx0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f176470n;
    }

    /* JADX INFO: renamed from: A */
    public boolean m193440A() {
        return false;
    }

    /* JADX INFO: renamed from: B */
    public boolean m193441B() {
        return false;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m193442C() {
        return false;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m193443D() {
        return false;
    }

    /* JADX INFO: renamed from: E */
    public boolean m193444E() {
        return false;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m193445F(int i) {
        return i >= 0 && this.f176474d.get().intValue() >= i;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m193446G(int i) {
        return tzi0.m193670h(pzi0.m174454o(), (long) CoreModule.f18264c.f20381e0.m116600p9().createdTime, i - 1);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m193447H(Act act) {
        if (act.isFinishing() || act.isDestroyed()) {
            return;
        }
        if (spl0.m187354F() && m193439o().m193440A()) {
            m193419I(act, false, 5.0f, m193452q());
            pk50.m172568j().m172574f().m181664b0(OmsDialog.p_appstore_rating_filter_popup_store.getIdentifier(), 0, true);
        } else if (m193439o().m193461z()) {
            m193419I(act, false, 5.0f, m193452q());
        }
        if (spl0.m187354F() && m193439o().m193443D()) {
            pk50.m172568j().m172574f().m181664b0(OmsDialog.p_appstore_rating_filter_popup.getIdentifier(), 0, true);
            m193424O(act, m193452q());
        } else if (m193439o().m193442C()) {
            m193424O(act, m193452q());
        }
    }

    /* JADX INFO: renamed from: K */
    public void m193448K(final Act act) {
        l51.m152887G(new Runnable() { // from class: l.hx0
            @Override // java.lang.Runnable
            public final void run() {
                this.f111960a.m193447H(act);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public void m193449P() {
        if (m193439o().f176471a.get().longValue() == 0) {
            m193439o().f176471a.put(Long.valueOf(pzi0.m174454o()));
            m193439o().f176474d.put(1);
        }
        if (pzi0.m174439D(m193439o().f176471a.get().longValue())) {
            m193439o().f176473c.put(Integer.valueOf(m193439o().f176473c.get().intValue() + 1));
        } else if (tzi0.m193670h(pzi0.m174454o(), m193439o().f176471a.get().longValue(), 2)) {
            m193439o().f176474d.put(1);
            m193439o().f176473c.put(1);
            m193439o().f176472b.put(0L);
        } else {
            m193439o().f176474d.put(Integer.valueOf(m193439o().f176474d.get().intValue() + 1));
            m193439o().f176473c.put(1);
            m193439o().f176472b.put(0L);
        }
        m193439o().f176471a.put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: Q */
    public void m193450Q() {
        if (m193439o().f176471a.get().longValue() == 0) {
            m193439o().f176471a.put(Long.valueOf(pzi0.m174454o()));
        } else {
            m193439o().f176472b.put(Long.valueOf(m193439o().f176472b.get().longValue() + ((pzi0.m174454o() - (pzi0.m174439D(m193439o().f176471a.get().longValue()) ? m193439o().f176471a.get().longValue() : pzi0.m174453n())) / 1000)));
        }
    }

    /* JADX INFO: renamed from: p */
    public int m193451p() {
        RateAlertSetting rateAlertSetting = this.f176483m;
        if (rateAlertSetting != null) {
            return rateAlertSetting.profilePictures;
        }
        return 4;
    }

    /* JADX INFO: renamed from: q */
    public final String m193452q() {
        if (m193455t()) {
            return "retention";
        }
        if (m193456u()) {
            return "app_opens";
        }
        if (m193457v()) {
            return "time_spent";
        }
        return m193458w() ? "received_message" : "";
    }

    /* JADX INFO: renamed from: r */
    public final boolean m193453r(int i) {
        return i > 0 && this.f176473c.get().intValue() > i;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m193454s(int i) {
        return i > 0 && this.f176472b.get().longValue() > ((long) (i * 60));
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
    public final boolean m193455t() {
        int iIntValue;
        RateAlertSetting rateAlertSetting;
        int i;
        int iIntValue2;
        RateAlertSetting rateAlertSetting2;
        if (CoreModule.m30929H().signedIn_()) {
            RateAlertSetting rateAlertSetting3 = this.f176479i;
            if (m193445F(rateAlertSetting3 != null ? rateAlertSetting3.activeDays : 4)) {
                RateAlertSetting rateAlertSetting4 = this.f176479i;
                if (m193446G(rateAlertSetting4 != null ? rateAlertSetting4.registerDays.get(0).get(0).intValue() : 1)) {
                    RateAlertSetting rateAlertSetting5 = this.f176479i;
                    if (!m193446G(rateAlertSetting5 != null ? rateAlertSetting5.registerDays.get(0).get(1).intValue() : 10)) {
                        iIntValue = C8509a.m46746j().f30157l.get().intValue();
                        rateAlertSetting = this.f176479i;
                        if (rateAlertSetting != null) {
                            i = rateAlertSetting.sentMessages;
                        } else {
                            i = 5;
                        }
                        if (iIntValue > i) {
                            iIntValue2 = C8509a.m46746j().f30156k.get().intValue();
                            rateAlertSetting2 = this.f176479i;
                            if (iIntValue2 > (rateAlertSetting2 != null ? rateAlertSetting2.receivedMessages : 5)) {
                                return true;
                            }
                        }
                    } else if (m193459x()) {
                        iIntValue = C8509a.m46746j().f30157l.get().intValue();
                        rateAlertSetting = this.f176479i;
                        if (rateAlertSetting != null) {
                            i = rateAlertSetting.sentMessages;
                        } else {
                            i = 5;
                        }
                        if (iIntValue > i) {
                            iIntValue2 = C8509a.m46746j().f30156k.get().intValue();
                            rateAlertSetting2 = this.f176479i;
                            if (iIntValue2 > (rateAlertSetting2 != null ? rateAlertSetting2.receivedMessages : 5)) {
                                return true;
                            }
                        }
                    }
                } else if (m193459x()) {
                    iIntValue = C8509a.m46746j().f30157l.get().intValue();
                    rateAlertSetting = this.f176479i;
                    if (rateAlertSetting != null) {
                        i = rateAlertSetting.sentMessages;
                    } else {
                        i = 5;
                    }
                    if (iIntValue > i) {
                        iIntValue2 = C8509a.m46746j().f30156k.get().intValue();
                        rateAlertSetting2 = this.f176479i;
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
    public final boolean m193456u() {
        int iIntValue;
        RateAlertSetting rateAlertSetting;
        int i;
        int iIntValue2;
        RateAlertSetting rateAlertSetting2;
        if (CoreModule.m30929H().signedIn_()) {
            RateAlertSetting rateAlertSetting3 = this.f176480j;
            if (m193453r(rateAlertSetting3 != null ? rateAlertSetting3.appOpenTimes : 16)) {
                RateAlertSetting rateAlertSetting4 = this.f176480j;
                if (m193446G(rateAlertSetting4 != null ? rateAlertSetting4.registerDays.get(0).get(0).intValue() : 2)) {
                    RateAlertSetting rateAlertSetting5 = this.f176480j;
                    if (!m193446G(rateAlertSetting5 != null ? rateAlertSetting5.registerDays.get(0).get(1).intValue() : 7)) {
                        iIntValue = C8509a.m46746j().f30157l.get().intValue();
                        rateAlertSetting = this.f176480j;
                        if (rateAlertSetting != null) {
                            i = rateAlertSetting.sentMessages;
                        } else {
                            i = 5;
                        }
                        if (iIntValue > i) {
                            iIntValue2 = C8509a.m46746j().f30156k.get().intValue();
                            rateAlertSetting2 = this.f176480j;
                            if (iIntValue2 > (rateAlertSetting2 != null ? rateAlertSetting2.receivedMessages : 5)) {
                                return true;
                            }
                        }
                    } else if (m193459x()) {
                        iIntValue = C8509a.m46746j().f30157l.get().intValue();
                        rateAlertSetting = this.f176480j;
                        if (rateAlertSetting != null) {
                            i = rateAlertSetting.sentMessages;
                        } else {
                            i = 5;
                        }
                        if (iIntValue > i) {
                            iIntValue2 = C8509a.m46746j().f30156k.get().intValue();
                            rateAlertSetting2 = this.f176480j;
                            if (iIntValue2 > (rateAlertSetting2 != null ? rateAlertSetting2.receivedMessages : 5)) {
                                return true;
                            }
                        }
                    }
                } else if (m193459x()) {
                    iIntValue = C8509a.m46746j().f30157l.get().intValue();
                    rateAlertSetting = this.f176480j;
                    if (rateAlertSetting != null) {
                        i = rateAlertSetting.sentMessages;
                    } else {
                        i = 5;
                    }
                    if (iIntValue > i) {
                        iIntValue2 = C8509a.m46746j().f30156k.get().intValue();
                        rateAlertSetting2 = this.f176480j;
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
    public final boolean m193457v() {
        int iIntValue;
        RateAlertSetting rateAlertSetting;
        int i;
        int iIntValue2;
        RateAlertSetting rateAlertSetting2;
        if (CoreModule.m30929H().signedIn_()) {
            RateAlertSetting rateAlertSetting3 = this.f176481k;
            if (m193454s(rateAlertSetting3 != null ? rateAlertSetting3.useMinutes : 22)) {
                RateAlertSetting rateAlertSetting4 = this.f176481k;
                if (m193446G(rateAlertSetting4 != null ? rateAlertSetting4.registerDays.get(0).get(0).intValue() : 2)) {
                    RateAlertSetting rateAlertSetting5 = this.f176481k;
                    if (!m193446G(rateAlertSetting5 != null ? rateAlertSetting5.registerDays.get(0).get(1).intValue() : 7)) {
                        iIntValue = C8509a.m46746j().f30157l.get().intValue();
                        rateAlertSetting = this.f176481k;
                        if (rateAlertSetting != null) {
                            i = rateAlertSetting.sentMessages;
                        } else {
                            i = 5;
                        }
                        if (iIntValue > i) {
                            iIntValue2 = C8509a.m46746j().f30156k.get().intValue();
                            rateAlertSetting2 = this.f176481k;
                            if (iIntValue2 > (rateAlertSetting2 != null ? rateAlertSetting2.receivedMessages : 5)) {
                                return true;
                            }
                        }
                    } else if (m193459x()) {
                        iIntValue = C8509a.m46746j().f30157l.get().intValue();
                        rateAlertSetting = this.f176481k;
                        if (rateAlertSetting != null) {
                            i = rateAlertSetting.sentMessages;
                        } else {
                            i = 5;
                        }
                        if (iIntValue > i) {
                            iIntValue2 = C8509a.m46746j().f30156k.get().intValue();
                            rateAlertSetting2 = this.f176481k;
                            if (iIntValue2 > (rateAlertSetting2 != null ? rateAlertSetting2.receivedMessages : 5)) {
                                return true;
                            }
                        }
                    }
                } else if (m193459x()) {
                    iIntValue = C8509a.m46746j().f30157l.get().intValue();
                    rateAlertSetting = this.f176481k;
                    if (rateAlertSetting != null) {
                        i = rateAlertSetting.sentMessages;
                    } else {
                        i = 5;
                    }
                    if (iIntValue > i) {
                        iIntValue2 = C8509a.m46746j().f30156k.get().intValue();
                        rateAlertSetting2 = this.f176481k;
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
    public final boolean m193458w() {
        int iIntValue;
        RateAlertSetting rateAlertSetting;
        int i;
        int iIntValue2;
        RateAlertSetting rateAlertSetting2;
        int i2;
        if (CoreModule.m30929H().signedIn_()) {
            RateAlertSetting rateAlertSetting3 = this.f176482l;
            if (m193446G(rateAlertSetting3 != null ? rateAlertSetting3.registerDays.get(0).get(0).intValue() : 2)) {
                RateAlertSetting rateAlertSetting4 = this.f176482l;
                if (!m193446G(rateAlertSetting4 != null ? rateAlertSetting4.registerDays.get(0).get(1).intValue() : 7)) {
                    iIntValue = C8509a.m46746j().f30157l.get().intValue();
                    rateAlertSetting = this.f176482l;
                    if (rateAlertSetting != null) {
                        i = rateAlertSetting.sentMessages;
                    } else {
                        i = 5;
                    }
                    if (iIntValue > i) {
                        iIntValue2 = C8509a.m46746j().f30156k.get().intValue();
                        rateAlertSetting2 = this.f176482l;
                        if (rateAlertSetting2 != null) {
                            i2 = rateAlertSetting2.receivedMessages;
                        } else {
                            i2 = 22;
                        }
                        if (iIntValue2 > i2) {
                            return true;
                        }
                    }
                } else if (m193459x()) {
                    iIntValue = C8509a.m46746j().f30157l.get().intValue();
                    rateAlertSetting = this.f176482l;
                    if (rateAlertSetting != null) {
                        i = rateAlertSetting.sentMessages;
                    } else {
                        i = 5;
                    }
                    if (iIntValue > i) {
                        iIntValue2 = C8509a.m46746j().f30156k.get().intValue();
                        rateAlertSetting2 = this.f176482l;
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
            } else if (m193459x()) {
                iIntValue = C8509a.m46746j().f30157l.get().intValue();
                rateAlertSetting = this.f176482l;
                if (rateAlertSetting != null) {
                    i = rateAlertSetting.sentMessages;
                } else {
                    i = 5;
                }
                if (iIntValue > i) {
                    iIntValue2 = C8509a.m46746j().f30156k.get().intValue();
                    rateAlertSetting2 = this.f176482l;
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
    public final boolean m193459x() {
        return tzi0.m193670h(pzi0.m174454o(), (long) CoreModule.f18264c.f20381e0.m116600p9().createdTime, 365);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m193460y(RateAlertSetting rateAlertSetting) {
        List<List<Integer>> list;
        return (rateAlertSetting == null || (list = rateAlertSetting.registerDays) == null || list.size() <= 0 || rateAlertSetting.registerDays.get(0) == null || rateAlertSetting.registerDays.get(0).size() != 2) ? false : true;
    }

    /* JADX INFO: renamed from: z */
    public boolean m193461z() {
        return false;
    }
}
