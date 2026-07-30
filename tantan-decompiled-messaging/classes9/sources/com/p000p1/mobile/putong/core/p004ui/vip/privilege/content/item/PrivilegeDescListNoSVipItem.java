package com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem;
import com.p1.mobile.putong.core.data.PurchaseType;
import java.util.List;
import l.d30;
import l.dac0;
import l.ov80;
import l.sab0;
import l.xdl0;
import p006l.dv80;
import p006l.f6c0;
import p006l.g6a;
import p006l.x2c0;
import v.VButton;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeDescListNoSVipItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public View f7403a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f7404b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f7405c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f7406d;

    /* JADX INFO: renamed from: e */
    public VButton f7407e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem$a */
    public static class C0427a implements dv80 {

        /* JADX INFO: renamed from: a */
        public a f7408a;

        /* JADX INFO: renamed from: b */
        public boolean f7409b;

        /* JADX INFO: renamed from: c */
        public PrivilegeDescListTitle.C0435a f7410c;

        /* JADX INFO: renamed from: d */
        public List<dv80> f7411d;

        /* JADX INFO: renamed from: e */
        public String f7412e;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem$a$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo10645a(View view);
        }

        public C0427a(PrivilegeDescListTitle.C0435a c0435a, String str, boolean z, List<dv80> list, a aVar) {
            this.f7410c = c0435a;
            this.f7409b = z;
            this.f7411d = list;
            this.f7408a = aVar;
            this.f7412e = str;
        }

        @Override // p006l.dv80
        public int getItemType() {
            return 2;
        }
    }

    public PrivilegeDescListNoSVipItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10626a(C0427a c0427a, View view) {
        if (c0427a.f7408a != null) {
            c0427a.f7408a.mo10645a(view);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m10627b(ViewGroup viewGroup, PrivilegeDescListTopChatItem privilegeDescListTopChatItem, List list, PrivilegeDescListTopChatItem.C0436a c0436a, dac0 dac0Var) {
        viewGroup.removeView(privilegeDescListTopChatItem);
        list.remove(c0436a);
        dac0Var.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: c */
    public final void m10628c(View view) {
        ov80.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListDiamondServiceItem] */
    /* JADX INFO: renamed from: d */
    public final void m10629d(ViewGroup viewGroup, PrivilegeDescListDiamondServiceItem.C0422a c0422a, dac0<dv80> dac0Var, PutongFrag putongFrag) {
        ?? r0 = (PrivilegeDescListDiamondServiceItem) View.inflate(getContext(), f6c0.f11977S8, null);
        r0.m10573w(c0422a);
        viewGroup.addView(r0);
    }

    /* JADX INFO: renamed from: e */
    public final void m10630e(ViewGroup viewGroup, PrivilegeDescListDiamondSkinItem.C0423a c0423a, dac0<dv80> dac0Var, PutongFrag putongFrag, PurchaseType purchaseType) {
        PrivilegeDescListDiamondSkinItem privilegeDescListDiamondSkinItem = (PrivilegeDescListDiamondSkinItem) View.inflate(getContext(), f6c0.f11961R8, null);
        privilegeDescListDiamondSkinItem.m10585i(c0423a, dac0Var, putongFrag, purchaseType);
        viewGroup.addView(privilegeDescListDiamondSkinItem);
    }

    /* JADX INFO: renamed from: f */
    public final void m10631f(ViewGroup viewGroup, PrivilegeDescListVisitorItem.C0437a c0437a, dac0<dv80> dac0Var, PutongFrag putongFrag, PurchaseType purchaseType) {
        PrivilegeDescListVisitorItem privilegeDescListVisitorItem = (PrivilegeDescListVisitorItem) View.inflate(getContext(), f6c0.f12174e9, null);
        privilegeDescListVisitorItem.m10784r(dac0Var, putongFrag, c0437a, purchaseType);
        viewGroup.addView(privilegeDescListVisitorItem);
    }

    /* JADX INFO: renamed from: g */
    public final void m10632g(ViewGroup viewGroup, PrivilegeDescListItem.C0424a c0424a, dac0<dv80> dac0Var, PutongFrag putongFrag) {
        PrivilegeDescListItem privilegeDescListItem = (PrivilegeDescListItem) View.inflate(getContext(), f6c0.f12009U8, null);
        privilegeDescListItem.m10595h(c0424a, dac0Var, putongFrag);
        viewGroup.addView(privilegeDescListItem);
    }

    /* JADX INFO: renamed from: h */
    public final void m10633h(ViewGroup viewGroup, PrivilegeDescListPartnerDressUpItem.C0428a c0428a, dac0<dv80> dac0Var, PutongFrag putongFrag) {
        PrivilegeDescListPartnerDressUpItem privilegeDescListPartnerDressUpItem = (PrivilegeDescListPartnerDressUpItem) View.inflate(getContext(), f6c0.f12191f9, null);
        privilegeDescListPartnerDressUpItem.m10661p(c0428a, dac0Var, putongFrag);
        viewGroup.addView(privilegeDescListPartnerDressUpItem);
    }

    /* JADX INFO: renamed from: i */
    public final void m10634i(ViewGroup viewGroup, PrivilegeDescListNearbyItem.C0425a c0425a, dac0<dv80> dac0Var, PutongFrag putongFrag, PurchaseType purchaseType) {
        PrivilegeDescListNearbyItem privilegeDescListNearbyItem = (PrivilegeDescListNearbyItem) View.inflate(getContext(), f6c0.f12025V8, null);
        privilegeDescListNearbyItem.m10611h(dac0Var, putongFrag, c0425a, purchaseType);
        viewGroup.addView(privilegeDescListNearbyItem);
    }

    /* JADX INFO: renamed from: j */
    public final void m10635j(final ViewGroup viewGroup, final PrivilegeDescListTopChatItem.C0436a c0436a, final dac0<dv80> dac0Var, PutongFrag putongFrag, final List<dv80> list) {
        final PrivilegeDescListTopChatItem privilegeDescListTopChatItem = (PrivilegeDescListTopChatItem) View.inflate(getContext(), f6c0.f12157d9, null);
        privilegeDescListTopChatItem.m10764f(dac0Var, putongFrag, c0436a, PurchaseType.TYPE_O_PLATINUM, new d30() { // from class: l.nv80
            public final void call() {
                PrivilegeDescListNoSVipItem.m10627b(viewGroup, privilegeDescListTopChatItem, list, c0436a, dac0Var);
            }
        });
        viewGroup.addView(privilegeDescListTopChatItem);
    }

    /* JADX INFO: renamed from: k */
    public final void m10636k(ViewGroup viewGroup, PrivilegeDescListSeeItem.C0432a c0432a, dac0<dv80> dac0Var, PutongFrag putongFrag, PurchaseType purchaseType) {
        PrivilegeDescListSeeItem privilegeDescListSeeItem = (PrivilegeDescListSeeItem) View.inflate(getContext(), f6c0.f12089Z8, null);
        privilegeDescListSeeItem.m10710j(dac0Var, putongFrag, c0432a, purchaseType);
        viewGroup.addView(privilegeDescListSeeItem);
    }

    /* JADX INFO: renamed from: l */
    public final void m10637l(ViewGroup viewGroup, C0439a c0439a, PurchaseType purchaseType) {
        PrivilegeDescListSvipContainerItem privilegeDescListSvipContainerItem = (PrivilegeDescListSvipContainerItem) View.inflate(getContext(), f6c0.f12123b9, null);
        privilegeDescListSvipContainerItem.m10747f(c0439a, purchaseType);
        viewGroup.addView(privilegeDescListSvipContainerItem);
    }

    /* JADX INFO: renamed from: m */
    public final void m10638m(ViewGroup viewGroup, PrivilegeDescListTitle.C0435a c0435a) {
        PrivilegeDescListTitle privilegeDescListTitle = (PrivilegeDescListTitle) View.inflate(getContext(), f6c0.f12140c9, null);
        privilegeDescListTitle.m10751d(c0435a);
        viewGroup.addView(privilegeDescListTitle);
    }

    /* JADX INFO: renamed from: n */
    public void m10639n(dac0<dv80> dac0Var, PutongFrag putongFrag, @NonNull final C0427a c0427a, PurchaseType purchaseType) {
        this.f7405c.removeAllViews();
        this.f7404b.removeAllViews();
        xdl0.M(this.f7403a, c0427a.f7409b);
        if (c0427a.f7410c != null) {
            m10638m(this.f7404b, c0427a.f7410c);
        }
        for (dv80 dv80Var : c0427a.f7411d) {
            if (dv80Var instanceof PrivilegeDescListItem.C0424a) {
                m10632g(this.f7405c, (PrivilegeDescListItem.C0424a) dv80Var, dac0Var, putongFrag);
            } else if (dv80Var instanceof PrivilegeDescListSeeItem.C0432a) {
                m10636k(this.f7405c, (PrivilegeDescListSeeItem.C0432a) dv80Var, dac0Var, putongFrag, purchaseType);
            } else if (dv80Var instanceof C0439a) {
                m10637l(this.f7405c, (C0439a) dv80Var, purchaseType);
            } else if (dv80Var instanceof PrivilegeDescListDiamondSkinItem.C0423a) {
                m10630e(this.f7405c, (PrivilegeDescListDiamondSkinItem.C0423a) dv80Var, dac0Var, putongFrag, purchaseType);
            } else if (dv80Var instanceof PrivilegeDescListVisitorItem.C0437a) {
                m10631f(this.f7405c, (PrivilegeDescListVisitorItem.C0437a) dv80Var, dac0Var, putongFrag, purchaseType);
            } else if (dv80Var instanceof PrivilegeDescListDiamondServiceItem.C0422a) {
                m10629d(this.f7405c, (PrivilegeDescListDiamondServiceItem.C0422a) dv80Var, dac0Var, putongFrag);
            } else if (dv80Var instanceof PrivilegeDescListTopChatItem.C0436a) {
                m10635j(this.f7405c, (PrivilegeDescListTopChatItem.C0436a) dv80Var, dac0Var, putongFrag, c0427a.f7411d);
            } else if (dv80Var instanceof PrivilegeDescListPartnerDressUpItem.C0428a) {
                m10633h(this.f7405c, (PrivilegeDescListPartnerDressUpItem.C0428a) dv80Var, dac0Var, putongFrag);
            } else if (dv80Var instanceof PrivilegeDescListNearbyItem.C0425a) {
                m10634i(this.f7405c, (PrivilegeDescListNearbyItem.C0425a) dv80Var, dac0Var, putongFrag, purchaseType);
            }
        }
        this.f7407e.setText(c0427a.f7412e);
        this.f7407e.setOnClickListener(new View.OnClickListener() { // from class: l.mv80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivilegeDescListNoSVipItem.m10626a(c0427a, view);
            }
        });
        if (sab0.i(purchaseType) && g6a.m15592o()) {
            this.f7407e.setBackgroundResource(x2c0.f26087Mj);
            this.f7407e.setTextColor(Color.parseColor("#ffdea2"));
            this.f7406d.setBackgroundResource(x2c0.f26805ji);
        } else if (sab0.i(purchaseType)) {
            this.f7407e.setBackgroundResource(x2c0.f26087Mj);
            this.f7407e.setTextColor(Color.parseColor("#ffdea2"));
        } else if (sab0.o(purchaseType)) {
            this.f7406d.setBackgroundResource(x2c0.f26273Sj);
            this.f7407e.setBackgroundResource(x2c0.f26149Oj);
            this.f7407e.setTextColor(Color.parseColor("#FFFFFF"));
        } else if (sab0.u(purchaseType)) {
            this.f7406d.setBackgroundResource(x2c0.f26242Rj);
            this.f7407e.setBackgroundResource(x2c0.f26118Nj);
            this.f7407e.setTextColor(Color.parseColor("#FFD489"));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10628c(this);
        this.f7407e.setBackgroundResource(x2c0.f26032Kq);
    }

    public PrivilegeDescListNoSVipItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeDescListNoSVipItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
