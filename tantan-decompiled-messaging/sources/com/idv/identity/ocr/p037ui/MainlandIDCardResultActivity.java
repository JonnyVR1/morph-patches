package com.idv.identity.ocr.p037ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.idv.identity.base.R$string;
import com.idv.identity.ocr.widget.CardPreviewWidget;
import com.idv.identity.platform.log.RecordService;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import p149l.h7c;
import p149l.ixq0;
import p149l.k4c0;
import p149l.kcm;
import p149l.mxb;
import p149l.q250;
import p149l.q2c0;
import p149l.r1c0;
import p149l.vwc0;
import p149l.x5c0;
import p149l.yzf0;

/* JADX INFO: loaded from: classes7.dex */
public class MainlandIDCardResultActivity extends BaseIDCardResultActivity {

    /* JADX INFO: renamed from: A */
    private EditText f12583A;

    /* JADX INFO: renamed from: B */
    private EditText f12584B;

    /* JADX INFO: renamed from: C */
    private TextView f12585C;

    /* JADX INFO: renamed from: D */
    private EditText f12586D;

    /* JADX INFO: renamed from: E */
    private EditText f12587E;

    /* JADX INFO: renamed from: F */
    private EditText f12588F;

    /* JADX INFO: renamed from: G */
    private Button f12589G;

    /* JADX INFO: renamed from: H */
    private TextView f12590H;

    /* JADX INFO: renamed from: I */
    private TextView f12591I;

    /* JADX INFO: renamed from: J */
    private LinearLayout f12592J;

    /* JADX INFO: renamed from: K */
    private LinearLayout f12593K;

    /* JADX INFO: renamed from: L */
    private LinearLayout f12594L;

    /* JADX INFO: renamed from: M */
    private LinearLayout f12595M;

    /* JADX INFO: renamed from: N */
    private LinearLayout f12596N;

    /* JADX INFO: renamed from: O */
    private LinearLayout f12597O;

    /* JADX INFO: renamed from: P */
    private LinearLayout f12598P;

    /* JADX INFO: renamed from: Q */
    private CardPreviewWidget f12599Q;

    /* JADX INFO: renamed from: R */
    private CheckBox f12600R;

    /* JADX INFO: renamed from: S */
    private CheckBox f12601S;

    /* JADX INFO: renamed from: T */
    private boolean f12602T = false;

    /* JADX INFO: renamed from: z */
    private EditText f12603z;

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MainlandIDCardResultActivity$a */
    public class C3667a implements TextWatcher {
        public C3667a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            MainlandIDCardResultActivity.this.m18024k2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MainlandIDCardResultActivity$b */
    public class C3668b implements TextWatcher {
        public C3668b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            MainlandIDCardResultActivity.this.m18024k2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MainlandIDCardResultActivity$c */
    public class ViewOnTouchListenerC3669c implements View.OnTouchListener {
        public ViewOnTouchListenerC3669c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MainlandIDCardResultActivity$d */
    public class ViewOnTouchListenerC3670d implements View.OnTouchListener {
        public ViewOnTouchListenerC3670d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MainlandIDCardResultActivity$e */
    public class C3671e implements CompoundButton.OnCheckedChangeListener {
        public C3671e() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            MainlandIDCardResultActivity.this.f12600R.setChecked(!z);
            MainlandIDCardResultActivity.this.f12595M.setVisibility(8);
            MainlandIDCardResultActivity.this.f12602T = z;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MainlandIDCardResultActivity$f */
    public class C3672f implements CompoundButton.OnCheckedChangeListener {
        public C3672f() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            MainlandIDCardResultActivity.this.f12601S.setChecked(!z);
            MainlandIDCardResultActivity.this.f12595M.setVisibility(0);
            MainlandIDCardResultActivity.this.f12602T = !z;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MainlandIDCardResultActivity$g */
    public class ViewOnClickListenerC3673g implements View.OnClickListener {
        public ViewOnClickListenerC3673g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String strTrim = MainlandIDCardResultActivity.this.f12603z.getText().toString().trim();
            String strTrim2 = MainlandIDCardResultActivity.this.f12583A.getText().toString().trim();
            String strTrim3 = MainlandIDCardResultActivity.this.f12584B.getText().toString().trim();
            String strTrim4 = MainlandIDCardResultActivity.this.f12585C.getText().toString().trim();
            String strTrim5 = MainlandIDCardResultActivity.this.f12586D.getText().toString().trim();
            String strTrim6 = MainlandIDCardResultActivity.this.f12587E.getText().toString().trim();
            MainlandIDCardResultActivity.this.f12589G.setEnabled(false);
            if (kcm.m145452H().m145581t() != null && kcm.m145452H().m145534d("OCR_ID_BACK") && !MainlandIDCardResultActivity.this.f12602T) {
                CharSequence text = MainlandIDCardResultActivity.this.m18025n2().getText();
                CharSequence text2 = MainlandIDCardResultActivity.this.m18026o2().getText();
                if (text == null || text2 == null || TextUtils.isEmpty(text) || TextUtils.isEmpty(text2)) {
                    MainlandIDCardResultActivity.this.f12589G.setEnabled(true);
                    MainlandIDCardResultActivity mainlandIDCardResultActivity = MainlandIDCardResultActivity.this;
                    Toast.makeText(mainlandIDCardResultActivity, mainlandIDCardResultActivity.getString(R$string.f12041t0), 0).show();
                    return;
                } else {
                    if (!h7c.m129626h(h7c.m129627j(text2.toString().toString()), h7c.m129627j(text.toString().toString()))) {
                        MainlandIDCardResultActivity.this.f12589G.setEnabled(true);
                        MainlandIDCardResultActivity mainlandIDCardResultActivity2 = MainlandIDCardResultActivity.this;
                        Toast.makeText(mainlandIDCardResultActivity2, mainlandIDCardResultActivity2.getString(R$string.f12000Y), 0).show();
                        return;
                    }
                }
            }
            HashMap map = new HashMap();
            if (kcm.m145452H().m145581t() != null && kcm.m145452H().m145534d("OCR_ID_BACK")) {
                if (MainlandIDCardResultActivity.this.f12588F.getText() != null) {
                    map.put("originOfIssue", MainlandIDCardResultActivity.this.f12588F.getText().toString().trim());
                }
                if (MainlandIDCardResultActivity.this.m18026o2().getText() != null && !TextUtils.isEmpty(MainlandIDCardResultActivity.this.m18026o2().getText())) {
                    MainlandIDCardResultActivity mainlandIDCardResultActivity3 = MainlandIDCardResultActivity.this;
                    map.put("issueDate", mainlandIDCardResultActivity3.m18030p2(mainlandIDCardResultActivity3.m18026o2()).replace("-", ""));
                }
                if (MainlandIDCardResultActivity.this.f12602T) {
                    map.put("expiryDate", "长期");
                } else if (MainlandIDCardResultActivity.this.m18025n2().getText() != null && !TextUtils.isEmpty(MainlandIDCardResultActivity.this.m18025n2().getText())) {
                    MainlandIDCardResultActivity mainlandIDCardResultActivity4 = MainlandIDCardResultActivity.this;
                    map.put("expiryDate", mainlandIDCardResultActivity4.m18030p2(mainlandIDCardResultActivity4.m18025n2()).replace("-", ""));
                }
            }
            map.put(AuthenticationTokenClaims.JSON_KEY_NAME, strTrim);
            map.put("sex", strTrim2);
            map.put("ethnicity", strTrim3);
            map.put("birthDate", strTrim4);
            map.put("idNumber", strTrim5);
            map.put(PlaceTypes.ADDRESS, strTrim6);
            Log.e("MainlandIDCard", "params:----" + map.toString());
            MainlandIDCardResultActivity.this.m17778q1(map);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MainlandIDCardResultActivity$h */
    public class ViewOnClickListenerC3674h implements View.OnClickListener {
        public ViewOnClickListenerC3674h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainlandIDCardResultActivity mainlandIDCardResultActivity = MainlandIDCardResultActivity.this;
            mainlandIDCardResultActivity.m18031q2(true, mainlandIDCardResultActivity.f12585C.getText().toString(), MainlandIDCardResultActivity.this.f12585C);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MainlandIDCardResultActivity$i */
    public class ViewOnClickListenerC3675i implements View.OnClickListener {
        public ViewOnClickListenerC3675i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainlandIDCardResultActivity mainlandIDCardResultActivity = MainlandIDCardResultActivity.this;
            mainlandIDCardResultActivity.m18031q2(true, mainlandIDCardResultActivity.m18026o2().getText().toString(), MainlandIDCardResultActivity.this.m18026o2());
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MainlandIDCardResultActivity$j */
    public class ViewOnClickListenerC3676j implements View.OnClickListener {
        public ViewOnClickListenerC3676j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainlandIDCardResultActivity mainlandIDCardResultActivity = MainlandIDCardResultActivity.this;
            mainlandIDCardResultActivity.m18031q2(false, mainlandIDCardResultActivity.m18025n2().getText().toString(), MainlandIDCardResultActivity.this.m18025n2());
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MainlandIDCardResultActivity$k */
    public class DialogInterfaceOnDismissListenerC3677k implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ TextView f12614a;

        public DialogInterfaceOnDismissListenerC3677k(TextView textView) {
            this.f12614a = textView;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            MainlandIDCardResultActivity.this.m18027r2(this.f12614a);
        }
    }

    /* JADX INFO: renamed from: i2 */
    private void m18023i2() {
        this.f12603z.addTextChangedListener(new C3667a());
        this.f12586D.addTextChangedListener(new C3668b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public void m18024k2() {
        boolean z;
        String string = this.f12603z.getText().toString();
        String string2 = this.f12586D.getText().toString();
        if (q250.m172433a("^[\\u4e00-\\u9fa5·]{2,20}$", string)) {
            this.f12603z.setBackgroundDrawable(getResources().getDrawable(q2c0.f152226j));
            z = true;
        } else {
            m17768W0(R$string.f12045v0);
            Drawable drawable = getResources().getDrawable(q2c0.f152227k);
            if (drawable instanceof GradientDrawable) {
                ((GradientDrawable) drawable).setStroke(vwc0.m200355a(this, 1), mxb.f136154d.getOcrResultInfoBorderColor(r1c0.f157267g));
            }
            this.f12603z.setBackgroundDrawable(drawable);
            z = false;
        }
        if (q250.m172434b(string2)) {
            this.f12586D.setBackgroundDrawable(getResources().getDrawable(q2c0.f152226j));
        } else {
            m17768W0(R$string.f12043u0);
            this.f12586D.setBackgroundDrawable(getResources().getDrawable(q2c0.f152227k));
            z = false;
        }
        ixq0.m138885b("TAG", "isOK:" + z);
        if (z) {
            m17762C1();
            this.f12589G.setEnabled(true);
            m17764H1();
            m17771f1(true);
            return;
        }
        this.f12589G.setEnabled(false);
        m17771f1(false);
        GradientDrawable gradientDrawable = (GradientDrawable) this.f12589G.getBackground();
        if (gradientDrawable != null) {
            gradientDrawable.setColor(getResources().getColor(r1c0.f157265e));
        }
        m17771f1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n2 */
    public TextView m18025n2() {
        if (this.f12590H == null) {
            this.f12590H = (TextView) findViewById(k4c0.f121040g1);
        }
        return this.f12590H;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public TextView m18026o2() {
        if (this.f12591I == null) {
            this.f12591I = (TextView) findViewById(k4c0.f121043h1);
        }
        return this.f12591I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r2 */
    public void m18027r2(TextView textView) {
        h7c h7cVar = this.f12329w;
        if (h7cVar == null || textView == null || yzf0.m216680a(h7cVar.m129631e())) {
            return;
        }
        textView.setText(this.f12329w.m129631e());
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: G1 */
    public void mo17763G1() {
        setContentView(x5c0.f191120h);
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: Y0 */
    public void mo17769Y0() {
        kcm.m145452H().m145517V().ocrResult.ocrResult.name = this.f12603z.getText().toString().trim();
        kcm.m145452H().m145517V().ocrResult.ocrResult.sex = this.f12583A.getText().toString().trim();
        kcm.m145452H().m145517V().ocrResult.ocrResult.ethnicity = this.f12584B.getText().toString().trim();
        kcm.m145452H().m145517V().ocrResult.ocrResult.birthDate = this.f12585C.getText().toString().trim();
        kcm.m145452H().m145517V().ocrResult.ocrResult.idNumber = this.f12586D.getText().toString().trim();
        kcm.m145452H().m145517V().ocrResult.ocrResult.address = this.f12587E.getText().toString().trim();
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: d1 */
    public void mo17770d1() {
        this.f12603z.setEnabled(false);
        this.f12583A.setEnabled(false);
        this.f12584B.setEnabled(false);
        this.f12585C.setEnabled(false);
        this.f12586D.setEnabled(false);
        this.f12587E.setEnabled(false);
        this.f12589G.setEnabled(false);
        m17771f1(false);
        View viewFindViewById = findViewById(k4c0.f120972C);
        if (viewFindViewById != null) {
            viewFindViewById.setEnabled(true);
        }
        ScrollView scrollView = (ScrollView) findViewById(k4c0.f121060p);
        if (scrollView != null) {
            scrollView.setOnTouchListener(new ViewOnTouchListenerC3669c());
        }
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: h1 */
    public void mo17772h1() {
        this.f12603z.setEnabled(true);
        this.f12583A.setEnabled(true);
        this.f12584B.setEnabled(true);
        this.f12585C.setEnabled(true);
        this.f12586D.setEnabled(true);
        this.f12587E.setEnabled(true);
        this.f12589G.setEnabled(true);
        m17771f1(true);
        ScrollView scrollView = (ScrollView) findViewById(k4c0.f121060p);
        if (scrollView != null) {
            scrollView.setOnTouchListener(new ViewOnTouchListenerC3670d());
        }
    }

    /* JADX INFO: renamed from: l2 */
    public String m18028l2(String str) {
        if (str == null) {
            return "";
        }
        try {
            Locale.getDefault();
            Locale locale = Locale.ENGLISH;
            return new SimpleDateFormat("yyyy-MM-dd", locale).format(new SimpleDateFormat("yyyyMMdd", locale).parse(str));
        } catch (Exception e) {
            RecordService.getInstance().recordException(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: m2 */
    public h7c m18029m2(boolean z) {
        h7c h7cVar = new h7c(this, z);
        this.f12329w = h7cVar;
        return h7cVar;
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: o1 */
    public void mo17776o1() {
        if (kcm.m145452H().m145517V() == null || kcm.m145452H().m145517V().ocrResult == null || kcm.m145452H().m145517V().ocrResult.ocrResult == null) {
            return;
        }
        this.f12597O = (LinearLayout) findViewById(k4c0.f121061p0);
        this.f12598P = (LinearLayout) findViewById(k4c0.f121006T);
        this.f12588F = (EditText) findViewById(k4c0.f121059o0);
        this.f12596N = (LinearLayout) findViewById(k4c0.f121017Y0);
        this.f12595M = (LinearLayout) findViewById(k4c0.f121013W0);
        Log.e("MainlandIDCARD", "getDocPageConfigs:" + kcm.m145452H().m145581t());
        if (kcm.m145452H().m145581t() == null || !kcm.m145452H().m145534d("OCR_ID_BACK")) {
            Log.e("MainlandIDCARD", " fasle docPageConfigsContainsType");
            this.f12597O.setVisibility(8);
            this.f12598P.setVisibility(8);
            this.f12596N.setVisibility(8);
            this.f12595M.setVisibility(8);
        } else {
            Log.e("MainlandIDCARD", "docPageConfigsContainsType");
            this.f12597O.setVisibility(0);
            this.f12598P.setVisibility(0);
            this.f12596N.setVisibility(0);
            this.f12595M.setVisibility(0);
            if (this.f12588F != null) {
                this.f12588F.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.originOfIssue);
            }
            if (kcm.m145452H().m145517V().ocrResult.ocrResult.issueDate != null && !TextUtils.isEmpty(kcm.m145452H().m145517V().ocrResult.ocrResult.issueDate)) {
                m18026o2().setVisibility(0);
                m18026o2().setText(m18028l2(kcm.m145452H().m145517V().ocrResult.ocrResult.issueDate));
            }
            if (kcm.m145452H().m145517V().ocrResult.ocrResult.expiryDate != null && !TextUtils.isEmpty(kcm.m145452H().m145517V().ocrResult.ocrResult.expiryDate)) {
                m18025n2().setText(m18028l2(kcm.m145452H().m145517V().ocrResult.ocrResult.expiryDate));
            }
            this.f12600R = (CheckBox) findViewById(k4c0.f121029d);
            this.f12601S = (CheckBox) findViewById(k4c0.f121032e);
            if ("长期".equals(kcm.m145452H().m145517V().ocrResult.ocrResult.expiryDate)) {
                this.f12602T = true;
                this.f12601S.setChecked(true);
                this.f12600R.setChecked(false);
                this.f12595M.setVisibility(8);
            } else {
                this.f12602T = false;
                this.f12601S.setChecked(false);
                this.f12600R.setChecked(true);
                this.f12595M.setVisibility(0);
            }
            this.f12601S.setOnCheckedChangeListener(new C3671e());
            this.f12600R.setOnCheckedChangeListener(new C3672f());
        }
        EditText editText = (EditText) findViewById(k4c0.f121036f0);
        this.f12603z = editText;
        if (editText != null) {
            this.f12603z.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.name);
        }
        EditText editText2 = (EditText) findViewById(k4c0.f121039g0);
        this.f12583A = editText2;
        if (editText2 != null) {
            this.f12583A.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.sex);
        }
        EditText editText3 = (EditText) findViewById(k4c0.f121030d0);
        this.f12584B = editText3;
        if (editText3 != null) {
            this.f12584B.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.ethnicity);
        }
        TextView textView = (TextView) findViewById(k4c0.f121027c0);
        this.f12585C = textView;
        if (textView != null) {
            this.f12585C.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.birthDate);
        }
        EditText editText4 = (EditText) findViewById(k4c0.f121033e0);
        this.f12586D = editText4;
        if (editText4 != null) {
            this.f12586D.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.idNumber);
        }
        EditText editText5 = (EditText) findViewById(k4c0.f121024b0);
        this.f12587E = editText5;
        if (editText5 != null) {
            this.f12587E.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.address);
        }
        Button button = (Button) findViewById(k4c0.f120973C0);
        this.f12589G = button;
        button.setOnClickListener(new ViewOnClickListenerC3673g());
        m18023i2();
        m18024k2();
        LinearLayout linearLayout = (LinearLayout) findViewById(k4c0.f121009U0);
        this.f12592J = linearLayout;
        linearLayout.setOnClickListener(new ViewOnClickListenerC3674h());
        LinearLayout linearLayout2 = (LinearLayout) findViewById(k4c0.f121015X0);
        this.f12593K = linearLayout2;
        linearLayout2.setOnClickListener(new ViewOnClickListenerC3675i());
        LinearLayout linearLayout3 = (LinearLayout) findViewById(k4c0.f121011V0);
        this.f12594L = linearLayout3;
        linearLayout3.setOnClickListener(new ViewOnClickListenerC3676j());
        ImageView imageView = (ImageView) findViewById(k4c0.f121056n);
        this.f12599Q = (CardPreviewWidget) findViewById(k4c0.f121020a);
        if (kcm.m145452H().m145581t() == null || !kcm.m145452H().m145581t().contains("OCR_ID_BACK")) {
            this.f12599Q.setVisibility(8);
            imageView.setVisibility(0);
        } else {
            this.f12599Q.setVisibility(0);
            imageView.setVisibility(8);
            this.f12599Q.m18048d(kcm.m145452H().m145523Y(), kcm.m145452H().m145515U());
        }
    }

    /* JADX INFO: renamed from: p2 */
    public String m18030p2(TextView textView) {
        return textView == null ? "" : textView.getText().toString().trim();
    }

    /* JADX INFO: renamed from: q2 */
    public void m18031q2(boolean z, String str, TextView textView) {
        h7c h7cVarM18029m2 = m18029m2(z);
        this.f12329w = h7cVarM18029m2;
        if (h7cVarM18029m2 != null) {
            h7cVarM18029m2.m129633i(str);
            this.f12329w.setOnDismissListener(new DialogInterfaceOnDismissListenerC3677k(textView));
            this.f12329w.show();
        }
    }
}
