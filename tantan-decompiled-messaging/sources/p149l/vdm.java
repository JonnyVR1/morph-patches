package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public abstract class vdm<T, V extends View> extends sdm<V> {

    /* JADX INFO: renamed from: b */
    public V f181095b;

    /* JADX INFO: renamed from: d */
    public e30<V> f181097d;

    /* JADX INFO: renamed from: c */
    public HashMap<T, V> f181096c = new HashMap<>();

    /* JADX INFO: renamed from: e */
    public boolean f181098e = false;

    @Override // p149l.sdm
    /* JADX INFO: renamed from: c */
    public V mo183507c(ViewGroup viewGroup, int i) {
        final V v2 = (V) mo110559g(viewGroup, i);
        this.f181096c.put(mo110560h(i), v2);
        v2.setOnClickListener(new View.OnClickListener() { // from class: l.udm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f175931a.m198007i(v2, view);
            }
        });
        return v2;
    }

    /* JADX INFO: renamed from: g */
    public abstract V mo110559g(ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: h */
    public abstract T mo110560h(int i);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.e30, l.e30<V extends android.view.View>] */
    /* JADX WARN: Type inference failed for: r4v0, types: [V extends android.view.View, android.view.View] */
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
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m198007i(View view, View view2) {
        ?? r4;
        if (NullChecker.m81303a(this.f181095b)) {
            V v2 = this.f181095b;
            if (view != v2) {
                v2.setSelected(false);
                view.setSelected(true);
                this.f181095b = view;
            } else {
                if (this.f181098e) {
                    return;
                }
                view.setSelected(false);
                this.f181095b = null;
            }
        } else {
            view.setSelected(true);
            this.f181095b = view;
        }
        if (NullChecker.m81303a(this.f181097d)) {
            e30<V> e30Var = this.f181097d;
            if (!view.isSelected()) {
                r4 = view;
                r4 = (V) null;
            }
            r4 = view;
            e30Var.call(r4);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m198008j() {
        this.f181098e = true;
    }

    /* JADX INFO: renamed from: k */
    public void m198009k(e30<V> e30Var) {
        this.f181097d = e30Var;
    }

    /* JADX INFO: renamed from: l */
    public void m198010l(Object obj) {
        V v2 = this.f181096c.get(obj);
        if (v2 == null) {
            return;
        }
        if (NullChecker.m81303a(this.f181095b)) {
            this.f181095b.setSelected(false);
        }
        v2.setSelected(true);
        this.f181095b = v2;
    }
}
