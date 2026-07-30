package com.p046p1.mobile.putong.core.p053ui.dlg.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.RecentConversation;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VLinear;
import p147v.VText;
import p149l.d30;
import p149l.eqh0;
import p149l.f30;
import p149l.j760;
import p149l.jk50;
import p149l.t100;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class OnlineMatchDlgView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f29077c;

    /* JADX INFO: renamed from: d */
    public VText f29078d;

    /* JADX INFO: renamed from: e */
    public VLinear f29079e;

    /* JADX INFO: renamed from: f */
    public OnlineMatchDlgItemView f29080f;

    /* JADX INFO: renamed from: g */
    public OnlineMatchDlgItemView f29081g;

    /* JADX INFO: renamed from: h */
    public OnlineMatchDlgItemView f29082h;

    public OnlineMatchDlgView(Context context) {
        this(context, null);
    }

    private Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: T */
    public final void m45272T(View view) {
        jk50.m141827a(this, view);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m45273V(d30 d30Var, String str, Integer num) {
        act().startActivity(MessagesAct.m48944k2(act(), str, false, false, 30));
        zvf0.m220399u("e_quickchat_again_popup_choose", "p_quickchat_again_popup", j760.m140076a("which_number", num), j760.m140076a("again_is_quickchat", Boolean.valueOf(CoreModule.f17545c.f19639e0.m169430Pa(str).onlineMatch())), j760.m140076a("other_user_id", str));
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: W */
    public void m45274W(String str, String str2, final List<RecentConversation> list, final d30 d30Var) {
        this.f29077c.setText(str);
        this.f29078d.setText(str2);
        final f30 f30Var = new f30() { // from class: l.fk50
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f98038a.m45273V(d30Var, (String) obj, (Integer) obj2);
            }
        };
        if (list.size() >= 3) {
            ViewGroup.LayoutParams layoutParams = this.f29079e.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i = t100.f167264m;
                marginLayoutParams.rightMargin = i;
                marginLayoutParams.leftMargin = i;
            }
            this.f29079e.setLayoutParams(layoutParams);
        }
        if (list.size() > 0) {
            this.f29080f.m45267V(list.get(0), new d30() { // from class: l.gk50
                @Override // p149l.d30
                public final void call() {
                    f30Var.call(((RecentConversation) list.get(0)).otherUserID, 1);
                }
            });
        }
        int size = list.size();
        OnlineMatchDlgItemView onlineMatchDlgItemView = this.f29081g;
        if (size > 1) {
            xdl0.m208344M(onlineMatchDlgItemView, true);
            this.f29081g.m45267V(list.get(1), new d30() { // from class: l.hk50
                @Override // p149l.d30
                public final void call() {
                    f30Var.call(((RecentConversation) list.get(1)).otherUserID, 2);
                }
            });
        } else {
            xdl0.m208344M(onlineMatchDlgItemView, false);
        }
        int size2 = list.size();
        OnlineMatchDlgItemView onlineMatchDlgItemView2 = this.f29082h;
        if (size2 <= 2) {
            xdl0.m208344M(onlineMatchDlgItemView2, false);
        } else {
            xdl0.m208344M(onlineMatchDlgItemView2, true);
            this.f29082h.m45267V(list.get(2), new d30() { // from class: l.ik50
                @Override // p149l.d30
                public final void call() {
                    f30Var.call(((RecentConversation) list.get(2)).otherUserID, 3);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45272T(this);
        this.f29077c.setTypeface(eqh0.m117752c(3), 1);
    }

    public void setTitle(String str) {
        this.f29077c.setText(str);
    }

    public OnlineMatchDlgView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OnlineMatchDlgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
