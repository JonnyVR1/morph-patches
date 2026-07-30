package p149l;

import com.p046p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.network.NetworkTrackInfo;

/* JADX INFO: loaded from: classes9.dex */
public class hwx extends qq2 {
    @Override // p149l.qq2, p149l.c2m
    /* JADX INFO: renamed from: d */
    public void mo95854a(final NetworkTrackInfo networkTrackInfo) {
        super.mo95854a(networkTrackInfo);
        e51.m114775z(new Runnable() { // from class: l.gwx
            @Override // java.lang.Runnable
            public final void run() {
                TrackMediaUploadUtil.m80300c0(networkTrackInfo);
            }
        }, true);
    }
}
