package tech.sud.runtime.component.p138a;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.widget.FrameLayout;
import android.widget.TextView;
import tech.sud.runtime.core.JNIShell;

/* JADX INFO: renamed from: tech.sud.runtime.component.a.a */
/* JADX INFO: loaded from: classes3.dex */
public class C22403a {

    /* JADX INFO: renamed from: a */
    static int f207537a = 64;

    /* JADX INFO: renamed from: b */
    static float f207538b = 20.0f;

    /* JADX INFO: renamed from: c */
    private boolean f207539c;

    /* JADX INFO: renamed from: d */
    private TextView f207540d;

    /* JADX INFO: renamed from: e */
    private TextView f207541e;

    /* JADX INFO: renamed from: f */
    private C22404b f207542f;

    /* JADX INFO: renamed from: g */
    private FrameLayout f207543g;

    /* JADX INFO: renamed from: h */
    private int f207544h;

    /* JADX INFO: renamed from: i */
    private int f207545i;

    /* JADX INFO: renamed from: j */
    private String f207546j;

    public C22403a(Context context, FrameLayout frameLayout, int i, String str, boolean z) {
        int i2;
        int i3;
        this(context, frameLayout);
        this.f207539c = z;
        if (z) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i4 = displayMetrics.heightPixels;
            if (750 > i4) {
                i3 = i4 / 30;
                i2 = i3 * 10;
                f207538b = i3 * 0.8f;
            } else {
                i2 = 250;
                i3 = 25;
            }
            String str2 = "[ " + JNIShell.version(0) + "." + JNIShell.version(1) + " ]";
            if (str.length() > 0) {
                str2 = str2 + "[ " + str + " ]";
            }
            int i5 = i3 * 2;
            this.f207540d.setLayoutParams(new FrameLayout.LayoutParams(i2, i5));
            this.f207540d.setBackgroundColor(-65536);
            this.f207540d.getBackground().setAlpha(f207537a);
            this.f207540d.setText("FPS: 0\nDraw: 0");
            this.f207540d.setTextSize(0, f207538b);
            this.f207540d.setGravity(16);
            this.f207540d.setPadding(5, 0, 0, 0);
            this.f207541e.setLayoutParams(new FrameLayout.LayoutParams(i2, i3));
            this.f207541e.setY(i5);
            this.f207541e.setBackgroundColor(-65536);
            this.f207541e.getBackground().setAlpha(f207537a);
            this.f207541e.setText(str2);
            this.f207541e.setTextSize(0, f207538b);
            this.f207541e.setGravity(16);
            this.f207541e.setPadding(5, 0, 0, 0);
            this.f207540d.setTextColor(-1);
            this.f207541e.setTextColor(-1);
            this.f207542f = new C22404b(context, i);
            this.f207542f.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            this.f207542f.setY(i3 * 3);
            this.f207542f.setPadding(5, 0, 0, 0);
            this.f207543g = frameLayout;
            frameLayout.bringChildToFront(this.f207540d);
            this.f207543g.bringChildToFront(this.f207541e);
            this.f207543g.addView(this.f207542f);
            this.f207543g.bringChildToFront(this.f207542f);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m221594b() {
        FrameLayout frameLayout = this.f207543g;
        if (frameLayout != null) {
            frameLayout.removeView(this.f207540d);
            this.f207543g.removeView(this.f207541e);
            this.f207543g.removeView(this.f207542f);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m221596a(int i, int i2, String str) {
        int i3;
        if (this.f207539c) {
            if (this.f207546j.compareTo(str) != 0 || this.f207544h != i || this.f207545i != i2) {
                this.f207544h = i;
                this.f207545i = i2;
                this.f207546j = str;
                String str2 = "FPS: ";
                if (i >= 0) {
                    str2 = "FPS: " + this.f207544h + " / ";
                }
                String str3 = str2 + this.f207545i + "\nDraw: " + str;
                int i4 = this.f207544h;
                if (i4 >= 58) {
                    i3 = -1;
                } else {
                    i3 = i4 > this.f207545i ? -256 : -30720;
                }
                this.f207540d.setText(str3);
                this.f207540d.setTextColor(i3);
            }
            this.f207540d.bringToFront();
            this.f207542f.m221605a();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m221595a() {
        m221594b();
    }

    /* JADX INFO: renamed from: a */
    private void m221593a(int i) {
        this.f207540d.setBackgroundColor(i);
        this.f207541e.setBackgroundColor(i);
        this.f207540d.getBackground().setAlpha(f207537a);
        this.f207541e.getBackground().setAlpha(f207537a);
        this.f207540d.setTextColor(-1);
        this.f207541e.setTextColor(-1);
    }

    /* JADX INFO: renamed from: a */
    public void m221598a(boolean z) {
        if (this.f207539c) {
            if (z) {
                m221593a(-16711936);
            } else {
                m221593a(-65536);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m221597a(int i, String str) {
        if (this.f207539c) {
            this.f207542f.m221606a(i, str);
        }
    }

    private C22403a(Context context, FrameLayout frameLayout) {
        this.f207539c = false;
        this.f207543g = null;
        this.f207544h = 0;
        this.f207545i = 0;
        this.f207546j = "";
        this.f207540d = new TextView(context);
        this.f207541e = new TextView(context);
        frameLayout.addView(this.f207540d);
        frameLayout.addView(this.f207541e);
    }
}
