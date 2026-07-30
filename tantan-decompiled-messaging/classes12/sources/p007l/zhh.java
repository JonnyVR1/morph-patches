package p007l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.item.FeedMyInterestItem;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.e30;
import l.eb2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class zhh extends eb2 {

    /* JADX INFO: renamed from: e */
    public Map<Integer, jol<x8h>> f15741e = new HashMap();

    /* JADX INFO: renamed from: f */
    public List<x8h> f15742f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public Act f15743g;

    /* JADX INFO: renamed from: h */
    public zol f15744h;

    /* JADX INFO: renamed from: l.zhh$a */
    public class C2548a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e30 f15745a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f15746b;

        public C2548a(e30 e30Var, int i) {
            this.f15745a = e30Var;
            this.f15746b = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (NullChecker.a(this.f15745a)) {
                this.f15745a.call(Integer.valueOf(this.f15746b));
            }
        }
    }

    /* JADX INFO: renamed from: l.zhh$b */
    public class C2549b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e30 f15748a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f15749b;

        public C2549b(e30 e30Var, int i) {
            this.f15748a = e30Var;
            this.f15749b = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (NullChecker.a(this.f15748a)) {
                this.f15748a.call(Integer.valueOf(this.f15749b));
            }
        }
    }

    public zhh(Act act, zol zolVar) {
        this.f15743g = act;
        this.f15744h = zolVar;
    }

    public int getCount() {
        return this.f15742f.size();
    }

    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: o */
    public void m17395o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* JADX INFO: renamed from: p */
    public Object m17396p(ViewGroup viewGroup, int i) {
        FeedMyInterestItem feedMyInterestItem = new FeedMyInterestItem(this.f15743g, this.f15744h, i);
        this.f15741e.put(Integer.valueOf(i), feedMyInterestItem);
        feedMyInterestItem.mo6035a(this.f15742f.get(i));
        if (i == 0 || nkg.m12213K()) {
            feedMyInterestItem.mo6042h();
        }
        viewGroup.addView(feedMyInterestItem);
        return feedMyInterestItem;
    }

    /* JADX INFO: renamed from: q */
    public void m17397q(int i, e30<Integer> e30Var) {
        jol<x8h> jolVar = this.f15741e.get(Integer.valueOf(i));
        if (jolVar == null) {
            return;
        }
        jolVar.m11262i(new w8h(), new C2548a(e30Var, i));
    }

    /* JADX INFO: renamed from: r */
    public void m17398r(int i, e30<Integer> e30Var) {
        jol<x8h> jolVar = this.f15741e.get(Integer.valueOf(i));
        if (jolVar == null) {
            return;
        }
        jolVar.m11262i(new sih(), new C2549b(e30Var, i));
    }

    /* JADX INFO: renamed from: s */
    public void m17399s(List<x8h> list) {
        this.f15742f = new ArrayList(list);
        notifyDataSetChanged();
    }
}
