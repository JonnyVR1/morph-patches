package p153l;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.p074ss.android.ttvecamera.AbstractC13487c;
import com.p074ss.android.ttvecamera.TECameraFrame;
import com.p074ss.android.ttvecamera.TEFrameSizei;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class irh0 {

    /* JADX INFO: renamed from: a */
    InterfaceC17785c f116561a;

    /* JADX INFO: renamed from: b */
    TECameraFrame.ETEPixelFormat f116562b;

    /* JADX INFO: renamed from: c */
    TEFrameSizei f116563c;

    /* JADX INFO: renamed from: d */
    AbstractC13487c f116564d;

    /* JADX INFO: renamed from: e */
    boolean f116565e;

    /* JADX INFO: renamed from: f */
    public int f116566f;

    /* JADX INFO: renamed from: g */
    public TECameraFrame.C13406d f116567g;

    /* JADX INFO: renamed from: h */
    protected AbstractC13487c.e f116568h = null;

    /* JADX INFO: renamed from: i */
    private InterfaceC17785c f116569i = new C17783a();

    /* JADX INFO: renamed from: j */
    private InterfaceC17785c f116570j = new C17784b();

    /* JADX INFO: renamed from: l.irh0$c */
    public interface InterfaceC17785c {
        void onFrameCaptured(TECameraFrame tECameraFrame);

        void onNewSurfaceTexture(SurfaceTexture surfaceTexture);
    }

    /* JADX INFO: renamed from: l.irh0$d */
    public interface InterfaceC17786d extends InterfaceC17785c {
    }

    public irh0(jrh0.C18019a c18019a, AbstractC13487c abstractC13487c) {
        this.f116563c = new TEFrameSizei();
        this.f116565e = true;
        this.f116566f = 1;
        this.f116562b = c18019a.f122361h;
        this.f116561a = c18019a.f122356c;
        this.f116563c = c18019a.f122355b;
        this.f116564d = abstractC13487c;
        this.f116565e = c18019a.f122354a;
        this.f116566f = c18019a.f122359f;
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: a */
    public static List<TEFrameSizei> m141821a(Size[] sizeArr) {
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
    public Surface mo99910b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public TEFrameSizei m141822c() {
        return this.f116563c;
    }

    /* JADX INFO: renamed from: d */
    public abstract Surface mo99911d();

    /* JADX INFO: renamed from: e */
    public abstract SurfaceTexture mo99912e();

    /* JADX INFO: renamed from: f */
    public Surface[] mo141823f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo99913g();

    /* JADX INFO: renamed from: h */
    public int mo99914h(@NonNull StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public abstract int mo99915i(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei);

    /* JADX INFO: renamed from: j */
    public boolean m141824j() {
        return this.f116565e;
    }

    /* JADX INFO: renamed from: k */
    public void m141825k(TECameraFrame tECameraFrame) {
        InterfaceC17785c interfaceC17785c = this.f116561a;
        if (interfaceC17785c != null) {
            interfaceC17785c.onFrameCaptured(tECameraFrame);
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo99916l();

    /* JADX INFO: renamed from: m */
    public void mo99917m() {
        if (this.f116561a instanceof InterfaceC17786d) {
            this.f116561a = this.f116570j;
        } else {
            this.f116561a = this.f116569i;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m141826n(TECameraFrame.C13406d c13406d) {
        this.f116567g = c13406d;
    }

    /* JADX INFO: renamed from: o */
    public void m141827o(AbstractC13487c.e eVar) {
        this.f116568h = eVar;
    }

    /* JADX INFO: renamed from: l.irh0$a */
    public class C17783a implements InterfaceC17785c {
        public C17783a() {
        }

        @Override // p153l.irh0.InterfaceC17785c
        public void onFrameCaptured(TECameraFrame tECameraFrame) {
        }

        @Override // p153l.irh0.InterfaceC17785c
        public void onNewSurfaceTexture(SurfaceTexture surfaceTexture) {
        }
    }

    /* JADX INFO: renamed from: l.irh0$b */
    public class C17784b implements InterfaceC17786d {
        public C17784b() {
        }

        @Override // p153l.irh0.InterfaceC17785c
        public void onFrameCaptured(TECameraFrame tECameraFrame) {
        }

        @Override // p153l.irh0.InterfaceC17785c
        public void onNewSurfaceTexture(SurfaceTexture surfaceTexture) {
        }
    }
}
