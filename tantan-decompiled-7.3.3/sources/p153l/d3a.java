package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.myinterestpeople.CoreMyInterestItem;
import com.p051p1.mobile.putong.core.newui.myinterestpeople.CoreMyInterestPeopleCardStack;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class d3a extends nx2 {

    /* JADX INFO: renamed from: b */
    public CoreMyInterestPeopleCardStack f84875b;

    /* JADX INFO: renamed from: c */
    public List<f59> f84876c;

    /* JADX INFO: renamed from: d */
    public r2a f84877d;

    /* JADX INFO: renamed from: e */
    public Act f84878e;

    /* JADX INFO: renamed from: f */
    public boolean f84879f = true;

    public d3a(Act act, r2a r2aVar, CoreMyInterestPeopleCardStack coreMyInterestPeopleCardStack) {
        this.f84877d = r2aVar;
        this.f84878e = act;
        this.f84875b = coreMyInterestPeopleCardStack;
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: d */
    public void mo105829d(View view, int i) {
        final CoreMyInterestItem coreMyInterestItem = (CoreMyInterestItem) view;
        coreMyInterestItem.setClickCallBack(this.f84877d);
        f59 f59Var = this.f84876c.get(i);
        coreMyInterestItem.m43593J(f59Var);
        if (!this.f84879f) {
            f59Var.m124115i(false);
            return;
        }
        this.f84879f = false;
        f59Var.m124115i(true);
        l51.m152888H(this.f84878e, new Runnable() { // from class: l.c3a
            @Override // java.lang.Runnable
            public final void run() {
                coreMyInterestItem.m43594K();
            }
        }, 800L);
        this.f84877d.mo43649m0(f59Var);
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: e */
    public View mo105830e(int i, Context context, LayoutInflater layoutInflater) {
        return layoutInflater.inflate(kec0.f125472J7, (ViewGroup) this.f84875b, false);
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: f */
    public int mo105831f() {
        List<f59> list = this.f84876c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: g */
    public Object mo105832g(int i) {
        return this.f84876c.get(i);
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: h */
    public int mo105833h(int i) {
        return 0;
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: i */
    public String mo105834i(int i) {
        return this.f84876c.get(i).f97205a.f56859id;
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: m */
    public void mo105836m(txl0 txl0Var) {
        this.f84876c.remove(0);
        if (this.f84876c.size() == 0) {
            this.f84877d.mo43658v();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m113798n(List<f59> list) {
        this.f84876c = list;
        mo140726a();
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: l */
    public void mo105835l(View view, boolean z) {
    }
}
