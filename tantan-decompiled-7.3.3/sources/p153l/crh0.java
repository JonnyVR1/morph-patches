package p153l;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.p074ss.android.ttvecamera.C13496f;
import com.p074ss.android.ttvecamera.C13504g;
import com.p074ss.android.ttvecamera.TEFrameRateRange;
import com.p074ss.bytertc.audio.device.webrtc.WebRtcAudioTrack;
import java.text.DecimalFormat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
@RequiresApi(api = 21)
public class crh0 {

    /* JADX INFO: renamed from: b */
    protected static String f83326b = "-1";

    /* JADX INFO: renamed from: c */
    public static int f83327c = 1;

    /* JADX INFO: renamed from: a */
    protected Context f83328a;

    public crh0(Context context) {
        this.f83328a = context;
    }

    /* JADX INFO: renamed from: c */
    public static crh0 m112051c(Context context, int i) {
        crh0 crh0Var;
        C13504g.m82001e("TECameraHardware2Proxy", "getDeviceProxy, cameraType: " + i);
        f83327c = i;
        synchronized (crh0.class) {
            try {
                if (i == 6) {
                    crh0Var = new yqh0(context);
                } else if (arh0.m99705d()) {
                    crh0Var = new lrh0(context);
                } else if (arh0.m99704c()) {
                    crh0Var = new krh0(context);
                } else if (arh0.m99703b()) {
                    crh0Var = new drh0(context);
                } else if (arh0.m99702a()) {
                    crh0Var = new zqh0(context);
                } else {
                    C13504g.m81998b("TECameraHardware2Proxy", "Unknown platform");
                    crh0Var = new crh0(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return crh0Var;
    }

    /* JADX INFO: renamed from: a */
    public int m112052a(@NonNull CameraCharacteristics cameraCharacteristics, @NonNull CaptureRequest.Builder builder, boolean z) {
        if (cameraCharacteristics == null || builder == null) {
            return -100;
        }
        if (!z) {
            C13504g.m82001e("TECameraHardware2Proxy", "configStabilization not toggle");
            builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
            return 0;
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i : iArr) {
                C13504g.m82001e("TECameraHardware2Proxy", "EIS mode: " + i);
                if (i == 1) {
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                    builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
                    C13504g.m82001e("TECameraHardware2Proxy", "Enable EIS");
                    return 0;
                }
            }
        } else {
            C13504g.m82001e("TECameraHardware2Proxy", "Don't supported EIS");
        }
        int[] iArr2 = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr2 == null) {
            C13504g.m82001e("TECameraHardware2Proxy", "Don't supported OIS");
            return WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR;
        }
        for (int i2 : iArr2) {
            C13504g.m82001e("TECameraHardware2Proxy", "OIS mode: " + i2);
            if (i2 == 1) {
                builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                C13504g.m82001e("TECameraHardware2Proxy", "Enable OIS");
                return 0;
            }
        }
        return WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR;
    }

    /* JADX INFO: renamed from: b */
    public void mo112053b(int i, CameraManager cameraManager) {
        try {
            f83326b = m112059i(cameraManager.getCameraIdList(), cameraManager);
            C13504g.m82001e("TECameraHardware2Proxy", "fillWideCameraID mWideCameraID = " + f83326b);
        } catch (CameraAccessException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d */
    public TEFrameRateRange m112054d(CameraCharacteristics cameraCharacteristics, int i, int i2, int i3, int i4) {
        Range[] rangeArr;
        TEFrameRateRange tEFrameRateRange = new TEFrameRateRange(i, i2);
        if (cameraCharacteristics == null || (rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES)) == null) {
            return tEFrameRateRange;
        }
        ArrayList arrayList = new ArrayList(rangeArr.length);
        int i5 = tEFrameRateRange.fpsUnitFactor;
        int i6 = 0;
        for (Range range : rangeArr) {
            int[] iArr = {((Integer) range.getLower()).intValue() * i5, ((Integer) range.getUpper()).intValue() * i5};
            arrayList.add(iArr);
            int i7 = iArr[1];
            if (i6 < i7) {
                i6 = i7;
            }
        }
        hrh0.m136853b("te_record_camera_max_fps", i6);
        int[] iArrM81900s = C13496f.m81900s(i3, i4, tEFrameRateRange.m81719b(), arrayList);
        tEFrameRateRange.min = iArrM81900s[0];
        tEFrameRateRange.max = iArrM81900s[1];
        return tEFrameRateRange;
    }

    /* JADX INFO: renamed from: e */
    public float m112055e(@NonNull CameraCharacteristics cameraCharacteristics, int i, float f) {
        Float f2 = (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f2 == null) {
            return 0.0f;
        }
        float fFloatValue = f2.floatValue();
        if (f == -1.0f) {
            return i != 6 ? fFloatValue / 2.0f : fFloatValue;
        }
        return fFloatValue * f;
    }

    /* JADX INFO: renamed from: f */
    public float m112056f(@NonNull CameraCharacteristics cameraCharacteristics) {
        float fFloatValue = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        try {
            return Float.valueOf(new DecimalFormat("0.00").format(((rect.width() - ((int) (rect.width() / fFloatValue))) / fFloatValue) / rect.width()).trim()).floatValue();
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0.01f;
        }
    }

    /* JADX INFO: renamed from: g */
    public String m112057g(String[] strArr, CameraManager cameraManager) {
        String str = "0";
        try {
            float f = Float.MIN_VALUE;
            for (String str2 : strArr) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str2);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (num == null || num.intValue() != 0) {
                    float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                    if (fArr == null || fArr.length == 0) {
                        fArr = new float[]{0.0f};
                    }
                    float f2 = fArr[0];
                    if (f2 > f) {
                        str = str2;
                        f = f2;
                    }
                }
            }
            return str;
        } catch (CameraAccessException e) {
            e = e;
            e.printStackTrace();
            return str;
        } catch (IllegalArgumentException e2) {
            e = e2;
            e.printStackTrace();
            return str;
        }
    }

    /* JADX INFO: renamed from: h */
    public String mo112058h() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        CameraManager cameraManager = (CameraManager) this.f83328a.getSystemService("camera");
        try {
            String strM112059i = m112059i(cameraManager.getCameraIdList(), cameraManager);
            C13504g.m82001e("TECameraHardware2Proxy", "getWideAngleID, cost time = " + (System.currentTimeMillis() - jCurrentTimeMillis));
            return strM112059i;
        } catch (Throwable th) {
            C13504g.m81999c("TECameraHardware2Proxy", "exception occurs when getWideAngleID", th);
            return "0";
        }
    }

    /* JADX INFO: renamed from: i */
    public String m112059i(String[] strArr, CameraManager cameraManager) {
        String str = "0";
        try {
            float f = Float.MAX_VALUE;
            for (String str2 : strArr) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str2);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (num == null || num.intValue() != 0) {
                    float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                    float f2 = (fArr == null || fArr.length <= 0) ? -1.0f : fArr[0];
                    if (f2 != -1.0f && f2 <= f) {
                        str = str2;
                        f = f2;
                    }
                }
            }
            return str;
        } catch (Throwable th) {
            C13504g.m81999c("TECameraHardware2Proxy", "exception occurs when getWideAngleID: ", th);
            return str;
        }
    }

    /* JADX INFO: renamed from: j */
    public Range<Float> m112060j(@NonNull CameraCharacteristics cameraCharacteristics) {
        Range<Float> range;
        return (Build.VERSION.SDK_INT < 30 || (range = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE)) == null) ? new Range<>(Float.valueOf(0.0f), (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)) : range;
    }

    /* JADX INFO: renamed from: k */
    public boolean m112061k() {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public boolean m112062l(@NonNull CameraCharacteristics cameraCharacteristics) {
        int[] iArr;
        return (cameraCharacteristics == null || (iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) == null || iArr.length <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public boolean m112063m(@NonNull CameraCharacteristics cameraCharacteristics) {
        return cameraCharacteristics != null && ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() >= 1;
    }

    /* JADX INFO: renamed from: n */
    public boolean m112064n(CameraCharacteristics cameraCharacteristics, int i) {
        if (cameraCharacteristics == null) {
            return false;
        }
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        int iIntValue = num != null ? num.intValue() : -1;
        if (iIntValue < 0 || iIntValue > 4) {
            C13504g.m81998b("TECameraHardware2Proxy", "Invalid hardware level = " + iIntValue);
            return false;
        }
        int i2 = arh0.f72946b[iIntValue];
        hrh0.m136853b("te_record_camera_hardware_level", i2);
        if (i2 >= i) {
            C13504g.m82001e("TECameraHardware2Proxy", "Camera hardware level supported, deviceLevel = " + i2 + ", require = " + i);
            return true;
        }
        C13504g.m81998b("TECameraHardware2Proxy", "Camera hardware level not supported, deviceLevel = " + i2 + ", require = " + i);
        return false;
    }

    /* JADX INFO: renamed from: o */
    public boolean m112065o(@NonNull CameraCharacteristics cameraCharacteristics) {
        if (cameraCharacteristics == null) {
            return false;
        }
        for (int i : (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES)) {
            if (i == 11) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public boolean m112066p(@NonNull CameraCharacteristics cameraCharacteristics) {
        return cameraCharacteristics != null && ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() >= 1;
    }

    /* JADX INFO: renamed from: q */
    public boolean m112067q(@NonNull CameraCharacteristics cameraCharacteristics) {
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX INFO: renamed from: r */
    public boolean m112068r(@NonNull CameraCharacteristics cameraCharacteristics) {
        boolean zM112062l = m112062l(cameraCharacteristics);
        ?? r0 = zM112062l;
        if (m112067q(cameraCharacteristics)) {
            r0 = (zM112062l ? 1 : 0) | 2;
        }
        C13504g.m82001e("TECameraHardware2Proxy", "Stabilization type: " + Integer.toBinaryString(r0));
        hrh0.m136853b("te_record_camera_stabilization", (long) r0);
        return r0 > 0;
    }

    /* JADX INFO: renamed from: s */
    public boolean mo112069s() {
        return !mo112058h().equals("0");
    }

    /* JADX INFO: renamed from: t */
    public boolean m112070t(CameraCharacteristics cameraCharacteristics) {
        return ((Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue();
    }
}
