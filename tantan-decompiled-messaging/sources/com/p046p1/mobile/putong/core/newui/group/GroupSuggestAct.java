package com.p046p1.mobile.putong.core.newui.group;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.message.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.navigationbar.VNavigationBar;
import p149l.e30;
import p149l.l6c0;
import p149l.lip0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.o6j0;
import p149l.tbk;
import p149l.tsi0;
import p149l.xdl0;
import p149l.y19;
import p149l.y4c0;

/* JADX INFO: loaded from: classes11.dex */
public class GroupSuggestAct extends PutongAct implements tsi0 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public /* synthetic */ void m36579c2(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ void m36580d2(List list) {
        progressDismiss();
        if (GroupCreateCategoryAct.m36539a2(list)) {
            startActivity(GroupCreateTypeAct.m36548Z1(this, list));
        } else {
            lsi0.m151593w(R$string.f20821O0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ void m36581g2(View view) {
        o6j0.m162859c("e_create_group", "p_group_chat_square", new o6j0.C18854a[0]);
        if (tbk.m187861h(act())) {
            progress("", true);
            duringCreated(CoreModule.f17545c.f19645g0.m31826N6()).subscribe(mkd0.m154956H(new e30() { // from class: l.tlk
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f171027a.m36580d2((List) obj);
                }
            }, new e30() { // from class: l.ulk
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f177071a.m36585e2((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        m36582r();
        if (fragmentManager().m2554h0(y4c0.f196049T3) == null) {
            fragmentManager().m2567m().m2811s(y4c0.f196049T3, m36584b2()).mo2707i();
            fragmentManager().m2545e0();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m36582r() {
        if (NullChecker.m81303a(getSupportActionBar())) {
            getSupportActionBar().mo134126m();
        }
        VNavigationBar vNavigationBar = (VNavigationBar) findViewById(y4c0.f195964F2);
        vNavigationBar.setLeftIconOnClick(new View.OnClickListener() { // from class: l.rlk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159968a.m36579c2(view);
            }
        });
        View viewInflate = this.act.getLayoutInflater().inflate(l6c0.f126277D0, (ViewGroup) vNavigationBar.getRightIconContainer(), false);
        vNavigationBar.m223589z(viewInflate);
        xdl0.m208329E0(viewInflate, new View.OnClickListener() { // from class: l.slk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165234a.m36581g2(view);
            }
        });
    }

    @Override // p149l.tsi0
    /* JADX INFO: renamed from: F */
    public boolean mo36583F() {
        return false;
    }

    /* JADX INFO: renamed from: b2 */
    public final Frag m36584b2() {
        if (y19.m212152L()) {
            String strM149930j = lip0.m149927i().m149930j(this, "Group_square_settings");
            if (!TextUtils.isEmpty(strM149930j)) {
                return GroupSuggestWebFrag.m36602d5(strM149930j + "?pageId=Group_square_settings");
            }
        }
        return new GroupSuggestFrag();
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m36585e2(Throwable th) {
        progressDismiss();
        CoreModule.m29935P().m94658i().mo158360d(th);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(l6c0.f126270C0, viewGroup, false);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.qlk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155237a.lambda$initSubscription$0((Bundle) obj);
            }
        });
        CoreModule.m29935P().m94658i().mo158230F3(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_group_chat_square";
    }
}
