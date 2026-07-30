package com.p008ss.android.ttvecamera;

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
import com.p008ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmParam;
import com.p008ss.android.ttvecamera.systemresmanager.TESystemResManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import l.e16;
import l.ig3;
import l.upk0;
import org.json.JSONObject;
import p009l.ajh0;
import p009l.cjh0;
import p009l.ti3;
import p009l.wjh0;
import p009l.xjh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public enum TECameraServer {
    INSTANCE;

    private static final String TAG = "TECameraServer";

    @GuardedBy("mLock")
    private C0733d mCameraClient;
    private volatile AbstractC0726c mCameraInstance;
    private TECameraSettings mCameraSettings;
    private Runnable mCheckCloseTask;
    private C0733d.a mFpsConfigCallback;
    private Handler mHandler;
    private HandlerThread mHandlerThread;
    private volatile boolean mIsCameraPendingClose;
    private volatile boolean mIsCameraProviderChanged;
    private volatile boolean mIsInitialized;
    private C0733d.d mPictureSizeCallback;
    cjh0 mProviderManager;
    private cjh0.C0813a mProviderSettings;
    private TECameraSettings.InterfaceC0714m mSATZoomCallback;
    private TESystemResManager mSystemResManager;
    private volatile boolean mHandlerDestroyed = true;
    private float mCurrentZoom = 0.0f;
    private C0733d.b mCameraObserver = new C0733d.c();
    private C0733d.e mPreviewSizeCallback = null;
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
    private AbstractC0726c.a mCameraEvent = new C0677n0();
    private final AbstractC0726c.b mFpsConfigCallbackProxy = new C0679o0();
    private final AbstractC0726c.d mPictureSizeCallBack = new C0681p0();
    private final AbstractC0726c.e mBasePreviewSizeCallback = new C0683q0();
    private AbstractC0726c.f satZoomCallback = new C0687s0();

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$a */
    public class RunnableC0648a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f8768a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f8769b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Cert f8770c;

        public RunnableC0648a(long j, boolean z, Cert cert) {
            this.f8768a = j;
            this.f8769b = z;
            this.f8770c = cert;
        }

        @Override // java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f8768a;
            C0743g.m11169e(TECameraServer.TAG, "Push close task cost: " + jCurrentTimeMillis);
            TECameraServer.this.close(this.f8769b, this.f8770c);
            TECameraServer.this.mIsCameraPendingClose = false;
            if (this.f8769b) {
                TECameraServer.this.mCameraClientCondition.open();
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f8768a;
            ajh0.m11494b("te_record_camera_push_close_task_time", jCurrentTimeMillis);
            ajh0.m11494b("te_record_camera_close_cost", jCurrentTimeMillis2);
            C0743g.m11170f("te_record_camera_close_cost", Long.valueOf(jCurrentTimeMillis2));
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$a0 */
    public class RunnableC0649a0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8772a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f8773b;

        public RunnableC0649a0(C0733d c0733d, boolean z) {
            this.f8772a = c0733d;
            this.f8773b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setAutoFocusLock(this.f8772a, this.f8773b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$a1 */
    public class RunnableC0650a1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8775a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f8776b;

        public RunnableC0650a1(C0733d c0733d, boolean z) {
            this.f8775a = c0733d;
            this.f8776b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.stop(this.f8775a, this.f8776b);
            if (this.f8776b) {
                TECameraServer.this.mCameraClientCondition.open();
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$b */
    public class RunnableC0651b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8778a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f8779b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Cert f8780c;

        public RunnableC0651b(C0733d c0733d, int i, Cert cert) {
            this.f8778a = c0733d;
            this.f8779b = i;
            this.f8780c = cert;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.switchCamera(this.f8778a, this.f8779b, this.f8780c);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$b0 */
    public class RunnableC0652b0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8782a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f8783b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f8784c;

        public RunnableC0652b0(C0733d c0733d, boolean z, String str) {
            this.f8782a = c0733d;
            this.f8783b = z;
            this.f8784c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setWhileBalance(this.f8782a, this.f8783b, this.f8784c);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$b1 */
    public static class C0653b1 implements Handler.Callback {

        /* JADX INFO: renamed from: a */
        private WeakReference<TECameraServer> f8786a;

        public C0653b1(TECameraServer tECameraServer) {
            this.f8786a = new WeakReference<>(tECameraServer);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            Object obj = message.obj;
            TECameraServer tECameraServer = this.f8786a.get();
            if (i == 1) {
                C0743g.m11165a(TECameraServer.TAG, "startZoom...");
                synchronized (tECameraServer.mStateLock) {
                    try {
                        if (tECameraServer.mCameraInstance != null) {
                            tECameraServer.mCameraInstance.mo10951w0(message.arg1 / 100.0f, (TECameraSettings.InterfaceC0717p) obj);
                        }
                        if (tECameraServer.mFirstZoom) {
                            tECameraServer.mCameraEvent.mo10848e(114, 0, "startzoom", tECameraServer.mCameraInstance);
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
    public class RunnableC0654c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8787a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ TECameraSettings f8788b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Cert f8789c;

        public RunnableC0654c(C0733d c0733d, TECameraSettings tECameraSettings, Cert cert) {
            this.f8787a = c0733d;
            this.f8788b = tECameraSettings;
            this.f8789c = cert;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.switchCamera(this.f8787a, this.f8788b, this.f8789c);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$c0 */
    public class RunnableC0655c0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8791a;

        public RunnableC0655c0(C0733d c0733d, TECameraSettings.InterfaceC0709h interfaceC0709h) {
            this.f8791a = c0733d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TECameraServer.this.getISORange(this.f8791a, null) != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$d */
    public class RunnableC0656d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8793a;

        public RunnableC0656d(C0733d c0733d, TECameraSettings.InterfaceC0706e interfaceC0706e) {
            this.f8793a = c0733d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.getFOV(this.f8793a, null);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$d0 */
    public class RunnableC0657d0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8795a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f8796b;

        public RunnableC0657d0(C0733d c0733d, int i) {
            this.f8795a = c0733d;
            this.f8796b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setISO(this.f8795a, this.f8796b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$e */
    public class RunnableC0658e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ti3 f8798a;

        public RunnableC0658e(TECameraSettings.InterfaceC0704c interfaceC0704c, ti3 ti3Var) {
            this.f8798a = ti3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (TECameraServer.this.mStateLock) {
                try {
                    if (TECameraServer.this.mCurrentCameraState == 3) {
                        if (TECameraServer.this.mCameraSettings.f8935b == 1) {
                            TECameraServer.this.updateCameraState(2);
                        }
                        TECameraServer.this.mCameraInstance.mo10979d(this.f8798a, null);
                    } else {
                        String str = "Can not takePicture on state : " + TECameraServer.this.mCurrentCameraState;
                        TECameraServer.this.mCameraObserver.onError(-105, str);
                        C0743g.m11166b(TECameraServer.TAG, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$e0 */
    public class RunnableC0659e0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8800a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ TECameraSettings.InterfaceC0708g f8801b;

        public RunnableC0659e0(C0733d c0733d, TECameraSettings.InterfaceC0708g interfaceC0708g) {
            this.f8800a = c0733d;
            this.f8801b = interfaceC0708g;
        }

        @Override // java.lang.Runnable
        public void run() {
            int iso = TECameraServer.this.getISO(this.f8800a, this.f8801b);
            if (iso >= 0) {
                this.f8801b.m10859a(iso);
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$f */
    public class RunnableC0660f implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f8803a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f8804b;

        public RunnableC0660f(TECameraSettings.InterfaceC0713l interfaceC0713l, int i, int i2) {
            this.f8803a = i;
            this.f8804b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (TECameraServer.this.mStateLock) {
                try {
                    if (TECameraServer.this.mCurrentCameraState == 3) {
                        if (TECameraServer.this.mCameraSettings.f8935b == 1) {
                            TECameraServer.this.updateCameraState(2);
                        }
                        TECameraServer.this.mCameraInstance.mo10914D0(this.f8803a, this.f8804b, null);
                    } else {
                        String str = "Can not takePicture on state : " + TECameraServer.this.mCurrentCameraState;
                        TECameraServer.this.mCameraObserver.onError(-105, str);
                        C0743g.m11166b(TECameraServer.TAG, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$f0 */
    public class RunnableC0661f0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8806a;

        public RunnableC0661f0(C0733d c0733d, TECameraSettings.InterfaceC0716o interfaceC0716o) {
            this.f8806a = c0733d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TECameraServer.this.getShutterTimeRange(this.f8806a, null) != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$g */
    public class RunnableC0662g implements Runnable {
        public RunnableC0662g(TECameraSettings.InterfaceC0713l interfaceC0713l) {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0743g.m11169e(TECameraServer.TAG, "takePicture");
            synchronized (TECameraServer.this.mStateLock) {
                try {
                    if (TECameraServer.this.mCurrentCameraState == 3) {
                        if (TECameraServer.this.mCameraSettings.f8935b == 1) {
                            TECameraServer.this.updateCameraState(2);
                        }
                        TECameraServer.this.mCameraInstance.mo10915E0(null);
                    } else {
                        String str = "Can not takePicture on state : " + TECameraServer.this.mCurrentCameraState;
                        TECameraServer.this.mCameraObserver.onError(-105, str);
                        C0743g.m11166b(TECameraServer.TAG, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$g0 */
    public class RunnableC0663g0 implements Runnable {
        public RunnableC0663g0() {
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
            C0743g.m11169e(TECameraServer.TAG, "close camera in main thread");
            if (!TECameraServer.this.mCameraSettings.f8924R || TECameraServer.this.mCameraInstance == null) {
                TECameraServer tECameraServer = TECameraServer.this;
                tECameraServer.realCloseCamera(tECameraServer.cachedClosePrivacyCert);
            } else {
                TECameraServer.this.updateCameraState(4);
                TECameraServer.this.mCameraInstance.mo10941n(TECameraServer.this.cachedClosePrivacyCert);
                TECameraServer.this.updateCameraState(0);
            }
            if (TECameraServer.this.decreaseClientCount() == 0) {
                TECameraServer.this.destroy();
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$h */
    public class RunnableC0664h implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8810a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ TEFocusSettings f8811b;

        public RunnableC0664h(C0733d c0733d, TEFocusSettings tEFocusSettings) {
            this.f8810a = c0733d;
            this.f8811b = tEFocusSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            int iFocusAtPoint = TECameraServer.this.focusAtPoint(this.f8810a, this.f8811b);
            if (iFocusAtPoint == 0 || this.f8811b.m10871g() == null) {
                return;
            }
            this.f8811b.m10871g().mo10885a(iFocusAtPoint, TECameraServer.this.mCameraSettings.f8939d, "");
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$h0 */
    public class RunnableC0665h0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8813a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ long f8814b;

        public RunnableC0665h0(C0733d c0733d, long j) {
            this.f8813a = c0733d;
            this.f8814b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setShutterTime(this.f8813a, this.f8814b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$i */
    public class RunnableC0666i implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8816a;

        public RunnableC0666i(C0733d c0733d) {
            this.f8816a = c0733d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.cancelFocus(this.f8816a);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$i0 */
    public class RunnableC0667i0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8818a;

        public RunnableC0667i0(C0733d c0733d, TECameraSettings.InterfaceC0702a interfaceC0702a) {
            this.f8818a = c0733d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TECameraServer.this.getApertureRange(this.f8818a, null) != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$j */
    public class RunnableC0668j implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8820a;

        public RunnableC0668j(C0733d c0733d) {
            this.f8820a = c0733d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.enableCaf(this.f8820a);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$j0 */
    public class RunnableC0669j0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8822a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ float f8823b;

        public RunnableC0669j0(C0733d c0733d, float f) {
            this.f8822a = c0733d;
            this.f8823b = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setAperture(this.f8822a, this.f8823b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$k */
    public class RunnableC0670k implements Runnable {
        public RunnableC0670k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.mProviderManager.m12624k();
            C0743g.m11169e(TECameraServer.TAG, "provider release...");
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$k0 */
    public class RunnableC0671k0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8826a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f8827b;

        public RunnableC0671k0(C0733d c0733d, boolean z) {
            this.f8826a = c0733d;
            this.f8827b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.toggleTorch(this.f8826a, this.f8827b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$l */
    public class RunnableC0672l implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8829a;

        public RunnableC0672l(C0733d c0733d, TECameraSettings.InterfaceC0710i interfaceC0710i) {
            this.f8829a = c0733d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TECameraServer.this.getManualFocusAbility(this.f8829a, null) >= 0.0f) {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$l0 */
    public class RunnableC0673l0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8831a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f8832b;

        public RunnableC0673l0(C0733d c0733d, int i) {
            this.f8831a = c0733d;
            this.f8832b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.switchFlashMode(this.f8831a, this.f8832b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$m */
    public class RunnableC0674m implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8834a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ float f8835b;

        public RunnableC0674m(C0733d c0733d, float f) {
            this.f8834a = c0733d;
            this.f8835b = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setManualFocusDistance(this.f8834a, this.f8835b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$m0 */
    public class C0675m0 implements Printer {

        /* JADX INFO: renamed from: a */
        private long f8837a = 0;

        /* JADX INFO: renamed from: b */
        private int f8838b = 0;

        /* JADX INFO: renamed from: c */
        private long f8839c = 0;

        public C0675m0() {
        }

        @Override // android.util.Printer
        public void println(String str) {
            if (str.startsWith(">>>>> Dispatching to Handler")) {
                this.f8837a = System.currentTimeMillis();
                return;
            }
            if (str.startsWith("<<<<< Finished to Handler")) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f8837a;
                if (jCurrentTimeMillis > 1000) {
                    int i = this.f8838b + 1;
                    this.f8838b = i;
                    ajh0.m11494b("te_record_camera_task_time_out_count", i);
                    if (jCurrentTimeMillis > this.f8839c) {
                        this.f8839c = jCurrentTimeMillis;
                        ajh0.m11494b("te_record_camera_max_lag_task_cost", jCurrentTimeMillis);
                        C0743g.m11169e(TECameraServer.TAG, "task: " + str + ", cost: " + jCurrentTimeMillis + "ms");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$n */
    public class RunnableC0676n implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f8841a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f8842b;

        public RunnableC0676n(int i, int i2) {
            this.f8841a = i;
            this.f8842b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TECameraServer.this.mCurrentCameraState == 3) {
                TECameraServer.this.mCameraInstance.mo10942n0(this.f8841a, this.f8842b);
                return;
            }
            C0743g.m11166b(TECameraServer.TAG, "set picture size failed, w: " + this.f8841a + ", h: " + this.f8842b + ", state: " + TECameraServer.this.mCurrentCameraState);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$n0 */
    public class C0677n0 implements AbstractC0726c.a {

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

        public C0677n0() {
        }

        @Override // com.p008ss.android.ttvecamera.AbstractC0726c.a
        /* JADX INFO: renamed from: a */
        public void mo10844a(int i, int i2, int i3, String str, Object obj) {
            C0743g.m11169e(TECameraServer.TAG, "startCapture success!");
            TECameraServer.this.mStartPreviewError = false;
            if (TECameraServer.this.mCameraSettings == null || TECameraServer.this.mCameraInstance == null) {
                mo10848e(i2, i3, str, obj);
            } else {
                int iM10997L = TECameraServer.this.mCameraSettings.f8977w - TECameraServer.this.mCameraInstance.m10997L();
                mo10848e(i2, iM10997L, str + ", Retry preview times = " + iM10997L, obj);
                TECameraServer.this.mCameraInstance.mo10933g();
            }
            ajh0.m11494b("te_record_camera_preview_ret", 0L);
        }

        @Override // com.p008ss.android.ttvecamera.AbstractC0726c.a
        /* JADX INFO: renamed from: b */
        public void mo10845b(int i, int i2, String str, Object obj) {
            if (TECameraServer.this.mCameraSettings.f8946g0 && i2 == -437) {
                ajh0.m11494b("te_record_camera_preview_ret", i2);
                Handler handler = TECameraServer.this.mHandler;
                if (handler == null) {
                    return;
                }
                handler.post(new a());
                return;
            }
            synchronized (TECameraServer.this.mStateLock) {
                try {
                    if (TECameraServer.this.mCameraInstance == null || TECameraServer.this.mCameraInstance.m10997L() <= 0) {
                        mo10846c(i, i2, str, obj);
                        ajh0.m11494b("te_record_camera_preview_ret", i2);
                    } else {
                        TECameraServer.this.mStartPreviewError = true;
                        C0743g.m11174j(TECameraServer.TAG, "Retry to startPreview. " + TECameraServer.this.mCameraInstance.m10997L() + " times is waiting to retry.");
                        TECameraServer.this.mCameraInstance.m11007e0();
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

        @Override // com.p008ss.android.ttvecamera.AbstractC0726c.a
        /* JADX INFO: renamed from: c */
        public void mo10846c(int i, int i2, String str, Object obj) {
            C0743g.m11166b(TECameraServer.TAG, "onCameraError: code = " + i2 + ", msg = " + str);
            TECameraServer.this.mCameraObserver.onError(i2, "Open camera failed @" + TECameraServer.this.mCameraSettings.f8935b + ",face:" + TECameraServer.this.mCameraSettings.f8939d + " " + TECameraServer.this.mCameraSettings.f8965q.toString() + " " + str);
        }

        @Override // com.p008ss.android.ttvecamera.AbstractC0726c.a
        /* JADX INFO: renamed from: d */
        public void mo10847d(int i, int i2, int i3, String str, Object obj) {
            C0743g.m11169e(TECameraServer.TAG, "stopCapture success!");
            mo10848e(i2, i3, str, obj);
        }

        @Override // com.p008ss.android.ttvecamera.AbstractC0726c.a
        /* JADX INFO: renamed from: e */
        public void mo10848e(int i, int i2, String str, Object obj) {
            C0743g.m11165a(TECameraServer.TAG, "onCameraInfo: " + i + ", ext: " + i2 + " msg: " + str);
            if (i == 108) {
                TECameraServer.this.updateCameraState(4);
            } else if (i == 109) {
                TECameraServer.this.updateCameraState(0);
            }
            TECameraServer.this.mCameraObserver.onInfo(i, i2, str);
        }

        @Override // com.p008ss.android.ttvecamera.AbstractC0726c.a
        /* JADX INFO: renamed from: f */
        public void mo10849f(int i, int i2, AbstractC0726c abstractC0726c, Object obj) {
            wjh0.m24289a("TECameraServer-onCameraOpened: cameraType " + i + ", ret " + i2);
            TECameraServer.this.mOpenTime = System.currentTimeMillis() - TECameraServer.this.mBeginTime;
            C0743g.m11169e(TECameraServer.TAG, "onCameraOpened: CameraType = " + TECameraServer.this.mCameraSettings.f8935b + ", Ret = " + i2 + ",retryCnt = " + TECameraServer.this.mRetryCnt);
            ConcurrentHashMap concurrentHashMap = TECameraServer.this.mOpenInfoMap;
            StringBuilder sb = new StringBuilder("CamType");
            sb.append(TECameraServer.this.mRetryCnt);
            concurrentHashMap.put(sb.toString(), String.valueOf(TECameraServer.this.mCameraSettings.f8935b));
            TECameraServer.this.mOpenInfoMap.put("Ret" + TECameraServer.this.mRetryCnt, String.valueOf(i2));
            TECameraServer.this.mOpenInfoMap.put("OpenTime" + TECameraServer.this.mRetryCnt, String.valueOf(TECameraServer.this.mOpenTime));
            TECameraServer tECameraServer = TECameraServer.this;
            if (i2 == 0) {
                tECameraServer.mRetryCnt = tECameraServer.mCameraSettings.f8975v;
                synchronized (TECameraServer.this.mStateLock) {
                    if (TECameraServer.this.mCurrentCameraState != 1) {
                        C0743g.m11174j(TECameraServer.TAG, "Open camera error ? May be closed now!!, state = " + TECameraServer.this.mCurrentCameraState);
                        return;
                    }
                    TECameraServer.this.updateCameraState(2);
                    TECameraServer.this.mCameraObserver.onCaptureStarted(i, i2);
                    int i3 = TECameraServer.this.mCameraSettings.f8975v - TECameraServer.this.mRetryCnt;
                    TECameraServer.this.mCameraObserver.onInfo(120, i3, "Retry open camera times = " + i3);
                    TECameraServer.this.mOpenInfoMap.put("ResultType", "Open Success");
                    ajh0.m11494b("te_record_camera_open_ret", (long) i2);
                    ajh0.m11494b("te_record_camera_open_cost", TECameraServer.this.mOpenTime);
                    ajh0.m11495c("te_record_camera_open_info", TECameraServer.this.mOpenInfoMap.toString());
                    C0743g.m11169e("VESDKCOST", "TE_RECORD_CAMERA_OPEN_COST " + TECameraServer.this.mOpenTime);
                    TECameraServer.this.mOpenInfoMap.clear();
                }
            } else if (tECameraServer.mCameraSettings.f8935b == 11 && i2 == -428) {
                C0743g.m11169e(TECameraServer.TAG, "CameraUnit auth failed, fall back to camera2");
                TECameraServer tECameraServer2 = TECameraServer.this;
                tECameraServer2.mRetryCnt = tECameraServer2.mCameraSettings.f8975v;
                synchronized (TECameraServer.this.mStateLock) {
                    try {
                        if (TECameraServer.this.mCurrentCameraState == 0) {
                            C0743g.m11174j(TECameraServer.TAG, "onCameraOpened, no need to close camera, state: " + TECameraServer.this.mCurrentCameraState);
                            TECameraServer.this.mCameraInstance = null;
                        } else {
                            TECameraServer.this.updateCameraState(4);
                            if (TECameraServer.this.mCameraInstance != null) {
                                TECameraServer.this.mCameraInstance.mo10932f(TECameraServer.this.cachedOpenPrivacyCert);
                                TECameraServer.this.mCameraInstance = null;
                            }
                            TECameraServer.this.updateCameraState(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                TECameraServer.this.mCameraSettings.f8935b = 2;
                TECameraServer.INSTANCE.open(TECameraServer.this.mCameraClient, TECameraServer.this.mCameraSettings, TECameraServer.this.cachedOpenPrivacyCert);
                TECameraServer.this.mOpenInfoMap.put("ResultType", "fallback to Camera2");
                ajh0.m11495c("te_record_camera_open_info", TECameraServer.this.mOpenInfoMap.toString());
                TECameraServer.this.mOpenInfoMap.clear();
            } else if (i2 != -403 && i2 != -408 && TECameraServer.this.mRetryCnt > 0 && TECameraServer.this.isCameraPermitted()) {
                TECameraServer.this.mCameraObserver.onError(-404, "Retry to Open Camera Failed @" + TECameraServer.this.mCameraSettings.f8935b + ",face:" + TECameraServer.this.mCameraSettings.f8939d + " " + TECameraServer.this.mCameraSettings.f8965q.toString());
                boolean z = TECameraServer.this.mIsCameraPendingClose;
                TECameraServer tECameraServer3 = TECameraServer.this;
                if (z) {
                    tECameraServer3.mIsCameraPendingClose = false;
                    C0743g.m11166b(TECameraServer.TAG, "retry to open camera, but camera close was called");
                    TECameraServer.this.mRetryCnt = -1;
                    TECameraServer.this.mOpenInfoMap.put("ResultType" + TECameraServer.this.mRetryCnt, "retry to open camera");
                    ajh0.m11495c("te_record_camera_open_info", TECameraServer.this.mOpenInfoMap.toString());
                    return;
                }
                if (tECameraServer3.mCameraSettings.f8933a == null) {
                    TECameraServer.this.mRetryCnt = -1;
                    C0743g.m11166b(TECameraServer.TAG, "abort retry to open camera, no context: " + TECameraServer.this.mCameraSettings);
                    return;
                }
                if (i == 2 && TECameraServer.this.mRetryCnt == TECameraServer.this.mCameraSettings.f8975v && (i2 == 4 || i2 == 5 || i2 == 1)) {
                    C0743g.m11169e(TECameraServer.TAG, "camera2 is not available");
                    TECameraServer tECameraServer4 = TECameraServer.this;
                    tECameraServer4.mRetryCnt = tECameraServer4.mCameraSettings.f8979x;
                }
                try {
                    Thread.sleep(30L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                C0743g.m11169e(TECameraServer.TAG, "retry to open camera, mRetryCnt = " + TECameraServer.this.mRetryCnt);
                synchronized (TECameraServer.this.mStateLock) {
                    try {
                        if (TECameraServer.this.mCurrentCameraState == 0) {
                            C0743g.m11174j(TECameraServer.TAG, "onCameraOpened, no need to close camera, state: " + TECameraServer.this.mCurrentCameraState);
                            TECameraServer.this.mCameraInstance = null;
                        } else {
                            TECameraServer.this.updateCameraState(4);
                            if (TECameraServer.this.mCameraInstance != null) {
                                TECameraServer.this.mCameraInstance.mo10932f(TECameraServer.this.cachedOpenPrivacyCert);
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
                ajh0.m11495c("te_record_camera_open_info", TECameraServer.this.mOpenInfoMap.toString());
            } else if ((!TECameraServer.this.mCameraSettings.f8918L || i == 1 || i2 == -408) && i2 != -403) {
                TECameraServer.this.mCameraObserver.onCaptureStarted(i, i2);
                C0743g.m11169e(TECameraServer.TAG, "finally go to the error.");
                ajh0.m11494b("te_record_camera_open_ret", i2);
                TECameraServer.this.mCameraObserver.onError(i2, "Open camera failed @" + TECameraServer.this.mCameraSettings.f8935b + ",face:" + TECameraServer.this.mCameraSettings.f8939d + " " + TECameraServer.this.mCameraSettings.f8965q.toString());
                TECameraServer.INSTANCE.close(TECameraServer.this.cachedOpenPrivacyCert);
                TECameraServer.this.mRetryCnt = -1;
                ajh0.m11495c("te_record_camera_open_info", TECameraServer.this.mOpenInfoMap.toString());
                TECameraServer.this.mOpenInfoMap.clear();
            } else {
                C0743g.m11169e(TECameraServer.TAG, "Open camera failed, fall back to camera1");
                TECameraServer tECameraServer5 = TECameraServer.this;
                tECameraServer5.mRetryCnt = tECameraServer5.mCameraSettings.f8975v;
                synchronized (TECameraServer.this.mStateLock) {
                    try {
                        if (TECameraServer.this.mCurrentCameraState == 0) {
                            C0743g.m11174j(TECameraServer.TAG, "onCameraOpened, no need to close camera, state: " + TECameraServer.this.mCurrentCameraState);
                            TECameraServer.this.mCameraInstance = null;
                        } else {
                            TECameraServer.this.updateCameraState(4);
                            if (TECameraServer.this.mCameraInstance != null) {
                                TECameraServer.this.mCameraInstance.mo10932f(TECameraServer.this.cachedOpenPrivacyCert);
                                TECameraServer.this.mCameraInstance = null;
                            }
                            TECameraServer.this.updateCameraState(0);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                TECameraServer.this.mCameraSettings.f8935b = 1;
                TECameraServer.this.mCameraEvent.mo10848e(51, 0, "need recreate surfacetexture", null);
                TECameraServer.INSTANCE.open(TECameraServer.this.mCameraClient, TECameraServer.this.mCameraSettings, TECameraServer.this.cachedOpenPrivacyCert);
                TECameraServer.this.mOpenInfoMap.put("ResultType", "fallback to Camera1");
                ajh0.m11495c("te_record_camera_open_info", TECameraServer.this.mOpenInfoMap.toString());
            }
            wjh0.m24290b();
        }

        @Override // com.p008ss.android.ttvecamera.AbstractC0726c.a
        /* JADX INFO: renamed from: g */
        public void mo10850g(int i, int i2, int i3, String str, Object obj) {
            StringBuilder sb = new StringBuilder("onTorchError ");
            sb.append(str);
            sb.append(i3 == 0 ? " close" : " open");
            C0743g.m11169e(TECameraServer.TAG, sb.toString());
        }

        @Override // com.p008ss.android.ttvecamera.AbstractC0726c.a
        /* JADX INFO: renamed from: h */
        public void mo10851h(int i, int i2, int i3, String str, Object obj) {
            StringBuilder sb = new StringBuilder("onTorchSuccess ");
            sb.append(str);
            sb.append(i3 == 0 ? " close" : " open");
            C0743g.m11169e(TECameraServer.TAG, sb.toString());
        }

        @Override // com.p008ss.android.ttvecamera.AbstractC0726c.a
        /* JADX INFO: renamed from: i */
        public void mo10852i(int i, AbstractC0726c abstractC0726c, Object obj) {
            C0743g.m11169e(TECameraServer.TAG, "onCameraClosed, CameraState = " + TECameraServer.this.mCurrentCameraState);
            if (abstractC0726c == TECameraServer.this.mCameraInstance) {
                synchronized (TECameraServer.this.mStateLock) {
                    TECameraServer.this.updateCameraState(0);
                }
                TECameraServer.this.mCameraObserver.onCaptureStopped(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$o */
    public class RunnableC0678o implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f8847a;

        public RunnableC0678o(int i) {
            this.f8847a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TECameraServer.this.mCameraInstance != null) {
                TECameraServer.this.mCameraInstance.mo10947r0(this.f8847a);
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$o0 */
    public class C0679o0 implements AbstractC0726c.b {
        public C0679o0() {
        }

        @Override // com.p008ss.android.ttvecamera.AbstractC0726c.b
        /* JADX INFO: renamed from: a */
        public int[] mo10853a(List<int[]> list) {
            TECameraServer.access$2700(TECameraServer.this);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$p */
    public class RunnableC0680p implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8850a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ TECameraSettings.InterfaceC0717p f8851b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f8852c;

        public RunnableC0680p(C0733d c0733d, TECameraSettings.InterfaceC0717p interfaceC0717p, boolean z) {
            this.f8850a = c0733d;
            this.f8851b = interfaceC0717p;
            this.f8852c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.queryZoomAbility(this.f8850a, this.f8851b, this.f8852c);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$p0 */
    public class C0681p0 implements AbstractC0726c.d {
        public C0681p0() {
        }

        @Override // com.p008ss.android.ttvecamera.AbstractC0726c.d
        /* JADX INFO: renamed from: a */
        public TEFrameSizei mo10854a(List<TEFrameSizei> list, List<TEFrameSizei> list2) {
            TECameraServer.access$2800(TECameraServer.this);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$q */
    public class RunnableC0682q implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8855a;

        public RunnableC0682q(C0733d c0733d, TECameraSettings.InterfaceC0715n interfaceC0715n) {
            this.f8855a = c0733d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.queryShaderZoomStep(this.f8855a, null);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$q0 */
    public class C0683q0 implements AbstractC0726c.e {
        public C0683q0() {
        }

        @Override // com.p008ss.android.ttvecamera.AbstractC0726c.e
        public TEFrameSizei getPreviewSize(List<TEFrameSizei> list) {
            if (TECameraServer.this.mPreviewSizeCallback != null) {
                try {
                    return TECameraServer.this.mPreviewSizeCallback.getPreviewSize(list);
                } catch (Exception e) {
                    C0743g.m11166b(TECameraServer.TAG, "select preview size from client err: " + e.getMessage());
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$r */
    public class RunnableC0684r implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8858a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ TECameraSettings.InterfaceC0717p f8859b;

        public RunnableC0684r(C0733d c0733d, TECameraSettings.InterfaceC0717p interfaceC0717p) {
            this.f8858a = c0733d;
            this.f8859b = interfaceC0717p;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.stopZoom(this.f8858a, this.f8859b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$r0 */
    public class RunnableC0685r0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8861a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f8862b;

        public RunnableC0685r0(C0733d c0733d, int i) {
            this.f8861a = c0733d;
            this.f8862b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.switchCameraMode(this.f8861a, this.f8862b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$s */
    public class RunnableC0686s implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8864a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ float f8865b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ TECameraSettings.InterfaceC0717p f8866c;

        public RunnableC0686s(C0733d c0733d, float f, TECameraSettings.InterfaceC0717p interfaceC0717p) {
            this.f8864a = c0733d;
            this.f8865b = f;
            this.f8866c = interfaceC0717p;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.zoomV2(this.f8864a, this.f8865b, this.f8866c);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$s0 */
    public class C0687s0 implements AbstractC0726c.f {
        public C0687s0() {
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$t */
    public class RunnableC0688t implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8869a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Bundle f8870b;

        public RunnableC0688t(C0733d c0733d, Bundle bundle) {
            this.f8869a = c0733d;
            this.f8870b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setFeatureParameters(this.f8869a, this.f8870b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$t0 */
    public class RunnableC0689t0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8872a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f8873b;

        public RunnableC0689t0(C0733d c0733d, int i, AbstractC0726c.c cVar) {
            this.f8872a = c0733d;
            this.f8873b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.changeRecorderState(this.f8872a, this.f8873b, null);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$u */
    public class RunnableC0690u implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8875a;

        public RunnableC0690u(C0733d c0733d, TECameraSettings.C0711j c0711j) {
            this.f8875a = c0733d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.process(this.f8875a, null);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$u0 */
    public class RunnableC0691u0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8877a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f8878b;

        public RunnableC0691u0(C0733d c0733d, boolean z) {
            this.f8877a = c0733d;
            this.f8878b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.enableMulticamZoom(this.f8877a, this.f8878b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$v */
    public class RunnableC0692v implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f8880a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C0733d f8881b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ TECameraSettings f8882c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Cert f8883d;

        public RunnableC0692v(long j, C0733d c0733d, TECameraSettings tECameraSettings, Cert cert) {
            this.f8880a = j;
            this.f8881b = c0733d;
            this.f8882c = tECameraSettings;
            this.f8883d = cert;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0743g.m11165a(TECameraServer.TAG, "Push open task cost: " + (System.currentTimeMillis() - this.f8880a));
            ajh0.m11494b("te_record_camera_push_open_task_time", System.currentTimeMillis() - this.f8880a);
            TECameraServer.this.open(this.f8881b, this.f8882c, this.f8883d);
            C0743g.m11169e(TECameraServer.TAG, "Camera open cost: " + (System.currentTimeMillis() - this.f8880a) + "ms");
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$v0 */
    public class RunnableC0693v0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8885a;

        public RunnableC0693v0(C0733d c0733d, TECameraSettings.InterfaceC0703b interfaceC0703b) {
            this.f8885a = c0733d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.getCameraCapbilitiesForBytebench(this.f8885a, null);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$w */
    public class RunnableC0694w implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f8887a;

        public RunnableC0694w(int i) {
            this.f8887a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (TECameraServer.this.mStateLock) {
                try {
                    if (TECameraServer.this.mCameraInstance == null) {
                        return;
                    }
                    boolean zMo10937j0 = TECameraServer.this.mCameraInstance.mo10937j0(this.f8887a);
                    if (TECameraServer.this.mFirstEC && zMo10937j0) {
                        TECameraServer.this.mCameraEvent.mo10848e(115, 0, "exposure compensation", TECameraServer.this.mCameraInstance);
                        TECameraServer.this.mFirstEC = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$w0 */
    public class RunnableC0695w0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8889a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ cjh0.C0813a f8890b;

        public RunnableC0695w0(C0733d c0733d, cjh0.C0813a c0813a) {
            this.f8889a = c0733d;
            this.f8890b = c0813a;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.addCameraProvider(this.f8889a, this.f8890b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$x */
    public class RunnableC0696x implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8892a;

        public RunnableC0696x(C0733d c0733d) {
            this.f8892a = c0733d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.upExposureCompensation(this.f8892a);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$x0 */
    public class RunnableC0697x0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8894a;

        public RunnableC0697x0(C0733d c0733d) {
            this.f8894a = c0733d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.removeCameraProvider(this.f8894a);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$y */
    public class RunnableC0698y implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8896a;

        public RunnableC0698y(C0733d c0733d) {
            this.f8896a = c0733d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.downExposureCompensation(this.f8896a);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$y0 */
    public class RunnableC0699y0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8898a;

        public RunnableC0699y0(C0733d c0733d) {
            this.f8898a = c0733d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.start(this.f8898a);
            if (TECameraServer.this.mCameraSettings.f8953k) {
                TECameraServer.this.mCameraClientCondition.open();
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$z */
    public class RunnableC0700z implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0733d f8900a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f8901b;

        public RunnableC0700z(C0733d c0733d, boolean z) {
            this.f8900a = c0733d;
            this.f8901b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setAutoExposureLock(this.f8900a, this.f8901b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$z0 */
    public class RunnableC0701z0 implements Runnable {
        public RunnableC0701z0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TECameraServer.this.mCameraInstance != null) {
                TECameraServer.this.mCameraInstance.mo10976a();
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

    public static /* synthetic */ C0733d.a access$2700(TECameraServer tECameraServer) {
        tECameraServer.getClass();
        return null;
    }

    public static /* synthetic */ C0733d.d access$2800(TECameraServer tECameraServer) {
        tECameraServer.getClass();
        return null;
    }

    public static /* synthetic */ TECameraSettings.InterfaceC0714m access$3000(TECameraServer tECameraServer) {
        tECameraServer.getClass();
        return null;
    }

    private boolean assertClient(C0733d c0733d) {
        synchronized (this.mLock) {
            try {
                C0733d c0733d2 = this.mCameraClient;
                if (c0733d2 == c0733d) {
                    return true;
                }
                if (c0733d2 == null) {
                    C0743g.m11174j(TAG, "Internal CameraClient is null. Must call connect first!");
                } else {
                    C0743g.m11174j(TAG, "Invalid CameraClient, need : " + this.mCameraClient);
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
                C0743g.m11166b(TAG, "call camera close process, handler is null");
                this.mCameraInstance.mo10941n(this.cachedClosePrivacyCert);
                C0743g.m11174j(TAG, "call camera close process, handler is null, force close done");
            }
            updateCameraState(0);
            return -112;
        }
        C0743g.m11169e(TAG, "call camera close process...sync: " + z + ", handler: " + handler);
        if (this.mHandlerDestroyed || Looper.myLooper() == handler.getLooper()) {
            this.mCameraCloseTaskHandlerId = -1;
            if (this.mEnableVBoost) {
                this.mSystemResManager.m11178c(new TESystemResManager.C0744a(TESystemResManager.ActionType.BOOST_CPU, this.mVBoostTimeoutMS));
                realCloseCamera(cert);
                this.mSystemResManager.m11178c(new TESystemResManager.C0744a(TESystemResManager.ActionType.RESTORE_CPU));
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
                C0743g.m11166b(TAG, "camera close task discard...handler id has changed");
                return 0;
            }
            this.mCameraCloseTaskHandlerId = iHashCode;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z) {
                this.mCameraClientCondition.close();
            }
            this.mIsCameraPendingClose = true;
            handler.post(new RunnableC0648a(jCurrentTimeMillis, z, cert));
            if (z) {
                boolean zBlock = this.mCameraClientCondition.block(1500L);
                this.mIsCameraPendingClose = false;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                if (zBlock) {
                    C0743g.m11169e(TAG, "Camera close cost: " + jCurrentTimeMillis2 + "ms");
                } else {
                    this.mCameraCloseTaskHandlerId = -1;
                    C0743g.m11166b(TAG, "Camera close timeout, mCurrentCameraState " + this.mCurrentCameraState);
                    updateCameraState(4);
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo10941n(this.cachedClosePrivacyCert);
                    }
                    updateCameraState(0);
                }
            }
        }
        return 0;
    }

    @Nullable
    private AbstractC0726c createCameraInstance() {
        AbstractC0726c abstractC0726cCreateCameraInstanceCore = createCameraInstanceCore();
        if (abstractC0726cCreateCameraInstanceCore != null) {
            abstractC0726cCreateCameraInstanceCore.m11004c0(this.mPreviewSizeCallback != null ? this.mBasePreviewSizeCallback : null);
            abstractC0726cCreateCameraInstanceCore.m11003b0(null);
        }
        return abstractC0726cCreateCameraInstanceCore;
    }

    private AbstractC0726c createCameraInstanceCore() {
        TECameraSettings tECameraSettings = this.mCameraSettings;
        boolean z = !tECameraSettings.f8970s0 || C0735f.m11070u(tECameraSettings.f8933a);
        TECameraSettings tECameraSettings2 = this.mCameraSettings;
        int i = tECameraSettings2.f8935b;
        if (i == 1) {
            return C0724a.m10903N0(tECameraSettings2.f8933a, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        }
        if ((10 != i && 11 != i) || Build.VERSION.SDK_INT < 28) {
            if (!z) {
                tECameraSettings2.f8935b = 1;
                return C0724a.m10903N0(tECameraSettings2.f8933a, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
            }
            AbstractC0726c abstractC0726cCreateVendorCamera2Instance = createVendorCamera2Instance(i, tECameraSettings2.f8933a, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
            if (abstractC0726cCreateVendorCamera2Instance != null) {
                return abstractC0726cCreateVendorCamera2Instance;
            }
            TECameraSettings tECameraSettings3 = this.mCameraSettings;
            tECameraSettings3.f8935b = 2;
            return C0725b.m10955Q0(2, tECameraSettings3.f8933a, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        }
        AbstractC0726c abstractC0726c = (AbstractC0726c) C0735f.m11059j("com.ss.android.ttvecamera.TEVendorCamera", i, tECameraSettings2.f8933a, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        if (abstractC0726c != null) {
            C0743g.m11169e(TAG, "createCameraInstance TEVendorCamera");
            return abstractC0726c;
        }
        TECameraSettings tECameraSettings4 = this.mCameraSettings;
        if (z) {
            tECameraSettings4.f8935b = 2;
            return C0725b.m10955Q0(2, tECameraSettings4.f8933a, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        }
        tECameraSettings4.f8935b = 1;
        return C0724a.m10903N0(tECameraSettings4.f8933a, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
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
                handlerThread2.getLooper().setMessageLogging(new C0675m0());
                this.mHandlerThread = handlerThread2;
                return new Handler(handlerThread2.getLooper(), new C0653b1(this));
            } catch (Exception e) {
                C0743g.m11166b(TAG, "CreateHandler failed!: " + e.toString());
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
    private AbstractC0726c createVendorCamera2Instance(int i, Context context, AbstractC0726c.a aVar, Handler handler, AbstractC0726c.d dVar) {
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
                C0725b c0725b = (C0725b) C0735f.m11059j(str, i, context, aVar, handler, dVar);
                C0743g.m11169e(TAG, "create, vendorCamera2 = " + c0725b);
                return c0725b;
            }
            str2 = "com.ss.android.ttvecamera.TEXmV2Camera";
        }
        str = str2;
        if (str != null) {
            return null;
        }
        C0725b c0725b2 = (C0725b) C0735f.m11059j(str, i, context, aVar, handler, dVar);
        C0743g.m11169e(TAG, "create, vendorCamera2 = " + c0725b2);
        return c0725b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int decreaseClientCount() {
        try {
            this.sClientCount--;
            C0743g.m11165a(TAG, "sClientCount = " + this.sClientCount);
            if (this.sClientCount < 0) {
                C0743g.m11174j(TAG, "Invalid ClientCount = " + this.sClientCount);
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
            C0743g.m11169e(TAG, "destroy...start");
            this.mIsInitialized = false;
            this.mCheckCloseTask = null;
            this.mCameraClient = null;
            this.mPreviewSizeCallback = null;
            this.cachedClosePrivacyCert = null;
            this.cachedOpenPrivacyCert = null;
            this.mProviderSettings = null;
            if (this.mCameraInstance != null) {
                this.mCameraInstance.mo10981i();
            }
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new RunnableC0670k());
            }
            HandlerThread handlerThread = this.mHandlerThread;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                this.mHandlerThread = null;
                this.mHandlerDestroyed = true;
                this.mHandler = null;
            }
            this.mCameraObserver = C0733d.c.m11048a();
            C0743g.m11169e(TAG, "destroy...end");
        } catch (Throwable th) {
            throw th;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePreviewingFallback() {
        boolean z;
        if (this.mCameraSettings.f8935b == 1) {
            return;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 3) {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo10953x0();
                        updateCameraState(4);
                        this.mCameraInstance.mo10932f(this.cachedOpenPrivacyCert);
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
            this.mCameraSettings.f8935b = 1;
            this.mCameraEvent.mo10848e(51, 0, "need recreate surfacetexture", null);
            INSTANCE.open(this.mCameraClient, this.mCameraSettings, this.cachedOpenPrivacyCert);
        }
    }

    private synchronized int increaseClientCount() {
        this.sClientCount++;
        C0743g.m11165a(TAG, "sClientCount = " + this.sClientCount);
        return this.sClientCount;
    }

    private synchronized void init(boolean z) {
        C0743g.m11169e(TAG, "init...start");
        if (this.mIsInitialized) {
            return;
        }
        this.mHandler = createHandler(z, TAG);
        this.mHandlerDestroyed = false;
        this.mProviderManager = new cjh0();
        this.mIsInitialized = true;
        this.mCurrentZoom = 0.0f;
        this.mOnBackGround = false;
        this.mMainHandler = new Handler(Looper.getMainLooper());
        this.mSystemResManager = new TESystemResManager();
        C0743g.m11169e(TAG, "init...end");
    }

    private boolean isARConfigNotEqual(TECameraSettings tECameraSettings) {
        TECameraSettings tECameraSettings2 = this.mCameraSettings;
        if (tECameraSettings2 == null) {
            return true;
        }
        if (tECameraSettings.f8908B != 2) {
            return false;
        }
        TECameraSettings.ARConfig aRConfig = tECameraSettings2.f8982y0;
        return (aRConfig != null && aRConfig.f8984a.ordinal() == tECameraSettings.f8982y0.f8984a.ordinal() && this.mCameraSettings.f8982y0.f8985b.ordinal() == tECameraSettings.f8982y0.f8985b.ordinal() && this.mCameraSettings.f8982y0.f8986c.ordinal() == tECameraSettings.f8982y0.f8986c.ordinal() && this.mCameraSettings.f8982y0.f8987d.ordinal() == tECameraSettings.f8982y0.f8987d.ordinal() && this.mCameraSettings.f8982y0.f8988e.ordinal() == tECameraSettings.f8982y0.f8988e.ordinal() && this.mCameraSettings.f8982y0.f8989f.ordinal() == tECameraSettings.f8982y0.f8989f.ordinal()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isCameraPermitted() {
        boolean z = true;
        try {
            if (e16.a(this.mCameraSettings.f8933a, "android.permission.CAMERA") != 0) {
                z = false;
            }
        } catch (Exception e) {
            C0743g.m11166b(TAG, "test camera permission failed!: " + e.toString());
        }
        this.mOpenInfoMap.put("CamPerm" + this.mRetryCnt, String.valueOf(z));
        return z;
    }

    private boolean onlySwitchSession(TECameraSettings tECameraSettings) {
        int i;
        TECameraSettings tECameraSettings2 = this.mCameraSettings;
        if (tECameraSettings2 == null || tECameraSettings2.f8939d != 0 || tECameraSettings.f8939d != 0 || (i = tECameraSettings2.f8935b) != 11 || i != tECameraSettings.f8935b) {
            return false;
        }
        TEFrameSizei tEFrameSizei = tECameraSettings2.f8965q;
        int i2 = tEFrameSizei.width;
        TEFrameSizei tEFrameSizei2 = tECameraSettings.f8965q;
        if (i2 != tEFrameSizei2.width || tEFrameSizei.height != tEFrameSizei2.height || tECameraSettings2.f8920N != tECameraSettings.f8920N || tECameraSettings2.f8910D != tECameraSettings.f8910D || tECameraSettings2.f8973u != tECameraSettings.f8973u || tECameraSettings2.f8983z != tECameraSettings.f8983z || tECameraSettings2.f8927U == tECameraSettings.f8927U || tECameraSettings2.f8928V == tECameraSettings.f8928V) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("enable_video_stabilization", tECameraSettings.f8927U);
        bundle.putBoolean("enable_ai_night_video", tECameraSettings.f8928V);
        this.mCameraInstance.mo10938k0(bundle);
        this.mCameraSettings = tECameraSettings;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int open(@NonNull C0733d c0733d, TECameraSettings tECameraSettings, Cert cert) {
        int iMo10928W;
        if (!assertClient(c0733d)) {
            return -108;
        }
        if (this.mIsCameraPendingClose) {
            C0743g.m11166b(TAG, "pending close");
            return -105;
        }
        if (tECameraSettings.f8948h0 && this.mOnBackGround) {
            C0743g.m11166b(TAG, "in background");
            return -105;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            C0743g.m11166b(TAG, "open, mHandler is null!");
            return -112;
        }
        if (this.mIsCameraPendingClose) {
            C0743g.m11166b(TAG, "had called disConnect(), abandon open camera!");
            return -113;
        }
        if (this.mHandlerDestroyed || Looper.myLooper() == handler.getLooper()) {
            wjh0.m24289a("TECameraServer-open");
            this.mCameraSettings = tECameraSettings;
            C0743g.m11169e(TAG, "is force close camera=" + this.mCameraSettings.f8924R + ", Camera2Detect=" + this.mCameraSettings.f8970s0);
            this.mCheckCloseTask = new RunnableC0663g0();
            this.mCurrentZoom = 0.0f;
            if (this.mRetryCnt < 0) {
                this.mRetryCnt = tECameraSettings.f8975v;
            }
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState != 0) {
                        C0743g.m11174j(TAG, "No need open camera again, state = " + this.mCurrentCameraState);
                        if (this.mCurrentCameraState != 1) {
                            this.mCameraObserver.onInfo(1, 0, "Camera features is ready");
                        }
                        wjh0.m24290b();
                        return 0;
                    }
                    updateCameraState(1);
                    if (this.mCameraInstance == null) {
                        this.mCameraInstance = createCameraInstance();
                        if (this.mCameraInstance == null) {
                            if (this.mCameraSettings.f8935b == 11) {
                                updateCameraState(0);
                                this.mCameraEvent.mo10849f(this.mCameraSettings.f8935b, -428, null, null);
                            } else {
                                updateCameraState(0);
                                this.mCameraObserver.onError(-100, "open : mCameraInstance is null.");
                            }
                            return -1;
                        }
                        this.mCameraInstance.m11011q0(this.satZoomCallback);
                    }
                    this.mBeginTime = System.currentTimeMillis();
                    if (this.mEnableVBoost) {
                        this.mSystemResManager.m11178c(new TESystemResManager.C0744a(TESystemResManager.ActionType.BOOST_CPU, this.mVBoostTimeoutMS));
                        iMo10928W = this.mCameraInstance.mo10928W(this.mCameraSettings, cert);
                        this.mSystemResManager.m11178c(new TESystemResManager.C0744a(TESystemResManager.ActionType.RESTORE_CPU));
                    } else {
                        iMo10928W = this.mCameraInstance.mo10928W(this.mCameraSettings, cert);
                    }
                    if (iMo10928W != 0) {
                        C0743g.m11174j(TAG, "Open camera failed, ret = " + iMo10928W);
                    }
                    wjh0.m24290b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            handler.post(new RunnableC0692v(System.currentTimeMillis(), c0733d, tECameraSettings, cert));
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void realCloseCamera(Cert cert) {
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 0) {
                    C0743g.m11174j(TAG, "realCloseCamera, no need to close camera, state: " + this.mCurrentCameraState);
                } else {
                    updateCameraState(4);
                    if (this.mCameraInstance != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        this.mCameraInstance.mo10932f(cert);
                        C0743g.m11169e(TAG, "system call close() cost: " + (System.currentTimeMillis() - jCurrentTimeMillis));
                    }
                    updateCameraState(0);
                }
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo10981i();
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
        if (tECameraSettings2.f8935b != tECameraSettings.f8935b) {
            return true;
        }
        TEFrameSizei tEFrameSizei = tECameraSettings2.f8965q;
        int i = tEFrameSizei.width;
        TEFrameSizei tEFrameSizei2 = tECameraSettings.f8965q;
        return (i == tEFrameSizei2.width && tEFrameSizei.height == tEFrameSizei2.height && tECameraSettings2.f8939d == tECameraSettings.f8939d && tECameraSettings2.f8920N == tECameraSettings.f8920N && tECameraSettings2.f8927U == tECameraSettings.f8927U && tECameraSettings2.f8910D == tECameraSettings.f8910D && tECameraSettings2.f8973u == tECameraSettings.f8973u && tECameraSettings2.f8983z == tECameraSettings.f8983z && tECameraSettings2.f8908B == tECameraSettings.f8908B && !isARConfigNotEqual(tECameraSettings)) ? false : true;
    }

    public int abortSession(C0733d c0733d) {
        if (!assertClient(c0733d)) {
            return -108;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            C0743g.m11166b(TAG, "abortSession, mHandler is null!");
            return -112;
        }
        handler.post(new RunnableC0701z0());
        return 0;
    }

    public void addCameraAlgorithm(TECameraAlgorithmParam tECameraAlgorithmParam) {
        if (this.mCameraInstance == null) {
            C0743g.m11166b(TAG, "addCameraAlgorithm failed mCameraInstance is null!");
        } else {
            this.mCameraInstance.m11002b(tECameraAlgorithmParam);
        }
    }

    public int addCameraProvider(C0733d c0733d, cjh0.C0813a c0813a) {
        cjh0.C0813a c0813a2;
        if (!assertClient(c0733d)) {
            return -108;
        }
        if (this.mHandlerDestroyed || Looper.myLooper() == this.mHandler.getLooper()) {
            C0743g.m11169e(TAG, "addCameraProvider");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance == null) {
                        this.mCameraObserver.onError(-100, "Invalidate Camera Instance!!");
                        return -100;
                    }
                    C0743g.m11169e(TAG, "addCameraProvider, mProviderSettings = " + this.mProviderSettings + ", providerSettings = " + c0813a);
                    if (this.mProviderSettings == null || this.mCameraInstance.m10996K() == null || !((c0813a2 = this.mProviderSettings) == null || c0813a2.m12627b(c0813a))) {
                        this.mProviderManager.m12614a(c0813a, this.mCameraInstance);
                        this.mIsCameraProviderChanged = true;
                        cjh0.C0813a c0813a3 = this.mProviderSettings;
                        if (c0813a3 == null) {
                            this.mProviderSettings = new cjh0.C0813a(c0813a);
                        } else {
                            c0813a3.m12626a(c0813a);
                        }
                    } else {
                        this.mIsCameraProviderChanged = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            this.mHandler.post(new RunnableC0695w0(c0733d, c0813a));
        }
        return 0;
    }

    public void appLifeCycleChanged(boolean z) {
        this.mOnBackGround = z;
    }

    public int cancelFocus(C0733d c0733d) {
        if (!assertClient(c0733d)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC0666i(c0733d));
            return 0;
        }
        C0743g.m11169e(TAG, "cancelFocus...");
        synchronized (this.mStateLock) {
            this.mCameraInstance.mo10931c();
        }
        return 0;
    }

    public int captureBurst(C0733d c0733d, TECameraSettings.InterfaceC0704c interfaceC0704c, ti3 ti3Var) {
        if (!assertClient(c0733d)) {
            return -108;
        }
        this.mHandler.post(new RunnableC0658e(interfaceC0704c, ti3Var));
        return 0;
    }

    public void changeCaptureFormat() {
    }

    public int changeRecorderState(C0733d c0733d, int i, AbstractC0726c.c cVar) {
        if (!assertClient(c0733d)) {
            return -108;
        }
        if (!this.mHandlerDestroyed && Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC0689t0(c0733d, i, cVar));
            return 0;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance == null) {
                    this.mCameraObserver.onError(-100, "Invalidate Camera Instance!!");
                    return -100;
                }
                this.mCameraInstance.m11006e(i, cVar);
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int connect(@NonNull C0733d c0733d, @NonNull C0733d.b bVar, @NonNull TECameraSettings tECameraSettings, C0733d.d dVar, Cert cert) {
        C0743g.m11169e(TAG, "connect with client: " + c0733d);
        if (c0733d == null) {
            ig3.a("client must not be null");
            return 0;
        }
        if (bVar == null) {
            ig3.a("observer must not be null");
            return 0;
        }
        if (tECameraSettings == null) {
            ig3.a("mParams must not be null");
            return 0;
        }
        this.mMainHandler.removeCallbacks(this.mCheckCloseTask);
        synchronized (this.mLock) {
            try {
                boolean zShouldReOpenCamera = shouldReOpenCamera(tECameraSettings);
                if (c0733d == this.mCameraClient && !zShouldReOpenCamera) {
                    C0743g.m11174j(TAG, "No need reconnect.");
                    return 0;
                }
                if (!this.mIsInitialized) {
                    init(true);
                    zShouldReOpenCamera = false;
                }
                this.mCameraClient = c0733d;
                this.mCameraObserver = bVar;
                boolean z = tECameraSettings.f8925S;
                this.mEnableVBoost = z;
                this.mRetryCnt = -1;
                if (z) {
                    this.mVBoostTimeoutMS = tECameraSettings.f8926T;
                    this.mSystemResManager.m11177b(new xjh0());
                    this.mSystemResManager.m11176a(tECameraSettings.f8933a);
                }
                increaseClientCount();
                if (zShouldReOpenCamera) {
                    C0743g.m11169e(TAG, "reopen camera.");
                    close(cert);
                }
                this.mIsCameraPendingClose = false;
                this.cachedOpenPrivacyCert = cert;
                return open(c0733d, tECameraSettings, cert);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean couldForwardState(int i) {
        if (i == this.mCurrentCameraState) {
            C0743g.m11174j(TAG, "No need this");
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    return this.mCurrentCameraState == 1;
                }
                C0743g.m11166b(TAG, "Invalidate camera state = " + i);
                return false;
            }
            if (this.mCurrentCameraState != 0) {
                C0743g.m11174j(TAG, "No need open camera again, state = " + this.mCurrentCameraState);
            }
        }
        return true;
    }

    public int disConnect(C0733d c0733d, boolean z, Cert cert) {
        C0743g.m11169e(TAG, "disConnect with client: " + c0733d);
        this.mIsCameraSwitchState = false;
        synchronized (this.mLock) {
            C0733d c0733d2 = this.mCameraClient;
            if (c0733d2 != c0733d || c0733d2 == null) {
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

    public void downExposureCompensation(C0733d c0733d) {
        if (assertClient(c0733d)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new RunnableC0698y(c0733d));
                return;
            }
            C0743g.m11169e(TAG, "downExposureCompensation...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState != 3 && this.mCurrentCameraState != 2) {
                        this.mCameraObserver.onError(-105, "Can not set ec on state : " + this.mCurrentCameraState);
                        return;
                    }
                    TECameraSettings.C0705d c0705dM11012s = this.mCameraInstance.m11012s();
                    if (c0705dM11012s == null) {
                        this.mCameraObserver.onError(-112, "downExposureCompensation get ec info failed");
                    } else {
                        this.mCameraInstance.mo10937j0(c0705dM11012s.f8991b - 1);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public int enableCaf(C0733d c0733d) {
        if (!assertClient(c0733d)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC0668j(c0733d));
            return 0;
        }
        C0743g.m11169e(TAG, "enableCaf...");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo10936j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public int enableMulticamZoom(C0733d c0733d, boolean z) {
        if (!assertClient(c0733d)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC0691u0(c0733d, z));
            return 0;
        }
        C0743g.m11169e(TAG, "enableMulticamZoom: " + z);
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo10982k(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public int focusAtPoint(C0733d c0733d, TEFocusSettings tEFocusSettings) {
        if (!assertClient(c0733d)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC0664h(c0733d, tEFocusSettings));
            return 0;
        }
        C0743g.m11169e(TAG, "focusAtPoint at: " + tEFocusSettings);
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 3) {
                    this.mCameraInstance.mo10940m(tEFocusSettings);
                    return 0;
                }
                String str = "Can not set focus on state : " + this.mCurrentCameraState;
                C0743g.m11174j(TAG, str);
                this.mCameraObserver.onError(-105, str);
                return -105;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public float[] getApertureRange(C0733d c0733d, TECameraSettings.InterfaceC0702a interfaceC0702a) {
        float[] fArrMo10985o = {0.0f};
        if (!assertClient(c0733d)) {
            return new float[]{-1.0f, -1.0f};
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC0667i0(c0733d, interfaceC0702a));
            return fArrMo10985o;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    fArrMo10985o = this.mCameraInstance.mo10985o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fArrMo10985o;
    }

    public TEFrameSizei getBestPreviewSize(C0733d c0733d, float f, TEFrameSizei tEFrameSizei) {
        if (!assertClient(c0733d) || this.mCurrentCameraState == 0 || this.mCurrentCameraState == 1) {
            return null;
        }
        return this.mCameraInstance.mo10944p(f, tEFrameSizei);
    }

    public JSONObject getCameraCapbilitiesForBytebench(C0733d c0733d, TECameraSettings.InterfaceC0703b interfaceC0703b) {
        JSONObject jSONObject = new JSONObject();
        if (!assertClient(c0733d)) {
            return null;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC0693v0(c0733d, interfaceC0703b));
            return jSONObject;
        }
        C0743g.m11169e(TAG, "getCameraCapbilitiesForBytebench");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    jSONObject = this.mCameraInstance.mo10945q();
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
        return this.mCameraInstance.mo10946r();
    }

    public TECameraSettings.C0705d getCameraECInfo(C0733d c0733d) {
        if (assertClient(c0733d) && this.mCameraInstance != null) {
            return this.mCameraInstance.m11012s();
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

    public int getExposureCompensation(C0733d c0733d) {
        if (!assertClient(c0733d)) {
            upk0.a("Client is not connected!!!");
            return 0;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    return this.mCameraInstance.m11015w();
                }
                this.mCameraObserver.onError(-105, "Can not get ec on state : " + this.mCurrentCameraState);
                return -105;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public float[] getFOV(C0733d c0733d, TECameraSettings.InterfaceC0706e interfaceC0706e) {
        float[] fArr = new float[2];
        if (!assertClient(c0733d)) {
            return new float[]{-2.0f, -2.0f};
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC0656d(c0733d, interfaceC0706e));
            return fArr;
        }
        C0743g.m11169e(TAG, "getFOV");
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 3) {
                    return this.mCameraInstance.mo10952x();
                }
                this.mCameraObserver.onError(-105, "Can not getFOV on state : " + this.mCurrentCameraState);
                return new float[]{-2.0f, -2.0f};
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getFlashMode(C0733d c0733d) {
        if (this.mCameraInstance == null) {
            return -1;
        }
        return this.mCameraInstance.mo10910B();
    }

    public int getISO(C0733d c0733d, TECameraSettings.InterfaceC0708g interfaceC0708g) {
        int iMo10958F;
        if (!assertClient(c0733d)) {
            return -1;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC0659e0(c0733d, interfaceC0708g));
            return -1;
        }
        synchronized (this.mStateLock) {
            try {
                iMo10958F = this.mCameraInstance != null ? this.mCameraInstance.mo10958F() : -1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iMo10958F;
    }

    public int[] getISORange(C0733d c0733d, TECameraSettings.InterfaceC0709h interfaceC0709h) {
        int[] iArrMo10959G = new int[2];
        if (!assertClient(c0733d)) {
            return new int[]{-1, -1};
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC0655c0(c0733d, interfaceC0709h));
            return iArrMo10959G;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    iArrMo10959G = this.mCameraInstance.mo10959G();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iArrMo10959G;
    }

    public float getManualFocusAbility(C0733d c0733d, TECameraSettings.InterfaceC0710i interfaceC0710i) {
        float fMo10960H;
        if (!assertClient(c0733d)) {
            return -1.0f;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC0672l(c0733d, interfaceC0710i));
            return -1.0f;
        }
        synchronized (this.mStateLock) {
            try {
                fMo10960H = this.mCameraInstance != null ? this.mCameraInstance.mo10960H() : -1.0f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fMo10960H;
    }

    public int[] getPictureSize(C0733d c0733d) {
        if (assertClient(c0733d) && this.mCameraInstance != null) {
            return this.mCameraInstance.mo10918I();
        }
        return null;
    }

    public int[] getPreviewFps() {
        if (this.mCameraInstance == null) {
            return null;
        }
        return this.mCameraInstance.mo10919J();
    }

    public long[] getShutterTimeRange(C0733d c0733d, TECameraSettings.InterfaceC0716o interfaceC0716o) {
        long[] jArrMo10965M = new long[2];
        if (!assertClient(c0733d)) {
            return new long[]{-1, -1};
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC0661f0(c0733d, interfaceC0716o));
            return jArrMo10965M;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    jArrMo10965M = this.mCameraInstance.mo10965M();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jArrMo10965M;
    }

    public List<TEFrameSizei> getSupportedPictureSizes(C0733d c0733d) {
        if (!assertClient(c0733d) || this.mCameraInstance == null) {
            return null;
        }
        try {
            return this.mCameraInstance.mo10920N();
        } catch (Exception e) {
            C0743g.m11175k(TAG, "getSupportedPictureSizes, exception occured.", e);
            return null;
        }
    }

    public List<TEFrameSizei> getSupportedPreviewSizes(C0733d c0733d) {
        if (!assertClient(c0733d) || this.mCameraInstance == null) {
            return null;
        }
        try {
            return this.mCameraInstance.mo10921O();
        } catch (Exception e) {
            C0743g.m11175k(TAG, "getSupportedPreviewSizes, exception occured.", e);
            return null;
        }
    }

    public boolean isAutoExposureLockSupported(C0733d c0733d) {
        if (!assertClient(c0733d)) {
            return false;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    return this.mCameraInstance.mo10922Q();
                }
                C0743g.m11174j(TAG, "Can not get ae lock supported on state : " + this.mCurrentCameraState);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isAutoFocusLockSupported(C0733d c0733d) {
        if (!assertClient(c0733d)) {
            return false;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    return this.mCameraInstance.mo10923R();
                }
                C0743g.m11174j(TAG, "Can not get ae lock supported on state : " + this.mCurrentCameraState);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isCameraSwitchState() {
        return this.mIsCameraSwitchState;
    }

    public boolean isSupportWhileBalance(C0733d c0733d) {
        boolean z = false;
        if (!assertClient(c0733d)) {
            return false;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null && this.mCameraInstance.mo10924T()) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public boolean isSupportedExposureCompensation(C0733d c0733d) {
        if (!assertClient(c0733d)) {
            return false;
        }
        if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
            return this.mCameraInstance.mo10926U();
        }
        C0743g.m11174j(TAG, "Can not set ec on state : " + this.mCurrentCameraState);
        return false;
    }

    public boolean isTorchSupported(C0733d c0733d) {
        AbstractC0726c abstractC0726c;
        return assertClient(c0733d) && (abstractC0726c = this.mCameraInstance) != null && abstractC0726c.mo10927V();
    }

    public void notifyHostForegroundVisible(C0733d c0733d, boolean z) {
        if (assertClient(c0733d)) {
            this.mIsForegroundVisible = z;
            C0743g.m11169e(TAG, "is foreground visible: " + z);
        }
    }

    public int process(C0733d c0733d, TECameraSettings.C0711j c0711j) {
        if (!assertClient(c0733d)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC0690u(c0733d, c0711j));
            return 0;
        }
        C0743g.m11169e(TAG, "setFeatureParameters...");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.m11000X(c0711j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public TECameraFrame processAlgorithm(TECameraFrame tECameraFrame) {
        if (this.mCameraInstance != null) {
            return this.mCameraInstance.m11001Y(tECameraFrame);
        }
        C0743g.m11166b(TAG, "processAlgorithm failed mCameraInstance is null!");
        return null;
    }

    public void queryFeatures(String str, Bundle bundle) {
        if (this.mCameraInstance == null) {
            C0743g.m11166b(TAG, "queryFeatures: camera instance null");
            return;
        }
        Bundle bundleM11017z = this.mCameraInstance.m11017z(str);
        if (bundleM11017z == null) {
            C0743g.m11166b(TAG, "queryFeatures: getFeatures is null");
            return;
        }
        for (String str2 : bundle.keySet()) {
            if (bundleM11017z.containsKey(str2)) {
                Class clsM10858a = TECameraSettings.C0707f.m10858a(str2);
                if (clsM10858a == Boolean.class) {
                    bundle.putBoolean(str2, bundleM11017z.getBoolean(str2));
                } else if (clsM10858a == Integer.class) {
                    bundle.putInt(str2, bundleM11017z.getInt(str2));
                } else if (clsM10858a == Long.class) {
                    bundle.putLong(str2, bundleM11017z.getLong(str2));
                } else if (clsM10858a == Float.class) {
                    bundle.putFloat(str2, bundleM11017z.getFloat(str2));
                } else if (clsM10858a == Double.class) {
                    bundle.putDouble(str2, bundleM11017z.getDouble(str2));
                } else if (clsM10858a == String.class) {
                    bundle.putString(str2, bundleM11017z.getString(str2));
                } else if (clsM10858a == ArrayList.class) {
                    bundle.putParcelableArrayList(str2, bundleM11017z.getParcelableArrayList(str2));
                } else if (clsM10858a == TEFrameSizei.class) {
                    bundle.putParcelable(str2, bundleM11017z.getParcelable(str2));
                } else if (clsM10858a == TEFocusParameters.class) {
                    bundle.putParcelable(str2, bundleM11017z.getParcelable(str2));
                } else {
                    C0743g.m11174j(TAG, "Not supported key:" + str2);
                }
            }
        }
    }

    public float queryShaderZoomStep(C0733d c0733d, TECameraSettings.InterfaceC0715n interfaceC0715n) {
        if (!assertClient(c0733d)) {
            return -108.0f;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC0682q(c0733d, interfaceC0715n));
            return 0.0f;
        }
        C0743g.m11169e(TAG, "queryShaderZoomStep...");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo10929Z(interfaceC0715n);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0.0f;
    }

    public int queryZoomAbility(C0733d c0733d, TECameraSettings.InterfaceC0717p interfaceC0717p, boolean z) {
        if (!assertClient(c0733d)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC0680p(c0733d, interfaceC0717p, z));
            return 0;
        }
        C0743g.m11169e(TAG, "queryZoomAbility...");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo10930a0(interfaceC0717p, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public void registerFpsConfigListener(C0733d.a aVar) {
    }

    public void registerPreviewSizeListener(C0733d.e eVar) {
        this.mPreviewSizeCallback = eVar;
    }

    public void removeCameraAlgorithm(int i) {
        if (this.mCameraInstance == null) {
            C0743g.m11166b(TAG, "removeCameraAlgorithm failed mCameraInstance is null!");
        } else {
            this.mCameraInstance.m11005d0(i);
        }
    }

    public int removeCameraProvider(C0733d c0733d) {
        if (!assertClient(c0733d)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC0697x0(c0733d));
            return 0;
        }
        C0743g.m11169e(TAG, "removeCameraProvider");
        synchronized (this.mStateLock) {
            this.mProviderManager.m12624k();
        }
        return 0;
    }

    public void setAperture(C0733d c0733d, float f) {
        if (assertClient(c0733d)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new RunnableC0669j0(c0733d, f));
                return;
            }
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo10980f0(f);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setAutoExposureLock(C0733d c0733d, boolean z) {
        if (assertClient(c0733d)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new RunnableC0700z(c0733d, z));
                return;
            }
            C0743g.m11169e(TAG, "setAutoExposureLock...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                        this.mCameraInstance.mo10934g0(z);
                        return;
                    }
                    this.mCameraObserver.onError(-105, "Can not set auto exposure lock on state : " + this.mCurrentCameraState);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setAutoFocusLock(C0733d c0733d, boolean z) {
        if (assertClient(c0733d)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new RunnableC0649a0(c0733d, z));
                return;
            }
            C0743g.m11165a(TAG, "setAutoExposureLock...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                        this.mCameraInstance.mo10935h0(z);
                        return;
                    }
                    this.mCameraObserver.onError(-105, "Can not set auto exposure lock on state : " + this.mCurrentCameraState);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setDeviceRotation(int i) {
        if (this.mCameraInstance != null) {
            this.mCameraInstance.m11009i0(i);
        }
    }

    public void setExposureCompensation(C0733d c0733d, int i) {
        Handler handler;
        if (!assertClient(c0733d) || (handler = this.mHandler) == null) {
            C0743g.m11166b(TAG, "setExposureCompensation failed");
        } else {
            handler.post(new RunnableC0694w(i));
        }
    }

    public int setFeatureParameters(C0733d c0733d, Bundle bundle) {
        if (!assertClient(c0733d)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC0688t(c0733d, bundle));
            return 0;
        }
        C0743g.m11169e(TAG, "setFeatureParameters...");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo10938k0(bundle);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public void setISO(C0733d c0733d, int i) {
        if (assertClient(c0733d)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new RunnableC0657d0(c0733d, i));
                return;
            }
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo10983l0(i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setManualFocusDistance(C0733d c0733d, float f) {
        if (assertClient(c0733d)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new RunnableC0674m(c0733d, f));
                return;
            }
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo10984m0(f);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setPictureSize(C0733d c0733d, int i, int i2) {
        if (assertClient(c0733d)) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new RunnableC0676n(i, i2));
                return;
            }
            return;
        }
        C0743g.m11174j(TAG, "set picture size failed, w: " + i + ", h: " + i2);
    }

    public void setPreviewFpsRange(TEFrameRateRange tEFrameRateRange) {
        if (this.mCameraSettings == null || this.mCameraInstance == null) {
            return;
        }
        TECameraSettings tECameraSettings = this.mCameraSettings;
        tECameraSettings.f8937c = tEFrameRateRange;
        tECameraSettings.f8921O = 1;
        if (tECameraSettings.f8908B == 1) {
            tECameraSettings.f8921O = 4;
            tECameraSettings.f8932Z = false;
        }
        this.mCameraInstance.mo10943o0();
    }

    public void setSATZoomCallback(TECameraSettings.InterfaceC0714m interfaceC0714m) {
    }

    public void setSceneMode(C0733d c0733d, int i) {
        if (!assertClient(c0733d)) {
            C0743g.m11174j(TAG, "set scnen failed: " + i);
        } else {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new RunnableC0678o(i));
            }
        }
    }

    public void setShutterTime(C0733d c0733d, long j) {
        if (assertClient(c0733d)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new RunnableC0665h0(c0733d, j));
                return;
            }
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo10986s0(j);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setWhileBalance(C0733d c0733d, boolean z, String str) {
        if (assertClient(c0733d)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new RunnableC0652b0(c0733d, z, str));
                return;
            }
            synchronized (this.mStateLock) {
                try {
                    C0743g.m11169e(TAG, "setWhileBalance...");
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo10948t0(z, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public int start(C0733d c0733d) {
        C0743g.m11169e(TAG, "start: client " + c0733d);
        if (!assertClient(c0733d)) {
            return -108;
        }
        TECameraSettings tECameraSettings = this.mCameraSettings;
        if (tECameraSettings == null || tECameraSettings.f8933a == null) {
            C0743g.m11166b(TAG, "mCameraSettings has some error");
            return -100;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            C0743g.m11166b(TAG, "start, mHandler is null!");
            return -112;
        }
        if (Looper.myLooper() != handler.getLooper()) {
            handler.post(new RunnableC0699y0(c0733d));
            if (this.mCameraSettings.f8953k) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.mCameraClientCondition.close();
                this.mCameraClientCondition.block(2000L);
                C0743g.m11169e(TAG, "Camera start cost: " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
            }
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 3) {
                        C0743g.m11174j(TAG, "start, no need to start capture, state: " + this.mCurrentCameraState);
                        if (!this.mIsCameraProviderChanged && !this.mStartPreviewError) {
                            return 0;
                        }
                        this.mCameraInstance.mo10953x0();
                        updateCameraState(2);
                        this.mIsCameraProviderChanged = false;
                    }
                    int i = this.mCurrentCameraState;
                    C0733d.b bVar = this.mCameraObserver;
                    if (i != 2) {
                        bVar.onError(-105, "Invalidate state: " + this.mCurrentCameraState + " ==> 3");
                        return -105;
                    }
                    bVar.onInfo(3, this.mCurrentCameraState, "Camera state: opened");
                    this.mCameraInstance.mo10949u0();
                    updateCameraState(3);
                    ajh0.m11494b("te_record_camera_type", this.mCameraInstance.mo10950v());
                    ajh0.m11495c("te_preview_camera_resolution", this.mCameraSettings.f8965q.width + "*" + this.mCameraSettings.f8965q.height);
                    ajh0.m11493a("te_record_camera_frame_rate", (double) this.mCameraSettings.f8937c.max);
                    ajh0.m11494b("te_record_camera_direction", (long) this.mCameraSettings.f8939d);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return 0;
    }

    public int startRecording() {
        return this.mCameraInstance.mo10987v0();
    }

    public int startZoom(C0733d c0733d, float f, TECameraSettings.InterfaceC0717p interfaceC0717p) {
        if (!assertClient(c0733d)) {
            C0743g.m11166b(TAG, "[VE_UI_TEST]Failed event: START_ZOOM. Code: -108. Reason: invalid CameraClient");
            return -108;
        }
        Looper.myLooper();
        this.mHandler.getLooper();
        AbstractC0726c abstractC0726c = this.mCameraInstance;
        if (abstractC0726c == null) {
            C0743g.m11166b(TAG, "[VE_UI_TEST]Failed event: START_ZOOM. Code: -105. Reason: mCameraInstance is null");
            C0743g.m11174j(TAG, "camera is null, no need to start zoom");
            return -105;
        }
        float fAbs = Math.abs(f - this.mCurrentZoom);
        if (Math.abs(f - abstractC0726c.f9072l) < 0.1f) {
            f = abstractC0726c.f9072l;
        } else if (Math.abs(f) < 0.1f) {
            f = 0.0f;
        } else if (fAbs < 0.1f) {
            return 0;
        }
        this.mCurrentZoom = f;
        Message messageCreateMessage = createMessage(1, true, this.mHandler);
        messageCreateMessage.arg1 = (int) (f * 100.0f);
        messageCreateMessage.obj = interfaceC0717p;
        this.mHandler.sendMessage(messageCreateMessage);
        return 0;
    }

    public int stop(C0733d c0733d, boolean z) {
        C0743g.m11169e(TAG, "stop: client " + c0733d);
        if (!assertClient(c0733d)) {
            return -108;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            C0743g.m11166b(TAG, "stop, mHandler is null!");
            return -112;
        }
        if (Looper.myLooper() != handler.getLooper()) {
            if (z) {
                this.mCameraClientCondition.close();
            }
            handler.post(new RunnableC0650a1(c0733d, z));
            if (z && !this.mCameraClientCondition.block(1500L)) {
                C0743g.m11166b(TAG, "Camera stop timeout!");
            }
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 2) {
                        C0743g.m11174j(TAG, "stop, no need to stop capture, state: " + this.mCurrentCameraState);
                        return 0;
                    }
                    if (this.mCurrentCameraState != 3) {
                        this.mCameraObserver.onError(-105, "Invalidate state: " + this.mCurrentCameraState + " ==> 2");
                        return -105;
                    }
                    updateCameraState(2);
                    this.mCameraInstance.mo10953x0();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return 0;
    }

    public int stopRecording() {
        return this.mCameraInstance.mo10988y0();
    }

    public int stopZoom(C0733d c0733d, TECameraSettings.InterfaceC0717p interfaceC0717p) {
        if (!assertClient(c0733d)) {
            C0743g.m11166b(TAG, "[VE_UI_TEST]Failed event: STOP_ZOOM. Code: -108. Reason: invalid CameraClient");
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC0684r(c0733d, interfaceC0717p));
            return 0;
        }
        C0743g.m11169e(TAG, "stopZoom...");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo10909A0(interfaceC0717p);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public int switchCamera(C0733d c0733d, TECameraSettings tECameraSettings, Cert cert) {
        C0743g.m11169e(TAG, "switchCamera: " + tECameraSettings);
        if (!assertClient(c0733d)) {
            return -108;
        }
        if (!shouldReOpenCamera(tECameraSettings)) {
            return -423;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC0654c(c0733d, tECameraSettings, cert));
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (onlySwitchSession(tECameraSettings)) {
                        return 0;
                    }
                    boolean z = this.mCameraSettings.f8908B != tECameraSettings.f8908B;
                    if (this.mCurrentCameraState == 1 && !z) {
                        this.mCameraObserver.onError(-105, "Camera is opening, ignore this switch request...");
                        C0743g.m11169e(TAG, "Camera is opening, ignore this switch request...");
                        return -105;
                    }
                    TECameraSettings tECameraSettings2 = this.mCameraSettings;
                    if (tECameraSettings2.f8935b == tECameraSettings.f8935b && tECameraSettings2.f8908B == tECameraSettings.f8908B) {
                        if (this.mCameraInstance == null) {
                            C0743g.m11169e(TAG, "switch camera, create instance...");
                            this.mCameraInstance = createCameraInstance();
                            if (this.mCameraInstance == null) {
                                this.mCurrentCameraState = 0;
                                int i = this.mCameraSettings.f8935b;
                                if (i == 11) {
                                    this.mCameraEvent.mo10849f(i, -428, null, null);
                                } else {
                                    this.mCameraObserver.onError(-100, "open : mCameraInstance is null.");
                                }
                                return -1;
                            }
                            this.mCameraInstance.m11011q0(this.satZoomCallback);
                        }
                        if (this.mCurrentCameraState != 0) {
                            updateCameraState(4);
                            this.mCameraInstance.mo10932f(cert);
                            updateCameraState(0);
                        }
                        this.mCameraSettings = tECameraSettings;
                        this.mCurrentZoom = 0.0f;
                        updateCameraState(1);
                        if (this.mRetryCnt < 0) {
                            this.mRetryCnt = this.mCameraSettings.f8975v;
                        }
                        this.mBeginTime = System.currentTimeMillis();
                        C0743g.m11165a(TAG, "switch mode = " + this.mCameraSettings.f8908B);
                        int iMo10928W = this.mCameraInstance.mo10928W(this.mCameraSettings, cert);
                        if (iMo10928W != 0) {
                            this.mCameraObserver.onError(iMo10928W, "Switch camera failed @" + this.mCameraSettings.f8935b + ",face:" + this.mCameraSettings.f8939d + " " + this.mCameraSettings.f8965q.toString());
                        }
                        return 0;
                    }
                    close(cert);
                    open(c0733d, tECameraSettings, cert);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return 0;
    }

    public int switchCameraMode(C0733d c0733d, int i) {
        if (!assertClient(c0733d)) {
            return -108;
        }
        TECameraSettings tECameraSettings = c0733d.f9097a;
        if (tECameraSettings.f8935b == 1) {
            return -100;
        }
        if (i != 1 && i != 0 && i != 2) {
            return -100;
        }
        if (tECameraSettings.f8908B == i) {
            return 0;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC0685r0(c0733d, i));
        } else {
            C0743g.m11169e(TAG, "switchCameraMode");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState != 3) {
                        this.mCameraObserver.onError(-105, "Invalidate state: " + this.mCurrentCameraState + " ==> 3");
                        return -105;
                    }
                    this.mCameraInstance.mo10911B0(i);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return 0;
    }

    public int switchFlashMode(C0733d c0733d, int i) {
        if (!assertClient(c0733d)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC0673l0(c0733d, i));
            return 0;
        }
        C0743g.m11169e(TAG, "switchFlashMode: " + i);
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo10913C0(i);
                    this.mCameraEvent.mo10848e(116, i, "", this.mCameraInstance);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public int takePicture(C0733d c0733d, int i, int i2, TECameraSettings.InterfaceC0713l interfaceC0713l) {
        if (!assertClient(c0733d)) {
            return -108;
        }
        this.mHandler.post(new RunnableC0660f(interfaceC0713l, i, i2));
        return 0;
    }

    public int toggleTorch(C0733d c0733d, boolean z) {
        if (!assertClient(c0733d)) {
            C0743g.m11166b(TAG, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -108. Reason: invalid CameraClient");
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC0671k0(c0733d, z));
            return 0;
        }
        C0743g.m11169e(TAG, "toggleTorch: " + z);
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo10916F0(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public void upExposureCompensation(C0733d c0733d) {
        if (assertClient(c0733d)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new RunnableC0696x(c0733d));
                return;
            }
            C0743g.m11169e(TAG, "upExposureCompensation...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState != 3 && this.mCurrentCameraState != 2) {
                        this.mCameraObserver.onError(-105, "Can not set ec on state : " + this.mCurrentCameraState);
                        return;
                    }
                    TECameraSettings.C0705d c0705dM11012s = this.mCameraInstance.m11012s();
                    if (c0705dM11012s == null) {
                        this.mCameraObserver.onError(-112, "upExposureCompensation get ec info failed");
                    } else {
                        this.mCameraInstance.mo10937j0(c0705dM11012s.f8991b + 1);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void updateCameraAlgorithmParam(TECameraAlgorithmParam tECameraAlgorithmParam) {
        if (this.mCameraInstance == null) {
            C0743g.m11166b(TAG, "updateCameraAlgorithmParam failed mCameraInstance is null!");
        } else {
            this.mCameraInstance.m10995G0(tECameraAlgorithmParam);
        }
    }

    public void updateCameraState(int i) {
        if (this.mCurrentCameraState == i) {
            C0743g.m11174j(TAG, "No need update state: " + i);
        } else {
            C0743g.m11169e(TAG, "[updateCameraState]: " + this.mCurrentCameraState + " -> " + i);
            this.mCurrentCameraState = i;
        }
    }

    public int zoomV2(C0733d c0733d, float f, TECameraSettings.InterfaceC0717p interfaceC0717p) {
        if (!assertClient(c0733d)) {
            C0743g.m11166b(TAG, "[VE_UI_TEST]Failed event: START_ZOOM. Code: -108. Reason: invalid CameraClient");
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC0686s(c0733d, f, interfaceC0717p));
        } else {
            C0743g.m11169e(TAG, "zoomV2...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo10917H0(f, interfaceC0717p);
                    }
                    if (this.mFirstZoom) {
                        this.mCameraEvent.mo10848e(114, 0, "zoomV2", this.mCameraInstance);
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

    public int takePicture(C0733d c0733d, TECameraSettings.InterfaceC0713l interfaceC0713l) {
        if (!assertClient(c0733d)) {
            return -108;
        }
        this.mHandler.post(new RunnableC0662g(interfaceC0713l));
        return 0;
    }

    public int disConnect(C0733d c0733d, Cert cert) {
        return disConnect(c0733d, true, cert);
    }

    public int stop(C0733d c0733d) {
        return stop(c0733d, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int close(Cert cert) {
        return close(true, cert);
    }

    public int switchCamera(C0733d c0733d, int i, Cert cert) {
        C0743g.m11169e(TAG, "switchCamera: " + i);
        if (!assertClient(c0733d)) {
            return -108;
        }
        TECameraSettings tECameraSettings = this.mCameraSettings;
        if (tECameraSettings == null) {
            C0743g.m11166b(TAG, "switchCamera failed: " + i);
            return -108;
        }
        if (tECameraSettings.f8939d == i) {
            return -423;
        }
        this.mIsCameraSwitchState = true;
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC0651b(c0733d, i, cert));
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 1) {
                        this.mIsCameraSwitchState = false;
                        this.mCameraObserver.onError(-105, "Camera is opening, ignore this switch request.");
                        return -105;
                    }
                    this.mCameraSettings.f8939d = i;
                    this.mCurrentZoom = 0.0f;
                    if (this.mCameraInstance == null) {
                        this.mCameraInstance = createCameraInstance();
                        if (this.mCameraInstance == null) {
                            this.mCurrentCameraState = 0;
                            int i2 = this.mCameraSettings.f8935b;
                            if (i2 == 11) {
                                this.mCameraEvent.mo10849f(i2, -428, null, null);
                            } else {
                                this.mCameraObserver.onError(-100, "open : mCameraInstance is null.");
                            }
                            this.mIsCameraSwitchState = false;
                            return -1;
                        }
                    }
                    if (this.mCurrentCameraState != 0) {
                        updateCameraState(4);
                        this.mCameraInstance.mo10932f(cert);
                        updateCameraState(0);
                    }
                    updateCameraState(1);
                    this.mIsCameraSwitchState = false;
                    if (this.mRetryCnt < 0) {
                        this.mRetryCnt = this.mCameraSettings.f8975v;
                    }
                    this.mBeginTime = System.currentTimeMillis();
                    int iMo10928W = this.mCameraInstance.mo10928W(this.mCameraSettings, cert);
                    if (iMo10928W != 0) {
                        this.mCameraObserver.onError(iMo10928W, "Switch camera failed @" + this.mCameraSettings.f8935b + ",face:" + this.mCameraSettings.f8939d + " " + this.mCameraSettings.f8965q.toString());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return 0;
    }
}
