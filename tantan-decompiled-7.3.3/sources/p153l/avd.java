package p153l;

import android.os.Bundle;
import android.view.View;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.data.BalanceOpsType;
import com.p051p1.mobile.putong.core.data.BlockedUserStatus;
import com.p051p1.mobile.putong.core.profile.R$string;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class avd extends ar2<bvd> {

    /* JADX INFO: renamed from: a */
    public String f73605a;

    /* JADX INFO: renamed from: b */
    public String f73606b;

    /* JADX INFO: renamed from: c */
    public String f73607c;

    /* JADX INFO: renamed from: l.avd$a */
    public class C15846a implements qcj<BlockedUserStatus, C22421c<?>> {
        public C15846a() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22421c<?> call(BlockedUserStatus blockedUserStatus) {
            if (!blockedUserStatus.data.status) {
                avd.this.f73605a = "";
            }
            return sw6.m188257t3(avd.this.f73605a, avd.this.f73606b, avd.this.f73607c);
        }
    }

    public avd(ner nerVar) {
        super(nerVar);
        this.f73605a = "";
        this.f73606b = "";
        this.f73607c = "";
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m100433e0(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m100444p0(Bundle bundle) {
        this.f73605a = act().getIntent().getStringExtra("inactivateCategoryKey");
        this.f73606b = act().getIntent().getStringExtra("inactivateReasonKey");
        this.f73607c = act().getIntent().getStringExtra("deleteContent");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m100445q0(Bundle bundle) {
        ((bvd) this.viewModel).m106562r();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        creates(new y20() { // from class: l.uud
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181054a.m100444p0((Bundle) obj);
            }
        });
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.tud
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176182a.m100445q0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m100446r0(View view) {
        i4g0.m138523u("e_apply_delete_account_withdraw", act().pageId(), jyb.m147494Y("back_cancel", BalanceOpsType.withdraw));
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m100447s0(Throwable th) {
        ((bvd) this.viewModel).m106561c(th);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m100448t0(View view) {
        i4g0.m138520r("e_apply_delete_account_confirm", act().pageId());
        act().progress(R$string.f28619R0);
        qi20.m176656c(new pcj() { // from class: l.xud
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.auth().m209043q(C4879a.m32278a("/user/status?user_id=" + CoreModule.m30929H().userId())).m209032f().m209028b();
            }
        }, BlockedUserStatus.JSON_ADAPTER).flatMap(new C15846a()).subscribe(psd0.m173597H(new y20() { // from class: l.yud
            @Override // p153l.y20
            public final void call(Object obj) {
                avd.m100433e0(obj);
            }
        }, new y20() { // from class: l.zud
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206112a.m100447s0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public View.OnClickListener m100449u0() {
        return new View.OnClickListener() { // from class: l.wud
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190853a.m100446r0(view);
            }
        };
    }

    /* JADX INFO: renamed from: x0 */
    public View.OnClickListener m100450x0() {
        return new View.OnClickListener() { // from class: l.vud
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185777a.m100448t0(view);
            }
        };
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
