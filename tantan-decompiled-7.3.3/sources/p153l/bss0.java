package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbpp;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bss0 extends q6s0 implements ats0 {
    public bss0() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        xhs0 ofs0Var = null;
        zct0 zct0Var = null;
        switch (i) {
            case 1:
                lps0 lps0VarZze = zze();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, lps0VarZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    ofs0Var = iInterfaceQueryLocalInterface instanceof xhs0 ? (xhs0) iInterfaceQueryLocalInterface : new ofs0(strongBinder);
                }
                r6s0.m180041c(parcel);
                mo100262T3(ofs0Var);
                parcel2.writeNoException();
                return true;
            case 3:
                fms0 fms0VarM121382o8 = ems0.m121382o8(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo100268k6(fms0VarM121382o8);
                parcel2.writeNoException();
                return true;
            case 4:
                ims0 ims0VarM135982o8 = hms0.m135982o8(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo100269l7(ims0VarM135982o8);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                oms0 oms0VarM163838o8 = nms0.m163838o8(parcel.readStrongBinder());
                lms0 lms0VarM150489o8 = kms0.m150489o8(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo100261B2(string, oms0VarM163838o8, lms0VarM150489o8);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbjb zzbjbVar = (zzbjb) r6s0.m180039a(parcel, zzbjb.CREATOR);
                r6s0.m180041c(parcel);
                mo100264X0(zzbjbVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zct0Var = iInterfaceQueryLocalInterface2 instanceof zct0 ? (zct0) iInterfaceQueryLocalInterface2 : new zct0(strongBinder2);
                }
                r6s0.m180041c(parcel);
                mo100266a8(zct0Var);
                parcel2.writeNoException();
                return true;
            case 8:
                sms0 sms0VarM182107o8 = rms0.m182107o8(parcel.readStrongBinder());
                zzq zzqVar = (zzq) r6s0.m180039a(parcel, zzq.CREATOR);
                r6s0.m180041c(parcel);
                mo100263W5(sms0VarM182107o8, zzqVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) r6s0.m180039a(parcel, PublisherAdViewOptions.CREATOR);
                r6s0.m180041c(parcel);
                mo100270o4(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                fns0 fns0VarM196794o8 = ums0.m196794o8(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo100267h4(fns0VarM196794o8);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbpp zzbppVar = (zzbpp) r6s0.m180039a(parcel, zzbpp.CREATOR);
                r6s0.m180041c(parcel);
                mo100272t2(zzbppVar);
                parcel2.writeNoException();
                return true;
            case 14:
                xss0 xss0VarM207790o8 = wss0.m207790o8(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo100265Z5(xss0VarM207790o8);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) r6s0.m180039a(parcel, AdManagerAdViewOptions.CREATOR);
                r6s0.m180041c(parcel);
                mo100271q4(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
