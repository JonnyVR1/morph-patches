package com.p051p1.mobile.putong.core.p058ui.dlg.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.RecentConversation;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.i4g0;
import p153l.lyh0;
import p153l.pf60;
import p153l.ps50;
import p153l.qa00;
import p153l.x20;
import p153l.z20;

/* JADX INFO: loaded from: classes2.dex */
public class OnlineMatchDlgView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f29925c;

    /* JADX INFO: renamed from: d */
    public VText f29926d;

    /* JADX INFO: renamed from: e */
    public VLinear f29927e;

    /* JADX INFO: renamed from: f */
    public OnlineMatchDlgItemView f29928f;

    /* JADX INFO: renamed from: g */
    public OnlineMatchDlgItemView f29929g;

    /* JADX INFO: renamed from: h */
    public OnlineMatchDlgItemView f29930h;

    public OnlineMatchDlgView(Context context) {
        this(context, null);
    }

    private Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: T */
    public final void m46455T(View view) {
        ps50.m173589a(this, view);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m46456V(x20 x20Var, String str, Integer num) {
        act().startActivity(MessagesAct.m50127l2(act(), str, false, false, 30));
        i4g0.m138523u("e_quickchat_again_popup_choose", "p_quickchat_again_popup", pf60.m172085a("which_number", num), pf60.m172085a("again_is_quickchat", Boolean.valueOf(CoreModule.f18264c.f20381e0.m116503Pa(str).onlineMatch())), pf60.m172085a("other_user_id", str));
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: W */
    public void m46457W(String str, String str2, final List<RecentConversation> list, final x20 x20Var) {
        this.f29925c.setText(str);
        this.f29926d.setText(str2);
        final z20 z20Var = new z20() { // from class: l.ls50
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f133401a.m46456V(x20Var, (String) obj, (Integer) obj2);
            }
        };
        if (list.size() >= 3) {
            ViewGroup.LayoutParams layoutParams = this.f29927e.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i = qa00.f156326m;
                marginLayoutParams.rightMargin = i;
                marginLayoutParams.leftMargin = i;
            }
            this.f29927e.setLayoutParams(layoutParams);
        }
        if (list.size() > 0) {
            this.f29928f.m46450V(list.get(0), new x20() { // from class: l.ms50
                @Override // p153l.x20
                public final void call() {
                    z20Var.call(((RecentConversation) list.get(0)).otherUserID, 1);
                }
            });
        }
        int size = list.size();
        OnlineMatchDlgItemView onlineMatchDlgItemView = this.f29929g;
        if (size > 1) {
            bnl0.m105524M(onlineMatchDlgItemView, true);
            this.f29929g.m46450V(list.get(1), new x20() { // from class: l.ns50
                @Override // p153l.x20
                public final void call() {
                    z20Var.call(((RecentConversation) list.get(1)).otherUserID, 2);
                }
            });
        } else {
            bnl0.m105524M(onlineMatchDlgItemView, false);
        }
        int size2 = list.size();
        OnlineMatchDlgItemView onlineMatchDlgItemView2 = this.f29930h;
        if (size2 <= 2) {
            bnl0.m105524M(onlineMatchDlgItemView2, false);
        } else {
            bnl0.m105524M(onlineMatchDlgItemView2, true);
            this.f29930h.m46450V(list.get(2), new x20() { // from class: l.os50
                @Override // p153l.x20
                public final void call() {
                    z20Var.call(((RecentConversation) list.get(2)).otherUserID, 3);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46455T(this);
        this.f29925c.setTypeface(lyh0.m156283c(3), 1);
    }

    public void setTitle(String str) {
        this.f29925c.setText(str);
    }

    public OnlineMatchDlgView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OnlineMatchDlgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
