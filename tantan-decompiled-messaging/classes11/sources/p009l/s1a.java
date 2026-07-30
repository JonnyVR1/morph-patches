package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.myinterestpeople.CoreMyInterestItem;
import com.p000p1.mobile.putong.core.newui.myinterestpeople.CoreMyInterestPeopleCardStack;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.e51;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class s1a extends yw2 {

    /* JADX INFO: renamed from: b */
    public CoreMyInterestPeopleCardStack f20069b;

    /* JADX INFO: renamed from: c */
    public List<w39> f20070c;

    /* JADX INFO: renamed from: d */
    public g1a f20071d;

    /* JADX INFO: renamed from: e */
    public Act f20072e;

    /* JADX INFO: renamed from: f */
    public boolean f20073f = true;

    public s1a(Act act, g1a g1aVar, CoreMyInterestPeopleCardStack coreMyInterestPeopleCardStack) {
        this.f20071d = g1aVar;
        this.f20072e = act;
        this.f20069b = coreMyInterestPeopleCardStack;
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: d */
    public void mo11922d(View view, int i) {
        final CoreMyInterestItem coreMyInterestItem = (CoreMyInterestItem) view;
        coreMyInterestItem.setClickCallBack(this.f20071d);
        w39 w39Var = this.f20070c.get(i);
        coreMyInterestItem.m6745J(w39Var);
        if (!this.f20073f) {
            w39Var.m23805i(false);
            return;
        }
        this.f20073f = false;
        w39Var.m23805i(true);
        e51.H(this.f20072e, new Runnable() { // from class: l.r1a
            @Override // java.lang.Runnable
            public final void run() {
                coreMyInterestItem.m6746K();
            }
        }, 800L);
        this.f20071d.mo6801l0(w39Var);
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: e */
    public View mo11923e(int i, Context context, LayoutInflater layoutInflater) {
        return layoutInflater.inflate(f6c0.C7, (ViewGroup) this.f20069b, false);
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: f */
    public int mo11924f() {
        List<w39> list = this.f20070c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: g */
    public Object mo11925g(int i) {
        return this.f20070c.get(i);
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: h */
    public int mo11926h(int i) {
        return 0;
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: i */
    public String mo11927i(int i) {
        return ((DbObject) this.f20070c.get(i).f21867a).id;
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: m */
    public void mo11929m(pol0 pol0Var) {
        this.f20070c.remove(0);
        if (this.f20070c.size() == 0) {
            this.f20071d.mo6811v();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m21981n(List<w39> list) {
        this.f20070c = list;
        mo12312a();
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: l */
    public void mo11928l(View view, boolean z) {
    }
}
