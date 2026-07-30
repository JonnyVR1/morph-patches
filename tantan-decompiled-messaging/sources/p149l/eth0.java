package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public abstract class eth0<T, V extends View> extends bth0<V> {

    /* JADX INFO: renamed from: b */
    public HashMap<T, V> f93123b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public List<V> f93124c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public InterfaceC16677a f93125d;

    /* JADX INFO: renamed from: l.eth0$a */
    public interface InterfaceC16677a {
        /* JADX INFO: renamed from: a */
        boolean mo118108a(View view);

        /* JADX INFO: renamed from: b */
        void mo118109b();
    }

    @Override // p149l.bth0
    /* JADX INFO: renamed from: c */
    public V mo103835c(ViewGroup viewGroup, int i) {
        final V v2 = (V) mo103438g(viewGroup, i);
        this.f93123b.put(mo103439i(i), v2);
        v2.setOnClickListener(new View.OnClickListener() { // from class: l.dth0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87845a.m118105k(v2, view);
            }
        });
        return v2;
    }

    /* JADX INFO: renamed from: g */
    public abstract V mo103438g(ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: h */
    public List<V> m118103h() {
        return this.f93124c;
    }

    /* JADX INFO: renamed from: i */
    public abstract T mo103439i(int i);

    /* JADX INFO: renamed from: j */
    public HashMap<T, V> m118104j() {
        return this.f93123b;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m118105k(View view, View view2) {
        if (NullChecker.m81303a(this.f93125d) && this.f93125d.mo118108a(view2)) {
            this.f93125d.mo118109b();
            return;
        }
        view.setSelected(!view.isSelected());
        boolean zIsSelected = view.isSelected();
        List<V> list = this.f93124c;
        if (zIsSelected) {
            list.add(view);
        } else {
            list.remove(view);
        }
        if (NullChecker.m81303a(this.f93125d)) {
            this.f93125d.mo118109b();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m118106l(InterfaceC16677a interfaceC16677a) {
        this.f93125d = interfaceC16677a;
    }

    /* JADX INFO: renamed from: m */
    public void m118107m(List<T> list) {
        Iterator<V> it = this.f93124c.iterator();
        while (it.hasNext()) {
            it.next().setSelected(false);
        }
        this.f93124c.clear();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            V v2 = this.f93123b.get(it2.next());
            if (v2 != null) {
                v2.setSelected(true);
                this.f93124c.add(v2);
            }
        }
    }
}
