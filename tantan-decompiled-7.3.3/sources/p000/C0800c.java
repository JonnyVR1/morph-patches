package p000;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.FileUtils;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15493d;
import kotlin.text.Regex;
import org.jetbrains.annotations.Nullable;
import p153l.jzv;

/* JADX INFO: renamed from: c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0000\u0010\bJ=\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, m88121d2 = {"Lc;", "", "<init>", "()V", "Landroid/net/Uri;", "uri", "", Constants.INAPP_DATA_TAG, "(Landroid/net/Uri;)Z", "Landroid/content/Context;", "context", "", "selection", "", "selectionArgs", "a", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "f", "e", "g", "(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;", "imageUri", "b", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class C0800c {
    public static final C0800c INSTANCE = new C0800c();

    private C0800c() {
    }

    /* JADX INFO: renamed from: a */
    private final String m4642a(Context context, Uri uri, String selection, String[] selectionArgs) throws Throwable {
        Throwable th;
        String[] strArr = {"_data"};
        Cursor cursor = null;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            if (uri == null) {
                Intrinsics.m88386m();
            }
            Cursor cursorQuery = contentResolver.query(uri, strArr, selection, selectionArgs, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor == null) {
                        throw th;
                    }
                    cursor.close();
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: c */
    private final boolean m4643c(Uri uri) {
        return Intrinsics.m88377d("com.android.providers.downloads.documents", uri.getAuthority());
    }

    /* JADX INFO: renamed from: d */
    private final boolean m4644d(Uri uri) {
        return Intrinsics.m88377d("com.android.externalstorage.documents", uri.getAuthority());
    }

    /* JADX INFO: renamed from: e */
    private final boolean m4645e(Uri uri) {
        return Intrinsics.m88377d("com.google.android.apps.photos.content", uri.getAuthority());
    }

    /* JADX INFO: renamed from: f */
    private final boolean m4646f(Uri uri) {
        return Intrinsics.m88377d("com.android.providers.media.documents", uri.getAuthority());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a6 A[PHI: r1
      0x00a6: PHI (r1v1 java.io.File) = (r1v0 java.io.File), (r1v0 java.io.File), (r1v2 java.io.File) binds: [B:6:0x0022, B:11:0x003a, B:26:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    @RequiresApi(api = 29)
    /* JADX INFO: renamed from: g */
    private final String m4647g(Context context, Uri uri) {
        File file;
        IOException iOException;
        if (Intrinsics.m88377d(uri.getScheme(), "file")) {
            file = new File(uri.getPath());
        } else {
            File file2 = null;
            if (Intrinsics.m88377d(uri.getScheme(), "content")) {
                ContentResolver contentResolver = context.getContentResolver();
                Cursor cursorQuery = contentResolver.query(uri, null, null, null, null);
                if (cursorQuery == null) {
                    Intrinsics.m88386m();
                }
                if (cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                    try {
                        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                        File externalCacheDir = context.getExternalCacheDir();
                        if (externalCacheDir == null) {
                            Intrinsics.m88386m();
                        }
                        externalCacheDir.getClass();
                        File file3 = new File(externalCacheDir.getAbsolutePath(), String.valueOf(Math.round((Math.random() + 1.0d) * 1000.0d)) + string);
                        FileOutputStream fileOutputStream = new FileOutputStream(file3);
                        if (inputStreamOpenInputStream == null) {
                            Intrinsics.m88386m();
                        }
                        FileUtils.copy(inputStreamOpenInputStream, fileOutputStream);
                        try {
                            fileOutputStream.close();
                            inputStreamOpenInputStream.close();
                            file = file3;
                        } catch (IOException e) {
                            iOException = e;
                            file2 = file3;
                            jzv.m147730c("uriToFileApiQ", "", iOException);
                            file = file2;
                        }
                    } catch (IOException e2) {
                        iOException = e2;
                    }
                } else {
                    file = file2;
                }
            } else {
                file = file2;
            }
        }
        if (file == null) {
            Intrinsics.m88386m();
        }
        String absolutePath = file.getAbsolutePath();
        absolutePath.getClass();
        return absolutePath;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m4648b(@Nullable Context context, @Nullable Uri imageUri) {
        List listEmptyList;
        List listEmptyList2;
        Uri uri = null;
        if (context != null && imageUri != null) {
            if (Build.VERSION.SDK_INT <= 29 && DocumentsContract.isDocumentUri(context, imageUri)) {
                if (m4644d(imageUri)) {
                    String documentId = DocumentsContract.getDocumentId(imageUri);
                    documentId.getClass();
                    List<String> listSplit = new Regex(":").split(documentId, 0);
                    if (!listSplit.isEmpty()) {
                        ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                listEmptyList2 = CollectionsKt.emptyList();
                                break;
                            }
                            if (listIterator.previous().length() != 0) {
                                listEmptyList2 = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                    } else {
                        listEmptyList2 = CollectionsKt.emptyList();
                        break;
                    }
                    Object[] array = listEmptyList2.toArray(new String[0]);
                    if (array == null) {
                        C0799b.m4641a("null cannot be cast to non-null type kotlin.Array<T>");
                        return null;
                    }
                    String[] strArr = (String[]) array;
                    if (C15493d.m94381x("primary", strArr[0], true)) {
                        return Environment.getExternalStorageDirectory().toString() + "/" + strArr[1];
                    }
                } else {
                    if (m4643c(imageUri)) {
                        String documentId2 = DocumentsContract.getDocumentId(imageUri);
                        Uri uri2 = Uri.parse("content://downloads/public_downloads");
                        Long lValueOf = Long.valueOf(documentId2);
                        lValueOf.getClass();
                        return m4642a(context, ContentUris.withAppendedId(uri2, lValueOf.longValue()), null, null);
                    }
                    if (m4646f(imageUri)) {
                        String documentId3 = DocumentsContract.getDocumentId(imageUri);
                        documentId3.getClass();
                        List<String> listSplit2 = new Regex(":").split(documentId3, 0);
                        if (!listSplit2.isEmpty()) {
                            ListIterator<String> listIterator2 = listSplit2.listIterator(listSplit2.size());
                            while (true) {
                                if (!listIterator2.hasPrevious()) {
                                    listEmptyList = CollectionsKt.emptyList();
                                    break;
                                }
                                if (listIterator2.previous().length() != 0) {
                                    listEmptyList = CollectionsKt.take(listSplit2, listIterator2.nextIndex() + 1);
                                    break;
                                }
                            }
                        } else {
                            listEmptyList = CollectionsKt.emptyList();
                            break;
                        }
                        Object[] array2 = listEmptyList.toArray(new String[0]);
                        if (array2 == null) {
                            C0799b.m4641a("null cannot be cast to non-null type kotlin.Array<T>");
                            return null;
                        }
                        String[] strArr2 = (String[]) array2;
                        String str = strArr2[0];
                        if (Intrinsics.m88377d("image", str)) {
                            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                        } else if (Intrinsics.m88377d("video", str)) {
                            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                        } else if (Intrinsics.m88377d("audio", str)) {
                            uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                        }
                        return m4642a(context, uri, "_id=?", new String[]{strArr2[1]});
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                return m4647g(context, imageUri);
            }
            if (C15493d.m94381x("content", imageUri.getScheme(), true)) {
                return m4645e(imageUri) ? imageUri.getLastPathSegment() : m4642a(context, imageUri, null, null);
            }
            if (C15493d.m94381x("file", imageUri.getScheme(), true)) {
                return imageUri.getPath();
            }
        }
        return null;
    }
}
