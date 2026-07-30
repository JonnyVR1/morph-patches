package com.p046p1.mobile.putong.core.p053ui.helpcenter;

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
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.AIMessageFeedback;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VFrame;
import p147v.VIcon;
import p147v.VLinear;
import p147v.VList;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;
import p149l.AbstractC15503a;
import p149l.bzk;
import p149l.czk;
import p149l.e30;
import p149l.f6c0;
import p149l.h7c0;
import p149l.hpd0;
import p149l.mkd0;
import p149l.t100;
import p149l.u4c0;
import p149l.uqd0;
import p149l.vwb;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xij0;

/* JADX INFO: loaded from: classes10.dex */
public class HelpCenterFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public VNavigationBar f29578A;

    /* JADX INFO: renamed from: B */
    public VText f29579B;

    /* JADX INFO: renamed from: C */
    public VText f29580C;

    /* JADX INFO: renamed from: D */
    public VText f29581D;

    /* JADX INFO: renamed from: E */
    public VText f29582E;

    /* JADX INFO: renamed from: F */
    public VFrame f29583F;

    /* JADX INFO: renamed from: G */
    public VList f29584G;

    /* JADX INFO: renamed from: I */
    public C8369c f29586I;

    /* JADX INFO: renamed from: z */
    public VLinear f29588z;

    /* JADX INFO: renamed from: H */
    public ArrayList<C8368b> f29585H = new ArrayList<>();

    /* JADX INFO: renamed from: J */
    public uqd0 f29587J = new uqd0("previewStatus_" + CoreModule.m29931H().userId(), "");

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.helpcenter.HelpCenterFrag$a */
    public class ViewOnClickListenerC8367a implements View.OnClickListener {
        public ViewOnClickListenerC8367a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            xij0.m209658a0(HelpCenterFrag.this.act());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.helpcenter.HelpCenterFrag$b */
    public class C8368b {

        /* JADX INFO: renamed from: a */
        public int f29590a;

        /* JADX INFO: renamed from: b */
        public String f29591b;

        /* JADX INFO: renamed from: c */
        public hpd0 f29592c;

        /* JADX INFO: renamed from: d */
        public boolean f29593d = false;

        /* JADX INFO: renamed from: e */
        @Nullable
        public Runnable f29594e;

        public C8368b(int i, String str) {
            this.f29590a = i;
            this.f29591b = str;
            this.f29592c = new hpd0("faq" + i + "_" + CoreModule.m29931H().userId(), Boolean.FALSE);
        }

        /* JADX INFO: renamed from: a */
        public void m46022a() {
            if (NullChecker.m81303a(this.f29594e)) {
                this.f29594e.run();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.helpcenter.HelpCenterFrag$c */
    public class C8369c extends AbstractC15503a<C8368b> {
        public C8369c() {
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: m */
        public View mo20403m(ViewGroup viewGroup, int i) {
            return HelpCenterFrag.this.act().inflater().inflate(f6c0.f95984rd, viewGroup, false);
        }

        @Override // p149l.AbstractC15503a
        /* JADX INFO: renamed from: p */
        public List<C8368b> mo20404p() {
            return HelpCenterFrag.this.f29585H;
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo20402j(View view, C8368b c8368b, int i, final int i2) {
            final View viewFindViewById = view.findViewById(u4c0.f174223e3);
            xdl0.m208345M0(viewFindViewById, !((C8368b) HelpCenterFrag.this.f29585H.get(i2)).f29592c.get().booleanValue());
            ((TextView) view.findViewById(u4c0.f173985Pd)).setText(((C8368b) HelpCenterFrag.this.f29585H.get(i2)).f29591b);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.zyk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f205694a.m46025w(i2, viewFindViewById, view2);
                }
            });
        }

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ void m46025w(int i, View view, View view2) {
            C8368b c8368b = (C8368b) HelpCenterFrag.this.f29585H.get(i);
            c8368b.f29592c.put(Boolean.TRUE);
            xdl0.m208345M0(view, false);
            if (c8368b.f29593d) {
                c8368b.m46022a();
            } else {
                HelpCenterFrag helpCenterFrag = HelpCenterFrag.this;
                helpCenterFrag.startActivity(QuestionAndAnswerAct.m46026V1(helpCenterFrag.act(), ((C8368b) HelpCenterFrag.this.f29585H.get(i)).f29590a, ((C8368b) HelpCenterFrag.this.f29585H.get(i)).f29591b));
            }
        }
    }

    public HelpCenterFrag() {
        creates(new e30() { // from class: l.vyk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183538a.m46016V4((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).subscribe(mkd0.m154955G(new e30() { // from class: l.wyk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188575a.m46021W4((User) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U4 */
    public /* synthetic */ void m46015U4(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V4 */
    public /* synthetic */ void m46016V4(Bundle bundle) {
        setHasOptionsMenu(true);
        C8368b c8368b = new C8368b(1, getString(R$string.f18053Q6));
        C8368b c8368b2 = new C8368b(2, getString(R$string.f17634C7));
        C8368b c8368b3 = new C8368b(3, getString(R$string.f18293Y6));
        C8368b c8368b4 = new C8368b(4, getString(R$string.f18113S6));
        C8368b c8368b5 = new C8368b(5, getString(R$string.f18233W6));
        C8368b c8368b6 = new C8368b(6, getString(R$string.f17694E7));
        C8368b c8368b7 = new C8368b(7, getString(R$string.f18173U6));
        C8368b c8368b8 = new C8368b(8, getString(R$string.f17783H6));
        this.f29585H.clear();
        this.f29585H.addAll(vwb.m200324f0(c8368b, c8368b2, c8368b3, c8368b4, c8368b5, c8368b6, c8368b7, c8368b8));
        this.f29586I.notifyDataSetChanged();
        act().setTitle(R$string.f17813I6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4 */
    public /* synthetic */ void m46017X4(View view) {
        xij0.m209658a0(act());
    }

    /* JADX INFO: renamed from: R4 */
    public View m46018R4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bzk.m104622b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: S4 */
    public View m46019S4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return czk.m109423b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: T4 */
    public void m46020T4() {
        bzk.m104623c(this);
    }

    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ void m46021W4(User user) {
        boolean zContains = user.status.contains(UserStatus.get("hidden"));
        this.f29581D.setText(zContains ? getString(R$string.f17574A7) : getString(R$string.f19116z7));
        this.f29581D.setTextColor(zContains ? getResources().getColor(w0c0.f183889t1) : getResources().getColor(w0c0.f183808T1));
        this.f29581D.setBackgroundResource(zContains ? x2c0.f189466Jr : x2c0.f189435Ir);
        xdl0.m208344M(this.f29580C, zContains || this.f29587J.get().equals("hidden"));
        xdl0.m208344M(this.f29581D, zContains || this.f29587J.get().equals("hidden"));
        xdl0.m208344M(this.f29579B, (zContains || this.f29587J.get().equals("hidden")) ? false : true);
        this.f29587J.put(zContains ? "hidden" : AIMessageFeedback.good);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f29578A.setLeftIconOnClick(new View.OnClickListener() { // from class: l.xyk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195090a.m46015U4(view);
            }
        });
        this.f29578A.m223588w(x2c0.f189404Hr, new ViewOnClickListenerC8367a());
        VIcon vIcon = (VIcon) this.f29578A.getRightIconContainer().getChildAt(0);
        if (vIcon != null) {
            Drawable drawableMutate = vIcon.getDrawable().mutate();
            drawableMutate.setColorFilter(-1289674463, PorterDuff.Mode.SRC_ATOP);
            vIcon.setImageDrawable(drawableMutate);
            vIcon.setBackgroundResource(x2c0.f190442p);
            vIcon.setPadding(t100.m186890d(2.0f), t100.m186890d(2.0f), t100.m186890d(2.0f), t100.m186890d(2.0f));
        }
        this.f29578A.getLeftIconContainer().setBackgroundResource(x2c0.f190442p);
        this.f29582E.setText(getString(R$string.f18742mq, "7.2.7"));
        this.f29584G.setCrashLogFlag("HelpCenterFrag");
        this.f29584G.addHeaderView(this.f29588z);
        C8369c c8369c = new C8369c();
        this.f29586I = c8369c;
        this.f29584G.setAdapter((ListAdapter) c8369c);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        m46019S4(act().inflater(), this.f29584G);
        return m46018R4(layoutInflater, viewGroup);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(h7c0.f106221c, menu);
        MenuItem menuItemFindItem = menu.findItem(u4c0.f174279h8);
        menuItemFindItem.getActionView().setOnClickListener(new View.OnClickListener() { // from class: l.yyk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200777a.m46017X4(view);
            }
        });
        CoreBusinessModule.m29908m0().mo190525l(this, menu, menuInflater, menuItemFindItem);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_help_center_view";
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo20605y4() {
        m46020T4();
    }
}
