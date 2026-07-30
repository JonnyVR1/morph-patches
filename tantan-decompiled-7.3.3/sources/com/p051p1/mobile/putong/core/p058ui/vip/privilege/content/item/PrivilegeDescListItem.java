package com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.DrawableRes;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.RoamedLocationData;
import com.p051p1.mobile.putong.core.map.IntlMapAct;
import com.p051p1.mobile.putong.core.p058ui.vip.VipLocationHistoryAct;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.VipBaseFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListItem;
import p151v.VIcon;
import p151v.VText;
import p153l.c9c0;
import p153l.dbc0;
import p153l.h390;
import p153l.i390;
import p153l.jic0;
import p153l.joa;
import p153l.lyh0;
import p153l.psd0;
import p153l.psl0;
import p153l.qa00;
import p153l.qj90;
import p153l.s7a;
import p153l.tu0;
import p153l.wib0;
import p153l.xxv;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeDescListItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VIcon f38446a;

    /* JADX INFO: renamed from: b */
    public VText f38447b;

    /* JADX INFO: renamed from: c */
    public VText f38448c;

    /* JADX INFO: renamed from: d */
    public RoamedLocationData f38449d;

    public PrivilegeDescListItem(Context context) {
        super(context);
        this.f38449d = RoamedLocationData.new_();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m58302c(C9151a c9151a, View view) {
        if (c9151a.f38453d != null) {
            c9151a.f38453d.mo58110a(view, c9151a.f38454e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m58303d(View view) {
        i390.m138281a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m58304e(Act act) {
        if (psl0.m173668n("p_select_location_view,e_manyou,click", act, null)) {
            xxv.m213579f();
            if (this.f38449d.data.size() >= 5) {
                act.startActivityForResult(VipLocationHistoryAct.m57459X1(act, VipBaseFrag.f38350B), 3);
            } else {
                act.startActivityForResult(IntlMapAct.m36949g2(act, 1, VipBaseFrag.f38350B), 2);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m58305f(RoamedLocationData roamedLocationData) {
        this.f38449d = roamedLocationData;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m58306g(PutongFrag putongFrag, View view) {
        m58304e(putongFrag.act());
    }

    /* JADX INFO: renamed from: h */
    public void m58307h(final C9151a c9151a, jic0<h390> jic0Var, PutongFrag putongFrag) {
        this.f38446a.setImageResource(c9151a.f38450a);
        this.f38447b.setText(c9151a.f38451b);
        this.f38447b.setTypeface(lyh0.m156283c(3));
        if (wib0.m206565i(c9151a.f38455f) && s7a.m184986o()) {
            this.f38447b.setTextColor(getResources().getColor(c9c0.f80410d1));
            this.f38448c.setTextColor(getResources().getColor(c9c0.f80406c1));
        } else if (c9151a.f38455f == PurchaseType.TYPE_SUPREME_PARTNER) {
            this.f38447b.setTextColor(getResources().getColor(c9c0.f80452r0));
            this.f38448c.setTextColor(getResources().getColor(c9c0.f80401b0));
        } else {
            this.f38448c.setTextColor(Color.parseColor("#66000000"));
        }
        Privilege privilege = c9151a.f38454e;
        Privilege privilege2 = Privilege.oDiamondVisitor;
        VText vText = this.f38448c;
        if (privilege == privilege2) {
            vText.setText("知晓谁看过我的资料和动态");
        } else {
            vText.setText(c9151a.f38452c);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.e390
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivilegeDescListItem.m58302c(c9151a, view);
            }
        });
        if (c9151a.f38454e == Privilege.vip_location) {
            m58308i(c9151a, jic0Var, putongFrag);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m58308i(C9151a c9151a, jic0<h390> jic0Var, final PutongFrag putongFrag) {
        if (!qj90.m176830b(PurchaseType.TYPE_ROAMING_PKG) && joa.m146386f4()) {
            this.f38448c.setOnClickListener(null);
            this.f38448c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        this.f38448c.setText(R$string.f18655Ls);
        this.f38448c.setTextColor(Color.parseColor("#DE9551"));
        this.f38448c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, tu0.m192702b(getContext(), dbc0.f86382Ml), (Drawable) null);
        jic0Var.mo68557c(putongFrag, CoreModule.f18264c.f20399k0.f20830R.m159274k()).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.f390
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96975a.m58305f((RoamedLocationData) obj);
            }
        }));
        this.f38448c.setOnClickListener(new View.OnClickListener() { // from class: l.g390
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101967a.m58306g(putongFrag, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58303d(this);
        setMinimumHeight(qa00.f156297J);
        this.f38447b.setTextColor(getContext().getResources().getColor(c9c0.f80447p1));
        this.f38448c.setTextColor(getContext().getResources().getColor(c9c0.f80444o1));
        this.f38448c.setMaxLines(1);
    }

    public PrivilegeDescListItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38449d = RoamedLocationData.new_();
    }

    public PrivilegeDescListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38449d = RoamedLocationData.new_();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListItem$a */
    public static class C9151a implements h390 {

        /* JADX INFO: renamed from: a */
        @DrawableRes
        public int f38450a;

        /* JADX INFO: renamed from: b */
        public String f38451b;

        /* JADX INFO: renamed from: c */
        public String f38452c;

        /* JADX INFO: renamed from: d */
        public a f38453d;

        /* JADX INFO: renamed from: e */
        public Privilege f38454e;

        /* JADX INFO: renamed from: f */
        public PurchaseType f38455f;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListItem$a$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo58110a(View view, Privilege privilege);
        }

        public C9151a(@DrawableRes int i, String str, String str2, Privilege privilege, a aVar, PurchaseType purchaseType) {
            this.f38450a = i;
            this.f38451b = str;
            this.f38452c = str2;
            this.f38454e = privilege;
            this.f38453d = aVar;
            this.f38455f = purchaseType;
        }

        /* JADX INFO: renamed from: g */
        public void m58315g(a aVar) {
            this.f38453d = aVar;
        }

        @Override // p153l.h390
        public int getItemType() {
            return 1;
        }

        public C9151a(@DrawableRes int i, String str, String str2, Privilege privilege, PurchaseType purchaseType) {
            this(i, str, str2, privilege, null, purchaseType);
        }
    }
}
