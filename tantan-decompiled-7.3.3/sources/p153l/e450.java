package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class e450 extends ar2<k450> {

    /* JADX INFO: renamed from: a */
    public User f92053a;

    /* JADX INFO: renamed from: b */
    public boolean f92054b;

    /* JADX INFO: renamed from: c */
    public boolean f92055c;

    /* JADX INFO: renamed from: d */
    public String f92056d;

    public e450(ner nerVar) {
        super(nerVar);
        this.f92054b = false;
        this.f92055c = false;
        this.f92056d = "";
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m119366g0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m119370l0() {
        m119377r0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m119371m0(Bundle bundle) {
        String stringExtra = act().getIntent().getStringExtra("user");
        this.f92056d = act().getIntent().getStringExtra("from");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(stringExtra);
        this.f92053a = userM116503Pa;
        if (!NullChecker.m82486a(userM116503Pa)) {
            act().m68056e2();
            return;
        }
        ((k450) this.viewModel).m148236q(this.f92053a, CoreModule.f18264c.f20381e0.m116600p9());
        this.f92055c = true;
        l51.m152888H(act(), new Runnable() { // from class: l.z350
            @Override // java.lang.Runnable
            public final void run() {
                this.f202785a.m119370l0();
            }
        }, 1500L);
        m119378s0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.y350
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197307a.m119371m0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m119372k0() {
        return this.f92054b;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m119373n0() {
        this.f92055c = false;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m119374o0() {
        CoreModule.m30933P().m143405a().mo180298B1(act(), this.f92053a);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m119375p0(UserPrivilege userPrivilege) {
        if (joa.m146357G3()) {
            this.f92054b = true;
            CoreModule.m30933P().m143405a().mo180408V(act(), this.f92053a, new x20() { // from class: l.d450
                @Override // p153l.x20
                public final void call() {
                    this.f84999a.m119374o0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m119377r0(boolean z) {
        if (z || !this.f92055c) {
            CoreModule.m30933P().m143405a().mo34621wh(act(), TextUtils.equals(this.f92056d, "p_chat_greet,odiamond_sayhi") ? this.f92056d : "p_suggest_user_profile_info_view,e_odiamond_sayhi,click", null, new x20() { // from class: l.a450
                @Override // p153l.x20
                public final void call() {
                    this.f68352a.m119373n0();
                }
            }, null, Privilege.immediately_match);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m119378s0() {
        duringCreated(CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("oDiamond"))).distinctUntilChanged().subscribe(psd0.m173597H(new y20() { // from class: l.b450
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74860a.m119375p0((UserPrivilege) obj);
            }
        }, new y20() { // from class: l.c450
            @Override // p153l.y20
            public final void call(Object obj) {
                e450.m119366g0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: q0 */
    public void m119376q0() {
    }
}
