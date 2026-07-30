package com.p046p1.mobile.putong.live.external.page.fansgroup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.live.base.apibean.FanbaseGroupsBean;
import p149l.arl;
import p149l.cfg;
import p149l.l9s;
import p149l.s6c0;
import p149l.s7m;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.fansgroup.a */
/* JADX INFO: loaded from: classes13.dex */
public class C12569a implements s7m<cfg>, arl, FansGroupView.InterfaceC12568b {

    /* JADX INFO: renamed from: a */
    public final PutongAct f45934a;

    /* JADX INFO: renamed from: b */
    public FansGroupView f45935b;

    /* JADX INFO: renamed from: c */
    public cfg f45936c;

    /* JADX INFO: renamed from: d */
    public FanbaseGroupsBean f45937d;

    public C12569a(PutongAct putongAct) {
        this.f45934a = putongAct;
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f45934a;
    }

    @Override // com.p046p1.mobile.putong.live.external.page.fansgroup.FansGroupView.InterfaceC12568b
    /* JADX INFO: renamed from: a */
    public void mo70504a() {
        this.f45934a.startActivity(FansGroupNoticeActivity.m70497V1(getContext()));
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(cfg cfgVar) {
        this.f45936c = cfgVar;
    }

    @Override // p149l.arl
    /* JADX INFO: renamed from: c */
    public void mo70506c() {
        this.f45936c.m106542k0();
    }

    @Override // p149l.arl
    /* JADX INFO: renamed from: d */
    public void mo70507d(String str) {
        PutongAct putongAct = this.f45934a;
        putongAct.startActivity(l9s.m149083j0(putongAct, str, false, false));
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m70508e(FanbaseGroupsBean fanbaseGroupsBean) {
        this.f45937d = fanbaseGroupsBean;
        this.f45935b.f45928d.setLeftIconAsBack(this.f45934a);
        this.f45935b.m70500B(fanbaseGroupsBean);
    }

    /* JADX INFO: renamed from: f */
    public void m70509f(String str) {
        this.f45935b.m70501H(str);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FansGroupView fansGroupView = (FansGroupView) View.inflate(this.f45934a, s6c0.f162743e, viewGroup);
        this.f45935b = fansGroupView;
        fansGroupView.m70503z(this, this);
        return this.f45935b;
    }
}
