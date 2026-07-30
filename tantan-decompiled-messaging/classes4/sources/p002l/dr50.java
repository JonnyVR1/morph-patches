package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.operation.OperationBannerView;
import com.p000p1.mobile.putong.core.p001ui.operation.OperationCenterAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.IntlOperationArticles;
import com.p1.mobile.putong.data.IntlOperationBanner;
import java.util.List;
import l.er50;
import l.f6c0;
import l.jxk;
import l.o7r;
import l.s7m;
import l.vwb;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class dr50 implements s7m<cr50> {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f9405a;

    /* JADX INFO: renamed from: b */
    public cr50 f9406b;

    /* JADX INFO: renamed from: c */
    public OperationCenterAct f9407c;

    /* JADX INFO: renamed from: d */
    public OperationBannerView f9408d;

    /* JADX INFO: renamed from: e */
    public jxk f9409e;

    /* JADX INFO: renamed from: f */
    public yq50 f9410f;

    public dr50(OperationCenterAct operationCenterAct) {
        this.f9407c = operationCenterAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m12001C0() {
        return this.f9407c;
    }

    /* JADX INFO: renamed from: a */
    public View m12002a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return er50.b(this, layoutInflater, viewGroup);
    }

    @Nullable
    public Act act() {
        return this.f9407c;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m12005i1(cr50 cr50Var) {
        this.f9406b = cr50Var;
    }

    /* JADX INFO: renamed from: c */
    public void m12004c(List<IntlOperationBanner> list, List<IntlOperationArticles> list2) {
        if (vwb.J(list)) {
            this.f9409e.D();
        } else {
            this.f9408d.m842C(act(), list);
        }
        this.f9410f.m26882I(list2);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m12002a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m12006r() {
        act().setTitle(R.string.B9);
        yq50 yq50Var = new yq50(this.f9407c);
        this.f9410f = yq50Var;
        this.f9409e = new jxk(yq50Var);
        this.f9408d = (OperationBannerView) o7r.a(this.f9407c).inflate(f6c0.q8, (ViewGroup) null, false);
        this.f9408d.setLayoutParams(new RecyclerView.p(-1, -2));
        this.f9409e.H(this.f9408d);
        this.f9405a.setLayoutManager(new LinearLayoutManager(this.f9407c));
        this.f9405a.setAdapter(this.f9409e);
    }

    public void destroy() {
    }
}
