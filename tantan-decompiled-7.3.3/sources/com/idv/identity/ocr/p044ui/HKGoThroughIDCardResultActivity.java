package com.idv.identity.ocr.p044ui;

import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.facebook.AuthenticationTokenClaims;
import com.idv.identity.base.R$string;
import java.util.HashMap;
import p153l.afm;
import p153l.cfm;
import p153l.dec0;
import p153l.fb50;
import p153l.rcc0;
import p153l.y9c0;
import p153l.yac0;

/* JADX INFO: loaded from: classes7.dex */
public class HKGoThroughIDCardResultActivity extends BaseIDCardResultActivity {

    /* JADX INFO: renamed from: A */
    private EditText f13217A;

    /* JADX INFO: renamed from: B */
    private EditText f13218B;

    /* JADX INFO: renamed from: C */
    private EditText f13219C;

    /* JADX INFO: renamed from: D */
    private EditText f13220D;

    /* JADX INFO: renamed from: E */
    private EditText f13221E;

    /* JADX INFO: renamed from: F */
    private EditText f13222F;

    /* JADX INFO: renamed from: G */
    private EditText f13223G;

    /* JADX INFO: renamed from: H */
    private EditText f13224H;

    /* JADX INFO: renamed from: I */
    private Button f13225I;

    /* JADX INFO: renamed from: z */
    private EditText f13226z;

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.HKGoThroughIDCardResultActivity$a */
    public class ViewOnTouchListenerC3791a implements View.OnTouchListener {
        public ViewOnTouchListenerC3791a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.HKGoThroughIDCardResultActivity$b */
    public class ViewOnTouchListenerC3792b implements View.OnTouchListener {
        public ViewOnTouchListenerC3792b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.HKGoThroughIDCardResultActivity$c */
    public class ViewOnClickListenerC3793c implements View.OnClickListener {
        public ViewOnClickListenerC3793c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String strTrim = HKGoThroughIDCardResultActivity.this.f13226z.getText().toString().trim();
            String strTrim2 = HKGoThroughIDCardResultActivity.this.f13217A.getText().toString().trim();
            String strTrim3 = HKGoThroughIDCardResultActivity.this.f13220D.getText().toString().trim();
            String strTrim4 = HKGoThroughIDCardResultActivity.this.f13218B.getText().toString().trim();
            String strTrim5 = HKGoThroughIDCardResultActivity.this.f13219C.getText().toString().trim();
            String strTrim6 = HKGoThroughIDCardResultActivity.this.f13221E.getText().toString().trim();
            String strTrim7 = HKGoThroughIDCardResultActivity.this.f13222F.getText().toString().trim();
            String strTrim8 = HKGoThroughIDCardResultActivity.this.f13223G.getText().toString().trim();
            String strTrim9 = HKGoThroughIDCardResultActivity.this.f13224H.getText().toString().trim();
            if (TextUtils.isEmpty(strTrim) || TextUtils.isEmpty(strTrim2) || TextUtils.isEmpty(strTrim3)) {
                HKGoThroughIDCardResultActivity hKGoThroughIDCardResultActivity = HKGoThroughIDCardResultActivity.this;
                hKGoThroughIDCardResultActivity.mo18862z1(hKGoThroughIDCardResultActivity.getResources().getString(R$string.f12716H0), "");
                return;
            }
            if (!fb50.m124883a("^[\\u4e00-\\u9fa5·]{2,20}$", strTrim)) {
                HKGoThroughIDCardResultActivity.this.mo18862z1(HKGoThroughIDCardResultActivity.this.getResources().getString(R$string.f12788w0) + HKGoThroughIDCardResultActivity.this.getResources().getString(R$string.f12710E0), "");
                return;
            }
            boolean zM124883a = fb50.m124883a("^[A-Za-z,'-·\\s]{2,50}$", strTrim2);
            HKGoThroughIDCardResultActivity hKGoThroughIDCardResultActivity2 = HKGoThroughIDCardResultActivity.this;
            if (!zM124883a) {
                hKGoThroughIDCardResultActivity2.mo18862z1(HKGoThroughIDCardResultActivity.this.getResources().getString(R$string.f12770n0) + HKGoThroughIDCardResultActivity.this.getResources().getString(R$string.f12710E0), "");
                return;
            }
            if (hKGoThroughIDCardResultActivity2.f13063p.equals(cfm.f81518d)) {
                if (!fb50.m124883a("^C[0-9]{8}|C[A-HJ-NP-Za-z][0-9]{7}$", strTrim3)) {
                    HKGoThroughIDCardResultActivity.this.mo18862z1(HKGoThroughIDCardResultActivity.this.getResources().getString(R$string.f12780s0) + HKGoThroughIDCardResultActivity.this.getResources().getString(R$string.f12710E0), "");
                    return;
                }
            } else if (!fb50.m124883a("^[HM][0-9]{8}$", strTrim3)) {
                HKGoThroughIDCardResultActivity.this.mo18862z1(HKGoThroughIDCardResultActivity.this.getResources().getString(R$string.f12780s0) + HKGoThroughIDCardResultActivity.this.getResources().getString(R$string.f12710E0), "");
                return;
            }
            HKGoThroughIDCardResultActivity.this.f13225I.setEnabled(false);
            HashMap map = new HashMap();
            map.put(AuthenticationTokenClaims.JSON_KEY_NAME, strTrim);
            map.put("englishName", strTrim2);
            map.put("idNumber", strTrim3);
            map.put("sex", strTrim4);
            map.put("birthDate", strTrim5);
            map.put("issueDate", strTrim6);
            map.put("expiryDate", strTrim7);
            map.put("originOfIssue", strTrim9);
            if (HKGoThroughIDCardResultActivity.this.f13063p.equals(cfm.f81518d)) {
                map.put("placeOfIssue", strTrim8);
            }
            HKGoThroughIDCardResultActivity.this.m18856r1(map);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.HKGoThroughIDCardResultActivity$d */
    public class C3794d implements TextWatcher {
        public C3794d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            HKGoThroughIDCardResultActivity.this.m19017e2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.HKGoThroughIDCardResultActivity$e */
    public class C3795e implements TextWatcher {
        public C3795e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            HKGoThroughIDCardResultActivity.this.m19017e2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.HKGoThroughIDCardResultActivity$f */
    public class C3796f implements TextWatcher {
        public C3796f() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            HKGoThroughIDCardResultActivity.this.m19017e2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: c2 */
    private boolean m19015c2() {
        boolean zEquals = this.f13063p.equals(cfm.f81518d);
        EditText editText = this.f13220D;
        return zEquals ? fb50.m124883a("^C[0-9]{8}|C[A-HJ-NP-Za-z][0-9]{7}$", editText.getText().toString()) : fb50.m124883a("^[HM][0-9]{8}$", editText.getText().toString());
    }

    /* JADX INFO: renamed from: d2 */
    private void m19016d2() {
        this.f13226z.addTextChangedListener(new C3794d());
        this.f13217A.addTextChangedListener(new C3795e());
        this.f13220D.addTextChangedListener(new C3796f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public void m19017e2() {
        boolean z;
        String string = this.f13226z.getText().toString();
        String string2 = this.f13217A.getText().toString();
        if (fb50.m124883a("^[\\u4e00-\\u9fa5·]{2,20}$", string)) {
            this.f13226z.setBackgroundDrawable(getResources().getDrawable(yac0.f198173j));
            z = true;
        } else {
            m18846X0(R$string.f12788w0);
            this.f13226z.setBackgroundDrawable(getResources().getDrawable(yac0.f198174k));
            z = false;
        }
        if (fb50.m124883a("^[A-Za-z,'-·\\s]{2,50}$", string2)) {
            this.f13217A.setBackgroundDrawable(getResources().getDrawable(yac0.f198173j));
        } else {
            m18846X0(R$string.f12770n0);
            this.f13217A.setBackgroundDrawable(getResources().getDrawable(yac0.f198174k));
            z = false;
        }
        if (m19015c2()) {
            this.f13220D.setBackgroundDrawable(getResources().getDrawable(yac0.f198173j));
        } else {
            m18846X0(R$string.f12780s0);
            this.f13220D.setBackgroundDrawable(getResources().getDrawable(yac0.f198174k));
            z = false;
        }
        if (z) {
            m18840E1();
            this.f13225I.setEnabled(true);
            m18842I1();
            m18849h1(true);
            return;
        }
        this.f13225I.setEnabled(false);
        GradientDrawable gradientDrawable = (GradientDrawable) this.f13225I.getBackground();
        if (gradientDrawable != null) {
            gradientDrawable.setColor(getResources().getColor(y9c0.f198080e));
        }
        m18849h1(false);
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: H1 */
    public void mo18841H1() {
        setContentView(dec0.f87999c);
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: a1 */
    public void mo18847a1() {
        afm.m97360H().m97425V().ocrResult.ocrResult.name = this.f13226z.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.englishName = this.f13217A.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.idNumber = this.f13220D.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.sex = this.f13218B.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.birthDate = this.f13219C.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.issueDate = this.f13221E.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.expiryDate = this.f13222F.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.placeOfIssue = this.f13223G.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.originOfIssue = this.f13224H.getText().toString();
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: f1 */
    public void mo18848f1() {
        this.f13226z.setEnabled(false);
        this.f13217A.setEnabled(false);
        this.f13218B.setEnabled(false);
        this.f13219C.setEnabled(false);
        this.f13220D.setEnabled(false);
        this.f13221E.setEnabled(false);
        this.f13222F.setEnabled(false);
        this.f13223G.setEnabled(false);
        this.f13224H.setEnabled(false);
        this.f13225I.setEnabled(false);
        ScrollView scrollView = (ScrollView) findViewById(rcc0.f162179p);
        if (scrollView != null) {
            scrollView.setOnTouchListener(new ViewOnTouchListenerC3791a());
        }
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: j1 */
    public void mo18850j1() {
        this.f13226z.setEnabled(true);
        this.f13217A.setEnabled(true);
        this.f13218B.setEnabled(true);
        this.f13219C.setEnabled(true);
        this.f13220D.setEnabled(true);
        this.f13221E.setEnabled(true);
        this.f13222F.setEnabled(true);
        this.f13223G.setEnabled(true);
        this.f13224H.setEnabled(true);
        this.f13225I.setEnabled(true);
        ScrollView scrollView = (ScrollView) findViewById(rcc0.f162179p);
        if (scrollView != null) {
            scrollView.setOnTouchListener(new ViewOnTouchListenerC3792b());
        }
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: p1 */
    public void mo18854p1() {
        EditText editText = (EditText) findViewById(rcc0.f162094D0);
        this.f13226z = editText;
        if (editText != null) {
            this.f13226z.setText(afm.m97360H().m97425V().ocrResult.ocrResult.name);
        }
        EditText editText2 = (EditText) findViewById(rcc0.f162167j0);
        this.f13217A = editText2;
        if (editText2 != null) {
            this.f13217A.setText(afm.m97360H().m97425V().ocrResult.ocrResult.englishName);
        }
        EditText editText3 = (EditText) findViewById(rcc0.f162194w0);
        this.f13218B = editText3;
        if (editText3 != null) {
            this.f13218B.setText(afm.m97360H().m97425V().ocrResult.ocrResult.sex);
        }
        EditText editText4 = (EditText) findViewById(rcc0.f162095E);
        this.f13219C = editText4;
        if (editText4 != null) {
            this.f13219C.setText(afm.m97360H().m97425V().ocrResult.ocrResult.birthDate);
        }
        EditText editText5 = (EditText) findViewById(rcc0.f162096E0);
        this.f13220D = editText5;
        if (editText5 != null) {
            this.f13220D.setText(afm.m97360H().m97425V().ocrResult.ocrResult.idNumber);
        }
        this.f13221E = (EditText) findViewById(rcc0.f162127U);
        this.f13222F = (EditText) findViewById(rcc0.f162109L);
        this.f13223G = (EditText) findViewById(rcc0.f162186s0);
        this.f13224H = (EditText) findViewById(rcc0.f162178o0);
        if (this.f13221E != null) {
            this.f13221E.setText(afm.m97360H().m97425V().ocrResult.ocrResult.issueDate);
        }
        if (this.f13222F != null) {
            this.f13222F.setText(afm.m97360H().m97425V().ocrResult.ocrResult.expiryDate);
        }
        if (!this.f13063p.equals(cfm.f81518d)) {
            ((LinearLayout) findViewById(rcc0.f162188t0)).setVisibility(8);
            this.f13217A.setHint(getResources().getString(R$string.f12776q0));
            this.f13220D.setHint(getResources().getString(R$string.f12778r0));
        } else if (this.f13223G != null) {
            this.f13223G.setText(afm.m97360H().m97425V().ocrResult.ocrResult.placeOfIssue);
        }
        if (this.f13224H != null) {
            this.f13224H.setText(afm.m97360H().m97425V().ocrResult.ocrResult.originOfIssue);
        }
        Button button = (Button) findViewById(rcc0.f162092C0);
        this.f13225I = button;
        button.setOnClickListener(new ViewOnClickListenerC3793c());
        m19016d2();
        m19017e2();
    }
}
