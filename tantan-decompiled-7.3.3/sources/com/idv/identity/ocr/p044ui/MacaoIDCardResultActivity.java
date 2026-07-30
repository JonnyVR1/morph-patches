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
import com.idv.identity.base.R$string;
import java.util.HashMap;
import p153l.afm;
import p153l.dec0;
import p153l.fb50;
import p153l.rcc0;
import p153l.y9c0;
import p153l.yac0;

/* JADX INFO: loaded from: classes7.dex */
public class MacaoIDCardResultActivity extends BaseIDCardResultActivity {

    /* JADX INFO: renamed from: A */
    private EditText f13306A;

    /* JADX INFO: renamed from: B */
    private EditText f13307B;

    /* JADX INFO: renamed from: C */
    private EditText f13308C;

    /* JADX INFO: renamed from: D */
    private EditText f13309D;

    /* JADX INFO: renamed from: E */
    private EditText f13310E;

    /* JADX INFO: renamed from: F */
    private EditText f13311F;

    /* JADX INFO: renamed from: G */
    private EditText f13312G;

    /* JADX INFO: renamed from: H */
    private EditText f13313H;

    /* JADX INFO: renamed from: I */
    private Button f13314I;

    /* JADX INFO: renamed from: z */
    private EditText f13315z;

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MacaoIDCardResultActivity$a */
    public class ViewOnTouchListenerC3818a implements View.OnTouchListener {
        public ViewOnTouchListenerC3818a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MacaoIDCardResultActivity$b */
    public class ViewOnTouchListenerC3819b implements View.OnTouchListener {
        public ViewOnTouchListenerC3819b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MacaoIDCardResultActivity$c */
    public class ViewOnClickListenerC3820c implements View.OnClickListener {
        public ViewOnClickListenerC3820c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String string = MacaoIDCardResultActivity.this.f13315z.getText().toString();
            String string2 = MacaoIDCardResultActivity.this.f13306A.getText().toString();
            String string3 = MacaoIDCardResultActivity.this.f13307B.getText().toString();
            String string4 = MacaoIDCardResultActivity.this.f13308C.getText().toString();
            String string5 = MacaoIDCardResultActivity.this.f13311F.getText().toString();
            String string6 = MacaoIDCardResultActivity.this.f13309D.getText().toString();
            String string7 = MacaoIDCardResultActivity.this.f13310E.getText().toString();
            String string8 = MacaoIDCardResultActivity.this.f13312G.getText().toString();
            String string9 = MacaoIDCardResultActivity.this.f13313H.getText().toString();
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3) || TextUtils.isEmpty(string4) || TextUtils.isEmpty(string5)) {
                MacaoIDCardResultActivity macaoIDCardResultActivity = MacaoIDCardResultActivity.this;
                macaoIDCardResultActivity.mo18862z1(macaoIDCardResultActivity.getResources().getString(R$string.f12716H0), "");
                return;
            }
            if (!fb50.m124883a("^[\\u4e00-\\u9fa5]{1,20}$", string)) {
                MacaoIDCardResultActivity.this.mo18862z1(MacaoIDCardResultActivity.this.getResources().getString(R$string.f12704B0) + MacaoIDCardResultActivity.this.getResources().getString(R$string.f12710E0), "");
                return;
            }
            if (!fb50.m124883a("[\\u4e00-\\u9fa5]{1,20}$", string2)) {
                MacaoIDCardResultActivity.this.mo18862z1(MacaoIDCardResultActivity.this.getResources().getString(R$string.f12774p0) + MacaoIDCardResultActivity.this.getResources().getString(R$string.f12710E0), "");
                return;
            }
            if (!fb50.m124883a("^[A-Za-z]{1,50}$", string3)) {
                MacaoIDCardResultActivity.this.mo18862z1(MacaoIDCardResultActivity.this.getResources().getString(R$string.f12702A0) + MacaoIDCardResultActivity.this.getResources().getString(R$string.f12710E0), "");
                return;
            }
            if (!fb50.m124883a("^[A-Za-z\\s]{1,50}$", string4)) {
                MacaoIDCardResultActivity.this.mo18862z1(MacaoIDCardResultActivity.this.getResources().getString(R$string.f12772o0) + MacaoIDCardResultActivity.this.getResources().getString(R$string.f12710E0), "");
                return;
            }
            boolean zM124883a = fb50.m124883a("^[157]([0-9]{6}\\([0-9]\\)|[0-9]{7})$", string5);
            MacaoIDCardResultActivity macaoIDCardResultActivity2 = MacaoIDCardResultActivity.this;
            if (!zM124883a) {
                macaoIDCardResultActivity2.mo18862z1(MacaoIDCardResultActivity.this.getResources().getString(R$string.f12780s0) + MacaoIDCardResultActivity.this.getResources().getString(R$string.f12710E0), "");
                return;
            }
            macaoIDCardResultActivity2.f13314I.setEnabled(false);
            HashMap map = new HashMap();
            map.put("surnameCN", string);
            map.put("givennameCN", string2);
            map.put("surname", string3);
            map.put("givenname", string4);
            map.put("idNumber", string5);
            map.put("sex", string6);
            map.put("birthDate", string7);
            map.put("expiryDate", string8);
            map.put("placeOfBirth", string9);
            MacaoIDCardResultActivity.this.m18856r1(map);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MacaoIDCardResultActivity$d */
    public class C3821d implements TextWatcher {
        public C3821d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            MacaoIDCardResultActivity.this.m19082d2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MacaoIDCardResultActivity$e */
    public class C3822e implements TextWatcher {
        public C3822e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            MacaoIDCardResultActivity.this.m19082d2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MacaoIDCardResultActivity$f */
    public class C3823f implements TextWatcher {
        public C3823f() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            MacaoIDCardResultActivity.this.m19082d2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MacaoIDCardResultActivity$g */
    public class C3824g implements TextWatcher {
        public C3824g() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            MacaoIDCardResultActivity.this.m19082d2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MacaoIDCardResultActivity$h */
    public class C3825h implements TextWatcher {
        public C3825h() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            MacaoIDCardResultActivity.this.m19082d2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: c2 */
    private void m19081c2() {
        this.f13315z.addTextChangedListener(new C3821d());
        this.f13306A.addTextChangedListener(new C3822e());
        this.f13307B.addTextChangedListener(new C3823f());
        this.f13308C.addTextChangedListener(new C3824g());
        this.f13311F.addTextChangedListener(new C3825h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public void m19082d2() {
        boolean z;
        String string = this.f13315z.getText().toString();
        String string2 = this.f13306A.getText().toString();
        String string3 = this.f13307B.getText().toString();
        String string4 = this.f13308C.getText().toString();
        String string5 = this.f13311F.getText().toString();
        if (fb50.m124883a("^[\\u4e00-\\u9fa5]{1,20}$", string)) {
            this.f13315z.setBackgroundDrawable(getResources().getDrawable(yac0.f198173j));
            z = true;
        } else {
            m18846X0(R$string.f12704B0);
            this.f13315z.setBackgroundDrawable(getResources().getDrawable(yac0.f198174k));
            z = false;
        }
        if (fb50.m124883a("[\\u4e00-\\u9fa5]{1,20}$", string2)) {
            this.f13306A.setBackgroundDrawable(getResources().getDrawable(yac0.f198173j));
        } else {
            m18846X0(R$string.f12774p0);
            this.f13306A.setBackgroundDrawable(getResources().getDrawable(yac0.f198174k));
            z = false;
        }
        if (fb50.m124883a("^[A-Za-z]{1,50}$", string3)) {
            this.f13307B.setBackgroundDrawable(getResources().getDrawable(yac0.f198173j));
        } else {
            m18846X0(R$string.f12702A0);
            this.f13307B.setBackgroundDrawable(getResources().getDrawable(yac0.f198174k));
            z = false;
        }
        if (fb50.m124883a("^[A-Za-z\\s]{1,50}$", string4)) {
            this.f13308C.setBackgroundDrawable(getResources().getDrawable(yac0.f198173j));
        } else {
            m18846X0(R$string.f12772o0);
            this.f13308C.setBackgroundDrawable(getResources().getDrawable(yac0.f198174k));
            z = false;
        }
        if (fb50.m124883a("^[157]([0-9]{6}\\([0-9]\\)|[0-9]{7})$", string5)) {
            this.f13311F.setBackgroundDrawable(getResources().getDrawable(yac0.f198173j));
        } else {
            m18846X0(R$string.f12780s0);
            this.f13311F.setBackgroundDrawable(getResources().getDrawable(yac0.f198174k));
            z = false;
        }
        if (z) {
            m18840E1();
            this.f13314I.setEnabled(true);
            m18842I1();
            m18849h1(true);
            return;
        }
        this.f13314I.setEnabled(false);
        GradientDrawable gradientDrawable = (GradientDrawable) this.f13314I.getBackground();
        if (gradientDrawable != null) {
            gradientDrawable.setColor(getResources().getColor(y9c0.f198080e));
        }
        m18849h1(false);
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: H1 */
    public void mo18841H1() {
        setContentView(dec0.f88003g);
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: a1 */
    public void mo18847a1() {
        afm.m97360H().m97425V().ocrResult.ocrResult.surnameCN = this.f13315z.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.givennameCN = this.f13306A.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.surname = this.f13307B.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.givenname = this.f13308C.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.idNumber = this.f13311F.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.sex = this.f13309D.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.birthDate = this.f13310E.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.expiryDate = this.f13312G.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.placeOfBirth = this.f13313H.getText().toString();
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: f1 */
    public void mo18848f1() {
        this.f13315z.setEnabled(false);
        this.f13306A.setEnabled(false);
        this.f13307B.setEnabled(false);
        this.f13308C.setEnabled(false);
        this.f13309D.setEnabled(false);
        this.f13310E.setEnabled(false);
        this.f13311F.setEnabled(false);
        this.f13312G.setEnabled(false);
        this.f13313H.setEnabled(false);
        this.f13314I.setEnabled(false);
        ScrollView scrollView = (ScrollView) findViewById(rcc0.f162179p);
        if (scrollView != null) {
            scrollView.setOnTouchListener(new ViewOnTouchListenerC3818a());
        }
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: j1 */
    public void mo18850j1() {
        this.f13315z.setEnabled(true);
        this.f13306A.setEnabled(true);
        this.f13307B.setEnabled(true);
        this.f13308C.setEnabled(true);
        this.f13309D.setEnabled(true);
        this.f13310E.setEnabled(true);
        this.f13311F.setEnabled(true);
        this.f13312G.setEnabled(true);
        this.f13313H.setEnabled(true);
        this.f13314I.setEnabled(true);
        ScrollView scrollView = (ScrollView) findViewById(rcc0.f162179p);
        if (scrollView != null) {
            scrollView.setOnTouchListener(new ViewOnTouchListenerC3819b());
        }
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: p1 */
    public void mo18854p1() {
        EditText editText = (EditText) findViewById(rcc0.f162140a0);
        this.f13315z = editText;
        if (editText != null) {
            editText.setText(afm.m97360H().m97425V().ocrResult.ocrResult.surnameCN);
        }
        EditText editText2 = (EditText) findViewById(rcc0.f162133X);
        this.f13306A = editText2;
        if (editText2 != null) {
            editText2.setText(afm.m97360H().m97425V().ocrResult.ocrResult.givennameCN);
        }
        EditText editText3 = (EditText) findViewById(rcc0.f162137Z);
        this.f13307B = editText3;
        if (editText3 != null) {
            editText3.setText(afm.m97360H().m97425V().ocrResult.ocrResult.surname);
        }
        EditText editText4 = (EditText) findViewById(rcc0.f162131W);
        this.f13308C = editText4;
        if (editText4 != null) {
            editText4.setText(afm.m97360H().m97425V().ocrResult.ocrResult.givenname);
        }
        EditText editText5 = (EditText) findViewById(rcc0.f162194w0);
        this.f13309D = editText5;
        if (editText5 != null) {
            editText5.setText(afm.m97360H().m97425V().ocrResult.ocrResult.sex);
        }
        EditText editText6 = (EditText) findViewById(rcc0.f162095E);
        this.f13310E = editText6;
        if (editText6 != null) {
            editText6.setText(afm.m97360H().m97425V().ocrResult.ocrResult.birthDate);
        }
        EditText editText7 = (EditText) findViewById(rcc0.f162096E0);
        this.f13311F = editText7;
        if (editText7 != null) {
            editText7.setText(afm.m97360H().m97425V().ocrResult.ocrResult.idNumber);
        }
        EditText editText8 = (EditText) findViewById(rcc0.f162109L);
        this.f13312G = editText8;
        if (editText8 != null) {
            editText8.setText(afm.m97360H().m97425V().ocrResult.ocrResult.expiryDate);
        }
        EditText editText9 = (EditText) findViewById(rcc0.f162135Y);
        this.f13313H = editText9;
        if (editText9 != null) {
            editText9.setText(afm.m97360H().m97425V().ocrResult.ocrResult.placeOfBirth);
        }
        Button button = (Button) findViewById(rcc0.f162092C0);
        this.f13314I = button;
        button.setOnClickListener(new ViewOnClickListenerC3820c());
        m19081c2();
        m19082d2();
    }
}
