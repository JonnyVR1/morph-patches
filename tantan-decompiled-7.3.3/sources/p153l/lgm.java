package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public abstract class lgm<T, V extends View> extends igm<V> {

    /* JADX INFO: renamed from: b */
    public V f131983b;

    /* JADX INFO: renamed from: d */
    public y20<V> f131985d;

    /* JADX INFO: renamed from: c */
    public HashMap<T, V> f131984c = new HashMap<>();

    /* JADX INFO: renamed from: e */
    public boolean f131986e = false;

    @Override // p153l.igm
    /* JADX INFO: renamed from: c */
    public V mo139946c(ViewGroup viewGroup, int i) {
        final V v2 = (V) mo154083g(viewGroup, i);
        this.f131984c.put(mo154084h(i), v2);
        v2.setOnClickListener(new View.OnClickListener() { // from class: l.kgm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f126629a.m154085i(v2, view);
            }
        });
        return v2;
    }

    /* JADX INFO: renamed from: g */
    public abstract V mo154083g(ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: h */
    public abstract T mo154084h(int i);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.y20, l.y20<V extends android.view.View>] */
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
    public final /* synthetic */ void m154085i(View view, View view2) {
        ?? r4;
        if (NullChecker.m82486a(this.f131983b)) {
            V v2 = this.f131983b;
            if (view != v2) {
                v2.setSelected(false);
                view.setSelected(true);
                this.f131983b = view;
            } else {
                if (this.f131986e) {
                    return;
                }
                view.setSelected(false);
                this.f131983b = null;
            }
        } else {
            view.setSelected(true);
            this.f131983b = view;
        }
        if (NullChecker.m82486a(this.f131985d)) {
            y20<V> y20Var = this.f131985d;
            if (!view.isSelected()) {
                r4 = view;
                r4 = (V) null;
            }
            r4 = view;
            y20Var.call(r4);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m154086j() {
        this.f131986e = true;
    }

    /* JADX INFO: renamed from: k */
    public void m154087k(y20<V> y20Var) {
        this.f131985d = y20Var;
    }

    /* JADX INFO: renamed from: l */
    public void m154088l(Object obj) {
        V v2 = this.f131984c.get(obj);
        if (v2 == null) {
            return;
        }
        if (NullChecker.m82486a(this.f131983b)) {
            this.f131983b.setSelected(false);
        }
        v2.setSelected(true);
        this.f131983b = v2;
    }
}
