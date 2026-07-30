package com.idv.identity.ocr.p037ui;

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
import p149l.k4c0;
import p149l.kcm;
import p149l.mcm;
import p149l.q250;
import p149l.q2c0;
import p149l.r1c0;
import p149l.x5c0;

/* JADX INFO: loaded from: classes7.dex */
public class HKGoThroughIDCardResultActivity extends BaseIDCardResultActivity {

    /* JADX INFO: renamed from: A */
    private EditText f12476A;

    /* JADX INFO: renamed from: B */
    private EditText f12477B;

    /* JADX INFO: renamed from: C */
    private EditText f12478C;

    /* JADX INFO: renamed from: D */
    private EditText f12479D;

    /* JADX INFO: renamed from: E */
    private EditText f12480E;

    /* JADX INFO: renamed from: F */
    private EditText f12481F;

    /* JADX INFO: renamed from: G */
    private EditText f12482G;

    /* JADX INFO: renamed from: H */
    private EditText f12483H;

    /* JADX INFO: renamed from: I */
    private Button f12484I;

    /* JADX INFO: renamed from: z */
    private EditText f12485z;

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.HKGoThroughIDCardResultActivity$a */
    public class ViewOnTouchListenerC3632a implements View.OnTouchListener {
        public ViewOnTouchListenerC3632a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.HKGoThroughIDCardResultActivity$b */
    public class ViewOnTouchListenerC3633b implements View.OnTouchListener {
        public ViewOnTouchListenerC3633b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.HKGoThroughIDCardResultActivity$c */
    public class ViewOnClickListenerC3634c implements View.OnClickListener {
        public ViewOnClickListenerC3634c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String strTrim = HKGoThroughIDCardResultActivity.this.f12485z.getText().toString().trim();
            String strTrim2 = HKGoThroughIDCardResultActivity.this.f12476A.getText().toString().trim();
            String strTrim3 = HKGoThroughIDCardResultActivity.this.f12479D.getText().toString().trim();
            String strTrim4 = HKGoThroughIDCardResultActivity.this.f12477B.getText().toString().trim();
            String strTrim5 = HKGoThroughIDCardResultActivity.this.f12478C.getText().toString().trim();
            String strTrim6 = HKGoThroughIDCardResultActivity.this.f12480E.getText().toString().trim();
            String strTrim7 = HKGoThroughIDCardResultActivity.this.f12481F.getText().toString().trim();
            String strTrim8 = HKGoThroughIDCardResultActivity.this.f12482G.getText().toString().trim();
            String strTrim9 = HKGoThroughIDCardResultActivity.this.f12483H.getText().toString().trim();
            if (TextUtils.isEmpty(strTrim) || TextUtils.isEmpty(strTrim2) || TextUtils.isEmpty(strTrim3)) {
                HKGoThroughIDCardResultActivity hKGoThroughIDCardResultActivity = HKGoThroughIDCardResultActivity.this;
                hKGoThroughIDCardResultActivity.mo17784y1(hKGoThroughIDCardResultActivity.getResources().getString(R$string.f11975H0), "");
                return;
            }
            if (!q250.m172433a("^[\\u4e00-\\u9fa5·]{2,20}$", strTrim)) {
                HKGoThroughIDCardResultActivity.this.mo17784y1(HKGoThroughIDCardResultActivity.this.getResources().getString(R$string.f12047w0) + HKGoThroughIDCardResultActivity.this.getResources().getString(R$string.f11969E0), "");
                return;
            }
            boolean zM172433a = q250.m172433a("^[A-Za-z,'-·\\s]{2,50}$", strTrim2);
            HKGoThroughIDCardResultActivity hKGoThroughIDCardResultActivity2 = HKGoThroughIDCardResultActivity.this;
            if (!zM172433a) {
                hKGoThroughIDCardResultActivity2.mo17784y1(HKGoThroughIDCardResultActivity.this.getResources().getString(R$string.f12029n0) + HKGoThroughIDCardResultActivity.this.getResources().getString(R$string.f11969E0), "");
                return;
            }
            if (hKGoThroughIDCardResultActivity2.f12322p.equals(mcm.f133151d)) {
                if (!q250.m172433a("^C[0-9]{8}|C[A-HJ-NP-Za-z][0-9]{7}$", strTrim3)) {
                    HKGoThroughIDCardResultActivity.this.mo17784y1(HKGoThroughIDCardResultActivity.this.getResources().getString(R$string.f12039s0) + HKGoThroughIDCardResultActivity.this.getResources().getString(R$string.f11969E0), "");
                    return;
                }
            } else if (!q250.m172433a("^[HM][0-9]{8}$", strTrim3)) {
                HKGoThroughIDCardResultActivity.this.mo17784y1(HKGoThroughIDCardResultActivity.this.getResources().getString(R$string.f12039s0) + HKGoThroughIDCardResultActivity.this.getResources().getString(R$string.f11969E0), "");
                return;
            }
            HKGoThroughIDCardResultActivity.this.f12484I.setEnabled(false);
            HashMap map = new HashMap();
            map.put(AuthenticationTokenClaims.JSON_KEY_NAME, strTrim);
            map.put("englishName", strTrim2);
            map.put("idNumber", strTrim3);
            map.put("sex", strTrim4);
            map.put("birthDate", strTrim5);
            map.put("issueDate", strTrim6);
            map.put("expiryDate", strTrim7);
            map.put("originOfIssue", strTrim9);
            if (HKGoThroughIDCardResultActivity.this.f12322p.equals(mcm.f133151d)) {
                map.put("placeOfIssue", strTrim8);
            }
            HKGoThroughIDCardResultActivity.this.m17778q1(map);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.HKGoThroughIDCardResultActivity$d */
    public class C3635d implements TextWatcher {
        public C3635d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            HKGoThroughIDCardResultActivity.this.m17940d2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.HKGoThroughIDCardResultActivity$e */
    public class C3636e implements TextWatcher {
        public C3636e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            HKGoThroughIDCardResultActivity.this.m17940d2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.HKGoThroughIDCardResultActivity$f */
    public class C3637f implements TextWatcher {
        public C3637f() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            HKGoThroughIDCardResultActivity.this.m17940d2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: b2 */
    private boolean m17938b2() {
        boolean zEquals = this.f12322p.equals(mcm.f133151d);
        EditText editText = this.f12479D;
        return zEquals ? q250.m172433a("^C[0-9]{8}|C[A-HJ-NP-Za-z][0-9]{7}$", editText.getText().toString()) : q250.m172433a("^[HM][0-9]{8}$", editText.getText().toString());
    }

    /* JADX INFO: renamed from: c2 */
    private void m17939c2() {
        this.f12485z.addTextChangedListener(new C3635d());
        this.f12476A.addTextChangedListener(new C3636e());
        this.f12479D.addTextChangedListener(new C3637f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public void m17940d2() {
        boolean z;
        String string = this.f12485z.getText().toString();
        String string2 = this.f12476A.getText().toString();
        if (q250.m172433a("^[\\u4e00-\\u9fa5·]{2,20}$", string)) {
            this.f12485z.setBackgroundDrawable(getResources().getDrawable(q2c0.f152226j));
            z = true;
        } else {
            m17768W0(R$string.f12047w0);
            this.f12485z.setBackgroundDrawable(getResources().getDrawable(q2c0.f152227k));
            z = false;
        }
        if (q250.m172433a("^[A-Za-z,'-·\\s]{2,50}$", string2)) {
            this.f12476A.setBackgroundDrawable(getResources().getDrawable(q2c0.f152226j));
        } else {
            m17768W0(R$string.f12029n0);
            this.f12476A.setBackgroundDrawable(getResources().getDrawable(q2c0.f152227k));
            z = false;
        }
        if (m17938b2()) {
            this.f12479D.setBackgroundDrawable(getResources().getDrawable(q2c0.f152226j));
        } else {
            m17768W0(R$string.f12039s0);
            this.f12479D.setBackgroundDrawable(getResources().getDrawable(q2c0.f152227k));
            z = false;
        }
        if (z) {
            m17762C1();
            this.f12484I.setEnabled(true);
            m17764H1();
            m17771f1(true);
            return;
        }
        this.f12484I.setEnabled(false);
        GradientDrawable gradientDrawable = (GradientDrawable) this.f12484I.getBackground();
        if (gradientDrawable != null) {
            gradientDrawable.setColor(getResources().getColor(r1c0.f157265e));
        }
        m17771f1(false);
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: G1 */
    public void mo17763G1() {
        setContentView(x5c0.f191115c);
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: Y0 */
    public void mo17769Y0() {
        kcm.m145452H().m145517V().ocrResult.ocrResult.name = this.f12485z.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.englishName = this.f12476A.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.idNumber = this.f12479D.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.sex = this.f12477B.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.birthDate = this.f12478C.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.issueDate = this.f12480E.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.expiryDate = this.f12481F.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.placeOfIssue = this.f12482G.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.originOfIssue = this.f12483H.getText().toString();
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: d1 */
    public void mo17770d1() {
        this.f12485z.setEnabled(false);
        this.f12476A.setEnabled(false);
        this.f12477B.setEnabled(false);
        this.f12478C.setEnabled(false);
        this.f12479D.setEnabled(false);
        this.f12480E.setEnabled(false);
        this.f12481F.setEnabled(false);
        this.f12482G.setEnabled(false);
        this.f12483H.setEnabled(false);
        this.f12484I.setEnabled(false);
        ScrollView scrollView = (ScrollView) findViewById(k4c0.f121060p);
        if (scrollView != null) {
            scrollView.setOnTouchListener(new ViewOnTouchListenerC3632a());
        }
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: h1 */
    public void mo17772h1() {
        this.f12485z.setEnabled(true);
        this.f12476A.setEnabled(true);
        this.f12477B.setEnabled(true);
        this.f12478C.setEnabled(true);
        this.f12479D.setEnabled(true);
        this.f12480E.setEnabled(true);
        this.f12481F.setEnabled(true);
        this.f12482G.setEnabled(true);
        this.f12483H.setEnabled(true);
        this.f12484I.setEnabled(true);
        ScrollView scrollView = (ScrollView) findViewById(k4c0.f121060p);
        if (scrollView != null) {
            scrollView.setOnTouchListener(new ViewOnTouchListenerC3633b());
        }
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: o1 */
    public void mo17776o1() {
        EditText editText = (EditText) findViewById(k4c0.f120975D0);
        this.f12485z = editText;
        if (editText != null) {
            this.f12485z.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.name);
        }
        EditText editText2 = (EditText) findViewById(k4c0.f121048j0);
        this.f12476A = editText2;
        if (editText2 != null) {
            this.f12476A.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.englishName);
        }
        EditText editText3 = (EditText) findViewById(k4c0.f121075w0);
        this.f12477B = editText3;
        if (editText3 != null) {
            this.f12477B.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.sex);
        }
        EditText editText4 = (EditText) findViewById(k4c0.f120976E);
        this.f12478C = editText4;
        if (editText4 != null) {
            this.f12478C.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.birthDate);
        }
        EditText editText5 = (EditText) findViewById(k4c0.f120977E0);
        this.f12479D = editText5;
        if (editText5 != null) {
            this.f12479D.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.idNumber);
        }
        this.f12480E = (EditText) findViewById(k4c0.f121008U);
        this.f12481F = (EditText) findViewById(k4c0.f120990L);
        this.f12482G = (EditText) findViewById(k4c0.f121067s0);
        this.f12483H = (EditText) findViewById(k4c0.f121059o0);
        if (this.f12480E != null) {
            this.f12480E.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.issueDate);
        }
        if (this.f12481F != null) {
            this.f12481F.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.expiryDate);
        }
        if (!this.f12322p.equals(mcm.f133151d)) {
            ((LinearLayout) findViewById(k4c0.f121069t0)).setVisibility(8);
            this.f12476A.setHint(getResources().getString(R$string.f12035q0));
            this.f12479D.setHint(getResources().getString(R$string.f12037r0));
        } else if (this.f12482G != null) {
            this.f12482G.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.placeOfIssue);
        }
        if (this.f12483H != null) {
            this.f12483H.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.originOfIssue);
        }
        Button button = (Button) findViewById(k4c0.f120973C0);
        this.f12484I = button;
        button.setOnClickListener(new ViewOnClickListenerC3634c());
        m17939c2();
        m17940d2();
    }
}
