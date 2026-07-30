package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.idv.identity.base.algorithm.IDFrame;
import com.idv.identity.base.algorithm.IdentityAlgConfig;
import com.idv.identity.base.algorithm.IdentityFaceAttr;
import com.idv.identity.face.WorkState;
import com.idv.identity.face.p036ui.ToygerActivity;
import com.idv.identity.face.p036ui.widget.EllipseHoleView;
import com.idv.identity.face.photinus.C3545b;
import com.idv.identity.face.photinus.PhotinusEmulator;
import com.idv.identity.face.photinus.VideoFormatConfig;
import com.idv.identity.platform.config.IdentityFarNearConfig;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.feed.data.Frame;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: classes7.dex */
public class s4j0 implements onl, qcm {

    /* JADX INFO: renamed from: L */
    private static final String f162399L = "s4j0";

    /* JADX INFO: renamed from: M */
    private static volatile s4j0 f162400M;

    /* JADX INFO: renamed from: A */
    private boolean f162401A;

    /* JADX INFO: renamed from: B */
    private boolean f162402B;

    /* JADX INFO: renamed from: C */
    private InterfaceC19857g f162403C;

    /* JADX INFO: renamed from: D */
    private CopyOnWriteArrayList<q84> f162404D;

    /* JADX INFO: renamed from: E */
    private CopyOnWriteArrayList<q84> f162405E;

    /* JADX INFO: renamed from: F */
    private boolean f162406F;

    /* JADX INFO: renamed from: G */
    private int f162407G;

    /* JADX INFO: renamed from: H */
    private final int f162408H;

    /* JADX INFO: renamed from: I */
    private int f162409I;

    /* JADX INFO: renamed from: J */
    private boolean f162410J;

    /* JADX INFO: renamed from: K */
    private boolean f162411K;

    /* JADX INFO: renamed from: a */
    private jwb f162412a;

    /* JADX INFO: renamed from: b */
    private Context f162413b;

    /* JADX INFO: renamed from: c */
    private snl f162414c;

    /* JADX INFO: renamed from: d */
    private vm2 f162415d;

    /* JADX INFO: renamed from: e */
    private Bitmap f162416e;

    /* JADX INFO: renamed from: f */
    private Bitmap f162417f;

    /* JADX INFO: renamed from: g */
    private Bitmap f162418g;

    /* JADX INFO: renamed from: h */
    private Bitmap f162419h;

    /* JADX INFO: renamed from: i */
    private Bitmap f162420i;

    /* JADX INFO: renamed from: j */
    private Bitmap f162421j;

    /* JADX INFO: renamed from: k */
    private Bitmap f162422k;

    /* JADX INFO: renamed from: l */
    private Handler f162423l;

    /* JADX INFO: renamed from: m */
    private WorkState f162424m;

    /* JADX INFO: renamed from: n */
    private WorkState f162425n;

    /* JADX INFO: renamed from: o */
    private AtomicBoolean f162426o;

    /* JADX INFO: renamed from: p */
    private final AtomicBoolean f162427p;

    /* JADX INFO: renamed from: q */
    private boolean f162428q;

    /* JADX INFO: renamed from: r */
    private boolean f162429r;

    /* JADX INFO: renamed from: s */
    private boolean f162430s;

    /* JADX INFO: renamed from: t */
    private String f162431t;

    /* JADX INFO: renamed from: u */
    private boolean f162432u;

    /* JADX INFO: renamed from: v */
    private String f162433v;

    /* JADX INFO: renamed from: w */
    private PhotinusEmulator f162434w;

    /* JADX INFO: renamed from: x */
    private int f162435x;

    /* JADX INFO: renamed from: y */
    private Long f162436y;

    /* JADX INFO: renamed from: z */
    private br4 f162437z;

    /* JADX INFO: renamed from: l.s4j0$a */
    public class C19851a extends AnimatorListenerAdapter {
        public C19851a() {
        }
    }

    /* JADX INFO: renamed from: l.s4j0$b */
    public class C19852b extends AnimatorListenerAdapter {
        public C19852b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            try {
                if (s4j0.this.f162415d != null) {
                    s4j0.this.f162415d.setFarNeatAction(true);
                }
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                aag0.m95543a(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.s4j0$c */
    public class RunnableC19853c implements Runnable {
        public RunnableC19853c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (s4j0.this.f162434w != null) {
                s4j0.this.f162434w.m17560w();
            }
        }
    }

    /* JADX INFO: renamed from: l.s4j0$d */
    public class RunnableC19854d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ EllipseHoleView f162441a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ToygerActivity f162442b;

        public RunnableC19854d(EllipseHoleView ellipseHoleView, ToygerActivity toygerActivity) {
            this.f162441a = ellipseHoleView;
            this.f162442b = toygerActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (this.f162441a.m17719r()) {
            }
            this.f162442b.m17672A2();
        }
    }

    /* JADX INFO: renamed from: l.s4j0$e */
    public class RunnableC19855e implements Runnable {

        /* JADX INFO: renamed from: l.s4j0$e$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ixq0.m138885b(s4j0.f162399L, "onToygerComplete:生成认证视频");
                s4j0 s4j0Var = s4j0.this;
                s4j0Var.m182235T(s4j0Var.f162413b, r4j0.f157702a, s4j0.this.f162405E);
            }
        }

        public RunnableC19855e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            new Thread(new a()).start();
        }
    }

    /* JADX INFO: renamed from: l.s4j0$f */
    public class RunnableC19856f implements Runnable {
        public RunnableC19856f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (s4j0.this.f162405E == null) {
                s4j0.this.f162405E = new CopyOnWriteArrayList();
            }
            s4j0.this.f162405E.addAll(s4j0.this.f162404D);
            while (s4j0.this.f162405E.size() > 30) {
                s4j0.this.f162405E.remove(0);
            }
        }
    }

    /* JADX INFO: renamed from: l.s4j0$g */
    public interface InterfaceC19857g {
        /* JADX INFO: renamed from: Q */
        void mo17678Q();

        /* JADX INFO: renamed from: b0 */
        void mo17681b0();
    }

    /* JADX INFO: renamed from: l.s4j0$h */
    public static final class C19858h implements su60 {

        /* JADX INFO: renamed from: a */
        s4j0 f162447a;

        /* JADX INFO: renamed from: b */
        private boolean f162448b = false;

        public C19858h(s4j0 s4j0Var) {
            this.f162447a = s4j0Var;
        }

        @Override // p149l.su60
        /* JADX INFO: renamed from: a */
        public void mo182294a(Uri uri, Uri uri2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "photinusFileReady", "elapsedTime", Long.toString(System.currentTimeMillis() - this.f162447a.f162436y.longValue()));
            if (uri != null) {
                this.f162447a.m182292y0(uri.getPath());
                ixq0.m138885b(s4j0.f162399L + "_PhotinusCallback", "ThreadName:" + Thread.currentThread() + " onFilesReady：炫彩视频生成结束 video:" + uri.getPath());
            }
            this.f162447a.f162428q = false;
            this.f162447a.m182281X();
        }

        @Override // p149l.su60
        /* JADX INFO: renamed from: b */
        public void mo182295b(String str) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "photinusEncoderError", Reason.TYPE, str);
        }

        @Override // p149l.su60
        /* JADX INFO: renamed from: c */
        public void mo182296c(int i) {
            ixq0.m138885b(s4j0.f162399L + "_PhotinusCallback", "onDisplayRGB: " + i);
            this.f162447a.m182238Y(i);
        }

        @Override // p149l.su60
        /* JADX INFO: renamed from: d */
        public void mo182297d(String str) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "photinusTakePicture", Reason.TYPE, str);
            ixq0.m138885b(s4j0.f162399L + "_PhotinusCallback", "onTakePhotoErrorReport: " + str);
        }

        @Override // p149l.su60
        /* JADX INFO: renamed from: e */
        public void mo182298e() {
            ixq0.m138885b(s4j0.f162399L + "_PhotinusCallback", "onHasEnoughFrames: ThreadName" + Thread.currentThread().getName());
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "END_PHOTINUS", "time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.ENGLISH).format(new Date()), "currentPage", "FACE", "productCode", kcm.m145452H().f122405C0, "cost", Long.toString(System.currentTimeMillis() - this.f162447a.f162436y.longValue()));
            s4j0 s4j0Var = this.f162447a;
            if (s4j0Var != null && s4j0Var.f162415d != null) {
                this.f162447a.f162415d.finishPhotinus();
            }
            if (this.f162448b) {
                this.f162447a.m182271G0();
            }
        }

        @Override // p149l.su60
        /* JADX INFO: renamed from: f */
        public void mo182299f() {
            if (this.f162447a.f162414c != null) {
                this.f162447a.f162414c.mo107865l();
            }
        }

        @Override // p149l.su60
        public void onException(Throwable th) {
            RecordService.getInstance().recordException(th);
            ixq0.m138885b(s4j0.f162399L + "_PhotinusCallback", "onException: " + th.getMessage());
            this.f162448b = true;
        }
    }

    /* JADX INFO: renamed from: l.s4j0$i */
    public static final class C19859i implements yg50 {

        /* JADX INFO: renamed from: a */
        s4j0 f162449a;

        public C19859i(s4j0 s4j0Var) {
            this.f162449a = s4j0Var;
        }

        @Override // p149l.yg50
        /* JADX INFO: renamed from: a */
        public void mo182300a(Uri uri) {
            ixq0.m138885b(s4j0.f162399L, uri.getPath() + "  " + Thread.currentThread().getName());
            String path = uri.getPath();
            if (TextUtils.isEmpty(path)) {
                s4j0.m182232I().m182265B0(null);
                mo182301b(path);
                return;
            }
            s4j0.m182232I().m182265B0(path);
            m182302c();
            ixq0.m138885b(s4j0.f162399L, "onVideoWriteSuccess: 认证视频生成成功  " + Thread.currentThread().getName());
            this.f162449a.m182248m0(902);
        }

        @Override // p149l.yg50
        /* JADX INFO: renamed from: b */
        public void mo182301b(String str) {
            ixq0.m138885b(s4j0.f162399L, "onVideoWriteError: 认证视频生成失败" + str + "  " + Thread.currentThread().getName());
            RecordService recordService = RecordService.getInstance();
            RecordLevel recordLevel = RecordLevel.LOG_ERROR;
            if (TextUtils.isEmpty(str)) {
                str = "NULL";
            }
            recordService.recordEvent(recordLevel, "onVideoWriteError", "msg", str);
            s4j0.m182232I().m182265B0(null);
            if (this.f162449a.f162414c != null) {
                this.f162449a.m182231H0(this.f162449a.f162414c.mo107861h(), this.f162449a.f162414c.mo107862i(), this.f162449a.m182227C());
            } else {
                s4j0.m182232I().m182265B0(null);
            }
            m182302c();
            this.f162449a.m182248m0(902);
        }

        /* JADX INFO: renamed from: c */
        public void m182302c() {
            if (this.f162449a.f162405E != null) {
                this.f162449a.f162405E.clear();
            }
            if (this.f162449a.f162404D != null) {
                this.f162449a.f162404D.clear();
            }
        }
    }

    private s4j0() {
        WorkState workState = WorkState.INIT;
        this.f162424m = workState;
        this.f162425n = workState;
        this.f162426o = new AtomicBoolean(false);
        this.f162427p = new AtomicBoolean(true);
        this.f162428q = false;
        this.f162429r = true;
        this.f162430s = false;
        this.f162432u = false;
        this.f162401A = false;
        this.f162402B = false;
        this.f162406F = false;
        this.f162408H = 30;
        this.f162409I = 5;
        this.f162410J = false;
        this.f162411K = false;
    }

    /* JADX INFO: renamed from: B */
    private int m182226B() {
        snl snlVar = this.f162414c;
        if (snlVar == null) {
            return 0;
        }
        int iMo107868o = snlVar.mo107868o();
        return !m182234P() ? (360 - iMo107868o) % 360 : iMo107868o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public int m182227C() {
        snl snlVar = this.f162414c;
        if (snlVar == null) {
            return 0;
        }
        int iMo107868o = snlVar.mo107868o();
        return !m182234P() ? (360 - iMo107868o) % 360 : iMo107868o;
    }

    /* JADX INFO: renamed from: E */
    private void m182228E(List<q84> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        list.clear();
    }

    /* JADX INFO: renamed from: F */
    private void m182229F() {
        this.f162416e = null;
        this.f162424m = WorkState.INIT;
        this.f162426o = new AtomicBoolean(false);
        this.f162432u = true;
        this.f162428q = false;
        this.f162429r = true;
        try {
            PhotinusEmulator photinusEmulator = this.f162434w;
            if (photinusEmulator != null) {
                photinusEmulator.m17557p();
                this.f162434w = null;
            }
        } catch (Throwable th) {
            RecordService.getInstance().recordException(th);
        }
        this.f162406F = false;
        this.f162407G = 0;
        m182269E0();
    }

    /* JADX INFO: renamed from: G */
    private byte[] m182230G(q84 q84Var) {
        ByteBuffer byteBufferM173332a = q84Var.m173332a();
        byte[] bArr = null;
        try {
            try {
                byte[] bArrArray = byteBufferM173332a.array();
                bArr = new byte[bArrArray.length];
                System.arraycopy(bArrArray, 0, bArr, 0, bArrArray.length);
                return bArr;
            } catch (ReadOnlyBufferException e) {
                RecordService.getInstance().recordException(e);
                if (bArr != null) {
                    return bArr;
                }
                byte[] bArr2 = new byte[byteBufferM173332a.remaining()];
                byteBufferM173332a.get(bArr2);
                return bArr2;
            } catch (UnsupportedOperationException e2) {
                RecordService.getInstance().recordException(e2);
                if (bArr != null) {
                    return bArr;
                }
                byte[] bArr3 = new byte[byteBufferM173332a.remaining()];
                byteBufferM173332a.get(bArr3);
                return bArr3;
            }
        } catch (Throwable th) {
            if (bArr == null) {
                byteBufferM173332a.get(new byte[byteBufferM173332a.remaining()]);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public void m182231H0(int i, int i2, int i3) {
        try {
            String str = this.f162413b.getFilesDir().getAbsolutePath() + "/toyger_verify_video.zip";
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            wgq0.m203079c(dc4.m110670e(this.f162405E), file, i, i2, i3);
            ixq0.m138885b(f162399L, "zipVideoFrames:".concat(str));
            m182232I().m182265B0(str);
        } catch (Exception unused) {
            m182232I().m182265B0(null);
            m182232I().m182292y0(null);
        }
    }

    /* JADX INFO: renamed from: I */
    public static s4j0 m182232I() {
        if (f162400M == null) {
            synchronized (s4j0.class) {
                try {
                    if (f162400M == null) {
                        f162400M = new s4j0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f162400M;
    }

    /* JADX INFO: renamed from: O */
    private void m182233O() {
        if (this.f162415d == null) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "ConfigIdentityService", Constants.KEY_CONFIG, "IdentityFaceService is null");
            return;
        }
        RecordService.getInstance().recordEvent(RecordLevel.LOG_DEBUG, "ConfigIdentityService", Constants.KEY_CONFIG, "IdentityFaceService ");
        try {
            IdentityFarNearConfig identityFarNearConfigM145468E = kcm.m145452H().m145468E();
            String strM145543g = kcm.m145452H().m145543g();
            IdentityAlgConfig identityAlgConfig = new IdentityAlgConfig();
            if (strM145543g != null && "Y".equals(strM145543g)) {
                identityAlgConfig.isOpenQualityCheck = true;
            }
            identityAlgConfig.livenessCombinations = m182273J();
            identityAlgConfig.detectImageFormat = 4;
            identityAlgConfig.isOpenDegrade = this.f162401A;
            if (identityFarNearConfigM145468E != null) {
                identityAlgConfig.maxFarThreshold = identityFarNearConfigM145468E.maxFarThreshold;
                identityAlgConfig.minFarThreshold = identityFarNearConfigM145468E.minFarThreshold;
                identityAlgConfig.maxNearThreshold = identityFarNearConfigM145468E.maxNearThreshold;
                identityAlgConfig.minNearThreshold = identityFarNearConfigM145468E.minNearThreshold;
            }
            if (this.f162415d.init(this.f162413b, identityAlgConfig, this)) {
                return;
            }
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "IdentityFaceService", NotificationCompat.CATEGORY_STATUS, "error");
        } catch (Exception e) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "ToygerFaceService", "init error" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: P */
    private boolean m182234P() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public void m182235T(Context context, String str, CopyOnWriteArrayList<q84> copyOnWriteArrayList) {
        int iM182227C;
        int iMo107866m;
        int iMo107863j;
        if (this.f162423l == null) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "TOYGER_UI_MSG_ERROR_CODE", "onCompleteMakeVideo", "uiHandler is null");
            return;
        }
        if (!m182232I().m182275L()) {
            m182248m0(902);
            return;
        }
        try {
            if (copyOnWriteArrayList.size() > 0) {
                ixq0.m138885b(f162399L, "onCompleteMakeVideo:" + copyOnWriteArrayList.size());
                iM182227C = copyOnWriteArrayList.get(0).m173338g();
                iMo107866m = copyOnWriteArrayList.get(0).m173337f();
                iMo107863j = copyOnWriteArrayList.get(0).m173336e();
            } else {
                ixq0.m138885b(f162399L, "onCompleteMakeVideo: is null");
                iM182227C = m182227C();
                iMo107866m = this.f162414c.mo107866m();
                iMo107863j = this.f162414c.mo107863j();
            }
            int i = iMo107863j;
            int i2 = iM182227C;
            int i3 = iMo107866m;
            ixq0.m138885b(f162399L, "onCompleteMakeVideo: encode" + Thread.currentThread().getName() + " _width" + i3 + " _height" + i);
            C3545b.m17604b(context, dc4.m110670e(copyOnWriteArrayList), i2, i3, i, str, VideoFormatConfig.L, new C19859i(this));
        } catch (Throwable unused) {
            m182248m0(902);
        }
    }

    /* JADX INFO: renamed from: U */
    private void m182236U(int i) {
        if (i == 0) {
            m182232I().m182268D0();
        } else if (i == 1) {
            Context context = this.f162413b;
            if (context instanceof ToygerActivity) {
                ToygerActivity toygerActivity = (ToygerActivity) context;
                EllipseHoleView ellipseHoleViewM17674G1 = toygerActivity.m17674G1();
                if (ellipseHoleViewM17674G1.m17719r()) {
                    new Thread(new RunnableC19854d(ellipseHoleViewM17674G1, toygerActivity)).start();
                } else {
                    toygerActivity.m17672A2();
                }
            }
        } else if (i == 3) {
            ixq0.m138885b("ACTION NAME", "ACTION NAME :end moving near");
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "MOVE_NEAR_LIVENESS", "time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.ENGLISH).format(new Date()), "currentPage", "FACE", "productCode", kcm.m145452H().f122405C0);
            RecordService.getInstance().flush();
        } else if (i == 6) {
            ixq0.m138885b("ACTION NAME", "ACTION NAME :end moving far");
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "MOVE_FAR_LIVENESS", "time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.ENGLISH).format(new Date()), "currentPage", "FACE", "productCode", kcm.m145452H().f122405C0);
            RecordService.getInstance().flush();
        } else if (i != 300) {
            if (i != 201) {
                if (i == 202) {
                    if (!this.f162410J) {
                        ixq0.m138885b("ACTION NAME", "ACTION NAME :blink end");
                        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "END_BLINK_LIVENESS", "time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.ENGLISH).format(new Date()), "currentPage", "FACE", "productCode", kcm.m145452H().f122405C0);
                        RecordService.getInstance().flush();
                    }
                    this.f162409I = 5;
                    this.f162410J = true;
                }
            } else if (!this.f162411K) {
                this.f162411K = true;
                ixq0.m138885b("ACTION NAME", "ACTION NAME :blink start");
                RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "START_BLINK_LIVENESS", "time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.ENGLISH).format(new Date()), "currentPage", "FACE", "productCode", kcm.m145452H().f122405C0);
                RecordService.getInstance().flush();
            }
        } else if (!this.f162428q) {
            this.f162425n = this.f162424m;
            this.f162424m = WorkState.PHOTINUS;
            this.f162428q = true;
        }
        if (this.f162423l != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 912;
            messageObtain.arg1 = i;
            this.f162423l.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: renamed from: V */
    private void m182237V(int i, IdentityFaceAttr identityFaceAttr) {
        if (i == 101) {
            this.f162427p.compareAndSet(true, false);
            m182282g0();
        } else if (i == 102) {
            this.f162427p.compareAndSet(false, true);
        } else if (i == 103 || i == 104) {
            m182282g0();
        }
        if (this.f162423l != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 911;
            messageObtain.arg1 = i;
            this.f162423l.sendMessage(messageObtain);
            this.f162407G = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public void m182238Y(int i) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 915;
        messageObtain.arg1 = i;
        m182246l0(messageObtain);
    }

    /* JADX INFO: renamed from: Z */
    private boolean m182239Z(int i, int i2) {
        m182248m0(916);
        if (!this.f162434w.m17558r(this.f162413b, i, i2, m182232I().m182227C(), 0, 4, 2, false)) {
            return false;
        }
        this.f162435x = this.f162414c.mo107868o();
        this.f162436y = Long.valueOf(System.currentTimeMillis());
        this.f162434w.m17559v(new C19858h(m182232I()));
        this.f162434w.m17553j();
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "START_PHOTINUS", "time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.ENGLISH).format(new Date()), "currentPage", "FACE", "productCode", kcm.m145452H().f122405C0);
        return true;
    }

    /* JADX INFO: renamed from: b0 */
    private void m182240b0(q84 q84Var) {
        if (this.f162429r) {
            m182239Z(q84Var.m173335d(), q84Var.m173334c());
            this.f162429r = false;
        }
        tu60 tu60Var = new tu60(m182230G(q84Var));
        tu60Var.f120845b = this.f162435x;
        this.f162434w.m17552i(tu60Var);
    }

    /* JADX INFO: renamed from: c0 */
    private void m182241c0() {
        m182250n0(new RunnableC19853c());
    }

    /* JADX INFO: renamed from: e0 */
    private void m182242e0(int i) {
        ixq0.m138885b(f162399L, "recordFaceOutFrames: messageCode" + i + " outVideoDataFrames:" + this.f162405E);
        if (this.f162423l == null || !this.f162430s || this.f162405E == null || i != 902) {
            return;
        }
        m182291x0();
    }

    /* JADX INFO: renamed from: i0 */
    private void m182243i0() {
        this.f162409I = 0;
        this.f162410J = false;
        this.f162411K = false;
        m182228E(this.f162405E);
    }

    /* JADX INFO: renamed from: j0 */
    private void m182244j0(q84 q84Var) {
        CopyOnWriteArrayList<q84> copyOnWriteArrayList = this.f162405E;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            String str = f162399L;
            ixq0.m138885b(str, "saveVideoFrame blinkPassed:" + this.f162410J + "  frameCountAfterAction:" + this.f162409I);
            if (this.f162410J) {
                int i = this.f162409I - 1;
                this.f162409I = i;
                if (i < 0) {
                    m182291x0();
                    return;
                }
            }
            if (this.f162404D == null) {
                this.f162404D = new CopyOnWriteArrayList<>();
            }
            if (this.f162404D.size() > 30) {
                this.f162404D.remove(0);
            }
            this.f162404D.add(q84Var);
            ixq0.m138885b(str, "saveVideoFrame videoDataFrames:" + this.f162404D.size());
        }
    }

    /* JADX INFO: renamed from: k0 */
    private void m182245k0(String str) {
        if (this.f162423l != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = IMediaPlayer.MEDIA_INFO_ML_DROP_START;
            messageObtain.obj = str;
            this.f162423l.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: renamed from: l0 */
    private void m182246l0(Message message) {
        Handler handler = this.f162423l;
        if (handler != null) {
            handler.sendMessage(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public synchronized void m182248m0(int i) {
        Handler handler = this.f162423l;
        if (handler != null) {
            handler.sendEmptyMessage(i);
        }
    }

    /* JADX INFO: renamed from: n0 */
    private synchronized void m182250n0(Runnable runnable) {
        Handler handler = this.f162423l;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    /* JADX INFO: renamed from: p0 */
    private void m182253p0(Bitmap bitmap) {
        ksf0.m147071e(ksf0.C18071a.f124466d, null);
        this.f162422k = bitmap;
    }

    /* JADX INFO: renamed from: A0 */
    public synchronized void m182264A0(boolean z) {
        try {
            this.f162430s = z;
            if (z) {
                CopyOnWriteArrayList<q84> copyOnWriteArrayList = this.f162404D;
                if (copyOnWriteArrayList == null) {
                    this.f162404D = new CopyOnWriteArrayList<>();
                } else {
                    m182228E(copyOnWriteArrayList);
                }
                CopyOnWriteArrayList<q84> copyOnWriteArrayList2 = this.f162405E;
                if (copyOnWriteArrayList2 == null) {
                    this.f162405E = new CopyOnWriteArrayList<>();
                } else {
                    m182228E(copyOnWriteArrayList2);
                }
                m182243i0();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m182265B0(String str) {
        this.f162431t = str;
        kcm.m145452H().m145514T1(str);
    }

    /* JADX INFO: renamed from: C0 */
    public WorkState m182266C0(WorkState workState) {
        WorkState workState2 = this.f162424m;
        this.f162424m = workState;
        return workState2;
    }

    /* JADX INFO: renamed from: D */
    public void m182267D() {
        CopyOnWriteArrayList<q84> copyOnWriteArrayList = this.f162405E;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        this.f162405E.clear();
    }

    /* JADX INFO: renamed from: D0 */
    public void m182268D0() {
        if (m182278Q()) {
            return;
        }
        Context context = this.f162413b;
        if (context instanceof ToygerActivity) {
            m182285r0(true);
            ((ToygerActivity) context).m17686q2(new C19852b());
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m182269E0() {
        m182270F0(false);
    }

    /* JADX INFO: renamed from: F0 */
    public void m182270F0(boolean z) {
        if (m182278Q()) {
            vm2 vm2Var = this.f162415d;
            if (vm2Var != null) {
                vm2Var.setFarNeatAction(false);
            }
            m182285r0(false);
            if (z) {
                Context context = this.f162413b;
                if (context instanceof ToygerActivity) {
                    ((ToygerActivity) context).m17682c2(new C19851a());
                }
            }
        }
    }

    /* JADX INFO: renamed from: G0 */
    public String m182271G0() {
        if (this.f162434w == null) {
            return "";
        }
        String str = this.f162413b.getFilesDir().getAbsolutePath() + "/toyger_photinus_video.zip";
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        String strM17561z = this.f162434w.m17561z(str, this.f162414c.mo107861h(), this.f162414c.mo107862i(), m182227C());
        if (!TextUtils.isEmpty(strM17561z)) {
            this.f162433v = strM17561z;
        }
        return strM17561z;
    }

    /* JADX INFO: renamed from: H */
    public br4 m182272H() {
        return this.f162437z;
    }

    /* JADX INFO: renamed from: J */
    public String m182273J() {
        StringBuilder sb = new StringBuilder();
        if (kcm.m145452H().m145463C0()) {
            sb.append("");
        }
        if (kcm.m145452H().m145597y0()) {
            sb.append(IdentityAlgConfig.FACE_BLINK_LIVENESS);
        }
        if (kcm.m145452H().m145457A0()) {
            sb.append(IdentityAlgConfig.FACE_PHOTINUS_LIVENESS);
        }
        if (kcm.m145452H().m145600z0()) {
            sb.append("faceBlinkLiveness#PhotinusLiveness");
        }
        if (kcm.m145452H().m145588v0()) {
            sb.append("faceBlinkLiveness#faceFarNearLiveness#PhotinusLiveness");
        }
        if (kcm.m145452H().m145591w0()) {
            sb.append("faceFarNearLiveness#PhotinusLiveness");
        }
        if (kcm.m145452H().m145594x0()) {
            sb.append("faceBlinkLiveness#shakeHeadLiveness#OpenMouthLiveness#faceFarNearLiveness#PhotinusLiveness");
        }
        if (kcm.m145452H().m145460B0()) {
            sb.append("shakeHeadLiveness#faceFarNearLiveness");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: K */
    public String m182274K() {
        return this.f162433v;
    }

    /* JADX INFO: renamed from: L */
    public boolean m182275L() {
        return this.f162430s;
    }

    /* JADX INFO: renamed from: M */
    public WorkState m182276M() {
        return this.f162424m;
    }

    /* JADX INFO: renamed from: N */
    public boolean m182277N(Context context, Handler handler, snl snlVar, InterfaceC19857g interfaceC19857g) {
        m182229F();
        this.f162413b = context;
        this.f162423l = handler;
        this.f162414c = snlVar;
        this.f162403C = interfaceC19857g;
        this.f162415d = (vm2) ycm.m214160a("com.idv.identity.service.IdentityFaceService", vm2.class);
        boolean zM145585u0 = kcm.m145452H().m145585u0();
        this.f162432u = zM145585u0;
        if (zM145585u0) {
            try {
                this.f162434w = new PhotinusEmulator();
            } catch (Throwable th) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "ClientConfigError", NotificationCompat.CATEGORY_STATUS, Log.getStackTraceString(th));
                return false;
            }
        }
        if (kcm.m145452H().m145576r0()) {
            this.f162437z = new br4();
        }
        this.f162401A = kcm.m145452H().m145573q();
        m182264A0(TextUtils.equals("Y", kcm.m145452H().m145590w()));
        this.f162424m = WorkState.FACE_CAPTURING;
        m182233O();
        return true;
    }

    /* JADX INFO: renamed from: Q */
    public boolean m182278Q() {
        return this.f162402B;
    }

    /* JADX INFO: renamed from: R */
    public boolean m182279R() {
        return this.f162432u;
    }

    @Override // p149l.onl
    /* JADX INFO: renamed from: S */
    public void mo17875S(int i, Throwable th) {
        String str;
        switch (i) {
            case 100:
                str = ncm.f138197g;
                break;
            case 101:
                if (th != null) {
                    RecordService.getInstance().recordException(th);
                }
                str = ncm.f138199i;
                break;
            case 102:
                str = ncm.f138200j;
                break;
            default:
                str = "unknown Camera Code =>" + i;
                break;
        }
        m182245k0(str);
    }

    /* JADX INFO: renamed from: W */
    public void m182280W() {
        if (this.f162414c != null) {
            this.f162414c = null;
        }
        if (this.f162413b != null) {
            this.f162413b = null;
        }
        if (this.f162423l != null) {
            this.f162423l = null;
        }
        vm2 vm2Var = this.f162415d;
        if (vm2Var != null) {
            vm2Var.release();
        }
        br4 br4Var = this.f162437z;
        if (br4Var != null) {
            br4Var.m103470r();
            this.f162437z = null;
        }
        try {
            PhotinusEmulator photinusEmulator = this.f162434w;
            if (photinusEmulator != null) {
                photinusEmulator.m17557p();
                this.f162434w = null;
            }
        } catch (Throwable th) {
            RecordService.getInstance().recordException(th);
        }
        f162400M = null;
        m182285r0(false);
    }

    /* JADX INFO: renamed from: X */
    public void m182281X() {
        if (this.f162423l != null) {
            m182242e0(902);
            m182250n0(new RunnableC19855e());
        }
        this.f162424m = WorkState.FACE_COMPLETED;
    }

    @Override // p149l.qcm
    /* JADX INFO: renamed from: a */
    public void mo173880a(Bitmap bitmap) {
        if (bitmap != null) {
            m182253p0(bitmap);
        }
    }

    @Override // p149l.onl
    /* JADX INFO: renamed from: a0 */
    public void mo17884a0() {
        br4 br4Var;
        Camera cameraMo107855b = this.f162414c.mo107855b();
        if (cameraMo107855b == null || (br4Var = this.f162437z) == null) {
            return;
        }
        br4Var.m103471s(cameraMo107855b);
    }

    @Override // p149l.qcm
    /* JADX INFO: renamed from: b */
    public void mo173881b(Bitmap bitmap) {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "onHighQualityFrame", Frame.TYPE, bitmap.toString());
        m182289v0(bitmap);
    }

    @Override // p149l.qcm
    /* JADX INFO: renamed from: c */
    public void mo173882c(Bitmap bitmap) {
        if (bitmap != null) {
            m182286s0(bitmap);
        }
    }

    @Override // p149l.qcm
    /* JADX INFO: renamed from: d */
    public void mo173883d(Bitmap bitmap) {
        if (bitmap != null) {
            m182288u0(bitmap);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p149l.qcm
    /* JADX INFO: renamed from: e */
    public boolean mo173884e(String str, Map<String, Object> map) {
        str.getClass();
        String str2 = "INIT_LOAD_MODEL_ERROR";
        switch (str) {
            case "INIT_LOAD_SO_ERROR":
                ixq0.m138885b(f162399L, "onEvent >>>> : [eventCode]:" + str + "so库加载失败");
                str2 = "INIT_LOAD_SO_ERROR";
                break;
            case "INIT_LOAD_MODEL_SUCCESS":
                ixq0.m138885b(f162399L, "onEvent >>>> : [eventCode]:" + str + "模型加载成功");
                str2 = "";
                break;
            case "INIT_LOAD_MODEL_ERROR":
                ixq0.m138885b(f162399L, "onEvent >>>> : [eventCode]:" + str + "模型加载失败");
                break;
            default:
                str2 = "";
                break;
        }
        if (!TextUtils.isEmpty(str2)) {
            m182245k0(str2);
        }
        return true;
    }

    @Override // p149l.qcm
    /* JADX INFO: renamed from: f */
    public void mo173885f(int i) {
        m182236U(i);
    }

    @Override // p149l.onl
    /* JADX INFO: renamed from: f0 */
    public void mo17892f0(double d, double d2) {
        if (this.f162423l != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 901;
            messageObtain.arg1 = (int) d;
            messageObtain.arg2 = (int) d2;
            this.f162423l.sendMessage(messageObtain);
        }
    }

    @Override // p149l.qcm
    /* JADX INFO: renamed from: g */
    public void mo173886g(int i, Map<String, Object> map) {
        ksf0.m147071e(ksf0.C18071a.f124465c, null);
        ixq0.m138885b(f162399L, "onComplete:[usePhotinus]" + this.f162432u + " Thread Name:" + Thread.currentThread());
        m182248m0(913);
        boolean z = this.f162432u;
        br4 br4Var = this.f162437z;
        if (z) {
            if (br4Var == null || !br4Var.m103465j(4)) {
                m182241c0();
                return;
            }
            return;
        }
        if (br4Var == null || !br4Var.m103465j(4)) {
            m182281X();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m182282g0() {
        Context context = this.f162413b;
        if (context instanceof ToygerActivity) {
            ((ToygerActivity) context).m17684g2();
        }
        PhotinusEmulator photinusEmulator = this.f162434w;
        if (photinusEmulator != null && this.f162424m == WorkState.PHOTINUS && this.f162428q) {
            this.f162424m = this.f162425n;
            this.f162429r = true;
            this.f162428q = false;
            photinusEmulator.m17551b();
            InterfaceC19857g interfaceC19857g = this.f162403C;
            if (interfaceC19857g != null) {
                interfaceC19857g.mo17678Q();
            }
        }
        this.f162428q = false;
        this.f162410J = false;
        this.f162411K = false;
        m182270F0(true);
        m182283h0();
        m182267D();
    }

    @Override // p149l.qcm
    /* JADX INFO: renamed from: h */
    public void mo173887h(Bitmap bitmap) {
        if (bitmap != null) {
            this.f162417f = bitmap;
            kcm.m145452H().m145530b1(bitmap);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m182283h0() {
        if (this.f162415d != null) {
            ixq0.m138884a("resetIdentityFaceService------------");
            this.f162415d.reset();
        }
    }

    @Override // p149l.qcm
    /* JADX INFO: renamed from: i */
    public void mo173888i(Bitmap bitmap) {
        if (bitmap != null) {
            m182287t0(bitmap);
        }
    }

    @Override // p149l.qcm
    /* JADX INFO: renamed from: j */
    public void mo173889j(IDFrame iDFrame) {
        vm2 vm2Var = this.f162415d;
        if (vm2Var != null) {
            vm2Var.processImage(iDFrame);
        }
    }

    @Override // p149l.qcm
    /* JADX INFO: renamed from: k */
    public void mo173890k(int i, IdentityFaceAttr identityFaceAttr) {
        m182237V(i, identityFaceAttr);
    }

    @Override // p149l.qcm
    /* JADX INFO: renamed from: l */
    public void mo173891l(Bitmap bitmap) {
        if (bitmap != null) {
            this.f162418g = bitmap;
            kcm.m145452H().m145551i1(bitmap);
        }
    }

    @Override // p149l.onl
    /* JADX INFO: renamed from: o0 */
    public void mo17900o0(q84 q84Var) {
        if (this.f162406F) {
            return;
        }
        WorkState workState = WorkState.PHOTINUS;
        if (workState == this.f162424m && this.f162428q) {
            m182240b0(q84Var);
        }
        WorkState workState2 = this.f162424m;
        if ((workState2 == WorkState.FACE_CAPTURING || workState2 == WorkState.FACE_CAPTURING_DARK || workState2 == workState) && !this.f162426o.getAndSet(true)) {
            int iM182226B = m182226B();
            q84Var.m173339h(iM182226B);
            if (m182232I().m182275L()) {
                m182244j0(q84Var);
            }
            InterfaceC19857g interfaceC19857g = this.f162403C;
            if (interfaceC19857g != null) {
                interfaceC19857g.mo17681b0();
            }
            ByteBuffer byteBufferM173332a = q84Var.m173332a();
            if (this.f162415d != null && byteBufferM173332a != null) {
                try {
                    mo173889j(new IDFrame(q84Var.f153131q, q84Var.m173335d(), q84Var.m173334c(), iM182226B, q84Var.m173333b(), 1));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            this.f162426o.set(false);
            br4 br4Var = this.f162437z;
            if (br4Var == null || !br4Var.m103466k(q84Var)) {
                return;
            }
            if (this.f162432u) {
                m182241c0();
            } else {
                m182281X();
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m182284q0(jwb jwbVar) {
        this.f162412a = jwbVar;
    }

    /* JADX INFO: renamed from: r0 */
    public void m182285r0(boolean z) {
        this.f162402B = z;
    }

    /* JADX INFO: renamed from: s0 */
    public void m182286s0(Bitmap bitmap) {
        ksf0.m147071e(ksf0.C18071a.f124466d, null);
        this.f162420i = bitmap;
    }

    /* JADX INFO: renamed from: t0 */
    public void m182287t0(Bitmap bitmap) {
        ksf0.m147071e(ksf0.C18071a.f124466d, null);
        this.f162421j = bitmap;
    }

    /* JADX INFO: renamed from: u0 */
    public void m182288u0(Bitmap bitmap) {
        ksf0.m147071e(ksf0.C18071a.f124466d, null);
        this.f162419h = bitmap;
    }

    /* JADX INFO: renamed from: v0 */
    public void m182289v0(Bitmap bitmap) {
        ksf0.m147071e(ksf0.C18071a.f124466d, null);
        this.f162416e = bitmap;
        kcm.m145452H().m145520W0(bitmap);
    }

    /* JADX INFO: renamed from: w0 */
    public void m182290w0(boolean z) {
        this.f162406F = z;
    }

    /* JADX INFO: renamed from: x0 */
    public void m182291x0() {
        m182250n0(new RunnableC19856f());
    }

    /* JADX INFO: renamed from: y0 */
    public void m182292y0(String str) {
        this.f162433v = str;
        kcm.m145452H().m145493M1(str);
    }

    /* JADX INFO: renamed from: z0 */
    public void m182293z0(boolean z) {
        this.f162432u = z;
    }

    @Override // p149l.onl
    /* JADX INFO: renamed from: d0 */
    public void mo17888d0() {
    }

    @Override // p149l.qcm
    public void preProcess() {
    }
}
