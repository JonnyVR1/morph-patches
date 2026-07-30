package p149l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bos0 extends kxr0 implements ips0 {
    public bos0() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* JADX INFO: renamed from: o8 */
    public static ips0 m102983o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return iInterfaceQueryLocalInterface instanceof ips0 ? (ips0) iInterfaceQueryLocalInterface : new sms0(iBinder);
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        r8s0 i6s0Var = null;
        s7t0 j5t0Var = null;
        ocs0 aas0Var = null;
        s3u0 f1u0Var = null;
        cus0 yrs0Var = null;
        t3t0 t3t0Var = null;
        n5s0 r3s0Var = null;
        sys0 gvs0Var = null;
        switch (i) {
            case 1:
                uyl uylVarZzn = zzn();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, uylVarZzn);
                return true;
            case 2:
                mo137593g();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zMo137597p0 = mo137597p0();
                parcel2.writeNoException();
                ClassLoader classLoader = lxr0.f130430a;
                parcel2.writeInt(zMo137597p0 ? 1 : 0);
                return true;
            case 4:
                zzl zzlVar = (zzl) lxr0.m152084a(parcel, zzl.CREATOR);
                lxr0.m152086c(parcel);
                boolean zMo137591f2 = mo137591f2(zzlVar);
                parcel2.writeNoException();
                parcel2.writeInt(zMo137591f2 ? 1 : 0);
                return true;
            case 5:
                mo137577G();
                parcel2.writeNoException();
                return true;
            case 6:
                mo137583J();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    i6s0Var = iInterfaceQueryLocalInterface instanceof r8s0 ? (r8s0) iInterfaceQueryLocalInterface : new i6s0(strongBinder);
                }
                lxr0.m152086c(parcel);
                mo137603x2(i6s0Var);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    gvs0Var = iInterfaceQueryLocalInterface2 instanceof sys0 ? (sys0) iInterfaceQueryLocalInterface2 : new gvs0(strongBinder2);
                }
                lxr0.m152086c(parcel);
                mo137595l1(gvs0Var);
                parcel2.writeNoException();
                return true;
            case 9:
                mo137587S4();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                mo137600t();
                parcel2.writeNoException();
                return true;
            case 12:
                zzq zzqVarZzg = zzg();
                parcel2.writeNoException();
                lxr0.m152088e(parcel2, zzqVarZzg);
                return true;
            case 13:
                zzq zzqVar = (zzq) lxr0.m152084a(parcel, zzq.CREATOR);
                lxr0.m152086c(parcel);
                mo137586R3(zzqVar);
                parcel2.writeNoException();
                return true;
            case 14:
                dts0 dts0VarM108696o8 = cts0.m108696o8(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo137601v3(dts0VarM108696o8);
                parcel2.writeNoException();
                return true;
            case 15:
                gts0 gts0VarM123088o8 = fts0.m123088o8(parcel.readStrongBinder());
                String string = parcel.readString();
                lxr0.m152086c(parcel);
                mo137576E6(gts0VarM123088o8, string);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 19:
                s8s0 s8s0VarM140342o8 = j8s0.m140342o8(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo137580H7(s8s0VarM140342o8);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    r3s0Var = iInterfaceQueryLocalInterface3 instanceof n5s0 ? (n5s0) iInterfaceQueryLocalInterface3 : new r3s0(strongBinder3);
                }
                lxr0.m152086c(parcel);
                mo137575C5(r3s0Var);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    t3t0Var = iInterfaceQueryLocalInterface4 instanceof t3t0 ? (t3t0) iInterfaceQueryLocalInterface4 : new t3t0(strongBinder4);
                }
                lxr0.m152086c(parcel);
                mo137592f7(t3t0Var);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zM152090g = lxr0.m152090g(parcel);
                lxr0.m152086c(parcel);
                mo137599s4(zM152090g);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zMo137596n0 = mo137596n0();
                parcel2.writeNoException();
                ClassLoader classLoader2 = lxr0.f130430a;
                parcel2.writeInt(zMo137596n0 ? 1 : 0);
                return true;
            case 24:
                uxs0 uxs0VarM118515o8 = ews0.m118515o8(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo137594i8(uxs0VarM118515o8);
                parcel2.writeNoException();
                return true;
            case 25:
                String string2 = parcel.readString();
                lxr0.m152086c(parcel);
                mo137588X6(string2);
                parcel2.writeNoException();
                return true;
            case 26:
                fgu0 fgu0VarZzl = zzl();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, fgu0VarZzl);
                return true;
            case 29:
                zzfk zzfkVar = (zzfk) lxr0.m152084a(parcel, zzfk.CREATOR);
                lxr0.m152086c(parcel);
                mo137590e2(zzfkVar);
                parcel2.writeNoException();
                return true;
            case 30:
                zzdu zzduVar = (zzdu) lxr0.m152084a(parcel, zzdu.CREATOR);
                lxr0.m152086c(parcel);
                mo137584L0(zzduVar);
                parcel2.writeNoException();
                return true;
            case 31:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 32:
                sys0 sys0VarZzj = zzj();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, sys0VarZzj);
                return true;
            case 33:
                r8s0 r8s0VarZzi = zzi();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, r8s0VarZzi);
                return true;
            case 34:
                boolean zM152090g2 = lxr0.m152090g(parcel);
                lxr0.m152086c(parcel);
                mo137589Y3(zM152090g2);
                parcel2.writeNoException();
                return true;
            case 35:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 36:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    yrs0Var = iInterfaceQueryLocalInterface5 instanceof cus0 ? (cus0) iInterfaceQueryLocalInterface5 : new yrs0(strongBinder5);
                }
                lxr0.m152086c(parcel);
                mo137578G6(yrs0Var);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleZzd = zzd();
                parcel2.writeNoException();
                lxr0.m152088e(parcel2, bundleZzd);
                return true;
            case 38:
                String string3 = parcel.readString();
                lxr0.m152086c(parcel);
                mo137598r6(string3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzw zzwVar = (zzw) lxr0.m152084a(parcel, zzw.CREATOR);
                lxr0.m152086c(parcel);
                mo137581I1(zzwVar);
                parcel2.writeNoException();
                return true;
            case 40:
                q1s0 q1s0VarM167115o8 = p1s0.m167115o8(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo137574A5(q1s0VarM167115o8);
                parcel2.writeNoException();
                return true;
            case 41:
                ncu0 ncu0VarZzk = zzk();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, ncu0VarZzk);
                return true;
            case 42:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    f1u0Var = iInterfaceQueryLocalInterface6 instanceof s3u0 ? (s3u0) iInterfaceQueryLocalInterface6 : new f1u0(strongBinder6);
                }
                lxr0.m152086c(parcel);
                mo137579H3(f1u0Var);
                parcel2.writeNoException();
                return true;
            case 43:
                zzl zzlVar2 = (zzl) lxr0.m152084a(parcel, zzl.CREATOR);
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    aas0Var = iInterfaceQueryLocalInterface7 instanceof ocs0 ? (ocs0) iInterfaceQueryLocalInterface7 : new aas0(strongBinder7);
                }
                lxr0.m152086c(parcel);
                mo137602w7(zzlVar2, aas0Var);
                parcel2.writeNoException();
                return true;
            case 44:
                uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo137585P7(uylVarM196295O);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    j5t0Var = iInterfaceQueryLocalInterface8 instanceof s7t0 ? (s7t0) iInterfaceQueryLocalInterface8 : new j5t0(strongBinder8);
                }
                lxr0.m152086c(parcel);
                mo137582I3(j5t0Var);
                parcel2.writeNoException();
                return true;
        }
    }
}
