package tech.sud.runtime.component.p019a;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.widget.FrameLayout;
import android.widget.TextView;
import tech.sud.runtime.core.JNIShell;

/* JADX INFO: renamed from: tech.sud.runtime.component.a.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1196a {

    /* JADX INFO: renamed from: a */
    static int f11162a = 64;

    /* JADX INFO: renamed from: b */
    static float f11163b = 20.0f;

    /* JADX INFO: renamed from: c */
    private boolean f11164c;

    /* JADX INFO: renamed from: d */
    private TextView f11165d;

    /* JADX INFO: renamed from: e */
    private TextView f11166e;

    /* JADX INFO: renamed from: f */
    private C1197b f11167f;

    /* JADX INFO: renamed from: g */
    private FrameLayout f11168g;

    /* JADX INFO: renamed from: h */
    private int f11169h;

    /* JADX INFO: renamed from: i */
    private int f11170i;

    /* JADX INFO: renamed from: j */
    private String f11171j;

    public C1196a(Context context, FrameLayout frameLayout, int i, String str, boolean z) {
        int i2;
        int i3;
        this(context, frameLayout);
        this.f11164c = z;
        if (z) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i4 = displayMetrics.heightPixels;
            if (750 > i4) {
                i3 = i4 / 30;
                i2 = i3 * 10;
                f11163b = i3 * 0.8f;
            } else {
                i2 = 250;
                i3 = 25;
            }
            String str2 = "[ " + JNIShell.version(0) + "." + JNIShell.version(1) + " ]";
            if (str.length() > 0) {
                str2 = str2 + "[ " + str + " ]";
            }
            int i5 = i3 * 2;
            this.f11165d.setLayoutParams(new FrameLayout.LayoutParams(i2, i5));
            this.f11165d.setBackgroundColor(-65536);
            this.f11165d.getBackground().setAlpha(f11162a);
            this.f11165d.setText("FPS: 0\nDraw: 0");
            this.f11165d.setTextSize(0, f11163b);
            this.f11165d.setGravity(16);
            this.f11165d.setPadding(5, 0, 0, 0);
            this.f11166e.setLayoutParams(new FrameLayout.LayoutParams(i2, i3));
            this.f11166e.setY(i5);
            this.f11166e.setBackgroundColor(-65536);
            this.f11166e.getBackground().setAlpha(f11162a);
            this.f11166e.setText(str2);
            this.f11166e.setTextSize(0, f11163b);
            this.f11166e.setGravity(16);
            this.f11166e.setPadding(5, 0, 0, 0);
            this.f11165d.setTextColor(-1);
            this.f11166e.setTextColor(-1);
            this.f11167f = new C1197b(context, i);
            this.f11167f.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            this.f11167f.setY(i3 * 3);
            this.f11167f.setPadding(5, 0, 0, 0);
            this.f11168g = frameLayout;
            frameLayout.bringChildToFront(this.f11165d);
            this.f11168g.bringChildToFront(this.f11166e);
            this.f11168g.addView(this.f11167f);
            this.f11168g.bringChildToFront(this.f11167f);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m10065b() {
        FrameLayout frameLayout = this.f11168g;
        if (frameLayout != null) {
            frameLayout.removeView(this.f11165d);
            this.f11168g.removeView(this.f11166e);
            this.f11168g.removeView(this.f11167f);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m10067a(int i, int i2, String str) {
        int i3;
        if (this.f11164c) {
            if (this.f11171j.compareTo(str) != 0 || this.f11169h != i || this.f11170i != i2) {
                this.f11169h = i;
                this.f11170i = i2;
                this.f11171j = str;
                String str2 = "FPS: ";
                if (i >= 0) {
                    str2 = "FPS: " + this.f11169h + " / ";
                }
                String str3 = str2 + this.f11170i + "\nDraw: " + str;
                int i4 = this.f11169h;
                if (i4 >= 58) {
                    i3 = -1;
                } else {
                    i3 = i4 > this.f11170i ? -256 : -30720;
                }
                this.f11165d.setText(str3);
                this.f11165d.setTextColor(i3);
            }
            this.f11165d.bringToFront();
            this.f11167f.m10076a();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m10066a() {
        m10065b();
    }

    /* JADX INFO: renamed from: a */
    private void m10064a(int i) {
        this.f11165d.setBackgroundColor(i);
        this.f11166e.setBackgroundColor(i);
        this.f11165d.getBackground().setAlpha(f11162a);
        this.f11166e.getBackground().setAlpha(f11162a);
        this.f11165d.setTextColor(-1);
        this.f11166e.setTextColor(-1);
    }

    /* JADX INFO: renamed from: a */
    public void m10069a(boolean z) {
        if (this.f11164c) {
            if (z) {
                m10064a(-16711936);
            } else {
                m10064a(-65536);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m10068a(int i, String str) {
        if (this.f11164c) {
            this.f11167f.m10077a(i, str);
        }
    }

    private C1196a(Context context, FrameLayout frameLayout) {
        this.f11164c = false;
        this.f11168g = null;
        this.f11169h = 0;
        this.f11170i = 0;
        this.f11171j = "";
        this.f11165d = new TextView(context);
        this.f11166e = new TextView(context);
        frameLayout.addView(this.f11165d);
        frameLayout.addView(this.f11166e);
    }
}
