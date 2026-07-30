package p153l;

import com.p051p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.network.NetworkTrackInfo;

/* JADX INFO: loaded from: classes9.dex */
public class e5y extends gr2 {
    @Override // p153l.gr2, p153l.v4m
    /* JADX INFO: renamed from: d */
    public void mo119562a(final NetworkTrackInfo networkTrackInfo) {
        super.mo119562a(networkTrackInfo);
        l51.m152920z(new Runnable() { // from class: l.d5y
            @Override // java.lang.Runnable
            public final void run() {
                TrackMediaUploadUtil.m81483c0(networkTrackInfo);
            }
        }, true);
    }
}
