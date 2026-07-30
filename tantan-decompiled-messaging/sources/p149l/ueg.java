package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p046p1.mobile.putong.live.base.apibean.FanbaseGroupAuditsItemBean;
import com.p046p1.mobile.putong.live.external.page.fansgroup.FansGroupNoticeView;

/* JADX INFO: loaded from: classes13.dex */
public class ueg implements s7m<teg>, brl {

    /* JADX INFO: renamed from: a */
    public final PutongAct f176038a;

    /* JADX INFO: renamed from: b */
    public FansGroupNoticeView f176039b;

    /* JADX INFO: renamed from: c */
    public teg f176040c;

    public ueg(PutongAct putongAct) {
        this.f176038a = putongAct;
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f176038a;
    }

    @Override // p149l.brl
    /* JADX INFO: renamed from: a */
    public void mo103553a() {
        this.f176040c.m188498n0("");
    }

    @Override // p149l.brl
    /* JADX INFO: renamed from: b */
    public void mo103554b(int i, String str, String str2) {
        this.f176040c.m188493i0(i, str, str2, true);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(teg tegVar) {
        this.f176040c = tegVar;
    }

    /* JADX INFO: renamed from: d */
    public void m193248d(BaseLiveListBean<FanbaseGroupAuditsItemBean> baseLiveListBean) {
        this.f176039b.f45927d.m67639K(baseLiveListBean);
    }

    @Override // p149l.brl
    /* JADX INFO: renamed from: e */
    public void mo103555e(int i, String str, String str2) {
        this.f176040c.m188493i0(i, str, str2, false);
    }

    @Override // p149l.brl
    /* JADX INFO: renamed from: f */
    public void mo103556f(String str) {
        this.f176040c.m188498n0(str);
    }

    /* JADX INFO: renamed from: i */
    public void m193249i() {
        this.f176039b.f45927d.m67638G();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FansGroupNoticeView fansGroupNoticeView = (FansGroupNoticeView) View.inflate(this.f176038a, s6c0.f162747f, viewGroup);
        this.f176039b = fansGroupNoticeView;
        fansGroupNoticeView.f45927d.m67637E(false, this);
        this.f176039b.f45926c.setLeftIconAsBack(this.f176038a);
        return this.f176039b;
    }

    @Override // p149l.brl
    public boolean isLoading() {
        return this.f176040c.m188494j0();
    }

    /* JADX INFO: renamed from: j */
    public void m193250j(BaseLiveListBean<FanbaseGroupAuditsItemBean> baseLiveListBean) {
        this.f176039b.f45927d.m67640M(baseLiveListBean);
    }

    /* JADX INFO: renamed from: k */
    public void m193251k(int i, String str) {
        this.f176039b.f45927d.m67641N(i, str);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
