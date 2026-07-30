package com.idv.identity.ocr.p044ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.idv.identity.base.R$string;
import com.idv.identity.base.algorithm.doc.Attr;
import com.idv.identity.base.algorithm.doc.Frame;
import com.idv.identity.ocr.IdentityScanView;
import com.idv.identity.ocr.OcrType;
import com.idv.identity.ocr.compress.CompressConfig;
import com.idv.identity.ocr.widget.RectMaskTrapView;
import com.idv.identity.ocr.widget.RectMaskView;
import com.idv.identity.platform.FinalVerifyActivity;
import com.idv.identity.platform.IdentityAlertOverlay;
import com.idv.identity.platform.IntlFaceBaseActivity;
import com.idv.identity.platform.SystemLoadingOverlay;
import com.idv.identity.platform.api.IdentityOcrInfo;
import com.idv.identity.platform.camera.CameraSurfaceView;
import com.idv.identity.platform.config.OSSConfig;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import com.idv.identity.platform.model.IDCardOcrProResult;
import com.idv.identity.platform.model.IDCardOcrResult;
import com.idv.identity.platform.model.NfcConfigRes;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p153l.ac00;
import p153l.afm;
import p153l.azb;
import p153l.bn2;
import p153l.c60;
import p153l.cfm;
import p153l.dec0;
import p153l.dfm;
import p153l.dql;
import p153l.ffm;
import p153l.hfm;
import p153l.hki;
import p153l.iql;
import p153l.jfm;
import p153l.jt5;
import p153l.kkl0;
import p153l.kt5;
import p153l.lf20;
import p153l.nsl;
import p153l.o6r0;
import p153l.ofm;
import p153l.p7f;
import p153l.p94;
import p153l.qk20;
import p153l.rcc0;
import p153l.scc0;
import p153l.vac0;
import p153l.w50;
import p153l.xxb;
import p153l.y8c0;
import p153l.y9c0;
import p153l.yac0;
import p153l.zpl;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes7.dex */
public class CardScanActivity extends IntlFaceBaseActivity implements zpl, nsl {

    /* JADX INFO: renamed from: H0 */
    public static String f13096H0 = "NONE";

    /* JADX INFO: renamed from: I0 */
    public static String f13097I0 = "shoot";

    /* JADX INFO: renamed from: J0 */
    public static String f13098J0 = "scan";

    /* JADX INFO: renamed from: E0 */
    private xxb f13104E0;

    /* JADX INFO: renamed from: F0 */
    ActivityResultContracts.PickVisualMedia f13106F0;

    /* JADX INFO: renamed from: G0 */
    c60<PickVisualMediaRequest> f13108G0;

    /* JADX INFO: renamed from: j */
    private CameraSurfaceView f13135j;

    /* JADX INFO: renamed from: k */
    private IdentityScanView f13136k;

    /* JADX INFO: renamed from: n */
    bn2 f13140n;

    /* JADX INFO: renamed from: c */
    private long f13128c = System.currentTimeMillis();

    /* JADX INFO: renamed from: d */
    private final String f13129d = "ocridface";

    /* JADX INFO: renamed from: e */
    private final String f13130e = "ocridface_3d";

    /* JADX INFO: renamed from: f */
    private final String f13131f = "ocridorigin";

    /* JADX INFO: renamed from: g */
    private final String f13132g = "ocridback";

    /* JADX INFO: renamed from: h */
    private final String f13133h = "ocridthrid";

    /* JADX INFO: renamed from: i */
    private final String f13134i = "ocridback_3d";

    /* JADX INFO: renamed from: l */
    private RectMaskView f13138l = null;

    /* JADX INFO: renamed from: m */
    private RectMaskTrapView f13139m = null;

    /* JADX INFO: renamed from: o */
    SystemLoadingOverlay f13141o = null;

    /* JADX INFO: renamed from: p */
    FrameLayout f13142p = null;

    /* JADX INFO: renamed from: q */
    private OcrType f13144q = OcrType.OT_PHOTO_FRONT;

    /* JADX INFO: renamed from: r */
    private String f13145r = "";

    /* JADX INFO: renamed from: s */
    private int f13146s = 0;

    /* JADX INFO: renamed from: t */
    private float[] f13147t = new float[8];

    /* JADX INFO: renamed from: u */
    public String f13148u = f13096H0;

    /* JADX INFO: renamed from: v */
    private boolean f13149v = false;

    /* JADX INFO: renamed from: w */
    private int f13150w = 0;

    /* JADX INFO: renamed from: x */
    private long f13151x = System.currentTimeMillis();

    /* JADX INFO: renamed from: y */
    private Bitmap f13152y = null;

    /* JADX INFO: renamed from: z */
    private Bitmap f13153z = null;

    /* JADX INFO: renamed from: A */
    private Bitmap f13099A = null;

    /* JADX INFO: renamed from: B */
    private LinearLayout f13100B = null;

    /* JADX INFO: renamed from: C */
    private ImageView f13101C = null;

    /* JADX INFO: renamed from: D */
    private ImageView f13102D = null;

    /* JADX INFO: renamed from: E */
    private ImageView f13103E = null;

    /* JADX INFO: renamed from: F */
    private ImageView f13105F = null;

    /* JADX INFO: renamed from: G */
    private TextView f13107G = null;

    /* JADX INFO: renamed from: H */
    protected int f13109H = 0;

    /* JADX INFO: renamed from: I */
    private AtomicBoolean f13110I = new AtomicBoolean(false);

    /* JADX INFO: renamed from: J */
    protected boolean f13111J = false;

    /* JADX INFO: renamed from: K */
    private boolean f13112K = false;

    /* JADX INFO: renamed from: L */
    private boolean f13113L = false;

    /* JADX INFO: renamed from: M */
    private final int f13114M = 1000;

    /* JADX INFO: renamed from: N */
    private final int f13115N = 1005;

    /* JADX INFO: renamed from: O */
    private final int f13116O = 1007;

    /* JADX INFO: renamed from: P */
    private final int f13117P = 1008;

    /* JADX INFO: renamed from: Q */
    private final int f13118Q = 1009;

    /* JADX INFO: renamed from: R */
    private final int f13119R = 1010;

    /* JADX INFO: renamed from: S */
    private final int f13120S = 1011;

    /* JADX INFO: renamed from: T */
    private final int f13121T = 1012;

    /* JADX INFO: renamed from: U */
    private final int f13122U = 1013;

    /* JADX INFO: renamed from: V */
    private final int f13123V = 1015;

    /* JADX INFO: renamed from: W */
    private final int f13124W = 1016;

    /* JADX INFO: renamed from: X */
    private final int f13125X = 1017;

    /* JADX INFO: renamed from: Y */
    private final int f13126Y = 1018;

    /* JADX INFO: renamed from: Z */
    private final int f13127Z = 2000;

    /* JADX INFO: renamed from: k0 */
    private final int f13137k0 = 3000;

    /* JADX INFO: renamed from: p0 */
    public Handler f13143p0 = new Handler(new C3768k());

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$a */
    public class C3758a implements w50<Uri> {

        /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$a$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Uri f13155a;

            /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$a$a$a, reason: collision with other inner class name */
            public class C22805a implements jt5.InterfaceC18037a {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ long f13157a;

                /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$a$a$a$a, reason: collision with other inner class name */
                public class RunnableC22806a implements Runnable {

                    /* JADX INFO: renamed from: a */
                    final /* synthetic */ String f13159a;

                    /* JADX INFO: renamed from: b */
                    final /* synthetic */ String f13160b;

                    public RunnableC22806a(String str, String str2) {
                        this.f13159a = str;
                        this.f13160b = str2;
                    }

                    @Override // java.lang.Runnable
                    public void run() throws Throwable {
                        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "takeSuccess", NotificationCompat.CATEGORY_STATUS, "onCompressSuccess", "compress time", String.valueOf(System.currentTimeMillis() - C22805a.this.f13157a));
                        CardScanActivity.this.m18880L2(this.f13159a, this.f13160b);
                    }
                }

                public C22805a(long j) {
                    this.f13157a = j;
                }

                @Override // p153l.jt5.InterfaceC18037a
                /* JADX INFO: renamed from: a */
                public void mo18984a(String str, String str2) {
                    CardScanActivity.this.m18969g3(false);
                    CardScanActivity.this.m18870F1(true);
                    RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "takeSuccess", NotificationCompat.CATEGORY_STATUS, "compressError", "msg", str2);
                    if (CardScanActivity.this.f13148u.equals(CardScanActivity.f13098J0)) {
                        CardScanActivity.this.f13110I.set(false);
                        if (CardScanActivity.this.f13136k != null) {
                            CardScanActivity.this.f13136k.m18814i();
                        }
                    }
                }

                @Override // p153l.jt5.InterfaceC18037a
                /* JADX INFO: renamed from: b */
                public void mo18985b(String str, String str2) {
                    CardScanActivity.this.f13143p0.post(new RunnableC22806a(str, str2));
                }
            }

            public a(Uri uri) {
                this.f13155a = uri;
            }

            @Override // java.lang.Runnable
            public void run() {
                CardScanActivity.this.f13149v = false;
                if (this.f13155a == null) {
                    o6r0.m166282b("PhotoPicker", "No media selected");
                    CardScanActivity.this.m18969g3(false);
                    CardScanActivity.this.m18870F1(true);
                } else {
                    CardScanActivity.this.m18969g3(true);
                    CompressConfig compressConfigM18816a = new CompressConfig.C3742b().m18817b(512000).m18816a();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    CardScanActivity cardScanActivity = CardScanActivity.this;
                    kt5.m151330e(cardScanActivity, compressConfigM18816a, cardScanActivity.m18900a2(this.f13155a), new C22805a(jCurrentTimeMillis)).mo146888a();
                }
            }
        }

        public C3758a() {
        }

        @Override // p153l.w50
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2611a(Uri uri) {
            o6r0.m166282b("PhotoPicker", "Selected URI: " + uri);
            CardScanActivity.this.f13143p0.postDelayed(new a(uri), 200L);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$b */
    public class C3759b implements InterfaceC3781x {
        public C3759b() {
        }

        @Override // com.idv.identity.ocr.p044ui.CardScanActivity.InterfaceC3781x
        /* JADX INFO: renamed from: a */
        public void mo18986a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "closeButton");
            CardScanActivity.this.m18901a3(dfm.f88185f);
        }

        @Override // com.idv.identity.ocr.p044ui.CardScanActivity.InterfaceC3781x
        public void onCancel() {
            CardScanActivity.this.m18943G1(true);
            CardScanActivity.this.m18903c3();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$c */
    public class ViewOnClickListenerC3760c implements View.OnClickListener {
        public ViewOnClickListenerC3760c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CardScanActivity.this.m18894V2();
            CardScanActivity.this.m18923o2();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$d */
    public class ViewOnClickListenerC3761d implements View.OnClickListener {
        public ViewOnClickListenerC3761d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CardScanActivity.this.m18979u2();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$e */
    public class ViewOnClickListenerC3762e implements View.OnClickListener {
        public ViewOnClickListenerC3762e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CardScanActivity.this.f13110I.set(true);
            CardScanActivity.this.m18894V2();
            CardScanActivity.this.f13112K = false;
            CardScanActivity.this.m18876K1(false);
            CardScanActivity.this.m18928r2(false);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$f */
    public class ViewOnClickListenerC3763f implements View.OnClickListener {
        public ViewOnClickListenerC3763f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Throwable {
            CardScanActivity.this.m18894V2();
            CardScanActivity.this.f13112K = false;
            CardScanActivity.this.m18875J1(false);
            CardScanActivity.this.m18969g3(true);
            CardScanActivity.this.m18926q2();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$g */
    public class ViewOnClickListenerC3764g implements View.OnClickListener {

        /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$g$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                CardScanActivity.this.m18969g3(true);
                CardScanActivity.this.m18874I2();
            }
        }

        public ViewOnClickListenerC3764g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CardScanActivity.this.m18894V2();
            CardScanActivity.this.f13112K = true;
            if (CardScanActivity.this.f13149v) {
                return;
            }
            CardScanActivity.this.f13149v = true;
            view.post(new a());
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$h */
    public class ViewOnClickListenerC3765h implements View.OnClickListener {
        public ViewOnClickListenerC3765h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CardScanActivity cardScanActivity = CardScanActivity.this;
            if (cardScanActivity.f13148u == CardScanActivity.f13097I0) {
                cardScanActivity.m18974n3();
            } else {
                cardScanActivity.m18975o3();
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$i */
    public class C3766i implements iql {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f13170a;

        public C3766i(boolean z) {
            this.f13170a = z;
        }

        @Override // p153l.iql
        /* JADX INFO: renamed from: a */
        public void mo18987a(Bitmap bitmap, boolean z) {
            CardScanActivity.this.m18876K1(true);
            CardScanActivity.this.m18877K2(bitmap, this.f13170a, null);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$j */
    public class C3767j implements hki.InterfaceC17490d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f13172a;

        public C3767j(long j) {
            this.f13172a = j;
        }

        @Override // p153l.hki.InterfaceC17490d
        /* JADX INFO: renamed from: a */
        public boolean mo18772a(int i, String str, String str2, String str3) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "cardOssUploadRes", NotificationCompat.CATEGORY_STATUS, "error", "idx", String.valueOf(i), "ocrType", String.valueOf(CardScanActivity.this.f13144q), "bucketName", str, "fileName", str2, "errMsg", str3);
            return false;
        }

        @Override // p153l.hki.InterfaceC17490d
        /* JADX INFO: renamed from: b */
        public boolean mo18773b(int i, String str, String str2) {
            String str3 = String.valueOf((System.currentTimeMillis() - this.f13172a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f45294s;
            if (1 == i) {
                afm.m97360H().m97372C1(str2);
            } else if (5 == i) {
                afm.m97360H().m97384G1(str2, true);
            } else if (2 == i) {
                afm.m97360H().m97494u1(str2);
            } else if (20 == i) {
                afm.m97360H().m97497v1(str2);
            } else if (10 == i) {
                afm.m97360H().m97375D1(str2);
            }
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "cardOssUploadRes", NotificationCompat.CATEGORY_STATUS, "success", "idx", String.valueOf(i), "ocrType", String.valueOf(CardScanActivity.this.f13144q), "bucketName", str, "fileName", str2, "timeCost", str3);
            return false;
        }

        @Override // p153l.hki.InterfaceC17490d
        /* JADX INFO: renamed from: c */
        public void mo18774c(int i, int i2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "cardOssUploadCost", NotificationCompat.CATEGORY_STATUS, "finish", "uploadCnt", String.valueOf(i), "successCnt", String.valueOf(i2), "timeCost", String.valueOf((System.currentTimeMillis() - this.f13172a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f45294s);
            CardScanActivity cardScanActivity = CardScanActivity.this;
            if (i == i2) {
                cardScanActivity.f13143p0.sendEmptyMessage(1009);
            } else {
                cardScanActivity.f13143p0.sendEmptyMessage(1008);
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$k */
    public class C3768k implements Handler.Callback {
        public C3768k() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) throws Throwable {
            Object obj;
            int unused = CardScanActivity.this.f13150w;
            int i = message.what;
            if (CardScanActivity.this.f13150w < 0) {
                CardScanActivity.this.m18911i3();
                return false;
            }
            int i2 = message.what;
            if (1005 == i2) {
                CardScanActivity.this.m18934v2();
            } else if (1007 == i2) {
                CardScanActivity.this.m18980w2(message);
            } else if (1008 == i2) {
                CardScanActivity.this.m18939D2(true);
            } else if (1009 == i2) {
                CardScanActivity.this.m18939D2(false);
            } else if (1010 == i2) {
                CardScanActivity.this.m18982z2();
            } else if (1011 == i2) {
                CardScanActivity.m18882N0(CardScanActivity.this);
                CardScanActivity.this.m18981y2();
            } else if (1012 == i2) {
                CardScanActivity.this.m18938B2();
            } else if (1013 == i2) {
                CardScanActivity.this.m18942F2();
            } else if (1015 == i2) {
                CardScanActivity.m18882N0(CardScanActivity.this);
                CardScanActivity.this.m18869C2();
            } else if (1016 == i2) {
                if (!CardScanActivity.this.f13110I.get()) {
                    CardScanActivity.m18882N0(CardScanActivity.this);
                    CardScanActivity.this.m18941E2();
                }
            } else if (1017 == i2) {
                CardScanActivity.m18882N0(CardScanActivity.this);
                CardScanActivity.this.m18866A2();
            } else if (1018 == i2 && (obj = message.obj) != null) {
                CardScanActivity.this.m18930s2((String) obj);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$l */
    public class C3769l implements InterfaceC3781x {
        public C3769l() {
        }

        @Override // com.idv.identity.ocr.p044ui.CardScanActivity.InterfaceC3781x
        /* JADX INFO: renamed from: a */
        public void mo18986a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "keyBack");
            CardScanActivity.this.m18901a3(dfm.f88185f);
        }

        @Override // com.idv.identity.ocr.p044ui.CardScanActivity.InterfaceC3781x
        public void onCancel() {
            CardScanActivity.this.m18903c3();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$m */
    public class RunnableC3770m implements Runnable {
        public RunnableC3770m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CardScanActivity.this.f13136k != null) {
                CardScanActivity.this.f13136k.m18811f();
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$n */
    public class C3771n implements IdentityAlertOverlay.InterfaceC3864d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f13177a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC3781x f13178b;

        public C3771n(String str, InterfaceC3781x interfaceC3781x) {
            this.f13177a = str;
            this.f13178b = interfaceC3781x;
        }

        @Override // com.idv.identity.platform.IdentityAlertOverlay.InterfaceC3864d
        /* JADX INFO: renamed from: a */
        public void mo18769a() {
            RecordService.recordOcrAlertConfirm(this.f13177a);
            RecordService.recordOcrAlertClose(this.f13177a);
            InterfaceC3781x interfaceC3781x = this.f13178b;
            if (interfaceC3781x != null) {
                interfaceC3781x.mo18986a();
                CardScanActivity.this.m18870F1(true);
                CardScanActivity.this.f13113L = false;
            }
            CardScanActivity.this.m18888S2();
        }

        @Override // com.idv.identity.platform.IdentityAlertOverlay.InterfaceC3864d
        public void onCancel() {
            RecordService.recordOcrAlertCancel(this.f13177a);
            RecordService.recordOcrAlertClose(this.f13177a);
            InterfaceC3781x interfaceC3781x = this.f13178b;
            if (interfaceC3781x != null) {
                interfaceC3781x.onCancel();
                CardScanActivity.this.m18870F1(true);
                CardScanActivity.this.f13113L = false;
            }
            if (CardScanActivity.this.f13110I.get()) {
                return;
            }
            CardScanActivity.this.m18888S2();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$o */
    public class C3772o implements InterfaceC3781x {
        public C3772o() {
        }

        @Override // com.idv.identity.ocr.p044ui.CardScanActivity.InterfaceC3781x
        /* JADX INFO: renamed from: a */
        public void mo18986a() {
            CardScanActivity.this.f13110I.set(false);
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "onMessageOCRError", NotificationCompat.CATEGORY_STATUS, "retry_onOK");
            CardScanActivity cardScanActivity = CardScanActivity.this;
            cardScanActivity.m18920m3(cardScanActivity.f13144q);
            CardScanActivity.this.m18888S2();
            CardScanActivity.this.m18903c3();
        }

        @Override // com.idv.identity.ocr.p044ui.CardScanActivity.InterfaceC3781x
        public void onCancel() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "closeButton");
            CardScanActivity.this.m18901a3(dfm.f88172C);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$p */
    public class C3773p implements InterfaceC3781x {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f13181a;

        public C3773p(String str) {
            this.f13181a = str;
        }

        @Override // com.idv.identity.ocr.p044ui.CardScanActivity.InterfaceC3781x
        /* JADX INFO: renamed from: a */
        public void mo18986a() {
            CardScanActivity.this.m18902b3(this.f13181a);
        }

        @Override // com.idv.identity.ocr.p044ui.CardScanActivity.InterfaceC3781x
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$q */
    public class C3774q extends AnimatorListenerAdapter {
        public C3774q() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            CardScanActivity cardScanActivity = CardScanActivity.this;
            cardScanActivity.m18920m3(cardScanActivity.m18951S1(cardScanActivity.f13146s));
            if (!"auto".equals(afm.m97360H().m97437b0())) {
                if (CardScanActivity.f13098J0.equals(CardScanActivity.this.f13148u)) {
                    CardScanActivity.this.f13136k.m18814i();
                    return;
                } else {
                    if (CardScanActivity.f13097I0.equals(CardScanActivity.this.f13148u)) {
                        CardScanActivity.this.m18960Z1().setVisibility(0);
                        return;
                    }
                    return;
                }
            }
            if (CardScanActivity.f13098J0.equals(CardScanActivity.this.f13148u)) {
                CardScanActivity.this.f13136k.m18814i();
                CardScanActivity.this.m18974n3();
            } else if (CardScanActivity.f13097I0.equals(CardScanActivity.this.f13148u)) {
                CardScanActivity.this.m18975o3();
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$r */
    public class C3775r implements InterfaceC3781x {
        public C3775r() {
        }

        @Override // com.idv.identity.ocr.p044ui.CardScanActivity.InterfaceC3781x
        /* JADX INFO: renamed from: a */
        public void mo18986a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "cardScanOutTime", NotificationCompat.CATEGORY_STATUS, "exit_onOK");
            Message message = new Message();
            message.obj = dfm.f88191l;
            CardScanActivity.this.m18980w2(message);
        }

        @Override // com.idv.identity.ocr.p044ui.CardScanActivity.InterfaceC3781x
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$s */
    public class C3776s implements jfm {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f13185a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f13186b;

        public C3776s(long j, String str) {
            this.f13185a = j;
            this.f13186b = str;
        }

        @Override // p153l.jfm
        /* JADX INFO: renamed from: a */
        public void mo18988a(String str, String str2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "ocrDeviceCost", NotificationCompat.CATEGORY_STATUS, "error", "code", str, "msg", str2, "tag", "onError", "timeCost", String.valueOf((System.currentTimeMillis() - this.f13185a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f45294s, "sideType", this.f13186b);
            CardScanActivity.this.f13143p0.sendEmptyMessage(1010);
        }

        @Override // p153l.jfm
        /* JADX INFO: renamed from: b */
        public void mo18989b(String str, String str2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "ocrDeviceCost", NotificationCompat.CATEGORY_STATUS, "error", "code", str, "msg", str2, "tag", "onServerError", "timeCost", String.valueOf((System.currentTimeMillis() - this.f13185a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f45294s, "sideType", this.f13186b);
            CardScanActivity.this.f13143p0.sendEmptyMessage(1011);
        }

        @Override // p153l.jfm
        public void onSuccess(String str) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "ocrDeviceCost", NotificationCompat.CATEGORY_STATUS, "success", "isVerifyAlbumPhoto", String.valueOf(CardScanActivity.this.f13112K), "timeCost", String.valueOf((System.currentTimeMillis() - this.f13185a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f45294s, "sideType", this.f13186b);
            if (!ffm.f98803f.equals(afm.m97360H().m97458i0())) {
                IDCardOcrResult iDCardOcrResult = (IDCardOcrResult) ac00.m96788g(str, IDCardOcrResult.class);
                if (iDCardOcrResult == null || !iDCardOcrResult.isOCRSuccess()) {
                    if (iDCardOcrResult != null && iDCardOcrResult.isOCRTypeError()) {
                        CardScanActivity.this.f13143p0.sendEmptyMessage(1015);
                        return;
                    }
                    if (iDCardOcrResult != null && iDCardOcrResult.isOCRError()) {
                        CardScanActivity.this.f13143p0.sendEmptyMessage(1011);
                        return;
                    }
                    if (iDCardOcrResult != null && iDCardOcrResult.isOCRPictureQualityNotGood()) {
                        CardScanActivity.this.f13143p0.sendEmptyMessage(1017);
                        return;
                    }
                    o6r0.m166283c("idcardResult is null content:" + str);
                    return;
                }
                IdentityOcrInfo identityOcrInfo = new IdentityOcrInfo();
                identityOcrInfo.ocrResult = iDCardOcrResult;
                if (OcrType.OT_PHOTO_FRONT == CardScanActivity.this.f13144q) {
                    afm.m97360H().m97506y1(identityOcrInfo);
                    afm.m97360H().m97378E1(CardScanActivity.this.f13153z);
                    afm.m97360H().m97366A1(CardScanActivity.this.f13152y);
                } else if (OcrType.OT_PHOTO_BACK == CardScanActivity.this.f13144q) {
                    afm.m97360H().m97482q1(identityOcrInfo);
                    afm.m97360H().m97500w1(CardScanActivity.this.f13153z);
                    afm.m97360H().m97488s1(CardScanActivity.this.f13152y);
                } else if (OcrType.OT_PHOTO_BACK_3D == CardScanActivity.this.f13144q) {
                    afm.m97360H().m97485r1(identityOcrInfo);
                    afm.m97360H().m97503x1(CardScanActivity.this.f13153z);
                    afm.m97360H().m97491t1(CardScanActivity.this.f13152y);
                } else if (OcrType.OT_PHOTO_FRONT_3D == CardScanActivity.this.f13144q) {
                    afm.m97360H().m97509z1(identityOcrInfo);
                    afm.m97360H().m97381F1(CardScanActivity.this.f13153z);
                    afm.m97360H().m97369B1(CardScanActivity.this.f13152y);
                }
                CardScanActivity.this.f13143p0.sendEmptyMessage(1012);
                return;
            }
            IDCardOcrProResult iDCardOcrProResult = (IDCardOcrProResult) JSON.parseObject(str, IDCardOcrProResult.class);
            iDCardOcrProResult.toString();
            if (!iDCardOcrProResult.isOCRSuccess()) {
                if (iDCardOcrProResult.isOCRTypeError()) {
                    CardScanActivity.this.f13143p0.sendEmptyMessage(1015);
                    return;
                }
                if (iDCardOcrProResult.isOCRError()) {
                    CardScanActivity.this.f13143p0.sendEmptyMessage(1011);
                    return;
                } else {
                    if (iDCardOcrProResult.isOCRPictureQualityNotGood()) {
                        CardScanActivity.this.f13143p0.sendEmptyMessage(1017);
                        return;
                    }
                    o6r0.m166282b("TAG", "idcardResult is null content:" + str);
                    return;
                }
            }
            iDCardOcrProResult.sortOcrResult();
            Map<String, Object> sortedOcrResult = iDCardOcrProResult.getSortedOcrResult();
            Map<String, Object> ocrStandardDataMap = iDCardOcrProResult.getOcrStandardDataMap();
            if (ocrStandardDataMap != null) {
                afm.m97360H().m97480p1(ocrStandardDataMap);
            }
            if (OcrType.OT_PHOTO_FRONT == CardScanActivity.this.f13144q) {
                afm.m97360H().m97477o1(sortedOcrResult);
                afm.m97360H().m97378E1(CardScanActivity.this.f13153z);
                afm.m97360H().m97366A1(CardScanActivity.this.f13152y);
            } else if (OcrType.OT_PHOTO_BACK == CardScanActivity.this.f13144q) {
                Map<String, Object> mapM97408P = afm.m97360H().m97408P();
                if (sortedOcrResult != null) {
                    for (Map.Entry<String, Object> entry : sortedOcrResult.entrySet()) {
                        if (!mapM97408P.containsKey(entry.getKey()) || TextUtils.isEmpty((String) mapM97408P.get(entry.getKey()))) {
                            mapM97408P.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                afm.m97360H().m97477o1(mapM97408P);
                afm.m97360H().m97500w1(CardScanActivity.this.f13153z);
                afm.m97360H().m97488s1(CardScanActivity.this.f13152y);
            } else if (OcrType.OT_PHOTO_THIRD == CardScanActivity.this.f13144q) {
                Map<String, Object> mapM97408P2 = afm.m97360H().m97408P();
                if (sortedOcrResult != null) {
                    for (Map.Entry<String, Object> entry2 : sortedOcrResult.entrySet()) {
                        if (!mapM97408P2.containsKey(entry2.getKey()) || TextUtils.isEmpty((String) mapM97408P2.get(entry2.getKey()))) {
                            mapM97408P2.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                }
                afm.m97360H().m97477o1(mapM97408P2);
            }
            Objects.toString(sortedOcrResult);
            CardScanActivity.this.f13143p0.sendEmptyMessage(1012);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$t */
    public class C3777t implements InterfaceC3781x {
        public C3777t() {
        }

        @Override // com.idv.identity.ocr.p044ui.CardScanActivity.InterfaceC3781x
        /* JADX INFO: renamed from: a */
        public void mo18986a() throws Throwable {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "onMessageOCRNetError", NotificationCompat.CATEGORY_STATUS, "retry_onOK");
            CardScanActivity.this.m18939D2(true);
        }

        @Override // com.idv.identity.ocr.p044ui.CardScanActivity.InterfaceC3781x
        public void onCancel() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "userBack", "type", "ocrNetError_onCancel");
            CardScanActivity.this.m18901a3(dfm.f88185f);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$u */
    public class C3778u implements InterfaceC3781x {
        public C3778u() {
        }

        @Override // com.idv.identity.ocr.p044ui.CardScanActivity.InterfaceC3781x
        /* JADX INFO: renamed from: a */
        public void mo18986a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "onMessageOCRError", NotificationCompat.CATEGORY_STATUS, "retry_onOK");
            CardScanActivity.this.f13110I.set(false);
            CardScanActivity cardScanActivity = CardScanActivity.this;
            cardScanActivity.m18920m3(cardScanActivity.f13144q);
            CardScanActivity.this.m18888S2();
            CardScanActivity.this.m18903c3();
        }

        @Override // com.idv.identity.ocr.p044ui.CardScanActivity.InterfaceC3781x
        public void onCancel() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "closeButton");
            CardScanActivity.this.m18901a3(dfm.f88185f);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$v */
    public class C3779v implements InterfaceC3781x {
        public C3779v() {
        }

        @Override // com.idv.identity.ocr.p044ui.CardScanActivity.InterfaceC3781x
        /* JADX INFO: renamed from: a */
        public void mo18986a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "onMessageOCRPictureQualityNotGood", NotificationCompat.CATEGORY_STATUS, "retry_onOK");
            CardScanActivity.this.f13110I.set(false);
            CardScanActivity cardScanActivity = CardScanActivity.this;
            cardScanActivity.m18920m3(cardScanActivity.f13144q);
            CardScanActivity.this.m18888S2();
            CardScanActivity.this.m18903c3();
        }

        @Override // com.idv.identity.ocr.p044ui.CardScanActivity.InterfaceC3781x
        public void onCancel() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "closeButton");
            CardScanActivity.this.m18901a3(dfm.f88173D);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$w */
    public class C3780w implements InterfaceC3781x {
        public C3780w() {
        }

        @Override // com.idv.identity.ocr.p044ui.CardScanActivity.InterfaceC3781x
        /* JADX INFO: renamed from: a */
        public void mo18986a() {
            CardScanActivity.this.m18903c3();
        }

        @Override // com.idv.identity.ocr.p044ui.CardScanActivity.InterfaceC3781x
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$x */
    public interface InterfaceC3781x {
        /* JADX INFO: renamed from: a */
        void mo18986a();

        void onCancel();
    }

    public CardScanActivity() {
        ActivityResultContracts.PickVisualMedia pickVisualMedia = new ActivityResultContracts.PickVisualMedia();
        this.f13106F0 = pickVisualMedia;
        this.f13108G0 = registerForActivityResult(pickVisualMedia, new C3758a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public void m18866A2() {
        m18969g3(false);
        m18910h3(getResources().getString(R$string.f12735S), "", getResources().getString(R$string.f12734R), null, "ocr_msg_error_code", new C3779v());
    }

    /* JADX INFO: renamed from: C1 */
    private JSONObject m18868C1() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("points", (Object) this.f13147t);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C2 */
    public void m18869C2() {
        m18969g3(false);
        m18910h3(getResources().getString(R$string.f12756g0), getResources().getString(R$string.f12758h0), getResources().getString(R$string.f12734R), null, "OCR_TYPE_ERROR_CODE", new C3772o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F1 */
    public void m18870F1(boolean z) {
        m18943G1(z);
        m18876K1(z);
        m18875J1(z);
        m18873I1(z);
        m18871H1(z);
    }

    /* JADX INFO: renamed from: H1 */
    private void m18871H1(boolean z) {
        ImageView imageViewM18959Y1 = m18959Y1();
        if (imageViewM18959Y1 != null) {
            imageViewM18959Y1.setEnabled(z);
        }
    }

    /* JADX INFO: renamed from: H2 */
    private void m18872H2() {
        IDCardOcrResult iDCardOcrResult;
        IDCardOcrResult.OcrResult ocrResult;
        IDCardOcrResult iDCardOcrResult2;
        IDCardOcrResult.OcrResult ocrResult2;
        IdentityOcrInfo identityOcrInfoM97425V = afm.m97360H().m97425V();
        IdentityOcrInfo identityOcrInfoM97414R = afm.m97360H().m97414R();
        if (identityOcrInfoM97414R != null && (iDCardOcrResult = identityOcrInfoM97414R.ocrResult) != null && (ocrResult = iDCardOcrResult.ocrResult) != null && identityOcrInfoM97425V != null && (iDCardOcrResult2 = identityOcrInfoM97425V.ocrResult) != null && (ocrResult2 = iDCardOcrResult2.ocrResult) != null) {
            ocrResult2.expiryDate = ocrResult.expiryDate;
            ocrResult2.originOfIssue = ocrResult.originOfIssue;
            ocrResult2.issueDate = ocrResult.issueDate;
        }
        afm.m97360H().m97386H1(identityOcrInfoM97425V);
        String strM97495v = afm.m97360H().m97495v();
        if (strM97495v == null) {
            return;
        }
        String strM97458i0 = afm.m97360H().m97458i0();
        NfcConfigRes nfcConfigResM97396L = afm.m97360H().m97396L();
        if (ffm.f98803f.equals(strM97458i0)) {
            o6r0.m166282b("CardScanActivity", "onOcrIdentityFinish:  ENABLE_SHOW_OCR_RESULT=" + hfm.f109319d);
            if (afm.m97360H().m97411Q() == null && !hfm.f109319d) {
                m18978p3();
            } else {
                m18973n2(IDCardResultProActivity.class);
            }
            m18879L1("success");
            return;
        }
        if (cfm.f81515a.equals(strM97495v) && ffm.f98804g.equals(strM97458i0)) {
            lf20.m153965c(this);
            m18879L1("success");
            return;
        }
        if (cfm.f81515a.equals(strM97495v) && ffm.f98802e.equals(strM97458i0) && nfcConfigResM97396L != null && getPackageManager().hasSystemFeature("android.hardware.nfc")) {
            lf20.m153965c(this);
            m18879L1("success");
            return;
        }
        o6r0.m166282b("CardScanActivity", "onOcrIdentityFinish:  ENABLE_SHOW_OCR_RESULT=" + hfm.f109319d);
        if (!hfm.f109319d) {
            m18978p3();
        } else if (cfm.f81516b.equals(strM97495v) || cfm.f81517c.equals(strM97495v)) {
            m18973n2(HKIDCardResultActivity.class);
        } else if (cfm.f81518d.equals(strM97495v) || cfm.f81519e.equals(strM97495v)) {
            m18973n2(HKGoThroughIDCardResultActivity.class);
        } else if (cfm.f81515a.equals(strM97495v)) {
            m18973n2(GlobalPassportIDCardResultActivity.class);
        } else if (cfm.f81520f.equals(strM97495v)) {
            m18973n2(MacaoIDCardResultActivity.class);
        } else if (cfm.f81521g.equals(strM97495v)) {
            m18973n2(TaiwanIDCardResultActivity.class);
        } else if (cfm.f81522h.equals(strM97495v)) {
            m18973n2(MainlandIDCardResultActivity.class);
        }
        m18879L1("success");
    }

    /* JADX INFO: renamed from: I1 */
    private void m18873I1(boolean z) {
        ImageView imageViewM18966e2 = m18966e2();
        if (imageViewM18966e2 != null) {
            imageViewM18966e2.setEnabled(z);
        }
        TextView textView = (TextView) findViewById(rcc0.f162100G0);
        if (textView != null) {
            textView.setEnabled(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I2 */
    public void m18874I2() {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "enterPickImage", NotificationCompat.CATEGORY_STATUS, "success");
        try {
            this.f13108G0.m108087b(new PickVisualMediaRequest.Builder().setMediaType(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE).build());
        } catch (Exception e) {
            RecordService.getInstance().recordException(e);
        }
        if (ActivityResultContracts.PickVisualMedia.isPhotoPickerAvailable()) {
            return;
        }
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "enterPickImage", NotificationCompat.CATEGORY_STATUS, "error", "pickVisualMedia", "not support for the photo picker");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J1 */
    public void m18875J1(boolean z) {
        ImageView imageViewM18970h2 = m18970h2();
        if (imageViewM18970h2 != null) {
            imageViewM18970h2.setEnabled(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K1 */
    public void m18876K1(boolean z) {
        ImageView imageViewM18960Z1 = m18960Z1();
        if (imageViewM18960Z1 != null) {
            imageViewM18960Z1.setEnabled(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K2 */
    public void m18877K2(Bitmap bitmap, boolean z, Attr attr) {
        if (bitmap == null) {
            return;
        }
        this.f13152y = bitmap;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        if (z) {
            m18905d3(m18881M1(bitmap, attr));
            m18908f3(this.f13153z, attr);
        } else {
            ImageView imageView = (ImageView) findViewById(rcc0.f162087A);
            if (imageView != null) {
                imageView.setVisibility(0);
                imageView.setImageBitmap(this.f13152y);
            }
            float holeLeft = m18953T1().getHoleLeft();
            float holeTop = m18953T1().getHoleTop();
            float holeWidth = m18953T1().getHoleWidth();
            float holeHeight = m18953T1().getHoleHeight();
            float height2 = imageView.getHeight();
            float width2 = imageView.getWidth();
            o6r0.m166285e("CardScanActivity", "photoTakenBackground  bgHeight:" + height2 + "  bgWidth:" + width2);
            float f = height / height2;
            float f2 = holeLeft * f;
            float f3 = width / width2;
            float f4 = holeTop * f3;
            float f5 = f * holeHeight;
            float f6 = f3 * holeWidth;
            o6r0.m166285e("CardScanActivity", "onPictureTake:" + z + "  cropLeft:" + f2 + " cropTop:" + f4 + "cropWidth:" + f6 + "cropHeight:" + f5);
            m18905d3(Bitmap.createBitmap(bitmap, (int) f2, (int) f4, (int) f6, (int) f5, (Matrix) null, false));
        }
        LinearLayout linearLayoutM18968g2 = m18968g2();
        if (linearLayoutM18968g2 != null) {
            linearLayoutM18968g2.setVisibility(8);
        }
        ImageView imageViewM18970h2 = m18970h2();
        if (imageViewM18970h2 != null) {
            imageViewM18970h2.setVisibility(0);
        }
        m18947P1().setVisibility(8);
        ImageView imageViewM18960Z1 = m18960Z1();
        if (imageViewM18960Z1 != null) {
            imageViewM18960Z1.setVisibility(4);
        }
        TextView textView = (TextView) findViewById(rcc0.f162173m);
        if (textView != null) {
            textView.setText("");
        }
        TextView textViewM18957X1 = m18957X1();
        if (textViewM18957X1 != null) {
            OcrType ocrType = OcrType.OT_PHOTO_FRONT;
            OcrType ocrType2 = this.f13144q;
            if (ocrType == ocrType2) {
                textViewM18957X1.setText(R$string.f12766l0);
            } else if (OcrType.OT_PHOTO_BACK == ocrType2 || OcrType.OT_PHOTO_THIRD == ocrType2) {
                textViewM18957X1.setText(R$string.f12764k0);
            } else {
                textViewM18957X1.setText(R$string.f12762j0);
            }
            textViewM18957X1.setVisibility(0);
        }
        int iM97440c0 = (int) afm.m97360H().m97440c0();
        if (iM97440c0 <= 0) {
            iM97440c0 = 640;
        }
        this.f13099A = ac00.m96794m(this.f13152y, iM97440c0);
    }

    /* JADX INFO: renamed from: L1 */
    private void m18879L1(String str) {
        RecordService.getInstance().recordEventPage(RecordLevel.LOG_INFO, "OCR_EXIT", "OCR_SCAN", (System.currentTimeMillis() - this.f13128c) + "ms", str);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L2 */
    public void m18880L2(String str, String str2) throws Throwable {
        o6r0.m166281a("originalPath: " + str + " compressPath: " + str2);
        if (str.isEmpty() || str2.isEmpty()) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "takeSuccess", NotificationCompat.CATEGORY_STATUS, "error", "msg", "image path error");
            return;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str2, options);
        if (bitmapDecodeFile == null) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "takeSuccess", NotificationCompat.CATEGORY_STATUS, "error", "msg", "decodeFile error");
            return;
        }
        int iM18950R2 = m18950R2(str);
        if (iM18950R2 != 0) {
            bitmapDecodeFile = m18958X2(iM18950R2, bitmapDecodeFile);
        }
        this.f13152y = bitmapDecodeFile;
        this.f13099A = bitmapDecodeFile;
        this.f13153z = bitmapDecodeFile;
        ImageView imageView = (ImageView) findViewById(rcc0.f162087A);
        if (imageView != null) {
            imageView.setImageBitmap(this.f13152y);
            imageView.setVisibility(0);
            o6r0.m166282b("CardScanActivity", "图片宽度:w=" + bitmapDecodeFile.getWidth() + " h=" + bitmapDecodeFile.getHeight());
            o6r0.m166282b("CardScanActivity", "图片框宽度:w=" + imageView.getWidth() + " h=" + imageView.getHeight());
        }
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "takeSuccess", "originalPath", str, "compressPath", str2, "degree", String.valueOf(iM18950R2), "w*h", bitmapDecodeFile.getWidth() + "*" + bitmapDecodeFile.getHeight(), NotificationCompat.CATEGORY_STATUS, "success");
        m18926q2();
    }

    /* JADX INFO: renamed from: M1 */
    private Bitmap m18881M1(Bitmap bitmap, Attr attr) {
        float[] fArr = attr.points;
        if (fArr == null || fArr.length != 8) {
            return bitmap;
        }
        float f = fArr[0];
        float f2 = fArr[6];
        if (f >= f2) {
            f = f2;
        }
        float f3 = f < 80.0f ? 0.0f : f - 80.0f;
        float f4 = fArr[1];
        float f5 = fArr[3];
        if (f4 >= f5) {
            f4 = f5;
        }
        float f6 = f4 >= 80.0f ? f4 - 80.0f : 0.0f;
        float f7 = fArr[2];
        float f8 = fArr[4];
        if (f7 < f8) {
            f7 = f8;
        }
        float width = f7 + 80.0f;
        if (width > bitmap.getWidth()) {
            width = bitmap.getWidth();
        }
        float f9 = fArr[5];
        float f10 = fArr[7];
        if (f9 < f10) {
            f9 = f10;
        }
        float height = f9 + 80.0f;
        if (height > bitmap.getHeight()) {
            height = bitmap.getHeight();
        }
        float f11 = width - f3;
        float f12 = height - f6;
        o6r0.m166285e("CardScanActivity", "getAutoPicture cropLeft:" + f3 + " cropTop:" + f6 + "cropWidth:" + f11 + "cropHeight:" + f12);
        try {
            return Bitmap.createBitmap(bitmap, (int) f3, (int) f6, (int) f11, (int) f12, (Matrix) null, false);
        } catch (Exception e) {
            RecordService.getInstance().recordException(e);
            return bitmap;
        }
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ int m18882N0(CardScanActivity cardScanActivity) {
        int i = cardScanActivity.f13150w;
        cardScanActivity.f13150w = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S2 */
    public void m18888S2() {
        if ("auto".equals(afm.m97360H().m97437b0())) {
            if (f13097I0.equals(this.f13148u)) {
                m18975o3();
                return;
            } else {
                if (f13098J0.equals(this.f13148u)) {
                    m18974n3();
                    return;
                }
                return;
            }
        }
        if ("shoot".equals(afm.m97360H().m97437b0())) {
            m18892U2();
        } else if ("scan".equals(afm.m97360H().m97437b0())) {
            m18890T2();
        }
    }

    /* JADX INFO: renamed from: T2 */
    private void m18890T2() {
        m18947P1().setVisibility(8);
        m18960Z1().setVisibility(8);
        m18953T1().m18815j();
        m18953T1().m18814i();
        this.f13148u = f13098J0;
    }

    /* JADX INFO: renamed from: U2 */
    private void m18892U2() {
        m18947P1().setVisibility(8);
        m18960Z1().setVisibility(0);
        this.f13148u = f13097I0;
        this.f13135j.setFocusModes("continuous-picture");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V2 */
    public void m18894V2() {
        this.f13143p0.removeMessages(1016);
    }

    /* JADX INFO: renamed from: Z2 */
    private void m18898Z2(String str) {
        if (this.f13143p0 != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1018;
            messageObtain.obj = str;
            this.f13143p0.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public String m18900a2(Uri uri) {
        if (uri.getScheme().equalsIgnoreCase("file")) {
            return uri.getPath();
        }
        if (!uri.getScheme().equalsIgnoreCase("content")) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getCacheDir().getPath());
        String str = File.separator;
        sb.append(str);
        sb.append("take photo_cache");
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.mkdir();
        }
        try {
            File file2 = new File(file.getAbsolutePath() + str + System.currentTimeMillis() + ".jpg");
            InputStream inputStreamOpenInputStream = getContentResolver().openInputStream(uri);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStreamOpenInputStream.read(bArr);
                if (-1 == i) {
                    fileOutputStream.flush();
                    inputStreamOpenInputStream.close();
                    fileOutputStream.close();
                    return file2.getAbsolutePath();
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a3 */
    public void m18901a3(String str) {
        this.f13143p0.removeMessages(1013);
        Message messageObtain = Message.obtain();
        messageObtain.what = 1007;
        messageObtain.obj = str;
        this.f13143p0.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b3 */
    public void m18902b3(String str) {
        RecordService recordService = RecordService.getInstance();
        RecordLevel recordLevel = RecordLevel.LOG_INFO;
        recordService.recordEvent(recordLevel, "sendResponseAndFinish", "code", str);
        afm.m97360H().m97445e(str);
        RecordService.getInstance().recordEventPage(recordLevel, "OCR_EXIT", "OCR_SCAN", (System.currentTimeMillis() - this.f13128c) + "ms", str);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c3 */
    public void m18903c3() {
        this.f13143p0.sendEmptyMessageDelayed(1016, hfm.f109326k * hfm.f109329n);
    }

    /* JADX INFO: renamed from: d3 */
    private void m18905d3(Bitmap bitmap) {
        if (!afm.m97360H().m97483r()) {
            this.f13153z = bitmap;
            return;
        }
        int iM97455h0 = (int) afm.m97360H().m97455h0();
        if (iM97455h0 <= 0) {
            iM97455h0 = 480;
        }
        this.f13153z = ac00.m96794m(bitmap, iM97455h0);
    }

    /* JADX INFO: renamed from: e3 */
    private void m18906e3(boolean z) {
        ImageView imageView = (ImageView) findViewById(rcc0.f162189u);
        if (imageView != null) {
            if (z) {
                imageView.setImageResource(yac0.f198167d);
            } else {
                imageView.setImageResource(yac0.f198166c);
            }
            imageView.setVisibility(0);
        }
        TextView textView = (TextView) findViewById(rcc0.f162173m);
        if (textView != null) {
            OcrType ocrType = OcrType.OT_PHOTO_FRONT;
            OcrType ocrType2 = this.f13144q;
            if (ocrType == ocrType2) {
                if (z) {
                    textView.setText(R$string.f12724L0);
                } else {
                    textView.setText(R$string.f12760i0);
                }
            } else if (OcrType.OT_PHOTO_BACK == ocrType2) {
                if (z) {
                    textView.setText(R$string.f12724L0);
                } else {
                    textView.setText(R$string.f12760i0);
                }
            }
        }
        if (z) {
            View viewFindViewById = findViewById(rcc0.f162199z);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(4);
            }
            TextView textViewM18957X1 = m18957X1();
            if (textViewM18957X1 != null) {
                textViewM18957X1.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: f3 */
    private void m18908f3(Bitmap bitmap, Attr attr) {
        ImageView imageView = (ImageView) findViewById(rcc0.f162157g);
        imageView.setVisibility(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = (int) this.f13138l.getRectWidth();
        layoutParams.height = (int) this.f13138l.getRectHeigth();
        getResources().getDimension(vac0.f183078a);
        layoutParams.topMargin = (int) this.f13138l.getRectTop();
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageBitmap(bitmap);
        layoutParams.setMarginStart((int) this.f13138l.getRectLeft());
        layoutParams.setMarginEnd((int) this.f13138l.getRectLeft());
        kkl0.m150192x0(imageView, 0);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, 250.0f, 0.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfPropertyValuesHolder);
        animatorSet.setDuration(500L);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: h3 */
    private void m18910h3(String str, String str2, String str3, String str4, String str5, InterfaceC3781x interfaceC3781x) {
        RecordService.recordOcrAlertAppear(str5);
        if (this.f13113L) {
            return;
        }
        this.f13143p0.post(new RunnableC3770m());
        m18956W2();
        this.f13113L = true;
        IdentityAlertOverlay identityAlertOverlay = (IdentityAlertOverlay) findViewById(rcc0.f162142b);
        if (identityAlertOverlay != null) {
            m18870F1(false);
            identityAlertOverlay.setTitleText(str);
            identityAlertOverlay.setMessageText(str2);
            if (str4 != null) {
                identityAlertOverlay.setCancelText(str4);
                identityAlertOverlay.setButtonType(true);
            } else {
                identityAlertOverlay.setButtonType(false);
            }
            identityAlertOverlay.setConfirmText(str3);
            o6r0.m166282b("CardScanActivity", " setVisibility showMessageBox >>>> : [title]:" + str + "  [message]:" + str2);
            identityAlertOverlay.setVisibility(0);
            azb.m101041a(identityAlertOverlay, azb.m101060t(str5));
            identityAlertOverlay.setCommAlertOverlayListener(new C3771n(str5, interfaceC3781x));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i3 */
    public void m18911i3() {
        m18969g3(false);
        m18910h3(getResources().getString(R$string.f12739W), getResources().getString(R$string.f12735S), getResources().getString(R$string.f12733Q), null, "ocr_over_time_code", new C3775r());
    }

    private void init() {
        Bitmap bitmapM101047g;
        CameraSurfaceView cameraSurfaceView = (CameraSurfaceView) findViewById(rcc0.f162145c);
        this.f13135j = cameraSurfaceView;
        if (cameraSurfaceView != null) {
            cameraSurfaceView.m19199b(this, false, false, null);
            this.f13135j.setCameraCallback(this);
        }
        this.f13142p = (FrameLayout) findViewById(rcc0.f162141a1);
        this.f13141o = (SystemLoadingOverlay) findViewById(rcc0.f162147c1);
        TextView textView = (TextView) findViewById(rcc0.f162173m);
        if (textView != null) {
            textView.setTextColor(azb.f74128d.getOcrTitleColor(y8c0.f197997l));
            textView.setText(m18964d2());
        }
        String str = hfm.f109324i;
        boolean z = str == null || !str.equalsIgnoreCase("Left");
        ImageView imageView = (ImageView) findViewById(rcc0.f162185s);
        ImageView imageView2 = (ImageView) findViewById(rcc0.f162187t);
        if (imageView != null) {
            Bitmap bitmapM101050j = azb.m101050j();
            if (bitmapM101050j != null) {
                imageView2.setImageBitmap(bitmapM101050j);
            }
            imageView.setOnClickListener(new ViewOnClickListenerC3760c());
        }
        ImageView imageView3 = (ImageView) findViewById(rcc0.f162183r);
        ImageView imageView4 = (ImageView) findViewById(rcc0.f162191v);
        Bitmap bitmapM101057q = azb.m101057q();
        if (bitmapM101057q != null) {
            imageView4.setImageBitmap(bitmapM101057q);
        }
        if (imageView3 != null) {
            imageView3.setOnClickListener(new ViewOnClickListenerC3761d());
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) imageView2.getLayoutParams();
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) imageView4.getLayoutParams();
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) imageView3.getLayoutParams();
        if (z) {
            layoutParams.gravity = 8388627;
            layoutParams2.gravity = 8388611;
            imageView.setLayoutParams(layoutParams);
            imageView2.setLayoutParams(layoutParams2);
            layoutParams3.gravity = 8388613;
            layoutParams4.gravity = 8388613;
            imageView4.setLayoutParams(layoutParams3);
            imageView3.setLayoutParams(layoutParams4);
        } else {
            layoutParams.gravity = 8388613;
            layoutParams2.gravity = 8388613;
            imageView.setLayoutParams(layoutParams);
            imageView2.setLayoutParams(layoutParams2);
            layoutParams3.gravity = 8388611;
            layoutParams4.gravity = 8388611;
            imageView4.setLayoutParams(layoutParams3);
            imageView3.setLayoutParams(layoutParams4);
        }
        ImageView imageViewM18960Z1 = m18960Z1();
        if (imageViewM18960Z1 != null) {
            Bitmap bitmapM101055o = azb.m101055o();
            if (bitmapM101055o != null) {
                imageViewM18960Z1.setImageBitmap(bitmapM101055o);
            }
            imageViewM18960Z1.setOnClickListener(new ViewOnClickListenerC3762e());
        }
        TextView textViewM18957X1 = m18957X1();
        if (textViewM18957X1 != null) {
            textViewM18957X1.setTextColor(azb.f74128d.getOcrSubmitTitleColor(y9c0.f198085j));
        }
        ImageView imageViewM18970h2 = m18970h2();
        if (imageViewM18970h2 != null) {
            Bitmap bitmapM101054n = azb.m101054n();
            if (bitmapM101054n != null) {
                imageViewM18970h2.setImageBitmap(bitmapM101054n);
            }
            imageViewM18970h2.setOnClickListener(new ViewOnClickListenerC3763f());
        }
        ImageView imageViewM18966e2 = m18966e2();
        LinearLayout linearLayoutM18968g2 = m18968g2();
        if (linearLayoutM18968g2 != null) {
            linearLayoutM18968g2.setOnClickListener(new ViewOnClickListenerC3764g());
        }
        if (imageViewM18966e2 != null && (bitmapM101047g = azb.m101047g()) != null) {
            imageViewM18966e2.setImageBitmap(bitmapM101047g);
        }
        IdentityScanView identityScanView = this.f13136k;
        if (identityScanView != null) {
            identityScanView.m18813h(m18963c2(), this.f13144q == OcrType.OT_PHOTO_FRONT, cfm.f81515a.equals(this.f13145r));
        }
        m18870F1(true);
        m18920m3(this.f13144q);
        m18949R1().setTextColor(azb.f74128d.getOcrTakePhotoLabelColor(y9c0.f198085j));
        ((TextView) findViewById(rcc0.f162100G0)).setTextColor(azb.f74128d.getOcrAlbumLabelColor(y9c0.f198085j));
    }

    /* JADX INFO: renamed from: j3 */
    private boolean m18913j3(boolean z) {
        try {
            return ((Boolean) getClassLoader().loadClass("com.idv.identity.face.IdentityFaceApi").getDeclaredMethod("start", Context.class, Boolean.TYPE).invoke(null, this, Boolean.valueOf(z))).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "startFace", NotificationCompat.CATEGORY_STATUS, "catchException", "exception", e.toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: k2 */
    private void m18915k2() {
        LinearLayout linearLayoutM18947P1 = m18947P1();
        if (!"auto".equals(afm.m97360H().m97437b0())) {
            if ("scan".equals(afm.m97360H().m97437b0())) {
                m18890T2();
                return;
            } else {
                if ("shoot".equals(afm.m97360H().m97437b0())) {
                    m18892U2();
                    return;
                }
                return;
            }
        }
        String str = this.f13148u;
        if (str == f13096H0) {
            linearLayoutM18947P1.setVisibility(0);
            m18974n3();
            linearLayoutM18947P1.setOnClickListener(new ViewOnClickListenerC3765h());
        } else if (str == f13098J0) {
            m18974n3();
        } else if (str == f13097I0) {
            m18975o3();
        }
    }

    /* JADX INFO: renamed from: k3 */
    private void m18916k3(boolean z) {
        CameraSurfaceView cameraSurfaceView = this.f13135j;
        if (cameraSurfaceView != null) {
            this.f13111J = z;
            cameraSurfaceView.m19198a(z);
            ImageView imageView = (ImageView) findViewById(rcc0.f162191v);
            if (imageView != null) {
                if (this.f13111J) {
                    Bitmap bitmapM101051k = azb.m101051k();
                    if (bitmapM101051k != null) {
                        imageView.setImageBitmap(bitmapM101051k);
                        return;
                    } else {
                        imageView.setImageResource(yac0.f198169f);
                        return;
                    }
                }
                Bitmap bitmapM101057q = azb.m101057q();
                azb.m101057q();
                if (bitmapM101057q != null) {
                    imageView.setImageBitmap(bitmapM101057q);
                } else {
                    imageView.setImageResource(yac0.f198168e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m2 */
    private void m18919m2() {
        if (this.f13110I.get()) {
            return;
        }
        float dimension = getResources().getDimension(vac0.f183079b);
        LinearLayout linearLayout = (LinearLayout) findViewById(rcc0.f162154f);
        float height = linearLayout != null ? linearLayout.getHeight() : 0.0f;
        float dimension2 = getResources().getDimension(vac0.f183082e);
        TextView textView = (TextView) findViewById(rcc0.f162173m);
        if (textView != null && this.f13136k != null) {
            o6r0.m166282b("CardScanActivity", "identityScanView setTop:" + (textView.getBottom() + dimension + height + dimension2));
            this.f13136k.setHoleTop(((float) textView.getBottom()) + dimension + height + dimension2);
            this.f13136k.setHoleLeft(getResources().getDimension(vac0.f183078a));
            this.f13136k.m18808b();
            this.f13136k.m18812g();
        }
        m18940E1();
        m18920m3(this.f13144q);
        m18972l2();
        m18915k2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m3 */
    public void m18920m3(OcrType ocrType) {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "switchOCRType", "ocrType", String.valueOf(ocrType));
        this.f13144q = ocrType;
        this.f13152y = null;
        m18943G1(true);
        m18876K1(true);
        m18873I1(true);
        m18875J1(true);
        TextView textView = (TextView) findViewById(rcc0.f162173m);
        if (textView != null) {
            textView.setText(m18964d2());
        }
        m18955V1().setVisibility(8);
        View viewFindViewById = findViewById(rcc0.f162199z);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(0);
        }
        TextView textViewM18957X1 = m18957X1();
        if (textViewM18957X1 != null) {
            textViewM18957X1.setVisibility(4);
        }
        IdentityAlertOverlay identityAlertOverlay = (IdentityAlertOverlay) findViewById(rcc0.f162142b);
        if (identityAlertOverlay != null) {
            identityAlertOverlay.setVisibility(4);
            this.f13113L = false;
            m18943G1(true);
        }
        FrameLayout frameLayout = this.f13142p;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        ImageView imageView = (ImageView) findViewById(rcc0.f162189u);
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        ImageView imageViewM18970h2 = m18970h2();
        if (imageViewM18970h2 != null) {
            imageViewM18970h2.setVisibility(8);
        }
        LinearLayout linearLayoutM18968g2 = m18968g2();
        if (linearLayoutM18968g2 != null) {
            linearLayoutM18968g2.setVisibility(0);
        }
        LinearLayout linearLayoutM18968g3 = m18968g2();
        if (linearLayoutM18968g3 != null) {
            if (hfm.f109322g) {
                linearLayoutM18968g3.setVisibility(0);
            } else {
                linearLayoutM18968g3.setVisibility(8);
            }
        }
        ImageView imageView2 = (ImageView) findViewById(rcc0.f162087A);
        if (imageView2 != null) {
            imageView2.setVisibility(4);
        }
        m18953T1().m18813h(m18963c2(), this.f13144q == OcrType.OT_PHOTO_FRONT, cfm.f81515a.equals(this.f13145r));
        m18953T1().m18810d(this.f13144q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public void m18923o2() {
        RecordService.getInstance().recordEventBehavior(RecordLevel.LOG_INFO, "PAGER_BEHAVIOR", "exitVerifyBtn", "OCR_SCAN");
        m18910h3(getResources().getString(R$string.f12736T), "", getResources().getString(R$string.f12733Q), getResources().getString(R$string.f12727N), "ocr_exit_code", new C3759b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q2 */
    public void m18926q2() throws Throwable {
        String strM96785d;
        hki.m135625d().m135629f();
        OSSConfig oSSConfigM97443d0 = afm.m97360H().m97443d0();
        if (oSSConfigM97443d0 == null || oSSConfigM97443d0.FileNamePrefix == null || oSSConfigM97443d0.OssEndPoint == null || oSSConfigM97443d0.AccessKeyId == null || oSSConfigM97443d0.AccessKeySecret == null) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "submitPhoto", NotificationCompat.CATEGORY_STATUS, "error", "errMsg", "ossConfig is null.");
            return;
        }
        byte[] bArrM96783b = ac00.m96783b(this.f13153z);
        xxb xxbVar = this.f13104E0;
        if (xxbVar != null && xxbVar.m213516c() && bArrM96783b != null) {
            bArrM96783b = this.f13104E0.m213514a(bArrM96783b);
        }
        byte[] bArr = bArrM96783b;
        if (bArr == null) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "submitPhoto", NotificationCompat.CATEGORY_STATUS, "error", "errMsg", "ocrCropBitmap is null.");
            return;
        }
        OcrType ocrType = OcrType.OT_PHOTO_FRONT;
        OcrType ocrType2 = this.f13144q;
        if (ocrType == ocrType2) {
            strM96785d = ac00.m96785d(oSSConfigM97443d0.FileNamePrefix, "ocridface", "jpeg");
            hki.m135625d().m135626b(1, oSSConfigM97443d0.BucketName, strM96785d, bArr, oSSConfigM97443d0);
        } else if (OcrType.OT_PHOTO_BACK == ocrType2) {
            strM96785d = ac00.m96785d(oSSConfigM97443d0.FileNamePrefix, "ocridback", "jpeg");
            hki.m135625d().m135626b(2, oSSConfigM97443d0.BucketName, strM96785d, bArr, oSSConfigM97443d0);
        } else if (OcrType.OT_PHOTO_THIRD == ocrType2) {
            strM96785d = ac00.m96785d(oSSConfigM97443d0.FileNamePrefix, "ocridthrid", "jpeg");
            hki.m135625d().m135626b(11, oSSConfigM97443d0.BucketName, strM96785d, bArr, oSSConfigM97443d0);
        } else if (OcrType.OT_PHOTO_BACK_3D == ocrType2) {
            strM96785d = ac00.m96785d(oSSConfigM97443d0.FileNamePrefix, "ocridback_3d", "jpeg");
            hki.m135625d().m135626b(20, oSSConfigM97443d0.BucketName, strM96785d, bArr, oSSConfigM97443d0);
        } else {
            if (OcrType.OT_PHOTO_FRONT_3D != ocrType2) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "submitPhoto", NotificationCompat.CATEGORY_STATUS, "error", "errMsg", "ocrType is " + this.f13144q);
                return;
            }
            strM96785d = ac00.m96785d(oSSConfigM97443d0.FileNamePrefix, "ocridface_3d", "jpeg");
            hki.m135625d().m135626b(10, oSSConfigM97443d0.BucketName, strM96785d, bArr, oSSConfigM97443d0);
        }
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "submitPhoto", NotificationCompat.CATEGORY_STATUS, "success", "ocrType", String.valueOf(this.f13144q), "ossFileName", strM96785d, "ossOriginFileName", "", "w", String.valueOf(this.f13153z.getWidth()), "h", String.valueOf(this.f13153z.getHeight()), "oriW", String.valueOf(this.f13099A.getWidth()), "oriH", String.valueOf(this.f13099A.getHeight()));
        hki.m135625d().m135631h(this, new C3767j(System.currentTimeMillis()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r2 */
    public void m18928r2(boolean z) {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "clickTakePhoto", NotificationCompat.CATEGORY_STATUS, "success", "isAuto", z + "");
        dql cameraInterface = this.f13135j.getCameraInterface();
        if (cameraInterface != null) {
            cameraInterface.mo117534c(new C3766i(z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public void m18930s2(String str) {
        if (str != null) {
            if (dfm.f88188i.equalsIgnoreCase(str) || dfm.f88189j.equalsIgnoreCase(str)) {
                m18910h3(getResources().getString(R$string.f12707D), getResources().getString(R$string.f12701A), getResources().getString(R$string.f12781t), null, str, new C3773p(str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public void m18934v2() {
        this.f13146s++;
        String strM97458i0 = afm.m97360H().m97458i0();
        int iM97492u = afm.m97360H().m97492u();
        if ((!ffm.f98803f.equals(strM97458i0) && this.f13146s > afm.m97360H().m97489t().size() - 1) || (ffm.f98803f.equals(strM97458i0) && this.f13146s >= iM97492u)) {
            if (isFinishing()) {
                return;
            }
            m18872H2();
            return;
        }
        this.f13110I.set(false);
        this.f13150w = hfm.f109325j;
        m18894V2();
        m18903c3();
        IdentityScanView identityScanView = this.f13136k;
        if (identityScanView != null) {
            identityScanView.m18809c(500, new C3774q());
        }
    }

    /* JADX INFO: renamed from: B2 */
    public void m18938B2() {
        m18969g3(false);
        m18906e3(true);
        this.f13143p0.removeMessages(1013);
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "ocrSuccess", NotificationCompat.CATEGORY_STATUS, "success", "ocrType", String.valueOf(this.f13144q));
        this.f13143p0.sendEmptyMessageDelayed(1005, 300L);
    }

    /* JADX INFO: renamed from: D2 */
    public void m18939D2(boolean z) throws Throwable {
        String strM135628e;
        String str;
        String strM96782a;
        String strM97472n = afm.m97360H().m97472n();
        OcrType ocrType = OcrType.OT_PHOTO_FRONT;
        OcrType ocrType2 = this.f13144q;
        if (ocrType == ocrType2) {
            strM135628e = hki.m135625d().m135628e(1);
            str = "OCR_ID_FACE";
        } else if (OcrType.OT_PHOTO_BACK == ocrType2) {
            strM135628e = hki.m135625d().m135628e(2);
            str = "OCR_ID_BACK";
        } else if (OcrType.OT_PHOTO_THIRD == ocrType2) {
            strM135628e = hki.m135625d().m135628e(11);
            str = "OCR_ID_THIRD";
        } else if (OcrType.OT_PHOTO_FRONT_3D == ocrType2) {
            strM135628e = hki.m135625d().m135628e(10);
            str = "OCR_ID_FACE_3D";
        } else {
            if (OcrType.OT_PHOTO_BACK_3D != ocrType2) {
                return;
            }
            strM135628e = hki.m135625d().m135628e(20);
            str = "OCR_ID_BACK_3D";
        }
        String str2 = str;
        String str3 = strM135628e;
        if (this.f13112K) {
            afm.m97360H().m97374D0(true);
        } else {
            afm.m97360H().m97374D0(false);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArrM96783b = ac00.m96783b(this.f13153z);
        xxb xxbVar = this.f13104E0;
        if (xxbVar == null || !xxbVar.m213516c() || bArrM96783b == null) {
            strM96782a = null;
        } else {
            strM96782a = ac00.m96782a(this.f13104E0.m213515b());
            bArrM96783b = this.f13104E0.m213514a(bArrM96783b);
        }
        C3776s c3776s = new C3776s(jCurrentTimeMillis, str2);
        qk20.m176911h(strM97472n, str3, str2, bArrM96783b, strM96782a, false, z, c3776s);
    }

    /* JADX INFO: renamed from: E1 */
    public RectF m18940E1() {
        RectMaskView rectMaskViewM18962b2 = m18962b2();
        if (this.f13136k == null || rectMaskViewM18962b2 == null) {
            return null;
        }
        float rectLeft = rectMaskViewM18962b2.getRectLeft();
        float rectTop = rectMaskViewM18962b2.getRectTop();
        RectF rectF = new RectF(rectLeft, rectTop, rectMaskViewM18962b2.getRectWidth() + rectLeft, rectMaskViewM18962b2.getRectHeigth() + rectTop);
        int i = this.f13135j.getLayoutParams().width;
        int i2 = this.f13135j.getLayoutParams().height;
        float f = i;
        this.f13147t[0] = (rectF.left - this.f13135j.getX()) / f;
        float f2 = i2;
        this.f13147t[1] = (rectF.top - this.f13135j.getY()) / f2;
        this.f13147t[2] = (rectF.right - this.f13135j.getX()) / f;
        float[] fArr = this.f13147t;
        fArr[3] = fArr[1];
        fArr[6] = fArr[0];
        fArr[7] = (rectF.bottom - this.f13135j.getY()) / f2;
        this.f13147t[4] = (rectF.right - this.f13135j.getX()) / f;
        float[] fArr2 = this.f13147t;
        fArr2[5] = fArr2[7];
        return rectF;
    }

    /* JADX INFO: renamed from: E2 */
    public void m18941E2() {
        m18910h3(getResources().getString(R$string.f12719J), getResources().getString(R$string.f12735S), getResources().getString(R$string.f12734R), null, "ocr_out_time_code", new C3780w());
    }

    /* JADX INFO: renamed from: F2 */
    public void m18942F2() {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "sdkMaxTimeout", NotificationCompat.CATEGORY_STATUS, "error");
        m18901a3(dfm.f88170A);
    }

    /* JADX INFO: renamed from: G1 */
    public void m18943G1(boolean z) {
        ImageView imageView = (ImageView) findViewById(rcc0.f162185s);
        m18959Y1().setEnabled(z);
        m18947P1().setEnabled(z);
        if (imageView != null) {
            imageView.setEnabled(z);
        }
    }

    /* JADX INFO: renamed from: M2 */
    public void m18944M2() {
    }

    /* JADX INFO: renamed from: N2 */
    public void m18945N2(p94 p94Var) {
        if (this.f13140n != null) {
            m18944M2();
            m18948Q2(new Frame(p94Var.f151106q, p94Var.m171337d(), p94Var.m171336c(), p94Var.m171340g(), 0, 0));
        }
    }

    /* JADX INFO: renamed from: O1 */
    public ImageView m18946O1() {
        if (this.f13101C == null) {
            this.f13101C = (ImageView) findViewById(rcc0.f162169k);
        }
        return this.f13101C;
    }

    /* JADX INFO: renamed from: P1 */
    public LinearLayout m18947P1() {
        if (this.f13100B == null) {
            this.f13100B = (LinearLayout) findViewById(rcc0.f162126T0);
        }
        return this.f13100B;
    }

    /* JADX INFO: renamed from: Q2 */
    public boolean m18948Q2(Frame frame) {
        bn2 bn2Var = this.f13140n;
        if (bn2Var == null) {
            return false;
        }
        bn2Var.processImage(frame);
        return false;
    }

    /* JADX INFO: renamed from: R1 */
    public TextView m18949R1() {
        if (this.f13107G == null) {
            this.f13107G = (TextView) findViewById(rcc0.f162160h);
        }
        return this.f13107G;
    }

    /* JADX INFO: renamed from: R2 */
    public int m18950R2(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(p7f.TAG_ORIENTATION, 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: S1 */
    public OcrType m18951S1(int i) {
        if (ffm.f98803f.equals(afm.m97360H().m97458i0())) {
            if (i == 0) {
                return OcrType.OT_PHOTO_FRONT;
            }
            if (i == 1) {
                return OcrType.OT_PHOTO_BACK;
            }
            if (i == 2) {
                return OcrType.OT_PHOTO_THIRD;
            }
        }
        if (afm.m97360H().m97489t() == null || afm.m97360H().m97489t().isEmpty()) {
            return OcrType.OT_PHOTO_FRONT;
        }
        String str = afm.m97360H().m97489t().get(i);
        str.getClass();
        switch (str) {
            case "OCR_ID_BACK_3D":
                return OcrType.OT_PHOTO_BACK_3D;
            case "OCR_ID_FACE_3D":
                return OcrType.OT_PHOTO_FRONT_3D;
            case "OCR_ID_BACK":
                return OcrType.OT_PHOTO_BACK;
            default:
                return OcrType.OT_PHOTO_FRONT;
        }
    }

    @Override // p153l.zpl
    /* JADX INFO: renamed from: T */
    public void mo18952T(int i, Throwable th) {
        String str;
        RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "cameraError", "code", String.valueOf(i), "message", th.getMessage());
        switch (i) {
            case 100:
                str = dfm.f88186g;
                break;
            case 101:
                RecordService.getInstance().recordException(th);
                str = dfm.f88188i;
                break;
            case 102:
                str = dfm.f88189j;
                break;
            default:
                str = "unkown Camera Code =>" + i;
                break;
        }
        m18898Z2(str);
    }

    /* JADX INFO: renamed from: T1 */
    public IdentityScanView m18953T1() {
        if (this.f13136k == null) {
            this.f13136k = (IdentityScanView) findViewById(rcc0.f162181q);
        }
        return this.f13136k;
    }

    /* JADX INFO: renamed from: U1 */
    public IdentityAlertOverlay m18954U1() {
        return (IdentityAlertOverlay) findViewById(rcc0.f162142b);
    }

    /* JADX INFO: renamed from: V1 */
    public ImageView m18955V1() {
        if (this.f13102D == null) {
            this.f13102D = (ImageView) findViewById(rcc0.f162157g);
        }
        return this.f13102D;
    }

    /* JADX INFO: renamed from: W2 */
    public void m18956W2() {
        bn2 bn2Var = this.f13140n;
        if (bn2Var != null) {
            bn2Var.m105280c();
        }
    }

    /* JADX INFO: renamed from: X1 */
    public TextView m18957X1() {
        return (TextView) findViewById(rcc0.f162089B);
    }

    /* JADX INFO: renamed from: X2 */
    public Bitmap m18958X2(int i, Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* JADX INFO: renamed from: Y1 */
    public ImageView m18959Y1() {
        if (this.f13105F == null) {
            this.f13105F = (ImageView) findViewById(rcc0.f162183r);
        }
        return (ImageView) findViewById(rcc0.f162183r);
    }

    /* JADX INFO: renamed from: Z1 */
    public ImageView m18960Z1() {
        if (this.f13103E == null) {
            this.f13103E = (ImageView) findViewById(rcc0.f162171l);
        }
        return (ImageView) findViewById(rcc0.f162171l);
    }

    @Override // p153l.zpl
    /* JADX INFO: renamed from: b0 */
    public void mo18961b0() {
    }

    /* JADX INFO: renamed from: b2 */
    public RectMaskView m18962b2() {
        if (this.f13138l == null) {
            this.f13138l = (RectMaskView) findViewById(rcc0.f162112M0);
        }
        return this.f13138l;
    }

    /* JADX INFO: renamed from: c2 */
    public Drawable m18963c2() {
        int i;
        if (ffm.f98803f.equals(afm.m97360H().m97458i0())) {
            return getResources().getDrawable(yac0.f198165b);
        }
        if (cfm.f81522h.equals(this.f13145r)) {
            OcrType ocrType = OcrType.OT_PHOTO_FRONT;
            OcrType ocrType2 = this.f13144q;
            if (ocrType == ocrType2) {
                i = yac0.f198171h;
            } else {
                i = OcrType.OT_PHOTO_BACK == ocrType2 ? yac0.f198170g : yac0.f198165b;
            }
        } else {
            i = (cfm.f81515a.equals(this.f13145r) && this.f13144q == OcrType.OT_PHOTO_FRONT) ? yac0.f198171h : yac0.f198165b;
        }
        return getResources().getDrawable(i);
    }

    /* JADX INFO: renamed from: d2 */
    public String m18964d2() {
        int i;
        String strM97495v = afm.m97360H().m97495v();
        if (strM97495v == null) {
            return "";
        }
        if (cfm.f81515a.equals(strM97495v)) {
            i = R$string.f12746b0;
        } else {
            OcrType ocrType = OcrType.OT_PHOTO_FRONT;
            OcrType ocrType2 = this.f13144q;
            if (ocrType == ocrType2) {
                i = R$string.f12748c0;
            } else if (OcrType.OT_PHOTO_BACK == ocrType2) {
                i = R$string.f12742Z;
            } else if (OcrType.OT_PHOTO_THIRD == ocrType2) {
                i = R$string.f12752e0;
            } else if (OcrType.OT_PHOTO_FRONT_3D == ocrType2) {
                i = R$string.f12750d0;
            } else {
                i = OcrType.OT_PHOTO_BACK_3D == ocrType2 ? R$string.f12744a0 : 0;
            }
        }
        return getResources().getString(i);
    }

    @Override // p153l.zpl
    /* JADX INFO: renamed from: e0 */
    public void mo18965e0() {
    }

    /* JADX INFO: renamed from: e2 */
    public ImageView m18966e2() {
        return (ImageView) findViewById(rcc0.f162163i);
    }

    @Override // p153l.zpl
    /* JADX INFO: renamed from: g0 */
    public void mo18967g0(double d, double d2) {
        FrameLayout.LayoutParams layoutParams;
        CameraSurfaceView cameraSurfaceView = this.f13135j;
        if (cameraSurfaceView == null || (layoutParams = (FrameLayout.LayoutParams) cameraSurfaceView.getLayoutParams()) == null) {
            return;
        }
        CameraSurfaceView cameraSurfaceView2 = this.f13135j;
        if (d <= d2) {
            int width = cameraSurfaceView2.getWidth();
            layoutParams.width = width;
            layoutParams.height = (int) ((((double) width) * d2) / (d * 1.0d));
            this.f13135j.setLayoutParams(layoutParams);
            this.f13135j.setBackgroundColor(0);
            ImageView imageView = (ImageView) findViewById(rcc0.f162087A);
            if (imageView != null) {
                imageView.setLayoutParams(layoutParams);
            }
        } else {
            int height = cameraSurfaceView2.getHeight();
            layoutParams.height = height;
            layoutParams.width = (int) ((((double) height) / (d2 * 1.0d)) * d);
            this.f13135j.setLayoutParams(layoutParams);
            this.f13135j.setBackgroundColor(0);
            ImageView imageView2 = (ImageView) findViewById(rcc0.f162087A);
            if (imageView2 != null) {
                imageView2.setLayoutParams(layoutParams);
            }
        }
        o6r0.m166281a("SurfaceView 宽度:w=" + layoutParams.width + " h=" + layoutParams.height);
    }

    /* JADX INFO: renamed from: g2 */
    public LinearLayout m18968g2() {
        return (LinearLayout) findViewById(rcc0.f162138Z0);
    }

    /* JADX INFO: renamed from: g3 */
    public void m18969g3(boolean z) {
        m18943G1(!z);
        m18870F1(!z);
        FrameLayout frameLayout = this.f13142p;
        if (frameLayout != null) {
            frameLayout.setVisibility(z ? 0 : 8);
            TextView textView = (TextView) findViewById(scc0.f167234w);
            if (textView != null) {
                textView.setText(R$string.f12730O0);
                textView.setTextColor(azb.f74128d.getOcrLoadingColor(y9c0.f198084i));
            }
        }
    }

    /* JADX INFO: renamed from: h2 */
    public ImageView m18970h2() {
        return (ImageView) findViewById(rcc0.f162166j);
    }

    /* JADX INFO: renamed from: i2 */
    public boolean m18971i2() {
        IdentityAlertOverlay identityAlertOverlayM18954U1 = m18954U1();
        return identityAlertOverlayM18954U1 != null && identityAlertOverlayM18954U1.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: l2 */
    public void m18972l2() {
        if ("shoot".equals(afm.m97360H().m97437b0())) {
            return;
        }
        bn2 bn2Var = (bn2) ofm.m167457a("com.idv.identity.service.ocr.IdentityDocService", bn2.class);
        this.f13140n = bn2Var;
        if (bn2Var == null) {
            o6r0.m166281a("CardScanActivityinitScanOcr baseIdentityDocService is null");
        } else {
            this.f13140n.m105278a(this, this, m18868C1().toString(), null, new HashMap());
        }
    }

    /* JADX INFO: renamed from: n2 */
    public <T> void m18973n2(Class<T> cls) {
        Intent intent = new Intent((Context) this, (Class<?>) cls);
        intent.putExtra("sdkMaxTimeout", 120000 - (System.currentTimeMillis() - this.f13151x));
        startActivity(intent);
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "navigateResultPage", NotificationCompat.CATEGORY_STATUS, "success");
    }

    /* JADX INFO: renamed from: n3 */
    public void m18974n3() {
        if (this.f13140n == null) {
            Toast.makeText(this, "No integrated automatic scanning module", 0).show();
            return;
        }
        m18947P1().setVisibility(0);
        ImageView imageViewM18946O1 = m18946O1();
        TextView textViewM18949R1 = m18949R1();
        this.f13148u = f13098J0;
        Bitmap bitmapM101056p = azb.m101056p();
        if (bitmapM101056p != null) {
            imageViewM18946O1.setImageBitmap(bitmapM101056p);
        } else {
            imageViewM18946O1.setImageResource(yac0.f198172i);
        }
        textViewM18949R1.setText(R$string.f12726M0);
        this.f13136k.m18814i();
        m18960Z1().setVisibility(8);
        this.f13135j.setFocusModes("continuous-video");
    }

    /* JADX INFO: renamed from: o3 */
    public void m18975o3() {
        m18947P1().setVisibility(0);
        ImageView imageViewM18946O1 = m18946O1();
        TextView textViewM18949R1 = m18949R1();
        this.f13148u = f13097I0;
        Bitmap bitmapM101048h = azb.m101048h();
        if (bitmapM101048h != null) {
            imageViewM18946O1.setImageBitmap(bitmapM101048h);
        } else {
            imageViewM18946O1.setImageResource(yac0.f198164a);
        }
        textViewM18949R1.setText(R$string.f12722K0);
        IdentityScanView identityScanView = this.f13136k;
        if (identityScanView != null) {
            identityScanView.m18815j();
        }
        m18960Z1().setVisibility(0);
        this.f13135j.setFocusModes("continuous-picture");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m18910h3(getResources().getString(R$string.f12736T), "", getResources().getString(R$string.f12733Q), getResources().getString(R$string.f12727N), "ocr_exit_code", new C3769l());
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        o6r0.m166282b("CardScanActivity", "onCreate");
        this.f13144q = m18951S1(this.f13146s);
        setContentView(dec0.f87997a);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            window.getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
        }
        o6r0.m166282b("onCreate", "Build.VERSION.SDK_INT:" + Build.VERSION.SDK_INT);
        this.f13128c = System.currentTimeMillis();
        this.f13109H = 0;
        RecordService.getInstance().recordEventPage(RecordLevel.LOG_INFO, "OCR_ENTER", "OCR_SCAN");
        IdentityScanView identityScanView = (IdentityScanView) findViewById(rcc0.f162181q);
        this.f13136k = identityScanView;
        if (identityScanView != null) {
            identityScanView.setHoleColor(azb.f74128d.getOcrBorderColor(y9c0.f198085j));
        }
        this.f13104E0 = new xxb(ac00.m96790i(this, "identity-key-public.key"), true);
        String strM97495v = afm.m97360H().m97495v();
        this.f13145r = strM97495v;
        if (strM97495v == null) {
            this.f13145r = "";
        }
        this.f13150w = hfm.f109325j;
        LinearLayout linearLayoutM18968g2 = m18968g2();
        if (linearLayoutM18968g2 != null) {
            if (hfm.f109322g) {
                linearLayoutM18968g2.setVisibility(0);
            } else {
                linearLayoutM18968g2.setVisibility(8);
            }
        }
        init();
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        CameraSurfaceView cameraSurfaceView = this.f13135j;
        if (cameraSurfaceView != null) {
            cameraSurfaceView.setVisibility(4);
            this.f13135j.getSurfaceHolder().removeCallback(this.f13135j);
            this.f13135j = null;
        }
        m18894V2();
        this.f13143p0.removeMessages(1013);
        m18969g3(false);
        IdentityScanView identityScanView = this.f13136k;
        if (identityScanView != null) {
            identityScanView.m18815j();
            this.f13136k.m18813h(null, true, false);
            this.f13136k.clearAnimation();
            this.f13136k.removeAllViews();
            this.f13136k = null;
        }
        bn2 bn2Var = this.f13140n;
        if (bn2Var != null) {
            bn2Var.m105279b();
        }
        this.f13146s = 0;
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "destroyCardScanActivity", "timeCost", String.valueOf((System.currentTimeMillis() - this.f13128c) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f45294s);
        RecordService.getInstance().flush();
        this.f13104E0 = null;
        hki.m135625d().m135630g();
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f13109H = 1;
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m18894V2();
        m18903c3();
        if (this.f13109H == 2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "pressBackClose ");
            m18902b3("CODE_VERIFY_INTERRUPT");
        }
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f13109H = 2;
        m18894V2();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            o6r0.m166282b("CardScanActivity", "onWindowFocusChanged");
            m18919m2();
        }
    }

    @Override // p153l.zpl
    /* JADX INFO: renamed from: p0 */
    public void mo18976p0(p94 p94Var) {
        if (this.f13110I.get() || m18971i2() || this.f13148u != f13098J0) {
            return;
        }
        m18945N2(p94Var);
    }

    /* JADX INFO: renamed from: p2 */
    public void m18977p2() {
        if (m18913j3(true)) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "onClickStartFaceView", NotificationCompat.CATEGORY_STATUS, "success");
        } else {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "onClickStartFaceView", NotificationCompat.CATEGORY_STATUS, "error");
        }
    }

    /* JADX INFO: renamed from: p3 */
    public void m18978p3() {
        String strM97458i0 = afm.m97360H().m97458i0();
        if (strM97458i0 == null) {
            return;
        }
        if (ffm.f98801d.equals(strM97458i0)) {
            m18973n2(FinalVerifyActivity.class);
            return;
        }
        if (ffm.f98802e.equals(strM97458i0) || ffm.f98803f.equals(strM97458i0)) {
            CameraSurfaceView cameraSurfaceView = this.f13135j;
            if (cameraSurfaceView != null) {
                cameraSurfaceView.m19200c();
                this.f13135j.getSurfaceHolder().removeCallback(this.f13135j);
                this.f13135j = null;
            }
            m18977p2();
        }
    }

    /* JADX INFO: renamed from: u2 */
    public void m18979u2() {
        boolean z = !this.f13111J;
        this.f13111J = z;
        m18916k3(z);
    }

    /* JADX INFO: renamed from: w2 */
    public void m18980w2(Message message) {
        String str = (String) message.obj;
        if (message.what == 1007 && "CODE_NETWORK_ERROR".equals(str)) {
            str = str + "_1006";
        }
        afm.m97360H().m97445e(str);
        m18879L1(str);
    }

    /* JADX INFO: renamed from: y2 */
    public void m18981y2() {
        m18969g3(false);
        m18910h3(getResources().getString(R$string.f12737U), getResources().getString(R$string.f12735S), getResources().getString(R$string.f12734R), null, "ocr_failed_code", new C3778u());
    }

    /* JADX INFO: renamed from: z2 */
    public void m18982z2() {
        m18969g3(false);
        m18910h3(getResources().getString(R$string.f12740X), getResources().getString(R$string.f12731P), getResources().getString(R$string.f12734R), getResources().getString(R$string.f12729O), "ocr_network_error_code", new C3777t());
    }
}
