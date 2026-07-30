package com.p051p1.mobile.putong.live.external.page.fansgroup;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.live.base.apibean.FanbaseGroupsBean;
import com.p051p1.mobile.putong.live.base.business.fansgroup.FansGroupListView;
import p151v.VRelative;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;
import p153l.bnl0;
import p153l.ntl;
import p153l.sgg;

/* JADX INFO: loaded from: classes9.dex */
public class FansGroupView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VNavigationBar f46776d;

    /* JADX INFO: renamed from: e */
    public FansGroupListView f46777e;

    /* JADX INFO: renamed from: f */
    public VRelative f46778f;

    /* JADX INFO: renamed from: g */
    public VText f46779g;

    /* JADX INFO: renamed from: h */
    public InterfaceC12731b f46780h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.fansgroup.FansGroupView$a */
    public class ViewOnClickListenerC12730a implements View.OnClickListener {
        public ViewOnClickListenerC12730a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (FansGroupView.this.f46780h != null) {
                FansGroupView.this.m71684H("0");
                FansGroupView.this.f46780h.mo71687a();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.fansgroup.FansGroupView$b */
    public interface InterfaceC12731b {
        /* JADX INFO: renamed from: a */
        void mo71687a();
    }

    public FansGroupView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    public void m71683B(FanbaseGroupsBean fanbaseGroupsBean) {
        bnl0.m105509E0(this.f46778f, new ViewOnClickListenerC12730a());
        this.f46777e.m68809z(true, fanbaseGroupsBean);
    }

    /* JADX INFO: renamed from: H */
    public void m71684H(String str) {
        boolean zEquals = TextUtils.equals(str, "0");
        VText vText = this.f46779g;
        if (zEquals) {
            vText.setVisibility(8);
        } else {
            vText.setVisibility(0);
            this.f46779g.setText(str);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71685q(this);
    }

    /* JADX INFO: renamed from: q */
    public final void m71685q(View view) {
        sgg.m185772a(this, view);
    }

    /* JADX INFO: renamed from: z */
    public void m71686z(ntl ntlVar, InterfaceC12731b interfaceC12731b) {
        this.f46780h = interfaceC12731b;
        this.f46777e.m68807u(false, ntlVar);
    }

    public FansGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FansGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
