package com.idv.identity.ocr.p037ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.idv.identity.base.R$string;
import com.idv.identity.ocr.widget.CardPreviewWidget;
import com.idv.identity.platform.IdentityAlertOverlay;
import com.idv.identity.platform.IntlFaceBaseActivity;
import com.idv.identity.platform.iOSLoadingView;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import p149l.e1q;
import p149l.hc20;
import p149l.ixq0;
import p149l.k4c0;
import p149l.kcm;
import p149l.mxb;
import p149l.ncm;
import p149l.pcm;
import p149l.r1c0;
import p149l.r250;
import p149l.rcm;
import p149l.s1c0;
import p149l.ucm;
import p149l.x5c0;

/* JADX INFO: loaded from: classes7.dex */
public class IDCardResultProActivity extends IntlFaceBaseActivity {

    /* JADX INFO: renamed from: k */
    protected iOSLoadingView f12521k;

    /* JADX INFO: renamed from: l */
    public TextView f12522l;

    /* JADX INFO: renamed from: m */
    private Button f12523m;

    /* JADX INFO: renamed from: n */
    private RecyclerView f12524n;

    /* JADX INFO: renamed from: o */
    public RelativeLayout f12525o;

    /* JADX INFO: renamed from: p */
    public ImageView f12526p;

    /* JADX INFO: renamed from: q */
    private r250 f12527q;

    /* JADX INFO: renamed from: c */
    private long f12513c = System.currentTimeMillis();

    /* JADX INFO: renamed from: d */
    private boolean f12514d = false;

    /* JADX INFO: renamed from: e */
    private final int f12515e = 1000;

    /* JADX INFO: renamed from: f */
    private final int f12516f = 1001;

    /* JADX INFO: renamed from: g */
    private final int f12517g = 1002;

    /* JADX INFO: renamed from: h */
    private final int f12518h = 1003;

    /* JADX INFO: renamed from: i */
    private int f12519i = rcm.f158795j;

    /* JADX INFO: renamed from: j */
    private final String f12520j = "200";

    /* JADX INFO: renamed from: r */
    public Handler f12528r = new Handler(new C3649d());

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.IDCardResultProActivity$a */
    public class C3646a implements InterfaceC3658m {
        public C3646a() {
        }

        @Override // com.idv.identity.ocr.p037ui.IDCardResultProActivity.InterfaceC3658m
        /* JADX INFO: renamed from: a */
        public void mo17992a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "cardScanOutTime", NotificationCompat.CATEGORY_STATUS, "exit_onOK");
            Message message = new Message();
            message.obj = ncm.f138202l;
            IDCardResultProActivity.this.m17986o1(message);
        }

        @Override // com.idv.identity.ocr.p037ui.IDCardResultProActivity.InterfaceC3658m
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.IDCardResultProActivity$b */
    public class C3647b implements InterfaceC3658m {
        public C3647b() {
        }

        @Override // com.idv.identity.ocr.p037ui.IDCardResultProActivity.InterfaceC3658m
        /* JADX INFO: renamed from: a */
        public void mo17992a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "onMessageOCRNetError", NotificationCompat.CATEGORY_STATUS, "retry_onOK");
            IDCardResultProActivity.this.m17968a1();
        }

        @Override // com.idv.identity.ocr.p037ui.IDCardResultProActivity.InterfaceC3658m
        public void onCancel() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "userBack", "type", "ocrNetError_onCancel");
            IDCardResultProActivity.this.m17974s1(ncm.f138196f);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.IDCardResultProActivity$c */
    public class C3648c implements InterfaceC3658m {
        public C3648c() {
        }

        @Override // com.idv.identity.ocr.p037ui.IDCardResultProActivity.InterfaceC3658m
        /* JADX INFO: renamed from: a */
        public void mo17992a() {
            IDCardResultProActivity.this.m17975t1();
        }

        @Override // com.idv.identity.ocr.p037ui.IDCardResultProActivity.InterfaceC3658m
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.IDCardResultProActivity$d */
    public class C3649d implements Handler.Callback {
        public C3649d() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (IDCardResultProActivity.this.f12519i <= 0) {
                IDCardResultProActivity.this.m17976w1();
                return false;
            }
            if (message == null) {
                return false;
            }
            int i = message.what;
            if (1000 == i) {
                IDCardResultProActivity.this.m17974s1(ncm.f138181A);
            } else if (1001 == i) {
                IDCardResultProActivity.this.m17973n1((String) message.obj);
            } else if (1002 == i) {
                IDCardResultProActivity.m17958L0(IDCardResultProActivity.this);
                IDCardResultProActivity.this.m17987p1();
            } else if (1003 == i) {
                IDCardResultProActivity.m17958L0(IDCardResultProActivity.this);
                IDCardResultProActivity.this.m17988q1();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.IDCardResultProActivity$e */
    public class ViewOnClickListenerC3650e implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f12533a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ RelativeLayout f12534b;

        public ViewOnClickListenerC3650e(View view, RelativeLayout relativeLayout) {
            this.f12533a = view;
            this.f12534b = relativeLayout;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f12533a != null) {
                this.f12534b.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.IDCardResultProActivity$f */
    public class ViewOnClickListenerC3651f implements View.OnClickListener {
        public ViewOnClickListenerC3651f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IDCardResultProActivity.this.m17980W0();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.IDCardResultProActivity$g */
    public class ViewOnClickListenerC3652g implements View.OnClickListener {
        public ViewOnClickListenerC3652g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HashMap map = new HashMap();
            Map<String, Object> mapM177565z = IDCardResultProActivity.this.f12527q.m177565z();
            if (mapM177565z != null) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "ocrInfoData", "dataList", mapM177565z.toString());
                map.put("ocrInfoData", JSON.toJSONString(mapM177565z));
            }
            IDCardResultProActivity.this.m17984l1(map);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.IDCardResultProActivity$h */
    public class C3653h implements InterfaceC3658m {
        public C3653h() {
        }

        @Override // com.idv.identity.ocr.p037ui.IDCardResultProActivity.InterfaceC3658m
        /* JADX INFO: renamed from: a */
        public void mo17992a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "resultPage close");
            IDCardResultProActivity.this.m17974s1(ncm.f138196f);
        }

        @Override // com.idv.identity.ocr.p037ui.IDCardResultProActivity.InterfaceC3658m
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.IDCardResultProActivity$i */
    public class C3654i implements IdentityAlertOverlay.InterfaceC3705d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f12539a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC3658m f12540b;

        public C3654i(String str, InterfaceC3658m interfaceC3658m) {
            this.f12539a = str;
            this.f12540b = interfaceC3658m;
        }

        @Override // com.idv.identity.platform.IdentityAlertOverlay.InterfaceC3705d
        /* JADX INFO: renamed from: a */
        public void mo17692a() {
            RecordService.recordOcrAlertConfirm(this.f12539a, "OCR_RESULT");
            RecordService.recordOcrAlertClose(this.f12539a, "OCR_RESULT");
            InterfaceC3658m interfaceC3658m = this.f12540b;
            if (interfaceC3658m != null) {
                interfaceC3658m.mo17992a();
                IDCardResultProActivity.this.m17982Y0(true);
                IDCardResultProActivity.this.f12514d = false;
            }
        }

        @Override // com.idv.identity.platform.IdentityAlertOverlay.InterfaceC3705d
        public void onCancel() {
            RecordService.recordOcrAlertCancel(this.f12539a, "OCR_RESULT");
            RecordService.recordOcrAlertClose(this.f12539a, "OCR_RESULT");
            InterfaceC3658m interfaceC3658m = this.f12540b;
            if (interfaceC3658m != null) {
                interfaceC3658m.onCancel();
                IDCardResultProActivity.this.m17982Y0(true);
                IDCardResultProActivity.this.f12514d = false;
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.IDCardResultProActivity$j */
    public class C3655j implements ucm {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f12542a;

        /* JADX INFO: renamed from: com.idv.identity.ocr.ui.IDCardResultProActivity$j$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f12544a;

            public a(String str) {
                this.f12544a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f12544a.equals("200")) {
                    IDCardResultProActivity.this.m17981X0();
                    IDCardResultProActivity.this.m17979B1();
                }
            }
        }

        public C3655j(long j) {
            this.f12542a = j;
        }

        @Override // p149l.ucm
        /* JADX INFO: renamed from: a */
        public void mo17787a(String str, String str2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "ocrDeviceResultCost", NotificationCompat.CATEGORY_STATUS, "error", "code", str, "msg", str2, "tag", "onError", "timeCost", String.valueOf((System.currentTimeMillis() - this.f12542a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f44446s);
            IDCardResultProActivity.this.m17970f1();
            IDCardResultProActivity.this.f12528r.sendEmptyMessage(1002);
        }

        @Override // p149l.ucm
        /* JADX INFO: renamed from: b */
        public void mo17788b(String str, String str2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "ocrDeviceResultCost", NotificationCompat.CATEGORY_STATUS, "success", "param", str2, "timeCost", String.valueOf((System.currentTimeMillis() - this.f12542a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f44446s);
            IDCardResultProActivity.this.m17970f1();
            IDCardResultProActivity.this.runOnUiThread(new a(str));
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.IDCardResultProActivity$k */
    public class RunnableC3656k implements Runnable {
        public RunnableC3656k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IDCardResultProActivity.this.f12521k.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.IDCardResultProActivity$l */
    public class C3657l implements InterfaceC3658m {
        public C3657l() {
        }

        @Override // com.idv.identity.ocr.p037ui.IDCardResultProActivity.InterfaceC3658m
        /* JADX INFO: renamed from: a */
        public void mo17992a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "keyBack");
            IDCardResultProActivity.this.m17974s1(ncm.f138196f);
            IDCardResultProActivity.super.onBackPressed();
        }

        @Override // com.idv.identity.ocr.p037ui.IDCardResultProActivity.InterfaceC3658m
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.IDCardResultProActivity$m */
    public interface InterfaceC3658m {
        /* JADX INFO: renamed from: a */
        void mo17992a();

        void onCancel();
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ int m17958L0(IDCardResultProActivity iDCardResultProActivity) {
        int i = iDCardResultProActivity.f12519i;
        iDCardResultProActivity.f12519i = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public void m17968a1() {
    }

    /* JADX INFO: renamed from: d1 */
    private void m17969d1(String str) {
        RecordService.getInstance().recordEventPage(RecordLevel.LOG_ERROR, "OCR_RESULT_EXIT", "OCR_RESULT", (System.currentTimeMillis() - this.f12513c) + "ms", str);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public void m17970f1() {
        runOnUiThread(new RunnableC3656k());
    }

    /* JADX INFO: renamed from: h1 */
    private void m17971h1() {
        Bitmap bitmapM156856i;
        ImageView imageView = (ImageView) findViewById(k4c0.f121003R0);
        Bitmap bitmapM156860m = mxb.m156860m();
        if (bitmapM156860m != null) {
            imageView.setImageBitmap(bitmapM156860m);
        }
        TextView textView = (TextView) findViewById(k4c0.f121031d1);
        if (textView != null) {
            textView.setTextColor(mxb.f136154d.getOcrResultTitleColor(r1c0.f157262b));
        }
        this.f12523m = (Button) findViewById(k4c0.f120973C0);
        this.f12524n = (RecyclerView) findViewById(k4c0.f121058o);
        this.f12521k = (iOSLoadingView) findViewById(k4c0.f120997O0);
        TextView textView2 = (TextView) findViewById(k4c0.f121037f1);
        this.f12522l = textView2;
        if (textView2 != null) {
            textView2.setTextColor(mxb.f136154d.getOcrResultTipColor(r1c0.f157262b));
        }
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(k4c0.f121025b1);
        this.f12525o = relativeLayout;
        if (relativeLayout != null) {
            if (rcm.f158790e) {
                relativeLayout.setVisibility(0);
            } else {
                relativeLayout.setVisibility(8);
            }
        }
        ImageView imageView2 = (ImageView) findViewById(k4c0.f121005S0);
        this.f12526p = imageView2;
        if (imageView2 != null && (bitmapM156856i = mxb.m156856i()) != null) {
            this.f12526p.setImageBitmap(bitmapM156856i);
        }
        m17983j1();
        this.f12524n = (RecyclerView) findViewById(k4c0.f121058o);
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> mapM145503Q = kcm.m145452H().m145503Q();
        TextView textView3 = this.f12522l;
        if (mapM145503Q != null) {
            textView3.setText(getText(R$string.f12027m0));
            for (Map.Entry<String, Object> entry : mapM145503Q.entrySet()) {
                if (!linkedHashMap.containsKey(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        } else {
            textView3.setText(getText(R$string.f11979J0));
        }
        if (rcm.f158789d) {
            linkedHashMap.putAll(kcm.m145452H().m145500P());
            Map<String, Object> mapM145494N = kcm.m145452H().m145494N();
            if (mapM145494N != null) {
                for (Map.Entry<String, Object> entry2 : mapM145494N.entrySet()) {
                    if (!linkedHashMap.containsKey(entry2.getKey())) {
                        linkedHashMap.put(entry2.getKey(), entry2.getValue());
                    }
                }
            }
        }
        ixq0.m138885b("TAG", "ocrCardProInfo:" + linkedHashMap);
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            arrayList.add(new e1q((String) entry3.getKey(), entry3.getValue().toString()));
        }
        this.f12524n.setLayoutManager(new LinearLayoutManager(this));
        r250 r250Var = new r250(arrayList);
        this.f12527q = r250Var;
        this.f12524n.setAdapter(r250Var);
    }

    /* JADX INFO: renamed from: k1 */
    private void m17972k1() {
        View viewFindViewById = findViewById(k4c0.f120972C);
        View viewFindViewById2 = findViewById(k4c0.f121046i1);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(k4c0.f121025b1);
        if (viewFindViewById2 != null) {
            relativeLayout.setBackgroundColor(mxb.f136154d.getOcrResultTipBGColor(r1c0.f157266f));
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC3650e(viewFindViewById2, relativeLayout));
        }
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC3651f());
        }
        m17990u1();
        this.f12523m.setOnClickListener(new ViewOnClickListenerC3652g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public void m17973n1(String str) {
        this.f12528r.removeMessages(1000);
        kcm.m145452H().m145537e(str);
        m17969d1(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public void m17974s1(String str) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1001;
        messageObtain.obj = str;
        this.f12528r.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public void m17975t1() {
        int i = rcm.f158798m;
        Handler handler = this.f12528r;
        if (i <= 0) {
            handler.sendEmptyMessageDelayed(1003, rcm.f158799n * 60);
        } else {
            handler.sendEmptyMessageDelayed(1003, i * rcm.f158799n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w1 */
    public void m17976w1() {
        m17991v1(getResources().getString(R$string.f12013f0), "", getResources().getString(R$string.f11992Q), null, "ocr_over_time_code", new C3646a());
    }

    /* JADX INFO: renamed from: y1 */
    private boolean m17977y1(boolean z) {
        try {
            return ((Boolean) getClassLoader().loadClass("com.idv.identity.face.IdentityFaceApi").getDeclaredMethod("start", Context.class, Boolean.TYPE).invoke(null, this, Boolean.valueOf(z))).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "startFace", NotificationCompat.CATEGORY_STATUS, "catchException", "exception", e.toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: z1 */
    private void m17978z1() {
        r250 r250Var = this.f12527q;
        if (r250Var != null) {
            r250Var.m177564D(rcm.f158790e);
        }
    }

    /* JADX INFO: renamed from: B1 */
    public void m17979B1() {
        String strM145550i0;
        if (isFinishing() || (strM145550i0 = kcm.m145452H().m145550i0()) == null || !pcm.f148193f.equals(strM145550i0)) {
            return;
        }
        m17989r1();
    }

    /* JADX INFO: renamed from: W0 */
    public void m17980W0() {
        RecordService.getInstance().recordEventBehavior(RecordLevel.LOG_INFO, "PAGER_BEHAVIOR", "exitVerifyBtn", "OCR_RESULT");
        m17991v1(getResources().getString(R$string.f11995T), "", getResources().getString(R$string.f11992Q), getResources().getString(R$string.f11986N), "ORC_RES_PAGE_EXIT_CODE", new C3653h());
    }

    /* JADX INFO: renamed from: X0 */
    public void m17981X0() {
    }

    /* JADX INFO: renamed from: Y0 */
    public void m17982Y0(boolean z) {
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
            background2.toString();
            if (background2 instanceof GradientDrawable) {
                GradientDrawable gradientDrawable2 = (GradientDrawable) background2;
                gradientDrawable2.setColor(mxb.f136154d.getOcrResultConfirmBtnEnabledBGColor(s1c0.f161876b));
                button.setBackground(gradientDrawable2);
            }
        }
    }

    /* JADX INFO: renamed from: j1 */
    public void m17983j1() {
        CardPreviewWidget cardPreviewWidget = (CardPreviewWidget) findViewById(k4c0.f121020a);
        if (kcm.m145452H().m145584u() >= 2) {
            cardPreviewWidget.m18048d(kcm.m145452H().m145523Y(), kcm.m145452H().m145515U());
        } else {
            cardPreviewWidget.m18049e(kcm.m145452H().m145523Y());
        }
    }

    /* JADX INFO: renamed from: l1 */
    public void m17984l1(Map<String, String> map) {
        m17985m1(map, true, null);
    }

    /* JADX INFO: renamed from: m1 */
    public void m17985m1(Map<String, String> map, boolean z, byte[] bArr) {
        this.f12521k.setVisibility(0);
        hc20.m130375g(map, z, bArr, new C3655j(System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: o1 */
    public void m17986o1(Message message) {
        String str = (String) message.obj;
        kcm.m145452H().m145537e(str);
        m17969d1(str);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m17991v1(getResources().getString(R$string.f11995T), "", getResources().getString(R$string.f11992Q), getResources().getString(R$string.f11986N), "ORC_RES_PAGE_EXIT_CODE", new C3657l());
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(x5c0.f191116d);
        this.f12513c = System.currentTimeMillis();
        RecordService.getInstance().recordEventPage(RecordLevel.LOG_INFO, "OCR_RESULT_ENTER", "OCR_RESULT");
        m17971h1();
        m17972k1();
        m17975t1();
        m17978z1();
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f12528r.removeCallbacksAndMessages(null);
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "destroyIDCardResultActivity", "timeCost", String.valueOf((System.currentTimeMillis() - this.f12513c) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f44446s);
        RecordService.getInstance().flush();
    }

    /* JADX INFO: renamed from: p1 */
    public void m17987p1() {
        m17991v1(getResources().getString(R$string.f11999X), getResources().getString(R$string.f11990P), getResources().getString(R$string.f11993R), getResources().getString(R$string.f11988O), "ORC_RES_PAGE_NET_ERROR_CODE", new C3647b());
    }

    /* JADX INFO: renamed from: q1 */
    public void m17988q1() {
        m17991v1(getResources().getString(R$string.f11978J), getResources().getString(R$string.f11965C0), getResources().getString(R$string.f11993R), null, "ocr_out_time_code", new C3648c());
    }

    /* JADX INFO: renamed from: r1 */
    public void m17989r1() {
        if (m17977y1(true)) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "onClickStartFaceView", NotificationCompat.CATEGORY_STATUS, "success");
        } else {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "onClickStartFaceView", NotificationCompat.CATEGORY_STATUS, "error");
        }
        m17969d1("success");
    }

    /* JADX INFO: renamed from: u1 */
    public void m17990u1() {
        GradientDrawable gradientDrawable;
        Button button = this.f12523m;
        if (button == null || (gradientDrawable = (GradientDrawable) button.getBackground()) == null) {
            return;
        }
        String str = rcm.f158791f;
        if (str == null || TextUtils.isEmpty(str)) {
            m17982Y0(true);
        } else {
            gradientDrawable.setColor(Color.parseColor(rcm.f158791f));
        }
    }

    /* JADX INFO: renamed from: v1 */
    public void m17991v1(String str, String str2, String str3, String str4, String str5, InterfaceC3658m interfaceC3658m) {
        RecordService.recordOcrAlertAppear(str5, "OCR_RESULT");
        if (this.f12514d) {
            return;
        }
        m17982Y0(false);
        this.f12514d = true;
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
            identityAlertOverlay.setCommAlertOverlayListener(new C3654i(str5, interfaceC3658m));
        }
    }
}
