package com.idv.identity.face.p043ui;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSONObject;
import com.idv.identity.base.R$string;
import com.idv.identity.face.WorkState;
import com.idv.identity.face.p043ui.widget.CircleHoleView;
import com.idv.identity.face.p043ui.widget.EllipseHoleView;
import com.idv.identity.face.p043ui.widget.RoundProgressBar;
import com.idv.identity.platform.FinalVerifyActivity;
import com.idv.identity.platform.IdentityAlertOverlay;
import com.idv.identity.platform.IntlFaceBaseActivity;
import com.idv.identity.platform.camera.CameraSurfaceView;
import com.idv.identity.platform.config.OSSConfig;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import com.idv.identity.util.IdentityUtils;
import com.momo.mcamera.mask.Sticker;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.ac00;
import p153l.afm;
import p153l.as4;
import p153l.azb;
import p153l.bhq0;
import p153l.cec0;
import p153l.dfm;
import p153l.dql;
import p153l.ffm;
import p153l.hfm;
import p153l.hki;
import p153l.jxi0;
import p153l.kkl0;
import p153l.lfm;
import p153l.n94;
import p153l.o6r0;
import p153l.qcc0;
import p153l.qk20;
import p153l.scc0;
import p153l.t0g0;
import p153l.t7c0;
import p153l.uac0;
import p153l.wdj0;
import p153l.wrb;
import p153l.x9c0;
import p153l.xxb;
import p153l.y8c0;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: classes7.dex */
public class ToygerActivity extends IntlFaceBaseActivity implements wdj0.InterfaceC21083g {

    /* JADX INFO: renamed from: D */
    public static String f12858D = "ToygerActivity";

    /* JADX INFO: renamed from: E */
    public static String f12859E = "START_FACE_AUTH";

    /* JADX INFO: renamed from: d */
    private CameraSurfaceView f12864d;

    /* JADX INFO: renamed from: r */
    private boolean f12878r;

    /* JADX INFO: renamed from: s */
    private xxb f12879s;

    /* JADX INFO: renamed from: y */
    private wrb f12885y;

    /* JADX INFO: renamed from: c */
    public long f12863c = System.currentTimeMillis();

    /* JADX INFO: renamed from: e */
    public int f12865e = 0;

    /* JADX INFO: renamed from: f */
    private boolean f12866f = false;

    /* JADX INFO: renamed from: g */
    public boolean f12867g = false;

    /* JADX INFO: renamed from: h */
    private Button f12868h = null;

    /* JADX INFO: renamed from: i */
    private ImageView f12869i = null;

    /* JADX INFO: renamed from: j */
    private Button f12870j = null;

    /* JADX INFO: renamed from: k */
    private ImageView f12871k = null;

    /* JADX INFO: renamed from: l */
    private Button f12872l = null;

    /* JADX INFO: renamed from: m */
    private TextView f12873m = null;

    /* JADX INFO: renamed from: n */
    private TextView f12874n = null;

    /* JADX INFO: renamed from: o */
    private LinearLayout f12875o = null;

    /* JADX INFO: renamed from: p */
    private CircleHoleView f12876p = null;

    /* JADX INFO: renamed from: q */
    private EllipseHoleView f12877q = null;

    /* JADX INFO: renamed from: t */
    private final int f12880t = 1001;

    /* JADX INFO: renamed from: u */
    private final int f12881u = 1002;

    /* JADX INFO: renamed from: v */
    private final int f12882v = 1003;

    /* JADX INFO: renamed from: w */
    private final int f12883w = 1004;

    /* JADX INFO: renamed from: x */
    private final int f12884x = 1005;

    /* JADX INFO: renamed from: z */
    protected int f12886z = 0;

    /* JADX INFO: renamed from: A */
    private final Handler f12860A = new Handler(new C3715k());

    /* JADX INFO: renamed from: B */
    private Runnable f12861B = new RunnableC3706b();

    /* JADX INFO: renamed from: C */
    private WorkState f12862C = null;

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$a */
    public class C3705a implements InterfaceC3728x {
        public C3705a() {
        }

        @Override // com.idv.identity.face.p043ui.ToygerActivity.InterfaceC3728x
        /* JADX INFO: renamed from: a */
        public void mo18768a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "closeButton");
            ToygerActivity.this.m18727l2(dfm.f88185f);
        }

        @Override // com.idv.identity.face.p043ui.ToygerActivity.InterfaceC3728x
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$b */
    public class RunnableC3706b implements Runnable {
        public RunnableC3706b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ToygerActivity.this.f12874n != null) {
                ToygerActivity.this.f12874n.startAnimation(AnimationUtils.loadAnimation(ToygerActivity.this.getApplicationContext(), t7c0.f172416a));
            }
            ToygerActivity.this.f12866f = false;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$c */
    public class ViewOnClickListenerC3707c implements View.OnClickListener {
        public ViewOnClickListenerC3707c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ToygerActivity.this.m18688E1();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$d */
    public class ViewOnClickListenerC3708d implements View.OnClickListener {
        public ViewOnClickListenerC3708d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ToygerActivity.this.m18688E1();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$e */
    public class C3709e implements InterfaceC3728x {
        public C3709e() {
        }

        @Override // com.idv.identity.face.p043ui.ToygerActivity.InterfaceC3728x
        /* JADX INFO: renamed from: a */
        public void mo18768a() {
            ToygerActivity.this.m18687C1();
        }

        @Override // com.idv.identity.face.p043ui.ToygerActivity.InterfaceC3728x
        public void onCancel() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "pressCloseButton");
            ToygerActivity.this.m18727l2("CODE_VERIFY_INTERRUPT");
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$f */
    public class RunnableC3710f implements Runnable {
        public RunnableC3710f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ToygerActivity.this.f12877q.m18794o(azb.f74127c.getFaceBGColor(x9c0.f192931c));
            ToygerActivity.this.f12876p.m18780d(azb.f74127c.getFaceBGColor(x9c0.f192931c));
            ToygerActivity.this.f12875o.setBackgroundColor(azb.f74127c.getFaceBGColor(x9c0.f192931c));
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$g */
    public class C3711g implements InterfaceC3728x {
        public C3711g() {
        }

        @Override // com.idv.identity.face.p043ui.ToygerActivity.InterfaceC3728x
        /* JADX INFO: renamed from: a */
        public void mo18768a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "FACE_AUTH_EXIT", "type", "userBack");
            ToygerActivity.this.m18727l2(dfm.f88185f);
            ToygerActivity.super.onBackPressed();
        }

        @Override // com.idv.identity.face.p043ui.ToygerActivity.InterfaceC3728x
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$h */
    public class RunnableC3712h implements Runnable {
        public RunnableC3712h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ToygerActivity.this.m18754J1().m18805f();
            ToygerActivity.this.m18754J1().setProgress(0);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$i */
    public class C3713i implements IdentityAlertOverlay.InterfaceC3864d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ FinalVerifyActivity.InterfaceC3860f f12895a;

        public C3713i(FinalVerifyActivity.InterfaceC3860f interfaceC3860f) {
            this.f12895a = interfaceC3860f;
        }

        @Override // com.idv.identity.platform.IdentityAlertOverlay.InterfaceC3864d
        /* JADX INFO: renamed from: a */
        public void mo18769a() {
            FinalVerifyActivity.InterfaceC3860f interfaceC3860f = this.f12895a;
            if (interfaceC3860f != null) {
                interfaceC3860f.mo18771a();
            }
        }

        @Override // com.idv.identity.platform.IdentityAlertOverlay.InterfaceC3864d
        public void onCancel() {
            FinalVerifyActivity.InterfaceC3860f interfaceC3860f = this.f12895a;
            if (interfaceC3860f != null) {
                interfaceC3860f.onCancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$j */
    public class C3714j implements IdentityAlertOverlay.InterfaceC3864d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f12897a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ wdj0 f12898b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC3728x f12899c;

        public C3714j(String str, wdj0 wdj0Var, InterfaceC3728x interfaceC3728x) {
            this.f12897a = str;
            this.f12898b = wdj0Var;
            this.f12899c = interfaceC3728x;
        }

        @Override // com.idv.identity.platform.IdentityAlertOverlay.InterfaceC3864d
        /* JADX INFO: renamed from: a */
        public void mo18769a() {
            RecordService.recordAlertBtn(this.f12897a);
            ToygerActivity.this.m18716c2(false);
            if (ToygerActivity.this.f12872l != null) {
                ToygerActivity.this.f12872l.setEnabled(true);
            }
            wdj0 wdj0Var = this.f12898b;
            if (wdj0Var != null) {
                ToygerActivity.this.f12867g = false;
                wdj0Var.m205958w0(false);
            }
            RecordService.recordAlertClose(this.f12897a);
            InterfaceC3728x interfaceC3728x = this.f12899c;
            if (interfaceC3728x != null) {
                interfaceC3728x.mo18768a();
            }
        }

        @Override // com.idv.identity.platform.IdentityAlertOverlay.InterfaceC3864d
        public void onCancel() {
            RecordService.recordAlertCancel(this.f12897a);
            ToygerActivity.this.m18716c2(false);
            if (ToygerActivity.this.f12872l != null) {
                ToygerActivity.this.f12872l.setEnabled(true);
            }
            wdj0 wdj0Var = this.f12898b;
            if (wdj0Var != null) {
                ToygerActivity.this.f12867g = false;
                wdj0Var.m205958w0(false);
            }
            RecordService.recordAlertClose(this.f12897a);
            InterfaceC3728x interfaceC3728x = this.f12899c;
            if (interfaceC3728x != null) {
                interfaceC3728x.onCancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$k */
    public class C3715k implements Handler.Callback {
        public C3715k() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) throws Throwable {
            int i = message.what;
            switch (i) {
                case 901:
                    ToygerActivity.this.m18720g0(message.arg1, message.arg2);
                    return true;
                case 902:
                    ToygerActivity.this.m18703T1();
                    return true;
                case IMediaPlayer.MEDIA_INFO_ML_DROP_START /* 903 */:
                    ToygerActivity.this.m18758S1((String) message.obj);
                    return true;
                default:
                    switch (i) {
                        case IMediaPlayer.MEDIA_INFO_AUDIO_PTS_ERROR /* 910 */:
                            ToygerActivity.this.m18722i2();
                            return true;
                        case 911:
                            ToygerActivity.this.m18733o2(message.arg1);
                            return true;
                        case 912:
                            ToygerActivity.this.m18692M1(message.arg1);
                            return true;
                        case 913:
                            ToygerActivity.this.f12878r = true;
                            if (ToygerActivity.this.f12885y != null) {
                                ToygerActivity.this.f12885y.m207579a();
                            }
                            ToygerActivity.this.m18766s2();
                            ToygerActivity.this.m18729m2(true, true);
                            if (wdj0.m205900I().m205947R()) {
                                ToygerActivity.this.m18712Z1();
                            }
                            return true;
                        case 914:
                            ToygerActivity.this.mo18757R();
                            return true;
                        case 915:
                            ToygerActivity.this.m18700R1(message.arg1);
                            return true;
                        case 916:
                            ToygerActivity.this.m18741u2();
                            return true;
                        default:
                            switch (i) {
                                case 1001:
                                    ToygerActivity.this.m18727l2((String) message.obj);
                                    break;
                                case 1002:
                                    ToygerActivity.this.m18709X1(true);
                                    break;
                                case 1003:
                                    ToygerActivity.this.m18709X1(true);
                                    break;
                                case 1004:
                                    ToygerActivity.this.m18711Y1();
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$l */
    public class RunnableC3716l implements Runnable {
        public RunnableC3716l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ToygerActivity.this.f12875o.setBackgroundColor(azb.f74127c.getFaceBGColor(x9c0.f192931c));
            if (ToygerActivity.this.f12876p != null) {
                ToygerActivity.this.f12876p.m18780d(azb.f74127c.getFaceBGColor(x9c0.f192931c));
                ToygerActivity.this.f12877q.m18794o(azb.f74127c.getFaceBGColor(x9c0.f192931c));
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$m */
    public class RunnableC3717m implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Animator.AnimatorListener f12903a;

        public RunnableC3717m(Animator.AnimatorListener animatorListener) {
            this.f12903a = animatorListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            ToygerActivity.this.f12877q.m18791k(this.f12903a);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$n */
    public class RunnableC3718n implements Runnable {
        public RunnableC3718n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ToygerActivity.this.f12877q.m18792l();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$o */
    public class RunnableC3719o implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Animator.AnimatorListener f12906a;

        public RunnableC3719o(Animator.AnimatorListener animatorListener) {
            this.f12906a = animatorListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            ToygerActivity.this.f12877q.m18790j(this.f12906a);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$p */
    public class C3720p implements lfm {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f12908a;

        public C3720p(long j) {
            this.f12908a = j;
        }

        @Override // p153l.lfm
        /* JADX INFO: renamed from: b */
        public void mo18770b(String str, String str2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "verifyDeviceCost", NotificationCompat.CATEGORY_STATUS, "error", "code", str, "message", str2, "tag", "onServerError", "timeCost", ((System.currentTimeMillis() - this.f12908a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f45294s);
            if (str == null || !str.startsWith(dfm.f88198s)) {
                ToygerActivity.this.m18725k2(dfm.f88199t);
            } else {
                ToygerActivity.this.m18725k2(str);
            }
        }

        @Override // p153l.lfm
        public void onSuccess() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "verifyDeviceCost", NotificationCompat.CATEGORY_STATUS, "success", "timeCost", ((System.currentTimeMillis() - this.f12908a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f45294s);
            ToygerActivity.this.m18725k2(dfm.f88197r);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$q */
    public class C3721q implements FinalVerifyActivity.InterfaceC3860f {
        public C3721q() {
        }

        @Override // com.idv.identity.platform.FinalVerifyActivity.InterfaceC3860f
        /* JADX INFO: renamed from: a */
        public void mo18771a() throws Throwable {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "finalVerifyNetError", NotificationCompat.CATEGORY_STATUS, "retry_onOK");
            ToygerActivity.this.m18709X1(true);
        }

        @Override // com.idv.identity.platform.FinalVerifyActivity.InterfaceC3860f
        public void onCancel() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "verify fail onCancel");
            ToygerActivity.this.m18725k2(dfm.f88195p);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$r */
    public class C3722r implements InterfaceC3728x {
        public C3722r() {
        }

        @Override // com.idv.identity.face.p043ui.ToygerActivity.InterfaceC3728x
        /* JADX INFO: renamed from: a */
        public void mo18768a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "faceScan", NotificationCompat.CATEGORY_STATUS, "time out, not success");
            ToygerActivity.this.m18727l2(dfm.f88191l);
        }

        @Override // com.idv.identity.face.p043ui.ToygerActivity.InterfaceC3728x
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$s */
    public class RunnableC3723s implements Runnable {
        public RunnableC3723s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            dql dqlVarM18689G1 = ToygerActivity.this.m18689G1();
            if (dqlVarM18689G1 != null) {
                dqlVarM18689G1.mo117532a();
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$t */
    public class RunnableC3724t implements Runnable {
        public RunnableC3724t() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            ToygerActivity.this.m18759U1();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$u */
    public class C3725u implements hki.InterfaceC17490d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f12914a;

        public C3725u(long j) {
            this.f12914a = j;
        }

        @Override // p153l.hki.InterfaceC17490d
        /* JADX INFO: renamed from: a */
        public boolean mo18772a(int i, String str, String str2, String str3) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "OSS_UPLOAD_END", NotificationCompat.CATEGORY_STATUS, "fail", "idx", String.valueOf(i), "bucketName", str, "fileName", str2, "errorMsg", str3);
            return false;
        }

        @Override // p153l.hki.InterfaceC17490d
        /* JADX INFO: renamed from: b */
        public boolean mo18773b(int i, String str, String str2) {
            if (3 == i) {
                afm.m97360H().m97432Y0(str2);
            } else if (4 == i) {
                afm.m97360H().m97391J0(str2);
            } else if (6 == i) {
                afm.m97360H().m97419S1(str2);
            } else if (7 == i) {
                afm.m97360H().m97401M1(str2);
            } else if (8 == i) {
                afm.m97360H().m97441c1(str2);
            } else if (9 == i) {
                afm.m97360H().m97462j1(str2);
            }
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "OSS_UPLOAD_END", NotificationCompat.CATEGORY_STATUS, "success", "idx", String.valueOf(i), "bucketName", str, "fileName", str2);
            return false;
        }

        @Override // p153l.hki.InterfaceC17490d
        /* JADX INFO: renamed from: c */
        public void mo18774c(int i, int i2) throws Throwable {
            o6r0.m166282b("ToygerPresenter", " onFinish: oss资源上传结束");
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "OSS_UPLOAD_END", NotificationCompat.CATEGORY_STATUS, "finish", "uploadCnt", String.valueOf(i), "successCnt", String.valueOf(i2), "timeCost", ((System.currentTimeMillis() - this.f12914a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f45294s);
            ToygerActivity.this.m18709X1(true);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$v */
    public class C3726v implements InterfaceC3728x {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f12916a;

        public C3726v(String str) {
            this.f12916a = str;
        }

        @Override // com.idv.identity.face.p043ui.ToygerActivity.InterfaceC3728x
        /* JADX INFO: renamed from: a */
        public void mo18768a() {
            ToygerActivity.this.m18727l2(this.f12916a);
        }

        @Override // com.idv.identity.face.p043ui.ToygerActivity.InterfaceC3728x
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$w */
    public class C3727w implements wrb.InterfaceC21171a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f12918a;

        /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$w$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f12920a;

            public a(int i) {
                this.f12920a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                C3727w.this.mo18776b(this.f12920a);
            }
        }

        /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$w$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C3727w.this.mo18775a();
            }
        }

        /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$w$c */
        public class c implements InterfaceC3728x {
            public c() {
            }

            @Override // com.idv.identity.face.p043ui.ToygerActivity.InterfaceC3728x
            /* JADX INFO: renamed from: a */
            public void mo18768a() {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "faceScan", NotificationCompat.CATEGORY_STATUS, "time out, user retry:" + ToygerActivity.this.f12865e);
                ToygerActivity.this.m18687C1();
            }

            @Override // com.idv.identity.face.p043ui.ToygerActivity.InterfaceC3728x
            public void onCancel() {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "faceScan", NotificationCompat.CATEGORY_STATUS, "time out, user back");
                ToygerActivity.this.m18727l2(dfm.f88185f);
            }
        }

        public C3727w(int i) {
            this.f12918a = i;
        }

        @Override // p153l.wrb.InterfaceC21171a
        /* JADX INFO: renamed from: a */
        public void mo18775a() {
            Looper looperMyLooper = Looper.myLooper();
            Looper mainLooper = Looper.getMainLooper();
            ToygerActivity toygerActivity = ToygerActivity.this;
            if (looperMyLooper != mainLooper) {
                toygerActivity.f12860A.post(new b());
            } else if (toygerActivity.m18750B1()) {
                wdj0.m205900I().m205935D();
                ToygerActivity.this.m18744w2();
                ToygerActivity.this.m18743v2();
                ToygerActivity.this.m18764p2(R$string.f12717I, R$string.f12703B, R$string.f12783u, -1, "CODE_OVER_TIME", new c());
            }
        }

        @Override // p153l.wrb.InterfaceC21171a
        /* JADX INFO: renamed from: b */
        public void mo18776b(int i) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                ToygerActivity.this.f12860A.post(new a(i));
            }
            ToygerActivity.this.m18715b2(i, this.f12918a);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$x */
    public interface InterfaceC3728x {
        /* JADX INFO: renamed from: a */
        void mo18768a();

        void onCancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C1 */
    public void m18687C1() {
        CameraSurfaceView cameraSurfaceView;
        if (this.f12886z == 1 && (cameraSurfaceView = this.f12864d) != null) {
            dql cameraInterface = cameraSurfaceView.getCameraInterface();
            this.f12864d.setVisibility(0);
            if (cameraInterface != null && cameraInterface.mo117533b() != null) {
                try {
                    cameraInterface.mo117533b().startPreview();
                } catch (Throwable th) {
                    RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "cameraException", "errMsg", Log.getStackTraceString(th));
                }
            }
        }
        this.f12886z = 0;
        this.f12865e++;
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "faceScan", NotificationCompat.CATEGORY_STATUS, "time out, user retry:" + this.f12865e);
        m18762g2();
        this.f12860A.sendEmptyMessage(IMediaPlayer.MEDIA_INFO_AUDIO_PTS_ERROR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E1 */
    public void m18688E1() {
        RecordService.getInstance().recordEventBehavior(RecordLevel.LOG_INFO, "PAGER_BEHAVIOR", "exitVerifyBtn", "FACE");
        m18764p2(R$string.f12709E, R$string.f12787w, R$string.f12781t, R$string.f12779s, dfm.f88185f, new C3705a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G1 */
    public dql m18689G1() {
        CameraSurfaceView cameraSurfaceView = this.f12864d;
        if (cameraSurfaceView != null) {
            return cameraSurfaceView.getCameraInterface();
        }
        return null;
    }

    /* JADX INFO: renamed from: I1 */
    private TextView m18690I1() {
        return (TextView) findViewById(qcc0.f156585m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M1 */
    public void m18692M1(int i) {
        m18733o2(i);
    }

    /* JADX INFO: renamed from: O1 */
    private void m18695O1() {
        m18729m2(false, false);
        RecordService recordService = RecordService.getInstance();
        RecordLevel recordLevel = RecordLevel.LOG_INFO;
        recordService.recordEvent(recordLevel, "initToyger", NotificationCompat.CATEGORY_STATUS, "start preview");
        LinearLayout linearLayout = (LinearLayout) findViewById(qcc0.f156594v);
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        String str = hfm.f109324i;
        if (str == null || !str.equalsIgnoreCase("Left")) {
            this.f12870j.setVisibility(4);
            this.f12871k.setVisibility(4);
            this.f12870j.setEnabled(false);
            this.f12868h.setVisibility(0);
            this.f12869i.setVisibility(0);
            this.f12868h.setEnabled(true);
            Bitmap bitmapM101046f = azb.m101046f();
            if (bitmapM101046f != null) {
                this.f12869i.setImageBitmap(bitmapM101046f);
            }
            this.f12872l = this.f12868h;
        } else {
            this.f12870j.setVisibility(0);
            this.f12871k.setVisibility(0);
            this.f12870j.setEnabled(true);
            Bitmap bitmapM101046f2 = azb.m101046f();
            if (bitmapM101046f2 != null) {
                this.f12871k.setImageBitmap(bitmapM101046f2);
            }
            this.f12868h.setVisibility(4);
            this.f12869i.setVisibility(4);
            this.f12868h.setEnabled(false);
            this.f12872l = this.f12870j;
        }
        wdj0 wdj0VarM205900I = wdj0.m205900I();
        if (wdj0VarM205900I != null) {
            CameraSurfaceView cameraSurfaceView = (CameraSurfaceView) findViewById(qcc0.f156573a);
            this.f12864d = cameraSurfaceView;
            cameraSurfaceView.setVisibility(0);
            n94.f140739a = 640;
            this.f12864d.m19199b(this, true, true, null);
            this.f12864d.setCameraCallback(wdj0VarM205900I);
            long jCurrentTimeMillis = System.currentTimeMillis();
            wdj0VarM205900I.m205945N(this, this.f12860A, this.f12864d.getCameraInterface(), this);
            RecordService.getInstance().recordEvent(recordLevel, "toygerModelLoadCost", NotificationCompat.CATEGORY_STATUS, "success", "timeCost", String.valueOf((System.currentTimeMillis() - jCurrentTimeMillis) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f45294s);
            this.f12865e = 0;
            m18722i2();
        }
    }

    /* JADX INFO: renamed from: P1 */
    private void m18697P1() {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "initToygerUI", "startGuid", "true");
        m18695O1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R1 */
    public void m18700R1(int i) {
        this.f12875o.setBackgroundColor(i);
        this.f12876p.m18780d(i);
        this.f12877q.m18794o(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T1 */
    public void m18703T1() {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "faceScan", NotificationCompat.CATEGORY_STATUS, "face collect completed");
        this.f12860A.post(new RunnableC3723s());
        jxi0.m147354i(new RunnableC3724t());
    }

    /* JADX INFO: renamed from: V1 */
    private void m18706V1(double d, double d2) {
        View viewFindViewById = findViewById(qcc0.f156587o);
        if (viewFindViewById != null) {
            int height = viewFindViewById.getHeight();
            double dimension = getResources().getDimension(uac0.f178199a);
            FrameLayout frameLayout = (FrameLayout) findViewById(qcc0.f156589q);
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            int i = (int) ((((double) height) - dimension) * 0.6600000262260437d);
            layoutParams.height = i;
            layoutParams.width = (int) ((((double) i) / (d2 * 1.0d)) * d);
            frameLayout.setLayoutParams(layoutParams);
            frameLayout.setBackgroundColor(azb.f74127c.getFaceBGColor(x9c0.f192931c));
            this.f12876p = (CircleHoleView) findViewById(qcc0.f156592t);
            EllipseHoleView ellipseHoleViewM18753H1 = m18753H1();
            this.f12877q = ellipseHoleViewM18753H1;
            if (ellipseHoleViewM18753H1 != null) {
                ViewGroup.LayoutParams layoutParams2 = ellipseHoleViewM18753H1.getLayoutParams();
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
                this.f12877q.setLayoutParams(layoutParams2);
                EllipseHoleView ellipseHoleView = this.f12877q;
                ellipseHoleView.f12955h = layoutParams.width * 0.7f;
                ellipseHoleView.f12956i = layoutParams.height * 0.7f;
                ellipseHoleView.m18794o(azb.f74127c.getFaceBGColor(x9c0.f192931c));
                this.f12877q.invalidate();
            }
            CircleHoleView circleHoleView = this.f12876p;
            if (circleHoleView != null) {
                ViewGroup.LayoutParams layoutParams3 = circleHoleView.getLayoutParams();
                layoutParams3.width = layoutParams.width;
                layoutParams3.height = layoutParams.height;
                this.f12876p.setLayoutParams(layoutParams3);
                CircleHoleView circleHoleView2 = this.f12876p;
                int i2 = layoutParams.height;
                circleHoleView2.f12934h = i2;
                circleHoleView2.f12935i = i2;
                circleHoleView2.invalidate();
            }
            ImageView imageView = (ImageView) findViewById(qcc0.f156584l);
            if (imageView != null) {
                ViewGroup.LayoutParams layoutParams4 = imageView.getLayoutParams();
                int i3 = layoutParams.height;
                layoutParams4.width = i3;
                layoutParams4.height = i3;
                imageView.setLayoutParams(layoutParams4);
            }
            TextView textViewM18690I1 = m18690I1();
            if (textViewM18690I1 != null && (textViewM18690I1.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textViewM18690I1.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.getMarginStart(), 0, marginLayoutParams.getMarginEnd(), 0);
                textViewM18690I1.setLayoutParams(marginLayoutParams);
            }
            RoundProgressBar roundProgressBarM18754J1 = m18754J1();
            if (roundProgressBarM18754J1 != null) {
                ViewGroup.LayoutParams layoutParams5 = roundProgressBarM18754J1.getLayoutParams();
                int i4 = layoutParams.height;
                layoutParams5.width = i4;
                layoutParams5.height = i4;
                roundProgressBarM18754J1.setLayoutParams(layoutParams5);
            }
            o6r0.m166281a("屏幕宽度=>" + height + " 预览宽度=>" + layoutParams.height);
        }
        CameraSurfaceView cameraSurfaceView = this.f12864d;
        if (cameraSurfaceView != null) {
            cameraSurfaceView.setBackgroundColor(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X1 */
    public void m18709X1(boolean z) throws Throwable {
        String strM97458i0 = afm.m97360H().m97458i0();
        if (strM97458i0 == null) {
            return;
        }
        String strM96782a = null;
        String strM18747z1 = (ffm.f98801d.equals(strM97458i0) || ffm.f98802e.equals(strM97458i0) || ffm.f98803f.equals(strM97458i0)) ? m18747z1() : null;
        String strM18745y1 = m18745y1();
        String strM97472n = afm.m97360H().m97472n();
        Bitmap bitmapM97504y = afm.m97360H().m97504y();
        o6r0.m166282b(f12858D, "faceBitmap: " + bitmapM97504y);
        byte[] bArrM96783b = ac00.m96783b(bitmapM97504y);
        if (bArrM96783b == null) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "verifySmartDevice", "faceBitmap: " + bitmapM97504y, "faceBitmap", "faceBitmapContent is null");
        }
        xxb xxbVar = this.f12879s;
        if (xxbVar != null && xxbVar.m213516c() && bArrM96783b != null) {
            strM96782a = ac00.m96782a(this.f12879s.m213515b());
            afm.m97360H().m97430X0(this.f12879s.m213514a(bArrM96783b));
            if (afm.m97360H().m97379F() == 2) {
                Bitmap bitmapM97463k = afm.m97360H().m97463k();
                byte[] bArrM96783b2 = ac00.m96783b(bitmapM97463k);
                if (bArrM96783b2 != null) {
                    bArrM96783b2 = this.f12879s.m213514a(bArrM96783b2);
                }
                if (bitmapM97463k != null) {
                    afm.m97360H().m97388I0(bArrM96783b2);
                }
            }
        }
        qk20.m176914k(strM97472n, strM18747z1, strM18745y1, strM96782a, false, z, new C3720p(System.currentTimeMillis()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public void m18711Y1() {
        m18736q2(getString(R$string.f12711F), getString(R$string.f12731P), getString(R$string.f12734R), getString(R$string.f12729O), new C3721q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public void m18712Z1() {
    }

    /* JADX INFO: renamed from: a2 */
    private void m18714a2(double d, double d2) {
        View viewFindViewById = findViewById(qcc0.f156587o);
        if (viewFindViewById != null) {
            int width = viewFindViewById.getWidth();
            viewFindViewById.getHeight();
            FrameLayout frameLayout = (FrameLayout) findViewById(qcc0.f156589q);
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            int i = (int) (((double) width) * 0.6600000262260437d);
            layoutParams.width = i;
            if (d < d2) {
                layoutParams.height = (int) ((((double) i) / (d * 1.0d)) * d2);
            } else {
                layoutParams.height = (int) ((((double) i) / (d * 0.6600000262260437d)) * d2);
            }
            frameLayout.setBackgroundColor(azb.f74127c.getFaceBGColor(x9c0.f192931c));
            frameLayout.setLayoutParams(layoutParams);
            EllipseHoleView ellipseHoleViewM18753H1 = m18753H1();
            this.f12877q = ellipseHoleViewM18753H1;
            if (ellipseHoleViewM18753H1 != null) {
                ViewGroup.LayoutParams layoutParams2 = ellipseHoleViewM18753H1.getLayoutParams();
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
                this.f12877q.setLayoutParams(layoutParams2);
                EllipseHoleView ellipseHoleView = this.f12877q;
                ellipseHoleView.f12955h = layoutParams.width * 0.7f;
                ellipseHoleView.f12956i = layoutParams.height * 0.7f;
                ellipseHoleView.m18794o(azb.f74127c.getFaceBGColor(x9c0.f192931c));
                this.f12877q.invalidate();
            }
            CircleHoleView circleHoleView = (CircleHoleView) findViewById(qcc0.f156592t);
            this.f12876p = circleHoleView;
            if (circleHoleView != null) {
                ViewGroup.LayoutParams layoutParams3 = circleHoleView.getLayoutParams();
                layoutParams3.width = layoutParams.width;
                layoutParams3.height = layoutParams.height;
                this.f12876p.setLayoutParams(layoutParams3);
                CircleHoleView circleHoleView2 = this.f12876p;
                int i2 = layoutParams.width;
                circleHoleView2.f12934h = i2;
                circleHoleView2.f12935i = i2;
                circleHoleView2.m18780d(azb.f74127c.getFaceBGColor(x9c0.f192931c));
                this.f12876p.invalidate();
            }
            RoundProgressBar roundProgressBarM18754J1 = m18754J1();
            if (roundProgressBarM18754J1 != null) {
                ViewGroup.LayoutParams layoutParams4 = roundProgressBarM18754J1.getLayoutParams();
                layoutParams4.width = layoutParams.width;
                layoutParams4.height = layoutParams.width;
                roundProgressBarM18754J1.setLayoutParams(layoutParams4);
            }
            TextView textViewM18690I1 = m18690I1();
            if (textViewM18690I1 != null && (textViewM18690I1.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textViewM18690I1.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.getMarginStart(), layoutParams.height + CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, marginLayoutParams.getMarginEnd(), 0);
                textViewM18690I1.setLayoutParams(marginLayoutParams);
            }
            ImageView imageView = (ImageView) findViewById(qcc0.f156584l);
            if (imageView != null) {
                ViewGroup.LayoutParams layoutParams5 = imageView.getLayoutParams();
                layoutParams5.width = layoutParams.width;
                layoutParams5.height = layoutParams.width;
                imageView.setLayoutParams(layoutParams5);
            }
        }
        CameraSurfaceView cameraSurfaceView = this.f12864d;
        if (cameraSurfaceView != null) {
            cameraSurfaceView.setBackgroundColor(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public void m18715b2(int i, int i2) {
        RoundProgressBar roundProgressBarM18754J1 = m18754J1();
        if (roundProgressBarM18754J1 != null) {
            roundProgressBarM18754J1.setMax(i2);
            roundProgressBarM18754J1.setProgress(i2 - i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public void m18716c2(boolean z) {
        if (z && wdj0.m205900I().m205944M() == WorkState.PAUSE) {
            wrb wrbVar = this.f12885y;
            if (wrbVar != null) {
                wrbVar.m207580b();
                return;
            }
            return;
        }
        wrb wrbVar2 = this.f12885y;
        if (z) {
            if (wrbVar2 != null) {
                wrbVar2.m207580b();
            }
            this.f12862C = wdj0.m205900I().m205934C0(WorkState.PAUSE);
        } else {
            if (wrbVar2 != null) {
                wrbVar2.m207581d();
            }
            wdj0.m205900I().m205934C0(this.f12862C);
        }
    }

    /* JADX INFO: renamed from: e2 */
    private void m18718e2() {
        m18763h2();
        wdj0.m205900I().m205950f0();
        wdj0.m205900I().m205951h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public void m18720g0(double d, double d2) {
        o6r0.m166281a("surfaceChanged, w=" + d + " h=" + d2);
        if (this.f12864d != null) {
            if (d <= d2) {
                m18714a2(d, d2);
            } else {
                m18706V1(d, d2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public void m18722i2() {
        float fM97478p = afm.m97360H().m97478p();
        int i = hfm.f109327l;
        float f = i;
        if (i == 30 && fM97478p != 0.0f) {
            f = fM97478p;
        }
        o6r0.m166282b(f12858D, "timeOut:" + f + "  clientLivenessTimeout:" + fM97478p + " faceVerifyTimeOutPeriod:" + i);
        int i2 = (int) f;
        this.f12885y = wrb.m207578e(i2, new C3727w(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public void m18725k2(String str) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1001;
        messageObtain.obj = str;
        this.f12860A.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public void m18727l2(String str) {
        RecordService recordService = RecordService.getInstance();
        RecordLevel recordLevel = RecordLevel.LOG_INFO;
        recordService.recordEvent(recordLevel, "sendResponseAndFinish", "code", str, "state", wdj0.m205900I().m205944M().name());
        WorkState workState = WorkState.RET;
        if (workState == wdj0.m205900I().m205944M()) {
            return;
        }
        wdj0.m205900I().m205934C0(workState);
        afm.m97360H().m97445e(str);
        RecordService.getInstance().recordEventPage(recordLevel, "FACE_EXIT", "FACE", (System.currentTimeMillis() - this.f12863c) + "ms", str);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m2 */
    public void m18729m2(boolean z, boolean z2) {
        ImageView imageView = (ImageView) findViewById(qcc0.f156584l);
        RoundProgressBar roundProgressBarM18754J1 = m18754J1();
        if (imageView == null || roundProgressBarM18754J1 == null) {
            return;
        }
        if (z) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
            roundProgressBarM18754J1.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: n2 */
    private boolean m18731n2(String str, InterfaceC3728x interfaceC3728x) {
        if (dfm.f88195p.equalsIgnoreCase(str) || dfm.f88196q.equalsIgnoreCase(str)) {
            m18764p2(R$string.f12711F, R$string.f12789x, R$string.f12781t, -1, str, interfaceC3728x);
            return true;
        }
        if (dfm.f88186g.equalsIgnoreCase(str) || dfm.f88188i.equalsIgnoreCase(str) || dfm.f88189j.equalsIgnoreCase(str)) {
            m18764p2(R$string.f12707D, R$string.f12701A, R$string.f12781t, -1, str, interfaceC3728x);
            return true;
        }
        if (dfm.f88190k.equalsIgnoreCase(str)) {
            m18764p2(R$string.f12713G, R$string.f12791y, R$string.f12781t, -1, str, interfaceC3728x);
            return true;
        }
        if (!"CODE_VERIFY_INTERRUPT".equalsIgnoreCase(str)) {
            return false;
        }
        m18764p2(R$string.f12715H, R$string.f12793z, R$string.f12783u, R$string.f12779s, str, interfaceC3728x);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public void m18733o2(int i) {
        String strM18756L1 = afm.m97360H().m97481q() ? m18756L1(i) : m18755K1(i);
        TextView textViewM18690I1 = afm.m97360H().m97490t0() ? (TextView) findViewById(qcc0.f156595w) : m18690I1();
        if (textViewM18690I1 == null || TextUtils.isEmpty(strM18756L1)) {
            return;
        }
        textViewM18690I1.setText(strM18756L1);
    }

    /* JADX INFO: renamed from: q2 */
    private void m18736q2(String str, String str2, String str3, String str4, FinalVerifyActivity.InterfaceC3860f interfaceC3860f) {
        IdentityAlertOverlay identityAlertOverlay = (IdentityAlertOverlay) findViewById(scc0.f167226o);
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
            identityAlertOverlay.setCommAlertOverlayListener(new C3713i(interfaceC3860f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public void m18741u2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public void m18743v2() {
        wdj0.m205900I().m205938F0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w2 */
    public void m18744w2() {
        new Handler(Looper.getMainLooper()).post(new RunnableC3716l());
    }

    /* JADX INFO: renamed from: y1 */
    private String m18745y1() {
        String strCpm;
        String strCpm2;
        String strCpm3;
        String strCpm4;
        t0g0.m188742e(t0g0.C20202a.f171522j, null);
        JSONObject jSONObject = new JSONObject();
        String strM97460j = afm.m97360H().m97460j();
        if (!TextUtils.isEmpty(strM97460j)) {
            jSONObject.put("authorizationAgreementTime", (Object) strM97460j);
        }
        String strM97364A = afm.m97360H().m97364A();
        if (!TextUtils.isEmpty(strM97364A)) {
            jSONObject.put("faceFileName", (Object) strM97364A);
        }
        Bitmap bitmapM97504y = afm.m97360H().m97504y();
        if (bitmapM97504y != null && (strCpm4 = IdentityUtils.cpm(ac00.m96783b(bitmapM97504y), 1)) != null) {
            jSONObject.put("faceFileSignature", (Object) strCpm4);
        }
        if (afm.m97360H().m97379F() == 2) {
            String strM97469m = afm.m97360H().m97469m();
            if (!TextUtils.isEmpty(strM97469m)) {
                jSONObject.put("backupFaceFileName", (Object) strM97469m);
            }
            Bitmap bitmapM97463k = afm.m97360H().m97463k();
            if (bitmapM97463k != null && (strCpm3 = IdentityUtils.cpm(ac00.m96783b(bitmapM97463k), 1)) != null) {
                jSONObject.put("backupFaceFileSignature", (Object) strCpm3);
            }
        }
        if (!TextUtils.isEmpty(afm.m97360H().m97373D())) {
            jSONObject.put("faceFarFileName", (Object) afm.m97360H().m97373D());
        }
        if (!TextUtils.isEmpty(afm.m97360H().m97390J())) {
            jSONObject.put("faceNearFileName", (Object) afm.m97360H().m97390J());
        }
        if (wdj0.m205900I().m205943L()) {
            String strM97476o0 = afm.m97360H().m97476o0();
            if (!TextUtils.isEmpty(strM97476o0)) {
                if (strM97476o0.endsWith(".zip")) {
                    jSONObject.put("faceVideoDegradeZipFileName", (Object) strM97476o0);
                } else {
                    jSONObject.put("faceVideoFileName", (Object) strM97476o0);
                }
                String strM97479p0 = afm.m97360H().m97479p0();
                if (!TextUtils.isEmpty(strM97479p0) && (strCpm2 = IdentityUtils.cpm(ac00.m96784c(strM97479p0), 1)) != null) {
                    jSONObject.put("faceVideoFileSignature", (Object) strCpm2);
                }
            }
        }
        if (wdj0.m205900I().m205947R() && !TextUtils.isEmpty(afm.m97360H().m97449f0())) {
            String strM97449f0 = afm.m97360H().m97449f0();
            if (!TextUtils.isEmpty(strM97449f0)) {
                if (strM97449f0.endsWith(".zip")) {
                    jSONObject.put("photinusVideoDegradeZipFileName", (Object) strM97449f0);
                } else {
                    jSONObject.put("photinusVideoFileName", (Object) strM97449f0);
                }
            }
            String strM97452g0 = afm.m97360H().m97452g0();
            if (!TextUtils.isEmpty(strM97452g0) && (strCpm = IdentityUtils.cpm(ac00.m96784c(strM97452g0), 1)) != null) {
                jSONObject.put("photinusVideoFileSignature", (Object) strCpm);
            }
        }
        if (wdj0.m205900I().m205940H() != null) {
            List<String> listM99880m = wdj0.m205900I().m205940H().m99880m();
            if (listM99880m != null) {
                HashMap map = new HashMap();
                for (int i = 0; i < listM99880m.size(); i++) {
                    map.put(String.valueOf(i), listM99880m.get(i));
                }
                JSONObject jSONObject2 = new JSONObject(map);
                o6r0.m166285e(f12858D, "参数：" + jSONObject2);
                jSONObject.put("chameleon", (Object) jSONObject2);
                jSONObject.put("enableChameleon", (Object) Boolean.TRUE);
            } else {
                jSONObject.put("enableChameleon", (Object) Boolean.FALSE);
            }
        }
        jSONObject.toJSONString();
        return jSONObject.toJSONString();
    }

    /* JADX INFO: renamed from: y2 */
    private void m18746y2() {
        this.f12876p = (CircleHoleView) findViewById(qcc0.f156592t);
        RoundProgressBar roundProgressBarM18754J1 = m18754J1();
        this.f12877q = m18753H1();
        TextView textViewM18690I1 = m18690I1();
        boolean zM97490t0 = afm.m97360H().m97490t0();
        EllipseHoleView ellipseHoleView = this.f12877q;
        if (zM97490t0) {
            ellipseHoleView.setVisibility(0);
            roundProgressBarM18754J1.setVisibility(8);
            this.f12876p.setVisibility(8);
            textViewM18690I1.setVisibility(8);
            return;
        }
        ellipseHoleView.setVisibility(8);
        roundProgressBarM18754J1.setVisibility(0);
        this.f12876p.setVisibility(0);
        textViewM18690I1.setVisibility(0);
    }

    /* JADX INFO: renamed from: z1 */
    private String m18747z1() {
        JSONObject jSONObject = new JSONObject();
        String strM97429X = afm.m97360H().m97429X();
        if (!TextUtils.isEmpty(strM97429X)) {
            jSONObject.put("idFaceFileName", (Object) strM97429X);
        }
        String strM97420T = afm.m97360H().m97420T();
        if (!TextUtils.isEmpty(strM97420T)) {
            jSONObject.put("idNationalEmblemFileName", (Object) strM97420T);
        }
        String strM97405O = afm.m97360H().m97405O();
        if (!TextUtils.isEmpty(strM97405O)) {
            jSONObject.put("bankCardFileName", (Object) strM97405O);
        }
        return jSONObject.toJSONString();
    }

    /* JADX INFO: renamed from: z2 */
    private void m18748z2() throws Throwable {
        o6r0.m166282b(f12858D, "startActivity  Thread:" + Thread.currentThread().getName());
        OSSConfig oSSConfigM97443d0 = afm.m97360H().m97443d0();
        if (oSSConfigM97443d0 == null) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "finalStartVerify", NotificationCompat.CATEGORY_STATUS, "error", "errMsg", "ossConfig is null.");
            return;
        }
        o6r0.m166282b("ToygerPresenter", "开始上传 OSS资源");
        hki.m135625d().m135629f();
        afm.m97360H().m97432Y0(ac00.m96785d(oSSConfigM97443d0.FileNamePrefix, Sticker.LAYER_TYPE_FACE, "jpeg"));
        Bitmap bitmapM97370C = afm.m97360H().m97370C();
        String strM97373D = afm.m97360H().m97373D();
        if (bitmapM97370C != null && TextUtils.isEmpty(strM97373D)) {
            byte[] bArrM96783b = ac00.m96783b(bitmapM97370C);
            xxb xxbVar = this.f12879s;
            if (xxbVar != null && xxbVar.m213516c() && bArrM96783b != null) {
                bArrM96783b = this.f12879s.m213514a(bArrM96783b);
            }
            String strM96785d = ac00.m96785d(oSSConfigM97443d0.FileNamePrefix, "farFace", "jpeg");
            afm.m97360H().m97441c1(strM96785d);
            hki.m135625d().m135626b(8, oSSConfigM97443d0.BucketName, strM96785d, bArrM96783b, oSSConfigM97443d0);
        }
        Bitmap bitmapM97387I = afm.m97360H().m97387I();
        String strM97390J = afm.m97360H().m97390J();
        if (bitmapM97387I != null && TextUtils.isEmpty(strM97390J)) {
            byte[] bArrM96783b2 = ac00.m96783b(bitmapM97387I);
            xxb xxbVar2 = this.f12879s;
            if (xxbVar2 != null && xxbVar2.m213516c() && bArrM96783b2 != null) {
                bArrM96783b2 = this.f12879s.m213514a(bArrM96783b2);
            }
            String strM96785d2 = ac00.m96785d(oSSConfigM97443d0.FileNamePrefix, "nearFace", "jpeg");
            hki.m135625d().m135626b(9, oSSConfigM97443d0.BucketName, strM96785d2, bArrM96783b2, oSSConfigM97443d0);
            afm.m97360H().m97462j1(strM96785d2);
        }
        if (afm.m97360H().m97379F() == 2) {
            afm.m97360H().m97391J0(ac00.m96785d(oSSConfigM97443d0.FileNamePrefix, "backupface", "jpeg"));
        }
        String strM97479p0 = afm.m97360H().m97479p0();
        if (wdj0.m205900I().m205943L() && !TextUtils.isEmpty(strM97479p0)) {
            String str = ac00.m96787f(strM97479p0) ? "zip" : "mp4";
            byte[] bArrM96784c = ac00.m96784c(strM97479p0);
            xxb xxbVar3 = this.f12879s;
            if (xxbVar3 != null && xxbVar3.m213516c() && bArrM96784c != null) {
                bArrM96784c = this.f12879s.m213514a(bArrM96784c);
            }
            String strM96785d3 = ac00.m96785d(oSSConfigM97443d0.FileNamePrefix, "verifyvideo", str);
            hki.m135625d().m135626b(6, oSSConfigM97443d0.BucketName, strM96785d3, bArrM96784c, oSSConfigM97443d0);
            afm.m97360H().m97419S1(strM96785d3);
        }
        if (wdj0.m205900I().m205947R()) {
            String strM205942K = wdj0.m205900I().m205942K();
            byte[] bArrM96791j = ac00.m96791j(wdj0.m205900I().m205942K());
            if (bArrM96791j == null) {
                wdj0.m205900I().m205961z0(false);
            } else {
                xxb xxbVar4 = this.f12879s;
                if (xxbVar4 != null && xxbVar4.m213516c()) {
                    bArrM96791j = this.f12879s.m213514a(bArrM96791j);
                }
                byte[] bArr = bArrM96791j;
                String strM96785d4 = ac00.m96785d(oSSConfigM97443d0.FileNamePrefix, "photinusvideo", ac00.m96787f(strM205942K) ? "zip" : "mp4");
                hki.m135625d().m135626b(7, oSSConfigM97443d0.BucketName, strM96785d4, bArr, oSSConfigM97443d0);
                afm.m97360H().m97398L1(strM96785d4);
            }
        }
        m18752F1(oSSConfigM97443d0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "OSS_UPLOAD_START", "time", String.valueOf(jCurrentTimeMillis));
        hki.m135625d().m135631h(this, new C3725u(jCurrentTimeMillis));
    }

    /* JADX INFO: renamed from: A2 */
    public void m18749A2() {
        m18744w2();
        m18743v2();
        m18764p2(R$string.f12721K, R$string.f12705C, R$string.f12785v, -1, dfm.f88191l, new C3722r());
    }

    /* JADX INFO: renamed from: B1 */
    public boolean m18750B1() {
        if (WorkState.FACE_COMPLETED == wdj0.m205900I().m205944M()) {
            return false;
        }
        int i = hfm.f109325j;
        o6r0.m166282b(f12858D, " face checkRetryCount: " + this.f12865e + " retryTime:" + i);
        if (this.f12865e <= i) {
            return true;
        }
        m18749A2();
        return false;
    }

    /* JADX INFO: renamed from: B2 */
    public void m18751B2() {
        runOnUiThread(new RunnableC3718n());
    }

    /* JADX INFO: renamed from: F1 */
    public void m18752F1(OSSConfig oSSConfig) {
        as4 as4VarM205940H = wdj0.m205900I().m205940H();
        if (as4VarM205940H != null) {
            List<byte[]> listM99879l = as4VarM205940H.m99879l();
            for (int i = 0; i < listM99879l.size(); i++) {
                byte[] bArrM213514a = listM99879l.get(i);
                xxb xxbVar = this.f12879s;
                if (xxbVar != null && xxbVar.m213516c() && bArrM213514a != null) {
                    bArrM213514a = this.f12879s.m213514a(bArrM213514a);
                }
                hki.m135625d().m135626b(hki.m135625d().m135627c(), oSSConfig.BucketName, as4VarM205940H.m99880m().get(i), bArrM213514a, oSSConfig);
            }
        }
    }

    /* JADX INFO: renamed from: H1 */
    public EllipseHoleView m18753H1() {
        return (EllipseHoleView) findViewById(qcc0.f156583k);
    }

    /* JADX INFO: renamed from: J1 */
    public RoundProgressBar m18754J1() {
        return (RoundProgressBar) findViewById(qcc0.f156586n);
    }

    /* JADX INFO: renamed from: K1 */
    public String m18755K1(int i) {
        if (i != 2) {
            if (i != 5) {
                if (i == 101) {
                    return getString(R$string.f12723L);
                }
                if (i == 201) {
                    return getString(R$string.f12761j);
                }
                if (i != 300) {
                    if (i == 600) {
                        return getString(R$string.f12728N0);
                    }
                    if (i != 7) {
                        if (i == 8) {
                            return getString(R$string.f12759i);
                        }
                        if (i == 9) {
                            return getString(R$string.f12767m);
                        }
                        if (i == 103) {
                            return getString(R$string.f12773p);
                        }
                        if (i == 104) {
                            return getString(R$string.f12743a);
                        }
                        if (i == 500) {
                            return getString(R$string.f12777r);
                        }
                        if (i == 501) {
                            return getString(R$string.f12732P0);
                        }
                        switch (i) {
                            case 106:
                                break;
                            case 107:
                                break;
                            case 108:
                                return getString(R$string.f12771o);
                            case 109:
                            case 110:
                                return getString(R$string.f12775q);
                            case 111:
                                return getString(R$string.f12769n);
                            default:
                                return "";
                        }
                    }
                }
                return getString(R$string.f12775q);
            }
            return getString(R$string.f12763k);
        }
        return getString(R$string.f12765l);
    }

    /* JADX INFO: renamed from: L1 */
    public String m18756L1(int i) {
        if (i != 2) {
            if (i != 5) {
                if (i == 101) {
                    return getString(R$string.f12723L);
                }
                if (i == 110) {
                    return getString(R$string.f12775q);
                }
                if (i == 8) {
                    return getString(R$string.f12759i);
                }
                if (i == 9) {
                    return getString(R$string.f12767m);
                }
                if (i != 106) {
                    if (i != 107) {
                        return "";
                    }
                }
            }
            return getString(R$string.f12763k);
        }
        return getString(R$string.f12765l);
    }

    @Override // p153l.wdj0.InterfaceC21083g
    /* JADX INFO: renamed from: R */
    public void mo18757R() {
        runOnUiThread(new RunnableC3710f());
    }

    /* JADX INFO: renamed from: S1 */
    public void m18758S1(String str) {
        if (TextUtils.isEmpty(str)) {
            str = dfm.f88180a;
        }
        m18744w2();
        m18743v2();
        if (m18731n2(str, new C3726v(str))) {
            return;
        }
        m18727l2(str);
    }

    /* JADX INFO: renamed from: U1 */
    public void m18759U1() throws Throwable {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "faceScanCost", "timeCost", ((System.currentTimeMillis() - this.f12863c) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f45294s);
        m18748z2();
    }

    @Override // p153l.wdj0.InterfaceC21083g
    /* JADX INFO: renamed from: c0 */
    public void mo18760c0() {
    }

    /* JADX INFO: renamed from: d2 */
    public void m18761d2(Animator.AnimatorListener animatorListener) {
        runOnUiThread(new RunnableC3719o(animatorListener));
    }

    /* JADX INFO: renamed from: g2 */
    public void m18762g2() {
        if (m18754J1().getProgress() == 0) {
            return;
        }
        runOnUiThread(new RunnableC3712h());
    }

    /* JADX INFO: renamed from: h2 */
    public void m18763h2() {
        m18744w2();
        m18743v2();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f12878r) {
            return;
        }
        RecordService.getInstance().recordEventBehavior(RecordLevel.LOG_INFO, "PAGER_BEHAVIOR", "exitVerifyBtn", "FACE");
        m18767w1();
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RecordService.getInstance().recordEventPage(RecordLevel.LOG_INFO, "FACE_ENTER", "FACE");
        setContentView(cec0.f81336a);
        m19181K0(false, true, y8c0.f197989d);
        bhq0 bhq0VarM150124H = kkl0.m150124H(getWindow().getDecorView());
        if (bhq0VarM150124H != null) {
            bhq0VarM150124H.m104356b(true);
        }
        this.f12863c = System.currentTimeMillis();
        this.f12873m = (TextView) findViewById(qcc0.f156588p);
        this.f12886z = 0;
        this.f12879s = new xxb(ac00.m96790i(this, "identity-key-public.key"), true);
        wdj0.m205900I().m205952q0(this.f12879s);
        ac00.m96795n(this, 1.0f);
        this.f12875o = (LinearLayout) findViewById(qcc0.f156594v);
        View viewFindViewById = findViewById(qcc0.f156587o);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundColor(azb.f74127c.getFaceBGColor(x9c0.f192931c));
        }
        TextView textView = (TextView) findViewById(qcc0.f156595w);
        this.f12874n = textView;
        if (textView != null) {
            textView.setTextColor(azb.f74127c.getFaceTitleColor(x9c0.f192930b));
        }
        TextView textViewM18690I1 = m18690I1();
        if (textViewM18690I1 != null) {
            textViewM18690I1.setTextColor(azb.f74127c.getFaceTipColor(x9c0.f192929a));
        }
        RoundProgressBar roundProgressBarM18754J1 = m18754J1();
        if (roundProgressBarM18754J1 != null) {
            roundProgressBarM18754J1.setGradientColor(azb.f74127c.getFaceProgressEndColor(x9c0.f192933e));
            roundProgressBarM18754J1.setStartColor(azb.f74127c.getFaceProgressStartColor(x9c0.f192932d));
        }
        Button button = (Button) findViewById(qcc0.f156575c);
        this.f12868h = button;
        if (button != null) {
            button.setOnClickListener(new ViewOnClickListenerC3707c());
        }
        this.f12869i = (ImageView) findViewById(qcc0.f156591s);
        Button button2 = (Button) findViewById(qcc0.f156574b);
        this.f12870j = button2;
        if (button2 != null) {
            button2.setOnClickListener(new ViewOnClickListenerC3708d());
        }
        this.f12871k = (ImageView) findViewById(qcc0.f156590r);
        String str = hfm.f109323h;
        if (str != null && !str.isEmpty() && roundProgressBarM18754J1 != null) {
            roundProgressBarM18754J1.setGradientColor(Color.parseColor(hfm.f109323h));
        }
        m18697P1();
        m18746y2();
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        wrb wrbVar = this.f12885y;
        if (wrbVar != null) {
            wrbVar.m207579a();
        }
        wdj0.m205900I().m205958w0(false);
        wdj0.m205900I().m205948W();
        hki.m135625d().m135630g();
        hfm.f109327l = 30;
        this.f12860A.removeCallbacks(this.f12861B);
        CameraSurfaceView cameraSurfaceView = this.f12864d;
        if (cameraSurfaceView != null) {
            cameraSurfaceView.setVisibility(4);
            this.f12864d.m19200c();
        }
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "destroyToygerActivity", "timeCost", ((System.currentTimeMillis() - this.f12863c) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f45294s);
        this.f12878r = false;
        this.f12865e = 0;
        RecordService.getInstance().flush();
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, android.app.Activity
    public void onPause() {
        dql cameraInterface;
        super.onPause();
        Objects.toString(wdj0.m205900I().m205944M());
        WorkState workStateM205944M = wdj0.m205900I().m205944M();
        if (this.f12886z == 2 || WorkState.RET == workStateM205944M || WorkState.FACE_COMPLETED == workStateM205944M || WorkState.PHOTINUS == workStateM205944M) {
            return;
        }
        CameraSurfaceView cameraSurfaceView = this.f12864d;
        if (cameraSurfaceView != null && (cameraInterface = cameraSurfaceView.getCameraInterface()) != null && cameraInterface.mo117533b() != null) {
            try {
                cameraInterface.mo117533b().stopPreview();
            } catch (Throwable th) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "cameraException", "errMsg", Log.getStackTraceString(th));
            }
        }
        wrb wrbVar = this.f12885y;
        if (wrbVar != null) {
            wrbVar.m207579a();
        }
        if (m18750B1()) {
            m18731n2("CODE_VERIFY_INTERRUPT", new C3709e());
        }
        this.f12886z = 1;
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f12886z == 2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "pressBackClose ");
            m18727l2("CODE_VERIFY_INTERRUPT");
        }
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f12886z = 2;
    }

    /* JADX INFO: renamed from: p2 */
    public void m18764p2(int i, int i2, int i3, int i4, String str, InterfaceC3728x interfaceC3728x) {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "faceScan", "errCode", str, "errMsg" + this.f12865e);
        RecordService.recordAlertAppear(str);
        m18718e2();
        m18716c2(true);
        if (this.f12867g) {
            return;
        }
        Button button = this.f12872l;
        if (button != null) {
            button.setEnabled(false);
        }
        wdj0 wdj0VarM205900I = wdj0.m205900I();
        if (wdj0VarM205900I != null) {
            this.f12867g = true;
            wdj0VarM205900I.m205958w0(true);
        }
        IdentityAlertOverlay identityAlertOverlay = new IdentityAlertOverlay(this);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        identityAlertOverlay.setLayoutParams(layoutParams);
        addContentView(identityAlertOverlay, layoutParams);
        azb.m101041a(identityAlertOverlay, azb.m101059s(str));
        if (i > 0) {
            identityAlertOverlay.setTitleText(getString(i));
        }
        if (i2 > 0) {
            identityAlertOverlay.setMessageText(getString(i2));
        }
        if (i4 > 0) {
            identityAlertOverlay.setButtonType(true);
            identityAlertOverlay.setCancelText(getString(i4));
        } else {
            identityAlertOverlay.setButtonType(false);
        }
        if (i3 > 0) {
            identityAlertOverlay.setConfirmText(getString(i3));
        }
        identityAlertOverlay.setVisibility(0);
        identityAlertOverlay.setCommAlertOverlayListener(new C3714j(str, wdj0VarM205900I, interfaceC3728x));
    }

    /* JADX INFO: renamed from: r2 */
    public void m18765r2(Animator.AnimatorListener animatorListener) {
        runOnUiThread(new RunnableC3717m(animatorListener));
    }

    /* JADX INFO: renamed from: s2 */
    public void m18766s2() {
        LinearLayout linearLayout = (LinearLayout) findViewById(qcc0.f156593u);
        TextView textView = (TextView) findViewById(qcc0.f156588p);
        this.f12873m = textView;
        if (textView != null) {
            textView.setTextColor(azb.f74127c.getVerifyLoadingColor(y8c0.f197990e));
            this.f12873m.setText(R$string.f12730O0);
        }
        if (linearLayout == null || linearLayout.getVisibility() == 0) {
            return;
        }
        linearLayout.setVisibility(0);
    }

    /* JADX INFO: renamed from: w1 */
    public void m18767w1() {
        m18764p2(R$string.f12709E, R$string.f12787w, R$string.f12781t, R$string.f12779s, dfm.f88185f, new C3711g());
    }
}
