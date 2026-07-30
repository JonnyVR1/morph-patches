package p002l;

import android.widget.FrameLayout;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import l.uep0;
import l.yi10;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class je10 {

    /* JADX INFO: renamed from: b */
    public String f13706b;

    /* JADX INFO: renamed from: c */
    public C0632a[] f13707c;

    /* JADX INFO: renamed from: a */
    public int f13705a = 4;

    /* JADX INFO: renamed from: d */
    public int f13708d = 0;

    /* JADX INFO: renamed from: l.je10$a */
    public static class C0632a {

        /* JADX INFO: renamed from: a */
        public float f13709a;

        /* JADX INFO: renamed from: b */
        public float f13710b;

        /* JADX INFO: renamed from: c */
        public float f13711c;

        /* JADX INFO: renamed from: d */
        public float f13712d;

        public C0632a(float f, float f2, float f3, float f4) {
            this.f13709a = f3;
            this.f13710b = f4;
            this.f13711c = f2;
            this.f13712d = f;
        }
    }

    public je10(String str) {
        this.f13706b = str;
        m15875d();
    }

    /* JADX INFO: renamed from: a */
    public static String m15872a(int i) {
        if (i == 1) {
            return "1plus5";
        }
        if (i != 2) {
            return i != 3 ? "2x2" : "1plus8";
        }
        return "3x3";
    }

    /* JADX INFO: renamed from: b */
    public FrameLayout.LayoutParams m15873b(int i, int i2, int i3) {
        if (i >= 1 && i <= this.f13705a) {
            C0632a c0632a = this.f13707c[i - 1];
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (uep0.p() * c0632a.f13709a), (int) (uep0.p() * c0632a.f13710b));
            layoutParams.topMargin = i3 + ((int) (uep0.p() * c0632a.f13712d));
            layoutParams.leftMargin = i2 + ((int) (uep0.p() * c0632a.f13711c));
            return layoutParams;
        }
        yi10.a("setLayoutParams userPos illegal, userPos = " + i + " maxUserCount=" + this.f13705a);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public int m15874c() {
        return this.f13708d;
    }

    /* JADX INFO: renamed from: d */
    public final void m15875d() {
        String str = this.f13706b;
        str.getClass();
        switch (str) {
            case "2x2":
                this.f13705a = 4;
                this.f13708d = 0;
                this.f13707c = new C0632a[]{new C0632a(0.0f, 0.0f, 0.5f, 0.5f), new C0632a(0.0f, 0.5f, 0.5f, 0.5f), new C0632a(0.5f, 0.0f, 0.5f, 0.5f), new C0632a(0.5f, 0.5f, 0.5f, 0.5f)};
                break;
            case "3x3":
                this.f13705a = 9;
                this.f13708d = 2;
                this.f13707c = new C0632a[]{new C0632a(0.0f, 0.0f, 0.333f, 0.333f), new C0632a(0.0f, 0.333f, 0.333f, 0.334f), new C0632a(0.0f, 0.667f, 0.333f, 0.333f), new C0632a(0.333f, 0.0f, 0.333f, 0.333f), new C0632a(0.333f, 0.333f, 0.334f, 0.334f), new C0632a(0.333f, 0.667f, 0.334f, 0.333f), new C0632a(0.667f, 0.0f, 0.334f, 0.333f), new C0632a(0.667f, 0.333f, 0.333f, 0.334f), new C0632a(0.667f, 0.667f, 0.333f, 0.333f)};
                break;
            case "1plus5":
                this.f13705a = 6;
                this.f13708d = 1;
                this.f13707c = new C0632a[]{new C0632a(0.0f, 0.0f, 0.667f, 0.667f), new C0632a(0.0f, 0.667f, 0.333f, 0.333f), new C0632a(0.333f, 0.667f, 0.333f, 0.333f), new C0632a(0.667f, 0.0f, 0.333f, 0.333f), new C0632a(0.667f, 0.333f, 0.334f, 0.333f), new C0632a(0.667f, 0.667f, 0.333f, 0.333f)};
                break;
            case "1plus8":
                this.f13705a = 9;
                this.f13708d = 3;
                this.f13707c = new C0632a[]{new C0632a(0.0f, 0.0f, 0.5f, 1.0f), new C0632a(0.0f, 0.5f, 0.25f, 0.25f), new C0632a(0.0f, 0.75f, 0.25f, 0.25f), new C0632a(0.25f, 0.5f, 0.25f, 0.25f), new C0632a(0.25f, 0.75f, 0.25f, 0.25f), new C0632a(0.5f, 0.5f, 0.25f, 0.25f), new C0632a(0.5f, 0.75f, 0.25f, 0.25f), new C0632a(0.75f, 0.5f, 0.25f, 0.25f), new C0632a(0.75f, 0.75f, 0.25f, 0.25f)};
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m15876e(int i, MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember) {
        if (i < 1 || i > this.f13705a) {
            yi10.a("setMember userPos illegal, userPos = " + i + " maxUserCount=" + this.f13705a);
            return;
        }
        C0632a c0632a = this.f13707c[i - 1];
        mMLiveLinkMember.w = c0632a.f13709a;
        mMLiveLinkMember.h = c0632a.f13710b;
        mMLiveLinkMember.x = c0632a.f13711c;
        mMLiveLinkMember.y = c0632a.f13712d;
    }
}
