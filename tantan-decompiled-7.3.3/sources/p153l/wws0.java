package p153l;

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
public abstract class wws0 extends q6s0 implements xws0 {
    public wws0() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        jxs0 yws0Var;
        jxs0 yws0Var2;
        jxs0 yws0Var3;
        jxs0 yws0Var4;
        jxs0 yws0Var5;
        jxs0 yws0Var6;
        jxs0 yws0Var7;
        jxs0 yws0Var8;
        jxs0 yws0Var9 = null;
        switch (i) {
            case 1:
                p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                zzq zzqVar = (zzq) r6s0.m180039a(parcel, zzq.CREATOR);
                zzl zzlVar = (zzl) r6s0.m180039a(parcel, zzl.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    yws0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    yws0Var = iInterfaceQueryLocalInterface instanceof jxs0 ? (jxs0) iInterfaceQueryLocalInterface : new yws0(strongBinder);
                }
                r6s0.m180041c(parcel);
                mo107064X5(p1mVarM170217O, zzqVar, zzlVar, string, yws0Var);
                parcel2.writeNoException();
                return true;
            case 2:
                p1m p1mVarZzn = zzn();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, p1mVarZzn);
                return true;
            case 3:
                p1m p1mVarM170217O2 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                zzl zzlVar2 = (zzl) r6s0.m180039a(parcel, zzl.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    yws0Var2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    yws0Var2 = iInterfaceQueryLocalInterface2 instanceof jxs0 ? (jxs0) iInterfaceQueryLocalInterface2 : new yws0(strongBinder2);
                }
                r6s0.m180041c(parcel);
                mo107065c7(p1mVarM170217O2, zzlVar2, string2, yws0Var2);
                parcel2.writeNoException();
                return true;
            case 4:
                mo107072p();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                p1m p1mVarM170217O3 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) r6s0.m180039a(parcel, zzq.CREATOR);
                zzl zzlVar3 = (zzl) r6s0.m180039a(parcel, zzl.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    yws0Var3 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    yws0Var3 = iInterfaceQueryLocalInterface3 instanceof jxs0 ? (jxs0) iInterfaceQueryLocalInterface3 : new yws0(strongBinder3);
                }
                r6s0.m180041c(parcel);
                mo107070m6(p1mVarM170217O3, zzqVar2, zzlVar3, string3, string4, yws0Var3);
                parcel2.writeNoException();
                return true;
            case 7:
                p1m p1mVarM170217O4 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                zzl zzlVar4 = (zzl) r6s0.m180039a(parcel, zzl.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    yws0Var4 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    yws0Var4 = iInterfaceQueryLocalInterface4 instanceof jxs0 ? (jxs0) iInterfaceQueryLocalInterface4 : new yws0(strongBinder4);
                }
                r6s0.m180041c(parcel);
                mo107055D3(p1mVarM170217O4, zzlVar4, string5, string6, yws0Var4);
                parcel2.writeNoException();
                return true;
            case 8:
                mo107059M();
                parcel2.writeNoException();
                return true;
            case 9:
                zzF();
                parcel2.writeNoException();
                return true;
            case 10:
                p1m p1mVarM170217O5 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                zzl zzlVar5 = (zzl) r6s0.m180039a(parcel, zzl.CREATOR);
                String string7 = parcel.readString();
                e7t0 e7t0VarM114759o8 = d7t0.m114759o8(parcel.readStrongBinder());
                String string8 = parcel.readString();
                r6s0.m180041c(parcel);
                mo107060N2(p1mVarM170217O5, zzlVar5, string7, e7t0VarM114759o8, string8);
                parcel2.writeNoException();
                return true;
            case 11:
                zzl zzlVar6 = (zzl) r6s0.m180039a(parcel, zzl.CREATOR);
                String string9 = parcel.readString();
                r6s0.m180041c(parcel);
                mo107062S1(zzlVar6, string9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzL();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zZzN = zzN();
                parcel2.writeNoException();
                ClassLoader classLoader = r6s0.f161495a;
                parcel2.writeInt(zZzN ? 1 : 0);
                return true;
            case 14:
                p1m p1mVarM170217O6 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                zzl zzlVar7 = (zzl) r6s0.m180039a(parcel, zzl.CREATOR);
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 == null) {
                    yws0Var5 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    yws0Var5 = iInterfaceQueryLocalInterface5 instanceof jxs0 ? (jxs0) iInterfaceQueryLocalInterface5 : new yws0(strongBinder5);
                }
                zzbjb zzbjbVar = (zzbjb) r6s0.m180039a(parcel, zzbjb.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                r6s0.m180041c(parcel);
                mo107074s3(p1mVarM170217O6, zzlVar7, string10, string11, yws0Var5, zzbjbVar, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, null);
                return true;
            case 17:
                Bundle bundleZze = zze();
                parcel2.writeNoException();
                r6s0.m180043e(parcel2, bundleZze);
                return true;
            case 18:
                Bundle bundleZzf = zzf();
                parcel2.writeNoException();
                r6s0.m180043e(parcel2, bundleZzf);
                return true;
            case 19:
                Bundle bundleZzg = zzg();
                parcel2.writeNoException();
                r6s0.m180043e(parcel2, bundleZzg);
                return true;
            case 20:
                zzl zzlVar8 = (zzl) r6s0.m180039a(parcel, zzl.CREATOR);
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                r6s0.m180041c(parcel);
                mo107069l6(zzlVar8, string12, string13);
                parcel2.writeNoException();
                return true;
            case 21:
                p1m p1mVarM170217O7 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo107075t3(p1mVarM170217O7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                ClassLoader classLoader2 = r6s0.f161495a;
                parcel2.writeInt(0);
                return true;
            case 23:
                p1m p1mVarM170217O8 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                e7t0 e7t0VarM114759o9 = d7t0.m114759o8(parcel.readStrongBinder());
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                r6s0.m180041c(parcel);
                mo107077w4(p1mVarM170217O8, e7t0VarM114759o9, arrayListCreateStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                bms0 bms0VarZzi = zzi();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, bms0VarZzi);
                return true;
            case 25:
                boolean zM180045g = r6s0.m180045g(parcel);
                r6s0.m180041c(parcel);
                zzG(zM180045g);
                parcel2.writeNoException();
                return true;
            case 26:
                lpu0 lpu0VarZzh = zzh();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, lpu0VarZzh);
                return true;
            case 27:
                rxs0 rxs0VarZzk = zzk();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, rxs0VarZzk);
                return true;
            case 28:
                p1m p1mVarM170217O9 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                zzl zzlVar9 = (zzl) r6s0.m180039a(parcel, zzl.CREATOR);
                String string14 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 == null) {
                    yws0Var6 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    yws0Var6 = iInterfaceQueryLocalInterface6 instanceof jxs0 ? (jxs0) iInterfaceQueryLocalInterface6 : new yws0(strongBinder6);
                }
                r6s0.m180041c(parcel);
                mo107068l4(p1mVarM170217O9, zzlVar9, string14, yws0Var6);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                p1m p1mVarM170217O10 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo107058L4(p1mVarM170217O10);
                parcel2.writeNoException();
                return true;
            case 31:
                p1m p1mVarM170217O11 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                iss0 iss0VarM137037o8 = hss0.m137037o8(parcel.readStrongBinder());
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzbpn.CREATOR);
                r6s0.m180041c(parcel);
                mo107057E1(p1mVarM170217O11, iss0VarM137037o8, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                p1m p1mVarM170217O12 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                zzl zzlVar10 = (zzl) r6s0.m180039a(parcel, zzl.CREATOR);
                String string15 = parcel.readString();
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 == null) {
                    yws0Var7 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    yws0Var7 = iInterfaceQueryLocalInterface7 instanceof jxs0 ? (jxs0) iInterfaceQueryLocalInterface7 : new yws0(strongBinder7);
                }
                r6s0.m180041c(parcel);
                mo107061O3(p1mVarM170217O12, zzlVar10, string15, yws0Var7);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbvg zzbvgVarZzl = zzl();
                parcel2.writeNoException();
                r6s0.m180043e(parcel2, zzbvgVarZzl);
                return true;
            case 34:
                zzbvg zzbvgVarZzm = zzm();
                parcel2.writeNoException();
                r6s0.m180043e(parcel2, zzbvgVarZzm);
                return true;
            case 35:
                p1m p1mVarM170217O13 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) r6s0.m180039a(parcel, zzq.CREATOR);
                zzl zzlVar11 = (zzl) r6s0.m180039a(parcel, zzl.CREATOR);
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 == null) {
                    yws0Var8 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    yws0Var8 = iInterfaceQueryLocalInterface8 instanceof jxs0 ? (jxs0) iInterfaceQueryLocalInterface8 : new yws0(strongBinder8);
                }
                r6s0.m180041c(parcel);
                mo107056D5(p1mVarM170217O13, zzqVar3, zzlVar11, string16, string17, yws0Var8);
                parcel2.writeNoException();
                return true;
            case 36:
                mxs0 mxs0VarZzj = zzj();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, mxs0VarZzj);
                return true;
            case 37:
                p1m p1mVarM170217O14 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo107063T4(p1mVarM170217O14);
                parcel2.writeNoException();
                return true;
            case 38:
                p1m p1mVarM170217O15 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                zzl zzlVar12 = (zzl) r6s0.m180039a(parcel, zzl.CREATOR);
                String string18 = parcel.readString();
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    yws0Var9 = iInterfaceQueryLocalInterface9 instanceof jxs0 ? (jxs0) iInterfaceQueryLocalInterface9 : new yws0(strongBinder9);
                }
                r6s0.m180041c(parcel);
                mo107066g8(p1mVarM170217O15, zzlVar12, string18, yws0Var9);
                parcel2.writeNoException();
                return true;
            case 39:
                p1m p1mVarM170217O16 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo107076v4(p1mVarM170217O16);
                parcel2.writeNoException();
                return true;
        }
    }
}
