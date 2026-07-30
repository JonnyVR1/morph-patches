package p149l;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.view.Surface;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p069ss.android.ttvecamera.AbstractC13324c;
import com.p069ss.android.ttvecamera.C13323b;
import com.p069ss.android.ttvecamera.C13341g;
import com.p069ss.android.ttvecamera.TECameraFrame;
import com.p069ss.android.ttvecamera.TEFrameSizei;
import com.sina.weibo.sdk.constant.WBConstants;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class cjh0 {

    /* JADX INFO: renamed from: b */
    public static final String f81180b = "cjh0";

    /* JADX INFO: renamed from: a */
    private bjh0 f81181a;

    /* JADX INFO: renamed from: a */
    public void m107159a(@NonNull C16167a c16167a, @NonNull AbstractC13324c abstractC13324c) {
        bjh0 bjh0Var = this.f81181a;
        if (bjh0Var != null) {
            bjh0Var.mo102179m();
        }
        TECameraFrame.ETEPixelFormat eTEPixelFormat = c16167a.f81189h;
        if (eTEPixelFormat == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Recorder) {
            this.f81181a = new tjh0(c16167a, abstractC13324c);
        } else if (eTEPixelFormat == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES) {
            this.f81181a = new vjh0(c16167a, abstractC13324c);
        } else if (!(abstractC13324c instanceof C13323b)) {
            this.f81181a = new jih0(c16167a, abstractC13324c);
        } else if (c16167a.f81187f > 0) {
            this.f81181a = new rjh0(c16167a, abstractC13324c);
        } else {
            this.f81181a = new qjh0(c16167a, abstractC13324c);
        }
        abstractC13324c.m80659p0(this);
    }

    /* JADX INFO: renamed from: b */
    public TEFrameSizei m107160b() {
        return !this.f81181a.m102176j() ? this.f81181a.f75907c : new TEFrameSizei(1080, WBConstants.SDK_NEW_PAY_VERSION);
    }

    /* JADX INFO: renamed from: c */
    public TEFrameSizei m107161c() {
        if (this.f81181a.m102176j()) {
            return this.f81181a.m102169c();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public Surface m107162d() {
        bjh0 bjh0Var = this.f81181a;
        if (bjh0Var != null) {
            return bjh0Var.mo102170d();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public Surface[] m107163e() {
        bjh0 bjh0Var = this.f81181a;
        if (bjh0Var != null) {
            return bjh0Var.mo102172f();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public bjh0 m107164f() {
        return this.f81181a;
    }

    /* JADX INFO: renamed from: g */
    public int m107165g() {
        bjh0 bjh0Var = this.f81181a;
        if (bjh0Var != null) {
            return bjh0Var.mo102173g();
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public SurfaceTexture m107166h() {
        bjh0 bjh0Var = this.f81181a;
        if (bjh0Var != null) {
            return bjh0Var.mo102171e();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public int m107167i(@NonNull StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        bjh0 bjh0Var = this.f81181a;
        if (bjh0Var == null || bjh0Var == null) {
            return -112;
        }
        return bjh0Var.mo102174h(streamConfigurationMap, tEFrameSizei);
    }

    /* JADX INFO: renamed from: j */
    public int m107168j(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        bjh0 bjh0Var = this.f81181a;
        if (bjh0Var != null) {
            return bjh0Var.mo102175i(list, tEFrameSizei);
        }
        return -112;
    }

    /* JADX INFO: renamed from: k */
    public void m107169k() {
        bjh0 bjh0Var = this.f81181a;
        if (bjh0Var != null) {
            bjh0Var.mo102179m();
            this.f81181a = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m107170l(AbstractC13324c.e eVar) {
        bjh0 bjh0Var = this.f81181a;
        if (bjh0Var == null) {
            C13341g.m80815b(f81180b, "provider is null!");
        } else {
            bjh0Var.m102181o(eVar);
        }
    }

    /* JADX INFO: renamed from: l.cjh0$a */
    public static class C16167a {

        /* JADX INFO: renamed from: a */
        public boolean f81182a;

        /* JADX INFO: renamed from: b */
        public TEFrameSizei f81183b;

        /* JADX INFO: renamed from: c */
        public bjh0.InterfaceC15877c f81184c;

        /* JADX INFO: renamed from: d */
        public SurfaceTexture f81185d;

        /* JADX INFO: renamed from: e */
        public int f81186e;

        /* JADX INFO: renamed from: f */
        public int f81187f;

        /* JADX INFO: renamed from: g */
        public Surface f81188g;

        /* JADX INFO: renamed from: h */
        public TECameraFrame.ETEPixelFormat f81189h;

        public C16167a(@NonNull C16167a c16167a) {
            this.f81182a = true;
            this.f81187f = 0;
            this.f81189h = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Count;
            this.f81182a = c16167a.f81182a;
            this.f81183b = c16167a.f81183b;
            this.f81184c = c16167a.f81184c;
            this.f81185d = c16167a.f81185d;
            this.f81186e = c16167a.f81186e;
            this.f81187f = c16167a.f81187f;
        }

        /* JADX INFO: renamed from: a */
        public void m107171a(@NonNull C16167a c16167a) {
            this.f81182a = c16167a.f81182a;
            this.f81183b = c16167a.f81183b;
            this.f81184c = c16167a.f81184c;
            this.f81185d = c16167a.f81185d;
            this.f81186e = c16167a.f81186e;
            this.f81187f = c16167a.f81187f;
        }

        /* JADX INFO: renamed from: b */
        public boolean m107172b(C16167a c16167a) {
            if (c16167a == null || this.f81182a != c16167a.f81182a) {
                return false;
            }
            TEFrameSizei tEFrameSizei = this.f81183b;
            int i = tEFrameSizei.width;
            TEFrameSizei tEFrameSizei2 = c16167a.f81183b;
            return i == tEFrameSizei2.width && tEFrameSizei.height == tEFrameSizei2.height && this.f81184c == c16167a.f81184c && this.f81185d == c16167a.f81185d && this.f81186e == c16167a.f81186e && this.f81187f == c16167a.f81187f;
        }

        @NonNull
        public String toString() {
            return "ProviderSettings: [mIsPreview = " + this.f81182a + ", mSize = " + this.f81183b + ", mListener = " + this.f81184c + ", mSurfaceTexture = " + this.f81185d + ", mTextureOES = " + this.f81186e + ", mImageReaderCount = " + this.f81187f + Constants.AES_SUFFIX;
        }

        public C16167a(TEFrameSizei tEFrameSizei, @NonNull bjh0.InterfaceC15877c interfaceC15877c, boolean z, SurfaceTexture surfaceTexture, TECameraFrame.ETEPixelFormat eTEPixelFormat) {
            this.f81182a = true;
            this.f81187f = 0;
            TECameraFrame.ETEPixelFormat eTEPixelFormat2 = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_YUV420;
            this.f81183b = tEFrameSizei;
            this.f81184c = interfaceC15877c;
            this.f81185d = surfaceTexture;
            this.f81182a = z;
            this.f81189h = eTEPixelFormat;
        }

        public C16167a(TEFrameSizei tEFrameSizei, @NonNull bjh0.InterfaceC15877c interfaceC15877c, boolean z, SurfaceTexture surfaceTexture, int i) {
            this.f81182a = true;
            this.f81187f = 0;
            this.f81189h = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Count;
            this.f81183b = tEFrameSizei;
            this.f81184c = interfaceC15877c;
            this.f81185d = surfaceTexture;
            this.f81186e = i;
            this.f81182a = z;
            this.f81189h = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES;
        }
    }
}
