package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.School;
import com.p046p1.mobile.putong.core.p053ui.campus.SelectSchoolAct;
import com.p046p1.mobile.putong.core.p053ui.secretcrush.ScrollIndexView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;
import p147v.VList;
import p147v.VProgressBar;

/* JADX INFO: loaded from: classes10.dex */
public class wde0 implements s7m<qde0> {

    /* JADX INFO: renamed from: a */
    public VFrame f185783a;

    /* JADX INFO: renamed from: b */
    public VProgressBar f185784b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f185785c;

    /* JADX INFO: renamed from: d */
    public VList f185786d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f185787e;

    /* JADX INFO: renamed from: f */
    public ScrollIndexView f185788f;

    /* JADX INFO: renamed from: g */
    public SelectSchoolAct f185789g;

    /* JADX INFO: renamed from: h */
    public g3e0 f185790h;

    /* JADX INFO: renamed from: i */
    public int f185791i = 1;

    /* JADX INFO: renamed from: j */
    public SearchView f185792j;

    /* JADX INFO: renamed from: k */
    public qde0 f185793k;

    /* JADX INFO: renamed from: l */
    public View f185794l;

    /* JADX INFO: renamed from: m */
    public View f185795m;

    /* JADX INFO: renamed from: l.wde0$a */
    public class C20854a implements SearchView.InterfaceC0150m {
        public C20854a() {
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0150m
        /* JADX INFO: renamed from: a */
        public boolean mo600a(String str) {
            wde0.this.f185793k.m174028s0(str);
            xdl0.m208344M(wde0.this.f185794l, (str == null || str.isEmpty()) ? false : true);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0150m
        /* JADX INFO: renamed from: b */
        public boolean mo601b(String str) {
            return false;
        }
    }

    public wde0(SelectSchoolAct selectSchoolAct) {
        this.f185789g = selectSchoolAct;
    }

    /* JADX INFO: renamed from: j */
    private TextView m202719j() {
        try {
            return (TextView) Act.TOOLBAR_TITLE_VIEW_FILED.get(this.f185789g.toolbar());
        } catch (IllegalAccessException e) {
            CrashHelper.m81296c(e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m202720q(String str) {
        if (str.equals(ScrollIndexView.f35758l)) {
            this.f185791i = 0;
            this.f185786d.setSelectionFromTop(0, 0);
            return;
        }
        int positionForSection = this.f185790h.getPositionForSection(vwb.m200294H(rza.f161615i, str));
        if (positionForSection == 0) {
            positionForSection = this.f185791i;
        }
        this.f185791i = positionForSection;
        this.f185786d.setSelectionFromTop(positionForSection, -t100.m186890d(8.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m202721s(final String str) {
        e51.m114742G(new Runnable() { // from class: l.vde0
            @Override // java.lang.Runnable
            public final void run() {
                this.f181079a.m202720q(str);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    private void m202722x(boolean z) {
        TextView textViewM202719j = m202719j();
        if (z) {
            if (NullChecker.m81303a(textViewM202719j)) {
                textViewM202719j.setVisibility(0);
            }
            this.f185792j.setQuery("", true);
            this.f185790h.m124260y(false);
            this.f185786d.setSelection(0);
            this.f185795m.setEnabled(false);
            return;
        }
        this.f185795m.setEnabled(true);
        kce kceVar = new kce(this.f185789g);
        kceVar.m145374c(this.f185789g.getResources().getColor(w0c0.f183790N1));
        kceVar.m145376e(1.0f);
        this.f185792j.requestFocus();
        this.f185794l.setVisibility(8);
        this.f185793k.m174028s0("");
        if (NullChecker.m81303a(textViewM202719j)) {
            textViewM202719j.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m202723A(School school, boolean z) {
        Intent intent = new Intent();
        intent.putExtra("selected_school", school);
        intent.putExtra("highConfidenceError", z);
        this.f185789g.setResult(-1, intent);
        this.f185789g.m66873d2();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f185789g;
    }

    /* JADX INFO: renamed from: f */
    public View m202724f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xde0.m208314b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(qde0 qde0Var) {
        this.f185793k = qde0Var;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m202724f(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public void m202726k() {
        if (this.f185785c.getVisibility() == 4) {
            this.f185785c.setVisibility(0);
            this.f185784b.m223155b();
            this.f185784b.setVisibility(4);
        }
        if (NullChecker.m81303a(this.f185792j) && !this.f185792j.isIconified()) {
            this.f185793k.m174028s0("");
        } else {
            this.f185790h.m124260y(false);
            this.f185786d.setSelection(0);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m202727l(Menu menu) {
        SelectSchoolAct selectSchoolAct = this.f185789g;
        xaj0<SearchView, View, View> xaj0VarInitSearchMenu = selectSchoolAct.initSearchMenu(menu, selectSchoolAct.getMenuInflater());
        SearchView searchView = xaj0VarInitSearchMenu.f191751a;
        this.f185792j = searchView;
        this.f185794l = xaj0VarInitSearchMenu.f191752b;
        this.f185795m = xaj0VarInitSearchMenu.f191753c;
        searchView.setQueryHint(this.f185789g.getString(R$string.f17742Fp));
        this.f185792j.setOnSearchClickListener(new View.OnClickListener() { // from class: l.sde0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163836a.m202729n(view);
            }
        });
        this.f185792j.setOnQueryTextListener(new C20854a());
        this.f185792j.setOnCloseListener(new SearchView.InterfaceC0149l() { // from class: l.tde0
            @Override // androidx.appcompat.widget.SearchView.InterfaceC0149l
            public final boolean onClose() {
                return this.f169546a.m202730p();
            }
        });
        this.f185792j.setIconified(false);
    }

    /* JADX INFO: renamed from: m */
    public boolean m202728m() {
        return this.f185792j.isIconified();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m202729n(View view) {
        m202722x(false);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ boolean m202730p() {
        m202722x(true);
        return false;
    }

    /* JADX INFO: renamed from: r */
    public void m202731r() {
        SelectSchoolAct selectSchoolAct = this.f185789g;
        selectSchoolAct.setTitle(selectSchoolAct.getString(R$string.f19109z0));
        g3e0 g3e0Var = new g3e0(this.f185789g);
        this.f185790h = g3e0Var;
        this.f185786d.setAdapter((ListAdapter) g3e0Var);
        this.f185788f.setDialog(this.f185787e);
        this.f185788f.setOnTouchingLetterChangedListener(new ScrollIndexView.InterfaceC8842a() { // from class: l.ude0
            @Override // com.p046p1.mobile.putong.core.p053ui.secretcrush.ScrollIndexView.InterfaceC8842a
            /* JADX INFO: renamed from: a */
            public final void mo54947a(String str) {
                this.f175914a.m202721s(str);
            }
        });
        this.f185785c.setVisibility(4);
        this.f185784b.setVisibility(0);
    }

    /* JADX INFO: renamed from: u */
    public void m202732u() {
        this.f185786d.setSelection(0);
    }

    /* JADX INFO: renamed from: v */
    public boolean m202733v() {
        if (this.f185792j.isIconified()) {
            return false;
        }
        this.f185792j.setIconified(true);
        return true;
    }

    /* JADX INFO: renamed from: w */
    public void m202734w(School school, boolean z) {
        if (!this.f185789g.getIntent().getBooleanExtra("needHighConfidenceJudge", false) || school.f20498id.equals(this.f185789g.getIntent().getStringExtra("preSelectedSchoolId"))) {
            m202723A(school, false);
        } else {
            this.f185793k.m174029t0(school);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m202735y() {
        this.f185790h.m124260y(false);
    }

    /* JADX INFO: renamed from: z */
    public void m202736z() {
        this.f185790h.m124260y(true);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
