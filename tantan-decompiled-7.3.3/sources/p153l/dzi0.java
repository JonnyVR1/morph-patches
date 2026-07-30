package p153l;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.C1062a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class dzi0 {

    /* JADX INFO: renamed from: f */
    private static final wji f91362f = new wji();

    /* JADX INFO: renamed from: a */
    private final wji f91363a;

    /* JADX INFO: renamed from: b */
    private final bzi0 f91364b;

    /* JADX INFO: renamed from: c */
    private final o01 f91365c;

    /* JADX INFO: renamed from: d */
    private final ContentResolver f91366d;

    /* JADX INFO: renamed from: e */
    private final List<ImageHeaderParser> f91367e;

    public dzi0(List<ImageHeaderParser> list, wji wjiVar, bzi0 bzi0Var, o01 o01Var, ContentResolver contentResolver) {
        this.f91363a = wjiVar;
        this.f91364b = bzi0Var;
        this.f91365c = o01Var;
        this.f91366d = contentResolver;
        this.f91367e = list;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0038  */
    @Nullable
    /* JADX INFO: renamed from: b */
    private String m118742b(@NonNull Uri uri) throws Throwable {
        Cursor cursorMo107162a;
        Cursor cursor = null;
        try {
            cursorMo107162a = this.f91364b.mo107162a(uri);
            if (cursorMo107162a != null) {
                try {
                    try {
                        if (cursorMo107162a.moveToFirst()) {
                            String string = cursorMo107162a.getString(0);
                            cursorMo107162a.close();
                            return string;
                        }
                    } catch (SecurityException unused) {
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Objects.toString(uri);
                        }
                        if (cursorMo107162a != null) {
                            cursorMo107162a.close();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorMo107162a;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorMo107162a != null) {
                cursorMo107162a.close();
            }
            return null;
        } catch (SecurityException unused2) {
            cursorMo107162a = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m118743c(File file) {
        return this.f91363a.m206642a(file) && 0 < this.f91363a.m206644c(file);
    }

    /* JADX INFO: renamed from: a */
    public int m118744a(Uri uri) {
        InputStream inputStreamOpenInputStream = null;
        try {
            inputStreamOpenInputStream = this.f91366d.openInputStream(uri);
            return C1062a.m5359b(this.f91367e, inputStreamOpenInputStream, this.f91365c);
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
    public InputStream m118745d(Uri uri) throws Throwable {
        String strM118742b = m118742b(uri);
        if (TextUtils.isEmpty(strM118742b)) {
            return null;
        }
        File fileM206643b = this.f91363a.m206643b(strM118742b);
        if (!m118743c(fileM206643b)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileM206643b);
        try {
            return this.f91366d.openInputStream(uriFromFile);
        } catch (NullPointerException e) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e));
        }
    }

    public dzi0(List<ImageHeaderParser> list, bzi0 bzi0Var, o01 o01Var, ContentResolver contentResolver) {
        this(list, f91362f, bzi0Var, o01Var, contentResolver);
    }
}
