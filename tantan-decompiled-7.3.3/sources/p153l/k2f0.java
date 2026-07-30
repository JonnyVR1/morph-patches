package p153l;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.internal.C1680e;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000f\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Ll/k2f0;", "", "<init>", "()V", "Lcom/facebook/AccessToken;", "accessToken", "Ljava/io/File;", "file", "Lcom/facebook/GraphRequest$b;", "callback", "Lcom/facebook/GraphRequest;", "b", "(Lcom/facebook/AccessToken;Ljava/io/File;Lcom/facebook/GraphRequest$b;)Lcom/facebook/GraphRequest;", "Landroid/net/Uri;", "imageUri", "a", "(Lcom/facebook/AccessToken;Landroid/net/Uri;Lcom/facebook/GraphRequest$b;)Lcom/facebook/GraphRequest;", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public final class k2f0 {

    @NotNull
    public static final k2f0 INSTANCE = new k2f0();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final GraphRequest m147946a(@Nullable AccessToken accessToken, @NotNull Uri imageUri, @Nullable GraphRequest.InterfaceC1539b callback) throws FileNotFoundException {
        imageUri.getClass();
        String path = imageUri.getPath();
        if (C1680e.m8884a0(imageUri) && path != null) {
            return m147947b(accessToken, new File(path), callback);
        }
        if (!C1680e.m8880X(imageUri)) {
            throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
        }
        GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(imageUri, DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", parcelableResourceWithMimeType);
        return new GraphRequest(accessToken, "me/staging_resources", bundle, HttpMethod.POST, callback, null, 32, null);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final GraphRequest m147947b(@Nullable AccessToken accessToken, @Nullable File file, @Nullable GraphRequest.InterfaceC1539b callback) throws FileNotFoundException {
        GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file, SQLiteDatabase.CREATE_IF_NECESSARY), DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", parcelableResourceWithMimeType);
        return new GraphRequest(accessToken, "me/staging_resources", bundle, HttpMethod.POST, callback, null, 32, null);
    }
}
