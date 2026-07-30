package p153l;

import com.p046mm.mediasdk.RecorderConstants$RenderModelType;

/* JADX INFO: loaded from: classes6.dex */
public class vow {

    /* JADX INFO: renamed from: a */
    private final qow f185172a;

    /* JADX INFO: renamed from: b */
    private final int f185173b;

    /* JADX INFO: renamed from: c */
    private final int f185174c;

    /* JADX INFO: renamed from: d */
    private final int f185175d;

    /* JADX INFO: renamed from: e */
    private boolean f185176e;

    /* JADX INFO: renamed from: f */
    private final boolean f185177f;

    /* JADX INFO: renamed from: g */
    private String f185178g;

    /* JADX INFO: renamed from: h */
    private RecorderConstants$RenderModelType f185179h;

    /* JADX INFO: renamed from: i */
    private int f185180i;

    /* JADX INFO: renamed from: l.vow$b */
    public static class C20896b {

        /* JADX INFO: renamed from: a */
        private final qow f185181a;

        /* JADX INFO: renamed from: b */
        private int f185182b = 0;

        /* JADX INFO: renamed from: c */
        private int f185183c = 2;

        /* JADX INFO: renamed from: d */
        private int f185184d = 0;

        /* JADX INFO: renamed from: e */
        private boolean f185185e = false;

        /* JADX INFO: renamed from: f */
        private int f185186f = 0;

        /* JADX INFO: renamed from: g */
        private String f185187g = "face240";

        /* JADX INFO: renamed from: h */
        private RecorderConstants$RenderModelType f185188h = RecorderConstants$RenderModelType.JAVA_FILTER_BEAUTY_JAVA_3DRENDING;

        /* JADX INFO: renamed from: i */
        private int f185189i = 0;

        public C20896b(qow qowVar) {
            this.f185181a = qowVar;
        }

        /* JADX INFO: renamed from: i */
        public vow m202180i() {
            return new vow(this.f185181a, this);
        }
    }

    private vow(qow qowVar, C20896b c20896b) {
        this.f185176e = false;
        this.f185178g = "default";
        this.f185179h = RecorderConstants$RenderModelType.JAVA_FILTER_BEAUTY_JAVA_3DRENDING;
        this.f185172a = qowVar;
        this.f185173b = c20896b.f185182b;
        this.f185174c = c20896b.f185183c;
        this.f185175d = c20896b.f185184d;
        this.f185176e = c20896b.f185185e;
        this.f185177f = c20896b.f185186f == 0;
        this.f185178g = c20896b.f185187g;
        this.f185179h = c20896b.f185188h;
        this.f185180i = c20896b.f185189i;
    }

    /* JADX INFO: renamed from: a */
    public qow m202170a() {
        return this.f185172a;
    }

    /* JADX INFO: renamed from: b */
    public boolean m202171b() {
        return this.f185176e;
    }
}
