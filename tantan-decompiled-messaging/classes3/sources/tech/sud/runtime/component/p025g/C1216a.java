package tech.sud.runtime.component.p025g;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import tech.sud.runtime.component.p026h.C1228f;

/* JADX INFO: renamed from: tech.sud.runtime.component.g.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1216a {

    /* JADX INFO: renamed from: a */
    private final AssetManager f11372a;

    /* JADX INFO: renamed from: b */
    private Canvas f11373b;

    /* JADX INFO: renamed from: c */
    private Bitmap f11374c;

    /* JADX INFO: renamed from: d */
    private int f11375d = 4;

    /* JADX INFO: renamed from: e */
    private int f11376e = 4;

    /* JADX INFO: renamed from: f */
    private int f11377f = 1024;

    /* JADX INFO: renamed from: g */
    private HashMap<String, Typeface> f11378g = new HashMap<>();

    public C1216a(AssetManager assetManager) {
        this.f11372a = assetManager;
    }

    /* JADX INFO: renamed from: a */
    public Typeface m10278a(String str) {
        if (this.f11378g.containsKey(str)) {
            return this.f11378g.get(str);
        }
        try {
            if (str.startsWith("/") && new File(str).exists()) {
                Typeface typefaceCreateFromFile = Typeface.createFromFile(str);
                C1228f.m10329c("TextBitmap", "font: ".concat(str));
                this.f11378g.put(str, typefaceCreateFromFile);
                return typefaceCreateFromFile;
            }
            if (str.contains("/") && m10276a(this.f11372a, str)) {
                Typeface typefaceCreateFromAsset = Typeface.createFromAsset(this.f11372a, str);
                this.f11378g.put(str, typefaceCreateFromAsset);
                return typefaceCreateFromAsset;
            }
            return Typeface.create(str, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public String m10282b(String str) {
        try {
            if (!str.startsWith("/")) {
                if (m10276a(this.f11372a, str)) {
                    return C1217b.m10284a(this.f11372a.open(str)).m10306a();
                }
                return null;
            }
            File file = new File(str);
            if (file.exists()) {
                return C1217b.m10284a(new FileInputStream(file)).m10306a();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public Bitmap m10283c() {
        return this.f11374c;
    }

    /* JADX INFO: renamed from: b */
    public int m10281b() {
        return this.f11377f;
    }

    /* JADX INFO: renamed from: a */
    public void m10279a() {
        this.f11378g.clear();
    }

    /* JADX INFO: renamed from: a */
    public void m10280a(int i) {
        this.f11377f = i;
    }

    /* JADX INFO: renamed from: a */
    public Canvas m10277a(int i, int i2) {
        boolean z;
        int i3 = this.f11375d;
        if (i > i3 || i2 > this.f11376e || this.f11374c == null) {
            if (i > i3) {
                this.f11375d = i;
            }
            if (i2 > this.f11376e) {
                this.f11376e = i2;
            }
            Bitmap bitmap = this.f11374c;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f11374c = Bitmap.createBitmap(this.f11375d, this.f11376e, Bitmap.Config.ARGB_8888);
            z = true;
        } else {
            z = false;
        }
        Canvas canvas = this.f11373b;
        if (canvas == null) {
            this.f11373b = new Canvas(this.f11374c);
        } else if (z) {
            canvas.setBitmap(this.f11374c);
        }
        return this.f11373b;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m10276a(AssetManager assetManager, String str) {
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
