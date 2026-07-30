package p149l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e1t0 extends kxr0 implements n2t0 {
    public e1t0() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                zzq zzqVar = (zzq) lxr0.m152084a(parcel, zzq.CREATOR);
                String string = parcel.readString();
                ons0 ons0VarM160368o8 = nns0.m160368o8(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                lxr0.m152086c(parcel);
                ips0 ips0VarMo12239Q2 = mo12239Q2(uylVarM196295O, zzqVar, string, ons0VarM160368o8, i3);
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, ips0VarMo12239Q2);
                return true;
            case 2:
                uyl uylVarM196295O2 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) lxr0.m152084a(parcel, zzq.CREATOR);
                String string2 = parcel.readString();
                ons0 ons0VarM160368o9 = nns0.m160368o8(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                lxr0.m152086c(parcel);
                ips0 ips0VarMo12236E2 = mo12236E2(uylVarM196295O2, zzqVar2, string2, ons0VarM160368o9, i4);
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, ips0VarMo12236E2);
                return true;
            case 3:
                uyl uylVarM196295O3 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                String string3 = parcel.readString();
                ons0 ons0VarM160368o10 = nns0.m160368o8(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                lxr0.m152086c(parcel);
                ujs0 ujs0VarMo12238F1 = mo12238F1(uylVarM196295O3, string3, ons0VarM160368o10, i5);
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, ujs0VarMo12238F1);
                return true;
            case 4:
                uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, null);
                return true;
            case 5:
                uyl uylVarM196295O4 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                uyl uylVarM196295O5 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                ybs0 ybs0VarMo12244b1 = mo12244b1(uylVarM196295O4, uylVarM196295O5);
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, ybs0VarMo12244b1);
                return true;
            case 6:
                uyl uylVarM196295O6 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                ons0 ons0VarM160368o11 = nns0.m160368o8(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                lxr0.m152086c(parcel);
                cws0 cws0VarMo12241W0 = mo12241W0(uylVarM196295O6, ons0VarM160368o11, i6);
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, cws0VarMo12241W0);
                return true;
            case 7:
                uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, null);
                return true;
            case 8:
                uyl uylVarM196295O7 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                lss0 lss0VarMo12246g0 = mo12246g0(uylVarM196295O7);
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, lss0VarMo12246g0);
                return true;
            case 9:
                uyl uylVarM196295O8 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                int i7 = parcel.readInt();
                lxr0.m152086c(parcel);
                gft0 gft0VarMo12248q0 = mo12248q0(uylVarM196295O8, i7);
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, gft0VarMo12248q0);
                return true;
            case 10:
                uyl uylVarM196295O9 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) lxr0.m152084a(parcel, zzq.CREATOR);
                String string4 = parcel.readString();
                int i8 = parcel.readInt();
                lxr0.m152086c(parcel);
                ips0 ips0VarMo12237E7 = mo12237E7(uylVarM196295O9, zzqVar3, string4, i8);
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, ips0VarMo12237E7);
                return true;
            case 11:
                uyl uylVarM196295O10 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                uyl uylVarM196295O11 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                uyl uylVarM196295O12 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                dcs0 dcs0VarMo12240S5 = mo12240S5(uylVarM196295O10, uylVarM196295O11, uylVarM196295O12);
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, dcs0VarMo12240S5);
                return true;
            case 12:
                uyl uylVarM196295O13 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                String string5 = parcel.readString();
                ons0 ons0VarM160368o12 = nns0.m160368o8(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                lxr0.m152086c(parcel);
                fys0 fys0VarMo12242W2 = mo12242W2(uylVarM196295O13, string5, ons0VarM160368o12, i9);
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, fys0VarMo12242W2);
                return true;
            case 13:
                uyl uylVarM196295O14 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                zzq zzqVar4 = (zzq) lxr0.m152084a(parcel, zzq.CREATOR);
                String string6 = parcel.readString();
                ons0 ons0VarM160368o13 = nns0.m160368o8(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                lxr0.m152086c(parcel);
                ips0 ips0VarMo12245b4 = mo12245b4(uylVarM196295O14, zzqVar4, string6, ons0VarM160368o13, i10);
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, ips0VarMo12245b4);
                return true;
            case 14:
                uyl uylVarM196295O15 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                ons0 ons0VarM160368o14 = nns0.m160368o8(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                lxr0.m152086c(parcel);
                y0t0 y0t0VarMo12235E0 = mo12235E0(uylVarM196295O15, ons0VarM160368o14, i11);
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, y0t0VarMo12235E0);
                return true;
            case 15:
                uyl uylVarM196295O16 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                ons0 ons0VarM160368o15 = nns0.m160368o8(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                lxr0.m152086c(parcel);
                ess0 ess0VarMo12249t1 = mo12249t1(uylVarM196295O16, ons0VarM160368o15, i12);
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, ess0VarMo12249t1);
                return true;
            case 16:
                uyl uylVarM196295O17 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                ons0 ons0VarM160368o16 = nns0.m160368o8(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                ais0 ais0VarM218865o8 = zhs0.m218865o8(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                cis0 cis0VarMo12243Y0 = mo12243Y0(uylVarM196295O17, ons0VarM160368o16, i13, ais0VarM218865o8);
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, cis0VarMo12243Y0);
                return true;
            case 17:
                uyl uylVarM196295O18 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                ons0 ons0VarM160368o17 = nns0.m160368o8(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                lxr0.m152086c(parcel);
                n7u0 n7u0VarMo12247o6 = mo12247o6(uylVarM196295O18, ons0VarM160368o17, i14);
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, n7u0VarMo12247o6);
                return true;
            default:
                return false;
        }
    }
}
