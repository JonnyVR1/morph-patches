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
import com.facebook.AuthenticationTokenClaims;
import com.idv.identity.base.R$string;
import java.util.HashMap;
import p149l.k4c0;
import p149l.kcm;
import p149l.q250;
import p149l.q2c0;
import p149l.r1c0;
import p149l.x5c0;

/* JADX INFO: loaded from: classes7.dex */
public class TaiwanIDCardResultActivity extends BaseIDCardResultActivity {

    /* JADX INFO: renamed from: A */
    private EditText f12628A;

    /* JADX INFO: renamed from: B */
    private EditText f12629B;

    /* JADX INFO: renamed from: C */
    private EditText f12630C;

    /* JADX INFO: renamed from: D */
    private EditText f12631D;

    /* JADX INFO: renamed from: E */
    private EditText f12632E;

    /* JADX INFO: renamed from: F */
    private EditText f12633F;

    /* JADX INFO: renamed from: G */
    private EditText f12634G;

    /* JADX INFO: renamed from: H */
    private EditText f12635H;

    /* JADX INFO: renamed from: I */
    private Button f12636I;

    /* JADX INFO: renamed from: z */
    private EditText f12637z;

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.TaiwanIDCardResultActivity$a */
    public class ViewOnTouchListenerC3678a implements View.OnTouchListener {
        public ViewOnTouchListenerC3678a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.TaiwanIDCardResultActivity$b */
    public class ViewOnTouchListenerC3679b implements View.OnTouchListener {
        public ViewOnTouchListenerC3679b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.TaiwanIDCardResultActivity$c */
    public class ViewOnClickListenerC3680c implements View.OnClickListener {
        public ViewOnClickListenerC3680c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String strTrim = TaiwanIDCardResultActivity.this.f12637z.getText().toString().trim();
            String strTrim2 = TaiwanIDCardResultActivity.this.f12628A.getText().toString().trim();
            String strTrim3 = TaiwanIDCardResultActivity.this.f12631D.getText().toString().trim();
            String strTrim4 = TaiwanIDCardResultActivity.this.f12629B.getText().toString().trim();
            String strTrim5 = TaiwanIDCardResultActivity.this.f12630C.getText().toString().trim();
            String strTrim6 = TaiwanIDCardResultActivity.this.f12632E.getText().toString().trim();
            String strTrim7 = TaiwanIDCardResultActivity.this.f12633F.getText().toString().trim();
            String strTrim8 = TaiwanIDCardResultActivity.this.f12634G.getText().toString().trim();
            String strTrim9 = TaiwanIDCardResultActivity.this.f12635H.getText().toString().trim();
            if (TextUtils.isEmpty(strTrim) || TextUtils.isEmpty(strTrim2) || TextUtils.isEmpty(strTrim3)) {
                TaiwanIDCardResultActivity taiwanIDCardResultActivity = TaiwanIDCardResultActivity.this;
                taiwanIDCardResultActivity.mo17784y1(taiwanIDCardResultActivity.getResources().getString(R$string.f11975H0), "");
                return;
            }
            if (!q250.m172433a("^[\\u4e00-\\u9fa5·]{2,20}$", strTrim)) {
                TaiwanIDCardResultActivity.this.mo17784y1(TaiwanIDCardResultActivity.this.getResources().getString(R$string.f12047w0) + TaiwanIDCardResultActivity.this.getResources().getString(R$string.f11969E0), "");
                return;
            }
            if (!q250.m172433a("^[A-Za-z,'-·\\s]{2,50}$", strTrim2)) {
                TaiwanIDCardResultActivity.this.mo17784y1(TaiwanIDCardResultActivity.this.getResources().getString(R$string.f12029n0) + TaiwanIDCardResultActivity.this.getResources().getString(R$string.f11969E0), "");
                return;
            }
            boolean zM172433a = q250.m172433a("^[0-9]{8}$", strTrim3);
            TaiwanIDCardResultActivity taiwanIDCardResultActivity2 = TaiwanIDCardResultActivity.this;
            if (!zM172433a) {
                taiwanIDCardResultActivity2.mo17784y1(TaiwanIDCardResultActivity.this.getResources().getString(R$string.f12039s0) + TaiwanIDCardResultActivity.this.getResources().getString(R$string.f11969E0), "");
                return;
            }
            taiwanIDCardResultActivity2.f12636I.setEnabled(false);
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
            TaiwanIDCardResultActivity.this.m17778q1(map);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.TaiwanIDCardResultActivity$d */
    public class C3681d implements TextWatcher {
        public C3681d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TaiwanIDCardResultActivity.this.m18044c2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.TaiwanIDCardResultActivity$e */
    public class C3682e implements TextWatcher {
        public C3682e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TaiwanIDCardResultActivity.this.m18044c2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.TaiwanIDCardResultActivity$f */
    public class C3683f implements TextWatcher {
        public C3683f() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TaiwanIDCardResultActivity.this.m18044c2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: b2 */
    private void m18043b2() {
        this.f12637z.addTextChangedListener(new C3681d());
        this.f12628A.addTextChangedListener(new C3682e());
        this.f12631D.addTextChangedListener(new C3683f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public void m18044c2() {
        boolean z;
        String string = this.f12637z.getText().toString();
        String string2 = this.f12628A.getText().toString();
        String string3 = this.f12631D.getText().toString();
        if (q250.m172433a("^[\\u4e00-\\u9fa5·]{2,20}$", string)) {
            this.f12637z.setBackgroundDrawable(getResources().getDrawable(q2c0.f152226j));
            z = true;
        } else {
            m17768W0(R$string.f12047w0);
            this.f12637z.setBackgroundDrawable(getResources().getDrawable(q2c0.f152227k));
            z = false;
        }
        if (q250.m172433a("^[A-Za-z,'-·\\s]{2,50}$", string2)) {
            this.f12628A.setBackgroundDrawable(getResources().getDrawable(q2c0.f152226j));
        } else {
            m17768W0(R$string.f12029n0);
            this.f12628A.setBackgroundDrawable(getResources().getDrawable(q2c0.f152227k));
            z = false;
        }
        if (q250.m172433a("^[0-9]{8}$", string3)) {
            this.f12631D.setBackgroundDrawable(getResources().getDrawable(q2c0.f152226j));
        } else {
            m17768W0(R$string.f12039s0);
            this.f12631D.setBackgroundDrawable(getResources().getDrawable(q2c0.f152227k));
            z = false;
        }
        if (z) {
            m17762C1();
            this.f12636I.setEnabled(true);
            m17764H1();
            m17771f1(true);
            return;
        }
        this.f12636I.setEnabled(false);
        GradientDrawable gradientDrawable = (GradientDrawable) this.f12636I.getBackground();
        if (gradientDrawable != null) {
            gradientDrawable.setColor(getResources().getColor(r1c0.f157265e));
        }
        m17771f1(false);
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: G1 */
    public void mo17763G1() {
        setContentView(x5c0.f191123k);
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: Y0 */
    public void mo17769Y0() {
        kcm.m145452H().m145517V().ocrResult.ocrResult.name = this.f12637z.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.englishName = this.f12628A.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.idNumber = this.f12631D.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.sex = this.f12629B.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.birthDate = this.f12630C.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.issueDate = this.f12632E.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.expiryDate = this.f12633F.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.originOfIssue = this.f12634G.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.placeOfIssue = this.f12635H.getText().toString();
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: d1 */
    public void mo17770d1() {
        this.f12637z.setEnabled(false);
        this.f12628A.setEnabled(false);
        this.f12629B.setEnabled(false);
        this.f12630C.setEnabled(false);
        this.f12631D.setEnabled(false);
        this.f12632E.setEnabled(false);
        this.f12633F.setEnabled(false);
        this.f12634G.setEnabled(false);
        this.f12635H.setEnabled(false);
        this.f12636I.setEnabled(false);
        ScrollView scrollView = (ScrollView) findViewById(k4c0.f121060p);
        if (scrollView != null) {
            scrollView.setOnTouchListener(new ViewOnTouchListenerC3678a());
        }
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: h1 */
    public void mo17772h1() {
        this.f12637z.setEnabled(true);
        this.f12628A.setEnabled(true);
        this.f12629B.setEnabled(true);
        this.f12630C.setEnabled(true);
        this.f12631D.setEnabled(true);
        this.f12632E.setEnabled(true);
        this.f12633F.setEnabled(true);
        this.f12634G.setEnabled(true);
        this.f12635H.setEnabled(true);
        this.f12636I.setEnabled(true);
        ScrollView scrollView = (ScrollView) findViewById(k4c0.f121060p);
        if (scrollView != null) {
            scrollView.setOnTouchListener(new ViewOnTouchListenerC3679b());
        }
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: o1 */
    public void mo17776o1() {
        EditText editText = (EditText) findViewById(k4c0.f120971B0);
        this.f12637z = editText;
        if (editText != null) {
            editText.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.name);
        }
        EditText editText2 = (EditText) findViewById(k4c0.f120969A0);
        this.f12628A = editText2;
        if (editText2 != null) {
            editText2.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.englishName);
        }
        EditText editText3 = (EditText) findViewById(k4c0.f121075w0);
        this.f12629B = editText3;
        if (editText3 != null) {
            editText3.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.sex);
        }
        EditText editText4 = (EditText) findViewById(k4c0.f120976E);
        this.f12630C = editText4;
        if (editText4 != null) {
            editText4.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.birthDate);
        }
        EditText editText5 = (EditText) findViewById(k4c0.f120977E0);
        this.f12631D = editText5;
        if (editText5 != null) {
            editText5.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.idNumber);
        }
        EditText editText6 = (EditText) findViewById(k4c0.f121008U);
        this.f12632E = editText6;
        if (editText6 != null) {
            editText6.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.issueDate);
        }
        EditText editText7 = (EditText) findViewById(k4c0.f120990L);
        this.f12633F = editText7;
        if (editText7 != null) {
            editText7.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.expiryDate);
        }
        EditText editText8 = (EditText) findViewById(k4c0.f121059o0);
        this.f12634G = editText8;
        if (editText8 != null) {
            editText8.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.originOfIssue);
        }
        EditText editText9 = (EditText) findViewById(k4c0.f121067s0);
        this.f12635H = editText9;
        if (editText9 != null) {
            editText9.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.placeOfIssue);
        }
        Button button = (Button) findViewById(k4c0.f120973C0);
        this.f12636I = button;
        button.setOnClickListener(new ViewOnClickListenerC3680c());
        m18043b2();
        m18044c2();
    }
}
