package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public abstract class m1i0<T, V extends View> extends j1i0<V> {

    /* JADX INFO: renamed from: b */
    public HashMap<T, V> f134438b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public List<V> f134439c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public InterfaceC18525a f134440d;

    /* JADX INFO: renamed from: l.m1i0$a */
    public interface InterfaceC18525a {
        /* JADX INFO: renamed from: a */
        boolean mo133070a(View view);

        /* JADX INFO: renamed from: b */
        void mo133071b();
    }

    @Override // p153l.j1i0
    /* JADX INFO: renamed from: c */
    public V mo143136c(ViewGroup viewGroup, int i) {
        final V v2 = (V) mo156398g(viewGroup, i);
        this.f134438b.put(mo156399i(i), v2);
        v2.setOnClickListener(new View.OnClickListener() { // from class: l.l1i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129690a.m156693k(v2, view);
            }
        });
        return v2;
    }

    /* JADX INFO: renamed from: g */
    public abstract V mo156398g(ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: h */
    public List<V> m156691h() {
        return this.f134439c;
    }

    /* JADX INFO: renamed from: i */
    public abstract T mo156399i(int i);

    /* JADX INFO: renamed from: j */
    public HashMap<T, V> m156692j() {
        return this.f134438b;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m156693k(View view, View view2) {
        if (NullChecker.m82486a(this.f134440d) && this.f134440d.mo133070a(view2)) {
            this.f134440d.mo133071b();
            return;
        }
        view.setSelected(!view.isSelected());
        boolean zIsSelected = view.isSelected();
        List<V> list = this.f134439c;
        if (zIsSelected) {
            list.add(view);
        } else {
            list.remove(view);
        }
        if (NullChecker.m82486a(this.f134440d)) {
            this.f134440d.mo133071b();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m156694l(InterfaceC18525a interfaceC18525a) {
        this.f134440d = interfaceC18525a;
    }

    /* JADX INFO: renamed from: m */
    public void m156695m(List<T> list) {
        Iterator<V> it = this.f134439c.iterator();
        while (it.hasNext()) {
            it.next().setSelected(false);
        }
        this.f134439c.clear();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            V v2 = this.f134438b.get(it2.next());
            if (v2 != null) {
                v2.setSelected(true);
                this.f134439c.add(v2);
            }
        }
    }
}
