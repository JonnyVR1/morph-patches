package androidx.core.app;

import android.app.PendingIntent;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1419a = (IconCompat) versionedParcel.m4139v(remoteActionCompat.f1419a, 1);
        remoteActionCompat.f1420b = versionedParcel.m4129l(remoteActionCompat.f1420b, 2);
        remoteActionCompat.f1421c = versionedParcel.m4129l(remoteActionCompat.f1421c, 3);
        remoteActionCompat.f1422d = (PendingIntent) versionedParcel.m4135r(remoteActionCompat.f1422d, 4);
        remoteActionCompat.f1423e = versionedParcel.m4125h(remoteActionCompat.f1423e, 5);
        remoteActionCompat.f1424f = versionedParcel.m4125h(remoteActionCompat.f1424f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.m4141x(false, false);
        versionedParcel.m4116M(remoteActionCompat.f1419a, 1);
        versionedParcel.m4107D(remoteActionCompat.f1420b, 2);
        versionedParcel.m4107D(remoteActionCompat.f1421c, 3);
        versionedParcel.m4111H(remoteActionCompat.f1422d, 4);
        versionedParcel.m4143z(remoteActionCompat.f1423e, 5);
        versionedParcel.m4143z(remoteActionCompat.f1424f, 6);
    }
}
