package p149l;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.p069ss.android.ttvecamera.AbstractC13324c;
import com.p069ss.android.ttvecamera.C13333f;
import com.p069ss.android.ttvecamera.C13341g;
import com.p069ss.android.ttvecamera.TECameraFrame;
import com.p069ss.android.ttvecamera.TEFrameSizei;
import java.lang.reflect.Array;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class jih0 extends bjh0 {

    /* JADX INFO: renamed from: p */
    private static final String f118104p = "jih0";

    /* JADX INFO: renamed from: k */
    Camera.PreviewCallback f118105k;

    /* JADX INFO: renamed from: l */
    private int f118106l;

    /* JADX INFO: renamed from: m */
    private SurfaceTexture f118107m;

    /* JADX INFO: renamed from: n */
    private byte[][] f118108n;

    /* JADX INFO: renamed from: o */
    private int f118109o;

    /* JADX INFO: renamed from: l.jih0$a */
    public class C17791a implements Camera.PreviewCallback {
        public C17791a() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            if (jih0.this.m141653q(bArr)) {
                TEFrameSizei tEFrameSizei = jih0.this.f75907c;
                TECameraFrame tECameraFrame = new TECameraFrame(tEFrameSizei.width, tEFrameSizei.height, System.currentTimeMillis() * 1000);
                tECameraFrame.m80487d(bArr, jih0.this.f75908d.m80642D(), TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_NV21, jih0.this.f75908d.m80663u().f55333d);
                jih0.this.m102177k(tECameraFrame);
            }
            if (camera != null) {
                camera.addCallbackBuffer(bArr);
            }
        }
    }

    public jih0(cjh0.C16167a c16167a, AbstractC13324c abstractC13324c) {
        super(c16167a, abstractC13324c);
        this.f118106l = 0;
        this.f118108n = null;
        this.f118109o = 0;
        this.f118107m = c16167a.f81185d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public boolean m141653q(byte[] bArr) {
        TEFrameSizei tEFrameSizei;
        int i;
        int length = bArr != null ? bArr.length : 0;
        if (length <= 0 || (tEFrameSizei = this.f75907c) == null || (i = this.f118106l) >= 3) {
            return true;
        }
        this.f118106l = i + 1;
        int i2 = tEFrameSizei.width * tEFrameSizei.height;
        if (i2 > length) {
            C13341g.m80815b(f118104p, "checkPreviewData failed: mSize: " + this.f75907c + ", length: " + length);
            return false;
        }
        int i3 = i2 / 300;
        int i4 = i3 / 2;
        byte b = bArr[0];
        byte b2 = bArr[i2];
        for (int i5 = 0; i5 < 300; i5++) {
            int i6 = i5 * i3;
            int i7 = (i5 * i4) + i2;
            if (i6 >= length || i7 >= length) {
                break;
            }
            if (b != bArr[i6] || b2 != bArr[i7]) {
                return true;
            }
        }
        return false;
    }

    @Override // p149l.bjh0
    /* JADX INFO: renamed from: d */
    public Surface mo102170d() {
        return null;
    }

    @Override // p149l.bjh0
    /* JADX INFO: renamed from: e */
    public SurfaceTexture mo102171e() {
        return this.f118107m;
    }

    @Override // p149l.bjh0
    /* JADX INFO: renamed from: g */
    public int mo102173g() {
        return 4;
    }

    @Override // p149l.bjh0
    @RequiresApi(api = 15)
    /* JADX INFO: renamed from: i */
    public int mo102175i(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f75907c = C13333f.m80700b(list, tEFrameSizei);
        }
        SurfaceTexture surfaceTexture = this.f118107m;
        if (surfaceTexture != null) {
            TEFrameSizei tEFrameSizei2 = this.f75907c;
            surfaceTexture.setDefaultBufferSize(tEFrameSizei2.width, tEFrameSizei2.height);
        }
        this.f118105k = new C17791a();
        return 0;
    }

    /* JADX INFO: renamed from: r */
    public byte[][] m141654r(int i) {
        TEFrameSizei tEFrameSizei = this.f75907c;
        int i2 = ((tEFrameSizei.width * tEFrameSizei.height) * 3) / 2;
        String str = f118104p;
        C13341g.m80814a(str, "getBuffers current bufferSize: " + i2 + " mCallbackBytebufferSize:" + this.f118109o);
        int i3 = this.f118109o;
        if (i2 > i3 || i3 == 0) {
            this.f118108n = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i, i2);
            C13341g.m80814a(str, "new mCallbackBytebuffer size :" + i2);
            this.f118109o = i2;
        }
        return this.f118108n;
    }

    /* JADX INFO: renamed from: s */
    public Camera.PreviewCallback m141655s() {
        return this.f118105k;
    }

    @Override // p149l.bjh0
    /* JADX INFO: renamed from: l */
    public void mo102178l() {
    }
}
