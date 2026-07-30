package p153l;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.p074ss.android.ttvecamera.AbstractC13487c;
import com.p074ss.android.ttvecamera.C13496f;
import com.p074ss.android.ttvecamera.C13504g;
import com.p074ss.android.ttvecamera.TECameraFrame;
import com.p074ss.android.ttvecamera.TEFrameSizei;
import java.lang.reflect.Array;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class qqh0 extends irh0 {

    /* JADX INFO: renamed from: p */
    private static final String f159004p = "qqh0";

    /* JADX INFO: renamed from: k */
    Camera.PreviewCallback f159005k;

    /* JADX INFO: renamed from: l */
    private int f159006l;

    /* JADX INFO: renamed from: m */
    private SurfaceTexture f159007m;

    /* JADX INFO: renamed from: n */
    private byte[][] f159008n;

    /* JADX INFO: renamed from: o */
    private int f159009o;

    /* JADX INFO: renamed from: l.qqh0$a */
    public class C19628a implements Camera.PreviewCallback {
        public C19628a() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            if (qqh0.this.m177501q(bArr)) {
                TEFrameSizei tEFrameSizei = qqh0.this.f116563c;
                TECameraFrame tECameraFrame = new TECameraFrame(tEFrameSizei.width, tEFrameSizei.height, System.currentTimeMillis() * 1000);
                tECameraFrame.m81670d(bArr, qqh0.this.f116564d.m81825D(), TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_NV21, qqh0.this.f116564d.m81846u().f56181d);
                qqh0.this.m141825k(tECameraFrame);
            }
            if (camera != null) {
                camera.addCallbackBuffer(bArr);
            }
        }
    }

    public qqh0(jrh0.C18019a c18019a, AbstractC13487c abstractC13487c) {
        super(c18019a, abstractC13487c);
        this.f159006l = 0;
        this.f159008n = null;
        this.f159009o = 0;
        this.f159007m = c18019a.f122357d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public boolean m177501q(byte[] bArr) {
        TEFrameSizei tEFrameSizei;
        int i;
        int length = bArr != null ? bArr.length : 0;
        if (length <= 0 || (tEFrameSizei = this.f116563c) == null || (i = this.f159006l) >= 3) {
            return true;
        }
        this.f159006l = i + 1;
        int i2 = tEFrameSizei.width * tEFrameSizei.height;
        if (i2 > length) {
            C13504g.m81998b(f159004p, "checkPreviewData failed: mSize: " + this.f116563c + ", length: " + length);
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

    @Override // p153l.irh0
    /* JADX INFO: renamed from: d */
    public Surface mo99911d() {
        return null;
    }

    @Override // p153l.irh0
    /* JADX INFO: renamed from: e */
    public SurfaceTexture mo99912e() {
        return this.f159007m;
    }

    @Override // p153l.irh0
    /* JADX INFO: renamed from: g */
    public int mo99913g() {
        return 4;
    }

    @Override // p153l.irh0
    @RequiresApi(api = 15)
    /* JADX INFO: renamed from: i */
    public int mo99915i(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f116563c = C13496f.m81883b(list, tEFrameSizei);
        }
        SurfaceTexture surfaceTexture = this.f159007m;
        if (surfaceTexture != null) {
            TEFrameSizei tEFrameSizei2 = this.f116563c;
            surfaceTexture.setDefaultBufferSize(tEFrameSizei2.width, tEFrameSizei2.height);
        }
        this.f159005k = new C19628a();
        return 0;
    }

    /* JADX INFO: renamed from: r */
    public byte[][] m177502r(int i) {
        TEFrameSizei tEFrameSizei = this.f116563c;
        int i2 = ((tEFrameSizei.width * tEFrameSizei.height) * 3) / 2;
        String str = f159004p;
        C13504g.m81997a(str, "getBuffers current bufferSize: " + i2 + " mCallbackBytebufferSize:" + this.f159009o);
        int i3 = this.f159009o;
        if (i2 > i3 || i3 == 0) {
            this.f159008n = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i, i2);
            C13504g.m81997a(str, "new mCallbackBytebuffer size :" + i2);
            this.f159009o = i2;
        }
        return this.f159008n;
    }

    /* JADX INFO: renamed from: s */
    public Camera.PreviewCallback m177503s() {
        return this.f159005k;
    }

    @Override // p153l.irh0
    /* JADX INFO: renamed from: l */
    public void mo99916l() {
    }
}
