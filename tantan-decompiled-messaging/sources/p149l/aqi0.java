package p149l;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.C1056a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class aqi0 {

    /* JADX INFO: renamed from: f */
    private static final zgi f71163f = new zgi();

    /* JADX INFO: renamed from: a */
    private final zgi f71164a;

    /* JADX INFO: renamed from: b */
    private final ypi0 f71165b;

    /* JADX INFO: renamed from: c */
    private final h01 f71166c;

    /* JADX INFO: renamed from: d */
    private final ContentResolver f71167d;

    /* JADX INFO: renamed from: e */
    private final List<ImageHeaderParser> f71168e;

    public aqi0(List<ImageHeaderParser> list, zgi zgiVar, ypi0 ypi0Var, h01 h01Var, ContentResolver contentResolver) {
        this.f71164a = zgiVar;
        this.f71165b = ypi0Var;
        this.f71166c = h01Var;
        this.f71167d = contentResolver;
        this.f71168e = list;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0038  */
    @Nullable
    /* JADX INFO: renamed from: b */
    private String m98300b(@NonNull Uri uri) throws Throwable {
        Cursor cursorMo194882a;
        Cursor cursor = null;
        try {
            cursorMo194882a = this.f71165b.mo194882a(uri);
            if (cursorMo194882a != null) {
                try {
                    try {
                        if (cursorMo194882a.moveToFirst()) {
                            String string = cursorMo194882a.getString(0);
                            cursorMo194882a.close();
                            return string;
                        }
                    } catch (SecurityException unused) {
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Objects.toString(uri);
                        }
                        if (cursorMo194882a != null) {
                            cursorMo194882a.close();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorMo194882a;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorMo194882a != null) {
                cursorMo194882a.close();
            }
            return null;
        } catch (SecurityException unused2) {
            cursorMo194882a = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m98301c(File file) {
        return this.f71164a.m218649a(file) && 0 < this.f71164a.m218651c(file);
    }

    /* JADX INFO: renamed from: a */
    public int m98302a(Uri uri) {
        InputStream inputStreamOpenInputStream = null;
        try {
            inputStreamOpenInputStream = this.f71167d.openInputStream(uri);
            return C1056a.m5345a(this.f71168e, inputStreamOpenInputStream, this.f71166c);
        } catch (IOException | NullPointerException unused) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                Objects.toString(uri);
            }
            if (inputStreamOpenInputStream == null) {
                return -1;
            }
            try {
                return -1;
            } catch (IOException unused2) {
                return -1;
            }
        } finally {
            if (inputStreamOpenInputStream != null) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException unused3) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public InputStream m98303d(Uri uri) throws Throwable {
        String strM98300b = m98300b(uri);
        if (TextUtils.isEmpty(strM98300b)) {
            return null;
        }
        File fileM218650b = this.f71164a.m218650b(strM98300b);
        if (!m98301c(fileM218650b)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileM218650b);
        try {
            return this.f71167d.openInputStream(uriFromFile);
        } catch (NullPointerException e) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e));
        }
    }

    public aqi0(List<ImageHeaderParser> list, ypi0 ypi0Var, h01 h01Var, ContentResolver contentResolver) {
        this(list, f71163f, ypi0Var, h01Var, contentResolver);
    }
}
