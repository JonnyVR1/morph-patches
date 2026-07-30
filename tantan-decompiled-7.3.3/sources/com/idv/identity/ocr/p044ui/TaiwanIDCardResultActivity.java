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
import com.facebook.AuthenticationTokenClaims;
import com.idv.identity.base.R$string;
import java.util.HashMap;
import p153l.afm;
import p153l.dec0;
import p153l.fb50;
import p153l.rcc0;
import p153l.y9c0;
import p153l.yac0;

/* JADX INFO: loaded from: classes7.dex */
public class TaiwanIDCardResultActivity extends BaseIDCardResultActivity {

    /* JADX INFO: renamed from: A */
    private EditText f13369A;

    /* JADX INFO: renamed from: B */
    private EditText f13370B;

    /* JADX INFO: renamed from: C */
    private EditText f13371C;

    /* JADX INFO: renamed from: D */
    private EditText f13372D;

    /* JADX INFO: renamed from: E */
    private EditText f13373E;

    /* JADX INFO: renamed from: F */
    private EditText f13374F;

    /* JADX INFO: renamed from: G */
    private EditText f13375G;

    /* JADX INFO: renamed from: H */
    private EditText f13376H;

    /* JADX INFO: renamed from: I */
    private Button f13377I;

    /* JADX INFO: renamed from: z */
    private EditText f13378z;

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.TaiwanIDCardResultActivity$a */
    public class ViewOnTouchListenerC3837a implements View.OnTouchListener {
        public ViewOnTouchListenerC3837a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.TaiwanIDCardResultActivity$b */
    public class ViewOnTouchListenerC3838b implements View.OnTouchListener {
        public ViewOnTouchListenerC3838b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.TaiwanIDCardResultActivity$c */
    public class ViewOnClickListenerC3839c implements View.OnClickListener {
        public ViewOnClickListenerC3839c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String strTrim = TaiwanIDCardResultActivity.this.f13378z.getText().toString().trim();
            String strTrim2 = TaiwanIDCardResultActivity.this.f13369A.getText().toString().trim();
            String strTrim3 = TaiwanIDCardResultActivity.this.f13372D.getText().toString().trim();
            String strTrim4 = TaiwanIDCardResultActivity.this.f13370B.getText().toString().trim();
            String strTrim5 = TaiwanIDCardResultActivity.this.f13371C.getText().toString().trim();
            String strTrim6 = TaiwanIDCardResultActivity.this.f13373E.getText().toString().trim();
            String strTrim7 = TaiwanIDCardResultActivity.this.f13374F.getText().toString().trim();
            String strTrim8 = TaiwanIDCardResultActivity.this.f13375G.getText().toString().trim();
            String strTrim9 = TaiwanIDCardResultActivity.this.f13376H.getText().toString().trim();
            if (TextUtils.isEmpty(strTrim) || TextUtils.isEmpty(strTrim2) || TextUtils.isEmpty(strTrim3)) {
                TaiwanIDCardResultActivity taiwanIDCardResultActivity = TaiwanIDCardResultActivity.this;
                taiwanIDCardResultActivity.mo18862z1(taiwanIDCardResultActivity.getResources().getString(R$string.f12716H0), "");
                return;
            }
            if (!fb50.m124883a("^[\\u4e00-\\u9fa5·]{2,20}$", strTrim)) {
                TaiwanIDCardResultActivity.this.mo18862z1(TaiwanIDCardResultActivity.this.getResources().getString(R$string.f12788w0) + TaiwanIDCardResultActivity.this.getResources().getString(R$string.f12710E0), "");
                return;
            }
            if (!fb50.m124883a("^[A-Za-z,'-·\\s]{2,50}$", strTrim2)) {
                TaiwanIDCardResultActivity.this.mo18862z1(TaiwanIDCardResultActivity.this.getResources().getString(R$string.f12770n0) + TaiwanIDCardResultActivity.this.getResources().getString(R$string.f12710E0), "");
                return;
            }
            boolean zM124883a = fb50.m124883a("^[0-9]{8}$", strTrim3);
            TaiwanIDCardResultActivity taiwanIDCardResultActivity2 = TaiwanIDCardResultActivity.this;
            if (!zM124883a) {
                taiwanIDCardResultActivity2.mo18862z1(TaiwanIDCardResultActivity.this.getResources().getString(R$string.f12780s0) + TaiwanIDCardResultActivity.this.getResources().getString(R$string.f12710E0), "");
                return;
            }
            taiwanIDCardResultActivity2.f13377I.setEnabled(false);
            HashMap map = new HashMap();
            map.put(AuthenticationTokenClaims.JSON_KEY_NAME, strTrim);
            map.put("englishName", strTrim2);
            map.put("idNumber", strTrim3);
            map.put("sex", strTrim4);
            map.put("birthDate", strTrim5);
            map.put("issueDate", strTrim6);
            map.put("expiryDate", strTrim7);
            map.put("originOfIssue", strTrim8);
            map.put("placeOfIssue", strTrim9);
            TaiwanIDCardResultActivity.this.m18856r1(map);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.TaiwanIDCardResultActivity$d */
    public class C3840d implements TextWatcher {
        public C3840d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TaiwanIDCardResultActivity.this.m19121d2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.TaiwanIDCardResultActivity$e */
    public class C3841e implements TextWatcher {
        public C3841e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TaiwanIDCardResultActivity.this.m19121d2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.TaiwanIDCardResultActivity$f */
    public class C3842f implements TextWatcher {
        public C3842f() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TaiwanIDCardResultActivity.this.m19121d2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: c2 */
    private void m19120c2() {
        this.f13378z.addTextChangedListener(new C3840d());
        this.f13369A.addTextChangedListener(new C3841e());
        this.f13372D.addTextChangedListener(new C3842f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public void m19121d2() {
        boolean z;
        String string = this.f13378z.getText().toString();
        String string2 = this.f13369A.getText().toString();
        String string3 = this.f13372D.getText().toString();
        if (fb50.m124883a("^[\\u4e00-\\u9fa5·]{2,20}$", string)) {
            this.f13378z.setBackgroundDrawable(getResources().getDrawable(yac0.f198173j));
            z = true;
        } else {
            m18846X0(R$string.f12788w0);
            this.f13378z.setBackgroundDrawable(getResources().getDrawable(yac0.f198174k));
            z = false;
        }
        if (fb50.m124883a("^[A-Za-z,'-·\\s]{2,50}$", string2)) {
            this.f13369A.setBackgroundDrawable(getResources().getDrawable(yac0.f198173j));
        } else {
            m18846X0(R$string.f12770n0);
            this.f13369A.setBackgroundDrawable(getResources().getDrawable(yac0.f198174k));
            z = false;
        }
        if (fb50.m124883a("^[0-9]{8}$", string3)) {
            this.f13372D.setBackgroundDrawable(getResources().getDrawable(yac0.f198173j));
        } else {
            m18846X0(R$string.f12780s0);
            this.f13372D.setBackgroundDrawable(getResources().getDrawable(yac0.f198174k));
            z = false;
        }
        if (z) {
            m18840E1();
            this.f13377I.setEnabled(true);
            m18842I1();
            m18849h1(true);
            return;
        }
        this.f13377I.setEnabled(false);
        GradientDrawable gradientDrawable = (GradientDrawable) this.f13377I.getBackground();
        if (gradientDrawable != null) {
            gradientDrawable.setColor(getResources().getColor(y9c0.f198080e));
        }
        m18849h1(false);
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: H1 */
    public void mo18841H1() {
        setContentView(dec0.f88007k);
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: a1 */
    public void mo18847a1() {
        afm.m97360H().m97425V().ocrResult.ocrResult.name = this.f13378z.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.englishName = this.f13369A.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.idNumber = this.f13372D.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.sex = this.f13370B.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.birthDate = this.f13371C.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.issueDate = this.f13373E.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.expiryDate = this.f13374F.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.originOfIssue = this.f13375G.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.placeOfIssue = this.f13376H.getText().toString();
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: f1 */
    public void mo18848f1() {
        this.f13378z.setEnabled(false);
        this.f13369A.setEnabled(false);
        this.f13370B.setEnabled(false);
        this.f13371C.setEnabled(false);
        this.f13372D.setEnabled(false);
        this.f13373E.setEnabled(false);
        this.f13374F.setEnabled(false);
        this.f13375G.setEnabled(false);
        this.f13376H.setEnabled(false);
        this.f13377I.setEnabled(false);
        ScrollView scrollView = (ScrollView) findViewById(rcc0.f162179p);
        if (scrollView != null) {
            scrollView.setOnTouchListener(new ViewOnTouchListenerC3837a());
        }
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: j1 */
    public void mo18850j1() {
        this.f13378z.setEnabled(true);
        this.f13369A.setEnabled(true);
        this.f13370B.setEnabled(true);
        this.f13371C.setEnabled(true);
        this.f13372D.setEnabled(true);
        this.f13373E.setEnabled(true);
        this.f13374F.setEnabled(true);
        this.f13375G.setEnabled(true);
        this.f13376H.setEnabled(true);
        this.f13377I.setEnabled(true);
        ScrollView scrollView = (ScrollView) findViewById(rcc0.f162179p);
        if (scrollView != null) {
            scrollView.setOnTouchListener(new ViewOnTouchListenerC3838b());
        }
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: p1 */
    public void mo18854p1() {
        EditText editText = (EditText) findViewById(rcc0.f162090B0);
        this.f13378z = editText;
        if (editText != null) {
            editText.setText(afm.m97360H().m97425V().ocrResult.ocrResult.name);
        }
        EditText editText2 = (EditText) findViewById(rcc0.f162088A0);
        this.f13369A = editText2;
        if (editText2 != null) {
            editText2.setText(afm.m97360H().m97425V().ocrResult.ocrResult.englishName);
        }
        EditText editText3 = (EditText) findViewById(rcc0.f162194w0);
        this.f13370B = editText3;
        if (editText3 != null) {
            editText3.setText(afm.m97360H().m97425V().ocrResult.ocrResult.sex);
        }
        EditText editText4 = (EditText) findViewById(rcc0.f162095E);
        this.f13371C = editText4;
        if (editText4 != null) {
            editText4.setText(afm.m97360H().m97425V().ocrResult.ocrResult.birthDate);
        }
        EditText editText5 = (EditText) findViewById(rcc0.f162096E0);
        this.f13372D = editText5;
        if (editText5 != null) {
            editText5.setText(afm.m97360H().m97425V().ocrResult.ocrResult.idNumber);
        }
        EditText editText6 = (EditText) findViewById(rcc0.f162127U);
        this.f13373E = editText6;
        if (editText6 != null) {
            editText6.setText(afm.m97360H().m97425V().ocrResult.ocrResult.issueDate);
        }
        EditText editText7 = (EditText) findViewById(rcc0.f162109L);
        this.f13374F = editText7;
        if (editText7 != null) {
            editText7.setText(afm.m97360H().m97425V().ocrResult.ocrResult.expiryDate);
        }
        EditText editText8 = (EditText) findViewById(rcc0.f162178o0);
        this.f13375G = editText8;
        if (editText8 != null) {
            editText8.setText(afm.m97360H().m97425V().ocrResult.ocrResult.originOfIssue);
        }
        EditText editText9 = (EditText) findViewById(rcc0.f162186s0);
        this.f13376H = editText9;
        if (editText9 != null) {
            editText9.setText(afm.m97360H().m97425V().ocrResult.ocrResult.placeOfIssue);
        }
        Button button = (Button) findViewById(rcc0.f162092C0);
        this.f13377I = button;
        button.setOnClickListener(new ViewOnClickListenerC3839c());
        m19120c2();
        m19121d2();
    }
}
