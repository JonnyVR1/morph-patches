package p009l;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p008ss.android.ttvecamera.AbstractC0726c;
import com.p008ss.android.ttvecamera.C0735f;
import com.p008ss.android.ttvecamera.C0743g;
import com.p008ss.android.ttvecamera.TECameraFrame;
import com.p008ss.android.ttvecamera.TEFrameSizei;
import java.lang.reflect.Array;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class jih0 extends bjh0 {

    /* JADX INFO: renamed from: p */
    private static final String f15177p = "jih0";

    /* JADX INFO: renamed from: k */
    Camera.PreviewCallback f15178k;

    /* JADX INFO: renamed from: l */
    private int f15179l;

    /* JADX INFO: renamed from: m */
    private SurfaceTexture f15180m;

    /* JADX INFO: renamed from: n */
    private byte[][] f15181n;

    /* JADX INFO: renamed from: o */
    private int f15182o;

    /* JADX INFO: renamed from: l.jih0$a */
    public class C0975a implements Camera.PreviewCallback {
        public C0975a() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            if (jih0.this.m17121q(bArr)) {
                TEFrameSizei tEFrameSizei = jih0.this.f10130c;
                TECameraFrame tECameraFrame = new TECameraFrame(tEFrameSizei.width, tEFrameSizei.height, System.currentTimeMillis() * 1000);
                tECameraFrame.m10838d(bArr, jih0.this.f10131d.m10993D(), TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_NV21, jih0.this.f10131d.m11014u().f8939d);
                jih0.this.m12046k(tECameraFrame);
            }
            if (camera != null) {
                camera.addCallbackBuffer(bArr);
            }
        }
    }

    public jih0(cjh0.C0813a c0813a, AbstractC0726c abstractC0726c) {
        super(c0813a, abstractC0726c);
        this.f15179l = 0;
        this.f15181n = null;
        this.f15182o = 0;
        this.f15180m = c0813a.f10629d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public boolean m17121q(byte[] bArr) {
        TEFrameSizei tEFrameSizei;
        int i;
        int length = bArr != null ? bArr.length : 0;
        if (length <= 0 || (tEFrameSizei = this.f10130c) == null || (i = this.f15179l) >= 3) {
            return true;
        }
        this.f15179l = i + 1;
        int i2 = tEFrameSizei.width * tEFrameSizei.height;
        if (i2 > length) {
            C0743g.m11166b(f15177p, "checkPreviewData failed: mSize: " + this.f10130c + ", length: " + length);
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

    @Override // p009l.bjh0
    /* JADX INFO: renamed from: d */
    public Surface mo12039d() {
        return null;
    }

    @Override // p009l.bjh0
    /* JADX INFO: renamed from: e */
    public SurfaceTexture mo12040e() {
        return this.f15180m;
    }

    @Override // p009l.bjh0
    /* JADX INFO: renamed from: g */
    public int mo12042g() {
        return 4;
    }

    @Override // p009l.bjh0
    @RequiresApi(api = MediaPickerParamsObject.FROM_PROFILE_GAME)
    /* JADX INFO: renamed from: i */
    public int mo12044i(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f10130c = C0735f.m11051b(list, tEFrameSizei);
        }
        SurfaceTexture surfaceTexture = this.f15180m;
        if (surfaceTexture != null) {
            TEFrameSizei tEFrameSizei2 = this.f10130c;
            surfaceTexture.setDefaultBufferSize(tEFrameSizei2.width, tEFrameSizei2.height);
        }
        this.f15178k = new C0975a();
        return 0;
    }

    /* JADX INFO: renamed from: r */
    public byte[][] m17122r(int i) {
        TEFrameSizei tEFrameSizei = this.f10130c;
        int i2 = ((tEFrameSizei.width * tEFrameSizei.height) * 3) / 2;
        String str = f15177p;
        C0743g.m11165a(str, "getBuffers current bufferSize: " + i2 + " mCallbackBytebufferSize:" + this.f15182o);
        int i3 = this.f15182o;
        if (i2 > i3 || i3 == 0) {
            this.f15181n = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i, i2);
            C0743g.m11165a(str, "new mCallbackBytebuffer size :" + i2);
            this.f15182o = i2;
        }
        return this.f15181n;
    }

    /* JADX INFO: renamed from: s */
    public Camera.PreviewCallback m17123s() {
        return this.f15178k;
    }

    @Override // p009l.bjh0
    /* JADX INFO: renamed from: l */
    public void mo12047l() {
    }
}
