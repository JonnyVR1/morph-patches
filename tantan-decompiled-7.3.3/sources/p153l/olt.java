package p153l;

/* JADX INFO: loaded from: classes9.dex */
public class olt {

    /* JADX INFO: renamed from: a */
    public String f147872a;

    /* JADX INFO: renamed from: b */
    public int f147873b;

    public olt(String str, int i) {
        this.f147872a = str;
        this.f147873b = i;
    }

    /* JADX INFO: renamed from: a */
    public static String m168169a(String str) {
        return str.substring(str.indexOf(":") + 1);
    }

    /* JADX INFO: renamed from: b */
    public static int m168170b(String str) {
        return Integer.parseInt(str.split(":")[0]);
    }

    /* JADX INFO: renamed from: c */
    public String m168171c() {
        return this.f147873b + ":" + this.f147872a;
    }

    /* JADX INFO: renamed from: d */
    public void m168172d(String str) {
        this.f147872a = str;
    }

    /* JADX INFO: renamed from: e */
    public void m168173e(int i) {
        this.f147873b = i;
    }
}
