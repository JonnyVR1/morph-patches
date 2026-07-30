package p153l;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class i7g0 extends a21<InputStream> {
    public i7g0(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // p153l.t5c
    @NonNull
    /* JADX INFO: renamed from: a */
    public Class<InputStream> mo106029a() {
        return InputStream.class;
    }

    @Override // p153l.a21
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo95588b(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // p153l.a21
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InputStream mo95589c(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
