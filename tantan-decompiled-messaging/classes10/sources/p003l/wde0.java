package p003l;

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
import com.p000p1.mobile.putong.core.data.School;
import com.p000p1.mobile.putong.core.p001ui.campus.SelectSchoolAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.ui.secretcrush.ScrollIndexView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.e51;
import l.kce;
import l.rza;
import l.s7m;
import l.t100;
import l.vwb;
import l.w0c0;
import l.xaj0;
import l.xdl0;
import v.VFrame;
import v.VList;
import v.VProgressBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wde0 implements s7m<qde0> {

    /* JADX INFO: renamed from: a */
    public VFrame f8160a;

    /* JADX INFO: renamed from: b */
    public VProgressBar f8161b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f8162c;

    /* JADX INFO: renamed from: d */
    public VList f8163d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f8164e;

    /* JADX INFO: renamed from: f */
    public ScrollIndexView f8165f;

    /* JADX INFO: renamed from: g */
    public SelectSchoolAct f8166g;

    /* JADX INFO: renamed from: h */
    public g3e0 f8167h;

    /* JADX INFO: renamed from: i */
    public int f8168i = 1;

    /* JADX INFO: renamed from: j */
    public SearchView f8169j;

    /* JADX INFO: renamed from: k */
    public qde0 f8170k;

    /* JADX INFO: renamed from: l */
    public View f8171l;

    /* JADX INFO: renamed from: m */
    public View f8172m;

    /* JADX INFO: renamed from: l.wde0$a */
    public class C3461a implements SearchView.m {
        public C3461a() {
        }

        /* JADX INFO: renamed from: a */
        public boolean m10493a(String str) {
            wde0.this.f8170k.m8971s0(str);
            xdl0.M(wde0.this.f8171l, (str == null || str.isEmpty()) ? false : true);
            return true;
        }

        /* JADX INFO: renamed from: b */
        public boolean m10494b(String str) {
            return false;
        }
    }

    public wde0(SelectSchoolAct selectSchoolAct) {
        this.f8166g = selectSchoolAct;
    }

    /* JADX INFO: renamed from: j */
    private TextView m10473j() {
        try {
            return (TextView) Act.TOOLBAR_TITLE_VIEW_FILED.get(this.f8166g.toolbar());
        } catch (IllegalAccessException e) {
            CrashHelper.c(e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m10474q(String str) {
        if (str.equals(ScrollIndexView.l)) {
            this.f8168i = 0;
            this.f8163d.setSelectionFromTop(0, 0);
            return;
        }
        int positionForSection = this.f8167h.getPositionForSection(vwb.H(rza.i, str));
        if (positionForSection == 0) {
            positionForSection = this.f8168i;
        }
        this.f8168i = positionForSection;
        this.f8163d.setSelectionFromTop(positionForSection, -t100.d(8.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m10475s(final String str) {
        e51.G(new Runnable() { // from class: l.vde0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7972a.m10474q(str);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    private void m10476x(boolean z) {
        TextView textViewM10473j = m10473j();
        if (z) {
            if (NullChecker.a(textViewM10473j)) {
                textViewM10473j.setVisibility(0);
            }
            this.f8169j.setQuery("", true);
            this.f8167h.m6545y(false);
            this.f8163d.setSelection(0);
            this.f8172m.setEnabled(false);
            return;
        }
        this.f8172m.setEnabled(true);
        kce kceVar = new kce(this.f8166g);
        kceVar.c(this.f8166g.getResources().getColor(w0c0.N1));
        kceVar.e(1.0f);
        this.f8169j.requestFocus();
        this.f8171l.setVisibility(8);
        this.f8170k.m8971s0("");
        if (NullChecker.a(textViewM10473j)) {
            textViewM10473j.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m10477A(School school, boolean z) {
        Intent intent = new Intent();
        intent.putExtra("selected_school", school);
        intent.putExtra("highConfidenceError", z);
        this.f8166g.setResult(-1, intent);
        this.f8166g.finish();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m10478C0() {
        return this.f8166g;
    }

    /* JADX INFO: renamed from: f */
    public View m10479f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xde0.m10787b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m10481i1(qde0 qde0Var) {
        this.f8170k = qde0Var;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m10479f(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public void m10482k() {
        if (this.f8162c.getVisibility() == 4) {
            this.f8162c.setVisibility(0);
            this.f8161b.b();
            this.f8161b.setVisibility(4);
        }
        if (NullChecker.a(this.f8169j) && !this.f8169j.isIconified()) {
            this.f8170k.m8971s0("");
        } else {
            this.f8167h.m6545y(false);
            this.f8163d.setSelection(0);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: l */
    public void m10483l(Menu menu) {
        SelectSchoolAct selectSchoolAct = this.f8166g;
        xaj0 xaj0VarInitSearchMenu = selectSchoolAct.initSearchMenu(menu, selectSchoolAct.getMenuInflater());
        SearchView searchView = (SearchView) xaj0VarInitSearchMenu.a;
        this.f8169j = searchView;
        this.f8171l = (View) xaj0VarInitSearchMenu.b;
        this.f8172m = (View) xaj0VarInitSearchMenu.c;
        searchView.setQueryHint(this.f8166g.getString(R.string.Fp));
        this.f8169j.setOnSearchClickListener(new View.OnClickListener() { // from class: l.sde0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7361a.m10485n(view);
            }
        });
        this.f8169j.setOnQueryTextListener(new C3461a());
        this.f8169j.setOnCloseListener(new SearchView.l() { // from class: l.tde0
            public final boolean onClose() {
                return this.f7559a.m10486p();
            }
        });
        this.f8169j.setIconified(false);
    }

    /* JADX INFO: renamed from: m */
    public boolean m10484m() {
        return this.f8169j.isIconified();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m10485n(View view) {
        m10476x(false);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ boolean m10486p() {
        m10476x(true);
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.ListAdapter, l.g3e0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: r */
    public void m10487r() {
        PutongAct putongAct = this.f8166g;
        putongAct.setTitle(putongAct.getString(R.string.z0));
        ?? g3e0Var = new g3e0(this.f8166g);
        this.f8167h = g3e0Var;
        this.f8163d.setAdapter((ListAdapter) g3e0Var);
        this.f8165f.setDialog(this.f8164e);
        this.f8165f.setOnTouchingLetterChangedListener(new ScrollIndexView.a() { // from class: l.ude0
            /* JADX INFO: renamed from: a */
            public final void m9715a(String str) {
                this.f7738a.m10475s(str);
            }
        });
        this.f8162c.setVisibility(4);
        this.f8161b.setVisibility(0);
    }

    /* JADX INFO: renamed from: u */
    public void m10488u() {
        this.f8163d.setSelection(0);
    }

    /* JADX INFO: renamed from: v */
    public boolean m10489v() {
        if (this.f8169j.isIconified()) {
            return false;
        }
        this.f8169j.setIconified(true);
        return true;
    }

    /* JADX INFO: renamed from: w */
    public void m10490w(School school, boolean z) {
        if (!this.f8166g.getIntent().getBooleanExtra("needHighConfidenceJudge", false) || school.f160id.equals(this.f8166g.getIntent().getStringExtra("preSelectedSchoolId"))) {
            m10477A(school, false);
        } else {
            this.f8170k.m8972t0(school);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m10491y() {
        this.f8167h.m6545y(false);
    }

    /* JADX INFO: renamed from: z */
    public void m10492z() {
        this.f8167h.m6545y(true);
    }

    public void destroy() {
    }
}
