package com.p051p1.mobile.putong.live.external.intl.view.widgets;

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
import p153l.n1o;
import p153l.pf60;
import p153l.ujt;
import p153l.ur2;

/* JADX INFO: loaded from: classes9.dex */
public class IntlLiveSquareActiveGiftDialogView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f46653c;

    /* JADX INFO: renamed from: d */
    public VText f46654d;

    /* JADX INFO: renamed from: e */
    public VText f46655e;

    /* JADX INFO: renamed from: f */
    public VText f46656f;

    /* JADX INFO: renamed from: g */
    public VText f46657g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareActiveGiftDialogView$a */
    public class C12722a extends ur2 {
        public C12722a() {
        }

        @Override // p153l.e6m
        public String pageId() {
            return "p_live_popup";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareActiveGiftDialogView$b */
    public class ViewOnClickListenerC12723b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f46659a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LiveSquareActiveGiftBean f46660b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ jl80 f46661c;

        public ViewOnClickListenerC12723b(Act act, LiveSquareActiveGiftBean liveSquareActiveGiftBean, jl80 jl80Var) {
            this.f46659a = act;
            this.f46660b = liveSquareActiveGiftBean;
            this.f46661c = jl80Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ujt.m196460b(this.f46659a, Uri.parse(this.f46660b.getGotoSchema()));
            HashMap map = new HashMap();
            map.put("live_popup_type", this.f46660b.getPopupType());
            map.put("live_user_type", this.f46660b.getUserType());
            i4g0.m138521s("e_live_popup_confirm", "p_live_popup", map);
            IntlLiveSquareActiveGiftDialogView.this.m71529R(this.f46659a, this.f46661c);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareActiveGiftDialogView$c */
    public class ViewOnClickListenerC12724c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LiveSquareActiveGiftBean f46663a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f46664b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ jl80 f46665c;

        public ViewOnClickListenerC12724c(LiveSquareActiveGiftBean liveSquareActiveGiftBean, Act act, jl80 jl80Var) {
            this.f46663a = liveSquareActiveGiftBean;
            this.f46664b = act;
            this.f46665c = jl80Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HashMap map = new HashMap();
            map.put("live_popup_type", this.f46663a.getPopupType());
            map.put("live_user_type", this.f46663a.getUserType());
            i4g0.m138521s("e_live_active_gift_popup_close", "p_live_popup", map);
            IntlLiveSquareActiveGiftDialogView.this.m71529R(this.f46664b, this.f46665c);
        }
    }

    public IntlLiveSquareActiveGiftDialogView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: Q */
    public final void m71528Q(View view) {
        n1o.m161128a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public final void m71529R(Act act, jl80 jl80Var) {
        if (act.isFinishing() || !jl80Var.isShowing()) {
            return;
        }
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: S */
    public void m71530S(Act act, jl80 jl80Var, LiveSquareActiveGiftBean liveSquareActiveGiftBean) {
        if (liveSquareActiveGiftBean == null || jl80Var == null) {
            return;
        }
        l4g0 l4g0Var = new l4g0(new C12722a());
        l4g0Var.m152781p(new pf60("live_popup_type", liveSquareActiveGiftBean.getPopupType()), new pf60("live_user_type", liveSquareActiveGiftBean.getUserType()));
        l4g0Var.m152774i();
        l4g0Var.m152777l();
        izs.m142868s("context_square", this.f46653c, liveSquareActiveGiftBean.getPictureUrl());
        this.f46654d.setText(liveSquareActiveGiftBean.getTitle());
        this.f46655e.setText(liveSquareActiveGiftBean.getText());
        this.f46656f.setText(liveSquareActiveGiftBean.getGotoText());
        this.f46657g.setText(liveSquareActiveGiftBean.getCancelText());
        bnl0.m105509E0(this.f46656f, new ViewOnClickListenerC12723b(act, liveSquareActiveGiftBean, jl80Var));
        bnl0.m105509E0(this.f46657g, new ViewOnClickListenerC12724c(liveSquareActiveGiftBean, act, jl80Var));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71528Q(this);
    }

    public IntlLiveSquareActiveGiftDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLiveSquareActiveGiftDialogView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
