package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.Surveys;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class wch0 extends ar2<zch0> {

    /* JADX INFO: renamed from: a */
    public String f188474a;

    /* JADX INFO: renamed from: b */
    public l4g0 f188475b;

    /* JADX INFO: renamed from: c */
    public boolean f188476c;

    /* JADX INFO: renamed from: d */
    public boolean f188477d;

    /* JADX INFO: renamed from: l.wch0$a */
    public class C21074a implements e6m {
        public C21074a() {
        }

        @Override // p153l.e6m
        public boolean disableAutoPV() {
            return true;
        }

        @Override // p153l.e6m
        public String pageId() {
            return wch0.this.f188477d ? "p_feedback_end_popup" : "p_feedback_question_popup";
        }
    }

    public wch0(ner nerVar) {
        super(nerVar);
        this.f188475b = null;
        this.f188476c = false;
        this.f188477d = false;
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m205804i0(Throwable th) {
        if (Network.isConnected(CoreModule.f18263b)) {
            o1j0.m165636j("对不起，出错了");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m205808p0(Bundle bundle) {
        ((zch0) this.viewModel).m219255r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:6:0x001d  */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m205809q0(List list) {
        boolean z;
        ((zch0) this.viewModel).m219258v(list);
        if (!jyb.m147479J(list)) {
            z = jyb.m147479J(((Surveys) list.get(0)).questions);
        }
        this.f188477d = z;
        m205814o0();
        if (this.f188477d) {
            m205818y0(true);
        } else {
            m205819z0(list, true);
        }
        this.f188475b.m152774i();
        this.f188475b.m152777l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m205810r0(Throwable th) {
        if (Network.isConnected(CoreModule.f18263b)) {
            o1j0.m165636j("对不起，出错了");
        }
        act().m68056e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m205811s0(C4470c c4470c) {
        if (NullChecker.m82486a(this.f188475b) && this.f188476c) {
            if (c4470c == C4470c.f16267i) {
                this.f188475b.m152777l();
            } else if (c4470c == C4470c.f16268j) {
                this.f188475b.m152776k();
            } else if (c4470c == C4470c.f16271m) {
                this.f188475b.m152775j();
            }
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.pch0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151576a.m205808p0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20441y0.m175638g3(this.f188474a)).subscribe(psd0.m173597H(new y20() { // from class: l.qch0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156600a.m205809q0((List) obj);
            }
        }, new y20() { // from class: l.rch0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162209a.m205810r0((Throwable) obj);
            }
        }));
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.sch0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167255a.m205811s0((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public String m205812m0() {
        return this.f188474a;
    }

    /* JADX INFO: renamed from: n0 */
    public void m205813n0(String str) {
        this.f188474a = str;
    }

    /* JADX INFO: renamed from: o0 */
    public void m205814o0() {
        this.f188475b = new l4g0(new C21074a());
        this.f188476c = true;
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m205815t0(List list) {
        ((zch0) this.viewModel).m219258v(list);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m205816u0(final List list) {
        ((zch0) this.viewModel).m219257u();
        l51.m152888H(act(), new Runnable() { // from class: l.vch0
            @Override // java.lang.Runnable
            public final void run() {
                this.f183464a.m205815t0(list);
            }
        }, ((zch0) this.viewModel).m219247f());
        boolean z = jyb.m147479J(list) || jyb.m147479J(((Surveys) list.get(0)).questions);
        this.f188477d = z;
        if (!z) {
            m205819z0(list, false);
            this.f188475b.m152776k();
            this.f188475b.m152777l();
        } else {
            this.f188475b.m152776k();
            this.f188475b.m152775j();
            m205814o0();
            m205818y0(false);
            this.f188475b.m152774i();
            this.f188475b.m152777l();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m205817x0(String str) {
        duringCreated(CoreModule.f18264c.f20441y0.m175639h3(str, this.f188474a)).subscribe(psd0.m173597H(new y20() { // from class: l.tch0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f173233a.m205816u0((List) obj);
            }
        }, new y20() { // from class: l.uch0
            @Override // p153l.y20
            public final void call(Object obj) {
                wch0.m205804i0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y0 */
    public void m205818y0(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            jSONObject.put("tooltips_type", "alert");
            jSONObject.put("tooltips_type_ui", "alert_self_definition_basic");
            jSONObject.put("tooltips_trigger_reason", "click");
            jSONObject.put("tooltips_trigger_module", z ? "assistant_message_link" : "feedback_question_submit_button");
            jSONObject.put("tooltips_trigger_page", z ? "assistant_page" : "feedback_question_page");
            this.f188475b.m152780o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m205819z0(List<Surveys> list, boolean z) {
        String str;
        String str2 = list.get(0).questions.get(0).type;
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
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            jSONObject.put("tooltips_type", "alert");
            jSONObject.put("tooltips_type_ui", "alert_special");
            jSONObject.put("tooltips_trigger_reason", "click");
            jSONObject.put("tooltips_trigger_module", z ? "assistant_message_link" : "feedback_question_submit_button");
            jSONObject.put("tooltips_trigger_page", z ? "assistant_page" : "feedback_question_page");
            jSONObject.put("feedback_question_num", list.get(0).questions.get(0).index);
            this.f188475b.m152780o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
