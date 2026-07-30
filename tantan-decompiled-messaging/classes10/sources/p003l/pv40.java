package p003l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.data.Privilege;
import com.p000p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p000p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.e51;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.xma;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pv40 extends jq2<vv40> {

    /* JADX INFO: renamed from: a */
    public User f6922a;

    /* JADX INFO: renamed from: b */
    public boolean f6923b;

    /* JADX INFO: renamed from: c */
    public boolean f6924c;

    /* JADX INFO: renamed from: d */
    public String f6925d;

    public pv40(mcr mcrVar) {
        super(mcrVar);
        this.f6923b = false;
        this.f6924c = false;
        this.f6925d = "";
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m8799g0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m8803l0() {
        m8811r0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m8804m0(Bundle bundle) {
        String stringExtra = act().getIntent().getStringExtra("user");
        this.f6925d = act().getIntent().getStringExtra("from");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        User userPa = CoreModule.c.e0.Pa(stringExtra);
        this.f6922a = userPa;
        if (!NullChecker.a(userPa)) {
            act().finish();
            return;
        }
        ((vv40) ((jq2) this).viewModel).m10383q(this.f6922a, CoreModule.c.e0.p9());
        this.f6924c = true;
        e51.H(act(), new Runnable() { // from class: l.kv40
            @Override // java.lang.Runnable
            public final void run() {
                this.f5713a.m8803l0();
            }
        }, 1500L);
        m8812s0();
    }

    /* JADX INFO: renamed from: a0 */
    public void m8805a0() {
        super.a0();
        creates(new e30() { // from class: l.jv40
            public final void call(Object obj) {
                this.f5386a.m8804m0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m8806k0() {
        return this.f6923b;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m8807n0() {
        this.f6924c = false;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m8808o0() {
        CoreModule.P().a().B1(act(), this.f6922a);
        act().finish();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m8809p0(UserPrivilege userPrivilege) {
        if (xma.F3()) {
            this.f6923b = true;
            CoreModule.P().a().V(act(), this.f6922a, new d30() { // from class: l.ov40
                public final void call() {
                    this.f6752a.m8808o0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m8811r0(boolean z) {
        if (z || !this.f6924c) {
            CoreModule.P().a().wh(act(), TextUtils.equals(this.f6925d, "p_chat_greet,odiamond_sayhi") ? this.f6925d : "p_suggest_user_profile_info_view,e_odiamond_sayhi,click", (e30) null, new d30() { // from class: l.lv40
                public final void call() {
                    this.f6223a.m8807n0();
                }
            }, (d30) null, Privilege.immediately_match);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m8812s0() {
        duringCreated(CoreModule.c.C0.u3(SummarizedPrivilegesId.get("oDiamond"))).distinctUntilChanged().subscribe(mkd0.H(new e30() { // from class: l.mv40
            public final void call(Object obj) {
                this.f6434a.m8809p0((UserPrivilege) obj);
            }
        }, new e30() { // from class: l.nv40
            public final void call(Object obj) {
                pv40.m8799g0((Throwable) obj);
            }
        }));
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: q0 */
    public void m8810q0() {
    }
}
