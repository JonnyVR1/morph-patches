package p006l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.settings.MomentMutedAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.s7m;
import l.t100;
import l.uh00;
import l.xdl0;
import v.VLinear;
import v.VList;
import v.VProgressBar;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class th00 implements s7m<rh00> {

    /* JADX INFO: renamed from: a */
    public VLinear f22102a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f22103b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f22104c;

    /* JADX INFO: renamed from: d */
    public VText f22105d;

    /* JADX INFO: renamed from: e */
    public VList f22106e;

    /* JADX INFO: renamed from: f */
    public MomentMutedAct f22107f;

    /* JADX INFO: renamed from: g */
    public oh00 f22108g;

    public th00(MomentMutedAct momentMutedAct) {
        this.f22107f = momentMutedAct;
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
    /* JADX INFO: renamed from: d */
    private void m24690d() {
        this.f22105d.setText(this.f22107f.getString(R$string.f2114Si));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m24691e(View view) {
        act().onBackPressed();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m24692C0() {
        return this.f22107f;
    }

    @Nullable
    public Act act() {
        return this.f22107f;
    }

    /* JADX INFO: renamed from: b */
    public View m24693b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uh00.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f */
    public void m24695f(List<String> list) {
        this.f22104c.setVisibility(4);
        xdl0.M0(this.f22106e, NullChecker.a(list) && list.size() > 0);
        xdl0.M0(this.f22105d, !NullChecker.a(list) || list.size() == 0);
        this.f22108g.m20679K(list);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m24693b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m24697r() {
        this.f22103b.setTitle(act().getString(R$string.f2119Sn));
        this.f22103b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.sh00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21302a.m24691e(view);
            }
        });
        this.f22104c.setVisibility(0);
        this.f22106e.setVisibility(4);
        this.f22105d.setVisibility(4);
        this.f22108g = new oh00(this.f22107f);
        View view = new View(this.f22107f);
        view.setClickable(false);
        view.setEnabled(false);
        view.setMinimumHeight(t100.d(2.0f));
        this.f22106e.addHeaderView(view);
        this.f22106e.setRecyclerListener(this.f22108g);
        this.f22106e.setAdapter(this.f22108g);
        m24690d();
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m24696i1(rh00 rh00Var) {
    }
}
