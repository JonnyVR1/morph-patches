package p153l;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public final class g5y {

    /* JADX INFO: renamed from: a */
    public h5y f102366a;

    public g5y(@NonNull String str, int i, int i2) {
        if (str == null) {
            mnd0.m159157a("package shouldn't be null");
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            wg3.m206174a("packageName should be nonempty");
            throw null;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.f102366a = new m5y(str, i, i2);
        } else {
            this.f102366a = new n5y(str, i, i2);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g5y) {
            return this.f102366a.equals(((g5y) obj).f102366a);
        }
        return false;
    }

    public int hashCode() {
        return this.f102366a.hashCode();
    }

    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public g5y(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String strM157127a = m5y.m157127a(remoteUserInfo);
        if (strM157127a != null) {
            if (!TextUtils.isEmpty(strM157127a)) {
                this.f102366a = new m5y(remoteUserInfo);
                return;
            } else {
                wg3.m206174a("packageName should be nonempty");
                throw null;
            }
        }
        mnd0.m159157a("package shouldn't be null");
        throw null;
    }
}
