package io.agora.base.internal.voiceengine.earmonitor;

import android.content.Context;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ReflectUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class HonorHardwareEarMonitor implements IHardwareEarMonitor {
    private static final String TAG = "HonorHardwareEarMonitor";

    @Nullable
    private Context mContext;

    @Nullable
    private Class<?> mHnAudioClientClass;

    @Nullable
    private Class<?> mHnEarReturnClientClass;

    @Nullable
    private HardwareEarMonitorListener mListener;

    @Nullable
    private Class<?> mParamNameClass;

    @Nullable
    private Class<?> mServiceTypeClass;
    private AudioServiceCallbackImpl mAudioServiceCallbackImpl = new AudioServiceCallbackImpl();

    @Nullable
    private Object mHnAudioClient = null;

    @Nullable
    private Object mHnEarReturnClient = null;
    private volatile boolean mInitialized = false;
    private volatile boolean mIsDestroyed = false;
    private volatile boolean mEarMonitorEnabled = false;
    private volatile boolean mBindServiceSuccess = false;

    public class AudioServiceCallbackImpl implements InvocationHandler {
        private AudioServiceCallbackImpl() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                if ("onResult".equals(method.getName())) {
                    int iIntValue = ((Integer) objArr[0]).intValue();
                    Logging.m87213w(HonorHardwareEarMonitor.TAG, "onResult: " + iIntValue);
                    if (HonorHardwareEarMonitor.this.mIsDestroyed) {
                        Logging.m87213w(HonorHardwareEarMonitor.TAG, "ignore result after destroy");
                        if (iIntValue == 0) {
                            HonorHardwareEarMonitor.this.destroyImpl();
                            return obj;
                        }
                    } else {
                        if (iIntValue != 0) {
                            if (iIntValue != 1000) {
                                Logging.m87209e(HonorHardwareEarMonitor.TAG, "IAudioServiceCallback: onResult error number " + iIntValue);
                                return obj;
                            }
                            boolean zIsHardwareEarMonitorSupported = HonorHardwareEarMonitor.this.isHardwareEarMonitorSupported();
                            if (HonorHardwareEarMonitor.this.mListener != null) {
                                HonorHardwareEarMonitor.this.mListener.onHardwareEarMonitorSupported(zIsHardwareEarMonitorSupported);
                            }
                            Logging.m87208d(HonorHardwareEarMonitor.TAG, "IAudioServiceCallback: Karaoke feature bind service success");
                            return obj;
                        }
                        HonorHardwareEarMonitor.this.bindService();
                        if (HonorHardwareEarMonitor.this.mListener != null) {
                            HonorHardwareEarMonitor.this.mListener.onInitResult(0);
                        }
                        Logging.m87208d(HonorHardwareEarMonitor.TAG, "IAudioServiceCallback: HnAudioClient init success");
                    }
                }
                return obj;
            } catch (Throwable th) {
                Logging.m87210e(HonorHardwareEarMonitor.TAG, "AudioServiceCallbackImpl invoke failed ", th);
                return obj;
            }
        }
    }

    public HonorHardwareEarMonitor(HardwareEarMonitorListener hardwareEarMonitorListener) {
        Logging.m87208d(TAG, ">>ctor");
        this.mListener = hardwareEarMonitorListener;
        this.mContext = ContextUtils.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindService() throws Throwable {
        List list = (List) ReflectUtils.safeCallMethod(this.mHnAudioClientClass, this.mHnAudioClient, "getSupportedServices", new Class[0], new Object[0]);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Integer) it.next()).intValue() == 1) {
                    initHnEarReturnClient();
                    this.mBindServiceSuccess = true;
                    Logging.m87213w(TAG, "bind service success");
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyImpl() {
        try {
            ReflectUtils.safeCallMethod(this.mHnEarReturnClientClass, this.mHnEarReturnClient, "destroy", new Class[0], new Object[0]);
            ReflectUtils.safeCallMethod(this.mHnAudioClientClass, this.mHnAudioClient, "destroy", new Class[0], new Object[0]);
            Logging.m87208d(TAG, "karaoke kit destroy call.");
        } catch (Throwable th) {
            Logging.m87210e(TAG, "destroy failed ", th);
        }
    }

    public static boolean hasEarMonitorClass() {
        return (ReflectUtils.safeFindClass("com.hihonor.android.magicx.media.audio.interfaces.HnAudioClient") == null || ReflectUtils.safeFindClass("com.hihonor.android.magicx.media.audio.interfaces.HnEarReturnClient") == null || ReflectUtils.safeFindClass("com.hihonor.android.magicx.media.audio.interfaces.IAudioServiceCallback") == null) ? false : true;
    }

    private void initHnEarReturnClient() {
        Logging.m87208d(TAG, "initHnEarReturnClient");
        Class<?> cls = this.mHnAudioClientClass;
        Object obj = this.mHnAudioClient;
        Class<?> cls2 = this.mServiceTypeClass;
        this.mHnEarReturnClient = ReflectUtils.safeCallMethod(cls, obj, "createService", new Class[]{cls2}, new Object[]{cls2.getEnumConstants()[0]});
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.IHardwareEarMonitor
    public void destroy() {
        Logging.m87208d(TAG, "karaoke kit destroy");
        this.mListener = null;
        if (this.mInitialized) {
            this.mInitialized = false;
            this.mEarMonitorEnabled = false;
            this.mBindServiceSuccess = false;
            this.mIsDestroyed = true;
            destroyImpl();
        }
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.IHardwareEarMonitor
    public int enableHardwareEarMonitor(boolean z) {
        String str = TAG;
        Logging.m87208d(str, ">>enableHardwareEarMonitor " + z);
        try {
            int iIntValue = ((Integer) ReflectUtils.safeCallMethod(this.mHnEarReturnClientClass, this.mHnEarReturnClient, "enableEarReturn", new Class[]{Boolean.TYPE}, new Object[]{Boolean.valueOf(z)})).intValue();
            if (iIntValue == 0) {
                this.mEarMonitorEnabled = z;
                return 0;
            }
            Logging.m87209e(str, "enableKaraokeFeature failed ret " + iIntValue);
            return -1;
        } catch (Throwable th) {
            Logging.m87210e(TAG, "enableHardwareEarMonitor failed ", th);
            return -1;
        }
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.IHardwareEarMonitor
    public void initialize() {
        String str = TAG;
        Logging.m87208d(str, "HnAudioClient initialize");
        if (this.mContext == null) {
            Logging.m87209e(str, "mContext is null!");
            return;
        }
        if (this.mInitialized) {
            Logging.m87213w(str, "already initialized, ignore");
            return;
        }
        try {
            this.mHnAudioClientClass = ReflectUtils.safeFindClass("com.hihonor.android.magicx.media.audio.interfaces.HnAudioClient");
            this.mHnEarReturnClientClass = ReflectUtils.safeFindClass("com.hihonor.android.magicx.media.audio.interfaces.HnEarReturnClient");
            Class<?> clsSafeFindClass = ReflectUtils.safeFindClass("com.hihonor.android.magicx.media.audio.interfaces.IAudioServiceCallback");
            this.mServiceTypeClass = ReflectUtils.safeFindClass("com.hihonor.android.magicx.media.audio.interfaces.HnAudioClient$ServiceType");
            this.mParamNameClass = ReflectUtils.safeFindClass("com.hihonor.android.magicx.media.audio.interfaces.HnEarReturnClient$ParameName");
            Object objNewProxyInstance = Proxy.newProxyInstance(clsSafeFindClass.getClassLoader(), new Class[]{clsSafeFindClass}, this.mAudioServiceCallbackImpl);
            Object objNewInstance = this.mHnAudioClientClass.getConstructor(Context.class, clsSafeFindClass).newInstance(this.mContext, objNewProxyInstance);
            this.mHnAudioClient = objNewInstance;
            ReflectUtils.safeCallMethod(this.mHnAudioClientClass, objNewInstance, "initialize", new Class[0], new Object[0]);
            this.mInitialized = true;
            Logging.m87208d(str, "HnAudioClient initialize success");
        } catch (Throwable unused) {
            Logging.m87209e(TAG, "HnAudioClient initialize failed");
        }
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.IHardwareEarMonitor
    public boolean isHardwareEarMonitorSupported() {
        try {
            boolean zBooleanValue = ((Boolean) ReflectUtils.safeCallMethod(this.mHnAudioClientClass, this.mHnAudioClient, "isDeviceSupported", new Class[]{Context.class}, new Object[]{this.mContext})).booleanValue();
            String str = TAG;
            StringBuilder sb = new StringBuilder("earMonitor is");
            sb.append(zBooleanValue ? MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR : "not ");
            sb.append("supported and bind service ");
            sb.append(this.mBindServiceSuccess ? "success" : "failed");
            Logging.m87208d(str, sb.toString());
            return zBooleanValue && this.mBindServiceSuccess;
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
            Class<?> cls = this.mHnEarReturnClientClass;
            Object obj = this.mHnEarReturnClient;
            Class<?> cls2 = this.mParamNameClass;
            int iIntValue = ((Integer) ReflectUtils.safeCallMethod(cls, obj, "setParameter", new Class[]{cls2, Integer.TYPE}, new Object[]{cls2.getEnumConstants()[1], Integer.valueOf(iMax)})).intValue();
            if (iIntValue == 0) {
                return 0;
            }
            Logging.m87209e(str, "setHardwareEarMonitorVolume failed ret " + iIntValue);
            return -1;
        } catch (Throwable th) {
            Logging.m87210e(TAG, "setHardwareEarMonitorVolume failed ", th);
            return -1;
        }
    }
}
