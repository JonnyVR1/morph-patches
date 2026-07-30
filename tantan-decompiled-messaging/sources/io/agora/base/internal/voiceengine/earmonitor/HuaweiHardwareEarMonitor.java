package io.agora.base.internal.voiceengine.earmonitor;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ReflectUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public class HuaweiHardwareEarMonitor implements IHardwareEarMonitor {
    private static final String TAG = "HuaweiHardwareEarMonitor";

    @Nullable
    private Context mContext;

    @Nullable
    private Class<?> mHwAudioKaraokeFeatureKitClass;

    @Nullable
    private Class<?> mHwAudioKitClass;

    @Nullable
    private HardwareEarMonitorListener mListener;

    @Nullable
    private Class<?> mParamNameClass;
    private AudioKitCallbackImpl mAudioKitCallbackImpl = new AudioKitCallbackImpl();

    @Nullable
    private Object mHwAudioKit = null;

    @Nullable
    private Object mHwAudioKaraokeFeatureKit = null;
    private volatile boolean mInitialized = false;
    private volatile boolean mIsDestroyed = false;
    private volatile boolean mEarMonitorEnabled = false;

    public class AudioKitCallbackImpl implements InvocationHandler {
        private AudioKitCallbackImpl() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                if ("onResult".equals(method.getName())) {
                    int iIntValue = ((Integer) objArr[0]).intValue();
                    Logging.m87208d(HuaweiHardwareEarMonitor.TAG, "onResult: " + iIntValue);
                    if (HuaweiHardwareEarMonitor.this.mIsDestroyed) {
                        Logging.m87208d(HuaweiHardwareEarMonitor.TAG, "ignore result after destroy");
                        if (iIntValue == 0 || iIntValue == 1000) {
                            HuaweiHardwareEarMonitor.this.destroyImpl();
                            return obj;
                        }
                    } else if (iIntValue == 0) {
                        if (HuaweiHardwareEarMonitor.this.mListener != null) {
                            HuaweiHardwareEarMonitor.this.mListener.onInitResult(0);
                        }
                        Logging.m87208d(HuaweiHardwareEarMonitor.TAG, "IAudioKitCallback: HwAudioKit init success");
                    } else {
                        if (iIntValue != 2) {
                            if (iIntValue != 1000) {
                                Logging.m87209e(HuaweiHardwareEarMonitor.TAG, "IAudioKitCallback: onResult error number " + iIntValue);
                                return obj;
                            }
                            boolean zIsHardwareEarMonitorSupported = HuaweiHardwareEarMonitor.this.isHardwareEarMonitorSupported();
                            if (HuaweiHardwareEarMonitor.this.mListener != null) {
                                HuaweiHardwareEarMonitor.this.mListener.onHardwareEarMonitorSupported(zIsHardwareEarMonitorSupported);
                            }
                            Logging.m87208d(HuaweiHardwareEarMonitor.TAG, "IAudioKitCallback: Karaoke feature created");
                            return obj;
                        }
                        Logging.m87208d(HuaweiHardwareEarMonitor.TAG, "IAudioKitCallback: HwAudioKit not installed");
                        if (HuaweiHardwareEarMonitor.this.mListener != null) {
                            HuaweiHardwareEarMonitor.this.mListener.onInitResult(2);
                            return obj;
                        }
                    }
                }
                return obj;
            } catch (Throwable th) {
                Logging.m87210e(HuaweiHardwareEarMonitor.TAG, "AudioKitCallbackImpl invoke failed ", th);
                return obj;
            }
        }
    }

    public HuaweiHardwareEarMonitor(HardwareEarMonitorListener hardwareEarMonitorListener) {
        Logging.m87208d(TAG, ">>ctor");
        this.mListener = hardwareEarMonitorListener;
        this.mContext = ContextUtils.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyImpl() {
        try {
            ReflectUtils.safeCallMethod(this.mHwAudioKaraokeFeatureKitClass, this.mHwAudioKaraokeFeatureKit, "destroy", new Class[0], new Object[0]);
            ReflectUtils.safeCallMethod(this.mHwAudioKitClass, this.mHwAudioKit, "destroy", new Class[0], new Object[0]);
            Logging.m87208d(TAG, "karaoke kit destroy call.");
        } catch (Throwable th) {
            Logging.m87210e(TAG, "destroy failed ", th);
        }
    }

    public static boolean hasEarMonitorClass() {
        return (ReflectUtils.safeFindClass("com.huawei.multimedia.audiokit.interfaces.HwAudioKit") == null || ReflectUtils.safeFindClass("com.huawei.multimedia.audiokit.interfaces.HwAudioKaraokeFeatureKit") == null || ReflectUtils.safeFindClass("com.huawei.multimedia.audiokit.interfaces.IAudioKitCallback") == null) ? false : true;
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.IHardwareEarMonitor
    public void destroy() {
        Logging.m87208d(TAG, "karaoke kit destroy");
        this.mListener = null;
        if (this.mInitialized) {
            this.mInitialized = false;
            this.mEarMonitorEnabled = false;
            this.mIsDestroyed = true;
            destroyImpl();
        }
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.IHardwareEarMonitor
    public int enableHardwareEarMonitor(boolean z) {
        String str = TAG;
        Logging.m87208d(str, ">>enableHardwareEarMonitor " + z);
        try {
            int iIntValue = ((Integer) ReflectUtils.safeCallMethod(this.mHwAudioKaraokeFeatureKitClass, this.mHwAudioKaraokeFeatureKit, "enableKaraokeFeature", new Class[]{Boolean.TYPE}, new Object[]{Boolean.valueOf(z)})).intValue();
            if (iIntValue != 0) {
                Logging.m87209e(str, "enableKaraokeFeature failed ret " + iIntValue);
                return -1;
            }
            this.mEarMonitorEnabled = z;
            if (this.mEarMonitorEnabled) {
                Logging.m87208d(str, "latency: " + ((Integer) ReflectUtils.safeCallMethod(this.mHwAudioKaraokeFeatureKitClass, this.mHwAudioKaraokeFeatureKit, "getKaraokeLatency", new Class[0], new Object[0])).intValue());
            }
            return 0;
        } catch (Throwable th) {
            Logging.m87210e(TAG, "enableHardwareEarMonitor failed ", th);
            return -1;
        }
    }

    @VisibleForTesting
    public InvocationHandler getInvocationHandler() {
        return this.mAudioKitCallbackImpl;
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.IHardwareEarMonitor
    public void initialize() {
        String str = TAG;
        Logging.m87208d(str, "HwAudioKit initialize");
        if (this.mContext == null) {
            Logging.m87209e(str, "mContext is null!");
            return;
        }
        if (this.mInitialized) {
            Logging.m87213w(str, "already initialized, ignore");
            return;
        }
        try {
            this.mHwAudioKaraokeFeatureKitClass = ReflectUtils.safeFindClass("com.huawei.multimedia.audiokit.interfaces.HwAudioKaraokeFeatureKit");
            this.mHwAudioKitClass = ReflectUtils.safeFindClass("com.huawei.multimedia.audiokit.interfaces.HwAudioKit");
            Class<?> clsSafeFindClass = ReflectUtils.safeFindClass("com.huawei.multimedia.audiokit.interfaces.IAudioKitCallback");
            Class<?> clsSafeFindClass2 = ReflectUtils.safeFindClass("com.huawei.multimedia.audiokit.interfaces.HwAudioKit$FeatureType");
            this.mParamNameClass = ReflectUtils.safeFindClass("com.huawei.multimedia.audiokit.interfaces.HwAudioKaraokeFeatureKit$ParameName");
            Object objNewProxyInstance = Proxy.newProxyInstance(clsSafeFindClass.getClassLoader(), new Class[]{clsSafeFindClass}, this.mAudioKitCallbackImpl);
            Object objNewInstance = this.mHwAudioKitClass.getConstructor(Context.class, clsSafeFindClass).newInstance(this.mContext, objNewProxyInstance);
            this.mHwAudioKit = objNewInstance;
            ReflectUtils.safeCallMethod(this.mHwAudioKitClass, objNewInstance, "initialize", new Class[0], new Object[0]);
            this.mHwAudioKaraokeFeatureKit = this.mHwAudioKitClass.getDeclaredMethod("createFeature", clsSafeFindClass2).invoke(this.mHwAudioKit, clsSafeFindClass2.getEnumConstants()[0]);
            this.mInitialized = true;
            Logging.m87208d(str, "HwAudioKit initialize success");
        } catch (Throwable unused) {
            Logging.m87209e(TAG, "HwAudioKit initialize failed");
        }
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.IHardwareEarMonitor
    public boolean isHardwareEarMonitorSupported() {
        String str = TAG;
        Logging.m87208d(str, ">>isHardwareEarMonitorSupported");
        try {
            boolean zBooleanValue = ((Boolean) ReflectUtils.safeCallMethod(this.mHwAudioKaraokeFeatureKitClass, this.mHwAudioKaraokeFeatureKit, "isKaraokeFeatureSupport", new Class[0], new Object[0])).booleanValue();
            StringBuilder sb = new StringBuilder("Karaoke earMonitor is");
            sb.append(zBooleanValue ? MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR : "not ");
            sb.append("support ");
            Logging.m87208d(str, sb.toString());
            return zBooleanValue;
        } catch (Throwable th) {
            Logging.m87210e(TAG, "isHardwareEarMonitorSupported false ", th);
            return false;
        }
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.IHardwareEarMonitor
    public int setHardwareEarMonitorVolume(int i) {
        if (!this.mEarMonitorEnabled) {
            return -7;
        }
        String str = TAG;
        Logging.m87208d(str, ">>setHardwareEarMonitorVolume " + i);
        int iMax = Math.max(0, Math.min(i, 100));
        try {
            Class<?> cls = this.mHwAudioKaraokeFeatureKitClass;
            Object obj = this.mHwAudioKaraokeFeatureKit;
            Class<?> cls2 = this.mParamNameClass;
            int iIntValue = ((Integer) ReflectUtils.safeCallMethod(cls, obj, "setParameter", new Class[]{cls2, Integer.TYPE}, new Object[]{cls2.getEnumConstants()[1], Integer.valueOf(iMax)})).intValue();
            Logging.m87208d(str, "setParameter ret " + iIntValue);
            return iIntValue != 0 ? -1 : 0;
        } catch (Throwable th) {
            Logging.m87210e(TAG, "setHardwareEarMonitorVolume failed ", th);
            return -1;
        }
    }

    @VisibleForTesting
    public void setHwAudioKaraokeFeatureKit(Object obj) {
        this.mHwAudioKaraokeFeatureKit = obj;
    }
}
