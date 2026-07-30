package com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListTopChatItem;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PrivilegeTopChat;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.d30;
import l.dac0;
import l.e30;
import l.fy80;
import l.ix80;
import l.mkd0;
import l.vwb;
import l.xdl0;
import p006l.dv80;
import p006l.f6c0;
import p006l.it80;
import p006l.wx80;
import v.VIcon;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeDescListTopChatItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f7497a;

    /* JADX INFO: renamed from: b */
    public VIcon f7498b;

    /* JADX INFO: renamed from: c */
    public VText f7499c;

    /* JADX INFO: renamed from: d */
    public VText f7500d;

    /* JADX INFO: renamed from: e */
    public VIcon f7501e;

    /* JADX INFO: renamed from: f */
    public VLinear f7502f;

    /* JADX INFO: renamed from: g */
    public View f7503g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListTopChatItem$a */
    public static class C0436a implements dv80 {

        /* JADX INFO: renamed from: a */
        public PrivilegeDescListItem.C0424a.a f7504a;

        public C0436a(PrivilegeDescListItem.C0424a.a aVar) {
            this.f7504a = aVar;
        }

        @Override // p006l.dv80
        public int getItemType() {
            return 9;
        }
    }

    public PrivilegeDescListTopChatItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m10760b(C0436a c0436a, View view) {
        if (NullChecker.a(c0436a.f7504a)) {
            c0436a.f7504a.mo10398a(view, Privilege.top_chat);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m10761c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public final void m10762d(View view) {
        ix80.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m10763e(d30 d30Var, dac0 dac0Var, PutongFrag putongFrag, List list) {
        if (vwb.J(list)) {
            d30Var.call();
        } else {
            m10765g(list, dac0Var, putongFrag);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m10764f(final dac0<dv80> dac0Var, final PutongFrag putongFrag, final C0436a c0436a, PurchaseType purchaseType, final d30 d30Var) {
        Privilege privilege = Privilege.top_chat;
        wx80 wx80VarM = fy80.m(purchaseType, privilege);
        this.f7498b.setImageResource(it80.m17030d(privilege));
        this.f7499c.setText(wx80VarM.m26849t().toString());
        this.f7500d.setText(wx80VarM.m26846q().toString());
        xdl0.M(this.f7501e, false);
        this.f7497a.setOnClickListener(new View.OnClickListener() { // from class: l.fx80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivilegeDescListTopChatItem.m10760b(c0436a, view);
            }
        });
        List<PrivilegeTopChat> listM14067k3 = CoreModule.f1534c.f3630e2.m14067k3();
        if (vwb.J(listM14067k3)) {
            dac0Var.c(putongFrag, CoreModule.f1534c.f3630e2.m14075s3()).take(1).subscribe(mkd0.H(new e30() { // from class: l.gx80
                public final void call(Object obj) {
                    this.f13553a.m10763e(d30Var, dac0Var, putongFrag, (List) obj);
                }
            }, new e30() { // from class: l.hx80
                public final void call(Object obj) {
                    PrivilegeDescListTopChatItem.m10761c((Throwable) obj);
                }
            }));
        } else {
            m10765g(listM14067k3, dac0Var, putongFrag);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m10765g(List<PrivilegeTopChat> list, dac0<dv80> dac0Var, PutongFrag putongFrag) {
        PrivilegeDescChatListItem privilegeDescChatListItem;
        for (int i = 0; i < this.f7502f.getChildCount(); i++) {
            xdl0.M(this.f7502f.getChildAt(i), false);
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (this.f7502f.getChildCount() > i2) {
                privilegeDescChatListItem = (PrivilegeDescChatListItem) this.f7502f.getChildAt(i2);
            } else {
                privilegeDescChatListItem = (PrivilegeDescChatListItem) putongFrag.m1542H2().inflate(f6c0.f11929P8, (ViewGroup) null, false);
                this.f7502f.addView(privilegeDescChatListItem);
            }
            xdl0.M(privilegeDescChatListItem, true);
            privilegeDescChatListItem.m10568g(list.get(i2), dac0Var, putongFrag);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10762d(this);
        setDescendantFocusability(393216);
    }

    public PrivilegeDescListTopChatItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeDescListTopChatItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
