package p153l;

import android.os.SystemClock;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import com.p051p1.mobile.putong.core.newui.home.opt.CardAnimType;
import com.p051p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p051p1.mobile.putong.core.newui.home.opt.CardSwipeOutState;
import com.p051p1.mobile.putong.core.newui.home.opt.VirtualState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class nh4 {

    /* JADX INFO: renamed from: b */
    public CardAnimType f141908b;

    /* JADX INFO: renamed from: d */
    public long f141910d;

    /* JADX INFO: renamed from: e */
    public int f141911e;

    /* JADX INFO: renamed from: f */
    public mo0 f141912f;

    /* JADX INFO: renamed from: h */
    public CardOperation f141914h;

    /* JADX INFO: renamed from: o */
    public int f141921o;

    /* JADX INFO: renamed from: p */
    public txl0 f141922p;

    /* JADX INFO: renamed from: a */
    public Interpolator f141907a = new AccelerateInterpolator();

    /* JADX INFO: renamed from: g */
    public CardSwipeOutState f141913g = CardSwipeOutState.INVALID;

    /* JADX INFO: renamed from: i */
    public boolean f141915i = false;

    /* JADX INFO: renamed from: j */
    public boolean f141916j = false;

    /* JADX INFO: renamed from: k */
    public boolean f141917k = false;

    /* JADX INFO: renamed from: n */
    public boolean f141920n = false;

    /* JADX INFO: renamed from: q */
    public boolean f141923q = false;

    /* JADX INFO: renamed from: c */
    public long f141909c = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: m */
    public List<Integer> f141919m = new ArrayList();

    /* JADX INFO: renamed from: l */
    public List<VirtualState> f141918l = new ArrayList();

    public nh4(int i, txl0 txl0Var) {
        this.f141922p = txl0Var;
        this.f141921o = i;
    }

    /* JADX INFO: renamed from: a */
    public void m163026a(int i) {
        this.f141919m.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: b */
    public void m163027b(VirtualState... virtualStateArr) {
        if (virtualStateArr == null || virtualStateArr.length <= 0) {
            return;
        }
        for (VirtualState virtualState : virtualStateArr) {
            this.f141918l.add(virtualState);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m163028c() {
        this.f141919m = new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public boolean m163029d() {
        return this.f141908b == CardAnimType.ANIM_BACK;
    }

    /* JADX INFO: renamed from: e */
    public mo0 m163030e() {
        return this.f141912f;
    }

    /* JADX INFO: renamed from: f */
    public Interpolator m163031f() {
        return this.f141907a;
    }

    /* JADX INFO: renamed from: g */
    public CardOperation m163032g() {
        return this.f141914h;
    }

    /* JADX INFO: renamed from: h */
    public CardAnimType m163033h() {
        return this.f141908b;
    }

    /* JADX INFO: renamed from: i */
    public txl0 m163034i() {
        return this.f141922p;
    }

    /* JADX INFO: renamed from: j */
    public CardOperation m163035j() {
        return this.f141914h;
    }

    /* JADX INFO: renamed from: k */
    public boolean m163036k() {
        return this.f141915i;
    }

    /* JADX INFO: renamed from: l */
    public boolean m163037l(txl0 txl0Var) {
        List<VirtualState> list = this.f141918l;
        if (list != null && !list.isEmpty()) {
            Iterator<VirtualState> it = this.f141918l.iterator();
            while (it.hasNext()) {
                if (txl0Var.f176577j == it.next()) {
                    return true;
                }
            }
        }
        List<Integer> list2 = this.f141919m;
        if (list2 == null || list2.isEmpty()) {
            return false;
        }
        Iterator<Integer> it2 = this.f141919m.iterator();
        while (it2.hasNext()) {
            if (txl0Var.f176578k == it2.next().intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public boolean m163038m(int i) {
        List<Integer> list = this.f141919m;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<Integer> it = this.f141919m.iterator();
        while (it.hasNext()) {
            if (i == it.next().intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public void m163039n(mo0 mo0Var) {
        this.f141912f = mo0Var;
    }

    /* JADX INFO: renamed from: o */
    public void m163040o(long j) {
        this.f141910d = j;
    }

    /* JADX INFO: renamed from: p */
    public void m163041p(Interpolator interpolator) {
        this.f141907a = interpolator;
    }

    /* JADX INFO: renamed from: q */
    public void m163042q(boolean z) {
        this.f141923q = z;
    }
}
