package com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.DrawableRes;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.RoamedLocationData;
import com.p046p1.mobile.putong.core.map.IntlMapAct;
import com.p046p1.mobile.putong.core.p053ui.vip.VipLocationHistoryAct;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.VipBaseFrag;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListItem;
import p147v.VIcon;
import p147v.VText;
import p149l.dac0;
import p149l.dv80;
import p149l.e30;
import p149l.eqh0;
import p149l.ev80;
import p149l.g6a;
import p149l.ljl0;
import p149l.mb90;
import p149l.mkd0;
import p149l.nu0;
import p149l.sab0;
import p149l.t100;
import p149l.w0c0;
import p149l.wvv;
import p149l.x2c0;
import p149l.xma;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeDescListItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VIcon f37598a;

    /* JADX INFO: renamed from: b */
    public VText f37599b;

    /* JADX INFO: renamed from: c */
    public VText f37600c;

    /* JADX INFO: renamed from: d */
    public RoamedLocationData f37601d;

    public PrivilegeDescListItem(Context context) {
        super(context);
        this.f37601d = RoamedLocationData.new_();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m57119c(C8988a c8988a, View view) {
        if (c8988a.f37605d != null) {
            c8988a.f37605d.mo56927a(view, c8988a.f37606e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m57120d(View view) {
        ev80.m118245a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m57121e(Act act) {
        if (ljl0.m149994n("p_select_location_view,e_manyou,click", act, null)) {
            wvv.m205766f();
            if (this.f37601d.data.size() >= 5) {
                act.startActivityForResult(VipLocationHistoryAct.m56276V1(act, VipBaseFrag.f37502B), 3);
            } else {
                act.startActivityForResult(IntlMapAct.m35946e2(act, 1, VipBaseFrag.f37502B), 2);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m57122f(RoamedLocationData roamedLocationData) {
        this.f37601d = roamedLocationData;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m57123g(PutongFrag putongFrag, View view) {
        m57121e(putongFrag.act());
    }

    /* JADX INFO: renamed from: h */
    public void m57124h(final C8988a c8988a, dac0<dv80> dac0Var, PutongFrag putongFrag) {
        this.f37598a.setImageResource(c8988a.f37602a);
        this.f37599b.setText(c8988a.f37603b);
        this.f37599b.setTypeface(eqh0.m117752c(3));
        if (sab0.m182891i(c8988a.f37607f) && g6a.m124566o()) {
            this.f37599b.setTextColor(getResources().getColor(w0c0.f183837c1));
            this.f37600c.setTextColor(getResources().getColor(w0c0.f183833b1));
        } else if (c8988a.f37607f == PurchaseType.TYPE_SUPREME_PARTNER) {
            this.f37599b.setTextColor(getResources().getColor(w0c0.f183879q0));
            this.f37600c.setTextColor(getResources().getColor(w0c0.f183828a0));
        } else {
            this.f37600c.setTextColor(Color.parseColor("#66000000"));
        }
        Privilege privilege = c8988a.f37606e;
        Privilege privilege2 = Privilege.oDiamondVisitor;
        VText vText = this.f37600c;
        if (privilege == privilege2) {
            vText.setText("知晓谁看过我的资料和动态");
        } else {
            vText.setText(c8988a.f37604c);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.av80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivilegeDescListItem.m57119c(c8988a, view);
            }
        });
        if (c8988a.f37606e == Privilege.vip_location) {
            m57125i(c8988a, dac0Var, putongFrag);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m57125i(C8988a c8988a, dac0<dv80> dac0Var, final PutongFrag putongFrag) {
        if (!mb90.m153866b(PurchaseType.TYPE_ROAMING_PKG) && xma.m210071e4()) {
            this.f37600c.setOnClickListener(null);
            this.f37600c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        this.f37600c.setText(R$string.f18837ps);
        this.f37600c.setTextColor(Color.parseColor("#DE9551"));
        this.f37600c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, nu0.m161424b(getContext(), x2c0.f189924Yk), (Drawable) null);
        dac0Var.mo67374c(putongFrag, CoreModule.f17545c.f19657k0.f20088R.m121230k()).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.bv80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77410a.m57122f((RoamedLocationData) obj);
            }
        }));
        this.f37600c.setOnClickListener(new View.OnClickListener() { // from class: l.cv80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82650a.m57123g(putongFrag, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57120d(this);
        setMinimumHeight(t100.f167235J);
        this.f37599b.setTextColor(getContext().getResources().getColor(w0c0.f183874o1));
        this.f37600c.setTextColor(getContext().getResources().getColor(w0c0.f183871n1));
        this.f37600c.setMaxLines(1);
    }

    public PrivilegeDescListItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37601d = RoamedLocationData.new_();
    }

    public PrivilegeDescListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37601d = RoamedLocationData.new_();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListItem$a */
    public static class C8988a implements dv80 {

        /* JADX INFO: renamed from: a */
        @DrawableRes
        public int f37602a;

        /* JADX INFO: renamed from: b */
        public String f37603b;

        /* JADX INFO: renamed from: c */
        public String f37604c;

        /* JADX INFO: renamed from: d */
        public a f37605d;

        /* JADX INFO: renamed from: e */
        public Privilege f37606e;

        /* JADX INFO: renamed from: f */
        public PurchaseType f37607f;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListItem$a$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo56927a(View view, Privilege privilege);
        }

        public C8988a(@DrawableRes int i, String str, String str2, Privilege privilege, a aVar, PurchaseType purchaseType) {
            this.f37602a = i;
            this.f37603b = str;
            this.f37604c = str2;
            this.f37606e = privilege;
            this.f37605d = aVar;
            this.f37607f = purchaseType;
        }

        /* JADX INFO: renamed from: g */
        public void m57132g(a aVar) {
            this.f37605d = aVar;
        }

        @Override // p149l.dv80
        public int getItemType() {
            return 1;
        }

        public C8988a(@DrawableRes int i, String str, String str2, Privilege privilege, PurchaseType purchaseType) {
            this(i, str, str2, privilege, null, purchaseType);
        }
    }
}
