package com.p069ss.android.ttvecamera;

import android.content.Context;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.bytedance.bpea.basics.Cert;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p069ss.android.ttvecamera.cameracapabilitycollector.TECameraCapabilityCollector;
import com.p069ss.bytertc.audio.device.webrtc.WebRtcAudioRecord;
import com.p069ss.bytertc.audio.device.webrtc.WebRtcAudioTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import p149l.ajh0;
import p149l.cjh0;
import p149l.gjh0;
import p149l.ig3;
import p149l.jih0;
import p149l.kih0;
import p149l.lih0;
import p149l.qkq0;
import p149l.wjh0;

/* JADX INFO: renamed from: com.ss.android.ttvecamera.a */
/* JADX INFO: loaded from: classes11.dex */
public class C13322a extends AbstractC13324c {

    /* JADX INFO: renamed from: A */
    private gjh0 f55402A;

    /* JADX INFO: renamed from: B */
    private String f55403B;

    /* JADX INFO: renamed from: C */
    private int f55404C;

    /* JADX INFO: renamed from: D */
    private List<TEFrameSizei> f55405D;

    /* JADX INFO: renamed from: E */
    private List<TEFrameSizei> f55406E;

    /* JADX INFO: renamed from: F */
    private List<TEFrameSizei> f55407F;

    /* JADX INFO: renamed from: G */
    private List<Integer> f55408G;

    /* JADX INFO: renamed from: H */
    private float f55409H;

    /* JADX INFO: renamed from: I */
    private int f55410I;

    /* JADX INFO: renamed from: J */
    private AtomicBoolean f55411J;

    /* JADX INFO: renamed from: K */
    private long f55412K;

    /* JADX INFO: renamed from: L */
    private int f55413L;

    /* JADX INFO: renamed from: M */
    private boolean f55414M;

    /* JADX INFO: renamed from: y */
    Camera f55415y;

    /* JADX INFO: renamed from: z */
    private Camera.Parameters f55416z;

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.a$a */
    public class a implements Camera.ErrorCallback {
        public a() {
        }

        @Override // android.hardware.Camera.ErrorCallback
        public void onError(int i, Camera camera) {
            String str;
            int i2;
            ajh0.m96973b("te_record_camera_err_ret", i);
            if (i == 100) {
                str = "Camera server died!";
                i2 = -407;
            } else if (i == 2) {
                str = "Camera disconnected: " + i;
                i2 = -409;
            } else if (i != 1) {
                C13341g.m80823j("TECamera1", "Ignore camera error here: " + i);
                return;
            } else {
                str = "Camera unknown error: " + i;
                i2 = -410;
            }
            C13341g.m80815b("TECamera1", str);
            C13322a c13322a = C13322a.this;
            c13322a.mo80581f(c13322a.f55474t);
            C13322a.this.m80667z0();
            C13322a c13322a2 = C13322a.this;
            AbstractC13324c.a aVar = c13322a2.f55458d;
            if (aVar != null) {
                aVar.mo80494b(1, i2, str, c13322a2.f55415y);
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.a$b */
    public class b implements Camera.PictureCallback {
        public b(TECameraSettings.InterfaceC13311l interfaceC13311l) {
        }

        @Override // android.hardware.Camera.PictureCallback
        public void onPictureTaken(byte[] bArr, Camera camera) {
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.a$c */
    public class c implements Camera.PictureCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f55419a;

        public c(long j, TECameraSettings.InterfaceC13311l interfaceC13311l) {
            this.f55419a = j;
        }

        @Override // android.hardware.Camera.PictureCallback
        public void onPictureTaken(byte[] bArr, Camera camera) {
            C13341g.m80818e("TECamera1", "capture data arrive consume: " + (System.currentTimeMillis() - this.f55419a));
            Camera camera2 = C13322a.this.f55415y;
            if (camera2 != null) {
                camera2.stopPreview();
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.a$d */
    public class d implements Camera.AutoFocusCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ TEFocusSettings f55421a;

        public d(TEFocusSettings tEFocusSettings) {
            this.f55421a = tEFocusSettings;
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z, Camera camera) {
            String str;
            TEFocusSettings tEFocusSettings = this.f55421a;
            if (z) {
                str = "Camera Focus Succeed!";
                tEFocusSettings.m80520g().mo80534a(this.f55421a.m80521h(), C13322a.this.f55456b.f55333d, "Camera Focus Succeed!");
            } else {
                str = "Camera Focus Failed!";
                tEFocusSettings.m80520g().mo80534a(-1, C13322a.this.f55456b.f55333d, "Camera Focus Failed!");
            }
            C13341g.m80818e("TECamera1", str);
            if (this.f55421a.m80527n() && z) {
                return;
            }
            try {
                Camera.Parameters parameters = camera.getParameters();
                parameters.setFocusMode("continuous-video");
                camera.setParameters(parameters);
                C13322a c13322a = C13322a.this;
                c13322a.m80574T0(c13322a.f55413L);
            } catch (Exception e) {
                String str2 = "Error: focusAtPoint failed: " + e.toString();
                C13341g.m80815b("TECamera1", str2);
                C13322a c13322a2 = C13322a.this;
                c13322a2.f55458d.mo80495c(1, -411, str2, c13322a2.f55415y);
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.a$e */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f55423a;

        public e(int i) {
            this.f55423a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C13322a.this.mo80562C0(this.f55423a);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.a$f */
    public class f implements Camera.OnZoomChangeListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ TECameraSettings.InterfaceC13315p f55425a;

        public f(TECameraSettings.InterfaceC13315p interfaceC13315p) {
            this.f55425a = interfaceC13315p;
        }

        @Override // android.hardware.Camera.OnZoomChangeListener
        public void onZoomChange(int i, boolean z, Camera camera) {
            TECameraSettings.InterfaceC13315p interfaceC13315p = this.f55425a;
            if (interfaceC13315p != null) {
                interfaceC13315p.onChange(1, i, z);
            }
        }
    }

    private C13322a(Context context, AbstractC13324c.a aVar, Handler handler, AbstractC13324c.d dVar) {
        super(context, aVar, handler, dVar);
        this.f55403B = "";
        this.f55404C = 0;
        this.f55405D = new ArrayList();
        this.f55406E = new ArrayList();
        this.f55407F = new ArrayList();
        this.f55408G = null;
        this.f55409H = 100.0f;
        this.f55410I = 0;
        this.f55411J = new AtomicBoolean(false);
        this.f55412K = 0L;
        this.f55413L = 0;
        this.f55414M = false;
        this.f55456b = new TECameraSettings(context, 1);
        this.f55402A = new gjh0(1);
        this.f55474t = null;
    }

    /* JADX INFO: renamed from: J0 */
    private void m80548J0() {
        if (this.f55456b.f55326Z) {
            try {
                this.f55416z.setRecordingHint(false);
                this.f55415y.setParameters(this.f55416z);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: K0 */
    private void m80549K0() {
        if (this.f55456b.f55326Z) {
            try {
                this.f55416z.setRecordingHint(true);
                this.f55415y.setParameters(this.f55416z);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: L0 */
    public static List<TEFrameRateRange> m80550L0(List<int[]> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int[] iArr : list) {
            arrayList.add(new TEFrameRateRange(iArr[0], iArr[1]));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: M0 */
    public static List<TEFrameSizei> m80551M0(List<Camera.Size> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Camera.Size size : list) {
            arrayList.add(new TEFrameSizei(size.width, size.height));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: N0 */
    public static C13322a m80552N0(Context context, AbstractC13324c.a aVar, Handler handler, AbstractC13324c.d dVar) {
        return new C13322a(context, aVar, handler, dVar);
    }

    /* JADX INFO: renamed from: O0 */
    private int m80553O0(int i) {
        List<Integer> list;
        int size = this.f55408G.size() - 1;
        int i2 = 0;
        while (true) {
            int i3 = size - i2;
            list = this.f55408G;
            if (i3 <= 1) {
                break;
            }
            int i4 = (i2 + size) / 2;
            if (i > list.get(i4).intValue()) {
                i2 = i4;
            } else {
                size = i4;
            }
        }
        return Math.abs(i - list.get(i2).intValue()) > Math.abs(i - this.f55408G.get(size).intValue()) ? size : i2;
    }

    /* JADX INFO: renamed from: P0 */
    private List<TEFrameRateRange> m80554P0() {
        Camera.Parameters parameters = this.f55416z;
        if (parameters == null) {
            return null;
        }
        return m80550L0(parameters.getSupportedPreviewFpsRange());
    }

    /* JADX INFO: renamed from: Q0 */
    private List<TEFrameSizei> m80555Q0() {
        Camera.Parameters parameters = this.f55416z;
        if (parameters == null || parameters.getSupportedVideoSizes() == null) {
            this.f55407F.clear();
            return this.f55407F;
        }
        List<TEFrameSizei> listM80551M0 = m80551M0(this.f55416z.getSupportedVideoSizes());
        this.f55407F = listM80551M0;
        return listM80551M0;
    }

    /* JADX INFO: renamed from: R0 */
    private int m80556R0() {
        int[] iArrM80717s;
        TEFrameSizei tEFrameSizeiMo80503a;
        Camera camera = this.f55415y;
        if (camera == null) {
            C13341g.m80815b("TECamera1", "initCamera: Camera is not opened!");
            this.f55458d.mo80495c(1, WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_ILLEGAL_ARGUMENTS, "initCamera: Camera is not opened!", this.f55415y);
            return WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_ILLEGAL_ARGUMENTS;
        }
        Camera.Parameters parameters = camera.getParameters();
        this.f55416z = parameters;
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (this.f55470p != null) {
            int size = supportedPreviewFpsRange.size();
            ArrayList arrayList = new ArrayList(size);
            boolean z = true;
            int i = 0;
            while (i < size) {
                int[] iArr = supportedPreviewFpsRange.get(i);
                int i2 = iArr[0];
                boolean z2 = i2 >= 1000;
                if (i2 >= 1000) {
                    i2 /= 1000;
                }
                int i3 = iArr[1];
                if (i3 >= 1000) {
                    i3 /= 1000;
                }
                arrayList.add(new int[]{i2, i3});
                i++;
                z = z2;
            }
            iArrM80717s = this.f55470p.mo80502a(arrayList);
            if (z && iArrM80717s != null) {
                iArrM80717s[0] = iArrM80717s[0] * 1000;
                iArrM80717s[1] = iArrM80717s[1] * 1000;
            }
        } else {
            iArrM80717s = null;
        }
        if (iArrM80717s == null) {
            int iM80535a = TEFrameRateRange.m80535a(supportedPreviewFpsRange);
            TECameraSettings tECameraSettings = this.f55456b;
            iArrM80717s = C13333f.m80717s(tECameraSettings.f55315O, tECameraSettings.f55333d, tECameraSettings.f55331c.m80537c(iM80535a), supportedPreviewFpsRange);
            if (iArrM80717s == null && supportedPreviewFpsRange.size() > 0) {
                iArrM80717s = supportedPreviewFpsRange.get(supportedPreviewFpsRange.size() - 1);
            }
        }
        if (iArrM80717s == null) {
            qkq0.m175383a("fps config failed");
            return 0;
        }
        C13341g.m80818e("TECamera1", "Selected FPS Range: " + iArrM80717s[0] + Constants.SEPARATOR_COMMA + iArrM80717s[1]);
        this.f55458d.mo80497e(121, 0, new TEFrameRateRange(iArrM80717s[0], iArrM80717s[1]).toString(), null);
        AbstractC13324c.e eVar = this.f55469o;
        if (eVar != null) {
            TEFrameSizei previewSize = eVar.getPreviewSize(mo80570O());
            TECameraSettings tECameraSettings2 = this.f55456b;
            if (previewSize != null) {
                tECameraSettings2.f55359q = previewSize;
            } else {
                tECameraSettings2.f55359q = C13333f.m80700b(mo80570O(), this.f55456b.f55359q);
            }
        } else {
            this.f55456b.f55359q = C13333f.m80700b(mo80570O(), this.f55456b.f55359q);
        }
        C13341g.m80818e("TECamera1", "Preview Size:" + this.f55456b.f55359q);
        List<Integer> supportedPictureFormats = this.f55416z.getSupportedPictureFormats();
        int i4 = (this.f55456b.f55360q0 && supportedPictureFormats != null && supportedPictureFormats.contains(17)) ? 17 : 256;
        this.f55416z.setPictureFormat(i4);
        if (i4 == 256) {
            this.f55416z.setJpegQuality(100);
        }
        TECameraSettings tECameraSettings3 = this.f55456b;
        if (tECameraSettings3.f55377z) {
            List<TEFrameSizei> listM80551M0 = m80551M0(this.f55416z.getSupportedPictureSizes());
            TEFrameSizei tEFrameSizeiM80504a = this.f55456b.m80504a();
            TECameraSettings tECameraSettings4 = this.f55456b;
            tECameraSettings3.f55361r = C13333f.m80713o(listM80551M0, tEFrameSizeiM80504a, tECameraSettings4.f55367u, tECameraSettings4.f55375y);
        } else {
            if (this.f55468n != null) {
                List<TEFrameSizei> listM80551M1 = m80551M0(this.f55416z.getSupportedPictureSizes());
                ArrayList arrayList2 = new ArrayList();
                if (i4 == 17 && listM80551M1 != null) {
                    for (TEFrameSizei tEFrameSizei : listM80551M1) {
                        if (tEFrameSizei.width % 16 == 0 && tEFrameSizei.height % 16 == 0) {
                            arrayList2.add(tEFrameSizei);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        C13341g.m80815b("TECamera1", "final pic sizes is empty...");
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.addAll(listM80551M1);
                }
                tEFrameSizeiMo80503a = this.f55468n.mo80503a(arrayList2, m80551M0(this.f55416z.getSupportedPreviewSizes()));
            } else {
                tEFrameSizeiMo80503a = null;
            }
            TECameraSettings tECameraSettings5 = this.f55456b;
            if (tEFrameSizeiMo80503a != null) {
                tECameraSettings5.f55361r = tEFrameSizeiMo80503a;
            } else {
                List<TEFrameSizei> listMo80569N = mo80569N();
                TECameraSettings tECameraSettings6 = this.f55456b;
                tECameraSettings5.f55361r = C13333f.m80714p(listMo80569N, tECameraSettings6.f55359q, tECameraSettings6.f55361r);
            }
        }
        TEFrameSizei tEFrameSizei2 = this.f55456b.f55361r;
        if (tEFrameSizei2 != null) {
            this.f55416z.setPictureSize(tEFrameSizei2.width, tEFrameSizei2.height);
            C13341g.m80818e("TECamera1", "Picture Size:" + this.f55456b.f55361r);
        } else {
            C13341g.m80815b("TECamera1", "No closest supported picture size");
        }
        Camera.Parameters parameters2 = this.f55416z;
        TEFrameSizei tEFrameSizei3 = this.f55456b.f55359q;
        parameters2.setPreviewSize(tEFrameSizei3.width, tEFrameSizei3.height);
        Bundle bundle = this.f55456b.f55305E;
        if (bundle == null || !bundle.getBoolean("enable_dim_light_quality") || iArrM80717s[0] <= iArrM80717s[1]) {
            this.f55416z.setPreviewFpsRange(iArrM80717s[0], iArrM80717s[1]);
            if (this.f55456b.f55316P) {
                C13341g.m80814a("TECamera1", "use setRecordingHint");
                this.f55416z.setRecordingHint(true);
            }
        }
        this.f55416z.setWhiteBalance("auto");
        this.f55416z.setSceneMode("auto");
        this.f55416z.setPreviewFormat(this.f55456b.f55339g);
        this.f55416z.setExposureCompensation(this.f55410I);
        if (this.f55456b.f55321U) {
            if (this.f55416z.isVideoStabilizationSupported()) {
                this.f55416z.setVideoStabilization(true);
                ajh0.m96973b("te_record_camera_stabilization", 1L);
                this.f55458d.mo80497e(113, 1, "", this.f55415y);
            } else {
                ajh0.m96973b("te_record_camera_stabilization", 0L);
            }
        }
        gjh0 gjh0Var = this.f55402A;
        TECameraSettings tECameraSettings7 = this.f55456b;
        String strM126504g = gjh0Var.m126504g(tECameraSettings7.f55333d, this.f55416z, tECameraSettings7.f55305E.getBoolean("enableFrontFacingVideoContinueFocus"));
        this.f55403B = strM126504g;
        if (strM126504g != "") {
            this.f55416z.setFocusMode(strM126504g);
        } else {
            C13341g.m80823j("TECamera1", "No Supported Focus Mode for Facing" + this.f55456b.f55333d);
        }
        this.f55456b.f55311K.f55384a = this.f55416z.getMaxExposureCompensation();
        this.f55456b.f55311K.f55386c = this.f55416z.getMinExposureCompensation();
        this.f55456b.f55311K.f55387d = this.f55416z.getExposureCompensationStep();
        this.f55456b.f55311K.f55385b = this.f55416z.getExposureCompensation();
        if (this.f55456b.f55343i) {
            String str = this.f55416z.get("zsl-values");
            if (BLiveOperationTitleShowType.off.equals(this.f55416z.get("zsl")) && str != null && str.contains("on")) {
                this.f55416z.set("zsl", "on");
            }
            boolean zEquals = "on".equals(this.f55416z.get("zsl"));
            this.f55455a = zEquals;
            if (!zEquals && this.f55456b.f55343i && TextUtils.isEmpty(str) && kih0.m146089a() && kih0.m146090b()) {
                String str2 = this.f55416z.get("zsd-mode-values");
                if (BLiveOperationTitleShowType.off.equals(this.f55416z.get("zsd-mode")) && str2 != null && str2.contains("on")) {
                    this.f55416z.set("zsd-mode", "on");
                }
                this.f55455a = "on".equals(this.f55416z.get("zsd-mode"));
            }
        }
        C13341g.m80818e("TECamera1", String.format("%s zsl", this.f55455a ? "Enable" : "Disable"));
        this.f55408G = null;
        if (this.f55416z.isZoomSupported()) {
            this.f55408G = this.f55416z.getZoomRatios();
            this.f55466l = this.f55416z.getMaxZoom();
            Collections.sort(this.f55408G);
            this.f55409H = 100.0f;
        } else {
            C13341g.m80815b("TECamera1", "camera don't support zoom");
        }
        if (this.f55456b.f55305E.containsKey("enableShutterSound")) {
            try {
                this.f55415y.enableShutterSound(this.f55456b.f55305E.getBoolean("enableShutterSound"));
            } catch (Exception e2) {
                C13341g.m80815b("TECamera1", "unsupport enableShutterSound, " + e2.getMessage());
            }
        }
        this.f55415y.setParameters(this.f55416z);
        try {
            this.f55415y.setDisplayOrientation(0);
        } catch (Throwable unused) {
        }
        this.f55414M = false;
        return 0;
    }

    /* JADX INFO: renamed from: S0 */
    private int m80557S0(Cert cert) {
        int iM80556R0;
        wjh0.m203445a("TECamera1-innerOpen");
        int i = 0;
        this.f55410I = 0;
        this.f55474t = cert;
        int i2 = WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_ILLEGAL_ARGUMENTS;
        try {
            TECameraSettings tECameraSettings = this.f55456b;
            if (!tECameraSettings.f55350l0 || TextUtils.isEmpty(tECameraSettings.f55310J)) {
                int numberOfCameras = Camera.getNumberOfCameras();
                this.f55404C = numberOfCameras;
                ajh0.m96973b("te_record_camera_size", numberOfCameras);
                C13341g.m80818e("TECamera1", "innerOpen mNumberOfCameras: " + this.f55404C + ", current mDefaultCameraID:" + this.f55456b.f55337f);
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                for (int i3 = 0; i3 < this.f55404C; i3++) {
                    Camera.getCameraInfo(i3, cameraInfo);
                    C13341g.m80818e("TECamera1", "innerOpen cameraInfo facing: " + cameraInfo.facing + ", mCameraSettings.mFacing:" + this.f55456b.f55333d);
                    int i4 = cameraInfo.facing;
                    TECameraSettings tECameraSettings2 = this.f55456b;
                    if (i4 == tECameraSettings2.f55333d) {
                        tECameraSettings2.f55337f = i3;
                        break;
                    }
                }
            } else {
                Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                int i5 = Integer.parseInt(this.f55456b.f55310J);
                Camera.getCameraInfo(i5, cameraInfo2);
                TECameraSettings tECameraSettings3 = this.f55456b;
                tECameraSettings3.f55337f = i5;
                this.f55463i = tECameraSettings3.f55333d;
            }
            TECameraSettings tECameraSettings4 = this.f55456b;
            int i6 = tECameraSettings4.f55337f;
            if (i6 == -1 && this.f55404C > 0 && tECameraSettings4.f55346j0) {
                C13341g.m80823j("TECamera1", "innerOpen: camera info check error");
                throw new RuntimeException("CameraIDError");
            }
            if (i6 == -1 && this.f55404C > 0 && tECameraSettings4.f55344i0) {
                C13341g.m80823j("TECamera1", "innerOpen: camera info check, set CameraID to 0");
                this.f55456b.f55337f = 0;
            }
            C13341g.m80818e("TECamera1", "innerOpen: " + this.f55456b.f55337f);
            this.f55458d.mo80497e(106, 0, "will start camera1", null);
            wjh0.m203445a("TECamera1-innerOpen-openCamera");
            int i7 = this.f55456b.f55337f;
            if (i7 >= 0) {
                this.f55415y = lih0.m149899c(cert, i7);
            } else {
                this.f55415y = lih0.m149899c(cert, i7);
                this.f55456b.f55333d = 0;
                this.f55463i = 0;
                Camera.CameraInfo cameraInfo3 = new Camera.CameraInfo();
                for (int i8 = 0; i8 < this.f55404C; i8++) {
                    Camera.getCameraInfo(i8, cameraInfo3);
                    if (cameraInfo3.facing == this.f55463i) {
                        this.f55456b.f55337f = i8;
                        break;
                    }
                }
            }
            wjh0.m203446b();
            C13341g.m80818e("TECamera1", "innerOpen mNewFacing: " + this.f55463i);
            C13341g.m80818e("TECamera1", "innerOpen mCameraSettings.mDefaultCameraID: " + this.f55456b.f55337f);
            this.f55458d.mo80497e(107, 0, "did start camera1", null);
            if (this.f55415y == null) {
                C13341g.m80815b("TECamera1", "Open Camera Failed with ID:" + this.f55456b.f55337f);
                if (this.f55456b.f55337f == -1) {
                    i2 = -405;
                }
                this.f55458d.mo80498f(1, i2, null, this.f55415y);
                return i2;
            }
            try {
                wjh0.m203445a("TECamera1-initCamera");
                iM80556R0 = m80556R0();
                try {
                    wjh0.m203446b();
                    wjh0.m203445a("TECamera1-fillFeatures");
                    mo80588l();
                    wjh0.m203446b();
                    this.f55458d.mo80497e(1, 0, "TECamera1 features is ready", this.f55415y);
                } catch (Exception e2) {
                    e = e2;
                    i = iM80556R0;
                    C13341g.m80815b("TECamera1", "Open init Camera Failed!: " + Log.getStackTraceString(e));
                    C13332e.m80698a(e);
                    iM80556R0 = i;
                }
            } catch (Exception e3) {
                e = e3;
            }
            this.f55458d.mo80498f(1, iM80556R0, this, this.f55415y);
            wjh0.m203446b();
            return iM80556R0;
        } catch (RuntimeException e4) {
            C13341g.m80815b("TECamera1", "Open Camera Failed!: " + Log.getStackTraceString(e4));
            if (e4.getMessage() != null) {
                if (e4.getMessage().equals("Fail to connect to camera service")) {
                    i2 = -410;
                } else if (e4.getMessage().equals("Camera initialization failed")) {
                    i2 = -407;
                }
            }
            C13332e.m80698a(e4);
            this.f55458d.mo80498f(1, i2, null, this.f55415y);
            this.f55415y = null;
            return i2;
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: A0 */
    public void mo80558A0(TECameraSettings.InterfaceC13315p interfaceC13315p) {
        Camera camera = this.f55415y;
        if (camera == null) {
            C13341g.m80815b("TECamera1", "[VE_UI_TEST]Failed event: STOP_ZOOM. Code: -439. Reason: mCameraDevice is null");
            C13341g.m80815b("TECamera1", "stopZoom : Camera is null!");
            this.f55458d.mo80495c(1, -439, "stopZoom : Camera is null!", this.f55415y);
            return;
        }
        try {
            if (camera.getParameters().isSmoothZoomSupported() && interfaceC13315p != null && interfaceC13315p.enableSmooth()) {
                this.f55415y.stopSmoothZoom();
            }
        } catch (Exception e2) {
            C13341g.m80815b("TECamera1", "[VE_UI_TEST]Failed event: STOP_ZOOM. Code: -420. Reason: " + e2);
            String str = "Stop zoom failed : " + e2.toString();
            C13341g.m80815b("TECamera1", str);
            this.f55458d.mo80495c(1, -420, str, this.f55415y);
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: B */
    public int mo80559B() {
        String flashMode;
        Camera camera = this.f55415y;
        if (camera != null) {
            try {
                flashMode = camera.getParameters().getFlashMode();
            } catch (Exception e2) {
                e2.printStackTrace();
                flashMode = null;
            }
            if ("on".equals(flashMode)) {
                return 1;
            }
            if ("auto".equals(flashMode)) {
                return 3;
            }
            if (BLiveOperationTitleShowType.off.equals(flashMode)) {
                return 0;
            }
            if ("torch".equals(flashMode)) {
                return 2;
            }
            if ("red-eye".equals(flashMode)) {
                return 4;
            }
        }
        return -1;
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: B0 */
    public void mo80560B0(int i) {
        C13341g.m80823j("TECamera1", "Does not support switch mode for camera1");
        this.f55458d.mo80497e(WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR, WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR, "Does not support switch mode for camera1", this.f55415y);
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: C */
    public int mo80561C() {
        int iM80715q = this.f55465k;
        if (iM80715q < 0) {
            iM80715q = C13333f.m80715q(this.f55460f);
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.f55462h = this.f55463i;
        try {
            Camera.getCameraInfo(this.f55456b.f55337f, cameraInfo);
            int i = this.f55462h;
            int i2 = cameraInfo.orientation;
            if (i == 1) {
                this.f55464j = (540 - ((i2 + iM80715q) % 360)) % 360;
            } else {
                this.f55464j = ((i2 - iM80715q) + 360) % 360;
            }
            return this.f55464j;
        } catch (Exception e2) {
            this.f55458d.mo80495c(1, -405, "getFrameOrientation :" + e2.getMessage(), this.f55415y);
            return 0;
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: C0 */
    public void mo80562C0(int i) {
        String str;
        String str2;
        Handler handler;
        if (this.f55415y == null) {
            C13341g.m80815b("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: mCameraDevice is null");
            C13341g.m80815b("TECamera1", "switchFlashMode failed: Camera is not ready!");
            this.f55458d.mo80495c(1, -439, "switchFlashMode failed: Camera is not ready!", this.f55415y);
            this.f55458d.mo80499g(1, -439, i == 0 ? 0 : 1, "switchFlashMode failed: Camera is not ready!", this.f55415y);
            return;
        }
        if (this.f55412K != 0 && System.currentTimeMillis() - this.f55412K < 200 && (handler = this.f55459e) != null) {
            handler.postDelayed(new e(i), 200L);
            return;
        }
        this.f55414M = false;
        try {
            Camera.Parameters parameters = this.f55415y.getParameters();
            this.f55416z = parameters;
            List<String> supportedFlashModes = parameters.getSupportedFlashModes();
            if (supportedFlashModes != null) {
                if (i == 0) {
                    str2 = BLiveOperationTitleShowType.off;
                } else if (i == 1) {
                    str2 = "on";
                    this.f55414M = true;
                } else if (i == 2) {
                    str2 = "torch";
                } else if (i != 3) {
                    str2 = i != 4 ? null : "red-eye";
                } else {
                    str2 = "auto";
                }
                if (str2 != null && supportedFlashModes.contains(str2)) {
                    this.f55458d.mo80497e(104, 0, "camera1 will change flash mode ".concat(str2), null);
                    this.f55416z.setFlashMode(str2);
                    this.f55415y.setParameters(this.f55416z);
                    if (BLiveOperationTitleShowType.off.equalsIgnoreCase(str2) && this.f55456b.f55305E.getBoolean("enableSwitchFlashSleepToTakeEffect")) {
                        try {
                            Thread.sleep(200L);
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }
                    }
                    this.f55458d.mo80497e(105, 0, "camera1 did change flash mode ".concat(str2), null);
                    this.f55458d.mo80500h(1, 0, i == 0 ? 0 : 1, "torch success", this.f55415y);
                    return;
                }
            }
            if (supportedFlashModes != null) {
                str = "Camera does not support flash mode: " + i + "support list: " + supportedFlashModes.toString();
            } else {
                str = "Camera does not support flash mode: " + i;
            }
            String str3 = str;
            C13341g.m80815b("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -419. Reason: not support flash mode " + i);
            C13341g.m80815b("TECamera1", str3);
            this.f55458d.mo80495c(1, -419, str3, this.f55415y);
            this.f55458d.mo80499g(1, -419, i == 0 ? 0 : 1, str3, this.f55415y);
        } catch (Exception e3) {
            C13341g.m80815b("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -419. Reason: " + e3);
            String str4 = "Switch flash mode failed: " + e3.toString();
            C13341g.m80815b("TECamera1", str4);
            this.f55458d.mo80495c(1, -418, str4, this.f55415y);
            this.f55458d.mo80499g(1, -418, i == 0 ? 0 : 1, str4, this.f55415y);
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: D0 */
    public void mo80563D0(int i, int i2, TECameraSettings.InterfaceC13311l interfaceC13311l) {
        Camera camera = this.f55415y;
        if (camera == null) {
            C13341g.m80815b("TECamera1", "takePicture : camera is null");
            this.f55458d.mo80495c(1, -439, "takePicture : camera is null", this.f55415y);
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f55416z = parameters;
            if (parameters.getPictureSize().width != i || this.f55416z.getPictureSize().height != i2) {
                TEFrameSizei tEFrameSizeiM80714p = C13333f.m80714p(m80551M0(this.f55416z.getSupportedPictureSizes()), this.f55456b.m80504a(), new TEFrameSizei(i, i2));
                this.f55416z.setPictureSize(tEFrameSizeiM80714p.width, tEFrameSizeiM80714p.height);
                List<Integer> supportedPictureFormats = this.f55416z.getSupportedPictureFormats();
                if (this.f55456b.f55360q0 && supportedPictureFormats != null && supportedPictureFormats.contains(17)) {
                    this.f55416z.setPictureFormat(17);
                } else {
                    this.f55416z.setPictureFormat(256);
                    this.f55416z.setJpegQuality(100);
                }
                this.f55415y.setParameters(this.f55416z);
            }
            this.f55457c = false;
            this.f55415y.takePicture(null, null, new b(interfaceC13311l));
        } catch (Exception e2) {
            C13332e.m80698a(e2);
            if (interfaceC13311l != null) {
                interfaceC13311l.m80510a(m80657h(e2, -1000));
            }
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: E0 */
    public void mo80564E0(TECameraSettings.InterfaceC13311l interfaceC13311l) {
        if (this.f55415y == null) {
            C13341g.m80815b("TECamera1", "takePicture: camera is null.");
            this.f55458d.mo80495c(1, -439, "takePicture: camera is null.", this.f55415y);
            return;
        }
        try {
            this.f55457c = false;
            C13341g.m80818e("TECamera1", "takePicture size: " + this.f55456b.f55361r.toString());
            this.f55415y.takePicture(null, null, new c(System.currentTimeMillis(), interfaceC13311l));
        } catch (Exception e2) {
            C13332e.m80698a(e2);
            if (interfaceC13311l != null) {
                interfaceC13311l.m80510a(m80657h(e2, -1000));
            }
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: F0 */
    public void mo80565F0(boolean z) {
        this.f55414M = false;
        if (this.f55415y == null) {
            C13341g.m80815b("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: mCameraDevice is null");
            C13341g.m80815b("TECamera1", "toggleTorch : Camera is not ready!");
            this.f55458d.mo80495c(1, -439, "toggleTorch : Camera is not ready!", this.f55415y);
            this.f55458d.mo80499g(1, -439, z ? 1 : 0, "toggleTorch : Camera is not ready!", this.f55415y);
            return;
        }
        if (this.f55456b.f55333d == 1) {
            C13341g.m80815b("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -416. Reason: not support torch");
            C13341g.m80823j("TECamera1", "Front camera does not support torch!");
            this.f55458d.mo80497e(-416, -416, "Front camera does not support torch!", this.f55415y);
            this.f55458d.mo80499g(1, -416, z ? 1 : 0, "Front camera does not support torch!", this.f55415y);
            return;
        }
        try {
            this.f55458d.mo80497e(104, 0, "camera1 will change flash mode " + z, null);
            Camera.Parameters parameters = this.f55415y.getParameters();
            this.f55416z = parameters;
            parameters.setFlashMode(z ? "torch" : BLiveOperationTitleShowType.off);
            this.f55415y.setParameters(this.f55416z);
            this.f55458d.mo80497e(105, 0, "camera1 did change flash mode " + z, null);
            this.f55458d.mo80500h(1, 0, z ? 1 : 0, "toggleTorch " + z, this.f55415y);
        } catch (Exception e2) {
            C13341g.m80815b("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -417. Reason: " + e2);
            String str = "Toggle torch failed: " + e2.toString();
            C13341g.m80815b("TECamera1", str);
            this.f55458d.mo80495c(1, -417, str, this.f55415y);
            this.f55458d.mo80499g(1, -417, z ? 1 : 0, str, this.f55415y);
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: H0 */
    public void mo80566H0(float f2, TECameraSettings.InterfaceC13315p interfaceC13315p) {
        List<Integer> list = this.f55408G;
        if (list == null || this.f55415y == null) {
            return;
        }
        float f3 = this.f55409H * f2;
        this.f55409H = f3;
        try {
            if (f3 < list.get(0).intValue()) {
                this.f55409H = this.f55408G.get(0).intValue();
            }
            float f4 = this.f55409H;
            List<Integer> list2 = this.f55408G;
            if (f4 > list2.get(list2.size() - 1).intValue()) {
                List<Integer> list3 = this.f55408G;
                this.f55409H = list3.get(list3.size() - 1).intValue();
            }
            Camera.Parameters parameters = this.f55415y.getParameters();
            if (parameters == null || !parameters.isZoomSupported()) {
                C13341g.m80815b("TECamera1", "[VE_UI_TEST]Failed event: SET_ZOOM. Code: -420. Reason: getParameters is null");
                C13341g.m80815b("TECamera1", "setZoom failed for getParameters null");
                return;
            }
            int iM80553O0 = m80553O0((int) this.f55409H);
            if (parameters.getZoom() != iM80553O0) {
                parameters.setZoom(iM80553O0);
                this.f55415y.setParameters(parameters);
                if (interfaceC13315p != null) {
                    interfaceC13315p.onChange(1, this.f55408G.get(iM80553O0).intValue() / 100.0f, true);
                }
            }
        } catch (Exception e2) {
            C13341g.m80815b("TECamera1", "[VE_UI_TEST]Failed event: SET_ZOOM. Code: -420. Reason: " + e2);
            C13341g.m80815b("TECamera1", "setZoom failed, " + e2.getMessage());
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: I */
    public int[] mo80567I() {
        Camera.Size pictureSize;
        Camera camera = this.f55415y;
        if (camera != null) {
            try {
                pictureSize = camera.getParameters().getPictureSize();
            } catch (Exception e2) {
                e2.printStackTrace();
                pictureSize = null;
            }
        } else {
            pictureSize = null;
        }
        if (pictureSize == null) {
            return null;
        }
        return new int[]{pictureSize.width, pictureSize.height};
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: J */
    public int[] mo80568J() {
        Camera camera = this.f55415y;
        if (camera == null) {
            return null;
        }
        try {
            int[] iArr = new int[2];
            camera.getParameters().getPreviewFpsRange(iArr);
            iArr[0] = iArr[0] / 1000;
            iArr[1] = iArr[1] / 1000;
            return iArr;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: N */
    public List<TEFrameSizei> mo80569N() {
        Camera.Parameters parameters = this.f55416z;
        if (parameters == null) {
            this.f55406E.clear();
            return this.f55406E;
        }
        List<TEFrameSizei> listM80551M0 = m80551M0(parameters.getSupportedPictureSizes());
        this.f55406E = listM80551M0;
        return listM80551M0;
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: O */
    public List<TEFrameSizei> mo80570O() {
        Camera.Parameters parameters = this.f55416z;
        if (parameters == null) {
            this.f55405D.clear();
            return this.f55405D;
        }
        List<TEFrameSizei> listM80551M0 = m80551M0(parameters.getSupportedPreviewSizes());
        this.f55405D = listM80551M0;
        return listM80551M0;
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: Q */
    public boolean mo80571Q() {
        Camera.Parameters parameters;
        C13341g.m80818e("TECamera1", "isAutoExposureLockSupported...");
        if (this.f55415y == null || (parameters = this.f55416z) == null || !this.f55457c) {
            return false;
        }
        return parameters.isAutoExposureLockSupported();
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: R */
    public boolean mo80572R() {
        Camera.Parameters parameters;
        C13341g.m80818e("TECamera1", "isAutoFocusLockSupported...");
        Camera camera = this.f55415y;
        if (camera == null || (parameters = this.f55416z) == null || !this.f55457c) {
            this.f55458d.mo80495c(1, -439, "setAutoFocusLock failed. ： Camera is null.", camera);
            return false;
        }
        try {
            return parameters.getSupportedFocusModes().contains("fixed");
        } catch (Exception unused) {
            this.f55458d.mo80497e(-433, -433, "isAutoFocusLockSupported failed", this.f55415y);
            return false;
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: T */
    public boolean mo80573T() {
        Camera.Parameters parameters;
        try {
            return (this.f55415y == null || (parameters = this.f55416z) == null || parameters.getSupportedWhiteBalance() == null || !this.f55416z.isAutoWhiteBalanceLockSupported()) ? false : true;
        } catch (Exception e2) {
            C13341g.m80815b("TECamera1", "Unsupported whileBalance!: " + e2.toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: T0 */
    public void m80574T0(int i) {
        C13341g.m80814a("TECamera1", "Camera start face detect");
        if (!this.f55457c || this.f55415y == null || this.f55416z.getMaxNumDetectedFaces() <= 0) {
            return;
        }
        try {
            if (i == 1) {
                if (this.f55462h == 1) {
                    this.f55415y.startFaceDetection();
                    C13341g.m80818e("TECamera1", "use faceae for front");
                    return;
                }
                return;
            }
            if (i == 2) {
                if (this.f55462h == 0) {
                    this.f55415y.startFaceDetection();
                    C13341g.m80818e("TECamera1", "use faceae for rear");
                    return;
                }
                return;
            }
            if (i == 3) {
                this.f55415y.startFaceDetection();
                C13341g.m80818e("TECamera1", "use faceae for all");
            }
        } catch (Exception unused) {
            C13341g.m80815b("TECamera1", "camera start face detect failed");
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: U */
    public boolean mo80575U() {
        C13341g.m80818e("TECamera1", "isSupportedExposureCompensation...");
        if (this.f55415y == null || this.f55416z == null || !this.f55457c) {
            return false;
        }
        return this.f55456b.f55311K.m80506a();
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: V */
    public boolean mo80576V() {
        Bundle bundle = m80641A().get(this.f55456b.f55308H);
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean("camera_torch_supported", false);
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: W */
    public int mo80577W(TECameraSettings tECameraSettings, Cert cert) {
        super.mo80577W(tECameraSettings, cert);
        this.f55456b = tECameraSettings;
        this.f55463i = tECameraSettings.f55333d;
        return m80557S0(cert);
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: Z */
    public void mo80578Z(TECameraSettings.InterfaceC13313n interfaceC13313n) {
        if (interfaceC13313n == null) {
            C13341g.m80815b("TECamera1", "ShaderZoomCallback is null, do nothing!");
            return;
        }
        Camera camera = this.f55415y;
        if (camera == null) {
            C13341g.m80815b("TECamera1", "queryShaderZoomStep : Camera is null!");
            this.f55458d.mo80495c(1, -439, "queryShaderZoomStep : Camera is null!", this.f55415y);
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            if (parameters == null || !parameters.isZoomSupported()) {
                return;
            }
            int maxZoom = parameters.getMaxZoom();
            if (maxZoom > 99) {
                maxZoom = 99;
            }
            List<Integer> zoomRatios = parameters.getZoomRatios();
            if (maxZoom <= 0) {
                interfaceC13313n.m80511a(0.0f);
            } else {
                interfaceC13313n.m80511a(((float) Math.pow(((zoomRatios.get(1).intValue() - zoomRatios.get(0).intValue()) / 100.0f) + 1.0f, 0.5d)) - 1.0f);
            }
        } catch (Exception e2) {
            String str = "Query shader zoom step failed : " + e2.toString();
            C13341g.m80815b("TECamera1", str);
            this.f55458d.mo80495c(1, -420, str, this.f55415y);
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: a0 */
    public void mo80579a0(TECameraSettings.InterfaceC13315p interfaceC13315p, boolean z) {
        if (interfaceC13315p == null) {
            C13341g.m80815b("TECamera1", "ZoomCallback is null, do nothing!");
            return;
        }
        Camera camera = this.f55415y;
        if (camera == null) {
            C13341g.m80815b("TECamera1", "queryZoomAbility : Camera is null!");
            this.f55458d.mo80495c(1, -439, "queryZoomAbility : Camera is null!", this.f55415y);
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            float maxZoom = parameters.getMaxZoom();
            this.f55466l = maxZoom;
            if (!z) {
                interfaceC13315p.onZoomSupport(1, parameters.isZoomSupported(), parameters.isSmoothZoomSupported(), parameters.getMaxZoom(), parameters.getZoomRatios());
            } else {
                interfaceC13315p.onZoomSupport(1, parameters.isZoomSupported(), parameters.isSmoothZoomSupported(), this.f55408G.get((int) maxZoom).intValue() / 100.0f, parameters.getZoomRatios());
            }
        } catch (Exception e2) {
            String str = "Query zoom ability failed : " + e2.toString();
            C13341g.m80815b("TECamera1", str);
            this.f55458d.mo80495c(1, -420, str, this.f55415y);
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: c */
    public void mo80580c() {
        C13341g.m80814a("TECamera1", "cancelFocus...");
        Camera camera = this.f55415y;
        if (camera != null) {
            try {
                camera.cancelAutoFocus();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: f */
    public void mo80581f(Cert cert) {
        this.f55414M = false;
        C13341g.m80818e("TECamera1", "Camera close start...");
        if (this.f55415y != null) {
            if (this.f55457c) {
                try {
                    C13341g.m80818e("TECamera1", "Camera close torch...");
                    Camera.Parameters parameters = this.f55415y.getParameters();
                    this.f55416z = parameters;
                    parameters.setFlashMode(BLiveOperationTitleShowType.off);
                    this.f55415y.setParameters(this.f55416z);
                    C13341g.m80818e("TECamera1", "Camera stopPreview...");
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    this.f55415y.stopPreview();
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    C13341g.m80818e("TECamera1", "Camera stopPreview end...");
                    ajh0.m96973b("te_record_camera1_stop_preview_cost", jCurrentTimeMillis2);
                    C13341g.m80819f("te_record_camera1_stop_preview_cost", Long.valueOf(jCurrentTimeMillis2));
                    int iM107165g = this.f55461g.m107165g();
                    cjh0 cjh0Var = this.f55461g;
                    if (iM107165g == 1) {
                        cjh0Var.m107166h().setOnFrameAvailableListener(null, null);
                    } else if (cjh0Var.m107165g() == 4) {
                        this.f55415y.setPreviewCallbackWithBuffer(null);
                    }
                } catch (Exception e2) {
                    C13341g.m80815b("TECamera1", "Close camera failed: " + e2.getMessage());
                }
                this.f55457c = false;
            }
            try {
                this.f55415y.setErrorCallback(null);
                this.f55458d.mo80497e(108, 0, "will close camera1", null);
                lih0.m149898b(cert, this.f55415y);
                this.f55458d.mo80497e(109, 0, "did close camera1", null);
            } catch (Exception e3) {
                C13341g.m80815b("TECamera1", "Camera release failed: " + e3.getMessage());
            }
            this.f55411J.set(false);
            this.f55415y = null;
            C13341g.m80818e("TECamera1", "Camera closed end!");
            this.f55458d.mo80501i(1, this, this.f55415y);
        }
        this.f55474t = null;
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: g */
    public void mo80582g() {
        wjh0.m203445a("TECamera1-collectCameraCapabilities");
        if (!m80648S()) {
            wjh0.m203446b();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (this.f55416z != null) {
                this.f55476v.putOpt("camera_id", Integer.valueOf(this.f55456b.f55337f));
                if (this.f55416z.isZoomSupported()) {
                    this.f55476v.putOpt("camera_zoom_max_ability", Integer.valueOf(this.f55416z.getMaxZoom()));
                }
                List<TEFrameSizei> listMo80570O = mo80570O();
                if (listMo80570O != null) {
                    this.f55475u.m80668a(new TECameraCapabilityCollector.C13328a(TECameraCapabilityCollector.Capability.PREVIEW_SIZE, TECameraCapabilityCollector.DataType.STRING, this.f55456b.f55308H + "=" + listMo80570O.toString()));
                    JSONArray jSONArray = new JSONArray();
                    for (TEFrameSizei tEFrameSizei : listMo80570O) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.putOpt("width", Integer.valueOf(tEFrameSizei.width));
                        jSONObject.putOpt("height", Integer.valueOf(tEFrameSizei.height));
                        jSONArray.put(jSONObject);
                    }
                    this.f55476v.putOpt("preview_size_lit", jSONArray);
                }
            }
        } catch (Exception unused) {
        }
        List<int[]> supportedPreviewFpsRange = this.f55416z.getSupportedPreviewFpsRange();
        StringBuilder sb = new StringBuilder(this.f55456b.f55308H + "=");
        try {
            JSONArray jSONArray2 = new JSONArray();
            if (supportedPreviewFpsRange != null) {
                for (int[] iArr : supportedPreviewFpsRange) {
                    sb.append("[");
                    sb.append(iArr[0] / 1000);
                    sb.append(Constants.SEPARATOR_COMMA);
                    sb.append(iArr[1] / 1000);
                    sb.append(Constants.AES_SUFFIX);
                    if (supportedPreviewFpsRange.indexOf(iArr) != supportedPreviewFpsRange.size() - 1) {
                        sb.append(", ");
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("fps_min", Integer.valueOf(iArr[0] / 1000));
                    jSONObject2.putOpt("fps_max", Integer.valueOf(iArr[1] / 1000));
                    jSONArray2.put(jSONObject2);
                }
                this.f55475u.m80668a(new TECameraCapabilityCollector.C13328a(TECameraCapabilityCollector.Capability.FPS_RANGE, TECameraCapabilityCollector.DataType.STRING, sb.toString()));
                this.f55476v.putOpt("fps_range_list", jSONArray2);
            }
        } catch (Exception unused2) {
        }
        this.f55475u.m80671d();
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C13341g.m80818e("TECamera1", "collectCameraCapabilities consume: " + jCurrentTimeMillis2);
        ajh0.m96973b("te_record_camera_collect_capbilities_cost", jCurrentTimeMillis2);
        this.f55477w = true;
        wjh0.m203446b();
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: g0 */
    public void mo80583g0(boolean z) {
        Camera.Parameters parameters;
        C13341g.m80818e("TECamera1", "setAutoExposureLock...");
        Camera camera = this.f55415y;
        if (camera == null || (parameters = this.f55416z) == null || !this.f55457c) {
            this.f55458d.mo80495c(1, -439, "setAutoExposureLock failed. ： Camera is null.", camera);
            return;
        }
        if (!parameters.isAutoExposureLockSupported()) {
            C13341g.m80823j("TECamera1", "Current camera doesn't support ae lock.");
            this.f55458d.mo80497e(-426, -426, "Current camera doesn't support ae lock.", this.f55415y);
            return;
        }
        try {
            this.f55416z.setAutoExposureLock(z);
            this.f55415y.setParameters(this.f55416z);
        } catch (Exception e2) {
            String str = "Error: setAutoExposureLock failed: " + e2.toString();
            C13341g.m80815b("TECamera1", str);
            this.f55458d.mo80497e(-427, -427, str, this.f55415y);
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: h0 */
    public void mo80584h0(boolean z) {
        C13341g.m80818e("TECamera1", "setAutoFocusLock...");
        Camera camera = this.f55415y;
        if (camera == null || this.f55416z == null || !this.f55457c) {
            this.f55458d.mo80495c(1, -439, "setAutoFocusLock failed. ： Camera is null.", camera);
            return;
        }
        if (!mo80572R()) {
            C13341g.m80823j("TECamera1", "Current camera doesn't support af lock.");
            this.f55458d.mo80497e(-433, -433, "Current camera doesn't support af lock.", this.f55415y);
            return;
        }
        Camera.Parameters parameters = this.f55416z;
        try {
            if (z) {
                parameters.setFocusMode("fixed");
            } else {
                parameters.setFocusMode("continuous-video");
            }
            this.f55415y.setParameters(this.f55416z);
        } catch (Exception e2) {
            String str = "Error: setAutoFocusLock failed: " + e2.toString();
            C13341g.m80815b("TECamera1", str);
            this.f55458d.mo80497e(-427, -427, str, this.f55415y);
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: j */
    public void mo80585j() {
        if (this.f55415y == null || this.f55416z == null) {
            return;
        }
        C13341g.m80814a("TECamera1", "enableCaf...");
        try {
            if (this.f55416z.getSupportedFocusModes().contains("continuous-video")) {
                this.f55415y.cancelAutoFocus();
                this.f55416z.setFocusMode("continuous-video");
                this.f55415y.setParameters(this.f55416z);
            }
        } catch (Throwable th) {
            String str = "Error: focusAtPoint failed: " + th.toString();
            C13341g.m80815b("TECamera1", str);
            this.f55458d.mo80495c(1, -411, str, this.f55415y);
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: j0 */
    public boolean mo80586j0(int i) {
        String str;
        int i2;
        this.f55410I = i;
        C13341g.m80818e("TECamera1", "setExposureCompensation... value: " + i);
        int i3 = -413;
        if (this.f55415y == null || this.f55416z == null || !this.f55457c || !this.f55456b.f55311K.m80506a()) {
            Camera camera = this.f55415y;
            if (camera == null || this.f55416z == null || !this.f55457c) {
                this.f55458d.mo80495c(1, -439, "setExposureCompensation ： Camera is null.", camera);
                str = "setExposureCompensation ： Camera is null.";
            } else {
                i3 = -414;
                str = "Unsupported exposure compensation!";
            }
            this.f55458d.mo80495c(1, i3, str, this.f55415y);
            i2 = i3;
        } else {
            TECameraSettings.C13303d c13303d = this.f55456b.f55311K;
            if (i > c13303d.f55384a || i < c13303d.f55386c) {
                this.f55458d.mo80495c(1, -415, "Invalid exposure: " + i, this.f55415y);
                return false;
            }
            try {
                this.f55416z.setExposureCompensation(i);
                this.f55415y.setParameters(this.f55416z);
                this.f55456b.f55311K.f55385b = this.f55416z.getExposureCompensation();
                StringBuilder sb = new StringBuilder("EC = ");
                sb.append(this.f55456b.f55311K.f55385b);
                sb.append(", EV = ");
                TECameraSettings.C13303d c13303d2 = this.f55456b.f55311K;
                sb.append(c13303d2.f55385b * c13303d2.f55387d);
                C13341g.m80814a("TECamera1", sb.toString());
                str = null;
                i2 = 0;
            } catch (Exception e2) {
                str = "Error: setExposureCompensation failed: " + e2.toString();
                this.f55458d.mo80495c(1, -413, str, this.f55415y);
                i2 = -1;
            }
        }
        boolean z = i2 == 0;
        if (!z) {
            C13341g.m80815b("TECamera1", "setExposureCompensation failed: " + str);
        }
        return z;
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: k0 */
    public void mo80587k0(Bundle bundle) {
        super.mo80587k0(bundle);
        if (bundle == null) {
            return;
        }
        Bundle bundle2 = this.f55472r.get(this.f55456b.f55308H);
        for (String str : bundle.keySet()) {
            if (TECameraSettings.C13310k.m80509a(str, bundle.get(str)) && TextUtils.equals(str, "support_light_soft")) {
                bundle2.putBoolean("support_light_soft", bundle.getBoolean("support_light_soft"));
            }
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: l */
    public Bundle mo80588l() {
        Camera.Parameters parameters;
        this.f55456b.f55308H = this.f55456b.f55333d + "";
        Bundle bundleMo80588l = super.mo80588l();
        if (bundleMo80588l != null) {
            bundleMo80588l.putParcelableArrayList("support_preview_sizes", (ArrayList) mo80570O());
            bundleMo80588l.putParcelableArrayList("support_picture_sizes", (ArrayList) mo80569N());
            bundleMo80588l.putParcelableArrayList("support_video_sizes", (ArrayList) m80555Q0());
            bundleMo80588l.putParcelableArrayList("camera_support_fps_range", (ArrayList) m80554P0());
            bundleMo80588l.putParcelable("camera_preview_size", this.f55456b.f55359q);
            try {
                bundleMo80588l.putBoolean("camera_torch_supported", (this.f55415y == null || (parameters = this.f55416z) == null || parameters.getSupportedFlashModes() == null) ? false : true);
                return bundleMo80588l;
            } catch (Exception e2) {
                C13341g.m80815b("TECamera1", "Get camera torch information failed: " + e2.toString());
                bundleMo80588l.putBoolean("camera_torch_supported", false);
            }
        }
        return bundleMo80588l;
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: m */
    public void mo80589m(TEFocusSettings tEFocusSettings) {
        Camera camera = this.f55415y;
        if (camera == null) {
            C13341g.m80815b("TECamera1", "focusAtPoint: camera is null.");
            tEFocusSettings.m80520g().mo80534a(-439, this.f55456b.f55333d, "focusAtPoint: camera is null.");
            this.f55458d.mo80495c(1, -439, "focusAtPoint: camera is null.", this.f55415y);
            return;
        }
        boolean z = false;
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f55416z = parameters;
            if (!this.f55402A.m126502e(parameters, this.f55403B)) {
                C13341g.m80815b("TECamera1", "Error: not support focus.");
                this.f55458d.mo80497e(-412, -412, "Error: not support focus.", this.f55415y);
                if (!this.f55402A.m126503f(this.f55456b.f55333d, this.f55416z) || !tEFocusSettings.m80529p()) {
                    tEFocusSettings.m80520g().mo80534a(-412, this.f55456b.f55333d, "Error: not support focus.");
                    return;
                }
                tEFocusSettings.m80517d();
                this.f55416z.setMeteringAreas(this.f55402A.m126499b(tEFocusSettings.m80523j(), tEFocusSettings.m80522i(), tEFocusSettings.m80519f(), tEFocusSettings.m80524k(), tEFocusSettings.m80525l(), this.f55456b.f55335e, tEFocusSettings.m80518e()));
                this.f55415y.setParameters(this.f55416z);
                return;
            }
            if (tEFocusSettings.m80529p() && this.f55402A.m126503f(this.f55456b.f55333d, this.f55416z)) {
                tEFocusSettings.m80517d();
                this.f55416z.setMeteringAreas(this.f55402A.m126499b(tEFocusSettings.m80523j(), tEFocusSettings.m80522i(), tEFocusSettings.m80519f(), tEFocusSettings.m80524k(), tEFocusSettings.m80525l(), this.f55456b.f55335e, tEFocusSettings.m80518e()));
            }
            if (!tEFocusSettings.m80528o()) {
                this.f55415y.setParameters(this.f55416z);
                C13341g.m80818e("TECamera1", "focus is not enable!");
                return;
            }
            tEFocusSettings.m80516c();
            this.f55416z.setFocusAreas(this.f55402A.m126498a(tEFocusSettings.m80523j(), tEFocusSettings.m80522i(), tEFocusSettings.m80519f(), tEFocusSettings.m80524k(), tEFocusSettings.m80525l(), this.f55456b.f55335e, tEFocusSettings.m80518e()));
            this.f55415y.cancelAutoFocus();
            this.f55416z.setFocusMode("auto");
            if (this.f55414M && !tEFocusSettings.m80526m()) {
                this.f55416z.setFlashMode(BLiveOperationTitleShowType.off);
                z = true;
            }
            this.f55415y.setParameters(this.f55416z);
            this.f55415y.autoFocus(new d(tEFocusSettings));
            if (z) {
                try {
                    this.f55416z.setFlashMode("on");
                    this.f55415y.setParameters(this.f55416z);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e2) {
            String str = "Error: focusAtPoint failed: " + e2.toString();
            C13341g.m80815b("TECamera1", str);
            tEFocusSettings.m80520g().mo80534a(-411, this.f55456b.f55333d, str);
            this.f55458d.mo80495c(1, -411, str, this.f55415y);
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: n */
    public void mo80590n(Cert cert) {
        super.mo80590n(cert);
        C13341g.m80818e("TECamera1", "force close camera: " + this.f55415y);
        try {
            Camera camera = this.f55415y;
            if (camera != null) {
                lih0.m149898b(cert, camera);
                this.f55415y = null;
            }
        } catch (Exception unused) {
            C13341g.m80815b("TECamera1", "force close camera failed");
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: n0 */
    public void mo80591n0(int i, int i2) {
        TECameraSettings tECameraSettings = this.f55456b;
        tECameraSettings.f55301A = true;
        TEFrameSizei tEFrameSizei = tECameraSettings.f55361r;
        tEFrameSizei.width = i;
        tEFrameSizei.height = i2;
        mo80602x0();
        mo80598u0();
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: o0 */
    public void mo80592o0() {
        Camera.Parameters parameters = this.f55416z;
        if (parameters == null) {
            return;
        }
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        int iM80535a = TEFrameRateRange.m80535a(supportedPreviewFpsRange);
        TECameraSettings tECameraSettings = this.f55456b;
        int[] iArrM80717s = C13333f.m80717s(tECameraSettings.f55315O, tECameraSettings.f55333d, tECameraSettings.f55331c.m80537c(iM80535a), supportedPreviewFpsRange);
        this.f55416z.setPreviewFpsRange(iArrM80717s[0], iArrM80717s[1]);
        this.f55458d.mo80497e(121, 0, new TEFrameRateRange(iArrM80717s[0], iArrM80717s[1]).toString(), null);
        this.f55415y.setParameters(this.f55416z);
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: p */
    public TEFrameSizei mo80593p(float f2, TEFrameSizei tEFrameSizei) {
        Camera camera = this.f55415y;
        if (camera == null) {
            C13341g.m80815b("TECamera1", "getBestPreviewSize: Camera is not opened!");
            return null;
        }
        if (this.f55416z == null) {
            this.f55416z = camera.getParameters();
        }
        return tEFrameSizei != null ? C13333f.m80700b(mo80570O(), tEFrameSizei) : C13333f.m80701c(mo80570O(), f2);
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: q */
    public JSONObject mo80594q() {
        return this.f55476v;
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: r */
    public int[] mo80595r() {
        Camera camera = this.f55415y;
        if (camera == null) {
            return null;
        }
        try {
            Camera.Size previewSize = camera.getParameters().getPreviewSize();
            return new int[]{previewSize.width, previewSize.height};
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: r0 */
    public void mo80596r0(int i) {
        super.mo80596r0(i);
        if (i == 0) {
            m80548J0();
        } else if (i == 1) {
            m80549K0();
        } else {
            ig3.m135964a("un support scene");
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: t0 */
    public void mo80597t0(boolean z, String str) {
        Camera camera = this.f55415y;
        if (camera == null || !this.f55457c) {
            C13341g.m80815b("TECamera1", "setWhileBalance : Camera is null!");
            this.f55458d.mo80495c(1, -439, "setWhileBalance : Camera is null!", this.f55415y);
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f55416z = parameters;
            List<String> supportedWhiteBalance = parameters.getSupportedWhiteBalance();
            if (supportedWhiteBalance != null && supportedWhiteBalance.contains(str)) {
                this.f55416z.setWhiteBalance(str);
                this.f55415y.setParameters(this.f55416z);
                return;
            }
            String str2 = "SupportWBList has no value: " + str;
            C13341g.m80815b("TECamera1", str2);
            this.f55458d.mo80495c(1, -424, str2, this.f55415y);
        } catch (Exception e2) {
            String str3 = "Set WhileBalance failed: " + e2.toString();
            C13341g.m80815b("TECamera1", str3);
            this.f55458d.mo80495c(1, -424, str3, this.f55415y);
        }
    }

    /* JADX WARN: Code duplicated, block: B:88:0x02c8  */
    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: u0 */
    public void mo80598u0() {
        int i;
        wjh0.m203445a("TECamera1-startCapture");
        C13341g.m80818e("TECamera1", "Camera startPreview...");
        if (this.f55457c) {
            C13341g.m80823j("TECamera1", "Camera is previewing...");
            return;
        }
        if (this.f55415y != null) {
            try {
                cjh0 cjh0Var = this.f55461g;
                if (cjh0Var == null) {
                    throw new AndroidRuntimeException("ProviderManager is null");
                }
                AbstractC13324c.e eVar = this.f55469o;
                if (eVar != null) {
                    cjh0Var.m107170l(eVar);
                }
                if (this.f55416z == null) {
                    this.f55416z = this.f55415y.getParameters();
                }
                int iM107168j = this.f55461g.m107168j(m80551M0(this.f55416z.getSupportedPreviewSizes()), this.f55456b.f55359q);
                if (iM107168j != 0) {
                    C13341g.m80815b("TECamera1", "Init provider failed, ret = " + iM107168j);
                    return;
                }
                int iM107165g = this.f55461g.m107165g();
                cjh0 cjh0Var2 = this.f55461g;
                if (iM107165g == 1) {
                    if (cjh0Var2.m107166h() == null) {
                        C13341g.m80815b("TECamera1", "SurfaceTexture is null");
                        throw new AndroidRuntimeException("SurfaceTexture is null");
                    }
                    this.f55415y.setPreviewTexture(this.f55461g.m107166h());
                } else {
                    if (cjh0Var2.m107165g() != 4) {
                        C13341g.m80815b("TECamera1", "Unsupported camera provider type : " + this.f55461g.m107165g());
                        return;
                    }
                    jih0 jih0Var = (jih0) this.f55461g.m107164f();
                    if (jih0Var == null) {
                        throw new AndroidRuntimeException("Provider is null");
                    }
                    if (this.f55411J.compareAndSet(false, true)) {
                        for (byte[] bArr : jih0Var.m141654r(3)) {
                            this.f55415y.addCallbackBuffer(bArr);
                        }
                    }
                    this.f55415y.setPreviewCallbackWithBuffer(jih0Var.m141655s());
                    if (this.f55461g.m107166h() != null) {
                        this.f55415y.setPreviewTexture(this.f55461g.m107166h());
                    }
                }
                if (this.f55408G != null && Float.compare(this.f55456b.f55374x0, 1.0f) != 0) {
                    float f2 = this.f55409H * this.f55456b.f55374x0;
                    this.f55409H = f2;
                    if (f2 < this.f55408G.get(0).intValue()) {
                        this.f55409H = this.f55408G.get(0).intValue();
                    } else {
                        float f3 = this.f55409H;
                        List<Integer> list = this.f55408G;
                        if (f3 > list.get(list.size() - 1).intValue()) {
                            List<Integer> list2 = this.f55408G;
                            this.f55409H = list2.get(list2.size() - 1).intValue();
                        }
                    }
                    this.f55416z.setZoom(m80553O0((int) this.f55409H));
                    this.f55415y.setParameters(this.f55416z);
                }
                TEFrameSizei tEFrameSizeiM107161c = this.f55461g.m107161c();
                if (tEFrameSizeiM107161c != null) {
                    if (this.f55416z.getPreviewSize().width != tEFrameSizeiM107161c.width || this.f55416z.getPreviewSize().height != tEFrameSizeiM107161c.height) {
                        this.f55416z.setPreviewSize(tEFrameSizeiM107161c.width, tEFrameSizeiM107161c.height);
                        TECameraSettings tECameraSettings = this.f55456b;
                        if (tECameraSettings.f55377z) {
                            if (tECameraSettings.f55301A) {
                                tECameraSettings.f55301A = false;
                            } else {
                                List<TEFrameSizei> listM80551M0 = m80551M0(this.f55416z.getSupportedPictureSizes());
                                TECameraSettings tECameraSettings2 = this.f55456b;
                                tECameraSettings.f55361r = C13333f.m80713o(listM80551M0, tEFrameSizeiM107161c, tECameraSettings2.f55367u, tECameraSettings2.f55375y);
                            }
                            Camera.Parameters parameters = this.f55416z;
                            TEFrameSizei tEFrameSizei = this.f55456b.f55361r;
                            parameters.setPictureSize(tEFrameSizei.width, tEFrameSizei.height);
                        }
                        this.f55415y.setParameters(this.f55416z);
                    }
                    this.f55458d.mo80497e(50, 0, tEFrameSizeiM107161c.toString(), this.f55415y);
                }
                TECameraSettings tECameraSettings3 = this.f55456b;
                if (tECameraSettings3.f55301A) {
                    tECameraSettings3.f55301A = false;
                    Camera.Parameters parameters2 = this.f55416z;
                    TEFrameSizei tEFrameSizei2 = tECameraSettings3.f55361r;
                    parameters2.setPictureSize(tEFrameSizei2.width, tEFrameSizei2.height);
                    this.f55415y.setParameters(this.f55416z);
                    C13341g.m80818e("TECamera1", "force set picture size: " + this.f55456b.f55361r.width + BaseSei.f13930X + this.f55456b.f55361r.height);
                }
                this.f55415y.setErrorCallback(new a());
                this.f55456b.f55335e = mo80561C();
                C13341g.m80814a("TECamera1", "Camera rotation = " + this.f55456b.f55335e);
                long jCurrentTimeMillis = System.currentTimeMillis();
                C13341g.m80818e("TECamera1", "Camera startPreview start");
                this.f55415y.startPreview();
                C13341g.m80818e("TECamera1", "Camera startPreview end");
                int i2 = this.f55456b.f55305E.getInt("useCameraFaceDetect");
                this.f55413L = i2;
                m80574T0(i2);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                this.f55412K = jCurrentTimeMillis2;
                long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
                ajh0.m96973b("te_record_camera1_start_preview_cost", j);
                C13341g.m80819f("te_record_camera1_start_preview_cost", Long.valueOf(j));
                this.f55457c = true;
                this.f55458d.mo80493a(1, 0, 0, "TECamera1 preview", this.f55415y);
            } catch (Exception e2) {
                C13341g.m80815b("TECamera1", "startPreview: Error " + e2.getMessage());
                if (e2.getMessage() == null) {
                    i = -425;
                } else if (e2.getMessage().equals("setParameters failed")) {
                    i = WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_CREATE_FAIL;
                } else if (e2.getMessage().equals("startPreview failed")) {
                    i = -410;
                } else {
                    i = -425;
                }
                int i3 = i;
                C13332e.m80698a(e2);
                this.f55457c = false;
                try {
                    if (this.f55467m == 0) {
                        this.f55458d.mo80497e(108, 0, "preview error will close camera1", null);
                        lih0.m149898b(this.f55474t, this.f55415y);
                        this.f55458d.mo80497e(109, 0, "preview error did close camera1", null);
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                if (this.f55467m == 0) {
                    this.f55415y = null;
                }
                this.f55458d.mo80494b(1, i3, e2.getMessage(), this.f55415y);
            }
        }
        wjh0.m203446b();
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: v */
    public int mo80599v() {
        return 1;
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: w0 */
    public void mo80600w0(float f2, TECameraSettings.InterfaceC13315p interfaceC13315p) {
        Camera camera = this.f55415y;
        if (camera == null) {
            C13341g.m80815b("TECamera1", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -439. Reason: mCameraDevice is null");
            C13341g.m80815b("TECamera1", "startZoom : Camera is null!");
            this.f55458d.mo80495c(1, -439, "startZoom : Camera is null!", this.f55415y);
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f55416z = parameters;
            if (!parameters.isZoomSupported() && !this.f55416z.isSmoothZoomSupported()) {
                C13341g.m80815b("TECamera1", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -421. Reason: camera is not support zoom");
                C13341g.m80815b("TECamera1", "Camera is not support zoom!");
                this.f55458d.mo80495c(1, -421, "Camera is not support zoom!", this.f55415y);
                return;
            }
            int iMin = (int) Math.min(this.f55416z.getMaxZoom(), f2);
            if (this.f55416z.isSmoothZoomSupported() && interfaceC13315p != null && interfaceC13315p.enableSmooth()) {
                this.f55415y.startSmoothZoom(iMin);
                this.f55415y.setZoomChangeListener(new f(interfaceC13315p));
                return;
            }
            this.f55416z.setZoom(iMin);
            this.f55415y.setParameters(this.f55416z);
            if (interfaceC13315p != null) {
                interfaceC13315p.onChange(1, iMin, true);
            }
        } catch (Exception e2) {
            C13341g.m80815b("TECamera1", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + e2);
            String str = "Start zoom failed : " + e2.toString();
            C13341g.m80815b("TECamera1", str);
            this.f55458d.mo80495c(1, -420, str, this.f55415y);
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: x */
    public float[] mo80601x() {
        Camera camera = this.f55415y;
        if (camera == null) {
            C13341g.m80815b("TECamera1", "getFOV: camera device is null.");
            this.f55458d.mo80495c(1, -439, "getFOV: camera device is null.", this.f55415y);
            return new float[]{-2.0f, -2.0f};
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f55416z = parameters;
            float[] fArr = {parameters.getVerticalViewAngle(), this.f55416z.getHorizontalViewAngle()};
            C13341g.m80814a("TECamera1", "Camera1:verticalFOV = " + fArr[0] + ",horizontalFOV = " + fArr[1]);
            return fArr;
        } catch (Exception e2) {
            e2.printStackTrace();
            return new float[]{-2.0f, -2.0f};
        }
    }

    @Override // com.p069ss.android.ttvecamera.AbstractC13324c
    /* JADX INFO: renamed from: x0 */
    public void mo80602x0() {
        C13341g.m80814a("TECamera1", "Camera stopPreview...");
        if (!this.f55457c || this.f55415y == null) {
            return;
        }
        this.f55457c = false;
        this.f55411J.set(false);
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f55415y.stopPreview();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            ajh0.m96973b("te_record_camera1_stop_preview_cost", jCurrentTimeMillis2);
            C13341g.m80819f("te_record_camera1_stop_preview_cost", Long.valueOf(jCurrentTimeMillis2));
        } catch (Exception e2) {
            C13341g.m80815b("TECamera1", "camera stopcapture failed: " + e2.getMessage());
        }
        this.f55412K = 0L;
        C13341g.m80818e("TECamera1", "Camera preview stopped!");
        this.f55458d.mo80496d(1, 4, 0, "TECamera1 preview stoped", this.f55415y);
    }
}
