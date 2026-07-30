package com.p000p1.mobile.putong.core.p001ui.dlg.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.data.RecentConversation;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.d30;
import l.eqh0;
import l.f30;
import l.j760;
import l.t100;
import l.xdl0;
import l.zvf0;
import p003l.jk50;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class OnlineMatchDlgView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f1471c;

    /* JADX INFO: renamed from: d */
    public VText f1472d;

    /* JADX INFO: renamed from: e */
    public VLinear f1473e;

    /* JADX INFO: renamed from: f */
    public OnlineMatchDlgItemView f1474f;

    /* JADX INFO: renamed from: g */
    public OnlineMatchDlgItemView f1475g;

    /* JADX INFO: renamed from: h */
    public OnlineMatchDlgItemView f1476h;

    public OnlineMatchDlgView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Act act() {
        return getContext();
    }

    /* JADX INFO: renamed from: T */
    public final void m2591T(View view) {
        jk50.m7425a(this, view);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m2592V(d30 d30Var, String str, Integer num) {
        act().startActivity(MessagesAct.k2(act(), str, false, false, 30));
        zvf0.u("e_quickchat_again_popup_choose", "p_quickchat_again_popup", new j760[]{j760.a("which_number", num), j760.a("again_is_quickchat", Boolean.valueOf(CoreModule.c.e0.Pa(str).onlineMatch())), j760.a("other_user_id", str)});
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: W */
    public void m2593W(String str, String str2, final List<RecentConversation> list, final d30 d30Var) {
        this.f1471c.setText(str);
        this.f1472d.setText(str2);
        final f30 f30Var = new f30() { // from class: l.fk50
            public final void call(Object obj, Object obj2) {
                this.f4448a.m2592V(d30Var, (String) obj, (Integer) obj2);
            }
        };
        if (list.size() >= 3) {
            ViewGroup.LayoutParams layoutParams = this.f1473e.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i = t100.m;
                marginLayoutParams.rightMargin = i;
                marginLayoutParams.leftMargin = i;
            }
            this.f1473e.setLayoutParams(layoutParams);
        }
        if (list.size() > 0) {
            this.f1474f.m2586V(list.get(0), new d30() { // from class: l.gk50
                public final void call() {
                    f30Var.call(((RecentConversation) list.get(0)).otherUserID, 1);
                }
            });
        }
        int size = list.size();
        VLinear vLinear = this.f1475g;
        if (size > 1) {
            xdl0.M(vLinear, true);
            this.f1475g.m2586V(list.get(1), new d30() { // from class: l.hk50
                public final void call() {
                    f30Var.call(((RecentConversation) list.get(1)).otherUserID, 2);
                }
            });
        } else {
            xdl0.M(vLinear, false);
        }
        int size2 = list.size();
        VLinear vLinear2 = this.f1476h;
        if (size2 <= 2) {
            xdl0.M(vLinear2, false);
        } else {
            xdl0.M(vLinear2, true);
            this.f1476h.m2586V(list.get(2), new d30() { // from class: l.ik50
                public final void call() {
                    f30Var.call(((RecentConversation) list.get(2)).otherUserID, 3);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2591T(this);
        this.f1471c.setTypeface(eqh0.c(3), 1);
    }

    public void setTitle(String str) {
        this.f1471c.setText(str);
    }

    public OnlineMatchDlgView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OnlineMatchDlgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
