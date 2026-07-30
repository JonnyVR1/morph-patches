package com.p069ss.android.ttvecamera;

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
import com.p069ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmParam;
import com.p069ss.android.ttvecamera.systemresmanager.TESystemResManager;
import com.tencent.liteav.audio.TXEAudioDef;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p149l.ajh0;
import p149l.cjh0;
import p149l.e16;
import p149l.ig3;
import p149l.ti3;
import p149l.upk0;
import p149l.wjh0;
import p149l.xjh0;

/* JADX INFO: loaded from: classes11.dex */
public enum TECameraServer {
    INSTANCE;

    private static final String TAG = "TECameraServer";

    @GuardedBy("mLock")
    private C13331d mCameraClient;
    private volatile AbstractC13324c mCameraInstance;
    private TECameraSettings mCameraSettings;
    private Runnable mCheckCloseTask;
    private C13331d.a mFpsConfigCallback;
    private Handler mHandler;
    private HandlerThread mHandlerThread;
    private volatile boolean mIsCameraPendingClose;
    private volatile boolean mIsCameraProviderChanged;
    private volatile boolean mIsInitialized;
    private C13331d.d mPictureSizeCallback;
    cjh0 mProviderManager;
    private cjh0.C16167a mProviderSettings;
    private TECameraSettings.InterfaceC13312m mSATZoomCallback;
    private TESystemResManager mSystemResManager;
    private volatile boolean mHandlerDestroyed = true;
    private float mCurrentZoom = 0.0f;
    private C13331d.b mCameraObserver = new C13331d.c();
    private C13331d.e mPreviewSizeCallback = null;
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
    private AbstractC13324c.a mCameraEvent = new C13275n0();
    private final AbstractC13324c.b mFpsConfigCallbackProxy = new C13277o0();
    private final AbstractC13324c.d mPictureSizeCallBack = new C13279p0();
    private final AbstractC13324c.e mBasePreviewSizeCallback = new C13281q0();
    private AbstractC13324c.f satZoomCallback = new C13285s0();

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$a */
    public class RunnableC13246a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f55162a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f55163b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Cert f55164c;

        public RunnableC13246a(long j, boolean z, Cert cert) {
            this.f55162a = j;
            this.f55163b = z;
            this.f55164c = cert;
        }

        @Override // java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f55162a;
            C13341g.m80818e(TECameraServer.TAG, "Push close task cost: " + jCurrentTimeMillis);
            TECameraServer.this.close(this.f55163b, this.f55164c);
            TECameraServer.this.mIsCameraPendingClose = false;
            if (this.f55163b) {
                TECameraServer.this.mCameraClientCondition.open();
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f55162a;
            ajh0.m96973b("te_record_camera_push_close_task_time", jCurrentTimeMillis);
            ajh0.m96973b("te_record_camera_close_cost", jCurrentTimeMillis2);
            C13341g.m80819f("te_record_camera_close_cost", Long.valueOf(jCurrentTimeMillis2));
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$a0 */
    public class RunnableC13247a0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55166a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f55167b;

        public RunnableC13247a0(C13331d c13331d, boolean z) {
            this.f55166a = c13331d;
            this.f55167b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setAutoFocusLock(this.f55166a, this.f55167b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$a1 */
    public class RunnableC13248a1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55169a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f55170b;

        public RunnableC13248a1(C13331d c13331d, boolean z) {
            this.f55169a = c13331d;
            this.f55170b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.stop(this.f55169a, this.f55170b);
            if (this.f55170b) {
                TECameraServer.this.mCameraClientCondition.open();
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$b */
    public class RunnableC13249b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55172a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f55173b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Cert f55174c;

        public RunnableC13249b(C13331d c13331d, int i, Cert cert) {
            this.f55172a = c13331d;
            this.f55173b = i;
            this.f55174c = cert;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.switchCamera(this.f55172a, this.f55173b, this.f55174c);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$b0 */
    public class RunnableC13250b0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55176a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f55177b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f55178c;

        public RunnableC13250b0(C13331d c13331d, boolean z, String str) {
            this.f55176a = c13331d;
            this.f55177b = z;
            this.f55178c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setWhileBalance(this.f55176a, this.f55177b, this.f55178c);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$b1 */
    public static class C13251b1 implements Handler.Callback {

        /* JADX INFO: renamed from: a */
        private WeakReference<TECameraServer> f55180a;

        public C13251b1(TECameraServer tECameraServer) {
            this.f55180a = new WeakReference<>(tECameraServer);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            Object obj = message.obj;
            TECameraServer tECameraServer = this.f55180a.get();
            if (i == 1) {
                C13341g.m80814a(TECameraServer.TAG, "startZoom...");
                synchronized (tECameraServer.mStateLock) {
                    try {
                        if (tECameraServer.mCameraInstance != null) {
                            tECameraServer.mCameraInstance.mo80600w0(message.arg1 / 100.0f, (TECameraSettings.InterfaceC13315p) obj);
                        }
                        if (tECameraServer.mFirstZoom) {
                            tECameraServer.mCameraEvent.mo80497e(114, 0, "startzoom", tECameraServer.mCameraInstance);
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
    public class RunnableC13252c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55181a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ TECameraSettings f55182b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Cert f55183c;

        public RunnableC13252c(C13331d c13331d, TECameraSettings tECameraSettings, Cert cert) {
            this.f55181a = c13331d;
            this.f55182b = tECameraSettings;
            this.f55183c = cert;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.switchCamera(this.f55181a, this.f55182b, this.f55183c);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$c0 */
    public class RunnableC13253c0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55185a;

        public RunnableC13253c0(C13331d c13331d, TECameraSettings.InterfaceC13307h interfaceC13307h) {
            this.f55185a = c13331d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TECameraServer.this.getISORange(this.f55185a, null) != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$d */
    public class RunnableC13254d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55187a;

        public RunnableC13254d(C13331d c13331d, TECameraSettings.InterfaceC13304e interfaceC13304e) {
            this.f55187a = c13331d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.getFOV(this.f55187a, null);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$d0 */
    public class RunnableC13255d0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55189a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f55190b;

        public RunnableC13255d0(C13331d c13331d, int i) {
            this.f55189a = c13331d;
            this.f55190b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setISO(this.f55189a, this.f55190b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$e */
    public class RunnableC13256e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ti3 f55192a;

        public RunnableC13256e(TECameraSettings.InterfaceC13302c interfaceC13302c, ti3 ti3Var) {
            this.f55192a = ti3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (TECameraServer.this.mStateLock) {
                try {
                    if (TECameraServer.this.mCurrentCameraState == 3) {
                        if (TECameraServer.this.mCameraSettings.f55329b == 1) {
                            TECameraServer.this.updateCameraState(2);
                        }
                        TECameraServer.this.mCameraInstance.mo80628d(this.f55192a, null);
                    } else {
                        String str = "Can not takePicture on state : " + TECameraServer.this.mCurrentCameraState;
                        TECameraServer.this.mCameraObserver.onError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, str);
                        C13341g.m80815b(TECameraServer.TAG, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$e0 */
    public class RunnableC13257e0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55194a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ TECameraSettings.InterfaceC13306g f55195b;

        public RunnableC13257e0(C13331d c13331d, TECameraSettings.InterfaceC13306g interfaceC13306g) {
            this.f55194a = c13331d;
            this.f55195b = interfaceC13306g;
        }

        @Override // java.lang.Runnable
        public void run() {
            int iso = TECameraServer.this.getISO(this.f55194a, this.f55195b);
            if (iso >= 0) {
                this.f55195b.mo80508a(iso);
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$f */
    public class RunnableC13258f implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f55197a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f55198b;

        public RunnableC13258f(TECameraSettings.InterfaceC13311l interfaceC13311l, int i, int i2) {
            this.f55197a = i;
            this.f55198b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (TECameraServer.this.mStateLock) {
                try {
                    if (TECameraServer.this.mCurrentCameraState == 3) {
                        if (TECameraServer.this.mCameraSettings.f55329b == 1) {
                            TECameraServer.this.updateCameraState(2);
                        }
                        TECameraServer.this.mCameraInstance.mo80563D0(this.f55197a, this.f55198b, null);
                    } else {
                        String str = "Can not takePicture on state : " + TECameraServer.this.mCurrentCameraState;
                        TECameraServer.this.mCameraObserver.onError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, str);
                        C13341g.m80815b(TECameraServer.TAG, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$f0 */
    public class RunnableC13259f0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55200a;

        public RunnableC13259f0(C13331d c13331d, TECameraSettings.InterfaceC13314o interfaceC13314o) {
            this.f55200a = c13331d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TECameraServer.this.getShutterTimeRange(this.f55200a, null) != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$g */
    public class RunnableC13260g implements Runnable {
        public RunnableC13260g(TECameraSettings.InterfaceC13311l interfaceC13311l) {
        }

        @Override // java.lang.Runnable
        public void run() {
            C13341g.m80818e(TECameraServer.TAG, "takePicture");
            synchronized (TECameraServer.this.mStateLock) {
                try {
                    if (TECameraServer.this.mCurrentCameraState == 3) {
                        if (TECameraServer.this.mCameraSettings.f55329b == 1) {
                            TECameraServer.this.updateCameraState(2);
                        }
                        TECameraServer.this.mCameraInstance.mo80564E0(null);
                    } else {
                        String str = "Can not takePicture on state : " + TECameraServer.this.mCurrentCameraState;
                        TECameraServer.this.mCameraObserver.onError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, str);
                        C13341g.m80815b(TECameraServer.TAG, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$g0 */
    public class RunnableC13261g0 implements Runnable {
        public RunnableC13261g0() {
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
            C13341g.m80818e(TECameraServer.TAG, "close camera in main thread");
            if (!TECameraServer.this.mCameraSettings.f55318R || TECameraServer.this.mCameraInstance == null) {
                TECameraServer tECameraServer = TECameraServer.this;
                tECameraServer.realCloseCamera(tECameraServer.cachedClosePrivacyCert);
            } else {
                TECameraServer.this.updateCameraState(4);
                TECameraServer.this.mCameraInstance.mo80590n(TECameraServer.this.cachedClosePrivacyCert);
                TECameraServer.this.updateCameraState(0);
            }
            if (TECameraServer.this.decreaseClientCount() == 0) {
                TECameraServer.this.destroy();
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$h */
    public class RunnableC13262h implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55204a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ TEFocusSettings f55205b;

        public RunnableC13262h(C13331d c13331d, TEFocusSettings tEFocusSettings) {
            this.f55204a = c13331d;
            this.f55205b = tEFocusSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            int iFocusAtPoint = TECameraServer.this.focusAtPoint(this.f55204a, this.f55205b);
            if (iFocusAtPoint == 0 || this.f55205b.m80520g() == null) {
                return;
            }
            this.f55205b.m80520g().mo80534a(iFocusAtPoint, TECameraServer.this.mCameraSettings.f55333d, "");
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$h0 */
    public class RunnableC13263h0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55207a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ long f55208b;

        public RunnableC13263h0(C13331d c13331d, long j) {
            this.f55207a = c13331d;
            this.f55208b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setShutterTime(this.f55207a, this.f55208b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$i */
    public class RunnableC13264i implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55210a;

        public RunnableC13264i(C13331d c13331d) {
            this.f55210a = c13331d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.cancelFocus(this.f55210a);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$i0 */
    public class RunnableC13265i0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55212a;

        public RunnableC13265i0(C13331d c13331d, TECameraSettings.InterfaceC13300a interfaceC13300a) {
            this.f55212a = c13331d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TECameraServer.this.getApertureRange(this.f55212a, null) != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$j */
    public class RunnableC13266j implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55214a;

        public RunnableC13266j(C13331d c13331d) {
            this.f55214a = c13331d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.enableCaf(this.f55214a);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$j0 */
    public class RunnableC13267j0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55216a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ float f55217b;

        public RunnableC13267j0(C13331d c13331d, float f) {
            this.f55216a = c13331d;
            this.f55217b = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setAperture(this.f55216a, this.f55217b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$k */
    public class RunnableC13268k implements Runnable {
        public RunnableC13268k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.mProviderManager.m107169k();
            C13341g.m80818e(TECameraServer.TAG, "provider release...");
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$k0 */
    public class RunnableC13269k0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55220a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f55221b;

        public RunnableC13269k0(C13331d c13331d, boolean z) {
            this.f55220a = c13331d;
            this.f55221b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.toggleTorch(this.f55220a, this.f55221b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$l */
    public class RunnableC13270l implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55223a;

        public RunnableC13270l(C13331d c13331d, TECameraSettings.InterfaceC13308i interfaceC13308i) {
            this.f55223a = c13331d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TECameraServer.this.getManualFocusAbility(this.f55223a, null) >= 0.0f) {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$l0 */
    public class RunnableC13271l0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55225a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f55226b;

        public RunnableC13271l0(C13331d c13331d, int i) {
            this.f55225a = c13331d;
            this.f55226b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.switchFlashMode(this.f55225a, this.f55226b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$m */
    public class RunnableC13272m implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55228a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ float f55229b;

        public RunnableC13272m(C13331d c13331d, float f) {
            this.f55228a = c13331d;
            this.f55229b = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setManualFocusDistance(this.f55228a, this.f55229b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$m0 */
    public class C13273m0 implements Printer {

        /* JADX INFO: renamed from: a */
        private long f55231a = 0;

        /* JADX INFO: renamed from: b */
        private int f55232b = 0;

        /* JADX INFO: renamed from: c */
        private long f55233c = 0;

        public C13273m0() {
        }

        @Override // android.util.Printer
        public void println(String str) {
            if (str.startsWith(">>>>> Dispatching to Handler")) {
                this.f55231a = System.currentTimeMillis();
                return;
            }
            if (str.startsWith("<<<<< Finished to Handler")) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f55231a;
                if (jCurrentTimeMillis > 1000) {
                    int i = this.f55232b + 1;
                    this.f55232b = i;
                    ajh0.m96973b("te_record_camera_task_time_out_count", i);
                    if (jCurrentTimeMillis > this.f55233c) {
                        this.f55233c = jCurrentTimeMillis;
                        ajh0.m96973b("te_record_camera_max_lag_task_cost", jCurrentTimeMillis);
                        C13341g.m80818e(TECameraServer.TAG, "task: " + str + ", cost: " + jCurrentTimeMillis + "ms");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$n */
    public class RunnableC13274n implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f55235a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f55236b;

        public RunnableC13274n(int i, int i2) {
            this.f55235a = i;
            this.f55236b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TECameraServer.this.mCurrentCameraState == 3) {
                TECameraServer.this.mCameraInstance.mo80591n0(this.f55235a, this.f55236b);
                return;
            }
            C13341g.m80815b(TECameraServer.TAG, "set picture size failed, w: " + this.f55235a + ", h: " + this.f55236b + ", state: " + TECameraServer.this.mCurrentCameraState);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$n0 */
    public class C13275n0 implements AbstractC13324c.a {

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

        public C13275n0() {
        }

        @Override // com.p069ss.android.ttvecamera.AbstractC13324c.a
        /* JADX INFO: renamed from: a */
        public void mo80493a(int i, int i2, int i3, String str, Object obj) {
            C13341g.m80818e(TECameraServer.TAG, "startCapture success!");
            TECameraServer.this.mStartPreviewError = false;
            if (TECameraServer.this.mCameraSettings == null || TECameraServer.this.mCameraInstance == null) {
                mo80497e(i2, i3, str, obj);
            } else {
                int iM80646L = TECameraServer.this.mCameraSettings.f55371w - TECameraServer.this.mCameraInstance.m80646L();
                mo80497e(i2, iM80646L, str + ", Retry preview times = " + iM80646L, obj);
                TECameraServer.this.mCameraInstance.mo80582g();
            }
            ajh0.m96973b("te_record_camera_preview_ret", 0L);
        }

        @Override // com.p069ss.android.ttvecamera.AbstractC13324c.a
        /* JADX INFO: renamed from: b */
        public void mo80494b(int i, int i2, String str, Object obj) {
            if (TECameraServer.this.mCameraSettings.f55340g0 && i2 == -437) {
                ajh0.m96973b("te_record_camera_preview_ret", i2);
                Handler handler = TECameraServer.this.mHandler;
                if (handler == null) {
                    return;
                }
                handler.post(new a());
                return;
            }
            synchronized (TECameraServer.this.mStateLock) {
                try {
                    if (TECameraServer.this.mCameraInstance == null || TECameraServer.this.mCameraInstance.m80646L() <= 0) {
                        mo80495c(i, i2, str, obj);
                        ajh0.m96973b("te_record_camera_preview_ret", i2);
                    } else {
                        TECameraServer.this.mStartPreviewError = true;
                        C13341g.m80823j(TECameraServer.TAG, "Retry to startPreview. " + TECameraServer.this.mCameraInstance.m80646L() + " times is waiting to retry.");
                        TECameraServer.this.mCameraInstance.m80656e0();
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

        @Override // com.p069ss.android.ttvecamera.AbstractC13324c.a
        /* JADX INFO: renamed from: c */
        public void mo80495c(int i, int i2, String str, Object obj) {
            C13341g.m80815b(TECameraServer.TAG, "onCameraError: code = " + i2 + ", msg = " + str);
            TECameraServer.this.mCameraObserver.onError(i2, "Open camera failed @" + TECameraServer.this.mCameraSettings.f55329b + ",face:" + TECameraServer.this.mCameraSettings.f55333d + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + TECameraServer.this.mCameraSettings.f55359q.toString() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str);
        }

        @Override // com.p069ss.android.ttvecamera.AbstractC13324c.a
        /* JADX INFO: renamed from: d */
        public void mo80496d(int i, int i2, int i3, String str, Object obj) {
            C13341g.m80818e(TECameraServer.TAG, "stopCapture success!");
            mo80497e(i2, i3, str, obj);
        }

        @Override // com.p069ss.android.ttvecamera.AbstractC13324c.a
        /* JADX INFO: renamed from: e */
        public void mo80497e(int i, int i2, String str, Object obj) {
            C13341g.m80814a(TECameraServer.TAG, "onCameraInfo: " + i + ", ext: " + i2 + " msg: " + str);
            if (i == 108) {
                TECameraServer.this.updateCameraState(4);
            } else if (i == 109) {
                TECameraServer.this.updateCameraState(0);
            }
            TECameraServer.this.mCameraObserver.onInfo(i, i2, str);
        }

        @Override // com.p069ss.android.ttvecamera.AbstractC13324c.a
        /* JADX INFO: renamed from: f */
        public void mo80498f(int i, int i2, AbstractC13324c abstractC13324c, Object obj) {
            wjh0.m203445a("TECameraServer-onCameraOpened: cameraType " + i + ", ret " + i2);
            TECameraServer.this.mOpenTime = System.currentTimeMillis() - TECameraServer.this.mBeginTime;
            C13341g.m80818e(TECameraServer.TAG, "onCameraOpened: CameraType = " + TECameraServer.this.mCameraSettings.f55329b + ", Ret = " + i2 + ",retryCnt = " + TECameraServer.this.mRetryCnt);
            ConcurrentHashMap concurrentHashMap = TECameraServer.this.mOpenInfoMap;
            StringBuilder sb = new StringBuilder("CamType");
            sb.append(TECameraServer.this.mRetryCnt);
            concurrentHashMap.put(sb.toString(), String.valueOf(TECameraServer.this.mCameraSettings.f55329b));
            TECameraServer.this.mOpenInfoMap.put("Ret" + TECameraServer.this.mRetryCnt, String.valueOf(i2));
            TECameraServer.this.mOpenInfoMap.put("OpenTime" + TECameraServer.this.mRetryCnt, String.valueOf(TECameraServer.this.mOpenTime));
            TECameraServer tECameraServer = TECameraServer.this;
            if (i2 == 0) {
                tECameraServer.mRetryCnt = tECameraServer.mCameraSettings.f55369v;
                synchronized (TECameraServer.this.mStateLock) {
                    if (TECameraServer.this.mCurrentCameraState != 1) {
                        C13341g.m80823j(TECameraServer.TAG, "Open camera error ? May be closed now!!, state = " + TECameraServer.this.mCurrentCameraState);
                        return;
                    }
                    TECameraServer.this.updateCameraState(2);
                    TECameraServer.this.mCameraObserver.onCaptureStarted(i, i2);
                    int i3 = TECameraServer.this.mCameraSettings.f55369v - TECameraServer.this.mRetryCnt;
                    TECameraServer.this.mCameraObserver.onInfo(120, i3, "Retry open camera times = " + i3);
                    TECameraServer.this.mOpenInfoMap.put("ResultType", "Open Success");
                    ajh0.m96973b("te_record_camera_open_ret", (long) i2);
                    ajh0.m96973b("te_record_camera_open_cost", TECameraServer.this.mOpenTime);
                    ajh0.m96974c("te_record_camera_open_info", TECameraServer.this.mOpenInfoMap.toString());
                    C13341g.m80818e("VESDKCOST", "TE_RECORD_CAMERA_OPEN_COST " + TECameraServer.this.mOpenTime);
                    TECameraServer.this.mOpenInfoMap.clear();
                }
            } else if (tECameraServer.mCameraSettings.f55329b == 11 && i2 == -428) {
                C13341g.m80818e(TECameraServer.TAG, "CameraUnit auth failed, fall back to camera2");
                TECameraServer tECameraServer2 = TECameraServer.this;
                tECameraServer2.mRetryCnt = tECameraServer2.mCameraSettings.f55369v;
                synchronized (TECameraServer.this.mStateLock) {
                    try {
                        if (TECameraServer.this.mCurrentCameraState == 0) {
                            C13341g.m80823j(TECameraServer.TAG, "onCameraOpened, no need to close camera, state: " + TECameraServer.this.mCurrentCameraState);
                            TECameraServer.this.mCameraInstance = null;
                        } else {
                            TECameraServer.this.updateCameraState(4);
                            if (TECameraServer.this.mCameraInstance != null) {
                                TECameraServer.this.mCameraInstance.mo80581f(TECameraServer.this.cachedOpenPrivacyCert);
                                TECameraServer.this.mCameraInstance = null;
                            }
                            TECameraServer.this.updateCameraState(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                TECameraServer.this.mCameraSettings.f55329b = 2;
                TECameraServer.INSTANCE.open(TECameraServer.this.mCameraClient, TECameraServer.this.mCameraSettings, TECameraServer.this.cachedOpenPrivacyCert);
                TECameraServer.this.mOpenInfoMap.put("ResultType", "fallback to Camera2");
                ajh0.m96974c("te_record_camera_open_info", TECameraServer.this.mOpenInfoMap.toString());
                TECameraServer.this.mOpenInfoMap.clear();
            } else if (i2 != -403 && i2 != -408 && TECameraServer.this.mRetryCnt > 0 && TECameraServer.this.isCameraPermitted()) {
                TECameraServer.this.mCameraObserver.onError(-404, "Retry to Open Camera Failed @" + TECameraServer.this.mCameraSettings.f55329b + ",face:" + TECameraServer.this.mCameraSettings.f55333d + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + TECameraServer.this.mCameraSettings.f55359q.toString());
                boolean z = TECameraServer.this.mIsCameraPendingClose;
                TECameraServer tECameraServer3 = TECameraServer.this;
                if (z) {
                    tECameraServer3.mIsCameraPendingClose = false;
                    C13341g.m80815b(TECameraServer.TAG, "retry to open camera, but camera close was called");
                    TECameraServer.this.mRetryCnt = -1;
                    TECameraServer.this.mOpenInfoMap.put("ResultType" + TECameraServer.this.mRetryCnt, "retry to open camera");
                    ajh0.m96974c("te_record_camera_open_info", TECameraServer.this.mOpenInfoMap.toString());
                    return;
                }
                if (tECameraServer3.mCameraSettings.f55327a == null) {
                    TECameraServer.this.mRetryCnt = -1;
                    C13341g.m80815b(TECameraServer.TAG, "abort retry to open camera, no context: " + TECameraServer.this.mCameraSettings);
                    return;
                }
                if (i == 2 && TECameraServer.this.mRetryCnt == TECameraServer.this.mCameraSettings.f55369v && (i2 == 4 || i2 == 5 || i2 == 1)) {
                    C13341g.m80818e(TECameraServer.TAG, "camera2 is not available");
                    TECameraServer tECameraServer4 = TECameraServer.this;
                    tECameraServer4.mRetryCnt = tECameraServer4.mCameraSettings.f55373x;
                }
                try {
                    Thread.sleep(30L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                C13341g.m80818e(TECameraServer.TAG, "retry to open camera, mRetryCnt = " + TECameraServer.this.mRetryCnt);
                synchronized (TECameraServer.this.mStateLock) {
                    try {
                        if (TECameraServer.this.mCurrentCameraState == 0) {
                            C13341g.m80823j(TECameraServer.TAG, "onCameraOpened, no need to close camera, state: " + TECameraServer.this.mCurrentCameraState);
                            TECameraServer.this.mCameraInstance = null;
                        } else {
                            TECameraServer.this.updateCameraState(4);
                            if (TECameraServer.this.mCameraInstance != null) {
                                TECameraServer.this.mCameraInstance.mo80581f(TECameraServer.this.cachedOpenPrivacyCert);
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
                ajh0.m96974c("te_record_camera_open_info", TECameraServer.this.mOpenInfoMap.toString());
            } else if ((!TECameraServer.this.mCameraSettings.f55312L || i == 1 || i2 == -408) && i2 != -403) {
                TECameraServer.this.mCameraObserver.onCaptureStarted(i, i2);
                C13341g.m80818e(TECameraServer.TAG, "finally go to the error.");
                ajh0.m96973b("te_record_camera_open_ret", i2);
                TECameraServer.this.mCameraObserver.onError(i2, "Open camera failed @" + TECameraServer.this.mCameraSettings.f55329b + ",face:" + TECameraServer.this.mCameraSettings.f55333d + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + TECameraServer.this.mCameraSettings.f55359q.toString());
                TECameraServer.INSTANCE.close(TECameraServer.this.cachedOpenPrivacyCert);
                TECameraServer.this.mRetryCnt = -1;
                ajh0.m96974c("te_record_camera_open_info", TECameraServer.this.mOpenInfoMap.toString());
                TECameraServer.this.mOpenInfoMap.clear();
            } else {
                C13341g.m80818e(TECameraServer.TAG, "Open camera failed, fall back to camera1");
                TECameraServer tECameraServer5 = TECameraServer.this;
                tECameraServer5.mRetryCnt = tECameraServer5.mCameraSettings.f55369v;
                synchronized (TECameraServer.this.mStateLock) {
                    try {
                        if (TECameraServer.this.mCurrentCameraState == 0) {
                            C13341g.m80823j(TECameraServer.TAG, "onCameraOpened, no need to close camera, state: " + TECameraServer.this.mCurrentCameraState);
                            TECameraServer.this.mCameraInstance = null;
                        } else {
                            TECameraServer.this.updateCameraState(4);
                            if (TECameraServer.this.mCameraInstance != null) {
                                TECameraServer.this.mCameraInstance.mo80581f(TECameraServer.this.cachedOpenPrivacyCert);
                                TECameraServer.this.mCameraInstance = null;
                            }
                            TECameraServer.this.updateCameraState(0);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                TECameraServer.this.mCameraSettings.f55329b = 1;
                TECameraServer.this.mCameraEvent.mo80497e(51, 0, "need recreate surfacetexture", null);
                TECameraServer.INSTANCE.open(TECameraServer.this.mCameraClient, TECameraServer.this.mCameraSettings, TECameraServer.this.cachedOpenPrivacyCert);
                TECameraServer.this.mOpenInfoMap.put("ResultType", "fallback to Camera1");
                ajh0.m96974c("te_record_camera_open_info", TECameraServer.this.mOpenInfoMap.toString());
            }
            wjh0.m203446b();
        }

        @Override // com.p069ss.android.ttvecamera.AbstractC13324c.a
        /* JADX INFO: renamed from: g */
        public void mo80499g(int i, int i2, int i3, String str, Object obj) {
            StringBuilder sb = new StringBuilder("onTorchError ");
            sb.append(str);
            sb.append(i3 == 0 ? " close" : " open");
            C13341g.m80818e(TECameraServer.TAG, sb.toString());
        }

        @Override // com.p069ss.android.ttvecamera.AbstractC13324c.a
        /* JADX INFO: renamed from: h */
        public void mo80500h(int i, int i2, int i3, String str, Object obj) {
            StringBuilder sb = new StringBuilder("onTorchSuccess ");
            sb.append(str);
            sb.append(i3 == 0 ? " close" : " open");
            C13341g.m80818e(TECameraServer.TAG, sb.toString());
        }

        @Override // com.p069ss.android.ttvecamera.AbstractC13324c.a
        /* JADX INFO: renamed from: i */
        public void mo80501i(int i, AbstractC13324c abstractC13324c, Object obj) {
            C13341g.m80818e(TECameraServer.TAG, "onCameraClosed, CameraState = " + TECameraServer.this.mCurrentCameraState);
            if (abstractC13324c == TECameraServer.this.mCameraInstance) {
                synchronized (TECameraServer.this.mStateLock) {
                    TECameraServer.this.updateCameraState(0);
                }
                TECameraServer.this.mCameraObserver.onCaptureStopped(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$o */
    public class RunnableC13276o implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f55241a;

        public RunnableC13276o(int i) {
            this.f55241a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TECameraServer.this.mCameraInstance != null) {
                TECameraServer.this.mCameraInstance.mo80596r0(this.f55241a);
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$o0 */
    public class C13277o0 implements AbstractC13324c.b {
        public C13277o0() {
        }

        @Override // com.p069ss.android.ttvecamera.AbstractC13324c.b
        /* JADX INFO: renamed from: a */
        public int[] mo80502a(List<int[]> list) {
            TECameraServer.access$2700(TECameraServer.this);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$p */
    public class RunnableC13278p implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55244a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ TECameraSettings.InterfaceC13315p f55245b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f55246c;

        public RunnableC13278p(C13331d c13331d, TECameraSettings.InterfaceC13315p interfaceC13315p, boolean z) {
            this.f55244a = c13331d;
            this.f55245b = interfaceC13315p;
            this.f55246c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.queryZoomAbility(this.f55244a, this.f55245b, this.f55246c);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$p0 */
    public class C13279p0 implements AbstractC13324c.d {
        public C13279p0() {
        }

        @Override // com.p069ss.android.ttvecamera.AbstractC13324c.d
        /* JADX INFO: renamed from: a */
        public TEFrameSizei mo80503a(List<TEFrameSizei> list, List<TEFrameSizei> list2) {
            TECameraServer.access$2800(TECameraServer.this);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$q */
    public class RunnableC13280q implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55249a;

        public RunnableC13280q(C13331d c13331d, TECameraSettings.InterfaceC13313n interfaceC13313n) {
            this.f55249a = c13331d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.queryShaderZoomStep(this.f55249a, null);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$q0 */
    public class C13281q0 implements AbstractC13324c.e {
        public C13281q0() {
        }

        @Override // com.p069ss.android.ttvecamera.AbstractC13324c.e
        public TEFrameSizei getPreviewSize(List<TEFrameSizei> list) {
            if (TECameraServer.this.mPreviewSizeCallback != null) {
                try {
                    return TECameraServer.this.mPreviewSizeCallback.getPreviewSize(list);
                } catch (Exception e) {
                    C13341g.m80815b(TECameraServer.TAG, "select preview size from client err: " + e.getMessage());
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$r */
    public class RunnableC13282r implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55252a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ TECameraSettings.InterfaceC13315p f55253b;

        public RunnableC13282r(C13331d c13331d, TECameraSettings.InterfaceC13315p interfaceC13315p) {
            this.f55252a = c13331d;
            this.f55253b = interfaceC13315p;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.stopZoom(this.f55252a, this.f55253b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$r0 */
    public class RunnableC13283r0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55255a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f55256b;

        public RunnableC13283r0(C13331d c13331d, int i) {
            this.f55255a = c13331d;
            this.f55256b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.switchCameraMode(this.f55255a, this.f55256b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$s */
    public class RunnableC13284s implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55258a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ float f55259b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ TECameraSettings.InterfaceC13315p f55260c;

        public RunnableC13284s(C13331d c13331d, float f, TECameraSettings.InterfaceC13315p interfaceC13315p) {
            this.f55258a = c13331d;
            this.f55259b = f;
            this.f55260c = interfaceC13315p;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.zoomV2(this.f55258a, this.f55259b, this.f55260c);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$s0 */
    public class C13285s0 implements AbstractC13324c.f {
        public C13285s0() {
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$t */
    public class RunnableC13286t implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55263a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Bundle f55264b;

        public RunnableC13286t(C13331d c13331d, Bundle bundle) {
            this.f55263a = c13331d;
            this.f55264b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setFeatureParameters(this.f55263a, this.f55264b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$t0 */
    public class RunnableC13287t0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55266a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f55267b;

        public RunnableC13287t0(C13331d c13331d, int i, AbstractC13324c.c cVar) {
            this.f55266a = c13331d;
            this.f55267b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.changeRecorderState(this.f55266a, this.f55267b, null);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$u */
    public class RunnableC13288u implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55269a;

        public RunnableC13288u(C13331d c13331d, TECameraSettings.C13309j c13309j) {
            this.f55269a = c13331d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.process(this.f55269a, null);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$u0 */
    public class RunnableC13289u0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55271a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f55272b;

        public RunnableC13289u0(C13331d c13331d, boolean z) {
            this.f55271a = c13331d;
            this.f55272b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.enableMulticamZoom(this.f55271a, this.f55272b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$v */
    public class RunnableC13290v implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f55274a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C13331d f55275b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ TECameraSettings f55276c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Cert f55277d;

        public RunnableC13290v(long j, C13331d c13331d, TECameraSettings tECameraSettings, Cert cert) {
            this.f55274a = j;
            this.f55275b = c13331d;
            this.f55276c = tECameraSettings;
            this.f55277d = cert;
        }

        @Override // java.lang.Runnable
        public void run() {
            C13341g.m80814a(TECameraServer.TAG, "Push open task cost: " + (System.currentTimeMillis() - this.f55274a));
            ajh0.m96973b("te_record_camera_push_open_task_time", System.currentTimeMillis() - this.f55274a);
            TECameraServer.this.open(this.f55275b, this.f55276c, this.f55277d);
            C13341g.m80818e(TECameraServer.TAG, "Camera open cost: " + (System.currentTimeMillis() - this.f55274a) + "ms");
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$v0 */
    public class RunnableC13291v0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55279a;

        public RunnableC13291v0(C13331d c13331d, TECameraSettings.InterfaceC13301b interfaceC13301b) {
            this.f55279a = c13331d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.getCameraCapbilitiesForBytebench(this.f55279a, null);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$w */
    public class RunnableC13292w implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f55281a;

        public RunnableC13292w(int i) {
            this.f55281a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (TECameraServer.this.mStateLock) {
                try {
                    if (TECameraServer.this.mCameraInstance == null) {
                        return;
                    }
                    boolean zMo80586j0 = TECameraServer.this.mCameraInstance.mo80586j0(this.f55281a);
                    if (TECameraServer.this.mFirstEC && zMo80586j0) {
                        TECameraServer.this.mCameraEvent.mo80497e(115, 0, "exposure compensation", TECameraServer.this.mCameraInstance);
                        TECameraServer.this.mFirstEC = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$w0 */
    public class RunnableC13293w0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55283a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ cjh0.C16167a f55284b;

        public RunnableC13293w0(C13331d c13331d, cjh0.C16167a c16167a) {
            this.f55283a = c13331d;
            this.f55284b = c16167a;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.addCameraProvider(this.f55283a, this.f55284b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$x */
    public class RunnableC13294x implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55286a;

        public RunnableC13294x(C13331d c13331d) {
            this.f55286a = c13331d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.upExposureCompensation(this.f55286a);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$x0 */
    public class RunnableC13295x0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55288a;

        public RunnableC13295x0(C13331d c13331d) {
            this.f55288a = c13331d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.removeCameraProvider(this.f55288a);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$y */
    public class RunnableC13296y implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55290a;

        public RunnableC13296y(C13331d c13331d) {
            this.f55290a = c13331d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.downExposureCompensation(this.f55290a);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$y0 */
    public class RunnableC13297y0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55292a;

        public RunnableC13297y0(C13331d c13331d) {
            this.f55292a = c13331d;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.start(this.f55292a);
            if (TECameraServer.this.mCameraSettings.f55347k) {
                TECameraServer.this.mCameraClientCondition.open();
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$z */
    public class RunnableC13298z implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13331d f55294a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f55295b;

        public RunnableC13298z(C13331d c13331d, boolean z) {
            this.f55294a = c13331d;
            this.f55295b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setAutoExposureLock(this.f55294a, this.f55295b);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.TECameraServer$z0 */
    public class RunnableC13299z0 implements Runnable {
        public RunnableC13299z0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TECameraServer.this.mCameraInstance != null) {
                TECameraServer.this.mCameraInstance.mo80625a();
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

    public static /* synthetic */ C13331d.a access$2700(TECameraServer tECameraServer) {
        tECameraServer.getClass();
        return null;
    }

    public static /* synthetic */ C13331d.d access$2800(TECameraServer tECameraServer) {
        tECameraServer.getClass();
        return null;
    }

    public static /* synthetic */ TECameraSettings.InterfaceC13312m access$3000(TECameraServer tECameraServer) {
        tECameraServer.getClass();
        return null;
    }

    private boolean assertClient(C13331d c13331d) {
        synchronized (this.mLock) {
            try {
                C13331d c13331d2 = this.mCameraClient;
                if (c13331d2 == c13331d) {
                    return true;
                }
                if (c13331d2 == null) {
                    C13341g.m80823j(TAG, "Internal CameraClient is null. Must call connect first!");
                } else {
                    C13341g.m80823j(TAG, "Invalid CameraClient, need : " + this.mCameraClient);
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
                C13341g.m80815b(TAG, "call camera close process, handler is null");
                this.mCameraInstance.mo80590n(this.cachedClosePrivacyCert);
                C13341g.m80823j(TAG, "call camera close process, handler is null, force close done");
            }
            updateCameraState(0);
            return -112;
        }
        C13341g.m80818e(TAG, "call camera close process...sync: " + z + ", handler: " + handler);
        if (this.mHandlerDestroyed || Looper.myLooper() == handler.getLooper()) {
            this.mCameraCloseTaskHandlerId = -1;
            if (this.mEnableVBoost) {
                this.mSystemResManager.m80827c(new TESystemResManager.C13342a(TESystemResManager.ActionType.BOOST_CPU, this.mVBoostTimeoutMS));
                realCloseCamera(cert);
                this.mSystemResManager.m80827c(new TESystemResManager.C13342a(TESystemResManager.ActionType.RESTORE_CPU));
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
                C13341g.m80815b(TAG, "camera close task discard...handler id has changed");
                return 0;
            }
            this.mCameraCloseTaskHandlerId = iHashCode;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z) {
                this.mCameraClientCondition.close();
            }
            this.mIsCameraPendingClose = true;
            handler.post(new RunnableC13246a(jCurrentTimeMillis, z, cert));
            if (z) {
                boolean zBlock = this.mCameraClientCondition.block(1500L);
                this.mIsCameraPendingClose = false;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                if (zBlock) {
                    C13341g.m80818e(TAG, "Camera close cost: " + jCurrentTimeMillis2 + "ms");
                } else {
                    this.mCameraCloseTaskHandlerId = -1;
                    C13341g.m80815b(TAG, "Camera close timeout, mCurrentCameraState " + this.mCurrentCameraState);
                    updateCameraState(4);
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo80590n(this.cachedClosePrivacyCert);
                    }
                    updateCameraState(0);
                }
            }
        }
        return 0;
    }

    @Nullable
    private AbstractC13324c createCameraInstance() {
        AbstractC13324c abstractC13324cCreateCameraInstanceCore = createCameraInstanceCore();
        if (abstractC13324cCreateCameraInstanceCore != null) {
            abstractC13324cCreateCameraInstanceCore.m80653c0(this.mPreviewSizeCallback != null ? this.mBasePreviewSizeCallback : null);
            abstractC13324cCreateCameraInstanceCore.m80652b0(null);
        }
        return abstractC13324cCreateCameraInstanceCore;
    }

    private AbstractC13324c createCameraInstanceCore() {
        TECameraSettings tECameraSettings = this.mCameraSettings;
        boolean z = !tECameraSettings.f55364s0 || C13333f.m80719u(tECameraSettings.f55327a);
        TECameraSettings tECameraSettings2 = this.mCameraSettings;
        int i = tECameraSettings2.f55329b;
        if (i == 1) {
            return C13322a.m80552N0(tECameraSettings2.f55327a, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        }
        if ((10 != i && 11 != i) || Build.VERSION.SDK_INT < 28) {
            if (!z) {
                tECameraSettings2.f55329b = 1;
                return C13322a.m80552N0(tECameraSettings2.f55327a, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
            }
            AbstractC13324c abstractC13324cCreateVendorCamera2Instance = createVendorCamera2Instance(i, tECameraSettings2.f55327a, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
            if (abstractC13324cCreateVendorCamera2Instance != null) {
                return abstractC13324cCreateVendorCamera2Instance;
            }
            TECameraSettings tECameraSettings3 = this.mCameraSettings;
            tECameraSettings3.f55329b = 2;
            return C13323b.m80604Q0(2, tECameraSettings3.f55327a, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        }
        AbstractC13324c abstractC13324c = (AbstractC13324c) C13333f.m80708j("com.ss.android.ttvecamera.TEVendorCamera", i, tECameraSettings2.f55327a, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        if (abstractC13324c != null) {
            C13341g.m80818e(TAG, "createCameraInstance TEVendorCamera");
            return abstractC13324c;
        }
        TECameraSettings tECameraSettings4 = this.mCameraSettings;
        if (z) {
            tECameraSettings4.f55329b = 2;
            return C13323b.m80604Q0(2, tECameraSettings4.f55327a, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        }
        tECameraSettings4.f55329b = 1;
        return C13322a.m80552N0(tECameraSettings4.f55327a, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
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
                handlerThread2.getLooper().setMessageLogging(new C13273m0());
                this.mHandlerThread = handlerThread2;
                return new Handler(handlerThread2.getLooper(), new C13251b1(this));
            } catch (Exception e) {
                C13341g.m80815b(TAG, "CreateHandler failed!: " + e.toString());
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
    private AbstractC13324c createVendorCamera2Instance(int i, Context context, AbstractC13324c.a aVar, Handler handler, AbstractC13324c.d dVar) {
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
                C13323b c13323b = (C13323b) C13333f.m80708j(str, i, context, aVar, handler, dVar);
                C13341g.m80818e(TAG, "create, vendorCamera2 = " + c13323b);
                return c13323b;
            }
            str2 = "com.ss.android.ttvecamera.TEXmV2Camera";
        }
        str = str2;
        if (str != null) {
            return null;
        }
        C13323b c13323b2 = (C13323b) C13333f.m80708j(str, i, context, aVar, handler, dVar);
        C13341g.m80818e(TAG, "create, vendorCamera2 = " + c13323b2);
        return c13323b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int decreaseClientCount() {
        try {
            this.sClientCount--;
            C13341g.m80814a(TAG, "sClientCount = " + this.sClientCount);
            if (this.sClientCount < 0) {
                C13341g.m80823j(TAG, "Invalid ClientCount = " + this.sClientCount);
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
            C13341g.m80818e(TAG, "destroy...start");
            this.mIsInitialized = false;
            this.mCheckCloseTask = null;
            this.mCameraClient = null;
            this.mPreviewSizeCallback = null;
            this.cachedClosePrivacyCert = null;
            this.cachedOpenPrivacyCert = null;
            this.mProviderSettings = null;
            if (this.mCameraInstance != null) {
                this.mCameraInstance.mo80630i();
            }
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new RunnableC13268k());
            }
            HandlerThread handlerThread = this.mHandlerThread;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                this.mHandlerThread = null;
                this.mHandlerDestroyed = true;
                this.mHandler = null;
            }
            this.mCameraObserver = C13331d.c.m80697a();
            C13341g.m80818e(TAG, "destroy...end");
        } catch (Throwable th) {
            throw th;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePreviewingFallback() {
        boolean z;
        if (this.mCameraSettings.f55329b == 1) {
            return;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 3) {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo80602x0();
                        updateCameraState(4);
                        this.mCameraInstance.mo80581f(this.cachedOpenPrivacyCert);
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
            this.mCameraSettings.f55329b = 1;
            this.mCameraEvent.mo80497e(51, 0, "need recreate surfacetexture", null);
            INSTANCE.open(this.mCameraClient, this.mCameraSettings, this.cachedOpenPrivacyCert);
        }
    }

    private synchronized int increaseClientCount() {
        this.sClientCount++;
        C13341g.m80814a(TAG, "sClientCount = " + this.sClientCount);
        return this.sClientCount;
    }

    private synchronized void init(boolean z) {
        C13341g.m80818e(TAG, "init...start");
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
        C13341g.m80818e(TAG, "init...end");
    }

    private boolean isARConfigNotEqual(TECameraSettings tECameraSettings) {
        TECameraSettings tECameraSettings2 = this.mCameraSettings;
        if (tECameraSettings2 == null) {
            return true;
        }
        if (tECameraSettings.f55302B != 2) {
            return false;
        }
        TECameraSettings.ARConfig aRConfig = tECameraSettings2.f55376y0;
        return (aRConfig != null && aRConfig.f55378a.ordinal() == tECameraSettings.f55376y0.f55378a.ordinal() && this.mCameraSettings.f55376y0.f55379b.ordinal() == tECameraSettings.f55376y0.f55379b.ordinal() && this.mCameraSettings.f55376y0.f55380c.ordinal() == tECameraSettings.f55376y0.f55380c.ordinal() && this.mCameraSettings.f55376y0.f55381d.ordinal() == tECameraSettings.f55376y0.f55381d.ordinal() && this.mCameraSettings.f55376y0.f55382e.ordinal() == tECameraSettings.f55376y0.f55382e.ordinal() && this.mCameraSettings.f55376y0.f55383f.ordinal() == tECameraSettings.f55376y0.f55383f.ordinal()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isCameraPermitted() {
        boolean z = true;
        try {
            if (e16.m114373a(this.mCameraSettings.f55327a, "android.permission.CAMERA") != 0) {
                z = false;
            }
        } catch (Exception e) {
            C13341g.m80815b(TAG, "test camera permission failed!: " + e.toString());
        }
        this.mOpenInfoMap.put("CamPerm" + this.mRetryCnt, String.valueOf(z));
        return z;
    }

    private boolean onlySwitchSession(TECameraSettings tECameraSettings) {
        int i;
        TECameraSettings tECameraSettings2 = this.mCameraSettings;
        if (tECameraSettings2 == null || tECameraSettings2.f55333d != 0 || tECameraSettings.f55333d != 0 || (i = tECameraSettings2.f55329b) != 11 || i != tECameraSettings.f55329b) {
            return false;
        }
        TEFrameSizei tEFrameSizei = tECameraSettings2.f55359q;
        int i2 = tEFrameSizei.width;
        TEFrameSizei tEFrameSizei2 = tECameraSettings.f55359q;
        if (i2 != tEFrameSizei2.width || tEFrameSizei.height != tEFrameSizei2.height || tECameraSettings2.f55314N != tECameraSettings.f55314N || tECameraSettings2.f55304D != tECameraSettings.f55304D || tECameraSettings2.f55367u != tECameraSettings.f55367u || tECameraSettings2.f55377z != tECameraSettings.f55377z || tECameraSettings2.f55321U == tECameraSettings.f55321U || tECameraSettings2.f55322V == tECameraSettings.f55322V) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("enable_video_stabilization", tECameraSettings.f55321U);
        bundle.putBoolean("enable_ai_night_video", tECameraSettings.f55322V);
        this.mCameraInstance.mo80587k0(bundle);
        this.mCameraSettings = tECameraSettings;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int open(@NonNull C13331d c13331d, TECameraSettings tECameraSettings, Cert cert) {
        int iMo80577W;
        if (!assertClient(c13331d)) {
            return -108;
        }
        if (this.mIsCameraPendingClose) {
            C13341g.m80815b(TAG, "pending close");
            return TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT;
        }
        if (tECameraSettings.f55342h0 && this.mOnBackGround) {
            C13341g.m80815b(TAG, "in background");
            return TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            C13341g.m80815b(TAG, "open, mHandler is null!");
            return -112;
        }
        if (this.mIsCameraPendingClose) {
            C13341g.m80815b(TAG, "had called disConnect(), abandon open camera!");
            return -113;
        }
        if (this.mHandlerDestroyed || Looper.myLooper() == handler.getLooper()) {
            wjh0.m203445a("TECameraServer-open");
            this.mCameraSettings = tECameraSettings;
            C13341g.m80818e(TAG, "is force close camera=" + this.mCameraSettings.f55318R + ", Camera2Detect=" + this.mCameraSettings.f55364s0);
            this.mCheckCloseTask = new RunnableC13261g0();
            this.mCurrentZoom = 0.0f;
            if (this.mRetryCnt < 0) {
                this.mRetryCnt = tECameraSettings.f55369v;
            }
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState != 0) {
                        C13341g.m80823j(TAG, "No need open camera again, state = " + this.mCurrentCameraState);
                        if (this.mCurrentCameraState != 1) {
                            this.mCameraObserver.onInfo(1, 0, "Camera features is ready");
                        }
                        wjh0.m203446b();
                        return 0;
                    }
                    updateCameraState(1);
                    if (this.mCameraInstance == null) {
                        this.mCameraInstance = createCameraInstance();
                        if (this.mCameraInstance == null) {
                            if (this.mCameraSettings.f55329b == 11) {
                                updateCameraState(0);
                                this.mCameraEvent.mo80498f(this.mCameraSettings.f55329b, -428, null, null);
                            } else {
                                updateCameraState(0);
                                this.mCameraObserver.onError(-100, "open : mCameraInstance is null.");
                            }
                            return -1;
                        }
                        this.mCameraInstance.m80660q0(this.satZoomCallback);
                    }
                    this.mBeginTime = System.currentTimeMillis();
                    if (this.mEnableVBoost) {
                        this.mSystemResManager.m80827c(new TESystemResManager.C13342a(TESystemResManager.ActionType.BOOST_CPU, this.mVBoostTimeoutMS));
                        iMo80577W = this.mCameraInstance.mo80577W(this.mCameraSettings, cert);
                        this.mSystemResManager.m80827c(new TESystemResManager.C13342a(TESystemResManager.ActionType.RESTORE_CPU));
                    } else {
                        iMo80577W = this.mCameraInstance.mo80577W(this.mCameraSettings, cert);
                    }
                    if (iMo80577W != 0) {
                        C13341g.m80823j(TAG, "Open camera failed, ret = " + iMo80577W);
                    }
                    wjh0.m203446b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            handler.post(new RunnableC13290v(System.currentTimeMillis(), c13331d, tECameraSettings, cert));
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void realCloseCamera(Cert cert) {
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 0) {
                    C13341g.m80823j(TAG, "realCloseCamera, no need to close camera, state: " + this.mCurrentCameraState);
                } else {
                    updateCameraState(4);
                    if (this.mCameraInstance != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        this.mCameraInstance.mo80581f(cert);
                        C13341g.m80818e(TAG, "system call close() cost: " + (System.currentTimeMillis() - jCurrentTimeMillis));
                    }
                    updateCameraState(0);
                }
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo80630i();
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
        if (tECameraSettings2.f55329b != tECameraSettings.f55329b) {
            return true;
        }
        TEFrameSizei tEFrameSizei = tECameraSettings2.f55359q;
        int i = tEFrameSizei.width;
        TEFrameSizei tEFrameSizei2 = tECameraSettings.f55359q;
        return (i == tEFrameSizei2.width && tEFrameSizei.height == tEFrameSizei2.height && tECameraSettings2.f55333d == tECameraSettings.f55333d && tECameraSettings2.f55314N == tECameraSettings.f55314N && tECameraSettings2.f55321U == tECameraSettings.f55321U && tECameraSettings2.f55304D == tECameraSettings.f55304D && tECameraSettings2.f55367u == tECameraSettings.f55367u && tECameraSettings2.f55377z == tECameraSettings.f55377z && tECameraSettings2.f55302B == tECameraSettings.f55302B && !isARConfigNotEqual(tECameraSettings)) ? false : true;
    }

    public int abortSession(C13331d c13331d) {
        if (!assertClient(c13331d)) {
            return -108;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            C13341g.m80815b(TAG, "abortSession, mHandler is null!");
            return -112;
        }
        handler.post(new RunnableC13299z0());
        return 0;
    }

    public void addCameraAlgorithm(TECameraAlgorithmParam tECameraAlgorithmParam) {
        if (this.mCameraInstance == null) {
            C13341g.m80815b(TAG, "addCameraAlgorithm failed mCameraInstance is null!");
        } else {
            this.mCameraInstance.m80651b(tECameraAlgorithmParam);
        }
    }

    public int addCameraProvider(C13331d c13331d, cjh0.C16167a c16167a) {
        cjh0.C16167a c16167a2;
        if (!assertClient(c13331d)) {
            return -108;
        }
        if (this.mHandlerDestroyed || Looper.myLooper() == this.mHandler.getLooper()) {
            C13341g.m80818e(TAG, "addCameraProvider");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance == null) {
                        this.mCameraObserver.onError(-100, "Invalidate Camera Instance!!");
                        return -100;
                    }
                    C13341g.m80818e(TAG, "addCameraProvider, mProviderSettings = " + this.mProviderSettings + ", providerSettings = " + c16167a);
                    if (this.mProviderSettings == null || this.mCameraInstance.m80645K() == null || !((c16167a2 = this.mProviderSettings) == null || c16167a2.m107172b(c16167a))) {
                        this.mProviderManager.m107159a(c16167a, this.mCameraInstance);
                        this.mIsCameraProviderChanged = true;
                        cjh0.C16167a c16167a3 = this.mProviderSettings;
                        if (c16167a3 == null) {
                            this.mProviderSettings = new cjh0.C16167a(c16167a);
                        } else {
                            c16167a3.m107171a(c16167a);
                        }
                    } else {
                        this.mIsCameraProviderChanged = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            this.mHandler.post(new RunnableC13293w0(c13331d, c16167a));
        }
        return 0;
    }

    public void appLifeCycleChanged(boolean z) {
        this.mOnBackGround = z;
    }

    public int cancelFocus(C13331d c13331d) {
        if (!assertClient(c13331d)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13264i(c13331d));
            return 0;
        }
        C13341g.m80818e(TAG, "cancelFocus...");
        synchronized (this.mStateLock) {
            this.mCameraInstance.mo80580c();
        }
        return 0;
    }

    public int captureBurst(C13331d c13331d, TECameraSettings.InterfaceC13302c interfaceC13302c, ti3 ti3Var) {
        if (!assertClient(c13331d)) {
            return -108;
        }
        this.mHandler.post(new RunnableC13256e(interfaceC13302c, ti3Var));
        return 0;
    }

    public void changeCaptureFormat() {
    }

    public int changeRecorderState(C13331d c13331d, int i, AbstractC13324c.c cVar) {
        if (!assertClient(c13331d)) {
            return -108;
        }
        if (!this.mHandlerDestroyed && Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13287t0(c13331d, i, cVar));
            return 0;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance == null) {
                    this.mCameraObserver.onError(-100, "Invalidate Camera Instance!!");
                    return -100;
                }
                this.mCameraInstance.m80655e(i, cVar);
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int connect(@NonNull C13331d c13331d, @NonNull C13331d.b bVar, @NonNull TECameraSettings tECameraSettings, C13331d.d dVar, Cert cert) {
        C13341g.m80818e(TAG, "connect with client: " + c13331d);
        if (c13331d == null) {
            ig3.m135964a("client must not be null");
            return 0;
        }
        if (bVar == null) {
            ig3.m135964a("observer must not be null");
            return 0;
        }
        if (tECameraSettings == null) {
            ig3.m135964a("mParams must not be null");
            return 0;
        }
        this.mMainHandler.removeCallbacks(this.mCheckCloseTask);
        synchronized (this.mLock) {
            try {
                boolean zShouldReOpenCamera = shouldReOpenCamera(tECameraSettings);
                if (c13331d == this.mCameraClient && !zShouldReOpenCamera) {
                    C13341g.m80823j(TAG, "No need reconnect.");
                    return 0;
                }
                if (!this.mIsInitialized) {
                    init(true);
                    zShouldReOpenCamera = false;
                }
                this.mCameraClient = c13331d;
                this.mCameraObserver = bVar;
                boolean z = tECameraSettings.f55319S;
                this.mEnableVBoost = z;
                this.mRetryCnt = -1;
                if (z) {
                    this.mVBoostTimeoutMS = tECameraSettings.f55320T;
                    this.mSystemResManager.m80826b(new xjh0());
                    this.mSystemResManager.m80825a(tECameraSettings.f55327a);
                }
                increaseClientCount();
                if (zShouldReOpenCamera) {
                    C13341g.m80818e(TAG, "reopen camera.");
                    close(cert);
                }
                this.mIsCameraPendingClose = false;
                this.cachedOpenPrivacyCert = cert;
                return open(c13331d, tECameraSettings, cert);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean couldForwardState(int i) {
        if (i == this.mCurrentCameraState) {
            C13341g.m80823j(TAG, "No need this");
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    return this.mCurrentCameraState == 1;
                }
                C13341g.m80815b(TAG, "Invalidate camera state = " + i);
                return false;
            }
            if (this.mCurrentCameraState != 0) {
                C13341g.m80823j(TAG, "No need open camera again, state = " + this.mCurrentCameraState);
            }
        }
        return true;
    }

    public int disConnect(C13331d c13331d, boolean z, Cert cert) {
        C13341g.m80818e(TAG, "disConnect with client: " + c13331d);
        this.mIsCameraSwitchState = false;
        synchronized (this.mLock) {
            C13331d c13331d2 = this.mCameraClient;
            if (c13331d2 != c13331d || c13331d2 == null) {
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

    public void downExposureCompensation(C13331d c13331d) {
        if (assertClient(c13331d)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new RunnableC13296y(c13331d));
                return;
            }
            C13341g.m80818e(TAG, "downExposureCompensation...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState != 3 && this.mCurrentCameraState != 2) {
                        this.mCameraObserver.onError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, "Can not set ec on state : " + this.mCurrentCameraState);
                        return;
                    }
                    TECameraSettings.C13303d c13303dM80661s = this.mCameraInstance.m80661s();
                    if (c13303dM80661s == null) {
                        this.mCameraObserver.onError(-112, "downExposureCompensation get ec info failed");
                    } else {
                        this.mCameraInstance.mo80586j0(c13303dM80661s.f55385b - 1);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public int enableCaf(C13331d c13331d) {
        if (!assertClient(c13331d)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13266j(c13331d));
            return 0;
        }
        C13341g.m80818e(TAG, "enableCaf...");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo80585j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public int enableMulticamZoom(C13331d c13331d, boolean z) {
        if (!assertClient(c13331d)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13289u0(c13331d, z));
            return 0;
        }
        C13341g.m80818e(TAG, "enableMulticamZoom: " + z);
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo80631k(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public int focusAtPoint(C13331d c13331d, TEFocusSettings tEFocusSettings) {
        if (!assertClient(c13331d)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13262h(c13331d, tEFocusSettings));
            return 0;
        }
        C13341g.m80818e(TAG, "focusAtPoint at: " + tEFocusSettings);
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 3) {
                    this.mCameraInstance.mo80589m(tEFocusSettings);
                    return 0;
                }
                String str = "Can not set focus on state : " + this.mCurrentCameraState;
                C13341g.m80823j(TAG, str);
                this.mCameraObserver.onError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, str);
                return TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public float[] getApertureRange(C13331d c13331d, TECameraSettings.InterfaceC13300a interfaceC13300a) {
        float[] fArrMo80634o = {0.0f};
        if (!assertClient(c13331d)) {
            return new float[]{-1.0f, -1.0f};
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13265i0(c13331d, interfaceC13300a));
            return fArrMo80634o;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    fArrMo80634o = this.mCameraInstance.mo80634o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fArrMo80634o;
    }

    public TEFrameSizei getBestPreviewSize(C13331d c13331d, float f, TEFrameSizei tEFrameSizei) {
        if (!assertClient(c13331d) || this.mCurrentCameraState == 0 || this.mCurrentCameraState == 1) {
            return null;
        }
        return this.mCameraInstance.mo80593p(f, tEFrameSizei);
    }

    public JSONObject getCameraCapbilitiesForBytebench(C13331d c13331d, TECameraSettings.InterfaceC13301b interfaceC13301b) {
        JSONObject jSONObject = new JSONObject();
        if (!assertClient(c13331d)) {
            return null;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13291v0(c13331d, interfaceC13301b));
            return jSONObject;
        }
        C13341g.m80818e(TAG, "getCameraCapbilitiesForBytebench");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    jSONObject = this.mCameraInstance.mo80594q();
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
        return this.mCameraInstance.mo80595r();
    }

    public TECameraSettings.C13303d getCameraECInfo(C13331d c13331d) {
        if (assertClient(c13331d) && this.mCameraInstance != null) {
            return this.mCameraInstance.m80661s();
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

    public int getExposureCompensation(C13331d c13331d) {
        if (!assertClient(c13331d)) {
            upk0.m194883a("Client is not connected!!!");
            return 0;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    return this.mCameraInstance.m80664w();
                }
                this.mCameraObserver.onError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, "Can not get ec on state : " + this.mCurrentCameraState);
                return TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public float[] getFOV(C13331d c13331d, TECameraSettings.InterfaceC13304e interfaceC13304e) {
        float[] fArr = new float[2];
        if (!assertClient(c13331d)) {
            return new float[]{-2.0f, -2.0f};
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13254d(c13331d, interfaceC13304e));
            return fArr;
        }
        C13341g.m80818e(TAG, "getFOV");
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 3) {
                    return this.mCameraInstance.mo80601x();
                }
                this.mCameraObserver.onError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, "Can not getFOV on state : " + this.mCurrentCameraState);
                return new float[]{-2.0f, -2.0f};
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getFlashMode(C13331d c13331d) {
        if (this.mCameraInstance == null) {
            return -1;
        }
        return this.mCameraInstance.mo80559B();
    }

    public int getISO(C13331d c13331d, TECameraSettings.InterfaceC13306g interfaceC13306g) {
        int iMo80607F;
        if (!assertClient(c13331d)) {
            return -1;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13257e0(c13331d, interfaceC13306g));
            return -1;
        }
        synchronized (this.mStateLock) {
            try {
                iMo80607F = this.mCameraInstance != null ? this.mCameraInstance.mo80607F() : -1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iMo80607F;
    }

    public int[] getISORange(C13331d c13331d, TECameraSettings.InterfaceC13307h interfaceC13307h) {
        int[] iArrMo80608G = new int[2];
        if (!assertClient(c13331d)) {
            return new int[]{-1, -1};
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13253c0(c13331d, interfaceC13307h));
            return iArrMo80608G;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    iArrMo80608G = this.mCameraInstance.mo80608G();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iArrMo80608G;
    }

    public float getManualFocusAbility(C13331d c13331d, TECameraSettings.InterfaceC13308i interfaceC13308i) {
        float fMo80609H;
        if (!assertClient(c13331d)) {
            return -1.0f;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13270l(c13331d, interfaceC13308i));
            return -1.0f;
        }
        synchronized (this.mStateLock) {
            try {
                fMo80609H = this.mCameraInstance != null ? this.mCameraInstance.mo80609H() : -1.0f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fMo80609H;
    }

    public int[] getPictureSize(C13331d c13331d) {
        if (assertClient(c13331d) && this.mCameraInstance != null) {
            return this.mCameraInstance.mo80567I();
        }
        return null;
    }

    public int[] getPreviewFps() {
        if (this.mCameraInstance == null) {
            return null;
        }
        return this.mCameraInstance.mo80568J();
    }

    public long[] getShutterTimeRange(C13331d c13331d, TECameraSettings.InterfaceC13314o interfaceC13314o) {
        long[] jArrMo80614M = new long[2];
        if (!assertClient(c13331d)) {
            return new long[]{-1, -1};
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13259f0(c13331d, interfaceC13314o));
            return jArrMo80614M;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    jArrMo80614M = this.mCameraInstance.mo80614M();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jArrMo80614M;
    }

    public List<TEFrameSizei> getSupportedPictureSizes(C13331d c13331d) {
        if (!assertClient(c13331d) || this.mCameraInstance == null) {
            return null;
        }
        try {
            return this.mCameraInstance.mo80569N();
        } catch (Exception e) {
            C13341g.m80824k(TAG, "getSupportedPictureSizes, exception occured.", e);
            return null;
        }
    }

    public List<TEFrameSizei> getSupportedPreviewSizes(C13331d c13331d) {
        if (!assertClient(c13331d) || this.mCameraInstance == null) {
            return null;
        }
        try {
            return this.mCameraInstance.mo80570O();
        } catch (Exception e) {
            C13341g.m80824k(TAG, "getSupportedPreviewSizes, exception occured.", e);
            return null;
        }
    }

    public boolean isAutoExposureLockSupported(C13331d c13331d) {
        if (!assertClient(c13331d)) {
            return false;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    return this.mCameraInstance.mo80571Q();
                }
                C13341g.m80823j(TAG, "Can not get ae lock supported on state : " + this.mCurrentCameraState);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isAutoFocusLockSupported(C13331d c13331d) {
        if (!assertClient(c13331d)) {
            return false;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    return this.mCameraInstance.mo80572R();
                }
                C13341g.m80823j(TAG, "Can not get ae lock supported on state : " + this.mCurrentCameraState);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isCameraSwitchState() {
        return this.mIsCameraSwitchState;
    }

    public boolean isSupportWhileBalance(C13331d c13331d) {
        boolean z = false;
        if (!assertClient(c13331d)) {
            return false;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null && this.mCameraInstance.mo80573T()) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public boolean isSupportedExposureCompensation(C13331d c13331d) {
        if (!assertClient(c13331d)) {
            return false;
        }
        if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
            return this.mCameraInstance.mo80575U();
        }
        C13341g.m80823j(TAG, "Can not set ec on state : " + this.mCurrentCameraState);
        return false;
    }

    public boolean isTorchSupported(C13331d c13331d) {
        AbstractC13324c abstractC13324c;
        return assertClient(c13331d) && (abstractC13324c = this.mCameraInstance) != null && abstractC13324c.mo80576V();
    }

    public void notifyHostForegroundVisible(C13331d c13331d, boolean z) {
        if (assertClient(c13331d)) {
            this.mIsForegroundVisible = z;
            C13341g.m80818e(TAG, "is foreground visible: " + z);
        }
    }

    public int process(C13331d c13331d, TECameraSettings.C13309j c13309j) {
        if (!assertClient(c13331d)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13288u(c13331d, c13309j));
            return 0;
        }
        C13341g.m80818e(TAG, "setFeatureParameters...");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.m80649X(c13309j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public TECameraFrame processAlgorithm(TECameraFrame tECameraFrame) {
        if (this.mCameraInstance != null) {
            return this.mCameraInstance.m80650Y(tECameraFrame);
        }
        C13341g.m80815b(TAG, "processAlgorithm failed mCameraInstance is null!");
        return null;
    }

    public void queryFeatures(String str, Bundle bundle) {
        if (this.mCameraInstance == null) {
            C13341g.m80815b(TAG, "queryFeatures: camera instance null");
            return;
        }
        Bundle bundleM80666z = this.mCameraInstance.m80666z(str);
        if (bundleM80666z == null) {
            C13341g.m80815b(TAG, "queryFeatures: getFeatures is null");
            return;
        }
        for (String str2 : bundle.keySet()) {
            if (bundleM80666z.containsKey(str2)) {
                Class clsM80507a = TECameraSettings.C13305f.m80507a(str2);
                if (clsM80507a == Boolean.class) {
                    bundle.putBoolean(str2, bundleM80666z.getBoolean(str2));
                } else if (clsM80507a == Integer.class) {
                    bundle.putInt(str2, bundleM80666z.getInt(str2));
                } else if (clsM80507a == Long.class) {
                    bundle.putLong(str2, bundleM80666z.getLong(str2));
                } else if (clsM80507a == Float.class) {
                    bundle.putFloat(str2, bundleM80666z.getFloat(str2));
                } else if (clsM80507a == Double.class) {
                    bundle.putDouble(str2, bundleM80666z.getDouble(str2));
                } else if (clsM80507a == String.class) {
                    bundle.putString(str2, bundleM80666z.getString(str2));
                } else if (clsM80507a == ArrayList.class) {
                    bundle.putParcelableArrayList(str2, bundleM80666z.getParcelableArrayList(str2));
                } else if (clsM80507a == TEFrameSizei.class) {
                    bundle.putParcelable(str2, bundleM80666z.getParcelable(str2));
                } else if (clsM80507a == TEFocusParameters.class) {
                    bundle.putParcelable(str2, bundleM80666z.getParcelable(str2));
                } else {
                    C13341g.m80823j(TAG, "Not supported key:" + str2);
                }
            }
        }
    }

    public float queryShaderZoomStep(C13331d c13331d, TECameraSettings.InterfaceC13313n interfaceC13313n) {
        if (!assertClient(c13331d)) {
            return -108.0f;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13280q(c13331d, interfaceC13313n));
            return 0.0f;
        }
        C13341g.m80818e(TAG, "queryShaderZoomStep...");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo80578Z(interfaceC13313n);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0.0f;
    }

    public int queryZoomAbility(C13331d c13331d, TECameraSettings.InterfaceC13315p interfaceC13315p, boolean z) {
        if (!assertClient(c13331d)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13278p(c13331d, interfaceC13315p, z));
            return 0;
        }
        C13341g.m80818e(TAG, "queryZoomAbility...");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo80579a0(interfaceC13315p, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public void registerFpsConfigListener(C13331d.a aVar) {
    }

    public void registerPreviewSizeListener(C13331d.e eVar) {
        this.mPreviewSizeCallback = eVar;
    }

    public void removeCameraAlgorithm(int i) {
        if (this.mCameraInstance == null) {
            C13341g.m80815b(TAG, "removeCameraAlgorithm failed mCameraInstance is null!");
        } else {
            this.mCameraInstance.m80654d0(i);
        }
    }

    public int removeCameraProvider(C13331d c13331d) {
        if (!assertClient(c13331d)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13295x0(c13331d));
            return 0;
        }
        C13341g.m80818e(TAG, "removeCameraProvider");
        synchronized (this.mStateLock) {
            this.mProviderManager.m107169k();
        }
        return 0;
    }

    public void setAperture(C13331d c13331d, float f) {
        if (assertClient(c13331d)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new RunnableC13267j0(c13331d, f));
                return;
            }
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo80629f0(f);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setAutoExposureLock(C13331d c13331d, boolean z) {
        if (assertClient(c13331d)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new RunnableC13298z(c13331d, z));
                return;
            }
            C13341g.m80818e(TAG, "setAutoExposureLock...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                        this.mCameraInstance.mo80583g0(z);
                        return;
                    }
                    this.mCameraObserver.onError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, "Can not set auto exposure lock on state : " + this.mCurrentCameraState);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setAutoFocusLock(C13331d c13331d, boolean z) {
        if (assertClient(c13331d)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new RunnableC13247a0(c13331d, z));
                return;
            }
            C13341g.m80814a(TAG, "setAutoExposureLock...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                        this.mCameraInstance.mo80584h0(z);
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
            this.mCameraInstance.m80658i0(i);
        }
    }

    public void setExposureCompensation(C13331d c13331d, int i) {
        Handler handler;
        if (!assertClient(c13331d) || (handler = this.mHandler) == null) {
            C13341g.m80815b(TAG, "setExposureCompensation failed");
        } else {
            handler.post(new RunnableC13292w(i));
        }
    }

    public int setFeatureParameters(C13331d c13331d, Bundle bundle) {
        if (!assertClient(c13331d)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13286t(c13331d, bundle));
            return 0;
        }
        C13341g.m80818e(TAG, "setFeatureParameters...");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo80587k0(bundle);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public void setISO(C13331d c13331d, int i) {
        if (assertClient(c13331d)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new RunnableC13255d0(c13331d, i));
                return;
            }
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo80632l0(i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setManualFocusDistance(C13331d c13331d, float f) {
        if (assertClient(c13331d)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new RunnableC13272m(c13331d, f));
                return;
            }
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo80633m0(f);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setPictureSize(C13331d c13331d, int i, int i2) {
        if (assertClient(c13331d)) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new RunnableC13274n(i, i2));
                return;
            }
            return;
        }
        C13341g.m80823j(TAG, "set picture size failed, w: " + i + ", h: " + i2);
    }

    public void setPreviewFpsRange(TEFrameRateRange tEFrameRateRange) {
        if (this.mCameraSettings == null || this.mCameraInstance == null) {
            return;
        }
        TECameraSettings tECameraSettings = this.mCameraSettings;
        tECameraSettings.f55331c = tEFrameRateRange;
        tECameraSettings.f55315O = 1;
        if (tECameraSettings.f55302B == 1) {
            tECameraSettings.f55315O = 4;
            tECameraSettings.f55326Z = false;
        }
        this.mCameraInstance.mo80592o0();
    }

    public void setSATZoomCallback(TECameraSettings.InterfaceC13312m interfaceC13312m) {
    }

    public void setSceneMode(C13331d c13331d, int i) {
        if (!assertClient(c13331d)) {
            C13341g.m80823j(TAG, "set scnen failed: " + i);
        } else {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new RunnableC13276o(i));
            }
        }
    }

    public void setShutterTime(C13331d c13331d, long j) {
        if (assertClient(c13331d)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new RunnableC13263h0(c13331d, j));
                return;
            }
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo80635s0(j);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setWhileBalance(C13331d c13331d, boolean z, String str) {
        if (assertClient(c13331d)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new RunnableC13250b0(c13331d, z, str));
                return;
            }
            synchronized (this.mStateLock) {
                try {
                    C13341g.m80818e(TAG, "setWhileBalance...");
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo80597t0(z, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public int start(C13331d c13331d) {
        C13341g.m80818e(TAG, "start: client " + c13331d);
        if (!assertClient(c13331d)) {
            return -108;
        }
        TECameraSettings tECameraSettings = this.mCameraSettings;
        if (tECameraSettings == null || tECameraSettings.f55327a == null) {
            C13341g.m80815b(TAG, "mCameraSettings has some error");
            return -100;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            C13341g.m80815b(TAG, "start, mHandler is null!");
            return -112;
        }
        if (Looper.myLooper() != handler.getLooper()) {
            handler.post(new RunnableC13297y0(c13331d));
            if (this.mCameraSettings.f55347k) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.mCameraClientCondition.close();
                this.mCameraClientCondition.block(2000L);
                C13341g.m80818e(TAG, "Camera start cost: " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
            }
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 3) {
                        C13341g.m80823j(TAG, "start, no need to start capture, state: " + this.mCurrentCameraState);
                        if (!this.mIsCameraProviderChanged && !this.mStartPreviewError) {
                            return 0;
                        }
                        this.mCameraInstance.mo80602x0();
                        updateCameraState(2);
                        this.mIsCameraProviderChanged = false;
                    }
                    int i = this.mCurrentCameraState;
                    C13331d.b bVar = this.mCameraObserver;
                    if (i != 2) {
                        bVar.onError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, "Invalidate state: " + this.mCurrentCameraState + " ==> 3");
                        return TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT;
                    }
                    bVar.onInfo(3, this.mCurrentCameraState, "Camera state: opened");
                    this.mCameraInstance.mo80598u0();
                    updateCameraState(3);
                    ajh0.m96973b("te_record_camera_type", this.mCameraInstance.mo80599v());
                    ajh0.m96974c("te_preview_camera_resolution", this.mCameraSettings.f55359q.width + "*" + this.mCameraSettings.f55359q.height);
                    ajh0.m96972a("te_record_camera_frame_rate", (double) this.mCameraSettings.f55331c.max);
                    ajh0.m96973b("te_record_camera_direction", (long) this.mCameraSettings.f55333d);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return 0;
    }

    public int startRecording() {
        return this.mCameraInstance.mo80636v0();
    }

    public int startZoom(C13331d c13331d, float f, TECameraSettings.InterfaceC13315p interfaceC13315p) {
        if (!assertClient(c13331d)) {
            C13341g.m80815b(TAG, "[VE_UI_TEST]Failed event: START_ZOOM. Code: -108. Reason: invalid CameraClient");
            return -108;
        }
        Looper.myLooper();
        this.mHandler.getLooper();
        AbstractC13324c abstractC13324c = this.mCameraInstance;
        if (abstractC13324c == null) {
            C13341g.m80815b(TAG, "[VE_UI_TEST]Failed event: START_ZOOM. Code: -105. Reason: mCameraInstance is null");
            C13341g.m80823j(TAG, "camera is null, no need to start zoom");
            return TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT;
        }
        float fAbs = Math.abs(f - this.mCurrentZoom);
        if (Math.abs(f - abstractC13324c.f55466l) < 0.1f) {
            f = abstractC13324c.f55466l;
        } else if (Math.abs(f) < 0.1f) {
            f = 0.0f;
        } else if (fAbs < 0.1f) {
            return 0;
        }
        this.mCurrentZoom = f;
        Message messageCreateMessage = createMessage(1, true, this.mHandler);
        messageCreateMessage.arg1 = (int) (f * 100.0f);
        messageCreateMessage.obj = interfaceC13315p;
        this.mHandler.sendMessage(messageCreateMessage);
        return 0;
    }

    public int stop(C13331d c13331d, boolean z) {
        C13341g.m80818e(TAG, "stop: client " + c13331d);
        if (!assertClient(c13331d)) {
            return -108;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            C13341g.m80815b(TAG, "stop, mHandler is null!");
            return -112;
        }
        if (Looper.myLooper() != handler.getLooper()) {
            if (z) {
                this.mCameraClientCondition.close();
            }
            handler.post(new RunnableC13248a1(c13331d, z));
            if (z && !this.mCameraClientCondition.block(1500L)) {
                C13341g.m80815b(TAG, "Camera stop timeout!");
            }
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 2) {
                        C13341g.m80823j(TAG, "stop, no need to stop capture, state: " + this.mCurrentCameraState);
                        return 0;
                    }
                    if (this.mCurrentCameraState != 3) {
                        this.mCameraObserver.onError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, "Invalidate state: " + this.mCurrentCameraState + " ==> 2");
                        return TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT;
                    }
                    updateCameraState(2);
                    this.mCameraInstance.mo80602x0();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return 0;
    }

    public int stopRecording() {
        return this.mCameraInstance.mo80637y0();
    }

    public int stopZoom(C13331d c13331d, TECameraSettings.InterfaceC13315p interfaceC13315p) {
        if (!assertClient(c13331d)) {
            C13341g.m80815b(TAG, "[VE_UI_TEST]Failed event: STOP_ZOOM. Code: -108. Reason: invalid CameraClient");
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13282r(c13331d, interfaceC13315p));
            return 0;
        }
        C13341g.m80818e(TAG, "stopZoom...");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo80558A0(interfaceC13315p);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public int switchCamera(C13331d c13331d, TECameraSettings tECameraSettings, Cert cert) {
        C13341g.m80818e(TAG, "switchCamera: " + tECameraSettings);
        if (!assertClient(c13331d)) {
            return -108;
        }
        if (!shouldReOpenCamera(tECameraSettings)) {
            return -423;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13252c(c13331d, tECameraSettings, cert));
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (onlySwitchSession(tECameraSettings)) {
                        return 0;
                    }
                    boolean z = this.mCameraSettings.f55302B != tECameraSettings.f55302B;
                    if (this.mCurrentCameraState == 1 && !z) {
                        this.mCameraObserver.onError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, "Camera is opening, ignore this switch request...");
                        C13341g.m80818e(TAG, "Camera is opening, ignore this switch request...");
                        return TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT;
                    }
                    TECameraSettings tECameraSettings2 = this.mCameraSettings;
                    if (tECameraSettings2.f55329b == tECameraSettings.f55329b && tECameraSettings2.f55302B == tECameraSettings.f55302B) {
                        if (this.mCameraInstance == null) {
                            C13341g.m80818e(TAG, "switch camera, create instance...");
                            this.mCameraInstance = createCameraInstance();
                            if (this.mCameraInstance == null) {
                                this.mCurrentCameraState = 0;
                                int i = this.mCameraSettings.f55329b;
                                if (i == 11) {
                                    this.mCameraEvent.mo80498f(i, -428, null, null);
                                } else {
                                    this.mCameraObserver.onError(-100, "open : mCameraInstance is null.");
                                }
                                return -1;
                            }
                            this.mCameraInstance.m80660q0(this.satZoomCallback);
                        }
                        if (this.mCurrentCameraState != 0) {
                            updateCameraState(4);
                            this.mCameraInstance.mo80581f(cert);
                            updateCameraState(0);
                        }
                        this.mCameraSettings = tECameraSettings;
                        this.mCurrentZoom = 0.0f;
                        updateCameraState(1);
                        if (this.mRetryCnt < 0) {
                            this.mRetryCnt = this.mCameraSettings.f55369v;
                        }
                        this.mBeginTime = System.currentTimeMillis();
                        C13341g.m80814a(TAG, "switch mode = " + this.mCameraSettings.f55302B);
                        int iMo80577W = this.mCameraInstance.mo80577W(this.mCameraSettings, cert);
                        if (iMo80577W != 0) {
                            this.mCameraObserver.onError(iMo80577W, "Switch camera failed @" + this.mCameraSettings.f55329b + ",face:" + this.mCameraSettings.f55333d + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.mCameraSettings.f55359q.toString());
                        }
                        return 0;
                    }
                    close(cert);
                    open(c13331d, tECameraSettings, cert);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return 0;
    }

    public int switchCameraMode(C13331d c13331d, int i) {
        if (!assertClient(c13331d)) {
            return -108;
        }
        TECameraSettings tECameraSettings = c13331d.f55491a;
        if (tECameraSettings.f55329b == 1) {
            return -100;
        }
        if (i != 1 && i != 0 && i != 2) {
            return -100;
        }
        if (tECameraSettings.f55302B == i) {
            return 0;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13283r0(c13331d, i));
        } else {
            C13341g.m80818e(TAG, "switchCameraMode");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState != 3) {
                        this.mCameraObserver.onError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, "Invalidate state: " + this.mCurrentCameraState + " ==> 3");
                        return TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT;
                    }
                    this.mCameraInstance.mo80560B0(i);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return 0;
    }

    public int switchFlashMode(C13331d c13331d, int i) {
        if (!assertClient(c13331d)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13271l0(c13331d, i));
            return 0;
        }
        C13341g.m80818e(TAG, "switchFlashMode: " + i);
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo80562C0(i);
                    this.mCameraEvent.mo80497e(116, i, "", this.mCameraInstance);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public int takePicture(C13331d c13331d, int i, int i2, TECameraSettings.InterfaceC13311l interfaceC13311l) {
        if (!assertClient(c13331d)) {
            return -108;
        }
        this.mHandler.post(new RunnableC13258f(interfaceC13311l, i, i2));
        return 0;
    }

    public int toggleTorch(C13331d c13331d, boolean z) {
        if (!assertClient(c13331d)) {
            C13341g.m80815b(TAG, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -108. Reason: invalid CameraClient");
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13269k0(c13331d, z));
            return 0;
        }
        C13341g.m80818e(TAG, "toggleTorch: " + z);
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo80565F0(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public void upExposureCompensation(C13331d c13331d) {
        if (assertClient(c13331d)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new RunnableC13294x(c13331d));
                return;
            }
            C13341g.m80818e(TAG, "upExposureCompensation...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState != 3 && this.mCurrentCameraState != 2) {
                        this.mCameraObserver.onError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, "Can not set ec on state : " + this.mCurrentCameraState);
                        return;
                    }
                    TECameraSettings.C13303d c13303dM80661s = this.mCameraInstance.m80661s();
                    if (c13303dM80661s == null) {
                        this.mCameraObserver.onError(-112, "upExposureCompensation get ec info failed");
                    } else {
                        this.mCameraInstance.mo80586j0(c13303dM80661s.f55385b + 1);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void updateCameraAlgorithmParam(TECameraAlgorithmParam tECameraAlgorithmParam) {
        if (this.mCameraInstance == null) {
            C13341g.m80815b(TAG, "updateCameraAlgorithmParam failed mCameraInstance is null!");
        } else {
            this.mCameraInstance.m80644G0(tECameraAlgorithmParam);
        }
    }

    public void updateCameraState(int i) {
        if (this.mCurrentCameraState == i) {
            C13341g.m80823j(TAG, "No need update state: " + i);
        } else {
            C13341g.m80818e(TAG, "[updateCameraState]: " + this.mCurrentCameraState + " -> " + i);
            this.mCurrentCameraState = i;
        }
    }

    public int zoomV2(C13331d c13331d, float f, TECameraSettings.InterfaceC13315p interfaceC13315p) {
        if (!assertClient(c13331d)) {
            C13341g.m80815b(TAG, "[VE_UI_TEST]Failed event: START_ZOOM. Code: -108. Reason: invalid CameraClient");
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13284s(c13331d, f, interfaceC13315p));
        } else {
            C13341g.m80818e(TAG, "zoomV2...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo80566H0(f, interfaceC13315p);
                    }
                    if (this.mFirstZoom) {
                        this.mCameraEvent.mo80497e(114, 0, "zoomV2", this.mCameraInstance);
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

    public int takePicture(C13331d c13331d, TECameraSettings.InterfaceC13311l interfaceC13311l) {
        if (!assertClient(c13331d)) {
            return -108;
        }
        this.mHandler.post(new RunnableC13260g(interfaceC13311l));
        return 0;
    }

    public int disConnect(C13331d c13331d, Cert cert) {
        return disConnect(c13331d, true, cert);
    }

    public int stop(C13331d c13331d) {
        return stop(c13331d, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int close(Cert cert) {
        return close(true, cert);
    }

    public int switchCamera(C13331d c13331d, int i, Cert cert) {
        C13341g.m80818e(TAG, "switchCamera: " + i);
        if (!assertClient(c13331d)) {
            return -108;
        }
        TECameraSettings tECameraSettings = this.mCameraSettings;
        if (tECameraSettings == null) {
            C13341g.m80815b(TAG, "switchCamera failed: " + i);
            return -108;
        }
        if (tECameraSettings.f55333d == i) {
            return -423;
        }
        this.mIsCameraSwitchState = true;
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new RunnableC13249b(c13331d, i, cert));
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 1) {
                        this.mIsCameraSwitchState = false;
                        this.mCameraObserver.onError(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT, "Camera is opening, ignore this switch request.");
                        return TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT;
                    }
                    this.mCameraSettings.f55333d = i;
                    this.mCurrentZoom = 0.0f;
                    if (this.mCameraInstance == null) {
                        this.mCameraInstance = createCameraInstance();
                        if (this.mCameraInstance == null) {
                            this.mCurrentCameraState = 0;
                            int i2 = this.mCameraSettings.f55329b;
                            if (i2 == 11) {
                                this.mCameraEvent.mo80498f(i2, -428, null, null);
                            } else {
                                this.mCameraObserver.onError(-100, "open : mCameraInstance is null.");
                            }
                            this.mIsCameraSwitchState = false;
                            return -1;
                        }
                    }
                    if (this.mCurrentCameraState != 0) {
                        updateCameraState(4);
                        this.mCameraInstance.mo80581f(cert);
                        updateCameraState(0);
                    }
                    updateCameraState(1);
                    this.mIsCameraSwitchState = false;
                    if (this.mRetryCnt < 0) {
                        this.mRetryCnt = this.mCameraSettings.f55369v;
                    }
                    this.mBeginTime = System.currentTimeMillis();
                    int iMo80577W = this.mCameraInstance.mo80577W(this.mCameraSettings, cert);
                    if (iMo80577W != 0) {
                        this.mCameraObserver.onError(iMo80577W, "Switch camera failed @" + this.mCameraSettings.f55329b + ",face:" + this.mCameraSettings.f55333d + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.mCameraSettings.f55359q.toString());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return 0;
    }
}
