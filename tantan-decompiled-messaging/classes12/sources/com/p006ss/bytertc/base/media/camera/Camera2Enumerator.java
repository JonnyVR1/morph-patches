package com.p006ss.bytertc.base.media.camera;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.SystemClock;
import android.util.AndroidException;
import android.util.Range;
import androidx.annotation.Nullable;
import com.bytedance.realx.base.RXLogging;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import com.p006ss.bytertc.base.media.Size;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
@TargetApi(21)
public class Camera2Enumerator implements CameraEnumerator {
    private static final double NANO_SECONDS_PER_SECOND = 1.0E9d;
    private static final String TAG = "Camera2Enumerator";
    private static final Map<String, List<CameraEnumerationAndroid.CaptureFormat>> cachedSupportedFormats = new HashMap();

    @Nullable
    final CameraManager cameraManager;
    final Context context;

    public Camera2Enumerator(Context context) {
        this.context = context;
        this.cameraManager = (CameraManager) context.getSystemService("camera");
    }

    public static List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates(Range<Integer>[] rangeArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (Range<Integer> range : rangeArr) {
            arrayList.add(new CameraEnumerationAndroid.CaptureFormat.FramerateRange(((Integer) range.getLower()).intValue() * i, ((Integer) range.getUpper()).intValue() * i));
        }
        return arrayList;
    }

    private static List<Size> convertSizes(android.util.Size[] sizeArr) {
        ArrayList arrayList = new ArrayList();
        for (android.util.Size size : sizeArr) {
            arrayList.add(new Size(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    @Nullable
    private CameraCharacteristics getCameraCharacteristics(String str) {
        try {
            CameraManager cameraManager = this.cameraManager;
            if (cameraManager != null) {
                return cameraManager.getCameraCharacteristics(str);
            }
            return null;
        } catch (AndroidException e) {
            RXLogging.e(TAG, "Camera access exception: " + e);
            return null;
        }
    }

    public static int getFpsUnitFactor(Range<Integer>[] rangeArr) {
        if (rangeArr.length != 0 && ((Integer) rangeArr[0].getUpper()).intValue() >= 1000) {
            return 1;
        }
        return MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO;
    }

    public static List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(CameraManager cameraManager, String str) {
        long outputMinFrameDuration;
        Map<String, List<CameraEnumerationAndroid.CaptureFormat>> map = cachedSupportedFormats;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    return map.get(str);
                }
                RXLogging.i(TAG, "Get supported formats for camera index " + str + ".");
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                    StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                    Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                    List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> listConvertFramerates = convertFramerates(rangeArr, getFpsUnitFactor(rangeArr));
                    List<Size> supportedSizes = getSupportedSizes(cameraCharacteristics);
                    Iterator<CameraEnumerationAndroid.CaptureFormat.FramerateRange> it = listConvertFramerates.iterator();
                    int iMax = 0;
                    while (it.hasNext()) {
                        iMax = Math.max(iMax, it.next().max);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Size size : supportedSizes) {
                        try {
                            outputMinFrameDuration = streamConfigurationMap.getOutputMinFrameDuration(SurfaceTexture.class, new android.util.Size(size.width, size.height));
                        } catch (Exception unused) {
                            outputMinFrameDuration = 0;
                        }
                        int iRound = outputMinFrameDuration == 0 ? iMax : ((int) Math.round(NANO_SECONDS_PER_SECOND / outputMinFrameDuration)) * MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO;
                        arrayList.add(new CameraEnumerationAndroid.CaptureFormat(size.width, size.height, 0, iRound));
                        RXLogging.i(TAG, "Format: " + size.width + "x" + size.height + "@" + iRound);
                    }
                    cachedSupportedFormats.put(str, arrayList);
                    RXLogging.i(TAG, "Get supported formats for camera index " + str + " done. Time spent: " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms.");
                    return arrayList;
                } catch (Exception e) {
                    RXLogging.e(TAG, "getCameraCharacteristics(): " + e);
                    return new ArrayList();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static List<Size> getSupportedSizes(CameraCharacteristics cameraCharacteristics) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        ((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).getClass();
        android.util.Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        if (outputSizes == null) {
            return null;
        }
        return convertSizes(outputSizes);
    }

    public static boolean isSupported(Context context) {
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        try {
            for (String str : cameraManager.getCameraIdList()) {
                if (((Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2) {
                    return false;
                }
            }
            return true;
        } catch (AndroidException e) {
            RXLogging.e(TAG, "Camera access exception: " + e);
            return false;
        }
    }

    @Override // com.p006ss.bytertc.base.media.camera.CameraEnumerator
    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        return new Camera2Capturer(this.context, str, cameraEventsHandler);
    }

    @Override // com.p006ss.bytertc.base.media.camera.CameraEnumerator
    public String[] getDeviceNames() {
        try {
            CameraManager cameraManager = this.cameraManager;
            if (cameraManager != null) {
                return cameraManager.getCameraIdList();
            }
        } catch (AndroidException e) {
            RXLogging.e(TAG, "Camera access exception: " + e);
        }
        return new String[0];
    }

    @Override // com.p006ss.bytertc.base.media.camera.CameraEnumerator
    public int getDeviceOrientation(String str) {
        return ((Integer) getCameraCharacteristics(str).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
    }

    @Override // com.p006ss.bytertc.base.media.camera.CameraEnumerator
    public boolean isBackFacing(String str) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(str);
        return cameraCharacteristics != null && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }

    @Override // com.p006ss.bytertc.base.media.camera.CameraEnumerator
    public boolean isFrontFacing(String str) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(str);
        return cameraCharacteristics != null && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }

    public static List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(Context context, String str) {
        return getSupportedFormats((CameraManager) context.getSystemService("camera"), str);
    }

    @Override // com.p006ss.bytertc.base.media.camera.CameraEnumerator
    public List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String str) {
        return getSupportedFormats(this.context, str);
    }
}
