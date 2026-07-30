package com.p000p1.mobile.putong.core.newui.group;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.message.R;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.l6c0;
import l.lip0;
import l.lsi0;
import l.mkd0;
import l.o6j0;
import l.tbk;
import l.xdl0;
import l.y19;
import l.y4c0;
import p009l.tsi0;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class GroupSuggestAct extends PutongAct implements tsi0 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public /* synthetic */ void m518c2(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ void m519d2(List list) {
        progressDismiss();
        if (GroupCreateCategoryAct.m468a2(list)) {
            startActivity(GroupCreateTypeAct.m483Z1(this, list));
        } else {
            lsi0.w(R.string.O0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ void m520g2(View view) {
        o6j0.c("e_create_group", "p_group_chat_square", new o6j0.a[0]);
        if (tbk.h(act())) {
            progress("", true);
            duringCreated(CoreModule.c.g0.N6()).subscribe(mkd0.H(new e30() { // from class: l.tlk
                public final void call(Object obj) {
                    this.f20768a.m519d2((List) obj);
                }
            }, new e30() { // from class: l.ulk
                public final void call(Object obj) {
                    this.f21243a.m524e2((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        m521r();
        if (fragmentManager().h0(y4c0.T3) == null) {
            fragmentManager().m().s(y4c0.T3, m523b2()).i();
            fragmentManager().e0();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m521r() {
        if (NullChecker.a(getSupportActionBar())) {
            getSupportActionBar().m();
        }
        VNavigationBar vNavigationBarFindViewById = findViewById(y4c0.F2);
        vNavigationBarFindViewById.setLeftIconOnClick(new View.OnClickListener() { // from class: l.rlk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19902a.m518c2(view);
            }
        });
        View viewInflate = ((Act) this).act.getLayoutInflater().inflate(l6c0.D0, (ViewGroup) vNavigationBarFindViewById.getRightIconContainer(), false);
        vNavigationBarFindViewById.z(new View[]{viewInflate});
        xdl0.E0(viewInflate, new View.OnClickListener() { // from class: l.slk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20357a.m520g2(view);
            }
        });
    }

    @Override // p009l.tsi0
    /* JADX INFO: renamed from: F */
    public boolean mo522F() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b2 */
    public final Frag m523b2() {
        if (y19.L()) {
            String strJ = lip0.i().j(this, "Group_square_settings");
            if (!TextUtils.isEmpty(strJ)) {
                return GroupSuggestWebFrag.m543d5(strJ + "?pageId=Group_square_settings");
            }
        }
        return new GroupSuggestFrag();
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m524e2(Throwable th) {
        progressDismiss();
        CoreModule.P().i().d(th);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(l6c0.C0, viewGroup, false);
    }

    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.qlk
            public final void call(Object obj) {
                this.f19379a.lambda$initSubscription$0((Bundle) obj);
            }
        });
        CoreModule.P().i().F3(this);
    }

    public String pageId() {
        return "p_group_chat_square";
    }
}
