package p149l;

import android.database.Cursor;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yig0 {

    /* JADX INFO: renamed from: a */
    public final String f198483a;

    /* JADX INFO: renamed from: b */
    public final Uri f198484b;

    /* JADX INFO: renamed from: c */
    public volatile HashMap f198485c;

    /* JADX INFO: renamed from: d */
    public HashMap f198486d;

    /* JADX INFO: renamed from: e */
    public int f198487e;

    /* JADX INFO: renamed from: f */
    public int f198488f;

    /* JADX INFO: renamed from: g */
    public int f198489g;

    /* JADX INFO: renamed from: h */
    public int f198490h;

    /* JADX INFO: renamed from: i */
    public int f198491i;

    /* JADX INFO: renamed from: j */
    public boolean f198492j;

    /* JADX INFO: renamed from: k */
    public int f198493k;

    /* JADX INFO: renamed from: l */
    public final String f198494l;

    /* JADX INFO: renamed from: m */
    public boolean f198495m;

    /* JADX INFO: renamed from: n */
    public final Boolean f198496n;

    /* JADX INFO: renamed from: o */
    public Integer f198497o;

    public yig0(String str, String str2, String str3) {
        String string;
        Uri uriFromFile = Uri.fromFile(new File(str2));
        this.f198488f = 4096;
        this.f198489g = 16384;
        this.f198490h = 65536;
        this.f198491i = 2000;
        this.f198492j = true;
        this.f198493k = 3000;
        this.f198495m = true;
        this.f198483a = str;
        this.f198484b = uriFromFile;
        if (uriFromFile.getScheme().equals("content")) {
            Cursor cursorQuery = bog0.m102944a().f76522h.getContentResolver().query(uriFromFile, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    cursorQuery.moveToFirst();
                    string = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                    cursorQuery.close();
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            } else {
                string = null;
            }
            this.f198494l = string;
        }
        if (qlg0.m175481d(str3)) {
            this.f198496n = Boolean.TRUE;
        } else {
            this.f198494l = str3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m214904a(String str, String str2) {
        try {
            if (this.f198485c == null) {
                this.f198485c = new HashMap();
            }
            List arrayList = (List) this.f198485c.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f198485c.put(str, arrayList);
            }
            arrayList.add(str2);
        } catch (Throwable th) {
            throw th;
        }
    }
}
