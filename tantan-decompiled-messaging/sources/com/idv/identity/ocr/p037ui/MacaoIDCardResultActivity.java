package com.idv.identity.ocr.p037ui;

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
import p149l.k4c0;
import p149l.kcm;
import p149l.q250;
import p149l.q2c0;
import p149l.r1c0;
import p149l.x5c0;

/* JADX INFO: loaded from: classes7.dex */
public class MacaoIDCardResultActivity extends BaseIDCardResultActivity {

    /* JADX INFO: renamed from: A */
    private EditText f12565A;

    /* JADX INFO: renamed from: B */
    private EditText f12566B;

    /* JADX INFO: renamed from: C */
    private EditText f12567C;

    /* JADX INFO: renamed from: D */
    private EditText f12568D;

    /* JADX INFO: renamed from: E */
    private EditText f12569E;

    /* JADX INFO: renamed from: F */
    private EditText f12570F;

    /* JADX INFO: renamed from: G */
    private EditText f12571G;

    /* JADX INFO: renamed from: H */
    private EditText f12572H;

    /* JADX INFO: renamed from: I */
    private Button f12573I;

    /* JADX INFO: renamed from: z */
    private EditText f12574z;

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MacaoIDCardResultActivity$a */
    public class ViewOnTouchListenerC3659a implements View.OnTouchListener {
        public ViewOnTouchListenerC3659a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MacaoIDCardResultActivity$b */
    public class ViewOnTouchListenerC3660b implements View.OnTouchListener {
        public ViewOnTouchListenerC3660b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MacaoIDCardResultActivity$c */
    public class ViewOnClickListenerC3661c implements View.OnClickListener {
        public ViewOnClickListenerC3661c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String string = MacaoIDCardResultActivity.this.f12574z.getText().toString();
            String string2 = MacaoIDCardResultActivity.this.f12565A.getText().toString();
            String string3 = MacaoIDCardResultActivity.this.f12566B.getText().toString();
            String string4 = MacaoIDCardResultActivity.this.f12567C.getText().toString();
            String string5 = MacaoIDCardResultActivity.this.f12570F.getText().toString();
            String string6 = MacaoIDCardResultActivity.this.f12568D.getText().toString();
            String string7 = MacaoIDCardResultActivity.this.f12569E.getText().toString();
            String string8 = MacaoIDCardResultActivity.this.f12571G.getText().toString();
            String string9 = MacaoIDCardResultActivity.this.f12572H.getText().toString();
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3) || TextUtils.isEmpty(string4) || TextUtils.isEmpty(string5)) {
                MacaoIDCardResultActivity macaoIDCardResultActivity = MacaoIDCardResultActivity.this;
                macaoIDCardResultActivity.mo17784y1(macaoIDCardResultActivity.getResources().getString(R$string.f11975H0), "");
                return;
            }
            if (!q250.m172433a("^[\\u4e00-\\u9fa5]{1,20}$", string)) {
                MacaoIDCardResultActivity.this.mo17784y1(MacaoIDCardResultActivity.this.getResources().getString(R$string.f11963B0) + MacaoIDCardResultActivity.this.getResources().getString(R$string.f11969E0), "");
                return;
            }
            if (!q250.m172433a("[\\u4e00-\\u9fa5]{1,20}$", string2)) {
                MacaoIDCardResultActivity.this.mo17784y1(MacaoIDCardResultActivity.this.getResources().getString(R$string.f12033p0) + MacaoIDCardResultActivity.this.getResources().getString(R$string.f11969E0), "");
                return;
            }
            if (!q250.m172433a("^[A-Za-z]{1,50}$", string3)) {
                MacaoIDCardResultActivity.this.mo17784y1(MacaoIDCardResultActivity.this.getResources().getString(R$string.f11961A0) + MacaoIDCardResultActivity.this.getResources().getString(R$string.f11969E0), "");
                return;
            }
            if (!q250.m172433a("^[A-Za-z\\s]{1,50}$", string4)) {
                MacaoIDCardResultActivity.this.mo17784y1(MacaoIDCardResultActivity.this.getResources().getString(R$string.f12031o0) + MacaoIDCardResultActivity.this.getResources().getString(R$string.f11969E0), "");
                return;
            }
            boolean zM172433a = q250.m172433a("^[157]([0-9]{6}\\([0-9]\\)|[0-9]{7})$", string5);
            MacaoIDCardResultActivity macaoIDCardResultActivity2 = MacaoIDCardResultActivity.this;
            if (!zM172433a) {
                macaoIDCardResultActivity2.mo17784y1(MacaoIDCardResultActivity.this.getResources().getString(R$string.f12039s0) + MacaoIDCardResultActivity.this.getResources().getString(R$string.f11969E0), "");
                return;
            }
            macaoIDCardResultActivity2.f12573I.setEnabled(false);
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
            MacaoIDCardResultActivity.this.m17778q1(map);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MacaoIDCardResultActivity$d */
    public class C3662d implements TextWatcher {
        public C3662d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            MacaoIDCardResultActivity.this.m18005c2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MacaoIDCardResultActivity$e */
    public class C3663e implements TextWatcher {
        public C3663e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            MacaoIDCardResultActivity.this.m18005c2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MacaoIDCardResultActivity$f */
    public class C3664f implements TextWatcher {
        public C3664f() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            MacaoIDCardResultActivity.this.m18005c2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MacaoIDCardResultActivity$g */
    public class C3665g implements TextWatcher {
        public C3665g() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            MacaoIDCardResultActivity.this.m18005c2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MacaoIDCardResultActivity$h */
    public class C3666h implements TextWatcher {
        public C3666h() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            MacaoIDCardResultActivity.this.m18005c2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: b2 */
    private void m18004b2() {
        this.f12574z.addTextChangedListener(new C3662d());
        this.f12565A.addTextChangedListener(new C3663e());
        this.f12566B.addTextChangedListener(new C3664f());
        this.f12567C.addTextChangedListener(new C3665g());
        this.f12570F.addTextChangedListener(new C3666h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public void m18005c2() {
        boolean z;
        String string = this.f12574z.getText().toString();
        String string2 = this.f12565A.getText().toString();
        String string3 = this.f12566B.getText().toString();
        String string4 = this.f12567C.getText().toString();
        String string5 = this.f12570F.getText().toString();
        if (q250.m172433a("^[\\u4e00-\\u9fa5]{1,20}$", string)) {
            this.f12574z.setBackgroundDrawable(getResources().getDrawable(q2c0.f152226j));
            z = true;
        } else {
            m17768W0(R$string.f11963B0);
            this.f12574z.setBackgroundDrawable(getResources().getDrawable(q2c0.f152227k));
            z = false;
        }
        if (q250.m172433a("[\\u4e00-\\u9fa5]{1,20}$", string2)) {
            this.f12565A.setBackgroundDrawable(getResources().getDrawable(q2c0.f152226j));
        } else {
            m17768W0(R$string.f12033p0);
            this.f12565A.setBackgroundDrawable(getResources().getDrawable(q2c0.f152227k));
            z = false;
        }
        if (q250.m172433a("^[A-Za-z]{1,50}$", string3)) {
            this.f12566B.setBackgroundDrawable(getResources().getDrawable(q2c0.f152226j));
        } else {
            m17768W0(R$string.f11961A0);
            this.f12566B.setBackgroundDrawable(getResources().getDrawable(q2c0.f152227k));
            z = false;
        }
        if (q250.m172433a("^[A-Za-z\\s]{1,50}$", string4)) {
            this.f12567C.setBackgroundDrawable(getResources().getDrawable(q2c0.f152226j));
        } else {
            m17768W0(R$string.f12031o0);
            this.f12567C.setBackgroundDrawable(getResources().getDrawable(q2c0.f152227k));
            z = false;
        }
        if (q250.m172433a("^[157]([0-9]{6}\\([0-9]\\)|[0-9]{7})$", string5)) {
            this.f12570F.setBackgroundDrawable(getResources().getDrawable(q2c0.f152226j));
        } else {
            m17768W0(R$string.f12039s0);
            this.f12570F.setBackgroundDrawable(getResources().getDrawable(q2c0.f152227k));
            z = false;
        }
        if (z) {
            m17762C1();
            this.f12573I.setEnabled(true);
            m17764H1();
            m17771f1(true);
            return;
        }
        this.f12573I.setEnabled(false);
        GradientDrawable gradientDrawable = (GradientDrawable) this.f12573I.getBackground();
        if (gradientDrawable != null) {
            gradientDrawable.setColor(getResources().getColor(r1c0.f157265e));
        }
        m17771f1(false);
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: G1 */
    public void mo17763G1() {
        setContentView(x5c0.f191119g);
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: Y0 */
    public void mo17769Y0() {
        kcm.m145452H().m145517V().ocrResult.ocrResult.surnameCN = this.f12574z.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.givennameCN = this.f12565A.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.surname = this.f12566B.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.givenname = this.f12567C.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.idNumber = this.f12570F.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.sex = this.f12568D.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.birthDate = this.f12569E.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.expiryDate = this.f12571G.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.placeOfBirth = this.f12572H.getText().toString();
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: d1 */
    public void mo17770d1() {
        this.f12574z.setEnabled(false);
        this.f12565A.setEnabled(false);
        this.f12566B.setEnabled(false);
        this.f12567C.setEnabled(false);
        this.f12568D.setEnabled(false);
        this.f12569E.setEnabled(false);
        this.f12570F.setEnabled(false);
        this.f12571G.setEnabled(false);
        this.f12572H.setEnabled(false);
        this.f12573I.setEnabled(false);
        ScrollView scrollView = (ScrollView) findViewById(k4c0.f121060p);
        if (scrollView != null) {
            scrollView.setOnTouchListener(new ViewOnTouchListenerC3659a());
        }
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: h1 */
    public void mo17772h1() {
        this.f12574z.setEnabled(true);
        this.f12565A.setEnabled(true);
        this.f12566B.setEnabled(true);
        this.f12567C.setEnabled(true);
        this.f12568D.setEnabled(true);
        this.f12569E.setEnabled(true);
        this.f12570F.setEnabled(true);
        this.f12571G.setEnabled(true);
        this.f12572H.setEnabled(true);
        this.f12573I.setEnabled(true);
        ScrollView scrollView = (ScrollView) findViewById(k4c0.f121060p);
        if (scrollView != null) {
            scrollView.setOnTouchListener(new ViewOnTouchListenerC3660b());
        }
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: o1 */
    public void mo17776o1() {
        EditText editText = (EditText) findViewById(k4c0.f121021a0);
        this.f12574z = editText;
        if (editText != null) {
            editText.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.surnameCN);
        }
        EditText editText2 = (EditText) findViewById(k4c0.f121014X);
        this.f12565A = editText2;
        if (editText2 != null) {
            editText2.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.givennameCN);
        }
        EditText editText3 = (EditText) findViewById(k4c0.f121018Z);
        this.f12566B = editText3;
        if (editText3 != null) {
            editText3.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.surname);
        }
        EditText editText4 = (EditText) findViewById(k4c0.f121012W);
        this.f12567C = editText4;
        if (editText4 != null) {
            editText4.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.givenname);
        }
        EditText editText5 = (EditText) findViewById(k4c0.f121075w0);
        this.f12568D = editText5;
        if (editText5 != null) {
            editText5.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.sex);
        }
        EditText editText6 = (EditText) findViewById(k4c0.f120976E);
        this.f12569E = editText6;
        if (editText6 != null) {
            editText6.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.birthDate);
        }
        EditText editText7 = (EditText) findViewById(k4c0.f120977E0);
        this.f12570F = editText7;
        if (editText7 != null) {
            editText7.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.idNumber);
        }
        EditText editText8 = (EditText) findViewById(k4c0.f120990L);
        this.f12571G = editText8;
        if (editText8 != null) {
            editText8.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.expiryDate);
        }
        EditText editText9 = (EditText) findViewById(k4c0.f121016Y);
        this.f12572H = editText9;
        if (editText9 != null) {
            editText9.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.placeOfBirth);
        }
        Button button = (Button) findViewById(k4c0.f120973C0);
        this.f12573I = button;
        button.setOnClickListener(new ViewOnClickListenerC3661c());
        m18004b2();
        m18005c2();
    }
}
