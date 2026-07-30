package p153l;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class rii extends bxv<ParcelFileDescriptor> {
    public rii(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // p153l.t5c
    @NonNull
    /* JADX INFO: renamed from: a */
    public Class<ParcelFileDescriptor> mo106029a() {
        return ParcelFileDescriptor.class;
    }

    @Override // p153l.bxv
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo106912b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // p153l.bxv
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor mo106913c(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor.getParcelFileDescriptor();
        }
        k0h0.m147792a("FileDescriptor is null for: ", uri);
        return null;
    }
}
