package p149l;

import android.media.session.MediaSessionManager;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
public final class pwx extends qwx {

    /* JADX INFO: renamed from: d */
    public final MediaSessionManager.RemoteUserInfo f151608d;

    public pwx(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
        this.f151608d = remoteUserInfo;
    }

    /* JADX INFO: renamed from: a */
    public static String m171767a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        return remoteUserInfo.getPackageName();
    }

    public pwx(String str, int i, int i2) {
        super(str, i, i2);
        this.f151608d = lwx.m152020a(str, i, i2);
    }
}
