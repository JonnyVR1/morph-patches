package p007l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p003p1.mobile.android.app.Act;
import com.p003p1.mobile.putong.core.p006ui.account.BanDetailAct;
import com.p1.mobile.putong.core.profile.R;
import l.j760;
import l.vwb;
import l.xdl0;
import l.zc2;
import l.zvf0;
import v.VButton;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class yc2 implements s7m<wc2> {

    /* JADX INFO: renamed from: a */
    public VText f5417a;

    /* JADX INFO: renamed from: b */
    public VText f5418b;

    /* JADX INFO: renamed from: c */
    public VText f5419c;

    /* JADX INFO: renamed from: d */
    public View f5420d;

    /* JADX INFO: renamed from: e */
    public VButton f5421e;

    /* JADX INFO: renamed from: f */
    public View f5422f;

    /* JADX INFO: renamed from: g */
    public BanDetailAct f5423g;

    /* JADX INFO: renamed from: h */
    public wc2 f5424h;

    public yc2(BanDetailAct banDetailAct) {
        this.f5423g = banDetailAct;
    }

    @Override // p007l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo1334C0() {
        return this.f5423g;
    }

    @Override // p007l.s7m
    @Nullable
    public Act act() {
        return this.f5423g;
    }

    /* JADX INFO: renamed from: b */
    public View m11920b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zc2.b(this, layoutInflater, viewGroup);
    }

    @Override // p007l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo1337i1(wc2 wc2Var) {
        this.f5424h = wc2Var;
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
    public void m11922d() {
        this.f5424h.m11333i0(true);
        xdl0.E0(this.f5421e, new View.OnClickListener() { // from class: l.xc2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5284a.m11923e(view);
            }
        });
        this.f5418b.setText("1、" + this.f5423g.getString(R.string.w) + "\n2、" + this.f5423g.getString(R.string.x) + "\n3、" + this.f5423g.getString(R.string.y) + "\n4、" + this.f5423g.getString(R.string.z) + "\n5、" + this.f5423g.getString(R.string.A) + "\n6、" + this.f5423g.getString(R.string.B) + "\n7、" + this.f5423g.getString(R.string.C) + "\n8、" + this.f5423g.getString(R.string.D) + "\n");
        this.f5419c.setText(this.f5423g.getString(R.string.E));
        VText vText = this.f5419c;
        vText.setTypeface(vText.getTypeface(), 1);
        VText vText2 = this.f5417a;
        vText2.setTypeface(vText2.getTypeface(), 1);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m11923e(View view) {
        zvf0.u("e_ban_detail", this.f5423g.pageId(), new j760[]{vwb.Y("ban_detail_button", "appeal")});
        this.f5424h.m11333i0(false);
    }

    /* JADX INFO: renamed from: f */
    public void m11924f() {
        xdl0.M(this.f5420d, true);
        xdl0.M(this.f5421e, true);
        xdl0.M(this.f5422f, true);
    }

    @Override // p007l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m11920b(layoutInflater, viewGroup);
    }

    @Override // p007l.s7m
    public void destroy() {
    }
}
