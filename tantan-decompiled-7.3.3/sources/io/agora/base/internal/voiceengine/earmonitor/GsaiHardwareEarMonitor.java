package io.agora.base.internal.voiceengine.earmonitor;

import android.content.Context;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ReflectUtils;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GsaiHardwareEarMonitor implements IHardwareEarMonitor {
    private String TAG;

    @Nullable
    private HardwareEarMonitorListener mListener;

    @Nullable
    private Class<?> mMediaClientClass;

    @Nullable
    private Object mMediaClient = null;
    private volatile boolean mInitialized = false;
    private volatile boolean mEarMonitorEnabled = false;

    @Nullable
    private Context mContext = ContextUtils.getApplicationContext();

    public GsaiHardwareEarMonitor(HardwareEarMonitorListener hardwareEarMonitorListener, String str) {
        this.TAG = str;
        this.mListener = hardwareEarMonitorListener;
        Logging.m88097d(str, ">>ctor");
    }

    public static boolean hasEarMonitorClass() {
        return ReflectUtils.safeFindClass("com.itgsa.opensdk.media.MediaClient") != null;
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.IHardwareEarMonitor
    public void destroy() {
        Logging.m88097d(this.TAG, "karaoke kit destroy");
        this.mListener = null;
        if (this.mInitialized) {
            this.mInitialized = false;
            this.mEarMonitorEnabled = false;
            enableHardwareEarMonitor(false);
        }
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.IHardwareEarMonitor
    public int enableHardwareEarMonitor(boolean z) {
        Logging.m88097d(this.TAG, ">>enableHardwareEarMonitor " + z);
        Class<?> cls = this.mMediaClientClass;
        Class cls2 = Integer.TYPE;
        try {
            if (z) {
                ReflectUtils.safeCallMethod(cls, this.mMediaClient, "setMixerSoundType", new Class[]{cls2}, new Object[]{Integer.valueOf(getMixerSoundType())});
                ReflectUtils.safeCallMethod(this.mMediaClientClass, this.mMediaClient, "setPlayFeedbackParam", new Class[]{cls2}, new Object[]{1});
                ReflectUtils.safeCallMethod(this.mMediaClientClass, this.mMediaClient, "openKTVDevice", new Class[0], new Object[0]);
            } else {
                ReflectUtils.safeCallMethod(cls, this.mMediaClient, "setPlayFeedbackParam", new Class[]{cls2}, new Object[]{0});
                ReflectUtils.safeCallMethod(this.mMediaClientClass, this.mMediaClient, "closeKTVDevice", new Class[0], new Object[0]);
            }
            this.mEarMonitorEnabled = z;
            return 0;
        } catch (Throwable th) {
            Logging.m88099e(this.TAG, "enableHardwareEarMonitor failed ", th);
            return -1;
        }
    }

    public abstract int getMixerSoundType();

    @Override // io.agora.base.internal.voiceengine.earmonitor.IHardwareEarMonitor
    public void initialize() {
        Logging.m88097d(this.TAG, "HnAudioClient initialize");
        if (this.mContext == null) {
            Logging.m88098e(this.TAG, "mContext is null!");
            return;
        }
        if (this.mInitialized) {
            Logging.m88102w(this.TAG, "already initialized, ignore");
            return;
        }
        try {
            Class<?> clsSafeFindClass = ReflectUtils.safeFindClass("com.itgsa.opensdk.media.MediaClient");
            this.mMediaClientClass = clsSafeFindClass;
            this.mMediaClient = ReflectUtils.safeCallMethod(clsSafeFindClass, null, "initialize", new Class[]{Context.class}, new Object[]{this.mContext});
            this.mInitialized = true;
            HardwareEarMonitorListener hardwareEarMonitorListener = this.mListener;
            if (hardwareEarMonitorListener != null) {
                hardwareEarMonitorListener.onInitResult(0);
                this.mListener.onHardwareEarMonitorSupported(isHardwareEarMonitorSupported());
            }
            Logging.m88097d(this.TAG, "MediaClient initialize success");
        } catch (Throwable unused) {
            Logging.m88097d(this.TAG, "MediaClient initialize failed");
        }
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.IHardwareEarMonitor
    public boolean isHardwareEarMonitorSupported() {
        try {
            boolean zBooleanValue = ((Boolean) ReflectUtils.safeCallMethod(this.mMediaClientClass, this.mMediaClient, "isSupported", new Class[0], new Object[0])).booleanValue();
            String str = this.TAG;
            StringBuilder sb = new StringBuilder("Karaoke earMonitor is");
            sb.append(zBooleanValue ? MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR : " not ");
            sb.append("support ");
            Logging.m88097d(str, sb.toString());
            return zBooleanValue;
        } catch (Throwable th) {
            Logging.m88099e(this.TAG, "isHardwareEarMonitorSupported false ", th);
            return false;
        }
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.IHardwareEarMonitor
    public int setHardwareEarMonitorVolume(int i) {
        if (!this.mEarMonitorEnabled) {
            return -7;
        }
        int i2 = (int) (((double) i) * 0.15d);
        Logging.m88097d(this.TAG, ">>setHardwareEarMonitorVolume " + i2);
        try {
            ReflectUtils.safeCallMethod(this.mMediaClientClass, this.mMediaClient, "setMicVolParam", new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(i2)});
            return 0;
        } catch (Throwable th) {
            Logging.m88099e(this.TAG, "setHardwareEarMonitorVolume failed ", th);
            return -1;
        }
    }
}
