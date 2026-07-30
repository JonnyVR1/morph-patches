package p149l;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.formats.MediaView;

/* JADX INFO: loaded from: classes6.dex */
public final class wcs0 {

    /* JADX INFO: renamed from: a */
    public final vcs0 f185710a;

    /* JADX INFO: renamed from: b */
    public final MediaView f185711b;

    /* JADX INFO: renamed from: c */
    public final q3l0 f185712c = new q3l0();

    @VisibleForTesting
    public wcs0(vcs0 vcs0Var) {
        Context context;
        this.f185710a = vcs0Var;
        MediaView mediaView = null;
        try {
            context = (Context) s050.m181847P2(vcs0Var.zzh());
        } catch (RemoteException | NullPointerException e) {
            x2t0.m206867e("", e);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (true == this.f185710a.mo184274o0(s050.m181848Y2(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e2) {
                x2t0.m206867e("", e2);
            }
        }
        this.f185711b = mediaView;
    }

    /* JADX INFO: renamed from: a */
    public final vcs0 m202677a() {
        return this.f185710a;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m202678b() {
        try {
            return this.f185710a.zzi();
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
            return null;
        }
    }
}
