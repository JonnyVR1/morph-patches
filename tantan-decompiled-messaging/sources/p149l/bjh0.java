package p149l;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.p069ss.android.ttvecamera.AbstractC13324c;
import com.p069ss.android.ttvecamera.TECameraFrame;
import com.p069ss.android.ttvecamera.TEFrameSizei;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class bjh0 {

    /* JADX INFO: renamed from: a */
    InterfaceC15877c f75905a;

    /* JADX INFO: renamed from: b */
    TECameraFrame.ETEPixelFormat f75906b;

    /* JADX INFO: renamed from: c */
    TEFrameSizei f75907c;

    /* JADX INFO: renamed from: d */
    AbstractC13324c f75908d;

    /* JADX INFO: renamed from: e */
    boolean f75909e;

    /* JADX INFO: renamed from: f */
    public int f75910f;

    /* JADX INFO: renamed from: g */
    public TECameraFrame.C13243d f75911g;

    /* JADX INFO: renamed from: h */
    protected AbstractC13324c.e f75912h = null;

    /* JADX INFO: renamed from: i */
    private InterfaceC15877c f75913i = new C15875a();

    /* JADX INFO: renamed from: j */
    private InterfaceC15877c f75914j = new C15876b();

    /* JADX INFO: renamed from: l.bjh0$c */
    public interface InterfaceC15877c {
        void onFrameCaptured(TECameraFrame tECameraFrame);

        void onNewSurfaceTexture(SurfaceTexture surfaceTexture);
    }

    /* JADX INFO: renamed from: l.bjh0$d */
    public interface InterfaceC15878d extends InterfaceC15877c {
    }

    public bjh0(cjh0.C16167a c16167a, AbstractC13324c abstractC13324c) {
        this.f75907c = new TEFrameSizei();
        this.f75909e = true;
        this.f75910f = 1;
        this.f75906b = c16167a.f81189h;
        this.f75905a = c16167a.f81184c;
        this.f75907c = c16167a.f81183b;
        this.f75908d = abstractC13324c;
        this.f75909e = c16167a.f81182a;
        this.f75910f = c16167a.f81187f;
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: a */
    public static List<TEFrameSizei> m102167a(Size[] sizeArr) {
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
    public Surface mo102168b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public TEFrameSizei m102169c() {
        return this.f75907c;
    }

    /* JADX INFO: renamed from: d */
    public abstract Surface mo102170d();

    /* JADX INFO: renamed from: e */
    public abstract SurfaceTexture mo102171e();

    /* JADX INFO: renamed from: f */
    public Surface[] mo102172f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo102173g();

    /* JADX INFO: renamed from: h */
    public int mo102174h(@NonNull StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public abstract int mo102175i(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei);

    /* JADX INFO: renamed from: j */
    public boolean m102176j() {
        return this.f75909e;
    }

    /* JADX INFO: renamed from: k */
    public void m102177k(TECameraFrame tECameraFrame) {
        InterfaceC15877c interfaceC15877c = this.f75905a;
        if (interfaceC15877c != null) {
            interfaceC15877c.onFrameCaptured(tECameraFrame);
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo102178l();

    /* JADX INFO: renamed from: m */
    public void mo102179m() {
        if (this.f75905a instanceof InterfaceC15878d) {
            this.f75905a = this.f75914j;
        } else {
            this.f75905a = this.f75913i;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m102180n(TECameraFrame.C13243d c13243d) {
        this.f75911g = c13243d;
    }

    /* JADX INFO: renamed from: o */
    public void m102181o(AbstractC13324c.e eVar) {
        this.f75912h = eVar;
    }

    /* JADX INFO: renamed from: l.bjh0$a */
    public class C15875a implements InterfaceC15877c {
        public C15875a() {
        }

        @Override // p149l.bjh0.InterfaceC15877c
        public void onFrameCaptured(TECameraFrame tECameraFrame) {
        }

        @Override // p149l.bjh0.InterfaceC15877c
        public void onNewSurfaceTexture(SurfaceTexture surfaceTexture) {
        }
    }

    /* JADX INFO: renamed from: l.bjh0$b */
    public class C15876b implements InterfaceC15878d {
        public C15876b() {
        }

        @Override // p149l.bjh0.InterfaceC15877c
        public void onFrameCaptured(TECameraFrame tECameraFrame) {
        }

        @Override // p149l.bjh0.InterfaceC15877c
        public void onNewSurfaceTexture(SurfaceTexture surfaceTexture) {
        }
    }
}
