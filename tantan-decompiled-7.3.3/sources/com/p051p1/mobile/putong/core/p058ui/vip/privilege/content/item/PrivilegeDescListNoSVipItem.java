package com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem;
import java.util.List;
import p151v.VButton;
import p153l.bnl0;
import p153l.dbc0;
import p153l.h390;
import p153l.jic0;
import p153l.kec0;
import p153l.s390;
import p153l.s7a;
import p153l.wib0;
import p153l.x20;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeDescListNoSVipItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public View f38470a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f38471b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f38472c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f38473d;

    /* JADX INFO: renamed from: e */
    public VButton f38474e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem$a */
    public static class C9154a implements h390 {

        /* JADX INFO: renamed from: a */
        public a f38475a;

        /* JADX INFO: renamed from: b */
        public boolean f38476b;

        /* JADX INFO: renamed from: c */
        public PrivilegeDescListTitle.C9162a f38477c;

        /* JADX INFO: renamed from: d */
        public List<h390> f38478d;

        /* JADX INFO: renamed from: e */
        public String f38479e;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem$a$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo58354a(View view);
        }

        public C9154a(PrivilegeDescListTitle.C9162a c9162a, String str, boolean z, List<h390> list, a aVar) {
            this.f38477c = c9162a;
            this.f38476b = z;
            this.f38478d = list;
            this.f38475a = aVar;
            this.f38479e = str;
        }

        @Override // p153l.h390
        public int getItemType() {
            return 2;
        }
    }

    public PrivilegeDescListNoSVipItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m58335a(C9154a c9154a, View view) {
        if (c9154a.f38475a != null) {
            c9154a.f38475a.mo58354a(view);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m58336b(ViewGroup viewGroup, PrivilegeDescListTopChatItem privilegeDescListTopChatItem, List list, PrivilegeDescListTopChatItem.C9163a c9163a, jic0 jic0Var) {
        viewGroup.removeView(privilegeDescListTopChatItem);
        list.remove(c9163a);
        jic0Var.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: c */
    public final void m58337c(View view) {
        s390.m184231a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m58338d(ViewGroup viewGroup, PrivilegeDescListDiamondServiceItem.C9149a c9149a, jic0<h390> jic0Var, PutongFrag putongFrag) {
        PrivilegeDescListDiamondServiceItem privilegeDescListDiamondServiceItem = (PrivilegeDescListDiamondServiceItem) View.inflate(getContext(), kec0.f125729Z8, null);
        privilegeDescListDiamondServiceItem.m58285w(c9149a);
        viewGroup.addView(privilegeDescListDiamondServiceItem);
    }

    /* JADX INFO: renamed from: e */
    public final void m58339e(ViewGroup viewGroup, PrivilegeDescListDiamondSkinItem.C9150a c9150a, jic0<h390> jic0Var, PutongFrag putongFrag, PurchaseType purchaseType) {
        PrivilegeDescListDiamondSkinItem privilegeDescListDiamondSkinItem = (PrivilegeDescListDiamondSkinItem) View.inflate(getContext(), kec0.f125713Y8, null);
        privilegeDescListDiamondSkinItem.m58297i(c9150a, jic0Var, putongFrag, purchaseType);
        viewGroup.addView(privilegeDescListDiamondSkinItem);
    }

    /* JADX INFO: renamed from: f */
    public final void m58340f(ViewGroup viewGroup, PrivilegeDescListVisitorItem.C9164a c9164a, jic0<h390> jic0Var, PutongFrag putongFrag, PurchaseType purchaseType) {
        PrivilegeDescListVisitorItem privilegeDescListVisitorItem = (PrivilegeDescListVisitorItem) View.inflate(getContext(), kec0.f125932l9, null);
        privilegeDescListVisitorItem.m58487r(jic0Var, putongFrag, c9164a, purchaseType);
        viewGroup.addView(privilegeDescListVisitorItem);
    }

    /* JADX INFO: renamed from: g */
    public final void m58341g(ViewGroup viewGroup, PrivilegeDescListItem.C9151a c9151a, jic0<h390> jic0Var, PutongFrag putongFrag) {
        PrivilegeDescListItem privilegeDescListItem = (PrivilegeDescListItem) View.inflate(getContext(), kec0.f125763b9, null);
        privilegeDescListItem.m58307h(c9151a, jic0Var, putongFrag);
        viewGroup.addView(privilegeDescListItem);
    }

    /* JADX INFO: renamed from: h */
    public final void m58342h(ViewGroup viewGroup, PrivilegeDescListPartnerDressUpItem.C9155a c9155a, jic0<h390> jic0Var, PutongFrag putongFrag) {
        PrivilegeDescListPartnerDressUpItem privilegeDescListPartnerDressUpItem = (PrivilegeDescListPartnerDressUpItem) View.inflate(getContext(), kec0.f125949m9, null);
        privilegeDescListPartnerDressUpItem.m58370p(c9155a, jic0Var, putongFrag);
        viewGroup.addView(privilegeDescListPartnerDressUpItem);
    }

    /* JADX INFO: renamed from: i */
    public final void m58343i(ViewGroup viewGroup, PrivilegeDescListNearbyItem.C9152a c9152a, jic0<h390> jic0Var, PutongFrag putongFrag, PurchaseType purchaseType) {
        PrivilegeDescListNearbyItem privilegeDescListNearbyItem = (PrivilegeDescListNearbyItem) View.inflate(getContext(), kec0.f125780c9, null);
        privilegeDescListNearbyItem.m58323h(jic0Var, putongFrag, c9152a, purchaseType);
        viewGroup.addView(privilegeDescListNearbyItem);
    }

    /* JADX INFO: renamed from: j */
    public final void m58344j(final ViewGroup viewGroup, final PrivilegeDescListTopChatItem.C9163a c9163a, final jic0<h390> jic0Var, PutongFrag putongFrag, final List<h390> list) {
        final PrivilegeDescListTopChatItem privilegeDescListTopChatItem = (PrivilegeDescListTopChatItem) View.inflate(getContext(), kec0.f125915k9, null);
        privilegeDescListTopChatItem.m58467f(jic0Var, putongFrag, c9163a, PurchaseType.TYPE_O_PLATINUM, new x20() { // from class: l.r390
            @Override // p153l.x20
            public final void call() {
                PrivilegeDescListNoSVipItem.m58336b(viewGroup, privilegeDescListTopChatItem, list, c9163a, jic0Var);
            }
        });
        viewGroup.addView(privilegeDescListTopChatItem);
    }

    /* JADX INFO: renamed from: k */
    public final void m58345k(ViewGroup viewGroup, PrivilegeDescListSeeItem.C9159a c9159a, jic0<h390> jic0Var, PutongFrag putongFrag, PurchaseType purchaseType) {
        PrivilegeDescListSeeItem privilegeDescListSeeItem = (PrivilegeDescListSeeItem) View.inflate(getContext(), kec0.f125848g9, null);
        privilegeDescListSeeItem.m58416j(jic0Var, putongFrag, c9159a, purchaseType);
        viewGroup.addView(privilegeDescListSeeItem);
    }

    /* JADX INFO: renamed from: l */
    public final void m58346l(ViewGroup viewGroup, C9166a c9166a, PurchaseType purchaseType) {
        PrivilegeDescListSvipContainerItem privilegeDescListSvipContainerItem = (PrivilegeDescListSvipContainerItem) View.inflate(getContext(), kec0.f125882i9, null);
        privilegeDescListSvipContainerItem.m58450f(c9166a, purchaseType);
        viewGroup.addView(privilegeDescListSvipContainerItem);
    }

    /* JADX INFO: renamed from: m */
    public final void m58347m(ViewGroup viewGroup, PrivilegeDescListTitle.C9162a c9162a) {
        PrivilegeDescListTitle privilegeDescListTitle = (PrivilegeDescListTitle) View.inflate(getContext(), kec0.f125898j9, null);
        privilegeDescListTitle.m58454d(c9162a);
        viewGroup.addView(privilegeDescListTitle);
    }

    /* JADX INFO: renamed from: n */
    public void m58348n(jic0<h390> jic0Var, PutongFrag putongFrag, @NonNull final C9154a c9154a, PurchaseType purchaseType) {
        this.f38472c.removeAllViews();
        this.f38471b.removeAllViews();
        bnl0.m105524M(this.f38470a, c9154a.f38476b);
        if (c9154a.f38477c != null) {
            m58347m(this.f38471b, c9154a.f38477c);
        }
        for (h390 h390Var : c9154a.f38478d) {
            if (h390Var instanceof PrivilegeDescListItem.C9151a) {
                m58341g(this.f38472c, (PrivilegeDescListItem.C9151a) h390Var, jic0Var, putongFrag);
            } else if (h390Var instanceof PrivilegeDescListSeeItem.C9159a) {
                m58345k(this.f38472c, (PrivilegeDescListSeeItem.C9159a) h390Var, jic0Var, putongFrag, purchaseType);
            } else if (h390Var instanceof C9166a) {
                m58346l(this.f38472c, (C9166a) h390Var, purchaseType);
            } else if (h390Var instanceof PrivilegeDescListDiamondSkinItem.C9150a) {
                m58339e(this.f38472c, (PrivilegeDescListDiamondSkinItem.C9150a) h390Var, jic0Var, putongFrag, purchaseType);
            } else if (h390Var instanceof PrivilegeDescListVisitorItem.C9164a) {
                m58340f(this.f38472c, (PrivilegeDescListVisitorItem.C9164a) h390Var, jic0Var, putongFrag, purchaseType);
            } else if (h390Var instanceof PrivilegeDescListDiamondServiceItem.C9149a) {
                m58338d(this.f38472c, (PrivilegeDescListDiamondServiceItem.C9149a) h390Var, jic0Var, putongFrag);
            } else if (h390Var instanceof PrivilegeDescListTopChatItem.C9163a) {
                m58344j(this.f38472c, (PrivilegeDescListTopChatItem.C9163a) h390Var, jic0Var, putongFrag, c9154a.f38478d);
            } else if (h390Var instanceof PrivilegeDescListPartnerDressUpItem.C9155a) {
                m58342h(this.f38472c, (PrivilegeDescListPartnerDressUpItem.C9155a) h390Var, jic0Var, putongFrag);
            } else if (h390Var instanceof PrivilegeDescListNearbyItem.C9152a) {
                m58343i(this.f38472c, (PrivilegeDescListNearbyItem.C9152a) h390Var, jic0Var, putongFrag, purchaseType);
            }
        }
        this.f38474e.setText(c9154a.f38479e);
        this.f38474e.setOnClickListener(new View.OnClickListener() { // from class: l.q390
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivilegeDescListNoSVipItem.m58335a(c9154a, view);
            }
        });
        if (wib0.m206565i(purchaseType) && s7a.m184986o()) {
            this.f38474e.setBackgroundResource(dbc0.f85997Ak);
            this.f38474e.setTextColor(Color.parseColor("#ffdea2"));
            this.f38473d.setBackgroundResource(dbc0.f86731Xi);
        } else if (wib0.m206565i(purchaseType)) {
            this.f38474e.setBackgroundResource(dbc0.f85997Ak);
            this.f38474e.setTextColor(Color.parseColor("#ffdea2"));
        } else if (wib0.m206571o(purchaseType)) {
            this.f38473d.setBackgroundResource(dbc0.f86189Gk);
            this.f38474e.setBackgroundResource(dbc0.f86061Ck);
            this.f38474e.setTextColor(Color.parseColor("#FFFFFF"));
        } else if (wib0.m206577u(purchaseType)) {
            this.f38473d.setBackgroundResource(dbc0.f86157Fk);
            this.f38474e.setBackgroundResource(dbc0.f86029Bk);
            this.f38474e.setTextColor(Color.parseColor("#FFD489"));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58337c(this);
        this.f38474e.setBackgroundResource(dbc0.f87621yr);
    }

    public PrivilegeDescListNoSVipItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeDescListNoSVipItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
