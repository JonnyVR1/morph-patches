package p149l;

import android.os.Bundle;
import android.view.View;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.data.BalanceOpsType;
import com.p046p1.mobile.putong.core.data.BlockedUserStatus;
import com.p046p1.mobile.putong.core.profile.R$string;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes8.dex */
public class mtd extends jq2<ntd> {

    /* JADX INFO: renamed from: a */
    public String f135576a;

    /* JADX INFO: renamed from: b */
    public String f135577b;

    /* JADX INFO: renamed from: c */
    public String f135578c;

    /* JADX INFO: renamed from: l.mtd$a */
    public class C18556a implements w9j<BlockedUserStatus, C22306c<?>> {
        public C18556a() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22306c<?> call(BlockedUserStatus blockedUserStatus) {
            if (!blockedUserStatus.data.status) {
                mtd.this.f135576a = "";
            }
            return pv6.m171561t3(mtd.this.f135576a, mtd.this.f135577b, mtd.this.f135578c);
        }
    }

    public mtd(mcr mcrVar) {
        super(mcrVar);
        this.f135576a = "";
        this.f135577b = "";
        this.f135578c = "";
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m156199e0(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m156210p0(Bundle bundle) {
        this.f135576a = act().getIntent().getStringExtra("inactivateCategoryKey");
        this.f135577b = act().getIntent().getStringExtra("inactivateReasonKey");
        this.f135578c = act().getIntent().getStringExtra("deleteContent");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m156211q0(Bundle bundle) {
        ((ntd) this.viewModel).m161380r();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        creates(new e30() { // from class: l.gtd
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104272a.m156210p0((Bundle) obj);
            }
        });
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.ftd
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99176a.m156211q0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m156212r0(View view) {
        zvf0.m220399u("e_apply_delete_account_withdraw", act().pageId(), vwb.m200311Y("back_cancel", BalanceOpsType.withdraw));
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m156213s0(Throwable th) {
        ((ntd) this.viewModel).m161379c(th);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m156214t0(View view) {
        zvf0.m220396r("e_apply_delete_account_confirm", act().pageId());
        act().progress(R$string.f27771R0);
        ia20.m135119c(new v9j() { // from class: l.jtd
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.auth().m185898q(C4728a.m31275a("/user/status?user_id=" + CoreModule.m29931H().userId())).m185887f().m185883b();
            }
        }, BlockedUserStatus.JSON_ADAPTER).flatMap(new C18556a()).subscribe(mkd0.m154956H(new e30() { // from class: l.ktd
            @Override // p149l.e30
            public final void call(Object obj) {
                mtd.m156199e0(obj);
            }
        }, new e30() { // from class: l.ltd
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129962a.m156213s0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public View.OnClickListener m156215u0() {
        return new View.OnClickListener() { // from class: l.itd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114873a.m156212r0(view);
            }
        };
    }

    /* JADX INFO: renamed from: x0 */
    public View.OnClickListener m156216x0() {
        return new View.OnClickListener() { // from class: l.htd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109386a.m156214t0(view);
            }
        };
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
