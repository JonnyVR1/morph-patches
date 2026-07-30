package p149l;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class tfi extends t11<ParcelFileDescriptor> {
    public tfi(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // p149l.l4c
    @NonNull
    /* JADX INFO: renamed from: a */
    public Class<ParcelFileDescriptor> mo103356a() {
        return ParcelFileDescriptor.class;
    }

    @Override // p149l.t11
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo104615b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // p149l.t11
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor mo104616c(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
