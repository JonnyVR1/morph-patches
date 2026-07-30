package com.p046p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.apibean.LiveSquareActiveGiftBean;
import java.util.HashMap;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.cwf0;
import p149l.dd80;
import p149l.er2;
import p149l.hxs;
import p149l.j760;
import p149l.nzn;
import p149l.tht;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes13.dex */
public class IntlLiveSquareActiveGiftDialogView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f45805c;

    /* JADX INFO: renamed from: d */
    public VText f45806d;

    /* JADX INFO: renamed from: e */
    public VText f45807e;

    /* JADX INFO: renamed from: f */
    public VText f45808f;

    /* JADX INFO: renamed from: g */
    public VText f45809g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareActiveGiftDialogView$a */
    public class C12559a extends er2 {
        public C12559a() {
        }

        @Override // p149l.n3m
        public String pageId() {
            return "p_live_popup";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareActiveGiftDialogView$b */
    public class ViewOnClickListenerC12560b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f45811a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LiveSquareActiveGiftBean f45812b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ dd80 f45813c;

        public ViewOnClickListenerC12560b(Act act, LiveSquareActiveGiftBean liveSquareActiveGiftBean, dd80 dd80Var) {
            this.f45811a = act;
            this.f45812b = liveSquareActiveGiftBean;
            this.f45813c = dd80Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            tht.m188929b(this.f45811a, Uri.parse(this.f45812b.getGotoSchema()));
            HashMap map = new HashMap();
            map.put("live_popup_type", this.f45812b.getPopupType());
            map.put("live_user_type", this.f45812b.getUserType());
            zvf0.m220397s("e_live_popup_confirm", "p_live_popup", map);
            IntlLiveSquareActiveGiftDialogView.this.m70346R(this.f45811a, this.f45813c);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareActiveGiftDialogView$c */
    public class ViewOnClickListenerC12561c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LiveSquareActiveGiftBean f45815a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f45816b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ dd80 f45817c;

        public ViewOnClickListenerC12561c(LiveSquareActiveGiftBean liveSquareActiveGiftBean, Act act, dd80 dd80Var) {
            this.f45815a = liveSquareActiveGiftBean;
            this.f45816b = act;
            this.f45817c = dd80Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HashMap map = new HashMap();
            map.put("live_popup_type", this.f45815a.getPopupType());
            map.put("live_user_type", this.f45815a.getUserType());
            zvf0.m220397s("e_live_active_gift_popup_close", "p_live_popup", map);
            IntlLiveSquareActiveGiftDialogView.this.m70346R(this.f45816b, this.f45817c);
        }
    }

    public IntlLiveSquareActiveGiftDialogView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: Q */
    public final void m70345Q(View view) {
        nzn.m162079a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public final void m70346R(Act act, dd80 dd80Var) {
        if (act.isFinishing() || !dd80Var.isShowing()) {
            return;
        }
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: S */
    public void m70347S(Act act, dd80 dd80Var, LiveSquareActiveGiftBean liveSquareActiveGiftBean) {
        if (liveSquareActiveGiftBean == null || dd80Var == null) {
            return;
        }
        cwf0 cwf0Var = new cwf0(new C12559a());
        cwf0Var.m109040p(new j760("live_popup_type", liveSquareActiveGiftBean.getPopupType()), new j760("live_user_type", liveSquareActiveGiftBean.getUserType()));
        cwf0Var.m109033i();
        cwf0Var.m109036l();
        hxs.m133406s("context_square", this.f45805c, liveSquareActiveGiftBean.getPictureUrl());
        this.f45806d.setText(liveSquareActiveGiftBean.getTitle());
        this.f45807e.setText(liveSquareActiveGiftBean.getText());
        this.f45808f.setText(liveSquareActiveGiftBean.getGotoText());
        this.f45809g.setText(liveSquareActiveGiftBean.getCancelText());
        xdl0.m208329E0(this.f45808f, new ViewOnClickListenerC12560b(act, liveSquareActiveGiftBean, dd80Var));
        xdl0.m208329E0(this.f45809g, new ViewOnClickListenerC12561c(liveSquareActiveGiftBean, act, dd80Var));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70345Q(this);
    }

    public IntlLiveSquareActiveGiftDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLiveSquareActiveGiftDialogView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
