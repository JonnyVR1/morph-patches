package p149l;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public final class jwx {

    /* JADX INFO: renamed from: a */
    public kwx f120148a;

    public jwx(@NonNull String str, int i, int i2) {
        if (str == null) {
            jfd0.m141176a("package shouldn't be null");
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            ig3.m135964a("packageName should be nonempty");
            throw null;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.f120148a = new pwx(str, i, i2);
        } else {
            this.f120148a = new qwx(str, i, i2);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jwx) {
            return this.f120148a.equals(((jwx) obj).f120148a);
        }
        return false;
    }

    public int hashCode() {
        return this.f120148a.hashCode();
    }

    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public jwx(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String strM171767a = pwx.m171767a(remoteUserInfo);
        if (strM171767a != null) {
            if (!TextUtils.isEmpty(strM171767a)) {
                this.f120148a = new pwx(remoteUserInfo);
                return;
            } else {
                ig3.m135964a("packageName should be nonempty");
                throw null;
            }
        }
        jfd0.m141176a("package shouldn't be null");
        throw null;
    }
}
