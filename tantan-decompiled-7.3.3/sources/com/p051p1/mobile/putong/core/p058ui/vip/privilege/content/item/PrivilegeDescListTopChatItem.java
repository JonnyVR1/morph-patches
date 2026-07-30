package com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PrivilegeTopChat;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListTopChatItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VIcon;
import p151v.VLinear;
import p151v.VText;
import p153l.a690;
import p153l.bnl0;
import p153l.h390;
import p153l.j690;
import p153l.jic0;
import p153l.jyb;
import p153l.kec0;
import p153l.m190;
import p153l.m590;
import p153l.psd0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeDescListTopChatItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f38564a;

    /* JADX INFO: renamed from: b */
    public VIcon f38565b;

    /* JADX INFO: renamed from: c */
    public VText f38566c;

    /* JADX INFO: renamed from: d */
    public VText f38567d;

    /* JADX INFO: renamed from: e */
    public VIcon f38568e;

    /* JADX INFO: renamed from: f */
    public VLinear f38569f;

    /* JADX INFO: renamed from: g */
    public View f38570g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListTopChatItem$a */
    public static class C9163a implements h390 {

        /* JADX INFO: renamed from: a */
        public PrivilegeDescListItem.C9151a.a f38571a;

        public C9163a(PrivilegeDescListItem.C9151a.a aVar) {
            this.f38571a = aVar;
        }

        @Override // p153l.h390
        public int getItemType() {
            return 9;
        }
    }

    public PrivilegeDescListTopChatItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m58463b(C9163a c9163a, View view) {
        if (NullChecker.m82486a(c9163a.f38571a)) {
            c9163a.f38571a.mo58110a(view, Privilege.top_chat);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m58464c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public final void m58465d(View view) {
        m590.m157096a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m58466e(x20 x20Var, jic0 jic0Var, PutongFrag putongFrag, List list) {
        if (jyb.m147479J(list)) {
            x20Var.call();
        } else {
            m58468g(list, jic0Var, putongFrag);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m58467f(final jic0<h390> jic0Var, final PutongFrag putongFrag, final C9163a c9163a, PurchaseType purchaseType, final x20 x20Var) {
        Privilege privilege = Privilege.top_chat;
        a690 a690VarM143621m = j690.m143621m(purchaseType, privilege);
        this.f38565b.setImageResource(m190.m156633d(privilege));
        this.f38566c.setText(a690VarM143621m.m96314t().toString());
        this.f38567d.setText(a690VarM143621m.m96311q().toString());
        bnl0.m105524M(this.f38568e, false);
        this.f38564a.setOnClickListener(new View.OnClickListener() { // from class: l.j590
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivilegeDescListTopChatItem.m58463b(c9163a, view);
            }
        });
        List<PrivilegeTopChat> listM172811k3 = CoreModule.f18264c.f20383e2.m172811k3();
        if (jyb.m147479J(listM172811k3)) {
            jic0Var.mo68557c(putongFrag, CoreModule.f18264c.f20383e2.m172819s3()).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.k590
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f123987a.m58466e(x20Var, jic0Var, putongFrag, (List) obj);
                }
            }, new y20() { // from class: l.l590
                @Override // p153l.y20
                public final void call(Object obj) {
                    PrivilegeDescListTopChatItem.m58464c((Throwable) obj);
                }
            }));
        } else {
            m58468g(listM172811k3, jic0Var, putongFrag);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m58468g(List<PrivilegeTopChat> list, jic0<h390> jic0Var, PutongFrag putongFrag) {
        PrivilegeDescChatListItem privilegeDescChatListItem;
        for (int i = 0; i < this.f38569f.getChildCount(); i++) {
            bnl0.m105524M(this.f38569f.getChildAt(i), false);
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (this.f38569f.getChildCount() > i2) {
                privilegeDescChatListItem = (PrivilegeDescChatListItem) this.f38569f.getChildAt(i2);
            } else {
                privilegeDescChatListItem = (PrivilegeDescChatListItem) putongFrag.mo21577H2().inflate(kec0.f125681W8, (ViewGroup) null, false);
                this.f38569f.addView(privilegeDescChatListItem);
            }
            bnl0.m105524M(privilegeDescChatListItem, true);
            privilegeDescChatListItem.m58280g(list.get(i2), jic0Var, putongFrag);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58465d(this);
        setDescendantFocusability(393216);
    }

    public PrivilegeDescListTopChatItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeDescListTopChatItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
