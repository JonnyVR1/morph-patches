package p151v.bottombar;

import android.content.Context;

/* JADX INFO: renamed from: v.bottombar.a */
/* JADX INFO: loaded from: classes3.dex */
public class C22709a {

    /* JADX INFO: renamed from: a */
    public String f210487a;

    /* JADX INFO: renamed from: b */
    public String f210488b;

    /* JADX INFO: renamed from: c */
    public int f210489c;

    /* JADX INFO: renamed from: d */
    public int f210490d;

    /* JADX INFO: renamed from: e */
    public int f210491e;

    /* JADX INFO: renamed from: f */
    public String f210492f;

    /* JADX INFO: renamed from: g */
    public String f210493g;

    /* JADX INFO: renamed from: h */
    public String f210494h;

    /* JADX INFO: renamed from: i */
    public a f210495i;

    /* JADX INFO: renamed from: v.bottombar.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f210496a;

        /* JADX INFO: renamed from: b */
        public int f210497b = 1;

        /* JADX INFO: renamed from: c */
        public int f210498c;

        /* JADX INFO: renamed from: d */
        public int f210499d;

        /* JADX INFO: renamed from: e */
        public String f210500e;

        /* JADX INFO: renamed from: f */
        public String f210501f;
    }

    public C22709a(String str) {
        this.f210487a = str;
    }

    /* JADX INFO: renamed from: a */
    public VBottomBarOldItem m224641a(Context context, boolean z) {
        VBottomBarOldItem vBottomBarOldItem = new VBottomBarOldItem(context);
        vBottomBarOldItem.setInfo(this);
        if (z) {
            vBottomBarOldItem.m224622j();
        }
        vBottomBarOldItem.mo224613b();
        return vBottomBarOldItem;
    }

    /* JADX INFO: renamed from: b */
    public void m224642b(String str) {
        this.f210494h = str;
    }

    /* JADX INFO: renamed from: c */
    public void m224643c(int i, int i2) {
        this.f210489c = i;
        this.f210491e = i2;
    }

    /* JADX INFO: renamed from: d */
    public void m224644d(String str) {
        this.f210488b = str;
    }
}
