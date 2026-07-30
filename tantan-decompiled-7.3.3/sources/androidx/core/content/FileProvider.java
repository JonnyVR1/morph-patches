package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.CallSuper;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.XmlRes;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.meituan.robust.Constants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import p153l.d7b0;
import p153l.j26;
import p153l.l950;
import p153l.wg3;
import p153l.ypg0;

/* JADX INFO: loaded from: classes.dex */
public class FileProvider extends ContentProvider {
    private static final String ATTR_NAME = "name";
    private static final String ATTR_PATH = "path";
    private static final String DISPLAYNAME_FIELD = "displayName";
    private static final String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final String TAG_CACHE_PATH = "cache-path";
    private static final String TAG_EXTERNAL = "external-path";
    private static final String TAG_EXTERNAL_CACHE = "external-cache-path";
    private static final String TAG_EXTERNAL_FILES = "external-files-path";
    private static final String TAG_EXTERNAL_MEDIA = "external-media-path";
    private static final String TAG_FILES_PATH = "files-path";
    private static final String TAG_ROOT_PATH = "root-path";

    @GuardedBy("mLock")
    private String mAuthority;

    @Nullable
    @GuardedBy("mLock")
    private InterfaceC0248b mLocalPathStrategy;

    @NonNull
    private final Object mLock;
    private final int mResourceId;
    private static final String[] COLUMNS = {"_display_name", "_size"};
    private static final File DEVICE_ROOT = new File("/");

    @GuardedBy("sCache")
    private static final HashMap<String, InterfaceC0248b> sCache = new HashMap<>();

    /* JADX INFO: renamed from: androidx.core.content.FileProvider$a */
    @RequiresApi(21)
    public static class C0247a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static File[] m1283a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.FileProvider$b */
    public interface InterfaceC0248b {
        /* JADX INFO: renamed from: a */
        Uri mo1284a(File file);

        /* JADX INFO: renamed from: b */
        File mo1285b(Uri uri);
    }

    /* JADX INFO: renamed from: androidx.core.content.FileProvider$c */
    public static class C0249c implements InterfaceC0248b {

        /* JADX INFO: renamed from: a */
        public final String f1448a;

        /* JADX INFO: renamed from: b */
        public final HashMap<String, File> f1449b = new HashMap<>();

        public C0249c(String str) {
            this.f1448a = str;
        }

        @Override // androidx.core.content.FileProvider.InterfaceC0248b
        /* JADX INFO: renamed from: a */
        public Uri mo1284a(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f1449b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (m1287d(canonicalPath, path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    ypg0.m217021a("Failed to find configured root that contains ", canonicalPath);
                    return null;
                }
                String path2 = entry.getValue().getPath();
                return new Uri.Builder().scheme("content").authority(this.f1448a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            } catch (IOException unused) {
                ypg0.m217021a("Failed to resolve canonical path for ", file);
                return null;
            }
        }

        @Override // androidx.core.content.FileProvider.InterfaceC0248b
        /* JADX INFO: renamed from: b */
        public File mo1285b(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int iIndexOf = encodedPath.indexOf(47, 1);
            String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
            String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
            File file = this.f1449b.get(strDecode);
            if (file == null) {
                ypg0.m217021a("Unable to find configured root for ", uri);
                return null;
            }
            File file2 = new File(file, strDecode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (m1287d(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                ypg0.m217021a("Failed to resolve canonical path for ", file2);
                return null;
            }
        }

        /* JADX INFO: renamed from: c */
        public void m1286c(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                wg3.m206174a("Name must not be empty");
                return;
            }
            try {
                this.f1449b.put(str, file.getCanonicalFile());
            } catch (IOException e) {
                d7b0.m114716a("Failed to resolve canonical path for ", file, e);
            }
        }

        /* JADX INFO: renamed from: d */
        public final boolean m1287d(@NonNull String str, @NonNull String str2) {
            String strRemoveTrailingSlash = FileProvider.removeTrailingSlash(str);
            String strRemoveTrailingSlash2 = FileProvider.removeTrailingSlash(str2);
            if (strRemoveTrailingSlash.equals(strRemoveTrailingSlash2)) {
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(strRemoveTrailingSlash2);
            sb.append('/');
            return strRemoveTrailingSlash.startsWith(sb.toString());
        }
    }

    public FileProvider(@XmlRes int i) {
        this.mLock = new Object();
        this.mResourceId = i;
    }

    private static File buildPath(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static String[] copyOf(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    @VisibleForTesting
    public static XmlResourceParser getFileProviderPathsMetaData(Context context, String str, @Nullable ProviderInfo providerInfo, int i) {
        if (providerInfo == null) {
            ypg0.m217021a("Couldn't find meta-data for provider with authority ", str);
            return null;
        }
        if (providerInfo.metaData == null && i != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt(META_DATA_FILE_PROVIDER_PATHS, i);
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), META_DATA_FILE_PROVIDER_PATHS);
        if (xmlResourceParserLoadXmlMetaData != null) {
            return xmlResourceParserLoadXmlMetaData;
        }
        wg3.m206174a("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        return null;
    }

    @NonNull
    private InterfaceC0248b getLocalPathStrategy() {
        InterfaceC0248b interfaceC0248b;
        synchronized (this.mLock) {
            try {
                l950.m153330d(this.mAuthority, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                if (this.mLocalPathStrategy == null) {
                    this.mLocalPathStrategy = getPathStrategy(getContext(), this.mAuthority, this.mResourceId);
                }
                interfaceC0248b = this.mLocalPathStrategy;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0248b;
    }

    private static InterfaceC0248b getPathStrategy(Context context, String str, int i) {
        InterfaceC0248b pathStrategy;
        HashMap<String, InterfaceC0248b> map = sCache;
        synchronized (map) {
            try {
                pathStrategy = map.get(str);
                if (pathStrategy == null) {
                    try {
                        try {
                            pathStrategy = parsePathStrategy(context, str, i);
                            map.put(str, pathStrategy);
                        } catch (IOException e) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                        }
                    } catch (XmlPullParserException e2) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return pathStrategy;
    }

    @NonNull
    @SuppressLint({"StreamFiles"})
    public static Uri getUriForFile(@NonNull Context context, @NonNull String str, @NonNull File file, @NonNull String str2) {
        return getUriForFile(context, str, file).buildUpon().appendQueryParameter(DISPLAYNAME_FIELD, str2).build();
    }

    private static int modeToMode(String str) {
        if ("r".equals(str)) {
            return SQLiteDatabase.CREATE_IF_NECESSARY;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        ypg0.m217021a("Invalid mode: ", str);
        return 0;
    }

    private static InterfaceC0248b parsePathStrategy(Context context, String str, int i) throws XmlPullParserException, IOException {
        C0249c c0249c = new C0249c(str);
        XmlResourceParser fileProviderPathsMetaData = getFileProviderPathsMetaData(context, str, context.getPackageManager().resolveContentProvider(str, 128), i);
        while (true) {
            int next = fileProviderPathsMetaData.next();
            if (next == 1) {
                return c0249c;
            }
            if (next == 2) {
                String name = fileProviderPathsMetaData.getName();
                File externalStorageDirectory = null;
                String attributeValue = fileProviderPathsMetaData.getAttributeValue(null, "name");
                String attributeValue2 = fileProviderPathsMetaData.getAttributeValue(null, ATTR_PATH);
                if (TAG_ROOT_PATH.equals(name)) {
                    externalStorageDirectory = DEVICE_ROOT;
                } else if (TAG_FILES_PATH.equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if (TAG_CACHE_PATH.equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if (TAG_EXTERNAL.equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if (TAG_EXTERNAL_FILES.equals(name)) {
                    File[] fileArrM143194g = j26.m143194g(context, null);
                    if (fileArrM143194g.length > 0) {
                        externalStorageDirectory = fileArrM143194g[0];
                    }
                } else if (TAG_EXTERNAL_CACHE.equals(name)) {
                    File[] fileArrM143193f = j26.m143193f(context);
                    if (fileArrM143193f.length > 0) {
                        externalStorageDirectory = fileArrM143193f[0];
                    }
                } else if (TAG_EXTERNAL_MEDIA.equals(name)) {
                    File[] fileArrM1283a = C0247a.m1283a(context);
                    if (fileArrM1283a.length > 0) {
                        externalStorageDirectory = fileArrM1283a[0];
                    }
                }
                if (externalStorageDirectory != null) {
                    c0249c.m1286c(attributeValue, buildPath(externalStorageDirectory, attributeValue2));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static String removeTrailingSlash(@NonNull String str) {
        return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
    }

    @Override // android.content.ContentProvider
    @CallSuper
    public void attachInfo(@NonNull Context context, @NonNull ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(Constants.PACKNAME_END)[0];
        synchronized (this.mLock) {
            this.mAuthority = str;
        }
        HashMap<String, InterfaceC0248b> map = sCache;
        synchronized (map) {
            map.remove(str);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return getLocalPathStrategy().mo1285b(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        File fileMo1285b = getLocalPathStrategy().mo1285b(uri);
        int iLastIndexOf = fileMo1285b.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE;
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileMo1285b.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getTypeAnonymous(@NonNull Uri uri) {
        return OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE;
    }

    @Override // android.content.ContentProvider
    public Uri insert(@NonNull Uri uri, @NonNull ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(@NonNull Uri uri, @NonNull String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(getLocalPathStrategy().mo1285b(uri), modeToMode(str));
    }

    @Override // android.content.ContentProvider
    @NonNull
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        int i;
        File fileMo1285b = getLocalPathStrategy().mo1285b(uri);
        String queryParameter = uri.getQueryParameter(DISPLAYNAME_FIELD);
        if (strArr == null) {
            strArr = COLUMNS;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = queryParameter == null ? fileMo1285b.getName() : queryParameter;
            } else {
                if ("_size".equals(str3)) {
                    strArr3[i2] = "_size";
                    i = i2 + 1;
                    objArr[i2] = Long.valueOf(fileMo1285b.length());
                }
            }
            i2 = i;
        }
        String[] strArrCopyOf = copyOf(strArr3, i2);
        Object[] objArrCopyOf = copyOf(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArrCopyOf, 1);
        matrixCursor.addRow(objArrCopyOf);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @NonNull ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    private static Object[] copyOf(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    public FileProvider() {
        this(0);
    }

    public static Uri getUriForFile(@NonNull Context context, @NonNull String str, @NonNull File file) {
        return getPathStrategy(context, str, 0).mo1284a(file);
    }
}
