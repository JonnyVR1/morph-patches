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
import android.widget.TextView;
import com.facebook.AuthenticationTokenClaims;
import com.idv.identity.base.R$string;
import java.util.HashMap;
import p149l.adm;
import p149l.k4c0;
import p149l.kcm;
import p149l.q250;
import p149l.q2c0;
import p149l.r1c0;
import p149l.x5c0;

/* JADX INFO: loaded from: classes7.dex */
public class HKIDCardResultActivity extends BaseIDCardResultActivity {

    /* JADX INFO: renamed from: A */
    private EditText f12492A;

    /* JADX INFO: renamed from: B */
    private EditText f12493B;

    /* JADX INFO: renamed from: C */
    private EditText f12494C;

    /* JADX INFO: renamed from: D */
    private EditText f12495D;

    /* JADX INFO: renamed from: E */
    private EditText f12496E;

    /* JADX INFO: renamed from: F */
    private EditText f12497F;

    /* JADX INFO: renamed from: G */
    private EditText f12498G;

    /* JADX INFO: renamed from: H */
    private EditText f12499H;

    /* JADX INFO: renamed from: I */
    private EditText f12500I;

    /* JADX INFO: renamed from: J */
    private Button f12501J;

    /* JADX INFO: renamed from: K */
    private TextView f12502K;

    /* JADX INFO: renamed from: L */
    adm f12503L;

    /* JADX INFO: renamed from: z */
    private EditText f12504z;

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.HKIDCardResultActivity$a */
    public class ViewOnTouchListenerC3638a implements View.OnTouchListener {
        public ViewOnTouchListenerC3638a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.HKIDCardResultActivity$b */
    public class ViewOnTouchListenerC3639b implements View.OnTouchListener {
        public ViewOnTouchListenerC3639b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.HKIDCardResultActivity$c */
    public class ViewOnClickListenerC3640c implements View.OnClickListener {
        public ViewOnClickListenerC3640c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HKIDCardResultActivity hKIDCardResultActivity = HKIDCardResultActivity.this;
            if (hKIDCardResultActivity.f12503L == null) {
                hKIDCardResultActivity.f12503L = new adm(HKIDCardResultActivity.this);
            }
            HKIDCardResultActivity.this.f12503L.show();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.HKIDCardResultActivity$d */
    public class ViewOnClickListenerC3641d implements View.OnClickListener {
        public ViewOnClickListenerC3641d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String strTrim = HKIDCardResultActivity.this.f12504z.getText().toString().trim();
            String strTrim2 = HKIDCardResultActivity.this.f12492A.getText().toString().trim();
            String strTrim3 = HKIDCardResultActivity.this.f12496E.getText().toString().trim();
            String strTrim4 = HKIDCardResultActivity.this.f12493B.getText().toString().trim();
            String strTrim5 = HKIDCardResultActivity.this.f12494C.getText().toString().trim();
            String strTrim6 = HKIDCardResultActivity.this.f12495D.getText().toString().trim();
            String strTrim7 = HKIDCardResultActivity.this.f12497F.getText().toString().trim();
            String strTrim8 = HKIDCardResultActivity.this.f12498G.getText().toString().trim();
            String strTrim9 = HKIDCardResultActivity.this.f12499H.getText().toString().trim();
            String strTrim10 = HKIDCardResultActivity.this.f12500I.getText().toString().trim();
            if (HKIDCardResultActivity.this.m17956g2()) {
                if (TextUtils.isEmpty(strTrim) || TextUtils.isEmpty(strTrim2) || TextUtils.isEmpty(strTrim6)) {
                    HKIDCardResultActivity hKIDCardResultActivity = HKIDCardResultActivity.this;
                    hKIDCardResultActivity.mo17784y1(hKIDCardResultActivity.getResources().getString(R$string.f11975H0), "");
                    return;
                }
            } else if (TextUtils.isEmpty(strTrim2) || TextUtils.isEmpty(strTrim6)) {
                HKIDCardResultActivity hKIDCardResultActivity2 = HKIDCardResultActivity.this;
                hKIDCardResultActivity2.mo17784y1(hKIDCardResultActivity2.getResources().getString(R$string.f11975H0), "");
                return;
            }
            if (HKIDCardResultActivity.this.m17956g2() && !q250.m172433a("^[\\u4e00-\\u9fa5·]{2,20}$", strTrim)) {
                HKIDCardResultActivity.this.mo17784y1(HKIDCardResultActivity.this.getResources().getString(R$string.f12047w0) + HKIDCardResultActivity.this.getResources().getString(R$string.f11969E0), "");
                return;
            }
            if (!q250.m172433a("^[A-Za-z,'-·\\s]{2,50}$", strTrim2)) {
                HKIDCardResultActivity.this.mo17784y1(HKIDCardResultActivity.this.getResources().getString(R$string.f12029n0) + HKIDCardResultActivity.this.getResources().getString(R$string.f11969E0), "");
                return;
            }
            boolean zM172433a = q250.m172433a("^[A-Z]{1,2}[0-9]{6}\\([0-9A-Z]\\)$", strTrim6);
            HKIDCardResultActivity hKIDCardResultActivity3 = HKIDCardResultActivity.this;
            if (!zM172433a) {
                hKIDCardResultActivity3.mo17784y1(HKIDCardResultActivity.this.getResources().getString(R$string.f12039s0) + HKIDCardResultActivity.this.getResources().getString(R$string.f11969E0), "");
                return;
            }
            hKIDCardResultActivity3.f12501J.setEnabled(false);
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
            HKIDCardResultActivity.this.m17778q1(map);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.HKIDCardResultActivity$e */
    public class C3642e implements TextWatcher {
        public C3642e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            HKIDCardResultActivity.this.m17955e2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.HKIDCardResultActivity$f */
    public class C3643f implements TextWatcher {
        public C3643f() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            HKIDCardResultActivity.this.m17955e2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.HKIDCardResultActivity$g */
    public class C3644g implements TextWatcher {
        public C3644g() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            HKIDCardResultActivity.this.m17955e2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.HKIDCardResultActivity$h */
    public class C3645h implements TextWatcher {
        public C3645h() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            HKIDCardResultActivity.this.m17955e2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: d2 */
    private void m17954d2() {
        this.f12504z.addTextChangedListener(new C3642e());
        this.f12492A.addTextChangedListener(new C3643f());
        this.f12495D.addTextChangedListener(new C3644g());
        this.f12496E.addTextChangedListener(new C3645h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public void m17955e2() {
        boolean z;
        String string = this.f12504z.getText().toString();
        String string2 = this.f12492A.getText().toString();
        String string3 = this.f12495D.getText().toString();
        if (!m17956g2() || q250.m172433a("^[\\u4e00-\\u9fa5·]{2,20}$", string)) {
            this.f12504z.setBackgroundDrawable(getResources().getDrawable(q2c0.f152226j));
            z = true;
        } else {
            m17768W0(R$string.f12047w0);
            this.f12504z.setBackgroundDrawable(getResources().getDrawable(q2c0.f152227k));
            z = false;
        }
        if (q250.m172433a("^[A-Za-z,'-·\\s]{2,50}$", string2)) {
            this.f12492A.setBackgroundDrawable(getResources().getDrawable(q2c0.f152226j));
        } else {
            m17768W0(R$string.f12029n0);
            this.f12492A.setBackgroundDrawable(getResources().getDrawable(q2c0.f152227k));
            z = false;
        }
        if (q250.m172433a("^[A-Z]{1,2}[0-9]{6}\\([0-9A-Z]\\)$", string3)) {
            this.f12495D.setBackgroundDrawable(getResources().getDrawable(q2c0.f152226j));
        } else {
            m17768W0(R$string.f12039s0);
            this.f12495D.setBackgroundDrawable(getResources().getDrawable(q2c0.f152227k));
            z = false;
        }
        if (z) {
            m17762C1();
            this.f12501J.setEnabled(true);
            m17764H1();
            m17771f1(true);
            return;
        }
        this.f12501J.setEnabled(false);
        GradientDrawable gradientDrawable = (GradientDrawable) this.f12501J.getBackground();
        if (gradientDrawable != null) {
            gradientDrawable.setColor(getResources().getColor(r1c0.f157265e));
        }
        m17771f1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public boolean m17956g2() {
        return !TextUtils.isEmpty(this.f12496E.getText().toString());
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: G1 */
    public void mo17763G1() {
        setContentView(x5c0.f191117e);
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: Y0 */
    public void mo17769Y0() {
        kcm.m145452H().m145517V().ocrResult.ocrResult.name = this.f12504z.getText().toString().trim();
        kcm.m145452H().m145517V().ocrResult.ocrResult.englishName = this.f12492A.getText().toString().trim();
        kcm.m145452H().m145517V().ocrResult.ocrResult.nameCode = this.f12496E.getText().toString().trim();
        kcm.m145452H().m145517V().ocrResult.ocrResult.sex = this.f12493B.getText().toString().trim();
        kcm.m145452H().m145517V().ocrResult.ocrResult.birthDate = this.f12494C.getText().toString().trim();
        kcm.m145452H().m145517V().ocrResult.ocrResult.idNumber = this.f12495D.getText().toString().trim();
        kcm.m145452H().m145517V().ocrResult.ocrResult.currentIssueDate = this.f12497F.getText().toString().trim();
        kcm.m145452H().m145517V().ocrResult.ocrResult.firstIssueDate = this.f12498G.getText().toString().trim();
        kcm.m145452H().m145517V().ocrResult.ocrResult.isPermanent = this.f12499H.getText().toString().trim();
        kcm.m145452H().m145517V().ocrResult.ocrResult.symbols = this.f12500I.getText().toString();
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: d1 */
    public void mo17770d1() {
        this.f12504z.setEnabled(false);
        this.f12492A.setEnabled(false);
        this.f12493B.setEnabled(false);
        this.f12494C.setEnabled(false);
        this.f12495D.setEnabled(false);
        this.f12496E.setEnabled(false);
        this.f12497F.setEnabled(false);
        this.f12498G.setEnabled(false);
        this.f12499H.setEnabled(false);
        this.f12500I.setEnabled(false);
        this.f12501J.setEnabled(false);
        ScrollView scrollView = (ScrollView) findViewById(k4c0.f121060p);
        if (scrollView != null) {
            scrollView.setOnTouchListener(new ViewOnTouchListenerC3638a());
        }
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: h1 */
    public void mo17772h1() {
        this.f12504z.setEnabled(true);
        this.f12492A.setEnabled(true);
        this.f12493B.setEnabled(true);
        this.f12494C.setEnabled(true);
        this.f12495D.setEnabled(true);
        this.f12496E.setEnabled(true);
        this.f12497F.setEnabled(true);
        this.f12498G.setEnabled(true);
        this.f12499H.setEnabled(true);
        this.f12500I.setEnabled(true);
        this.f12501J.setEnabled(true);
        ScrollView scrollView = (ScrollView) findViewById(k4c0.f121060p);
        if (scrollView != null) {
            scrollView.setOnTouchListener(new ViewOnTouchListenerC3639b());
        }
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: o1 */
    public void mo17776o1() {
        EditText editText = (EditText) findViewById(k4c0.f120975D0);
        this.f12504z = editText;
        if (editText != null) {
            this.f12504z.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.name);
        }
        EditText editText2 = (EditText) findViewById(k4c0.f121048j0);
        this.f12492A = editText2;
        if (editText2 != null) {
            this.f12492A.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.englishName);
        }
        EditText editText3 = (EditText) findViewById(k4c0.f121075w0);
        this.f12493B = editText3;
        if (editText3 != null) {
            this.f12493B.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.sex);
        }
        EditText editText4 = (EditText) findViewById(k4c0.f120976E);
        this.f12494C = editText4;
        if (editText4 != null) {
            this.f12494C.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.birthDate);
        }
        EditText editText5 = (EditText) findViewById(k4c0.f120977E0);
        this.f12495D = editText5;
        if (editText5 != null) {
            this.f12495D.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.idNumber);
        }
        EditText editText6 = (EditText) findViewById(k4c0.f121051k0);
        this.f12496E = editText6;
        if (editText6 != null) {
            this.f12496E.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.nameCode);
        }
        EditText editText7 = (EditText) findViewById(k4c0.f120986J);
        this.f12497F = editText7;
        if (editText7 != null) {
            this.f12497F.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.currentIssueDate);
        }
        EditText editText8 = (EditText) findViewById(k4c0.f120994N);
        this.f12498G = editText8;
        if (editText8 != null) {
            this.f12498G.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.firstIssueDate);
        }
        EditText editText9 = (EditText) findViewById(k4c0.f121004S);
        this.f12499H = editText9;
        if (editText9 != null) {
            this.f12499H.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.isPermanent);
        }
        EditText editText10 = (EditText) findViewById(k4c0.f121081z0);
        this.f12500I = editText10;
        if (editText10 != null) {
            this.f12500I.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.symbols);
        }
        TextView textView = (TextView) findViewById(k4c0.f121034e1);
        this.f12502K = textView;
        if (textView != null) {
            textView.setOnClickListener(new ViewOnClickListenerC3640c());
        }
        Button button = (Button) findViewById(k4c0.f120973C0);
        this.f12501J = button;
        button.setOnClickListener(new ViewOnClickListenerC3641d());
        m17954d2();
        m17955e2();
    }
}
