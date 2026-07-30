package p149l;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/* JADX INFO: loaded from: classes6.dex */
public final class e4k {

    /* JADX INFO: renamed from: a */
    public final esl f89292a;

    /* JADX INFO: renamed from: b */
    public ajj0 f89293b;

    /* JADX INFO: renamed from: l.e4k$a */
    public interface InterfaceC16533a {
        /* JADX INFO: renamed from: U */
        void mo114695U();
    }

    /* JADX INFO: renamed from: l.e4k$b */
    public interface InterfaceC16534b {
        /* JADX INFO: renamed from: b0 */
        void mo114696b0(int i);
    }

    /* JADX INFO: renamed from: l.e4k$c */
    public interface InterfaceC16535c {
        /* JADX INFO: renamed from: N */
        void mo35963N(LatLng latLng);
    }

    /* JADX INFO: renamed from: l.e4k$d */
    public interface InterfaceC16536d {
        /* JADX INFO: renamed from: X */
        boolean mo35964X(uuw uuwVar);
    }

    public e4k(esl eslVar) {
        this.f89292a = (esl) Preconditions.checkNotNull(eslVar);
    }

    /* JADX INFO: renamed from: a */
    public final uuw m114685a(MarkerOptions markerOptions) {
        try {
            uny0 uny0VarMo117948r2 = this.f89292a.mo117948r2(markerOptions);
            if (uny0VarMo117948r2 != null) {
                return new uuw(uny0VarMo117948r2);
            }
            return null;
        } catch (RemoteException e) {
            d4k.m109990a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m114686b(zb4 zb4Var) {
        try {
            this.f89292a.mo117945Y6(zb4Var.m217822a());
        } catch (RemoteException e) {
            d4k.m109990a(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m114687c() {
        try {
            this.f89292a.clear();
        } catch (RemoteException e) {
            d4k.m109990a(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final CameraPosition m114688d() {
        try {
            return this.f89292a.mo117944Y4();
        } catch (RemoteException e) {
            d4k.m109990a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final ajj0 m114689e() {
        try {
            if (this.f89293b == null) {
                this.f89293b = new ajj0(this.f89292a.mo117941J3());
            }
            return this.f89293b;
        } catch (RemoteException e) {
            d4k.m109990a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m114690f(zb4 zb4Var) {
        try {
            this.f89292a.mo117942J5(zb4Var.m217822a());
        } catch (RemoteException e) {
            d4k.m109990a(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m114691g(@Nullable InterfaceC16533a interfaceC16533a) {
        esl eslVar = this.f89292a;
        try {
            if (interfaceC16533a == null) {
                eslVar.mo117946b8(null);
            } else {
                eslVar.mo117946b8(new uty0(this, interfaceC16533a));
            }
        } catch (RemoteException e) {
            d4k.m109990a(e);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m114692h(@Nullable InterfaceC16534b interfaceC16534b) {
        esl eslVar = this.f89292a;
        try {
            if (interfaceC16534b == null) {
                eslVar.mo117940G4(null);
            } else {
                eslVar.mo117940G4(new yoy0(this, interfaceC16534b));
            }
        } catch (RemoteException e) {
            d4k.m109990a(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m114693i(@Nullable InterfaceC16535c interfaceC16535c) {
        esl eslVar = this.f89292a;
        try {
            if (interfaceC16535c == null) {
                eslVar.mo117943R6(null);
            } else {
                eslVar.mo117943R6(new nvy0(this, interfaceC16535c));
            }
        } catch (RemoteException e) {
            d4k.m109990a(e);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m114694j(@Nullable InterfaceC16536d interfaceC16536d) {
        esl eslVar = this.f89292a;
        try {
            if (interfaceC16536d == null) {
                eslVar.mo117947d2(null);
            } else {
                eslVar.mo117947d2(new e0s0(this, interfaceC16536d));
            }
        } catch (RemoteException e) {
            d4k.m109990a(e);
        }
    }
}
