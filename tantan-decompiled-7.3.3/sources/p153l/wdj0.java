package p153l;

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
import com.idv.identity.face.p043ui.ToygerActivity;
import com.idv.identity.face.p043ui.widget.EllipseHoleView;
import com.idv.identity.face.photinus.C3704b;
import com.idv.identity.face.photinus.PhotinusEmulator;
import com.idv.identity.face.photinus.VideoFormatConfig;
import com.idv.identity.platform.config.IdentityFarNearConfig;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.feed.data.Frame;
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
public class wdj0 implements zpl, gfm {

    /* JADX INFO: renamed from: L */
    private static final String f188563L = "wdj0";

    /* JADX INFO: renamed from: M */
    private static volatile wdj0 f188564M;

    /* JADX INFO: renamed from: A */
    private boolean f188565A;

    /* JADX INFO: renamed from: B */
    private boolean f188566B;

    /* JADX INFO: renamed from: C */
    private InterfaceC21083g f188567C;

    /* JADX INFO: renamed from: D */
    private CopyOnWriteArrayList<p94> f188568D;

    /* JADX INFO: renamed from: E */
    private CopyOnWriteArrayList<p94> f188569E;

    /* JADX INFO: renamed from: F */
    private boolean f188570F;

    /* JADX INFO: renamed from: G */
    private int f188571G;

    /* JADX INFO: renamed from: H */
    private final int f188572H;

    /* JADX INFO: renamed from: I */
    private int f188573I;

    /* JADX INFO: renamed from: J */
    private boolean f188574J;

    /* JADX INFO: renamed from: K */
    private boolean f188575K;

    /* JADX INFO: renamed from: a */
    private xxb f188576a;

    /* JADX INFO: renamed from: b */
    private Context f188577b;

    /* JADX INFO: renamed from: c */
    private dql f188578c;

    /* JADX INFO: renamed from: d */
    private cn2 f188579d;

    /* JADX INFO: renamed from: e */
    private Bitmap f188580e;

    /* JADX INFO: renamed from: f */
    private Bitmap f188581f;

    /* JADX INFO: renamed from: g */
    private Bitmap f188582g;

    /* JADX INFO: renamed from: h */
    private Bitmap f188583h;

    /* JADX INFO: renamed from: i */
    private Bitmap f188584i;

    /* JADX INFO: renamed from: j */
    private Bitmap f188585j;

    /* JADX INFO: renamed from: k */
    private Bitmap f188586k;

    /* JADX INFO: renamed from: l */
    private Handler f188587l;

    /* JADX INFO: renamed from: m */
    private WorkState f188588m;

    /* JADX INFO: renamed from: n */
    private WorkState f188589n;

    /* JADX INFO: renamed from: o */
    private AtomicBoolean f188590o;

    /* JADX INFO: renamed from: p */
    private final AtomicBoolean f188591p;

    /* JADX INFO: renamed from: q */
    private boolean f188592q;

    /* JADX INFO: renamed from: r */
    private boolean f188593r;

    /* JADX INFO: renamed from: s */
    private boolean f188594s;

    /* JADX INFO: renamed from: t */
    private String f188595t;

    /* JADX INFO: renamed from: u */
    private boolean f188596u;

    /* JADX INFO: renamed from: v */
    private String f188597v;

    /* JADX INFO: renamed from: w */
    private PhotinusEmulator f188598w;

    /* JADX INFO: renamed from: x */
    private int f188599x;

    /* JADX INFO: renamed from: y */
    private Long f188600y;

    /* JADX INFO: renamed from: z */
    private as4 f188601z;

    /* JADX INFO: renamed from: l.wdj0$a */
    public class C21077a extends AnimatorListenerAdapter {
        public C21077a() {
        }
    }

    /* JADX INFO: renamed from: l.wdj0$b */
    public class C21078b extends AnimatorListenerAdapter {
        public C21078b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            try {
                if (wdj0.this.f188579d != null) {
                    wdj0.this.f188579d.setFarNeatAction(true);
                }
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                iig0.m140070a(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.wdj0$c */
    public class RunnableC21079c implements Runnable {
        public RunnableC21079c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wdj0.this.f188598w != null) {
                wdj0.this.f188598w.m18637w();
            }
        }
    }

    /* JADX INFO: renamed from: l.wdj0$d */
    public class RunnableC21080d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ EllipseHoleView f188605a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ToygerActivity f188606b;

        public RunnableC21080d(EllipseHoleView ellipseHoleView, ToygerActivity toygerActivity) {
            this.f188605a = ellipseHoleView;
            this.f188606b = toygerActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (this.f188605a.m18796r()) {
            }
            this.f188606b.m18751B2();
        }
    }

    /* JADX INFO: renamed from: l.wdj0$e */
    public class RunnableC21081e implements Runnable {

        /* JADX INFO: renamed from: l.wdj0$e$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o6r0.m166282b(wdj0.f188563L, "onToygerComplete:生成认证视频");
                wdj0 wdj0Var = wdj0.this;
                wdj0Var.m205903S(wdj0Var.f188577b, vdj0.f183636a, wdj0.this.f188569E);
            }
        }

        public RunnableC21081e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            new Thread(new a()).start();
        }
    }

    /* JADX INFO: renamed from: l.wdj0$f */
    public class RunnableC21082f implements Runnable {
        public RunnableC21082f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wdj0.this.f188569E == null) {
                wdj0.this.f188569E = new CopyOnWriteArrayList();
            }
            wdj0.this.f188569E.addAll(wdj0.this.f188568D);
            while (wdj0.this.f188569E.size() > 30) {
                wdj0.this.f188569E.remove(0);
            }
        }
    }

    /* JADX INFO: renamed from: l.wdj0$g */
    public interface InterfaceC21083g {
        /* JADX INFO: renamed from: R */
        void mo18757R();

        /* JADX INFO: renamed from: c0 */
        void mo18760c0();
    }

    /* JADX INFO: renamed from: l.wdj0$h */
    public static final class C21084h implements y270 {

        /* JADX INFO: renamed from: a */
        wdj0 f188611a;

        /* JADX INFO: renamed from: b */
        private boolean f188612b = false;

        public C21084h(wdj0 wdj0Var) {
            this.f188611a = wdj0Var;
        }

        @Override // p153l.y270
        /* JADX INFO: renamed from: a */
        public void mo205962a(Uri uri, Uri uri2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "photinusFileReady", "elapsedTime", Long.toString(System.currentTimeMillis() - this.f188611a.f188600y.longValue()));
            if (uri != null) {
                this.f188611a.m205960y0(uri.getPath());
                o6r0.m166282b(wdj0.f188563L + "_PhotinusCallback", "ThreadName:" + Thread.currentThread() + " onFilesReady：炫彩视频生成结束 video:" + uri.getPath());
            }
            this.f188611a.f188592q = false;
            this.f188611a.m205949X();
        }

        @Override // p153l.y270
        /* JADX INFO: renamed from: b */
        public void mo205963b(String str) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "photinusEncoderError", Reason.TYPE, str);
        }

        @Override // p153l.y270
        /* JADX INFO: renamed from: c */
        public void mo205964c(int i) {
            o6r0.m166282b(wdj0.f188563L + "_PhotinusCallback", "onDisplayRGB: " + i);
            this.f188611a.m205906Y(i);
        }

        @Override // p153l.y270
        /* JADX INFO: renamed from: d */
        public void mo205965d(String str) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "photinusTakePicture", Reason.TYPE, str);
            o6r0.m166282b(wdj0.f188563L + "_PhotinusCallback", "onTakePhotoErrorReport: " + str);
        }

        @Override // p153l.y270
        /* JADX INFO: renamed from: e */
        public void mo205966e() {
            o6r0.m166282b(wdj0.f188563L + "_PhotinusCallback", "onHasEnoughFrames: ThreadName" + Thread.currentThread().getName());
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "END_PHOTINUS", "time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.ENGLISH).format(new Date()), "currentPage", "FACE", "productCode", afm.m97360H().f70935C0, "cost", Long.toString(System.currentTimeMillis() - this.f188611a.f188600y.longValue()));
            wdj0 wdj0Var = this.f188611a;
            if (wdj0Var != null && wdj0Var.f188579d != null) {
                this.f188611a.f188579d.finishPhotinus();
            }
            if (this.f188612b) {
                this.f188611a.m205939G0();
            }
        }

        @Override // p153l.y270
        /* JADX INFO: renamed from: f */
        public void mo205967f() {
            if (this.f188611a.f188578c != null) {
                this.f188611a.f188578c.mo117543l();
            }
        }

        @Override // p153l.y270
        public void onException(Throwable th) {
            RecordService.getInstance().recordException(th);
            o6r0.m166282b(wdj0.f188563L + "_PhotinusCallback", "onException: " + th.getMessage());
            this.f188612b = true;
        }
    }

    /* JADX INFO: renamed from: l.wdj0$i */
    public static final class C21085i implements ep50 {

        /* JADX INFO: renamed from: a */
        wdj0 f188613a;

        public C21085i(wdj0 wdj0Var) {
            this.f188613a = wdj0Var;
        }

        @Override // p153l.ep50
        /* JADX INFO: renamed from: a */
        public void mo121827a(Uri uri) {
            o6r0.m166282b(wdj0.f188563L, uri.getPath() + "  " + Thread.currentThread().getName());
            String path = uri.getPath();
            if (TextUtils.isEmpty(path)) {
                wdj0.m205900I().m205933B0(null);
                mo121828b(path);
                return;
            }
            wdj0.m205900I().m205933B0(path);
            m205968c();
            o6r0.m166282b(wdj0.f188563L, "onVideoWriteSuccess: 认证视频生成成功  " + Thread.currentThread().getName());
            this.f188613a.m205916m0(902);
        }

        @Override // p153l.ep50
        /* JADX INFO: renamed from: b */
        public void mo121828b(String str) {
            o6r0.m166282b(wdj0.f188563L, "onVideoWriteError: 认证视频生成失败" + str + "  " + Thread.currentThread().getName());
            RecordService recordService = RecordService.getInstance();
            RecordLevel recordLevel = RecordLevel.LOG_ERROR;
            if (TextUtils.isEmpty(str)) {
                str = "NULL";
            }
            recordService.recordEvent(recordLevel, "onVideoWriteError", "msg", str);
            wdj0.m205900I().m205933B0(null);
            if (this.f188613a.f188578c != null) {
                this.f188613a.m205899H0(this.f188613a.f188578c.mo117539h(), this.f188613a.f188578c.mo117540i(), this.f188613a.m205895C());
            } else {
                wdj0.m205900I().m205933B0(null);
            }
            m205968c();
            this.f188613a.m205916m0(902);
        }

        /* JADX INFO: renamed from: c */
        public void m205968c() {
            if (this.f188613a.f188569E != null) {
                this.f188613a.f188569E.clear();
            }
            if (this.f188613a.f188568D != null) {
                this.f188613a.f188568D.clear();
            }
        }
    }

    private wdj0() {
        WorkState workState = WorkState.INIT;
        this.f188588m = workState;
        this.f188589n = workState;
        this.f188590o = new AtomicBoolean(false);
        this.f188591p = new AtomicBoolean(true);
        this.f188592q = false;
        this.f188593r = true;
        this.f188594s = false;
        this.f188596u = false;
        this.f188565A = false;
        this.f188566B = false;
        this.f188570F = false;
        this.f188572H = 30;
        this.f188573I = 5;
        this.f188574J = false;
        this.f188575K = false;
    }

    /* JADX INFO: renamed from: B */
    private int m205894B() {
        dql dqlVar = this.f188578c;
        if (dqlVar == null) {
            return 0;
        }
        int iMo117546o = dqlVar.mo117546o();
        return !m205902P() ? (360 - iMo117546o) % 360 : iMo117546o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public int m205895C() {
        dql dqlVar = this.f188578c;
        if (dqlVar == null) {
            return 0;
        }
        int iMo117546o = dqlVar.mo117546o();
        return !m205902P() ? (360 - iMo117546o) % 360 : iMo117546o;
    }

    /* JADX INFO: renamed from: E */
    private void m205896E(List<p94> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        list.clear();
    }

    /* JADX INFO: renamed from: F */
    private void m205897F() {
        this.f188580e = null;
        this.f188588m = WorkState.INIT;
        this.f188590o = new AtomicBoolean(false);
        this.f188596u = true;
        this.f188592q = false;
        this.f188593r = true;
        try {
            PhotinusEmulator photinusEmulator = this.f188598w;
            if (photinusEmulator != null) {
                photinusEmulator.m18634p();
                this.f188598w = null;
            }
        } catch (Throwable th) {
            RecordService.getInstance().recordException(th);
        }
        this.f188570F = false;
        this.f188571G = 0;
        m205937E0();
    }

    /* JADX INFO: renamed from: G */
    private byte[] m205898G(p94 p94Var) {
        ByteBuffer byteBufferM171334a = p94Var.m171334a();
        byte[] bArr = null;
        try {
            try {
                byte[] bArrArray = byteBufferM171334a.array();
                bArr = new byte[bArrArray.length];
                System.arraycopy(bArrArray, 0, bArr, 0, bArrArray.length);
                return bArr;
            } catch (ReadOnlyBufferException e) {
                RecordService.getInstance().recordException(e);
                if (bArr != null) {
                    return bArr;
                }
                byte[] bArr2 = new byte[byteBufferM171334a.remaining()];
                byteBufferM171334a.get(bArr2);
                return bArr2;
            } catch (UnsupportedOperationException e2) {
                RecordService.getInstance().recordException(e2);
                if (bArr != null) {
                    return bArr;
                }
                byte[] bArr3 = new byte[byteBufferM171334a.remaining()];
                byteBufferM171334a.get(bArr3);
                return bArr3;
            }
        } catch (Throwable th) {
            if (bArr == null) {
                byteBufferM171334a.get(new byte[byteBufferM171334a.remaining()]);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public void m205899H0(int i, int i2, int i3) {
        try {
            String str = this.f188577b.getFilesDir().getAbsolutePath() + "/toyger_verify_video.zip";
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            bqq0.m105954c(cd4.m109121e(this.f188569E), file, i, i2, i3);
            o6r0.m166282b(f188563L, "zipVideoFrames:".concat(str));
            m205900I().m205933B0(str);
        } catch (Exception unused) {
            m205900I().m205933B0(null);
            m205900I().m205960y0(null);
        }
    }

    /* JADX INFO: renamed from: I */
    public static wdj0 m205900I() {
        if (f188564M == null) {
            synchronized (wdj0.class) {
                try {
                    if (f188564M == null) {
                        f188564M = new wdj0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f188564M;
    }

    /* JADX INFO: renamed from: O */
    private void m205901O() {
        if (this.f188579d == null) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "ConfigIdentityService", Constants.KEY_CONFIG, "IdentityFaceService is null");
            return;
        }
        RecordService.getInstance().recordEvent(RecordLevel.LOG_DEBUG, "ConfigIdentityService", Constants.KEY_CONFIG, "IdentityFaceService ");
        try {
            IdentityFarNearConfig identityFarNearConfigM97376E = afm.m97360H().m97376E();
            String strM97451g = afm.m97360H().m97451g();
            IdentityAlgConfig identityAlgConfig = new IdentityAlgConfig();
            if (strM97451g != null && "Y".equals(strM97451g)) {
                identityAlgConfig.isOpenQualityCheck = true;
            }
            identityAlgConfig.livenessCombinations = m205941J();
            identityAlgConfig.detectImageFormat = 4;
            identityAlgConfig.isOpenDegrade = this.f188565A;
            if (identityFarNearConfigM97376E != null) {
                identityAlgConfig.maxFarThreshold = identityFarNearConfigM97376E.maxFarThreshold;
                identityAlgConfig.minFarThreshold = identityFarNearConfigM97376E.minFarThreshold;
                identityAlgConfig.maxNearThreshold = identityFarNearConfigM97376E.maxNearThreshold;
                identityAlgConfig.minNearThreshold = identityFarNearConfigM97376E.minNearThreshold;
            }
            if (this.f188579d.init(this.f188577b, identityAlgConfig, this)) {
                return;
            }
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "IdentityFaceService", NotificationCompat.CATEGORY_STATUS, "error");
        } catch (Exception e) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "ToygerFaceService", "init error" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: P */
    private boolean m205902P() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public void m205903S(Context context, String str, CopyOnWriteArrayList<p94> copyOnWriteArrayList) {
        int iM205895C;
        int iMo117544m;
        int iMo117541j;
        if (this.f188587l == null) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "TOYGER_UI_MSG_ERROR_CODE", "onCompleteMakeVideo", "uiHandler is null");
            return;
        }
        if (!m205900I().m205943L()) {
            m205916m0(902);
            return;
        }
        try {
            if (copyOnWriteArrayList.size() > 0) {
                o6r0.m166282b(f188563L, "onCompleteMakeVideo:" + copyOnWriteArrayList.size());
                iM205895C = copyOnWriteArrayList.get(0).m171340g();
                iMo117544m = copyOnWriteArrayList.get(0).m171339f();
                iMo117541j = copyOnWriteArrayList.get(0).m171338e();
            } else {
                o6r0.m166282b(f188563L, "onCompleteMakeVideo: is null");
                iM205895C = m205895C();
                iMo117544m = this.f188578c.mo117544m();
                iMo117541j = this.f188578c.mo117541j();
            }
            int i = iMo117541j;
            int i2 = iM205895C;
            int i3 = iMo117544m;
            o6r0.m166282b(f188563L, "onCompleteMakeVideo: encode" + Thread.currentThread().getName() + " _width" + i3 + " _height" + i);
            C3704b.m18681b(context, cd4.m109121e(copyOnWriteArrayList), i2, i3, i, str, VideoFormatConfig.L, new C21085i(this));
        } catch (Throwable unused) {
            m205916m0(902);
        }
    }

    /* JADX INFO: renamed from: U */
    private void m205904U(int i) {
        if (i == 0) {
            m205900I().m205936D0();
        } else if (i == 1) {
            Context context = this.f188577b;
            if (context instanceof ToygerActivity) {
                ToygerActivity toygerActivity = (ToygerActivity) context;
                EllipseHoleView ellipseHoleViewM18753H1 = toygerActivity.m18753H1();
                if (ellipseHoleViewM18753H1.m18796r()) {
                    new Thread(new RunnableC21080d(ellipseHoleViewM18753H1, toygerActivity)).start();
                } else {
                    toygerActivity.m18751B2();
                }
            }
        } else if (i == 3) {
            o6r0.m166282b("ACTION NAME", "ACTION NAME :end moving near");
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "MOVE_NEAR_LIVENESS", "time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.ENGLISH).format(new Date()), "currentPage", "FACE", "productCode", afm.m97360H().f70935C0);
            RecordService.getInstance().flush();
        } else if (i == 6) {
            o6r0.m166282b("ACTION NAME", "ACTION NAME :end moving far");
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "MOVE_FAR_LIVENESS", "time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.ENGLISH).format(new Date()), "currentPage", "FACE", "productCode", afm.m97360H().f70935C0);
            RecordService.getInstance().flush();
        } else if (i != 300) {
            if (i != 201) {
                if (i == 202) {
                    if (!this.f188574J) {
                        o6r0.m166282b("ACTION NAME", "ACTION NAME :blink end");
                        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "END_BLINK_LIVENESS", "time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.ENGLISH).format(new Date()), "currentPage", "FACE", "productCode", afm.m97360H().f70935C0);
                        RecordService.getInstance().flush();
                    }
                    this.f188573I = 5;
                    this.f188574J = true;
                }
            } else if (!this.f188575K) {
                this.f188575K = true;
                o6r0.m166282b("ACTION NAME", "ACTION NAME :blink start");
                RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "START_BLINK_LIVENESS", "time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.ENGLISH).format(new Date()), "currentPage", "FACE", "productCode", afm.m97360H().f70935C0);
                RecordService.getInstance().flush();
            }
        } else if (!this.f188592q) {
            this.f188589n = this.f188588m;
            this.f188588m = WorkState.PHOTINUS;
            this.f188592q = true;
        }
        if (this.f188587l != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 912;
            messageObtain.arg1 = i;
            this.f188587l.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: renamed from: V */
    private void m205905V(int i, IdentityFaceAttr identityFaceAttr) {
        if (i == 101) {
            this.f188591p.compareAndSet(true, false);
            m205950f0();
        } else if (i == 102) {
            this.f188591p.compareAndSet(false, true);
        } else if (i == 103 || i == 104) {
            m205950f0();
        }
        if (this.f188587l != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 911;
            messageObtain.arg1 = i;
            this.f188587l.sendMessage(messageObtain);
            this.f188571G = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public void m205906Y(int i) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 915;
        messageObtain.arg1 = i;
        m205914l0(messageObtain);
    }

    /* JADX INFO: renamed from: Z */
    private boolean m205907Z(int i, int i2) {
        m205916m0(916);
        if (!this.f188598w.m18635r(this.f188577b, i, i2, m205900I().m205895C(), 0, 4, 2, false)) {
            return false;
        }
        this.f188599x = this.f188578c.mo117546o();
        this.f188600y = Long.valueOf(System.currentTimeMillis());
        this.f188598w.m18636v(new C21084h(m205900I()));
        this.f188598w.m18630j();
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "START_PHOTINUS", "time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.ENGLISH).format(new Date()), "currentPage", "FACE", "productCode", afm.m97360H().f70935C0);
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    private void m205908a0(p94 p94Var) {
        if (this.f188593r) {
            m205907Z(p94Var.m171337d(), p94Var.m171336c());
            this.f188593r = false;
        }
        z270 z270Var = new z270(m205898G(p94Var));
        z270Var.f97405b = this.f188599x;
        this.f188598w.m18629i(z270Var);
    }

    /* JADX INFO: renamed from: c0 */
    private void m205909c0() {
        m205918n0(new RunnableC21079c());
    }

    /* JADX INFO: renamed from: d0 */
    private void m205910d0(int i) {
        o6r0.m166282b(f188563L, "recordFaceOutFrames: messageCode" + i + " outVideoDataFrames:" + this.f188569E);
        if (this.f188587l == null || !this.f188594s || this.f188569E == null || i != 902) {
            return;
        }
        m205959x0();
    }

    /* JADX INFO: renamed from: i0 */
    private void m205911i0() {
        this.f188573I = 0;
        this.f188574J = false;
        this.f188575K = false;
        m205896E(this.f188569E);
    }

    /* JADX INFO: renamed from: j0 */
    private void m205912j0(p94 p94Var) {
        CopyOnWriteArrayList<p94> copyOnWriteArrayList = this.f188569E;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            String str = f188563L;
            o6r0.m166282b(str, "saveVideoFrame blinkPassed:" + this.f188574J + "  frameCountAfterAction:" + this.f188573I);
            if (this.f188574J) {
                int i = this.f188573I - 1;
                this.f188573I = i;
                if (i < 0) {
                    m205959x0();
                    return;
                }
            }
            if (this.f188568D == null) {
                this.f188568D = new CopyOnWriteArrayList<>();
            }
            if (this.f188568D.size() > 30) {
                this.f188568D.remove(0);
            }
            this.f188568D.add(p94Var);
            o6r0.m166282b(str, "saveVideoFrame videoDataFrames:" + this.f188568D.size());
        }
    }

    /* JADX INFO: renamed from: k0 */
    private void m205913k0(String str) {
        if (this.f188587l != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = IMediaPlayer.MEDIA_INFO_ML_DROP_START;
            messageObtain.obj = str;
            this.f188587l.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: renamed from: l0 */
    private void m205914l0(Message message) {
        Handler handler = this.f188587l;
        if (handler != null) {
            handler.sendMessage(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public synchronized void m205916m0(int i) {
        Handler handler = this.f188587l;
        if (handler != null) {
            handler.sendEmptyMessage(i);
        }
    }

    /* JADX INFO: renamed from: n0 */
    private synchronized void m205918n0(Runnable runnable) {
        Handler handler = this.f188587l;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    /* JADX INFO: renamed from: o0 */
    private void m205920o0(Bitmap bitmap) {
        t0g0.m188742e(t0g0.C20202a.f171516d, null);
        this.f188586k = bitmap;
    }

    /* JADX INFO: renamed from: A0 */
    public synchronized void m205932A0(boolean z) {
        try {
            this.f188594s = z;
            if (z) {
                CopyOnWriteArrayList<p94> copyOnWriteArrayList = this.f188568D;
                if (copyOnWriteArrayList == null) {
                    this.f188568D = new CopyOnWriteArrayList<>();
                } else {
                    m205896E(copyOnWriteArrayList);
                }
                CopyOnWriteArrayList<p94> copyOnWriteArrayList2 = this.f188569E;
                if (copyOnWriteArrayList2 == null) {
                    this.f188569E = new CopyOnWriteArrayList<>();
                } else {
                    m205896E(copyOnWriteArrayList2);
                }
                m205911i0();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m205933B0(String str) {
        this.f188595t = str;
        afm.m97360H().m97422T1(str);
    }

    /* JADX INFO: renamed from: C0 */
    public WorkState m205934C0(WorkState workState) {
        WorkState workState2 = this.f188588m;
        this.f188588m = workState;
        return workState2;
    }

    /* JADX INFO: renamed from: D */
    public void m205935D() {
        CopyOnWriteArrayList<p94> copyOnWriteArrayList = this.f188569E;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        this.f188569E.clear();
    }

    /* JADX INFO: renamed from: D0 */
    public void m205936D0() {
        if (m205946Q()) {
            return;
        }
        Context context = this.f188577b;
        if (context instanceof ToygerActivity) {
            m205953r0(true);
            ((ToygerActivity) context).m18765r2(new C21078b());
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m205937E0() {
        m205938F0(false);
    }

    /* JADX INFO: renamed from: F0 */
    public void m205938F0(boolean z) {
        if (m205946Q()) {
            cn2 cn2Var = this.f188579d;
            if (cn2Var != null) {
                cn2Var.setFarNeatAction(false);
            }
            m205953r0(false);
            if (z) {
                Context context = this.f188577b;
                if (context instanceof ToygerActivity) {
                    ((ToygerActivity) context).m18761d2(new C21077a());
                }
            }
        }
    }

    /* JADX INFO: renamed from: G0 */
    public String m205939G0() {
        if (this.f188598w == null) {
            return "";
        }
        String str = this.f188577b.getFilesDir().getAbsolutePath() + "/toyger_photinus_video.zip";
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        String strM18638z = this.f188598w.m18638z(str, this.f188578c.mo117539h(), this.f188578c.mo117540i(), m205895C());
        if (!TextUtils.isEmpty(strM18638z)) {
            this.f188597v = strM18638z;
        }
        return strM18638z;
    }

    /* JADX INFO: renamed from: H */
    public as4 m205940H() {
        return this.f188601z;
    }

    /* JADX INFO: renamed from: J */
    public String m205941J() {
        StringBuilder sb = new StringBuilder();
        if (afm.m97360H().m97371C0()) {
            sb.append("");
        }
        if (afm.m97360H().m97505y0()) {
            sb.append(IdentityAlgConfig.FACE_BLINK_LIVENESS);
        }
        if (afm.m97360H().m97365A0()) {
            sb.append(IdentityAlgConfig.FACE_PHOTINUS_LIVENESS);
        }
        if (afm.m97360H().m97508z0()) {
            sb.append("faceBlinkLiveness#PhotinusLiveness");
        }
        if (afm.m97360H().m97496v0()) {
            sb.append("faceBlinkLiveness#faceFarNearLiveness#PhotinusLiveness");
        }
        if (afm.m97360H().m97499w0()) {
            sb.append("faceFarNearLiveness#PhotinusLiveness");
        }
        if (afm.m97360H().m97502x0()) {
            sb.append("faceBlinkLiveness#shakeHeadLiveness#OpenMouthLiveness#faceFarNearLiveness#PhotinusLiveness");
        }
        if (afm.m97360H().m97368B0()) {
            sb.append("shakeHeadLiveness#faceFarNearLiveness");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: K */
    public String m205942K() {
        return this.f188597v;
    }

    /* JADX INFO: renamed from: L */
    public boolean m205943L() {
        return this.f188594s;
    }

    /* JADX INFO: renamed from: M */
    public WorkState m205944M() {
        return this.f188588m;
    }

    /* JADX INFO: renamed from: N */
    public boolean m205945N(Context context, Handler handler, dql dqlVar, InterfaceC21083g interfaceC21083g) {
        m205897F();
        this.f188577b = context;
        this.f188587l = handler;
        this.f188578c = dqlVar;
        this.f188567C = interfaceC21083g;
        this.f188579d = (cn2) ofm.m167457a("com.idv.identity.service.IdentityFaceService", cn2.class);
        boolean zM97493u0 = afm.m97360H().m97493u0();
        this.f188596u = zM97493u0;
        if (zM97493u0) {
            try {
                this.f188598w = new PhotinusEmulator();
            } catch (Throwable th) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "ClientConfigError", NotificationCompat.CATEGORY_STATUS, Log.getStackTraceString(th));
                return false;
            }
        }
        if (afm.m97360H().m97484r0()) {
            this.f188601z = new as4();
        }
        this.f188565A = afm.m97360H().m97481q();
        m205932A0(TextUtils.equals("Y", afm.m97360H().m97498w()));
        this.f188588m = WorkState.FACE_CAPTURING;
        m205901O();
        return true;
    }

    /* JADX INFO: renamed from: Q */
    public boolean m205946Q() {
        return this.f188566B;
    }

    /* JADX INFO: renamed from: R */
    public boolean m205947R() {
        return this.f188596u;
    }

    @Override // p153l.zpl
    /* JADX INFO: renamed from: T */
    public void mo18952T(int i, Throwable th) {
        String str;
        switch (i) {
            case 100:
                str = dfm.f88186g;
                break;
            case 101:
                if (th != null) {
                    RecordService.getInstance().recordException(th);
                }
                str = dfm.f88188i;
                break;
            case 102:
                str = dfm.f88189j;
                break;
            default:
                str = "unknown Camera Code =>" + i;
                break;
        }
        m205913k0(str);
    }

    /* JADX INFO: renamed from: W */
    public void m205948W() {
        if (this.f188578c != null) {
            this.f188578c = null;
        }
        if (this.f188577b != null) {
            this.f188577b = null;
        }
        if (this.f188587l != null) {
            this.f188587l = null;
        }
        cn2 cn2Var = this.f188579d;
        if (cn2Var != null) {
            cn2Var.release();
        }
        as4 as4Var = this.f188601z;
        if (as4Var != null) {
            as4Var.m99882r();
            this.f188601z = null;
        }
        try {
            PhotinusEmulator photinusEmulator = this.f188598w;
            if (photinusEmulator != null) {
                photinusEmulator.m18634p();
                this.f188598w = null;
            }
        } catch (Throwable th) {
            RecordService.getInstance().recordException(th);
        }
        f188564M = null;
        m205953r0(false);
    }

    /* JADX INFO: renamed from: X */
    public void m205949X() {
        if (this.f188587l != null) {
            m205910d0(902);
            m205918n0(new RunnableC21081e());
        }
        this.f188588m = WorkState.FACE_COMPLETED;
    }

    @Override // p153l.gfm
    /* JADX INFO: renamed from: a */
    public void mo130081a(Bitmap bitmap) {
        if (bitmap != null) {
            m205920o0(bitmap);
        }
    }

    @Override // p153l.gfm
    /* JADX INFO: renamed from: b */
    public void mo130082b(Bitmap bitmap) {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "onHighQualityFrame", Frame.TYPE, bitmap.toString());
        m205957v0(bitmap);
    }

    @Override // p153l.zpl
    /* JADX INFO: renamed from: b0 */
    public void mo18961b0() {
        as4 as4Var;
        Camera cameraMo117533b = this.f188578c.mo117533b();
        if (cameraMo117533b == null || (as4Var = this.f188601z) == null) {
            return;
        }
        as4Var.m99883s(cameraMo117533b);
    }

    @Override // p153l.gfm
    /* JADX INFO: renamed from: c */
    public void mo130083c(Bitmap bitmap) {
        if (bitmap != null) {
            m205954s0(bitmap);
        }
    }

    @Override // p153l.gfm
    /* JADX INFO: renamed from: d */
    public void mo130084d(Bitmap bitmap) {
        if (bitmap != null) {
            m205956u0(bitmap);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p153l.gfm
    /* JADX INFO: renamed from: e */
    public boolean mo130085e(String str, Map<String, Object> map) {
        str.getClass();
        String str2 = "INIT_LOAD_MODEL_ERROR";
        switch (str) {
            case "INIT_LOAD_SO_ERROR":
                o6r0.m166282b(f188563L, "onEvent >>>> : [eventCode]:" + str + "so库加载失败");
                str2 = "INIT_LOAD_SO_ERROR";
                break;
            case "INIT_LOAD_MODEL_SUCCESS":
                o6r0.m166282b(f188563L, "onEvent >>>> : [eventCode]:" + str + "模型加载成功");
                str2 = "";
                break;
            case "INIT_LOAD_MODEL_ERROR":
                o6r0.m166282b(f188563L, "onEvent >>>> : [eventCode]:" + str + "模型加载失败");
                break;
            default:
                str2 = "";
                break;
        }
        if (!TextUtils.isEmpty(str2)) {
            m205913k0(str2);
        }
        return true;
    }

    @Override // p153l.gfm
    /* JADX INFO: renamed from: f */
    public void mo130086f(int i) {
        m205904U(i);
    }

    /* JADX INFO: renamed from: f0 */
    public void m205950f0() {
        Context context = this.f188577b;
        if (context instanceof ToygerActivity) {
            ((ToygerActivity) context).m18763h2();
        }
        PhotinusEmulator photinusEmulator = this.f188598w;
        if (photinusEmulator != null && this.f188588m == WorkState.PHOTINUS && this.f188592q) {
            this.f188588m = this.f188589n;
            this.f188593r = true;
            this.f188592q = false;
            photinusEmulator.m18628b();
            InterfaceC21083g interfaceC21083g = this.f188567C;
            if (interfaceC21083g != null) {
                interfaceC21083g.mo18757R();
            }
        }
        this.f188592q = false;
        this.f188574J = false;
        this.f188575K = false;
        m205938F0(true);
        m205951h0();
        m205935D();
    }

    @Override // p153l.gfm
    /* JADX INFO: renamed from: g */
    public void mo130087g(int i, Map<String, Object> map) {
        t0g0.m188742e(t0g0.C20202a.f171515c, null);
        o6r0.m166282b(f188563L, "onComplete:[usePhotinus]" + this.f188596u + " Thread Name:" + Thread.currentThread());
        m205916m0(913);
        boolean z = this.f188596u;
        as4 as4Var = this.f188601z;
        if (z) {
            if (as4Var == null || !as4Var.m99877j(4)) {
                m205909c0();
                return;
            }
            return;
        }
        if (as4Var == null || !as4Var.m99877j(4)) {
            m205949X();
        }
    }

    @Override // p153l.zpl
    /* JADX INFO: renamed from: g0 */
    public void mo18967g0(double d, double d2) {
        if (this.f188587l != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 901;
            messageObtain.arg1 = (int) d;
            messageObtain.arg2 = (int) d2;
            this.f188587l.sendMessage(messageObtain);
        }
    }

    @Override // p153l.gfm
    /* JADX INFO: renamed from: h */
    public void mo130088h(Bitmap bitmap) {
        if (bitmap != null) {
            this.f188581f = bitmap;
            afm.m97360H().m97438b1(bitmap);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m205951h0() {
        if (this.f188579d != null) {
            o6r0.m166281a("resetIdentityFaceService------------");
            this.f188579d.reset();
        }
    }

    @Override // p153l.gfm
    /* JADX INFO: renamed from: i */
    public void mo130089i(Bitmap bitmap) {
        if (bitmap != null) {
            m205955t0(bitmap);
        }
    }

    @Override // p153l.gfm
    /* JADX INFO: renamed from: j */
    public void mo130090j(IDFrame iDFrame) {
        cn2 cn2Var = this.f188579d;
        if (cn2Var != null) {
            cn2Var.processImage(iDFrame);
        }
    }

    @Override // p153l.gfm
    /* JADX INFO: renamed from: k */
    public void mo130091k(int i, IdentityFaceAttr identityFaceAttr) {
        m205905V(i, identityFaceAttr);
    }

    @Override // p153l.gfm
    /* JADX INFO: renamed from: l */
    public void mo130092l(Bitmap bitmap) {
        if (bitmap != null) {
            this.f188582g = bitmap;
            afm.m97360H().m97459i1(bitmap);
        }
    }

    @Override // p153l.zpl
    /* JADX INFO: renamed from: p0 */
    public void mo18976p0(p94 p94Var) {
        if (this.f188570F) {
            return;
        }
        WorkState workState = WorkState.PHOTINUS;
        if (workState == this.f188588m && this.f188592q) {
            m205908a0(p94Var);
        }
        WorkState workState2 = this.f188588m;
        if ((workState2 == WorkState.FACE_CAPTURING || workState2 == WorkState.FACE_CAPTURING_DARK || workState2 == workState) && !this.f188590o.getAndSet(true)) {
            int iM205894B = m205894B();
            p94Var.m171341h(iM205894B);
            if (m205900I().m205943L()) {
                m205912j0(p94Var);
            }
            InterfaceC21083g interfaceC21083g = this.f188567C;
            if (interfaceC21083g != null) {
                interfaceC21083g.mo18760c0();
            }
            ByteBuffer byteBufferM171334a = p94Var.m171334a();
            if (this.f188579d != null && byteBufferM171334a != null) {
                try {
                    mo130090j(new IDFrame(p94Var.f151106q, p94Var.m171337d(), p94Var.m171336c(), iM205894B, p94Var.m171335b(), 1));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            this.f188590o.set(false);
            as4 as4Var = this.f188601z;
            if (as4Var == null || !as4Var.m99878k(p94Var)) {
                return;
            }
            if (this.f188596u) {
                m205909c0();
            } else {
                m205949X();
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m205952q0(xxb xxbVar) {
        this.f188576a = xxbVar;
    }

    /* JADX INFO: renamed from: r0 */
    public void m205953r0(boolean z) {
        this.f188566B = z;
    }

    /* JADX INFO: renamed from: s0 */
    public void m205954s0(Bitmap bitmap) {
        t0g0.m188742e(t0g0.C20202a.f171516d, null);
        this.f188584i = bitmap;
    }

    /* JADX INFO: renamed from: t0 */
    public void m205955t0(Bitmap bitmap) {
        t0g0.m188742e(t0g0.C20202a.f171516d, null);
        this.f188585j = bitmap;
    }

    /* JADX INFO: renamed from: u0 */
    public void m205956u0(Bitmap bitmap) {
        t0g0.m188742e(t0g0.C20202a.f171516d, null);
        this.f188583h = bitmap;
    }

    /* JADX INFO: renamed from: v0 */
    public void m205957v0(Bitmap bitmap) {
        t0g0.m188742e(t0g0.C20202a.f171516d, null);
        this.f188580e = bitmap;
        afm.m97360H().m97428W0(bitmap);
    }

    /* JADX INFO: renamed from: w0 */
    public void m205958w0(boolean z) {
        this.f188570F = z;
    }

    /* JADX INFO: renamed from: x0 */
    public void m205959x0() {
        m205918n0(new RunnableC21082f());
    }

    /* JADX INFO: renamed from: y0 */
    public void m205960y0(String str) {
        this.f188597v = str;
        afm.m97360H().m97401M1(str);
    }

    /* JADX INFO: renamed from: z0 */
    public void m205961z0(boolean z) {
        this.f188596u = z;
    }

    @Override // p153l.zpl
    /* JADX INFO: renamed from: e0 */
    public void mo18965e0() {
    }

    @Override // p153l.gfm
    public void preProcess() {
    }
}
