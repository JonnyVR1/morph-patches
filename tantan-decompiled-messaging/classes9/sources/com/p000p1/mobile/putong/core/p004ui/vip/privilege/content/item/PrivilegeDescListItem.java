package com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.DrawableRes;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.vip.VipLocationHistoryAct;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.VipBaseFrag;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListItem;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.RoamedLocationData;
import com.p1.mobile.putong.core.map.IntlMapAct;
import l.dac0;
import l.e30;
import l.eqh0;
import l.ev80;
import l.mb90;
import l.mkd0;
import l.nu0;
import l.sab0;
import l.t100;
import l.wvv;
import p006l.dv80;
import p006l.g6a;
import p006l.ljl0;
import p006l.w0c0;
import p006l.x2c0;
import p006l.xma;
import v.VIcon;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeDescListItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VIcon f7379a;

    /* JADX INFO: renamed from: b */
    public VText f7380b;

    /* JADX INFO: renamed from: c */
    public VText f7381c;

    /* JADX INFO: renamed from: d */
    public RoamedLocationData f7382d;

    public PrivilegeDescListItem(Context context) {
        super(context);
        this.f7382d = RoamedLocationData.new_();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m10590c(C0424a c0424a, View view) {
        if (c0424a.f7386d != null) {
            c0424a.f7386d.mo10398a(view, c0424a.f7387e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m10591d(View view) {
        ev80.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m10592e(Act act) {
        if (ljl0.m18808n("p_select_location_view,e_manyou,click", act, null)) {
            wvv.f();
            if (this.f7382d.data.size() >= 5) {
                act.startActivityForResult(VipLocationHistoryAct.m9710V1(act, VipBaseFrag.f7283B), 3);
            } else {
                act.startActivityForResult(IntlMapAct.e2(act, 1, VipBaseFrag.f7283B), 2);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m10593f(RoamedLocationData roamedLocationData) {
        this.f7382d = roamedLocationData;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m10594g(PutongFrag putongFrag, View view) {
        m10592e(putongFrag.act());
    }

    /* JADX INFO: renamed from: h */
    public void m10595h(final C0424a c0424a, dac0<dv80> dac0Var, PutongFrag putongFrag) {
        this.f7379a.setImageResource(c0424a.f7383a);
        this.f7380b.setText(c0424a.f7384b);
        this.f7380b.setTypeface(eqh0.c(3));
        if (sab0.i(c0424a.f7388f) && g6a.m15592o()) {
            this.f7380b.setTextColor(getResources().getColor(w0c0.f24677c1));
            this.f7381c.setTextColor(getResources().getColor(w0c0.f24673b1));
        } else if (c0424a.f7388f == PurchaseType.TYPE_SUPREME_PARTNER) {
            this.f7380b.setTextColor(getResources().getColor(w0c0.f24719q0));
            this.f7381c.setTextColor(getResources().getColor(w0c0.f24668a0));
        } else {
            this.f7381c.setTextColor(Color.parseColor("#66000000"));
        }
        Privilege privilege = c0424a.f7387e;
        Privilege privilege2 = Privilege.oDiamondVisitor;
        VText vText = this.f7381c;
        if (privilege == privilege2) {
            vText.setText("知晓谁看过我的资料和动态");
        } else {
            vText.setText(c0424a.f7385c);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.av80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivilegeDescListItem.m10590c(c0424a, view);
            }
        });
        if (c0424a.f7387e == Privilege.vip_location) {
            m10596i(c0424a, dac0Var, putongFrag);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m10596i(C0424a c0424a, dac0<dv80> dac0Var, final PutongFrag putongFrag) {
        if (!mb90.b(PurchaseType.TYPE_ROAMING_PKG) && xma.m27379e4()) {
            this.f7381c.setOnClickListener(null);
            this.f7381c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        this.f7381c.setText(R$string.f2826ps);
        this.f7381c.setTextColor(Color.parseColor("#DE9551"));
        this.f7381c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, nu0.b(getContext(), x2c0.f26460Yk), (Drawable) null);
        dac0Var.c(putongFrag, CoreModule.f1534c.f3646k0.f4077R.k()).take(1).subscribe(mkd0.G(new e30() { // from class: l.bv80
            public final void call(Object obj) {
                this.f9100a.m10593f((RoamedLocationData) obj);
            }
        }));
        this.f7381c.setOnClickListener(new View.OnClickListener() { // from class: l.cv80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9871a.m10594g(putongFrag, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10591d(this);
        setMinimumHeight(t100.J);
        this.f7380b.setTextColor(getContext().getResources().getColor(w0c0.f24714o1));
        this.f7381c.setTextColor(getContext().getResources().getColor(w0c0.f24711n1));
        this.f7381c.setMaxLines(1);
    }

    public PrivilegeDescListItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7382d = RoamedLocationData.new_();
    }

    public PrivilegeDescListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7382d = RoamedLocationData.new_();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListItem$a */
    public static class C0424a implements dv80 {

        /* JADX INFO: renamed from: a */
        @DrawableRes
        public int f7383a;

        /* JADX INFO: renamed from: b */
        public String f7384b;

        /* JADX INFO: renamed from: c */
        public String f7385c;

        /* JADX INFO: renamed from: d */
        public a f7386d;

        /* JADX INFO: renamed from: e */
        public Privilege f7387e;

        /* JADX INFO: renamed from: f */
        public PurchaseType f7388f;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListItem$a$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo10398a(View view, Privilege privilege);
        }

        public C0424a(@DrawableRes int i, String str, String str2, Privilege privilege, a aVar, PurchaseType purchaseType) {
            this.f7383a = i;
            this.f7384b = str;
            this.f7385c = str2;
            this.f7387e = privilege;
            this.f7386d = aVar;
            this.f7388f = purchaseType;
        }

        /* JADX INFO: renamed from: g */
        public void m10603g(a aVar) {
            this.f7386d = aVar;
        }

        @Override // p006l.dv80
        public int getItemType() {
            return 1;
        }

        public C0424a(@DrawableRes int i, String str, String str2, Privilege privilege, PurchaseType purchaseType) {
            this(i, str, str2, privilege, null, purchaseType);
        }
    }
}
