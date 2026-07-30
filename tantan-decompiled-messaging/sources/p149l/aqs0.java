package p149l;

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
public abstract class aqs0 extends kxr0 implements bqs0 {
    public aqs0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* JADX INFO: renamed from: o8 */
    public static bqs0 m98343o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof bqs0 ? (bqs0) iInterfaceQueryLocalInterface : new zps0(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [l.aqs0, l.bqs0] */
    /* JADX WARN: Type inference failed for: r5v11, types: [l.yps0] */
    /* JADX WARN: Type inference failed for: r5v15, types: [l.vps0] */
    /* JADX WARN: Type inference failed for: r5v19, types: [l.yps0] */
    /* JADX WARN: Type inference failed for: r5v21, types: [l.pps0] */
    /* JADX WARN: Type inference failed for: r5v24, types: [l.vps0] */
    /* JADX WARN: Type inference failed for: r5v28, types: [l.mps0] */
    /* JADX WARN: Type inference failed for: r5v5, types: [l.pps0] */
    /* JADX WARN: Type inference failed for: r5v9, types: [l.sps0] */
    /* JADX WARN: Type inference failed for: r6v3, types: [l.eqs0] */
    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        IInterface kps0Var = null;
        if (i == 1) {
            uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
            String string = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) lxr0.m152084a(parcel, creator);
            Bundle bundle2 = (Bundle) lxr0.m152084a(parcel, creator);
            zzq zzqVar = (zzq) lxr0.m152084a(parcel, zzq.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                kps0Var = iInterfaceQueryLocalInterface instanceof eqs0 ? (eqs0) iInterfaceQueryLocalInterface : new cqs0(strongBinder);
            }
            lxr0.m152086c(parcel);
            mo103419s6(uylVarM196295O, string, bundle, bundle2, zzqVar, kps0Var);
            parcel2.writeNoException();
        } else if (i == 2) {
            zzbvg zzbvgVarZzf = zzf();
            parcel2.writeNoException();
            lxr0.m152088e(parcel2, zzbvgVarZzf);
        } else if (i == 3) {
            zzbvg zzbvgVarZzg = zzg();
            parcel2.writeNoException();
            lxr0.m152088e(parcel2, zzbvgVarZzg);
        } else if (i == 5) {
            fgu0 fgu0VarZze = zze();
            parcel2.writeNoException();
            lxr0.m152089f(parcel2, fgu0VarZze);
        } else if (i == 10) {
            uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
            lxr0.m152086c(parcel);
            parcel2.writeNoException();
        } else if (i != 11) {
            switch (i) {
                case 13:
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    zzl zzlVar = (zzl) lxr0.m152084a(parcel, zzl.CREATOR);
                    uyl uylVarM196295O2 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        kps0Var = iInterfaceQueryLocalInterface2 instanceof pps0 ? (pps0) iInterfaceQueryLocalInterface2 : new nps0(strongBinder2);
                    }
                    ?? r5 = kps0Var;
                    dos0 dos0VarM108031o8 = cos0.m108031o8(parcel.readStrongBinder());
                    zzq zzqVar2 = (zzq) lxr0.m152084a(parcel, zzq.CREATOR);
                    lxr0.m152086c(parcel);
                    mo103412O1(string2, string3, zzlVar, uylVarM196295O2, r5, dos0VarM108031o8, zzqVar2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    zzl zzlVar2 = (zzl) lxr0.m152084a(parcel, zzl.CREATOR);
                    uyl uylVarM196295O3 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                    IBinder strongBinder3 = parcel.readStrongBinder();
                    if (strongBinder3 != null) {
                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        kps0Var = iInterfaceQueryLocalInterface3 instanceof sps0 ? (sps0) iInterfaceQueryLocalInterface3 : new qps0(strongBinder3);
                    }
                    dos0 dos0VarM108031o9 = cos0.m108031o8(parcel.readStrongBinder());
                    lxr0.m152086c(parcel);
                    mo103416b3(string4, string5, zzlVar2, uylVarM196295O3, kps0Var, dos0VarM108031o9);
                    parcel2.writeNoException();
                    break;
                case 15:
                    uyl uylVarM196295O4 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                    lxr0.m152086c(parcel);
                    boolean zMo103418o0 = mo103418o0(uylVarM196295O4);
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo103418o0 ? 1 : 0);
                    break;
                case 16:
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    zzl zzlVar3 = (zzl) lxr0.m152084a(parcel, zzl.CREATOR);
                    uyl uylVarM196295O5 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                    IBinder strongBinder4 = parcel.readStrongBinder();
                    if (strongBinder4 != null) {
                        IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        kps0Var = iInterfaceQueryLocalInterface4 instanceof yps0 ? (yps0) iInterfaceQueryLocalInterface4 : new wps0(strongBinder4);
                    }
                    dos0 dos0VarM108031o10 = cos0.m108031o8(parcel.readStrongBinder());
                    lxr0.m152086c(parcel);
                    mo103420t7(string6, string7, zzlVar3, uylVarM196295O5, kps0Var, dos0VarM108031o10);
                    parcel2.writeNoException();
                    break;
                case 17:
                    uyl uylVarM196295O6 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                    lxr0.m152086c(parcel);
                    boolean zMo103417e6 = mo103417e6(uylVarM196295O6);
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo103417e6 ? 1 : 0);
                    break;
                case 18:
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    zzl zzlVar4 = (zzl) lxr0.m152084a(parcel, zzl.CREATOR);
                    uyl uylVarM196295O7 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                    IBinder strongBinder5 = parcel.readStrongBinder();
                    if (strongBinder5 != null) {
                        IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        kps0Var = iInterfaceQueryLocalInterface5 instanceof vps0 ? (vps0) iInterfaceQueryLocalInterface5 : new tps0(strongBinder5);
                    }
                    dos0 dos0VarM108031o11 = cos0.m108031o8(parcel.readStrongBinder());
                    lxr0.m152086c(parcel);
                    mo103414T0(string8, string9, zzlVar4, uylVarM196295O7, kps0Var, dos0VarM108031o11);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String string10 = parcel.readString();
                    lxr0.m152086c(parcel);
                    mo103413T(string10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String string11 = parcel.readString();
                    String string12 = parcel.readString();
                    zzl zzlVar5 = (zzl) lxr0.m152084a(parcel, zzl.CREATOR);
                    uyl uylVarM196295O8 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                    IBinder strongBinder6 = parcel.readStrongBinder();
                    if (strongBinder6 != null) {
                        IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        kps0Var = iInterfaceQueryLocalInterface6 instanceof yps0 ? (yps0) iInterfaceQueryLocalInterface6 : new wps0(strongBinder6);
                    }
                    dos0 dos0VarM108031o12 = cos0.m108031o8(parcel.readStrongBinder());
                    lxr0.m152086c(parcel);
                    mo103411I7(string11, string12, zzlVar5, uylVarM196295O8, kps0Var, dos0VarM108031o12);
                    parcel2.writeNoException();
                    break;
                case 21:
                    String string13 = parcel.readString();
                    String string14 = parcel.readString();
                    zzl zzlVar6 = (zzl) lxr0.m152084a(parcel, zzl.CREATOR);
                    uyl uylVarM196295O9 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                    IBinder strongBinder7 = parcel.readStrongBinder();
                    if (strongBinder7 != null) {
                        IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        kps0Var = iInterfaceQueryLocalInterface7 instanceof pps0 ? (pps0) iInterfaceQueryLocalInterface7 : new nps0(strongBinder7);
                    }
                    ?? r6 = kps0Var;
                    dos0 dos0VarM108031o13 = cos0.m108031o8(parcel.readStrongBinder());
                    zzq zzqVar3 = (zzq) lxr0.m152084a(parcel, zzq.CREATOR);
                    lxr0.m152086c(parcel);
                    mo103421z1(string13, string14, zzlVar6, uylVarM196295O9, r6, dos0VarM108031o13, zzqVar3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    String string15 = parcel.readString();
                    String string16 = parcel.readString();
                    zzl zzlVar7 = (zzl) lxr0.m152084a(parcel, zzl.CREATOR);
                    uyl uylVarM196295O10 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                    IBinder strongBinder8 = parcel.readStrongBinder();
                    if (strongBinder8 != null) {
                        IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        kps0Var = iInterfaceQueryLocalInterface8 instanceof vps0 ? (vps0) iInterfaceQueryLocalInterface8 : new tps0(strongBinder8);
                    }
                    dos0 dos0VarM108031o14 = cos0.m108031o8(parcel.readStrongBinder());
                    zzbjb zzbjbVar = (zzbjb) lxr0.m152084a(parcel, zzbjb.CREATOR);
                    lxr0.m152086c(parcel);
                    mo103415X3(string15, string16, zzlVar7, uylVarM196295O10, kps0Var, dos0VarM108031o14, zzbjbVar);
                    parcel2.writeNoException();
                    break;
                case 23:
                    String string17 = parcel.readString();
                    String string18 = parcel.readString();
                    zzl zzlVar8 = (zzl) lxr0.m152084a(parcel, zzl.CREATOR);
                    uyl uylVarM196295O11 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                    IBinder strongBinder9 = parcel.readStrongBinder();
                    if (strongBinder9 != null) {
                        IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        kps0Var = iInterfaceQueryLocalInterface9 instanceof mps0 ? (mps0) iInterfaceQueryLocalInterface9 : new kps0(strongBinder9);
                    }
                    dos0 dos0VarM108031o15 = cos0.m108031o8(parcel.readStrongBinder());
                    lxr0.m152086c(parcel);
                    mo103422z6(string17, string18, zzlVar8, uylVarM196295O11, kps0Var, dos0VarM108031o15);
                    parcel2.writeNoException();
                    break;
                case 24:
                    uyl uylVarM196295O12 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                    lxr0.m152086c(parcel);
                    boolean zMo103410H = mo103410H(uylVarM196295O12);
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo103410H ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            lxr0.m152086c(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}
