package com.idv.identity.ocr.p044ui;

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
import p153l.afm;
import p153l.azb;
import p153l.dec0;
import p153l.f8g0;
import p153l.fb50;
import p153l.n8c;
import p153l.o6r0;
import p153l.rcc0;
import p153l.y9c0;
import p153l.yac0;
import p153l.z4d0;

/* JADX INFO: loaded from: classes7.dex */
public class MainlandIDCardResultActivity extends BaseIDCardResultActivity {

    /* JADX INFO: renamed from: A */
    private EditText f13324A;

    /* JADX INFO: renamed from: B */
    private EditText f13325B;

    /* JADX INFO: renamed from: C */
    private TextView f13326C;

    /* JADX INFO: renamed from: D */
    private EditText f13327D;

    /* JADX INFO: renamed from: E */
    private EditText f13328E;

    /* JADX INFO: renamed from: F */
    private EditText f13329F;

    /* JADX INFO: renamed from: G */
    private Button f13330G;

    /* JADX INFO: renamed from: H */
    private TextView f13331H;

    /* JADX INFO: renamed from: I */
    private TextView f13332I;

    /* JADX INFO: renamed from: J */
    private LinearLayout f13333J;

    /* JADX INFO: renamed from: K */
    private LinearLayout f13334K;

    /* JADX INFO: renamed from: L */
    private LinearLayout f13335L;

    /* JADX INFO: renamed from: M */
    private LinearLayout f13336M;

    /* JADX INFO: renamed from: N */
    private LinearLayout f13337N;

    /* JADX INFO: renamed from: O */
    private LinearLayout f13338O;

    /* JADX INFO: renamed from: P */
    private LinearLayout f13339P;

    /* JADX INFO: renamed from: Q */
    private CardPreviewWidget f13340Q;

    /* JADX INFO: renamed from: R */
    private CheckBox f13341R;

    /* JADX INFO: renamed from: S */
    private CheckBox f13342S;

    /* JADX INFO: renamed from: T */
    private boolean f13343T = false;

    /* JADX INFO: renamed from: z */
    private EditText f13344z;

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MainlandIDCardResultActivity$a */
    public class C3826a implements TextWatcher {
        public C3826a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            MainlandIDCardResultActivity.this.m19101l2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MainlandIDCardResultActivity$b */
    public class C3827b implements TextWatcher {
        public C3827b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            MainlandIDCardResultActivity.this.m19101l2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MainlandIDCardResultActivity$c */
    public class ViewOnTouchListenerC3828c implements View.OnTouchListener {
        public ViewOnTouchListenerC3828c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MainlandIDCardResultActivity$d */
    public class ViewOnTouchListenerC3829d implements View.OnTouchListener {
        public ViewOnTouchListenerC3829d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MainlandIDCardResultActivity$e */
    public class C3830e implements CompoundButton.OnCheckedChangeListener {
        public C3830e() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            MainlandIDCardResultActivity.this.f13341R.setChecked(!z);
            MainlandIDCardResultActivity.this.f13336M.setVisibility(8);
            MainlandIDCardResultActivity.this.f13343T = z;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MainlandIDCardResultActivity$f */
    public class C3831f implements CompoundButton.OnCheckedChangeListener {
        public C3831f() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            MainlandIDCardResultActivity.this.f13342S.setChecked(!z);
            MainlandIDCardResultActivity.this.f13336M.setVisibility(0);
            MainlandIDCardResultActivity.this.f13343T = !z;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MainlandIDCardResultActivity$g */
    public class ViewOnClickListenerC3832g implements View.OnClickListener {
        public ViewOnClickListenerC3832g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String strTrim = MainlandIDCardResultActivity.this.f13344z.getText().toString().trim();
            String strTrim2 = MainlandIDCardResultActivity.this.f13324A.getText().toString().trim();
            String strTrim3 = MainlandIDCardResultActivity.this.f13325B.getText().toString().trim();
            String strTrim4 = MainlandIDCardResultActivity.this.f13326C.getText().toString().trim();
            String strTrim5 = MainlandIDCardResultActivity.this.f13327D.getText().toString().trim();
            String strTrim6 = MainlandIDCardResultActivity.this.f13328E.getText().toString().trim();
            MainlandIDCardResultActivity.this.f13330G.setEnabled(false);
            if (afm.m97360H().m97489t() != null && afm.m97360H().m97442d("OCR_ID_BACK") && !MainlandIDCardResultActivity.this.f13343T) {
                CharSequence text = MainlandIDCardResultActivity.this.m19102o2().getText();
                CharSequence text2 = MainlandIDCardResultActivity.this.m19103p2().getText();
                if (text == null || text2 == null || TextUtils.isEmpty(text) || TextUtils.isEmpty(text2)) {
                    MainlandIDCardResultActivity.this.f13330G.setEnabled(true);
                    MainlandIDCardResultActivity mainlandIDCardResultActivity = MainlandIDCardResultActivity.this;
                    Toast.makeText(mainlandIDCardResultActivity, mainlandIDCardResultActivity.getString(R$string.f12782t0), 0).show();
                    return;
                } else {
                    if (!n8c.m161905h(n8c.m161906j(text2.toString().toString()), n8c.m161906j(text.toString().toString()))) {
                        MainlandIDCardResultActivity.this.f13330G.setEnabled(true);
                        MainlandIDCardResultActivity mainlandIDCardResultActivity2 = MainlandIDCardResultActivity.this;
                        Toast.makeText(mainlandIDCardResultActivity2, mainlandIDCardResultActivity2.getString(R$string.f12741Y), 0).show();
                        return;
                    }
                }
            }
            HashMap map = new HashMap();
            if (afm.m97360H().m97489t() != null && afm.m97360H().m97442d("OCR_ID_BACK")) {
                if (MainlandIDCardResultActivity.this.f13329F.getText() != null) {
                    map.put("originOfIssue", MainlandIDCardResultActivity.this.f13329F.getText().toString().trim());
                }
                if (MainlandIDCardResultActivity.this.m19103p2().getText() != null && !TextUtils.isEmpty(MainlandIDCardResultActivity.this.m19103p2().getText())) {
                    MainlandIDCardResultActivity mainlandIDCardResultActivity3 = MainlandIDCardResultActivity.this;
                    map.put("issueDate", mainlandIDCardResultActivity3.m19107q2(mainlandIDCardResultActivity3.m19103p2()).replace("-", ""));
                }
                if (MainlandIDCardResultActivity.this.f13343T) {
                    map.put("expiryDate", "长期");
                } else if (MainlandIDCardResultActivity.this.m19102o2().getText() != null && !TextUtils.isEmpty(MainlandIDCardResultActivity.this.m19102o2().getText())) {
                    MainlandIDCardResultActivity mainlandIDCardResultActivity4 = MainlandIDCardResultActivity.this;
                    map.put("expiryDate", mainlandIDCardResultActivity4.m19107q2(mainlandIDCardResultActivity4.m19102o2()).replace("-", ""));
                }
            }
            map.put(AuthenticationTokenClaims.JSON_KEY_NAME, strTrim);
            map.put("sex", strTrim2);
            map.put("ethnicity", strTrim3);
            map.put("birthDate", strTrim4);
            map.put("idNumber", strTrim5);
            map.put(PlaceTypes.ADDRESS, strTrim6);
            Log.e("MainlandIDCard", "params:----" + map.toString());
            MainlandIDCardResultActivity.this.m18856r1(map);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MainlandIDCardResultActivity$h */
    public class ViewOnClickListenerC3833h implements View.OnClickListener {
        public ViewOnClickListenerC3833h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainlandIDCardResultActivity mainlandIDCardResultActivity = MainlandIDCardResultActivity.this;
            mainlandIDCardResultActivity.m19108r2(true, mainlandIDCardResultActivity.f13326C.getText().toString(), MainlandIDCardResultActivity.this.f13326C);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MainlandIDCardResultActivity$i */
    public class ViewOnClickListenerC3834i implements View.OnClickListener {
        public ViewOnClickListenerC3834i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainlandIDCardResultActivity mainlandIDCardResultActivity = MainlandIDCardResultActivity.this;
            mainlandIDCardResultActivity.m19108r2(true, mainlandIDCardResultActivity.m19103p2().getText().toString(), MainlandIDCardResultActivity.this.m19103p2());
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MainlandIDCardResultActivity$j */
    public class ViewOnClickListenerC3835j implements View.OnClickListener {
        public ViewOnClickListenerC3835j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainlandIDCardResultActivity mainlandIDCardResultActivity = MainlandIDCardResultActivity.this;
            mainlandIDCardResultActivity.m19108r2(false, mainlandIDCardResultActivity.m19102o2().getText().toString(), MainlandIDCardResultActivity.this.m19102o2());
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.MainlandIDCardResultActivity$k */
    public class DialogInterfaceOnDismissListenerC3836k implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ TextView f13355a;

        public DialogInterfaceOnDismissListenerC3836k(TextView textView) {
            this.f13355a = textView;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            MainlandIDCardResultActivity.this.m19104s2(this.f13355a);
        }
    }

    /* JADX INFO: renamed from: k2 */
    private void m19100k2() {
        this.f13344z.addTextChangedListener(new C3826a());
        this.f13327D.addTextChangedListener(new C3827b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public void m19101l2() {
        boolean z;
        String string = this.f13344z.getText().toString();
        String string2 = this.f13327D.getText().toString();
        if (fb50.m124883a("^[\\u4e00-\\u9fa5·]{2,20}$", string)) {
            this.f13344z.setBackgroundDrawable(getResources().getDrawable(yac0.f198173j));
            z = true;
        } else {
            m18846X0(R$string.f12786v0);
            Drawable drawable = getResources().getDrawable(yac0.f198174k);
            if (drawable instanceof GradientDrawable) {
                ((GradientDrawable) drawable).setStroke(z4d0.m218573a(this, 1), azb.f74128d.getOcrResultInfoBorderColor(y9c0.f198082g));
            }
            this.f13344z.setBackgroundDrawable(drawable);
            z = false;
        }
        if (fb50.m124884b(string2)) {
            this.f13327D.setBackgroundDrawable(getResources().getDrawable(yac0.f198173j));
        } else {
            m18846X0(R$string.f12784u0);
            this.f13327D.setBackgroundDrawable(getResources().getDrawable(yac0.f198174k));
            z = false;
        }
        o6r0.m166282b("TAG", "isOK:" + z);
        if (z) {
            m18840E1();
            this.f13330G.setEnabled(true);
            m18842I1();
            m18849h1(true);
            return;
        }
        this.f13330G.setEnabled(false);
        m18849h1(false);
        GradientDrawable gradientDrawable = (GradientDrawable) this.f13330G.getBackground();
        if (gradientDrawable != null) {
            gradientDrawable.setColor(getResources().getColor(y9c0.f198080e));
        }
        m18849h1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public TextView m19102o2() {
        if (this.f13331H == null) {
            this.f13331H = (TextView) findViewById(rcc0.f162159g1);
        }
        return this.f13331H;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p2 */
    public TextView m19103p2() {
        if (this.f13332I == null) {
            this.f13332I = (TextView) findViewById(rcc0.f162162h1);
        }
        return this.f13332I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public void m19104s2(TextView textView) {
        n8c n8cVar = this.f13070w;
        if (n8cVar == null || textView == null || f8g0.m124534a(n8cVar.m161910e())) {
            return;
        }
        textView.setText(this.f13070w.m161910e());
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: H1 */
    public void mo18841H1() {
        setContentView(dec0.f88004h);
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: a1 */
    public void mo18847a1() {
        afm.m97360H().m97425V().ocrResult.ocrResult.name = this.f13344z.getText().toString().trim();
        afm.m97360H().m97425V().ocrResult.ocrResult.sex = this.f13324A.getText().toString().trim();
        afm.m97360H().m97425V().ocrResult.ocrResult.ethnicity = this.f13325B.getText().toString().trim();
        afm.m97360H().m97425V().ocrResult.ocrResult.birthDate = this.f13326C.getText().toString().trim();
        afm.m97360H().m97425V().ocrResult.ocrResult.idNumber = this.f13327D.getText().toString().trim();
        afm.m97360H().m97425V().ocrResult.ocrResult.address = this.f13328E.getText().toString().trim();
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: f1 */
    public void mo18848f1() {
        this.f13344z.setEnabled(false);
        this.f13324A.setEnabled(false);
        this.f13325B.setEnabled(false);
        this.f13326C.setEnabled(false);
        this.f13327D.setEnabled(false);
        this.f13328E.setEnabled(false);
        this.f13330G.setEnabled(false);
        m18849h1(false);
        View viewFindViewById = findViewById(rcc0.f162091C);
        if (viewFindViewById != null) {
            viewFindViewById.setEnabled(true);
        }
        ScrollView scrollView = (ScrollView) findViewById(rcc0.f162179p);
        if (scrollView != null) {
            scrollView.setOnTouchListener(new ViewOnTouchListenerC3828c());
        }
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: j1 */
    public void mo18850j1() {
        this.f13344z.setEnabled(true);
        this.f13324A.setEnabled(true);
        this.f13325B.setEnabled(true);
        this.f13326C.setEnabled(true);
        this.f13327D.setEnabled(true);
        this.f13328E.setEnabled(true);
        this.f13330G.setEnabled(true);
        m18849h1(true);
        ScrollView scrollView = (ScrollView) findViewById(rcc0.f162179p);
        if (scrollView != null) {
            scrollView.setOnTouchListener(new ViewOnTouchListenerC3829d());
        }
    }

    /* JADX INFO: renamed from: m2 */
    public String m19105m2(String str) {
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

    /* JADX INFO: renamed from: n2 */
    public n8c m19106n2(boolean z) {
        n8c n8cVar = new n8c(this, z);
        this.f13070w = n8cVar;
        return n8cVar;
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: p1 */
    public void mo18854p1() {
        if (afm.m97360H().m97425V() == null || afm.m97360H().m97425V().ocrResult == null || afm.m97360H().m97425V().ocrResult.ocrResult == null) {
            return;
        }
        this.f13338O = (LinearLayout) findViewById(rcc0.f162180p0);
        this.f13339P = (LinearLayout) findViewById(rcc0.f162125T);
        this.f13329F = (EditText) findViewById(rcc0.f162178o0);
        this.f13337N = (LinearLayout) findViewById(rcc0.f162136Y0);
        this.f13336M = (LinearLayout) findViewById(rcc0.f162132W0);
        Log.e("MainlandIDCARD", "getDocPageConfigs:" + afm.m97360H().m97489t());
        if (afm.m97360H().m97489t() == null || !afm.m97360H().m97442d("OCR_ID_BACK")) {
            Log.e("MainlandIDCARD", " fasle docPageConfigsContainsType");
            this.f13338O.setVisibility(8);
            this.f13339P.setVisibility(8);
            this.f13337N.setVisibility(8);
            this.f13336M.setVisibility(8);
        } else {
            Log.e("MainlandIDCARD", "docPageConfigsContainsType");
            this.f13338O.setVisibility(0);
            this.f13339P.setVisibility(0);
            this.f13337N.setVisibility(0);
            this.f13336M.setVisibility(0);
            if (this.f13329F != null) {
                this.f13329F.setText(afm.m97360H().m97425V().ocrResult.ocrResult.originOfIssue);
            }
            if (afm.m97360H().m97425V().ocrResult.ocrResult.issueDate != null && !TextUtils.isEmpty(afm.m97360H().m97425V().ocrResult.ocrResult.issueDate)) {
                m19103p2().setVisibility(0);
                m19103p2().setText(m19105m2(afm.m97360H().m97425V().ocrResult.ocrResult.issueDate));
            }
            if (afm.m97360H().m97425V().ocrResult.ocrResult.expiryDate != null && !TextUtils.isEmpty(afm.m97360H().m97425V().ocrResult.ocrResult.expiryDate)) {
                m19102o2().setText(m19105m2(afm.m97360H().m97425V().ocrResult.ocrResult.expiryDate));
            }
            this.f13341R = (CheckBox) findViewById(rcc0.f162148d);
            this.f13342S = (CheckBox) findViewById(rcc0.f162151e);
            if ("长期".equals(afm.m97360H().m97425V().ocrResult.ocrResult.expiryDate)) {
                this.f13343T = true;
                this.f13342S.setChecked(true);
                this.f13341R.setChecked(false);
                this.f13336M.setVisibility(8);
            } else {
                this.f13343T = false;
                this.f13342S.setChecked(false);
                this.f13341R.setChecked(true);
                this.f13336M.setVisibility(0);
            }
            this.f13342S.setOnCheckedChangeListener(new C3830e());
            this.f13341R.setOnCheckedChangeListener(new C3831f());
        }
        EditText editText = (EditText) findViewById(rcc0.f162155f0);
        this.f13344z = editText;
        if (editText != null) {
            this.f13344z.setText(afm.m97360H().m97425V().ocrResult.ocrResult.name);
        }
        EditText editText2 = (EditText) findViewById(rcc0.f162158g0);
        this.f13324A = editText2;
        if (editText2 != null) {
            this.f13324A.setText(afm.m97360H().m97425V().ocrResult.ocrResult.sex);
        }
        EditText editText3 = (EditText) findViewById(rcc0.f162149d0);
        this.f13325B = editText3;
        if (editText3 != null) {
            this.f13325B.setText(afm.m97360H().m97425V().ocrResult.ocrResult.ethnicity);
        }
        TextView textView = (TextView) findViewById(rcc0.f162146c0);
        this.f13326C = textView;
        if (textView != null) {
            this.f13326C.setText(afm.m97360H().m97425V().ocrResult.ocrResult.birthDate);
        }
        EditText editText4 = (EditText) findViewById(rcc0.f162152e0);
        this.f13327D = editText4;
        if (editText4 != null) {
            this.f13327D.setText(afm.m97360H().m97425V().ocrResult.ocrResult.idNumber);
        }
        EditText editText5 = (EditText) findViewById(rcc0.f162143b0);
        this.f13328E = editText5;
        if (editText5 != null) {
            this.f13328E.setText(afm.m97360H().m97425V().ocrResult.ocrResult.address);
        }
        Button button = (Button) findViewById(rcc0.f162092C0);
        this.f13330G = button;
        button.setOnClickListener(new ViewOnClickListenerC3832g());
        m19100k2();
        m19101l2();
        LinearLayout linearLayout = (LinearLayout) findViewById(rcc0.f162128U0);
        this.f13333J = linearLayout;
        linearLayout.setOnClickListener(new ViewOnClickListenerC3833h());
        LinearLayout linearLayout2 = (LinearLayout) findViewById(rcc0.f162134X0);
        this.f13334K = linearLayout2;
        linearLayout2.setOnClickListener(new ViewOnClickListenerC3834i());
        LinearLayout linearLayout3 = (LinearLayout) findViewById(rcc0.f162130V0);
        this.f13335L = linearLayout3;
        linearLayout3.setOnClickListener(new ViewOnClickListenerC3835j());
        ImageView imageView = (ImageView) findViewById(rcc0.f162175n);
        this.f13340Q = (CardPreviewWidget) findViewById(rcc0.f162139a);
        if (afm.m97360H().m97489t() == null || !afm.m97360H().m97489t().contains("OCR_ID_BACK")) {
            this.f13340Q.setVisibility(8);
            imageView.setVisibility(0);
        } else {
            this.f13340Q.setVisibility(0);
            imageView.setVisibility(8);
            this.f13340Q.m19125d(afm.m97360H().m97431Y(), afm.m97360H().m97423U());
        }
    }

    /* JADX INFO: renamed from: q2 */
    public String m19107q2(TextView textView) {
        return textView == null ? "" : textView.getText().toString().trim();
    }

    /* JADX INFO: renamed from: r2 */
    public void m19108r2(boolean z, String str, TextView textView) {
        n8c n8cVarM19106n2 = m19106n2(z);
        this.f13070w = n8cVarM19106n2;
        if (n8cVarM19106n2 != null) {
            n8cVarM19106n2.m161912i(str);
            this.f13070w.setOnDismissListener(new DialogInterfaceOnDismissListenerC3836k(textView));
            this.f13070w.show();
        }
    }
}
