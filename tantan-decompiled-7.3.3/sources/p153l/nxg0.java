package p153l;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class nxg0 {

    /* JADX INFO: renamed from: a */
    public final rg50 f144123a;

    public nxg0(Context context) {
        StringBuilder sb = yuq0.f201657a;
        File file = new File(context.getApplicationContext().getCacheDir(), "sud-picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        rg50 rg50VarM181365c = new rg50.C19837b().m181366d(new tx3(file, yuq0.m217467c(file))).m181372j(new h0h0("PicassoIpv4PreferredDns")).m181365c();
        this.f144123a = rg50VarM181365c;
        rg50VarM181365c.m181343c();
    }
}
