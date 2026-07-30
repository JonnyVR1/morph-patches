package p149l;

import com.p041mm.mediasdk.RecorderConstants$RenderModelType;

/* JADX INFO: loaded from: classes7.dex */
public class wlw {

    /* JADX INFO: renamed from: a */
    private final rlw f187016a;

    /* JADX INFO: renamed from: b */
    private final int f187017b;

    /* JADX INFO: renamed from: c */
    private final int f187018c;

    /* JADX INFO: renamed from: d */
    private final int f187019d;

    /* JADX INFO: renamed from: e */
    private boolean f187020e;

    /* JADX INFO: renamed from: f */
    private final boolean f187021f;

    /* JADX INFO: renamed from: g */
    private String f187022g;

    /* JADX INFO: renamed from: h */
    private RecorderConstants$RenderModelType f187023h;

    /* JADX INFO: renamed from: i */
    private int f187024i;

    /* JADX INFO: renamed from: l.wlw$b */
    public static class C20891b {

        /* JADX INFO: renamed from: a */
        private final rlw f187025a;

        /* JADX INFO: renamed from: b */
        private int f187026b = 0;

        /* JADX INFO: renamed from: c */
        private int f187027c = 2;

        /* JADX INFO: renamed from: d */
        private int f187028d = 0;

        /* JADX INFO: renamed from: e */
        private boolean f187029e = false;

        /* JADX INFO: renamed from: f */
        private int f187030f = 0;

        /* JADX INFO: renamed from: g */
        private String f187031g = "face240";

        /* JADX INFO: renamed from: h */
        private RecorderConstants$RenderModelType f187032h = RecorderConstants$RenderModelType.JAVA_FILTER_BEAUTY_JAVA_3DRENDING;

        /* JADX INFO: renamed from: i */
        private int f187033i = 0;

        public C20891b(rlw rlwVar) {
            this.f187025a = rlwVar;
        }

        /* JADX INFO: renamed from: i */
        public wlw m203959i() {
            return new wlw(this.f187025a, this);
        }
    }

    private wlw(rlw rlwVar, C20891b c20891b) {
        this.f187020e = false;
        this.f187022g = "default";
        this.f187023h = RecorderConstants$RenderModelType.JAVA_FILTER_BEAUTY_JAVA_3DRENDING;
        this.f187016a = rlwVar;
        this.f187017b = c20891b.f187026b;
        this.f187018c = c20891b.f187027c;
        this.f187019d = c20891b.f187028d;
        this.f187020e = c20891b.f187029e;
        this.f187021f = c20891b.f187030f == 0;
        this.f187022g = c20891b.f187031g;
        this.f187023h = c20891b.f187032h;
        this.f187024i = c20891b.f187033i;
    }

    /* JADX INFO: renamed from: a */
    public rlw m203949a() {
        return this.f187016a;
    }

    /* JADX INFO: renamed from: b */
    public boolean m203950b() {
        return this.f187020e;
    }
}
