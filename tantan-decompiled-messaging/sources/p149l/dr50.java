package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.operation.OperationBannerView;
import com.p046p1.mobile.putong.core.p053ui.operation.OperationCenterAct;
import com.p046p1.mobile.putong.data.IntlOperationArticles;
import com.p046p1.mobile.putong.data.IntlOperationBanner;
import java.util.List;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class dr50 implements s7m<cr50> {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f87580a;

    /* JADX INFO: renamed from: b */
    public cr50 f87581b;

    /* JADX INFO: renamed from: c */
    public OperationCenterAct f87582c;

    /* JADX INFO: renamed from: d */
    public OperationBannerView f87583d;

    /* JADX INFO: renamed from: e */
    public jxk f87584e;

    /* JADX INFO: renamed from: f */
    public yq50 f87585f;

    public dr50(OperationCenterAct operationCenterAct) {
        this.f87582c = operationCenterAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f87582c;
    }

    /* JADX INFO: renamed from: a */
    public View m113286a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return er50.m117824b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f87582c;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(cr50 cr50Var) {
        this.f87581b = cr50Var;
    }

    /* JADX INFO: renamed from: c */
    public void m113288c(List<IntlOperationBanner> list, List<IntlOperationArticles> list2) {
        if (vwb.m200296J(list)) {
            this.f87584e.m143811D();
        } else {
            this.f87583d.m50409C(act(), list);
        }
        this.f87585f.m215711I(list2);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m113286a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m113289r() {
        act().setTitle(R$string.f17606B9);
        yq50 yq50Var = new yq50(this.f87582c);
        this.f87585f = yq50Var;
        this.f87584e = new jxk(yq50Var);
        this.f87583d = (OperationBannerView) o7r.m163037a(this.f87582c).inflate(f6c0.f95962q8, (ViewGroup) null, false);
        this.f87583d.setLayoutParams(new RecyclerView.C0578p(-1, -2));
        this.f87584e.m143815H(this.f87583d);
        this.f87580a.setLayoutManager(new LinearLayoutManager(this.f87582c));
        this.f87580a.setAdapter(this.f87584e);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
