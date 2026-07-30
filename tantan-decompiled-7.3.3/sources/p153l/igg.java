package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p051p1.mobile.putong.live.base.apibean.FanbaseGroupAuditsItemBean;
import com.p051p1.mobile.putong.live.external.page.fansgroup.FansGroupNoticeView;

/* JADX INFO: loaded from: classes9.dex */
public class igg implements iam<hgg>, otl {

    /* JADX INFO: renamed from: a */
    public final PutongAct f114779a;

    /* JADX INFO: renamed from: b */
    public FansGroupNoticeView f114780b;

    /* JADX INFO: renamed from: c */
    public hgg f114781c;

    public igg(PutongAct putongAct) {
        this.f114779a = putongAct;
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f114779a;
    }

    @Override // p153l.otl
    /* JADX INFO: renamed from: a */
    public void mo120683a() {
        this.f114781c.m134936n0("");
    }

    @Override // p153l.otl
    /* JADX INFO: renamed from: b */
    public void mo120684b(int i, String str, String str2) {
        this.f114781c.m134931i0(i, str, str2, true);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(hgg hggVar) {
        this.f114781c = hggVar;
    }

    /* JADX INFO: renamed from: d */
    public void m139916d(BaseLiveListBean<FanbaseGroupAuditsItemBean> baseLiveListBean) {
        this.f114780b.f46775d.m68822K(baseLiveListBean);
    }

    @Override // p153l.otl
    /* JADX INFO: renamed from: e */
    public void mo120685e(int i, String str, String str2) {
        this.f114781c.m134931i0(i, str, str2, false);
    }

    @Override // p153l.otl
    /* JADX INFO: renamed from: f */
    public void mo120686f(String str) {
        this.f114781c.m134936n0(str);
    }

    /* JADX INFO: renamed from: i */
    public void m139917i() {
        this.f114780b.f46775d.m68821G();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FansGroupNoticeView fansGroupNoticeView = (FansGroupNoticeView) View.inflate(this.f114779a, xec0.f193861f, viewGroup);
        this.f114780b = fansGroupNoticeView;
        fansGroupNoticeView.f46775d.m68820E(false, this);
        this.f114780b.f46774c.setLeftIconAsBack(this.f114779a);
        return this.f114780b;
    }

    @Override // p153l.otl
    public boolean isLoading() {
        return this.f114781c.m134932j0();
    }

    /* JADX INFO: renamed from: j */
    public void m139918j(BaseLiveListBean<FanbaseGroupAuditsItemBean> baseLiveListBean) {
        this.f114780b.f46775d.m68823M(baseLiveListBean);
    }

    /* JADX INFO: renamed from: k */
    public void m139919k(int i, String str) {
        this.f114780b.f46775d.m68824N(i, str);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
