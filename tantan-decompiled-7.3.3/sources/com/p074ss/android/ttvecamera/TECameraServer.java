package com.p074ss.android.ttvecamera;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Printer;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bytedance.bpea.basics.Cert;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p074ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmParam;
import com.p074ss.android.ttvecamera.systemresmanager.TESystemResManager;
import com.tencent.liteav.audio.TXEAudioDef;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p153l.azk0;
import p153l.dsh0;
import p153l.esh0;
import p153l.hj3;
import p153l.hrh0;
import p153l.j26;
import p153l.jrh0;
import p153l.wg3;

/* JADX INFO: loaded from: classes11.dex */
public enum TECameraServer {
    INSTANCE;

    private static final String TAG = "TECameraServer";

    @GuardedBy("mLock")
    private C13494d mCameraClient;
    private volatile AbstractC13487c mCameraInstance;
    private TECameraSettings mCameraSettings;
    private Runnable mCheckCloseTask;
    private C13494d.a mFpsConfigCallback;
    private Handler mHandler;
    private HandlerThread mHandlerThread;
    private volatile boolean mIsCameraPendingClose;
    private volatile boolean mIsCameraProviderChanged;
    private volatile boolean mIsInitialized;
    private C13494d.d mPictureSizeCallback;
    jrh0 mProviderManager;
    private jrh0.C18019a mProviderSettings;
    private TECameraSettings.InterfaceC13475m mSATZoomCallback;
    private TESystemResManager mSystemResManager;
    private volatile boolean mHandlerDestroyed = true;
    private float mCurrentZoom = 0.0f;
    private C13494d.b mCameraObserver = new C13494d.c();
    private C13494d.e mPreviewSizeCallback = null;
    private final Object mStateLock = new Object();

    @GuardedBy("mStateLock")
    private volatile int mCurrentCameraState = 0;
    private final Object mLock = new Object();

    @GuardedBy("this")
    private volatile int sClientCount = 0;
    private long mOpenTime = 0;
    private long mBeginTime = 0;
    private int mRetryCnt = -1;
    private boolean mStartPreviewError = false;
    private final ConditionVariable mCameraClientCondition = new ConditionVariable();
    private final ConcurrentHashMap<String, String> mOpenInfoMap = new ConcurrentHashMap<>();
    private Handler mMainHandler = new Handler(Looper.getMainLooper());
    private Cert cachedOpenPrivacyCert = null;
    private Cert cachedClosePrivacyCert = null;
    private boolean mOnBackGround = false;
    private boolean mFirstEC = true;
    private boolean mFirstZoom = true;
    private boolean mEnableVBoost = false;
    private int mVBoostTimeoutMS = 0;
    private boolean mIsForegroundVisible = false;
    private int mCameraCloseTaskHandlerId = -1;
    private volatile boolean mIsCameraSwitchState = false;
    private AbstractC13487c.a mCameraEvent = new C13438n0();
    private final AbstractC13487c.b mFpsConfigCallbackProxy = new C13440o0();
    private final AbstractC13487c.d mPictureSizeCallBack = new C13442p0();
    private final AbstractC13487c.e mBasePreviewSizeCallback = new C13444q0();
    private AbstractC13487c.f satZoomCallback = new C13448s0();

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$a */
    public class RunnableC13409a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f56010a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f56011b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Cert f56012c;

        public RunnableC13409a(long j, boolean z, Cert cert) {
            this.f56010a = j;
            this.f56011b = z;
            this.f56012c = cert;
        }

        @Override // java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f56010a;
            C13504g.m82001e(TECameraServer.TAG, "Push close task cost: " + jCurrentTimeMillis);
            TECameraServer.this.close(this.f56011b, this.f56012c);
            TECameraServer.this.mIsCameraPendingClose = false;
            if (this.f56011b) {
                TECameraServer.this.mCameraClientCondition.open();
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f56010a;
            hrh0.m136853b("te_record_camera_push_close_task_time", jCurrentTimeMillis);
            hrh0.m136853b("te_record_camera_close_cost", jCurrentTimeMillis2);
            C13504g.m82002f("te_record_camera_close_cost", Long.valueOf(jCurrentTimeMillis2));
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$a0 */
    public class RunnableC13410a0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56014a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f56015b;

        public RunnableC13410a0(C13494d c13494d, boolean z) {
            this.f56014a = c13494d;
            this.f56015b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setAutoFocusLock(this.f56014a, this.f56015b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$a1 */
    public class RunnableC13411a1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56017a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f56018b;

        public RunnableC13411a1(C13494d c13494d, boolean z) {
            this.f56017a = c13494d;
            this.f56018b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.stop(this.f56017a, this.f56018b);
            if (this.f56018b) {
                TECameraServer.this.mCameraClientCondition.open();
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$b */
    public class RunnableC13412b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56020a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f56021b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Cert f56022c;

        public RunnableC13412b(C13494d c13494d, int i, Cert cert) {
            this.f56020a = c13494d;
            this.f56021b = i;
            this.f56022c = cert;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.switchCamera(this.f56020a, this.f56021b, this.f56022c);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$b0 */
    public class RunnableC13413b0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56024a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f56025b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f56026c;

        public RunnableC13413b0(C13494d c13494d, boolean z, String str) {
            this.f56024a = c13494d;
            this.f56025b = z;
            this.f56026c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setWhileBalance(this.f56024a, this.f56025b, this.f56026c);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$b1 */
    public static class C13414b1 implements Handler.Callback {

        /* JADX INFO: renamed from: a */
        private WeakReference<TECameraServer> f56028a;

        public C13414b1(TECameraServer tECameraServer) {
            this.f56028a = new WeakReference<>(tECameraServer);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            Object obj = message.obj;
            TECameraServer tECameraServer = this.f56028a.get();
            if (i == 1) {
                C13504g.m81997a(TECameraServer.TAG, "startZoom...");
                synchronized (tECameraServer.mStateLock) {
                    try {
                        if (tECameraServer.mCameraInstance != null) {
                            tECameraServer.mCameraInstance.mo81783w0(message.arg1 / 100.0f, (TECameraSettings.InterfaceC13478p) obj);
                        }
                        if (tECameraServer.mFirstZoom) {
                            tECameraServer.mCameraEvent.mo81680e(114, 0, "startzoom", tECameraServer.mCameraInstance);
                            tECameraServer.mFirstZoom = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$c */
    public class RunnableC13415c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56029a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ TECameraSettings f56030b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Cert f56031c;

        public RunnableC13415c(C13494d c13494d, TECameraSettings tECameraSettings, Cert cert) {
            this.f56029a = c13494d;
            this.f56030b = tECameraSettings;
            this.f56031c = cert;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.switchCamera(this.f56029a, this.f56030b, this.f56031c);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$c0 */
    public class RunnableC13416c0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56033a;

        public RunnableC13416c0(C13494d c13494d, TECameraSettings.InterfaceC13470h interfaceC13470h) {
            this.f56033a = c13494d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TECameraServer.this.getISORange(this.f56033a, null) != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$d */
    public class RunnableC13417d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56035a;

        public RunnableC13417d(C13494d c13494d, TECameraSettings.InterfaceC13467e interfaceC13467e) {
            this.f56035a = c13494d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.getFOV(this.f56035a, null);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$d0 */
    public class RunnableC13418d0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56037a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f56038b;

        public RunnableC13418d0(C13494d c13494d, int i) {
            this.f56037a = c13494d;
            this.f56038b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setISO(this.f56037a, this.f56038b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$e */
    public class RunnableC13419e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ hj3 f56040a;

        public RunnableC13419e(TECameraSettings.InterfaceC13465c interfaceC13465c, hj3 hj3Var) {
            this.f56040a = hj3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (TECameraServer.this.mStateLock) {
                try {
                    if (TECameraServer.this.mCurrentCameraState == 3) {
                        if (TECameraServer.this.mCameraSettings.f56177b == 1) {
                            TECameraServer.this.updateCameraState(2);
                        }
                        TECameraServer.this.mCameraInstance.mo81811d(this.f56040a, null);
                    } else {
                        String str = "Can not takePicture on state : " + TECameraServer.this.mCurrentCameraState;
                        TECameraServer.this.mCameraObserver.onError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, str);
                        C13504g.m81998b(TECameraServer.TAG, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$e0 */
    public class RunnableC13420e0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56042a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ TECameraSettings.InterfaceC13469g f56043b;

        public RunnableC13420e0(C13494d c13494d, TECameraSettings.InterfaceC13469g interfaceC13469g) {
            this.f56042a = c13494d;
            this.f56043b = interfaceC13469g;
        }

        @Override // java.lang.Runnable
        public void run() {
            int iso = TECameraServer.this.getISO(this.f56042a, this.f56043b);
            if (iso >= 0) {
                this.f56043b.mo81691a(iso);
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$f */
    public class RunnableC13421f implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f56045a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f56046b;

        public RunnableC13421f(TECameraSettings.InterfaceC13474l interfaceC13474l, int i, int i2) {
            this.f56045a = i;
            this.f56046b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (TECameraServer.this.mStateLock) {
                try {
                    if (TECameraServer.this.mCurrentCameraState == 3) {
                        if (TECameraServer.this.mCameraSettings.f56177b == 1) {
                            TECameraServer.this.updateCameraState(2);
                        }
                        TECameraServer.this.mCameraInstance.mo81746D0(this.f56045a, this.f56046b, null);
                    } else {
                        String str = "Can not takePicture on state : " + TECameraServer.this.mCurrentCameraState;
                        TECameraServer.this.mCameraObserver.onError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, str);
                        C13504g.m81998b(TECameraServer.TAG, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$f0 */
    public class RunnableC13422f0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56048a;

        public RunnableC13422f0(C13494d c13494d, TECameraSettings.InterfaceC13477o interfaceC13477o) {
            this.f56048a = c13494d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TECameraServer.this.getShutterTimeRange(this.f56048a, null) != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$g */
    public class RunnableC13423g implements Runnable {
        public RunnableC13423g(TECameraSettings.InterfaceC13474l interfaceC13474l) {
        }

        @Override // java.lang.Runnable
        public void run() {
            C13504g.m82001e(TECameraServer.TAG, "takePicture");
            synchronized (TECameraServer.this.mStateLock) {
                try {
                    if (TECameraServer.this.mCurrentCameraState == 3) {
                        if (TECameraServer.this.mCameraSettings.f56177b == 1) {
                            TECameraServer.this.updateCameraState(2);
                        }
                        TECameraServer.this.mCameraInstance.mo81747E0(null);
                    } else {
                        String str = "Can not takePicture on state : " + TECameraServer.this.mCurrentCameraState;
                        TECameraServer.this.mCameraObserver.onError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, str);
                        C13504g.m81998b(TECameraServer.TAG, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$g0 */
    public class RunnableC13424g0 implements Runnable {
        public RunnableC13424g0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TECameraServer.this.mCurrentCameraState <= 1 || TECameraServer.this.mCurrentCameraState >= 4) {
                if (TECameraServer.this.mCurrentCameraState == 1) {
                    TECameraServer.this.mMainHandler.postDelayed(this, 2000L);
                    return;
                }
                return;
            }
            C13504g.m82001e(TECameraServer.TAG, "close camera in main thread");
            if (!TECameraServer.this.mCameraSettings.f56166R || TECameraServer.this.mCameraInstance == null) {
                TECameraServer tECameraServer = TECameraServer.this;
                tECameraServer.realCloseCamera(tECameraServer.cachedClosePrivacyCert);
            } else {
                TECameraServer.this.updateCameraState(4);
                TECameraServer.this.mCameraInstance.mo81773n(TECameraServer.this.cachedClosePrivacyCert);
                TECameraServer.this.updateCameraState(0);
            }
            if (TECameraServer.this.decreaseClientCount() == 0) {
                TECameraServer.this.destroy();
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$h */
    public class RunnableC13425h implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56052a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ TEFocusSettings f56053b;

        public RunnableC13425h(C13494d c13494d, TEFocusSettings tEFocusSettings) {
            this.f56052a = c13494d;
            this.f56053b = tEFocusSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            int iFocusAtPoint = TECameraServer.this.focusAtPoint(this.f56052a, this.f56053b);
            if (iFocusAtPoint == 0 || this.f56053b.m81703g() == null) {
                return;
            }
            this.f56053b.m81703g().mo81717a(iFocusAtPoint, TECameraServer.this.mCameraSettings.f56181d, "");
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$h0 */
    public class RunnableC13426h0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56055a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ long f56056b;

        public RunnableC13426h0(C13494d c13494d, long j) {
            this.f56055a = c13494d;
            this.f56056b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setShutterTime(this.f56055a, this.f56056b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$i */
    public class RunnableC13427i implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56058a;

        public RunnableC13427i(C13494d c13494d) {
            this.f56058a = c13494d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.cancelFocus(this.f56058a);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$i0 */
    public class RunnableC13428i0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56060a;

        public RunnableC13428i0(C13494d c13494d, TECameraSettings.InterfaceC13463a interfaceC13463a) {
            this.f56060a = c13494d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TECameraServer.this.getApertureRange(this.f56060a, null) != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$j */
    public class RunnableC13429j implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56062a;

        public RunnableC13429j(C13494d c13494d) {
            this.f56062a = c13494d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.enableCaf(this.f56062a);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$j0 */
    public class RunnableC13430j0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56064a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ float f56065b;

        public RunnableC13430j0(C13494d c13494d, float f) {
            this.f56064a = c13494d;
            this.f56065b = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setAperture(this.f56064a, this.f56065b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$k */
    public class RunnableC13431k implements Runnable {
        public RunnableC13431k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.mProviderManager.m146747k();
            C13504g.m82001e(TECameraServer.TAG, "provider release...");
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$k0 */
    public class RunnableC13432k0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56068a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f56069b;

        public RunnableC13432k0(C13494d c13494d, boolean z) {
            this.f56068a = c13494d;
            this.f56069b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.toggleTorch(this.f56068a, this.f56069b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$l */
    public class RunnableC13433l implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56071a;

        public RunnableC13433l(C13494d c13494d, TECameraSettings.InterfaceC13471i interfaceC13471i) {
            this.f56071a = c13494d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TECameraServer.this.getManualFocusAbility(this.f56071a, null) >= 0.0f) {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$l0 */
    public class RunnableC13434l0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56073a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f56074b;

        public RunnableC13434l0(C13494d c13494d, int i) {
            this.f56073a = c13494d;
            this.f56074b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.switchFlashMode(this.f56073a, this.f56074b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$m */
    public class RunnableC13435m implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56076a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ float f56077b;

        public RunnableC13435m(C13494d c13494d, float f) {
            this.f56076a = c13494d;
            this.f56077b = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setManualFocusDistance(this.f56076a, this.f56077b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$m0 */
    public class C13436m0 implements Printer {

        /* JADX INFO: renamed from: a */
        private long f56079a = 0;

        /* JADX INFO: renamed from: b */
        private int f56080b = 0;

        /* JADX INFO: renamed from: c */
        private long f56081c = 0;

        public C13436m0() {
        }

        @Override // android.util.Printer
        public void println(String str) {
            if (str.startsWith(">>>>> Dispatching to Handler")) {
                this.f56079a = System.currentTimeMillis();
                return;
            }
            if (str.startsWith("<<<<< Finished to Handler")) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f56079a;
                if (jCurrentTimeMillis > 1000) {
                    int i = this.f56080b + 1;
                    this.f56080b = i;
                    hrh0.m136853b("te_record_camera_task_time_out_count", i);
                    if (jCurrentTimeMillis > this.f56081c) {
                        this.f56081c = jCurrentTimeMillis;
                        hrh0.m136853b("te_record_camera_max_lag_task_cost", jCurrentTimeMillis);
                        C13504g.m82001e(TECameraServer.TAG, "task: " + str + ", cost: " + jCurrentTimeMillis + "ms");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$n */
    public class RunnableC13437n implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f56083a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f56084b;

        public RunnableC13437n(int i, int i2) {
            this.f56083a = i;
            this.f56084b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TECameraServer.this.mCurrentCameraState == 3) {
                TECameraServer.this.mCameraInstance.mo81774n0(this.f56083a, this.f56084b);
                return;
            }
            C13504g.m81998b(TECameraServer.TAG, "set picture size failed, w: " + this.f56083a + ", h: " + this.f56084b + ", state: " + TECameraServer.this.mCurrentCameraState);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$n0 */
    public class C13438n0 implements AbstractC13487c.a {

        /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$n0$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                TECameraServer.this.handlePreviewingFallback();
            }
        }

        /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$n0$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                TECameraServer tECameraServer = TECameraServer.this;
                tECameraServer.start(tECameraServer.mCameraClient);
            }
        }

        public C13438n0() {
        }

        @Override // com.p074ss.android.ttvecamera.AbstractC13487c.a
        /* JADX INFO: renamed from: a */
        public void mo81676a(int i, int i2, int i3, String str, Object obj) {
            C13504g.m82001e(TECameraServer.TAG, "startCapture success!");
            TECameraServer.this.mStartPreviewError = false;
            if (TECameraServer.this.mCameraSettings == null || TECameraServer.this.mCameraInstance == null) {
                mo81680e(i2, i3, str, obj);
            } else {
                int iM81829L = TECameraServer.this.mCameraSettings.f56219w - TECameraServer.this.mCameraInstance.m81829L();
                mo81680e(i2, iM81829L, str + ", Retry preview times = " + iM81829L, obj);
                TECameraServer.this.mCameraInstance.mo81765g();
            }
            hrh0.m136853b("te_record_camera_preview_ret", 0L);
        }

        @Override // com.p074ss.android.ttvecamera.AbstractC13487c.a
        /* JADX INFO: renamed from: b */
        public void mo81677b(int i, int i2, String str, Object obj) {
            if (TECameraServer.this.mCameraSettings.f56188g0 && i2 == -437) {
                hrh0.m136853b("te_record_camera_preview_ret", i2);
                Handler handler = TECameraServer.this.mHandler;
                if (handler == null) {
                    return;
                }
                handler.post(new a());
                return;
            }
            synchronized (TECameraServer.this.mStateLock) {
                try {
                    if (TECameraServer.this.mCameraInstance == null || TECameraServer.this.mCameraInstance.m81829L() <= 0) {
                        mo81678c(i, i2, str, obj);
                        hrh0.m136853b("te_record_camera_preview_ret", i2);
                    } else {
                        TECameraServer.this.mStartPreviewError = true;
                        C13504g.m82006j(TECameraServer.TAG, "Retry to startPreview. " + TECameraServer.this.mCameraInstance.m81829L() + " times is waiting to retry.");
                        TECameraServer.this.mCameraInstance.m81839e0();
                        Handler handler2 = TECameraServer.this.mHandler;
                        if (handler2 == null) {
                        } else {
                            handler2.postDelayed(new b(), 100L);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.p074ss.android.ttvecamera.AbstractC13487c.a
        /* JADX INFO: renamed from: c */
        public void mo81678c(int i, int i2, String str, Object obj) {
            C13504g.m81998b(TECameraServer.TAG, "onCameraError: code = " + i2 + ", msg = " + str);
            TECameraServer.this.mCameraObserver.onError(i2, "Open camera failed @" + TECameraServer.this.mCameraSettings.f56177b + ",face:" + TECameraServer.this.mCameraSettings.f56181d + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + TECameraServer.this.mCameraSettings.f56207q.toString() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str);
        }

        @Override // com.p074ss.android.ttvecamera.AbstractC13487c.a
        /* JADX INFO: renamed from: d */
        public void mo81679d(int i, int i2, int i3, String str, Object obj) {
            C13504g.m82001e(TECameraServer.TAG, "stopCapture success!");
            mo81680e(i2, i3, str, obj);
        }

        @Override // com.p074ss.android.ttvecamera.AbstractC13487c.a
        /* JADX INFO: renamed from: e */
        public void mo81680e(int i, int i2, String str, Object obj) {
            C13504g.m81997a(TECameraServer.TAG, "onCameraInfo: " + i + ", ext: " + i2 + " msg: " + str);
            if (i == 108) {
                TECameraServer.this.updateCameraState(4);
            } else if (i == 109) {
                TECameraServer.this.updateCameraState(0);
            }
            TECameraServer.this.mCameraObserver.onInfo(i, i2, str);
        }

        @Override // com.p074ss.android.ttvecamera.AbstractC13487c.a
        /* JADX INFO: renamed from: f */
        public void mo81681f(int i, int i2, AbstractC13487c abstractC13487c, Object obj) {
            dsh0.m117758a("TECameraServer-onCameraOpened: cameraType " + i + ", ret " + i2);
            TECameraServer.this.mOpenTime = System.currentTimeMillis() - TECameraServer.this.mBeginTime;
            C13504g.m82001e(TECameraServer.TAG, "onCameraOpened: CameraType = " + TECameraServer.this.mCameraSettings.f56177b + ", Ret = " + i2 + ",retryCnt = " + TECameraServer.this.mRetryCnt);
            ConcurrentHashMap concurrentHashMap = TECameraServer.this.mOpenInfoMap;
            StringBuilder sb = new StringBuilder("CamType");
            sb.append(TECameraServer.this.mRetryCnt);
            concurrentHashMap.put(sb.toString(), String.valueOf(TECameraServer.this.mCameraSettings.f56177b));
            TECameraServer.this.mOpenInfoMap.put("Ret" + TECameraServer.this.mRetryCnt, String.valueOf(i2));
            TECameraServer.this.mOpenInfoMap.put("OpenTime" + TECameraServer.this.mRetryCnt, String.valueOf(TECameraServer.this.mOpenTime));
            TECameraServer tECameraServer = TECameraServer.this;
            if (i2 == 0) {
                tECameraServer.mRetryCnt = tECameraServer.mCameraSettings.f56217v;
                synchronized (TECameraServer.this.mStateLock) {
                    if (TECameraServer.this.mCurrentCameraState != 1) {
                        C13504g.m82006j(TECameraServer.TAG, "Open camera error ? May be closed now!!, state = " + TECameraServer.this.mCurrentCameraState);
                        return;
                    }
                    TECameraServer.this.updateCameraState(2);
                    TECameraServer.this.mCameraObserver.onCaptureStarted(i, i2);
                    int i3 = TECameraServer.this.mCameraSettings.f56217v - TECameraServer.this.mRetryCnt;
                    TECameraServer.this.mCameraObserver.onInfo(120, i3, "Retry open camera times = " + i3);
                    TECameraServer.this.mOpenInfoMap.put("ResultType", "Open Success");
                    hrh0.m136853b("te_record_camera_open_ret", (long) i2);
                    hrh0.m136853b("te_record_camera_open_cost", TECameraServer.this.mOpenTime);
                    hrh0.m136854c("te_record_camera_open_info", TECameraServer.this.mOpenInfoMap.toString());
                    C13504g.m82001e("VESDKCOST", "TE_RECORD_CAMERA_OPEN_COST " + TECameraServer.this.mOpenTime);
                    TECameraServer.this.mOpenInfoMap.clear();
                }
            } else if (tECameraServer.mCameraSettings.f56177b == 11 && i2 == -428) {
                C13504g.m82001e(TECameraServer.TAG, "CameraUnit auth failed, fall back to camera2");
                TECameraServer tECameraServer2 = TECameraServer.this;
                tECameraServer2.mRetryCnt = tECameraServer2.mCameraSettings.f56217v;
                synchronized (TECameraServer.this.mStateLock) {
                    try {
                        if (TECameraServer.this.mCurrentCameraState == 0) {
                            C13504g.m82006j(TECameraServer.TAG, "onCameraOpened, no need to close camera, state: " + TECameraServer.this.mCurrentCameraState);
                            TECameraServer.this.mCameraInstance = null;
                        } else {
                            TECameraServer.this.updateCameraState(4);
                            if (TECameraServer.this.mCameraInstance != null) {
                                TECameraServer.this.mCameraInstance.mo81764f(TECameraServer.this.cachedOpenPrivacyCert);
                                TECameraServer.this.mCameraInstance = null;
                            }
                            TECameraServer.this.updateCameraState(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                TECameraServer.this.mCameraSettings.f56177b = 2;
                TECameraServer.INSTANCE.open(TECameraServer.this.mCameraClient, TECameraServer.this.mCameraSettings, TECameraServer.this.cachedOpenPrivacyCert);
                TECameraServer.this.mOpenInfoMap.put("ResultType", "fallback to Camera2");
                hrh0.m136854c("te_record_camera_open_info", TECameraServer.this.mOpenInfoMap.toString());
                TECameraServer.this.mOpenInfoMap.clear();
            } else if (i2 != -403 && i2 != -408 && TECameraServer.this.mRetryCnt > 0 && TECameraServer.this.isCameraPermitted()) {
                TECameraServer.this.mCameraObserver.onError(-404, "Retry to Open Camera Failed @" + TECameraServer.this.mCameraSettings.f56177b + ",face:" + TECameraServer.this.mCameraSettings.f56181d + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + TECameraServer.this.mCameraSettings.f56207q.toString());
                boolean z = TECameraServer.this.mIsCameraPendingClose;
                TECameraServer tECameraServer3 = TECameraServer.this;
                if (z) {
                    tECameraServer3.mIsCameraPendingClose = false;
                    C13504g.m81998b(TECameraServer.TAG, "retry to open camera, but camera close was called");
                    TECameraServer.this.mRetryCnt = -1;
                    TECameraServer.this.mOpenInfoMap.put("ResultType" + TECameraServer.this.mRetryCnt, "retry to open camera");
                    hrh0.m136854c("te_record_camera_open_info", TECameraServer.this.mOpenInfoMap.toString());
                    return;
                }
                if (tECameraServer3.mCameraSettings.f56175a == null) {
                    TECameraServer.this.mRetryCnt = -1;
                    C13504g.m81998b(TECameraServer.TAG, "abort retry to open camera, no context: " + TECameraServer.this.mCameraSettings);
                    return;
                }
                if (i == 2 && TECameraServer.this.mRetryCnt == TECameraServer.this.mCameraSettings.f56217v && (i2 == 4 || i2 == 5 || i2 == 1)) {
                    C13504g.m82001e(TECameraServer.TAG, "camera2 is not available");
                    TECameraServer tECameraServer4 = TECameraServer.this;
                    tECameraServer4.mRetryCnt = tECameraServer4.mCameraSettings.f56221x;
                }
                try {
                    Thread.sleep(30L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                C13504g.m82001e(TECameraServer.TAG, "retry to open camera, mRetryCnt = " + TECameraServer.this.mRetryCnt);
                synchronized (TECameraServer.this.mStateLock) {
                    try {
                        if (TECameraServer.this.mCurrentCameraState == 0) {
                            C13504g.m82006j(TECameraServer.TAG, "onCameraOpened, no need to close camera, state: " + TECameraServer.this.mCurrentCameraState);
                            TECameraServer.this.mCameraInstance = null;
                        } else {
                            TECameraServer.this.updateCameraState(4);
                            if (TECameraServer.this.mCameraInstance != null) {
                                TECameraServer.this.mCameraInstance.mo81764f(TECameraServer.this.cachedOpenPrivacyCert);
                                TECameraServer.this.mCameraInstance = null;
                            }
                            TECameraServer.this.updateCameraState(0);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                TECameraServer.access$1810(TECameraServer.this);
                TECameraServer.INSTANCE.open(TECameraServer.this.mCameraClient, TECameraServer.this.mCameraSettings, TECameraServer.this.cachedOpenPrivacyCert);
                TECameraServer.this.mOpenInfoMap.put("ResultType" + TECameraServer.this.mRetryCnt, "retry to open camera");
                hrh0.m136854c("te_record_camera_open_info", TECameraServer.this.mOpenInfoMap.toString());
            } else if ((!TECameraServer.this.mCameraSettings.f56160L || i == 1 || i2 == -408) && i2 != -403) {
                TECameraServer.this.mCameraObserver.onCaptureStarted(i, i2);
                C13504g.m82001e(TECameraServer.TAG, "finally go to the error.");
                hrh0.m136853b("te_record_camera_open_ret", i2);
                TECameraServer.this.mCameraObserver.onError(i2, "Open camera failed @" + TECameraServer.this.mCameraSettings.f56177b + ",face:" + TECameraServer.this.mCameraSettings.f56181d + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + TECameraServer.this.mCameraSettings.f56207q.toString());
                TECameraServer.INSTANCE.close(TECameraServer.this.cachedOpenPrivacyCert);
                TECameraServer.this.mRetryCnt = -1;
                hrh0.m136854c("te_record_camera_open_info", TECameraServer.this.mOpenInfoMap.toString());
                TECameraServer.this.mOpenInfoMap.clear();
            } else {
                C13504g.m82001e(TECameraServer.TAG, "Open camera failed, fall back to camera1");
                TECameraServer tECameraServer5 = TECameraServer.this;
                tECameraServer5.mRetryCnt = tECameraServer5.mCameraSettings.f56217v;
                synchronized (TECameraServer.this.mStateLock) {
                    try {
                        if (TECameraServer.this.mCurrentCameraState == 0) {
                            C13504g.m82006j(TECameraServer.TAG, "onCameraOpened, no need to close camera, state: " + TECameraServer.this.mCurrentCameraState);
                            TECameraServer.this.mCameraInstance = null;
                        } else {
                            TECameraServer.this.updateCameraState(4);
                            if (TECameraServer.this.mCameraInstance != null) {
                                TECameraServer.this.mCameraInstance.mo81764f(TECameraServer.this.cachedOpenPrivacyCert);
                                TECameraServer.this.mCameraInstance = null;
                            }
                            TECameraServer.this.updateCameraState(0);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                TECameraServer.this.mCameraSettings.f56177b = 1;
                TECameraServer.this.mCameraEvent.mo81680e(51, 0, "need recreate surfacetexture", null);
                TECameraServer.INSTANCE.open(TECameraServer.this.mCameraClient, TECameraServer.this.mCameraSettings, TECameraServer.this.cachedOpenPrivacyCert);
                TECameraServer.this.mOpenInfoMap.put("ResultType", "fallback to Camera1");
                hrh0.m136854c("te_record_camera_open_info", TECameraServer.this.mOpenInfoMap.toString());
            }
            dsh0.m117759b();
        }

        @Override // com.p074ss.android.ttvecamera.AbstractC13487c.a
        /* JADX INFO: renamed from: g */
        public void mo81682g(int i, int i2, int i3, String str, Object obj) {
            StringBuilder sb = new StringBuilder("onTorchError ");
            sb.append(str);
            sb.append(i3 == 0 ? " close" : " open");
            C13504g.m82001e(TECameraServer.TAG, sb.toString());
        }

        @Override // com.p074ss.android.ttvecamera.AbstractC13487c.a
        /* JADX INFO: renamed from: h */
        public void mo81683h(int i, int i2, int i3, String str, Object obj) {
            StringBuilder sb = new StringBuilder("onTorchSuccess ");
            sb.append(str);
            sb.append(i3 == 0 ? " close" : " open");
            C13504g.m82001e(TECameraServer.TAG, sb.toString());
        }

        @Override // com.p074ss.android.ttvecamera.AbstractC13487c.a
        /* JADX INFO: renamed from: i */
        public void mo81684i(int i, AbstractC13487c abstractC13487c, Object obj) {
            C13504g.m82001e(TECameraServer.TAG, "onCameraClosed, CameraState = " + TECameraServer.this.mCurrentCameraState);
            if (abstractC13487c == TECameraServer.this.mCameraInstance) {
                synchronized (TECameraServer.this.mStateLock) {
                    TECameraServer.this.updateCameraState(0);
                }
                TECameraServer.this.mCameraObserver.onCaptureStopped(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$o */
    public class RunnableC13439o implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f56089a;

        public RunnableC13439o(int i) {
            this.f56089a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TECameraServer.this.mCameraInstance != null) {
                TECameraServer.this.mCameraInstance.mo81779r0(this.f56089a);
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$o0 */
    public class C13440o0 implements AbstractC13487c.b {
        public C13440o0() {
        }

        @Override // com.p074ss.android.ttvecamera.AbstractC13487c.b
        /* JADX INFO: renamed from: a */
        public int[] mo81685a(List<int[]> list) {
            TECameraServer.access$2700(TECameraServer.this);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$p */
    public class RunnableC13441p implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56092a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ TECameraSettings.InterfaceC13478p f56093b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f56094c;

        public RunnableC13441p(C13494d c13494d, TECameraSettings.InterfaceC13478p interfaceC13478p, boolean z) {
            this.f56092a = c13494d;
            this.f56093b = interfaceC13478p;
            this.f56094c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.queryZoomAbility(this.f56092a, this.f56093b, this.f56094c);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$p0 */
    public class C13442p0 implements AbstractC13487c.d {
        public C13442p0() {
        }

        @Override // com.p074ss.android.ttvecamera.AbstractC13487c.d
        /* JADX INFO: renamed from: a */
        public TEFrameSizei mo81686a(List<TEFrameSizei> list, List<TEFrameSizei> list2) {
            TECameraServer.access$2800(TECameraServer.this);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$q */
    public class RunnableC13443q implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56097a;

        public RunnableC13443q(C13494d c13494d, TECameraSettings.InterfaceC13476n interfaceC13476n) {
            this.f56097a = c13494d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.queryShaderZoomStep(this.f56097a, null);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$q0 */
    public class C13444q0 implements AbstractC13487c.e {
        public C13444q0() {
        }

        @Override // com.p074ss.android.ttvecamera.AbstractC13487c.e
        public TEFrameSizei getPreviewSize(List<TEFrameSizei> list) {
            if (TECameraServer.this.mPreviewSizeCallback != null) {
                try {
                    return TECameraServer.this.mPreviewSizeCallback.getPreviewSize(list);
                } catch (Exception e) {
                    C13504g.m81998b(TECameraServer.TAG, "select preview size from client err: " + e.getMessage());
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$r */
    public class RunnableC13445r implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56100a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ TECameraSettings.InterfaceC13478p f56101b;

        public RunnableC13445r(C13494d c13494d, TECameraSettings.InterfaceC13478p interfaceC13478p) {
            this.f56100a = c13494d;
            this.f56101b = interfaceC13478p;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.stopZoom(this.f56100a, this.f56101b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$r0 */
    public class RunnableC13446r0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56103a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f56104b;

        public RunnableC13446r0(C13494d c13494d, int i) {
            this.f56103a = c13494d;
            this.f56104b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.switchCameraMode(this.f56103a, this.f56104b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$s */
    public class RunnableC13447s implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56106a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ float f56107b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ TECameraSettings.InterfaceC13478p f56108c;

        public RunnableC13447s(C13494d c13494d, float f, TECameraSettings.InterfaceC13478p interfaceC13478p) {
            this.f56106a = c13494d;
            this.f56107b = f;
            this.f56108c = interfaceC13478p;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.zoomV2(this.f56106a, this.f56107b, this.f56108c);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$s0 */
    public class C13448s0 implements AbstractC13487c.f {
        public C13448s0() {
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$t */
    public class RunnableC13449t implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56111a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Bundle f56112b;

        public RunnableC13449t(C13494d c13494d, Bundle bundle) {
            this.f56111a = c13494d;
            this.f56112b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setFeatureParameters(this.f56111a, this.f56112b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$t0 */
    public class RunnableC13450t0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56114a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f56115b;

        public RunnableC13450t0(C13494d c13494d, int i, AbstractC13487c.c cVar) {
            this.f56114a = c13494d;
            this.f56115b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.changeRecorderState(this.f56114a, this.f56115b, null);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$u */
    public class RunnableC13451u implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56117a;

        public RunnableC13451u(C13494d c13494d, TECameraSettings.C13472j c13472j) {
            this.f56117a = c13494d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.process(this.f56117a, null);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$u0 */
    public class RunnableC13452u0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56119a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f56120b;

        public RunnableC13452u0(C13494d c13494d, boolean z) {
            this.f56119a = c13494d;
            this.f56120b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.enableMulticamZoom(this.f56119a, this.f56120b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$v */
    public class RunnableC13453v implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f56122a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C13494d f56123b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ TECameraSettings f56124c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Cert f56125d;

        public RunnableC13453v(long j, C13494d c13494d, TECameraSettings tECameraSettings, Cert cert) {
            this.f56122a = j;
            this.f56123b = c13494d;
            this.f56124c = tECameraSettings;
            this.f56125d = cert;
        }

        @Override // java.lang.Runnable
        public void run() {
            C13504g.m81997a(TECameraServer.TAG, "Push open task cost: " + (System.currentTimeMillis() - this.f56122a));
            hrh0.m136853b("te_record_camera_push_open_task_time", System.currentTimeMillis() - this.f56122a);
            TECameraServer.this.open(this.f56123b, this.f56124c, this.f56125d);
            C13504g.m82001e(TECameraServer.TAG, "Camera open cost: " + (System.currentTimeMillis() - this.f56122a) + "ms");
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$v0 */
    public class RunnableC13454v0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56127a;

        public RunnableC13454v0(C13494d c13494d, TECameraSettings.InterfaceC13464b interfaceC13464b) {
            this.f56127a = c13494d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.getCameraCapbilitiesForBytebench(this.f56127a, null);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$w */
    public class RunnableC13455w implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f56129a;

        public RunnableC13455w(int i) {
            this.f56129a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (TECameraServer.this.mStateLock) {
                try {
                    if (TECameraServer.this.mCameraInstance == null) {
                        return;
                    }
                    boolean zMo81769j0 = TECameraServer.this.mCameraInstance.mo81769j0(this.f56129a);
                    if (TECameraServer.this.mFirstEC && zMo81769j0) {
                        TECameraServer.this.mCameraEvent.mo81680e(115, 0, "exposure compensation", TECameraServer.this.mCameraInstance);
                        TECameraServer.this.mFirstEC = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$w0 */
    public class RunnableC13456w0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56131a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ jrh0.C18019a f56132b;

        public RunnableC13456w0(C13494d c13494d, jrh0.C18019a c18019a) {
            this.f56131a = c13494d;
            this.f56132b = c18019a;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.addCameraProvider(this.f56131a, this.f56132b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$x */
    public class RunnableC13457x implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56134a;

        public RunnableC13457x(C13494d c13494d) {
            this.f56134a = c13494d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.upExposureCompensation(this.f56134a);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$x0 */
    public class RunnableC13458x0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56136a;

        public RunnableC13458x0(C13494d c13494d) {
            this.f56136a = c13494d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.removeCameraProvider(this.f56136a);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$y */
    public class RunnableC13459y implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56138a;

        public RunnableC13459y(C13494d c13494d) {
            this.f56138a = c13494d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.downExposureCompensation(this.f56138a);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$y0 */
    public class RunnableC13460y0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56140a;

        public RunnableC13460y0(C13494d c13494d) {
            this.f56140a = c13494d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.start(this.f56140a);
            if (TECameraServer.this.mCameraSettings.f56195k) {
                TECameraServer.this.mCameraClientCondition.open();
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$z */
    public class RunnableC13461z implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13494d f56142a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f56143b;

        public RunnableC13461z(C13494d c13494d, boolean z) {
            this.f56142a = c13494d;
            this.f56143b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setAutoExposureLock(this.f56142a, this.f56143b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$z0 */
    public class RunnableC13462z0 implements Runnable {
        public RunnableC13462z0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TECameraServer.this.mCameraInstance != null) {
                TECameraServer.this.mCameraInstance.mo81808a();
            }
        }
    }

    TECameraServer() {
    }

    public static /* synthetic */ int access$1810(TECameraServer tECameraServer) {
        int i = tECameraServer.mRetryCnt;
        tECameraServer.mRetryCnt = i - 1;
        return i;
    }

    public static /* synthetic */ C13494d.a access$2700(TECameraServer tECameraServer) {
        tECameraServer.getClass();
        return null;
    }

    public static /* synthetic */ C13494d.d access$2800(TECameraServer tECameraServer) {
        tECameraServer.getClass();
        return null;
    }

    public static /* synthetic */ TECameraSettings.InterfaceC13475m access$3000(TECameraServer tECameraServer) {
        tECameraServer.getClass();
        return null;
    }

    private boolean assertClient(C13494d c13494d) {
        synchronized (this.mLock) {
            try {
                C13494d c13494d2 = this.mCameraClient;
                if (c13494d2 == c13494d) {
                    return true;
                }
                if (c13494d2 == null) {
                    C13504g.m82006j(TAG, "Internal CameraClient is null. Must call connect first!");
                } else {
                    C13504g.m82006j(TAG, "Invalid CameraClient, need : " + this.mCameraClient);
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int close(boolean z, Cert cert) {
        Handler handler = this.mHandler;
        if (handler == null) {
            this.mCameraCloseTaskHandlerId = -1;
            updateCameraState(4);
            if (this.mCameraInstance != null) {
                C13504g.m81998b(TAG, "call camera close process, handler is null");
                this.mCameraInstance.mo81773n(this.cachedClosePrivacyCert);
                C13504g.m82006j(TAG, "call camera close process, handler is null, force close done");
            }
            updateCameraState(0);
            return -112;
        }
        C13504g.m82001e(TAG, "call camera close process...sync: " + z + ", handler: " + handler);
        if (this.mHandlerDestroyed || Looper.myLooper() == handler.getLooper()) {
            this.mCameraCloseTaskHandlerId = -1;
            if (this.mEnableVBoost) {
                this.mSystemResManager.m82010c(new TESystemResManager.C13505a(TESystemResManager.ActionType.BOOST_CPU, this.mVBoostTimeoutMS));
                realCloseCamera(cert);
                this.mSystemResManager.m82010c(new TESystemResManager.C13505a(TESystemResManager.ActionType.RESTORE_CPU));
            } else {
                realCloseCamera(cert);
            }
            this.mMainHandler.removeCallbacks(this.mCheckCloseTask);
            if (!z && decreaseClientCount() == 0) {
                return destroy();
            }
        } else {
            int iHashCode = handler.hashCode();
            int i = this.mCameraCloseTaskHandlerId;
            if (i != -1 && i != iHashCode) {
                this.mCameraCloseTaskHandlerId = -1;
                C13504g.m81998b(TAG, "camera close task discard...handler id has changed");
                return 0;
            }
            this.mCameraCloseTaskHandlerId = iHashCode;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z) {
                this.mCameraClientCondition.close();
            }
            this.mIsCameraPendingClose = true;
            handler.post(new RunnableC13409a(jCurrentTimeMillis, z, cert));
            if (z) {
                boolean zBlock = this.mCameraClientCondition.block(1500L);
                this.mIsCameraPendingClose = false;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                if (zBlock) {
                    C13504g.m82001e(TAG, "Camera close cost: " + jCurrentTimeMillis2 + "ms");
                } else {
                    this.mCameraCloseTaskHandlerId = -1;
                    C13504g.m81998b(TAG, "Camera close timeout, mCurrentCameraState " + this.mCurrentCameraState);
                    updateCameraState(4);
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo81773n(this.cachedClosePrivacyCert);
                    }
                    updateCameraState(0);
                }
            }
        }
        return 0;
    }

    @Nullable
    private AbstractC13487c createCameraInstance() {
        AbstractC13487c abstractC13487cCreateCameraInstanceCore = createCameraInstanceCore();
        if (abstractC13487cCreateCameraInstanceCore != null) {
            abstractC13487cCreateCameraInstanceCore.m81836c0(this.mPreviewSizeCallback != null ? this.mBasePreviewSizeCallback : null);
            abstractC13487cCreateCameraInstanceCore.m81835b0(null);
        }
        return abstractC13487cCreateCameraInstanceCore;
    }

    private AbstractC13487c createCameraInstanceCore() {
        TECameraSettings tECameraSettings = this.mCameraSettings;
        boolean z = !tECameraSettings.f56212s0 || C13496f.m81902u(tECameraSettings.f56175a);
        TECameraSettings tECameraSettings2 = this.mCameraSettings;
        int i = tECameraSettings2.f56177b;
        if (i == 1) {
            return C13485a.m81735N0(tECameraSettings2.f56175a, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        }
        if ((10 != i && 11 != i) || Build.VERSION.SDK_INT < 28) {
            if (!z) {
                tECameraSettings2.f56177b = 1;
                return C13485a.m81735N0(tECameraSettings2.f56175a, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
            }
            AbstractC13487c abstractC13487cCreateVendorCamera2Instance = createVendorCamera2Instance(i, tECameraSettings2.f56175a, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
            if (abstractC13487cCreateVendorCamera2Instance != null) {
                return abstractC13487cCreateVendorCamera2Instance;
            }
            TECameraSettings tECameraSettings3 = this.mCameraSettings;
            tECameraSettings3.f56177b = 2;
            return C13486b.m81787Q0(2, tECameraSettings3.f56175a, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        }
        AbstractC13487c abstractC13487c = (AbstractC13487c) C13496f.m81891j("com.ss.android.ttvecamera.TEVendorCamera", i, tECameraSettings2.f56175a, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        if (abstractC13487c != null) {
            C13504g.m82001e(TAG, "createCameraInstance TEVendorCamera");
            return abstractC13487c;
        }
        TECameraSettings tECameraSettings4 = this.mCameraSettings;
        if (z) {
            tECameraSettings4.f56177b = 2;
            return C13486b.m81787Q0(2, tECameraSettings4.f56175a, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        }
        tECameraSettings4.f56177b = 1;
        return C13485a.m81735N0(tECameraSettings4.f56175a, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
    }

    private Handler createHandler(boolean z, String str) {
        if (z) {
            try {
                HandlerThread handlerThread = this.mHandlerThread;
                if (handlerThread != null) {
                    handlerThread.quit();
                }
                HandlerThread handlerThread2 = new HandlerThread(str);
                handlerThread2.start();
                handlerThread2.getLooper().setMessageLogging(new C13436m0());
                this.mHandlerThread = handlerThread2;
                return new Handler(handlerThread2.getLooper(), new C13414b1(this));
            } catch (Exception e) {
                C13504g.m81998b(TAG, "CreateHandler failed!: " + e.toString());
            }
        }
        return new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
    }

    private Message createMessage(int i, boolean z, Handler handler) {
        Message messageObtainMessage;
        if (z && handler.hasMessages(i)) {
            handler.removeMessages(i);
            messageObtainMessage = new Message();
        } else {
            messageObtainMessage = handler.obtainMessage();
        }
        messageObtainMessage.what = i;
        return messageObtainMessage;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0025  */
    /* JADX WARN: Code duplicated, block: B:21:0x0044 A[RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x0025, please report this as an issue */
    @RequiresApi(api = 21)
    private AbstractC13487c createVendorCamera2Instance(int i, Context context, AbstractC13487c.a aVar, Handler handler, AbstractC13487c.d dVar) {
        String str;
        String str2;
        if (i == 4) {
            str2 = "com.ss.android.ttvecamera.TEOpMediaCamera";
        } else if (i == 6) {
            str2 = "com.ss.android.ttvecamera.TEVoCamera";
        } else {
            if (i != 8 || Build.VERSION.SDK_INT < 28) {
                if (i == 9) {
                    str2 = "com.ss.android.ttvecamera.TEOpCamera";
                } else {
                    str = null;
                }
                if (str != null) {
                    return null;
                }
                C13486b c13486b = (C13486b) C13496f.m81891j(str, i, context, aVar, handler, dVar);
                C13504g.m82001e(TAG, "create, vendorCamera2 = " + c13486b);
                return c13486b;
            }
            str2 = "com.ss.android.ttvecamera.TEXmV2Camera";
        }
        str = str2;
        if (str != null) {
            return null;
        }
        C13486b c13486b2 = (C13486b) C13496f.m81891j(str, i, context, aVar, handler, dVar);
        C13504g.m82001e(TAG, "create, vendorCamera2 = " + c13486b2);
        return c13486b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int decreaseClientCount() {
        try {
            this.sClientCount--;
            C13504g.m81997a(TAG, "sClientCount = " + this.sClientCount);
            if (this.sClientCount < 0) {
                C13504g.m82006j(TAG, "Invalid ClientCount = " + this.sClientCount);
                this.sClientCount = 0;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.sClientCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int destroy() {
        try {
            C13504g.m82001e(TAG, "destroy...start");
            this.mIsInitialized = false;
            this.mCheckCloseTask = null;
            this.mCameraClient = null;
            this.mPreviewSizeCallback = null;
            this.cachedClosePrivacyCert = null;
            this.cachedOpenPrivacyCert = null;
            this.mProviderSettings = null;
            if (this.mCameraInstance != null) {
                this.mCameraInstance.mo81813i();
            }
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new RunnableC13431k());
            }
            HandlerThread handlerThread = this.mHandlerThread;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                this.mHandlerThread = null;
                this.mHandlerDestroyed = true;
                this.mHandler = null;
            }
            this.mCameraObserver = C13494d.c.m81880a();
            C13504g.m82001e(TAG, "destroy...end");
        } catch (Throwable th) {
            throw th;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePreviewingFallback() {
        boolean z;
        if (this.mCameraSettings.f56177b == 1) {
            return;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 3) {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo81785x0();
                        updateCameraState(4);
                        this.mCameraInstance.mo81764f(this.cachedOpenPrivacyCert);
                        this.mCameraInstance = null;
                        updateCameraState(0);
                    }
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.mCameraSettings.f56177b = 1;
            this.mCameraEvent.mo81680e(51, 0, "need recreate surfacetexture", null);
            INSTANCE.open(this.mCameraClient, this.mCameraSettings, this.cachedOpenPrivacyCert);
        }
    }

    private synchronized int increaseClientCount() {
        this.sClientCount++;
        C13504g.m81997a(TAG, "sClientCount = " + this.sClientCount);
        return this.sClientCount;
    }

    private synchronized void init(boolean z) {
        C13504g.m82001e(TAG, "init...start");
        if (this.mIsInitialized) {
            return;
        }
        this.mHandler = createHandler(z, TAG);
        this.mHandlerDestroyed = false;
        this.mProviderManager = new jrh0();
        this.mIsInitialized = true;
        this.mCurrentZoom = 0.0f;
        this.mOnBackGround = false;
        this.mMainHandler = new Handler(Looper.getMainLooper());
        this.mSystemResManager = new TESystemResManager();
        C13504g.m82001e(TAG, "init...end");
    }

    private boolean isARConfigNotEqual(TECameraSettings tECameraSettings) {
        TECameraSettings tECameraSettings2 = this.mCameraSettings;
        if (tECameraSettings2 == null) {
            return true;
        }
        if (tECameraSettings.f56150B != 2) {
            return false;
        }
        TECameraSettings.ARConfig aRConfig = tECameraSettings2.f56224y0;
        return (aRConfig != null && aRConfig.f56226a.ordinal() == tECameraSettings.f56224y0.f56226a.ordinal() && this.mCameraSettings.f56224y0.f56227b.ordinal() == tECameraSettings.f56224y0.f56227b.ordinal() && this.mCameraSettings.f56224y0.f56228c.ordinal() == tECameraSettings.f56224y0.f56228c.ordinal() && this.mCameraSettings.f56224y0.f56229d.ordinal() == tECameraSettings.f56224y0.f56229d.ordinal() && this.mCameraSettings.f56224y0.f56230e.ordinal() == tECameraSettings.f56224y0.f56230e.ordinal() && this.mCameraSettings.f56224y0.f56231f.ordinal() == tECameraSettings.f56224y0.f56231f.ordinal()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isCameraPermitted() {
        boolean z = true;
        try {
            if (j26.m143188a(this.mCameraSettings.f56175a, "android.permission.CAMERA") != 0) {
                z = false;
            }
        } catch (Exception e) {
            C13504g.m81998b(TAG, "test camera permission failed!: " + e.toString());
        }
        this.mOpenInfoMap.put("CamPerm" + this.mRetryCnt, String.valueOf(z));
        return z;
    }

    private boolean onlySwitchSession(TECameraSettings tECameraSettings) {
        int i;
        TECameraSettings tECameraSettings2 = this.mCameraSettings;
        if (tECameraSettings2 == null || tECameraSettings2.f56181d != 0 || tECameraSettings.f56181d != 0 || (i = tECameraSettings2.f56177b) != 11 || i != tECameraSettings.f56177b) {
            return false;
        }
        TEFrameSizei tEFrameSizei = tECameraSettings2.f56207q;
        int i2 = tEFrameSizei.width;
        TEFrameSizei tEFrameSizei2 = tECameraSettings.f56207q;
        if (i2 != tEFrameSizei2.width || tEFrameSizei.height != tEFrameSizei2.height || tECameraSettings2.f56162N != tECameraSettings.f56162N || tECameraSettings2.f56152D != tECameraSettings.f56152D || tECameraSettings2.f56215u != tECameraSettings.f56215u || tECameraSettings2.f56225z != tECameraSettings.f56225z || tECameraSettings2.f56169U == tECameraSettings.f56169U || tECameraSettings2.f56170V == tECameraSettings.f56170V) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("enable_video_stabilization", tECameraSettings.f56169U);
        bundle.putBoolean("enable_ai_night_video", tECameraSettings.f56170V);
        this.mCameraInstance.mo81770k0(bundle);
        this.mCameraSettings = tECameraSettings;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int open(@NonNull C13494d c13494d, TECameraSettings tECameraSettings, Cert cert) {
        int iMo81760W;
        if (!assertClient(c13494d)) {
            return -108;
        }
        if (this.mIsCameraPendingClose) {
            C13504g.m81998b(TAG, "pending close");
            return TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT;
        }
        if (tECameraSettings.f56190h0 && this.mOnBackGround) {
            C13504g.m81998b(TAG, "in background");
            return TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            C13504g.m81998b(TAG, "open, mHandler is null!");
            return -112;
        }
        if (this.mIsCameraPendingClose) {
            C13504g.m81998b(TAG, "had called disConnect(), abandon open camera!");
            return -113;
        }
        if (this.mHandlerDestroyed || Looper.myLooper() == handler.getLooper()) {
            dsh0.m117758a("TECameraServer-open");
            this.mCameraSettings = tECameraSettings;
            C13504g.m82001e(TAG, "is force close camera=" + this.mCameraSettings.f56166R + ", Camera2Detect=" + this.mCameraSettings.f56212s0);
            this.mCheckCloseTask = new RunnableC13424g0();
            this.mCurrentZoom = 0.0f;
            if (this.mRetryCnt < 0) {
                this.mRetryCnt = tECameraSettings.f56217v;
            }
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState != 0) {
                        C13504g.m82006j(TAG, "No need open camera again, state = " + this.mCurrentCameraState);
                        if (this.mCurrentCameraState != 1) {
                            this.mCameraObserver.onInfo(1, 0, "Camera features is ready");
                        }
                        dsh0.m117759b();
                        return 0;
                    }
                    updateCameraState(1);
                    if (this.mCameraInstance == null) {
                        this.mCameraInstance = createCameraInstance();
                        if (this.mCameraInstance == null) {
                            if (this.mCameraSettings.f56177b == 11) {
                                updateCameraState(0);
                                this.mCameraEvent.mo81681f(this.mCameraSettings.f56177b, -428, null, null);
                            } else {
                                updateCameraState(0);
                                this.mCameraObserver.onError(-100, "open : mCameraInstance is null.");
                            }
                            return -1;
                        }
                        this.mCameraInstance.m81843q0(this.satZoomCallback);
                    }
                    this.mBeginTime = System.currentTimeMillis();
                    if (this.mEnableVBoost) {
                        this.mSystemResManager.m82010c(new TESystemResManager.C13505a(TESystemResManager.ActionType.BOOST_CPU, this.mVBoostTimeoutMS));
                        iMo81760W = this.mCameraInstance.mo81760W(this.mCameraSettings, cert);
                        this.mSystemResManager.m82010c(new TESystemResManager.C13505a(TESystemResManager.ActionType.RESTORE_CPU));
                    } else {
                        iMo81760W = this.mCameraInstance.mo81760W(this.mCameraSettings, cert);
                    }
                    if (iMo81760W != 0) {
                        C13504g.m82006j(TAG, "Open camera failed, ret = " + iMo81760W);
                    }
                    dsh0.m117759b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            handler.post(new RunnableC13453v(System.currentTimeMillis(), c13494d, tECameraSettings, cert));
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void realCloseCamera(Cert cert) {
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 0) {
                    C13504g.m82006j(TAG, "realCloseCamera, no need to close camera, state: " + this.mCurrentCameraState);
                } else {
                    updateCameraState(4);
                    if (this.mCameraInstance != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        this.mCameraInstance.mo81764f(cert);
                        C13504g.m82001e(TAG, "system call close() cost: " + (System.currentTimeMillis() - jCurrentTimeMillis));
                    }
                    updateCameraState(0);
                }
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo81813i();
                    this.mCameraInstance = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void setAsyncCloseCheckMsg() {
        this.mMainHandler.removeCallbacks(this.mCheckCloseTask);
        this.mMainHandler.postDelayed(this.mCheckCloseTask, 2000L);
    }

    private boolean shouldReOpenCamera(TECameraSettings tECameraSettings) {
        TECameraSettings tECameraSettings2 = this.mCameraSettings;
        if (tECameraSettings2 == null) {
            return false;
        }
        if (tECameraSettings2.f56177b != tECameraSettings.f56177b) {
            return true;
        }
        TEFrameSizei tEFrameSizei = tECameraSettings2.f56207q;
        int i = tEFrameSizei.width;
        TEFrameSizei tEFrameSizei2 = tECameraSettings.f56207q;
        return (i == tEFrameSizei2.width && tEFrameSizei.height == tEFrameSizei2.height && tECameraSettings2.f56181d == tECameraSettings.f56181d && tECameraSettings2.f56162N == tECameraSettings.f56162N && tECameraSettings2.f56169U == tECameraSettings.f56169U && tECameraSettings2.f56152D == tECameraSettings.f56152D && tECameraSettings2.f56215u == tECameraSettings.f56215u && tECameraSettings2.f56225z == tECameraSettings.f56225z && tECameraSettings2.f56150B == tECameraSettings.f56150B && !isARConfigNotEqual(tECameraSettings)) ? false : true;
    }

    public int abortSession(C13494d c13494d) {
        if (!assertClient(c13494d)) {
            return -108;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            C13504g.m81998b(TAG, "abortSession, mHandler is null!");
            return -112;
        }
        handler.post(new RunnableC13462z0());
        return 0;
    }

    public void addCameraAlgorithm(TECameraAlgorithmParam tECameraAlgorithmParam) {
        if (this.mCameraInstance == null) {
            C13504g.m81998b(TAG, "addCameraAlgorithm failed mCameraInstance is null!");
        } else {
            this.mCameraInstance.m81834b(tECameraAlgorithmParam);
        }
    }

    public int addCameraProvider(C13494d c13494d, jrh0.C18019a c18019a) {
        jrh0.C18019a c18019a2;
        if (!assertClient(c13494d)) {
            return -108;
        }
        if (this.mHandlerDestroyed || Looper.myLooper() == this.mHandler.getLooper()) {
            C13504g.m82001e(TAG, "addCameraProvider");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance == null) {
                        this.mCameraObserver.onError(-100, "Invalidate Camera Instance!!");
                        return -100;
                    }
                    C13504g.m82001e(TAG, "addCameraProvider, mProviderSettings = " + this.mProviderSettings + ", providerSettings = " + c18019a);
                    if (this.mProviderSettings == null || this.mCameraInstance.m81828K() == null || !((c18019a2 = this.mProviderSettings) == null || c18019a2.m146750b(c18019a))) {
                        this.mProviderManager.m146737a(c18019a, this.mCameraInstance);
                        this.mIsCameraProviderChanged = true;
                        jrh0.C18019a c18019a3 = this.mProviderSettings;
                        if (c18019a3 == null) {
                            this.mProviderSettings = new jrh0.C18019a(c18019a);
                        } else {
                            c18019a3.m146749a(c18019a);
                        }
                    } else {
                        this.mIsCameraProviderChanged = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            this.mHandler.post(new RunnableC13456w0(c13494d, c18019a));
        }
        return 0;
    }

    public void appLifeCycleChanged(boolean z) {
        this.mOnBackGround = z;
    }

    public int cancelFocus(C13494d c13494d) {
        if (!assertClient(c13494d)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13427i(c13494d));
            return 0;
        }
        C13504g.m82001e(TAG, "cancelFocus...");
        synchronized (this.mStateLock) {
            this.mCameraInstance.mo81763c();
        }
        return 0;
    }

    public int captureBurst(C13494d c13494d, TECameraSettings.InterfaceC13465c interfaceC13465c, hj3 hj3Var) {
        if (!assertClient(c13494d)) {
            return -108;
        }
        this.mHandler.post(new RunnableC13419e(interfaceC13465c, hj3Var));
        return 0;
    }

    public void changeCaptureFormat() {
    }

    public int changeRecorderState(C13494d c13494d, int i, AbstractC13487c.c cVar) {
        if (!assertClient(c13494d)) {
            return -108;
        }
        if (!this.mHandlerDestroyed && Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13450t0(c13494d, i, cVar));
            return 0;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance == null) {
                    this.mCameraObserver.onError(-100, "Invalidate Camera Instance!!");
                    return -100;
                }
                this.mCameraInstance.m81838e(i, cVar);
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int connect(@NonNull C13494d c13494d, @NonNull C13494d.b bVar, @NonNull TECameraSettings tECameraSettings, C13494d.d dVar, Cert cert) {
        C13504g.m82001e(TAG, "connect with client: " + c13494d);
        if (c13494d == null) {
            wg3.m206174a("client must not be null");
            return 0;
        }
        if (bVar == null) {
            wg3.m206174a("observer must not be null");
            return 0;
        }
        if (tECameraSettings == null) {
            wg3.m206174a("mParams must not be null");
            return 0;
        }
        this.mMainHandler.removeCallbacks(this.mCheckCloseTask);
        synchronized (this.mLock) {
            try {
                boolean zShouldReOpenCamera = shouldReOpenCamera(tECameraSettings);
                if (c13494d == this.mCameraClient && !zShouldReOpenCamera) {
                    C13504g.m82006j(TAG, "No need reconnect.");
                    return 0;
                }
                if (!this.mIsInitialized) {
                    init(true);
                    zShouldReOpenCamera = false;
                }
                this.mCameraClient = c13494d;
                this.mCameraObserver = bVar;
                boolean z = tECameraSettings.f56167S;
                this.mEnableVBoost = z;
                this.mRetryCnt = -1;
                if (z) {
                    this.mVBoostTimeoutMS = tECameraSettings.f56168T;
                    this.mSystemResManager.m82009b(new esh0());
                    this.mSystemResManager.m82008a(tECameraSettings.f56175a);
                }
                increaseClientCount();
                if (zShouldReOpenCamera) {
                    C13504g.m82001e(TAG, "reopen camera.");
                    close(cert);
                }
                this.mIsCameraPendingClose = false;
                this.cachedOpenPrivacyCert = cert;
                return open(c13494d, tECameraSettings, cert);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean couldForwardState(int i) {
        if (i == this.mCurrentCameraState) {
            C13504g.m82006j(TAG, "No need this");
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    return this.mCurrentCameraState == 1;
                }
                C13504g.m81998b(TAG, "Invalidate camera state = " + i);
                return false;
            }
            if (this.mCurrentCameraState != 0) {
                C13504g.m82006j(TAG, "No need open camera again, state = " + this.mCurrentCameraState);
            }
        }
        return true;
    }

    public int disConnect(C13494d c13494d, boolean z, Cert cert) {
        C13504g.m82001e(TAG, "disConnect with client: " + c13494d);
        this.mIsCameraSwitchState = false;
        synchronized (this.mLock) {
            C13494d c13494d2 = this.mCameraClient;
            if (c13494d2 != c13494d || c13494d2 == null) {
                return -100;
            }
            this.mCameraClient = null;
            this.mHandler.removeCallbacksAndMessages(null);
            this.cachedClosePrivacyCert = cert;
            close(z, cert);
            if (!z) {
                setAsyncCloseCheckMsg();
            } else if (decreaseClientCount() == 0) {
                return destroy();
            }
            return 0;
        }
    }

    public void downExposureCompensation(C13494d c13494d) {
        if (assertClient(c13494d)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new RunnableC13459y(c13494d));
                return;
            }
            C13504g.m82001e(TAG, "downExposureCompensation...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState != 3 && this.mCurrentCameraState != 2) {
                        this.mCameraObserver.onError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, "Can not set ec on state : " + this.mCurrentCameraState);
                        return;
                    }
                    TECameraSettings.C13466d c13466dM81844s = this.mCameraInstance.m81844s();
                    if (c13466dM81844s == null) {
                        this.mCameraObserver.onError(-112, "downExposureCompensation get ec info failed");
                    } else {
                        this.mCameraInstance.mo81769j0(c13466dM81844s.f56233b - 1);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public int enableCaf(C13494d c13494d) {
        if (!assertClient(c13494d)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13429j(c13494d));
            return 0;
        }
        C13504g.m82001e(TAG, "enableCaf...");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo81768j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public int enableMulticamZoom(C13494d c13494d, boolean z) {
        if (!assertClient(c13494d)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13452u0(c13494d, z));
            return 0;
        }
        C13504g.m82001e(TAG, "enableMulticamZoom: " + z);
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo81814k(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public int focusAtPoint(C13494d c13494d, TEFocusSettings tEFocusSettings) {
        if (!assertClient(c13494d)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13425h(c13494d, tEFocusSettings));
            return 0;
        }
        C13504g.m82001e(TAG, "focusAtPoint at: " + tEFocusSettings);
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 3) {
                    this.mCameraInstance.mo81772m(tEFocusSettings);
                    return 0;
                }
                String str = "Can not set focus on state : " + this.mCurrentCameraState;
                C13504g.m82006j(TAG, str);
                this.mCameraObserver.onError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, str);
                return TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public float[] getApertureRange(C13494d c13494d, TECameraSettings.InterfaceC13463a interfaceC13463a) {
        float[] fArrMo81817o = {0.0f};
        if (!assertClient(c13494d)) {
            return new float[]{-1.0f, -1.0f};
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13428i0(c13494d, interfaceC13463a));
            return fArrMo81817o;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    fArrMo81817o = this.mCameraInstance.mo81817o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fArrMo81817o;
    }

    public TEFrameSizei getBestPreviewSize(C13494d c13494d, float f, TEFrameSizei tEFrameSizei) {
        if (!assertClient(c13494d) || this.mCurrentCameraState == 0 || this.mCurrentCameraState == 1) {
            return null;
        }
        return this.mCameraInstance.mo81776p(f, tEFrameSizei);
    }

    public JSONObject getCameraCapbilitiesForBytebench(C13494d c13494d, TECameraSettings.InterfaceC13464b interfaceC13464b) {
        JSONObject jSONObject = new JSONObject();
        if (!assertClient(c13494d)) {
            return null;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13454v0(c13494d, interfaceC13464b));
            return jSONObject;
        }
        C13504g.m82001e(TAG, "getCameraCapbilitiesForBytebench");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    jSONObject = this.mCameraInstance.mo81777q();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObject;
    }

    public int[] getCameraCaptureSize() {
        if (this.mCameraInstance == null) {
            return null;
        }
        return this.mCameraInstance.mo81778r();
    }

    public TECameraSettings.C13466d getCameraECInfo(C13494d c13494d) {
        if (assertClient(c13494d) && this.mCameraInstance != null) {
            return this.mCameraInstance.m81844s();
        }
        return null;
    }

    public int getCameraState(boolean z) {
        int i;
        if (!z) {
            return this.mCurrentCameraState;
        }
        synchronized (this.mStateLock) {
            i = this.mCurrentCameraState;
        }
        return i;
    }

    public int getExposureCompensation(C13494d c13494d) {
        if (!assertClient(c13494d)) {
            azk0.m101074a("Client is not connected!!!");
            return 0;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    return this.mCameraInstance.m81847w();
                }
                this.mCameraObserver.onError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, "Can not get ec on state : " + this.mCurrentCameraState);
                return TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public float[] getFOV(C13494d c13494d, TECameraSettings.InterfaceC13467e interfaceC13467e) {
        float[] fArr = new float[2];
        if (!assertClient(c13494d)) {
            return new float[]{-2.0f, -2.0f};
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13417d(c13494d, interfaceC13467e));
            return fArr;
        }
        C13504g.m82001e(TAG, "getFOV");
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 3) {
                    return this.mCameraInstance.mo81784x();
                }
                this.mCameraObserver.onError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, "Can not getFOV on state : " + this.mCurrentCameraState);
                return new float[]{-2.0f, -2.0f};
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getFlashMode(C13494d c13494d) {
        if (this.mCameraInstance == null) {
            return -1;
        }
        return this.mCameraInstance.mo81742B();
    }

    public int getISO(C13494d c13494d, TECameraSettings.InterfaceC13469g interfaceC13469g) {
        int iMo81790F;
        if (!assertClient(c13494d)) {
            return -1;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13420e0(c13494d, interfaceC13469g));
            return -1;
        }
        synchronized (this.mStateLock) {
            try {
                iMo81790F = this.mCameraInstance != null ? this.mCameraInstance.mo81790F() : -1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iMo81790F;
    }

    public int[] getISORange(C13494d c13494d, TECameraSettings.InterfaceC13470h interfaceC13470h) {
        int[] iArrMo81791G = new int[2];
        if (!assertClient(c13494d)) {
            return new int[]{-1, -1};
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13416c0(c13494d, interfaceC13470h));
            return iArrMo81791G;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    iArrMo81791G = this.mCameraInstance.mo81791G();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iArrMo81791G;
    }

    public float getManualFocusAbility(C13494d c13494d, TECameraSettings.InterfaceC13471i interfaceC13471i) {
        float fMo81792H;
        if (!assertClient(c13494d)) {
            return -1.0f;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13433l(c13494d, interfaceC13471i));
            return -1.0f;
        }
        synchronized (this.mStateLock) {
            try {
                fMo81792H = this.mCameraInstance != null ? this.mCameraInstance.mo81792H() : -1.0f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fMo81792H;
    }

    public int[] getPictureSize(C13494d c13494d) {
        if (assertClient(c13494d) && this.mCameraInstance != null) {
            return this.mCameraInstance.mo81750I();
        }
        return null;
    }

    public int[] getPreviewFps() {
        if (this.mCameraInstance == null) {
            return null;
        }
        return this.mCameraInstance.mo81751J();
    }

    public long[] getShutterTimeRange(C13494d c13494d, TECameraSettings.InterfaceC13477o interfaceC13477o) {
        long[] jArrMo81797M = new long[2];
        if (!assertClient(c13494d)) {
            return new long[]{-1, -1};
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13422f0(c13494d, interfaceC13477o));
            return jArrMo81797M;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    jArrMo81797M = this.mCameraInstance.mo81797M();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jArrMo81797M;
    }

    public List<TEFrameSizei> getSupportedPictureSizes(C13494d c13494d) {
        if (!assertClient(c13494d) || this.mCameraInstance == null) {
            return null;
        }
        try {
            return this.mCameraInstance.mo81752N();
        } catch (Exception e) {
            C13504g.m82007k(TAG, "getSupportedPictureSizes, exception occured.", e);
            return null;
        }
    }

    public List<TEFrameSizei> getSupportedPreviewSizes(C13494d c13494d) {
        if (!assertClient(c13494d) || this.mCameraInstance == null) {
            return null;
        }
        try {
            return this.mCameraInstance.mo81753O();
        } catch (Exception e) {
            C13504g.m82007k(TAG, "getSupportedPreviewSizes, exception occured.", e);
            return null;
        }
    }

    public boolean isAutoExposureLockSupported(C13494d c13494d) {
        if (!assertClient(c13494d)) {
            return false;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    return this.mCameraInstance.mo81754Q();
                }
                C13504g.m82006j(TAG, "Can not get ae lock supported on state : " + this.mCurrentCameraState);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isAutoFocusLockSupported(C13494d c13494d) {
        if (!assertClient(c13494d)) {
            return false;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    return this.mCameraInstance.mo81755R();
                }
                C13504g.m82006j(TAG, "Can not get ae lock supported on state : " + this.mCurrentCameraState);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isCameraSwitchState() {
        return this.mIsCameraSwitchState;
    }

    public boolean isSupportWhileBalance(C13494d c13494d) {
        boolean z = false;
        if (!assertClient(c13494d)) {
            return false;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null && this.mCameraInstance.mo81756T()) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public boolean isSupportedExposureCompensation(C13494d c13494d) {
        if (!assertClient(c13494d)) {
            return false;
        }
        if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
            return this.mCameraInstance.mo81758U();
        }
        C13504g.m82006j(TAG, "Can not set ec on state : " + this.mCurrentCameraState);
        return false;
    }

    public boolean isTorchSupported(C13494d c13494d) {
        AbstractC13487c abstractC13487c;
        return assertClient(c13494d) && (abstractC13487c = this.mCameraInstance) != null && abstractC13487c.mo81759V();
    }

    public void notifyHostForegroundVisible(C13494d c13494d, boolean z) {
        if (assertClient(c13494d)) {
            this.mIsForegroundVisible = z;
            C13504g.m82001e(TAG, "is foreground visible: " + z);
        }
    }

    public int process(C13494d c13494d, TECameraSettings.C13472j c13472j) {
        if (!assertClient(c13494d)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13451u(c13494d, c13472j));
            return 0;
        }
        C13504g.m82001e(TAG, "setFeatureParameters...");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.m81832X(c13472j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public TECameraFrame processAlgorithm(TECameraFrame tECameraFrame) {
        if (this.mCameraInstance != null) {
            return this.mCameraInstance.m81833Y(tECameraFrame);
        }
        C13504g.m81998b(TAG, "processAlgorithm failed mCameraInstance is null!");
        return null;
    }

    public void queryFeatures(String str, Bundle bundle) {
        if (this.mCameraInstance == null) {
            C13504g.m81998b(TAG, "queryFeatures: camera instance null");
            return;
        }
        Bundle bundleM81849z = this.mCameraInstance.m81849z(str);
        if (bundleM81849z == null) {
            C13504g.m81998b(TAG, "queryFeatures: getFeatures is null");
            return;
        }
        for (String str2 : bundle.keySet()) {
            if (bundleM81849z.containsKey(str2)) {
                Class clsM81690a = TECameraSettings.C13468f.m81690a(str2);
                if (clsM81690a == Boolean.class) {
                    bundle.putBoolean(str2, bundleM81849z.getBoolean(str2));
                } else if (clsM81690a == Integer.class) {
                    bundle.putInt(str2, bundleM81849z.getInt(str2));
                } else if (clsM81690a == Long.class) {
                    bundle.putLong(str2, bundleM81849z.getLong(str2));
                } else if (clsM81690a == Float.class) {
                    bundle.putFloat(str2, bundleM81849z.getFloat(str2));
                } else if (clsM81690a == Double.class) {
                    bundle.putDouble(str2, bundleM81849z.getDouble(str2));
                } else if (clsM81690a == String.class) {
                    bundle.putString(str2, bundleM81849z.getString(str2));
                } else if (clsM81690a == ArrayList.class) {
                    bundle.putParcelableArrayList(str2, bundleM81849z.getParcelableArrayList(str2));
                } else if (clsM81690a == TEFrameSizei.class) {
                    bundle.putParcelable(str2, bundleM81849z.getParcelable(str2));
                } else if (clsM81690a == TEFocusParameters.class) {
                    bundle.putParcelable(str2, bundleM81849z.getParcelable(str2));
                } else {
                    C13504g.m82006j(TAG, "Not supported key:" + str2);
                }
            }
        }
    }

    public float queryShaderZoomStep(C13494d c13494d, TECameraSettings.InterfaceC13476n interfaceC13476n) {
        if (!assertClient(c13494d)) {
            return -108.0f;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13443q(c13494d, interfaceC13476n));
            return 0.0f;
        }
        C13504g.m82001e(TAG, "queryShaderZoomStep...");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo81761Z(interfaceC13476n);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0.0f;
    }

    public int queryZoomAbility(C13494d c13494d, TECameraSettings.InterfaceC13478p interfaceC13478p, boolean z) {
        if (!assertClient(c13494d)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13441p(c13494d, interfaceC13478p, z));
            return 0;
        }
        C13504g.m82001e(TAG, "queryZoomAbility...");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo81762a0(interfaceC13478p, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public void registerFpsConfigListener(C13494d.a aVar) {
    }

    public void registerPreviewSizeListener(C13494d.e eVar) {
        this.mPreviewSizeCallback = eVar;
    }

    public void removeCameraAlgorithm(int i) {
        if (this.mCameraInstance == null) {
            C13504g.m81998b(TAG, "removeCameraAlgorithm failed mCameraInstance is null!");
        } else {
            this.mCameraInstance.m81837d0(i);
        }
    }

    public int removeCameraProvider(C13494d c13494d) {
        if (!assertClient(c13494d)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13458x0(c13494d));
            return 0;
        }
        C13504g.m82001e(TAG, "removeCameraProvider");
        synchronized (this.mStateLock) {
            this.mProviderManager.m146747k();
        }
        return 0;
    }

    public void setAperture(C13494d c13494d, float f) {
        if (assertClient(c13494d)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new RunnableC13430j0(c13494d, f));
                return;
            }
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo81812f0(f);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setAutoExposureLock(C13494d c13494d, boolean z) {
        if (assertClient(c13494d)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new RunnableC13461z(c13494d, z));
                return;
            }
            C13504g.m82001e(TAG, "setAutoExposureLock...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                        this.mCameraInstance.mo81766g0(z);
                        return;
                    }
                    this.mCameraObserver.onError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, "Can not set auto exposure lock on state : " + this.mCurrentCameraState);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setAutoFocusLock(C13494d c13494d, boolean z) {
        if (assertClient(c13494d)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new RunnableC13410a0(c13494d, z));
                return;
            }
            C13504g.m81997a(TAG, "setAutoExposureLock...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                        this.mCameraInstance.mo81767h0(z);
                        return;
                    }
                    this.mCameraObserver.onError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, "Can not set auto exposure lock on state : " + this.mCurrentCameraState);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setDeviceRotation(int i) {
        if (this.mCameraInstance != null) {
            this.mCameraInstance.m81841i0(i);
        }
    }

    public void setExposureCompensation(C13494d c13494d, int i) {
        Handler handler;
        if (!assertClient(c13494d) || (handler = this.mHandler) == null) {
            C13504g.m81998b(TAG, "setExposureCompensation failed");
        } else {
            handler.post(new RunnableC13455w(i));
        }
    }

    public int setFeatureParameters(C13494d c13494d, Bundle bundle) {
        if (!assertClient(c13494d)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13449t(c13494d, bundle));
            return 0;
        }
        C13504g.m82001e(TAG, "setFeatureParameters...");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo81770k0(bundle);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public void setISO(C13494d c13494d, int i) {
        if (assertClient(c13494d)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new RunnableC13418d0(c13494d, i));
                return;
            }
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo81815l0(i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setManualFocusDistance(C13494d c13494d, float f) {
        if (assertClient(c13494d)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new RunnableC13435m(c13494d, f));
                return;
            }
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo81816m0(f);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setPictureSize(C13494d c13494d, int i, int i2) {
        if (assertClient(c13494d)) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new RunnableC13437n(i, i2));
                return;
            }
            return;
        }
        C13504g.m82006j(TAG, "set picture size failed, w: " + i + ", h: " + i2);
    }

    public void setPreviewFpsRange(TEFrameRateRange tEFrameRateRange) {
        if (this.mCameraSettings == null || this.mCameraInstance == null) {
            return;
        }
        TECameraSettings tECameraSettings = this.mCameraSettings;
        tECameraSettings.f56179c = tEFrameRateRange;
        tECameraSettings.f56163O = 1;
        if (tECameraSettings.f56150B == 1) {
            tECameraSettings.f56163O = 4;
            tECameraSettings.f56174Z = false;
        }
        this.mCameraInstance.mo81775o0();
    }

    public void setSATZoomCallback(TECameraSettings.InterfaceC13475m interfaceC13475m) {
    }

    public void setSceneMode(C13494d c13494d, int i) {
        if (!assertClient(c13494d)) {
            C13504g.m82006j(TAG, "set scnen failed: " + i);
        } else {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new RunnableC13439o(i));
            }
        }
    }

    public void setShutterTime(C13494d c13494d, long j) {
        if (assertClient(c13494d)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new RunnableC13426h0(c13494d, j));
                return;
            }
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo81818s0(j);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setWhileBalance(C13494d c13494d, boolean z, String str) {
        if (assertClient(c13494d)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new RunnableC13413b0(c13494d, z, str));
                return;
            }
            synchronized (this.mStateLock) {
                try {
                    C13504g.m82001e(TAG, "setWhileBalance...");
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo81780t0(z, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public int start(C13494d c13494d) {
        C13504g.m82001e(TAG, "start: client " + c13494d);
        if (!assertClient(c13494d)) {
            return -108;
        }
        TECameraSettings tECameraSettings = this.mCameraSettings;
        if (tECameraSettings == null || tECameraSettings.f56175a == null) {
            C13504g.m81998b(TAG, "mCameraSettings has some error");
            return -100;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            C13504g.m81998b(TAG, "start, mHandler is null!");
            return -112;
        }
        if (Looper.myLooper() != handler.getLooper()) {
            handler.post(new RunnableC13460y0(c13494d));
            if (this.mCameraSettings.f56195k) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.mCameraClientCondition.close();
                this.mCameraClientCondition.block(2000L);
                C13504g.m82001e(TAG, "Camera start cost: " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
            }
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 3) {
                        C13504g.m82006j(TAG, "start, no need to start capture, state: " + this.mCurrentCameraState);
                        if (!this.mIsCameraProviderChanged && !this.mStartPreviewError) {
                            return 0;
                        }
                        this.mCameraInstance.mo81785x0();
                        updateCameraState(2);
                        this.mIsCameraProviderChanged = false;
                    }
                    int i = this.mCurrentCameraState;
                    C13494d.b bVar = this.mCameraObserver;
                    if (i != 2) {
                        bVar.onError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, "Invalidate state: " + this.mCurrentCameraState + " ==> 3");
                        return TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT;
                    }
                    bVar.onInfo(3, this.mCurrentCameraState, "Camera state: opened");
                    this.mCameraInstance.mo81781u0();
                    updateCameraState(3);
                    hrh0.m136853b("te_record_camera_type", this.mCameraInstance.mo81782v());
                    hrh0.m136854c("te_preview_camera_resolution", this.mCameraSettings.f56207q.width + "*" + this.mCameraSettings.f56207q.height);
                    hrh0.m136852a("te_record_camera_frame_rate", (double) this.mCameraSettings.f56179c.max);
                    hrh0.m136853b("te_record_camera_direction", (long) this.mCameraSettings.f56181d);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return 0;
    }

    public int startRecording() {
        return this.mCameraInstance.mo81819v0();
    }

    public int startZoom(C13494d c13494d, float f, TECameraSettings.InterfaceC13478p interfaceC13478p) {
        if (!assertClient(c13494d)) {
            C13504g.m81998b(TAG, "[VE_UI_TEST]Failed event: START_ZOOM. Code: -108. Reason: invalid CameraClient");
            return -108;
        }
        Looper.myLooper();
        this.mHandler.getLooper();
        AbstractC13487c abstractC13487c = this.mCameraInstance;
        if (abstractC13487c == null) {
            C13504g.m81998b(TAG, "[VE_UI_TEST]Failed event: START_ZOOM. Code: -105. Reason: mCameraInstance is null");
            C13504g.m82006j(TAG, "camera is null, no need to start zoom");
            return TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT;
        }
        float fAbs = Math.abs(f - this.mCurrentZoom);
        if (Math.abs(f - abstractC13487c.f56314l) < 0.1f) {
            f = abstractC13487c.f56314l;
        } else if (Math.abs(f) < 0.1f) {
            f = 0.0f;
        } else if (fAbs < 0.1f) {
            return 0;
        }
        this.mCurrentZoom = f;
        Message messageCreateMessage = createMessage(1, true, this.mHandler);
        messageCreateMessage.arg1 = (int) (f * 100.0f);
        messageCreateMessage.obj = interfaceC13478p;
        this.mHandler.sendMessage(messageCreateMessage);
        return 0;
    }

    public int stop(C13494d c13494d, boolean z) {
        C13504g.m82001e(TAG, "stop: client " + c13494d);
        if (!assertClient(c13494d)) {
            return -108;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            C13504g.m81998b(TAG, "stop, mHandler is null!");
            return -112;
        }
        if (Looper.myLooper() != handler.getLooper()) {
            if (z) {
                this.mCameraClientCondition.close();
            }
            handler.post(new RunnableC13411a1(c13494d, z));
            if (z && !this.mCameraClientCondition.block(1500L)) {
                C13504g.m81998b(TAG, "Camera stop timeout!");
            }
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 2) {
                        C13504g.m82006j(TAG, "stop, no need to stop capture, state: " + this.mCurrentCameraState);
                        return 0;
                    }
                    if (this.mCurrentCameraState != 3) {
                        this.mCameraObserver.onError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, "Invalidate state: " + this.mCurrentCameraState + " ==> 2");
                        return TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT;
                    }
                    updateCameraState(2);
                    this.mCameraInstance.mo81785x0();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return 0;
    }

    public int stopRecording() {
        return this.mCameraInstance.mo81820y0();
    }

    public int stopZoom(C13494d c13494d, TECameraSettings.InterfaceC13478p interfaceC13478p) {
        if (!assertClient(c13494d)) {
            C13504g.m81998b(TAG, "[VE_UI_TEST]Failed event: STOP_ZOOM. Code: -108. Reason: invalid CameraClient");
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13445r(c13494d, interfaceC13478p));
            return 0;
        }
        C13504g.m82001e(TAG, "stopZoom...");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo81741A0(interfaceC13478p);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public int switchCamera(C13494d c13494d, TECameraSettings tECameraSettings, Cert cert) {
        C13504g.m82001e(TAG, "switchCamera: " + tECameraSettings);
        if (!assertClient(c13494d)) {
            return -108;
        }
        if (!shouldReOpenCamera(tECameraSettings)) {
            return -423;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13415c(c13494d, tECameraSettings, cert));
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (onlySwitchSession(tECameraSettings)) {
                        return 0;
                    }
                    boolean z = this.mCameraSettings.f56150B != tECameraSettings.f56150B;
                    if (this.mCurrentCameraState == 1 && !z) {
                        this.mCameraObserver.onError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, "Camera is opening, ignore this switch request...");
                        C13504g.m82001e(TAG, "Camera is opening, ignore this switch request...");
                        return TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT;
                    }
                    TECameraSettings tECameraSettings2 = this.mCameraSettings;
                    if (tECameraSettings2.f56177b == tECameraSettings.f56177b && tECameraSettings2.f56150B == tECameraSettings.f56150B) {
                        if (this.mCameraInstance == null) {
                            C13504g.m82001e(TAG, "switch camera, create instance...");
                            this.mCameraInstance = createCameraInstance();
                            if (this.mCameraInstance == null) {
                                this.mCurrentCameraState = 0;
                                int i = this.mCameraSettings.f56177b;
                                if (i == 11) {
                                    this.mCameraEvent.mo81681f(i, -428, null, null);
                                } else {
                                    this.mCameraObserver.onError(-100, "open : mCameraInstance is null.");
                                }
                                return -1;
                            }
                            this.mCameraInstance.m81843q0(this.satZoomCallback);
                        }
                        if (this.mCurrentCameraState != 0) {
                            updateCameraState(4);
                            this.mCameraInstance.mo81764f(cert);
                            updateCameraState(0);
                        }
                        this.mCameraSettings = tECameraSettings;
                        this.mCurrentZoom = 0.0f;
                        updateCameraState(1);
                        if (this.mRetryCnt < 0) {
                            this.mRetryCnt = this.mCameraSettings.f56217v;
                        }
                        this.mBeginTime = System.currentTimeMillis();
                        C13504g.m81997a(TAG, "switch mode = " + this.mCameraSettings.f56150B);
                        int iMo81760W = this.mCameraInstance.mo81760W(this.mCameraSettings, cert);
                        if (iMo81760W != 0) {
                            this.mCameraObserver.onError(iMo81760W, "Switch camera failed @" + this.mCameraSettings.f56177b + ",face:" + this.mCameraSettings.f56181d + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.mCameraSettings.f56207q.toString());
                        }
                        return 0;
                    }
                    close(cert);
                    open(c13494d, tECameraSettings, cert);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return 0;
    }

    public int switchCameraMode(C13494d c13494d, int i) {
        if (!assertClient(c13494d)) {
            return -108;
        }
        TECameraSettings tECameraSettings = c13494d.f56339a;
        if (tECameraSettings.f56177b == 1) {
            return -100;
        }
        if (i != 1 && i != 0 && i != 2) {
            return -100;
        }
        if (tECameraSettings.f56150B == i) {
            return 0;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13446r0(c13494d, i));
        } else {
            C13504g.m82001e(TAG, "switchCameraMode");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState != 3) {
                        this.mCameraObserver.onError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, "Invalidate state: " + this.mCurrentCameraState + " ==> 3");
                        return TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT;
                    }
                    this.mCameraInstance.mo81743B0(i);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return 0;
    }

    public int switchFlashMode(C13494d c13494d, int i) {
        if (!assertClient(c13494d)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13434l0(c13494d, i));
            return 0;
        }
        C13504g.m82001e(TAG, "switchFlashMode: " + i);
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo81745C0(i);
                    this.mCameraEvent.mo81680e(116, i, "", this.mCameraInstance);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public int takePicture(C13494d c13494d, int i, int i2, TECameraSettings.InterfaceC13474l interfaceC13474l) {
        if (!assertClient(c13494d)) {
            return -108;
        }
        this.mHandler.post(new RunnableC13421f(interfaceC13474l, i, i2));
        return 0;
    }

    public int toggleTorch(C13494d c13494d, boolean z) {
        if (!assertClient(c13494d)) {
            C13504g.m81998b(TAG, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -108. Reason: invalid CameraClient");
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13432k0(c13494d, z));
            return 0;
        }
        C13504g.m82001e(TAG, "toggleTorch: " + z);
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo81748F0(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public void upExposureCompensation(C13494d c13494d) {
        if (assertClient(c13494d)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new RunnableC13457x(c13494d));
                return;
            }
            C13504g.m82001e(TAG, "upExposureCompensation...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState != 3 && this.mCurrentCameraState != 2) {
                        this.mCameraObserver.onError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, "Can not set ec on state : " + this.mCurrentCameraState);
                        return;
                    }
                    TECameraSettings.C13466d c13466dM81844s = this.mCameraInstance.m81844s();
                    if (c13466dM81844s == null) {
                        this.mCameraObserver.onError(-112, "upExposureCompensation get ec info failed");
                    } else {
                        this.mCameraInstance.mo81769j0(c13466dM81844s.f56233b + 1);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void updateCameraAlgorithmParam(TECameraAlgorithmParam tECameraAlgorithmParam) {
        if (this.mCameraInstance == null) {
            C13504g.m81998b(TAG, "updateCameraAlgorithmParam failed mCameraInstance is null!");
        } else {
            this.mCameraInstance.m81827G0(tECameraAlgorithmParam);
        }
    }

    public void updateCameraState(int i) {
        if (this.mCurrentCameraState == i) {
            C13504g.m82006j(TAG, "No need update state: " + i);
        } else {
            C13504g.m82001e(TAG, "[updateCameraState]: " + this.mCurrentCameraState + " -> " + i);
            this.mCurrentCameraState = i;
        }
    }

    public int zoomV2(C13494d c13494d, float f, TECameraSettings.InterfaceC13478p interfaceC13478p) {
        if (!assertClient(c13494d)) {
            C13504g.m81998b(TAG, "[VE_UI_TEST]Failed event: START_ZOOM. Code: -108. Reason: invalid CameraClient");
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13447s(c13494d, f, interfaceC13478p));
        } else {
            C13504g.m82001e(TAG, "zoomV2...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo81749H0(f, interfaceC13478p);
                    }
                    if (this.mFirstZoom) {
                        this.mCameraEvent.mo81680e(114, 0, "zoomV2", this.mCameraInstance);
                        this.mFirstZoom = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return 0;
    }

    public int getCameraState() {
        return getCameraState(false);
    }

    public int takePicture(C13494d c13494d, TECameraSettings.InterfaceC13474l interfaceC13474l) {
        if (!assertClient(c13494d)) {
            return -108;
        }
        this.mHandler.post(new RunnableC13423g(interfaceC13474l));
        return 0;
    }

    public int disConnect(C13494d c13494d, Cert cert) {
        return disConnect(c13494d, true, cert);
    }

    public int stop(C13494d c13494d) {
        return stop(c13494d, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int close(Cert cert) {
        return close(true, cert);
    }

    public int switchCamera(C13494d c13494d, int i, Cert cert) {
        C13504g.m82001e(TAG, "switchCamera: " + i);
        if (!assertClient(c13494d)) {
            return -108;
        }
        TECameraSettings tECameraSettings = this.mCameraSettings;
        if (tECameraSettings == null) {
            C13504g.m81998b(TAG, "switchCamera failed: " + i);
            return -108;
        }
        if (tECameraSettings.f56181d == i) {
            return -423;
        }
        this.mIsCameraSwitchState = true;
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13412b(c13494d, i, cert));
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 1) {
                        this.mIsCameraSwitchState = false;
                        this.mCameraObserver.onError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, "Camera is opening, ignore this switch request.");
                        return TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT;
                    }
                    this.mCameraSettings.f56181d = i;
                    this.mCurrentZoom = 0.0f;
                    if (this.mCameraInstance == null) {
                        this.mCameraInstance = createCameraInstance();
                        if (this.mCameraInstance == null) {
                            this.mCurrentCameraState = 0;
                            int i2 = this.mCameraSettings.f56177b;
                            if (i2 == 11) {
                                this.mCameraEvent.mo81681f(i2, -428, null, null);
                            } else {
                                this.mCameraObserver.onError(-100, "open : mCameraInstance is null.");
                            }
                            this.mIsCameraSwitchState = false;
                            return -1;
                        }
                    }
                    if (this.mCurrentCameraState != 0) {
                        updateCameraState(4);
                        this.mCameraInstance.mo81764f(cert);
                        updateCameraState(0);
                    }
                    updateCameraState(1);
                    this.mIsCameraSwitchState = false;
                    if (this.mRetryCnt < 0) {
                        this.mRetryCnt = this.mCameraSettings.f56217v;
                    }
                    this.mBeginTime = System.currentTimeMillis();
                    int iMo81760W = this.mCameraInstance.mo81760W(this.mCameraSettings, cert);
                    if (iMo81760W != 0) {
                        this.mCameraObserver.onError(iMo81760W, "Switch camera failed @" + this.mCameraSettings.f56177b + ",face:" + this.mCameraSettings.f56181d + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.mCameraSettings.f56207q.toString());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return 0;
    }
}
