package com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.item;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
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
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListItem;
import com.tantanapp.common.utils.NullChecker;
import p151v.VIcon;
import p151v.VText;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.jic0;
import p153l.joa;
import p153l.psd0;
import p153l.psl0;
import p153l.qa00;
import p153l.szo;
import p153l.tu0;
import p153l.vzo;
import p153l.wib0;
import p153l.xxv;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class IntlPrivilegeDescListItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VIcon f38753a;

    /* JADX INFO: renamed from: b */
    public VText f38754b;

    /* JADX INFO: renamed from: c */
    public VText f38755c;

    /* JADX INFO: renamed from: d */
    public View f38756d;

    /* JADX INFO: renamed from: e */
    public RoamedLocationData f38757e;

    public IntlPrivilegeDescListItem(Context context) {
        super(context);
        this.f38757e = RoamedLocationData.new_();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m58828b(C9183a c9183a, View view) {
        C9183a.a aVar = c9183a.f38761d;
        if (aVar != null) {
            aVar.mo58823a(view, c9183a.f38762e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m58830d(View view) {
        vzo.m204115a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m58831e(Act act) {
        if (psl0.m173668n("p_select_location_view,e_manyou,click", act, null)) {
            xxv.m213579f();
            if (this.f38757e.data.size() >= 5) {
                act.startActivityForResult(VipLocationHistoryAct.m57459X1(act, VipBaseFrag.f38350B), 3);
            } else {
                act.startActivityForResult(IntlMapAct.m36949g2(act, 1, VipBaseFrag.f38350B), 2);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m58832f(RoamedLocationData roamedLocationData) {
        this.f38757e = roamedLocationData;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m58833g(PutongFrag putongFrag, View view) {
        m58831e(putongFrag.act());
    }

    /* JADX INFO: renamed from: h */
    public void m58834h(final C9183a c9183a, jic0<szo> jic0Var, PutongFrag putongFrag) {
        PurchaseType purchaseType = c9183a.f38763f;
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            this.f38754b.setTextSize(18.0f);
            this.f38755c.setTextSize(12.0f);
            this.f38754b.setTextColor(Color.parseColor("#cce8ca8a"));
            this.f38755c.setTextColor(Color.parseColor("#66e8ca8a"));
            bnl0.m105540X(this.f38753a, qa00.m175859d(20.0f));
            bnl0.m105537U(this.f38753a, qa00.m175859d(20.0f));
            bnl0.m105524M(this.f38756d, c9183a.f38762e != Privilege.message_read_state);
            this.f38756d.setBackgroundResource(dbc0.f86467Pa);
            bnl0.m105538V(this.f38756d, qa00.m175859d(0.0f));
            bnl0.m105539W(this.f38756d, qa00.m175859d(0.0f));
        } else {
            boolean zM206578v = wib0.m206578v(purchaseType);
            VText vText = this.f38754b;
            if (zM206578v) {
                vText.setTextSize(17.0f);
                this.f38755c.setTextSize(11.0f);
                this.f38754b.setTextColor(Color.parseColor("#3D2747"));
                this.f38755c.setTextColor(Color.parseColor("#663D2747"));
                bnl0.m105540X(this.f38753a, qa00.m175859d(22.0f));
                bnl0.m105537U(this.f38753a, qa00.m175859d(22.0f));
                bnl0.m105540X(this.f38755c, qa00.m175859d(4.0f));
                bnl0.m105524M(this.f38756d, true);
                this.f38756d.setBackgroundResource(dbc0.f87213mb);
                bnl0.m105538V(this.f38756d, qa00.m175859d(13.0f));
                bnl0.m105539W(this.f38756d, qa00.m175859d(19.0f));
            } else {
                vText.setTextColor(Color.parseColor("#cc000000"));
                this.f38755c.setTextColor(Color.parseColor("#66000000"));
            }
        }
        this.f38753a.setImageResource(c9183a.f38758a);
        this.f38754b.setText(c9183a.f38759b);
        this.f38754b.getPaint().setFakeBoldText(true);
        boolean zM82486a = NullChecker.m82486a(c9183a.f38764g);
        VText vText2 = this.f38755c;
        if (zM82486a) {
            vText2.setText(c9183a.f38764g);
        } else {
            vText2.setText(c9183a.f38760c);
        }
        bnl0.m105524M(this.f38755c, !TextUtils.isEmpty(c9183a.f38760c));
        setOnClickListener(new View.OnClickListener() { // from class: l.lzo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlPrivilegeDescListItem.m58828b(c9183a, view);
            }
        });
        if (c9183a.f38762e == Privilege.vip_location) {
            m58835i(c9183a, jic0Var, putongFrag);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m58835i(C9183a c9183a, jic0<szo> jic0Var, final PutongFrag putongFrag) {
        if (!CoreModule.f18264c.f20381e0.m116600p9().isVIP() && joa.m146386f4()) {
            this.f38755c.setOnClickListener(null);
            this.f38755c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        this.f38755c.setTextColor(getResources().getColor(c9c0.f80342I));
        this.f38755c.setText(R$string.f18655Ls);
        this.f38755c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, tu0.m192702b(getContext(), dbc0.f86350Ll), (Drawable) null);
        jic0Var.mo68557c(putongFrag, CoreModule.f18264c.f20399k0.f20830R.m159274k()).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.nzo
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144462a.m58832f((RoamedLocationData) obj);
            }
        }));
        this.f38755c.setOnClickListener(new View.OnClickListener() { // from class: l.pzo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f154942a.m58833g(putongFrag, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58830d(this);
    }

    public IntlPrivilegeDescListItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38757e = RoamedLocationData.new_();
    }

    public IntlPrivilegeDescListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38757e = RoamedLocationData.new_();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListItem$a */
    public static class C9183a implements szo {

        /* JADX INFO: renamed from: a */
        @DrawableRes
        public int f38758a;

        /* JADX INFO: renamed from: b */
        public String f38759b;

        /* JADX INFO: renamed from: c */
        public String f38760c;

        /* JADX INFO: renamed from: d */
        public a f38761d;

        /* JADX INFO: renamed from: e */
        public Privilege f38762e;

        /* JADX INFO: renamed from: f */
        public PurchaseType f38763f;

        /* JADX INFO: renamed from: g */
        public SpannableStringBuilder f38764g;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListItem$a$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo58823a(View view, Privilege privilege);
        }

        public C9183a(@DrawableRes int i, String str, String str2, Privilege privilege, PurchaseType purchaseType, a aVar) {
            this.f38758a = i;
            this.f38759b = str;
            this.f38760c = str2;
            this.f38762e = privilege;
            this.f38761d = aVar;
            this.f38763f = purchaseType;
        }

        /* JADX INFO: renamed from: a */
        public void m58836a(a aVar) {
            this.f38761d = aVar;
        }

        @Override // p153l.szo
        public int getItemType() {
            return 1;
        }

        public C9183a(@DrawableRes int i, String str, String str2, Privilege privilege, PurchaseType purchaseType) {
            this(i, str, str2, privilege, purchaseType, null);
        }
    }
}
