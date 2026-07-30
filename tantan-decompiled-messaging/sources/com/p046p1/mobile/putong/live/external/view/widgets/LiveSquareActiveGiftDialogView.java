package com.p046p1.mobile.putong.live.external.view.widgets;

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
import p149l.nwt;
import p149l.tht;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveSquareActiveGiftDialogView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f46320c;

    /* JADX INFO: renamed from: d */
    public VText f46321d;

    /* JADX INFO: renamed from: e */
    public VText f46322e;

    /* JADX INFO: renamed from: f */
    public VText f46323f;

    /* JADX INFO: renamed from: g */
    public VText f46324g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.view.widgets.LiveSquareActiveGiftDialogView$a */
    public class C12585a extends er2 {
        public C12585a() {
        }

        @Override // p149l.n3m
        public String pageId() {
            return "p_live_popup";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.view.widgets.LiveSquareActiveGiftDialogView$b */
    public class ViewOnClickListenerC12586b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f46326a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LiveSquareActiveGiftBean f46327b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ dd80 f46328c;

        public ViewOnClickListenerC12586b(Act act, LiveSquareActiveGiftBean liveSquareActiveGiftBean, dd80 dd80Var) {
            this.f46326a = act;
            this.f46327b = liveSquareActiveGiftBean;
            this.f46328c = dd80Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            tht.m188929b(this.f46326a, Uri.parse(this.f46327b.getGotoSchema()));
            HashMap map = new HashMap();
            map.put("live_popup_type", this.f46327b.getPopupType());
            map.put("live_user_type", this.f46327b.getUserType());
            zvf0.m220397s("e_live_popup_confirm", "p_live_popup", map);
            LiveSquareActiveGiftDialogView.this.m70906R(this.f46326a, this.f46328c);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.view.widgets.LiveSquareActiveGiftDialogView$c */
    public class ViewOnClickListenerC12587c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LiveSquareActiveGiftBean f46330a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f46331b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ dd80 f46332c;

        public ViewOnClickListenerC12587c(LiveSquareActiveGiftBean liveSquareActiveGiftBean, Act act, dd80 dd80Var) {
            this.f46330a = liveSquareActiveGiftBean;
            this.f46331b = act;
            this.f46332c = dd80Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HashMap map = new HashMap();
            map.put("live_popup_type", this.f46330a.getPopupType());
            map.put("live_user_type", this.f46330a.getUserType());
            zvf0.m220397s("e_live_active_gift_popup_close", "p_live_popup", map);
            LiveSquareActiveGiftDialogView.this.m70906R(this.f46331b, this.f46332c);
        }
    }

    public LiveSquareActiveGiftDialogView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public void m70906R(Act act, dd80 dd80Var) {
        if (act.isFinishing() || !dd80Var.isShowing()) {
            return;
        }
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: Q */
    public final void m70907Q(View view) {
        nwt.m161920a(this, view);
    }

    /* JADX INFO: renamed from: S */
    public void m70908S(Act act, dd80 dd80Var, LiveSquareActiveGiftBean liveSquareActiveGiftBean) {
        if (liveSquareActiveGiftBean == null || dd80Var == null) {
            return;
        }
        cwf0 cwf0Var = new cwf0(new C12585a());
        cwf0Var.m109040p(new j760("live_popup_type", liveSquareActiveGiftBean.getPopupType()), new j760("live_user_type", liveSquareActiveGiftBean.getUserType()));
        cwf0Var.m109033i();
        cwf0Var.m109036l();
        hxs.m133406s("context_square", this.f46320c, liveSquareActiveGiftBean.getPictureUrl());
        this.f46321d.setText(liveSquareActiveGiftBean.getTitle());
        this.f46322e.setText(liveSquareActiveGiftBean.getText());
        this.f46323f.setText(liveSquareActiveGiftBean.getGotoText());
        this.f46324g.setText(liveSquareActiveGiftBean.getCancelText());
        xdl0.m208329E0(this.f46323f, new ViewOnClickListenerC12586b(act, liveSquareActiveGiftBean, dd80Var));
        xdl0.m208329E0(this.f46324g, new ViewOnClickListenerC12587c(liveSquareActiveGiftBean, act, dd80Var));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70907Q(this);
    }

    public LiveSquareActiveGiftDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveSquareActiveGiftDialogView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
