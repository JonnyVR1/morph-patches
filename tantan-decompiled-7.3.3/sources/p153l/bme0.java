package p153l;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.School;
import com.p051p1.mobile.putong.core.p058ui.campus.SelectSchoolAct;
import com.p051p1.mobile.putong.core.p058ui.secretcrush.ScrollIndexView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;
import p151v.VList;
import p151v.VProgressBar;

/* JADX INFO: loaded from: classes9.dex */
public class bme0 implements iam<vle0> {

    /* JADX INFO: renamed from: a */
    public VFrame f77288a;

    /* JADX INFO: renamed from: b */
    public VProgressBar f77289b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f77290c;

    /* JADX INFO: renamed from: d */
    public VList f77291d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f77292e;

    /* JADX INFO: renamed from: f */
    public ScrollIndexView f77293f;

    /* JADX INFO: renamed from: g */
    public SelectSchoolAct f77294g;

    /* JADX INFO: renamed from: h */
    public kbe0 f77295h;

    /* JADX INFO: renamed from: i */
    public int f77296i = 1;

    /* JADX INFO: renamed from: j */
    public SearchView f77297j;

    /* JADX INFO: renamed from: k */
    public vle0 f77298k;

    /* JADX INFO: renamed from: l */
    public View f77299l;

    /* JADX INFO: renamed from: m */
    public View f77300m;

    /* JADX INFO: renamed from: l.bme0$a */
    public class C16042a implements SearchView.InterfaceC0151m {
        public C16042a() {
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0151m
        /* JADX INFO: renamed from: a */
        public boolean mo601a(String str) {
            bme0.this.f77298k.m201613s0(str);
            bnl0.m105524M(bme0.this.f77299l, (str == null || str.isEmpty()) ? false : true);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0151m
        /* JADX INFO: renamed from: b */
        public boolean mo602b(String str) {
            return false;
        }
    }

    public bme0(SelectSchoolAct selectSchoolAct) {
        this.f77294g = selectSchoolAct;
    }

    /* JADX INFO: renamed from: j */
    private TextView m105037j() {
        try {
            return (TextView) Act.TOOLBAR_TITLE_VIEW_FILED.get(this.f77294g.toolbar());
        } catch (IllegalAccessException e) {
            CrashHelper.m82479c(e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m105038q(String str) {
        if (str.equals(ScrollIndexView.f36606l)) {
            this.f77296i = 0;
            this.f77291d.setSelectionFromTop(0, 0);
            return;
        }
        int positionForSection = this.f77295h.getPositionForSection(jyb.m147477H(e1b.f91577i, str));
        if (positionForSection == 0) {
            positionForSection = this.f77296i;
        }
        this.f77296i = positionForSection;
        this.f77291d.setSelectionFromTop(positionForSection, -qa00.m175859d(8.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m105039s(final String str) {
        l51.m152887G(new Runnable() { // from class: l.ame0
            @Override // java.lang.Runnable
            public final void run() {
                this.f72219a.m105038q(str);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    private void m105040x(boolean z) {
        TextView textViewM105037j = m105037j();
        if (z) {
            if (NullChecker.m82486a(textViewM105037j)) {
                textViewM105037j.setVisibility(0);
            }
            this.f77297j.setQuery("", true);
            this.f77295h.m149030y(false);
            this.f77291d.setSelection(0);
            this.f77300m.setEnabled(false);
            return;
        }
        this.f77300m.setEnabled(true);
        ode odeVar = new ode(this.f77294g);
        odeVar.m167289c(this.f77294g.getResources().getColor(c9c0.f80362O1));
        odeVar.m167291e(1.0f);
        this.f77297j.requestFocus();
        this.f77299l.setVisibility(8);
        this.f77298k.m201613s0("");
        if (NullChecker.m82486a(textViewM105037j)) {
            textViewM105037j.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m105041A(School school, boolean z) {
        Intent intent = new Intent();
        intent.putExtra("selected_school", school);
        intent.putExtra("highConfidenceError", z);
        this.f77294g.setResult(-1, intent);
        this.f77294g.m68056e2();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f77294g;
    }

    /* JADX INFO: renamed from: f */
    public View m105042f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cme0.m111168b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(vle0 vle0Var) {
        this.f77298k = vle0Var;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m105042f(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public void m105044k() {
        if (this.f77290c.getVisibility() == 4) {
            this.f77290c.setVisibility(0);
            this.f77289b.m224401b();
            this.f77289b.setVisibility(4);
        }
        if (NullChecker.m82486a(this.f77297j) && !this.f77297j.isIconified()) {
            this.f77298k.m201613s0("");
        } else {
            this.f77295h.m149030y(false);
            this.f77291d.setSelection(0);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m105045l(Menu menu) {
        SelectSchoolAct selectSchoolAct = this.f77294g;
        bkj0<SearchView, View, View> bkj0VarInitSearchMenu = selectSchoolAct.initSearchMenu(menu, selectSchoolAct.getMenuInflater());
        SearchView searchView = bkj0VarInitSearchMenu.f77081a;
        this.f77297j = searchView;
        this.f77299l = bkj0VarInitSearchMenu.f77082b;
        this.f77300m = bkj0VarInitSearchMenu.f77083c;
        searchView.setQueryHint(this.f77294g.getString(R$string.f19103aq));
        this.f77297j.setOnSearchClickListener(new View.OnClickListener() { // from class: l.xle0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194952a.m105047n(view);
            }
        });
        this.f77297j.setOnQueryTextListener(new C16042a());
        this.f77297j.setOnCloseListener(new SearchView.InterfaceC0150l() { // from class: l.yle0
            @Override // androidx.appcompat.widget.SearchView.InterfaceC0150l
            public final boolean onClose() {
                return this.f200550a.m105048p();
            }
        });
        this.f77297j.setIconified(false);
    }

    /* JADX INFO: renamed from: m */
    public boolean m105046m() {
        return this.f77297j.isIconified();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m105047n(View view) {
        m105040x(false);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ boolean m105048p() {
        m105040x(true);
        return false;
    }

    /* JADX INFO: renamed from: r */
    public void m105049r() {
        SelectSchoolAct selectSchoolAct = this.f77294g;
        selectSchoolAct.setTitle(selectSchoolAct.getString(R$string.f19849z0));
        kbe0 kbe0Var = new kbe0(this.f77294g);
        this.f77295h = kbe0Var;
        this.f77291d.setAdapter((ListAdapter) kbe0Var);
        this.f77293f.setDialog(this.f77292e);
        this.f77293f.setOnTouchingLetterChangedListener(new ScrollIndexView.InterfaceC9005a() { // from class: l.zle0
            @Override // com.p051p1.mobile.putong.core.p058ui.secretcrush.ScrollIndexView.InterfaceC9005a
            /* JADX INFO: renamed from: a */
            public final void mo56130a(String str) {
                this.f204915a.m105039s(str);
            }
        });
        this.f77290c.setVisibility(4);
        this.f77289b.setVisibility(0);
    }

    /* JADX INFO: renamed from: u */
    public void m105050u() {
        this.f77291d.setSelection(0);
    }

    /* JADX INFO: renamed from: v */
    public boolean m105051v() {
        if (this.f77297j.isIconified()) {
            return false;
        }
        this.f77297j.setIconified(true);
        return true;
    }

    /* JADX INFO: renamed from: w */
    public void m105052w(School school, boolean z) {
        if (!this.f77294g.getIntent().getBooleanExtra("needHighConfidenceJudge", false) || school.f21240id.equals(this.f77294g.getIntent().getStringExtra("preSelectedSchoolId"))) {
            m105041A(school, false);
        } else {
            this.f77298k.m201614t0(school);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m105053y() {
        this.f77295h.m149030y(false);
    }

    /* JADX INFO: renamed from: z */
    public void m105054z() {
        this.f77295h.m149030y(true);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
