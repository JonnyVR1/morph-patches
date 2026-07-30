package com.p051p1.mobile.putong.live.external.view.widgets;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.apibean.LiveSquareActiveGiftBean;
import java.util.HashMap;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.i4g0;
import p153l.izs;
import p153l.jl80;
import p153l.l4g0;
import p153l.oyt;
import p153l.pf60;
import p153l.ujt;
import p153l.ur2;

/* JADX INFO: loaded from: classes9.dex */
public class LiveSquareActiveGiftDialogView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f47168c;

    /* JADX INFO: renamed from: d */
    public VText f47169d;

    /* JADX INFO: renamed from: e */
    public VText f47170e;

    /* JADX INFO: renamed from: f */
    public VText f47171f;

    /* JADX INFO: renamed from: g */
    public VText f47172g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.view.widgets.LiveSquareActiveGiftDialogView$a */
    public class C12748a extends ur2 {
        public C12748a() {
        }

        @Override // p153l.e6m
        public String pageId() {
            return "p_live_popup";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.view.widgets.LiveSquareActiveGiftDialogView$b */
    public class ViewOnClickListenerC12749b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f47174a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LiveSquareActiveGiftBean f47175b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ jl80 f47176c;

        public ViewOnClickListenerC12749b(Act act, LiveSquareActiveGiftBean liveSquareActiveGiftBean, jl80 jl80Var) {
            this.f47174a = act;
            this.f47175b = liveSquareActiveGiftBean;
            this.f47176c = jl80Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ujt.m196460b(this.f47174a, Uri.parse(this.f47175b.getGotoSchema()));
            HashMap map = new HashMap();
            map.put("live_popup_type", this.f47175b.getPopupType());
            map.put("live_user_type", this.f47175b.getUserType());
            i4g0.m138521s("e_live_popup_confirm", "p_live_popup", map);
            LiveSquareActiveGiftDialogView.this.m72089R(this.f47174a, this.f47176c);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.view.widgets.LiveSquareActiveGiftDialogView$c */
    public class ViewOnClickListenerC12750c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LiveSquareActiveGiftBean f47178a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f47179b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ jl80 f47180c;

        public ViewOnClickListenerC12750c(LiveSquareActiveGiftBean liveSquareActiveGiftBean, Act act, jl80 jl80Var) {
            this.f47178a = liveSquareActiveGiftBean;
            this.f47179b = act;
            this.f47180c = jl80Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HashMap map = new HashMap();
            map.put("live_popup_type", this.f47178a.getPopupType());
            map.put("live_user_type", this.f47178a.getUserType());
            i4g0.m138521s("e_live_active_gift_popup_close", "p_live_popup", map);
            LiveSquareActiveGiftDialogView.this.m72089R(this.f47179b, this.f47180c);
        }
    }

    public LiveSquareActiveGiftDialogView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public void m72089R(Act act, jl80 jl80Var) {
        if (act.isFinishing() || !jl80Var.isShowing()) {
            return;
        }
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: Q */
    public final void m72090Q(View view) {
        oyt.m169909a(this, view);
    }

    /* JADX INFO: renamed from: S */
    public void m72091S(Act act, jl80 jl80Var, LiveSquareActiveGiftBean liveSquareActiveGiftBean) {
        if (liveSquareActiveGiftBean == null || jl80Var == null) {
            return;
        }
        l4g0 l4g0Var = new l4g0(new C12748a());
        l4g0Var.m152781p(new pf60("live_popup_type", liveSquareActiveGiftBean.getPopupType()), new pf60("live_user_type", liveSquareActiveGiftBean.getUserType()));
        l4g0Var.m152774i();
        l4g0Var.m152777l();
        izs.m142868s("context_square", this.f47168c, liveSquareActiveGiftBean.getPictureUrl());
        this.f47169d.setText(liveSquareActiveGiftBean.getTitle());
        this.f47170e.setText(liveSquareActiveGiftBean.getText());
        this.f47171f.setText(liveSquareActiveGiftBean.getGotoText());
        this.f47172g.setText(liveSquareActiveGiftBean.getCancelText());
        bnl0.m105509E0(this.f47171f, new ViewOnClickListenerC12749b(act, liveSquareActiveGiftBean, jl80Var));
        bnl0.m105509E0(this.f47172g, new ViewOnClickListenerC12750c(liveSquareActiveGiftBean, act, jl80Var));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72090Q(this);
    }

    public LiveSquareActiveGiftDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveSquareActiveGiftDialogView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
