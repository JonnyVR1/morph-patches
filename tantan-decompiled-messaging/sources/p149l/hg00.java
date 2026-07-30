package p149l;

import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.IntlOperationArticles;
import com.p046p1.mobile.putong.data.IntlOperationBanner;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class hg00 {

    /* JADX INFO: renamed from: a */
    public Moment f107542a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public MomentMessage f107543b;

    /* JADX INFO: renamed from: c */
    public int f107544c;

    /* JADX INFO: renamed from: d */
    public boolean f107545d;

    /* JADX INFO: renamed from: e */
    public int f107546e;

    /* JADX INFO: renamed from: f */
    public int f107547f;

    /* JADX INFO: renamed from: g */
    public int f107548g;

    /* JADX INFO: renamed from: h */
    public boolean f107549h;

    /* JADX INFO: renamed from: i */
    public boolean f107550i;

    /* JADX INFO: renamed from: j */
    public IntlOperationArticles f107551j;

    /* JADX INFO: renamed from: k */
    public List<IntlOperationBanner> f107552k;

    public hg00(Moment moment, int i, int i2, int i3) {
        this.f107543b = null;
        this.f107545d = false;
        this.f107546e = 0;
        this.f107549h = false;
        this.f107550i = false;
        this.f107542a = moment;
        this.f107547f = i;
        this.f107548g = i2;
        this.f107544c = i3;
    }

    /* JADX INFO: renamed from: a */
    public static hg00 m130804a(IntlOperationArticles intlOperationArticles) {
        hg00 hg00Var = new hg00();
        hg00Var.f107550i = true;
        hg00Var.f107551j = intlOperationArticles;
        return hg00Var;
    }

    /* JADX INFO: renamed from: b */
    public static hg00 m130805b(List<IntlOperationBanner> list) {
        hg00 hg00Var = new hg00();
        hg00Var.f107549h = true;
        hg00Var.f107552k = list;
        return hg00Var;
    }

    /* JADX INFO: renamed from: c */
    public boolean m130806c() {
        return this.f107543b == null;
    }

    public hg00(Moment moment, MomentMessage momentMessage, boolean z, int i, int i2) {
        this.f107548g = 0;
        this.f107549h = false;
        this.f107550i = false;
        this.f107542a = moment;
        this.f107543b = momentMessage;
        this.f107545d = z;
        this.f107546e = i;
        this.f107547f = i2;
    }

    public hg00() {
        this.f107543b = null;
        this.f107545d = false;
        this.f107546e = 0;
        this.f107547f = 0;
        this.f107548g = 0;
        this.f107549h = false;
        this.f107550i = false;
    }
}
