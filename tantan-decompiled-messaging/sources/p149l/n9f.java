package p149l;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.C0608n;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpProfileEditLinearLayoutManager;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8639c;

/* JADX INFO: loaded from: classes4.dex */
public class n9f {

    /* JADX INFO: renamed from: b */
    public final RecyclerView f137790b;

    /* JADX INFO: renamed from: c */
    public final ExpProfileEditLinearLayoutManager f137791c;

    /* JADX INFO: renamed from: d */
    public final agf f137792d;

    /* JADX INFO: renamed from: e */
    public final View f137793e;

    /* JADX INFO: renamed from: f */
    public RecyclerView.AbstractC0582t f137794f;

    /* JADX INFO: renamed from: i */
    public final Context f137797i;

    /* JADX INFO: renamed from: j */
    public AbstractC8639c f137798j;

    /* JADX INFO: renamed from: a */
    public zpd0 f137789a = new zpd0("data_integrity_guide_show_time_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: g */
    public boolean f137795g = false;

    /* JADX INFO: renamed from: h */
    public boolean f137796h = false;

    /* JADX INFO: renamed from: l.n9f$a */
    public class C18638a extends RecyclerView.AbstractC0582t {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC8639c f137799a;

        public C18638a(AbstractC8639c abstractC8639c) {
            this.f137799a = abstractC8639c;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            n9f n9fVar = n9f.this;
            if (i == 0) {
                n9fVar.m158554o();
                n9f.this.f137793e.setOnClickListener(null);
                this.f137799a.m51227R(true);
                n9f.this.f137795g = true;
                return;
            }
            if (n9fVar.f137795g) {
                this.f137799a.m51227R(false);
                n9f.this.f137790b.removeOnScrollListener(n9f.this.f137794f);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (n9f.this.f137796h) {
                return;
            }
            n9f.this.f137796h = this.f137799a.m51224O();
        }
    }

    /* JADX INFO: renamed from: l.n9f$b */
    public class C18639b extends C0608n {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC8639c f137801a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18639b(Context context, AbstractC8639c abstractC8639c) {
            super(context);
            this.f137801a = abstractC8639c;
        }

        @Override // androidx.recyclerview.widget.C0608n
        public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            return ((i3 - i) + t100.f167244S) - (t100.f167230E * this.f137801a.f33265t);
        }

        @Override // androidx.recyclerview.widget.C0608n
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 50.0f / displayMetrics.densityDpi;
        }
    }

    public n9f(Context context, RecyclerView recyclerView, ExpProfileEditLinearLayoutManager expProfileEditLinearLayoutManager, agf agfVar, View view) {
        this.f137790b = recyclerView;
        this.f137791c = expProfileEditLinearLayoutManager;
        this.f137792d = agfVar;
        this.f137793e = view;
        this.f137797i = context;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m158542c(View view) {
    }

    /* JADX INFO: renamed from: l */
    public final boolean m158551l(AbstractC8639c abstractC8639c) {
        int iM96301K = (abstractC8639c == null || !abstractC8639c.m51221L()) ? 0 : this.f137792d.m96301K(abstractC8639c);
        if (iM96301K == 0) {
            return false;
        }
        this.f137798j = abstractC8639c;
        C18638a c18638a = new C18638a(abstractC8639c);
        this.f137794f = c18638a;
        this.f137790b.addOnScrollListener(c18638a);
        final C18639b c18639b = new C18639b(this.f137790b.getContext(), abstractC8639c);
        c18639b.setTargetPosition(iM96301K);
        this.f137789a.put(Long.valueOf(mqi0.m155944o()));
        this.f137793e.setOnClickListener(new View.OnClickListener() { // from class: l.k9f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n9f.m158542c(view);
            }
        });
        e51.m114743H(this.f137797i, new Runnable() { // from class: l.l9f
            @Override // java.lang.Runnable
            public final void run() {
                this.f127102a.m158553n(c18639b);
            }
        }, 300L);
        return true;
    }

    /* JADX INFO: renamed from: m */
    public void m158552m() {
        AbstractC8639c abstractC8639c = this.f137798j;
        if (abstractC8639c != null) {
            abstractC8639c.m51219J();
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m158553n(C0608n c0608n) {
        m158555p();
        this.f137791c.startSmoothScroll(c0608n);
    }

    /* JADX INFO: renamed from: o */
    public final void m158554o() {
        xdl0.m208344M(this.f137793e, false);
    }

    /* JADX INFO: renamed from: p */
    public final void m158555p() {
        xdl0.m208344M(this.f137793e, true);
        e51.m114743H(this.f137790b.getContext(), new Runnable() { // from class: l.m9f
            @Override // java.lang.Runnable
            public final void run() {
                this.f132772a.m158554o();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: q */
    public void m158556q() {
        if (mqi0.m155929D(this.f137789a.get().longValue())) {
            return;
        }
        e51.m114741F(this.f137797i, new Runnable() { // from class: l.j9f
            @Override // java.lang.Runnable
            public final void run() {
                this.f116896a.m158557r();
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public void m158557r() {
        lcf lcfVar = null;
        jcf jcfVar = null;
        r9f r9fVar = null;
        vdf vdfVar = null;
        for (int i = 0; i < this.f137792d.getPageCount(); i++) {
            AbstractC8639c item = this.f137792d.getItem(i);
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
        if (m158551l(lcfVar) || m158551l(jcfVar) || m158551l(r9fVar) || m158551l(vdfVar)) {
            return;
        }
        xdl0.m208344M(this.f137793e, false);
    }
}
