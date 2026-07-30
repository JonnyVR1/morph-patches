package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.data.Message;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l900 implements lzl {

    /* JADX INFO: renamed from: a */
    public ViewGroup f130526a;

    /* JADX INFO: renamed from: b */
    public kzl f130527b;

    /* JADX INFO: renamed from: c */
    public List<View> f130528c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<View> f130529d = new ArrayList();

    public l900(ViewGroup viewGroup) {
        this.f130526a = viewGroup;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo129495a(View view, Message message, int i, int i2);

    /* JADX INFO: renamed from: b */
    public final void m153305b(kzl kzlVar) {
        this.f130527b = kzlVar;
        kzlVar.mo139062x(this.f130528c);
        kzlVar.mo139055i(this.f130529d);
        this.f130528c.clear();
        this.f130529d.clear();
    }

    @Override // p153l.pol
    /* JADX INFO: renamed from: c */
    public <V> C22421c<V> mo68557c(ner nerVar, C22421c<V> c22421c) {
        return NullChecker.m82486a(this.f130527b) ? this.f130527b.mo68557c(nerVar, c22421c) : C22508b.m222767b();
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo129499d();

    @Override // p153l.pol
    /* JADX INFO: renamed from: g */
    public <V> C22421c<V> mo68561g(ner nerVar, C22421c<V> c22421c, boolean z) {
        return NullChecker.m82486a(this.f130527b) ? this.f130527b.mo68561g(nerVar, c22421c, z) : C22508b.m222767b();
    }

    @Override // p153l.p4m
    /* JADX INFO: renamed from: j */
    public void mo139056j(View view) {
        if (NullChecker.m82486a(this.f130527b)) {
            this.f130527b.mo139056j(view);
        } else {
            this.f130528c.remove(view);
        }
    }

    /* JADX INFO: renamed from: m */
    public abstract Message mo129506m(int i);

    /* JADX INFO: renamed from: p */
    public abstract int mo129507p(int i);

    /* JADX INFO: renamed from: r */
    public final void m153306r() {
        if (NullChecker.m82486a(this.f130527b)) {
            this.f130527b.mo139059r();
        }
    }

    /* JADX INFO: renamed from: s */
    public abstract List<pf60<Integer, Integer>> mo129508s();

    @Override // p153l.p4m
    /* JADX INFO: renamed from: t */
    public void mo139060t(View view) {
        if (NullChecker.m82486a(this.f130527b)) {
            this.f130527b.mo139060t(view);
        } else {
            this.f130528c.add(view);
        }
    }

    /* JADX INFO: renamed from: w */
    public abstract View mo129509w(ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: y */
    public void m153307y() {
        if (NullChecker.m82486a(this.f130527b)) {
            this.f130527b.mo139058n();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m153308z() {
        if (NullChecker.m82486a(this.f130527b)) {
            this.f130527b.mo139061u();
        }
    }
}
