package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.myinterestpeople.CoreMyInterestItem;
import com.p046p1.mobile.putong.core.newui.myinterestpeople.CoreMyInterestPeopleCardStack;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class s1a extends yw2 {

    /* JADX INFO: renamed from: b */
    public CoreMyInterestPeopleCardStack f161866b;

    /* JADX INFO: renamed from: c */
    public List<w39> f161867c;

    /* JADX INFO: renamed from: d */
    public g1a f161868d;

    /* JADX INFO: renamed from: e */
    public Act f161869e;

    /* JADX INFO: renamed from: f */
    public boolean f161870f = true;

    public s1a(Act act, g1a g1aVar, CoreMyInterestPeopleCardStack coreMyInterestPeopleCardStack) {
        this.f161868d = g1aVar;
        this.f161869e = act;
        this.f161866b = coreMyInterestPeopleCardStack;
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: d */
    public void mo100897d(View view, int i) {
        final CoreMyInterestItem coreMyInterestItem = (CoreMyInterestItem) view;
        coreMyInterestItem.setClickCallBack(this.f161868d);
        w39 w39Var = this.f161867c.get(i);
        coreMyInterestItem.m42582J(w39Var);
        if (!this.f161870f) {
            w39Var.m201269i(false);
            return;
        }
        this.f161870f = false;
        w39Var.m201269i(true);
        e51.m114743H(this.f161869e, new Runnable() { // from class: l.r1a
            @Override // java.lang.Runnable
            public final void run() {
                coreMyInterestItem.m42583K();
            }
        }, 800L);
        this.f161868d.mo42638l0(w39Var);
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: e */
    public View mo100898e(int i, Context context, LayoutInflater layoutInflater) {
        return layoutInflater.inflate(f6c0.f95306C7, (ViewGroup) this.f161866b, false);
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: f */
    public int mo100899f() {
        List<w39> list = this.f161867c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: g */
    public Object mo100900g(int i) {
        return this.f161867c.get(i);
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: h */
    public int mo100901h(int i) {
        return 0;
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: i */
    public String mo100902i(int i) {
        return this.f161867c.get(i).f184317a.f56011id;
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: m */
    public void mo100904m(pol0 pol0Var) {
        this.f161867c.remove(0);
        if (this.f161867c.size() == 0) {
            this.f161868d.mo42648v();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m181936n(List<w39> list) {
        this.f161867c = list;
        mo104259a();
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: l */
    public void mo100903l(View view, boolean z) {
    }
}
