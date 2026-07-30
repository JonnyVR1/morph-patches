package p153l;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.C0610n;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpProfileEditLinearLayoutManager;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8802c;

/* JADX INFO: loaded from: classes4.dex */
public class taf {

    /* JADX INFO: renamed from: b */
    public final RecyclerView f172717b;

    /* JADX INFO: renamed from: c */
    public final ExpProfileEditLinearLayoutManager f172718c;

    /* JADX INFO: renamed from: d */
    public final ghf f172719d;

    /* JADX INFO: renamed from: e */
    public final View f172720e;

    /* JADX INFO: renamed from: f */
    public RecyclerView.AbstractC0584t f172721f;

    /* JADX INFO: renamed from: i */
    public final Context f172724i;

    /* JADX INFO: renamed from: j */
    public AbstractC8802c f172725j;

    /* JADX INFO: renamed from: a */
    public byd0 f172716a = new byd0("data_integrity_guide_show_time_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: g */
    public boolean f172722g = false;

    /* JADX INFO: renamed from: h */
    public boolean f172723h = false;

    /* JADX INFO: renamed from: l.taf$a */
    public class C20263a extends RecyclerView.AbstractC0584t {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC8802c f172726a;

        public C20263a(AbstractC8802c abstractC8802c) {
            this.f172726a = abstractC8802c;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            taf tafVar = taf.this;
            if (i == 0) {
                tafVar.m189852o();
                taf.this.f172720e.setOnClickListener(null);
                this.f172726a.m52410R(true);
                taf.this.f172722g = true;
                return;
            }
            if (tafVar.f172722g) {
                this.f172726a.m52410R(false);
                taf.this.f172717b.removeOnScrollListener(taf.this.f172721f);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (taf.this.f172723h) {
                return;
            }
            taf.this.f172723h = this.f172726a.m52407O();
        }
    }

    /* JADX INFO: renamed from: l.taf$b */
    public class C20264b extends C0610n {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC8802c f172728a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20264b(Context context, AbstractC8802c abstractC8802c) {
            super(context);
            this.f172728a = abstractC8802c;
        }

        @Override // androidx.recyclerview.widget.C0610n
        public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            return ((i3 - i) + qa00.f156306S) - (qa00.f156292E * this.f172728a.f34113t);
        }

        @Override // androidx.recyclerview.widget.C0610n
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 50.0f / displayMetrics.densityDpi;
        }
    }

    public taf(Context context, RecyclerView recyclerView, ExpProfileEditLinearLayoutManager expProfileEditLinearLayoutManager, ghf ghfVar, View view) {
        this.f172717b = recyclerView;
        this.f172718c = expProfileEditLinearLayoutManager;
        this.f172719d = ghfVar;
        this.f172720e = view;
        this.f172724i = context;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m189840c(View view) {
    }

    /* JADX INFO: renamed from: l */
    public final boolean m189849l(AbstractC8802c abstractC8802c) {
        int iM130249K = (abstractC8802c == null || !abstractC8802c.m52404L()) ? 0 : this.f172719d.m130249K(abstractC8802c);
        if (iM130249K == 0) {
            return false;
        }
        this.f172725j = abstractC8802c;
        C20263a c20263a = new C20263a(abstractC8802c);
        this.f172721f = c20263a;
        this.f172717b.addOnScrollListener(c20263a);
        final C20264b c20264b = new C20264b(this.f172717b.getContext(), abstractC8802c);
        c20264b.setTargetPosition(iM130249K);
        this.f172716a.put(Long.valueOf(pzi0.m174454o()));
        this.f172720e.setOnClickListener(new View.OnClickListener() { // from class: l.qaf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                taf.m189840c(view);
            }
        });
        l51.m152888H(this.f172724i, new Runnable() { // from class: l.raf
            @Override // java.lang.Runnable
            public final void run() {
                this.f161925a.m189851n(c20264b);
            }
        }, 300L);
        return true;
    }

    /* JADX INFO: renamed from: m */
    public void m189850m() {
        AbstractC8802c abstractC8802c = this.f172725j;
        if (abstractC8802c != null) {
            abstractC8802c.m52402J();
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m189851n(C0610n c0610n) {
        m189853p();
        this.f172718c.startSmoothScroll(c0610n);
    }

    /* JADX INFO: renamed from: o */
    public final void m189852o() {
        bnl0.m105524M(this.f172720e, false);
    }

    /* JADX INFO: renamed from: p */
    public final void m189853p() {
        bnl0.m105524M(this.f172720e, true);
        l51.m152888H(this.f172717b.getContext(), new Runnable() { // from class: l.saf
            @Override // java.lang.Runnable
            public final void run() {
                this.f167041a.m189852o();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: q */
    public void m189854q() {
        if (pzi0.m174439D(this.f172716a.get().longValue())) {
            return;
        }
        l51.m152886F(this.f172724i, new Runnable() { // from class: l.paf
            @Override // java.lang.Runnable
            public final void run() {
                this.f151275a.m189855r();
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public void m189855r() {
        rdf rdfVar = null;
        pdf pdfVar = null;
        xaf xafVar = null;
        bff bffVar = null;
        for (int i = 0; i < this.f172719d.getPageCount(); i++) {
            AbstractC8802c item = this.f172719d.getItem(i);
            if (item instanceof rdf) {
                rdfVar = (rdf) item;
            }
            if (item instanceof pdf) {
                pdfVar = (pdf) item;
            }
            if (item instanceof xaf) {
                xafVar = (xaf) item;
            }
            if (item instanceof bff) {
                bffVar = (bff) item;
            }
        }
        if (m189849l(rdfVar) || m189849l(pdfVar) || m189849l(xafVar) || m189849l(bffVar)) {
            return;
        }
        bnl0.m105524M(this.f172720e, false);
    }
}
