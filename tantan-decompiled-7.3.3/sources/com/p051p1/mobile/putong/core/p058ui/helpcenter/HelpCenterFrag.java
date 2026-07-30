package com.p051p1.mobile.putong.core.p058ui.helpcenter;

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
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.AIMessageFeedback;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VFrame;
import p151v.VIcon;
import p151v.VLinear;
import p151v.VList;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;
import p153l.AbstractC15610a;
import p153l.adc0;
import p153l.asj0;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.jxd0;
import p153l.jyb;
import p153l.kec0;
import p153l.lfc0;
import p153l.psd0;
import p153l.qa00;
import p153l.r1l;
import p153l.s1l;
import p153l.wyd0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class HelpCenterFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public VNavigationBar f30426A;

    /* JADX INFO: renamed from: B */
    public VText f30427B;

    /* JADX INFO: renamed from: C */
    public VText f30428C;

    /* JADX INFO: renamed from: D */
    public VText f30429D;

    /* JADX INFO: renamed from: E */
    public VText f30430E;

    /* JADX INFO: renamed from: F */
    public VFrame f30431F;

    /* JADX INFO: renamed from: G */
    public VList f30432G;

    /* JADX INFO: renamed from: I */
    public C8532c f30434I;

    /* JADX INFO: renamed from: z */
    public VLinear f30436z;

    /* JADX INFO: renamed from: H */
    public ArrayList<C8531b> f30433H = new ArrayList<>();

    /* JADX INFO: renamed from: J */
    public wyd0 f30435J = new wyd0("previewStatus_" + CoreModule.m30929H().userId(), "");

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.helpcenter.HelpCenterFrag$a */
    public class ViewOnClickListenerC8530a implements View.OnClickListener {
        public ViewOnClickListenerC8530a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            asj0.m99932a0(HelpCenterFrag.this.act());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.helpcenter.HelpCenterFrag$b */
    public class C8531b {

        /* JADX INFO: renamed from: a */
        public int f30438a;

        /* JADX INFO: renamed from: b */
        public String f30439b;

        /* JADX INFO: renamed from: c */
        public jxd0 f30440c;

        /* JADX INFO: renamed from: d */
        public boolean f30441d = false;

        /* JADX INFO: renamed from: e */
        @Nullable
        public Runnable f30442e;

        public C8531b(int i, String str) {
            this.f30438a = i;
            this.f30439b = str;
            this.f30440c = new jxd0("faq" + i + "_" + CoreModule.m30929H().userId(), Boolean.FALSE);
        }

        /* JADX INFO: renamed from: a */
        public void m47205a() {
            if (NullChecker.m82486a(this.f30442e)) {
                this.f30442e.run();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.helpcenter.HelpCenterFrag$c */
    public class C8532c extends AbstractC15610a<C8531b> {
        public C8532c() {
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: m */
        public View mo21402m(ViewGroup viewGroup, int i) {
            return HelpCenterFrag.this.act().inflater().inflate(kec0.f126157yd, viewGroup, false);
        }

        @Override // p153l.AbstractC15610a
        /* JADX INFO: renamed from: p */
        public List<C8531b> mo21403p() {
            return HelpCenterFrag.this.f30433H;
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo21401j(View view, C8531b c8531b, int i, final int i2) {
            final View viewFindViewById = view.findViewById(adc0.f70348g3);
            bnl0.m105525M0(viewFindViewById, !((C8531b) HelpCenterFrag.this.f30433H.get(i2)).f30440c.get().booleanValue());
            ((TextView) view.findViewById(adc0.f70124Sd)).setText(((C8531b) HelpCenterFrag.this.f30433H.get(i2)).f30439b);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.p1l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f150176a.m47208w(i2, viewFindViewById, view2);
                }
            });
        }

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ void m47208w(int i, View view, View view2) {
            C8531b c8531b = (C8531b) HelpCenterFrag.this.f30433H.get(i);
            c8531b.f30440c.put(Boolean.TRUE);
            bnl0.m105525M0(view, false);
            if (c8531b.f30441d) {
                c8531b.m47205a();
            } else {
                HelpCenterFrag helpCenterFrag = HelpCenterFrag.this;
                helpCenterFrag.startActivity(QuestionAndAnswerAct.m47209X1(helpCenterFrag.act(), ((C8531b) HelpCenterFrag.this.f30433H.get(i)).f30438a, ((C8531b) HelpCenterFrag.this.f30433H.get(i)).f30439b));
            }
        }
    }

    public HelpCenterFrag() {
        creates(new y20() { // from class: l.l1l
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129701a.m47199V4((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).subscribe(psd0.m173596G(new y20() { // from class: l.m1l
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134448a.m47204W4((User) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U4 */
    public /* synthetic */ void m47198U4(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V4 */
    public /* synthetic */ void m47199V4(Bundle bundle) {
        setHasOptionsMenu(true);
        C8531b c8531b = new C8531b(1, getString(R$string.f18843S6));
        C8531b c8531b2 = new C8531b(2, getString(R$string.f18417E7));
        C8531b c8531b3 = new C8531b(3, getString(R$string.f19084a7));
        C8531b c8531b4 = new C8531b(4, getString(R$string.f18903U6));
        C8531b c8531b5 = new C8531b(5, getString(R$string.f19023Y6));
        C8531b c8531b6 = new C8531b(6, getString(R$string.f18479G7));
        C8531b c8531b7 = new C8531b(7, getString(R$string.f18963W6));
        C8531b c8531b8 = new C8531b(8, getString(R$string.f18571J6));
        this.f30433H.clear();
        this.f30433H.addAll(jyb.m147507f0(c8531b, c8531b2, c8531b3, c8531b4, c8531b5, c8531b6, c8531b7, c8531b8));
        this.f30434I.notifyDataSetChanged();
        act().setTitle(R$string.f18602K6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4 */
    public /* synthetic */ void m47200X4(View view) {
        asj0.m99932a0(act());
    }

    /* JADX INFO: renamed from: R4 */
    public View m47201R4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return r1l.m179424b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: S4 */
    public View m47202S4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return s1l.m184054b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: T4 */
    public void m47203T4() {
        r1l.m179425c(this);
    }

    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ void m47204W4(User user) {
        boolean zContains = user.status.contains(UserStatus.get("hidden"));
        this.f30429D.setText(zContains ? getString(R$string.f18355C7) : getString(R$string.f18324B7));
        this.f30429D.setTextColor(zContains ? getResources().getColor(c9c0.f80462u1) : getResources().getColor(c9c0.f80380U1));
        this.f30429D.setBackgroundResource(zContains ? dbc0.f87590xs : dbc0.f87558ws);
        bnl0.m105524M(this.f30428C, zContains || this.f30435J.get().equals("hidden"));
        bnl0.m105524M(this.f30429D, zContains || this.f30435J.get().equals("hidden"));
        bnl0.m105524M(this.f30427B, (zContains || this.f30435J.get().equals("hidden")) ? false : true);
        this.f30435J.put(zContains ? "hidden" : AIMessageFeedback.good);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f30426A.setLeftIconOnClick(new View.OnClickListener() { // from class: l.n1l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139773a.m47198U4(view);
            }
        });
        this.f30426A.m224834w(dbc0.f87526vs, new ViewOnClickListenerC8530a());
        VIcon vIcon = (VIcon) this.f30426A.getRightIconContainer().getChildAt(0);
        if (vIcon != null) {
            Drawable drawableMutate = vIcon.getDrawable().mutate();
            drawableMutate.setColorFilter(-1289674463, PorterDuff.Mode.SRC_ATOP);
            vIcon.setImageDrawable(drawableMutate);
            vIcon.setBackgroundResource(dbc0.f87333q);
            vIcon.setPadding(qa00.m175859d(2.0f), qa00.m175859d(2.0f), qa00.m175859d(2.0f), qa00.m175859d(2.0f));
        }
        this.f30426A.getLeftIconContainer().setBackgroundResource(dbc0.f87333q);
        this.f30430E.setText(getString(R$string.f18529Hq, "7.3.3"));
        this.f30432G.setCrashLogFlag("HelpCenterFrag");
        this.f30432G.addHeaderView(this.f30436z);
        C8532c c8532c = new C8532c();
        this.f30434I = c8532c;
        this.f30432G.setAdapter((ListAdapter) c8532c);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        m47202S4(act().inflater(), this.f30432G);
        return m47201R4(layoutInflater, viewGroup);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(lfc0.f131840c, menu);
        MenuItem menuItemFindItem = menu.findItem(adc0.f70403j8);
        menuItemFindItem.getActionView().setOnClickListener(new View.OnClickListener() { // from class: l.o1l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f144668a.m47200X4(view);
            }
        });
        CoreBusinessModule.m30906m0().mo122552l(this, menu, menuInflater, menuItemFindItem);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_help_center_view";
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo21604y4() {
        m47203T4();
    }
}
