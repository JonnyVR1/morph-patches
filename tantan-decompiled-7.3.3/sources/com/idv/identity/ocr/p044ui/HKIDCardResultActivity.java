package com.idv.identity.ocr.p044ui;

import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.AuthenticationTokenClaims;
import com.idv.identity.base.R$string;
import java.util.HashMap;
import p153l.afm;
import p153l.dec0;
import p153l.fb50;
import p153l.qfm;
import p153l.rcc0;
import p153l.y9c0;
import p153l.yac0;

/* JADX INFO: loaded from: classes7.dex */
public class HKIDCardResultActivity extends BaseIDCardResultActivity {

    /* JADX INFO: renamed from: A */
    private EditText f13233A;

    /* JADX INFO: renamed from: B */
    private EditText f13234B;

    /* JADX INFO: renamed from: C */
    private EditText f13235C;

    /* JADX INFO: renamed from: D */
    private EditText f13236D;

    /* JADX INFO: renamed from: E */
    private EditText f13237E;

    /* JADX INFO: renamed from: F */
    private EditText f13238F;

    /* JADX INFO: renamed from: G */
    private EditText f13239G;

    /* JADX INFO: renamed from: H */
    private EditText f13240H;

    /* JADX INFO: renamed from: I */
    private EditText f13241I;

    /* JADX INFO: renamed from: J */
    private Button f13242J;

    /* JADX INFO: renamed from: K */
    private TextView f13243K;

    /* JADX INFO: renamed from: L */
    qfm f13244L;

    /* JADX INFO: renamed from: z */
    private EditText f13245z;

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.HKIDCardResultActivity$a */
    public class ViewOnTouchListenerC3797a implements View.OnTouchListener {
        public ViewOnTouchListenerC3797a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.HKIDCardResultActivity$b */
    public class ViewOnTouchListenerC3798b implements View.OnTouchListener {
        public ViewOnTouchListenerC3798b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.HKIDCardResultActivity$c */
    public class ViewOnClickListenerC3799c implements View.OnClickListener {
        public ViewOnClickListenerC3799c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HKIDCardResultActivity hKIDCardResultActivity = HKIDCardResultActivity.this;
            if (hKIDCardResultActivity.f13244L == null) {
                hKIDCardResultActivity.f13244L = new qfm(HKIDCardResultActivity.this);
            }
            HKIDCardResultActivity.this.f13244L.show();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.HKIDCardResultActivity$d */
    public class ViewOnClickListenerC3800d implements View.OnClickListener {
        public ViewOnClickListenerC3800d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String strTrim = HKIDCardResultActivity.this.f13245z.getText().toString().trim();
            String strTrim2 = HKIDCardResultActivity.this.f13233A.getText().toString().trim();
            String strTrim3 = HKIDCardResultActivity.this.f13237E.getText().toString().trim();
            String strTrim4 = HKIDCardResultActivity.this.f13234B.getText().toString().trim();
            String strTrim5 = HKIDCardResultActivity.this.f13235C.getText().toString().trim();
            String strTrim6 = HKIDCardResultActivity.this.f13236D.getText().toString().trim();
            String strTrim7 = HKIDCardResultActivity.this.f13238F.getText().toString().trim();
            String strTrim8 = HKIDCardResultActivity.this.f13239G.getText().toString().trim();
            String strTrim9 = HKIDCardResultActivity.this.f13240H.getText().toString().trim();
            String strTrim10 = HKIDCardResultActivity.this.f13241I.getText().toString().trim();
            if (HKIDCardResultActivity.this.m19033h2()) {
                if (TextUtils.isEmpty(strTrim) || TextUtils.isEmpty(strTrim2) || TextUtils.isEmpty(strTrim6)) {
                    HKIDCardResultActivity hKIDCardResultActivity = HKIDCardResultActivity.this;
                    hKIDCardResultActivity.mo18862z1(hKIDCardResultActivity.getResources().getString(R$string.f12716H0), "");
                    return;
                }
            } else if (TextUtils.isEmpty(strTrim2) || TextUtils.isEmpty(strTrim6)) {
                HKIDCardResultActivity hKIDCardResultActivity2 = HKIDCardResultActivity.this;
                hKIDCardResultActivity2.mo18862z1(hKIDCardResultActivity2.getResources().getString(R$string.f12716H0), "");
                return;
            }
            if (HKIDCardResultActivity.this.m19033h2() && !fb50.m124883a("^[\\u4e00-\\u9fa5·]{2,20}$", strTrim)) {
                HKIDCardResultActivity.this.mo18862z1(HKIDCardResultActivity.this.getResources().getString(R$string.f12788w0) + HKIDCardResultActivity.this.getResources().getString(R$string.f12710E0), "");
                return;
            }
            if (!fb50.m124883a("^[A-Za-z,'-·\\s]{2,50}$", strTrim2)) {
                HKIDCardResultActivity.this.mo18862z1(HKIDCardResultActivity.this.getResources().getString(R$string.f12770n0) + HKIDCardResultActivity.this.getResources().getString(R$string.f12710E0), "");
                return;
            }
            boolean zM124883a = fb50.m124883a("^[A-Z]{1,2}[0-9]{6}\\([0-9A-Z]\\)$", strTrim6);
            HKIDCardResultActivity hKIDCardResultActivity3 = HKIDCardResultActivity.this;
            if (!zM124883a) {
                hKIDCardResultActivity3.mo18862z1(HKIDCardResultActivity.this.getResources().getString(R$string.f12780s0) + HKIDCardResultActivity.this.getResources().getString(R$string.f12710E0), "");
                return;
            }
            hKIDCardResultActivity3.f13242J.setEnabled(false);
            HashMap map = new HashMap();
            map.put(AuthenticationTokenClaims.JSON_KEY_NAME, strTrim);
            map.put("englishName", strTrim2);
            map.put("idNumber", strTrim6);
            map.put("nameCode", strTrim3);
            map.put("sex", strTrim4);
            map.put("birthDate", strTrim5);
            map.put("currentIssueDate", strTrim7);
            map.put("firstIssueDate", strTrim8);
            map.put("isPermanent", strTrim9);
            map.put("symbols", strTrim10);
            HKIDCardResultActivity.this.m18856r1(map);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.HKIDCardResultActivity$e */
    public class C3801e implements TextWatcher {
        public C3801e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            HKIDCardResultActivity.this.m19032g2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.HKIDCardResultActivity$f */
    public class C3802f implements TextWatcher {
        public C3802f() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            HKIDCardResultActivity.this.m19032g2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.HKIDCardResultActivity$g */
    public class C3803g implements TextWatcher {
        public C3803g() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            HKIDCardResultActivity.this.m19032g2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.HKIDCardResultActivity$h */
    public class C3804h implements TextWatcher {
        public C3804h() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            HKIDCardResultActivity.this.m19032g2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: e2 */
    private void m19031e2() {
        this.f13245z.addTextChangedListener(new C3801e());
        this.f13233A.addTextChangedListener(new C3802f());
        this.f13236D.addTextChangedListener(new C3803g());
        this.f13237E.addTextChangedListener(new C3804h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public void m19032g2() {
        boolean z;
        String string = this.f13245z.getText().toString();
        String string2 = this.f13233A.getText().toString();
        String string3 = this.f13236D.getText().toString();
        if (!m19033h2() || fb50.m124883a("^[\\u4e00-\\u9fa5·]{2,20}$", string)) {
            this.f13245z.setBackgroundDrawable(getResources().getDrawable(yac0.f198173j));
            z = true;
        } else {
            m18846X0(R$string.f12788w0);
            this.f13245z.setBackgroundDrawable(getResources().getDrawable(yac0.f198174k));
            z = false;
        }
        if (fb50.m124883a("^[A-Za-z,'-·\\s]{2,50}$", string2)) {
            this.f13233A.setBackgroundDrawable(getResources().getDrawable(yac0.f198173j));
        } else {
            m18846X0(R$string.f12770n0);
            this.f13233A.setBackgroundDrawable(getResources().getDrawable(yac0.f198174k));
            z = false;
        }
        if (fb50.m124883a("^[A-Z]{1,2}[0-9]{6}\\([0-9A-Z]\\)$", string3)) {
            this.f13236D.setBackgroundDrawable(getResources().getDrawable(yac0.f198173j));
        } else {
            m18846X0(R$string.f12780s0);
            this.f13236D.setBackgroundDrawable(getResources().getDrawable(yac0.f198174k));
            z = false;
        }
        if (z) {
            m18840E1();
            this.f13242J.setEnabled(true);
            m18842I1();
            m18849h1(true);
            return;
        }
        this.f13242J.setEnabled(false);
        GradientDrawable gradientDrawable = (GradientDrawable) this.f13242J.getBackground();
        if (gradientDrawable != null) {
            gradientDrawable.setColor(getResources().getColor(y9c0.f198080e));
        }
        m18849h1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public boolean m19033h2() {
        return !TextUtils.isEmpty(this.f13237E.getText().toString());
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: H1 */
    public void mo18841H1() {
        setContentView(dec0.f88001e);
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: a1 */
    public void mo18847a1() {
        afm.m97360H().m97425V().ocrResult.ocrResult.name = this.f13245z.getText().toString().trim();
        afm.m97360H().m97425V().ocrResult.ocrResult.englishName = this.f13233A.getText().toString().trim();
        afm.m97360H().m97425V().ocrResult.ocrResult.nameCode = this.f13237E.getText().toString().trim();
        afm.m97360H().m97425V().ocrResult.ocrResult.sex = this.f13234B.getText().toString().trim();
        afm.m97360H().m97425V().ocrResult.ocrResult.birthDate = this.f13235C.getText().toString().trim();
        afm.m97360H().m97425V().ocrResult.ocrResult.idNumber = this.f13236D.getText().toString().trim();
        afm.m97360H().m97425V().ocrResult.ocrResult.currentIssueDate = this.f13238F.getText().toString().trim();
        afm.m97360H().m97425V().ocrResult.ocrResult.firstIssueDate = this.f13239G.getText().toString().trim();
        afm.m97360H().m97425V().ocrResult.ocrResult.isPermanent = this.f13240H.getText().toString().trim();
        afm.m97360H().m97425V().ocrResult.ocrResult.symbols = this.f13241I.getText().toString();
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: f1 */
    public void mo18848f1() {
        this.f13245z.setEnabled(false);
        this.f13233A.setEnabled(false);
        this.f13234B.setEnabled(false);
        this.f13235C.setEnabled(false);
        this.f13236D.setEnabled(false);
        this.f13237E.setEnabled(false);
        this.f13238F.setEnabled(false);
        this.f13239G.setEnabled(false);
        this.f13240H.setEnabled(false);
        this.f13241I.setEnabled(false);
        this.f13242J.setEnabled(false);
        ScrollView scrollView = (ScrollView) findViewById(rcc0.f162179p);
        if (scrollView != null) {
            scrollView.setOnTouchListener(new ViewOnTouchListenerC3797a());
        }
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: j1 */
    public void mo18850j1() {
        this.f13245z.setEnabled(true);
        this.f13233A.setEnabled(true);
        this.f13234B.setEnabled(true);
        this.f13235C.setEnabled(true);
        this.f13236D.setEnabled(true);
        this.f13237E.setEnabled(true);
        this.f13238F.setEnabled(true);
        this.f13239G.setEnabled(true);
        this.f13240H.setEnabled(true);
        this.f13241I.setEnabled(true);
        this.f13242J.setEnabled(true);
        ScrollView scrollView = (ScrollView) findViewById(rcc0.f162179p);
        if (scrollView != null) {
            scrollView.setOnTouchListener(new ViewOnTouchListenerC3798b());
        }
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: p1 */
    public void mo18854p1() {
        EditText editText = (EditText) findViewById(rcc0.f162094D0);
        this.f13245z = editText;
        if (editText != null) {
            this.f13245z.setText(afm.m97360H().m97425V().ocrResult.ocrResult.name);
        }
        EditText editText2 = (EditText) findViewById(rcc0.f162167j0);
        this.f13233A = editText2;
        if (editText2 != null) {
            this.f13233A.setText(afm.m97360H().m97425V().ocrResult.ocrResult.englishName);
        }
        EditText editText3 = (EditText) findViewById(rcc0.f162194w0);
        this.f13234B = editText3;
        if (editText3 != null) {
            this.f13234B.setText(afm.m97360H().m97425V().ocrResult.ocrResult.sex);
        }
        EditText editText4 = (EditText) findViewById(rcc0.f162095E);
        this.f13235C = editText4;
        if (editText4 != null) {
            this.f13235C.setText(afm.m97360H().m97425V().ocrResult.ocrResult.birthDate);
        }
        EditText editText5 = (EditText) findViewById(rcc0.f162096E0);
        this.f13236D = editText5;
        if (editText5 != null) {
            this.f13236D.setText(afm.m97360H().m97425V().ocrResult.ocrResult.idNumber);
        }
        EditText editText6 = (EditText) findViewById(rcc0.f162170k0);
        this.f13237E = editText6;
        if (editText6 != null) {
            this.f13237E.setText(afm.m97360H().m97425V().ocrResult.ocrResult.nameCode);
        }
        EditText editText7 = (EditText) findViewById(rcc0.f162105J);
        this.f13238F = editText7;
        if (editText7 != null) {
            this.f13238F.setText(afm.m97360H().m97425V().ocrResult.ocrResult.currentIssueDate);
        }
        EditText editText8 = (EditText) findViewById(rcc0.f162113N);
        this.f13239G = editText8;
        if (editText8 != null) {
            this.f13239G.setText(afm.m97360H().m97425V().ocrResult.ocrResult.firstIssueDate);
        }
        EditText editText9 = (EditText) findViewById(rcc0.f162123S);
        this.f13240H = editText9;
        if (editText9 != null) {
            this.f13240H.setText(afm.m97360H().m97425V().ocrResult.ocrResult.isPermanent);
        }
        EditText editText10 = (EditText) findViewById(rcc0.f162200z0);
        this.f13241I = editText10;
        if (editText10 != null) {
            this.f13241I.setText(afm.m97360H().m97425V().ocrResult.ocrResult.symbols);
        }
        TextView textView = (TextView) findViewById(rcc0.f162153e1);
        this.f13243K = textView;
        if (textView != null) {
            textView.setOnClickListener(new ViewOnClickListenerC3799c());
        }
        Button button = (Button) findViewById(rcc0.f162092C0);
        this.f13242J = button;
        button.setOnClickListener(new ViewOnClickListenerC3800d());
        m19031e2();
        m19032g2();
    }
}
