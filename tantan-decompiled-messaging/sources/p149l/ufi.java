package p149l;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ufi extends avv<ParcelFileDescriptor> {
    public ufi(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // p149l.l4c
    @NonNull
    /* JADX INFO: renamed from: a */
    public Class<ParcelFileDescriptor> mo103356a() {
        return ParcelFileDescriptor.class;
    }

    @Override // p149l.avv
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo99208b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // p149l.avv
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor mo99209c(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor.getParcelFileDescriptor();
        }
        csg0.m108511a("FileDescriptor is null for: ", uri);
        return null;
    }
}
