package p009l;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.view.Surface;
import androidx.annotation.NonNull;
import com.p008ss.android.ttvecamera.AbstractC0726c;
import com.p008ss.android.ttvecamera.C0725b;
import com.p008ss.android.ttvecamera.C0743g;
import com.p008ss.android.ttvecamera.TECameraFrame;
import com.p008ss.android.ttvecamera.TEFrameSizei;
import com.sina.weibo.sdk.constant.WBConstants;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class cjh0 {

    /* JADX INFO: renamed from: b */
    public static final String f10624b = "cjh0";

    /* JADX INFO: renamed from: a */
    private bjh0 f10625a;

    /* JADX INFO: renamed from: a */
    public void m12614a(@NonNull C0813a c0813a, @NonNull AbstractC0726c abstractC0726c) {
        bjh0 bjh0Var = this.f10625a;
        if (bjh0Var != null) {
            bjh0Var.mo12048m();
        }
        TECameraFrame.ETEPixelFormat eTEPixelFormat = c0813a.f10633h;
        if (eTEPixelFormat == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Recorder) {
            this.f10625a = new tjh0(c0813a, abstractC0726c);
        } else if (eTEPixelFormat == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES) {
            this.f10625a = new vjh0(c0813a, abstractC0726c);
        } else if (!(abstractC0726c instanceof C0725b)) {
            this.f10625a = new jih0(c0813a, abstractC0726c);
        } else if (c0813a.f10631f > 0) {
            this.f10625a = new rjh0(c0813a, abstractC0726c);
        } else {
            this.f10625a = new qjh0(c0813a, abstractC0726c);
        }
        abstractC0726c.m11010p0(this);
    }

    /* JADX INFO: renamed from: b */
    public TEFrameSizei m12615b() {
        return !this.f10625a.m12045j() ? this.f10625a.f10130c : new TEFrameSizei(1080, WBConstants.SDK_NEW_PAY_VERSION);
    }

    /* JADX INFO: renamed from: c */
    public TEFrameSizei m12616c() {
        if (this.f10625a.m12045j()) {
            return this.f10625a.m12038c();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public Surface m12617d() {
        bjh0 bjh0Var = this.f10625a;
        if (bjh0Var != null) {
            return bjh0Var.mo12039d();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public Surface[] m12618e() {
        bjh0 bjh0Var = this.f10625a;
        if (bjh0Var != null) {
            return bjh0Var.mo12041f();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public bjh0 m12619f() {
        return this.f10625a;
    }

    /* JADX INFO: renamed from: g */
    public int m12620g() {
        bjh0 bjh0Var = this.f10625a;
        if (bjh0Var != null) {
            return bjh0Var.mo12042g();
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public SurfaceTexture m12621h() {
        bjh0 bjh0Var = this.f10625a;
        if (bjh0Var != null) {
            return bjh0Var.mo12040e();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public int m12622i(@NonNull StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        bjh0 bjh0Var = this.f10625a;
        if (bjh0Var == null || bjh0Var == null) {
            return -112;
        }
        return bjh0Var.mo12043h(streamConfigurationMap, tEFrameSizei);
    }

    /* JADX INFO: renamed from: j */
    public int m12623j(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        bjh0 bjh0Var = this.f10625a;
        if (bjh0Var != null) {
            return bjh0Var.mo12044i(list, tEFrameSizei);
        }
        return -112;
    }

    /* JADX INFO: renamed from: k */
    public void m12624k() {
        bjh0 bjh0Var = this.f10625a;
        if (bjh0Var != null) {
            bjh0Var.mo12048m();
            this.f10625a = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m12625l(AbstractC0726c.e eVar) {
        bjh0 bjh0Var = this.f10625a;
        if (bjh0Var == null) {
            C0743g.m11166b(f10624b, "provider is null!");
        } else {
            bjh0Var.m12050o(eVar);
        }
    }

    /* JADX INFO: renamed from: l.cjh0$a */
    public static class C0813a {

        /* JADX INFO: renamed from: a */
        public boolean f10626a;

        /* JADX INFO: renamed from: b */
        public TEFrameSizei f10627b;

        /* JADX INFO: renamed from: c */
        public bjh0.InterfaceC0783c f10628c;

        /* JADX INFO: renamed from: d */
        public SurfaceTexture f10629d;

        /* JADX INFO: renamed from: e */
        public int f10630e;

        /* JADX INFO: renamed from: f */
        public int f10631f;

        /* JADX INFO: renamed from: g */
        public Surface f10632g;

        /* JADX INFO: renamed from: h */
        public TECameraFrame.ETEPixelFormat f10633h;

        public C0813a(@NonNull C0813a c0813a) {
            this.f10626a = true;
            this.f10631f = 0;
            this.f10633h = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Count;
            this.f10626a = c0813a.f10626a;
            this.f10627b = c0813a.f10627b;
            this.f10628c = c0813a.f10628c;
            this.f10629d = c0813a.f10629d;
            this.f10630e = c0813a.f10630e;
            this.f10631f = c0813a.f10631f;
        }

        /* JADX INFO: renamed from: a */
        public void m12626a(@NonNull C0813a c0813a) {
            this.f10626a = c0813a.f10626a;
            this.f10627b = c0813a.f10627b;
            this.f10628c = c0813a.f10628c;
            this.f10629d = c0813a.f10629d;
            this.f10630e = c0813a.f10630e;
            this.f10631f = c0813a.f10631f;
        }

        /* JADX INFO: renamed from: b */
        public boolean m12627b(C0813a c0813a) {
            if (c0813a == null || this.f10626a != c0813a.f10626a) {
                return false;
            }
            TEFrameSizei tEFrameSizei = this.f10627b;
            int i = tEFrameSizei.width;
            TEFrameSizei tEFrameSizei2 = c0813a.f10627b;
            return i == tEFrameSizei2.width && tEFrameSizei.height == tEFrameSizei2.height && this.f10628c == c0813a.f10628c && this.f10629d == c0813a.f10629d && this.f10630e == c0813a.f10630e && this.f10631f == c0813a.f10631f;
        }

        @NonNull
        public String toString() {
            return "ProviderSettings: [mIsPreview = " + this.f10626a + ", mSize = " + this.f10627b + ", mListener = " + this.f10628c + ", mSurfaceTexture = " + this.f10629d + ", mTextureOES = " + this.f10630e + ", mImageReaderCount = " + this.f10631f + "]";
        }

        public C0813a(TEFrameSizei tEFrameSizei, @NonNull bjh0.InterfaceC0783c interfaceC0783c, boolean z, SurfaceTexture surfaceTexture, TECameraFrame.ETEPixelFormat eTEPixelFormat) {
            this.f10626a = true;
            this.f10631f = 0;
            TECameraFrame.ETEPixelFormat eTEPixelFormat2 = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_YUV420;
            this.f10627b = tEFrameSizei;
            this.f10628c = interfaceC0783c;
            this.f10629d = surfaceTexture;
            this.f10626a = z;
            this.f10633h = eTEPixelFormat;
        }

        public C0813a(TEFrameSizei tEFrameSizei, @NonNull bjh0.InterfaceC0783c interfaceC0783c, boolean z, SurfaceTexture surfaceTexture, int i) {
            this.f10626a = true;
            this.f10631f = 0;
            this.f10633h = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Count;
            this.f10627b = tEFrameSizei;
            this.f10628c = interfaceC0783c;
            this.f10629d = surfaceTexture;
            this.f10630e = i;
            this.f10626a = z;
            this.f10633h = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES;
        }
    }
}
