package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.map.intl.IntlMapItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class m3h0 extends AbstractC15610a<lxw> {

    /* JADX INFO: renamed from: c */
    public Context f134665c;

    /* JADX INFO: renamed from: d */
    public List<lxw> f134666d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public y20<lxw> f134667e;

    public m3h0(Context context, y20<lxw> y20Var) {
        this.f134665c = context;
        this.f134667e = y20Var;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: m */
    public View mo21402m(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f134665c).inflate(kec0.f125494Kd, viewGroup, false);
    }

    @Override // p153l.AbstractC15610a
    /* JADX INFO: renamed from: p */
    public List<lxw> mo21403p() {
        return this.f134666d;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, lxw lxwVar, int i, int i2) {
        ((IntlMapItem) view).m48578b0(lxwVar, this.f134667e);
    }

    /* JADX INFO: renamed from: t */
    public void m156931t(List<lxw> list) {
        this.f134666d = list;
        notifyDataSetChanged();
    }
}
