package com.idv.identity.ocr.p037ui;

import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import androidx.core.app.NotificationCompat;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.idv.identity.base.R$string;
import com.idv.identity.platform.config.OSSConfig;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import com.idv.identity.platform.model.NfcConfigRes;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.HashMap;
import java.util.Map;
import p149l.d300;
import p149l.jwb;
import p149l.k4c0;
import p149l.kcm;
import p149l.khi;
import p149l.mcm;
import p149l.pcm;
import p149l.q250;
import p149l.q2c0;
import p149l.r1c0;
import p149l.x5c0;

/* JADX INFO: loaded from: classes7.dex */
public class GlobalPassportIDCardResultActivity extends BaseIDCardResultActivity {

    /* JADX INFO: renamed from: A */
    private EditText f12451A;

    /* JADX INFO: renamed from: B */
    private EditText f12452B;

    /* JADX INFO: renamed from: C */
    private EditText f12453C;

    /* JADX INFO: renamed from: D */
    private EditText f12454D;

    /* JADX INFO: renamed from: E */
    private EditText f12455E;

    /* JADX INFO: renamed from: F */
    private EditText f12456F;

    /* JADX INFO: renamed from: G */
    private EditText f12457G;

    /* JADX INFO: renamed from: H */
    private Button f12458H;

    /* JADX INFO: renamed from: I */
    private jwb f12459I;

    /* JADX INFO: renamed from: z */
    private EditText f12460z;

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.GlobalPassportIDCardResultActivity$a */
    public class RunnableC3623a implements Runnable {

        /* JADX INFO: renamed from: com.idv.identity.ocr.ui.GlobalPassportIDCardResultActivity$a$a */
        public class a implements View.OnTouchListener {
            public a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public RunnableC3623a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GlobalPassportIDCardResultActivity.this.m17923a2();
            GlobalPassportIDCardResultActivity.this.f12458H.setEnabled(false);
            ScrollView scrollView = (ScrollView) GlobalPassportIDCardResultActivity.this.findViewById(k4c0.f121060p);
            if (scrollView != null) {
                scrollView.setOnTouchListener(new a());
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.GlobalPassportIDCardResultActivity$b */
    public class ViewOnTouchListenerC3624b implements View.OnTouchListener {
        public ViewOnTouchListenerC3624b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.GlobalPassportIDCardResultActivity$c */
    public class ViewOnClickListenerC3625c implements View.OnClickListener {
        public ViewOnClickListenerC3625c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Throwable {
            String string = GlobalPassportIDCardResultActivity.this.f12460z.getText().toString();
            String string2 = GlobalPassportIDCardResultActivity.this.f12451A.getText().toString();
            String string3 = GlobalPassportIDCardResultActivity.this.f12452B.getText().toString();
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                GlobalPassportIDCardResultActivity globalPassportIDCardResultActivity = GlobalPassportIDCardResultActivity.this;
                globalPassportIDCardResultActivity.mo17784y1(globalPassportIDCardResultActivity.getResources().getString(R$string.f11975H0), "");
                return;
            }
            if (!q250.m172433a("^[A-Za-z]{1,50}$", string)) {
                GlobalPassportIDCardResultActivity.this.mo17784y1(GlobalPassportIDCardResultActivity.this.getResources().getString(R$string.f12053z0) + GlobalPassportIDCardResultActivity.this.getResources().getString(R$string.f11969E0), "");
                return;
            }
            if (!q250.m172433a("^[A-Za-z\\s]{1,50}$", string2)) {
                GlobalPassportIDCardResultActivity.this.mo17784y1(GlobalPassportIDCardResultActivity.this.getResources().getString(R$string.f12051y0) + GlobalPassportIDCardResultActivity.this.getResources().getString(R$string.f11969E0), "");
                return;
            }
            if (!q250.m172433a("^[A-Za-z0-9]{8,9}$", string3)) {
                GlobalPassportIDCardResultActivity.this.mo17784y1(GlobalPassportIDCardResultActivity.this.getResources().getString(R$string.f12049x0) + GlobalPassportIDCardResultActivity.this.getResources().getString(R$string.f11969E0), "");
                return;
            }
            String strM145550i0 = kcm.m145452H().m145550i0();
            NfcConfigRes nfcConfigResM145488L = kcm.m145452H().m145488L();
            boolean zHasSystemFeature = GlobalPassportIDCardResultActivity.this.getPackageManager().hasSystemFeature("android.hardware.nfc");
            if (mcm.f133148a.equals(GlobalPassportIDCardResultActivity.this.f12322p) && (pcm.f148194g.equals(strM145550i0) || (pcm.f148192e.equals(strM145550i0) && zHasSystemFeature && nfcConfigResM145488L != null))) {
                GlobalPassportIDCardResultActivity.this.m17925d2();
            } else {
                GlobalPassportIDCardResultActivity.this.m17926c2();
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.GlobalPassportIDCardResultActivity$d */
    public class C3626d implements khi.InterfaceC18016d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f12465a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ byte[] f12466b;

        /* JADX INFO: renamed from: com.idv.identity.ocr.ui.GlobalPassportIDCardResultActivity$d$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f12468a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ int f12469b;

            public a(int i, int i2) {
                this.f12468a = i;
                this.f12469b = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Map<String, String> mapM17924b2 = GlobalPassportIDCardResultActivity.this.m17924b2();
                int i = this.f12468a;
                int i2 = this.f12469b;
                C3626d c3626d = C3626d.this;
                if (i == i2) {
                    GlobalPassportIDCardResultActivity.this.m17779r1(mapM17924b2, true, c3626d.f12466b);
                } else {
                    GlobalPassportIDCardResultActivity.this.m17779r1(mapM17924b2, false, c3626d.f12466b);
                }
            }
        }

        public C3626d(long j, byte[] bArr) {
            this.f12465a = j;
            this.f12466b = bArr;
        }

        @Override // p149l.khi.InterfaceC18016d
        /* JADX INFO: renamed from: a */
        public boolean mo17695a(int i, String str, String str2, String str3) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "nfcOssUploadRes", NotificationCompat.CATEGORY_STATUS, "error", "idx", String.valueOf(i), "bucketName", str, "fileName", str2, "errMsg", str3);
            return false;
        }

        @Override // p149l.khi.InterfaceC18016d
        /* JADX INFO: renamed from: b */
        public boolean mo17696b(int i, String str, String str2) {
            kcm.m145452H().m145563m1(str2);
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "nfcOssUploadRes", NotificationCompat.CATEGORY_STATUS, "success", "idx", String.valueOf(i), "bucketName", str, "fileName", str2);
            return false;
        }

        @Override // p149l.khi.InterfaceC18016d
        /* JADX INFO: renamed from: c */
        public void mo17697c(int i, int i2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "cardOssUploadCost", NotificationCompat.CATEGORY_STATUS, "finish", "uploadCnt", String.valueOf(i), "successCnt", String.valueOf(i2), "timeCost", String.valueOf((System.currentTimeMillis() - this.f12465a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f44446s);
            GlobalPassportIDCardResultActivity.this.runOnUiThread(new a(i, i2));
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.GlobalPassportIDCardResultActivity$e */
    public class RunnableC3627e implements Runnable {
        public RunnableC3627e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GlobalPassportIDCardResultActivity.this.f12458H.setEnabled(false);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.GlobalPassportIDCardResultActivity$f */
    public class C3628f implements BaseIDCardResultActivity.InterfaceC3598o {
        public C3628f() {
        }

        @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity.InterfaceC3598o
        /* JADX INFO: renamed from: a */
        public void mo17786a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "onMessageOcrResultNetError", NotificationCompat.CATEGORY_STATUS, "retry_onOK");
            GlobalPassportIDCardResultActivity.this.f12458H.setEnabled(true);
            GlobalPassportIDCardResultActivity.this.mo17772h1();
        }

        @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity.InterfaceC3598o
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.GlobalPassportIDCardResultActivity$g */
    public class C3629g implements TextWatcher {
        public C3629g() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            GlobalPassportIDCardResultActivity.this.m17922Z1();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.GlobalPassportIDCardResultActivity$h */
    public class C3630h implements TextWatcher {
        public C3630h() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            GlobalPassportIDCardResultActivity.this.m17922Z1();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.GlobalPassportIDCardResultActivity$i */
    public class C3631i implements TextWatcher {
        public C3631i() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            GlobalPassportIDCardResultActivity.this.m17922Z1();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: Y1 */
    private void m17921Y1() {
        this.f12460z.addTextChangedListener(new C3629g());
        this.f12451A.addTextChangedListener(new C3630h());
        this.f12452B.addTextChangedListener(new C3631i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public void m17922Z1() {
        boolean z;
        String string = this.f12460z.getText().toString();
        String string2 = this.f12451A.getText().toString();
        String string3 = this.f12452B.getText().toString();
        if (q250.m172433a("^[A-Za-z]{1,50}$", string)) {
            this.f12460z.setBackgroundDrawable(getResources().getDrawable(q2c0.f152226j));
            z = true;
        } else {
            m17768W0(R$string.f12053z0);
            this.f12460z.setBackgroundDrawable(getResources().getDrawable(q2c0.f152227k));
            z = false;
        }
        if (q250.m172433a("^[A-Za-z\\s]{1,50}$", string2)) {
            this.f12451A.setBackgroundDrawable(getResources().getDrawable(q2c0.f152226j));
        } else {
            m17768W0(R$string.f12051y0);
            this.f12451A.setBackgroundDrawable(getResources().getDrawable(q2c0.f152227k));
            z = false;
        }
        if (q250.m172433a("^[A-Za-z0-9]{8,9}$", string3)) {
            this.f12452B.setBackgroundDrawable(getResources().getDrawable(q2c0.f152226j));
        } else {
            m17768W0(R$string.f12049x0);
            this.f12452B.setBackgroundDrawable(getResources().getDrawable(q2c0.f152227k));
            z = false;
        }
        if (z) {
            m17762C1();
            this.f12458H.setEnabled(true);
            m17764H1();
            m17771f1(true);
            return;
        }
        this.f12458H.setEnabled(false);
        GradientDrawable gradientDrawable = (GradientDrawable) this.f12458H.getBackground();
        if (gradientDrawable != null) {
            gradientDrawable.setColor(getResources().getColor(r1c0.f157265e));
        }
        m17771f1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public void m17923a2() {
        this.f12460z.setEnabled(false);
        this.f12451A.setEnabled(false);
        this.f12452B.setEnabled(false);
        this.f12453C.setEnabled(false);
        this.f12454D.setEnabled(false);
        this.f12455E.setEnabled(false);
        this.f12456F.setEnabled(false);
        this.f12457G.setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public Map<String, String> m17924b2() {
        String string = this.f12460z.getText().toString();
        String string2 = this.f12451A.getText().toString();
        String string3 = this.f12452B.getText().toString();
        String string4 = this.f12453C.getText().toString();
        String string5 = this.f12454D.getText().toString();
        String string6 = this.f12455E.getText().toString();
        String string7 = this.f12456F.getText().toString();
        String string8 = this.f12457G.getText().toString();
        runOnUiThread(new RunnableC3627e());
        HashMap map = new HashMap();
        map.put("surname", string);
        map.put("givenname", string2);
        map.put("passportNo", string3);
        map.put("nationality", string4);
        map.put("sex", string5);
        map.put("birthDate", string6);
        map.put(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, string7);
        map.put("expiryDate", string8);
        String strM145491M = kcm.m145452H().m145491M();
        String strM145550i0 = kcm.m145452H().m145550i0();
        NfcConfigRes nfcConfigResM145488L = kcm.m145452H().m145488L();
        if ((mcm.f133148a.equals(this.f12322p) && pcm.f148194g.equals(strM145550i0) && strM145491M != null) || (pcm.f148192e.equals(strM145550i0) && nfcConfigResM145488L != null)) {
            map.put("nfcFileName", strM145491M);
        }
        jwb jwbVar = this.f12459I;
        if (jwbVar != null && jwbVar.m143655c()) {
            map.put("encryptKey", d300.m109837a(this.f12459I.m143654b()));
            map.put("encryptVersion", "NATIVE_E1");
        }
        if (pcm.f148192e.equals(strM145550i0) && nfcConfigResM145488L != null) {
            map.put("useNFC", getPackageManager().hasSystemFeature("android.hardware.nfc") ? "Y" : "N");
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public void m17925d2() throws Throwable {
        this.f12323q.setVisibility(0);
        OSSConfig oSSConfigM145535d0 = kcm.m145452H().m145535d0();
        if (oSSConfigM145535d0 == null || oSSConfigM145535d0.FileNamePrefix == null || oSSConfigM145535d0.OssEndPoint == null || oSSConfigM145535d0.AccessKeyId == null || oSSConfigM145535d0.AccessKeySecret == null) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "submitPhoto", NotificationCompat.CATEGORY_STATUS, "error", "errMsg", "ossConfig is null.");
            return;
        }
        khi.m145962d().m145966f();
        Bitmap bitmapM145523Y = kcm.m145452H().m145523Y();
        byte[] bArrM109838b = d300.m109838b(bitmapM145523Y);
        jwb jwbVar = this.f12459I;
        if (jwbVar != null && jwbVar.m143655c() && bArrM109838b != null) {
            bArrM109838b = this.f12459I.m143653a(bArrM109838b);
        }
        byte[] bArr = bArrM109838b;
        if (bArr == null) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "uploadNfcFileImage", NotificationCompat.CATEGORY_STATUS, "error", "errMsg", "nfcPictureContent is null.");
            return;
        }
        String strM109840d = d300.m109840d(oSSConfigM145535d0.FileNamePrefix, "nfccard", "jpeg");
        khi.m145962d().m145963b(10, oSSConfigM145535d0.BucketName, strM109840d, bArr, oSSConfigM145535d0);
        kcm.m145452H().m145563m1(strM109840d);
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "nfcOssUploadRes", NotificationCompat.CATEGORY_STATUS, "success", "ossFileName", strM109840d, "w", String.valueOf(bitmapM145523Y.getWidth()), "h", String.valueOf(bitmapM145523Y.getHeight()));
        khi.m145962d().m145968h(this, new C3626d(System.currentTimeMillis(), bArr));
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: G1 */
    public void mo17763G1() {
        setContentView(x5c0.f191114b);
        this.f12459I = new jwb(d300.m109845i(this, "identity-key-public.key"), true);
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: Y0 */
    public void mo17769Y0() {
        kcm.m145452H().m145517V().ocrResult.ocrResult.surname = this.f12460z.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.givenname = this.f12451A.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.passportNo = this.f12452B.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.nationality = this.f12453C.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.sex = this.f12454D.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.birthDate = this.f12455E.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.countryCode = this.f12456F.getText().toString();
        kcm.m145452H().m145517V().ocrResult.ocrResult.expiryDate = this.f12457G.getText().toString();
    }

    /* JADX INFO: renamed from: c2 */
    public void m17926c2() {
        m17778q1(m17924b2());
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: d1 */
    public void mo17770d1() {
        runOnUiThread(new RunnableC3623a());
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: h1 */
    public void mo17772h1() {
        this.f12460z.setEnabled(true);
        this.f12451A.setEnabled(true);
        this.f12452B.setEnabled(true);
        this.f12453C.setEnabled(true);
        this.f12454D.setEnabled(true);
        this.f12455E.setEnabled(true);
        this.f12456F.setEnabled(true);
        this.f12457G.setEnabled(true);
        this.f12458H.setEnabled(true);
        ScrollView scrollView = (ScrollView) findViewById(k4c0.f121060p);
        if (scrollView != null) {
            scrollView.setOnTouchListener(new ViewOnTouchListenerC3624b());
        }
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: o1 */
    public void mo17776o1() {
        this.f12460z = (EditText) findViewById(k4c0.f121079y0);
        this.f12451A = (EditText) findViewById(k4c0.f120996O);
        this.f12452B = (EditText) findViewById(k4c0.f121063q0);
        this.f12453C = (EditText) findViewById(k4c0.f121053l0);
        this.f12454D = (EditText) findViewById(k4c0.f121075w0);
        this.f12455E = (EditText) findViewById(k4c0.f120998P);
        this.f12456F = (EditText) findViewById(k4c0.f120982H);
        this.f12457G = (EditText) findViewById(k4c0.f121000Q);
        EditText editText = this.f12460z;
        if (editText != null) {
            editText.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.surname);
        }
        EditText editText2 = this.f12451A;
        if (editText2 != null) {
            editText2.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.givenname);
        }
        EditText editText3 = this.f12452B;
        if (editText3 != null) {
            editText3.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.passportNo);
        }
        EditText editText4 = this.f12453C;
        if (editText4 != null) {
            editText4.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.nationality);
        }
        EditText editText5 = this.f12454D;
        if (editText5 != null) {
            editText5.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.sex);
        }
        if (this.f12455E != null) {
            this.f12455E.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.birthDate);
        }
        EditText editText6 = this.f12456F;
        if (editText6 != null) {
            editText6.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.countryCode);
        }
        if (this.f12457G != null) {
            this.f12457G.setText(kcm.m145452H().m145517V().ocrResult.ocrResult.expiryDate);
        }
        Button button = (Button) findViewById(k4c0.f120973C0);
        this.f12458H = button;
        button.setOnClickListener(new ViewOnClickListenerC3625c());
        m17921Y1();
        m17922Z1();
        if (this.f12330x) {
            return;
        }
        m17923a2();
    }

    @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: y1 */
    public void mo17784y1(String str, String str2) {
        m17765I1(str, str2, getResources().getString(R$string.f11993R), null, "ORC_RES_PAGE_INFO_EMPTY_CODE", new C3628f());
    }
}
