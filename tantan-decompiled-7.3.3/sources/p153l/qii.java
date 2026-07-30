package p153l;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class qii extends a21<AssetFileDescriptor> {
    public qii(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // p153l.t5c
    @NonNull
    /* JADX INFO: renamed from: a */
    public Class<AssetFileDescriptor> mo106029a() {
        return AssetFileDescriptor.class;
    }

    @Override // p153l.a21
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo95588b(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // p153l.a21
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public AssetFileDescriptor mo95589c(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }
}
