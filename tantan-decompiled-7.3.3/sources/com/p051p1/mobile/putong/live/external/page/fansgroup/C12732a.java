package com.p051p1.mobile.putong.live.external.page.fansgroup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.live.base.apibean.FanbaseGroupsBean;
import p153l.iam;
import p153l.mbs;
import p153l.ntl;
import p153l.qgg;
import p153l.xec0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.fansgroup.a */
/* JADX INFO: loaded from: classes9.dex */
public class C12732a implements iam<qgg>, ntl, FansGroupView.InterfaceC12731b {

    /* JADX INFO: renamed from: a */
    public final PutongAct f46782a;

    /* JADX INFO: renamed from: b */
    public FansGroupView f46783b;

    /* JADX INFO: renamed from: c */
    public qgg f46784c;

    /* JADX INFO: renamed from: d */
    public FanbaseGroupsBean f46785d;

    public C12732a(PutongAct putongAct) {
        this.f46782a = putongAct;
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f46782a;
    }

    @Override // com.p051p1.mobile.putong.live.external.page.fansgroup.FansGroupView.InterfaceC12731b
    /* JADX INFO: renamed from: a */
    public void mo71687a() {
        this.f46782a.startActivity(FansGroupNoticeActivity.m71680X1(getContext()));
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(qgg qggVar) {
        this.f46784c = qggVar;
    }

    @Override // p153l.ntl
    /* JADX INFO: renamed from: c */
    public void mo71689c() {
        this.f46784c.m176464k0();
    }

    @Override // p153l.ntl
    /* JADX INFO: renamed from: d */
    public void mo71690d(String str) {
        PutongAct putongAct = this.f46782a;
        putongAct.startActivity(mbs.m157860j0(putongAct, str, false, false));
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m71691e(FanbaseGroupsBean fanbaseGroupsBean) {
        this.f46785d = fanbaseGroupsBean;
        this.f46783b.f46776d.setLeftIconAsBack(this.f46782a);
        this.f46783b.m71683B(fanbaseGroupsBean);
    }

    /* JADX INFO: renamed from: f */
    public void m71692f(String str) {
        this.f46783b.m71684H(str);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FansGroupView fansGroupView = (FansGroupView) View.inflate(this.f46782a, xec0.f193857e, viewGroup);
        this.f46783b = fansGroupView;
        fansGroupView.m71686z(this, this);
        return this.f46783b;
    }
}
