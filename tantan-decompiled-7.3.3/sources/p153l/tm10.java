package p153l;

import android.widget.FrameLayout;
import com.immomo.momomediaext.utils.MMLiveTranscoding;

/* JADX INFO: loaded from: classes4.dex */
public class tm10 {

    /* JADX INFO: renamed from: b */
    public String f174878b;

    /* JADX INFO: renamed from: c */
    public C20344a[] f174879c;

    /* JADX INFO: renamed from: a */
    public int f174877a = 4;

    /* JADX INFO: renamed from: d */
    public int f174880d = 0;

    /* JADX INFO: renamed from: l.tm10$a */
    public static class C20344a {

        /* JADX INFO: renamed from: a */
        public float f174881a;

        /* JADX INFO: renamed from: b */
        public float f174882b;

        /* JADX INFO: renamed from: c */
        public float f174883c;

        /* JADX INFO: renamed from: d */
        public float f174884d;

        public C20344a(float f, float f2, float f3, float f4) {
            this.f174881a = f3;
            this.f174882b = f4;
            this.f174883c = f2;
            this.f174884d = f;
        }
    }

    public tm10(String str) {
        this.f174878b = str;
        m191718d();
    }

    /* JADX INFO: renamed from: a */
    public static String m191715a(int i) {
        if (i == 1) {
            return "1plus5";
        }
        if (i != 2) {
            return i != 3 ? "2x2" : "1plus8";
        }
        return "3x3";
    }

    /* JADX INFO: renamed from: b */
    public FrameLayout.LayoutParams m191716b(int i, int i2, int i3) {
        if (i >= 1 && i <= this.f174877a) {
            C20344a c20344a = this.f174879c[i - 1];
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (ynp0.m216939p() * c20344a.f174881a), (int) (ynp0.m216939p() * c20344a.f174882b));
            layoutParams.topMargin = i3 + ((int) (ynp0.m216939p() * c20344a.f174884d));
            layoutParams.leftMargin = i2 + ((int) (ynp0.m216939p() * c20344a.f174883c));
            return layoutParams;
        }
        ir10.m141746a("setLayoutParams userPos illegal, userPos = " + i + " maxUserCount=" + this.f174877a);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public int m191717c() {
        return this.f174880d;
    }

    /* JADX INFO: renamed from: d */
    public final void m191718d() {
        String str = this.f174878b;
        str.getClass();
        switch (str) {
            case "2x2":
                this.f174877a = 4;
                this.f174880d = 0;
                this.f174879c = new C20344a[]{new C20344a(0.0f, 0.0f, 0.5f, 0.5f), new C20344a(0.0f, 0.5f, 0.5f, 0.5f), new C20344a(0.5f, 0.0f, 0.5f, 0.5f), new C20344a(0.5f, 0.5f, 0.5f, 0.5f)};
                break;
            case "3x3":
                this.f174877a = 9;
                this.f174880d = 2;
                this.f174879c = new C20344a[]{new C20344a(0.0f, 0.0f, 0.333f, 0.333f), new C20344a(0.0f, 0.333f, 0.333f, 0.334f), new C20344a(0.0f, 0.667f, 0.333f, 0.333f), new C20344a(0.333f, 0.0f, 0.333f, 0.333f), new C20344a(0.333f, 0.333f, 0.334f, 0.334f), new C20344a(0.333f, 0.667f, 0.334f, 0.333f), new C20344a(0.667f, 0.0f, 0.334f, 0.333f), new C20344a(0.667f, 0.333f, 0.333f, 0.334f), new C20344a(0.667f, 0.667f, 0.333f, 0.333f)};
                break;
            case "1plus5":
                this.f174877a = 6;
                this.f174880d = 1;
                this.f174879c = new C20344a[]{new C20344a(0.0f, 0.0f, 0.667f, 0.667f), new C20344a(0.0f, 0.667f, 0.333f, 0.333f), new C20344a(0.333f, 0.667f, 0.333f, 0.333f), new C20344a(0.667f, 0.0f, 0.333f, 0.333f), new C20344a(0.667f, 0.333f, 0.334f, 0.333f), new C20344a(0.667f, 0.667f, 0.333f, 0.333f)};
                break;
            case "1plus8":
                this.f174877a = 9;
                this.f174880d = 3;
                this.f174879c = new C20344a[]{new C20344a(0.0f, 0.0f, 0.5f, 1.0f), new C20344a(0.0f, 0.5f, 0.25f, 0.25f), new C20344a(0.0f, 0.75f, 0.25f, 0.25f), new C20344a(0.25f, 0.5f, 0.25f, 0.25f), new C20344a(0.25f, 0.75f, 0.25f, 0.25f), new C20344a(0.5f, 0.5f, 0.25f, 0.25f), new C20344a(0.5f, 0.75f, 0.25f, 0.25f), new C20344a(0.75f, 0.5f, 0.25f, 0.25f), new C20344a(0.75f, 0.75f, 0.25f, 0.25f)};
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m191719e(int i, MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember) {
        if (i < 1 || i > this.f174877a) {
            ir10.m141746a("setMember userPos illegal, userPos = " + i + " maxUserCount=" + this.f174877a);
            return;
        }
        C20344a c20344a = this.f174879c[i - 1];
        mMLiveLinkMember.f14656w = c20344a.f174881a;
        mMLiveLinkMember.f14655h = c20344a.f174882b;
        mMLiveLinkMember.f14657x = c20344a.f174883c;
        mMLiveLinkMember.f14658y = c20344a.f174884d;
    }
}
