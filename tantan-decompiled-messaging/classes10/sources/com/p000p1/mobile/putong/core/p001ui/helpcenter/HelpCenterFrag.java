package com.p000p1.mobile.putong.core.p001ui.helpcenter;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.AIMessageFeedback;
import com.p000p1.mobile.putong.core.data.MyVisitorsShowType;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreBusinessModule;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.a;
import l.e30;
import l.f6c0;
import l.h7c0;
import l.hpd0;
import l.mkd0;
import l.t100;
import l.u4c0;
import l.uqd0;
import l.vwb;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import l.xij0;
import p003l.bzk;
import p003l.czk;
import v.VFrame;
import v.VIcon;
import v.VLinear;
import v.VList;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class HelpCenterFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public VNavigationBar f1972A;

    /* JADX INFO: renamed from: B */
    public VText f1973B;

    /* JADX INFO: renamed from: C */
    public VText f1974C;

    /* JADX INFO: renamed from: D */
    public VText f1975D;

    /* JADX INFO: renamed from: E */
    public VText f1976E;

    /* JADX INFO: renamed from: F */
    public VFrame f1977F;

    /* JADX INFO: renamed from: G */
    public VList f1978G;

    /* JADX INFO: renamed from: I */
    public C3144c f1980I;

    /* JADX INFO: renamed from: z */
    public VLinear f1982z;

    /* JADX INFO: renamed from: H */
    public ArrayList<C3143b> f1979H = new ArrayList<>();

    /* JADX INFO: renamed from: J */
    public uqd0 f1981J = new uqd0("previewStatus_" + CoreModule.H().userId(), "");

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.helpcenter.HelpCenterFrag$a */
    public class ViewOnClickListenerC3142a implements View.OnClickListener {
        public ViewOnClickListenerC3142a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            xij0.a0(HelpCenterFrag.this.act());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.helpcenter.HelpCenterFrag$b */
    public class C3143b {

        /* JADX INFO: renamed from: a */
        public int f1984a;

        /* JADX INFO: renamed from: b */
        public String f1985b;

        /* JADX INFO: renamed from: c */
        public hpd0 f1986c;

        /* JADX INFO: renamed from: d */
        public boolean f1987d = false;

        /* JADX INFO: renamed from: e */
        @Nullable
        public Runnable f1988e;

        public C3143b(int i, String str) {
            this.f1984a = i;
            this.f1985b = str;
            this.f1986c = new hpd0("faq" + i + "_" + CoreModule.H().userId(), Boolean.FALSE);
        }

        /* JADX INFO: renamed from: a */
        public void m3379a() {
            if (NullChecker.a(this.f1988e)) {
                this.f1988e.run();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.helpcenter.HelpCenterFrag$c */
    public class C3144c extends a<C3143b> {
        public C3144c() {
        }

        /* JADX INFO: renamed from: m */
        public View m3382m(ViewGroup viewGroup, int i) {
            return HelpCenterFrag.this.act().inflater().inflate(f6c0.rd, viewGroup, false);
        }

        /* JADX INFO: renamed from: p */
        public List<C3143b> m3383p() {
            return HelpCenterFrag.this.f1979H;
        }

        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void m3381j(View view, C3143b c3143b, int i, final int i2) {
            final View viewFindViewById = view.findViewById(u4c0.e3);
            xdl0.M0(viewFindViewById, !((Boolean) ((C3143b) HelpCenterFrag.this.f1979H.get(i2)).f1986c.get()).booleanValue());
            ((TextView) view.findViewById(u4c0.Pd)).setText(((C3143b) HelpCenterFrag.this.f1979H.get(i2)).f1985b);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.zyk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f9338a.m3385w(i2, viewFindViewById, view2);
                }
            });
        }

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ void m3385w(int i, View view, View view2) {
            C3143b c3143b = (C3143b) HelpCenterFrag.this.f1979H.get(i);
            c3143b.f1986c.put(Boolean.TRUE);
            xdl0.M0(view, false);
            if (c3143b.f1987d) {
                c3143b.m3379a();
            } else {
                HelpCenterFrag helpCenterFrag = HelpCenterFrag.this;
                helpCenterFrag.startActivity(QuestionAndAnswerAct.m3386V1(helpCenterFrag.act(), ((C3143b) HelpCenterFrag.this.f1979H.get(i)).f1984a, ((C3143b) HelpCenterFrag.this.f1979H.get(i)).f1985b));
            }
        }
    }

    public HelpCenterFrag() {
        creates(new e30() { // from class: l.vyk
            public final void call(Object obj) {
                this.f8106a.m3371V4((Bundle) obj);
            }
        });
        duringCreated(CoreModule.c.e0.o9()).subscribe(mkd0.G(new e30() { // from class: l.wyk
            public final void call(Object obj) {
                this.f8275a.m3376W4((User) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U4 */
    public /* synthetic */ void m3370U4(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V4 */
    public /* synthetic */ void m3371V4(Bundle bundle) {
        setHasOptionsMenu(true);
        C3143b c3143b = new C3143b(1, getString(R.string.Q6));
        C3143b c3143b2 = new C3143b(2, getString(R.string.C7));
        C3143b c3143b3 = new C3143b(3, getString(R.string.Y6));
        C3143b c3143b4 = new C3143b(4, getString(R.string.S6));
        C3143b c3143b5 = new C3143b(5, getString(R.string.W6));
        C3143b c3143b6 = new C3143b(6, getString(R.string.E7));
        C3143b c3143b7 = new C3143b(7, getString(R.string.U6));
        C3143b c3143b8 = new C3143b(8, getString(R.string.H6));
        this.f1979H.clear();
        this.f1979H.addAll(vwb.f0(new C3143b[]{c3143b, c3143b2, c3143b3, c3143b4, c3143b5, c3143b6, c3143b7, c3143b8}));
        this.f1980I.notifyDataSetChanged();
        act().setTitle(R.string.I6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4 */
    public /* synthetic */ void m3372X4(View view) {
        xij0.a0(act());
    }

    /* JADX INFO: renamed from: R4 */
    public View m3373R4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bzk.m5831b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: S4 */
    public View m3374S4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return czk.m6027b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: T4 */
    public void m3375T4() {
        bzk.m5832c(this);
    }

    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ void m3376W4(User user) {
        List list = user.status;
        String str = MyVisitorsShowType.hidden;
        boolean zContains = list.contains(UserStatus.get(MyVisitorsShowType.hidden));
        this.f1975D.setText(zContains ? getString(R.string.A7) : getString(R.string.z7));
        this.f1975D.setTextColor(zContains ? getResources().getColor(w0c0.t1) : getResources().getColor(w0c0.T1));
        this.f1975D.setBackgroundResource(zContains ? x2c0.Jr : x2c0.Ir);
        xdl0.M(this.f1974C, zContains || ((String) this.f1981J.get()).equals(MyVisitorsShowType.hidden));
        xdl0.M(this.f1975D, zContains || ((String) this.f1981J.get()).equals(MyVisitorsShowType.hidden));
        xdl0.M(this.f1973B, (zContains || ((String) this.f1981J.get()).equals(MyVisitorsShowType.hidden)) ? false : true);
        uqd0 uqd0Var = this.f1981J;
        if (!zContains) {
            str = AIMessageFeedback.good;
        }
        uqd0Var.put(str);
    }

    public boolean disableAutoPV() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [android.widget.ListAdapter, com.p1.mobile.putong.core.ui.helpcenter.HelpCenterFrag$c] */
    /* JADX INFO: renamed from: g4 */
    public void m3377g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f1972A.setLeftIconOnClick(new View.OnClickListener() { // from class: l.xyk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8616a.m3370U4(view);
            }
        });
        this.f1972A.w(x2c0.Hr, new ViewOnClickListenerC3142a());
        VIcon childAt = this.f1972A.getRightIconContainer().getChildAt(0);
        if (childAt != null) {
            Drawable drawableMutate = childAt.getDrawable().mutate();
            drawableMutate.setColorFilter(-1289674463, PorterDuff.Mode.SRC_ATOP);
            childAt.setImageDrawable(drawableMutate);
            childAt.setBackgroundResource(x2c0.p);
            childAt.setPadding(t100.d(2.0f), t100.d(2.0f), t100.d(2.0f), t100.d(2.0f));
        }
        this.f1972A.getLeftIconContainer().setBackgroundResource(x2c0.p);
        this.f1976E.setText(getString(R.string.mq, new Object[]{"7.2.7"}));
        this.f1978G.setCrashLogFlag("HelpCenterFrag");
        this.f1978G.addHeaderView(this.f1982z);
        ?? c3144c = new C3144c();
        this.f1980I = c3144c;
        this.f1978G.setAdapter((ListAdapter) c3144c);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        m3374S4(act().inflater(), this.f1978G);
        return m3373R4(layoutInflater, viewGroup);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(h7c0.c, menu);
        MenuItem menuItemFindItem = menu.findItem(u4c0.h8);
        menuItemFindItem.getActionView().setOnClickListener(new View.OnClickListener() { // from class: l.yyk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9153a.m3372X4(view);
            }
        });
        CoreBusinessModule.m0().l(this, menu, menuInflater, menuItemFindItem);
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }

    public String pageId() {
        return "p_help_center_view";
    }

    /* JADX INFO: renamed from: y4 */
    public void m3378y4() {
        m3375T4();
    }
}
