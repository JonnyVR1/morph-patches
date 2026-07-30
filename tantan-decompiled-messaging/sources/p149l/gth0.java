package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public abstract class gth0<T, V extends View> extends bth0<V> {

    /* JADX INFO: renamed from: b */
    public V f104298b;

    /* JADX INFO: renamed from: d */
    public e30<V> f104300d;

    /* JADX INFO: renamed from: e */
    public w9j<V, Boolean> f104301e;

    /* JADX INFO: renamed from: c */
    public HashMap<T, V> f104299c = new HashMap<>();

    /* JADX INFO: renamed from: f */
    public boolean f104302f = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.e30, l.e30<V extends android.view.View>] */
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
    public /* synthetic */ void m127945k(View view, View view2) {
        ?? r4;
        w9j<V, Boolean> w9jVar = this.f104301e;
        if (w9jVar == null || !w9jVar.call(view).booleanValue()) {
            if (NullChecker.m81303a(this.f104298b)) {
                V v2 = this.f104298b;
                if (view != v2) {
                    v2.setSelected(false);
                    view.setSelected(true);
                    this.f104298b = view;
                } else {
                    if (this.f104302f) {
                        return;
                    }
                    view.setSelected(false);
                    this.f104298b = null;
                }
            } else {
                view.setSelected(true);
                this.f104298b = view;
            }
            if (NullChecker.m81303a(this.f104300d)) {
                e30<V> e30Var = this.f104300d;
                if (!view.isSelected()) {
                    r4 = view;
                    r4 = (V) null;
                }
                r4 = view;
                e30Var.call(r4);
            }
        }
    }

    @Override // p149l.bth0
    /* JADX INFO: renamed from: c */
    public V mo103835c(ViewGroup viewGroup, int i) {
        final V v2 = (V) mo100891h(viewGroup, i);
        this.f104299c.put(mo100892j(i), v2);
        v2.setOnClickListener(new View.OnClickListener() { // from class: l.fth0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99209a.m127945k(v2, view);
            }
        });
        return v2;
    }

    /* JADX INFO: renamed from: g */
    public void m127946g() {
        if (NullChecker.m81303a(this.f104298b)) {
            this.f104298b.setSelected(false);
            this.f104298b = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract V mo100891h(ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: i */
    public V m127947i() {
        return this.f104298b;
    }

    /* JADX INFO: renamed from: j */
    public abstract T mo100892j(int i);

    /* JADX INFO: renamed from: l */
    public void m127948l() {
        this.f104302f = true;
    }

    /* JADX INFO: renamed from: m */
    public void m127949m(w9j<V, Boolean> w9jVar) {
        this.f104301e = w9jVar;
    }

    /* JADX INFO: renamed from: n */
    public void m127950n(e30<V> e30Var) {
        this.f104300d = e30Var;
    }

    /* JADX INFO: renamed from: o */
    public void m127951o(Object obj) {
        V v2 = this.f104299c.get(obj);
        if (v2 == null) {
            return;
        }
        if (NullChecker.m81303a(this.f104298b)) {
            this.f104298b.setSelected(false);
        }
        v2.setSelected(true);
        this.f104298b = v2;
    }
}
