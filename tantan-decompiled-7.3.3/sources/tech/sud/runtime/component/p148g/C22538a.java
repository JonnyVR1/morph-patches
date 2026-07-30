package tech.sud.runtime.component.p148g;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import tech.sud.runtime.component.p149h.C22550f;

/* JADX INFO: renamed from: tech.sud.runtime.component.g.a */
/* JADX INFO: loaded from: classes3.dex */
public class C22538a {

    /* JADX INFO: renamed from: a */
    private final AssetManager f208669a;

    /* JADX INFO: renamed from: b */
    private Canvas f208670b;

    /* JADX INFO: renamed from: c */
    private Bitmap f208671c;

    /* JADX INFO: renamed from: d */
    private int f208672d = 4;

    /* JADX INFO: renamed from: e */
    private int f208673e = 4;

    /* JADX INFO: renamed from: f */
    private int f208674f = 1024;

    /* JADX INFO: renamed from: g */
    private HashMap<String, Typeface> f208675g = new HashMap<>();

    public C22538a(AssetManager assetManager) {
        this.f208669a = assetManager;
    }

    /* JADX INFO: renamed from: a */
    public Typeface m223053a(String str) {
        if (this.f208675g.containsKey(str)) {
            return this.f208675g.get(str);
        }
        try {
            if (str.startsWith("/") && new File(str).exists()) {
                Typeface typefaceCreateFromFile = Typeface.createFromFile(str);
                C22550f.m223104c("TextBitmap", "font: ".concat(str));
                this.f208675g.put(str, typefaceCreateFromFile);
                return typefaceCreateFromFile;
            }
            if (str.contains("/") && m223051a(this.f208669a, str)) {
                Typeface typefaceCreateFromAsset = Typeface.createFromAsset(this.f208669a, str);
                this.f208675g.put(str, typefaceCreateFromAsset);
                return typefaceCreateFromAsset;
            }
            return Typeface.create(str, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public String m223057b(String str) {
        try {
            if (!str.startsWith("/")) {
                if (m223051a(this.f208669a, str)) {
                    return C22539b.m223059a(this.f208669a.open(str)).m223081a();
                }
                return null;
            }
            File file = new File(str);
            if (file.exists()) {
                return C22539b.m223059a(new FileInputStream(file)).m223081a();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public Bitmap m223058c() {
        return this.f208671c;
    }

    /* JADX INFO: renamed from: b */
    public int m223056b() {
        return this.f208674f;
    }

    /* JADX INFO: renamed from: a */
    public void m223054a() {
        this.f208675g.clear();
    }

    /* JADX INFO: renamed from: a */
    public void m223055a(int i) {
        this.f208674f = i;
    }

    /* JADX INFO: renamed from: a */
    public Canvas m223052a(int i, int i2) {
        boolean z;
        int i3 = this.f208672d;
        if (i > i3 || i2 > this.f208673e || this.f208671c == null) {
            if (i > i3) {
                this.f208672d = i;
            }
            if (i2 > this.f208673e) {
                this.f208673e = i2;
            }
            Bitmap bitmap = this.f208671c;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f208671c = Bitmap.createBitmap(this.f208672d, this.f208673e, Bitmap.Config.ARGB_8888);
            z = true;
        } else {
            z = false;
        }
        Canvas canvas = this.f208670b;
        if (canvas == null) {
            this.f208670b = new Canvas(this.f208671c);
        } else if (z) {
            canvas.setBitmap(this.f208671c);
        }
        return this.f208670b;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m223051a(AssetManager assetManager, String str) {
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
