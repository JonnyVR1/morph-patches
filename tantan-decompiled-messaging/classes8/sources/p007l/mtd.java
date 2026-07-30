package p007l;

import android.os.Bundle;
import android.view.View;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.a;
import com.p1.mobile.putong.core.data.BlockedUserStatus;
import com.p1.mobile.putong.core.profile.R;
import l.e30;
import l.ia20;
import l.j760;
import l.pv6;
import l.qib0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.zvf0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class mtd extends jq2<ntd> {

    /* JADX INFO: renamed from: a */
    public String f3331a;

    /* JADX INFO: renamed from: b */
    public String f3332b;

    /* JADX INFO: renamed from: c */
    public String f3333c;

    /* JADX INFO: renamed from: l.mtd$a */
    public class C0615a implements w9j<BlockedUserStatus, c<?>> {
        public C0615a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c<?> call(BlockedUserStatus blockedUserStatus) {
            if (!blockedUserStatus.data.status) {
                mtd.this.f3331a = "";
            }
            return pv6.t3(mtd.this.f3331a, mtd.this.f3332b, mtd.this.f3333c);
        }
    }

    public mtd(mcr mcrVar) {
        super(mcrVar);
        this.f3331a = "";
        this.f3332b = "";
        this.f3333c = "";
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m9922e0(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m9933p0(Bundle bundle) {
        this.f3331a = act().getIntent().getStringExtra("inactivateCategoryKey");
        this.f3332b = act().getIntent().getStringExtra("inactivateReasonKey");
        this.f3333c = act().getIntent().getStringExtra("deleteContent");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m9934q0(Bundle bundle) {
        ((ntd) this.viewModel).m10094r();
    }

    @Override // p007l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo9553Z() {
        super.mo9553Z();
        creates(new e30() { // from class: l.gtd
            public final void call(Object obj) {
                this.f2796a.m9933p0((Bundle) obj);
            }
        });
    }

    @Override // p007l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo8872a0() {
        creates(new e30() { // from class: l.ftd
            public final void call(Object obj) {
                this.f2737a.m9934q0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m9935r0(View view) {
        zvf0.u("e_apply_delete_account_withdraw", act().pageId(), new j760[]{vwb.Y("back_cancel", "withdraw")});
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m9936s0(Throwable th) {
        ((ntd) this.viewModel).m10093c(th);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m9937t0(View view) {
        zvf0.r("e_apply_delete_account_confirm", act().pageId());
        act().progress(R.string.R0);
        ia20.c(new v9j() { // from class: l.jtd
            public final Object call() {
                return qib0.H.auth().q(a.a("/user/status?user_id=" + CoreModule.H().userId())).f().b();
            }
        }, BlockedUserStatus.JSON_ADAPTER).flatMap(new C0615a()).subscribe(mkd0.m9875H(new e30() { // from class: l.ktd
            public final void call(Object obj) {
                mtd.m9922e0(obj);
            }
        }, new e30() { // from class: l.ltd
            public final void call(Object obj) {
                this.f3252a.m9936s0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public View.OnClickListener m9938u0() {
        return new View.OnClickListener() { // from class: l.itd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2925a.m9935r0(view);
            }
        };
    }

    /* JADX INFO: renamed from: x0 */
    public View.OnClickListener m9939x0() {
        return new View.OnClickListener() { // from class: l.htd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2856a.m9937t0(view);
            }
        };
    }

    @Override // p007l.q0m
    public void destroy() {
    }
}
