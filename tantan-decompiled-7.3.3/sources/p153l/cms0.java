package p153l;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.formats.MediaView;

/* JADX INFO: loaded from: classes6.dex */
public final class cms0 {

    /* JADX INFO: renamed from: a */
    public final bms0 f82641a;

    /* JADX INFO: renamed from: b */
    public final MediaView f82642b;

    /* JADX INFO: renamed from: c */
    public final vcl0 f82643c = new vcl0();

    @VisibleForTesting
    public cms0(bms0 bms0Var) {
        Context context;
        this.f82641a = bms0Var;
        MediaView mediaView = null;
        try {
            context = (Context) h950.m134037P2(bms0Var.zzh());
        } catch (RemoteException | NullPointerException e) {
            dct0.m115296e("", e);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (true == this.f82641a.mo105260o0(h950.m134038Y2(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e2) {
                dct0.m115296e("", e2);
            }
        }
        this.f82642b = mediaView;
    }

    /* JADX INFO: renamed from: a */
    public final bms0 m111314a() {
        return this.f82641a;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m111315b() {
        try {
            return this.f82641a.zzi();
        } catch (RemoteException e) {
            dct0.m115296e("", e);
            return null;
        }
    }
}
