package p006l;

import com.p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.network.NetworkTrackInfo;
import l.e51;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class hwx extends qq2 {
    @Override // p006l.qq2, p006l.c2m
    /* JADX INFO: renamed from: d */
    public void mo11810a(final NetworkTrackInfo networkTrackInfo) {
        super.mo11810a(networkTrackInfo);
        e51.z(new Runnable() { // from class: l.gwx
            @Override // java.lang.Runnable
            public final void run() {
                TrackMediaUploadUtil.c0(networkTrackInfo);
            }
        }, true);
    }
}
