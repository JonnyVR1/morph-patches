package p006l;

import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public abstract class eth0<T, V extends View> extends bth0<V> {

    /* JADX INFO: renamed from: b */
    public HashMap<T, V> f11445b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public List<V> f11446c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public InterfaceC0689a f11447d;

    /* JADX INFO: renamed from: l.eth0$a */
    public interface InterfaceC0689a {
        /* JADX INFO: renamed from: a */
        boolean mo14885a(View view);

        /* JADX INFO: renamed from: b */
        void mo14886b();
    }

    @Override // p006l.bth0
    /* JADX INFO: renamed from: c */
    public V mo12898c(ViewGroup viewGroup, int i) {
        final V v = (V) mo12840g(viewGroup, i);
        this.f11445b.put(mo12841i(i), v);
        v.setOnClickListener(new View.OnClickListener() { // from class: l.dth0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10562a.m14882k(v, view);
            }
        });
        return v;
    }

    /* JADX INFO: renamed from: g */
    public abstract V mo12840g(ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: h */
    public List<V> m14880h() {
        return this.f11446c;
    }

    /* JADX INFO: renamed from: i */
    public abstract T mo12841i(int i);

    /* JADX INFO: renamed from: j */
    public HashMap<T, V> m14881j() {
        return this.f11445b;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m14882k(View view, View view2) {
        if (NullChecker.a(this.f11447d) && this.f11447d.mo14885a(view2)) {
            this.f11447d.mo14886b();
            return;
        }
        view.setSelected(!view.isSelected());
        boolean zIsSelected = view.isSelected();
        List<V> list = this.f11446c;
        if (zIsSelected) {
            list.add(view);
        } else {
            list.remove(view);
        }
        if (NullChecker.a(this.f11447d)) {
            this.f11447d.mo14886b();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m14883l(InterfaceC0689a interfaceC0689a) {
        this.f11447d = interfaceC0689a;
    }

    /* JADX INFO: renamed from: m */
    public void m14884m(List<T> list) {
        Iterator<V> it = this.f11446c.iterator();
        while (it.hasNext()) {
            it.next().setSelected(false);
        }
        this.f11446c.clear();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            V v = this.f11445b.get(it2.next());
            if (v != null) {
                v.setSelected(true);
                this.f11446c.add(v);
            }
        }
    }
}
