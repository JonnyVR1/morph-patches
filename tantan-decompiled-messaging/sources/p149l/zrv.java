package p149l;

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
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m87232d2 = {"Ll/zrv;", "Ll/mtv;", "Ljava/util/concurrent/Executor;", "executor", "Ll/za80;", "pooledByteBufferFactory", "Landroid/content/ContentResolver;", "contentResolver", "<init>", "(Ljava/util/concurrent/Executor;Ll/za80;Landroid/content/ContentResolver;)V", "Lcom/facebook/imagepipeline/request/ImageRequest;", "imageRequest", "Ll/jze;", Constants.INAPP_DATA_TAG, "(Lcom/facebook/imagepipeline/request/ImageRequest;)Ll/jze;", "", "f", "()Ljava/lang/String;", "Landroid/net/Uri;", "uri", "g", "(Landroid/net/Uri;)Ll/jze;", "c", "Landroid/content/ContentResolver;", "Companion", "a", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class zrv extends mtv {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final String[] f204550d = {"_id", "_data"};

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final ContentResolver contentResolver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zrv(@NotNull Executor executor, @NotNull za80 za80Var, @NotNull ContentResolver contentResolver) {
        super(executor, za80Var);
        executor.getClass();
        za80Var.getClass();
        contentResolver.getClass();
        this.contentResolver = contentResolver;
    }

    @Override // p149l.mtv
    @Nullable
    /* JADX INFO: renamed from: d */
    public jze mo98619d(@NotNull ImageRequest imageRequest) throws IOException {
        jze jzeVarM219982g;
        InputStream inputStreamCreateInputStream;
        imageRequest.getClass();
        Uri uriM8585w = imageRequest.m8585w();
        uriM8585w.getClass();
        if (!fvj0.m123316k(uriM8585w)) {
            if (fvj0.m123315j(uriM8585w) && (jzeVarM219982g = m219982g(uriM8585w)) != null) {
                return jzeVarM219982g;
            }
            InputStream inputStreamOpenInputStream = this.contentResolver.openInputStream(uriM8585w);
            if (inputStreamOpenInputStream != null) {
                return m156359e(inputStreamOpenInputStream, -1);
            }
            qkq0.m175383a("Required value was null.");
            return null;
        }
        String string = uriM8585w.toString();
        string.getClass();
        if (C15386d.m93489w(string, "/photo", false, 2, null)) {
            inputStreamCreateInputStream = this.contentResolver.openInputStream(uriM8585w);
        } else {
            String string2 = uriM8585w.toString();
            string2.getClass();
            boolean zM93489w = C15386d.m93489w(string2, "/display_photo", false, 2, null);
            ContentResolver contentResolver = this.contentResolver;
            if (zM93489w) {
                try {
                    AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriM8585w, "r");
                    if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    inputStreamCreateInputStream = assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
                } catch (IOException unused) {
                    mll.m155165a("Contact photo does not exist: ", uriM8585w);
                    return null;
                }
            } else {
                InputStream inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriM8585w);
                if (inputStreamOpenContactPhotoInputStream == null) {
                    mll.m155165a("Contact photo does not exist: ", uriM8585w);
                    return null;
                }
                inputStreamCreateInputStream = inputStreamOpenContactPhotoInputStream;
            }
        }
        if (inputStreamCreateInputStream != null) {
            return m156359e(inputStreamCreateInputStream, -1);
        }
        qkq0.m175383a("Required value was null.");
        return null;
    }

    @Override // p149l.mtv
    @NotNull
    /* JADX INFO: renamed from: f */
    public String mo98620f() {
        return "LocalContentUriFetchProducer";
    }

    /* JADX INFO: renamed from: g */
    public final jze m219982g(Uri uri) throws IOException {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.contentResolver.openFileDescriptor(uri, "r");
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                qkq0.m175383a("Required value was null.");
                return null;
            }
            jze jzeVarM156359e = m156359e(new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()), (int) parcelFileDescriptorOpenFileDescriptor.getStatSize());
            jzeVarM156359e.getClass();
            parcelFileDescriptorOpenFileDescriptor.close();
            return jzeVarM156359e;
        } catch (FileNotFoundException unused) {
        }
    }
}
