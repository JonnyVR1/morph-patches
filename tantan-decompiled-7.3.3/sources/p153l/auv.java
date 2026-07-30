package p153l;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import com.clevertap.android.sdk.Constants;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m88121d2 = {"Ll/auv;", "Ll/nvv;", "Ljava/util/concurrent/Executor;", "executor", "Ll/fj80;", "pooledByteBufferFactory", "Landroid/content/ContentResolver;", "contentResolver", "<init>", "(Ljava/util/concurrent/Executor;Ll/fj80;Landroid/content/ContentResolver;)V", "Lcom/facebook/imagepipeline/request/ImageRequest;", "imageRequest", "Ll/n0f;", Constants.INAPP_DATA_TAG, "(Lcom/facebook/imagepipeline/request/ImageRequest;)Ll/n0f;", "", "f", "()Ljava/lang/String;", "Landroid/net/Uri;", "uri", "g", "(Landroid/net/Uri;)Ll/n0f;", "c", "Landroid/content/ContentResolver;", "Companion", "a", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class auv extends nvv {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final String[] f73550d = {"_id", "_data"};

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final ContentResolver contentResolver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auv(@NotNull Executor executor, @NotNull fj80 fj80Var, @NotNull ContentResolver contentResolver) {
        super(executor, fj80Var);
        executor.getClass();
        fj80Var.getClass();
        contentResolver.getClass();
        this.contentResolver = contentResolver;
    }

    @Override // p153l.nvv
    @Nullable
    /* JADX INFO: renamed from: d */
    public n0f mo100405d(@NotNull ImageRequest imageRequest) throws IOException {
        n0f n0fVarM100407g;
        InputStream inputStreamCreateInputStream;
        imageRequest.getClass();
        Uri uriM8639w = imageRequest.m8639w();
        uriM8639w.getClass();
        if (!i4k0.m138562k(uriM8639w)) {
            if (i4k0.m138561j(uriM8639w) && (n0fVarM100407g = m100407g(uriM8639w)) != null) {
                return n0fVarM100407g;
            }
            InputStream inputStreamOpenInputStream = this.contentResolver.openInputStream(uriM8639w);
            if (inputStreamOpenInputStream != null) {
                return m164929e(inputStreamOpenInputStream, -1);
            }
            wtq0.m207906a("Required value was null.");
            return null;
        }
        String string = uriM8639w.toString();
        string.getClass();
        if (C15493d.m94380w(string, "/photo", false, 2, null)) {
            inputStreamCreateInputStream = this.contentResolver.openInputStream(uriM8639w);
        } else {
            String string2 = uriM8639w.toString();
            string2.getClass();
            boolean zM94380w = C15493d.m94380w(string2, "/display_photo", false, 2, null);
            ContentResolver contentResolver = this.contentResolver;
            if (zM94380w) {
                try {
                    AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriM8639w, "r");
                    if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    inputStreamCreateInputStream = assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
                } catch (IOException unused) {
                    bol.m105705a("Contact photo does not exist: ", uriM8639w);
                    return null;
                }
            } else {
                InputStream inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriM8639w);
                if (inputStreamOpenContactPhotoInputStream == null) {
                    bol.m105705a("Contact photo does not exist: ", uriM8639w);
                    return null;
                }
                inputStreamCreateInputStream = inputStreamOpenContactPhotoInputStream;
            }
        }
        if (inputStreamCreateInputStream != null) {
            return m164929e(inputStreamCreateInputStream, -1);
        }
        wtq0.m207906a("Required value was null.");
        return null;
    }

    @Override // p153l.nvv
    @NotNull
    /* JADX INFO: renamed from: f */
    public String mo100406f() {
        return "LocalContentUriFetchProducer";
    }

    /* JADX INFO: renamed from: g */
    public final n0f m100407g(Uri uri) throws IOException {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.contentResolver.openFileDescriptor(uri, "r");
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                wtq0.m207906a("Required value was null.");
                return null;
            }
            n0f n0fVarM164929e = m164929e(new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()), (int) parcelFileDescriptorOpenFileDescriptor.getStatSize());
            n0fVarM164929e.getClass();
            parcelFileDescriptorOpenFileDescriptor.close();
            return n0fVarM164929e;
        } catch (FileNotFoundException unused) {
        }
    }
}
