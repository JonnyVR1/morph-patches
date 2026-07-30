package com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.item;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
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
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListItem;
import com.tantanapp.common.utils.NullChecker;
import p147v.VIcon;
import p147v.VText;
import p149l.dac0;
import p149l.e30;
import p149l.ljl0;
import p149l.mkd0;
import p149l.nu0;
import p149l.sab0;
import p149l.sxo;
import p149l.t100;
import p149l.vxo;
import p149l.w0c0;
import p149l.wvv;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xma;

/* JADX INFO: loaded from: classes9.dex */
public class IntlPrivilegeDescListItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VIcon f37905a;

    /* JADX INFO: renamed from: b */
    public VText f37906b;

    /* JADX INFO: renamed from: c */
    public VText f37907c;

    /* JADX INFO: renamed from: d */
    public View f37908d;

    /* JADX INFO: renamed from: e */
    public RoamedLocationData f37909e;

    public IntlPrivilegeDescListItem(Context context) {
        super(context);
        this.f37909e = RoamedLocationData.new_();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m57645b(C9020a c9020a, View view) {
        C9020a.a aVar = c9020a.f37913d;
        if (aVar != null) {
            aVar.mo57640a(view, c9020a.f37914e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m57647d(View view) {
        vxo.m200575a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m57648e(Act act) {
        if (ljl0.m149994n("p_select_location_view,e_manyou,click", act, null)) {
            wvv.m205766f();
            if (this.f37909e.data.size() >= 5) {
                act.startActivityForResult(VipLocationHistoryAct.m56276V1(act, VipBaseFrag.f37502B), 3);
            } else {
                act.startActivityForResult(IntlMapAct.m35946e2(act, 1, VipBaseFrag.f37502B), 2);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m57649f(RoamedLocationData roamedLocationData) {
        this.f37909e = roamedLocationData;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m57650g(PutongFrag putongFrag, View view) {
        m57648e(putongFrag.act());
    }

    /* JADX INFO: renamed from: h */
    public void m57651h(final C9020a c9020a, dac0<sxo> dac0Var, PutongFrag putongFrag) {
        PurchaseType purchaseType = c9020a.f37915f;
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            this.f37906b.setTextSize(18.0f);
            this.f37907c.setTextSize(12.0f);
            this.f37906b.setTextColor(Color.parseColor("#cce8ca8a"));
            this.f37907c.setTextColor(Color.parseColor("#66e8ca8a"));
            xdl0.m208360X(this.f37905a, t100.m186890d(20.0f));
            xdl0.m208357U(this.f37905a, t100.m186890d(20.0f));
            xdl0.m208344M(this.f37908d, c9020a.f37914e != Privilege.message_read_state);
            this.f37908d.setBackgroundResource(x2c0.f189604Oa);
            xdl0.m208358V(this.f37908d, t100.m186890d(0.0f));
            xdl0.m208359W(this.f37908d, t100.m186890d(0.0f));
        } else {
            boolean zM182904v = sab0.m182904v(purchaseType);
            VText vText = this.f37906b;
            if (zM182904v) {
                vText.setTextSize(17.0f);
                this.f37907c.setTextSize(11.0f);
                this.f37906b.setTextColor(Color.parseColor("#3D2747"));
                this.f37907c.setTextColor(Color.parseColor("#663D2747"));
                xdl0.m208360X(this.f37905a, t100.m186890d(22.0f));
                xdl0.m208357U(this.f37905a, t100.m186890d(22.0f));
                xdl0.m208360X(this.f37907c, t100.m186890d(4.0f));
                xdl0.m208344M(this.f37908d, true);
                this.f37908d.setBackgroundResource(x2c0.f190326lb);
                xdl0.m208358V(this.f37908d, t100.m186890d(13.0f));
                xdl0.m208359W(this.f37908d, t100.m186890d(19.0f));
            } else {
                vText.setTextColor(Color.parseColor("#cc000000"));
                this.f37907c.setTextColor(Color.parseColor("#66000000"));
            }
        }
        this.f37905a.setImageResource(c9020a.f37910a);
        this.f37906b.setText(c9020a.f37911b);
        this.f37906b.getPaint().setFakeBoldText(true);
        boolean zM81303a = NullChecker.m81303a(c9020a.f37916g);
        VText vText2 = this.f37907c;
        if (zM81303a) {
            vText2.setText(c9020a.f37916g);
        } else {
            vText2.setText(c9020a.f37912c);
        }
        xdl0.m208344M(this.f37907c, !TextUtils.isEmpty(c9020a.f37912c));
        setOnClickListener(new View.OnClickListener() { // from class: l.lxo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlPrivilegeDescListItem.m57645b(c9020a, view);
            }
        });
        if (c9020a.f37914e == Privilege.vip_location) {
            m57652i(c9020a, dac0Var, putongFrag);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m57652i(C9020a c9020a, dac0<sxo> dac0Var, final PutongFrag putongFrag) {
        if (!CoreModule.f17545c.f19639e0.m169527p9().isVIP() && xma.m210071e4()) {
            this.f37907c.setOnClickListener(null);
            this.f37907c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        this.f37907c.setTextColor(getResources().getColor(w0c0.f183773I));
        this.f37907c.setText(R$string.f18837ps);
        this.f37907c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, nu0.m161424b(getContext(), x2c0.f189893Xk), (Drawable) null);
        dac0Var.mo67374c(putongFrag, CoreModule.f17545c.f19657k0.f20088R.m121230k()).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.nxo
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141035a.m57649f((RoamedLocationData) obj);
            }
        }));
        this.f37907c.setOnClickListener(new View.OnClickListener() { // from class: l.pxo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151711a.m57650g(putongFrag, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57647d(this);
    }

    public IntlPrivilegeDescListItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37909e = RoamedLocationData.new_();
    }

    public IntlPrivilegeDescListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37909e = RoamedLocationData.new_();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListItem$a */
    public static class C9020a implements sxo {

        /* JADX INFO: renamed from: a */
        @DrawableRes
        public int f37910a;

        /* JADX INFO: renamed from: b */
        public String f37911b;

        /* JADX INFO: renamed from: c */
        public String f37912c;

        /* JADX INFO: renamed from: d */
        public a f37913d;

        /* JADX INFO: renamed from: e */
        public Privilege f37914e;

        /* JADX INFO: renamed from: f */
        public PurchaseType f37915f;

        /* JADX INFO: renamed from: g */
        public SpannableStringBuilder f37916g;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListItem$a$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo57640a(View view, Privilege privilege);
        }

        public C9020a(@DrawableRes int i, String str, String str2, Privilege privilege, PurchaseType purchaseType, a aVar) {
            this.f37910a = i;
            this.f37911b = str;
            this.f37912c = str2;
            this.f37914e = privilege;
            this.f37913d = aVar;
            this.f37915f = purchaseType;
        }

        /* JADX INFO: renamed from: a */
        public void m57653a(a aVar) {
            this.f37913d = aVar;
        }

        @Override // p149l.sxo
        public int getItemType() {
            return 1;
        }

        public C9020a(@DrawableRes int i, String str, String str2, Privilege privilege, PurchaseType purchaseType) {
            this(i, str, str2, privilege, purchaseType, null);
        }
    }
}
