package p006l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.settings.MomentMutedAct;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.a;
import l.e30;
import l.lsi0;
import l.mkd0;
import l.roj0;
import l.vwb;
import l.yij0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class oh00 extends a<String> {

    /* JADX INFO: renamed from: c */
    public MomentMutedAct f18232c;

    /* JADX INFO: renamed from: d */
    public List<String> f18233d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public Map<String, User> f18234e = new HashMap();

    public oh00(MomentMutedAct momentMutedAct) {
        this.f18232c = momentMutedAct;
    }

    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void m20680j(View view, final String str, int i, int i2) {
        final View view2 = (VDraweeView) view.findViewById(u4c0.f22696Na);
        final TextView textView = (TextView) view.findViewById(u4c0.f22609I8);
        View viewFindViewById = view.findViewById(u4c0.f23048ic);
        vwb.z(vwb.f0(new View[]{view2, textView}), new e30() { // from class: l.ih00
            public final void call(Object obj) {
                this.f14439a.m20672D(str, (View) obj);
            }
        });
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.jh00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.f15149a.m20673E(str, view3);
            }
        });
        c(this.f18232c, CoreModule.f1534c.f3628e0.m21373Ka(str)).subscribe(mkd0.G(new e30() { // from class: l.kh00
            public final void call(Object obj) {
                this.f15817a.m20674F(view2, textView, str, (User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m20671C(String str, View view) {
        this.f18232c.startActivity(CoreModule.m1853N().argsToMomentsInProfileAct(this.f18232c, str, "from_MomentMutedAct"));
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m20672D(final String str, View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.lh00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f16411a.m20671C(str, view2);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m20673E(String str, View view) {
        m20677I(str);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m20674F(VDraweeView vDraweeView, TextView textView, String str, User user) {
        qib0.f19782G.m12754Q0(vDraweeView, user.fp().profileSmall());
        String strM21524y7 = CoreModule.f1534c.f3628e0.m21524y7(((DbObject) user).id);
        if (TextUtils.isEmpty(strM21524y7)) {
            textView.setText(user.name);
        } else {
            textView.setText(strM21524y7);
        }
        this.f18234e.put(str, user);
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
    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m20675G(String str, roj0 roj0Var) {
        this.f18232c.progressDismiss();
        this.f18233d.remove(str);
        this.f18232c.f5604d.m24695f(this.f18233d);
        lsi0.q(this.f18232c.getString(R$string.f2054Qi), this.f18232c.getResources().getDrawable(x2c0.f26144Oe));
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m20676H(Throwable th) {
        this.f18232c.progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: I */
    public final void m20677I(String str) {
        m20678J(str);
    }

    /* JADX INFO: renamed from: J */
    public final void m20678J(final String str) {
        this.f18232c.progress(R$string.f1831J5, true);
        CoreModule.m1853N().coreMomentMutedUsers().c(str, false).subscribe(mkd0.H(new e30() { // from class: l.mh00
            public final void call(Object obj) {
                this.f16976a.m20675G(str, (roj0) obj);
            }
        }, new e30() { // from class: l.nh00
            public final void call(Object obj) {
                this.f17682a.m20676H((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public void m20679K(List<String> list) {
        this.f18233d = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: m */
    public View m20681m(ViewGroup viewGroup, int i) {
        return this.f18232c.inflater().inflate(f6c0.f11999Te, viewGroup, false);
    }

    /* JADX INFO: renamed from: p */
    public List<String> m20682p() {
        return this.f18233d;
    }
}
