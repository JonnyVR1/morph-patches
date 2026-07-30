package com.idv.identity.face.p036ui;

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
import com.idv.identity.face.p036ui.widget.CircleHoleView;
import com.idv.identity.face.p036ui.widget.EllipseHoleView;
import com.idv.identity.face.p036ui.widget.RoundProgressBar;
import com.idv.identity.platform.FinalVerifyActivity;
import com.idv.identity.platform.IdentityAlertOverlay;
import com.idv.identity.platform.IntlFaceBaseActivity;
import com.idv.identity.platform.camera.CameraSurfaceView;
import com.idv.identity.platform.config.OSSConfig;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import com.idv.identity.util.IdentityUtils;
import com.momo.mcamera.mask.Sticker;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.br4;
import p149l.d300;
import p149l.gbl0;
import p149l.hc20;
import p149l.ioi0;
import p149l.iqb;
import p149l.ixq0;
import p149l.j4c0;
import p149l.jwb;
import p149l.kcm;
import p149l.khi;
import p149l.ksf0;
import p149l.l4c0;
import p149l.m2c0;
import p149l.mxb;
import p149l.ncm;
import p149l.o84;
import p149l.pcm;
import p149l.q1c0;
import p149l.rcm;
import p149l.s1c0;
import p149l.s4j0;
import p149l.snl;
import p149l.vcm;
import p149l.w5c0;
import p149l.w7q0;
import p149l.xzb0;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: classes7.dex */
public class ToygerActivity extends IntlFaceBaseActivity implements s4j0.InterfaceC19857g {

    /* JADX INFO: renamed from: D */
    public static String f12117D = "ToygerActivity";

    /* JADX INFO: renamed from: E */
    public static String f12118E = "START_FACE_AUTH";

    /* JADX INFO: renamed from: d */
    private CameraSurfaceView f12123d;

    /* JADX INFO: renamed from: r */
    private boolean f12137r;

    /* JADX INFO: renamed from: s */
    private jwb f12138s;

    /* JADX INFO: renamed from: y */
    private iqb f12144y;

    /* JADX INFO: renamed from: c */
    public long f12122c = System.currentTimeMillis();

    /* JADX INFO: renamed from: e */
    public int f12124e = 0;

    /* JADX INFO: renamed from: f */
    private boolean f12125f = false;

    /* JADX INFO: renamed from: g */
    public boolean f12126g = false;

    /* JADX INFO: renamed from: h */
    private Button f12127h = null;

    /* JADX INFO: renamed from: i */
    private ImageView f12128i = null;

    /* JADX INFO: renamed from: j */
    private Button f12129j = null;

    /* JADX INFO: renamed from: k */
    private ImageView f12130k = null;

    /* JADX INFO: renamed from: l */
    private Button f12131l = null;

    /* JADX INFO: renamed from: m */
    private TextView f12132m = null;

    /* JADX INFO: renamed from: n */
    private TextView f12133n = null;

    /* JADX INFO: renamed from: o */
    private LinearLayout f12134o = null;

    /* JADX INFO: renamed from: p */
    private CircleHoleView f12135p = null;

    /* JADX INFO: renamed from: q */
    private EllipseHoleView f12136q = null;

    /* JADX INFO: renamed from: t */
    private final int f12139t = 1001;

    /* JADX INFO: renamed from: u */
    private final int f12140u = 1002;

    /* JADX INFO: renamed from: v */
    private final int f12141v = 1003;

    /* JADX INFO: renamed from: w */
    private final int f12142w = 1004;

    /* JADX INFO: renamed from: x */
    private final int f12143x = 1005;

    /* JADX INFO: renamed from: z */
    protected int f12145z = 0;

    /* JADX INFO: renamed from: A */
    private final Handler f12119A = new Handler(new C3556k());

    /* JADX INFO: renamed from: B */
    private Runnable f12120B = new RunnableC3547b();

    /* JADX INFO: renamed from: C */
    private WorkState f12121C = null;

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$a */
    public class C3546a implements InterfaceC3569x {
        public C3546a() {
        }

        @Override // com.idv.identity.face.p036ui.ToygerActivity.InterfaceC3569x
        /* JADX INFO: renamed from: a */
        public void mo17691a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "closeButton");
            ToygerActivity.this.m17650k2(ncm.f138196f);
        }

        @Override // com.idv.identity.face.p036ui.ToygerActivity.InterfaceC3569x
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$b */
    public class RunnableC3547b implements Runnable {
        public RunnableC3547b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ToygerActivity.this.f12133n != null) {
                ToygerActivity.this.f12133n.startAnimation(AnimationUtils.loadAnimation(ToygerActivity.this.getApplicationContext(), xzb0.f195185a));
            }
            ToygerActivity.this.f12125f = false;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$c */
    public class ViewOnClickListenerC3548c implements View.OnClickListener {
        public ViewOnClickListenerC3548c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ToygerActivity.this.m17611C1();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$d */
    public class ViewOnClickListenerC3549d implements View.OnClickListener {
        public ViewOnClickListenerC3549d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ToygerActivity.this.m17611C1();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$e */
    public class C3550e implements InterfaceC3569x {
        public C3550e() {
        }

        @Override // com.idv.identity.face.p036ui.ToygerActivity.InterfaceC3569x
        /* JADX INFO: renamed from: a */
        public void mo17691a() {
            ToygerActivity.this.m17610B1();
        }

        @Override // com.idv.identity.face.p036ui.ToygerActivity.InterfaceC3569x
        public void onCancel() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "pressCloseButton");
            ToygerActivity.this.m17650k2("CODE_VERIFY_INTERRUPT");
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$f */
    public class RunnableC3551f implements Runnable {
        public RunnableC3551f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ToygerActivity.this.f12136q.m17717o(mxb.f136153c.getFaceBGColor(q1c0.f152124c));
            ToygerActivity.this.f12135p.m17703d(mxb.f136153c.getFaceBGColor(q1c0.f152124c));
            ToygerActivity.this.f12134o.setBackgroundColor(mxb.f136153c.getFaceBGColor(q1c0.f152124c));
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$g */
    public class C3552g implements InterfaceC3569x {
        public C3552g() {
        }

        @Override // com.idv.identity.face.p036ui.ToygerActivity.InterfaceC3569x
        /* JADX INFO: renamed from: a */
        public void mo17691a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "FACE_AUTH_EXIT", "type", "userBack");
            ToygerActivity.this.m17650k2(ncm.f138196f);
            ToygerActivity.super.onBackPressed();
        }

        @Override // com.idv.identity.face.p036ui.ToygerActivity.InterfaceC3569x
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$h */
    public class RunnableC3553h implements Runnable {
        public RunnableC3553h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ToygerActivity.this.m17675I1().m17728f();
            ToygerActivity.this.m17675I1().setProgress(0);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$i */
    public class C3554i implements IdentityAlertOverlay.InterfaceC3705d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ FinalVerifyActivity.InterfaceC3701f f12154a;

        public C3554i(FinalVerifyActivity.InterfaceC3701f interfaceC3701f) {
            this.f12154a = interfaceC3701f;
        }

        @Override // com.idv.identity.platform.IdentityAlertOverlay.InterfaceC3705d
        /* JADX INFO: renamed from: a */
        public void mo17692a() {
            FinalVerifyActivity.InterfaceC3701f interfaceC3701f = this.f12154a;
            if (interfaceC3701f != null) {
                interfaceC3701f.mo17694a();
            }
        }

        @Override // com.idv.identity.platform.IdentityAlertOverlay.InterfaceC3705d
        public void onCancel() {
            FinalVerifyActivity.InterfaceC3701f interfaceC3701f = this.f12154a;
            if (interfaceC3701f != null) {
                interfaceC3701f.onCancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$j */
    public class C3555j implements IdentityAlertOverlay.InterfaceC3705d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f12156a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ s4j0 f12157b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC3569x f12158c;

        public C3555j(String str, s4j0 s4j0Var, InterfaceC3569x interfaceC3569x) {
            this.f12156a = str;
            this.f12157b = s4j0Var;
            this.f12158c = interfaceC3569x;
        }

        @Override // com.idv.identity.platform.IdentityAlertOverlay.InterfaceC3705d
        /* JADX INFO: renamed from: a */
        public void mo17692a() {
            RecordService.recordAlertBtn(this.f12156a);
            ToygerActivity.this.m17640b2(false);
            if (ToygerActivity.this.f12131l != null) {
                ToygerActivity.this.f12131l.setEnabled(true);
            }
            s4j0 s4j0Var = this.f12157b;
            if (s4j0Var != null) {
                ToygerActivity.this.f12126g = false;
                s4j0Var.m182290w0(false);
            }
            RecordService.recordAlertClose(this.f12156a);
            InterfaceC3569x interfaceC3569x = this.f12158c;
            if (interfaceC3569x != null) {
                interfaceC3569x.mo17691a();
            }
        }

        @Override // com.idv.identity.platform.IdentityAlertOverlay.InterfaceC3705d
        public void onCancel() {
            RecordService.recordAlertCancel(this.f12156a);
            ToygerActivity.this.m17640b2(false);
            if (ToygerActivity.this.f12131l != null) {
                ToygerActivity.this.f12131l.setEnabled(true);
            }
            s4j0 s4j0Var = this.f12157b;
            if (s4j0Var != null) {
                ToygerActivity.this.f12126g = false;
                s4j0Var.m182290w0(false);
            }
            RecordService.recordAlertClose(this.f12156a);
            InterfaceC3569x interfaceC3569x = this.f12158c;
            if (interfaceC3569x != null) {
                interfaceC3569x.onCancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$k */
    public class C3556k implements Handler.Callback {
        public C3556k() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) throws Throwable {
            int i = message.what;
            switch (i) {
                case 901:
                    ToygerActivity.this.m17643f0(message.arg1, message.arg2);
                    return true;
                case 902:
                    ToygerActivity.this.m17626S1();
                    return true;
                case IMediaPlayer.MEDIA_INFO_ML_DROP_START /* 903 */:
                    ToygerActivity.this.m17679R1((String) message.obj);
                    return true;
                default:
                    switch (i) {
                        case IMediaPlayer.MEDIA_INFO_AUDIO_PTS_ERROR /* 910 */:
                            ToygerActivity.this.m17646h2();
                            return true;
                        case 911:
                            ToygerActivity.this.m17656n2(message.arg1);
                            return true;
                        case 912:
                            ToygerActivity.this.m17616L1(message.arg1);
                            return true;
                        case 913:
                            ToygerActivity.this.f12137r = true;
                            if (ToygerActivity.this.f12144y != null) {
                                ToygerActivity.this.f12144y.m137730a();
                            }
                            ToygerActivity.this.m17687r2();
                            ToygerActivity.this.m17652l2(true, true);
                            if (s4j0.m182232I().m182279R()) {
                                ToygerActivity.this.m17636Y1();
                            }
                            return true;
                        case 914:
                            ToygerActivity.this.mo17678Q();
                            return true;
                        case 915:
                            ToygerActivity.this.m17622P1(message.arg1);
                            return true;
                        case 916:
                            ToygerActivity.this.m17663s2();
                            return true;
                        default:
                            switch (i) {
                                case 1001:
                                    ToygerActivity.this.m17650k2((String) message.obj);
                                    break;
                                case 1002:
                                    ToygerActivity.this.m17631V1(true);
                                    break;
                                case 1003:
                                    ToygerActivity.this.m17631V1(true);
                                    break;
                                case 1004:
                                    ToygerActivity.this.m17634X1();
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$l */
    public class RunnableC3557l implements Runnable {
        public RunnableC3557l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ToygerActivity.this.f12134o.setBackgroundColor(mxb.f136153c.getFaceBGColor(q1c0.f152124c));
            if (ToygerActivity.this.f12135p != null) {
                ToygerActivity.this.f12135p.m17703d(mxb.f136153c.getFaceBGColor(q1c0.f152124c));
                ToygerActivity.this.f12136q.m17717o(mxb.f136153c.getFaceBGColor(q1c0.f152124c));
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$m */
    public class RunnableC3558m implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Animator.AnimatorListener f12162a;

        public RunnableC3558m(Animator.AnimatorListener animatorListener) {
            this.f12162a = animatorListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            ToygerActivity.this.f12136q.m17714k(this.f12162a);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$n */
    public class RunnableC3559n implements Runnable {
        public RunnableC3559n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ToygerActivity.this.f12136q.m17715l();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$o */
    public class RunnableC3560o implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Animator.AnimatorListener f12165a;

        public RunnableC3560o(Animator.AnimatorListener animatorListener) {
            this.f12165a = animatorListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            ToygerActivity.this.f12136q.m17713j(this.f12165a);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$p */
    public class C3561p implements vcm {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f12167a;

        public C3561p(long j) {
            this.f12167a = j;
        }

        @Override // p149l.vcm
        /* JADX INFO: renamed from: b */
        public void mo17693b(String str, String str2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "verifyDeviceCost", NotificationCompat.CATEGORY_STATUS, "error", "code", str, "message", str2, "tag", "onServerError", "timeCost", ((System.currentTimeMillis() - this.f12167a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f44446s);
            if (str == null || !str.startsWith(ncm.f138209s)) {
                ToygerActivity.this.m17647i2(ncm.f138210t);
            } else {
                ToygerActivity.this.m17647i2(str);
            }
        }

        @Override // p149l.vcm
        public void onSuccess() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "verifyDeviceCost", NotificationCompat.CATEGORY_STATUS, "success", "timeCost", ((System.currentTimeMillis() - this.f12167a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f44446s);
            ToygerActivity.this.m17647i2(ncm.f138208r);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$q */
    public class C3562q implements FinalVerifyActivity.InterfaceC3701f {
        public C3562q() {
        }

        @Override // com.idv.identity.platform.FinalVerifyActivity.InterfaceC3701f
        /* JADX INFO: renamed from: a */
        public void mo17694a() throws Throwable {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "finalVerifyNetError", NotificationCompat.CATEGORY_STATUS, "retry_onOK");
            ToygerActivity.this.m17631V1(true);
        }

        @Override // com.idv.identity.platform.FinalVerifyActivity.InterfaceC3701f
        public void onCancel() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "verify fail onCancel");
            ToygerActivity.this.m17647i2(ncm.f138206p);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$r */
    public class C3563r implements InterfaceC3569x {
        public C3563r() {
        }

        @Override // com.idv.identity.face.p036ui.ToygerActivity.InterfaceC3569x
        /* JADX INFO: renamed from: a */
        public void mo17691a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "faceScan", NotificationCompat.CATEGORY_STATUS, "time out, not success");
            ToygerActivity.this.m17650k2(ncm.f138202l);
        }

        @Override // com.idv.identity.face.p036ui.ToygerActivity.InterfaceC3569x
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$s */
    public class RunnableC3564s implements Runnable {
        public RunnableC3564s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            snl snlVarM17612F1 = ToygerActivity.this.m17612F1();
            if (snlVarM17612F1 != null) {
                snlVarM17612F1.mo107854a();
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$t */
    public class RunnableC3565t implements Runnable {
        public RunnableC3565t() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            ToygerActivity.this.m17680T1();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$u */
    public class C3566u implements khi.InterfaceC18016d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f12173a;

        public C3566u(long j) {
            this.f12173a = j;
        }

        @Override // p149l.khi.InterfaceC18016d
        /* JADX INFO: renamed from: a */
        public boolean mo17695a(int i, String str, String str2, String str3) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "OSS_UPLOAD_END", NotificationCompat.CATEGORY_STATUS, "fail", "idx", String.valueOf(i), "bucketName", str, "fileName", str2, "errorMsg", str3);
            return false;
        }

        @Override // p149l.khi.InterfaceC18016d
        /* JADX INFO: renamed from: b */
        public boolean mo17696b(int i, String str, String str2) {
            if (3 == i) {
                kcm.m145452H().m145524Y0(str2);
            } else if (4 == i) {
                kcm.m145452H().m145483J0(str2);
            } else if (6 == i) {
                kcm.m145452H().m145511S1(str2);
            } else if (7 == i) {
                kcm.m145452H().m145493M1(str2);
            } else if (8 == i) {
                kcm.m145452H().m145533c1(str2);
            } else if (9 == i) {
                kcm.m145452H().m145554j1(str2);
            }
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "OSS_UPLOAD_END", NotificationCompat.CATEGORY_STATUS, "success", "idx", String.valueOf(i), "bucketName", str, "fileName", str2);
            return false;
        }

        @Override // p149l.khi.InterfaceC18016d
        /* JADX INFO: renamed from: c */
        public void mo17697c(int i, int i2) throws Throwable {
            ixq0.m138885b("ToygerPresenter", " onFinish: oss资源上传结束");
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "OSS_UPLOAD_END", NotificationCompat.CATEGORY_STATUS, "finish", "uploadCnt", String.valueOf(i), "successCnt", String.valueOf(i2), "timeCost", ((System.currentTimeMillis() - this.f12173a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f44446s);
            ToygerActivity.this.m17631V1(true);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$v */
    public class C3567v implements InterfaceC3569x {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f12175a;

        public C3567v(String str) {
            this.f12175a = str;
        }

        @Override // com.idv.identity.face.p036ui.ToygerActivity.InterfaceC3569x
        /* JADX INFO: renamed from: a */
        public void mo17691a() {
            ToygerActivity.this.m17650k2(this.f12175a);
        }

        @Override // com.idv.identity.face.p036ui.ToygerActivity.InterfaceC3569x
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$w */
    public class C3568w implements iqb.InterfaceC17607a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f12177a;

        /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$w$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f12179a;

            public a(int i) {
                this.f12179a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                C3568w.this.mo17699b(this.f12179a);
            }
        }

        /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$w$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C3568w.this.mo17698a();
            }
        }

        /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$w$c */
        public class c implements InterfaceC3569x {
            public c() {
            }

            @Override // com.idv.identity.face.p036ui.ToygerActivity.InterfaceC3569x
            /* JADX INFO: renamed from: a */
            public void mo17691a() {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "faceScan", NotificationCompat.CATEGORY_STATUS, "time out, user retry:" + ToygerActivity.this.f12124e);
                ToygerActivity.this.m17610B1();
            }

            @Override // com.idv.identity.face.p036ui.ToygerActivity.InterfaceC3569x
            public void onCancel() {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "faceScan", NotificationCompat.CATEGORY_STATUS, "time out, user back");
                ToygerActivity.this.m17650k2(ncm.f138196f);
            }
        }

        public C3568w(int i) {
            this.f12177a = i;
        }

        @Override // p149l.iqb.InterfaceC17607a
        /* JADX INFO: renamed from: a */
        public void mo17698a() {
            Looper looperMyLooper = Looper.myLooper();
            Looper mainLooper = Looper.getMainLooper();
            ToygerActivity toygerActivity = ToygerActivity.this;
            if (looperMyLooper != mainLooper) {
                toygerActivity.f12119A.post(new b());
            } else if (toygerActivity.m17689z1()) {
                s4j0.m182232I().m182267D();
                ToygerActivity.this.m17667v2();
                ToygerActivity.this.m17666u2();
                ToygerActivity.this.m17685o2(R$string.f11976I, R$string.f11962B, R$string.f12042u, -1, "CODE_OVER_TIME", new c());
            }
        }

        @Override // p149l.iqb.InterfaceC17607a
        /* JADX INFO: renamed from: b */
        public void mo17699b(int i) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                ToygerActivity.this.f12119A.post(new a(i));
            }
            ToygerActivity.this.m17639a2(i, this.f12177a);
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.ToygerActivity$x */
    public interface InterfaceC3569x {
        /* JADX INFO: renamed from: a */
        void mo17691a();

        void onCancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B1 */
    public void m17610B1() {
        CameraSurfaceView cameraSurfaceView;
        if (this.f12145z == 1 && (cameraSurfaceView = this.f12123d) != null) {
            snl cameraInterface = cameraSurfaceView.getCameraInterface();
            this.f12123d.setVisibility(0);
            if (cameraInterface != null && cameraInterface.mo107855b() != null) {
                try {
                    cameraInterface.mo107855b().startPreview();
                } catch (Throwable th) {
                    RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "cameraException", "errMsg", Log.getStackTraceString(th));
                }
            }
        }
        this.f12145z = 0;
        this.f12124e++;
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "faceScan", NotificationCompat.CATEGORY_STATUS, "time out, user retry:" + this.f12124e);
        m17683e2();
        this.f12119A.sendEmptyMessage(IMediaPlayer.MEDIA_INFO_AUDIO_PTS_ERROR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C1 */
    public void m17611C1() {
        RecordService.getInstance().recordEventBehavior(RecordLevel.LOG_INFO, "PAGER_BEHAVIOR", "exitVerifyBtn", "FACE");
        m17685o2(R$string.f11968E, R$string.f12046w, R$string.f12040t, R$string.f12038s, ncm.f138196f, new C3546a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F1 */
    public snl m17612F1() {
        CameraSurfaceView cameraSurfaceView = this.f12123d;
        if (cameraSurfaceView != null) {
            return cameraSurfaceView.getCameraInterface();
        }
        return null;
    }

    /* JADX INFO: renamed from: H1 */
    private TextView m17613H1() {
        return (TextView) findViewById(j4c0.f116166m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L1 */
    public void m17616L1(int i) {
        m17656n2(i);
    }

    /* JADX INFO: renamed from: M1 */
    private void m17617M1() {
        m17652l2(false, false);
        RecordService recordService = RecordService.getInstance();
        RecordLevel recordLevel = RecordLevel.LOG_INFO;
        recordService.recordEvent(recordLevel, "initToyger", NotificationCompat.CATEGORY_STATUS, "start preview");
        LinearLayout linearLayout = (LinearLayout) findViewById(j4c0.f116175v);
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        String str = rcm.f158794i;
        if (str == null || !str.equalsIgnoreCase("Left")) {
            this.f12129j.setVisibility(4);
            this.f12130k.setVisibility(4);
            this.f12129j.setEnabled(false);
            this.f12127h.setVisibility(0);
            this.f12128i.setVisibility(0);
            this.f12127h.setEnabled(true);
            Bitmap bitmapM156853f = mxb.m156853f();
            if (bitmapM156853f != null) {
                this.f12128i.setImageBitmap(bitmapM156853f);
            }
            this.f12131l = this.f12127h;
        } else {
            this.f12129j.setVisibility(0);
            this.f12130k.setVisibility(0);
            this.f12129j.setEnabled(true);
            Bitmap bitmapM156853f2 = mxb.m156853f();
            if (bitmapM156853f2 != null) {
                this.f12130k.setImageBitmap(bitmapM156853f2);
            }
            this.f12127h.setVisibility(4);
            this.f12128i.setVisibility(4);
            this.f12127h.setEnabled(false);
            this.f12131l = this.f12129j;
        }
        s4j0 s4j0VarM182232I = s4j0.m182232I();
        if (s4j0VarM182232I != null) {
            CameraSurfaceView cameraSurfaceView = (CameraSurfaceView) findViewById(j4c0.f116154a);
            this.f12123d = cameraSurfaceView;
            cameraSurfaceView.setVisibility(0);
            o84.f142594a = 640;
            this.f12123d.m18122b(this, true, true, null);
            this.f12123d.setCameraCallback(s4j0VarM182232I);
            long jCurrentTimeMillis = System.currentTimeMillis();
            s4j0VarM182232I.m182277N(this, this.f12119A, this.f12123d.getCameraInterface(), this);
            RecordService.getInstance().recordEvent(recordLevel, "toygerModelLoadCost", NotificationCompat.CATEGORY_STATUS, "success", "timeCost", String.valueOf((System.currentTimeMillis() - jCurrentTimeMillis) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f44446s);
            this.f12124e = 0;
            m17646h2();
        }
    }

    /* JADX INFO: renamed from: O1 */
    private void m17620O1() {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "initToygerUI", "startGuid", "true");
        m17617M1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P1 */
    public void m17622P1(int i) {
        this.f12134o.setBackgroundColor(i);
        this.f12135p.m17703d(i);
        this.f12136q.m17717o(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S1 */
    public void m17626S1() {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "faceScan", NotificationCompat.CATEGORY_STATUS, "face collect completed");
        this.f12119A.post(new RunnableC3564s());
        ioi0.m137343i(new RunnableC3565t());
    }

    /* JADX INFO: renamed from: U1 */
    private void m17629U1(double d, double d2) {
        View viewFindViewById = findViewById(j4c0.f116168o);
        if (viewFindViewById != null) {
            int height = viewFindViewById.getHeight();
            double dimension = getResources().getDimension(m2c0.f130920a);
            FrameLayout frameLayout = (FrameLayout) findViewById(j4c0.f116170q);
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            int i = (int) ((((double) height) - dimension) * 0.6600000262260437d);
            layoutParams.height = i;
            layoutParams.width = (int) ((((double) i) / (d2 * 1.0d)) * d);
            frameLayout.setLayoutParams(layoutParams);
            frameLayout.setBackgroundColor(mxb.f136153c.getFaceBGColor(q1c0.f152124c));
            this.f12135p = (CircleHoleView) findViewById(j4c0.f116173t);
            EllipseHoleView ellipseHoleViewM17674G1 = m17674G1();
            this.f12136q = ellipseHoleViewM17674G1;
            if (ellipseHoleViewM17674G1 != null) {
                ViewGroup.LayoutParams layoutParams2 = ellipseHoleViewM17674G1.getLayoutParams();
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
                this.f12136q.setLayoutParams(layoutParams2);
                EllipseHoleView ellipseHoleView = this.f12136q;
                ellipseHoleView.f12214h = layoutParams.width * 0.7f;
                ellipseHoleView.f12215i = layoutParams.height * 0.7f;
                ellipseHoleView.m17717o(mxb.f136153c.getFaceBGColor(q1c0.f152124c));
                this.f12136q.invalidate();
            }
            CircleHoleView circleHoleView = this.f12135p;
            if (circleHoleView != null) {
                ViewGroup.LayoutParams layoutParams3 = circleHoleView.getLayoutParams();
                layoutParams3.width = layoutParams.width;
                layoutParams3.height = layoutParams.height;
                this.f12135p.setLayoutParams(layoutParams3);
                CircleHoleView circleHoleView2 = this.f12135p;
                int i2 = layoutParams.height;
                circleHoleView2.f12193h = i2;
                circleHoleView2.f12194i = i2;
                circleHoleView2.invalidate();
            }
            ImageView imageView = (ImageView) findViewById(j4c0.f116165l);
            if (imageView != null) {
                ViewGroup.LayoutParams layoutParams4 = imageView.getLayoutParams();
                int i3 = layoutParams.height;
                layoutParams4.width = i3;
                layoutParams4.height = i3;
                imageView.setLayoutParams(layoutParams4);
            }
            TextView textViewM17613H1 = m17613H1();
            if (textViewM17613H1 != null && (textViewM17613H1.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textViewM17613H1.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.getMarginStart(), 0, marginLayoutParams.getMarginEnd(), 0);
                textViewM17613H1.setLayoutParams(marginLayoutParams);
            }
            RoundProgressBar roundProgressBarM17675I1 = m17675I1();
            if (roundProgressBarM17675I1 != null) {
                ViewGroup.LayoutParams layoutParams5 = roundProgressBarM17675I1.getLayoutParams();
                int i4 = layoutParams.height;
                layoutParams5.width = i4;
                layoutParams5.height = i4;
                roundProgressBarM17675I1.setLayoutParams(layoutParams5);
            }
            ixq0.m138884a("屏幕宽度=>" + height + " 预览宽度=>" + layoutParams.height);
        }
        CameraSurfaceView cameraSurfaceView = this.f12123d;
        if (cameraSurfaceView != null) {
            cameraSurfaceView.setBackgroundColor(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V1 */
    public void m17631V1(boolean z) throws Throwable {
        String strM145550i0 = kcm.m145452H().m145550i0();
        if (strM145550i0 == null) {
            return;
        }
        String strM109837a = null;
        String strM17670y1 = (pcm.f148191d.equals(strM145550i0) || pcm.f148192e.equals(strM145550i0) || pcm.f148193f.equals(strM145550i0)) ? m17670y1() : null;
        String strM17668w1 = m17668w1();
        String strM145564n = kcm.m145452H().m145564n();
        Bitmap bitmapM145596y = kcm.m145452H().m145596y();
        ixq0.m138885b(f12117D, "faceBitmap: " + bitmapM145596y);
        byte[] bArrM109838b = d300.m109838b(bitmapM145596y);
        if (bArrM109838b == null) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "verifySmartDevice", "faceBitmap: " + bitmapM145596y, "faceBitmap", "faceBitmapContent is null");
        }
        jwb jwbVar = this.f12138s;
        if (jwbVar != null && jwbVar.m143655c() && bArrM109838b != null) {
            strM109837a = d300.m109837a(this.f12138s.m143654b());
            kcm.m145452H().m145522X0(this.f12138s.m143653a(bArrM109838b));
            if (kcm.m145452H().m145471F() == 2) {
                Bitmap bitmapM145555k = kcm.m145452H().m145555k();
                byte[] bArrM109838b2 = d300.m109838b(bitmapM145555k);
                if (bArrM109838b2 != null) {
                    bArrM109838b2 = this.f12138s.m143653a(bArrM109838b2);
                }
                if (bitmapM145555k != null) {
                    kcm.m145452H().m145480I0(bArrM109838b2);
                }
            }
        }
        hc20.m130379k(strM145564n, strM17670y1, strM17668w1, strM109837a, false, z, new C3561p(System.currentTimeMillis()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X1 */
    public void m17634X1() {
        m17659p2(getString(R$string.f11970F), getString(R$string.f11990P), getString(R$string.f11993R), getString(R$string.f11988O), new C3562q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public void m17636Y1() {
    }

    /* JADX INFO: renamed from: Z1 */
    private void m17637Z1(double d, double d2) {
        View viewFindViewById = findViewById(j4c0.f116168o);
        if (viewFindViewById != null) {
            int width = viewFindViewById.getWidth();
            viewFindViewById.getHeight();
            FrameLayout frameLayout = (FrameLayout) findViewById(j4c0.f116170q);
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            int i = (int) (((double) width) * 0.6600000262260437d);
            layoutParams.width = i;
            if (d < d2) {
                layoutParams.height = (int) ((((double) i) / (d * 1.0d)) * d2);
            } else {
                layoutParams.height = (int) ((((double) i) / (d * 0.6600000262260437d)) * d2);
            }
            frameLayout.setBackgroundColor(mxb.f136153c.getFaceBGColor(q1c0.f152124c));
            frameLayout.setLayoutParams(layoutParams);
            EllipseHoleView ellipseHoleViewM17674G1 = m17674G1();
            this.f12136q = ellipseHoleViewM17674G1;
            if (ellipseHoleViewM17674G1 != null) {
                ViewGroup.LayoutParams layoutParams2 = ellipseHoleViewM17674G1.getLayoutParams();
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
                this.f12136q.setLayoutParams(layoutParams2);
                EllipseHoleView ellipseHoleView = this.f12136q;
                ellipseHoleView.f12214h = layoutParams.width * 0.7f;
                ellipseHoleView.f12215i = layoutParams.height * 0.7f;
                ellipseHoleView.m17717o(mxb.f136153c.getFaceBGColor(q1c0.f152124c));
                this.f12136q.invalidate();
            }
            CircleHoleView circleHoleView = (CircleHoleView) findViewById(j4c0.f116173t);
            this.f12135p = circleHoleView;
            if (circleHoleView != null) {
                ViewGroup.LayoutParams layoutParams3 = circleHoleView.getLayoutParams();
                layoutParams3.width = layoutParams.width;
                layoutParams3.height = layoutParams.height;
                this.f12135p.setLayoutParams(layoutParams3);
                CircleHoleView circleHoleView2 = this.f12135p;
                int i2 = layoutParams.width;
                circleHoleView2.f12193h = i2;
                circleHoleView2.f12194i = i2;
                circleHoleView2.m17703d(mxb.f136153c.getFaceBGColor(q1c0.f152124c));
                this.f12135p.invalidate();
            }
            RoundProgressBar roundProgressBarM17675I1 = m17675I1();
            if (roundProgressBarM17675I1 != null) {
                ViewGroup.LayoutParams layoutParams4 = roundProgressBarM17675I1.getLayoutParams();
                layoutParams4.width = layoutParams.width;
                layoutParams4.height = layoutParams.width;
                roundProgressBarM17675I1.setLayoutParams(layoutParams4);
            }
            TextView textViewM17613H1 = m17613H1();
            if (textViewM17613H1 != null && (textViewM17613H1.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textViewM17613H1.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.getMarginStart(), layoutParams.height + CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, marginLayoutParams.getMarginEnd(), 0);
                textViewM17613H1.setLayoutParams(marginLayoutParams);
            }
            ImageView imageView = (ImageView) findViewById(j4c0.f116165l);
            if (imageView != null) {
                ViewGroup.LayoutParams layoutParams5 = imageView.getLayoutParams();
                layoutParams5.width = layoutParams.width;
                layoutParams5.height = layoutParams.width;
                imageView.setLayoutParams(layoutParams5);
            }
        }
        CameraSurfaceView cameraSurfaceView = this.f12123d;
        if (cameraSurfaceView != null) {
            cameraSurfaceView.setBackgroundColor(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public void m17639a2(int i, int i2) {
        RoundProgressBar roundProgressBarM17675I1 = m17675I1();
        if (roundProgressBarM17675I1 != null) {
            roundProgressBarM17675I1.setMax(i2);
            roundProgressBarM17675I1.setProgress(i2 - i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public void m17640b2(boolean z) {
        if (z && s4j0.m182232I().m182276M() == WorkState.PAUSE) {
            iqb iqbVar = this.f12144y;
            if (iqbVar != null) {
                iqbVar.m137731b();
                return;
            }
            return;
        }
        iqb iqbVar2 = this.f12144y;
        if (z) {
            if (iqbVar2 != null) {
                iqbVar2.m137731b();
            }
            this.f12121C = s4j0.m182232I().m182266C0(WorkState.PAUSE);
        } else {
            if (iqbVar2 != null) {
                iqbVar2.m137732d();
            }
            s4j0.m182232I().m182266C0(this.f12121C);
        }
    }

    /* JADX INFO: renamed from: d2 */
    private void m17642d2() {
        m17684g2();
        s4j0.m182232I().m182282g0();
        s4j0.m182232I().m182283h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public void m17643f0(double d, double d2) {
        ixq0.m138884a("surfaceChanged, w=" + d + " h=" + d2);
        if (this.f12123d != null) {
            if (d <= d2) {
                m17637Z1(d, d2);
            } else {
                m17629U1(d, d2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public void m17646h2() {
        float fM145570p = kcm.m145452H().m145570p();
        int i = rcm.f158797l;
        float f = i;
        if (i == 30 && fM145570p != 0.0f) {
            f = fM145570p;
        }
        ixq0.m138885b(f12117D, "timeOut:" + f + "  clientLivenessTimeout:" + fM145570p + " faceVerifyTimeOutPeriod:" + i);
        int i2 = (int) f;
        this.f12144y = iqb.m137729e(i2, new C3568w(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public void m17647i2(String str) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1001;
        messageObtain.obj = str;
        this.f12119A.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public void m17650k2(String str) {
        RecordService recordService = RecordService.getInstance();
        RecordLevel recordLevel = RecordLevel.LOG_INFO;
        recordService.recordEvent(recordLevel, "sendResponseAndFinish", "code", str, "state", s4j0.m182232I().m182276M().name());
        WorkState workState = WorkState.RET;
        if (workState == s4j0.m182232I().m182276M()) {
            return;
        }
        s4j0.m182232I().m182266C0(workState);
        kcm.m145452H().m145537e(str);
        RecordService.getInstance().recordEventPage(recordLevel, "FACE_EXIT", "FACE", (System.currentTimeMillis() - this.f12122c) + "ms", str);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public void m17652l2(boolean z, boolean z2) {
        ImageView imageView = (ImageView) findViewById(j4c0.f116165l);
        RoundProgressBar roundProgressBarM17675I1 = m17675I1();
        if (imageView == null || roundProgressBarM17675I1 == null) {
            return;
        }
        if (z) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
            roundProgressBarM17675I1.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: m2 */
    private boolean m17654m2(String str, InterfaceC3569x interfaceC3569x) {
        if (ncm.f138206p.equalsIgnoreCase(str) || ncm.f138207q.equalsIgnoreCase(str)) {
            m17685o2(R$string.f11970F, R$string.f12048x, R$string.f12040t, -1, str, interfaceC3569x);
            return true;
        }
        if (ncm.f138197g.equalsIgnoreCase(str) || ncm.f138199i.equalsIgnoreCase(str) || ncm.f138200j.equalsIgnoreCase(str)) {
            m17685o2(R$string.f11966D, R$string.f11960A, R$string.f12040t, -1, str, interfaceC3569x);
            return true;
        }
        if (ncm.f138201k.equalsIgnoreCase(str)) {
            m17685o2(R$string.f11972G, R$string.f12050y, R$string.f12040t, -1, str, interfaceC3569x);
            return true;
        }
        if (!"CODE_VERIFY_INTERRUPT".equalsIgnoreCase(str)) {
            return false;
        }
        m17685o2(R$string.f11974H, R$string.f12052z, R$string.f12042u, R$string.f12038s, str, interfaceC3569x);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n2 */
    public void m17656n2(int i) {
        String strM17677K1 = kcm.m145452H().m145573q() ? m17677K1(i) : m17676J1(i);
        TextView textViewM17613H1 = kcm.m145452H().m145582t0() ? (TextView) findViewById(j4c0.f116176w) : m17613H1();
        if (textViewM17613H1 == null || TextUtils.isEmpty(strM17677K1)) {
            return;
        }
        textViewM17613H1.setText(strM17677K1);
    }

    /* JADX INFO: renamed from: p2 */
    private void m17659p2(String str, String str2, String str3, String str4, FinalVerifyActivity.InterfaceC3701f interfaceC3701f) {
        IdentityAlertOverlay identityAlertOverlay = (IdentityAlertOverlay) findViewById(l4c0.f126006o);
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
            identityAlertOverlay.setCommAlertOverlayListener(new C3554i(interfaceC3701f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public void m17663s2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public void m17666u2() {
        s4j0.m182232I().m182270F0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public void m17667v2() {
        new Handler(Looper.getMainLooper()).post(new RunnableC3557l());
    }

    /* JADX INFO: renamed from: w1 */
    private String m17668w1() {
        String strCpm;
        String strCpm2;
        String strCpm3;
        String strCpm4;
        ksf0.m147071e(ksf0.C18071a.f124472j, null);
        JSONObject jSONObject = new JSONObject();
        String strM145552j = kcm.m145452H().m145552j();
        if (!TextUtils.isEmpty(strM145552j)) {
            jSONObject.put("authorizationAgreementTime", (Object) strM145552j);
        }
        String strM145456A = kcm.m145452H().m145456A();
        if (!TextUtils.isEmpty(strM145456A)) {
            jSONObject.put("faceFileName", (Object) strM145456A);
        }
        Bitmap bitmapM145596y = kcm.m145452H().m145596y();
        if (bitmapM145596y != null && (strCpm4 = IdentityUtils.cpm(d300.m109838b(bitmapM145596y), 1)) != null) {
            jSONObject.put("faceFileSignature", (Object) strCpm4);
        }
        if (kcm.m145452H().m145471F() == 2) {
            String strM145561m = kcm.m145452H().m145561m();
            if (!TextUtils.isEmpty(strM145561m)) {
                jSONObject.put("backupFaceFileName", (Object) strM145561m);
            }
            Bitmap bitmapM145555k = kcm.m145452H().m145555k();
            if (bitmapM145555k != null && (strCpm3 = IdentityUtils.cpm(d300.m109838b(bitmapM145555k), 1)) != null) {
                jSONObject.put("backupFaceFileSignature", (Object) strCpm3);
            }
        }
        if (!TextUtils.isEmpty(kcm.m145452H().m145465D())) {
            jSONObject.put("faceFarFileName", (Object) kcm.m145452H().m145465D());
        }
        if (!TextUtils.isEmpty(kcm.m145452H().m145482J())) {
            jSONObject.put("faceNearFileName", (Object) kcm.m145452H().m145482J());
        }
        if (s4j0.m182232I().m182275L()) {
            String strM145568o0 = kcm.m145452H().m145568o0();
            if (!TextUtils.isEmpty(strM145568o0)) {
                if (strM145568o0.endsWith(".zip")) {
                    jSONObject.put("faceVideoDegradeZipFileName", (Object) strM145568o0);
                } else {
                    jSONObject.put("faceVideoFileName", (Object) strM145568o0);
                }
                String strM145571p0 = kcm.m145452H().m145571p0();
                if (!TextUtils.isEmpty(strM145571p0) && (strCpm2 = IdentityUtils.cpm(d300.m109839c(strM145571p0), 1)) != null) {
                    jSONObject.put("faceVideoFileSignature", (Object) strCpm2);
                }
            }
        }
        if (s4j0.m182232I().m182279R() && !TextUtils.isEmpty(kcm.m145452H().m145541f0())) {
            String strM145541f0 = kcm.m145452H().m145541f0();
            if (!TextUtils.isEmpty(strM145541f0)) {
                if (strM145541f0.endsWith(".zip")) {
                    jSONObject.put("photinusVideoDegradeZipFileName", (Object) strM145541f0);
                } else {
                    jSONObject.put("photinusVideoFileName", (Object) strM145541f0);
                }
            }
            String strM145544g0 = kcm.m145452H().m145544g0();
            if (!TextUtils.isEmpty(strM145544g0) && (strCpm = IdentityUtils.cpm(d300.m109839c(strM145544g0), 1)) != null) {
                jSONObject.put("photinusVideoFileSignature", (Object) strCpm);
            }
        }
        if (s4j0.m182232I().m182272H() != null) {
            List<String> listM103468m = s4j0.m182232I().m182272H().m103468m();
            if (listM103468m != null) {
                HashMap map = new HashMap();
                for (int i = 0; i < listM103468m.size(); i++) {
                    map.put(String.valueOf(i), listM103468m.get(i));
                }
                JSONObject jSONObject2 = new JSONObject(map);
                ixq0.m138888e(f12117D, "参数：" + jSONObject2);
                jSONObject.put("chameleon", (Object) jSONObject2);
                jSONObject.put("enableChameleon", (Object) Boolean.TRUE);
            } else {
                jSONObject.put("enableChameleon", (Object) Boolean.FALSE);
            }
        }
        jSONObject.toJSONString();
        return jSONObject.toJSONString();
    }

    /* JADX INFO: renamed from: w2 */
    private void m17669w2() {
        this.f12135p = (CircleHoleView) findViewById(j4c0.f116173t);
        RoundProgressBar roundProgressBarM17675I1 = m17675I1();
        this.f12136q = m17674G1();
        TextView textViewM17613H1 = m17613H1();
        boolean zM145582t0 = kcm.m145452H().m145582t0();
        EllipseHoleView ellipseHoleView = this.f12136q;
        if (zM145582t0) {
            ellipseHoleView.setVisibility(0);
            roundProgressBarM17675I1.setVisibility(8);
            this.f12135p.setVisibility(8);
            textViewM17613H1.setVisibility(8);
            return;
        }
        ellipseHoleView.setVisibility(8);
        roundProgressBarM17675I1.setVisibility(0);
        this.f12135p.setVisibility(0);
        textViewM17613H1.setVisibility(0);
    }

    /* JADX INFO: renamed from: y1 */
    private String m17670y1() {
        JSONObject jSONObject = new JSONObject();
        String strM145521X = kcm.m145452H().m145521X();
        if (!TextUtils.isEmpty(strM145521X)) {
            jSONObject.put("idFaceFileName", (Object) strM145521X);
        }
        String strM145512T = kcm.m145452H().m145512T();
        if (!TextUtils.isEmpty(strM145512T)) {
            jSONObject.put("idNationalEmblemFileName", (Object) strM145512T);
        }
        String strM145497O = kcm.m145452H().m145497O();
        if (!TextUtils.isEmpty(strM145497O)) {
            jSONObject.put("bankCardFileName", (Object) strM145497O);
        }
        return jSONObject.toJSONString();
    }

    /* JADX INFO: renamed from: y2 */
    private void m17671y2() throws Throwable {
        ixq0.m138885b(f12117D, "startActivity  Thread:" + Thread.currentThread().getName());
        OSSConfig oSSConfigM145535d0 = kcm.m145452H().m145535d0();
        if (oSSConfigM145535d0 == null) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "finalStartVerify", NotificationCompat.CATEGORY_STATUS, "error", "errMsg", "ossConfig is null.");
            return;
        }
        ixq0.m138885b("ToygerPresenter", "开始上传 OSS资源");
        khi.m145962d().m145966f();
        kcm.m145452H().m145524Y0(d300.m109840d(oSSConfigM145535d0.FileNamePrefix, Sticker.LAYER_TYPE_FACE, "jpeg"));
        Bitmap bitmapM145462C = kcm.m145452H().m145462C();
        String strM145465D = kcm.m145452H().m145465D();
        if (bitmapM145462C != null && TextUtils.isEmpty(strM145465D)) {
            byte[] bArrM109838b = d300.m109838b(bitmapM145462C);
            jwb jwbVar = this.f12138s;
            if (jwbVar != null && jwbVar.m143655c() && bArrM109838b != null) {
                bArrM109838b = this.f12138s.m143653a(bArrM109838b);
            }
            String strM109840d = d300.m109840d(oSSConfigM145535d0.FileNamePrefix, "farFace", "jpeg");
            kcm.m145452H().m145533c1(strM109840d);
            khi.m145962d().m145963b(8, oSSConfigM145535d0.BucketName, strM109840d, bArrM109838b, oSSConfigM145535d0);
        }
        Bitmap bitmapM145479I = kcm.m145452H().m145479I();
        String strM145482J = kcm.m145452H().m145482J();
        if (bitmapM145479I != null && TextUtils.isEmpty(strM145482J)) {
            byte[] bArrM109838b2 = d300.m109838b(bitmapM145479I);
            jwb jwbVar2 = this.f12138s;
            if (jwbVar2 != null && jwbVar2.m143655c() && bArrM109838b2 != null) {
                bArrM109838b2 = this.f12138s.m143653a(bArrM109838b2);
            }
            String strM109840d2 = d300.m109840d(oSSConfigM145535d0.FileNamePrefix, "nearFace", "jpeg");
            khi.m145962d().m145963b(9, oSSConfigM145535d0.BucketName, strM109840d2, bArrM109838b2, oSSConfigM145535d0);
            kcm.m145452H().m145554j1(strM109840d2);
        }
        if (kcm.m145452H().m145471F() == 2) {
            kcm.m145452H().m145483J0(d300.m109840d(oSSConfigM145535d0.FileNamePrefix, "backupface", "jpeg"));
        }
        String strM145571p0 = kcm.m145452H().m145571p0();
        if (s4j0.m182232I().m182275L() && !TextUtils.isEmpty(strM145571p0)) {
            String str = d300.m109842f(strM145571p0) ? "zip" : "mp4";
            byte[] bArrM109839c = d300.m109839c(strM145571p0);
            jwb jwbVar3 = this.f12138s;
            if (jwbVar3 != null && jwbVar3.m143655c() && bArrM109839c != null) {
                bArrM109839c = this.f12138s.m143653a(bArrM109839c);
            }
            String strM109840d3 = d300.m109840d(oSSConfigM145535d0.FileNamePrefix, "verifyvideo", str);
            khi.m145962d().m145963b(6, oSSConfigM145535d0.BucketName, strM109840d3, bArrM109839c, oSSConfigM145535d0);
            kcm.m145452H().m145511S1(strM109840d3);
        }
        if (s4j0.m182232I().m182279R()) {
            String strM182274K = s4j0.m182232I().m182274K();
            byte[] bArrM109846j = d300.m109846j(s4j0.m182232I().m182274K());
            if (bArrM109846j == null) {
                s4j0.m182232I().m182293z0(false);
            } else {
                jwb jwbVar4 = this.f12138s;
                if (jwbVar4 != null && jwbVar4.m143655c()) {
                    bArrM109846j = this.f12138s.m143653a(bArrM109846j);
                }
                byte[] bArr = bArrM109846j;
                String strM109840d4 = d300.m109840d(oSSConfigM145535d0.FileNamePrefix, "photinusvideo", d300.m109842f(strM182274K) ? "zip" : "mp4");
                khi.m145962d().m145963b(7, oSSConfigM145535d0.BucketName, strM109840d4, bArr, oSSConfigM145535d0);
                kcm.m145452H().m145490L1(strM109840d4);
            }
        }
        m17673E1(oSSConfigM145535d0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "OSS_UPLOAD_START", "time", String.valueOf(jCurrentTimeMillis));
        khi.m145962d().m145968h(this, new C3566u(jCurrentTimeMillis));
    }

    /* JADX INFO: renamed from: A2 */
    public void m17672A2() {
        runOnUiThread(new RunnableC3559n());
    }

    /* JADX INFO: renamed from: E1 */
    public void m17673E1(OSSConfig oSSConfig) {
        br4 br4VarM182272H = s4j0.m182232I().m182272H();
        if (br4VarM182272H != null) {
            List<byte[]> listM103467l = br4VarM182272H.m103467l();
            for (int i = 0; i < listM103467l.size(); i++) {
                byte[] bArrM143653a = listM103467l.get(i);
                jwb jwbVar = this.f12138s;
                if (jwbVar != null && jwbVar.m143655c() && bArrM143653a != null) {
                    bArrM143653a = this.f12138s.m143653a(bArrM143653a);
                }
                khi.m145962d().m145963b(khi.m145962d().m145964c(), oSSConfig.BucketName, br4VarM182272H.m103468m().get(i), bArrM143653a, oSSConfig);
            }
        }
    }

    /* JADX INFO: renamed from: G1 */
    public EllipseHoleView m17674G1() {
        return (EllipseHoleView) findViewById(j4c0.f116164k);
    }

    /* JADX INFO: renamed from: I1 */
    public RoundProgressBar m17675I1() {
        return (RoundProgressBar) findViewById(j4c0.f116167n);
    }

    /* JADX INFO: renamed from: J1 */
    public String m17676J1(int i) {
        if (i != 2) {
            if (i != 5) {
                if (i == 101) {
                    return getString(R$string.f11982L);
                }
                if (i == 201) {
                    return getString(R$string.f12020j);
                }
                if (i != 300) {
                    if (i == 600) {
                        return getString(R$string.f11987N0);
                    }
                    if (i != 7) {
                        if (i == 8) {
                            return getString(R$string.f12018i);
                        }
                        if (i == 9) {
                            return getString(R$string.f12026m);
                        }
                        if (i == 103) {
                            return getString(R$string.f12032p);
                        }
                        if (i == 104) {
                            return getString(R$string.f12002a);
                        }
                        if (i == 500) {
                            return getString(R$string.f12036r);
                        }
                        if (i == 501) {
                            return getString(R$string.f11991P0);
                        }
                        switch (i) {
                            case 106:
                                break;
                            case 107:
                                break;
                            case 108:
                                return getString(R$string.f12030o);
                            case 109:
                            case 110:
                                return getString(R$string.f12034q);
                            case 111:
                                return getString(R$string.f12028n);
                            default:
                                return "";
                        }
                    }
                }
                return getString(R$string.f12034q);
            }
            return getString(R$string.f12022k);
        }
        return getString(R$string.f12024l);
    }

    /* JADX INFO: renamed from: K1 */
    public String m17677K1(int i) {
        if (i != 2) {
            if (i != 5) {
                if (i == 101) {
                    return getString(R$string.f11982L);
                }
                if (i == 110) {
                    return getString(R$string.f12034q);
                }
                if (i == 8) {
                    return getString(R$string.f12018i);
                }
                if (i == 9) {
                    return getString(R$string.f12026m);
                }
                if (i != 106) {
                    if (i != 107) {
                        return "";
                    }
                }
            }
            return getString(R$string.f12022k);
        }
        return getString(R$string.f12024l);
    }

    @Override // p149l.s4j0.InterfaceC19857g
    /* JADX INFO: renamed from: Q */
    public void mo17678Q() {
        runOnUiThread(new RunnableC3551f());
    }

    /* JADX INFO: renamed from: R1 */
    public void m17679R1(String str) {
        if (TextUtils.isEmpty(str)) {
            str = ncm.f138191a;
        }
        m17667v2();
        m17666u2();
        if (m17654m2(str, new C3567v(str))) {
            return;
        }
        m17650k2(str);
    }

    /* JADX INFO: renamed from: T1 */
    public void m17680T1() throws Throwable {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "faceScanCost", "timeCost", ((System.currentTimeMillis() - this.f12122c) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f44446s);
        m17671y2();
    }

    @Override // p149l.s4j0.InterfaceC19857g
    /* JADX INFO: renamed from: b0 */
    public void mo17681b0() {
    }

    /* JADX INFO: renamed from: c2 */
    public void m17682c2(Animator.AnimatorListener animatorListener) {
        runOnUiThread(new RunnableC3560o(animatorListener));
    }

    /* JADX INFO: renamed from: e2 */
    public void m17683e2() {
        if (m17675I1().getProgress() == 0) {
            return;
        }
        runOnUiThread(new RunnableC3553h());
    }

    /* JADX INFO: renamed from: g2 */
    public void m17684g2() {
        m17667v2();
        m17666u2();
    }

    /* JADX INFO: renamed from: o2 */
    public void m17685o2(int i, int i2, int i3, int i4, String str, InterfaceC3569x interfaceC3569x) {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "faceScan", "errCode", str, "errMsg" + this.f12124e);
        RecordService.recordAlertAppear(str);
        m17642d2();
        m17640b2(true);
        if (this.f12126g) {
            return;
        }
        Button button = this.f12131l;
        if (button != null) {
            button.setEnabled(false);
        }
        s4j0 s4j0VarM182232I = s4j0.m182232I();
        if (s4j0VarM182232I != null) {
            this.f12126g = true;
            s4j0VarM182232I.m182290w0(true);
        }
        IdentityAlertOverlay identityAlertOverlay = new IdentityAlertOverlay(this);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        identityAlertOverlay.setLayoutParams(layoutParams);
        addContentView(identityAlertOverlay, layoutParams);
        mxb.m156848a(identityAlertOverlay, mxb.m156866s(str));
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
        identityAlertOverlay.setCommAlertOverlayListener(new C3555j(str, s4j0VarM182232I, interfaceC3569x));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f12137r) {
            return;
        }
        RecordService.getInstance().recordEventBehavior(RecordLevel.LOG_INFO, "PAGER_BEHAVIOR", "exitVerifyBtn", "FACE");
        m17688v1();
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RecordService.getInstance().recordEventPage(RecordLevel.LOG_INFO, "FACE_ENTER", "FACE");
        setContentView(w5c0.f184668a);
        m18104J0(false, true, s1c0.f161878d);
        w7q0 w7q0VarM125161H = gbl0.m125161H(getWindow().getDecorView());
        if (w7q0VarM125161H != null) {
            w7q0VarM125161H.m202061b(true);
        }
        this.f12122c = System.currentTimeMillis();
        this.f12132m = (TextView) findViewById(j4c0.f116169p);
        this.f12145z = 0;
        this.f12138s = new jwb(d300.m109845i(this, "identity-key-public.key"), true);
        s4j0.m182232I().m182284q0(this.f12138s);
        d300.m109850n(this, 1.0f);
        this.f12134o = (LinearLayout) findViewById(j4c0.f116175v);
        View viewFindViewById = findViewById(j4c0.f116168o);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundColor(mxb.f136153c.getFaceBGColor(q1c0.f152124c));
        }
        TextView textView = (TextView) findViewById(j4c0.f116176w);
        this.f12133n = textView;
        if (textView != null) {
            textView.setTextColor(mxb.f136153c.getFaceTitleColor(q1c0.f152123b));
        }
        TextView textViewM17613H1 = m17613H1();
        if (textViewM17613H1 != null) {
            textViewM17613H1.setTextColor(mxb.f136153c.getFaceTipColor(q1c0.f152122a));
        }
        RoundProgressBar roundProgressBarM17675I1 = m17675I1();
        if (roundProgressBarM17675I1 != null) {
            roundProgressBarM17675I1.setGradientColor(mxb.f136153c.getFaceProgressEndColor(q1c0.f152126e));
            roundProgressBarM17675I1.setStartColor(mxb.f136153c.getFaceProgressStartColor(q1c0.f152125d));
        }
        Button button = (Button) findViewById(j4c0.f116156c);
        this.f12127h = button;
        if (button != null) {
            button.setOnClickListener(new ViewOnClickListenerC3548c());
        }
        this.f12128i = (ImageView) findViewById(j4c0.f116172s);
        Button button2 = (Button) findViewById(j4c0.f116155b);
        this.f12129j = button2;
        if (button2 != null) {
            button2.setOnClickListener(new ViewOnClickListenerC3549d());
        }
        this.f12130k = (ImageView) findViewById(j4c0.f116171r);
        String str = rcm.f158793h;
        if (str != null && !str.isEmpty() && roundProgressBarM17675I1 != null) {
            roundProgressBarM17675I1.setGradientColor(Color.parseColor(rcm.f158793h));
        }
        m17620O1();
        m17669w2();
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        iqb iqbVar = this.f12144y;
        if (iqbVar != null) {
            iqbVar.m137730a();
        }
        s4j0.m182232I().m182290w0(false);
        s4j0.m182232I().m182280W();
        khi.m145962d().m145967g();
        rcm.f158797l = 30;
        this.f12119A.removeCallbacks(this.f12120B);
        CameraSurfaceView cameraSurfaceView = this.f12123d;
        if (cameraSurfaceView != null) {
            cameraSurfaceView.setVisibility(4);
            this.f12123d.m18123c();
        }
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "destroyToygerActivity", "timeCost", ((System.currentTimeMillis() - this.f12122c) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f44446s);
        this.f12137r = false;
        this.f12124e = 0;
        RecordService.getInstance().flush();
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, android.app.Activity
    public void onPause() {
        snl cameraInterface;
        super.onPause();
        Objects.toString(s4j0.m182232I().m182276M());
        WorkState workStateM182276M = s4j0.m182232I().m182276M();
        if (this.f12145z == 2 || WorkState.RET == workStateM182276M || WorkState.FACE_COMPLETED == workStateM182276M || WorkState.PHOTINUS == workStateM182276M) {
            return;
        }
        CameraSurfaceView cameraSurfaceView = this.f12123d;
        if (cameraSurfaceView != null && (cameraInterface = cameraSurfaceView.getCameraInterface()) != null && cameraInterface.mo107855b() != null) {
            try {
                cameraInterface.mo107855b().stopPreview();
            } catch (Throwable th) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "cameraException", "errMsg", Log.getStackTraceString(th));
            }
        }
        iqb iqbVar = this.f12144y;
        if (iqbVar != null) {
            iqbVar.m137730a();
        }
        if (m17689z1()) {
            m17654m2("CODE_VERIFY_INTERRUPT", new C3550e());
        }
        this.f12145z = 1;
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f12145z == 2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "pressBackClose ");
            m17650k2("CODE_VERIFY_INTERRUPT");
        }
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f12145z = 2;
    }

    /* JADX INFO: renamed from: q2 */
    public void m17686q2(Animator.AnimatorListener animatorListener) {
        runOnUiThread(new RunnableC3558m(animatorListener));
    }

    /* JADX INFO: renamed from: r2 */
    public void m17687r2() {
        LinearLayout linearLayout = (LinearLayout) findViewById(j4c0.f116174u);
        TextView textView = (TextView) findViewById(j4c0.f116169p);
        this.f12132m = textView;
        if (textView != null) {
            textView.setTextColor(mxb.f136153c.getVerifyLoadingColor(s1c0.f161879e));
            this.f12132m.setText(R$string.f11989O0);
        }
        if (linearLayout == null || linearLayout.getVisibility() == 0) {
            return;
        }
        linearLayout.setVisibility(0);
    }

    /* JADX INFO: renamed from: v1 */
    public void m17688v1() {
        m17685o2(R$string.f11968E, R$string.f12046w, R$string.f12040t, R$string.f12038s, ncm.f138196f, new C3552g());
    }

    /* JADX INFO: renamed from: z1 */
    public boolean m17689z1() {
        if (WorkState.FACE_COMPLETED == s4j0.m182232I().m182276M()) {
            return false;
        }
        int i = rcm.f158795j;
        ixq0.m138885b(f12117D, " face checkRetryCount: " + this.f12124e + " retryTime:" + i);
        if (this.f12124e <= i) {
            return true;
        }
        m17690z2();
        return false;
    }

    /* JADX INFO: renamed from: z2 */
    public void m17690z2() {
        m17667v2();
        m17666u2();
        m17685o2(R$string.f11980K, R$string.f11964C, R$string.f12044v, -1, ncm.f138202l, new C3563r());
    }
}
