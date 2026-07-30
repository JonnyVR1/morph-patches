package com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PrivilegeTopChat;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListTopChatItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VIcon;
import p147v.VLinear;
import p147v.VText;
import p149l.d30;
import p149l.dac0;
import p149l.dv80;
import p149l.e30;
import p149l.f6c0;
import p149l.fy80;
import p149l.it80;
import p149l.ix80;
import p149l.mkd0;
import p149l.vwb;
import p149l.wx80;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeDescListTopChatItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f37716a;

    /* JADX INFO: renamed from: b */
    public VIcon f37717b;

    /* JADX INFO: renamed from: c */
    public VText f37718c;

    /* JADX INFO: renamed from: d */
    public VText f37719d;

    /* JADX INFO: renamed from: e */
    public VIcon f37720e;

    /* JADX INFO: renamed from: f */
    public VLinear f37721f;

    /* JADX INFO: renamed from: g */
    public View f37722g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListTopChatItem$a */
    public static class C9000a implements dv80 {

        /* JADX INFO: renamed from: a */
        public PrivilegeDescListItem.C8988a.a f37723a;

        public C9000a(PrivilegeDescListItem.C8988a.a aVar) {
            this.f37723a = aVar;
        }

        @Override // p149l.dv80
        public int getItemType() {
            return 9;
        }
    }

    public PrivilegeDescListTopChatItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m57280b(C9000a c9000a, View view) {
        if (NullChecker.m81303a(c9000a.f37723a)) {
            c9000a.f37723a.mo56927a(view, Privilege.top_chat);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m57281c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public final void m57282d(View view) {
        ix80.m138793a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m57283e(d30 d30Var, dac0 dac0Var, PutongFrag putongFrag, List list) {
        if (vwb.m200296J(list)) {
            d30Var.call();
        } else {
            m57285g(list, dac0Var, putongFrag);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m57284f(final dac0<dv80> dac0Var, final PutongFrag putongFrag, final C9000a c9000a, PurchaseType purchaseType, final d30 d30Var) {
        Privilege privilege = Privilege.top_chat;
        wx80 wx80VarM123717m = fy80.m123717m(purchaseType, privilege);
        this.f37717b.setImageResource(it80.m138188d(privilege));
        this.f37718c.setText(wx80VarM123717m.m205968t().toString());
        this.f37719d.setText(wx80VarM123717m.m205965q().toString());
        xdl0.m208344M(this.f37720e, false);
        this.f37716a.setOnClickListener(new View.OnClickListener() { // from class: l.fx80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivilegeDescListTopChatItem.m57280b(c9000a, view);
            }
        });
        List<PrivilegeTopChat> listM112202k3 = CoreModule.f17545c.f19641e2.m112202k3();
        if (vwb.m200296J(listM112202k3)) {
            dac0Var.mo67374c(putongFrag, CoreModule.f17545c.f19641e2.m112210s3()).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.gx80
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f104837a.m57283e(d30Var, dac0Var, putongFrag, (List) obj);
                }
            }, new e30() { // from class: l.hx80
                @Override // p149l.e30
                public final void call(Object obj) {
                    PrivilegeDescListTopChatItem.m57281c((Throwable) obj);
                }
            }));
        } else {
            m57285g(listM112202k3, dac0Var, putongFrag);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m57285g(List<PrivilegeTopChat> list, dac0<dv80> dac0Var, PutongFrag putongFrag) {
        PrivilegeDescChatListItem privilegeDescChatListItem;
        for (int i = 0; i < this.f37721f.getChildCount(); i++) {
            xdl0.m208344M(this.f37721f.getChildAt(i), false);
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (this.f37721f.getChildCount() > i2) {
                privilegeDescChatListItem = (PrivilegeDescChatListItem) this.f37721f.getChildAt(i2);
            } else {
                privilegeDescChatListItem = (PrivilegeDescChatListItem) putongFrag.mo20578H2().inflate(f6c0.f95515P8, (ViewGroup) null, false);
                this.f37721f.addView(privilegeDescChatListItem);
            }
            xdl0.m208344M(privilegeDescChatListItem, true);
            privilegeDescChatListItem.m57097g(list.get(i2), dac0Var, putongFrag);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57282d(this);
        setDescendantFocusability(393216);
    }

    public PrivilegeDescListTopChatItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeDescListTopChatItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
