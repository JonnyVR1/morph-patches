package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.operation.OperationBannerView;
import com.p051p1.mobile.putong.core.p058ui.operation.OperationCenterAct;
import com.p051p1.mobile.putong.data.IntlOperationArticles;
import com.p051p1.mobile.putong.data.IntlOperationBanner;
import java.util.List;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class jz50 implements iam<iz50> {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f123227a;

    /* JADX INFO: renamed from: b */
    public iz50 f123228b;

    /* JADX INFO: renamed from: c */
    public OperationCenterAct f123229c;

    /* JADX INFO: renamed from: d */
    public OperationBannerView f123230d;

    /* JADX INFO: renamed from: e */
    public zzk f123231e;

    /* JADX INFO: renamed from: f */
    public ez50 f123232f;

    public jz50(OperationCenterAct operationCenterAct) {
        this.f123229c = operationCenterAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f123229c;
    }

    /* JADX INFO: renamed from: a */
    public View m147638a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kz50.m152161b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f123229c;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(iz50 iz50Var) {
        this.f123228b = iz50Var;
    }

    /* JADX INFO: renamed from: c */
    public void m147640c(List<IntlOperationBanner> list, List<IntlOperationArticles> list2) {
        if (jyb.m147479J(list)) {
            this.f123231e.m222261D();
        } else {
            this.f123230d.m51592C(act(), list);
        }
        this.f123232f.m123341I(list2);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m147638a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m147641r() {
        act().setTitle(R$string.f18512H9);
        ez50 ez50Var = new ez50(this.f123229c);
        this.f123232f = ez50Var;
        this.f123231e = new zzk(ez50Var);
        this.f123230d = (OperationBannerView) p9r.m171370a(this.f123229c).inflate(kec0.f126135x8, (ViewGroup) null, false);
        this.f123230d.setLayoutParams(new RecyclerView.C0580p(-1, -2));
        this.f123231e.m222265H(this.f123230d);
        this.f123227a.setLayoutManager(new LinearLayoutManager(this.f123229c));
        this.f123227a.setAdapter(this.f123231e);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
