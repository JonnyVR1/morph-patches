package p153l;

import android.database.Cursor;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class grg0 {

    /* JADX INFO: renamed from: a */
    public final String f106036a;

    /* JADX INFO: renamed from: b */
    public final Uri f106037b;

    /* JADX INFO: renamed from: c */
    public volatile HashMap f106038c;

    /* JADX INFO: renamed from: d */
    public HashMap f106039d;

    /* JADX INFO: renamed from: e */
    public int f106040e;

    /* JADX INFO: renamed from: f */
    public int f106041f;

    /* JADX INFO: renamed from: g */
    public int f106042g;

    /* JADX INFO: renamed from: h */
    public int f106043h;

    /* JADX INFO: renamed from: i */
    public int f106044i;

    /* JADX INFO: renamed from: j */
    public boolean f106045j;

    /* JADX INFO: renamed from: k */
    public int f106046k;

    /* JADX INFO: renamed from: l */
    public final String f106047l;

    /* JADX INFO: renamed from: m */
    public boolean f106048m;

    /* JADX INFO: renamed from: n */
    public final Boolean f106049n;

    /* JADX INFO: renamed from: o */
    public Integer f106050o;

    public grg0(String str, String str2, String str3) {
        String string;
        Uri uriFromFile = Uri.fromFile(new File(str2));
        this.f106041f = 4096;
        this.f106042g = 16384;
        this.f106043h = 65536;
        this.f106044i = 2000;
        this.f106045j = true;
        this.f106046k = 3000;
        this.f106048m = true;
        this.f106036a = str;
        this.f106037b = uriFromFile;
        if (uriFromFile.getScheme().equals("content")) {
            Cursor cursorQuery = jwg0.m147162a().f122926h.getContentResolver().query(uriFromFile, null, null, null, null);
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
            this.f106047l = string;
        }
        if (ytg0.m217312d(str3)) {
            this.f106049n = Boolean.TRUE;
        } else {
            this.f106047l = str3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m131797a(String str, String str2) {
        try {
            if (this.f106038c == null) {
                this.f106038c = new HashMap();
            }
            List arrayList = (List) this.f106038c.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f106038c.put(str, arrayList);
            }
            arrayList.add(str2);
        } catch (Throwable th) {
            throw th;
        }
    }
}
