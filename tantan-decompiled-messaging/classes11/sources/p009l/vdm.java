package p009l;

import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class vdm<T, V extends View> extends sdm<V> {

    /* JADX INFO: renamed from: b */
    public V f21542b;

    /* JADX INFO: renamed from: d */
    public e30<V> f21544d;

    /* JADX INFO: renamed from: c */
    public HashMap<T, V> f21543c = new HashMap<>();

    /* JADX INFO: renamed from: e */
    public boolean f21545e = false;

    @Override // p009l.sdm
    /* JADX INFO: renamed from: c */
    public V mo22103c(ViewGroup viewGroup, int i) {
        final V v = (V) mo13035g(viewGroup, i);
        this.f21543c.put(mo13036h(i), v);
        v.setOnClickListener(new View.OnClickListener() { // from class: l.udm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21085a.m23361i(v, view);
            }
        });
        return v;
    }

    /* JADX INFO: renamed from: g */
    public abstract V mo13035g(ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: h */
    public abstract T mo13036h(int i);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m23361i(View view, View view2) {
        Object obj;
        if (NullChecker.a(this.f21542b)) {
            V v = this.f21542b;
            if (view != v) {
                v.setSelected(false);
                view.setSelected(true);
                this.f21542b = view;
            } else {
                if (this.f21545e) {
                    return;
                }
                view.setSelected(false);
                this.f21542b = null;
            }
        } else {
            view.setSelected(true);
            this.f21542b = view;
        }
        if (NullChecker.a(this.f21544d)) {
            e30<V> e30Var = this.f21544d;
            if (!view.isSelected()) {
                obj = view;
                obj = (V) null;
            }
            obj = view;
            e30Var.call(obj);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m23362j() {
        this.f21545e = true;
    }

    /* JADX INFO: renamed from: k */
    public void m23363k(e30<V> e30Var) {
        this.f21544d = e30Var;
    }

    /* JADX INFO: renamed from: l */
    public void m23364l(Object obj) {
        V v = this.f21543c.get(obj);
        if (v == null) {
            return;
        }
        if (NullChecker.a(this.f21542b)) {
            this.f21542b.setSelected(false);
        }
        v.setSelected(true);
        this.f21542b = v;
    }
}
