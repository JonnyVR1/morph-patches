package p006l;

import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.e30;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public abstract class gth0<T, V extends View> extends bth0<V> {

    /* JADX INFO: renamed from: b */
    public V f13492b;

    /* JADX INFO: renamed from: d */
    public e30<V> f13494d;

    /* JADX INFO: renamed from: e */
    public w9j<V, Boolean> f13495e;

    /* JADX INFO: renamed from: c */
    public HashMap<T, V> f13493c = new HashMap<>();

    /* JADX INFO: renamed from: f */
    public boolean f13496f = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m15983k(View view, View view2) {
        Object obj;
        w9j<V, Boolean> w9jVar = this.f13495e;
        if (w9jVar == null || !((Boolean) w9jVar.call(view)).booleanValue()) {
            if (NullChecker.a(this.f13492b)) {
                V v = this.f13492b;
                if (view != v) {
                    v.setSelected(false);
                    view.setSelected(true);
                    this.f13492b = view;
                } else {
                    if (this.f13496f) {
                        return;
                    }
                    view.setSelected(false);
                    this.f13492b = null;
                }
            } else {
                view.setSelected(true);
                this.f13492b = view;
            }
            if (NullChecker.a(this.f13494d)) {
                e30<V> e30Var = this.f13494d;
                if (!view.isSelected()) {
                    obj = view;
                    obj = (V) null;
                }
                obj = view;
                e30Var.call(obj);
            }
        }
    }

    @Override // p006l.bth0
    /* JADX INFO: renamed from: c */
    public V mo12898c(ViewGroup viewGroup, int i) {
        final V v = (V) mo12579h(viewGroup, i);
        this.f13493c.put(mo12580j(i), v);
        v.setOnClickListener(new View.OnClickListener() { // from class: l.fth0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12900a.m15983k(v, view);
            }
        });
        return v;
    }

    /* JADX INFO: renamed from: g */
    public void m15984g() {
        if (NullChecker.a(this.f13492b)) {
            this.f13492b.setSelected(false);
            this.f13492b = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract V mo12579h(ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: i */
    public V m15985i() {
        return this.f13492b;
    }

    /* JADX INFO: renamed from: j */
    public abstract T mo12580j(int i);

    /* JADX INFO: renamed from: l */
    public void m15986l() {
        this.f13496f = true;
    }

    /* JADX INFO: renamed from: m */
    public void m15987m(w9j<V, Boolean> w9jVar) {
        this.f13495e = w9jVar;
    }

    /* JADX INFO: renamed from: n */
    public void m15988n(e30<V> e30Var) {
        this.f13494d = e30Var;
    }

    /* JADX INFO: renamed from: o */
    public void m15989o(Object obj) {
        V v = this.f13493c.get(obj);
        if (v == null) {
            return;
        }
        if (NullChecker.a(this.f13492b)) {
            this.f13492b.setSelected(false);
        }
        v.setSelected(true);
        this.f13492b = v;
    }
}
