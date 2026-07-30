package com.p051p1.mobile.putong.core.newui.group;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.message.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.navigationbar.VNavigationBar;
import p153l.bnl0;
import p153l.edc0;
import p153l.h39;
import p153l.jek;
import p153l.o1j0;
import p153l.prp0;
import p153l.psd0;
import p153l.qec0;
import p153l.sfj0;
import p153l.w1j0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class GroupSuggestAct extends PutongAct implements w1j0 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ void m37582d2(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m37583e2(List list) {
        progressDismiss();
        if (GroupCreateCategoryAct.m37542b2(list)) {
            startActivity(GroupCreateTypeAct.m37551a2(this, list));
        } else {
            o1j0.m165649w(R$string.f21563O0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m37584h2(View view) {
        sfj0.m185596c("e_create_group", "p_group_chat_square", new sfj0.C20032a[0]);
        if (jek.m144576h(act())) {
            progress("", true);
            duringCreated(CoreModule.f18264c.f20387g0.m32829N6()).subscribe(psd0.m173597H(new y20() { // from class: l.jok
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f122034a.m37583e2((List) obj);
                }
            }, new y20() { // from class: l.kok
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f127763a.m37588g2((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        m37585r();
        if (fragmentManager().m2555h0(edc0.f93284T3) == null) {
            fragmentManager().m2568m().m2812s(edc0.f93284T3, m37587c2()).mo2708i();
            fragmentManager().m2546e0();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m37585r() {
        if (NullChecker.m82486a(getSupportActionBar())) {
            getSupportActionBar().mo102186m();
        }
        VNavigationBar vNavigationBar = (VNavigationBar) findViewById(edc0.f93199F2);
        vNavigationBar.setLeftIconOnClick(new View.OnClickListener() { // from class: l.hok
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110930a.m37582d2(view);
            }
        });
        View viewInflate = this.act.getLayoutInflater().inflate(qec0.f156833D0, (ViewGroup) vNavigationBar.getRightIconContainer(), false);
        vNavigationBar.m224835z(viewInflate);
        bnl0.m105509E0(viewInflate, new View.OnClickListener() { // from class: l.iok
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116176a.m37584h2(view);
            }
        });
    }

    @Override // p153l.w1j0
    /* JADX INFO: renamed from: G */
    public boolean mo37586G() {
        return false;
    }

    /* JADX INFO: renamed from: c2 */
    public final Frag m37587c2() {
        if (h39.m133423L()) {
            String strM173531j = prp0.m173528i().m173531j(this, "Group_square_settings");
            if (!TextUtils.isEmpty(strM173531j)) {
                return GroupSuggestWebFrag.m37605d5(strM173531j + "?pageId=Group_square_settings");
            }
        }
        return new GroupSuggestFrag();
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m37588g2(Throwable th) {
        progressDismiss();
        CoreModule.m30933P().m143412i().mo180452d(th);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(qec0.f156826C0, viewGroup, false);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.gok
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f105304a.lambda$initSubscription$0((Bundle) obj);
            }
        });
        CoreModule.m30933P().m143412i().mo180322F3(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_group_chat_square";
    }
}
