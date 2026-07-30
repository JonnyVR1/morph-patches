package p009l;

import android.os.SystemClock;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import com.p000p1.mobile.putong.core.newui.home.opt.CardAnimType;
import com.p000p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p000p1.mobile.putong.core.newui.home.opt.CardSwipeOutState;
import com.p000p1.mobile.putong.core.newui.home.opt.VirtualState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class og4 {

    /* JADX INFO: renamed from: b */
    public CardAnimType f18007b;

    /* JADX INFO: renamed from: d */
    public long f18009d;

    /* JADX INFO: renamed from: e */
    public int f18010e;

    /* JADX INFO: renamed from: f */
    public qo0 f18011f;

    /* JADX INFO: renamed from: h */
    public CardOperation f18013h;

    /* JADX INFO: renamed from: o */
    public int f18020o;

    /* JADX INFO: renamed from: p */
    public pol0 f18021p;

    /* JADX INFO: renamed from: a */
    public Interpolator f18006a = new AccelerateInterpolator();

    /* JADX INFO: renamed from: g */
    public CardSwipeOutState f18012g = CardSwipeOutState.INVALID;

    /* JADX INFO: renamed from: i */
    public boolean f18014i = false;

    /* JADX INFO: renamed from: j */
    public boolean f18015j = false;

    /* JADX INFO: renamed from: k */
    public boolean f18016k = false;

    /* JADX INFO: renamed from: n */
    public boolean f18019n = false;

    /* JADX INFO: renamed from: q */
    public boolean f18022q = false;

    /* JADX INFO: renamed from: c */
    public long f18008c = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: m */
    public List<Integer> f18018m = new ArrayList();

    /* JADX INFO: renamed from: l */
    public List<VirtualState> f18017l = new ArrayList();

    public og4(int i, pol0 pol0Var) {
        this.f18021p = pol0Var;
        this.f18020o = i;
    }

    /* JADX INFO: renamed from: a */
    public void m19739a(int i) {
        this.f18018m.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: b */
    public void m19740b(VirtualState... virtualStateArr) {
        if (virtualStateArr == null || virtualStateArr.length <= 0) {
            return;
        }
        for (VirtualState virtualState : virtualStateArr) {
            this.f18017l.add(virtualState);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m19741c() {
        this.f18018m = new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public boolean m19742d() {
        return this.f18007b == CardAnimType.ANIM_BACK;
    }

    /* JADX INFO: renamed from: e */
    public qo0 m19743e() {
        return this.f18011f;
    }

    /* JADX INFO: renamed from: f */
    public Interpolator m19744f() {
        return this.f18006a;
    }

    /* JADX INFO: renamed from: g */
    public CardOperation m19745g() {
        return this.f18013h;
    }

    /* JADX INFO: renamed from: h */
    public CardAnimType m19746h() {
        return this.f18007b;
    }

    /* JADX INFO: renamed from: i */
    public pol0 m19747i() {
        return this.f18021p;
    }

    /* JADX INFO: renamed from: j */
    public CardOperation m19748j() {
        return this.f18013h;
    }

    /* JADX INFO: renamed from: k */
    public boolean m19749k() {
        return this.f18014i;
    }

    /* JADX INFO: renamed from: l */
    public boolean m19750l(pol0 pol0Var) {
        List<VirtualState> list = this.f18017l;
        if (list != null && !list.isEmpty()) {
            Iterator<VirtualState> it = this.f18017l.iterator();
            while (it.hasNext()) {
                if (pol0Var.f18809j == it.next()) {
                    return true;
                }
            }
        }
        List<Integer> list2 = this.f18018m;
        if (list2 == null || list2.isEmpty()) {
            return false;
        }
        Iterator<Integer> it2 = this.f18018m.iterator();
        while (it2.hasNext()) {
            if (pol0Var.f18810k == it2.next().intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public boolean m19751m(int i) {
        List<Integer> list = this.f18018m;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<Integer> it = this.f18018m.iterator();
        while (it.hasNext()) {
            if (i == it.next().intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public void m19752n(qo0 qo0Var) {
        this.f18011f = qo0Var;
    }

    /* JADX INFO: renamed from: o */
    public void m19753o(long j) {
        this.f18009d = j;
    }

    /* JADX INFO: renamed from: p */
    public void m19754p(Interpolator interpolator) {
        this.f18006a = interpolator;
    }

    /* JADX INFO: renamed from: q */
    public void m19755q(boolean z) {
        this.f18022q = z;
    }
}
