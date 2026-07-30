package p153l;

import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.IntlOperationArticles;
import com.p051p1.mobile.putong.data.IntlOperationBanner;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class qo00 {

    /* JADX INFO: renamed from: a */
    public Moment f158680a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public MomentMessage f158681b;

    /* JADX INFO: renamed from: c */
    public int f158682c;

    /* JADX INFO: renamed from: d */
    public boolean f158683d;

    /* JADX INFO: renamed from: e */
    public int f158684e;

    /* JADX INFO: renamed from: f */
    public int f158685f;

    /* JADX INFO: renamed from: g */
    public int f158686g;

    /* JADX INFO: renamed from: h */
    public boolean f158687h;

    /* JADX INFO: renamed from: i */
    public boolean f158688i;

    /* JADX INFO: renamed from: j */
    public IntlOperationArticles f158689j;

    /* JADX INFO: renamed from: k */
    public List<IntlOperationBanner> f158690k;

    public qo00(Moment moment, int i, int i2, int i3) {
        this.f158681b = null;
        this.f158683d = false;
        this.f158684e = 0;
        this.f158687h = false;
        this.f158688i = false;
        this.f158680a = moment;
        this.f158685f = i;
        this.f158686g = i2;
        this.f158682c = i3;
    }

    /* JADX INFO: renamed from: a */
    public static qo00 m177269a(IntlOperationArticles intlOperationArticles) {
        qo00 qo00Var = new qo00();
        qo00Var.f158688i = true;
        qo00Var.f158689j = intlOperationArticles;
        return qo00Var;
    }

    /* JADX INFO: renamed from: b */
    public static qo00 m177270b(List<IntlOperationBanner> list) {
        qo00 qo00Var = new qo00();
        qo00Var.f158687h = true;
        qo00Var.f158690k = list;
        return qo00Var;
    }

    /* JADX INFO: renamed from: c */
    public boolean m177271c() {
        return this.f158681b == null;
    }

    public qo00(Moment moment, MomentMessage momentMessage, boolean z, int i, int i2) {
        this.f158686g = 0;
        this.f158687h = false;
        this.f158688i = false;
        this.f158680a = moment;
        this.f158681b = momentMessage;
        this.f158683d = z;
        this.f158684e = i;
        this.f158685f = i2;
    }

    public qo00() {
        this.f158681b = null;
        this.f158683d = false;
        this.f158684e = 0;
        this.f158685f = 0;
        this.f158686g = 0;
        this.f158687h = false;
        this.f158688i = false;
    }
}
