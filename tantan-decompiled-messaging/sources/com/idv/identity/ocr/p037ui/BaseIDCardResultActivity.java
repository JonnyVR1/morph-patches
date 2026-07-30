package com.idv.identity.ocr.p037ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.idv.identity.base.R$string;
import com.idv.identity.platform.FinalVerifyActivity;
import com.idv.identity.platform.IdentityAlertOverlay;
import com.idv.identity.platform.IntlFaceBaseActivity;
import com.idv.identity.platform.iOSLoadingView;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p149l.f300;
import p149l.h7c;
import p149l.hc20;
import p149l.ixq0;
import p149l.k4c0;
import p149l.kcm;
import p149l.mcm;
import p149l.mxb;
import p149l.n2c0;
import p149l.ncm;
import p149l.pcm;
import p149l.r1c0;
import p149l.rcm;
import p149l.s1c0;
import p149l.ucm;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseIDCardResultActivity extends IntlFaceBaseActivity {

    /* JADX INFO: renamed from: q */
    protected iOSLoadingView f12323q;

    /* JADX INFO: renamed from: r */
    private Button f12324r;

    /* JADX INFO: renamed from: s */
    public TextView f12325s;

    /* JADX INFO: renamed from: t */
    public RelativeLayout f12326t;

    /* JADX INFO: renamed from: u */
    public ImageView f12327u;

    /* JADX INFO: renamed from: v */
    private View f12328v;

    /* JADX INFO: renamed from: w */
    protected h7c f12329w;

    /* JADX INFO: renamed from: c */
    protected final int f12309c = 0;

    /* JADX INFO: renamed from: d */
    protected final String f12310d = "nfccard";

    /* JADX INFO: renamed from: e */
    private long f12311e = System.currentTimeMillis();

    /* JADX INFO: renamed from: f */
    private final float f12312f = 0.64285713f;

    /* JADX INFO: renamed from: g */
    private final int f12313g = 1000;

    /* JADX INFO: renamed from: h */
    private final int f12314h = 1001;

    /* JADX INFO: renamed from: i */
    private final int f12315i = 1002;

    /* JADX INFO: renamed from: j */
    private final int f12316j = 1003;

    /* JADX INFO: renamed from: k */
    private final String f12317k = "401";

    /* JADX INFO: renamed from: l */
    private final String f12318l = "402";

    /* JADX INFO: renamed from: m */
    private final String f12319m = "200";

    /* JADX INFO: renamed from: n */
    private boolean f12320n = false;

    /* JADX INFO: renamed from: o */
    private int f12321o = rcm.f158795j;

    /* JADX INFO: renamed from: p */
    public String f12322p = kcm.m145452H().m145587v();

    /* JADX INFO: renamed from: x */
    protected boolean f12330x = true;

    /* JADX INFO: renamed from: y */
    public Handler f12331y = new Handler(new C3589f());

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$a */
    public class RunnableC3584a implements Runnable {
        public RunnableC3584a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseIDCardResultActivity.this.f12323q.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$b */
    public class C3585b implements InterfaceC3598o {
        public C3585b() {
        }

        @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity.InterfaceC3598o
        /* JADX INFO: renamed from: a */
        public void mo17786a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "onMessageOCRNetError", NotificationCompat.CATEGORY_STATUS, "retry_onOK");
            BaseIDCardResultActivity.this.mo17772h1();
        }

        @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity.InterfaceC3598o
        public void onCancel() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "userBack", "type", "ocrNetError_onCancel");
            BaseIDCardResultActivity.this.m17741E1(ncm.f138196f);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$c */
    public class C3586c implements InterfaceC3598o {
        public C3586c() {
        }

        @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity.InterfaceC3598o
        /* JADX INFO: renamed from: a */
        public void mo17786a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "onMessageOcrResultNetError", NotificationCompat.CATEGORY_STATUS, "retry_onOK");
            BaseIDCardResultActivity.this.f12324r.setEnabled(true);
            BaseIDCardResultActivity.this.mo17772h1();
        }

        @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity.InterfaceC3598o
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$d */
    public class C3587d implements InterfaceC3598o {
        public C3587d() {
        }

        @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity.InterfaceC3598o
        /* JADX INFO: renamed from: a */
        public void mo17786a() {
            BaseIDCardResultActivity.this.m17742F1();
        }

        @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity.InterfaceC3598o
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$e */
    public class C3588e implements InterfaceC3598o {
        public C3588e() {
        }

        @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity.InterfaceC3598o
        /* JADX INFO: renamed from: a */
        public void mo17786a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "cardScanOutTime", NotificationCompat.CATEGORY_STATUS, "exit_onOK");
            Message message = new Message();
            message.obj = ncm.f138202l;
            BaseIDCardResultActivity.this.m17781u1(message);
        }

        @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity.InterfaceC3598o
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$f */
    public class C3589f implements Handler.Callback {
        public C3589f() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (BaseIDCardResultActivity.this.f12321o <= 0) {
                BaseIDCardResultActivity.this.m17743J1();
                return false;
            }
            if (message == null) {
                return false;
            }
            int i = message.what;
            if (1000 == i) {
                BaseIDCardResultActivity.this.m17741E1(ncm.f138181A);
            } else if (1001 == i) {
                BaseIDCardResultActivity.this.m17760t1((String) message.obj);
            } else if (1002 == i) {
                BaseIDCardResultActivity.m17746L0(BaseIDCardResultActivity.this);
                BaseIDCardResultActivity.this.m17782v1();
            } else if (1003 == i) {
                BaseIDCardResultActivity.m17746L0(BaseIDCardResultActivity.this);
                BaseIDCardResultActivity.this.m17783w1();
            } else if (1 == i) {
                BaseIDCardResultActivity.this.m17780s1(false);
            } else if (i == 0) {
                BaseIDCardResultActivity.this.m17780s1(true);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$g */
    public class RunnableC3590g implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f12338a;

        public RunnableC3590g(String str) {
            this.f12338a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (BaseIDCardResultActivity.this.f12326t != null) {
                if (pcm.f148194g.equals(this.f12338a)) {
                    BaseIDCardResultActivity.this.f12326t.setVisibility(8);
                    return;
                }
                boolean z = rcm.f158790e;
                BaseIDCardResultActivity baseIDCardResultActivity = BaseIDCardResultActivity.this;
                if (z) {
                    baseIDCardResultActivity.f12326t.setVisibility(0);
                } else {
                    baseIDCardResultActivity.f12326t.setVisibility(8);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$h */
    public class C3591h implements InterfaceC3598o {
        public C3591h() {
        }

        @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity.InterfaceC3598o
        /* JADX INFO: renamed from: a */
        public void mo17786a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "keyBack");
            BaseIDCardResultActivity.this.m17741E1(ncm.f138196f);
            BaseIDCardResultActivity.super.onBackPressed();
        }

        @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity.InterfaceC3598o
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$i */
    public class ViewOnClickListenerC3592i implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f12341a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ RelativeLayout f12342b;

        public ViewOnClickListenerC3592i(View view, RelativeLayout relativeLayout) {
            this.f12341a = view;
            this.f12342b = relativeLayout;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f12341a != null) {
                this.f12342b.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$j */
    public class ViewOnClickListenerC3593j implements View.OnClickListener {
        public ViewOnClickListenerC3593j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseIDCardResultActivity.this.m17767V0();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$k */
    public class C3594k implements InterfaceC3598o {
        public C3594k() {
        }

        @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity.InterfaceC3598o
        /* JADX INFO: renamed from: a */
        public void mo17786a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "resultPage close");
            BaseIDCardResultActivity.this.m17741E1(ncm.f138196f);
        }

        @Override // com.idv.identity.ocr.p037ui.BaseIDCardResultActivity.InterfaceC3598o
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$l */
    public class C3595l implements IdentityAlertOverlay.InterfaceC3705d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f12346a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC3598o f12347b;

        public C3595l(String str, InterfaceC3598o interfaceC3598o) {
            this.f12346a = str;
            this.f12347b = interfaceC3598o;
        }

        @Override // com.idv.identity.platform.IdentityAlertOverlay.InterfaceC3705d
        /* JADX INFO: renamed from: a */
        public void mo17692a() {
            RecordService.recordOcrAlertConfirm(this.f12346a, "OCR_RESULT");
            RecordService.recordOcrAlertClose(this.f12346a, "OCR_RESULT");
            InterfaceC3598o interfaceC3598o = this.f12347b;
            if (interfaceC3598o != null) {
                interfaceC3598o.mo17786a();
                BaseIDCardResultActivity.this.m17771f1(true);
                BaseIDCardResultActivity.this.f12320n = false;
            }
        }

        @Override // com.idv.identity.platform.IdentityAlertOverlay.InterfaceC3705d
        public void onCancel() {
            RecordService.recordOcrAlertCancel(this.f12346a, "OCR_RESULT");
            RecordService.recordOcrAlertClose(this.f12346a, "OCR_RESULT");
            InterfaceC3598o interfaceC3598o = this.f12347b;
            if (interfaceC3598o != null) {
                interfaceC3598o.onCancel();
                BaseIDCardResultActivity.this.m17771f1(true);
                BaseIDCardResultActivity.this.f12320n = false;
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$m */
    public class RunnableC3596m implements Runnable {
        public RunnableC3596m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseIDCardResultActivity.this.f12323q.setVisibility(0);
            BaseIDCardResultActivity.this.mo17770d1();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$n */
    public class C3597n implements ucm {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f12350a;

        /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$n$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f12352a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ String f12353b;

            public a(String str, String str2) {
                this.f12352a = str;
                this.f12353b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str;
                if (this.f12352a.equals("200")) {
                    BaseIDCardResultActivity.this.mo17769Y0();
                    BaseIDCardResultActivity.this.m17766M1();
                    return;
                }
                try {
                    if (mcm.f133155h.equals(BaseIDCardResultActivity.this.f12322p)) {
                        str = "identity_ocr_result_id_mainland_" + this.f12353b;
                    } else if (mcm.f133148a.equals(BaseIDCardResultActivity.this.f12322p) && (this.f12353b.equals("surname") || this.f12353b.equals("givenname"))) {
                        str = "identity_ocr_result_id_passport_" + this.f12353b;
                    } else {
                        str = "identity_ocr_result_id_" + this.f12353b;
                    }
                    int identifier = BaseIDCardResultActivity.this.getResources().getIdentifier(str, "string", BaseIDCardResultActivity.this.getPackageName());
                    if (this.f12352a.equals("401")) {
                        BaseIDCardResultActivity baseIDCardResultActivity = BaseIDCardResultActivity.this;
                        baseIDCardResultActivity.mo17784y1(String.format(baseIDCardResultActivity.getResources().getString(R$string.f11977I0), BaseIDCardResultActivity.this.getResources().getString(identifier)), "");
                    } else if (this.f12352a.equals("402")) {
                        BaseIDCardResultActivity baseIDCardResultActivity2 = BaseIDCardResultActivity.this;
                        baseIDCardResultActivity2.mo17784y1(baseIDCardResultActivity2.getResources().getString(R$string.f11967D0), BaseIDCardResultActivity.this.getResources().getString(R$string.f11971F0) + BaseIDCardResultActivity.this.getResources().getString(identifier) + BaseIDCardResultActivity.this.getResources().getString(R$string.f11973G0));
                    }
                } catch (Exception e) {
                    RecordService.getInstance().recordException(e);
                }
            }
        }

        public C3597n(long j) {
            this.f12350a = j;
        }

        @Override // p149l.ucm
        /* JADX INFO: renamed from: a */
        public void mo17787a(String str, String str2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "ocrDeviceResultCost", NotificationCompat.CATEGORY_STATUS, "error", "code", str, "msg", str2, "tag", "onError", "timeCost", String.valueOf((System.currentTimeMillis() - this.f12350a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f44446s);
            BaseIDCardResultActivity.this.m17759k1();
            BaseIDCardResultActivity.this.f12331y.sendEmptyMessage(1002);
        }

        @Override // p149l.ucm
        /* JADX INFO: renamed from: b */
        public void mo17788b(String str, String str2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "ocrDeviceResultCost", NotificationCompat.CATEGORY_STATUS, "success", "param", str2, "timeCost", String.valueOf((System.currentTimeMillis() - this.f12350a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f44446s);
            BaseIDCardResultActivity.this.m17759k1();
            BaseIDCardResultActivity.this.runOnUiThread(new a(str, str2));
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$o */
    public interface InterfaceC3598o {
        /* JADX INFO: renamed from: a */
        void mo17786a();

        void onCancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E1 */
    public void m17741E1(String str) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1001;
        messageObtain.obj = str;
        this.f12331y.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F1 */
    public void m17742F1() {
        int i = rcm.f158798m;
        Handler handler = this.f12331y;
        if (i <= 0) {
            handler.sendEmptyMessageDelayed(1003, rcm.f158799n * 20);
        } else {
            handler.sendEmptyMessageDelayed(1003, i * rcm.f158799n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J1 */
    public void m17743J1() {
        m17765I1(getResources().getString(R$string.f12013f0), "", getResources().getString(R$string.f11992Q), null, "ocr_over_time_code", new C3588e());
    }

    /* JADX INFO: renamed from: K1 */
    private boolean m17745K1(boolean z) {
        try {
            return ((Boolean) getClassLoader().loadClass("com.idv.identity.face.IdentityFaceApi").getDeclaredMethod("start", Context.class, Boolean.TYPE).invoke(null, this, Boolean.valueOf(z))).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "startFace", NotificationCompat.CATEGORY_STATUS, "catchException", "exception", e.toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ int m17746L0(BaseIDCardResultActivity baseIDCardResultActivity) {
        int i = baseIDCardResultActivity.f12321o;
        baseIDCardResultActivity.f12321o = i - 1;
        return i;
    }

    /* JADX INFO: renamed from: L1 */
    private void m17747L1() {
        ArrayList arrayList = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) findViewById(k4c0.f121060p);
        if (viewGroup != null) {
            m17756X0(viewGroup, arrayList);
        }
        arrayList.size();
        String strM145550i0 = kcm.m145452H().m145550i0();
        for (View view : arrayList) {
            if (pcm.f148194g.equals(strM145550i0)) {
                view.setEnabled(false);
            } else {
                view.setEnabled(rcm.f158790e);
            }
        }
    }

    /* JADX INFO: renamed from: X0 */
    private void m17756X0(ViewGroup viewGroup, List<View> list) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof EditText) {
                list.add(childAt);
            } else if (childAt instanceof TextView) {
                list.add(childAt);
            } else if (childAt instanceof ViewGroup) {
                list.add(childAt);
                m17756X0((ViewGroup) childAt, list);
            }
        }
    }

    /* JADX INFO: renamed from: a1 */
    private int m17757a1(float f) {
        return (int) ((f * getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: j1 */
    private void m17758j1(String str) {
        RecordService.getInstance().recordEventPage(RecordLevel.LOG_ERROR, "OCR_RESULT_EXIT", "OCR_RESULT", (System.currentTimeMillis() - this.f12311e) + "ms", str);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public void m17759k1() {
        runOnUiThread(new RunnableC3584a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public void m17760t1(String str) {
        this.f12331y.removeMessages(1000);
        kcm.m145452H().m145537e(str);
        m17758j1(str);
    }

    /* JADX INFO: renamed from: B1 */
    public void m17761B1() {
        startActivity(new Intent(this, (Class<?>) FinalVerifyActivity.class));
        m17758j1("success");
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "onClickStartVerifyView", NotificationCompat.CATEGORY_STATUS, "success");
    }

    /* JADX INFO: renamed from: C1 */
    public void m17762C1() {
        this.f12325s.setText(getResources().getString(R$string.f11979J0));
        this.f12325s.setTextColor(mxb.f136154d.getOcrResultTipColor(r1c0.f157262b));
        this.f12326t.setBackgroundColor(mxb.f136154d.getOcrResultTipBGColor(r1c0.f157266f));
        this.f12327u.setVisibility(8);
        this.f12326t.setGravity(16);
    }

    /* JADX INFO: renamed from: G1 */
    public abstract void mo17763G1();

    /* JADX INFO: renamed from: H1 */
    public void m17764H1() {
        GradientDrawable gradientDrawable;
        Button button = this.f12324r;
        if (button == null || (gradientDrawable = (GradientDrawable) button.getBackground()) == null) {
            return;
        }
        String str = rcm.f158791f;
        if (str == null || TextUtils.isEmpty(str)) {
            m17771f1(true);
        } else {
            gradientDrawable.setColor(Color.parseColor(rcm.f158791f));
        }
    }

    /* JADX INFO: renamed from: I1 */
    public void m17765I1(String str, String str2, String str3, String str4, String str5, InterfaceC3598o interfaceC3598o) {
        RecordService.recordOcrAlertAppear(str5, "OCR_RESULT");
        if (this.f12320n) {
            return;
        }
        m17771f1(false);
        this.f12320n = true;
        IdentityAlertOverlay identityAlertOverlay = (IdentityAlertOverlay) findViewById(k4c0.f121023b);
        if (identityAlertOverlay != null) {
            identityAlertOverlay.setTitleText(str);
            identityAlertOverlay.setMessageText(str2);
            if (str4 != null) {
                identityAlertOverlay.setCancelText(str4);
                identityAlertOverlay.setButtonType(true);
            } else {
                identityAlertOverlay.setButtonType(false);
            }
            identityAlertOverlay.setConfirmText(str3);
            identityAlertOverlay.setVisibility(0);
            mxb.m156848a(identityAlertOverlay, mxb.m156867t(str5));
            identityAlertOverlay.setCommAlertOverlayListener(new C3595l(str5, interfaceC3598o));
        }
    }

    /* JADX INFO: renamed from: M1 */
    public void m17766M1() {
        String strM145550i0;
        if (isFinishing() || (strM145550i0 = kcm.m145452H().m145550i0()) == null) {
            return;
        }
        if (pcm.f148191d.equals(strM145550i0) || pcm.f148194g.equals(strM145550i0)) {
            m17761B1();
        } else if (pcm.f148192e.equals(strM145550i0)) {
            m17785z1();
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m17767V0() {
        RecordService.getInstance().recordEventBehavior(RecordLevel.LOG_INFO, "PAGER_BEHAVIOR", "exitVerifyBtn", "OCR_RESULT");
        m17765I1(getResources().getString(R$string.f11995T), "", getResources().getString(R$string.f11992Q), getResources().getString(R$string.f11986N), "ORC_RES_PAGE_EXIT_CODE", new C3594k());
    }

    /* JADX INFO: renamed from: W0 */
    public void m17768W0(int i) {
        this.f12325s.setText(m17777p1(i));
        this.f12325s.setTextColor(mxb.f136154d.getOcrResultTipTitleColor(r1c0.f157264d));
        this.f12326t.setBackgroundColor(mxb.f136154d.getOcrResultErrorTipBGColor(r1c0.f157268h));
        this.f12327u.setVisibility(0);
        this.f12326t.setGravity(1);
    }

    /* JADX INFO: renamed from: Y0 */
    public abstract void mo17769Y0();

    /* JADX INFO: renamed from: d1 */
    public abstract void mo17770d1();

    /* JADX INFO: renamed from: f1 */
    public void m17771f1(boolean z) {
        Button button = (Button) findViewById(k4c0.f120973C0);
        if (button != null) {
            button.setEnabled(z);
            if (!z) {
                button.setTextColor(mxb.f136154d.getOcrResultConfirmBtnDisabledTitleColor(r1c0.f157270j));
                Drawable background = button.getBackground();
                if (background instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) background;
                    gradientDrawable.setColor(mxb.f136154d.getOcrResultConfirmBtnDisabledBGColor(s1c0.f161883i));
                    button.setBackground(gradientDrawable);
                    return;
                }
                return;
            }
            button.setTextColor(mxb.f136154d.getOcrResultConfirmBtnEnabledTitleColor(r1c0.f157270j));
            Drawable background2 = button.getBackground();
            ixq0.m138888e("TAG", "background:" + background2.toString());
            if (background2 instanceof GradientDrawable) {
                GradientDrawable gradientDrawable2 = (GradientDrawable) background2;
                gradientDrawable2.setColor(mxb.f136154d.getOcrResultConfirmBtnEnabledBGColor(s1c0.f161876b));
                button.setBackground(gradientDrawable2);
            }
        }
    }

    /* JADX INFO: renamed from: h1 */
    public abstract void mo17772h1();

    /* JADX INFO: renamed from: l1 */
    public void m17773l1() {
        Bitmap bitmapM156856i;
        this.f12323q = (iOSLoadingView) findViewById(k4c0.f120997O0);
        this.f12324r = (Button) findViewById(k4c0.f120973C0);
        TextView textView = (TextView) findViewById(k4c0.f121037f1);
        this.f12325s = textView;
        if (textView != null) {
            textView.setTextColor(mxb.f136154d.getOcrResultTipColor(r1c0.f157262b));
        }
        this.f12326t = (RelativeLayout) findViewById(k4c0.f121025b1);
        ImageView imageView = (ImageView) findViewById(k4c0.f121005S0);
        this.f12327u = imageView;
        if (imageView != null && (bitmapM156856i = mxb.m156856i()) != null) {
            this.f12327u.setImageBitmap(bitmapM156856i);
        }
        this.f12328v = findViewById(k4c0.f121049j1);
        m17774m1();
        this.f12326t.postDelayed(new RunnableC3590g(kcm.m145452H().m145550i0()), 200L);
        TextView textView2 = (TextView) findViewById(k4c0.f121031d1);
        if (textView2 != null) {
            textView2.setTextColor(mxb.f136154d.getOcrResultTitleColor(r1c0.f157262b));
        }
        ImageView imageView2 = (ImageView) findViewById(k4c0.f121003R0);
        Bitmap bitmapM156860m = mxb.m156860m();
        if (bitmapM156860m != null) {
            imageView2.setImageBitmap(bitmapM156860m);
        }
        m17771f1(true);
    }

    /* JADX INFO: renamed from: m1 */
    public void m17774m1() {
        Bitmap bitmapM119246b;
        String string = !TextUtils.isEmpty(rcm.f158788c) ? rcm.f158788c : getResources().getString(R$string.f11997V);
        ImageView imageView = (ImageView) findViewById(k4c0.f121056n);
        if (imageView != null) {
            imageView.getWidth();
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = m17757a1(200.0f);
            layoutParams.width = -1;
            imageView.setLayoutParams(layoutParams);
            Bitmap bitmapM145523Y = kcm.m145452H().m145523Y();
            kcm.m145452H().m145515U();
            if (bitmapM145523Y == null || (bitmapM119246b = f300.m119246b(string, bitmapM145523Y.getWidth(), bitmapM145523Y.getHeight(), (int) getResources().getDimension(n2c0.f136785c), -1, 204)) == null) {
                return;
            }
            Bitmap bitmapM119247c = f300.m119247c(bitmapM145523Y, bitmapM119246b);
            Bitmap bitmapM119245a = bitmapM119247c != null ? f300.m119245a(bitmapM119247c, bitmapM119247c.getWidth(), bitmapM119247c.getHeight(), 10) : f300.m119245a(bitmapM145523Y, bitmapM145523Y.getWidth(), bitmapM145523Y.getHeight(), 10);
            if (bitmapM119245a != null) {
                imageView.setImageBitmap(bitmapM119245a);
            }
            if (bitmapM119246b.isRecycled()) {
                return;
            }
            bitmapM119246b.recycle();
        }
    }

    /* JADX INFO: renamed from: n1 */
    public void m17775n1() {
        View viewFindViewById = findViewById(k4c0.f120972C);
        View viewFindViewById2 = findViewById(k4c0.f121046i1);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(k4c0.f121025b1);
        if (viewFindViewById2 != null) {
            relativeLayout.setBackgroundColor(mxb.f136154d.getOcrResultTipBGColor(r1c0.f157266f));
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC3592i(viewFindViewById2, relativeLayout));
        }
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC3593j());
        }
        m17764H1();
    }

    /* JADX INFO: renamed from: o1 */
    public abstract void mo17776o1();

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m17765I1(getResources().getString(R$string.f11995T), "", getResources().getString(R$string.f11992Q), getResources().getString(R$string.f11986N), "ORC_RES_PAGE_EXIT_CODE", new C3591h());
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo17763G1();
        this.f12311e = System.currentTimeMillis();
        RecordService.getInstance().recordEventPage(RecordLevel.LOG_INFO, "OCR_RESULT_ENTER", "OCR_RESULT");
        Intent intent = getIntent();
        if (intent.hasExtra("sdkMaxTimeout")) {
            Math.max(intent.getLongExtra("sdkMaxTimeout", 0L), 0L);
        }
        if (intent.hasExtra("isEnabled")) {
            this.f12330x = intent.getBooleanExtra("isEnabled", true);
        }
        m17773l1();
        m17775n1();
        m17742F1();
        mo17776o1();
        m17747L1();
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f12331y.removeCallbacksAndMessages(null);
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "destroyIDCardResultActivity", "timeCost", String.valueOf((System.currentTimeMillis() - this.f12311e) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f44446s);
        RecordService.getInstance().flush();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    /* JADX INFO: renamed from: p1 */
    public String m17777p1(int i) {
        return getResources().getString(R$string.f11971F0) + getResources().getString(i);
    }

    /* JADX INFO: renamed from: q1 */
    public void m17778q1(Map<String, String> map) {
        m17779r1(map, true, null);
    }

    /* JADX INFO: renamed from: r1 */
    public void m17779r1(Map<String, String> map, boolean z, byte[] bArr) {
        runOnUiThread(new RunnableC3596m());
        hc20.m130375g(map, z, bArr, new C3597n(System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: s1 */
    public void m17780s1(boolean z) {
    }

    /* JADX INFO: renamed from: u1 */
    public void m17781u1(Message message) {
        String str = (String) message.obj;
        kcm.m145452H().m145537e(str);
        m17758j1(str);
    }

    /* JADX INFO: renamed from: v1 */
    public void m17782v1() {
        m17765I1(getResources().getString(R$string.f11999X), getResources().getString(R$string.f11990P), getResources().getString(R$string.f11993R), getResources().getString(R$string.f11988O), "ORC_RES_PAGE_NET_ERROR_CODE", new C3585b());
    }

    /* JADX INFO: renamed from: w1 */
    public void m17783w1() {
        m17765I1(getResources().getString(R$string.f11978J), getResources().getString(R$string.f11965C0), getResources().getString(R$string.f11993R), null, "ocr_out_time_code", new C3587d());
    }

    /* JADX INFO: renamed from: y1 */
    public void mo17784y1(String str, String str2) {
        m17765I1(str, str2, getResources().getString(R$string.f11993R), null, "ORC_RES_PAGE_INFO_EMPTY_CODE", new C3586c());
    }

    /* JADX INFO: renamed from: z1 */
    public void m17785z1() {
        if (m17745K1(true)) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "onClickStartFaceView", NotificationCompat.CATEGORY_STATUS, "success");
        } else {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "onClickStartFaceView", NotificationCompat.CATEGORY_STATUS, "error");
        }
        m17758j1("success");
    }
}
