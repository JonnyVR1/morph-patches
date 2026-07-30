package com.idv.identity.ocr.p044ui;

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
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import p153l.afm;
import p153l.azb;
import p153l.dec0;
import p153l.dfm;
import p153l.e3q;
import p153l.ffm;
import p153l.gb50;
import p153l.hfm;
import p153l.kfm;
import p153l.o6r0;
import p153l.qk20;
import p153l.rcc0;
import p153l.y8c0;
import p153l.y9c0;

/* JADX INFO: loaded from: classes7.dex */
public class IDCardResultProActivity extends IntlFaceBaseActivity {

    /* JADX INFO: renamed from: k */
    protected iOSLoadingView f13262k;

    /* JADX INFO: renamed from: l */
    public TextView f13263l;

    /* JADX INFO: renamed from: m */
    private Button f13264m;

    /* JADX INFO: renamed from: n */
    private RecyclerView f13265n;

    /* JADX INFO: renamed from: o */
    public RelativeLayout f13266o;

    /* JADX INFO: renamed from: p */
    public ImageView f13267p;

    /* JADX INFO: renamed from: q */
    private gb50 f13268q;

    /* JADX INFO: renamed from: c */
    private long f13254c = System.currentTimeMillis();

    /* JADX INFO: renamed from: d */
    private boolean f13255d = false;

    /* JADX INFO: renamed from: e */
    private final int f13256e = 1000;

    /* JADX INFO: renamed from: f */
    private final int f13257f = 1001;

    /* JADX INFO: renamed from: g */
    private final int f13258g = 1002;

    /* JADX INFO: renamed from: h */
    private final int f13259h = 1003;

    /* JADX INFO: renamed from: i */
    private int f13260i = hfm.f109325j;

    /* JADX INFO: renamed from: j */
    private final String f13261j = "200";

    /* JADX INFO: renamed from: r */
    public Handler f13269r = new Handler(new C3808d());

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.IDCardResultProActivity$a */
    public class C3805a implements InterfaceC3817m {
        public C3805a() {
        }

        @Override // com.idv.identity.ocr.p044ui.IDCardResultProActivity.InterfaceC3817m
        /* JADX INFO: renamed from: a */
        public void mo19069a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "cardScanOutTime", NotificationCompat.CATEGORY_STATUS, "exit_onOK");
            Message message = new Message();
            message.obj = dfm.f88191l;
            IDCardResultProActivity.this.m19063p1(message);
        }

        @Override // com.idv.identity.ocr.p044ui.IDCardResultProActivity.InterfaceC3817m
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.IDCardResultProActivity$b */
    public class C3806b implements InterfaceC3817m {
        public C3806b() {
        }

        @Override // com.idv.identity.ocr.p044ui.IDCardResultProActivity.InterfaceC3817m
        /* JADX INFO: renamed from: a */
        public void mo19069a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "onMessageOCRNetError", NotificationCompat.CATEGORY_STATUS, "retry_onOK");
            IDCardResultProActivity.this.m19046d1();
        }

        @Override // com.idv.identity.ocr.p044ui.IDCardResultProActivity.InterfaceC3817m
        public void onCancel() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "userBack", "type", "ocrNetError_onCancel");
            IDCardResultProActivity.this.m19052t1(dfm.f88185f);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.IDCardResultProActivity$c */
    public class C3807c implements InterfaceC3817m {
        public C3807c() {
        }

        @Override // com.idv.identity.ocr.p044ui.IDCardResultProActivity.InterfaceC3817m
        /* JADX INFO: renamed from: a */
        public void mo19069a() {
            IDCardResultProActivity.this.m19053u1();
        }

        @Override // com.idv.identity.ocr.p044ui.IDCardResultProActivity.InterfaceC3817m
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.IDCardResultProActivity$d */
    public class C3808d implements Handler.Callback {
        public C3808d() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (IDCardResultProActivity.this.f13260i <= 0) {
                IDCardResultProActivity.this.m19054y1();
                return false;
            }
            if (message == null) {
                return false;
            }
            int i = message.what;
            if (1000 == i) {
                IDCardResultProActivity.this.m19052t1(dfm.f88170A);
            } else if (1001 == i) {
                IDCardResultProActivity.this.m19051o1((String) message.obj);
            } else if (1002 == i) {
                IDCardResultProActivity.m19036N0(IDCardResultProActivity.this);
                IDCardResultProActivity.this.m19064q1();
            } else if (1003 == i) {
                IDCardResultProActivity.m19036N0(IDCardResultProActivity.this);
                IDCardResultProActivity.this.m19065r1();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.IDCardResultProActivity$e */
    public class ViewOnClickListenerC3809e implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f13274a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ RelativeLayout f13275b;

        public ViewOnClickListenerC3809e(View view, RelativeLayout relativeLayout) {
            this.f13274a = view;
            this.f13275b = relativeLayout;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f13274a != null) {
                this.f13275b.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.IDCardResultProActivity$f */
    public class ViewOnClickListenerC3810f implements View.OnClickListener {
        public ViewOnClickListenerC3810f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IDCardResultProActivity.this.m19057X0();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.IDCardResultProActivity$g */
    public class ViewOnClickListenerC3811g implements View.OnClickListener {
        public ViewOnClickListenerC3811g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HashMap map = new HashMap();
            Map<String, Object> mapM129774z = IDCardResultProActivity.this.f13268q.m129774z();
            if (mapM129774z != null) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "ocrInfoData", "dataList", mapM129774z.toString());
                map.put("ocrInfoData", JSON.toJSONString(mapM129774z));
            }
            IDCardResultProActivity.this.m19061m1(map);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.IDCardResultProActivity$h */
    public class C3812h implements InterfaceC3817m {
        public C3812h() {
        }

        @Override // com.idv.identity.ocr.p044ui.IDCardResultProActivity.InterfaceC3817m
        /* JADX INFO: renamed from: a */
        public void mo19069a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "resultPage close");
            IDCardResultProActivity.this.m19052t1(dfm.f88185f);
        }

        @Override // com.idv.identity.ocr.p044ui.IDCardResultProActivity.InterfaceC3817m
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.IDCardResultProActivity$i */
    public class C3813i implements IdentityAlertOverlay.InterfaceC3864d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f13280a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC3817m f13281b;

        public C3813i(String str, InterfaceC3817m interfaceC3817m) {
            this.f13280a = str;
            this.f13281b = interfaceC3817m;
        }

        @Override // com.idv.identity.platform.IdentityAlertOverlay.InterfaceC3864d
        /* JADX INFO: renamed from: a */
        public void mo18769a() {
            RecordService.recordOcrAlertConfirm(this.f13280a, "OCR_RESULT");
            RecordService.recordOcrAlertClose(this.f13280a, "OCR_RESULT");
            InterfaceC3817m interfaceC3817m = this.f13281b;
            if (interfaceC3817m != null) {
                interfaceC3817m.mo19069a();
                IDCardResultProActivity.this.m19059a1(true);
                IDCardResultProActivity.this.f13255d = false;
            }
        }

        @Override // com.idv.identity.platform.IdentityAlertOverlay.InterfaceC3864d
        public void onCancel() {
            RecordService.recordOcrAlertCancel(this.f13280a, "OCR_RESULT");
            RecordService.recordOcrAlertClose(this.f13280a, "OCR_RESULT");
            InterfaceC3817m interfaceC3817m = this.f13281b;
            if (interfaceC3817m != null) {
                interfaceC3817m.onCancel();
                IDCardResultProActivity.this.m19059a1(true);
                IDCardResultProActivity.this.f13255d = false;
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.IDCardResultProActivity$j */
    public class C3814j implements kfm {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f13283a;

        /* JADX INFO: renamed from: com.idv.identity.ocr.ui.IDCardResultProActivity$j$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f13285a;

            public a(String str) {
                this.f13285a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f13285a.equals("200")) {
                    IDCardResultProActivity.this.m19058Y0();
                    IDCardResultProActivity.this.m19056C1();
                }
            }
        }

        public C3814j(long j) {
            this.f13283a = j;
        }

        @Override // p153l.kfm
        /* JADX INFO: renamed from: a */
        public void mo18864a(String str, String str2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "ocrDeviceResultCost", NotificationCompat.CATEGORY_STATUS, "error", "code", str, "msg", str2, "tag", "onError", "timeCost", String.valueOf((System.currentTimeMillis() - this.f13283a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f45294s);
            IDCardResultProActivity.this.m19048h1();
            IDCardResultProActivity.this.f13269r.sendEmptyMessage(1002);
        }

        @Override // p153l.kfm
        /* JADX INFO: renamed from: b */
        public void mo18865b(String str, String str2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "ocrDeviceResultCost", NotificationCompat.CATEGORY_STATUS, "success", "param", str2, "timeCost", String.valueOf((System.currentTimeMillis() - this.f13283a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f45294s);
            IDCardResultProActivity.this.m19048h1();
            IDCardResultProActivity.this.runOnUiThread(new a(str));
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.IDCardResultProActivity$k */
    public class RunnableC3815k implements Runnable {
        public RunnableC3815k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IDCardResultProActivity.this.f13262k.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.IDCardResultProActivity$l */
    public class C3816l implements InterfaceC3817m {
        public C3816l() {
        }

        @Override // com.idv.identity.ocr.p044ui.IDCardResultProActivity.InterfaceC3817m
        /* JADX INFO: renamed from: a */
        public void mo19069a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "keyBack");
            IDCardResultProActivity.this.m19052t1(dfm.f88185f);
            IDCardResultProActivity.super.onBackPressed();
        }

        @Override // com.idv.identity.ocr.p044ui.IDCardResultProActivity.InterfaceC3817m
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.IDCardResultProActivity$m */
    public interface InterfaceC3817m {
        /* JADX INFO: renamed from: a */
        void mo19069a();

        void onCancel();
    }

    /* JADX INFO: renamed from: B1 */
    private void m19034B1() {
        gb50 gb50Var = this.f13268q;
        if (gb50Var != null) {
            gb50Var.m129773D(hfm.f109320e);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ int m19036N0(IDCardResultProActivity iDCardResultProActivity) {
        int i = iDCardResultProActivity.f13260i;
        iDCardResultProActivity.f13260i = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public void m19046d1() {
    }

    /* JADX INFO: renamed from: f1 */
    private void m19047f1(String str) {
        RecordService.getInstance().recordEventPage(RecordLevel.LOG_ERROR, "OCR_RESULT_EXIT", "OCR_RESULT", (System.currentTimeMillis() - this.f13254c) + "ms", str);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public void m19048h1() {
        runOnUiThread(new RunnableC3815k());
    }

    /* JADX INFO: renamed from: j1 */
    private void m19049j1() {
        Bitmap bitmapM101049i;
        ImageView imageView = (ImageView) findViewById(rcc0.f162122R0);
        Bitmap bitmapM101053m = azb.m101053m();
        if (bitmapM101053m != null) {
            imageView.setImageBitmap(bitmapM101053m);
        }
        TextView textView = (TextView) findViewById(rcc0.f162150d1);
        if (textView != null) {
            textView.setTextColor(azb.f74128d.getOcrResultTitleColor(y9c0.f198077b));
        }
        this.f13264m = (Button) findViewById(rcc0.f162092C0);
        this.f13265n = (RecyclerView) findViewById(rcc0.f162177o);
        this.f13262k = (iOSLoadingView) findViewById(rcc0.f162116O0);
        TextView textView2 = (TextView) findViewById(rcc0.f162156f1);
        this.f13263l = textView2;
        if (textView2 != null) {
            textView2.setTextColor(azb.f74128d.getOcrResultTipColor(y9c0.f198077b));
        }
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(rcc0.f162144b1);
        this.f13266o = relativeLayout;
        if (relativeLayout != null) {
            if (hfm.f109320e) {
                relativeLayout.setVisibility(0);
            } else {
                relativeLayout.setVisibility(8);
            }
        }
        ImageView imageView2 = (ImageView) findViewById(rcc0.f162124S0);
        this.f13267p = imageView2;
        if (imageView2 != null && (bitmapM101049i = azb.m101049i()) != null) {
            this.f13267p.setImageBitmap(bitmapM101049i);
        }
        m19060k1();
        this.f13265n = (RecyclerView) findViewById(rcc0.f162177o);
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> mapM97411Q = afm.m97360H().m97411Q();
        TextView textView3 = this.f13263l;
        if (mapM97411Q != null) {
            textView3.setText(getText(R$string.f12768m0));
            for (Map.Entry<String, Object> entry : mapM97411Q.entrySet()) {
                if (!linkedHashMap.containsKey(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        } else {
            textView3.setText(getText(R$string.f12720J0));
        }
        if (hfm.f109319d) {
            linkedHashMap.putAll(afm.m97360H().m97408P());
            Map<String, Object> mapM97402N = afm.m97360H().m97402N();
            if (mapM97402N != null) {
                for (Map.Entry<String, Object> entry2 : mapM97402N.entrySet()) {
                    if (!linkedHashMap.containsKey(entry2.getKey())) {
                        linkedHashMap.put(entry2.getKey(), entry2.getValue());
                    }
                }
            }
        }
        o6r0.m166282b("TAG", "ocrCardProInfo:" + linkedHashMap);
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            arrayList.add(new e3q((String) entry3.getKey(), entry3.getValue().toString()));
        }
        this.f13265n.setLayoutManager(new LinearLayoutManager(this));
        gb50 gb50Var = new gb50(arrayList);
        this.f13268q = gb50Var;
        this.f13265n.setAdapter(gb50Var);
    }

    /* JADX INFO: renamed from: l1 */
    private void m19050l1() {
        View viewFindViewById = findViewById(rcc0.f162091C);
        View viewFindViewById2 = findViewById(rcc0.f162165i1);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(rcc0.f162144b1);
        if (viewFindViewById2 != null) {
            relativeLayout.setBackgroundColor(azb.f74128d.getOcrResultTipBGColor(y9c0.f198081f));
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC3809e(viewFindViewById2, relativeLayout));
        }
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC3810f());
        }
        m19067v1();
        this.f13264m.setOnClickListener(new ViewOnClickListenerC3811g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public void m19051o1(String str) {
        this.f13269r.removeMessages(1000);
        afm.m97360H().m97445e(str);
        m19047f1(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public void m19052t1(String str) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1001;
        messageObtain.obj = str;
        this.f13269r.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public void m19053u1() {
        int i = hfm.f109328m;
        Handler handler = this.f13269r;
        if (i <= 0) {
            handler.sendEmptyMessageDelayed(1003, hfm.f109329n * 60);
        } else {
            handler.sendEmptyMessageDelayed(1003, i * hfm.f109329n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y1 */
    public void m19054y1() {
        m19068w1(getResources().getString(R$string.f12754f0), "", getResources().getString(R$string.f12733Q), null, "ocr_over_time_code", new C3805a());
    }

    /* JADX INFO: renamed from: z1 */
    private boolean m19055z1(boolean z) {
        try {
            return ((Boolean) getClassLoader().loadClass("com.idv.identity.face.IdentityFaceApi").getDeclaredMethod("start", Context.class, Boolean.TYPE).invoke(null, this, Boolean.valueOf(z))).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "startFace", NotificationCompat.CATEGORY_STATUS, "catchException", "exception", e.toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: C1 */
    public void m19056C1() {
        String strM97458i0;
        if (isFinishing() || (strM97458i0 = afm.m97360H().m97458i0()) == null || !ffm.f98803f.equals(strM97458i0)) {
            return;
        }
        m19066s1();
    }

    /* JADX INFO: renamed from: X0 */
    public void m19057X0() {
        RecordService.getInstance().recordEventBehavior(RecordLevel.LOG_INFO, "PAGER_BEHAVIOR", "exitVerifyBtn", "OCR_RESULT");
        m19068w1(getResources().getString(R$string.f12736T), "", getResources().getString(R$string.f12733Q), getResources().getString(R$string.f12727N), "ORC_RES_PAGE_EXIT_CODE", new C3812h());
    }

    /* JADX INFO: renamed from: Y0 */
    public void m19058Y0() {
    }

    /* JADX INFO: renamed from: a1 */
    public void m19059a1(boolean z) {
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
            background2.toString();
            if (background2 instanceof GradientDrawable) {
                GradientDrawable gradientDrawable2 = (GradientDrawable) background2;
                gradientDrawable2.setColor(azb.f74128d.getOcrResultConfirmBtnEnabledBGColor(y8c0.f197987b));
                button.setBackground(gradientDrawable2);
            }
        }
    }

    /* JADX INFO: renamed from: k1 */
    public void m19060k1() {
        CardPreviewWidget cardPreviewWidget = (CardPreviewWidget) findViewById(rcc0.f162139a);
        if (afm.m97360H().m97492u() >= 2) {
            cardPreviewWidget.m19125d(afm.m97360H().m97431Y(), afm.m97360H().m97423U());
        } else {
            cardPreviewWidget.m19126e(afm.m97360H().m97431Y());
        }
    }

    /* JADX INFO: renamed from: m1 */
    public void m19061m1(Map<String, String> map) {
        m19062n1(map, true, null);
    }

    /* JADX INFO: renamed from: n1 */
    public void m19062n1(Map<String, String> map, boolean z, byte[] bArr) {
        this.f13262k.setVisibility(0);
        qk20.m176910g(map, z, bArr, new C3814j(System.currentTimeMillis()));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m19068w1(getResources().getString(R$string.f12736T), "", getResources().getString(R$string.f12733Q), getResources().getString(R$string.f12727N), "ORC_RES_PAGE_EXIT_CODE", new C3816l());
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(dec0.f88000d);
        this.f13254c = System.currentTimeMillis();
        RecordService.getInstance().recordEventPage(RecordLevel.LOG_INFO, "OCR_RESULT_ENTER", "OCR_RESULT");
        m19049j1();
        m19050l1();
        m19053u1();
        m19034B1();
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f13269r.removeCallbacksAndMessages(null);
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "destroyIDCardResultActivity", "timeCost", String.valueOf((System.currentTimeMillis() - this.f13254c) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f45294s);
        RecordService.getInstance().flush();
    }

    /* JADX INFO: renamed from: p1 */
    public void m19063p1(Message message) {
        String str = (String) message.obj;
        afm.m97360H().m97445e(str);
        m19047f1(str);
    }

    /* JADX INFO: renamed from: q1 */
    public void m19064q1() {
        m19068w1(getResources().getString(R$string.f12740X), getResources().getString(R$string.f12731P), getResources().getString(R$string.f12734R), getResources().getString(R$string.f12729O), "ORC_RES_PAGE_NET_ERROR_CODE", new C3806b());
    }

    /* JADX INFO: renamed from: r1 */
    public void m19065r1() {
        m19068w1(getResources().getString(R$string.f12719J), getResources().getString(R$string.f12706C0), getResources().getString(R$string.f12734R), null, "ocr_out_time_code", new C3807c());
    }

    /* JADX INFO: renamed from: s1 */
    public void m19066s1() {
        if (m19055z1(true)) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "onClickStartFaceView", NotificationCompat.CATEGORY_STATUS, "success");
        } else {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "onClickStartFaceView", NotificationCompat.CATEGORY_STATUS, "error");
        }
        m19047f1("success");
    }

    /* JADX INFO: renamed from: v1 */
    public void m19067v1() {
        GradientDrawable gradientDrawable;
        Button button = this.f13264m;
        if (button == null || (gradientDrawable = (GradientDrawable) button.getBackground()) == null) {
            return;
        }
        String str = hfm.f109321f;
        if (str == null || TextUtils.isEmpty(str)) {
            m19059a1(true);
        } else {
            gradientDrawable.setColor(Color.parseColor(hfm.f109321f));
        }
    }

    /* JADX INFO: renamed from: w1 */
    public void m19068w1(String str, String str2, String str3, String str4, String str5, InterfaceC3817m interfaceC3817m) {
        RecordService.recordOcrAlertAppear(str5, "OCR_RESULT");
        if (this.f13255d) {
            return;
        }
        m19059a1(false);
        this.f13255d = true;
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
            identityAlertOverlay.setCommAlertOverlayListener(new C3813i(str5, interfaceC3817m));
        }
    }
}
