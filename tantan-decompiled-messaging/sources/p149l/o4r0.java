package p149l;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcef;

/* JADX INFO: loaded from: classes6.dex */
public final class o4r0 extends tvr0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f141808b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ons0 f141809c;

    public o4r0(mur0 mur0Var, Context context, ons0 ons0Var) {
        this.f141808b = context;
        this.f141809c = ons0Var;
    }

    @Override // p149l.tvr0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo96268a() {
        mur0.m156440q(this.f141808b, "out_of_context_tester");
        return null;
    }

    @Override // p149l.tvr0
    @Nullable
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo96269b(n2t0 n2t0Var) throws RemoteException {
        Context context = this.f141808b;
        uyl uylVarM181848Y2 = s050.m181848Y2(context);
        m7s0.m153417a(context);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132322m9)).booleanValue()) {
            return n2t0Var.mo12247o6(uylVarM181848Y2, this.f141809c, 240304000);
        }
        return null;
    }

    @Override // p149l.tvr0
    @Nullable
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo96270c() throws RemoteException {
        Context context = this.f141808b;
        uyl uylVarM181848Y2 = s050.m181848Y2(context);
        m7s0.m153417a(context);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132322m9)).booleanValue()) {
            try {
                return ((u8u0) a3t0.m94733b(this.f141808b, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new z2t0() { // from class: l.e3r0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // p149l.z2t0
                    public final Object zza(Object obj) {
                        if (obj == 0) {
                            return null;
                        }
                        IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                        return iInterfaceQueryLocalInterface instanceof u8u0 ? (u8u0) iInterfaceQueryLocalInterface : new u8u0(obj);
                    }
                })).m192258m4(uylVarM181848Y2, this.f141809c, 240304000);
            } catch (RemoteException | zzcef | NullPointerException e) {
                qts0.m176477c(this.f141808b).mo176483b(e, "ClientApiBroker.getOutOfContextTester");
            }
        }
        return null;
    }
}
