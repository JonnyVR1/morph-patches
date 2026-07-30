package com.p046p1.mobile.putong.live.external.page.fansgroup;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.live.base.apibean.FanbaseGroupsBean;
import com.p046p1.mobile.putong.live.base.business.fansgroup.FansGroupListView;
import p147v.VRelative;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;
import p149l.arl;
import p149l.efg;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class FansGroupView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VNavigationBar f45928d;

    /* JADX INFO: renamed from: e */
    public FansGroupListView f45929e;

    /* JADX INFO: renamed from: f */
    public VRelative f45930f;

    /* JADX INFO: renamed from: g */
    public VText f45931g;

    /* JADX INFO: renamed from: h */
    public InterfaceC12568b f45932h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.fansgroup.FansGroupView$a */
    public class ViewOnClickListenerC12567a implements View.OnClickListener {
        public ViewOnClickListenerC12567a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (FansGroupView.this.f45932h != null) {
                FansGroupView.this.m70501H("0");
                FansGroupView.this.f45932h.mo70504a();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.fansgroup.FansGroupView$b */
    public interface InterfaceC12568b {
        /* JADX INFO: renamed from: a */
        void mo70504a();
    }

    public FansGroupView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    public void m70500B(FanbaseGroupsBean fanbaseGroupsBean) {
        xdl0.m208329E0(this.f45930f, new ViewOnClickListenerC12567a());
        this.f45929e.m67626z(true, fanbaseGroupsBean);
    }

    /* JADX INFO: renamed from: H */
    public void m70501H(String str) {
        boolean zEquals = TextUtils.equals(str, "0");
        VText vText = this.f45931g;
        if (zEquals) {
            vText.setVisibility(8);
        } else {
            vText.setVisibility(0);
            this.f45931g.setText(str);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70502q(this);
    }

    /* JADX INFO: renamed from: q */
    public final void m70502q(View view) {
        efg.m116036a(this, view);
    }

    /* JADX INFO: renamed from: z */
    public void m70503z(arl arlVar, InterfaceC12568b interfaceC12568b) {
        this.f45932h = interfaceC12568b;
        this.f45929e.m67624u(false, arlVar);
    }

    public FansGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FansGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
