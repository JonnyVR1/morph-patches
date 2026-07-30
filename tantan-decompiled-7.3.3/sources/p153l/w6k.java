package p153l;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/* JADX INFO: loaded from: classes6.dex */
public final class w6k {

    /* JADX INFO: renamed from: a */
    public final sul f187626a;

    /* JADX INFO: renamed from: b */
    public dsj0 f187627b;

    /* JADX INFO: renamed from: l.w6k$a */
    public interface InterfaceC21036a {
        /* JADX INFO: renamed from: U */
        void mo192077U();
    }

    /* JADX INFO: renamed from: l.w6k$b */
    public interface InterfaceC21037b {
        /* JADX INFO: renamed from: b0 */
        void mo182417b0(int i);
    }

    /* JADX INFO: renamed from: l.w6k$c */
    public interface InterfaceC21038c {
        /* JADX INFO: renamed from: N */
        void mo36966N(LatLng latLng);
    }

    /* JADX INFO: renamed from: l.w6k$d */
    public interface InterfaceC21039d {
        /* JADX INFO: renamed from: Y */
        boolean mo36967Y(txw txwVar);
    }

    public w6k(sul sulVar) {
        this.f187626a = (sul) Preconditions.checkNotNull(sulVar);
    }

    /* JADX INFO: renamed from: a */
    public final txw m205107a(MarkerOptions markerOptions) {
        try {
            axy0 axy0VarMo188034r2 = this.f187626a.mo188034r2(markerOptions);
            if (axy0VarMo188034r2 != null) {
                return new txw(axy0VarMo188034r2);
            }
            return null;
        } catch (RemoteException e) {
            v6k.m200076a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m205108b(yc4 yc4Var) {
        try {
            this.f187626a.mo188031Y6(yc4Var.m215130a());
        } catch (RemoteException e) {
            v6k.m200076a(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m205109c() {
        try {
            this.f187626a.clear();
        } catch (RemoteException e) {
            v6k.m200076a(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final CameraPosition m205110d() {
        try {
            return this.f187626a.mo188030Y4();
        } catch (RemoteException e) {
            v6k.m200076a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final dsj0 m205111e() {
        try {
            if (this.f187627b == null) {
                this.f187627b = new dsj0(this.f187626a.mo188027J3());
            }
            return this.f187627b;
        } catch (RemoteException e) {
            v6k.m200076a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m205112f(yc4 yc4Var) {
        try {
            this.f187626a.mo188028J5(yc4Var.m215130a());
        } catch (RemoteException e) {
            v6k.m200076a(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m205113g(@Nullable InterfaceC21036a interfaceC21036a) {
        sul sulVar = this.f187626a;
        try {
            if (interfaceC21036a == null) {
                sulVar.mo188032b8(null);
            } else {
                sulVar.mo188032b8(new a3z0(this, interfaceC21036a));
            }
        } catch (RemoteException e) {
            v6k.m200076a(e);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m205114h(@Nullable InterfaceC21037b interfaceC21037b) {
        sul sulVar = this.f187626a;
        try {
            if (interfaceC21037b == null) {
                sulVar.mo188026G4(null);
            } else {
                sulVar.mo188026G4(new eyy0(this, interfaceC21037b));
            }
        } catch (RemoteException e) {
            v6k.m200076a(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m205115i(@Nullable InterfaceC21038c interfaceC21038c) {
        sul sulVar = this.f187626a;
        try {
            if (interfaceC21038c == null) {
                sulVar.mo188029R6(null);
            } else {
                sulVar.mo188029R6(new t4z0(this, interfaceC21038c));
            }
        } catch (RemoteException e) {
            v6k.m200076a(e);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m205116j(@Nullable InterfaceC21039d interfaceC21039d) {
        sul sulVar = this.f187626a;
        try {
            if (interfaceC21039d == null) {
                sulVar.mo188033d2(null);
            } else {
                sulVar.mo188033d2(new k9s0(this, interfaceC21039d));
            }
        } catch (RemoteException e) {
            v6k.m200076a(e);
        }
    }
}
