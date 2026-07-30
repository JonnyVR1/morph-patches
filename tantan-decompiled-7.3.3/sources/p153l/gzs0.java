package p153l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbvg;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gzs0 extends q6s0 implements hzs0 {
    public gzs0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* JADX INFO: renamed from: o8 */
    public static hzs0 m133122o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof hzs0 ? (hzs0) iInterfaceQueryLocalInterface : new fzs0(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [l.gzs0, l.hzs0] */
    /* JADX WARN: Type inference failed for: r5v11, types: [l.ezs0] */
    /* JADX WARN: Type inference failed for: r5v15, types: [l.bzs0] */
    /* JADX WARN: Type inference failed for: r5v19, types: [l.ezs0] */
    /* JADX WARN: Type inference failed for: r5v21, types: [l.vys0] */
    /* JADX WARN: Type inference failed for: r5v24, types: [l.bzs0] */
    /* JADX WARN: Type inference failed for: r5v28, types: [l.sys0] */
    /* JADX WARN: Type inference failed for: r5v5, types: [l.vys0] */
    /* JADX WARN: Type inference failed for: r5v9, types: [l.yys0] */
    /* JADX WARN: Type inference failed for: r6v3, types: [l.kzs0] */
    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        IInterface qys0Var = null;
        if (i == 1) {
            p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
            String string = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) r6s0.m180039a(parcel, creator);
            Bundle bundle2 = (Bundle) r6s0.m180039a(parcel, creator);
            zzq zzqVar = (zzq) r6s0.m180039a(parcel, zzq.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                qys0Var = iInterfaceQueryLocalInterface instanceof kzs0 ? (kzs0) iInterfaceQueryLocalInterface : new izs0(strongBinder);
            }
            r6s0.m180041c(parcel);
            mo113453s6(p1mVarM170217O, string, bundle, bundle2, zzqVar, qys0Var);
            parcel2.writeNoException();
        } else if (i == 2) {
            zzbvg zzbvgVarZzf = zzf();
            parcel2.writeNoException();
            r6s0.m180043e(parcel2, zzbvgVarZzf);
        } else if (i == 3) {
            zzbvg zzbvgVarZzg = zzg();
            parcel2.writeNoException();
            r6s0.m180043e(parcel2, zzbvgVarZzg);
        } else if (i == 5) {
            lpu0 lpu0VarZze = zze();
            parcel2.writeNoException();
            r6s0.m180044f(parcel2, lpu0VarZze);
        } else if (i == 10) {
            p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
            r6s0.m180041c(parcel);
            parcel2.writeNoException();
        } else if (i != 11) {
            switch (i) {
                case 13:
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    zzl zzlVar = (zzl) r6s0.m180039a(parcel, zzl.CREATOR);
                    p1m p1mVarM170217O2 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        qys0Var = iInterfaceQueryLocalInterface2 instanceof vys0 ? (vys0) iInterfaceQueryLocalInterface2 : new tys0(strongBinder2);
                    }
                    ?? r5 = qys0Var;
                    jxs0 jxs0VarM142591o8 = ixs0.m142591o8(parcel.readStrongBinder());
                    zzq zzqVar2 = (zzq) r6s0.m180039a(parcel, zzq.CREATOR);
                    r6s0.m180041c(parcel);
                    mo113445O1(string2, string3, zzlVar, p1mVarM170217O2, r5, jxs0VarM142591o8, zzqVar2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    zzl zzlVar2 = (zzl) r6s0.m180039a(parcel, zzl.CREATOR);
                    p1m p1mVarM170217O3 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                    IBinder strongBinder3 = parcel.readStrongBinder();
                    if (strongBinder3 != null) {
                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        qys0Var = iInterfaceQueryLocalInterface3 instanceof yys0 ? (yys0) iInterfaceQueryLocalInterface3 : new wys0(strongBinder3);
                    }
                    jxs0 jxs0VarM142591o9 = ixs0.m142591o8(parcel.readStrongBinder());
                    r6s0.m180041c(parcel);
                    mo113449b3(string4, string5, zzlVar2, p1mVarM170217O3, qys0Var, jxs0VarM142591o9);
                    parcel2.writeNoException();
                    break;
                case 15:
                    p1m p1mVarM170217O4 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                    r6s0.m180041c(parcel);
                    boolean zMo113451o0 = mo113451o0(p1mVarM170217O4);
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo113451o0 ? 1 : 0);
                    break;
                case 16:
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    zzl zzlVar3 = (zzl) r6s0.m180039a(parcel, zzl.CREATOR);
                    p1m p1mVarM170217O5 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                    IBinder strongBinder4 = parcel.readStrongBinder();
                    if (strongBinder4 != null) {
                        IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        qys0Var = iInterfaceQueryLocalInterface4 instanceof ezs0 ? (ezs0) iInterfaceQueryLocalInterface4 : new czs0(strongBinder4);
                    }
                    jxs0 jxs0VarM142591o10 = ixs0.m142591o8(parcel.readStrongBinder());
                    r6s0.m180041c(parcel);
                    mo113454t7(string6, string7, zzlVar3, p1mVarM170217O5, qys0Var, jxs0VarM142591o10);
                    parcel2.writeNoException();
                    break;
                case 17:
                    p1m p1mVarM170217O6 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                    r6s0.m180041c(parcel);
                    boolean zMo113450e6 = mo113450e6(p1mVarM170217O6);
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo113450e6 ? 1 : 0);
                    break;
                case 18:
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    zzl zzlVar4 = (zzl) r6s0.m180039a(parcel, zzl.CREATOR);
                    p1m p1mVarM170217O7 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                    IBinder strongBinder5 = parcel.readStrongBinder();
                    if (strongBinder5 != null) {
                        IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        qys0Var = iInterfaceQueryLocalInterface5 instanceof bzs0 ? (bzs0) iInterfaceQueryLocalInterface5 : new zys0(strongBinder5);
                    }
                    jxs0 jxs0VarM142591o11 = ixs0.m142591o8(parcel.readStrongBinder());
                    r6s0.m180041c(parcel);
                    mo113447T0(string8, string9, zzlVar4, p1mVarM170217O7, qys0Var, jxs0VarM142591o11);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String string10 = parcel.readString();
                    r6s0.m180041c(parcel);
                    mo113446T(string10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String string11 = parcel.readString();
                    String string12 = parcel.readString();
                    zzl zzlVar5 = (zzl) r6s0.m180039a(parcel, zzl.CREATOR);
                    p1m p1mVarM170217O8 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                    IBinder strongBinder6 = parcel.readStrongBinder();
                    if (strongBinder6 != null) {
                        IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        qys0Var = iInterfaceQueryLocalInterface6 instanceof ezs0 ? (ezs0) iInterfaceQueryLocalInterface6 : new czs0(strongBinder6);
                    }
                    jxs0 jxs0VarM142591o12 = ixs0.m142591o8(parcel.readStrongBinder());
                    r6s0.m180041c(parcel);
                    mo113444I7(string11, string12, zzlVar5, p1mVarM170217O8, qys0Var, jxs0VarM142591o12);
                    parcel2.writeNoException();
                    break;
                case 21:
                    String string13 = parcel.readString();
                    String string14 = parcel.readString();
                    zzl zzlVar6 = (zzl) r6s0.m180039a(parcel, zzl.CREATOR);
                    p1m p1mVarM170217O9 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                    IBinder strongBinder7 = parcel.readStrongBinder();
                    if (strongBinder7 != null) {
                        IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        qys0Var = iInterfaceQueryLocalInterface7 instanceof vys0 ? (vys0) iInterfaceQueryLocalInterface7 : new tys0(strongBinder7);
                    }
                    ?? r6 = qys0Var;
                    jxs0 jxs0VarM142591o13 = ixs0.m142591o8(parcel.readStrongBinder());
                    zzq zzqVar3 = (zzq) r6s0.m180039a(parcel, zzq.CREATOR);
                    r6s0.m180041c(parcel);
                    mo113455z1(string13, string14, zzlVar6, p1mVarM170217O9, r6, jxs0VarM142591o13, zzqVar3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    String string15 = parcel.readString();
                    String string16 = parcel.readString();
                    zzl zzlVar7 = (zzl) r6s0.m180039a(parcel, zzl.CREATOR);
                    p1m p1mVarM170217O10 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                    IBinder strongBinder8 = parcel.readStrongBinder();
                    if (strongBinder8 != null) {
                        IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        qys0Var = iInterfaceQueryLocalInterface8 instanceof bzs0 ? (bzs0) iInterfaceQueryLocalInterface8 : new zys0(strongBinder8);
                    }
                    jxs0 jxs0VarM142591o14 = ixs0.m142591o8(parcel.readStrongBinder());
                    zzbjb zzbjbVar = (zzbjb) r6s0.m180039a(parcel, zzbjb.CREATOR);
                    r6s0.m180041c(parcel);
                    mo113448X3(string15, string16, zzlVar7, p1mVarM170217O10, qys0Var, jxs0VarM142591o14, zzbjbVar);
                    parcel2.writeNoException();
                    break;
                case 23:
                    String string17 = parcel.readString();
                    String string18 = parcel.readString();
                    zzl zzlVar8 = (zzl) r6s0.m180039a(parcel, zzl.CREATOR);
                    p1m p1mVarM170217O11 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                    IBinder strongBinder9 = parcel.readStrongBinder();
                    if (strongBinder9 != null) {
                        IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        qys0Var = iInterfaceQueryLocalInterface9 instanceof sys0 ? (sys0) iInterfaceQueryLocalInterface9 : new qys0(strongBinder9);
                    }
                    jxs0 jxs0VarM142591o15 = ixs0.m142591o8(parcel.readStrongBinder());
                    r6s0.m180041c(parcel);
                    mo113456z6(string17, string18, zzlVar8, p1mVarM170217O11, qys0Var, jxs0VarM142591o15);
                    parcel2.writeNoException();
                    break;
                case 24:
                    p1m p1mVarM170217O12 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                    r6s0.m180041c(parcel);
                    boolean zMo113443H = mo113443H(p1mVarM170217O12);
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo113443H ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            r6s0.m180041c(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}
