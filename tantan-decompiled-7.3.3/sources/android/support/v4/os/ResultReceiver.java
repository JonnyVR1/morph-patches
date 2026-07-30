package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C0037a();
    InterfaceC0040a mReceiver;
    final boolean mLocal = false;
    final Handler mHandler = null;

    /* JADX INFO: renamed from: android.support.v4.os.ResultReceiver$a */
    public class C0037a implements Parcelable.Creator<ResultReceiver> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    /* JADX INFO: renamed from: android.support.v4.os.ResultReceiver$b */
    public class BinderC0038b extends InterfaceC0040a.a {
        public BinderC0038b() {
        }

        @Override // android.support.v4.os.InterfaceC0040a
        /* JADX INFO: renamed from: w2 */
        public void mo189w2(int i, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.mHandler;
            if (handler != null) {
                handler.post(resultReceiver.new RunnableC0039c(i, bundle));
            } else {
                resultReceiver.mo4a(i, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v4.os.ResultReceiver$c */
    public class RunnableC0039c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final int f58a;

        /* JADX INFO: renamed from: b */
        public final Bundle f59b;

        public RunnableC0039c(int i, Bundle bundle) {
            this.f58a = i;
            this.f59b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.mo4a(this.f58a, this.f59b);
        }
    }

    public ResultReceiver(Parcel parcel) {
        this.mReceiver = InterfaceC0040a.a.m190O(parcel.readStrongBinder());
    }

    /* JADX INFO: renamed from: a */
    public void mo4a(int i, Bundle bundle) {
    }

    /* JADX INFO: renamed from: b */
    public void m186b(int i, Bundle bundle) {
        if (this.mLocal) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new RunnableC0039c(i, bundle));
                return;
            } else {
                mo4a(i, bundle);
                return;
            }
        }
        InterfaceC0040a interfaceC0040a = this.mReceiver;
        if (interfaceC0040a != null) {
            try {
                interfaceC0040a.mo189w2(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.mReceiver == null) {
                    this.mReceiver = new BinderC0038b();
                }
                parcel.writeStrongBinder(this.mReceiver.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
