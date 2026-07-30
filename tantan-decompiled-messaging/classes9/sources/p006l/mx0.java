package p006l;

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
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.CoreAssetsSettings;
import com.p1.mobile.putong.core.data.RateAlertSetting;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.core.ui.gp.a;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import l.cwf0;
import l.dd80;
import l.e30;
import l.e51;
import l.hpd0;
import l.i0e;
import l.ic50;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.o6j0;
import l.o7r;
import l.qqi0;
import l.tpd0;
import l.vuw;
import l.zpd0;
import org.json.JSONException;
import org.json.JSONObject;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public final class mx0 {

    /* JADX INFO: renamed from: n */
    public static volatile mx0 f17325n;

    /* JADX INFO: renamed from: a */
    public zpd0 f17326a = new zpd0("LastAPPStartTime", 0L);

    /* JADX INFO: renamed from: b */
    public zpd0 f17327b = new zpd0("AppActiveTimeOneDay", 0L);

    /* JADX INFO: renamed from: c */
    public tpd0 f17328c = new tpd0("APPStartCountOneDay", 0);

    /* JADX INFO: renamed from: d */
    public tpd0 f17329d = new tpd0("ContinuousActiveDays", 0);

    /* JADX INFO: renamed from: e */
    public hpd0 f17330e = new hpd0("CanShowAPPGuideDlg", Boolean.TRUE);

    /* JADX INFO: renamed from: f */
    public hpd0 f17331f = new hpd0("hasRank", Boolean.FALSE);

    /* JADX INFO: renamed from: g */
    @SuppressLint({"SV_USE_DUP_ID"})
    public zpd0 f17332g = new zpd0("LastShowAPPStoreGuideDlgTime", 0L);

    /* JADX INFO: renamed from: h */
    @SuppressLint({"SV_USE_DUP_ID"})
    public tpd0 f17333h = new tpd0("AppStoreGuideDlgShowCount", 0);

    /* JADX INFO: renamed from: i */
    public RateAlertSetting f17334i;

    /* JADX INFO: renamed from: j */
    public RateAlertSetting f17335j;

    /* JADX INFO: renamed from: k */
    public RateAlertSetting f17336k;

    /* JADX INFO: renamed from: l */
    public RateAlertSetting f17337l;

    /* JADX INFO: renamed from: m */
    public RateAlertSetting f17338m;

    /* JADX INFO: renamed from: l.mx0$a */
    public class C1034a implements RatingBar.OnRatingBarChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f17339a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ dd80 f17340b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f17341c;

        public C1034a(Act act, dd80 dd80Var, String str) {
            this.f17339a = act;
            this.f17340b = dd80Var;
            this.f17341c = str;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m19571a(float f, dd80 dd80Var, Act act, String str) {
            if (f >= 3.1f) {
                dd80Var.dismiss();
                mx0.m19528I(act, true, f, str);
            } else {
                dd80Var.dismiss();
                mx0.m19532N(act, f);
                mx0.m19548o().f17330e.put(Boolean.FALSE);
            }
        }

        @Override // android.widget.RatingBar.OnRatingBarChangeListener
        public void onRatingChanged(RatingBar ratingBar, final float f, boolean z) {
            if (z) {
                mx0.m19548o().f17331f.put(Boolean.TRUE);
                o6j0.c("e_inapp_rating_star_selector", "p_appstore_rating_filter_popup", new o6j0.a[]{o6j0.a.h("inapp_rating_star_num", f + "")});
                final Act act = this.f17339a;
                final dd80 dd80Var = this.f17340b;
                final String str = this.f17341c;
                e51.H(act, new Runnable() { // from class: l.lx0
                    @Override // java.lang.Runnable
                    public final void run() {
                        mx0.C1034a.m19571a(f, dd80Var, act, str);
                    }
                }, 300L);
            }
        }
    }

    public mx0() {
        CoreAssetsSettings coreAssetsSettingsM11767g = CoreModule.f1535d.m11767g();
        if (NullChecker.a(coreAssetsSettingsM11767g) && NullChecker.a(coreAssetsSettingsM11767g.rateAlertSetting)) {
            for (RateAlertSetting rateAlertSetting : coreAssetsSettingsM11767g.rateAlertSetting) {
                if (NullChecker.a(rateAlertSetting)) {
                    if (rateAlertSetting.activeDays > 0 && m19569y(rateAlertSetting)) {
                        this.f17334i = rateAlertSetting;
                    } else if (rateAlertSetting.appOpenTimes > 0 && m19569y(rateAlertSetting)) {
                        this.f17335j = rateAlertSetting;
                    } else if (rateAlertSetting.useMinutes > 0 && m19569y(rateAlertSetting)) {
                        this.f17336k = rateAlertSetting;
                    } else if (m19569y(rateAlertSetting)) {
                        this.f17337l = rateAlertSetting;
                    } else if (rateAlertSetting.profilePictures > 0) {
                        this.f17338m = rateAlertSetting;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m19528I(final Act act, boolean z, float f, String str) {
        if (act.isFinishing() || act.isDestroyed()) {
            return;
        }
        final cwf0 cwf0VarC = i0e.c("p_promote_appstore_review_popup", "showAPPStoreRankGuideDlg");
        cwf0VarC.o(m19547n("passive", "alert", "alert_self_definition_basic", "appstore_rating", "swipe_page", "null", str, z ? "thanks" : "later"));
        View viewInflate = o7r.a(act).inflate(f6c0.f11724Cb, (ViewGroup) null);
        VText vTextFindViewById = viewInflate.findViewById(u4c0.f23016ge);
        VText vTextFindViewById2 = viewInflate.findViewById(u4c0.f22896Zc);
        vTextFindViewById.setText(z ? R$string.f1577Al : R$string.f1637Cl);
        vTextFindViewById2.setText(R$string.f3029wl);
        dd80 dd80VarR0 = new dd80.a(act).R(viewInflate).e0(true).a0(R$string.f2999vl, new Runnable() { // from class: l.cx0
            @Override // java.lang.Runnable
            public final void run() {
                mx0.m19540g(act);
            }
        }).V(R$string.f3066xs, new Object[0]).P(false).n0(new DialogInterface.OnDismissListener() { // from class: l.dx0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).r0();
        i0e.f(cwf0VarC);
        m19548o().f17333h.put(Integer.valueOf(((Integer) m19548o().f17333h.get()).intValue() + 1));
        m19548o().f17332g.put(Long.valueOf(mqi0.o()));
        RatingBar ratingBar = (RatingBar) dd80VarR0.L().findViewById(u4c0.f22617J);
        if (!z) {
            f = 5.0f;
        }
        ratingBar.setRating(f);
        ratingBar.setIsIndicator(true);
    }

    /* JADX INFO: renamed from: J */
    public static void m19529J(final Act act) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        act.duringCreated(CoreModule.f1534c.f3541B0.m3541j4()).subscribe(mkd0.G(new e30() { // from class: l.hx0
            public final void call(Object obj) {
                mx0.m19535b(atomicBoolean, act, (VerificationCenter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public static void m19530L(final Act act, final float f) {
        if (act.isFinishing() || act.isDestroyed()) {
            return;
        }
        final cwf0 cwf0VarC = i0e.c("p_feedback_input_popup", "showRankFeedbackDlg");
        cwf0VarC.o(m19546m("passive", "alert", "alert_self_definition_basic", "appstore_rating", "swipe_page", "null", null));
        final dd80 dd80VarO = new dd80.a(act).Q(f6c0.f11708Bb).P(false).n0(new DialogInterface.OnDismissListener() { // from class: l.ix0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).O();
        dd80VarO.show();
        i0e.f(cwf0VarC);
        View viewL = dd80VarO.L();
        TextView textView = (TextView) viewL.findViewById(u4c0.f22929bc);
        final EditText editText = (EditText) viewL.findViewById(u4c0.f23056j4);
        final InputMethodManager inputMethodManager = (InputMethodManager) act.getSystemService("input_method");
        inputMethodManager.toggleSoftInput(2, 0);
        editText.requestFocus();
        ImageView imageView = (ImageView) viewL.findViewById(u4c0.f23040i4);
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.jx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mx0.m19542i(editText, dd80VarO, act, f, inputMethodManager, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.kx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mx0.m19534a(dd80VarO, inputMethodManager, view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public static void m19531M(Act act) {
        if (act.isFinishing() || act.isDestroyed()) {
            return;
        }
        final cwf0 cwf0VarC = i0e.c("p_feedback_acknowledge_popup", "showRankFeedbackFinishedDlg");
        cwf0VarC.o(m19546m("passive", "alert", "alert_self_definition_basic", "appstore_rating", "swipe_page", "null", null));
        new dd80.a(act).x0(R$string.f2451dm, new Object[0]).s0(R$string.f2969ul, new Object[0]).P(false).n0(new DialogInterface.OnDismissListener() { // from class: l.bx0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).Z(R$string.f2704m).O().show();
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: N */
    public static void m19532N(final Act act, final float f) {
        if (act.isFinishing() || act.isDestroyed()) {
            return;
        }
        final cwf0 cwf0VarC = i0e.c("p_go_to_feedback_popup", "showRankFeedbackGuideDlg");
        cwf0VarC.o(m19546m("passive", "alert", "alert_self_definition_basic", "appstore_rating", "swipe_page", "null", null));
        new dd80.a(act).x0(R$string.f3089yl, new Object[0]).s0(R$string.f3059xl, new Object[0]).P(false).a0(R$string.f1757Gl, new Runnable() { // from class: l.fx0
            @Override // java.lang.Runnable
            public final void run() {
                mx0.m19538e(act, f);
            }
        }).V(R$string.f3066xs, new Object[0]).n0(new DialogInterface.OnDismissListener() { // from class: l.gx0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).r0();
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: O */
    public static void m19533O(Act act, String str) {
        if (act.isFinishing() || act.isDestroyed()) {
            return;
        }
        final cwf0 cwf0VarC = i0e.c("p_appstore_rating_filter_popup", "showRankGuideDlg");
        cwf0VarC.o(m19546m("passive", "alert", "alert_self_definition_basic", "appstore_rating", "swipe_page", "null", str));
        View viewInflate = o7r.a(act).inflate(f6c0.f11724Cb, (ViewGroup) null);
        VText vTextFindViewById = viewInflate.findViewById(u4c0.f23016ge);
        VText vTextFindViewById2 = viewInflate.findViewById(u4c0.f22896Zc);
        vTextFindViewById.setText(R$string.f3119zl);
        vTextFindViewById2.setText(R$string.f1607Bl);
        dd80 dd80VarR0 = new dd80.a(act).R(viewInflate).P(true).n0(new DialogInterface.OnDismissListener() { // from class: l.ex0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).r0();
        i0e.f(cwf0VarC);
        m19548o().f17332g.put(Long.valueOf(mqi0.o()));
        ((RatingBar) dd80VarR0.L().findViewById(u4c0.f22617J)).setOnRatingBarChangeListener(new C1034a(act, dd80VarR0, str));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m19534a(dd80 dd80Var, InputMethodManager inputMethodManager, View view) {
        dd80Var.dismiss();
        inputMethodManager.hideSoftInputFromWindow(dd80Var.L().getWindowToken(), 0);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m19535b(AtomicBoolean atomicBoolean, Act act, VerificationCenter verificationCenter) {
        if (atomicBoolean.get()) {
            return;
        }
        if (TEnum.equals((NullChecker.a(verificationCenter) && NullChecker.a(verificationCenter.picVerificationInfo)) ? verificationCenter.picVerificationInfo.status : null, "verified")) {
            atomicBoolean.set(true);
            if (CoreModule.f1534c.f3628e0.m21490p9().pictures.size() > m19548o().m19560p()) {
                if (m19548o().m19553E()) {
                    m19533O(act, "verification");
                }
                if (m19548o().m19570z()) {
                    m19528I(act, false, 5.0f, "verification");
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m19538e(Act act, float f) {
        o6j0.c("e_go_to_feedback_button", "p_go_to_feedback_popup", new o6j0.a[0]);
        m19530L(act, f);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m19540g(Act act) {
        o6j0.c("e_promote_appstore_popup_five_star_button", "p_promote_appstore_review_popup", new o6j0.a[0]);
        m19548o().f17330e.put(Boolean.FALSE);
        try {
            vuw.d(act);
            e = null;
        } catch (Exception e) {
            e = e;
            CrashHelper.c(e);
        }
        if (NullChecker.a(e)) {
            lsi0.h(R$string.f1847Jl);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m19542i(EditText editText, dd80 dd80Var, Act act, float f, InputMethodManager inputMethodManager, View view) {
        if (TextUtils.isEmpty(editText.getText())) {
            return;
        }
        o6j0.c("e_feedback_input_popup_submit_button", "p_feedback_input_popup", new o6j0.a[0]);
        String string = editText.getText().toString();
        dd80Var.dismiss();
        m19531M(act);
        CoreModule.f1534c.f3607X.m14304i3(string, f);
        inputMethodManager.hideSoftInputFromWindow(dd80Var.L().getWindowToken(), 0);
    }

    /* JADX INFO: renamed from: m */
    public static JSONObject m19546m(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
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
            CrashHelper.c(e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: n */
    public static JSONObject m19547n(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
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
            CrashHelper.c(e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: o */
    public static mx0 m19548o() {
        if (f17325n == null) {
            synchronized (mx0.class) {
                try {
                    if (f17325n == null) {
                        f17325n = new mx0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17325n;
    }

    /* JADX INFO: renamed from: A */
    public boolean m19549A() {
        return false;
    }

    /* JADX INFO: renamed from: B */
    public boolean m19550B() {
        return false;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m19551C() {
        return false;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m19552D() {
        return false;
    }

    /* JADX INFO: renamed from: E */
    public boolean m19553E() {
        return false;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m19554F(int i) {
        return i >= 0 && ((Integer) this.f17329d.get()).intValue() >= i;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m19555G(int i) {
        return qqi0.h(mqi0.o(), (long) CoreModule.f1534c.f3628e0.m21490p9().createdTime, i - 1);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m19556H(Act act) {
        if (act.isFinishing() || act.isDestroyed()) {
            return;
        }
        if (ogl0.m20617F() && m19548o().m19549A()) {
            m19528I(act, false, 5.0f, m19561q());
            ic50.j().f().b0(OmsDialog.p_appstore_rating_filter_popup_store.getIdentifier(), 0, true);
        } else if (m19548o().m19570z()) {
            m19528I(act, false, 5.0f, m19561q());
        }
        if (ogl0.m20617F() && m19548o().m19552D()) {
            ic50.j().f().b0(OmsDialog.p_appstore_rating_filter_popup.getIdentifier(), 0, true);
            m19533O(act, m19561q());
        } else if (m19548o().m19551C()) {
            m19533O(act, m19561q());
        }
    }

    /* JADX INFO: renamed from: K */
    public void m19557K(final Act act) {
        e51.G(new Runnable() { // from class: l.ax0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8578a.m19556H(act);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public void m19558P() {
        if (((Long) m19548o().f17326a.get()).longValue() == 0) {
            m19548o().f17326a.put(Long.valueOf(mqi0.o()));
            m19548o().f17329d.put(1);
        }
        if (mqi0.D(((Long) m19548o().f17326a.get()).longValue())) {
            m19548o().f17328c.put(Integer.valueOf(((Integer) m19548o().f17328c.get()).intValue() + 1));
        } else if (qqi0.h(mqi0.o(), ((Long) m19548o().f17326a.get()).longValue(), 2)) {
            m19548o().f17329d.put(1);
            m19548o().f17328c.put(1);
            m19548o().f17327b.put(0L);
        } else {
            m19548o().f17329d.put(Integer.valueOf(((Integer) m19548o().f17329d.get()).intValue() + 1));
            m19548o().f17328c.put(1);
            m19548o().f17327b.put(0L);
        }
        m19548o().f17326a.put(Long.valueOf(mqi0.o()));
    }

    /* JADX INFO: renamed from: Q */
    public void m19559Q() {
        if (((Long) m19548o().f17326a.get()).longValue() == 0) {
            m19548o().f17326a.put(Long.valueOf(mqi0.o()));
        } else {
            m19548o().f17327b.put(Long.valueOf(((Long) m19548o().f17327b.get()).longValue() + ((mqi0.o() - (mqi0.D(((Long) m19548o().f17326a.get()).longValue()) ? ((Long) m19548o().f17326a.get()).longValue() : mqi0.n())) / 1000)));
        }
    }

    /* JADX INFO: renamed from: p */
    public int m19560p() {
        RateAlertSetting rateAlertSetting = this.f17338m;
        if (rateAlertSetting != null) {
            return rateAlertSetting.profilePictures;
        }
        return 4;
    }

    /* JADX INFO: renamed from: q */
    public final String m19561q() {
        if (m19564t()) {
            return "retention";
        }
        if (m19565u()) {
            return "app_opens";
        }
        if (m19566v()) {
            return "time_spent";
        }
        return m19567w() ? "received_message" : "";
    }

    /* JADX INFO: renamed from: r */
    public final boolean m19562r(int i) {
        return i > 0 && ((Integer) this.f17328c.get()).intValue() > i;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m19563s(int i) {
        return i > 0 && ((Long) this.f17327b.get()).longValue() > ((long) (i * 60));
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
    public final boolean m19564t() {
        int iIntValue;
        RateAlertSetting rateAlertSetting;
        int i;
        int iIntValue2;
        RateAlertSetting rateAlertSetting2;
        if (CoreModule.m1850H().signedIn_()) {
            RateAlertSetting rateAlertSetting3 = this.f17334i;
            if (m19554F(rateAlertSetting3 != null ? rateAlertSetting3.activeDays : 4)) {
                RateAlertSetting rateAlertSetting4 = this.f17334i;
                if (m19555G(rateAlertSetting4 != null ? ((Integer) ((List) rateAlertSetting4.registerDays.get(0)).get(0)).intValue() : 1)) {
                    RateAlertSetting rateAlertSetting5 = this.f17334i;
                    if (!m19555G(rateAlertSetting5 != null ? ((Integer) ((List) rateAlertSetting5.registerDays.get(0)).get(1)).intValue() : 10)) {
                        iIntValue = ((Integer) a.j().l.get()).intValue();
                        rateAlertSetting = this.f17334i;
                        if (rateAlertSetting != null) {
                            i = rateAlertSetting.sentMessages;
                        } else {
                            i = 5;
                        }
                        if (iIntValue > i) {
                            iIntValue2 = ((Integer) a.j().k.get()).intValue();
                            rateAlertSetting2 = this.f17334i;
                            if (iIntValue2 > (rateAlertSetting2 != null ? rateAlertSetting2.receivedMessages : 5)) {
                                return true;
                            }
                        }
                    } else if (m19568x()) {
                        iIntValue = ((Integer) a.j().l.get()).intValue();
                        rateAlertSetting = this.f17334i;
                        if (rateAlertSetting != null) {
                            i = rateAlertSetting.sentMessages;
                        } else {
                            i = 5;
                        }
                        if (iIntValue > i) {
                            iIntValue2 = ((Integer) a.j().k.get()).intValue();
                            rateAlertSetting2 = this.f17334i;
                            if (iIntValue2 > (rateAlertSetting2 != null ? rateAlertSetting2.receivedMessages : 5)) {
                                return true;
                            }
                        }
                    }
                } else if (m19568x()) {
                    iIntValue = ((Integer) a.j().l.get()).intValue();
                    rateAlertSetting = this.f17334i;
                    if (rateAlertSetting != null) {
                        i = rateAlertSetting.sentMessages;
                    } else {
                        i = 5;
                    }
                    if (iIntValue > i) {
                        iIntValue2 = ((Integer) a.j().k.get()).intValue();
                        rateAlertSetting2 = this.f17334i;
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
    public final boolean m19565u() {
        int iIntValue;
        RateAlertSetting rateAlertSetting;
        int i;
        int iIntValue2;
        RateAlertSetting rateAlertSetting2;
        if (CoreModule.m1850H().signedIn_()) {
            RateAlertSetting rateAlertSetting3 = this.f17335j;
            if (m19562r(rateAlertSetting3 != null ? rateAlertSetting3.appOpenTimes : 16)) {
                RateAlertSetting rateAlertSetting4 = this.f17335j;
                if (m19555G(rateAlertSetting4 != null ? ((Integer) ((List) rateAlertSetting4.registerDays.get(0)).get(0)).intValue() : 2)) {
                    RateAlertSetting rateAlertSetting5 = this.f17335j;
                    if (!m19555G(rateAlertSetting5 != null ? ((Integer) ((List) rateAlertSetting5.registerDays.get(0)).get(1)).intValue() : 7)) {
                        iIntValue = ((Integer) a.j().l.get()).intValue();
                        rateAlertSetting = this.f17335j;
                        if (rateAlertSetting != null) {
                            i = rateAlertSetting.sentMessages;
                        } else {
                            i = 5;
                        }
                        if (iIntValue > i) {
                            iIntValue2 = ((Integer) a.j().k.get()).intValue();
                            rateAlertSetting2 = this.f17335j;
                            if (iIntValue2 > (rateAlertSetting2 != null ? rateAlertSetting2.receivedMessages : 5)) {
                                return true;
                            }
                        }
                    } else if (m19568x()) {
                        iIntValue = ((Integer) a.j().l.get()).intValue();
                        rateAlertSetting = this.f17335j;
                        if (rateAlertSetting != null) {
                            i = rateAlertSetting.sentMessages;
                        } else {
                            i = 5;
                        }
                        if (iIntValue > i) {
                            iIntValue2 = ((Integer) a.j().k.get()).intValue();
                            rateAlertSetting2 = this.f17335j;
                            if (iIntValue2 > (rateAlertSetting2 != null ? rateAlertSetting2.receivedMessages : 5)) {
                                return true;
                            }
                        }
                    }
                } else if (m19568x()) {
                    iIntValue = ((Integer) a.j().l.get()).intValue();
                    rateAlertSetting = this.f17335j;
                    if (rateAlertSetting != null) {
                        i = rateAlertSetting.sentMessages;
                    } else {
                        i = 5;
                    }
                    if (iIntValue > i) {
                        iIntValue2 = ((Integer) a.j().k.get()).intValue();
                        rateAlertSetting2 = this.f17335j;
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
    public final boolean m19566v() {
        int iIntValue;
        RateAlertSetting rateAlertSetting;
        int i;
        int iIntValue2;
        RateAlertSetting rateAlertSetting2;
        if (CoreModule.m1850H().signedIn_()) {
            RateAlertSetting rateAlertSetting3 = this.f17336k;
            if (m19563s(rateAlertSetting3 != null ? rateAlertSetting3.useMinutes : 22)) {
                RateAlertSetting rateAlertSetting4 = this.f17336k;
                if (m19555G(rateAlertSetting4 != null ? ((Integer) ((List) rateAlertSetting4.registerDays.get(0)).get(0)).intValue() : 2)) {
                    RateAlertSetting rateAlertSetting5 = this.f17336k;
                    if (!m19555G(rateAlertSetting5 != null ? ((Integer) ((List) rateAlertSetting5.registerDays.get(0)).get(1)).intValue() : 7)) {
                        iIntValue = ((Integer) a.j().l.get()).intValue();
                        rateAlertSetting = this.f17336k;
                        if (rateAlertSetting != null) {
                            i = rateAlertSetting.sentMessages;
                        } else {
                            i = 5;
                        }
                        if (iIntValue > i) {
                            iIntValue2 = ((Integer) a.j().k.get()).intValue();
                            rateAlertSetting2 = this.f17336k;
                            if (iIntValue2 > (rateAlertSetting2 != null ? rateAlertSetting2.receivedMessages : 5)) {
                                return true;
                            }
                        }
                    } else if (m19568x()) {
                        iIntValue = ((Integer) a.j().l.get()).intValue();
                        rateAlertSetting = this.f17336k;
                        if (rateAlertSetting != null) {
                            i = rateAlertSetting.sentMessages;
                        } else {
                            i = 5;
                        }
                        if (iIntValue > i) {
                            iIntValue2 = ((Integer) a.j().k.get()).intValue();
                            rateAlertSetting2 = this.f17336k;
                            if (iIntValue2 > (rateAlertSetting2 != null ? rateAlertSetting2.receivedMessages : 5)) {
                                return true;
                            }
                        }
                    }
                } else if (m19568x()) {
                    iIntValue = ((Integer) a.j().l.get()).intValue();
                    rateAlertSetting = this.f17336k;
                    if (rateAlertSetting != null) {
                        i = rateAlertSetting.sentMessages;
                    } else {
                        i = 5;
                    }
                    if (iIntValue > i) {
                        iIntValue2 = ((Integer) a.j().k.get()).intValue();
                        rateAlertSetting2 = this.f17336k;
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
    public final boolean m19567w() {
        int iIntValue;
        RateAlertSetting rateAlertSetting;
        int i;
        int iIntValue2;
        RateAlertSetting rateAlertSetting2;
        int i2;
        if (CoreModule.m1850H().signedIn_()) {
            RateAlertSetting rateAlertSetting3 = this.f17337l;
            if (m19555G(rateAlertSetting3 != null ? ((Integer) ((List) rateAlertSetting3.registerDays.get(0)).get(0)).intValue() : 2)) {
                RateAlertSetting rateAlertSetting4 = this.f17337l;
                if (!m19555G(rateAlertSetting4 != null ? ((Integer) ((List) rateAlertSetting4.registerDays.get(0)).get(1)).intValue() : 7)) {
                    iIntValue = ((Integer) a.j().l.get()).intValue();
                    rateAlertSetting = this.f17337l;
                    if (rateAlertSetting != null) {
                        i = rateAlertSetting.sentMessages;
                    } else {
                        i = 5;
                    }
                    if (iIntValue > i) {
                        iIntValue2 = ((Integer) a.j().k.get()).intValue();
                        rateAlertSetting2 = this.f17337l;
                        if (rateAlertSetting2 != null) {
                            i2 = rateAlertSetting2.receivedMessages;
                        } else {
                            i2 = 22;
                        }
                        if (iIntValue2 > i2) {
                            return true;
                        }
                    }
                } else if (m19568x()) {
                    iIntValue = ((Integer) a.j().l.get()).intValue();
                    rateAlertSetting = this.f17337l;
                    if (rateAlertSetting != null) {
                        i = rateAlertSetting.sentMessages;
                    } else {
                        i = 5;
                    }
                    if (iIntValue > i) {
                        iIntValue2 = ((Integer) a.j().k.get()).intValue();
                        rateAlertSetting2 = this.f17337l;
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
            } else if (m19568x()) {
                iIntValue = ((Integer) a.j().l.get()).intValue();
                rateAlertSetting = this.f17337l;
                if (rateAlertSetting != null) {
                    i = rateAlertSetting.sentMessages;
                } else {
                    i = 5;
                }
                if (iIntValue > i) {
                    iIntValue2 = ((Integer) a.j().k.get()).intValue();
                    rateAlertSetting2 = this.f17337l;
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
    public final boolean m19568x() {
        return qqi0.h(mqi0.o(), (long) CoreModule.f1534c.f3628e0.m21490p9().createdTime, 365);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m19569y(RateAlertSetting rateAlertSetting) {
        List list;
        return (rateAlertSetting == null || (list = rateAlertSetting.registerDays) == null || list.size() <= 0 || rateAlertSetting.registerDays.get(0) == null || ((List) rateAlertSetting.registerDays.get(0)).size() != 2) ? false : true;
    }

    /* JADX INFO: renamed from: z */
    public boolean m19570z() {
        return false;
    }
}
