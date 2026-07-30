package com.p074ss.bytertc.audio.device.webrtc;

import android.os.Build;
import android.util.Log;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import com.cosmos.photon.push.thirdparty.ThirdPushManager;
import com.p074ss.bytertc.audio.device.base.ManufacturerChecker;
import com.p074ss.bytertc.audio.device.hwearback.HardwareEarbackPackageChecker;
import com.p074ss.bytertc.audio.device.hwearback.HnEarback;
import com.p074ss.bytertc.audio.device.hwearback.HwEarback;
import com.p074ss.bytertc.audio.device.hwearback.IHardWareEarback;
import com.p074ss.bytertc.audio.device.hwearback.VivoEarback;
import com.p074ss.bytertc.audio.device.hwearback.XMEarback;
import com.p074ss.bytertc.audio.device.hwearback.ovm.OVMEarback;

/* JADX INFO: loaded from: classes11.dex */
public class WebRtcAudioEarBack {
    private WebRtcAudioManager audioManager;
    IHardWareEarback hardWareEarback;
    private int curVolume = -1;
    private int curEffect = -1;
    private int curEq = -1;

    public WebRtcAudioEarBack(WebRtcAudioManager webRtcAudioManager) {
        this.audioManager = webRtcAudioManager;
    }

    private IHardWareEarback createHWEarback() {
        if (HardwareEarbackPackageChecker.isHnEarbackPackageSupported()) {
            HnEarback hnEarback = new HnEarback(this);
            Log.e("HardWareEarback", "Honor");
            return hnEarback;
        }
        if (!HardwareEarbackPackageChecker.isHwEarbackPackageSupported()) {
            return null;
        }
        HwEarback hwEarback = new HwEarback(this);
        Log.e("HardWareEarback", ThirdPushManager.VENDOR_TYPE_HUAWEI);
        return hwEarback;
    }

    public void ByteAudioEarBackEffect(int i) {
        try {
            this.curEffect = i;
            IHardWareEarback iHardWareEarback = this.hardWareEarback;
            if (iHardWareEarback != null) {
                iHardWareEarback.setEffect(i);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            RXLogging.m5743e("WebRtcAudioEarBack", "HW hardware earmonitor set effect is not support", th);
        }
    }

    public int ByteAudioEarBackEnable(boolean z) {
        int i = -1;
        try {
            IHardWareEarback iHardWareEarback = this.hardWareEarback;
            if (iHardWareEarback == null) {
                return -1;
            }
            if (!z) {
                return iHardWareEarback.close();
            }
            int iOpen = iHardWareEarback.open();
            try {
                int i2 = this.curVolume;
                if (i2 != -1) {
                    ByteAudioEarBackSetVolume(i2);
                }
                int i3 = this.curEq;
                if (i3 != -1) {
                    ByteAudioEarBackEqualizer(i3);
                }
                int i4 = this.curEffect;
                if (i4 != -1) {
                    ByteAudioEarBackEffect(i4);
                }
                return iOpen;
            } catch (Throwable th) {
                th = th;
                i = iOpen;
                th.printStackTrace();
                RXLogging.m5743e("WebRtcAudioEarBack", "HW hardware earmonitor enable earback is not support", th);
                return i;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void ByteAudioEarBackEqualizer(int i) {
        try {
            this.curEq = i;
            IHardWareEarback iHardWareEarback = this.hardWareEarback;
            if (iHardWareEarback != null) {
                iHardWareEarback.setEqualizer(i);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            RXLogging.m5743e("WebRtcAudioEarBack", "HW hardware earmonitor set eq is not support", th);
        }
    }

    public int ByteAudioEarBackGetLatency() {
        try {
            IHardWareEarback iHardWareEarback = this.hardWareEarback;
            if (iHardWareEarback != null) {
                return iHardWareEarback.getLatency();
            }
            return -1;
        } catch (Throwable th) {
            th.printStackTrace();
            RXLogging.m5743e("WebRtcAudioEarBack", "HW hardware earmonitor get latency is not support", th);
            return -1;
        }
    }

    public void ByteAudioEarBackInit() {
        if (this.hardWareEarback == null) {
            ManufacturerChecker.Type manufacturerType = ManufacturerChecker.getManufacturerType(Build.BRAND);
            if (manufacturerType == ManufacturerChecker.Type.HW || manufacturerType == ManufacturerChecker.Type.HR) {
                this.hardWareEarback = createHWEarback();
            }
            if (Build.VERSION.SDK_INT >= 33 && (manufacturerType == ManufacturerChecker.Type.OP || manufacturerType == ManufacturerChecker.Type.XM || manufacturerType == ManufacturerChecker.Type.RM)) {
                this.hardWareEarback = new OVMEarback(ContextUtils.getApplicationContext(), this);
            } else if (manufacturerType == ManufacturerChecker.Type.VO) {
                this.hardWareEarback = new VivoEarback(this);
            } else if (manufacturerType == ManufacturerChecker.Type.XM) {
                this.hardWareEarback = new XMEarback(this);
            }
        }
        IHardWareEarback iHardWareEarback = this.hardWareEarback;
        if (iHardWareEarback != null) {
            iHardWareEarback.init();
        } else {
            onHardwareEarbackSupported(false);
        }
    }

    public void ByteAudioEarBackRelease() {
        IHardWareEarback iHardWareEarback = this.hardWareEarback;
        if (iHardWareEarback != null) {
            iHardWareEarback.release();
            onHardwareEarbackReleased(true);
        }
    }

    public int ByteAudioEarBackSetVolume(int i) {
        try {
            this.curVolume = i;
            IHardWareEarback iHardWareEarback = this.hardWareEarback;
            if (iHardWareEarback != null) {
                return iHardWareEarback.setVolume(i);
            }
            return -1;
        } catch (Throwable th) {
            th.printStackTrace();
            RXLogging.m5743e("WebRtcAudioEarBack", "HW hardware earmonitor set volume is not support", th);
            return -1;
        }
    }

    public boolean ByteAudioEarBackSupport() {
        try {
            IHardWareEarback iHardWareEarback = this.hardWareEarback;
            if (iHardWareEarback != null) {
                return iHardWareEarback.isSupport();
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            RXLogging.m5743e("WebRtcAudioEarBack", "HW hardware earmonitor get earback is not support", th);
            return false;
        }
    }

    public void onEvent(int i, int i2) {
        IHardWareEarback iHardWareEarback = this.hardWareEarback;
        if (iHardWareEarback != null) {
            iHardWareEarback.onEvent(i, i2);
        }
    }

    public void onHardwareEarbackReleased(boolean z) {
        WebRtcAudioManager webRtcAudioManager = this.audioManager;
        if (webRtcAudioManager != null) {
            webRtcAudioManager.onHardwareEarbackReleased(z);
        }
    }

    public void onHardwareEarbackSupportParamsGet(String str) {
        WebRtcAudioManager webRtcAudioManager = this.audioManager;
        if (webRtcAudioManager != null) {
            if (str == null) {
                str = "";
            }
            webRtcAudioManager.onHardwareEarbackSupportParamsGet(str);
        }
    }

    public void onHardwareEarbackSupported(boolean z) {
        WebRtcAudioManager webRtcAudioManager = this.audioManager;
        if (webRtcAudioManager != null) {
            webRtcAudioManager.onHardwareEarbackSupported(z);
        }
    }
}
