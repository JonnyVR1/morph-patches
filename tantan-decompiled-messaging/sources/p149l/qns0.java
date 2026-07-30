package p149l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzbvg;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public abstract class qns0 extends kxr0 implements rns0 {
    public qns0() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        dos0 sns0Var;
        dos0 sns0Var2;
        dos0 sns0Var3;
        dos0 sns0Var4;
        dos0 sns0Var5;
        dos0 sns0Var6;
        dos0 sns0Var7;
        dos0 sns0Var8;
        dos0 sns0Var9 = null;
        switch (i) {
            case 1:
                uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                zzq zzqVar = (zzq) lxr0.m152084a(parcel, zzq.CREATOR);
                zzl zzlVar = (zzl) lxr0.m152084a(parcel, zzl.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    sns0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    sns0Var = iInterfaceQueryLocalInterface instanceof dos0 ? (dos0) iInterfaceQueryLocalInterface : new sns0(strongBinder);
                }
                lxr0.m152086c(parcel);
                mo180156X5(uylVarM196295O, zzqVar, zzlVar, string, sns0Var);
                parcel2.writeNoException();
                return true;
            case 2:
                uyl uylVarZzn = zzn();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, uylVarZzn);
                return true;
            case 3:
                uyl uylVarM196295O2 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                zzl zzlVar2 = (zzl) lxr0.m152084a(parcel, zzl.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    sns0Var2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    sns0Var2 = iInterfaceQueryLocalInterface2 instanceof dos0 ? (dos0) iInterfaceQueryLocalInterface2 : new sns0(strongBinder2);
                }
                lxr0.m152086c(parcel);
                mo180157c7(uylVarM196295O2, zzlVar2, string2, sns0Var2);
                parcel2.writeNoException();
                return true;
            case 4:
                mo170457p();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                uyl uylVarM196295O3 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) lxr0.m152084a(parcel, zzq.CREATOR);
                zzl zzlVar3 = (zzl) lxr0.m152084a(parcel, zzl.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    sns0Var3 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    sns0Var3 = iInterfaceQueryLocalInterface3 instanceof dos0 ? (dos0) iInterfaceQueryLocalInterface3 : new sns0(strongBinder3);
                }
                lxr0.m152086c(parcel);
                mo170456m6(uylVarM196295O3, zzqVar2, zzlVar3, string3, string4, sns0Var3);
                parcel2.writeNoException();
                return true;
            case 7:
                uyl uylVarM196295O4 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                zzl zzlVar4 = (zzl) lxr0.m152084a(parcel, zzl.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    sns0Var4 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    sns0Var4 = iInterfaceQueryLocalInterface4 instanceof dos0 ? (dos0) iInterfaceQueryLocalInterface4 : new sns0(strongBinder4);
                }
                lxr0.m152086c(parcel);
                mo170444D3(uylVarM196295O4, zzlVar4, string5, string6, sns0Var4);
                parcel2.writeNoException();
                return true;
            case 8:
                mo170448M();
                parcel2.writeNoException();
                return true;
            case 9:
                zzF();
                parcel2.writeNoException();
                return true;
            case 10:
                uyl uylVarM196295O5 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                zzl zzlVar5 = (zzl) lxr0.m152084a(parcel, zzl.CREATOR);
                String string7 = parcel.readString();
                yxs0 yxs0VarM211540o8 = xxs0.m211540o8(parcel.readStrongBinder());
                String string8 = parcel.readString();
                lxr0.m152086c(parcel);
                mo170449N2(uylVarM196295O5, zzlVar5, string7, yxs0VarM211540o8, string8);
                parcel2.writeNoException();
                return true;
            case 11:
                zzl zzlVar6 = (zzl) lxr0.m152084a(parcel, zzl.CREATOR);
                String string9 = parcel.readString();
                lxr0.m152086c(parcel);
                mo170451S1(zzlVar6, string9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzL();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zZzN = zzN();
                parcel2.writeNoException();
                ClassLoader classLoader = lxr0.f130430a;
                parcel2.writeInt(zZzN ? 1 : 0);
                return true;
            case 14:
                uyl uylVarM196295O6 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                zzl zzlVar7 = (zzl) lxr0.m152084a(parcel, zzl.CREATOR);
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 == null) {
                    sns0Var5 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    sns0Var5 = iInterfaceQueryLocalInterface5 instanceof dos0 ? (dos0) iInterfaceQueryLocalInterface5 : new sns0(strongBinder5);
                }
                zzbjb zzbjbVar = (zzbjb) lxr0.m152084a(parcel, zzbjb.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                lxr0.m152086c(parcel);
                mo170458s3(uylVarM196295O6, zzlVar7, string10, string11, sns0Var5, zzbjbVar, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, null);
                return true;
            case 17:
                Bundle bundleZze = zze();
                parcel2.writeNoException();
                lxr0.m152088e(parcel2, bundleZze);
                return true;
            case 18:
                Bundle bundleZzf = zzf();
                parcel2.writeNoException();
                lxr0.m152088e(parcel2, bundleZzf);
                return true;
            case 19:
                Bundle bundleZzg = zzg();
                parcel2.writeNoException();
                lxr0.m152088e(parcel2, bundleZzg);
                return true;
            case 20:
                zzl zzlVar8 = (zzl) lxr0.m152084a(parcel, zzl.CREATOR);
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                lxr0.m152086c(parcel);
                mo180158l6(zzlVar8, string12, string13);
                parcel2.writeNoException();
                return true;
            case 21:
                uyl uylVarM196295O7 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo170459t3(uylVarM196295O7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                ClassLoader classLoader2 = lxr0.f130430a;
                parcel2.writeInt(0);
                return true;
            case 23:
                uyl uylVarM196295O8 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                yxs0 yxs0VarM211540o9 = xxs0.m211540o8(parcel.readStrongBinder());
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                lxr0.m152086c(parcel);
                mo170461w4(uylVarM196295O8, yxs0VarM211540o9, arrayListCreateStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                vcs0 vcs0VarZzi = zzi();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, vcs0VarZzi);
                return true;
            case 25:
                boolean zM152090g = lxr0.m152090g(parcel);
                lxr0.m152086c(parcel);
                zzG(zM152090g);
                parcel2.writeNoException();
                return true;
            case 26:
                fgu0 fgu0VarZzh = zzh();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, fgu0VarZzh);
                return true;
            case 27:
                los0 los0VarZzk = zzk();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, los0VarZzk);
                return true;
            case 28:
                uyl uylVarM196295O9 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                zzl zzlVar9 = (zzl) lxr0.m152084a(parcel, zzl.CREATOR);
                String string14 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 == null) {
                    sns0Var6 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    sns0Var6 = iInterfaceQueryLocalInterface6 instanceof dos0 ? (dos0) iInterfaceQueryLocalInterface6 : new sns0(strongBinder6);
                }
                lxr0.m152086c(parcel);
                mo170455l4(uylVarM196295O9, zzlVar9, string14, sns0Var6);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                uyl uylVarM196295O10 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo170447L4(uylVarM196295O10);
                parcel2.writeNoException();
                return true;
            case 31:
                uyl uylVarM196295O11 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                cjs0 cjs0VarM102228o8 = bjs0.m102228o8(parcel.readStrongBinder());
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzbpn.CREATOR);
                lxr0.m152086c(parcel);
                mo170446E1(uylVarM196295O11, cjs0VarM102228o8, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                uyl uylVarM196295O12 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                zzl zzlVar10 = (zzl) lxr0.m152084a(parcel, zzl.CREATOR);
                String string15 = parcel.readString();
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 == null) {
                    sns0Var7 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    sns0Var7 = iInterfaceQueryLocalInterface7 instanceof dos0 ? (dos0) iInterfaceQueryLocalInterface7 : new sns0(strongBinder7);
                }
                lxr0.m152086c(parcel);
                mo170450O3(uylVarM196295O12, zzlVar10, string15, sns0Var7);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbvg zzbvgVarZzl = zzl();
                parcel2.writeNoException();
                lxr0.m152088e(parcel2, zzbvgVarZzl);
                return true;
            case 34:
                zzbvg zzbvgVarZzm = zzm();
                parcel2.writeNoException();
                lxr0.m152088e(parcel2, zzbvgVarZzm);
                return true;
            case 35:
                uyl uylVarM196295O13 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) lxr0.m152084a(parcel, zzq.CREATOR);
                zzl zzlVar11 = (zzl) lxr0.m152084a(parcel, zzl.CREATOR);
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 == null) {
                    sns0Var8 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    sns0Var8 = iInterfaceQueryLocalInterface8 instanceof dos0 ? (dos0) iInterfaceQueryLocalInterface8 : new sns0(strongBinder8);
                }
                lxr0.m152086c(parcel);
                mo170445D5(uylVarM196295O13, zzqVar3, zzlVar11, string16, string17, sns0Var8);
                parcel2.writeNoException();
                return true;
            case 36:
                gos0 gos0VarZzj = zzj();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, gos0VarZzj);
                return true;
            case 37:
                uyl uylVarM196295O14 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo170452T4(uylVarM196295O14);
                parcel2.writeNoException();
                return true;
            case 38:
                uyl uylVarM196295O15 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                zzl zzlVar12 = (zzl) lxr0.m152084a(parcel, zzl.CREATOR);
                String string18 = parcel.readString();
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    sns0Var9 = iInterfaceQueryLocalInterface9 instanceof dos0 ? (dos0) iInterfaceQueryLocalInterface9 : new sns0(strongBinder9);
                }
                lxr0.m152086c(parcel);
                mo170453g8(uylVarM196295O15, zzlVar12, string18, sns0Var9);
                parcel2.writeNoException();
                return true;
            case 39:
                uyl uylVarM196295O16 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo170460v4(uylVarM196295O16);
                parcel2.writeNoException();
                return true;
        }
    }
}
