package com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem;
import java.util.List;
import p147v.VButton;
import p149l.d30;
import p149l.dac0;
import p149l.dv80;
import p149l.f6c0;
import p149l.g6a;
import p149l.ov80;
import p149l.sab0;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeDescListNoSVipItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public View f37622a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f37623b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f37624c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f37625d;

    /* JADX INFO: renamed from: e */
    public VButton f37626e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem$a */
    public static class C8991a implements dv80 {

        /* JADX INFO: renamed from: a */
        public a f37627a;

        /* JADX INFO: renamed from: b */
        public boolean f37628b;

        /* JADX INFO: renamed from: c */
        public PrivilegeDescListTitle.C8999a f37629c;

        /* JADX INFO: renamed from: d */
        public List<dv80> f37630d;

        /* JADX INFO: renamed from: e */
        public String f37631e;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem$a$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo57171a(View view);
        }

        public C8991a(PrivilegeDescListTitle.C8999a c8999a, String str, boolean z, List<dv80> list, a aVar) {
            this.f37629c = c8999a;
            this.f37628b = z;
            this.f37630d = list;
            this.f37627a = aVar;
            this.f37631e = str;
        }

        @Override // p149l.dv80
        public int getItemType() {
            return 2;
        }
    }

    public PrivilegeDescListNoSVipItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m57152a(C8991a c8991a, View view) {
        if (c8991a.f37627a != null) {
            c8991a.f37627a.mo57171a(view);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m57153b(ViewGroup viewGroup, PrivilegeDescListTopChatItem privilegeDescListTopChatItem, List list, PrivilegeDescListTopChatItem.C9000a c9000a, dac0 dac0Var) {
        viewGroup.removeView(privilegeDescListTopChatItem);
        list.remove(c9000a);
        dac0Var.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: c */
    public final void m57154c(View view) {
        ov80.m166161a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m57155d(ViewGroup viewGroup, PrivilegeDescListDiamondServiceItem.C8986a c8986a, dac0<dv80> dac0Var, PutongFrag putongFrag) {
        PrivilegeDescListDiamondServiceItem privilegeDescListDiamondServiceItem = (PrivilegeDescListDiamondServiceItem) View.inflate(getContext(), f6c0.f95563S8, null);
        privilegeDescListDiamondServiceItem.m57102w(c8986a);
        viewGroup.addView(privilegeDescListDiamondServiceItem);
    }

    /* JADX INFO: renamed from: e */
    public final void m57156e(ViewGroup viewGroup, PrivilegeDescListDiamondSkinItem.C8987a c8987a, dac0<dv80> dac0Var, PutongFrag putongFrag, PurchaseType purchaseType) {
        PrivilegeDescListDiamondSkinItem privilegeDescListDiamondSkinItem = (PrivilegeDescListDiamondSkinItem) View.inflate(getContext(), f6c0.f95547R8, null);
        privilegeDescListDiamondSkinItem.m57114i(c8987a, dac0Var, putongFrag, purchaseType);
        viewGroup.addView(privilegeDescListDiamondSkinItem);
    }

    /* JADX INFO: renamed from: f */
    public final void m57157f(ViewGroup viewGroup, PrivilegeDescListVisitorItem.C9001a c9001a, dac0<dv80> dac0Var, PutongFrag putongFrag, PurchaseType purchaseType) {
        PrivilegeDescListVisitorItem privilegeDescListVisitorItem = (PrivilegeDescListVisitorItem) View.inflate(getContext(), f6c0.f95760e9, null);
        privilegeDescListVisitorItem.m57304r(dac0Var, putongFrag, c9001a, purchaseType);
        viewGroup.addView(privilegeDescListVisitorItem);
    }

    /* JADX INFO: renamed from: g */
    public final void m57158g(ViewGroup viewGroup, PrivilegeDescListItem.C8988a c8988a, dac0<dv80> dac0Var, PutongFrag putongFrag) {
        PrivilegeDescListItem privilegeDescListItem = (PrivilegeDescListItem) View.inflate(getContext(), f6c0.f95595U8, null);
        privilegeDescListItem.m57124h(c8988a, dac0Var, putongFrag);
        viewGroup.addView(privilegeDescListItem);
    }

    /* JADX INFO: renamed from: h */
    public final void m57159h(ViewGroup viewGroup, PrivilegeDescListPartnerDressUpItem.C8992a c8992a, dac0<dv80> dac0Var, PutongFrag putongFrag) {
        PrivilegeDescListPartnerDressUpItem privilegeDescListPartnerDressUpItem = (PrivilegeDescListPartnerDressUpItem) View.inflate(getContext(), f6c0.f95777f9, null);
        privilegeDescListPartnerDressUpItem.m57187p(c8992a, dac0Var, putongFrag);
        viewGroup.addView(privilegeDescListPartnerDressUpItem);
    }

    /* JADX INFO: renamed from: i */
    public final void m57160i(ViewGroup viewGroup, PrivilegeDescListNearbyItem.C8989a c8989a, dac0<dv80> dac0Var, PutongFrag putongFrag, PurchaseType purchaseType) {
        PrivilegeDescListNearbyItem privilegeDescListNearbyItem = (PrivilegeDescListNearbyItem) View.inflate(getContext(), f6c0.f95611V8, null);
        privilegeDescListNearbyItem.m57140h(dac0Var, putongFrag, c8989a, purchaseType);
        viewGroup.addView(privilegeDescListNearbyItem);
    }

    /* JADX INFO: renamed from: j */
    public final void m57161j(final ViewGroup viewGroup, final PrivilegeDescListTopChatItem.C9000a c9000a, final dac0<dv80> dac0Var, PutongFrag putongFrag, final List<dv80> list) {
        final PrivilegeDescListTopChatItem privilegeDescListTopChatItem = (PrivilegeDescListTopChatItem) View.inflate(getContext(), f6c0.f95743d9, null);
        privilegeDescListTopChatItem.m57284f(dac0Var, putongFrag, c9000a, PurchaseType.TYPE_O_PLATINUM, new d30() { // from class: l.nv80
            @Override // p149l.d30
            public final void call() {
                PrivilegeDescListNoSVipItem.m57153b(viewGroup, privilegeDescListTopChatItem, list, c9000a, dac0Var);
            }
        });
        viewGroup.addView(privilegeDescListTopChatItem);
    }

    /* JADX INFO: renamed from: k */
    public final void m57162k(ViewGroup viewGroup, PrivilegeDescListSeeItem.C8996a c8996a, dac0<dv80> dac0Var, PutongFrag putongFrag, PurchaseType purchaseType) {
        PrivilegeDescListSeeItem privilegeDescListSeeItem = (PrivilegeDescListSeeItem) View.inflate(getContext(), f6c0.f95675Z8, null);
        privilegeDescListSeeItem.m57233j(dac0Var, putongFrag, c8996a, purchaseType);
        viewGroup.addView(privilegeDescListSeeItem);
    }

    /* JADX INFO: renamed from: l */
    public final void m57163l(ViewGroup viewGroup, C9003a c9003a, PurchaseType purchaseType) {
        PrivilegeDescListSvipContainerItem privilegeDescListSvipContainerItem = (PrivilegeDescListSvipContainerItem) View.inflate(getContext(), f6c0.f95709b9, null);
        privilegeDescListSvipContainerItem.m57267f(c9003a, purchaseType);
        viewGroup.addView(privilegeDescListSvipContainerItem);
    }

    /* JADX INFO: renamed from: m */
    public final void m57164m(ViewGroup viewGroup, PrivilegeDescListTitle.C8999a c8999a) {
        PrivilegeDescListTitle privilegeDescListTitle = (PrivilegeDescListTitle) View.inflate(getContext(), f6c0.f95726c9, null);
        privilegeDescListTitle.m57271d(c8999a);
        viewGroup.addView(privilegeDescListTitle);
    }

    /* JADX INFO: renamed from: n */
    public void m57165n(dac0<dv80> dac0Var, PutongFrag putongFrag, @NonNull final C8991a c8991a, PurchaseType purchaseType) {
        this.f37624c.removeAllViews();
        this.f37623b.removeAllViews();
        xdl0.m208344M(this.f37622a, c8991a.f37628b);
        if (c8991a.f37629c != null) {
            m57164m(this.f37623b, c8991a.f37629c);
        }
        for (dv80 dv80Var : c8991a.f37630d) {
            if (dv80Var instanceof PrivilegeDescListItem.C8988a) {
                m57158g(this.f37624c, (PrivilegeDescListItem.C8988a) dv80Var, dac0Var, putongFrag);
            } else if (dv80Var instanceof PrivilegeDescListSeeItem.C8996a) {
                m57162k(this.f37624c, (PrivilegeDescListSeeItem.C8996a) dv80Var, dac0Var, putongFrag, purchaseType);
            } else if (dv80Var instanceof C9003a) {
                m57163l(this.f37624c, (C9003a) dv80Var, purchaseType);
            } else if (dv80Var instanceof PrivilegeDescListDiamondSkinItem.C8987a) {
                m57156e(this.f37624c, (PrivilegeDescListDiamondSkinItem.C8987a) dv80Var, dac0Var, putongFrag, purchaseType);
            } else if (dv80Var instanceof PrivilegeDescListVisitorItem.C9001a) {
                m57157f(this.f37624c, (PrivilegeDescListVisitorItem.C9001a) dv80Var, dac0Var, putongFrag, purchaseType);
            } else if (dv80Var instanceof PrivilegeDescListDiamondServiceItem.C8986a) {
                m57155d(this.f37624c, (PrivilegeDescListDiamondServiceItem.C8986a) dv80Var, dac0Var, putongFrag);
            } else if (dv80Var instanceof PrivilegeDescListTopChatItem.C9000a) {
                m57161j(this.f37624c, (PrivilegeDescListTopChatItem.C9000a) dv80Var, dac0Var, putongFrag, c8991a.f37630d);
            } else if (dv80Var instanceof PrivilegeDescListPartnerDressUpItem.C8992a) {
                m57159h(this.f37624c, (PrivilegeDescListPartnerDressUpItem.C8992a) dv80Var, dac0Var, putongFrag);
            } else if (dv80Var instanceof PrivilegeDescListNearbyItem.C8989a) {
                m57160i(this.f37624c, (PrivilegeDescListNearbyItem.C8989a) dv80Var, dac0Var, putongFrag, purchaseType);
            }
        }
        this.f37626e.setText(c8991a.f37631e);
        this.f37626e.setOnClickListener(new View.OnClickListener() { // from class: l.mv80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivilegeDescListNoSVipItem.m57152a(c8991a, view);
            }
        });
        if (sab0.m182891i(purchaseType) && g6a.m124566o()) {
            this.f37626e.setBackgroundResource(x2c0.f189551Mj);
            this.f37626e.setTextColor(Color.parseColor("#ffdea2"));
            this.f37625d.setBackgroundResource(x2c0.f190269ji);
        } else if (sab0.m182891i(purchaseType)) {
            this.f37626e.setBackgroundResource(x2c0.f189551Mj);
            this.f37626e.setTextColor(Color.parseColor("#ffdea2"));
        } else if (sab0.m182897o(purchaseType)) {
            this.f37625d.setBackgroundResource(x2c0.f189737Sj);
            this.f37626e.setBackgroundResource(x2c0.f189613Oj);
            this.f37626e.setTextColor(Color.parseColor("#FFFFFF"));
        } else if (sab0.m182903u(purchaseType)) {
            this.f37625d.setBackgroundResource(x2c0.f189706Rj);
            this.f37626e.setBackgroundResource(x2c0.f189582Nj);
            this.f37626e.setTextColor(Color.parseColor("#FFD489"));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57154c(this);
        this.f37626e.setBackgroundResource(x2c0.f189496Kq);
    }

    public PrivilegeDescListNoSVipItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeDescListNoSVipItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
