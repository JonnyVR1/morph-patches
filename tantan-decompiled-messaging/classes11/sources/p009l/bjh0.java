package p009l;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.p008ss.android.ttvecamera.AbstractC0726c;
import com.p008ss.android.ttvecamera.TECameraFrame;
import com.p008ss.android.ttvecamera.TEFrameSizei;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class bjh0 {

    /* JADX INFO: renamed from: a */
    InterfaceC0783c f10128a;

    /* JADX INFO: renamed from: b */
    TECameraFrame.ETEPixelFormat f10129b;

    /* JADX INFO: renamed from: c */
    TEFrameSizei f10130c;

    /* JADX INFO: renamed from: d */
    AbstractC0726c f10131d;

    /* JADX INFO: renamed from: e */
    boolean f10132e;

    /* JADX INFO: renamed from: f */
    public int f10133f;

    /* JADX INFO: renamed from: g */
    public TECameraFrame.C0645d f10134g;

    /* JADX INFO: renamed from: h */
    protected AbstractC0726c.e f10135h = null;

    /* JADX INFO: renamed from: i */
    private InterfaceC0783c f10136i = new C0781a();

    /* JADX INFO: renamed from: j */
    private InterfaceC0783c f10137j = new C0782b();

    /* JADX INFO: renamed from: l.bjh0$c */
    public interface InterfaceC0783c {
        void onFrameCaptured(TECameraFrame tECameraFrame);

        void onNewSurfaceTexture(SurfaceTexture surfaceTexture);
    }

    /* JADX INFO: renamed from: l.bjh0$d */
    public interface InterfaceC0784d extends InterfaceC0783c {
    }

    public bjh0(cjh0.C0813a c0813a, AbstractC0726c abstractC0726c) {
        this.f10130c = new TEFrameSizei();
        this.f10132e = true;
        this.f10133f = 1;
        this.f10129b = c0813a.f10633h;
        this.f10128a = c0813a.f10628c;
        this.f10130c = c0813a.f10627b;
        this.f10131d = abstractC0726c;
        this.f10132e = c0813a.f10626a;
        this.f10133f = c0813a.f10631f;
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: a */
    public static List<TEFrameSizei> m12036a(Size[] sizeArr) {
        if (sizeArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public Surface mo12037b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public TEFrameSizei m12038c() {
        return this.f10130c;
    }

    /* JADX INFO: renamed from: d */
    public abstract Surface mo12039d();

    /* JADX INFO: renamed from: e */
    public abstract SurfaceTexture mo12040e();

    /* JADX INFO: renamed from: f */
    public Surface[] mo12041f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo12042g();

    /* JADX INFO: renamed from: h */
    public int mo12043h(@NonNull StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public abstract int mo12044i(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei);

    /* JADX INFO: renamed from: j */
    public boolean m12045j() {
        return this.f10132e;
    }

    /* JADX INFO: renamed from: k */
    public void m12046k(TECameraFrame tECameraFrame) {
        InterfaceC0783c interfaceC0783c = this.f10128a;
        if (interfaceC0783c != null) {
            interfaceC0783c.onFrameCaptured(tECameraFrame);
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo12047l();

    /* JADX INFO: renamed from: m */
    public void mo12048m() {
        if (this.f10128a instanceof InterfaceC0784d) {
            this.f10128a = this.f10137j;
        } else {
            this.f10128a = this.f10136i;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m12049n(TECameraFrame.C0645d c0645d) {
        this.f10134g = c0645d;
    }

    /* JADX INFO: renamed from: o */
    public void m12050o(AbstractC0726c.e eVar) {
        this.f10135h = eVar;
    }

    /* JADX INFO: renamed from: l.bjh0$a */
    public class C0781a implements InterfaceC0783c {
        public C0781a() {
        }

        @Override // p009l.bjh0.InterfaceC0783c
        public void onFrameCaptured(TECameraFrame tECameraFrame) {
        }

        @Override // p009l.bjh0.InterfaceC0783c
        public void onNewSurfaceTexture(SurfaceTexture surfaceTexture) {
        }
    }

    /* JADX INFO: renamed from: l.bjh0$b */
    public class C0782b implements InterfaceC0784d {
        public C0782b() {
        }

        @Override // p009l.bjh0.InterfaceC0783c
        public void onFrameCaptured(TECameraFrame tECameraFrame) {
        }

        @Override // p009l.bjh0.InterfaceC0783c
        public void onNewSurfaceTexture(SurfaceTexture surfaceTexture) {
        }
    }
}
