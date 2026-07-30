package p149l;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class asv extends mtv implements xpi0<jze> {

    /* JADX INFO: renamed from: d */
    public static final Class<?> f71484d = asv.class;

    /* JADX INFO: renamed from: e */
    public static final String[] f71485e = {"_id", "_data"};

    /* JADX INFO: renamed from: f */
    public static final String[] f71486f = {"_data"};

    /* JADX INFO: renamed from: g */
    public static final Rect f71487g = new Rect(0, 0, 512, 384);

    /* JADX INFO: renamed from: h */
    public static final Rect f71488h = new Rect(0, 0, 96, 96);

    /* JADX INFO: renamed from: c */
    public final ContentResolver f71489c;

    public asv(Executor executor, za80 za80Var, ContentResolver contentResolver) {
        super(executor, za80Var);
        this.f71489c = contentResolver;
    }

    /* JADX INFO: renamed from: h */
    public static int m98616h(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    /* JADX INFO: renamed from: i */
    public static int m98617i(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return vmq.m198968a(new ExifInterface(str).getAttributeInt(j6f.TAG_ORIENTATION, 1));
        } catch (IOException e) {
            tsf.m190541g(f71484d, e, "Unable to retrieve thumbnail rotation for %s", str);
            return 0;
        }
    }

    /* JADX INFO: renamed from: k */
    public static int m98618k(nvc0 nvc0Var) {
        Rect rect = f71488h;
        if (zpi0.m219674b(rect.width(), rect.height(), nvc0Var)) {
            return 3;
        }
        Rect rect2 = f71487g;
        return zpi0.m219674b(rect2.width(), rect2.height(), nvc0Var) ? 1 : 0;
    }

    @Override // p149l.xpi0
    /* JADX INFO: renamed from: a */
    public boolean mo8484a(nvc0 nvc0Var) {
        Rect rect = f71487g;
        return zpi0.m219674b(rect.width(), rect.height(), nvc0Var);
    }

    @Override // p149l.mtv
    /* JADX INFO: renamed from: d */
    public jze mo98619d(ImageRequest imageRequest) throws IOException {
        Uri uriM8585w = imageRequest.m8585w();
        if (fvj0.m123315j(uriM8585w)) {
            return m98621g(uriM8585w, imageRequest.m8581s());
        }
        return null;
    }

    @Override // p149l.mtv
    /* JADX INFO: renamed from: f */
    public String mo98620f() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    /* JADX INFO: renamed from: g */
    public final jze m98621g(Uri uri, nvc0 nvc0Var) throws IOException {
        Cursor cursorQuery;
        jze jzeVarM98622j;
        if (nvc0Var == null || (cursorQuery = this.f71489c.query(uri, f71485e, null, null, null)) == null) {
            return null;
        }
        try {
            if (!cursorQuery.moveToFirst() || (jzeVarM98622j = m98622j(nvc0Var, cursorQuery.getLong(cursorQuery.getColumnIndex("_id")))) == null) {
                return null;
            }
            int columnIndex = cursorQuery.getColumnIndex("_data");
            if (columnIndex >= 0) {
                jzeVarM98622j.m143918n0(m98617i(cursorQuery.getString(columnIndex)));
            }
            return jzeVarM98622j;
        } finally {
            cursorQuery.close();
        }
    }

    /* JADX INFO: renamed from: j */
    public final jze m98622j(nvc0 nvc0Var, long j) throws IOException {
        Cursor cursorQueryMiniThumbnail;
        int columnIndex;
        int iM98618k = m98618k(nvc0Var);
        if (iM98618k == 0 || (cursorQueryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.f71489c, j, iM98618k, f71486f)) == null) {
            return null;
        }
        try {
            if (cursorQueryMiniThumbnail.moveToFirst() && (columnIndex = cursorQueryMiniThumbnail.getColumnIndex("_data")) >= 0) {
                String str = (String) rf80.m179116g(cursorQueryMiniThumbnail.getString(columnIndex));
                if (new File(str).exists()) {
                    return m156359e(new FileInputStream(str), m98616h(str));
                }
            }
            return null;
        } finally {
            cursorQueryMiniThumbnail.close();
        }
    }
}
