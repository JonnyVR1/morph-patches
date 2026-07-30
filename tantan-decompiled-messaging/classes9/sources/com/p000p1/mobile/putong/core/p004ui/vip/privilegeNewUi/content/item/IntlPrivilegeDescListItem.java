package com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.item;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.DrawableRes;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.vip.VipLocationHistoryAct;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.VipBaseFrag;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListItem;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.RoamedLocationData;
import com.p1.mobile.putong.core.map.IntlMapAct;
import com.tantanapp.common.utils.NullChecker;
import l.dac0;
import l.e30;
import l.mkd0;
import l.nu0;
import l.sab0;
import l.t100;
import l.vxo;
import l.wvv;
import l.xdl0;
import p006l.ljl0;
import p006l.sxo;
import p006l.w0c0;
import p006l.x2c0;
import p006l.xma;
import v.VIcon;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlPrivilegeDescListItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VIcon f7686a;

    /* JADX INFO: renamed from: b */
    public VText f7687b;

    /* JADX INFO: renamed from: c */
    public VText f7688c;

    /* JADX INFO: renamed from: d */
    public View f7689d;

    /* JADX INFO: renamed from: e */
    public RoamedLocationData f7690e;

    public IntlPrivilegeDescListItem(Context context) {
        super(context);
        this.f7690e = RoamedLocationData.new_();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m11137b(C0456a c0456a, View view) {
        C0456a.a aVar = c0456a.f7694d;
        if (aVar != null) {
            aVar.mo11132a(view, c0456a.f7695e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11139d(View view) {
        vxo.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m11140e(Act act) {
        if (ljl0.m18808n("p_select_location_view,e_manyou,click", act, null)) {
            wvv.f();
            if (this.f7690e.data.size() >= 5) {
                act.startActivityForResult(VipLocationHistoryAct.m9710V1(act, VipBaseFrag.f7283B), 3);
            } else {
                act.startActivityForResult(IntlMapAct.e2(act, 1, VipBaseFrag.f7283B), 2);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m11141f(RoamedLocationData roamedLocationData) {
        this.f7690e = roamedLocationData;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m11142g(PutongFrag putongFrag, View view) {
        m11140e(putongFrag.act());
    }

    /* JADX INFO: renamed from: h */
    public void m11143h(final C0456a c0456a, dac0<sxo> dac0Var, PutongFrag putongFrag) {
        PurchaseType purchaseType = c0456a.f7696f;
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            this.f7687b.setTextSize(18.0f);
            this.f7688c.setTextSize(12.0f);
            this.f7687b.setTextColor(Color.parseColor("#cce8ca8a"));
            this.f7688c.setTextColor(Color.parseColor("#66e8ca8a"));
            xdl0.X(this.f7686a, t100.d(20.0f));
            xdl0.U(this.f7686a, t100.d(20.0f));
            xdl0.M(this.f7689d, c0456a.f7695e != Privilege.message_read_state);
            this.f7689d.setBackgroundResource(x2c0.f26140Oa);
            xdl0.V(this.f7689d, t100.d(0.0f));
            xdl0.W(this.f7689d, t100.d(0.0f));
        } else {
            boolean zV = sab0.v(purchaseType);
            VText vText = this.f7687b;
            if (zV) {
                vText.setTextSize(17.0f);
                this.f7688c.setTextSize(11.0f);
                this.f7687b.setTextColor(Color.parseColor("#3D2747"));
                this.f7688c.setTextColor(Color.parseColor("#663D2747"));
                xdl0.X(this.f7686a, t100.d(22.0f));
                xdl0.U(this.f7686a, t100.d(22.0f));
                xdl0.X(this.f7688c, t100.d(4.0f));
                xdl0.M(this.f7689d, true);
                this.f7689d.setBackgroundResource(x2c0.f26862lb);
                xdl0.V(this.f7689d, t100.d(13.0f));
                xdl0.W(this.f7689d, t100.d(19.0f));
            } else {
                vText.setTextColor(Color.parseColor("#cc000000"));
                this.f7688c.setTextColor(Color.parseColor("#66000000"));
            }
        }
        this.f7686a.setImageResource(c0456a.f7691a);
        this.f7687b.setText(c0456a.f7692b);
        this.f7687b.getPaint().setFakeBoldText(true);
        boolean zA = NullChecker.a(c0456a.f7697g);
        VText vText2 = this.f7688c;
        if (zA) {
            vText2.setText(c0456a.f7697g);
        } else {
            vText2.setText(c0456a.f7693c);
        }
        xdl0.M(this.f7688c, !TextUtils.isEmpty(c0456a.f7693c));
        setOnClickListener(new View.OnClickListener() { // from class: l.lxo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlPrivilegeDescListItem.m11137b(c0456a, view);
            }
        });
        if (c0456a.f7695e == Privilege.vip_location) {
            m11144i(c0456a, dac0Var, putongFrag);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m11144i(C0456a c0456a, dac0<sxo> dac0Var, final PutongFrag putongFrag) {
        if (!CoreModule.f1534c.f3628e0.m21490p9().isVIP() && xma.m27379e4()) {
            this.f7688c.setOnClickListener(null);
            this.f7688c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        this.f7688c.setTextColor(getResources().getColor(w0c0.f24613I));
        this.f7688c.setText(R$string.f2826ps);
        this.f7688c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, nu0.b(getContext(), x2c0.f26429Xk), (Drawable) null);
        dac0Var.c(putongFrag, CoreModule.f1534c.f3646k0.f4077R.k()).take(1).subscribe(mkd0.G(new e30() { // from class: l.nxo
            public final void call(Object obj) {
                this.f17918a.m11141f((RoamedLocationData) obj);
            }
        }));
        this.f7688c.setOnClickListener(new View.OnClickListener() { // from class: l.pxo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19429a.m11142g(putongFrag, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m11139d(this);
    }

    public IntlPrivilegeDescListItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7690e = RoamedLocationData.new_();
    }

    public IntlPrivilegeDescListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7690e = RoamedLocationData.new_();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListItem$a */
    public static class C0456a implements sxo {

        /* JADX INFO: renamed from: a */
        @DrawableRes
        public int f7691a;

        /* JADX INFO: renamed from: b */
        public String f7692b;

        /* JADX INFO: renamed from: c */
        public String f7693c;

        /* JADX INFO: renamed from: d */
        public a f7694d;

        /* JADX INFO: renamed from: e */
        public Privilege f7695e;

        /* JADX INFO: renamed from: f */
        public PurchaseType f7696f;

        /* JADX INFO: renamed from: g */
        public SpannableStringBuilder f7697g;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListItem$a$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo11132a(View view, Privilege privilege);
        }

        public C0456a(@DrawableRes int i, String str, String str2, Privilege privilege, PurchaseType purchaseType, a aVar) {
            this.f7691a = i;
            this.f7692b = str;
            this.f7693c = str2;
            this.f7695e = privilege;
            this.f7694d = aVar;
            this.f7696f = purchaseType;
        }

        /* JADX INFO: renamed from: a */
        public void m11145a(a aVar) {
            this.f7694d = aVar;
        }

        @Override // p006l.sxo
        public int getItemType() {
            return 1;
        }

        public C0456a(@DrawableRes int i, String str, String str2, Privilege privilege, PurchaseType purchaseType) {
            this(i, str, str2, privilege, purchaseType, null);
        }
    }
}
