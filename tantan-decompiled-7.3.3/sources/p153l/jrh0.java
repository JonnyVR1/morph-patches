package p153l;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.view.Surface;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p074ss.android.ttvecamera.AbstractC13487c;
import com.p074ss.android.ttvecamera.C13486b;
import com.p074ss.android.ttvecamera.C13504g;
import com.p074ss.android.ttvecamera.TECameraFrame;
import com.p074ss.android.ttvecamera.TEFrameSizei;
import com.sina.weibo.sdk.constant.WBConstants;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class jrh0 {

    /* JADX INFO: renamed from: b */
    public static final String f122352b = "jrh0";

    /* JADX INFO: renamed from: a */
    private irh0 f122353a;

    /* JADX INFO: renamed from: a */
    public void m146737a(@NonNull C18019a c18019a, @NonNull AbstractC13487c abstractC13487c) {
        irh0 irh0Var = this.f122353a;
        if (irh0Var != null) {
            irh0Var.mo99917m();
        }
        TECameraFrame.ETEPixelFormat eTEPixelFormat = c18019a.f122361h;
        if (eTEPixelFormat == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Recorder) {
            this.f122353a = new ash0(c18019a, abstractC13487c);
        } else if (eTEPixelFormat == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES) {
            this.f122353a = new csh0(c18019a, abstractC13487c);
        } else if (!(abstractC13487c instanceof C13486b)) {
            this.f122353a = new qqh0(c18019a, abstractC13487c);
        } else if (c18019a.f122359f > 0) {
            this.f122353a = new yrh0(c18019a, abstractC13487c);
        } else {
            this.f122353a = new xrh0(c18019a, abstractC13487c);
        }
        abstractC13487c.m81842p0(this);
    }

    /* JADX INFO: renamed from: b */
    public TEFrameSizei m146738b() {
        return !this.f122353a.m141824j() ? this.f122353a.f116563c : new TEFrameSizei(1080, WBConstants.SDK_NEW_PAY_VERSION);
    }

    /* JADX INFO: renamed from: c */
    public TEFrameSizei m146739c() {
        if (this.f122353a.m141824j()) {
            return this.f122353a.m141822c();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public Surface m146740d() {
        irh0 irh0Var = this.f122353a;
        if (irh0Var != null) {
            return irh0Var.mo99911d();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public Surface[] m146741e() {
        irh0 irh0Var = this.f122353a;
        if (irh0Var != null) {
            return irh0Var.mo141823f();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public irh0 m146742f() {
        return this.f122353a;
    }

    /* JADX INFO: renamed from: g */
    public int m146743g() {
        irh0 irh0Var = this.f122353a;
        if (irh0Var != null) {
            return irh0Var.mo99913g();
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public SurfaceTexture m146744h() {
        irh0 irh0Var = this.f122353a;
        if (irh0Var != null) {
            return irh0Var.mo99912e();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public int m146745i(@NonNull StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        irh0 irh0Var = this.f122353a;
        if (irh0Var == null || irh0Var == null) {
            return -112;
        }
        return irh0Var.mo99914h(streamConfigurationMap, tEFrameSizei);
    }

    /* JADX INFO: renamed from: j */
    public int m146746j(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        irh0 irh0Var = this.f122353a;
        if (irh0Var != null) {
            return irh0Var.mo99915i(list, tEFrameSizei);
        }
        return -112;
    }

    /* JADX INFO: renamed from: k */
    public void m146747k() {
        irh0 irh0Var = this.f122353a;
        if (irh0Var != null) {
            irh0Var.mo99917m();
            this.f122353a = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m146748l(AbstractC13487c.e eVar) {
        irh0 irh0Var = this.f122353a;
        if (irh0Var == null) {
            C13504g.m81998b(f122352b, "provider is null!");
        } else {
            irh0Var.m141827o(eVar);
        }
    }

    /* JADX INFO: renamed from: l.jrh0$a */
    public static class C18019a {

        /* JADX INFO: renamed from: a */
        public boolean f122354a;

        /* JADX INFO: renamed from: b */
        public TEFrameSizei f122355b;

        /* JADX INFO: renamed from: c */
        public irh0.InterfaceC17785c f122356c;

        /* JADX INFO: renamed from: d */
        public SurfaceTexture f122357d;

        /* JADX INFO: renamed from: e */
        public int f122358e;

        /* JADX INFO: renamed from: f */
        public int f122359f;

        /* JADX INFO: renamed from: g */
        public Surface f122360g;

        /* JADX INFO: renamed from: h */
        public TECameraFrame.ETEPixelFormat f122361h;

        public C18019a(@NonNull C18019a c18019a) {
            this.f122354a = true;
            this.f122359f = 0;
            this.f122361h = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Count;
            this.f122354a = c18019a.f122354a;
            this.f122355b = c18019a.f122355b;
            this.f122356c = c18019a.f122356c;
            this.f122357d = c18019a.f122357d;
            this.f122358e = c18019a.f122358e;
            this.f122359f = c18019a.f122359f;
        }

        /* JADX INFO: renamed from: a */
        public void m146749a(@NonNull C18019a c18019a) {
            this.f122354a = c18019a.f122354a;
            this.f122355b = c18019a.f122355b;
            this.f122356c = c18019a.f122356c;
            this.f122357d = c18019a.f122357d;
            this.f122358e = c18019a.f122358e;
            this.f122359f = c18019a.f122359f;
        }

        /* JADX INFO: renamed from: b */
        public boolean m146750b(C18019a c18019a) {
            if (c18019a == null || this.f122354a != c18019a.f122354a) {
                return false;
            }
            TEFrameSizei tEFrameSizei = this.f122355b;
            int i = tEFrameSizei.width;
            TEFrameSizei tEFrameSizei2 = c18019a.f122355b;
            return i == tEFrameSizei2.width && tEFrameSizei.height == tEFrameSizei2.height && this.f122356c == c18019a.f122356c && this.f122357d == c18019a.f122357d && this.f122358e == c18019a.f122358e && this.f122359f == c18019a.f122359f;
        }

        @NonNull
        public String toString() {
            return "ProviderSettings: [mIsPreview = " + this.f122354a + ", mSize = " + this.f122355b + ", mListener = " + this.f122356c + ", mSurfaceTexture = " + this.f122357d + ", mTextureOES = " + this.f122358e + ", mImageReaderCount = " + this.f122359f + Constants.AES_SUFFIX;
        }

        public C18019a(TEFrameSizei tEFrameSizei, @NonNull irh0.InterfaceC17785c interfaceC17785c, boolean z, SurfaceTexture surfaceTexture, TECameraFrame.ETEPixelFormat eTEPixelFormat) {
            this.f122354a = true;
            this.f122359f = 0;
            TECameraFrame.ETEPixelFormat eTEPixelFormat2 = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_YUV420;
            this.f122355b = tEFrameSizei;
            this.f122356c = interfaceC17785c;
            this.f122357d = surfaceTexture;
            this.f122354a = z;
            this.f122361h = eTEPixelFormat;
        }

        public C18019a(TEFrameSizei tEFrameSizei, @NonNull irh0.InterfaceC17785c interfaceC17785c, boolean z, SurfaceTexture surfaceTexture, int i) {
            this.f122354a = true;
            this.f122359f = 0;
            this.f122361h = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Count;
            this.f122355b = tEFrameSizei;
            this.f122356c = interfaceC17785c;
            this.f122357d = surfaceTexture;
            this.f122358e = i;
            this.f122354a = z;
            this.f122361h = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES;
        }
    }
}
