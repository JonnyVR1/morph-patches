package com.p074ss.android.ttvecamera;

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
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p074ss.android.ttvecamera.cameracapabilitycollector.TECameraCapabilityCollector;
import com.p074ss.bytertc.audio.device.webrtc.WebRtcAudioRecord;
import com.p074ss.bytertc.audio.device.webrtc.WebRtcAudioTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import p153l.dsh0;
import p153l.hrh0;
import p153l.jrh0;
import p153l.nrh0;
import p153l.qqh0;
import p153l.rqh0;
import p153l.sqh0;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: renamed from: com.ss.android.ttvecamera.a */
/* JADX INFO: loaded from: classes11.dex */
public class C13485a extends AbstractC13487c {

    /* JADX INFO: renamed from: A */
    private nrh0 f56250A;

    /* JADX INFO: renamed from: B */
    private String f56251B;

    /* JADX INFO: renamed from: C */
    private int f56252C;

    /* JADX INFO: renamed from: D */
    private List<TEFrameSizei> f56253D;

    /* JADX INFO: renamed from: E */
    private List<TEFrameSizei> f56254E;

    /* JADX INFO: renamed from: F */
    private List<TEFrameSizei> f56255F;

    /* JADX INFO: renamed from: G */
    private List<Integer> f56256G;

    /* JADX INFO: renamed from: H */
    private float f56257H;

    /* JADX INFO: renamed from: I */
    private int f56258I;

    /* JADX INFO: renamed from: J */
    private AtomicBoolean f56259J;

    /* JADX INFO: renamed from: K */
    private long f56260K;

    /* JADX INFO: renamed from: L */
    private int f56261L;

    /* JADX INFO: renamed from: M */
    private boolean f56262M;

    /* JADX INFO: renamed from: y */
    Camera f56263y;

    /* JADX INFO: renamed from: z */
    private Camera.Parameters f56264z;

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.a$a */
    public class a implements Camera.ErrorCallback {
        public a() {
        }

        @Override // android.hardware.Camera.ErrorCallback
        public void onError(int i, Camera camera) {
            String str;
            int i2;
            hrh0.m136853b("te_record_camera_err_ret", i);
            if (i == 100) {
                str = "Camera server died!";
                i2 = -407;
            } else if (i == 2) {
                str = "Camera disconnected: " + i;
                i2 = -409;
            } else if (i != 1) {
                C13504g.m82006j("TECamera1", "Ignore camera error here: " + i);
                return;
            } else {
                str = "Camera unknown error: " + i;
                i2 = -410;
            }
            C13504g.m81998b("TECamera1", str);
            C13485a c13485a = C13485a.this;
            c13485a.mo81764f(c13485a.f56322t);
            C13485a.this.m81850z0();
            C13485a c13485a2 = C13485a.this;
            AbstractC13487c.a aVar = c13485a2.f56306d;
            if (aVar != null) {
                aVar.mo81677b(1, i2, str, c13485a2.f56263y);
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.a$b */
    public class b implements Camera.PictureCallback {
        public b(TECameraSettings.InterfaceC13474l interfaceC13474l) {
        }

        @Override // android.hardware.Camera.PictureCallback
        public void onPictureTaken(byte[] bArr, Camera camera) {
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.a$c */
    public class c implements Camera.PictureCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f56267a;

        public c(long j, TECameraSettings.InterfaceC13474l interfaceC13474l) {
            this.f56267a = j;
        }

        @Override // android.hardware.Camera.PictureCallback
        public void onPictureTaken(byte[] bArr, Camera camera) {
            C13504g.m82001e("TECamera1", "capture data arrive consume: " + (System.currentTimeMillis() - this.f56267a));
            Camera camera2 = C13485a.this.f56263y;
            if (camera2 != null) {
                camera2.stopPreview();
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.a$d */
    public class d implements Camera.AutoFocusCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ TEFocusSettings f56269a;

        public d(TEFocusSettings tEFocusSettings) {
            this.f56269a = tEFocusSettings;
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z, Camera camera) {
            String str;
            TEFocusSettings tEFocusSettings = this.f56269a;
            if (z) {
                str = "Camera Focus Succeed!";
                tEFocusSettings.m81703g().mo81717a(this.f56269a.m81704h(), C13485a.this.f56304b.f56181d, "Camera Focus Succeed!");
            } else {
                str = "Camera Focus Failed!";
                tEFocusSettings.m81703g().mo81717a(-1, C13485a.this.f56304b.f56181d, "Camera Focus Failed!");
            }
            C13504g.m82001e("TECamera1", str);
            if (this.f56269a.m81710n() && z) {
                return;
            }
            try {
                Camera.Parameters parameters = camera.getParameters();
                parameters.setFocusMode("continuous-video");
                camera.setParameters(parameters);
                C13485a c13485a = C13485a.this;
                c13485a.m81757T0(c13485a.f56261L);
            } catch (Exception e) {
                String str2 = "Error: focusAtPoint failed: " + e.toString();
                C13504g.m81998b("TECamera1", str2);
                C13485a c13485a2 = C13485a.this;
                c13485a2.f56306d.mo81678c(1, -411, str2, c13485a2.f56263y);
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.a$e */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f56271a;

        public e(int i) {
            this.f56271a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C13485a.this.mo81745C0(this.f56271a);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.a$f */
    public class f implements Camera.OnZoomChangeListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ TECameraSettings.InterfaceC13478p f56273a;

        public f(TECameraSettings.InterfaceC13478p interfaceC13478p) {
            this.f56273a = interfaceC13478p;
        }

        @Override // android.hardware.Camera.OnZoomChangeListener
        public void onZoomChange(int i, boolean z, Camera camera) {
            TECameraSettings.InterfaceC13478p interfaceC13478p = this.f56273a;
            if (interfaceC13478p != null) {
                interfaceC13478p.onChange(1, i, z);
            }
        }
    }

    private C13485a(Context context, AbstractC13487c.a aVar, Handler handler, AbstractC13487c.d dVar) {
        super(context, aVar, handler, dVar);
        this.f56251B = "";
        this.f56252C = 0;
        this.f56253D = new ArrayList();
        this.f56254E = new ArrayList();
        this.f56255F = new ArrayList();
        this.f56256G = null;
        this.f56257H = 100.0f;
        this.f56258I = 0;
        this.f56259J = new AtomicBoolean(false);
        this.f56260K = 0L;
        this.f56261L = 0;
        this.f56262M = false;
        this.f56304b = new TECameraSettings(context, 1);
        this.f56250A = new nrh0(1);
        this.f56322t = null;
    }

    /* JADX INFO: renamed from: J0 */
    private void m81731J0() {
        if (this.f56304b.f56174Z) {
            try {
                this.f56264z.setRecordingHint(false);
                this.f56263y.setParameters(this.f56264z);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: K0 */
    private void m81732K0() {
        if (this.f56304b.f56174Z) {
            try {
                this.f56264z.setRecordingHint(true);
                this.f56263y.setParameters(this.f56264z);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: L0 */
    public static List<TEFrameRateRange> m81733L0(List<int[]> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int[] iArr : list) {
            arrayList.add(new TEFrameRateRange(iArr[0], iArr[1]));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: M0 */
    public static List<TEFrameSizei> m81734M0(List<Camera.Size> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Camera.Size size : list) {
            arrayList.add(new TEFrameSizei(size.width, size.height));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: N0 */
    public static C13485a m81735N0(Context context, AbstractC13487c.a aVar, Handler handler, AbstractC13487c.d dVar) {
        return new C13485a(context, aVar, handler, dVar);
    }

    /* JADX INFO: renamed from: O0 */
    private int m81736O0(int i) {
        List<Integer> list;
        int size = this.f56256G.size() - 1;
        int i2 = 0;
        while (true) {
            int i3 = size - i2;
            list = this.f56256G;
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
        return Math.abs(i - list.get(i2).intValue()) > Math.abs(i - this.f56256G.get(size).intValue()) ? size : i2;
    }

    /* JADX INFO: renamed from: P0 */
    private List<TEFrameRateRange> m81737P0() {
        Camera.Parameters parameters = this.f56264z;
        if (parameters == null) {
            return null;
        }
        return m81733L0(parameters.getSupportedPreviewFpsRange());
    }

    /* JADX INFO: renamed from: Q0 */
    private List<TEFrameSizei> m81738Q0() {
        Camera.Parameters parameters = this.f56264z;
        if (parameters == null || parameters.getSupportedVideoSizes() == null) {
            this.f56255F.clear();
            return this.f56255F;
        }
        List<TEFrameSizei> listM81734M0 = m81734M0(this.f56264z.getSupportedVideoSizes());
        this.f56255F = listM81734M0;
        return listM81734M0;
    }

    /* JADX INFO: renamed from: R0 */
    private int m81739R0() {
        int[] iArrM81900s;
        TEFrameSizei tEFrameSizeiMo81686a;
        Camera camera = this.f56263y;
        if (camera == null) {
            C13504g.m81998b("TECamera1", "initCamera: Camera is not opened!");
            this.f56306d.mo81678c(1, WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_ILLEGAL_ARGUMENTS, "initCamera: Camera is not opened!", this.f56263y);
            return WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_ILLEGAL_ARGUMENTS;
        }
        Camera.Parameters parameters = camera.getParameters();
        this.f56264z = parameters;
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (this.f56318p != null) {
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
            iArrM81900s = this.f56318p.mo81685a(arrayList);
            if (z && iArrM81900s != null) {
                iArrM81900s[0] = iArrM81900s[0] * 1000;
                iArrM81900s[1] = iArrM81900s[1] * 1000;
            }
        } else {
            iArrM81900s = null;
        }
        if (iArrM81900s == null) {
            int iM81718a = TEFrameRateRange.m81718a(supportedPreviewFpsRange);
            TECameraSettings tECameraSettings = this.f56304b;
            iArrM81900s = C13496f.m81900s(tECameraSettings.f56163O, tECameraSettings.f56181d, tECameraSettings.f56179c.m81720c(iM81718a), supportedPreviewFpsRange);
            if (iArrM81900s == null && supportedPreviewFpsRange.size() > 0) {
                iArrM81900s = supportedPreviewFpsRange.get(supportedPreviewFpsRange.size() - 1);
            }
        }
        if (iArrM81900s == null) {
            wtq0.m207906a("fps config failed");
            return 0;
        }
        C13504g.m82001e("TECamera1", "Selected FPS Range: " + iArrM81900s[0] + Constants.SEPARATOR_COMMA + iArrM81900s[1]);
        this.f56306d.mo81680e(121, 0, new TEFrameRateRange(iArrM81900s[0], iArrM81900s[1]).toString(), null);
        AbstractC13487c.e eVar = this.f56317o;
        if (eVar != null) {
            TEFrameSizei previewSize = eVar.getPreviewSize(mo81753O());
            TECameraSettings tECameraSettings2 = this.f56304b;
            if (previewSize != null) {
                tECameraSettings2.f56207q = previewSize;
            } else {
                tECameraSettings2.f56207q = C13496f.m81883b(mo81753O(), this.f56304b.f56207q);
            }
        } else {
            this.f56304b.f56207q = C13496f.m81883b(mo81753O(), this.f56304b.f56207q);
        }
        C13504g.m82001e("TECamera1", "Preview Size:" + this.f56304b.f56207q);
        List<Integer> supportedPictureFormats = this.f56264z.getSupportedPictureFormats();
        int i4 = (this.f56304b.f56208q0 && supportedPictureFormats != null && supportedPictureFormats.contains(17)) ? 17 : 256;
        this.f56264z.setPictureFormat(i4);
        if (i4 == 256) {
            this.f56264z.setJpegQuality(100);
        }
        TECameraSettings tECameraSettings3 = this.f56304b;
        if (tECameraSettings3.f56225z) {
            List<TEFrameSizei> listM81734M0 = m81734M0(this.f56264z.getSupportedPictureSizes());
            TEFrameSizei tEFrameSizeiM81687a = this.f56304b.m81687a();
            TECameraSettings tECameraSettings4 = this.f56304b;
            tECameraSettings3.f56209r = C13496f.m81896o(listM81734M0, tEFrameSizeiM81687a, tECameraSettings4.f56215u, tECameraSettings4.f56223y);
        } else {
            if (this.f56316n != null) {
                List<TEFrameSizei> listM81734M1 = m81734M0(this.f56264z.getSupportedPictureSizes());
                ArrayList arrayList2 = new ArrayList();
                if (i4 == 17 && listM81734M1 != null) {
                    for (TEFrameSizei tEFrameSizei : listM81734M1) {
                        if (tEFrameSizei.width % 16 == 0 && tEFrameSizei.height % 16 == 0) {
                            arrayList2.add(tEFrameSizei);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        C13504g.m81998b("TECamera1", "final pic sizes is empty...");
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.addAll(listM81734M1);
                }
                tEFrameSizeiMo81686a = this.f56316n.mo81686a(arrayList2, m81734M0(this.f56264z.getSupportedPreviewSizes()));
            } else {
                tEFrameSizeiMo81686a = null;
            }
            TECameraSettings tECameraSettings5 = this.f56304b;
            if (tEFrameSizeiMo81686a != null) {
                tECameraSettings5.f56209r = tEFrameSizeiMo81686a;
            } else {
                List<TEFrameSizei> listMo81752N = mo81752N();
                TECameraSettings tECameraSettings6 = this.f56304b;
                tECameraSettings5.f56209r = C13496f.m81897p(listMo81752N, tECameraSettings6.f56207q, tECameraSettings6.f56209r);
            }
        }
        TEFrameSizei tEFrameSizei2 = this.f56304b.f56209r;
        if (tEFrameSizei2 != null) {
            this.f56264z.setPictureSize(tEFrameSizei2.width, tEFrameSizei2.height);
            C13504g.m82001e("TECamera1", "Picture Size:" + this.f56304b.f56209r);
        } else {
            C13504g.m81998b("TECamera1", "No closest supported picture size");
        }
        Camera.Parameters parameters2 = this.f56264z;
        TEFrameSizei tEFrameSizei3 = this.f56304b.f56207q;
        parameters2.setPreviewSize(tEFrameSizei3.width, tEFrameSizei3.height);
        Bundle bundle = this.f56304b.f56153E;
        if (bundle == null || !bundle.getBoolean("enable_dim_light_quality") || iArrM81900s[0] <= iArrM81900s[1]) {
            this.f56264z.setPreviewFpsRange(iArrM81900s[0], iArrM81900s[1]);
            if (this.f56304b.f56164P) {
                C13504g.m81997a("TECamera1", "use setRecordingHint");
                this.f56264z.setRecordingHint(true);
            }
        }
        this.f56264z.setWhiteBalance("auto");
        this.f56264z.setSceneMode("auto");
        this.f56264z.setPreviewFormat(this.f56304b.f56187g);
        this.f56264z.setExposureCompensation(this.f56258I);
        if (this.f56304b.f56169U) {
            if (this.f56264z.isVideoStabilizationSupported()) {
                this.f56264z.setVideoStabilization(true);
                hrh0.m136853b("te_record_camera_stabilization", 1L);
                this.f56306d.mo81680e(113, 1, "", this.f56263y);
            } else {
                hrh0.m136853b("te_record_camera_stabilization", 0L);
            }
        }
        nrh0 nrh0Var = this.f56250A;
        TECameraSettings tECameraSettings7 = this.f56304b;
        String strM164489g = nrh0Var.m164489g(tECameraSettings7.f56181d, this.f56264z, tECameraSettings7.f56153E.getBoolean("enableFrontFacingVideoContinueFocus"));
        this.f56251B = strM164489g;
        if (strM164489g != "") {
            this.f56264z.setFocusMode(strM164489g);
        } else {
            C13504g.m82006j("TECamera1", "No Supported Focus Mode for Facing" + this.f56304b.f56181d);
        }
        this.f56304b.f56159K.f56232a = this.f56264z.getMaxExposureCompensation();
        this.f56304b.f56159K.f56234c = this.f56264z.getMinExposureCompensation();
        this.f56304b.f56159K.f56235d = this.f56264z.getExposureCompensationStep();
        this.f56304b.f56159K.f56233b = this.f56264z.getExposureCompensation();
        if (this.f56304b.f56191i) {
            String str = this.f56264z.get("zsl-values");
            if (BLiveOperationTitleShowType.off.equals(this.f56264z.get("zsl")) && str != null && str.contains("on")) {
                this.f56264z.set("zsl", "on");
            }
            boolean zEquals = "on".equals(this.f56264z.get("zsl"));
            this.f56303a = zEquals;
            if (!zEquals && this.f56304b.f56191i && TextUtils.isEmpty(str) && rqh0.m182622a() && rqh0.m182623b()) {
                String str2 = this.f56264z.get("zsd-mode-values");
                if (BLiveOperationTitleShowType.off.equals(this.f56264z.get("zsd-mode")) && str2 != null && str2.contains("on")) {
                    this.f56264z.set("zsd-mode", "on");
                }
                this.f56303a = "on".equals(this.f56264z.get("zsd-mode"));
            }
        }
        C13504g.m82001e("TECamera1", String.format("%s zsl", this.f56303a ? "Enable" : "Disable"));
        this.f56256G = null;
        if (this.f56264z.isZoomSupported()) {
            this.f56256G = this.f56264z.getZoomRatios();
            this.f56314l = this.f56264z.getMaxZoom();
            Collections.sort(this.f56256G);
            this.f56257H = 100.0f;
        } else {
            C13504g.m81998b("TECamera1", "camera don't support zoom");
        }
        if (this.f56304b.f56153E.containsKey("enableShutterSound")) {
            try {
                this.f56263y.enableShutterSound(this.f56304b.f56153E.getBoolean("enableShutterSound"));
            } catch (Exception e2) {
                C13504g.m81998b("TECamera1", "unsupport enableShutterSound, " + e2.getMessage());
            }
        }
        this.f56263y.setParameters(this.f56264z);
        try {
            this.f56263y.setDisplayOrientation(0);
        } catch (Throwable unused) {
        }
        this.f56262M = false;
        return 0;
    }

    /* JADX INFO: renamed from: S0 */
    private int m81740S0(Cert cert) {
        int iM81739R0;
        dsh0.m117758a("TECamera1-innerOpen");
        int i = 0;
        this.f56258I = 0;
        this.f56322t = cert;
        int i2 = WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_ILLEGAL_ARGUMENTS;
        try {
            TECameraSettings tECameraSettings = this.f56304b;
            if (!tECameraSettings.f56198l0 || TextUtils.isEmpty(tECameraSettings.f56158J)) {
                int numberOfCameras = Camera.getNumberOfCameras();
                this.f56252C = numberOfCameras;
                hrh0.m136853b("te_record_camera_size", numberOfCameras);
                C13504g.m82001e("TECamera1", "innerOpen mNumberOfCameras: " + this.f56252C + ", current mDefaultCameraID:" + this.f56304b.f56185f);
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                for (int i3 = 0; i3 < this.f56252C; i3++) {
                    Camera.getCameraInfo(i3, cameraInfo);
                    C13504g.m82001e("TECamera1", "innerOpen cameraInfo facing: " + cameraInfo.facing + ", mCameraSettings.mFacing:" + this.f56304b.f56181d);
                    int i4 = cameraInfo.facing;
                    TECameraSettings tECameraSettings2 = this.f56304b;
                    if (i4 == tECameraSettings2.f56181d) {
                        tECameraSettings2.f56185f = i3;
                        break;
                    }
                }
            } else {
                Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                int i5 = Integer.parseInt(this.f56304b.f56158J);
                Camera.getCameraInfo(i5, cameraInfo2);
                TECameraSettings tECameraSettings3 = this.f56304b;
                tECameraSettings3.f56185f = i5;
                this.f56311i = tECameraSettings3.f56181d;
            }
            TECameraSettings tECameraSettings4 = this.f56304b;
            int i6 = tECameraSettings4.f56185f;
            if (i6 == -1 && this.f56252C > 0 && tECameraSettings4.f56194j0) {
                C13504g.m82006j("TECamera1", "innerOpen: camera info check error");
                throw new RuntimeException("CameraIDError");
            }
            if (i6 == -1 && this.f56252C > 0 && tECameraSettings4.f56192i0) {
                C13504g.m82006j("TECamera1", "innerOpen: camera info check, set CameraID to 0");
                this.f56304b.f56185f = 0;
            }
            C13504g.m82001e("TECamera1", "innerOpen: " + this.f56304b.f56185f);
            this.f56306d.mo81680e(106, 0, "will start camera1", null);
            dsh0.m117758a("TECamera1-innerOpen-openCamera");
            int i7 = this.f56304b.f56185f;
            if (i7 >= 0) {
                this.f56263y = sqh0.m187552c(cert, i7);
            } else {
                this.f56263y = sqh0.m187552c(cert, i7);
                this.f56304b.f56181d = 0;
                this.f56311i = 0;
                Camera.CameraInfo cameraInfo3 = new Camera.CameraInfo();
                for (int i8 = 0; i8 < this.f56252C; i8++) {
                    Camera.getCameraInfo(i8, cameraInfo3);
                    if (cameraInfo3.facing == this.f56311i) {
                        this.f56304b.f56185f = i8;
                        break;
                    }
                }
            }
            dsh0.m117759b();
            C13504g.m82001e("TECamera1", "innerOpen mNewFacing: " + this.f56311i);
            C13504g.m82001e("TECamera1", "innerOpen mCameraSettings.mDefaultCameraID: " + this.f56304b.f56185f);
            this.f56306d.mo81680e(107, 0, "did start camera1", null);
            if (this.f56263y == null) {
                C13504g.m81998b("TECamera1", "Open Camera Failed with ID:" + this.f56304b.f56185f);
                if (this.f56304b.f56185f == -1) {
                    i2 = -405;
                }
                this.f56306d.mo81681f(1, i2, null, this.f56263y);
                return i2;
            }
            try {
                dsh0.m117758a("TECamera1-initCamera");
                iM81739R0 = m81739R0();
                try {
                    dsh0.m117759b();
                    dsh0.m117758a("TECamera1-fillFeatures");
                    mo81771l();
                    dsh0.m117759b();
                    this.f56306d.mo81680e(1, 0, "TECamera1 features is ready", this.f56263y);
                } catch (Exception e2) {
                    e = e2;
                    i = iM81739R0;
                    C13504g.m81998b("TECamera1", "Open init Camera Failed!: " + Log.getStackTraceString(e));
                    C13495e.m81881a(e);
                    iM81739R0 = i;
                }
            } catch (Exception e3) {
                e = e3;
            }
            this.f56306d.mo81681f(1, iM81739R0, this, this.f56263y);
            dsh0.m117759b();
            return iM81739R0;
        } catch (RuntimeException e4) {
            C13504g.m81998b("TECamera1", "Open Camera Failed!: " + Log.getStackTraceString(e4));
            if (e4.getMessage() != null) {
                if (e4.getMessage().equals("Fail to connect to camera service")) {
                    i2 = -410;
                } else if (e4.getMessage().equals("Camera initialization failed")) {
                    i2 = -407;
                }
            }
            C13495e.m81881a(e4);
            this.f56306d.mo81681f(1, i2, null, this.f56263y);
            this.f56263y = null;
            return i2;
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: A0 */
    public void mo81741A0(TECameraSettings.InterfaceC13478p interfaceC13478p) {
        Camera camera = this.f56263y;
        if (camera == null) {
            C13504g.m81998b("TECamera1", "[VE_UI_TEST]Failed event: STOP_ZOOM. Code: -439. Reason: mCameraDevice is null");
            C13504g.m81998b("TECamera1", "stopZoom : Camera is null!");
            this.f56306d.mo81678c(1, -439, "stopZoom : Camera is null!", this.f56263y);
            return;
        }
        try {
            if (camera.getParameters().isSmoothZoomSupported() && interfaceC13478p != null && interfaceC13478p.enableSmooth()) {
                this.f56263y.stopSmoothZoom();
            }
        } catch (Exception e2) {
            C13504g.m81998b("TECamera1", "[VE_UI_TEST]Failed event: STOP_ZOOM. Code: -420. Reason: " + e2);
            String str = "Stop zoom failed : " + e2.toString();
            C13504g.m81998b("TECamera1", str);
            this.f56306d.mo81678c(1, -420, str, this.f56263y);
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: B */
    public int mo81742B() {
        String flashMode;
        Camera camera = this.f56263y;
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

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: B0 */
    public void mo81743B0(int i) {
        C13504g.m82006j("TECamera1", "Does not support switch mode for camera1");
        this.f56306d.mo81680e(WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR, WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR, "Does not support switch mode for camera1", this.f56263y);
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: C */
    public int mo81744C() {
        int iM81898q = this.f56313k;
        if (iM81898q < 0) {
            iM81898q = C13496f.m81898q(this.f56308f);
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.f56310h = this.f56311i;
        try {
            Camera.getCameraInfo(this.f56304b.f56185f, cameraInfo);
            int i = this.f56310h;
            int i2 = cameraInfo.orientation;
            if (i == 1) {
                this.f56312j = (540 - ((i2 + iM81898q) % 360)) % 360;
            } else {
                this.f56312j = ((i2 - iM81898q) + 360) % 360;
            }
            return this.f56312j;
        } catch (Exception e2) {
            this.f56306d.mo81678c(1, -405, "getFrameOrientation :" + e2.getMessage(), this.f56263y);
            return 0;
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: C0 */
    public void mo81745C0(int i) {
        String str;
        String str2;
        Handler handler;
        if (this.f56263y == null) {
            C13504g.m81998b("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: mCameraDevice is null");
            C13504g.m81998b("TECamera1", "switchFlashMode failed: Camera is not ready!");
            this.f56306d.mo81678c(1, -439, "switchFlashMode failed: Camera is not ready!", this.f56263y);
            this.f56306d.mo81682g(1, -439, i == 0 ? 0 : 1, "switchFlashMode failed: Camera is not ready!", this.f56263y);
            return;
        }
        if (this.f56260K != 0 && System.currentTimeMillis() - this.f56260K < 200 && (handler = this.f56307e) != null) {
            handler.postDelayed(new e(i), 200L);
            return;
        }
        this.f56262M = false;
        try {
            Camera.Parameters parameters = this.f56263y.getParameters();
            this.f56264z = parameters;
            List<String> supportedFlashModes = parameters.getSupportedFlashModes();
            if (supportedFlashModes != null) {
                if (i == 0) {
                    str2 = BLiveOperationTitleShowType.off;
                } else if (i == 1) {
                    str2 = "on";
                    this.f56262M = true;
                } else if (i == 2) {
                    str2 = "torch";
                } else if (i != 3) {
                    str2 = i != 4 ? null : "red-eye";
                } else {
                    str2 = "auto";
                }
                if (str2 != null && supportedFlashModes.contains(str2)) {
                    this.f56306d.mo81680e(104, 0, "camera1 will change flash mode ".concat(str2), null);
                    this.f56264z.setFlashMode(str2);
                    this.f56263y.setParameters(this.f56264z);
                    if (BLiveOperationTitleShowType.off.equalsIgnoreCase(str2) && this.f56304b.f56153E.getBoolean("enableSwitchFlashSleepToTakeEffect")) {
                        try {
                            Thread.sleep(200L);
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }
                    }
                    this.f56306d.mo81680e(105, 0, "camera1 did change flash mode ".concat(str2), null);
                    this.f56306d.mo81683h(1, 0, i == 0 ? 0 : 1, "torch success", this.f56263y);
                    return;
                }
            }
            if (supportedFlashModes != null) {
                str = "Camera does not support flash mode: " + i + "support list: " + supportedFlashModes.toString();
            } else {
                str = "Camera does not support flash mode: " + i;
            }
            String str3 = str;
            C13504g.m81998b("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -419. Reason: not support flash mode " + i);
            C13504g.m81998b("TECamera1", str3);
            this.f56306d.mo81678c(1, -419, str3, this.f56263y);
            this.f56306d.mo81682g(1, -419, i == 0 ? 0 : 1, str3, this.f56263y);
        } catch (Exception e3) {
            C13504g.m81998b("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -419. Reason: " + e3);
            String str4 = "Switch flash mode failed: " + e3.toString();
            C13504g.m81998b("TECamera1", str4);
            this.f56306d.mo81678c(1, -418, str4, this.f56263y);
            this.f56306d.mo81682g(1, -418, i == 0 ? 0 : 1, str4, this.f56263y);
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: D0 */
    public void mo81746D0(int i, int i2, TECameraSettings.InterfaceC13474l interfaceC13474l) {
        Camera camera = this.f56263y;
        if (camera == null) {
            C13504g.m81998b("TECamera1", "takePicture : camera is null");
            this.f56306d.mo81678c(1, -439, "takePicture : camera is null", this.f56263y);
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f56264z = parameters;
            if (parameters.getPictureSize().width != i || this.f56264z.getPictureSize().height != i2) {
                TEFrameSizei tEFrameSizeiM81897p = C13496f.m81897p(m81734M0(this.f56264z.getSupportedPictureSizes()), this.f56304b.m81687a(), new TEFrameSizei(i, i2));
                this.f56264z.setPictureSize(tEFrameSizeiM81897p.width, tEFrameSizeiM81897p.height);
                List<Integer> supportedPictureFormats = this.f56264z.getSupportedPictureFormats();
                if (this.f56304b.f56208q0 && supportedPictureFormats != null && supportedPictureFormats.contains(17)) {
                    this.f56264z.setPictureFormat(17);
                } else {
                    this.f56264z.setPictureFormat(256);
                    this.f56264z.setJpegQuality(100);
                }
                this.f56263y.setParameters(this.f56264z);
            }
            this.f56305c = false;
            this.f56263y.takePicture(null, null, new b(interfaceC13474l));
        } catch (Exception e2) {
            C13495e.m81881a(e2);
            if (interfaceC13474l != null) {
                interfaceC13474l.m81693a(m81840h(e2, -1000));
            }
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: E0 */
    public void mo81747E0(TECameraSettings.InterfaceC13474l interfaceC13474l) {
        if (this.f56263y == null) {
            C13504g.m81998b("TECamera1", "takePicture: camera is null.");
            this.f56306d.mo81678c(1, -439, "takePicture: camera is null.", this.f56263y);
            return;
        }
        try {
            this.f56305c = false;
            C13504g.m82001e("TECamera1", "takePicture size: " + this.f56304b.f56209r.toString());
            this.f56263y.takePicture(null, null, new c(System.currentTimeMillis(), interfaceC13474l));
        } catch (Exception e2) {
            C13495e.m81881a(e2);
            if (interfaceC13474l != null) {
                interfaceC13474l.m81693a(m81840h(e2, -1000));
            }
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: F0 */
    public void mo81748F0(boolean z) {
        this.f56262M = false;
        if (this.f56263y == null) {
            C13504g.m81998b("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: mCameraDevice is null");
            C13504g.m81998b("TECamera1", "toggleTorch : Camera is not ready!");
            this.f56306d.mo81678c(1, -439, "toggleTorch : Camera is not ready!", this.f56263y);
            this.f56306d.mo81682g(1, -439, z ? 1 : 0, "toggleTorch : Camera is not ready!", this.f56263y);
            return;
        }
        if (this.f56304b.f56181d == 1) {
            C13504g.m81998b("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -416. Reason: not support torch");
            C13504g.m82006j("TECamera1", "Front camera does not support torch!");
            this.f56306d.mo81680e(-416, -416, "Front camera does not support torch!", this.f56263y);
            this.f56306d.mo81682g(1, -416, z ? 1 : 0, "Front camera does not support torch!", this.f56263y);
            return;
        }
        try {
            this.f56306d.mo81680e(104, 0, "camera1 will change flash mode " + z, null);
            Camera.Parameters parameters = this.f56263y.getParameters();
            this.f56264z = parameters;
            parameters.setFlashMode(z ? "torch" : BLiveOperationTitleShowType.off);
            this.f56263y.setParameters(this.f56264z);
            this.f56306d.mo81680e(105, 0, "camera1 did change flash mode " + z, null);
            this.f56306d.mo81683h(1, 0, z ? 1 : 0, "toggleTorch " + z, this.f56263y);
        } catch (Exception e2) {
            C13504g.m81998b("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -417. Reason: " + e2);
            String str = "Toggle torch failed: " + e2.toString();
            C13504g.m81998b("TECamera1", str);
            this.f56306d.mo81678c(1, -417, str, this.f56263y);
            this.f56306d.mo81682g(1, -417, z ? 1 : 0, str, this.f56263y);
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: H0 */
    public void mo81749H0(float f2, TECameraSettings.InterfaceC13478p interfaceC13478p) {
        List<Integer> list = this.f56256G;
        if (list == null || this.f56263y == null) {
            return;
        }
        float f3 = this.f56257H * f2;
        this.f56257H = f3;
        try {
            if (f3 < list.get(0).intValue()) {
                this.f56257H = this.f56256G.get(0).intValue();
            }
            float f4 = this.f56257H;
            List<Integer> list2 = this.f56256G;
            if (f4 > list2.get(list2.size() - 1).intValue()) {
                List<Integer> list3 = this.f56256G;
                this.f56257H = list3.get(list3.size() - 1).intValue();
            }
            Camera.Parameters parameters = this.f56263y.getParameters();
            if (parameters == null || !parameters.isZoomSupported()) {
                C13504g.m81998b("TECamera1", "[VE_UI_TEST]Failed event: SET_ZOOM. Code: -420. Reason: getParameters is null");
                C13504g.m81998b("TECamera1", "setZoom failed for getParameters null");
                return;
            }
            int iM81736O0 = m81736O0((int) this.f56257H);
            if (parameters.getZoom() != iM81736O0) {
                parameters.setZoom(iM81736O0);
                this.f56263y.setParameters(parameters);
                if (interfaceC13478p != null) {
                    interfaceC13478p.onChange(1, this.f56256G.get(iM81736O0).intValue() / 100.0f, true);
                }
            }
        } catch (Exception e2) {
            C13504g.m81998b("TECamera1", "[VE_UI_TEST]Failed event: SET_ZOOM. Code: -420. Reason: " + e2);
            C13504g.m81998b("TECamera1", "setZoom failed, " + e2.getMessage());
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: I */
    public int[] mo81750I() {
        Camera.Size pictureSize;
        Camera camera = this.f56263y;
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

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: J */
    public int[] mo81751J() {
        Camera camera = this.f56263y;
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

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: N */
    public List<TEFrameSizei> mo81752N() {
        Camera.Parameters parameters = this.f56264z;
        if (parameters == null) {
            this.f56254E.clear();
            return this.f56254E;
        }
        List<TEFrameSizei> listM81734M0 = m81734M0(parameters.getSupportedPictureSizes());
        this.f56254E = listM81734M0;
        return listM81734M0;
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: O */
    public List<TEFrameSizei> mo81753O() {
        Camera.Parameters parameters = this.f56264z;
        if (parameters == null) {
            this.f56253D.clear();
            return this.f56253D;
        }
        List<TEFrameSizei> listM81734M0 = m81734M0(parameters.getSupportedPreviewSizes());
        this.f56253D = listM81734M0;
        return listM81734M0;
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: Q */
    public boolean mo81754Q() {
        Camera.Parameters parameters;
        C13504g.m82001e("TECamera1", "isAutoExposureLockSupported...");
        if (this.f56263y == null || (parameters = this.f56264z) == null || !this.f56305c) {
            return false;
        }
        return parameters.isAutoExposureLockSupported();
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: R */
    public boolean mo81755R() {
        Camera.Parameters parameters;
        C13504g.m82001e("TECamera1", "isAutoFocusLockSupported...");
        Camera camera = this.f56263y;
        if (camera == null || (parameters = this.f56264z) == null || !this.f56305c) {
            this.f56306d.mo81678c(1, -439, "setAutoFocusLock failed. ： Camera is null.", camera);
            return false;
        }
        try {
            return parameters.getSupportedFocusModes().contains("fixed");
        } catch (Exception unused) {
            this.f56306d.mo81680e(-433, -433, "isAutoFocusLockSupported failed", this.f56263y);
            return false;
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: T */
    public boolean mo81756T() {
        Camera.Parameters parameters;
        try {
            return (this.f56263y == null || (parameters = this.f56264z) == null || parameters.getSupportedWhiteBalance() == null || !this.f56264z.isAutoWhiteBalanceLockSupported()) ? false : true;
        } catch (Exception e2) {
            C13504g.m81998b("TECamera1", "Unsupported whileBalance!: " + e2.toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: T0 */
    public void m81757T0(int i) {
        C13504g.m81997a("TECamera1", "Camera start face detect");
        if (!this.f56305c || this.f56263y == null || this.f56264z.getMaxNumDetectedFaces() <= 0) {
            return;
        }
        try {
            if (i == 1) {
                if (this.f56310h == 1) {
                    this.f56263y.startFaceDetection();
                    C13504g.m82001e("TECamera1", "use faceae for front");
                    return;
                }
                return;
            }
            if (i == 2) {
                if (this.f56310h == 0) {
                    this.f56263y.startFaceDetection();
                    C13504g.m82001e("TECamera1", "use faceae for rear");
                    return;
                }
                return;
            }
            if (i == 3) {
                this.f56263y.startFaceDetection();
                C13504g.m82001e("TECamera1", "use faceae for all");
            }
        } catch (Exception unused) {
            C13504g.m81998b("TECamera1", "camera start face detect failed");
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: U */
    public boolean mo81758U() {
        C13504g.m82001e("TECamera1", "isSupportedExposureCompensation...");
        if (this.f56263y == null || this.f56264z == null || !this.f56305c) {
            return false;
        }
        return this.f56304b.f56159K.m81689a();
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: V */
    public boolean mo81759V() {
        Bundle bundle = m81824A().get(this.f56304b.f56156H);
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean("camera_torch_supported", false);
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: W */
    public int mo81760W(TECameraSettings tECameraSettings, Cert cert) {
        super.mo81760W(tECameraSettings, cert);
        this.f56304b = tECameraSettings;
        this.f56311i = tECameraSettings.f56181d;
        return m81740S0(cert);
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: Z */
    public void mo81761Z(TECameraSettings.InterfaceC13476n interfaceC13476n) {
        if (interfaceC13476n == null) {
            C13504g.m81998b("TECamera1", "ShaderZoomCallback is null, do nothing!");
            return;
        }
        Camera camera = this.f56263y;
        if (camera == null) {
            C13504g.m81998b("TECamera1", "queryShaderZoomStep : Camera is null!");
            this.f56306d.mo81678c(1, -439, "queryShaderZoomStep : Camera is null!", this.f56263y);
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
                interfaceC13476n.m81694a(0.0f);
            } else {
                interfaceC13476n.m81694a(((float) Math.pow(((zoomRatios.get(1).intValue() - zoomRatios.get(0).intValue()) / 100.0f) + 1.0f, 0.5d)) - 1.0f);
            }
        } catch (Exception e2) {
            String str = "Query shader zoom step failed : " + e2.toString();
            C13504g.m81998b("TECamera1", str);
            this.f56306d.mo81678c(1, -420, str, this.f56263y);
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: a0 */
    public void mo81762a0(TECameraSettings.InterfaceC13478p interfaceC13478p, boolean z) {
        if (interfaceC13478p == null) {
            C13504g.m81998b("TECamera1", "ZoomCallback is null, do nothing!");
            return;
        }
        Camera camera = this.f56263y;
        if (camera == null) {
            C13504g.m81998b("TECamera1", "queryZoomAbility : Camera is null!");
            this.f56306d.mo81678c(1, -439, "queryZoomAbility : Camera is null!", this.f56263y);
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            float maxZoom = parameters.getMaxZoom();
            this.f56314l = maxZoom;
            if (!z) {
                interfaceC13478p.onZoomSupport(1, parameters.isZoomSupported(), parameters.isSmoothZoomSupported(), parameters.getMaxZoom(), parameters.getZoomRatios());
            } else {
                interfaceC13478p.onZoomSupport(1, parameters.isZoomSupported(), parameters.isSmoothZoomSupported(), this.f56256G.get((int) maxZoom).intValue() / 100.0f, parameters.getZoomRatios());
            }
        } catch (Exception e2) {
            String str = "Query zoom ability failed : " + e2.toString();
            C13504g.m81998b("TECamera1", str);
            this.f56306d.mo81678c(1, -420, str, this.f56263y);
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: c */
    public void mo81763c() {
        C13504g.m81997a("TECamera1", "cancelFocus...");
        Camera camera = this.f56263y;
        if (camera != null) {
            try {
                camera.cancelAutoFocus();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: f */
    public void mo81764f(Cert cert) {
        this.f56262M = false;
        C13504g.m82001e("TECamera1", "Camera close start...");
        if (this.f56263y != null) {
            if (this.f56305c) {
                try {
                    C13504g.m82001e("TECamera1", "Camera close torch...");
                    Camera.Parameters parameters = this.f56263y.getParameters();
                    this.f56264z = parameters;
                    parameters.setFlashMode(BLiveOperationTitleShowType.off);
                    this.f56263y.setParameters(this.f56264z);
                    C13504g.m82001e("TECamera1", "Camera stopPreview...");
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    this.f56263y.stopPreview();
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    C13504g.m82001e("TECamera1", "Camera stopPreview end...");
                    hrh0.m136853b("te_record_camera1_stop_preview_cost", jCurrentTimeMillis2);
                    C13504g.m82002f("te_record_camera1_stop_preview_cost", Long.valueOf(jCurrentTimeMillis2));
                    int iM146743g = this.f56309g.m146743g();
                    jrh0 jrh0Var = this.f56309g;
                    if (iM146743g == 1) {
                        jrh0Var.m146744h().setOnFrameAvailableListener(null, null);
                    } else if (jrh0Var.m146743g() == 4) {
                        this.f56263y.setPreviewCallbackWithBuffer(null);
                    }
                } catch (Exception e2) {
                    C13504g.m81998b("TECamera1", "Close camera failed: " + e2.getMessage());
                }
                this.f56305c = false;
            }
            try {
                this.f56263y.setErrorCallback(null);
                this.f56306d.mo81680e(108, 0, "will close camera1", null);
                sqh0.m187551b(cert, this.f56263y);
                this.f56306d.mo81680e(109, 0, "did close camera1", null);
            } catch (Exception e3) {
                C13504g.m81998b("TECamera1", "Camera release failed: " + e3.getMessage());
            }
            this.f56259J.set(false);
            this.f56263y = null;
            C13504g.m82001e("TECamera1", "Camera closed end!");
            this.f56306d.mo81684i(1, this, this.f56263y);
        }
        this.f56322t = null;
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: g */
    public void mo81765g() {
        dsh0.m117758a("TECamera1-collectCameraCapabilities");
        if (!m81831S()) {
            dsh0.m117759b();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (this.f56264z != null) {
                this.f56324v.putOpt("camera_id", Integer.valueOf(this.f56304b.f56185f));
                if (this.f56264z.isZoomSupported()) {
                    this.f56324v.putOpt("camera_zoom_max_ability", Integer.valueOf(this.f56264z.getMaxZoom()));
                }
                List<TEFrameSizei> listMo81753O = mo81753O();
                if (listMo81753O != null) {
                    this.f56323u.m81851a(new TECameraCapabilityCollector.C13491a(TECameraCapabilityCollector.Capability.PREVIEW_SIZE, TECameraCapabilityCollector.DataType.STRING, this.f56304b.f56156H + "=" + listMo81753O.toString()));
                    JSONArray jSONArray = new JSONArray();
                    for (TEFrameSizei tEFrameSizei : listMo81753O) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.putOpt("width", Integer.valueOf(tEFrameSizei.width));
                        jSONObject.putOpt("height", Integer.valueOf(tEFrameSizei.height));
                        jSONArray.put(jSONObject);
                    }
                    this.f56324v.putOpt("preview_size_lit", jSONArray);
                }
            }
        } catch (Exception unused) {
        }
        List<int[]> supportedPreviewFpsRange = this.f56264z.getSupportedPreviewFpsRange();
        StringBuilder sb = new StringBuilder(this.f56304b.f56156H + "=");
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
                this.f56323u.m81851a(new TECameraCapabilityCollector.C13491a(TECameraCapabilityCollector.Capability.FPS_RANGE, TECameraCapabilityCollector.DataType.STRING, sb.toString()));
                this.f56324v.putOpt("fps_range_list", jSONArray2);
            }
        } catch (Exception unused2) {
        }
        this.f56323u.m81854d();
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C13504g.m82001e("TECamera1", "collectCameraCapabilities consume: " + jCurrentTimeMillis2);
        hrh0.m136853b("te_record_camera_collect_capbilities_cost", jCurrentTimeMillis2);
        this.f56325w = true;
        dsh0.m117759b();
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: g0 */
    public void mo81766g0(boolean z) {
        Camera.Parameters parameters;
        C13504g.m82001e("TECamera1", "setAutoExposureLock...");
        Camera camera = this.f56263y;
        if (camera == null || (parameters = this.f56264z) == null || !this.f56305c) {
            this.f56306d.mo81678c(1, -439, "setAutoExposureLock failed. ： Camera is null.", camera);
            return;
        }
        if (!parameters.isAutoExposureLockSupported()) {
            C13504g.m82006j("TECamera1", "Current camera doesn't support ae lock.");
            this.f56306d.mo81680e(-426, -426, "Current camera doesn't support ae lock.", this.f56263y);
            return;
        }
        try {
            this.f56264z.setAutoExposureLock(z);
            this.f56263y.setParameters(this.f56264z);
        } catch (Exception e2) {
            String str = "Error: setAutoExposureLock failed: " + e2.toString();
            C13504g.m81998b("TECamera1", str);
            this.f56306d.mo81680e(-427, -427, str, this.f56263y);
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: h0 */
    public void mo81767h0(boolean z) {
        C13504g.m82001e("TECamera1", "setAutoFocusLock...");
        Camera camera = this.f56263y;
        if (camera == null || this.f56264z == null || !this.f56305c) {
            this.f56306d.mo81678c(1, -439, "setAutoFocusLock failed. ： Camera is null.", camera);
            return;
        }
        if (!mo81755R()) {
            C13504g.m82006j("TECamera1", "Current camera doesn't support af lock.");
            this.f56306d.mo81680e(-433, -433, "Current camera doesn't support af lock.", this.f56263y);
            return;
        }
        Camera.Parameters parameters = this.f56264z;
        try {
            if (z) {
                parameters.setFocusMode("fixed");
            } else {
                parameters.setFocusMode("continuous-video");
            }
            this.f56263y.setParameters(this.f56264z);
        } catch (Exception e2) {
            String str = "Error: setAutoFocusLock failed: " + e2.toString();
            C13504g.m81998b("TECamera1", str);
            this.f56306d.mo81680e(-427, -427, str, this.f56263y);
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: j */
    public void mo81768j() {
        if (this.f56263y == null || this.f56264z == null) {
            return;
        }
        C13504g.m81997a("TECamera1", "enableCaf...");
        try {
            if (this.f56264z.getSupportedFocusModes().contains("continuous-video")) {
                this.f56263y.cancelAutoFocus();
                this.f56264z.setFocusMode("continuous-video");
                this.f56263y.setParameters(this.f56264z);
            }
        } catch (Throwable th) {
            String str = "Error: focusAtPoint failed: " + th.toString();
            C13504g.m81998b("TECamera1", str);
            this.f56306d.mo81678c(1, -411, str, this.f56263y);
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: j0 */
    public boolean mo81769j0(int i) {
        String str;
        int i2;
        this.f56258I = i;
        C13504g.m82001e("TECamera1", "setExposureCompensation... value: " + i);
        int i3 = -413;
        if (this.f56263y == null || this.f56264z == null || !this.f56305c || !this.f56304b.f56159K.m81689a()) {
            Camera camera = this.f56263y;
            if (camera == null || this.f56264z == null || !this.f56305c) {
                this.f56306d.mo81678c(1, -439, "setExposureCompensation ： Camera is null.", camera);
                str = "setExposureCompensation ： Camera is null.";
            } else {
                i3 = -414;
                str = "Unsupported exposure compensation!";
            }
            this.f56306d.mo81678c(1, i3, str, this.f56263y);
            i2 = i3;
        } else {
            TECameraSettings.C13466d c13466d = this.f56304b.f56159K;
            if (i > c13466d.f56232a || i < c13466d.f56234c) {
                this.f56306d.mo81678c(1, -415, "Invalid exposure: " + i, this.f56263y);
                return false;
            }
            try {
                this.f56264z.setExposureCompensation(i);
                this.f56263y.setParameters(this.f56264z);
                this.f56304b.f56159K.f56233b = this.f56264z.getExposureCompensation();
                StringBuilder sb = new StringBuilder("EC = ");
                sb.append(this.f56304b.f56159K.f56233b);
                sb.append(", EV = ");
                TECameraSettings.C13466d c13466d2 = this.f56304b.f56159K;
                sb.append(c13466d2.f56233b * c13466d2.f56235d);
                C13504g.m81997a("TECamera1", sb.toString());
                str = null;
                i2 = 0;
            } catch (Exception e2) {
                str = "Error: setExposureCompensation failed: " + e2.toString();
                this.f56306d.mo81678c(1, -413, str, this.f56263y);
                i2 = -1;
            }
        }
        boolean z = i2 == 0;
        if (!z) {
            C13504g.m81998b("TECamera1", "setExposureCompensation failed: " + str);
        }
        return z;
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: k0 */
    public void mo81770k0(Bundle bundle) {
        super.mo81770k0(bundle);
        if (bundle == null) {
            return;
        }
        Bundle bundle2 = this.f56320r.get(this.f56304b.f56156H);
        for (String str : bundle.keySet()) {
            if (TECameraSettings.C13473k.m81692a(str, bundle.get(str)) && TextUtils.equals(str, "support_light_soft")) {
                bundle2.putBoolean("support_light_soft", bundle.getBoolean("support_light_soft"));
            }
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: l */
    public Bundle mo81771l() {
        Camera.Parameters parameters;
        this.f56304b.f56156H = this.f56304b.f56181d + "";
        Bundle bundleMo81771l = super.mo81771l();
        if (bundleMo81771l != null) {
            bundleMo81771l.putParcelableArrayList("support_preview_sizes", (ArrayList) mo81753O());
            bundleMo81771l.putParcelableArrayList("support_picture_sizes", (ArrayList) mo81752N());
            bundleMo81771l.putParcelableArrayList("support_video_sizes", (ArrayList) m81738Q0());
            bundleMo81771l.putParcelableArrayList("camera_support_fps_range", (ArrayList) m81737P0());
            bundleMo81771l.putParcelable("camera_preview_size", this.f56304b.f56207q);
            try {
                bundleMo81771l.putBoolean("camera_torch_supported", (this.f56263y == null || (parameters = this.f56264z) == null || parameters.getSupportedFlashModes() == null) ? false : true);
                return bundleMo81771l;
            } catch (Exception e2) {
                C13504g.m81998b("TECamera1", "Get camera torch information failed: " + e2.toString());
                bundleMo81771l.putBoolean("camera_torch_supported", false);
            }
        }
        return bundleMo81771l;
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: m */
    public void mo81772m(TEFocusSettings tEFocusSettings) {
        Camera camera = this.f56263y;
        if (camera == null) {
            C13504g.m81998b("TECamera1", "focusAtPoint: camera is null.");
            tEFocusSettings.m81703g().mo81717a(-439, this.f56304b.f56181d, "focusAtPoint: camera is null.");
            this.f56306d.mo81678c(1, -439, "focusAtPoint: camera is null.", this.f56263y);
            return;
        }
        boolean z = false;
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f56264z = parameters;
            if (!this.f56250A.m164487e(parameters, this.f56251B)) {
                C13504g.m81998b("TECamera1", "Error: not support focus.");
                this.f56306d.mo81680e(-412, -412, "Error: not support focus.", this.f56263y);
                if (!this.f56250A.m164488f(this.f56304b.f56181d, this.f56264z) || !tEFocusSettings.m81712p()) {
                    tEFocusSettings.m81703g().mo81717a(-412, this.f56304b.f56181d, "Error: not support focus.");
                    return;
                }
                tEFocusSettings.m81700d();
                this.f56264z.setMeteringAreas(this.f56250A.m164484b(tEFocusSettings.m81706j(), tEFocusSettings.m81705i(), tEFocusSettings.m81702f(), tEFocusSettings.m81707k(), tEFocusSettings.m81708l(), this.f56304b.f56183e, tEFocusSettings.m81701e()));
                this.f56263y.setParameters(this.f56264z);
                return;
            }
            if (tEFocusSettings.m81712p() && this.f56250A.m164488f(this.f56304b.f56181d, this.f56264z)) {
                tEFocusSettings.m81700d();
                this.f56264z.setMeteringAreas(this.f56250A.m164484b(tEFocusSettings.m81706j(), tEFocusSettings.m81705i(), tEFocusSettings.m81702f(), tEFocusSettings.m81707k(), tEFocusSettings.m81708l(), this.f56304b.f56183e, tEFocusSettings.m81701e()));
            }
            if (!tEFocusSettings.m81711o()) {
                this.f56263y.setParameters(this.f56264z);
                C13504g.m82001e("TECamera1", "focus is not enable!");
                return;
            }
            tEFocusSettings.m81699c();
            this.f56264z.setFocusAreas(this.f56250A.m164483a(tEFocusSettings.m81706j(), tEFocusSettings.m81705i(), tEFocusSettings.m81702f(), tEFocusSettings.m81707k(), tEFocusSettings.m81708l(), this.f56304b.f56183e, tEFocusSettings.m81701e()));
            this.f56263y.cancelAutoFocus();
            this.f56264z.setFocusMode("auto");
            if (this.f56262M && !tEFocusSettings.m81709m()) {
                this.f56264z.setFlashMode(BLiveOperationTitleShowType.off);
                z = true;
            }
            this.f56263y.setParameters(this.f56264z);
            this.f56263y.autoFocus(new d(tEFocusSettings));
            if (z) {
                try {
                    this.f56264z.setFlashMode("on");
                    this.f56263y.setParameters(this.f56264z);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e2) {
            String str = "Error: focusAtPoint failed: " + e2.toString();
            C13504g.m81998b("TECamera1", str);
            tEFocusSettings.m81703g().mo81717a(-411, this.f56304b.f56181d, str);
            this.f56306d.mo81678c(1, -411, str, this.f56263y);
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: n */
    public void mo81773n(Cert cert) {
        super.mo81773n(cert);
        C13504g.m82001e("TECamera1", "force close camera: " + this.f56263y);
        try {
            Camera camera = this.f56263y;
            if (camera != null) {
                sqh0.m187551b(cert, camera);
                this.f56263y = null;
            }
        } catch (Exception unused) {
            C13504g.m81998b("TECamera1", "force close camera failed");
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: n0 */
    public void mo81774n0(int i, int i2) {
        TECameraSettings tECameraSettings = this.f56304b;
        tECameraSettings.f56149A = true;
        TEFrameSizei tEFrameSizei = tECameraSettings.f56209r;
        tEFrameSizei.width = i;
        tEFrameSizei.height = i2;
        mo81785x0();
        mo81781u0();
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: o0 */
    public void mo81775o0() {
        Camera.Parameters parameters = this.f56264z;
        if (parameters == null) {
            return;
        }
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        int iM81718a = TEFrameRateRange.m81718a(supportedPreviewFpsRange);
        TECameraSettings tECameraSettings = this.f56304b;
        int[] iArrM81900s = C13496f.m81900s(tECameraSettings.f56163O, tECameraSettings.f56181d, tECameraSettings.f56179c.m81720c(iM81718a), supportedPreviewFpsRange);
        this.f56264z.setPreviewFpsRange(iArrM81900s[0], iArrM81900s[1]);
        this.f56306d.mo81680e(121, 0, new TEFrameRateRange(iArrM81900s[0], iArrM81900s[1]).toString(), null);
        this.f56263y.setParameters(this.f56264z);
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: p */
    public TEFrameSizei mo81776p(float f2, TEFrameSizei tEFrameSizei) {
        Camera camera = this.f56263y;
        if (camera == null) {
            C13504g.m81998b("TECamera1", "getBestPreviewSize: Camera is not opened!");
            return null;
        }
        if (this.f56264z == null) {
            this.f56264z = camera.getParameters();
        }
        return tEFrameSizei != null ? C13496f.m81883b(mo81753O(), tEFrameSizei) : C13496f.m81884c(mo81753O(), f2);
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: q */
    public JSONObject mo81777q() {
        return this.f56324v;
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: r */
    public int[] mo81778r() {
        Camera camera = this.f56263y;
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

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: r0 */
    public void mo81779r0(int i) {
        super.mo81779r0(i);
        if (i == 0) {
            m81731J0();
        } else if (i == 1) {
            m81732K0();
        } else {
            wg3.m206174a("un support scene");
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: t0 */
    public void mo81780t0(boolean z, String str) {
        Camera camera = this.f56263y;
        if (camera == null || !this.f56305c) {
            C13504g.m81998b("TECamera1", "setWhileBalance : Camera is null!");
            this.f56306d.mo81678c(1, -439, "setWhileBalance : Camera is null!", this.f56263y);
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f56264z = parameters;
            List<String> supportedWhiteBalance = parameters.getSupportedWhiteBalance();
            if (supportedWhiteBalance != null && supportedWhiteBalance.contains(str)) {
                this.f56264z.setWhiteBalance(str);
                this.f56263y.setParameters(this.f56264z);
                return;
            }
            String str2 = "SupportWBList has no value: " + str;
            C13504g.m81998b("TECamera1", str2);
            this.f56306d.mo81678c(1, -424, str2, this.f56263y);
        } catch (Exception e2) {
            String str3 = "Set WhileBalance failed: " + e2.toString();
            C13504g.m81998b("TECamera1", str3);
            this.f56306d.mo81678c(1, -424, str3, this.f56263y);
        }
    }

    /* JADX WARN: Code duplicated, block: B:88:0x02c8  */
    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: u0 */
    public void mo81781u0() {
        int i;
        dsh0.m117758a("TECamera1-startCapture");
        C13504g.m82001e("TECamera1", "Camera startPreview...");
        if (this.f56305c) {
            C13504g.m82006j("TECamera1", "Camera is previewing...");
            return;
        }
        if (this.f56263y != null) {
            try {
                jrh0 jrh0Var = this.f56309g;
                if (jrh0Var == null) {
                    throw new AndroidRuntimeException("ProviderManager is null");
                }
                AbstractC13487c.e eVar = this.f56317o;
                if (eVar != null) {
                    jrh0Var.m146748l(eVar);
                }
                if (this.f56264z == null) {
                    this.f56264z = this.f56263y.getParameters();
                }
                int iM146746j = this.f56309g.m146746j(m81734M0(this.f56264z.getSupportedPreviewSizes()), this.f56304b.f56207q);
                if (iM146746j != 0) {
                    C13504g.m81998b("TECamera1", "Init provider failed, ret = " + iM146746j);
                    return;
                }
                int iM146743g = this.f56309g.m146743g();
                jrh0 jrh0Var2 = this.f56309g;
                if (iM146743g == 1) {
                    if (jrh0Var2.m146744h() == null) {
                        C13504g.m81998b("TECamera1", "SurfaceTexture is null");
                        throw new AndroidRuntimeException("SurfaceTexture is null");
                    }
                    this.f56263y.setPreviewTexture(this.f56309g.m146744h());
                } else {
                    if (jrh0Var2.m146743g() != 4) {
                        C13504g.m81998b("TECamera1", "Unsupported camera provider type : " + this.f56309g.m146743g());
                        return;
                    }
                    qqh0 qqh0Var = (qqh0) this.f56309g.m146742f();
                    if (qqh0Var == null) {
                        throw new AndroidRuntimeException("Provider is null");
                    }
                    if (this.f56259J.compareAndSet(false, true)) {
                        for (byte[] bArr : qqh0Var.m177502r(3)) {
                            this.f56263y.addCallbackBuffer(bArr);
                        }
                    }
                    this.f56263y.setPreviewCallbackWithBuffer(qqh0Var.m177503s());
                    if (this.f56309g.m146744h() != null) {
                        this.f56263y.setPreviewTexture(this.f56309g.m146744h());
                    }
                }
                if (this.f56256G != null && Float.compare(this.f56304b.f56222x0, 1.0f) != 0) {
                    float f2 = this.f56257H * this.f56304b.f56222x0;
                    this.f56257H = f2;
                    if (f2 < this.f56256G.get(0).intValue()) {
                        this.f56257H = this.f56256G.get(0).intValue();
                    } else {
                        float f3 = this.f56257H;
                        List<Integer> list = this.f56256G;
                        if (f3 > list.get(list.size() - 1).intValue()) {
                            List<Integer> list2 = this.f56256G;
                            this.f56257H = list2.get(list2.size() - 1).intValue();
                        }
                    }
                    this.f56264z.setZoom(m81736O0((int) this.f56257H));
                    this.f56263y.setParameters(this.f56264z);
                }
                TEFrameSizei tEFrameSizeiM146739c = this.f56309g.m146739c();
                if (tEFrameSizeiM146739c != null) {
                    if (this.f56264z.getPreviewSize().width != tEFrameSizeiM146739c.width || this.f56264z.getPreviewSize().height != tEFrameSizeiM146739c.height) {
                        this.f56264z.setPreviewSize(tEFrameSizeiM146739c.width, tEFrameSizeiM146739c.height);
                        TECameraSettings tECameraSettings = this.f56304b;
                        if (tECameraSettings.f56225z) {
                            if (tECameraSettings.f56149A) {
                                tECameraSettings.f56149A = false;
                            } else {
                                List<TEFrameSizei> listM81734M0 = m81734M0(this.f56264z.getSupportedPictureSizes());
                                TECameraSettings tECameraSettings2 = this.f56304b;
                                tECameraSettings.f56209r = C13496f.m81896o(listM81734M0, tEFrameSizeiM146739c, tECameraSettings2.f56215u, tECameraSettings2.f56223y);
                            }
                            Camera.Parameters parameters = this.f56264z;
                            TEFrameSizei tEFrameSizei = this.f56304b.f56209r;
                            parameters.setPictureSize(tEFrameSizei.width, tEFrameSizei.height);
                        }
                        this.f56263y.setParameters(this.f56264z);
                    }
                    this.f56306d.mo81680e(50, 0, tEFrameSizeiM146739c.toString(), this.f56263y);
                }
                TECameraSettings tECameraSettings3 = this.f56304b;
                if (tECameraSettings3.f56149A) {
                    tECameraSettings3.f56149A = false;
                    Camera.Parameters parameters2 = this.f56264z;
                    TEFrameSizei tEFrameSizei2 = tECameraSettings3.f56209r;
                    parameters2.setPictureSize(tEFrameSizei2.width, tEFrameSizei2.height);
                    this.f56263y.setParameters(this.f56264z);
                    C13504g.m82001e("TECamera1", "force set picture size: " + this.f56304b.f56209r.width + BaseSei.f14624X + this.f56304b.f56209r.height);
                }
                this.f56263y.setErrorCallback(new a());
                this.f56304b.f56183e = mo81744C();
                C13504g.m81997a("TECamera1", "Camera rotation = " + this.f56304b.f56183e);
                long jCurrentTimeMillis = System.currentTimeMillis();
                C13504g.m82001e("TECamera1", "Camera startPreview start");
                this.f56263y.startPreview();
                C13504g.m82001e("TECamera1", "Camera startPreview end");
                int i2 = this.f56304b.f56153E.getInt("useCameraFaceDetect");
                this.f56261L = i2;
                m81757T0(i2);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                this.f56260K = jCurrentTimeMillis2;
                long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
                hrh0.m136853b("te_record_camera1_start_preview_cost", j);
                C13504g.m82002f("te_record_camera1_start_preview_cost", Long.valueOf(j));
                this.f56305c = true;
                this.f56306d.mo81676a(1, 0, 0, "TECamera1 preview", this.f56263y);
            } catch (Exception e2) {
                C13504g.m81998b("TECamera1", "startPreview: Error " + e2.getMessage());
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
                C13495e.m81881a(e2);
                this.f56305c = false;
                try {
                    if (this.f56315m == 0) {
                        this.f56306d.mo81680e(108, 0, "preview error will close camera1", null);
                        sqh0.m187551b(this.f56322t, this.f56263y);
                        this.f56306d.mo81680e(109, 0, "preview error did close camera1", null);
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                if (this.f56315m == 0) {
                    this.f56263y = null;
                }
                this.f56306d.mo81677b(1, i3, e2.getMessage(), this.f56263y);
            }
        }
        dsh0.m117759b();
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: v */
    public int mo81782v() {
        return 1;
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: w0 */
    public void mo81783w0(float f2, TECameraSettings.InterfaceC13478p interfaceC13478p) {
        Camera camera = this.f56263y;
        if (camera == null) {
            C13504g.m81998b("TECamera1", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -439. Reason: mCameraDevice is null");
            C13504g.m81998b("TECamera1", "startZoom : Camera is null!");
            this.f56306d.mo81678c(1, -439, "startZoom : Camera is null!", this.f56263y);
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f56264z = parameters;
            if (!parameters.isZoomSupported() && !this.f56264z.isSmoothZoomSupported()) {
                C13504g.m81998b("TECamera1", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -421. Reason: camera is not support zoom");
                C13504g.m81998b("TECamera1", "Camera is not support zoom!");
                this.f56306d.mo81678c(1, -421, "Camera is not support zoom!", this.f56263y);
                return;
            }
            int iMin = (int) Math.min(this.f56264z.getMaxZoom(), f2);
            if (this.f56264z.isSmoothZoomSupported() && interfaceC13478p != null && interfaceC13478p.enableSmooth()) {
                this.f56263y.startSmoothZoom(iMin);
                this.f56263y.setZoomChangeListener(new f(interfaceC13478p));
                return;
            }
            this.f56264z.setZoom(iMin);
            this.f56263y.setParameters(this.f56264z);
            if (interfaceC13478p != null) {
                interfaceC13478p.onChange(1, iMin, true);
            }
        } catch (Exception e2) {
            C13504g.m81998b("TECamera1", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + e2);
            String str = "Start zoom failed : " + e2.toString();
            C13504g.m81998b("TECamera1", str);
            this.f56306d.mo81678c(1, -420, str, this.f56263y);
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: x */
    public float[] mo81784x() {
        Camera camera = this.f56263y;
        if (camera == null) {
            C13504g.m81998b("TECamera1", "getFOV: camera device is null.");
            this.f56306d.mo81678c(1, -439, "getFOV: camera device is null.", this.f56263y);
            return new float[]{-2.0f, -2.0f};
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f56264z = parameters;
            float[] fArr = {parameters.getVerticalViewAngle(), this.f56264z.getHorizontalViewAngle()};
            C13504g.m81997a("TECamera1", "Camera1:verticalFOV = " + fArr[0] + ",horizontalFOV = " + fArr[1]);
            return fArr;
        } catch (Exception e2) {
            e2.printStackTrace();
            return new float[]{-2.0f, -2.0f};
        }
    }

    @Override // com.p074ss.android.ttvecamera.AbstractC13487c
    /* JADX INFO: renamed from: x0 */
    public void mo81785x0() {
        C13504g.m81997a("TECamera1", "Camera stopPreview...");
        if (!this.f56305c || this.f56263y == null) {
            return;
        }
        this.f56305c = false;
        this.f56259J.set(false);
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f56263y.stopPreview();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            hrh0.m136853b("te_record_camera1_stop_preview_cost", jCurrentTimeMillis2);
            C13504g.m82002f("te_record_camera1_stop_preview_cost", Long.valueOf(jCurrentTimeMillis2));
        } catch (Exception e2) {
            C13504g.m81998b("TECamera1", "camera stopcapture failed: " + e2.getMessage());
        }
        this.f56260K = 0L;
        C13504g.m82001e("TECamera1", "Camera preview stopped!");
        this.f56306d.mo81679d(1, 4, 0, "TECamera1 preview stoped", this.f56263y);
    }
}
