package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.newui.messages.C8140a;
import com.p046p1.mobile.putong.core.p053ui.match.C8455a;
import com.p046p1.mobile.putong.core.p053ui.match.C8456b;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p149l.yvl;

/* JADX INFO: loaded from: classes3.dex */
public class l5x<T extends yvl> extends jq2<T> {

    /* JADX INFO: renamed from: a */
    public int f126210a;

    /* JADX INFO: renamed from: b */
    public String f126211b;

    /* JADX INFO: renamed from: c */
    public User f126212c;

    public l5x(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m148661f0(Throwable th) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m148665j0(User user) {
        Conversation conversationQuery = CoreModule.f17553k.f91950m.query(user.f56011id);
        conversationQuery.convType = "default";
        CoreModule.f17545c.f19642f0.m33050mq(conversationQuery);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m148668m0(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m148670A0(UserPrivilege userPrivilege) {
        if (xma.m210040C3()) {
            if (C8455a.m47588w().m47589A()) {
                final User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f126211b);
                C8455a.m47588w().m47598J(act(), userM169430Pa, new d30() { // from class: l.h5x
                    @Override // p149l.d30
                    public final void call() {
                        this.f105994a.m148679z0(userM169430Pa);
                    }
                });
            } else {
                lsi0.m151568F(act(), act().getString(R$string.f18787o9));
                act().m66873d2();
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public String m148671o0() {
        return this.f126211b;
    }

    /* JADX INFO: renamed from: p0 */
    public String m148672p0(String str) {
        if (upa.m194694S1() || upa.m194770j2()) {
            return TextUtils.equals(str, "tmp_from_home_swipe") ? "positive" : "negative";
        }
        return null;
    }

    /* JADX INFO: renamed from: q0 */
    public void mo134431q0(String str, int i, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        this.f126211b = str;
        this.f126210a = i;
    }

    /* JADX INFO: renamed from: r0 */
    public void m148673r0() {
        duringCreated(CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip")).distinctUntilChanged()).filter(new w9j() { // from class: l.b5x
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!xma.m210071e4());
            }
        }).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.c5x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79427a.m148678y0((UserPrivilege) obj);
            }
        }, new e30() { // from class: l.d5x
            @Override // p149l.e30
            public final void call(Object obj) {
                l5x.m148668m0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public void m148674s0() {
        duringCreated((C22306c<T>) CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.ultraPremium))).distinctUntilChanged().subscribe(mkd0.m154956H(new e30() { // from class: l.e5x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89475a.m148670A0((UserPrivilege) obj);
            }
        }, new e30() { // from class: l.f5x
            @Override // p149l.e30
            public final void call(Object obj) {
                l5x.m148661f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public void m148675t0(cwf0 cwf0Var, String str) {
        o6j0.C18854a c18854aM162879i;
        String strM148672p0 = m148672p0(str);
        if (TextUtils.isEmpty(this.f126211b) || !C8140a.m41831p(this.f126211b)) {
            if (upa.m194809r1()) {
                c18854aM162879i = o6j0.C18854a.m162879i("is_matched_longtimenosee", this.f126210a == 44);
            } else {
                c18854aM162879i = null;
            }
            cwf0Var.m109039o(o6j0.m162858b(o6j0.C18854a.m162878h("moments_user_id", this.f126211b), o6j0.C18854a.m162878h("match_source", strM148672p0), c18854aM162879i));
        } else {
            cwf0Var.m109039o(o6j0.m162858b(o6j0.C18854a.m162878h("other_user_id", this.f126211b)));
        }
        if (upa.m194770j2()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("match_source", strM148672p0);
                jSONObject.put("moments_user_id", this.f126211b);
                jSONObject.put("matched_received_page_type", "male");
                if (upa.m194809r1()) {
                    jSONObject.put("is_matched_longtimenosee", this.f126210a == 44 ? 1 : 0);
                }
                cwf0Var.m109039o(jSONObject);
            } catch (JSONException e) {
                CrashHelper.m81296c(e);
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m148676u0(User user) {
        C8456b.m47638r(act(), user);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m148677x0(final User user, Integer num) {
        e51.m114774y(new Runnable() { // from class: l.i5x
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.k5x
                    @Override // p149l.d30
                    public final void call() {
                        l5x.m148665j0(user);
                    }
                });
            }
        });
        q8p.INSTANCE.m173430e();
        CoreModule.m29932K().pollConversation();
        e51.m114743H(act(), new Runnable() { // from class: l.j5x
            @Override // java.lang.Runnable
            public final void run() {
                this.f116359a.m148676u0(user);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m148678y0(UserPrivilege userPrivilege) {
        if (xma.m210071e4()) {
            return;
        }
        final User userById = CoreModule.m29932K().getUserById(this.f126211b);
        tae0.m187716t(act(), userById, new e30() { // from class: l.g5x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101209a.m148677x0(userById, (Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m148679z0(User user) {
        C8455a.m47588w().m47619z(act(), user);
        CoreModule.f17545c.f19595P1.f179756R.onNext(roj0.f160388a);
        act().m66873d2();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
