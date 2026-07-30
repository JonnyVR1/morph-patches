package p149l;

import android.widget.FrameLayout;
import com.immomo.momomediaext.utils.MMLiveTranscoding;

/* JADX INFO: loaded from: classes4.dex */
public class je10 {

    /* JADX INFO: renamed from: b */
    public String f117457b;

    /* JADX INFO: renamed from: c */
    public C17758a[] f117458c;

    /* JADX INFO: renamed from: a */
    public int f117456a = 4;

    /* JADX INFO: renamed from: d */
    public int f117459d = 0;

    /* JADX INFO: renamed from: l.je10$a */
    public static class C17758a {

        /* JADX INFO: renamed from: a */
        public float f117460a;

        /* JADX INFO: renamed from: b */
        public float f117461b;

        /* JADX INFO: renamed from: c */
        public float f117462c;

        /* JADX INFO: renamed from: d */
        public float f117463d;

        public C17758a(float f, float f2, float f3, float f4) {
            this.f117460a = f3;
            this.f117461b = f4;
            this.f117462c = f2;
            this.f117463d = f;
        }
    }

    public je10(String str) {
        this.f117457b = str;
        m141095d();
    }

    /* JADX INFO: renamed from: a */
    public static String m141092a(int i) {
        if (i == 1) {
            return "1plus5";
        }
        if (i != 2) {
            return i != 3 ? "2x2" : "1plus8";
        }
        return "3x3";
    }

    /* JADX INFO: renamed from: b */
    public FrameLayout.LayoutParams m141093b(int i, int i2, int i3) {
        if (i >= 1 && i <= this.f117456a) {
            C17758a c17758a = this.f117458c[i - 1];
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (uep0.m193329p() * c17758a.f117460a), (int) (uep0.m193329p() * c17758a.f117461b));
            layoutParams.topMargin = i3 + ((int) (uep0.m193329p() * c17758a.f117463d));
            layoutParams.leftMargin = i2 + ((int) (uep0.m193329p() * c17758a.f117462c));
            return layoutParams;
        }
        yi10.m214879a("setLayoutParams userPos illegal, userPos = " + i + " maxUserCount=" + this.f117456a);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public int m141094c() {
        return this.f117459d;
    }

    /* JADX INFO: renamed from: d */
    public final void m141095d() {
        String str = this.f117457b;
        str.getClass();
        switch (str) {
            case "2x2":
                this.f117456a = 4;
                this.f117459d = 0;
                this.f117458c = new C17758a[]{new C17758a(0.0f, 0.0f, 0.5f, 0.5f), new C17758a(0.0f, 0.5f, 0.5f, 0.5f), new C17758a(0.5f, 0.0f, 0.5f, 0.5f), new C17758a(0.5f, 0.5f, 0.5f, 0.5f)};
                break;
            case "3x3":
                this.f117456a = 9;
                this.f117459d = 2;
                this.f117458c = new C17758a[]{new C17758a(0.0f, 0.0f, 0.333f, 0.333f), new C17758a(0.0f, 0.333f, 0.333f, 0.334f), new C17758a(0.0f, 0.667f, 0.333f, 0.333f), new C17758a(0.333f, 0.0f, 0.333f, 0.333f), new C17758a(0.333f, 0.333f, 0.334f, 0.334f), new C17758a(0.333f, 0.667f, 0.334f, 0.333f), new C17758a(0.667f, 0.0f, 0.334f, 0.333f), new C17758a(0.667f, 0.333f, 0.333f, 0.334f), new C17758a(0.667f, 0.667f, 0.333f, 0.333f)};
                break;
            case "1plus5":
                this.f117456a = 6;
                this.f117459d = 1;
                this.f117458c = new C17758a[]{new C17758a(0.0f, 0.0f, 0.667f, 0.667f), new C17758a(0.0f, 0.667f, 0.333f, 0.333f), new C17758a(0.333f, 0.667f, 0.333f, 0.333f), new C17758a(0.667f, 0.0f, 0.333f, 0.333f), new C17758a(0.667f, 0.333f, 0.334f, 0.333f), new C17758a(0.667f, 0.667f, 0.333f, 0.333f)};
                break;
            case "1plus8":
                this.f117456a = 9;
                this.f117459d = 3;
                this.f117458c = new C17758a[]{new C17758a(0.0f, 0.0f, 0.5f, 1.0f), new C17758a(0.0f, 0.5f, 0.25f, 0.25f), new C17758a(0.0f, 0.75f, 0.25f, 0.25f), new C17758a(0.25f, 0.5f, 0.25f, 0.25f), new C17758a(0.25f, 0.75f, 0.25f, 0.25f), new C17758a(0.5f, 0.5f, 0.25f, 0.25f), new C17758a(0.5f, 0.75f, 0.25f, 0.25f), new C17758a(0.75f, 0.5f, 0.25f, 0.25f), new C17758a(0.75f, 0.75f, 0.25f, 0.25f)};
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m141096e(int i, MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember) {
        if (i < 1 || i > this.f117456a) {
            yi10.m214879a("setMember userPos illegal, userPos = " + i + " maxUserCount=" + this.f117456a);
            return;
        }
        C17758a c17758a = this.f117458c[i - 1];
        mMLiveLinkMember.f13962w = c17758a.f117460a;
        mMLiveLinkMember.f13961h = c17758a.f117461b;
        mMLiveLinkMember.f13963x = c17758a.f117462c;
        mMLiveLinkMember.f13964y = c17758a.f117463d;
    }
}
