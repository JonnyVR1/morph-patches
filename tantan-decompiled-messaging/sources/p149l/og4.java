package p149l;

import android.os.SystemClock;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import com.p046p1.mobile.putong.core.newui.home.opt.CardAnimType;
import com.p046p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p046p1.mobile.putong.core.newui.home.opt.CardSwipeOutState;
import com.p046p1.mobile.putong.core.newui.home.opt.VirtualState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class og4 {

    /* JADX INFO: renamed from: b */
    public CardAnimType f143802b;

    /* JADX INFO: renamed from: d */
    public long f143804d;

    /* JADX INFO: renamed from: e */
    public int f143805e;

    /* JADX INFO: renamed from: f */
    public qo0 f143806f;

    /* JADX INFO: renamed from: h */
    public CardOperation f143808h;

    /* JADX INFO: renamed from: o */
    public int f143815o;

    /* JADX INFO: renamed from: p */
    public pol0 f143816p;

    /* JADX INFO: renamed from: a */
    public Interpolator f143801a = new AccelerateInterpolator();

    /* JADX INFO: renamed from: g */
    public CardSwipeOutState f143807g = CardSwipeOutState.INVALID;

    /* JADX INFO: renamed from: i */
    public boolean f143809i = false;

    /* JADX INFO: renamed from: j */
    public boolean f143810j = false;

    /* JADX INFO: renamed from: k */
    public boolean f143811k = false;

    /* JADX INFO: renamed from: n */
    public boolean f143814n = false;

    /* JADX INFO: renamed from: q */
    public boolean f143817q = false;

    /* JADX INFO: renamed from: c */
    public long f143803c = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: m */
    public List<Integer> f143813m = new ArrayList();

    /* JADX INFO: renamed from: l */
    public List<VirtualState> f143812l = new ArrayList();

    public og4(int i, pol0 pol0Var) {
        this.f143816p = pol0Var;
        this.f143815o = i;
    }

    /* JADX INFO: renamed from: a */
    public void m164160a(int i) {
        this.f143813m.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: b */
    public void m164161b(VirtualState... virtualStateArr) {
        if (virtualStateArr == null || virtualStateArr.length <= 0) {
            return;
        }
        for (VirtualState virtualState : virtualStateArr) {
            this.f143812l.add(virtualState);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m164162c() {
        this.f143813m = new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public boolean m164163d() {
        return this.f143802b == CardAnimType.ANIM_BACK;
    }

    /* JADX INFO: renamed from: e */
    public qo0 m164164e() {
        return this.f143806f;
    }

    /* JADX INFO: renamed from: f */
    public Interpolator m164165f() {
        return this.f143801a;
    }

    /* JADX INFO: renamed from: g */
    public CardOperation m164166g() {
        return this.f143808h;
    }

    /* JADX INFO: renamed from: h */
    public CardAnimType m164167h() {
        return this.f143802b;
    }

    /* JADX INFO: renamed from: i */
    public pol0 m164168i() {
        return this.f143816p;
    }

    /* JADX INFO: renamed from: j */
    public CardOperation m164169j() {
        return this.f143808h;
    }

    /* JADX INFO: renamed from: k */
    public boolean m164170k() {
        return this.f143809i;
    }

    /* JADX INFO: renamed from: l */
    public boolean m164171l(pol0 pol0Var) {
        List<VirtualState> list = this.f143812l;
        if (list != null && !list.isEmpty()) {
            Iterator<VirtualState> it = this.f143812l.iterator();
            while (it.hasNext()) {
                if (pol0Var.f150539j == it.next()) {
                    return true;
                }
            }
        }
        List<Integer> list2 = this.f143813m;
        if (list2 == null || list2.isEmpty()) {
            return false;
        }
        Iterator<Integer> it2 = this.f143813m.iterator();
        while (it2.hasNext()) {
            if (pol0Var.f150540k == it2.next().intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public boolean m164172m(int i) {
        List<Integer> list = this.f143813m;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<Integer> it = this.f143813m.iterator();
        while (it.hasNext()) {
            if (i == it.next().intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public void m164173n(qo0 qo0Var) {
        this.f143806f = qo0Var;
    }

    /* JADX INFO: renamed from: o */
    public void m164174o(long j) {
        this.f143804d = j;
    }

    /* JADX INFO: renamed from: p */
    public void m164175p(Interpolator interpolator) {
        this.f143801a = interpolator;
    }

    /* JADX INFO: renamed from: q */
    public void m164176q(boolean z) {
        this.f143817q = z;
    }
}
