package p147v.bottombar;

import android.content.Context;

/* JADX INFO: renamed from: v.bottombar.a */
/* JADX INFO: loaded from: classes3.dex */
public class C22594a {

    /* JADX INFO: renamed from: a */
    public String f209565a;

    /* JADX INFO: renamed from: b */
    public String f209566b;

    /* JADX INFO: renamed from: c */
    public int f209567c;

    /* JADX INFO: renamed from: d */
    public int f209568d;

    /* JADX INFO: renamed from: e */
    public int f209569e;

    /* JADX INFO: renamed from: f */
    public String f209570f;

    /* JADX INFO: renamed from: g */
    public String f209571g;

    /* JADX INFO: renamed from: h */
    public String f209572h;

    /* JADX INFO: renamed from: i */
    public a f209573i;

    /* JADX INFO: renamed from: v.bottombar.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f209574a;

        /* JADX INFO: renamed from: b */
        public int f209575b = 1;

        /* JADX INFO: renamed from: c */
        public int f209576c;

        /* JADX INFO: renamed from: d */
        public int f209577d;

        /* JADX INFO: renamed from: e */
        public String f209578e;

        /* JADX INFO: renamed from: f */
        public String f209579f;
    }

    public C22594a(String str) {
        this.f209565a = str;
    }

    /* JADX INFO: renamed from: a */
    public VBottomBarOldItem m223395a(Context context, boolean z) {
        VBottomBarOldItem vBottomBarOldItem = new VBottomBarOldItem(context);
        vBottomBarOldItem.setInfo(this);
        if (z) {
            vBottomBarOldItem.m223376j();
        }
        vBottomBarOldItem.mo223367b();
        return vBottomBarOldItem;
    }

    /* JADX INFO: renamed from: b */
    public void m223396b(String str) {
        this.f209572h = str;
    }

    /* JADX INFO: renamed from: c */
    public void m223397c(int i, int i2) {
        this.f209567c = i;
        this.f209569e = i2;
    }

    /* JADX INFO: renamed from: d */
    public void m223398d(String str) {
        this.f209566b = str;
    }
}
