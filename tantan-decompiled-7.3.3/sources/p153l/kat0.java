package p153l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kat0 extends q6s0 implements tbt0 {
    public kat0() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                zzq zzqVar = (zzq) r6s0.m180039a(parcel, zzq.CREATOR);
                String string = parcel.readString();
                uws0 uws0VarM193369o8 = tws0.m193369o8(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                r6s0.m180041c(parcel);
                oys0 oys0VarMo12293Q2 = mo12293Q2(p1mVarM170217O, zzqVar, string, uws0VarM193369o8, i3);
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, oys0VarMo12293Q2);
                return true;
            case 2:
                p1m p1mVarM170217O2 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) r6s0.m180039a(parcel, zzq.CREATOR);
                String string2 = parcel.readString();
                uws0 uws0VarM193369o9 = tws0.m193369o8(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                r6s0.m180041c(parcel);
                oys0 oys0VarMo12290E2 = mo12290E2(p1mVarM170217O2, zzqVar2, string2, uws0VarM193369o9, i4);
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, oys0VarMo12290E2);
                return true;
            case 3:
                p1m p1mVarM170217O3 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                String string3 = parcel.readString();
                uws0 uws0VarM193369o10 = tws0.m193369o8(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                r6s0.m180041c(parcel);
                ats0 ats0VarMo12292F1 = mo12292F1(p1mVarM170217O3, string3, uws0VarM193369o10, i5);
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, ats0VarMo12292F1);
                return true;
            case 4:
                p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, null);
                return true;
            case 5:
                p1m p1mVarM170217O4 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                p1m p1mVarM170217O5 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                els0 els0VarMo12298b1 = mo12298b1(p1mVarM170217O4, p1mVarM170217O5);
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, els0VarMo12298b1);
                return true;
            case 6:
                p1m p1mVarM170217O6 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                uws0 uws0VarM193369o11 = tws0.m193369o8(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                r6s0.m180041c(parcel);
                i5t0 i5t0VarMo12295W0 = mo12295W0(p1mVarM170217O6, uws0VarM193369o11, i6);
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, i5t0VarMo12295W0);
                return true;
            case 7:
                p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, null);
                return true;
            case 8:
                p1m p1mVarM170217O7 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                r1t0 r1t0VarMo12300g0 = mo12300g0(p1mVarM170217O7);
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, r1t0VarMo12300g0);
                return true;
            case 9:
                p1m p1mVarM170217O8 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                int i7 = parcel.readInt();
                r6s0.m180041c(parcel);
                mot0 mot0VarMo12302q0 = mo12302q0(p1mVarM170217O8, i7);
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, mot0VarMo12302q0);
                return true;
            case 10:
                p1m p1mVarM170217O9 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) r6s0.m180039a(parcel, zzq.CREATOR);
                String string4 = parcel.readString();
                int i8 = parcel.readInt();
                r6s0.m180041c(parcel);
                oys0 oys0VarMo12291E7 = mo12291E7(p1mVarM170217O9, zzqVar3, string4, i8);
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, oys0VarMo12291E7);
                return true;
            case 11:
                p1m p1mVarM170217O10 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                p1m p1mVarM170217O11 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                p1m p1mVarM170217O12 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                jls0 jls0VarMo12294S5 = mo12294S5(p1mVarM170217O10, p1mVarM170217O11, p1mVarM170217O12);
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, jls0VarMo12294S5);
                return true;
            case 12:
                p1m p1mVarM170217O13 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                String string5 = parcel.readString();
                uws0 uws0VarM193369o12 = tws0.m193369o8(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                r6s0.m180041c(parcel);
                l7t0 l7t0VarMo12296W2 = mo12296W2(p1mVarM170217O13, string5, uws0VarM193369o12, i9);
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, l7t0VarMo12296W2);
                return true;
            case 13:
                p1m p1mVarM170217O14 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                zzq zzqVar4 = (zzq) r6s0.m180039a(parcel, zzq.CREATOR);
                String string6 = parcel.readString();
                uws0 uws0VarM193369o13 = tws0.m193369o8(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                r6s0.m180041c(parcel);
                oys0 oys0VarMo12299b4 = mo12299b4(p1mVarM170217O14, zzqVar4, string6, uws0VarM193369o13, i10);
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, oys0VarMo12299b4);
                return true;
            case 14:
                p1m p1mVarM170217O15 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                uws0 uws0VarM193369o14 = tws0.m193369o8(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                r6s0.m180041c(parcel);
                eat0 eat0VarMo12289E0 = mo12289E0(p1mVarM170217O15, uws0VarM193369o14, i11);
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, eat0VarMo12289E0);
                return true;
            case 15:
                p1m p1mVarM170217O16 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                uws0 uws0VarM193369o15 = tws0.m193369o8(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                r6s0.m180041c(parcel);
                k1t0 k1t0VarMo12303t1 = mo12303t1(p1mVarM170217O16, uws0VarM193369o15, i12);
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, k1t0VarMo12303t1);
                return true;
            case 16:
                p1m p1mVarM170217O17 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                uws0 uws0VarM193369o16 = tws0.m193369o8(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                grs0 grs0VarM126980o8 = frs0.m126980o8(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                irs0 irs0VarMo12297Y0 = mo12297Y0(p1mVarM170217O17, uws0VarM193369o16, i13, grs0VarM126980o8);
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, irs0VarMo12297Y0);
                return true;
            case 17:
                p1m p1mVarM170217O18 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                uws0 uws0VarM193369o17 = tws0.m193369o8(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                r6s0.m180041c(parcel);
                tgu0 tgu0VarMo12301o6 = mo12301o6(p1mVarM170217O18, uws0VarM193369o17, i14);
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, tgu0VarMo12301o6);
                return true;
            default:
                return false;
        }
    }
}
