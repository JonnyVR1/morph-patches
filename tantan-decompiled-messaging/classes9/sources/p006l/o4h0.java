package p006l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.data.Questions;
import com.p1.mobile.putong.core.data.Surveys;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.cwf0;
import l.e30;
import l.e51;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.n3m;
import l.vwb;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class o4h0 extends jq2<r4h0> {

    /* JADX INFO: renamed from: a */
    public String f18011a;

    /* JADX INFO: renamed from: b */
    public cwf0 f18012b;

    /* JADX INFO: renamed from: c */
    public boolean f18013c;

    /* JADX INFO: renamed from: d */
    public boolean f18014d;

    /* JADX INFO: renamed from: l.o4h0$a */
    public class C1072a implements n3m {
        public C1072a() {
        }

        public boolean disableAutoPV() {
            return true;
        }

        public String pageId() {
            return o4h0.this.f18014d ? "p_feedback_end_popup" : "p_feedback_question_popup";
        }
    }

    public o4h0(mcr mcrVar) {
        super(mcrVar);
        this.f18012b = null;
        this.f18013c = false;
        this.f18014d = false;
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m20310i0(Throwable th) {
        if (Network.isConnected(CoreModule.f1533b)) {
            lsi0.j("对不起，出错了");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m20314p0(Bundle bundle) {
        ((r4h0) ((jq2) this).viewModel).m22635r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:6:0x001d  */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m20315q0(List list) {
        boolean z;
        ((r4h0) ((jq2) this).viewModel).m22638v(list);
        if (!vwb.J(list)) {
            z = vwb.J(((Surveys) list.get(0)).questions);
        }
        this.f18014d = z;
        m20321o0();
        if (this.f18014d) {
            m20325y0(true);
        } else {
            m20326z0(list, true);
        }
        this.f18012b.i();
        this.f18012b.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m20316r0(Throwable th) {
        if (Network.isConnected(CoreModule.f1533b)) {
            lsi0.j("对不起，出错了");
        }
        act().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m20317s0(c cVar) {
        if (NullChecker.a(this.f18012b) && this.f18013c) {
            if (cVar == c.i) {
                this.f18012b.l();
            } else if (cVar == c.j) {
                this.f18012b.k();
            } else if (cVar == c.m) {
                this.f18012b.j();
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m20318a0() {
        super.a0();
        creates(new e30() { // from class: l.h4h0
            public final void call(Object obj) {
                this.f13676a.m20314p0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f1534c.f3688y0.m13802g3(this.f18011a)).subscribe(mkd0.H(new e30() { // from class: l.i4h0
            public final void call(Object obj) {
                this.f14225a.m20315q0((List) obj);
            }
        }, new e30() { // from class: l.j4h0
            public final void call(Object obj) {
                this.f14995a.m20316r0((Throwable) obj);
            }
        }));
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.k4h0
            public final void call(Object obj) {
                this.f15614a.m20317s0((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public String m20319m0() {
        return this.f18011a;
    }

    /* JADX INFO: renamed from: n0 */
    public void m20320n0(String str) {
        this.f18011a = str;
    }

    /* JADX INFO: renamed from: o0 */
    public void m20321o0() {
        this.f18012b = new cwf0(new C1072a());
        this.f18013c = true;
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m20322t0(List list) {
        ((r4h0) ((jq2) this).viewModel).m22638v(list);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m20323u0(final List list) {
        ((r4h0) ((jq2) this).viewModel).m22637u();
        e51.H(act(), new Runnable() { // from class: l.n4h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17476a.m20322t0(list);
            }
        }, ((r4h0) ((jq2) this).viewModel).m22626f());
        boolean z = vwb.J(list) || vwb.J(((Surveys) list.get(0)).questions);
        this.f18014d = z;
        if (!z) {
            m20326z0(list, false);
            this.f18012b.k();
            this.f18012b.l();
        } else {
            this.f18012b.k();
            this.f18012b.j();
            m20321o0();
            m20325y0(false);
            this.f18012b.i();
            this.f18012b.l();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m20324x0(String str) {
        duringCreated(CoreModule.f1534c.f3688y0.m13803h3(str, this.f18011a)).subscribe(mkd0.H(new e30() { // from class: l.l4h0
            public final void call(Object obj) {
                this.f16226a.m20323u0((List) obj);
            }
        }, new e30() { // from class: l.m4h0
            public final void call(Object obj) {
                o4h0.m20310i0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y0 */
    public void m20325y0(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tooltips_trigger_mode", "active");
            jSONObject.put("tooltips_type", "alert");
            jSONObject.put("tooltips_type_ui", "alert_self_definition_basic");
            jSONObject.put("tooltips_trigger_reason", "click");
            jSONObject.put("tooltips_trigger_module", z ? "assistant_message_link" : "feedback_question_submit_button");
            jSONObject.put("tooltips_trigger_page", z ? "assistant_page" : "feedback_question_page");
            this.f18012b.o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m20326z0(List<Surveys> list, boolean z) {
        String str;
        String str2 = ((Questions) list.get(0).questions.get(0)).type;
        if (TextUtils.equals(str2, "selection")) {
            str = "single_choice";
        } else if (TextUtils.equals(str2, "multi_selection")) {
            str = "multiple_choice";
        } else {
            str = TextUtils.equals(str2, "fill_blank") ? "question_answer" : "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("feedback_question_type", str);
            jSONObject.put("tooltips_trigger_mode", "active");
            jSONObject.put("tooltips_type", "alert");
            jSONObject.put("tooltips_type_ui", "alert_special");
            jSONObject.put("tooltips_trigger_reason", "click");
            jSONObject.put("tooltips_trigger_module", z ? "assistant_message_link" : "feedback_question_submit_button");
            jSONObject.put("tooltips_trigger_page", z ? "assistant_page" : "feedback_question_page");
            jSONObject.put("feedback_question_num", ((Questions) list.get(0).questions.get(0)).index);
            this.f18012b.o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
    }

    public void destroy() {
    }
}
