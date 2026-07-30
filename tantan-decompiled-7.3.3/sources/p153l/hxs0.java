package p153l;

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
public abstract class hxs0 extends q6s0 implements oys0 {
    public hxs0() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* JADX INFO: renamed from: o8 */
    public static oys0 m137651o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return iInterfaceQueryLocalInterface instanceof oys0 ? (oys0) iInterfaceQueryLocalInterface : new yvs0(iBinder);
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        xhs0 ofs0Var = null;
        ygt0 pet0Var = null;
        uls0 gjs0Var = null;
        ycu0 lau0Var = null;
        i3t0 e1t0Var = null;
        zct0 zct0Var = null;
        tes0 xcs0Var = null;
        y7t0 m4t0Var = null;
        switch (i) {
            case 1:
                p1m p1mVarZzn = zzn();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, p1mVarZzn);
                return true;
            case 2:
                mo113764g();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zMo113771p0 = mo113771p0();
                parcel2.writeNoException();
                ClassLoader classLoader = r6s0.f161495a;
                parcel2.writeInt(zMo113771p0 ? 1 : 0);
                return true;
            case 4:
                zzl zzlVar = (zzl) r6s0.m180039a(parcel, zzl.CREATOR);
                r6s0.m180041c(parcel);
                boolean zMo113762f2 = mo113762f2(zzlVar);
                parcel2.writeNoException();
                parcel2.writeInt(zMo113762f2 ? 1 : 0);
                return true;
            case 5:
                mo113745G();
                parcel2.writeNoException();
                return true;
            case 6:
                mo113751J();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    ofs0Var = iInterfaceQueryLocalInterface instanceof xhs0 ? (xhs0) iInterfaceQueryLocalInterface : new ofs0(strongBinder);
                }
                r6s0.m180041c(parcel);
                mo113778x2(ofs0Var);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    m4t0Var = iInterfaceQueryLocalInterface2 instanceof y7t0 ? (y7t0) iInterfaceQueryLocalInterface2 : new m4t0(strongBinder2);
                }
                r6s0.m180041c(parcel);
                mo113767l1(m4t0Var);
                parcel2.writeNoException();
                return true;
            case 9:
                mo113758S4();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                mo113775t();
                parcel2.writeNoException();
                return true;
            case 12:
                zzq zzqVarZzg = zzg();
                parcel2.writeNoException();
                r6s0.m180043e(parcel2, zzqVarZzg);
                return true;
            case 13:
                zzq zzqVar = (zzq) r6s0.m180039a(parcel, zzq.CREATOR);
                r6s0.m180041c(parcel);
                mo113757R3(zzqVar);
                parcel2.writeNoException();
                return true;
            case 14:
                j2t0 j2t0VarM138236o8 = i2t0.m138236o8(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo113776v3(j2t0VarM138236o8);
                parcel2.writeNoException();
                return true;
            case 15:
                m2t0 m2t0VarM152636o8 = l2t0.m152636o8(parcel.readStrongBinder());
                String string = parcel.readString();
                r6s0.m180041c(parcel);
                mo113744E6(m2t0VarM152636o8, string);
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
                yhs0 yhs0VarM172332o8 = phs0.m172332o8(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo113748H7(yhs0VarM172332o8);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    xcs0Var = iInterfaceQueryLocalInterface3 instanceof tes0 ? (tes0) iInterfaceQueryLocalInterface3 : new xcs0(strongBinder3);
                }
                r6s0.m180041c(parcel);
                mo113743C5(xcs0Var);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zct0Var = iInterfaceQueryLocalInterface4 instanceof zct0 ? (zct0) iInterfaceQueryLocalInterface4 : new zct0(strongBinder4);
                }
                r6s0.m180041c(parcel);
                mo113763f7(zct0Var);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zM180045g = r6s0.m180045g(parcel);
                r6s0.m180041c(parcel);
                mo113774s4(zM180045g);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zMo113770n0 = mo113770n0();
                parcel2.writeNoException();
                ClassLoader classLoader2 = r6s0.f161495a;
                parcel2.writeInt(zMo113770n0 ? 1 : 0);
                return true;
            case 24:
                a7t0 a7t0VarM148505o8 = k5t0.m148505o8(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo113766i8(a7t0VarM148505o8);
                parcel2.writeNoException();
                return true;
            case 25:
                String string2 = parcel.readString();
                r6s0.m180041c(parcel);
                mo113759X6(string2);
                parcel2.writeNoException();
                return true;
            case 26:
                lpu0 lpu0VarZzl = zzl();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, lpu0VarZzl);
                return true;
            case 29:
                zzfk zzfkVar = (zzfk) r6s0.m180039a(parcel, zzfk.CREATOR);
                r6s0.m180041c(parcel);
                mo113761e2(zzfkVar);
                parcel2.writeNoException();
                return true;
            case 30:
                zzdu zzduVar = (zzdu) r6s0.m180039a(parcel, zzdu.CREATOR);
                r6s0.m180041c(parcel);
                mo113752L0(zzduVar);
                parcel2.writeNoException();
                return true;
            case 31:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 32:
                y7t0 y7t0VarZzj = zzj();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, y7t0VarZzj);
                return true;
            case 33:
                xhs0 xhs0VarZzi = zzi();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, xhs0VarZzi);
                return true;
            case 34:
                boolean zM180045g2 = r6s0.m180045g(parcel);
                r6s0.m180041c(parcel);
                mo113760Y3(zM180045g2);
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
                    e1t0Var = iInterfaceQueryLocalInterface5 instanceof i3t0 ? (i3t0) iInterfaceQueryLocalInterface5 : new e1t0(strongBinder5);
                }
                r6s0.m180041c(parcel);
                mo113746G6(e1t0Var);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleZzd = zzd();
                parcel2.writeNoException();
                r6s0.m180043e(parcel2, bundleZzd);
                return true;
            case 38:
                String string3 = parcel.readString();
                r6s0.m180041c(parcel);
                mo113772r6(string3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzw zzwVar = (zzw) r6s0.m180039a(parcel, zzw.CREATOR);
                r6s0.m180041c(parcel);
                mo113749I1(zzwVar);
                parcel2.writeNoException();
                return true;
            case 40:
                was0 was0VarM200591o8 = vas0.m200591o8(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo113742A5(was0VarM200591o8);
                parcel2.writeNoException();
                return true;
            case 41:
                tlu0 tlu0VarZzk = zzk();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, tlu0VarZzk);
                return true;
            case 42:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    lau0Var = iInterfaceQueryLocalInterface6 instanceof ycu0 ? (ycu0) iInterfaceQueryLocalInterface6 : new lau0(strongBinder6);
                }
                r6s0.m180041c(parcel);
                mo113747H3(lau0Var);
                parcel2.writeNoException();
                return true;
            case 43:
                zzl zzlVar2 = (zzl) r6s0.m180039a(parcel, zzl.CREATOR);
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    gjs0Var = iInterfaceQueryLocalInterface7 instanceof uls0 ? (uls0) iInterfaceQueryLocalInterface7 : new gjs0(strongBinder7);
                }
                r6s0.m180041c(parcel);
                mo113777w7(zzlVar2, gjs0Var);
                parcel2.writeNoException();
                return true;
            case 44:
                p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo113756P7(p1mVarM170217O);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    pet0Var = iInterfaceQueryLocalInterface8 instanceof ygt0 ? (ygt0) iInterfaceQueryLocalInterface8 : new pet0(strongBinder8);
                }
                r6s0.m180041c(parcel);
                mo113750I3(pet0Var);
                parcel2.writeNoException();
                return true;
        }
    }
}
