package com.idv.identity.ocr.p044ui;

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
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p153l.afm;
import p153l.azb;
import p153l.cc00;
import p153l.cfm;
import p153l.dfm;
import p153l.ffm;
import p153l.hfm;
import p153l.kfm;
import p153l.n8c;
import p153l.o6r0;
import p153l.qk20;
import p153l.rcc0;
import p153l.vac0;
import p153l.y8c0;
import p153l.y9c0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseIDCardResultActivity extends IntlFaceBaseActivity {

    /* JADX INFO: renamed from: q */
    protected iOSLoadingView f13064q;

    /* JADX INFO: renamed from: r */
    private Button f13065r;

    /* JADX INFO: renamed from: s */
    public TextView f13066s;

    /* JADX INFO: renamed from: t */
    public RelativeLayout f13067t;

    /* JADX INFO: renamed from: u */
    public ImageView f13068u;

    /* JADX INFO: renamed from: v */
    private View f13069v;

    /* JADX INFO: renamed from: w */
    protected n8c f13070w;

    /* JADX INFO: renamed from: c */
    protected final int f13050c = 0;

    /* JADX INFO: renamed from: d */
    protected final String f13051d = "nfccard";

    /* JADX INFO: renamed from: e */
    private long f13052e = System.currentTimeMillis();

    /* JADX INFO: renamed from: f */
    private final float f13053f = 0.64285713f;

    /* JADX INFO: renamed from: g */
    private final int f13054g = 1000;

    /* JADX INFO: renamed from: h */
    private final int f13055h = 1001;

    /* JADX INFO: renamed from: i */
    private final int f13056i = 1002;

    /* JADX INFO: renamed from: j */
    private final int f13057j = 1003;

    /* JADX INFO: renamed from: k */
    private final String f13058k = "401";

    /* JADX INFO: renamed from: l */
    private final String f13059l = "402";

    /* JADX INFO: renamed from: m */
    private final String f13060m = "200";

    /* JADX INFO: renamed from: n */
    private boolean f13061n = false;

    /* JADX INFO: renamed from: o */
    private int f13062o = hfm.f109325j;

    /* JADX INFO: renamed from: p */
    public String f13063p = afm.m97360H().m97495v();

    /* JADX INFO: renamed from: x */
    protected boolean f13071x = true;

    /* JADX INFO: renamed from: y */
    public Handler f13072y = new Handler(new C3748f());

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$a */
    public class RunnableC3743a implements Runnable {
        public RunnableC3743a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseIDCardResultActivity.this.f13064q.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$b */
    public class C3744b implements InterfaceC3757o {
        public C3744b() {
        }

        @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity.InterfaceC3757o
        /* JADX INFO: renamed from: a */
        public void mo18863a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "onMessageOCRNetError", NotificationCompat.CATEGORY_STATUS, "retry_onOK");
            BaseIDCardResultActivity.this.mo18850j1();
        }

        @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity.InterfaceC3757o
        public void onCancel() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "userBack", "type", "ocrNetError_onCancel");
            BaseIDCardResultActivity.this.m18818F1(dfm.f88185f);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$c */
    public class C3745c implements InterfaceC3757o {
        public C3745c() {
        }

        @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity.InterfaceC3757o
        /* JADX INFO: renamed from: a */
        public void mo18863a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "onMessageOcrResultNetError", NotificationCompat.CATEGORY_STATUS, "retry_onOK");
            BaseIDCardResultActivity.this.f13065r.setEnabled(true);
            BaseIDCardResultActivity.this.mo18850j1();
        }

        @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity.InterfaceC3757o
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$d */
    public class C3746d implements InterfaceC3757o {
        public C3746d() {
        }

        @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity.InterfaceC3757o
        /* JADX INFO: renamed from: a */
        public void mo18863a() {
            BaseIDCardResultActivity.this.m18819G1();
        }

        @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity.InterfaceC3757o
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$e */
    public class C3747e implements InterfaceC3757o {
        public C3747e() {
        }

        @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity.InterfaceC3757o
        /* JADX INFO: renamed from: a */
        public void mo18863a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "cardScanOutTime", NotificationCompat.CATEGORY_STATUS, "exit_onOK");
            Message message = new Message();
            message.obj = dfm.f88191l;
            BaseIDCardResultActivity.this.m18859v1(message);
        }

        @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity.InterfaceC3757o
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$f */
    public class C3748f implements Handler.Callback {
        public C3748f() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (BaseIDCardResultActivity.this.f13062o <= 0) {
                BaseIDCardResultActivity.this.m18820K1();
                return false;
            }
            if (message == null) {
                return false;
            }
            int i = message.what;
            if (1000 == i) {
                BaseIDCardResultActivity.this.m18818F1(dfm.f88170A);
            } else if (1001 == i) {
                BaseIDCardResultActivity.this.m18837u1((String) message.obj);
            } else if (1002 == i) {
                BaseIDCardResultActivity.m18824N0(BaseIDCardResultActivity.this);
                BaseIDCardResultActivity.this.m18860w1();
            } else if (1003 == i) {
                BaseIDCardResultActivity.m18824N0(BaseIDCardResultActivity.this);
                BaseIDCardResultActivity.this.m18861y1();
            } else if (1 == i) {
                BaseIDCardResultActivity.this.m18858t1(false);
            } else if (i == 0) {
                BaseIDCardResultActivity.this.m18858t1(true);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$g */
    public class RunnableC3749g implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f13079a;

        public RunnableC3749g(String str) {
            this.f13079a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (BaseIDCardResultActivity.this.f13067t != null) {
                if (ffm.f98804g.equals(this.f13079a)) {
                    BaseIDCardResultActivity.this.f13067t.setVisibility(8);
                    return;
                }
                boolean z = hfm.f109320e;
                BaseIDCardResultActivity baseIDCardResultActivity = BaseIDCardResultActivity.this;
                if (z) {
                    baseIDCardResultActivity.f13067t.setVisibility(0);
                } else {
                    baseIDCardResultActivity.f13067t.setVisibility(8);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$h */
    public class C3750h implements InterfaceC3757o {
        public C3750h() {
        }

        @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity.InterfaceC3757o
        /* JADX INFO: renamed from: a */
        public void mo18863a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "keyBack");
            BaseIDCardResultActivity.this.m18818F1(dfm.f88185f);
            BaseIDCardResultActivity.super.onBackPressed();
        }

        @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity.InterfaceC3757o
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$i */
    public class ViewOnClickListenerC3751i implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f13082a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ RelativeLayout f13083b;

        public ViewOnClickListenerC3751i(View view, RelativeLayout relativeLayout) {
            this.f13082a = view;
            this.f13083b = relativeLayout;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f13082a != null) {
                this.f13083b.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$j */
    public class ViewOnClickListenerC3752j implements View.OnClickListener {
        public ViewOnClickListenerC3752j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseIDCardResultActivity.this.m18845W0();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$k */
    public class C3753k implements InterfaceC3757o {
        public C3753k() {
        }

        @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity.InterfaceC3757o
        /* JADX INFO: renamed from: a */
        public void mo18863a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "resultPage close");
            BaseIDCardResultActivity.this.m18818F1(dfm.f88185f);
        }

        @Override // com.idv.identity.ocr.p044ui.BaseIDCardResultActivity.InterfaceC3757o
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$l */
    public class C3754l implements IdentityAlertOverlay.InterfaceC3864d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f13087a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC3757o f13088b;

        public C3754l(String str, InterfaceC3757o interfaceC3757o) {
            this.f13087a = str;
            this.f13088b = interfaceC3757o;
        }

        @Override // com.idv.identity.platform.IdentityAlertOverlay.InterfaceC3864d
        /* JADX INFO: renamed from: a */
        public void mo18769a() {
            RecordService.recordOcrAlertConfirm(this.f13087a, "OCR_RESULT");
            RecordService.recordOcrAlertClose(this.f13087a, "OCR_RESULT");
            InterfaceC3757o interfaceC3757o = this.f13088b;
            if (interfaceC3757o != null) {
                interfaceC3757o.mo18863a();
                BaseIDCardResultActivity.this.m18849h1(true);
                BaseIDCardResultActivity.this.f13061n = false;
            }
        }

        @Override // com.idv.identity.platform.IdentityAlertOverlay.InterfaceC3864d
        public void onCancel() {
            RecordService.recordOcrAlertCancel(this.f13087a, "OCR_RESULT");
            RecordService.recordOcrAlertClose(this.f13087a, "OCR_RESULT");
            InterfaceC3757o interfaceC3757o = this.f13088b;
            if (interfaceC3757o != null) {
                interfaceC3757o.onCancel();
                BaseIDCardResultActivity.this.m18849h1(true);
                BaseIDCardResultActivity.this.f13061n = false;
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$m */
    public class RunnableC3755m implements Runnable {
        public RunnableC3755m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseIDCardResultActivity.this.f13064q.setVisibility(0);
            BaseIDCardResultActivity.this.mo18848f1();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$n */
    public class C3756n implements kfm {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f13091a;

        /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$n$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f13093a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ String f13094b;

            public a(String str, String str2) {
                this.f13093a = str;
                this.f13094b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str;
                if (this.f13093a.equals("200")) {
                    BaseIDCardResultActivity.this.mo18847a1();
                    BaseIDCardResultActivity.this.m18844O1();
                    return;
                }
                try {
                    if (cfm.f81522h.equals(BaseIDCardResultActivity.this.f13063p)) {
                        str = "identity_ocr_result_id_mainland_" + this.f13094b;
                    } else if (cfm.f81515a.equals(BaseIDCardResultActivity.this.f13063p) && (this.f13094b.equals("surname") || this.f13094b.equals("givenname"))) {
                        str = "identity_ocr_result_id_passport_" + this.f13094b;
                    } else {
                        str = "identity_ocr_result_id_" + this.f13094b;
                    }
                    int identifier = BaseIDCardResultActivity.this.getResources().getIdentifier(str, "string", BaseIDCardResultActivity.this.getPackageName());
                    if (this.f13093a.equals("401")) {
                        BaseIDCardResultActivity baseIDCardResultActivity = BaseIDCardResultActivity.this;
                        baseIDCardResultActivity.mo18862z1(String.format(baseIDCardResultActivity.getResources().getString(R$string.f12718I0), BaseIDCardResultActivity.this.getResources().getString(identifier)), "");
                    } else if (this.f13093a.equals("402")) {
                        BaseIDCardResultActivity baseIDCardResultActivity2 = BaseIDCardResultActivity.this;
                        baseIDCardResultActivity2.mo18862z1(baseIDCardResultActivity2.getResources().getString(R$string.f12708D0), BaseIDCardResultActivity.this.getResources().getString(R$string.f12712F0) + BaseIDCardResultActivity.this.getResources().getString(identifier) + BaseIDCardResultActivity.this.getResources().getString(R$string.f12714G0));
                    }
                } catch (Exception e) {
                    RecordService.getInstance().recordException(e);
                }
            }
        }

        public C3756n(long j) {
            this.f13091a = j;
        }

        @Override // p153l.kfm
        /* JADX INFO: renamed from: a */
        public void mo18864a(String str, String str2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "ocrDeviceResultCost", NotificationCompat.CATEGORY_STATUS, "error", "code", str, "msg", str2, "tag", "onError", "timeCost", String.valueOf((System.currentTimeMillis() - this.f13091a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f45294s);
            BaseIDCardResultActivity.this.m18836l1();
            BaseIDCardResultActivity.this.f13072y.sendEmptyMessage(1002);
        }

        @Override // p153l.kfm
        /* JADX INFO: renamed from: b */
        public void mo18865b(String str, String str2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "ocrDeviceResultCost", NotificationCompat.CATEGORY_STATUS, "success", "param", str2, "timeCost", String.valueOf((System.currentTimeMillis() - this.f13091a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f45294s);
            BaseIDCardResultActivity.this.m18836l1();
            BaseIDCardResultActivity.this.runOnUiThread(new a(str, str2));
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.BaseIDCardResultActivity$o */
    public interface InterfaceC3757o {
        /* JADX INFO: renamed from: a */
        void mo18863a();

        void onCancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F1 */
    public void m18818F1(String str) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1001;
        messageObtain.obj = str;
        this.f13072y.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G1 */
    public void m18819G1() {
        int i = hfm.f109328m;
        Handler handler = this.f13072y;
        if (i <= 0) {
            handler.sendEmptyMessageDelayed(1003, hfm.f109329n * 20);
        } else {
            handler.sendEmptyMessageDelayed(1003, i * hfm.f109329n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K1 */
    public void m18820K1() {
        m18843J1(getResources().getString(R$string.f12754f0), "", getResources().getString(R$string.f12733Q), null, "ocr_over_time_code", new C3747e());
    }

    /* JADX INFO: renamed from: L1 */
    private boolean m18822L1(boolean z) {
        try {
            return ((Boolean) getClassLoader().loadClass("com.idv.identity.face.IdentityFaceApi").getDeclaredMethod("start", Context.class, Boolean.TYPE).invoke(null, this, Boolean.valueOf(z))).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "startFace", NotificationCompat.CATEGORY_STATUS, "catchException", "exception", e.toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: M1 */
    private void m18823M1() {
        ArrayList arrayList = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) findViewById(rcc0.f162179p);
        if (viewGroup != null) {
            m18833Y0(viewGroup, arrayList);
        }
        arrayList.size();
        String strM97458i0 = afm.m97360H().m97458i0();
        for (View view : arrayList) {
            if (ffm.f98804g.equals(strM97458i0)) {
                view.setEnabled(false);
            } else {
                view.setEnabled(hfm.f109320e);
            }
        }
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ int m18824N0(BaseIDCardResultActivity baseIDCardResultActivity) {
        int i = baseIDCardResultActivity.f13062o;
        baseIDCardResultActivity.f13062o = i - 1;
        return i;
    }

    /* JADX INFO: renamed from: Y0 */
    private void m18833Y0(ViewGroup viewGroup, List<View> list) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof EditText) {
                list.add(childAt);
            } else if (childAt instanceof TextView) {
                list.add(childAt);
            } else if (childAt instanceof ViewGroup) {
                list.add(childAt);
                m18833Y0((ViewGroup) childAt, list);
            }
        }
    }

    /* JADX INFO: renamed from: d1 */
    private int m18834d1(float f) {
        return (int) ((f * getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: k1 */
    private void m18835k1(String str) {
        RecordService.getInstance().recordEventPage(RecordLevel.LOG_ERROR, "OCR_RESULT_EXIT", "OCR_RESULT", (System.currentTimeMillis() - this.f13052e) + "ms", str);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public void m18836l1() {
        runOnUiThread(new RunnableC3743a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public void m18837u1(String str) {
        this.f13072y.removeMessages(1000);
        afm.m97360H().m97445e(str);
        m18835k1(str);
    }

    /* JADX INFO: renamed from: B1 */
    public void m18838B1() {
        if (m18822L1(true)) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "onClickStartFaceView", NotificationCompat.CATEGORY_STATUS, "success");
        } else {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "onClickStartFaceView", NotificationCompat.CATEGORY_STATUS, "error");
        }
        m18835k1("success");
    }

    /* JADX INFO: renamed from: C1 */
    public void m18839C1() {
        startActivity(new Intent(this, (Class<?>) FinalVerifyActivity.class));
        m18835k1("success");
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "onClickStartVerifyView", NotificationCompat.CATEGORY_STATUS, "success");
    }

    /* JADX INFO: renamed from: E1 */
    public void m18840E1() {
        this.f13066s.setText(getResources().getString(R$string.f12720J0));
        this.f13066s.setTextColor(azb.f74128d.getOcrResultTipColor(y9c0.f198077b));
        this.f13067t.setBackgroundColor(azb.f74128d.getOcrResultTipBGColor(y9c0.f198081f));
        this.f13068u.setVisibility(8);
        this.f13067t.setGravity(16);
    }

    /* JADX INFO: renamed from: H1 */
    public abstract void mo18841H1();

    /* JADX INFO: renamed from: I1 */
    public void m18842I1() {
        GradientDrawable gradientDrawable;
        Button button = this.f13065r;
        if (button == null || (gradientDrawable = (GradientDrawable) button.getBackground()) == null) {
            return;
        }
        String str = hfm.f109321f;
        if (str == null || TextUtils.isEmpty(str)) {
            m18849h1(true);
        } else {
            gradientDrawable.setColor(Color.parseColor(hfm.f109321f));
        }
    }

    /* JADX INFO: renamed from: J1 */
    public void m18843J1(String str, String str2, String str3, String str4, String str5, InterfaceC3757o interfaceC3757o) {
        RecordService.recordOcrAlertAppear(str5, "OCR_RESULT");
        if (this.f13061n) {
            return;
        }
        m18849h1(false);
        this.f13061n = true;
        IdentityAlertOverlay identityAlertOverlay = (IdentityAlertOverlay) findViewById(rcc0.f162142b);
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
            azb.m101041a(identityAlertOverlay, azb.m101060t(str5));
            identityAlertOverlay.setCommAlertOverlayListener(new C3754l(str5, interfaceC3757o));
        }
    }

    /* JADX INFO: renamed from: O1 */
    public void m18844O1() {
        String strM97458i0;
        if (isFinishing() || (strM97458i0 = afm.m97360H().m97458i0()) == null) {
            return;
        }
        if (ffm.f98801d.equals(strM97458i0) || ffm.f98804g.equals(strM97458i0)) {
            m18839C1();
        } else if (ffm.f98802e.equals(strM97458i0)) {
            m18838B1();
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m18845W0() {
        RecordService.getInstance().recordEventBehavior(RecordLevel.LOG_INFO, "PAGER_BEHAVIOR", "exitVerifyBtn", "OCR_RESULT");
        m18843J1(getResources().getString(R$string.f12736T), "", getResources().getString(R$string.f12733Q), getResources().getString(R$string.f12727N), "ORC_RES_PAGE_EXIT_CODE", new C3753k());
    }

    /* JADX INFO: renamed from: X0 */
    public void m18846X0(int i) {
        this.f13066s.setText(m18855q1(i));
        this.f13066s.setTextColor(azb.f74128d.getOcrResultTipTitleColor(y9c0.f198079d));
        this.f13067t.setBackgroundColor(azb.f74128d.getOcrResultErrorTipBGColor(y9c0.f198083h));
        this.f13068u.setVisibility(0);
        this.f13067t.setGravity(1);
    }

    /* JADX INFO: renamed from: a1 */
    public abstract void mo18847a1();

    /* JADX INFO: renamed from: f1 */
    public abstract void mo18848f1();

    /* JADX INFO: renamed from: h1 */
    public void m18849h1(boolean z) {
        Button button = (Button) findViewById(rcc0.f162092C0);
        if (button != null) {
            button.setEnabled(z);
            if (!z) {
                button.setTextColor(azb.f74128d.getOcrResultConfirmBtnDisabledTitleColor(y9c0.f198085j));
                Drawable background = button.getBackground();
                if (background instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) background;
                    gradientDrawable.setColor(azb.f74128d.getOcrResultConfirmBtnDisabledBGColor(y8c0.f197994i));
                    button.setBackground(gradientDrawable);
                    return;
                }
                return;
            }
            button.setTextColor(azb.f74128d.getOcrResultConfirmBtnEnabledTitleColor(y9c0.f198085j));
            Drawable background2 = button.getBackground();
            o6r0.m166285e("TAG", "background:" + background2.toString());
            if (background2 instanceof GradientDrawable) {
                GradientDrawable gradientDrawable2 = (GradientDrawable) background2;
                gradientDrawable2.setColor(azb.f74128d.getOcrResultConfirmBtnEnabledBGColor(y8c0.f197987b));
                button.setBackground(gradientDrawable2);
            }
        }
    }

    /* JADX INFO: renamed from: j1 */
    public abstract void mo18850j1();

    /* JADX INFO: renamed from: m1 */
    public void m18851m1() {
        Bitmap bitmapM101049i;
        this.f13064q = (iOSLoadingView) findViewById(rcc0.f162116O0);
        this.f13065r = (Button) findViewById(rcc0.f162092C0);
        TextView textView = (TextView) findViewById(rcc0.f162156f1);
        this.f13066s = textView;
        if (textView != null) {
            textView.setTextColor(azb.f74128d.getOcrResultTipColor(y9c0.f198077b));
        }
        this.f13067t = (RelativeLayout) findViewById(rcc0.f162144b1);
        ImageView imageView = (ImageView) findViewById(rcc0.f162124S0);
        this.f13068u = imageView;
        if (imageView != null && (bitmapM101049i = azb.m101049i()) != null) {
            this.f13068u.setImageBitmap(bitmapM101049i);
        }
        this.f13069v = findViewById(rcc0.f162168j1);
        m18852n1();
        this.f13067t.postDelayed(new RunnableC3749g(afm.m97360H().m97458i0()), 200L);
        TextView textView2 = (TextView) findViewById(rcc0.f162150d1);
        if (textView2 != null) {
            textView2.setTextColor(azb.f74128d.getOcrResultTitleColor(y9c0.f198077b));
        }
        ImageView imageView2 = (ImageView) findViewById(rcc0.f162122R0);
        Bitmap bitmapM101053m = azb.m101053m();
        if (bitmapM101053m != null) {
            imageView2.setImageBitmap(bitmapM101053m);
        }
        m18849h1(true);
    }

    /* JADX INFO: renamed from: n1 */
    public void m18852n1() {
        Bitmap bitmapM108699b;
        String string = !TextUtils.isEmpty(hfm.f109318c) ? hfm.f109318c : getResources().getString(R$string.f12738V);
        ImageView imageView = (ImageView) findViewById(rcc0.f162175n);
        if (imageView != null) {
            imageView.getWidth();
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = m18834d1(200.0f);
            layoutParams.width = -1;
            imageView.setLayoutParams(layoutParams);
            Bitmap bitmapM97431Y = afm.m97360H().m97431Y();
            afm.m97360H().m97423U();
            if (bitmapM97431Y == null || (bitmapM108699b = cc00.m108699b(string, bitmapM97431Y.getWidth(), bitmapM97431Y.getHeight(), (int) getResources().getDimension(vac0.f183080c), -1, 204)) == null) {
                return;
            }
            Bitmap bitmapM108700c = cc00.m108700c(bitmapM97431Y, bitmapM108699b);
            Bitmap bitmapM108698a = bitmapM108700c != null ? cc00.m108698a(bitmapM108700c, bitmapM108700c.getWidth(), bitmapM108700c.getHeight(), 10) : cc00.m108698a(bitmapM97431Y, bitmapM97431Y.getWidth(), bitmapM97431Y.getHeight(), 10);
            if (bitmapM108698a != null) {
                imageView.setImageBitmap(bitmapM108698a);
            }
            if (bitmapM108699b.isRecycled()) {
                return;
            }
            bitmapM108699b.recycle();
        }
    }

    /* JADX INFO: renamed from: o1 */
    public void m18853o1() {
        View viewFindViewById = findViewById(rcc0.f162091C);
        View viewFindViewById2 = findViewById(rcc0.f162165i1);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(rcc0.f162144b1);
        if (viewFindViewById2 != null) {
            relativeLayout.setBackgroundColor(azb.f74128d.getOcrResultTipBGColor(y9c0.f198081f));
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC3751i(viewFindViewById2, relativeLayout));
        }
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC3752j());
        }
        m18842I1();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m18843J1(getResources().getString(R$string.f12736T), "", getResources().getString(R$string.f12733Q), getResources().getString(R$string.f12727N), "ORC_RES_PAGE_EXIT_CODE", new C3750h());
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo18841H1();
        this.f13052e = System.currentTimeMillis();
        RecordService.getInstance().recordEventPage(RecordLevel.LOG_INFO, "OCR_RESULT_ENTER", "OCR_RESULT");
        Intent intent = getIntent();
        if (intent.hasExtra("sdkMaxTimeout")) {
            Math.max(intent.getLongExtra("sdkMaxTimeout", 0L), 0L);
        }
        if (intent.hasExtra("isEnabled")) {
            this.f13071x = intent.getBooleanExtra("isEnabled", true);
        }
        m18851m1();
        m18853o1();
        m18819G1();
        mo18854p1();
        m18823M1();
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f13072y.removeCallbacksAndMessages(null);
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "destroyIDCardResultActivity", "timeCost", String.valueOf((System.currentTimeMillis() - this.f13052e) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f45294s);
        RecordService.getInstance().flush();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    /* JADX INFO: renamed from: p1 */
    public abstract void mo18854p1();

    /* JADX INFO: renamed from: q1 */
    public String m18855q1(int i) {
        return getResources().getString(R$string.f12712F0) + getResources().getString(i);
    }

    /* JADX INFO: renamed from: r1 */
    public void m18856r1(Map<String, String> map) {
        m18857s1(map, true, null);
    }

    /* JADX INFO: renamed from: s1 */
    public void m18857s1(Map<String, String> map, boolean z, byte[] bArr) {
        runOnUiThread(new RunnableC3755m());
        qk20.m176910g(map, z, bArr, new C3756n(System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: t1 */
    public void m18858t1(boolean z) {
    }

    /* JADX INFO: renamed from: v1 */
    public void m18859v1(Message message) {
        String str = (String) message.obj;
        afm.m97360H().m97445e(str);
        m18835k1(str);
    }

    /* JADX INFO: renamed from: w1 */
    public void m18860w1() {
        m18843J1(getResources().getString(R$string.f12740X), getResources().getString(R$string.f12731P), getResources().getString(R$string.f12734R), getResources().getString(R$string.f12729O), "ORC_RES_PAGE_NET_ERROR_CODE", new C3744b());
    }

    /* JADX INFO: renamed from: y1 */
    public void m18861y1() {
        m18843J1(getResources().getString(R$string.f12719J), getResources().getString(R$string.f12706C0), getResources().getString(R$string.f12734R), null, "ocr_out_time_code", new C3746d());
    }

    /* JADX INFO: renamed from: z1 */
    public void mo18862z1(String str, String str2) {
        m18843J1(str, str2, getResources().getString(R$string.f12734R), null, "ORC_RES_PAGE_INFO_EMPTY_CODE", new C3745c());
    }
}
