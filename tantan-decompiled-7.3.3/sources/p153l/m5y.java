package p153l;

import android.media.session.MediaSessionManager;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
public final class m5y extends n5y {

    /* JADX INFO: renamed from: d */
    public final MediaSessionManager.RemoteUserInfo f134952d;

    public m5y(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
        this.f134952d = remoteUserInfo;
    }

    /* JADX INFO: renamed from: a */
    public static String m157127a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        return remoteUserInfo.getPackageName();
    }

    public m5y(String str, int i, int i2) {
        super(str, i, i2);
        this.f134952d = i5y.m138790a(str, i, i2);
    }
}
