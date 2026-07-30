package p003l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.match.C0038a;
import com.p000p1.mobile.putong.core.p001ui.match.C0039b;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.core.newui.messages.a;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import l.cwf0;
import l.e51;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.o6j0;
import l.q8p;
import l.roj0;
import l.tae0;
import l.upa;
import l.xma;
import org.eclipse.jetty.servlet.ServletHandler;
import org.json.JSONException;
import org.json.JSONObject;
import p003l.yvl;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class l5x<T extends yvl> extends jq2<T> {

    /* JADX INFO: renamed from: a */
    public int f5219a;

    /* JADX INFO: renamed from: b */
    public String f5220b;

    /* JADX INFO: renamed from: c */
    public User f5221c;

    public l5x(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m5975f0(Throwable th) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m5979j0(User user) {
        Conversation conversationQuery = CoreModule.k.m.query(((DbObject) user).id);
        conversationQuery.convType = ServletHandler.__DEFAULT_SERVLET;
        CoreModule.c.f0.mq(conversationQuery);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m5982m0(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m5984A0(UserPrivilege userPrivilege) {
        if (xma.C3()) {
            if (C0038a.m652w().m653A()) {
                final User userPa = CoreModule.c.e0.Pa(this.f5220b);
                C0038a.m652w().m662J(act(), userPa, new d30() { // from class: l.h5x
                    @Override // p003l.d30
                    public final void call() {
                        this.f4119a.m5993z0(userPa);
                    }
                });
            } else {
                lsi0.F(act(), act().getString(R.string.o9));
                act().finish();
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public String m5985o0() {
        return this.f5220b;
    }

    /* JADX INFO: renamed from: p0 */
    public String m5986p0(String str) {
        if (upa.S1() || upa.j2()) {
            return TextUtils.equals(str, "tmp_from_home_swipe") ? "positive" : "negative";
        }
        return null;
    }

    /* JADX INFO: renamed from: q0 */
    public void mo5067q0(String str, int i, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        this.f5220b = str;
        this.f5219a = i;
    }

    /* JADX INFO: renamed from: r0 */
    public void m5987r0() {
        duringCreated(CoreModule.c.C0.u3(SummarizedPrivilegesId.get("svip")).distinctUntilChanged()).filter(new w9j() { // from class: l.b5x
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!xma.e4());
            }
        }).take(1).subscribe((m250) mkd0.H(new e30() { // from class: l.c5x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2579a.m5992y0((UserPrivilege) obj);
            }
        }, new e30() { // from class: l.d5x
            @Override // p003l.e30
            public final void call(Object obj) {
                l5x.m5982m0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public void m5988s0() {
        duringCreated(CoreModule.c.C0.u3(SummarizedPrivilegesId.get("ultraPremium"))).distinctUntilChanged().subscribe((m250) mkd0.H(new e30() { // from class: l.e5x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3205a.m5984A0((UserPrivilege) obj);
            }
        }, new e30() { // from class: l.f5x
            @Override // p003l.e30
            public final void call(Object obj) {
                l5x.m5975f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public void m5989t0(cwf0 cwf0Var, String str) {
        o6j0.a aVarI;
        String strM5986p0 = m5986p0(str);
        if (TextUtils.isEmpty(this.f5220b) || !a.p(this.f5220b)) {
            if (upa.r1()) {
                aVarI = o6j0.a.i("is_matched_longtimenosee", this.f5219a == 44);
            } else {
                aVarI = null;
            }
            cwf0Var.o(o6j0.b(new o6j0.a[]{o6j0.a.h("moments_user_id", this.f5220b), o6j0.a.h("match_source", strM5986p0), aVarI}));
        } else {
            cwf0Var.o(o6j0.b(new o6j0.a[]{o6j0.a.h("other_user_id", this.f5220b)}));
        }
        if (upa.j2()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("match_source", strM5986p0);
                jSONObject.put("moments_user_id", this.f5220b);
                jSONObject.put("matched_received_page_type", "male");
                if (upa.r1()) {
                    jSONObject.put("is_matched_longtimenosee", this.f5219a == 44 ? 1 : 0);
                }
                cwf0Var.o(jSONObject);
            } catch (JSONException e) {
                CrashHelper.c(e);
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m5990u0(User user) {
        C0039b.m702r(act(), user);
        act().finish();
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m5991x0(final User user, Integer num) {
        e51.y(new Runnable() { // from class: l.i5x
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.c.U.a(new d30() { // from class: l.k5x
                    @Override // p003l.d30
                    public final void call() {
                        l5x.m5979j0(user);
                    }
                });
            }
        });
        q8p.Companion.e();
        CoreModule.K().pollConversation();
        e51.H(act(), new Runnable() { // from class: l.j5x
            @Override // java.lang.Runnable
            public final void run() {
                this.f4576a.m5990u0(user);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m5992y0(UserPrivilege userPrivilege) {
        if (xma.e4()) {
            return;
        }
        final User userById = CoreModule.K().getUserById(this.f5220b);
        tae0.t(act(), userById, new e30() { // from class: l.g5x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3805a.m5991x0(userById, (Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m5993z0(User user) {
        C0038a.m652w().m683z(act(), user);
        CoreModule.c.P1.R.onNext(roj0.a);
        act().finish();
    }

    public void destroy() {
    }
}
