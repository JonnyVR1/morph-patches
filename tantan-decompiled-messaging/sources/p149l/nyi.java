package p149l;

import android.app.Notification;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class nyi {

    /* JADX INFO: renamed from: a */
    public final int f141120a;

    /* JADX INFO: renamed from: b */
    public final int f141121b;

    /* JADX INFO: renamed from: c */
    public final Notification f141122c;

    public nyi(int i, @NonNull Notification notification, int i2) {
        this.f141120a = i;
        this.f141122c = notification;
        this.f141121b = i2;
    }

    /* JADX INFO: renamed from: a */
    public int m162011a() {
        return this.f141121b;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public Notification m162012b() {
        return this.f141122c;
    }

    /* JADX INFO: renamed from: c */
    public int m162013c() {
        return this.f141120a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nyi.class != obj.getClass()) {
            return false;
        }
        nyi nyiVar = (nyi) obj;
        if (this.f141120a == nyiVar.f141120a && this.f141121b == nyiVar.f141121b) {
            return this.f141122c.equals(nyiVar.f141122c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f141120a * 31) + this.f141121b) * 31) + this.f141122c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f141120a + ", mForegroundServiceType=" + this.f141121b + ", mNotification=" + this.f141122c + '}';
    }
}
