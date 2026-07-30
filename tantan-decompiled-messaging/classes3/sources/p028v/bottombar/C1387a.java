package p028v.bottombar;

import android.content.Context;

/* JADX INFO: renamed from: v.bottombar.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1387a {

    /* JADX INFO: renamed from: a */
    public String f13190a;

    /* JADX INFO: renamed from: b */
    public String f13191b;

    /* JADX INFO: renamed from: c */
    public int f13192c;

    /* JADX INFO: renamed from: d */
    public int f13193d;

    /* JADX INFO: renamed from: e */
    public int f13194e;

    /* JADX INFO: renamed from: f */
    public String f13195f;

    /* JADX INFO: renamed from: g */
    public String f13196g;

    /* JADX INFO: renamed from: h */
    public String f13197h;

    /* JADX INFO: renamed from: i */
    public a f13198i;

    /* JADX INFO: renamed from: v.bottombar.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f13199a;

        /* JADX INFO: renamed from: b */
        public int f13200b = 1;

        /* JADX INFO: renamed from: c */
        public int f13201c;

        /* JADX INFO: renamed from: d */
        public int f13202d;

        /* JADX INFO: renamed from: e */
        public String f13203e;

        /* JADX INFO: renamed from: f */
        public String f13204f;
    }

    public C1387a(String str) {
        this.f13190a = str;
    }

    /* JADX INFO: renamed from: a */
    public VBottomBarOldItem m11896a(Context context, boolean z) {
        VBottomBarOldItem vBottomBarOldItem = new VBottomBarOldItem(context);
        vBottomBarOldItem.setInfo(this);
        if (z) {
            vBottomBarOldItem.m11877j();
        }
        vBottomBarOldItem.mo11866b();
        return vBottomBarOldItem;
    }

    /* JADX INFO: renamed from: b */
    public void m11897b(String str) {
        this.f13197h = str;
    }

    /* JADX INFO: renamed from: c */
    public void m11898c(int i, int i2) {
        this.f13192c = i;
        this.f13194e = i2;
    }

    /* JADX INFO: renamed from: d */
    public void m11899d(String str) {
        this.f13191b = str;
    }
}
