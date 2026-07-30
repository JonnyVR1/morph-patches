package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public abstract class o1i0<T, V extends View> extends j1i0<V> {

    /* JADX INFO: renamed from: b */
    public V f144655b;

    /* JADX INFO: renamed from: d */
    public y20<V> f144657d;

    /* JADX INFO: renamed from: e */
    public qcj<V, Boolean> f144658e;

    /* JADX INFO: renamed from: c */
    public HashMap<T, V> f144656c = new HashMap<>();

    /* JADX INFO: renamed from: f */
    public boolean f144659f = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.y20, l.y20<V extends android.view.View>] */
    /* JADX WARN: Type inference failed for: r4v0, types: [V extends android.view.View, android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m165610k(View view, View view2) {
        ?? r4;
        qcj<V, Boolean> qcjVar = this.f144658e;
        if (qcjVar == null || !qcjVar.call(view).booleanValue()) {
            if (NullChecker.m82486a(this.f144655b)) {
                V v2 = this.f144655b;
                if (view != v2) {
                    v2.setSelected(false);
                    view.setSelected(true);
                    this.f144655b = view;
                } else {
                    if (this.f144659f) {
                        return;
                    }
                    view.setSelected(false);
                    this.f144655b = null;
                }
            } else {
                view.setSelected(true);
                this.f144655b = view;
            }
            if (NullChecker.m82486a(this.f144657d)) {
                y20<V> y20Var = this.f144657d;
                if (!view.isSelected()) {
                    r4 = view;
                    r4 = (V) null;
                }
                r4 = view;
                y20Var.call(r4);
            }
        }
    }

    @Override // p153l.j1i0
    /* JADX INFO: renamed from: c */
    public V mo143136c(ViewGroup viewGroup, int i) {
        final V v2 = (V) mo165612h(viewGroup, i);
        this.f144656c.put(mo165614j(i), v2);
        v2.setOnClickListener(new View.OnClickListener() { // from class: l.n1i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139769a.m165610k(v2, view);
            }
        });
        return v2;
    }

    /* JADX INFO: renamed from: g */
    public void m165611g() {
        if (NullChecker.m82486a(this.f144655b)) {
            this.f144655b.setSelected(false);
            this.f144655b = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract V mo165612h(ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: i */
    public V m165613i() {
        return this.f144655b;
    }

    /* JADX INFO: renamed from: j */
    public abstract T mo165614j(int i);

    /* JADX INFO: renamed from: l */
    public void m165615l() {
        this.f144659f = true;
    }

    /* JADX INFO: renamed from: m */
    public void m165616m(qcj<V, Boolean> qcjVar) {
        this.f144658e = qcjVar;
    }

    /* JADX INFO: renamed from: n */
    public void m165617n(y20<V> y20Var) {
        this.f144657d = y20Var;
    }

    /* JADX INFO: renamed from: o */
    public void m165618o(Object obj) {
        V v2 = this.f144656c.get(obj);
        if (v2 == null) {
            return;
        }
        if (NullChecker.m82486a(this.f144655b)) {
            this.f144655b.setSelected(false);
        }
        v2.setSelected(true);
        this.f144655b = v2;
    }
}
