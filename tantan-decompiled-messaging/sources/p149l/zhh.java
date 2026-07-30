package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.item.FeedMyInterestItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class zhh extends eb2 {

    /* JADX INFO: renamed from: e */
    public Map<Integer, jol<x8h>> f203169e = new HashMap();

    /* JADX INFO: renamed from: f */
    public List<x8h> f203170f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public Act f203171g;

    /* JADX INFO: renamed from: h */
    public zol f203172h;

    /* JADX INFO: renamed from: l.zhh$a */
    public class C21697a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e30 f203173a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f203174b;

        public C21697a(e30 e30Var, int i) {
            this.f203173a = e30Var;
            this.f203174b = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (NullChecker.m81303a(this.f203173a)) {
                this.f203173a.call(Integer.valueOf(this.f203174b));
            }
        }
    }

    /* JADX INFO: renamed from: l.zhh$b */
    public class C21698b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e30 f203176a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f203177b;

        public C21698b(e30 e30Var, int i) {
            this.f203176a = e30Var;
            this.f203177b = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (NullChecker.m81303a(this.f203176a)) {
                this.f203176a.call(Integer.valueOf(this.f203177b));
            }
        }
    }

    public zhh(Act act, zol zolVar) {
        this.f203171g = act;
        this.f203172h = zolVar;
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f203170f.size();
    }

    @Override // p149l.w660
    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    @Override // p149l.w660
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: o */
    public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        FeedMyInterestItem feedMyInterestItem = new FeedMyInterestItem(this.f203171g, this.f203172h, i);
        this.f203169e.put(Integer.valueOf(i), feedMyInterestItem);
        feedMyInterestItem.mo64936a(this.f203170f.get(i));
        if (i == 0 || nkg.m159854K()) {
            feedMyInterestItem.mo64943h();
        }
        viewGroup.addView(feedMyInterestItem);
        return feedMyInterestItem;
    }

    /* JADX INFO: renamed from: q */
    public void m218794q(int i, e30<Integer> e30Var) {
        jol<x8h> jolVar = this.f203169e.get(Integer.valueOf(i));
        if (jolVar == null) {
            return;
        }
        jolVar.m142522i(new w8h(), new C21697a(e30Var, i));
    }

    /* JADX INFO: renamed from: r */
    public void m218795r(int i, e30<Integer> e30Var) {
        jol<x8h> jolVar = this.f203169e.get(Integer.valueOf(i));
        if (jolVar == null) {
            return;
        }
        jolVar.m142522i(new sih(), new C21698b(e30Var, i));
    }

    /* JADX INFO: renamed from: s */
    public void m218796s(List<x8h> list) {
        this.f203170f = new ArrayList(list);
        notifyDataSetChanged();
    }
}
