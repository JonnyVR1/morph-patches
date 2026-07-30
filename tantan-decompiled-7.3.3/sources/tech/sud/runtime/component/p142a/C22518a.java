package tech.sud.runtime.component.p142a;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.widget.FrameLayout;
import android.widget.TextView;
import tech.sud.runtime.core.JNIShell;

/* JADX INFO: renamed from: tech.sud.runtime.component.a.a */
/* JADX INFO: loaded from: classes3.dex */
public class C22518a {

    /* JADX INFO: renamed from: a */
    static int f208459a = 64;

    /* JADX INFO: renamed from: b */
    static float f208460b = 20.0f;

    /* JADX INFO: renamed from: c */
    private boolean f208461c;

    /* JADX INFO: renamed from: d */
    private TextView f208462d;

    /* JADX INFO: renamed from: e */
    private TextView f208463e;

    /* JADX INFO: renamed from: f */
    private C22519b f208464f;

    /* JADX INFO: renamed from: g */
    private FrameLayout f208465g;

    /* JADX INFO: renamed from: h */
    private int f208466h;

    /* JADX INFO: renamed from: i */
    private int f208467i;

    /* JADX INFO: renamed from: j */
    private String f208468j;

    public C22518a(Context context, FrameLayout frameLayout, int i, String str, boolean z) {
        int i2;
        int i3;
        this(context, frameLayout);
        this.f208461c = z;
        if (z) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i4 = displayMetrics.heightPixels;
            if (750 > i4) {
                i3 = i4 / 30;
                i2 = i3 * 10;
                f208460b = i3 * 0.8f;
            } else {
                i2 = 250;
                i3 = 25;
            }
            String str2 = "[ " + JNIShell.version(0) + "." + JNIShell.version(1) + " ]";
            if (str.length() > 0) {
                str2 = str2 + "[ " + str + " ]";
            }
            int i5 = i3 * 2;
            this.f208462d.setLayoutParams(new FrameLayout.LayoutParams(i2, i5));
            this.f208462d.setBackgroundColor(-65536);
            this.f208462d.getBackground().setAlpha(f208459a);
            this.f208462d.setText("FPS: 0\nDraw: 0");
            this.f208462d.setTextSize(0, f208460b);
            this.f208462d.setGravity(16);
            this.f208462d.setPadding(5, 0, 0, 0);
            this.f208463e.setLayoutParams(new FrameLayout.LayoutParams(i2, i3));
            this.f208463e.setY(i5);
            this.f208463e.setBackgroundColor(-65536);
            this.f208463e.getBackground().setAlpha(f208459a);
            this.f208463e.setText(str2);
            this.f208463e.setTextSize(0, f208460b);
            this.f208463e.setGravity(16);
            this.f208463e.setPadding(5, 0, 0, 0);
            this.f208462d.setTextColor(-1);
            this.f208463e.setTextColor(-1);
            this.f208464f = new C22519b(context, i);
            this.f208464f.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            this.f208464f.setY(i3 * 3);
            this.f208464f.setPadding(5, 0, 0, 0);
            this.f208465g = frameLayout;
            frameLayout.bringChildToFront(this.f208462d);
            this.f208465g.bringChildToFront(this.f208463e);
            this.f208465g.addView(this.f208464f);
            this.f208465g.bringChildToFront(this.f208464f);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m222840b() {
        FrameLayout frameLayout = this.f208465g;
        if (frameLayout != null) {
            frameLayout.removeView(this.f208462d);
            this.f208465g.removeView(this.f208463e);
            this.f208465g.removeView(this.f208464f);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m222842a(int i, int i2, String str) {
        int i3;
        if (this.f208461c) {
            if (this.f208468j.compareTo(str) != 0 || this.f208466h != i || this.f208467i != i2) {
                this.f208466h = i;
                this.f208467i = i2;
                this.f208468j = str;
                String str2 = "FPS: ";
                if (i >= 0) {
                    str2 = "FPS: " + this.f208466h + " / ";
                }
                String str3 = str2 + this.f208467i + "\nDraw: " + str;
                int i4 = this.f208466h;
                if (i4 >= 58) {
                    i3 = -1;
                } else {
                    i3 = i4 > this.f208467i ? -256 : -30720;
                }
                this.f208462d.setText(str3);
                this.f208462d.setTextColor(i3);
            }
            this.f208462d.bringToFront();
            this.f208464f.m222851a();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m222841a() {
        m222840b();
    }

    /* JADX INFO: renamed from: a */
    private void m222839a(int i) {
        this.f208462d.setBackgroundColor(i);
        this.f208463e.setBackgroundColor(i);
        this.f208462d.getBackground().setAlpha(f208459a);
        this.f208463e.getBackground().setAlpha(f208459a);
        this.f208462d.setTextColor(-1);
        this.f208463e.setTextColor(-1);
    }

    /* JADX INFO: renamed from: a */
    public void m222844a(boolean z) {
        if (this.f208461c) {
            if (z) {
                m222839a(-16711936);
            } else {
                m222839a(-65536);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m222843a(int i, String str) {
        if (this.f208461c) {
            this.f208464f.m222852a(i, str);
        }
    }

    private C22518a(Context context, FrameLayout frameLayout) {
        this.f208461c = false;
        this.f208465g = null;
        this.f208466h = 0;
        this.f208467i = 0;
        this.f208468j = "";
        this.f208462d = new TextView(context);
        this.f208463e = new TextView(context);
        frameLayout.addView(this.f208462d);
        frameLayout.addView(this.f208463e);
    }
}
