package com.p074ss.bytertc.base.media.camera;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.camera2.CameraManager;
import android.hardware.usb.UsbDevice;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import com.p051p1.mobile.putong.data.Device;
import p153l.jj5;

/* JADX INFO: loaded from: classes11.dex */
public class VideoDeviceMonitorAndroid {
    private static final String TAG = "VideoDeviceMonitorAndroid";
    private CameraManager.AvailabilityCallback mAvailabilityCallback;
    private long mNativeHandle;
    private HandlerThread mCameraAvailabilityThread = null;
    private Handler mCameraAvailabilityHandler = null;
    private final BroadcastReceiver mUsbReceiver = new BroadcastReceiver() { // from class: com.ss.bytertc.base.media.camera.VideoDeviceMonitorAndroid.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            UsbDevice usbDevice = (UsbDevice) intent.getParcelableExtra(Device.TYPE);
            if ("android.hardware.usb.action.USB_DEVICE_ATTACHED".equals(action)) {
                VideoDeviceMonitorAndroid.this.processorAttached(usbDevice);
            } else if ("android.hardware.usb.action.USB_DEVICE_DETACHED".equals(action)) {
                VideoDeviceMonitorAndroid.this.processorDetached(usbDevice);
            }
        }
    };
    private final Context mContext = ContextUtils.getApplicationContext();

    @CalledByNative
    public VideoDeviceMonitorAndroid(long j) {
        this.mAvailabilityCallback = null;
        this.mNativeHandle = j;
        this.mAvailabilityCallback = new CameraManager.AvailabilityCallback() { // from class: com.ss.bytertc.base.media.camera.VideoDeviceMonitorAndroid.2
            @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
            public void onCameraAccessPrioritiesChanged() {
                super.onCameraAccessPrioritiesChanged();
            }

            @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
            public void onCameraAvailable(@NonNull String str) {
                super.onCameraAvailable(str);
                VideoDeviceMonitorAndroid.nativeOnCameraAvailabilityChanged(VideoDeviceMonitorAndroid.this.mNativeHandle, str, true);
            }

            @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
            public void onCameraUnavailable(@NonNull String str) {
                super.onCameraUnavailable(str);
                VideoDeviceMonitorAndroid.nativeOnCameraAvailabilityChanged(VideoDeviceMonitorAndroid.this.mNativeHandle, str, false);
            }

            @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
            public void onPhysicalCameraAvailable(@NonNull String str, @NonNull String str2) {
                super.onPhysicalCameraAvailable(str, str2);
            }

            @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
            public void onPhysicalCameraUnavailable(@NonNull String str, @NonNull String str2) {
                super.onPhysicalCameraUnavailable(str, str2);
            }
        };
    }

    private Boolean isUsbCamera(UsbDevice usbDevice) {
        RXLogging.m5746w(TAG, "isUsbCamera");
        Boolean bool = Boolean.FALSE;
        if (usbDevice.getDeviceClass() == 14) {
            bool = Boolean.TRUE;
        } else if (usbDevice.getDeviceClass() == 239) {
            for (int i = 0; i < usbDevice.getInterfaceCount(); i++) {
                if (usbDevice.getInterface(i).getInterfaceClass() == 14) {
                    bool = Boolean.TRUE;
                    break;
                }
            }
        }
        RXLogging.m5746w(TAG, "DeviceClass: " + usbDevice.getDeviceClass() + " result: " + bool);
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnCameraAvailabilityChanged(long j, String str, boolean z);

    private static native void nativeOnUsbCameraChanged(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public void processorAttached(UsbDevice usbDevice) {
        if (isUsbCamera(usbDevice).booleanValue()) {
            nativeOnUsbCameraChanged(this.mNativeHandle, true);
        } else {
            RXLogging.m5746w(TAG, "processorAttached, is not Usb camera");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processorDetached(UsbDevice usbDevice) {
        if (isUsbCamera(usbDevice).booleanValue()) {
            nativeOnUsbCameraChanged(this.mNativeHandle, false);
        } else {
            RXLogging.m5746w(TAG, "processorDetached, is not Usb camera");
        }
    }

    @CalledByNative
    public void start() {
        RXLogging.m5746w(TAG, "registerUsbAction");
        if (this.mUsbReceiver == null || this.mContext == null) {
            RXLogging.m5746w(TAG, "registerUsbAction fail");
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
        jj5.m145018l(this.mContext, this.mUsbReceiver, intentFilter);
        CameraManager cameraManager = (CameraManager) this.mContext.getSystemService("camera");
        try {
            if (this.mAvailabilityCallback != null) {
                RXLogging.m5746w(TAG, "registerAvailabilityCallback");
                HandlerThread handlerThread = new HandlerThread("CameraAvailabilityThread");
                this.mCameraAvailabilityThread = handlerThread;
                handlerThread.start();
                Handler handler = new Handler(this.mCameraAvailabilityThread.getLooper());
                this.mCameraAvailabilityHandler = handler;
                cameraManager.registerAvailabilityCallback(this.mAvailabilityCallback, handler);
            }
        } catch (Exception e) {
            RXLogging.m5746w(TAG, "registerAvailabilityCallback fail");
            e.printStackTrace();
        }
    }

    @CalledByNative
    public void stop() {
        Context context;
        RXLogging.m5746w(TAG, "unregisterUsbAction");
        BroadcastReceiver broadcastReceiver = this.mUsbReceiver;
        if (broadcastReceiver == null || (context = this.mContext) == null) {
            RXLogging.m5746w(TAG, "unregisterUsbAction fail");
            return;
        }
        context.unregisterReceiver(broadcastReceiver);
        CameraManager cameraManager = (CameraManager) this.mContext.getSystemService("camera");
        try {
            if (this.mAvailabilityCallback != null) {
                RXLogging.m5746w(TAG, "unregisterAvailabilityCallback");
                cameraManager.unregisterAvailabilityCallback(this.mAvailabilityCallback);
            }
            HandlerThread handlerThread = this.mCameraAvailabilityThread;
            if (handlerThread != null) {
                handlerThread.quit();
                this.mCameraAvailabilityThread = null;
            }
            if (this.mCameraAvailabilityHandler != null) {
                this.mCameraAvailabilityHandler = null;
            }
        } catch (Exception e) {
            RXLogging.m5746w(TAG, "unregisterAvailabilityCallback fail");
            e.printStackTrace();
        }
    }
}
