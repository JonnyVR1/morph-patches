package p002l;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.ExpProfileEditLinearLayoutManager;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0064c;
import com.p1.mobile.putong.core.CoreModule;
import l.e51;
import l.mqi0;
import l.t100;
import l.xdl0;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class n9f {

    /* JADX INFO: renamed from: b */
    public final RecyclerView f15869b;

    /* JADX INFO: renamed from: c */
    public final ExpProfileEditLinearLayoutManager f15870c;

    /* JADX INFO: renamed from: d */
    public final agf f15871d;

    /* JADX INFO: renamed from: e */
    public final View f15872e;

    /* JADX INFO: renamed from: f */
    public RecyclerView.t f15873f;

    /* JADX INFO: renamed from: i */
    public final Context f15876i;

    /* JADX INFO: renamed from: j */
    public AbstractC0064c f15877j;

    /* JADX INFO: renamed from: a */
    public zpd0 f15868a = new zpd0("data_integrity_guide_show_time_" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: g */
    public boolean f15874g = false;

    /* JADX INFO: renamed from: h */
    public boolean f15875h = false;

    /* JADX INFO: renamed from: l.n9f$a */
    public class C0695a extends RecyclerView.t {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0064c f15878a;

        public C0695a(AbstractC0064c abstractC0064c) {
            this.f15878a = abstractC0064c;
        }

        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            n9f n9fVar = n9f.this;
            if (i == 0) {
                n9fVar.m18543o();
                n9f.this.f15872e.setOnClickListener(null);
                this.f15878a.m1682R(true);
                n9f.this.f15874g = true;
                return;
            }
            if (n9fVar.f15874g) {
                this.f15878a.m1682R(false);
                n9f.this.f15869b.removeOnScrollListener(n9f.this.f15873f);
            }
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (n9f.this.f15875h) {
                return;
            }
            n9f.this.f15875h = this.f15878a.m1679O();
        }
    }

    /* JADX INFO: renamed from: l.n9f$b */
    public class C0696b extends n {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0064c f15880a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0696b(Context context, AbstractC0064c abstractC0064c) {
            super(context);
            this.f15880a = abstractC0064c;
        }

        public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            return ((i3 - i) + t100.S) - (t100.E * this.f15880a.f1087t);
        }

        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 50.0f / displayMetrics.densityDpi;
        }
    }

    public n9f(Context context, RecyclerView recyclerView, ExpProfileEditLinearLayoutManager expProfileEditLinearLayoutManager, agf agfVar, View view) {
        this.f15869b = recyclerView;
        this.f15870c = expProfileEditLinearLayoutManager;
        this.f15871d = agfVar;
        this.f15872e = view;
        this.f15876i = context;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m18531c(View view) {
    }

    /* JADX INFO: renamed from: l */
    public final boolean m18540l(AbstractC0064c abstractC0064c) {
        int iM9624K = (abstractC0064c == null || !abstractC0064c.m1676L()) ? 0 : this.f15871d.m9624K(abstractC0064c);
        if (iM9624K == 0) {
            return false;
        }
        this.f15877j = abstractC0064c;
        C0695a c0695a = new C0695a(abstractC0064c);
        this.f15873f = c0695a;
        this.f15869b.addOnScrollListener(c0695a);
        final C0696b c0696b = new C0696b(this.f15869b.getContext(), abstractC0064c);
        c0696b.setTargetPosition(iM9624K);
        this.f15868a.put(Long.valueOf(mqi0.o()));
        this.f15872e.setOnClickListener(new View.OnClickListener() { // from class: l.k9f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n9f.m18531c(view);
            }
        });
        e51.H(this.f15876i, new Runnable() { // from class: l.l9f
            @Override // java.lang.Runnable
            public final void run() {
                this.f14739a.m18542n(c0696b);
            }
        }, 300L);
        return true;
    }

    /* JADX INFO: renamed from: m */
    public void m18541m() {
        AbstractC0064c abstractC0064c = this.f15877j;
        if (abstractC0064c != null) {
            abstractC0064c.m1674J();
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m18542n(n nVar) {
        m18544p();
        this.f15870c.startSmoothScroll(nVar);
    }

    /* JADX INFO: renamed from: o */
    public final void m18543o() {
        xdl0.M(this.f15872e, false);
    }

    /* JADX INFO: renamed from: p */
    public final void m18544p() {
        xdl0.M(this.f15872e, true);
        e51.H(this.f15869b.getContext(), new Runnable() { // from class: l.m9f
            @Override // java.lang.Runnable
            public final void run() {
                this.f15289a.m18543o();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: q */
    public void m18545q() {
        if (mqi0.D(((Long) this.f15868a.get()).longValue())) {
            return;
        }
        e51.F(this.f15876i, new Runnable() { // from class: l.j9f
            @Override // java.lang.Runnable
            public final void run() {
                this.f13647a.m18546r();
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public void m18546r() {
        lcf lcfVar = null;
        jcf jcfVar = null;
        r9f r9fVar = null;
        vdf vdfVar = null;
        for (int i = 0; i < this.f15871d.m9618C(); i++) {
            AbstractC0064c item = this.f15871d.getItem(i);
            if (item instanceof lcf) {
                lcfVar = (lcf) item;
            }
            if (item instanceof jcf) {
                jcfVar = (jcf) item;
            }
            if (item instanceof r9f) {
                r9fVar = (r9f) item;
            }
            if (item instanceof vdf) {
                vdfVar = (vdf) item;
            }
        }
        if (m18540l(lcfVar) || m18540l(jcfVar) || m18540l(r9fVar) || m18540l(vdfVar)) {
            return;
        }
        xdl0.M(this.f15872e, false);
    }
}
