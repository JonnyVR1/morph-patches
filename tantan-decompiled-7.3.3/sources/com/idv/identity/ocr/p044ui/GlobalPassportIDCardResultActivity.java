package com.idv.identity.ocr.p044ui;

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
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.HashMap;
import java.util.Map;
import p153l.ac00;
import p153l.afm;
import p153l.cfm;
import p153l.dec0;
import p153l.fb50;
import p153l.ffm;
import p153l.hki;
import p153l.rcc0;
import p153l.xxb;
import p153l.y9c0;
import p153l.yac0;

/* JADX INFO: loaded from: classes7.dex */
public class GlobalPassportIDCardResultActivity extends BaseIDCardResultActivity {

    /* JADX INFO: renamed from: A */
    private EditText f13192A;

    /* JADX INFO: renamed from: B */
    private EditText f13193B;

    /* JADX INFO: renamed from: C */
    private EditText f13194C;

    /* JADX INFO: renamed from: D */
    private EditText f13195D;

    /* JADX INFO: renamed from: E */
    private EditText f13196E;

    /* JADX INFO: renamed from: F */
    private EditText f13197F;

    /* JADX INFO: renamed from: G */
    private EditText f13198G;

    /* JADX INFO: renamed from: H */
    private Button f13199H;

    /* JADX INFO: renamed from: I */
    private xxb f13200I;

    /* JADX INFO: renamed from: z */
    private EditText f13201z;

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.GlobalPassportIDCardResultActivity$a */
    public class RunnableC3782a implements Runnable {

        /* JADX INFO: renamed from: com.idv.identity.ocr.ui.GlobalPassportIDCardResultActivity$a$a */
        public class a implements View.OnTouchListener {
            public a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public RunnableC3782a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GlobalPassportIDCardResultActivity.this.m19000b2();
            GlobalPassportIDCardResultActivity.this.f13199H.setEnabled(false);
            ScrollView scrollView = (ScrollView) GlobalPassportIDCardResultActivity.this.findViewById(rcc0.f162179p);
            if (scrollView != null) {
                scrollView.setOnTouchListener(new a());
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.GlobalPassportIDCardResultActivity$b */
    public class ViewOnTouchListenerC3783b implements View.OnTouchListener {
        public ViewOnTouchListenerC3783b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.GlobalPassportIDCardResultActivity$c */
    public class ViewOnClickListenerC3784c implements View.OnClickListener {
        public ViewOnClickListenerC3784c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Throwable {
            String string = GlobalPassportIDCardResultActivity.this.f13201z.getText().toString();
            String string2 = GlobalPassportIDCardResultActivity.this.f13192A.getText().toString();
            String string3 = GlobalPassportIDCardResultActivity.this.f13193B.getText().toString();
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                GlobalPassportIDCardResultActivity globalPassportIDCardResultActivity = GlobalPassportIDCardResultActivity.this;
                globalPassportIDCardResultActivity.mo18862z1(globalPassportIDCardResultActivity.getResources().getString(R$string.f12716H0), "");
                return;
            }
            if (!fb50.m124883a("^[A-Za-z]{1,50}$", string)) {
                GlobalPassportIDCardResultActivity.this.mo18862z1(GlobalPassportIDCardResultActivity.this.getResources().getString(R$string.f12794z0) + GlobalPassportIDCardResultActivity.this.getResources().getString(R$string.f12710E0), "");
                return;
            }
            if (!fb50.m124883a("^[A-Za-z\\s]{1,50}$", string2)) {
                GlobalPassportIDCardResultActivity.this.mo18862z1(GlobalPassportIDCardResultActivity.this.getResources().getString(R$string.f12792y0) + GlobalPassportIDCardResultActivity.this.getResources().getString(R$string.f12710E0), "");
                return;
            }
            if (!fb50.m124883a("^[A-Za-z0-9]{8,9}$", string3)) {
                GlobalPassportIDCardResultActivity.this.mo18862z1(GlobalPassportIDCardResultActivity.this.getResources().getString(R$string.f12790x0) + GlobalPassportIDCardResultActivity.this.getResources().getString(R$string.f12710E0), "");
                return;
            }
            String strM97458i0 = afm.m97360H().m97458i0();
            NfcConfigRes nfcConfigResM97396L = afm.m97360H().m97396L();
            boolean zHasSystemFeature = GlobalPassportIDCardResultActivity.this.getPackageManager().hasSystemFeature("android.hardware.nfc");
            if (cfm.f81515a.equals(GlobalPassportIDCardResultActivity.this.f13063p) && (ffm.f98804g.equals(strM97458i0) || (ffm.f98802e.equals(strM97458i0) && zHasSystemFeature && nfcConfigResM97396L != null))) {
                GlobalPassportIDCardResultActivity.this.m19002e2();
            } else {
                GlobalPassportIDCardResultActivity.this.m19003d2();
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.GlobalPassportIDCardResultActivity$d */
    public class C3785d implements hki.InterfaceC17490d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f13206a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ byte[] f13207b;

        /* JADX INFO: renamed from: com.idv.identity.ocr.ui.GlobalPassportIDCardResultActivity$d$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f13209a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ int f13210b;

            public a(int i, int i2) {
                this.f13209a = i;
                this.f13210b = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Map<String, String> mapM19001c2 = GlobalPassportIDCardResultActivity.this.m19001c2();
                int i = this.f13209a;
                int i2 = this.f13210b;
                C3785d c3785d = C3785d.this;
                if (i == i2) {
                    GlobalPassportIDCardResultActivity.this.m18857s1(mapM19001c2, true, c3785d.f13207b);
                } else {
                    GlobalPassportIDCardResultActivity.this.m18857s1(mapM19001c2, false, c3785d.f13207b);
                }
            }
        }

        public C3785d(long j, byte[] bArr) {
            this.f13206a = j;
            this.f13207b = bArr;
        }

        @Override // p153l.hki.InterfaceC17490d
        /* JADX INFO: renamed from: a */
        public boolean mo18772a(int i, String str, String str2, String str3) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "nfcOssUploadRes", NotificationCompat.CATEGORY_STATUS, "error", "idx", String.valueOf(i), "bucketName", str, "fileName", str2, "errMsg", str3);
            return false;
        }

        @Override // p153l.hki.InterfaceC17490d
        /* JADX INFO: renamed from: b */
        public boolean mo18773b(int i, String str, String str2) {
            afm.m97360H().m97471m1(str2);
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "nfcOssUploadRes", NotificationCompat.CATEGORY_STATUS, "success", "idx", String.valueOf(i), "bucketName", str, "fileName", str2);
            return false;
        }

        @Override // p153l.hki.InterfaceC17490d
        /* JADX INFO: renamed from: c */
        public void mo18774c(int i, int i2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "cardOssUploadCost", NotificationCompat.CATEGORY_STATUS, "finish", "uploadCnt", String.valueOf(i), "successCnt", String.valueOf(i2), "timeCost", String.valueOf((System.currentTimeMillis() - this.f13206a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f45294s);
            GlobalPassportIDCardResultActivity.this.runOnUiThread(new a(i, i2));
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.GlobalPassportIDCardResultActivity$e */
    public class RunnableC3786e implements Runnable {
        public RunnableC3786e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GlobalPassportIDCardResultActivity.this.f13199H.setEnabled(false);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.GlobalPassportIDCardResultActivity$f */
    public class C3787f implements BaseIDCardResultActivity.InterfaceC3757o {
        public C3787f() {
        }

        @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity.InterfaceC3757o
        /* JADX INFO: renamed from: a */
        public void mo18863a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "onMessageOcrResultNetError", NotificationCompat.CATEGORY_STATUS, "retry_onOK");
            GlobalPassportIDCardResultActivity.this.f13199H.setEnabled(true);
            GlobalPassportIDCardResultActivity.this.mo18850j1();
        }

        @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity.InterfaceC3757o
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.GlobalPassportIDCardResultActivity$g */
    public class C3788g implements TextWatcher {
        public C3788g() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            GlobalPassportIDCardResultActivity.this.m18999a2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.GlobalPassportIDCardResultActivity$h */
    public class C3789h implements TextWatcher {
        public C3789h() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            GlobalPassportIDCardResultActivity.this.m18999a2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.GlobalPassportIDCardResultActivity$i */
    public class C3790i implements TextWatcher {
        public C3790i() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            GlobalPassportIDCardResultActivity.this.m18999a2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: Z1 */
    private void m18998Z1() {
        this.f13201z.addTextChangedListener(new C3788g());
        this.f13192A.addTextChangedListener(new C3789h());
        this.f13193B.addTextChangedListener(new C3790i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public void m18999a2() {
        boolean z;
        String string = this.f13201z.getText().toString();
        String string2 = this.f13192A.getText().toString();
        String string3 = this.f13193B.getText().toString();
        if (fb50.m124883a("^[A-Za-z]{1,50}$", string)) {
            this.f13201z.setBackgroundDrawable(getResources().getDrawable(yac0.f198173j));
            z = true;
        } else {
            m18846X0(R$string.f12794z0);
            this.f13201z.setBackgroundDrawable(getResources().getDrawable(yac0.f198174k));
            z = false;
        }
        if (fb50.m124883a("^[A-Za-z\\s]{1,50}$", string2)) {
            this.f13192A.setBackgroundDrawable(getResources().getDrawable(yac0.f198173j));
        } else {
            m18846X0(R$string.f12792y0);
            this.f13192A.setBackgroundDrawable(getResources().getDrawable(yac0.f198174k));
            z = false;
        }
        if (fb50.m124883a("^[A-Za-z0-9]{8,9}$", string3)) {
            this.f13193B.setBackgroundDrawable(getResources().getDrawable(yac0.f198173j));
        } else {
            m18846X0(R$string.f12790x0);
            this.f13193B.setBackgroundDrawable(getResources().getDrawable(yac0.f198174k));
            z = false;
        }
        if (z) {
            m18840E1();
            this.f13199H.setEnabled(true);
            m18842I1();
            m18849h1(true);
            return;
        }
        this.f13199H.setEnabled(false);
        GradientDrawable gradientDrawable = (GradientDrawable) this.f13199H.getBackground();
        if (gradientDrawable != null) {
            gradientDrawable.setColor(getResources().getColor(y9c0.f198080e));
        }
        m18849h1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public void m19000b2() {
        this.f13201z.setEnabled(false);
        this.f13192A.setEnabled(false);
        this.f13193B.setEnabled(false);
        this.f13194C.setEnabled(false);
        this.f13195D.setEnabled(false);
        this.f13196E.setEnabled(false);
        this.f13197F.setEnabled(false);
        this.f13198G.setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public Map<String, String> m19001c2() {
        String string = this.f13201z.getText().toString();
        String string2 = this.f13192A.getText().toString();
        String string3 = this.f13193B.getText().toString();
        String string4 = this.f13194C.getText().toString();
        String string5 = this.f13195D.getText().toString();
        String string6 = this.f13196E.getText().toString();
        String string7 = this.f13197F.getText().toString();
        String string8 = this.f13198G.getText().toString();
        runOnUiThread(new RunnableC3786e());
        HashMap map = new HashMap();
        map.put("surname", string);
        map.put("givenname", string2);
        map.put("passportNo", string3);
        map.put("nationality", string4);
        map.put("sex", string5);
        map.put("birthDate", string6);
        map.put(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, string7);
        map.put("expiryDate", string8);
        String strM97399M = afm.m97360H().m97399M();
        String strM97458i0 = afm.m97360H().m97458i0();
        NfcConfigRes nfcConfigResM97396L = afm.m97360H().m97396L();
        if ((cfm.f81515a.equals(this.f13063p) && ffm.f98804g.equals(strM97458i0) && strM97399M != null) || (ffm.f98802e.equals(strM97458i0) && nfcConfigResM97396L != null)) {
            map.put("nfcFileName", strM97399M);
        }
        xxb xxbVar = this.f13200I;
        if (xxbVar != null && xxbVar.m213516c()) {
            map.put("encryptKey", ac00.m96782a(this.f13200I.m213515b()));
            map.put("encryptVersion", "NATIVE_E1");
        }
        if (ffm.f98802e.equals(strM97458i0) && nfcConfigResM97396L != null) {
            map.put("useNFC", getPackageManager().hasSystemFeature("android.hardware.nfc") ? "Y" : "N");
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public void m19002e2() throws Throwable {
        this.f13064q.setVisibility(0);
        OSSConfig oSSConfigM97443d0 = afm.m97360H().m97443d0();
        if (oSSConfigM97443d0 == null || oSSConfigM97443d0.FileNamePrefix == null || oSSConfigM97443d0.OssEndPoint == null || oSSConfigM97443d0.AccessKeyId == null || oSSConfigM97443d0.AccessKeySecret == null) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "submitPhoto", NotificationCompat.CATEGORY_STATUS, "error", "errMsg", "ossConfig is null.");
            return;
        }
        hki.m135625d().m135629f();
        Bitmap bitmapM97431Y = afm.m97360H().m97431Y();
        byte[] bArrM96783b = ac00.m96783b(bitmapM97431Y);
        xxb xxbVar = this.f13200I;
        if (xxbVar != null && xxbVar.m213516c() && bArrM96783b != null) {
            bArrM96783b = this.f13200I.m213514a(bArrM96783b);
        }
        byte[] bArr = bArrM96783b;
        if (bArr == null) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "uploadNfcFileImage", NotificationCompat.CATEGORY_STATUS, "error", "errMsg", "nfcPictureContent is null.");
            return;
        }
        String strM96785d = ac00.m96785d(oSSConfigM97443d0.FileNamePrefix, "nfccard", "jpeg");
        hki.m135625d().m135626b(10, oSSConfigM97443d0.BucketName, strM96785d, bArr, oSSConfigM97443d0);
        afm.m97360H().m97471m1(strM96785d);
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "nfcOssUploadRes", NotificationCompat.CATEGORY_STATUS, "success", "ossFileName", strM96785d, "w", String.valueOf(bitmapM97431Y.getWidth()), "h", String.valueOf(bitmapM97431Y.getHeight()));
        hki.m135625d().m135631h(this, new C3785d(System.currentTimeMillis(), bArr));
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: H1 */
    public void mo18841H1() {
        setContentView(dec0.f87998b);
        this.f13200I = new xxb(ac00.m96790i(this, "identity-key-public.key"), true);
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: a1 */
    public void mo18847a1() {
        afm.m97360H().m97425V().ocrResult.ocrResult.surname = this.f13201z.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.givenname = this.f13192A.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.passportNo = this.f13193B.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.nationality = this.f13194C.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.sex = this.f13195D.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.birthDate = this.f13196E.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.countryCode = this.f13197F.getText().toString();
        afm.m97360H().m97425V().ocrResult.ocrResult.expiryDate = this.f13198G.getText().toString();
    }

    /* JADX INFO: renamed from: d2 */
    public void m19003d2() {
        m18856r1(m19001c2());
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: f1 */
    public void mo18848f1() {
        runOnUiThread(new RunnableC3782a());
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: j1 */
    public void mo18850j1() {
        this.f13201z.setEnabled(true);
        this.f13192A.setEnabled(true);
        this.f13193B.setEnabled(true);
        this.f13194C.setEnabled(true);
        this.f13195D.setEnabled(true);
        this.f13196E.setEnabled(true);
        this.f13197F.setEnabled(true);
        this.f13198G.setEnabled(true);
        this.f13199H.setEnabled(true);
        ScrollView scrollView = (ScrollView) findViewById(rcc0.f162179p);
        if (scrollView != null) {
            scrollView.setOnTouchListener(new ViewOnTouchListenerC3783b());
        }
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: p1 */
    public void mo18854p1() {
        this.f13201z = (EditText) findViewById(rcc0.f162198y0);
        this.f13192A = (EditText) findViewById(rcc0.f162115O);
        this.f13193B = (EditText) findViewById(rcc0.f162182q0);
        this.f13194C = (EditText) findViewById(rcc0.f162172l0);
        this.f13195D = (EditText) findViewById(rcc0.f162194w0);
        this.f13196E = (EditText) findViewById(rcc0.f162117P);
        this.f13197F = (EditText) findViewById(rcc0.f162101H);
        this.f13198G = (EditText) findViewById(rcc0.f162119Q);
        EditText editText = this.f13201z;
        if (editText != null) {
            editText.setText(afm.m97360H().m97425V().ocrResult.ocrResult.surname);
        }
        EditText editText2 = this.f13192A;
        if (editText2 != null) {
            editText2.setText(afm.m97360H().m97425V().ocrResult.ocrResult.givenname);
        }
        EditText editText3 = this.f13193B;
        if (editText3 != null) {
            editText3.setText(afm.m97360H().m97425V().ocrResult.ocrResult.passportNo);
        }
        EditText editText4 = this.f13194C;
        if (editText4 != null) {
            editText4.setText(afm.m97360H().m97425V().ocrResult.ocrResult.nationality);
        }
        EditText editText5 = this.f13195D;
        if (editText5 != null) {
            editText5.setText(afm.m97360H().m97425V().ocrResult.ocrResult.sex);
        }
        if (this.f13196E != null) {
            this.f13196E.setText(afm.m97360H().m97425V().ocrResult.ocrResult.birthDate);
        }
        EditText editText6 = this.f13197F;
        if (editText6 != null) {
            editText6.setText(afm.m97360H().m97425V().ocrResult.ocrResult.countryCode);
        }
        if (this.f13198G != null) {
            this.f13198G.setText(afm.m97360H().m97425V().ocrResult.ocrResult.expiryDate);
        }
        Button button = (Button) findViewById(rcc0.f162092C0);
        this.f13199H = button;
        button.setOnClickListener(new ViewOnClickListenerC3784c());
        m18998Z1();
        m18999a2();
        if (this.f13071x) {
            return;
        }
        m19000b2();
    }

    @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity
    /* JADX INFO: renamed from: z1 */
    public void mo18862z1(String str, String str2) {
        m18843J1(str, str2, getResources().getString(R$string.f12734R), null, "ORC_RES_PAGE_INFO_EMPTY_CODE", new C3787f());
    }
}
