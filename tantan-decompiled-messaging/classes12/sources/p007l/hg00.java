package p007l;

import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.IntlOperationArticles;
import com.p000p1.mobile.putong.data.IntlOperationBanner;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class hg00 {

    /* JADX INFO: renamed from: a */
    public Moment f8699a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public MomentMessage f8700b;

    /* JADX INFO: renamed from: c */
    public int f8701c;

    /* JADX INFO: renamed from: d */
    public boolean f8702d;

    /* JADX INFO: renamed from: e */
    public int f8703e;

    /* JADX INFO: renamed from: f */
    public int f8704f;

    /* JADX INFO: renamed from: g */
    public int f8705g;

    /* JADX INFO: renamed from: h */
    public boolean f8706h;

    /* JADX INFO: renamed from: i */
    public boolean f8707i;

    /* JADX INFO: renamed from: j */
    public IntlOperationArticles f8708j;

    /* JADX INFO: renamed from: k */
    public List<IntlOperationBanner> f8709k;

    public hg00(Moment moment, int i, int i2, int i3) {
        this.f8700b = null;
        this.f8702d = false;
        this.f8703e = 0;
        this.f8706h = false;
        this.f8707i = false;
        this.f8699a = moment;
        this.f8704f = i;
        this.f8705g = i2;
        this.f8701c = i3;
    }

    /* JADX INFO: renamed from: a */
    public static hg00 m10622a(IntlOperationArticles intlOperationArticles) {
        hg00 hg00Var = new hg00();
        hg00Var.f8707i = true;
        hg00Var.f8708j = intlOperationArticles;
        return hg00Var;
    }

    /* JADX INFO: renamed from: b */
    public static hg00 m10623b(List<IntlOperationBanner> list) {
        hg00 hg00Var = new hg00();
        hg00Var.f8706h = true;
        hg00Var.f8709k = list;
        return hg00Var;
    }

    /* JADX INFO: renamed from: c */
    public boolean m10624c() {
        return this.f8700b == null;
    }

    public hg00(Moment moment, MomentMessage momentMessage, boolean z, int i, int i2) {
        this.f8705g = 0;
        this.f8706h = false;
        this.f8707i = false;
        this.f8699a = moment;
        this.f8700b = momentMessage;
        this.f8702d = z;
        this.f8703e = i;
        this.f8704f = i2;
    }

    public hg00() {
        this.f8700b = null;
        this.f8702d = false;
        this.f8703e = 0;
        this.f8704f = 0;
        this.f8705g = 0;
        this.f8706h = false;
        this.f8707i = false;
    }
}
