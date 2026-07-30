package p153l;

import android.app.Notification;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class i1j {

    /* JADX INFO: renamed from: a */
    public final int f112525a;

    /* JADX INFO: renamed from: b */
    public final int f112526b;

    /* JADX INFO: renamed from: c */
    public final Notification f112527c;

    public i1j(int i, @NonNull Notification notification, int i2) {
        this.f112525a = i;
        this.f112527c = notification;
        this.f112526b = i2;
    }

    /* JADX INFO: renamed from: a */
    public int m138101a() {
        return this.f112526b;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public Notification m138102b() {
        return this.f112527c;
    }

    /* JADX INFO: renamed from: c */
    public int m138103c() {
        return this.f112525a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i1j.class != obj.getClass()) {
            return false;
        }
        i1j i1jVar = (i1j) obj;
        if (this.f112525a == i1jVar.f112525a && this.f112526b == i1jVar.f112526b) {
            return this.f112527c.equals(i1jVar.f112527c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f112525a * 31) + this.f112526b) * 31) + this.f112527c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f112525a + ", mForegroundServiceType=" + this.f112526b + ", mNotification=" + this.f112527c + '}';
    }
}
