package p153l;

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
public class buv extends nvv implements azi0<n0f> {

    /* JADX INFO: renamed from: d */
    public static final Class<?> f78546d = buv.class;

    /* JADX INFO: renamed from: e */
    public static final String[] f78547e = {"_id", "_data"};

    /* JADX INFO: renamed from: f */
    public static final String[] f78548f = {"_data"};

    /* JADX INFO: renamed from: g */
    public static final Rect f78549g = new Rect(0, 0, 512, 384);

    /* JADX INFO: renamed from: h */
    public static final Rect f78550h = new Rect(0, 0, 96, 96);

    /* JADX INFO: renamed from: c */
    public final ContentResolver f78551c;

    public buv(Executor executor, fj80 fj80Var, ContentResolver contentResolver) {
        super(executor, fj80Var);
        this.f78551c = contentResolver;
    }

    /* JADX INFO: renamed from: h */
    public static int m106542h(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    /* JADX INFO: renamed from: i */
    public static int m106543i(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return uoq.m197016a(new ExifInterface(str).getAttributeInt(p7f.TAG_ORIENTATION, 1));
        } catch (IOException e) {
            huf.m137179g(f78546d, e, "Unable to retrieve thumbnail rotation for %s", str);
            return 0;
        }
    }

    /* JADX INFO: renamed from: k */
    public static int m106544k(q3d0 q3d0Var) {
        Rect rect = f78550h;
        if (czi0.m113342b(rect.width(), rect.height(), q3d0Var)) {
            return 3;
        }
        Rect rect2 = f78549g;
        return czi0.m113342b(rect2.width(), rect2.height(), q3d0Var) ? 1 : 0;
    }

    @Override // p153l.azi0
    /* JADX INFO: renamed from: a */
    public boolean mo8538a(q3d0 q3d0Var) {
        Rect rect = f78549g;
        return czi0.m113342b(rect.width(), rect.height(), q3d0Var);
    }

    @Override // p153l.nvv
    /* JADX INFO: renamed from: d */
    public n0f mo100405d(ImageRequest imageRequest) throws IOException {
        Uri uriM8639w = imageRequest.m8639w();
        if (i4k0.m138561j(uriM8639w)) {
            return m106545g(uriM8639w, imageRequest.m8635s());
        }
        return null;
    }

    @Override // p153l.nvv
    /* JADX INFO: renamed from: f */
    public String mo100406f() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    /* JADX INFO: renamed from: g */
    public final n0f m106545g(Uri uri, q3d0 q3d0Var) throws IOException {
        Cursor cursorQuery;
        n0f n0fVarM106546j;
        if (q3d0Var == null || (cursorQuery = this.f78551c.query(uri, f78547e, null, null, null)) == null) {
            return null;
        }
        try {
            if (!cursorQuery.moveToFirst() || (n0fVarM106546j = m106546j(q3d0Var, cursorQuery.getLong(cursorQuery.getColumnIndex("_id")))) == null) {
                return null;
            }
            int columnIndex = cursorQuery.getColumnIndex("_data");
            if (columnIndex >= 0) {
                n0fVarM106546j.m160981o0(m106543i(cursorQuery.getString(columnIndex)));
            }
            return n0fVarM106546j;
        } finally {
            cursorQuery.close();
        }
    }

    /* JADX INFO: renamed from: j */
    public final n0f m106546j(q3d0 q3d0Var, long j) throws IOException {
        Cursor cursorQueryMiniThumbnail;
        int columnIndex;
        int iM106544k = m106544k(q3d0Var);
        if (iM106544k == 0 || (cursorQueryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.f78551c, j, iM106544k, f78548f)) == null) {
            return null;
        }
        try {
            if (cursorQueryMiniThumbnail.moveToFirst() && (columnIndex = cursorQueryMiniThumbnail.getColumnIndex("_data")) >= 0) {
                String str = (String) wn80.m207182g(cursorQueryMiniThumbnail.getString(columnIndex));
                if (new File(str).exists()) {
                    return m164929e(new FileInputStream(str), m106542h(str));
                }
            }
            return null;
        } finally {
            cursorQueryMiniThumbnail.close();
        }
    }
}
