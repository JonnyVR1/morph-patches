package p149l;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class bzf0 extends t11<InputStream> {
    public bzf0(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // p149l.l4c
    @NonNull
    /* JADX INFO: renamed from: a */
    public Class<InputStream> mo103356a() {
        return InputStream.class;
    }

    @Override // p149l.t11
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo104615b(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // p149l.t11
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InputStream mo104616c(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
