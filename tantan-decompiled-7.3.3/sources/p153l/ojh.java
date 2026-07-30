package p153l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.item.FeedMyInterestItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class ojh extends lb2 {

    /* JADX INFO: renamed from: e */
    public Map<Integer, uql<mah>> f147663e = new HashMap();

    /* JADX INFO: renamed from: f */
    public List<mah> f147664f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public Act f147665g;

    /* JADX INFO: renamed from: h */
    public lrl f147666h;

    /* JADX INFO: renamed from: l.ojh$a */
    public class C19152a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y20 f147667a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f147668b;

        public C19152a(y20 y20Var, int i) {
            this.f147667a = y20Var;
            this.f147668b = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (NullChecker.m82486a(this.f147667a)) {
                this.f147667a.call(Integer.valueOf(this.f147668b));
            }
        }
    }

    /* JADX INFO: renamed from: l.ojh$b */
    public class C19153b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y20 f147670a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f147671b;

        public C19153b(y20 y20Var, int i) {
            this.f147670a = y20Var;
            this.f147671b = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (NullChecker.m82486a(this.f147670a)) {
                this.f147670a.call(Integer.valueOf(this.f147671b));
            }
        }
    }

    public ojh(Act act, lrl lrlVar) {
        this.f147665g = act;
        this.f147666h = lrlVar;
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f147664f.size();
    }

    @Override // p153l.cf60
    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        FeedMyInterestItem feedMyInterestItem = new FeedMyInterestItem(this.f147665g, this.f147666h, i);
        this.f147663e.put(Integer.valueOf(i), feedMyInterestItem);
        feedMyInterestItem.mo66119a(this.f147664f.get(i));
        if (i == 0 || cmg.m111183K()) {
            feedMyInterestItem.mo66126h();
        }
        viewGroup.addView(feedMyInterestItem);
        return feedMyInterestItem;
    }

    /* JADX INFO: renamed from: q */
    public void m167862q(int i, y20<Integer> y20Var) {
        uql<mah> uqlVar = this.f147663e.get(Integer.valueOf(i));
        if (uqlVar == null) {
            return;
        }
        uqlVar.m197372i(new lah(), new C19152a(y20Var, i));
    }

    /* JADX INFO: renamed from: r */
    public void m167863r(int i, y20<Integer> y20Var) {
        uql<mah> uqlVar = this.f147663e.get(Integer.valueOf(i));
        if (uqlVar == null) {
            return;
        }
        uqlVar.m197372i(new hkh(), new C19153b(y20Var, i));
    }

    /* JADX INFO: renamed from: s */
    public void m167864s(List<mah> list) {
        this.f147664f = new ArrayList(list);
        notifyDataSetChanged();
    }
}
