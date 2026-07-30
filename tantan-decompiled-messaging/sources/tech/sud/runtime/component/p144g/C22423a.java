package tech.sud.runtime.component.p144g;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import tech.sud.runtime.component.p145h.C22435f;

/* JADX INFO: renamed from: tech.sud.runtime.component.g.a */
/* JADX INFO: loaded from: classes3.dex */
public class C22423a {

    /* JADX INFO: renamed from: a */
    private final AssetManager f207747a;

    /* JADX INFO: renamed from: b */
    private Canvas f207748b;

    /* JADX INFO: renamed from: c */
    private Bitmap f207749c;

    /* JADX INFO: renamed from: d */
    private int f207750d = 4;

    /* JADX INFO: renamed from: e */
    private int f207751e = 4;

    /* JADX INFO: renamed from: f */
    private int f207752f = 1024;

    /* JADX INFO: renamed from: g */
    private HashMap<String, Typeface> f207753g = new HashMap<>();

    public C22423a(AssetManager assetManager) {
        this.f207747a = assetManager;
    }

    /* JADX INFO: renamed from: a */
    public Typeface m221807a(String str) {
        if (this.f207753g.containsKey(str)) {
            return this.f207753g.get(str);
        }
        try {
            if (str.startsWith("/") && new File(str).exists()) {
                Typeface typefaceCreateFromFile = Typeface.createFromFile(str);
                C22435f.m221858c("TextBitmap", "font: ".concat(str));
                this.f207753g.put(str, typefaceCreateFromFile);
                return typefaceCreateFromFile;
            }
            if (str.contains("/") && m221805a(this.f207747a, str)) {
                Typeface typefaceCreateFromAsset = Typeface.createFromAsset(this.f207747a, str);
                this.f207753g.put(str, typefaceCreateFromAsset);
                return typefaceCreateFromAsset;
            }
            return Typeface.create(str, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public String m221811b(String str) {
        try {
            if (!str.startsWith("/")) {
                if (m221805a(this.f207747a, str)) {
                    return C22424b.m221813a(this.f207747a.open(str)).m221835a();
                }
                return null;
            }
            File file = new File(str);
            if (file.exists()) {
                return C22424b.m221813a(new FileInputStream(file)).m221835a();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public Bitmap m221812c() {
        return this.f207749c;
    }

    /* JADX INFO: renamed from: b */
    public int m221810b() {
        return this.f207752f;
    }

    /* JADX INFO: renamed from: a */
    public void m221808a() {
        this.f207753g.clear();
    }

    /* JADX INFO: renamed from: a */
    public void m221809a(int i) {
        this.f207752f = i;
    }

    /* JADX INFO: renamed from: a */
    public Canvas m221806a(int i, int i2) {
        boolean z;
        int i3 = this.f207750d;
        if (i > i3 || i2 > this.f207751e || this.f207749c == null) {
            if (i > i3) {
                this.f207750d = i;
            }
            if (i2 > this.f207751e) {
                this.f207751e = i2;
            }
            Bitmap bitmap = this.f207749c;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f207749c = Bitmap.createBitmap(this.f207750d, this.f207751e, Bitmap.Config.ARGB_8888);
            z = true;
        } else {
            z = false;
        }
        Canvas canvas = this.f207748b;
        if (canvas == null) {
            this.f207748b = new Canvas(this.f207749c);
        } else if (z) {
            canvas.setBitmap(this.f207749c);
        }
        return this.f207748b;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m221805a(AssetManager assetManager, String str) {
        try {
            int iLastIndexOf = str.lastIndexOf("/");
            String strSubstring = str.substring(0, iLastIndexOf);
            String strSubstring2 = str.substring(iLastIndexOf + 1);
            String[] list = assetManager.list(strSubstring);
            for (String str2 : list) {
                if (str2.equals(strSubstring2)) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
