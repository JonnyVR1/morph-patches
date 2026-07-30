package com.idv.identity.ocr.p037ui;

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
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p149l.a60;
import p149l.aql;
import p149l.d300;
import p149l.d720;
import p149l.fs5;
import p149l.g60;
import p149l.gbl0;
import p149l.gs5;
import p149l.hc20;
import p149l.ixq0;
import p149l.j6f;
import p149l.jwb;
import p149l.k4c0;
import p149l.kcm;
import p149l.khi;
import p149l.l4c0;
import p149l.mcm;
import p149l.mxb;
import p149l.n2c0;
import p149l.ncm;
import p149l.onl;
import p149l.pcm;
import p149l.q2c0;
import p149l.q84;
import p149l.r1c0;
import p149l.rcm;
import p149l.s1c0;
import p149l.snl;
import p149l.tcm;
import p149l.um2;
import p149l.x5c0;
import p149l.xnl;
import p149l.ycm;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes7.dex */
public class CardScanActivity extends IntlFaceBaseActivity implements onl, aql {

    /* JADX INFO: renamed from: H0 */
    public static String f12355H0 = "NONE";

    /* JADX INFO: renamed from: I0 */
    public static String f12356I0 = "shoot";

    /* JADX INFO: renamed from: J0 */
    public static String f12357J0 = "scan";

    /* JADX INFO: renamed from: E0 */
    private jwb f12363E0;

    /* JADX INFO: renamed from: F0 */
    ActivityResultContracts.PickVisualMedia f12365F0;

    /* JADX INFO: renamed from: G0 */
    g60<PickVisualMediaRequest> f12367G0;

    /* JADX INFO: renamed from: j */
    private CameraSurfaceView f12394j;

    /* JADX INFO: renamed from: k */
    private IdentityScanView f12395k;

    /* JADX INFO: renamed from: n */
    um2 f12399n;

    /* JADX INFO: renamed from: c */
    private long f12387c = System.currentTimeMillis();

    /* JADX INFO: renamed from: d */
    private final String f12388d = "ocridface";

    /* JADX INFO: renamed from: e */
    private final String f12389e = "ocridface_3d";

    /* JADX INFO: renamed from: f */
    private final String f12390f = "ocridorigin";

    /* JADX INFO: renamed from: g */
    private final String f12391g = "ocridback";

    /* JADX INFO: renamed from: h */
    private final String f12392h = "ocridthrid";

    /* JADX INFO: renamed from: i */
    private final String f12393i = "ocridback_3d";

    /* JADX INFO: renamed from: l */
    private RectMaskView f12397l = null;

    /* JADX INFO: renamed from: m */
    private RectMaskTrapView f12398m = null;

    /* JADX INFO: renamed from: o */
    SystemLoadingOverlay f12400o = null;

    /* JADX INFO: renamed from: p */
    FrameLayout f12401p = null;

    /* JADX INFO: renamed from: q */
    private OcrType f12403q = OcrType.OT_PHOTO_FRONT;

    /* JADX INFO: renamed from: r */
    private String f12404r = "";

    /* JADX INFO: renamed from: s */
    private int f12405s = 0;

    /* JADX INFO: renamed from: t */
    private float[] f12406t = new float[8];

    /* JADX INFO: renamed from: u */
    public String f12407u = f12355H0;

    /* JADX INFO: renamed from: v */
    private boolean f12408v = false;

    /* JADX INFO: renamed from: w */
    private int f12409w = 0;

    /* JADX INFO: renamed from: x */
    private long f12410x = System.currentTimeMillis();

    /* JADX INFO: renamed from: y */
    private Bitmap f12411y = null;

    /* JADX INFO: renamed from: z */
    private Bitmap f12412z = null;

    /* JADX INFO: renamed from: A */
    private Bitmap f12358A = null;

    /* JADX INFO: renamed from: B */
    private LinearLayout f12359B = null;

    /* JADX INFO: renamed from: C */
    private ImageView f12360C = null;

    /* JADX INFO: renamed from: D */
    private ImageView f12361D = null;

    /* JADX INFO: renamed from: E */
    private ImageView f12362E = null;

    /* JADX INFO: renamed from: F */
    private ImageView f12364F = null;

    /* JADX INFO: renamed from: G */
    private TextView f12366G = null;

    /* JADX INFO: renamed from: H */
    protected int f12368H = 0;

    /* JADX INFO: renamed from: I */
    private AtomicBoolean f12369I = new AtomicBoolean(false);

    /* JADX INFO: renamed from: J */
    protected boolean f12370J = false;

    /* JADX INFO: renamed from: K */
    private boolean f12371K = false;

    /* JADX INFO: renamed from: L */
    private boolean f12372L = false;

    /* JADX INFO: renamed from: M */
    private final int f12373M = 1000;

    /* JADX INFO: renamed from: N */
    private final int f12374N = 1005;

    /* JADX INFO: renamed from: O */
    private final int f12375O = 1007;

    /* JADX INFO: renamed from: P */
    private final int f12376P = 1008;

    /* JADX INFO: renamed from: Q */
    private final int f12377Q = 1009;

    /* JADX INFO: renamed from: R */
    private final int f12378R = 1010;

    /* JADX INFO: renamed from: S */
    private final int f12379S = 1011;

    /* JADX INFO: renamed from: T */
    private final int f12380T = 1012;

    /* JADX INFO: renamed from: U */
    private final int f12381U = 1013;

    /* JADX INFO: renamed from: V */
    private final int f12382V = 1015;

    /* JADX INFO: renamed from: W */
    private final int f12383W = 1016;

    /* JADX INFO: renamed from: X */
    private final int f12384X = 1017;

    /* JADX INFO: renamed from: Y */
    private final int f12385Y = 1018;

    /* JADX INFO: renamed from: Z */
    private final int f12386Z = 2000;

    /* JADX INFO: renamed from: k0 */
    private final int f12396k0 = 3000;

    /* JADX INFO: renamed from: p0 */
    public Handler f12402p0 = new Handler(new C3609k());

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$a */
    public class C3599a implements a60<Uri> {

        /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$a$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Uri f12414a;

            /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$a$a$a, reason: collision with other inner class name */
            public class C22689a implements fs5.InterfaceC16917a {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ long f12416a;

                /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$a$a$a$a, reason: collision with other inner class name */
                public class RunnableC22690a implements Runnable {

                    /* JADX INFO: renamed from: a */
                    final /* synthetic */ String f12418a;

                    /* JADX INFO: renamed from: b */
                    final /* synthetic */ String f12419b;

                    public RunnableC22690a(String str, String str2) {
                        this.f12418a = str;
                        this.f12419b = str2;
                    }

                    @Override // java.lang.Runnable
                    public void run() throws Throwable {
                        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "takeSuccess", NotificationCompat.CATEGORY_STATUS, "onCompressSuccess", "compress time", String.valueOf(System.currentTimeMillis() - C22689a.this.f12416a));
                        CardScanActivity.this.m17801K2(this.f12418a, this.f12419b);
                    }
                }

                public C22689a(long j) {
                    this.f12416a = j;
                }

                @Override // p149l.fs5.InterfaceC16917a
                /* JADX INFO: renamed from: a */
                public void mo17907a(String str, String str2) {
                    CardScanActivity.this.m17891e3(false);
                    CardScanActivity.this.m17791E1(true);
                    RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "takeSuccess", NotificationCompat.CATEGORY_STATUS, "compressError", "msg", str2);
                    if (CardScanActivity.this.f12407u.equals(CardScanActivity.f12357J0)) {
                        CardScanActivity.this.f12369I.set(false);
                        if (CardScanActivity.this.f12395k != null) {
                            CardScanActivity.this.f12395k.m17737i();
                        }
                    }
                }

                @Override // p149l.fs5.InterfaceC16917a
                /* JADX INFO: renamed from: b */
                public void mo17908b(String str, String str2) {
                    CardScanActivity.this.f12402p0.post(new RunnableC22690a(str, str2));
                }
            }

            public a(Uri uri) {
                this.f12414a = uri;
            }

            @Override // java.lang.Runnable
            public void run() {
                CardScanActivity.this.f12408v = false;
                if (this.f12414a == null) {
                    ixq0.m138885b("PhotoPicker", "No media selected");
                    CardScanActivity.this.m17891e3(false);
                    CardScanActivity.this.m17791E1(true);
                } else {
                    CardScanActivity.this.m17891e3(true);
                    CompressConfig compressConfigM17739a = new CompressConfig.C3583b().m17740b(512000).m17739a();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    CardScanActivity cardScanActivity = CardScanActivity.this;
                    gs5.m127780e(cardScanActivity, compressConfigM17739a, cardScanActivity.m17822Z1(this.f12414a), new C22689a(jCurrentTimeMillis)).mo122920a();
                }
            }
        }

        public C3599a() {
        }

        @Override // p149l.a60
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2610a(Uri uri) {
            ixq0.m138885b("PhotoPicker", "Selected URI: " + uri);
            CardScanActivity.this.f12402p0.postDelayed(new a(uri), 200L);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$b */
    public class C3600b implements InterfaceC3622x {
        public C3600b() {
        }

        @Override // com.idv.identity.ocr.p037ui.CardScanActivity.InterfaceC3622x
        /* JADX INFO: renamed from: a */
        public void mo17909a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "closeButton");
            CardScanActivity.this.m17821Y2(ncm.f138196f);
        }

        @Override // com.idv.identity.ocr.p037ui.CardScanActivity.InterfaceC3622x
        public void onCancel() {
            CardScanActivity.this.m17866F1(true);
            CardScanActivity.this.m17825a3();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$c */
    public class ViewOnClickListenerC3601c implements View.OnClickListener {
        public ViewOnClickListenerC3601c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CardScanActivity.this.m17815U2();
            CardScanActivity.this.m17844n2();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$d */
    public class ViewOnClickListenerC3602d implements View.OnClickListener {
        public ViewOnClickListenerC3602d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CardScanActivity.this.m17902s2();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$e */
    public class ViewOnClickListenerC3603e implements View.OnClickListener {
        public ViewOnClickListenerC3603e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CardScanActivity.this.f12369I.set(true);
            CardScanActivity.this.m17815U2();
            CardScanActivity.this.f12371K = false;
            CardScanActivity.this.m17798J1(false);
            CardScanActivity.this.m17849q2(false);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$f */
    public class ViewOnClickListenerC3604f implements View.OnClickListener {
        public ViewOnClickListenerC3604f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Throwable {
            CardScanActivity.this.m17815U2();
            CardScanActivity.this.f12371K = false;
            CardScanActivity.this.m17796I1(false);
            CardScanActivity.this.m17891e3(true);
            CardScanActivity.this.m17847p2();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$g */
    public class ViewOnClickListenerC3605g implements View.OnClickListener {

        /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$g$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                CardScanActivity.this.m17891e3(true);
                CardScanActivity.this.m17795H2();
            }
        }

        public ViewOnClickListenerC3605g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CardScanActivity.this.m17815U2();
            CardScanActivity.this.f12371K = true;
            if (CardScanActivity.this.f12408v) {
                return;
            }
            CardScanActivity.this.f12408v = true;
            view.post(new a());
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$h */
    public class ViewOnClickListenerC3606h implements View.OnClickListener {
        public ViewOnClickListenerC3606h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CardScanActivity cardScanActivity = CardScanActivity.this;
            if (cardScanActivity.f12407u == CardScanActivity.f12356I0) {
                cardScanActivity.m17896k3();
            } else {
                cardScanActivity.m17898m3();
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$i */
    public class C3607i implements xnl {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f12429a;

        public C3607i(boolean z) {
            this.f12429a = z;
        }

        @Override // p149l.xnl
        /* JADX INFO: renamed from: a */
        public void mo17910a(Bitmap bitmap, boolean z) {
            CardScanActivity.this.m17798J1(true);
            CardScanActivity.this.m17797I2(bitmap, this.f12429a, null);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$j */
    public class C3608j implements khi.InterfaceC18016d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f12431a;

        public C3608j(long j) {
            this.f12431a = j;
        }

        @Override // p149l.khi.InterfaceC18016d
        /* JADX INFO: renamed from: a */
        public boolean mo17695a(int i, String str, String str2, String str3) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "cardOssUploadRes", NotificationCompat.CATEGORY_STATUS, "error", "idx", String.valueOf(i), "ocrType", String.valueOf(CardScanActivity.this.f12403q), "bucketName", str, "fileName", str2, "errMsg", str3);
            return false;
        }

        @Override // p149l.khi.InterfaceC18016d
        /* JADX INFO: renamed from: b */
        public boolean mo17696b(int i, String str, String str2) {
            String str3 = String.valueOf((System.currentTimeMillis() - this.f12431a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f44446s;
            if (1 == i) {
                kcm.m145452H().m145464C1(str2);
            } else if (5 == i) {
                kcm.m145452H().m145476G1(str2, true);
            } else if (2 == i) {
                kcm.m145452H().m145586u1(str2);
            } else if (20 == i) {
                kcm.m145452H().m145589v1(str2);
            } else if (10 == i) {
                kcm.m145452H().m145467D1(str2);
            }
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "cardOssUploadRes", NotificationCompat.CATEGORY_STATUS, "success", "idx", String.valueOf(i), "ocrType", String.valueOf(CardScanActivity.this.f12403q), "bucketName", str, "fileName", str2, "timeCost", str3);
            return false;
        }

        @Override // p149l.khi.InterfaceC18016d
        /* JADX INFO: renamed from: c */
        public void mo17697c(int i, int i2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "cardOssUploadCost", NotificationCompat.CATEGORY_STATUS, "finish", "uploadCnt", String.valueOf(i), "successCnt", String.valueOf(i2), "timeCost", String.valueOf((System.currentTimeMillis() - this.f12431a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f44446s);
            CardScanActivity cardScanActivity = CardScanActivity.this;
            if (i == i2) {
                cardScanActivity.f12402p0.sendEmptyMessage(1009);
            } else {
                cardScanActivity.f12402p0.sendEmptyMessage(1008);
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$k */
    public class C3609k implements Handler.Callback {
        public C3609k() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) throws Throwable {
            Object obj;
            int unused = CardScanActivity.this.f12409w;
            int i = message.what;
            if (CardScanActivity.this.f12409w < 0) {
                CardScanActivity.this.m17832g3();
                return false;
            }
            int i2 = message.what;
            if (1005 == i2) {
                CardScanActivity.this.m17855u2();
            } else if (1007 == i2) {
                CardScanActivity.this.m17903v2(message);
            } else if (1008 == i2) {
                CardScanActivity.this.m17863C2(true);
            } else if (1009 == i2) {
                CardScanActivity.this.m17863C2(false);
            } else if (1010 == i2) {
                CardScanActivity.this.m17905y2();
            } else if (1011 == i2) {
                CardScanActivity.m17802L0(CardScanActivity.this);
                CardScanActivity.this.m17904w2();
            } else if (1012 == i2) {
                CardScanActivity.this.m17861A2();
            } else if (1013 == i2) {
                CardScanActivity.this.m17865E2();
            } else if (1015 == i2) {
                CardScanActivity.m17802L0(CardScanActivity.this);
                CardScanActivity.this.m17790B2();
            } else if (1016 == i2) {
                if (!CardScanActivity.this.f12369I.get()) {
                    CardScanActivity.m17802L0(CardScanActivity.this);
                    CardScanActivity.this.m17864D2();
                }
            } else if (1017 == i2) {
                CardScanActivity.m17802L0(CardScanActivity.this);
                CardScanActivity.this.m17860z2();
            } else if (1018 == i2 && (obj = message.obj) != null) {
                CardScanActivity.this.m17851r2((String) obj);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$l */
    public class C3610l implements InterfaceC3622x {
        public C3610l() {
        }

        @Override // com.idv.identity.ocr.p037ui.CardScanActivity.InterfaceC3622x
        /* JADX INFO: renamed from: a */
        public void mo17909a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "keyBack");
            CardScanActivity.this.m17821Y2(ncm.f138196f);
        }

        @Override // com.idv.identity.ocr.p037ui.CardScanActivity.InterfaceC3622x
        public void onCancel() {
            CardScanActivity.this.m17825a3();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$m */
    public class RunnableC3611m implements Runnable {
        public RunnableC3611m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CardScanActivity.this.f12395k != null) {
                CardScanActivity.this.f12395k.m17734f();
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$n */
    public class C3612n implements IdentityAlertOverlay.InterfaceC3705d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f12436a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC3622x f12437b;

        public C3612n(String str, InterfaceC3622x interfaceC3622x) {
            this.f12436a = str;
            this.f12437b = interfaceC3622x;
        }

        @Override // com.idv.identity.platform.IdentityAlertOverlay.InterfaceC3705d
        /* JADX INFO: renamed from: a */
        public void mo17692a() {
            RecordService.recordOcrAlertConfirm(this.f12436a);
            RecordService.recordOcrAlertClose(this.f12436a);
            InterfaceC3622x interfaceC3622x = this.f12437b;
            if (interfaceC3622x != null) {
                interfaceC3622x.mo17909a();
                CardScanActivity.this.m17791E1(true);
                CardScanActivity.this.f12372L = false;
            }
            CardScanActivity.this.m17809R2();
        }

        @Override // com.idv.identity.platform.IdentityAlertOverlay.InterfaceC3705d
        public void onCancel() {
            RecordService.recordOcrAlertCancel(this.f12436a);
            RecordService.recordOcrAlertClose(this.f12436a);
            InterfaceC3622x interfaceC3622x = this.f12437b;
            if (interfaceC3622x != null) {
                interfaceC3622x.onCancel();
                CardScanActivity.this.m17791E1(true);
                CardScanActivity.this.f12372L = false;
            }
            if (CardScanActivity.this.f12369I.get()) {
                return;
            }
            CardScanActivity.this.m17809R2();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$o */
    public class C3613o implements InterfaceC3622x {
        public C3613o() {
        }

        @Override // com.idv.identity.ocr.p037ui.CardScanActivity.InterfaceC3622x
        /* JADX INFO: renamed from: a */
        public void mo17909a() {
            CardScanActivity.this.f12369I.set(false);
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "onMessageOCRError", NotificationCompat.CATEGORY_STATUS, "retry_onOK");
            CardScanActivity cardScanActivity = CardScanActivity.this;
            cardScanActivity.m17838j3(cardScanActivity.f12403q);
            CardScanActivity.this.m17809R2();
            CardScanActivity.this.m17825a3();
        }

        @Override // com.idv.identity.ocr.p037ui.CardScanActivity.InterfaceC3622x
        public void onCancel() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "closeButton");
            CardScanActivity.this.m17821Y2(ncm.f138183C);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$p */
    public class C3614p implements InterfaceC3622x {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f12440a;

        public C3614p(String str) {
            this.f12440a = str;
        }

        @Override // com.idv.identity.ocr.p037ui.CardScanActivity.InterfaceC3622x
        /* JADX INFO: renamed from: a */
        public void mo17909a() {
            CardScanActivity.this.m17823Z2(this.f12440a);
        }

        @Override // com.idv.identity.ocr.p037ui.CardScanActivity.InterfaceC3622x
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$q */
    public class C3615q extends AnimatorListenerAdapter {
        public C3615q() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            CardScanActivity cardScanActivity = CardScanActivity.this;
            cardScanActivity.m17838j3(cardScanActivity.m17874R1(cardScanActivity.f12405s));
            if (!"auto".equals(kcm.m145452H().m145529b0())) {
                if (CardScanActivity.f12357J0.equals(CardScanActivity.this.f12407u)) {
                    CardScanActivity.this.f12395k.m17737i();
                    return;
                } else {
                    if (CardScanActivity.f12356I0.equals(CardScanActivity.this.f12407u)) {
                        CardScanActivity.this.m17883Y1().setVisibility(0);
                        return;
                    }
                    return;
                }
            }
            if (CardScanActivity.f12357J0.equals(CardScanActivity.this.f12407u)) {
                CardScanActivity.this.f12395k.m17737i();
                CardScanActivity.this.m17896k3();
            } else if (CardScanActivity.f12356I0.equals(CardScanActivity.this.f12407u)) {
                CardScanActivity.this.m17898m3();
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$r */
    public class C3616r implements InterfaceC3622x {
        public C3616r() {
        }

        @Override // com.idv.identity.ocr.p037ui.CardScanActivity.InterfaceC3622x
        /* JADX INFO: renamed from: a */
        public void mo17909a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "cardScanOutTime", NotificationCompat.CATEGORY_STATUS, "exit_onOK");
            Message message = new Message();
            message.obj = ncm.f138202l;
            CardScanActivity.this.m17903v2(message);
        }

        @Override // com.idv.identity.ocr.p037ui.CardScanActivity.InterfaceC3622x
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$s */
    public class C3617s implements tcm {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f12444a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f12445b;

        public C3617s(long j, String str) {
            this.f12444a = j;
            this.f12445b = str;
        }

        @Override // p149l.tcm
        /* JADX INFO: renamed from: a */
        public void mo17911a(String str, String str2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "ocrDeviceCost", NotificationCompat.CATEGORY_STATUS, "error", "code", str, "msg", str2, "tag", "onError", "timeCost", String.valueOf((System.currentTimeMillis() - this.f12444a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f44446s, "sideType", this.f12445b);
            CardScanActivity.this.f12402p0.sendEmptyMessage(1010);
        }

        @Override // p149l.tcm
        /* JADX INFO: renamed from: b */
        public void mo17912b(String str, String str2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "ocrDeviceCost", NotificationCompat.CATEGORY_STATUS, "error", "code", str, "msg", str2, "tag", "onServerError", "timeCost", String.valueOf((System.currentTimeMillis() - this.f12444a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f44446s, "sideType", this.f12445b);
            CardScanActivity.this.f12402p0.sendEmptyMessage(1011);
        }

        @Override // p149l.tcm
        public void onSuccess(String str) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "ocrDeviceCost", NotificationCompat.CATEGORY_STATUS, "success", "isVerifyAlbumPhoto", String.valueOf(CardScanActivity.this.f12371K), "timeCost", String.valueOf((System.currentTimeMillis() - this.f12444a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f44446s, "sideType", this.f12445b);
            if (!pcm.f148193f.equals(kcm.m145452H().m145550i0())) {
                IDCardOcrResult iDCardOcrResult = (IDCardOcrResult) d300.m109843g(str, IDCardOcrResult.class);
                if (iDCardOcrResult == null || !iDCardOcrResult.isOCRSuccess()) {
                    if (iDCardOcrResult != null && iDCardOcrResult.isOCRTypeError()) {
                        CardScanActivity.this.f12402p0.sendEmptyMessage(1015);
                        return;
                    }
                    if (iDCardOcrResult != null && iDCardOcrResult.isOCRError()) {
                        CardScanActivity.this.f12402p0.sendEmptyMessage(1011);
                        return;
                    }
                    if (iDCardOcrResult != null && iDCardOcrResult.isOCRPictureQualityNotGood()) {
                        CardScanActivity.this.f12402p0.sendEmptyMessage(1017);
                        return;
                    }
                    ixq0.m138886c("idcardResult is null content:" + str);
                    return;
                }
                IdentityOcrInfo identityOcrInfo = new IdentityOcrInfo();
                identityOcrInfo.ocrResult = iDCardOcrResult;
                if (OcrType.OT_PHOTO_FRONT == CardScanActivity.this.f12403q) {
                    kcm.m145452H().m145598y1(identityOcrInfo);
                    kcm.m145452H().m145470E1(CardScanActivity.this.f12412z);
                    kcm.m145452H().m145458A1(CardScanActivity.this.f12411y);
                } else if (OcrType.OT_PHOTO_BACK == CardScanActivity.this.f12403q) {
                    kcm.m145452H().m145574q1(identityOcrInfo);
                    kcm.m145452H().m145592w1(CardScanActivity.this.f12412z);
                    kcm.m145452H().m145580s1(CardScanActivity.this.f12411y);
                } else if (OcrType.OT_PHOTO_BACK_3D == CardScanActivity.this.f12403q) {
                    kcm.m145452H().m145577r1(identityOcrInfo);
                    kcm.m145452H().m145595x1(CardScanActivity.this.f12412z);
                    kcm.m145452H().m145583t1(CardScanActivity.this.f12411y);
                } else if (OcrType.OT_PHOTO_FRONT_3D == CardScanActivity.this.f12403q) {
                    kcm.m145452H().m145601z1(identityOcrInfo);
                    kcm.m145452H().m145473F1(CardScanActivity.this.f12412z);
                    kcm.m145452H().m145461B1(CardScanActivity.this.f12411y);
                }
                CardScanActivity.this.f12402p0.sendEmptyMessage(1012);
                return;
            }
            IDCardOcrProResult iDCardOcrProResult = (IDCardOcrProResult) JSON.parseObject(str, IDCardOcrProResult.class);
            iDCardOcrProResult.toString();
            if (!iDCardOcrProResult.isOCRSuccess()) {
                if (iDCardOcrProResult.isOCRTypeError()) {
                    CardScanActivity.this.f12402p0.sendEmptyMessage(1015);
                    return;
                }
                if (iDCardOcrProResult.isOCRError()) {
                    CardScanActivity.this.f12402p0.sendEmptyMessage(1011);
                    return;
                } else {
                    if (iDCardOcrProResult.isOCRPictureQualityNotGood()) {
                        CardScanActivity.this.f12402p0.sendEmptyMessage(1017);
                        return;
                    }
                    ixq0.m138885b("TAG", "idcardResult is null content:" + str);
                    return;
                }
            }
            iDCardOcrProResult.sortOcrResult();
            Map<String, Object> sortedOcrResult = iDCardOcrProResult.getSortedOcrResult();
            Map<String, Object> ocrStandardDataMap = iDCardOcrProResult.getOcrStandardDataMap();
            if (ocrStandardDataMap != null) {
                kcm.m145452H().m145572p1(ocrStandardDataMap);
            }
            if (OcrType.OT_PHOTO_FRONT == CardScanActivity.this.f12403q) {
                kcm.m145452H().m145569o1(sortedOcrResult);
                kcm.m145452H().m145470E1(CardScanActivity.this.f12412z);
                kcm.m145452H().m145458A1(CardScanActivity.this.f12411y);
            } else if (OcrType.OT_PHOTO_BACK == CardScanActivity.this.f12403q) {
                Map<String, Object> mapM145500P = kcm.m145452H().m145500P();
                if (sortedOcrResult != null) {
                    for (Map.Entry<String, Object> entry : sortedOcrResult.entrySet()) {
                        if (!mapM145500P.containsKey(entry.getKey()) || TextUtils.isEmpty((String) mapM145500P.get(entry.getKey()))) {
                            mapM145500P.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                kcm.m145452H().m145569o1(mapM145500P);
                kcm.m145452H().m145592w1(CardScanActivity.this.f12412z);
                kcm.m145452H().m145580s1(CardScanActivity.this.f12411y);
            } else if (OcrType.OT_PHOTO_THIRD == CardScanActivity.this.f12403q) {
                Map<String, Object> mapM145500P2 = kcm.m145452H().m145500P();
                if (sortedOcrResult != null) {
                    for (Map.Entry<String, Object> entry2 : sortedOcrResult.entrySet()) {
                        if (!mapM145500P2.containsKey(entry2.getKey()) || TextUtils.isEmpty((String) mapM145500P2.get(entry2.getKey()))) {
                            mapM145500P2.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                }
                kcm.m145452H().m145569o1(mapM145500P2);
            }
            Objects.toString(sortedOcrResult);
            CardScanActivity.this.f12402p0.sendEmptyMessage(1012);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$t */
    public class C3618t implements InterfaceC3622x {
        public C3618t() {
        }

        @Override // com.idv.identity.ocr.p037ui.CardScanActivity.InterfaceC3622x
        /* JADX INFO: renamed from: a */
        public void mo17909a() throws Throwable {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "onMessageOCRNetError", NotificationCompat.CATEGORY_STATUS, "retry_onOK");
            CardScanActivity.this.m17863C2(true);
        }

        @Override // com.idv.identity.ocr.p037ui.CardScanActivity.InterfaceC3622x
        public void onCancel() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "userBack", "type", "ocrNetError_onCancel");
            CardScanActivity.this.m17821Y2(ncm.f138196f);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$u */
    public class C3619u implements InterfaceC3622x {
        public C3619u() {
        }

        @Override // com.idv.identity.ocr.p037ui.CardScanActivity.InterfaceC3622x
        /* JADX INFO: renamed from: a */
        public void mo17909a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "onMessageOCRError", NotificationCompat.CATEGORY_STATUS, "retry_onOK");
            CardScanActivity.this.f12369I.set(false);
            CardScanActivity cardScanActivity = CardScanActivity.this;
            cardScanActivity.m17838j3(cardScanActivity.f12403q);
            CardScanActivity.this.m17809R2();
            CardScanActivity.this.m17825a3();
        }

        @Override // com.idv.identity.ocr.p037ui.CardScanActivity.InterfaceC3622x
        public void onCancel() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "closeButton");
            CardScanActivity.this.m17821Y2(ncm.f138196f);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$v */
    public class C3620v implements InterfaceC3622x {
        public C3620v() {
        }

        @Override // com.idv.identity.ocr.p037ui.CardScanActivity.InterfaceC3622x
        /* JADX INFO: renamed from: a */
        public void mo17909a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "onMessageOCRPictureQualityNotGood", NotificationCompat.CATEGORY_STATUS, "retry_onOK");
            CardScanActivity.this.f12369I.set(false);
            CardScanActivity cardScanActivity = CardScanActivity.this;
            cardScanActivity.m17838j3(cardScanActivity.f12403q);
            CardScanActivity.this.m17809R2();
            CardScanActivity.this.m17825a3();
        }

        @Override // com.idv.identity.ocr.p037ui.CardScanActivity.InterfaceC3622x
        public void onCancel() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "closeButton");
            CardScanActivity.this.m17821Y2(ncm.f138184D);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$w */
    public class C3621w implements InterfaceC3622x {
        public C3621w() {
        }

        @Override // com.idv.identity.ocr.p037ui.CardScanActivity.InterfaceC3622x
        /* JADX INFO: renamed from: a */
        public void mo17909a() {
            CardScanActivity.this.m17825a3();
        }

        @Override // com.idv.identity.ocr.p037ui.CardScanActivity.InterfaceC3622x
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.ui.CardScanActivity$x */
    public interface InterfaceC3622x {
        /* JADX INFO: renamed from: a */
        void mo17909a();

        void onCancel();
    }

    public CardScanActivity() {
        ActivityResultContracts.PickVisualMedia pickVisualMedia = new ActivityResultContracts.PickVisualMedia();
        this.f12365F0 = pickVisualMedia;
        this.f12367G0 = registerForActivityResult(pickVisualMedia, new C3599a());
    }

    /* JADX INFO: renamed from: B1 */
    private JSONObject m17789B1() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("points", (Object) this.f12406t);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public void m17790B2() {
        m17891e3(false);
        m17831f3(getResources().getString(R$string.f12015g0), getResources().getString(R$string.f12017h0), getResources().getString(R$string.f11993R), null, "OCR_TYPE_ERROR_CODE", new C3613o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E1 */
    public void m17791E1(boolean z) {
        m17866F1(z);
        m17798J1(z);
        m17796I1(z);
        m17794H1(z);
        m17793G1(z);
    }

    /* JADX INFO: renamed from: F2 */
    private void m17792F2() {
        IDCardOcrResult iDCardOcrResult;
        IDCardOcrResult.OcrResult ocrResult;
        IDCardOcrResult iDCardOcrResult2;
        IDCardOcrResult.OcrResult ocrResult2;
        IdentityOcrInfo identityOcrInfoM145517V = kcm.m145452H().m145517V();
        IdentityOcrInfo identityOcrInfoM145506R = kcm.m145452H().m145506R();
        if (identityOcrInfoM145506R != null && (iDCardOcrResult = identityOcrInfoM145506R.ocrResult) != null && (ocrResult = iDCardOcrResult.ocrResult) != null && identityOcrInfoM145517V != null && (iDCardOcrResult2 = identityOcrInfoM145517V.ocrResult) != null && (ocrResult2 = iDCardOcrResult2.ocrResult) != null) {
            ocrResult2.expiryDate = ocrResult.expiryDate;
            ocrResult2.originOfIssue = ocrResult.originOfIssue;
            ocrResult2.issueDate = ocrResult.issueDate;
        }
        kcm.m145452H().m145478H1(identityOcrInfoM145517V);
        String strM145587v = kcm.m145452H().m145587v();
        if (strM145587v == null) {
            return;
        }
        String strM145550i0 = kcm.m145452H().m145550i0();
        NfcConfigRes nfcConfigResM145488L = kcm.m145452H().m145488L();
        if (pcm.f148193f.equals(strM145550i0)) {
            ixq0.m138885b("CardScanActivity", "onOcrIdentityFinish:  ENABLE_SHOW_OCR_RESULT=" + rcm.f158789d);
            if (kcm.m145452H().m145503Q() == null && !rcm.f158789d) {
                m17899n3();
            } else {
                m17897m2(IDCardResultProActivity.class);
            }
            m17800K1("success");
            return;
        }
        if (mcm.f133148a.equals(strM145587v) && pcm.f148194g.equals(strM145550i0)) {
            d720.m110213c(this);
            m17800K1("success");
            return;
        }
        if (mcm.f133148a.equals(strM145587v) && pcm.f148192e.equals(strM145550i0) && nfcConfigResM145488L != null && getPackageManager().hasSystemFeature("android.hardware.nfc")) {
            d720.m110213c(this);
            m17800K1("success");
            return;
        }
        ixq0.m138885b("CardScanActivity", "onOcrIdentityFinish:  ENABLE_SHOW_OCR_RESULT=" + rcm.f158789d);
        if (!rcm.f158789d) {
            m17899n3();
        } else if (mcm.f133149b.equals(strM145587v) || mcm.f133150c.equals(strM145587v)) {
            m17897m2(HKIDCardResultActivity.class);
        } else if (mcm.f133151d.equals(strM145587v) || mcm.f133152e.equals(strM145587v)) {
            m17897m2(HKGoThroughIDCardResultActivity.class);
        } else if (mcm.f133148a.equals(strM145587v)) {
            m17897m2(GlobalPassportIDCardResultActivity.class);
        } else if (mcm.f133153f.equals(strM145587v)) {
            m17897m2(MacaoIDCardResultActivity.class);
        } else if (mcm.f133154g.equals(strM145587v)) {
            m17897m2(TaiwanIDCardResultActivity.class);
        } else if (mcm.f133155h.equals(strM145587v)) {
            m17897m2(MainlandIDCardResultActivity.class);
        }
        m17800K1("success");
    }

    /* JADX INFO: renamed from: G1 */
    private void m17793G1(boolean z) {
        ImageView imageViewM17882X1 = m17882X1();
        if (imageViewM17882X1 != null) {
            imageViewM17882X1.setEnabled(z);
        }
    }

    /* JADX INFO: renamed from: H1 */
    private void m17794H1(boolean z) {
        ImageView imageViewM17889d2 = m17889d2();
        if (imageViewM17889d2 != null) {
            imageViewM17889d2.setEnabled(z);
        }
        TextView textView = (TextView) findViewById(k4c0.f120981G0);
        if (textView != null) {
            textView.setEnabled(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H2 */
    public void m17795H2() {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "enterPickImage", NotificationCompat.CATEGORY_STATUS, "success");
        try {
            this.f12367G0.m124547b(new PickVisualMediaRequest.Builder().setMediaType(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE).build());
        } catch (Exception e) {
            RecordService.getInstance().recordException(e);
        }
        if (ActivityResultContracts.PickVisualMedia.isPhotoPickerAvailable()) {
            return;
        }
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "enterPickImage", NotificationCompat.CATEGORY_STATUS, "error", "pickVisualMedia", "not support for the photo picker");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I1 */
    public void m17796I1(boolean z) {
        ImageView imageViewM17893g2 = m17893g2();
        if (imageViewM17893g2 != null) {
            imageViewM17893g2.setEnabled(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I2 */
    public void m17797I2(Bitmap bitmap, boolean z, Attr attr) {
        if (bitmap == null) {
            return;
        }
        this.f12411y = bitmap;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        if (z) {
            m17826b3(m17803L1(bitmap, attr));
            m17829d3(this.f12412z, attr);
        } else {
            ImageView imageView = (ImageView) findViewById(k4c0.f120968A);
            if (imageView != null) {
                imageView.setVisibility(0);
                imageView.setImageBitmap(this.f12411y);
            }
            float holeLeft = m17876S1().getHoleLeft();
            float holeTop = m17876S1().getHoleTop();
            float holeWidth = m17876S1().getHoleWidth();
            float holeHeight = m17876S1().getHoleHeight();
            float height2 = imageView.getHeight();
            float width2 = imageView.getWidth();
            ixq0.m138888e("CardScanActivity", "photoTakenBackground  bgHeight:" + height2 + "  bgWidth:" + width2);
            float f = height / height2;
            float f2 = holeLeft * f;
            float f3 = width / width2;
            float f4 = holeTop * f3;
            float f5 = f * holeHeight;
            float f6 = f3 * holeWidth;
            ixq0.m138888e("CardScanActivity", "onPictureTake:" + z + "  cropLeft:" + f2 + " cropTop:" + f4 + "cropWidth:" + f6 + "cropHeight:" + f5);
            m17826b3(Bitmap.createBitmap(bitmap, (int) f2, (int) f4, (int) f6, (int) f5, (Matrix) null, false));
        }
        LinearLayout linearLayoutM17890e2 = m17890e2();
        if (linearLayoutM17890e2 != null) {
            linearLayoutM17890e2.setVisibility(8);
        }
        ImageView imageViewM17893g2 = m17893g2();
        if (imageViewM17893g2 != null) {
            imageViewM17893g2.setVisibility(0);
        }
        m17871O1().setVisibility(8);
        ImageView imageViewM17883Y1 = m17883Y1();
        if (imageViewM17883Y1 != null) {
            imageViewM17883Y1.setVisibility(4);
        }
        TextView textView = (TextView) findViewById(k4c0.f121054m);
        if (textView != null) {
            textView.setText("");
        }
        TextView textViewM17879V1 = m17879V1();
        if (textViewM17879V1 != null) {
            OcrType ocrType = OcrType.OT_PHOTO_FRONT;
            OcrType ocrType2 = this.f12403q;
            if (ocrType == ocrType2) {
                textViewM17879V1.setText(R$string.f12025l0);
            } else if (OcrType.OT_PHOTO_BACK == ocrType2 || OcrType.OT_PHOTO_THIRD == ocrType2) {
                textViewM17879V1.setText(R$string.f12023k0);
            } else {
                textViewM17879V1.setText(R$string.f12021j0);
            }
            textViewM17879V1.setVisibility(0);
        }
        int iM145532c0 = (int) kcm.m145452H().m145532c0();
        if (iM145532c0 <= 0) {
            iM145532c0 = 640;
        }
        this.f12358A = d300.m109849m(this.f12411y, iM145532c0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J1 */
    public void m17798J1(boolean z) {
        ImageView imageViewM17883Y1 = m17883Y1();
        if (imageViewM17883Y1 != null) {
            imageViewM17883Y1.setEnabled(z);
        }
    }

    /* JADX INFO: renamed from: K1 */
    private void m17800K1(String str) {
        RecordService.getInstance().recordEventPage(RecordLevel.LOG_INFO, "OCR_EXIT", "OCR_SCAN", (System.currentTimeMillis() - this.f12387c) + "ms", str);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K2 */
    public void m17801K2(String str, String str2) throws Throwable {
        ixq0.m138884a("originalPath: " + str + " compressPath: " + str2);
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
        int iM17873Q2 = m17873Q2(str);
        if (iM17873Q2 != 0) {
            bitmapDecodeFile = m17881W2(iM17873Q2, bitmapDecodeFile);
        }
        this.f12411y = bitmapDecodeFile;
        this.f12358A = bitmapDecodeFile;
        this.f12412z = bitmapDecodeFile;
        ImageView imageView = (ImageView) findViewById(k4c0.f120968A);
        if (imageView != null) {
            imageView.setImageBitmap(this.f12411y);
            imageView.setVisibility(0);
            ixq0.m138885b("CardScanActivity", "图片宽度:w=" + bitmapDecodeFile.getWidth() + " h=" + bitmapDecodeFile.getHeight());
            ixq0.m138885b("CardScanActivity", "图片框宽度:w=" + imageView.getWidth() + " h=" + imageView.getHeight());
        }
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "takeSuccess", "originalPath", str, "compressPath", str2, "degree", String.valueOf(iM17873Q2), "w*h", bitmapDecodeFile.getWidth() + "*" + bitmapDecodeFile.getHeight(), NotificationCompat.CATEGORY_STATUS, "success");
        m17847p2();
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ int m17802L0(CardScanActivity cardScanActivity) {
        int i = cardScanActivity.f12409w;
        cardScanActivity.f12409w = i - 1;
        return i;
    }

    /* JADX INFO: renamed from: L1 */
    private Bitmap m17803L1(Bitmap bitmap, Attr attr) {
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
        ixq0.m138888e("CardScanActivity", "getAutoPicture cropLeft:" + f3 + " cropTop:" + f6 + "cropWidth:" + f11 + "cropHeight:" + f12);
        try {
            return Bitmap.createBitmap(bitmap, (int) f3, (int) f6, (int) f11, (int) f12, (Matrix) null, false);
        } catch (Exception e) {
            RecordService.getInstance().recordException(e);
            return bitmap;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R2 */
    public void m17809R2() {
        if ("auto".equals(kcm.m145452H().m145529b0())) {
            if (f12356I0.equals(this.f12407u)) {
                m17898m3();
                return;
            } else {
                if (f12357J0.equals(this.f12407u)) {
                    m17896k3();
                    return;
                }
                return;
            }
        }
        if ("shoot".equals(kcm.m145452H().m145529b0())) {
            m17813T2();
        } else if ("scan".equals(kcm.m145452H().m145529b0())) {
            m17811S2();
        }
    }

    /* JADX INFO: renamed from: S2 */
    private void m17811S2() {
        m17871O1().setVisibility(8);
        m17883Y1().setVisibility(8);
        m17876S1().m17738j();
        m17876S1().m17737i();
        this.f12407u = f12357J0;
    }

    /* JADX INFO: renamed from: T2 */
    private void m17813T2() {
        m17871O1().setVisibility(8);
        m17883Y1().setVisibility(0);
        this.f12407u = f12356I0;
        this.f12394j.setFocusModes("continuous-picture");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U2 */
    public void m17815U2() {
        this.f12402p0.removeMessages(1016);
    }

    /* JADX INFO: renamed from: X2 */
    private void m17819X2(String str) {
        if (this.f12402p0 != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1018;
            messageObtain.obj = str;
            this.f12402p0.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y2 */
    public void m17821Y2(String str) {
        this.f12402p0.removeMessages(1013);
        Message messageObtain = Message.obtain();
        messageObtain.what = 1007;
        messageObtain.obj = str;
        this.f12402p0.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public String m17822Z1(Uri uri) {
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
    /* JADX INFO: renamed from: Z2 */
    public void m17823Z2(String str) {
        RecordService recordService = RecordService.getInstance();
        RecordLevel recordLevel = RecordLevel.LOG_INFO;
        recordService.recordEvent(recordLevel, "sendResponseAndFinish", "code", str);
        kcm.m145452H().m145537e(str);
        RecordService.getInstance().recordEventPage(recordLevel, "OCR_EXIT", "OCR_SCAN", (System.currentTimeMillis() - this.f12387c) + "ms", str);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a3 */
    public void m17825a3() {
        this.f12402p0.sendEmptyMessageDelayed(1016, rcm.f158796k * rcm.f158799n);
    }

    /* JADX INFO: renamed from: b3 */
    private void m17826b3(Bitmap bitmap) {
        if (!kcm.m145452H().m145575r()) {
            this.f12412z = bitmap;
            return;
        }
        int iM145547h0 = (int) kcm.m145452H().m145547h0();
        if (iM145547h0 <= 0) {
            iM145547h0 = 480;
        }
        this.f12412z = d300.m109849m(bitmap, iM145547h0);
    }

    /* JADX INFO: renamed from: c3 */
    private void m17827c3(boolean z) {
        ImageView imageView = (ImageView) findViewById(k4c0.f121070u);
        if (imageView != null) {
            if (z) {
                imageView.setImageResource(q2c0.f152220d);
            } else {
                imageView.setImageResource(q2c0.f152219c);
            }
            imageView.setVisibility(0);
        }
        TextView textView = (TextView) findViewById(k4c0.f121054m);
        if (textView != null) {
            OcrType ocrType = OcrType.OT_PHOTO_FRONT;
            OcrType ocrType2 = this.f12403q;
            if (ocrType == ocrType2) {
                if (z) {
                    textView.setText(R$string.f11983L0);
                } else {
                    textView.setText(R$string.f12019i0);
                }
            } else if (OcrType.OT_PHOTO_BACK == ocrType2) {
                if (z) {
                    textView.setText(R$string.f11983L0);
                } else {
                    textView.setText(R$string.f12019i0);
                }
            }
        }
        if (z) {
            View viewFindViewById = findViewById(k4c0.f121080z);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(4);
            }
            TextView textViewM17879V1 = m17879V1();
            if (textViewM17879V1 != null) {
                textViewM17879V1.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: d3 */
    private void m17829d3(Bitmap bitmap, Attr attr) {
        ImageView imageView = (ImageView) findViewById(k4c0.f121038g);
        imageView.setVisibility(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = (int) this.f12397l.getRectWidth();
        layoutParams.height = (int) this.f12397l.getRectHeigth();
        getResources().getDimension(n2c0.f136783a);
        layoutParams.topMargin = (int) this.f12397l.getRectTop();
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageBitmap(bitmap);
        layoutParams.setMarginStart((int) this.f12397l.getRectLeft());
        layoutParams.setMarginEnd((int) this.f12397l.getRectLeft());
        gbl0.m125229x0(imageView, 0);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, 250.0f, 0.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfPropertyValuesHolder);
        animatorSet.setDuration(500L);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: f3 */
    private void m17831f3(String str, String str2, String str3, String str4, String str5, InterfaceC3622x interfaceC3622x) {
        RecordService.recordOcrAlertAppear(str5);
        if (this.f12372L) {
            return;
        }
        this.f12402p0.post(new RunnableC3611m());
        m17880V2();
        this.f12372L = true;
        IdentityAlertOverlay identityAlertOverlay = (IdentityAlertOverlay) findViewById(k4c0.f121023b);
        if (identityAlertOverlay != null) {
            m17791E1(false);
            identityAlertOverlay.setTitleText(str);
            identityAlertOverlay.setMessageText(str2);
            if (str4 != null) {
                identityAlertOverlay.setCancelText(str4);
                identityAlertOverlay.setButtonType(true);
            } else {
                identityAlertOverlay.setButtonType(false);
            }
            identityAlertOverlay.setConfirmText(str3);
            ixq0.m138885b("CardScanActivity", " setVisibility showMessageBox >>>> : [title]:" + str + "  [message]:" + str2);
            identityAlertOverlay.setVisibility(0);
            mxb.m156848a(identityAlertOverlay, mxb.m156867t(str5));
            identityAlertOverlay.setCommAlertOverlayListener(new C3612n(str5, interfaceC3622x));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g3 */
    public void m17832g3() {
        m17891e3(false);
        m17831f3(getResources().getString(R$string.f11998W), getResources().getString(R$string.f11994S), getResources().getString(R$string.f11992Q), null, "ocr_over_time_code", new C3616r());
    }

    /* JADX INFO: renamed from: h3 */
    private boolean m17834h3(boolean z) {
        try {
            return ((Boolean) getClassLoader().loadClass("com.idv.identity.face.IdentityFaceApi").getDeclaredMethod("start", Context.class, Boolean.TYPE).invoke(null, this, Boolean.valueOf(z))).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "startFace", NotificationCompat.CATEGORY_STATUS, "catchException", "exception", e.toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: i2 */
    private void m17835i2() {
        LinearLayout linearLayoutM17871O1 = m17871O1();
        if (!"auto".equals(kcm.m145452H().m145529b0())) {
            if ("scan".equals(kcm.m145452H().m145529b0())) {
                m17811S2();
                return;
            } else {
                if ("shoot".equals(kcm.m145452H().m145529b0())) {
                    m17813T2();
                    return;
                }
                return;
            }
        }
        String str = this.f12407u;
        if (str == f12355H0) {
            linearLayoutM17871O1.setVisibility(0);
            m17896k3();
            linearLayoutM17871O1.setOnClickListener(new ViewOnClickListenerC3606h());
        } else if (str == f12357J0) {
            m17896k3();
        } else if (str == f12356I0) {
            m17898m3();
        }
    }

    /* JADX INFO: renamed from: i3 */
    private void m17836i3(boolean z) {
        CameraSurfaceView cameraSurfaceView = this.f12394j;
        if (cameraSurfaceView != null) {
            this.f12370J = z;
            cameraSurfaceView.m18121a(z);
            ImageView imageView = (ImageView) findViewById(k4c0.f121072v);
            if (imageView != null) {
                if (this.f12370J) {
                    Bitmap bitmapM156858k = mxb.m156858k();
                    if (bitmapM156858k != null) {
                        imageView.setImageBitmap(bitmapM156858k);
                        return;
                    } else {
                        imageView.setImageResource(q2c0.f152222f);
                        return;
                    }
                }
                Bitmap bitmapM156864q = mxb.m156864q();
                mxb.m156864q();
                if (bitmapM156864q != null) {
                    imageView.setImageBitmap(bitmapM156864q);
                } else {
                    imageView.setImageResource(q2c0.f152221e);
                }
            }
        }
    }

    private void init() {
        Bitmap bitmapM156854g;
        CameraSurfaceView cameraSurfaceView = (CameraSurfaceView) findViewById(k4c0.f121026c);
        this.f12394j = cameraSurfaceView;
        if (cameraSurfaceView != null) {
            cameraSurfaceView.m18122b(this, false, false, null);
            this.f12394j.setCameraCallback(this);
        }
        this.f12401p = (FrameLayout) findViewById(k4c0.f121022a1);
        this.f12400o = (SystemLoadingOverlay) findViewById(k4c0.f121028c1);
        TextView textView = (TextView) findViewById(k4c0.f121054m);
        if (textView != null) {
            textView.setTextColor(mxb.f136154d.getOcrTitleColor(s1c0.f161886l));
            textView.setText(m17887c2());
        }
        String str = rcm.f158794i;
        boolean z = str == null || !str.equalsIgnoreCase("Left");
        ImageView imageView = (ImageView) findViewById(k4c0.f121066s);
        ImageView imageView2 = (ImageView) findViewById(k4c0.f121068t);
        if (imageView != null) {
            Bitmap bitmapM156857j = mxb.m156857j();
            if (bitmapM156857j != null) {
                imageView2.setImageBitmap(bitmapM156857j);
            }
            imageView.setOnClickListener(new ViewOnClickListenerC3601c());
        }
        ImageView imageView3 = (ImageView) findViewById(k4c0.f121064r);
        ImageView imageView4 = (ImageView) findViewById(k4c0.f121072v);
        Bitmap bitmapM156864q = mxb.m156864q();
        if (bitmapM156864q != null) {
            imageView4.setImageBitmap(bitmapM156864q);
        }
        if (imageView3 != null) {
            imageView3.setOnClickListener(new ViewOnClickListenerC3602d());
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
        ImageView imageViewM17883Y1 = m17883Y1();
        if (imageViewM17883Y1 != null) {
            Bitmap bitmapM156862o = mxb.m156862o();
            if (bitmapM156862o != null) {
                imageViewM17883Y1.setImageBitmap(bitmapM156862o);
            }
            imageViewM17883Y1.setOnClickListener(new ViewOnClickListenerC3603e());
        }
        TextView textViewM17879V1 = m17879V1();
        if (textViewM17879V1 != null) {
            textViewM17879V1.setTextColor(mxb.f136154d.getOcrSubmitTitleColor(r1c0.f157270j));
        }
        ImageView imageViewM17893g2 = m17893g2();
        if (imageViewM17893g2 != null) {
            Bitmap bitmapM156861n = mxb.m156861n();
            if (bitmapM156861n != null) {
                imageViewM17893g2.setImageBitmap(bitmapM156861n);
            }
            imageViewM17893g2.setOnClickListener(new ViewOnClickListenerC3604f());
        }
        ImageView imageViewM17889d2 = m17889d2();
        LinearLayout linearLayoutM17890e2 = m17890e2();
        if (linearLayoutM17890e2 != null) {
            linearLayoutM17890e2.setOnClickListener(new ViewOnClickListenerC3605g());
        }
        if (imageViewM17889d2 != null && (bitmapM156854g = mxb.m156854g()) != null) {
            imageViewM17889d2.setImageBitmap(bitmapM156854g);
        }
        IdentityScanView identityScanView = this.f12395k;
        if (identityScanView != null) {
            identityScanView.m17736h(m17886b2(), this.f12403q == OcrType.OT_PHOTO_FRONT, mcm.f133148a.equals(this.f12404r));
        }
        m17791E1(true);
        m17838j3(this.f12403q);
        m17872P1().setTextColor(mxb.f136154d.getOcrTakePhotoLabelColor(r1c0.f157270j));
        ((TextView) findViewById(k4c0.f120981G0)).setTextColor(mxb.f136154d.getOcrAlbumLabelColor(r1c0.f157270j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j3 */
    public void m17838j3(OcrType ocrType) {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "switchOCRType", "ocrType", String.valueOf(ocrType));
        this.f12403q = ocrType;
        this.f12411y = null;
        m17866F1(true);
        m17798J1(true);
        m17794H1(true);
        m17796I1(true);
        TextView textView = (TextView) findViewById(k4c0.f121054m);
        if (textView != null) {
            textView.setText(m17887c2());
        }
        m17878U1().setVisibility(8);
        View viewFindViewById = findViewById(k4c0.f121080z);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(0);
        }
        TextView textViewM17879V1 = m17879V1();
        if (textViewM17879V1 != null) {
            textViewM17879V1.setVisibility(4);
        }
        IdentityAlertOverlay identityAlertOverlay = (IdentityAlertOverlay) findViewById(k4c0.f121023b);
        if (identityAlertOverlay != null) {
            identityAlertOverlay.setVisibility(4);
            this.f12372L = false;
            m17866F1(true);
        }
        FrameLayout frameLayout = this.f12401p;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        ImageView imageView = (ImageView) findViewById(k4c0.f121070u);
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        ImageView imageViewM17893g2 = m17893g2();
        if (imageViewM17893g2 != null) {
            imageViewM17893g2.setVisibility(8);
        }
        LinearLayout linearLayoutM17890e2 = m17890e2();
        if (linearLayoutM17890e2 != null) {
            linearLayoutM17890e2.setVisibility(0);
        }
        LinearLayout linearLayoutM17890e3 = m17890e2();
        if (linearLayoutM17890e3 != null) {
            if (rcm.f158792g) {
                linearLayoutM17890e3.setVisibility(0);
            } else {
                linearLayoutM17890e3.setVisibility(8);
            }
        }
        ImageView imageView2 = (ImageView) findViewById(k4c0.f120968A);
        if (imageView2 != null) {
            imageView2.setVisibility(4);
        }
        m17876S1().m17736h(m17886b2(), this.f12403q == OcrType.OT_PHOTO_FRONT, mcm.f133148a.equals(this.f12404r));
        m17876S1().m17733d(this.f12403q);
    }

    /* JADX INFO: renamed from: l2 */
    private void m17841l2() {
        if (this.f12369I.get()) {
            return;
        }
        float dimension = getResources().getDimension(n2c0.f136784b);
        LinearLayout linearLayout = (LinearLayout) findViewById(k4c0.f121035f);
        float height = linearLayout != null ? linearLayout.getHeight() : 0.0f;
        float dimension2 = getResources().getDimension(n2c0.f136787e);
        TextView textView = (TextView) findViewById(k4c0.f121054m);
        if (textView != null && this.f12395k != null) {
            ixq0.m138885b("CardScanActivity", "identityScanView setTop:" + (textView.getBottom() + dimension + height + dimension2));
            this.f12395k.setHoleTop(((float) textView.getBottom()) + dimension + height + dimension2);
            this.f12395k.setHoleLeft(getResources().getDimension(n2c0.f136783a));
            this.f12395k.m17731b();
            this.f12395k.m17735g();
        }
        m17862C1();
        m17838j3(this.f12403q);
        m17895k2();
        m17835i2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n2 */
    public void m17844n2() {
        RecordService.getInstance().recordEventBehavior(RecordLevel.LOG_INFO, "PAGER_BEHAVIOR", "exitVerifyBtn", "OCR_SCAN");
        m17831f3(getResources().getString(R$string.f11995T), "", getResources().getString(R$string.f11992Q), getResources().getString(R$string.f11986N), "ocr_exit_code", new C3600b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p2 */
    public void m17847p2() throws Throwable {
        String strM109840d;
        khi.m145962d().m145966f();
        OSSConfig oSSConfigM145535d0 = kcm.m145452H().m145535d0();
        if (oSSConfigM145535d0 == null || oSSConfigM145535d0.FileNamePrefix == null || oSSConfigM145535d0.OssEndPoint == null || oSSConfigM145535d0.AccessKeyId == null || oSSConfigM145535d0.AccessKeySecret == null) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "submitPhoto", NotificationCompat.CATEGORY_STATUS, "error", "errMsg", "ossConfig is null.");
            return;
        }
        byte[] bArrM109838b = d300.m109838b(this.f12412z);
        jwb jwbVar = this.f12363E0;
        if (jwbVar != null && jwbVar.m143655c() && bArrM109838b != null) {
            bArrM109838b = this.f12363E0.m143653a(bArrM109838b);
        }
        byte[] bArr = bArrM109838b;
        if (bArr == null) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "submitPhoto", NotificationCompat.CATEGORY_STATUS, "error", "errMsg", "ocrCropBitmap is null.");
            return;
        }
        OcrType ocrType = OcrType.OT_PHOTO_FRONT;
        OcrType ocrType2 = this.f12403q;
        if (ocrType == ocrType2) {
            strM109840d = d300.m109840d(oSSConfigM145535d0.FileNamePrefix, "ocridface", "jpeg");
            khi.m145962d().m145963b(1, oSSConfigM145535d0.BucketName, strM109840d, bArr, oSSConfigM145535d0);
        } else if (OcrType.OT_PHOTO_BACK == ocrType2) {
            strM109840d = d300.m109840d(oSSConfigM145535d0.FileNamePrefix, "ocridback", "jpeg");
            khi.m145962d().m145963b(2, oSSConfigM145535d0.BucketName, strM109840d, bArr, oSSConfigM145535d0);
        } else if (OcrType.OT_PHOTO_THIRD == ocrType2) {
            strM109840d = d300.m109840d(oSSConfigM145535d0.FileNamePrefix, "ocridthrid", "jpeg");
            khi.m145962d().m145963b(11, oSSConfigM145535d0.BucketName, strM109840d, bArr, oSSConfigM145535d0);
        } else if (OcrType.OT_PHOTO_BACK_3D == ocrType2) {
            strM109840d = d300.m109840d(oSSConfigM145535d0.FileNamePrefix, "ocridback_3d", "jpeg");
            khi.m145962d().m145963b(20, oSSConfigM145535d0.BucketName, strM109840d, bArr, oSSConfigM145535d0);
        } else {
            if (OcrType.OT_PHOTO_FRONT_3D != ocrType2) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "submitPhoto", NotificationCompat.CATEGORY_STATUS, "error", "errMsg", "ocrType is " + this.f12403q);
                return;
            }
            strM109840d = d300.m109840d(oSSConfigM145535d0.FileNamePrefix, "ocridface_3d", "jpeg");
            khi.m145962d().m145963b(10, oSSConfigM145535d0.BucketName, strM109840d, bArr, oSSConfigM145535d0);
        }
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "submitPhoto", NotificationCompat.CATEGORY_STATUS, "success", "ocrType", String.valueOf(this.f12403q), "ossFileName", strM109840d, "ossOriginFileName", "", "w", String.valueOf(this.f12412z.getWidth()), "h", String.valueOf(this.f12412z.getHeight()), "oriW", String.valueOf(this.f12358A.getWidth()), "oriH", String.valueOf(this.f12358A.getHeight()));
        khi.m145962d().m145968h(this, new C3608j(System.currentTimeMillis()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q2 */
    public void m17849q2(boolean z) {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "clickTakePhoto", NotificationCompat.CATEGORY_STATUS, "success", "isAuto", z + "");
        snl cameraInterface = this.f12394j.getCameraInterface();
        if (cameraInterface != null) {
            cameraInterface.mo107856c(new C3607i(z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r2 */
    public void m17851r2(String str) {
        if (str != null) {
            if (ncm.f138199i.equalsIgnoreCase(str) || ncm.f138200j.equalsIgnoreCase(str)) {
                m17831f3(getResources().getString(R$string.f11966D), getResources().getString(R$string.f11960A), getResources().getString(R$string.f12040t), null, str, new C3614p(str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public void m17855u2() {
        this.f12405s++;
        String strM145550i0 = kcm.m145452H().m145550i0();
        int iM145584u = kcm.m145452H().m145584u();
        if ((!pcm.f148193f.equals(strM145550i0) && this.f12405s > kcm.m145452H().m145581t().size() - 1) || (pcm.f148193f.equals(strM145550i0) && this.f12405s >= iM145584u)) {
            if (isFinishing()) {
                return;
            }
            m17792F2();
            return;
        }
        this.f12369I.set(false);
        this.f12409w = rcm.f158795j;
        m17815U2();
        m17825a3();
        IdentityScanView identityScanView = this.f12395k;
        if (identityScanView != null) {
            identityScanView.m17732c(500, new C3615q());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public void m17860z2() {
        m17891e3(false);
        m17831f3(getResources().getString(R$string.f11994S), "", getResources().getString(R$string.f11993R), null, "ocr_msg_error_code", new C3620v());
    }

    /* JADX INFO: renamed from: A2 */
    public void m17861A2() {
        m17891e3(false);
        m17827c3(true);
        this.f12402p0.removeMessages(1013);
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "ocrSuccess", NotificationCompat.CATEGORY_STATUS, "success", "ocrType", String.valueOf(this.f12403q));
        this.f12402p0.sendEmptyMessageDelayed(1005, 300L);
    }

    /* JADX INFO: renamed from: C1 */
    public RectF m17862C1() {
        RectMaskView rectMaskViewM17885a2 = m17885a2();
        if (this.f12395k == null || rectMaskViewM17885a2 == null) {
            return null;
        }
        float rectLeft = rectMaskViewM17885a2.getRectLeft();
        float rectTop = rectMaskViewM17885a2.getRectTop();
        RectF rectF = new RectF(rectLeft, rectTop, rectMaskViewM17885a2.getRectWidth() + rectLeft, rectMaskViewM17885a2.getRectHeigth() + rectTop);
        int i = this.f12394j.getLayoutParams().width;
        int i2 = this.f12394j.getLayoutParams().height;
        float f = i;
        this.f12406t[0] = (rectF.left - this.f12394j.getX()) / f;
        float f2 = i2;
        this.f12406t[1] = (rectF.top - this.f12394j.getY()) / f2;
        this.f12406t[2] = (rectF.right - this.f12394j.getX()) / f;
        float[] fArr = this.f12406t;
        fArr[3] = fArr[1];
        fArr[6] = fArr[0];
        fArr[7] = (rectF.bottom - this.f12394j.getY()) / f2;
        this.f12406t[4] = (rectF.right - this.f12394j.getX()) / f;
        float[] fArr2 = this.f12406t;
        fArr2[5] = fArr2[7];
        return rectF;
    }

    /* JADX INFO: renamed from: C2 */
    public void m17863C2(boolean z) throws Throwable {
        String strM145965e;
        String str;
        String strM109837a;
        String strM145564n = kcm.m145452H().m145564n();
        OcrType ocrType = OcrType.OT_PHOTO_FRONT;
        OcrType ocrType2 = this.f12403q;
        if (ocrType == ocrType2) {
            strM145965e = khi.m145962d().m145965e(1);
            str = "OCR_ID_FACE";
        } else if (OcrType.OT_PHOTO_BACK == ocrType2) {
            strM145965e = khi.m145962d().m145965e(2);
            str = "OCR_ID_BACK";
        } else if (OcrType.OT_PHOTO_THIRD == ocrType2) {
            strM145965e = khi.m145962d().m145965e(11);
            str = "OCR_ID_THIRD";
        } else if (OcrType.OT_PHOTO_FRONT_3D == ocrType2) {
            strM145965e = khi.m145962d().m145965e(10);
            str = "OCR_ID_FACE_3D";
        } else {
            if (OcrType.OT_PHOTO_BACK_3D != ocrType2) {
                return;
            }
            strM145965e = khi.m145962d().m145965e(20);
            str = "OCR_ID_BACK_3D";
        }
        String str2 = str;
        String str3 = strM145965e;
        if (this.f12371K) {
            kcm.m145452H().m145466D0(true);
        } else {
            kcm.m145452H().m145466D0(false);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArrM109838b = d300.m109838b(this.f12412z);
        jwb jwbVar = this.f12363E0;
        if (jwbVar == null || !jwbVar.m143655c() || bArrM109838b == null) {
            strM109837a = null;
        } else {
            strM109837a = d300.m109837a(this.f12363E0.m143654b());
            bArrM109838b = this.f12363E0.m143653a(bArrM109838b);
        }
        C3617s c3617s = new C3617s(jCurrentTimeMillis, str2);
        hc20.m130376h(strM145564n, str3, str2, bArrM109838b, strM109837a, false, z, c3617s);
    }

    /* JADX INFO: renamed from: D2 */
    public void m17864D2() {
        m17831f3(getResources().getString(R$string.f11978J), getResources().getString(R$string.f11994S), getResources().getString(R$string.f11993R), null, "ocr_out_time_code", new C3621w());
    }

    /* JADX INFO: renamed from: E2 */
    public void m17865E2() {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "sdkMaxTimeout", NotificationCompat.CATEGORY_STATUS, "error");
        m17821Y2(ncm.f138181A);
    }

    /* JADX INFO: renamed from: F1 */
    public void m17866F1(boolean z) {
        ImageView imageView = (ImageView) findViewById(k4c0.f121066s);
        m17882X1().setEnabled(z);
        m17871O1().setEnabled(z);
        if (imageView != null) {
            imageView.setEnabled(z);
        }
    }

    /* JADX INFO: renamed from: L2 */
    public void m17867L2() {
    }

    /* JADX INFO: renamed from: M1 */
    public ImageView m17868M1() {
        if (this.f12360C == null) {
            this.f12360C = (ImageView) findViewById(k4c0.f121050k);
        }
        return this.f12360C;
    }

    /* JADX INFO: renamed from: M2 */
    public void m17869M2(q84 q84Var) {
        if (this.f12399n != null) {
            m17867L2();
            m17870N2(new Frame(q84Var.f153131q, q84Var.m173335d(), q84Var.m173334c(), q84Var.m173338g(), 0, 0));
        }
    }

    /* JADX INFO: renamed from: N2 */
    public boolean m17870N2(Frame frame) {
        um2 um2Var = this.f12399n;
        if (um2Var == null) {
            return false;
        }
        um2Var.processImage(frame);
        return false;
    }

    /* JADX INFO: renamed from: O1 */
    public LinearLayout m17871O1() {
        if (this.f12359B == null) {
            this.f12359B = (LinearLayout) findViewById(k4c0.f121007T0);
        }
        return this.f12359B;
    }

    /* JADX INFO: renamed from: P1 */
    public TextView m17872P1() {
        if (this.f12366G == null) {
            this.f12366G = (TextView) findViewById(k4c0.f121041h);
        }
        return this.f12366G;
    }

    /* JADX INFO: renamed from: Q2 */
    public int m17873Q2(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(j6f.TAG_ORIENTATION, 1);
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

    /* JADX INFO: renamed from: R1 */
    public OcrType m17874R1(int i) {
        if (pcm.f148193f.equals(kcm.m145452H().m145550i0())) {
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
        if (kcm.m145452H().m145581t() == null || kcm.m145452H().m145581t().isEmpty()) {
            return OcrType.OT_PHOTO_FRONT;
        }
        String str = kcm.m145452H().m145581t().get(i);
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

    @Override // p149l.onl
    /* JADX INFO: renamed from: S */
    public void mo17875S(int i, Throwable th) {
        String str;
        RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "cameraError", "code", String.valueOf(i), "message", th.getMessage());
        switch (i) {
            case 100:
                str = ncm.f138197g;
                break;
            case 101:
                RecordService.getInstance().recordException(th);
                str = ncm.f138199i;
                break;
            case 102:
                str = ncm.f138200j;
                break;
            default:
                str = "unkown Camera Code =>" + i;
                break;
        }
        m17819X2(str);
    }

    /* JADX INFO: renamed from: S1 */
    public IdentityScanView m17876S1() {
        if (this.f12395k == null) {
            this.f12395k = (IdentityScanView) findViewById(k4c0.f121062q);
        }
        return this.f12395k;
    }

    /* JADX INFO: renamed from: T1 */
    public IdentityAlertOverlay m17877T1() {
        return (IdentityAlertOverlay) findViewById(k4c0.f121023b);
    }

    /* JADX INFO: renamed from: U1 */
    public ImageView m17878U1() {
        if (this.f12361D == null) {
            this.f12361D = (ImageView) findViewById(k4c0.f121038g);
        }
        return this.f12361D;
    }

    /* JADX INFO: renamed from: V1 */
    public TextView m17879V1() {
        return (TextView) findViewById(k4c0.f120970B);
    }

    /* JADX INFO: renamed from: V2 */
    public void m17880V2() {
        um2 um2Var = this.f12399n;
        if (um2Var != null) {
            um2Var.m194303c();
        }
    }

    /* JADX INFO: renamed from: W2 */
    public Bitmap m17881W2(int i, Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* JADX INFO: renamed from: X1 */
    public ImageView m17882X1() {
        if (this.f12364F == null) {
            this.f12364F = (ImageView) findViewById(k4c0.f121064r);
        }
        return (ImageView) findViewById(k4c0.f121064r);
    }

    /* JADX INFO: renamed from: Y1 */
    public ImageView m17883Y1() {
        if (this.f12362E == null) {
            this.f12362E = (ImageView) findViewById(k4c0.f121052l);
        }
        return (ImageView) findViewById(k4c0.f121052l);
    }

    @Override // p149l.onl
    /* JADX INFO: renamed from: a0 */
    public void mo17884a0() {
    }

    /* JADX INFO: renamed from: a2 */
    public RectMaskView m17885a2() {
        if (this.f12397l == null) {
            this.f12397l = (RectMaskView) findViewById(k4c0.f120993M0);
        }
        return this.f12397l;
    }

    /* JADX INFO: renamed from: b2 */
    public Drawable m17886b2() {
        int i;
        if (pcm.f148193f.equals(kcm.m145452H().m145550i0())) {
            return getResources().getDrawable(q2c0.f152218b);
        }
        if (mcm.f133155h.equals(this.f12404r)) {
            OcrType ocrType = OcrType.OT_PHOTO_FRONT;
            OcrType ocrType2 = this.f12403q;
            if (ocrType == ocrType2) {
                i = q2c0.f152224h;
            } else {
                i = OcrType.OT_PHOTO_BACK == ocrType2 ? q2c0.f152223g : q2c0.f152218b;
            }
        } else {
            i = (mcm.f133148a.equals(this.f12404r) && this.f12403q == OcrType.OT_PHOTO_FRONT) ? q2c0.f152224h : q2c0.f152218b;
        }
        return getResources().getDrawable(i);
    }

    /* JADX INFO: renamed from: c2 */
    public String m17887c2() {
        int i;
        String strM145587v = kcm.m145452H().m145587v();
        if (strM145587v == null) {
            return "";
        }
        if (mcm.f133148a.equals(strM145587v)) {
            i = R$string.f12005b0;
        } else {
            OcrType ocrType = OcrType.OT_PHOTO_FRONT;
            OcrType ocrType2 = this.f12403q;
            if (ocrType == ocrType2) {
                i = R$string.f12007c0;
            } else if (OcrType.OT_PHOTO_BACK == ocrType2) {
                i = R$string.f12001Z;
            } else if (OcrType.OT_PHOTO_THIRD == ocrType2) {
                i = R$string.f12011e0;
            } else if (OcrType.OT_PHOTO_FRONT_3D == ocrType2) {
                i = R$string.f12009d0;
            } else {
                i = OcrType.OT_PHOTO_BACK_3D == ocrType2 ? R$string.f12003a0 : 0;
            }
        }
        return getResources().getString(i);
    }

    @Override // p149l.onl
    /* JADX INFO: renamed from: d0 */
    public void mo17888d0() {
    }

    /* JADX INFO: renamed from: d2 */
    public ImageView m17889d2() {
        return (ImageView) findViewById(k4c0.f121044i);
    }

    /* JADX INFO: renamed from: e2 */
    public LinearLayout m17890e2() {
        return (LinearLayout) findViewById(k4c0.f121019Z0);
    }

    /* JADX INFO: renamed from: e3 */
    public void m17891e3(boolean z) {
        m17866F1(!z);
        m17791E1(!z);
        FrameLayout frameLayout = this.f12401p;
        if (frameLayout != null) {
            frameLayout.setVisibility(z ? 0 : 8);
            TextView textView = (TextView) findViewById(l4c0.f126014w);
            if (textView != null) {
                textView.setText(R$string.f11989O0);
                textView.setTextColor(mxb.f136154d.getOcrLoadingColor(r1c0.f157269i));
            }
        }
    }

    @Override // p149l.onl
    /* JADX INFO: renamed from: f0 */
    public void mo17892f0(double d, double d2) {
        FrameLayout.LayoutParams layoutParams;
        CameraSurfaceView cameraSurfaceView = this.f12394j;
        if (cameraSurfaceView == null || (layoutParams = (FrameLayout.LayoutParams) cameraSurfaceView.getLayoutParams()) == null) {
            return;
        }
        CameraSurfaceView cameraSurfaceView2 = this.f12394j;
        if (d <= d2) {
            int width = cameraSurfaceView2.getWidth();
            layoutParams.width = width;
            layoutParams.height = (int) ((((double) width) * d2) / (d * 1.0d));
            this.f12394j.setLayoutParams(layoutParams);
            this.f12394j.setBackgroundColor(0);
            ImageView imageView = (ImageView) findViewById(k4c0.f120968A);
            if (imageView != null) {
                imageView.setLayoutParams(layoutParams);
            }
        } else {
            int height = cameraSurfaceView2.getHeight();
            layoutParams.height = height;
            layoutParams.width = (int) ((((double) height) / (d2 * 1.0d)) * d);
            this.f12394j.setLayoutParams(layoutParams);
            this.f12394j.setBackgroundColor(0);
            ImageView imageView2 = (ImageView) findViewById(k4c0.f120968A);
            if (imageView2 != null) {
                imageView2.setLayoutParams(layoutParams);
            }
        }
        ixq0.m138884a("SurfaceView 宽度:w=" + layoutParams.width + " h=" + layoutParams.height);
    }

    /* JADX INFO: renamed from: g2 */
    public ImageView m17893g2() {
        return (ImageView) findViewById(k4c0.f121047j);
    }

    /* JADX INFO: renamed from: h2 */
    public boolean m17894h2() {
        IdentityAlertOverlay identityAlertOverlayM17877T1 = m17877T1();
        return identityAlertOverlayM17877T1 != null && identityAlertOverlayM17877T1.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: k2 */
    public void m17895k2() {
        if ("shoot".equals(kcm.m145452H().m145529b0())) {
            return;
        }
        um2 um2Var = (um2) ycm.m214160a("com.idv.identity.service.ocr.IdentityDocService", um2.class);
        this.f12399n = um2Var;
        if (um2Var == null) {
            ixq0.m138884a("CardScanActivityinitScanOcr baseIdentityDocService is null");
        } else {
            this.f12399n.m194301a(this, this, m17789B1().toString(), null, new HashMap());
        }
    }

    /* JADX INFO: renamed from: k3 */
    public void m17896k3() {
        if (this.f12399n == null) {
            Toast.makeText(this, "No integrated automatic scanning module", 0).show();
            return;
        }
        m17871O1().setVisibility(0);
        ImageView imageViewM17868M1 = m17868M1();
        TextView textViewM17872P1 = m17872P1();
        this.f12407u = f12357J0;
        Bitmap bitmapM156863p = mxb.m156863p();
        if (bitmapM156863p != null) {
            imageViewM17868M1.setImageBitmap(bitmapM156863p);
        } else {
            imageViewM17868M1.setImageResource(q2c0.f152225i);
        }
        textViewM17872P1.setText(R$string.f11985M0);
        this.f12395k.m17737i();
        m17883Y1().setVisibility(8);
        this.f12394j.setFocusModes("continuous-video");
    }

    /* JADX INFO: renamed from: m2 */
    public <T> void m17897m2(Class<T> cls) {
        Intent intent = new Intent((Context) this, (Class<?>) cls);
        intent.putExtra("sdkMaxTimeout", 120000 - (System.currentTimeMillis() - this.f12410x));
        startActivity(intent);
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "navigateResultPage", NotificationCompat.CATEGORY_STATUS, "success");
    }

    /* JADX INFO: renamed from: m3 */
    public void m17898m3() {
        m17871O1().setVisibility(0);
        ImageView imageViewM17868M1 = m17868M1();
        TextView textViewM17872P1 = m17872P1();
        this.f12407u = f12356I0;
        Bitmap bitmapM156855h = mxb.m156855h();
        if (bitmapM156855h != null) {
            imageViewM17868M1.setImageBitmap(bitmapM156855h);
        } else {
            imageViewM17868M1.setImageResource(q2c0.f152217a);
        }
        textViewM17872P1.setText(R$string.f11981K0);
        IdentityScanView identityScanView = this.f12395k;
        if (identityScanView != null) {
            identityScanView.m17738j();
        }
        m17883Y1().setVisibility(0);
        this.f12394j.setFocusModes("continuous-picture");
    }

    /* JADX INFO: renamed from: n3 */
    public void m17899n3() {
        String strM145550i0 = kcm.m145452H().m145550i0();
        if (strM145550i0 == null) {
            return;
        }
        if (pcm.f148191d.equals(strM145550i0)) {
            m17897m2(FinalVerifyActivity.class);
            return;
        }
        if (pcm.f148192e.equals(strM145550i0) || pcm.f148193f.equals(strM145550i0)) {
            CameraSurfaceView cameraSurfaceView = this.f12394j;
            if (cameraSurfaceView != null) {
                cameraSurfaceView.m18123c();
                this.f12394j.getSurfaceHolder().removeCallback(this.f12394j);
                this.f12394j = null;
            }
            m17901o2();
        }
    }

    @Override // p149l.onl
    /* JADX INFO: renamed from: o0 */
    public void mo17900o0(q84 q84Var) {
        if (this.f12369I.get() || m17894h2() || this.f12407u != f12357J0) {
            return;
        }
        m17869M2(q84Var);
    }

    /* JADX INFO: renamed from: o2 */
    public void m17901o2() {
        if (m17834h3(true)) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "onClickStartFaceView", NotificationCompat.CATEGORY_STATUS, "success");
        } else {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "onClickStartFaceView", NotificationCompat.CATEGORY_STATUS, "error");
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m17831f3(getResources().getString(R$string.f11995T), "", getResources().getString(R$string.f11992Q), getResources().getString(R$string.f11986N), "ocr_exit_code", new C3610l());
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ixq0.m138885b("CardScanActivity", "onCreate");
        this.f12403q = m17874R1(this.f12405s);
        setContentView(x5c0.f191113a);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            window.getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
        }
        ixq0.m138885b("onCreate", "Build.VERSION.SDK_INT:" + Build.VERSION.SDK_INT);
        this.f12387c = System.currentTimeMillis();
        this.f12368H = 0;
        RecordService.getInstance().recordEventPage(RecordLevel.LOG_INFO, "OCR_ENTER", "OCR_SCAN");
        IdentityScanView identityScanView = (IdentityScanView) findViewById(k4c0.f121062q);
        this.f12395k = identityScanView;
        if (identityScanView != null) {
            identityScanView.setHoleColor(mxb.f136154d.getOcrBorderColor(r1c0.f157270j));
        }
        this.f12363E0 = new jwb(d300.m109845i(this, "identity-key-public.key"), true);
        String strM145587v = kcm.m145452H().m145587v();
        this.f12404r = strM145587v;
        if (strM145587v == null) {
            this.f12404r = "";
        }
        this.f12409w = rcm.f158795j;
        LinearLayout linearLayoutM17890e2 = m17890e2();
        if (linearLayoutM17890e2 != null) {
            if (rcm.f158792g) {
                linearLayoutM17890e2.setVisibility(0);
            } else {
                linearLayoutM17890e2.setVisibility(8);
            }
        }
        init();
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        CameraSurfaceView cameraSurfaceView = this.f12394j;
        if (cameraSurfaceView != null) {
            cameraSurfaceView.setVisibility(4);
            this.f12394j.getSurfaceHolder().removeCallback(this.f12394j);
            this.f12394j = null;
        }
        m17815U2();
        this.f12402p0.removeMessages(1013);
        m17891e3(false);
        IdentityScanView identityScanView = this.f12395k;
        if (identityScanView != null) {
            identityScanView.m17738j();
            this.f12395k.m17736h(null, true, false);
            this.f12395k.clearAnimation();
            this.f12395k.removeAllViews();
            this.f12395k = null;
        }
        um2 um2Var = this.f12399n;
        if (um2Var != null) {
            um2Var.m194302b();
        }
        this.f12405s = 0;
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "destroyCardScanActivity", "timeCost", String.valueOf((System.currentTimeMillis() - this.f12387c) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f44446s);
        RecordService.getInstance().flush();
        this.f12363E0 = null;
        khi.m145962d().m145967g();
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f12368H = 1;
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m17815U2();
        m17825a3();
        if (this.f12368H == 2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "pressBackClose ");
            m17823Z2("CODE_VERIFY_INTERRUPT");
        }
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f12368H = 2;
        m17815U2();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            ixq0.m138885b("CardScanActivity", "onWindowFocusChanged");
            m17841l2();
        }
    }

    /* JADX INFO: renamed from: s2 */
    public void m17902s2() {
        boolean z = !this.f12370J;
        this.f12370J = z;
        m17836i3(z);
    }

    /* JADX INFO: renamed from: v2 */
    public void m17903v2(Message message) {
        String str = (String) message.obj;
        if (message.what == 1007 && "CODE_NETWORK_ERROR".equals(str)) {
            str = str + "_1006";
        }
        kcm.m145452H().m145537e(str);
        m17800K1(str);
    }

    /* JADX INFO: renamed from: w2 */
    public void m17904w2() {
        m17891e3(false);
        m17831f3(getResources().getString(R$string.f11996U), getResources().getString(R$string.f11994S), getResources().getString(R$string.f11993R), null, "ocr_failed_code", new C3619u());
    }

    /* JADX INFO: renamed from: y2 */
    public void m17905y2() {
        m17891e3(false);
        m17831f3(getResources().getString(R$string.f11999X), getResources().getString(R$string.f11990P), getResources().getString(R$string.f11993R), getResources().getString(R$string.f11988O), "ocr_network_error_code", new C3618t());
    }
}
