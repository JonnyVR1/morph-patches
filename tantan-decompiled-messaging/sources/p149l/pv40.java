package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class pv40 extends jq2<vv40> {

    /* JADX INFO: renamed from: a */
    public User f151396a;

    /* JADX INFO: renamed from: b */
    public boolean f151397b;

    /* JADX INFO: renamed from: c */
    public boolean f151398c;

    /* JADX INFO: renamed from: d */
    public String f151399d;

    public pv40(mcr mcrVar) {
        super(mcrVar);
        this.f151397b = false;
        this.f151398c = false;
        this.f151399d = "";
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m171526g0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m171530l0() {
        m171537r0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m171531m0(Bundle bundle) {
        String stringExtra = act().getIntent().getStringExtra("user");
        this.f151399d = act().getIntent().getStringExtra("from");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(stringExtra);
        this.f151396a = userM169430Pa;
        if (!NullChecker.m81303a(userM169430Pa)) {
            act().m66873d2();
            return;
        }
        ((vv40) this.viewModel).m200171q(this.f151396a, CoreModule.f17545c.f19639e0.m169527p9());
        this.f151398c = true;
        e51.m114743H(act(), new Runnable() { // from class: l.kv40
            @Override // java.lang.Runnable
            public final void run() {
                this.f124748a.m171530l0();
            }
        }, 1500L);
        m171538s0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.jv40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119856a.m171531m0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m171532k0() {
        return this.f151397b;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m171533n0() {
        this.f151398c = false;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m171534o0() {
        CoreModule.m29935P().m94651a().mo158206B1(act(), this.f151396a);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m171535p0(UserPrivilege userPrivilege) {
        if (xma.m210043F3()) {
            this.f151397b = true;
            CoreModule.m29935P().m94651a().mo158316V(act(), this.f151396a, new d30() { // from class: l.ov40
                @Override // p149l.d30
                public final void call() {
                    this.f145763a.m171534o0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m171537r0(boolean z) {
        if (z || !this.f151398c) {
            CoreModule.m29935P().m94651a().mo33618wh(act(), TextUtils.equals(this.f151399d, "p_chat_greet,odiamond_sayhi") ? this.f151399d : "p_suggest_user_profile_info_view,e_odiamond_sayhi,click", null, new d30() { // from class: l.lv40
                @Override // p149l.d30
                public final void call() {
                    this.f130123a.m171533n0();
                }
            }, null, Privilege.immediately_match);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m171538s0() {
        duringCreated(CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("oDiamond"))).distinctUntilChanged().subscribe(mkd0.m154956H(new e30() { // from class: l.mv40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135869a.m171535p0((UserPrivilege) obj);
            }
        }, new e30() { // from class: l.nv40
            @Override // p149l.e30
            public final void call(Object obj) {
                pv40.m171526g0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: renamed from: q0 */
    public void m171536q0() {
    }
}
