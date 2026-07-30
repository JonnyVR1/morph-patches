package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.Surveys;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class o4h0 extends jq2<r4h0> {

    /* JADX INFO: renamed from: a */
    public String f141775a;

    /* JADX INFO: renamed from: b */
    public cwf0 f141776b;

    /* JADX INFO: renamed from: c */
    public boolean f141777c;

    /* JADX INFO: renamed from: d */
    public boolean f141778d;

    /* JADX INFO: renamed from: l.o4h0$a */
    public class C18840a implements n3m {
        public C18840a() {
        }

        @Override // p149l.n3m
        public boolean disableAutoPV() {
            return true;
        }

        @Override // p149l.n3m
        public String pageId() {
            return o4h0.this.f141778d ? "p_feedback_end_popup" : "p_feedback_question_popup";
        }
    }

    public o4h0(mcr mcrVar) {
        super(mcrVar);
        this.f141776b = null;
        this.f141777c = false;
        this.f141778d = false;
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m162580i0(Throwable th) {
        if (Network.isConnected(CoreModule.f17544b)) {
            lsi0.m151580j("对不起，出错了");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m162584p0(Bundle bundle) {
        ((r4h0) this.viewModel).m177803r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:6:0x001d  */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m162585q0(List list) {
        boolean z;
        ((r4h0) this.viewModel).m177806v(list);
        if (!vwb.m200296J(list)) {
            z = vwb.m200296J(((Surveys) list.get(0)).questions);
        }
        this.f141778d = z;
        m162590o0();
        if (this.f141778d) {
            m162594y0(true);
        } else {
            m162595z0(list, true);
        }
        this.f141776b.m109033i();
        this.f141776b.m109036l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m162586r0(Throwable th) {
        if (Network.isConnected(CoreModule.f17544b)) {
            lsi0.m151580j("对不起，出错了");
        }
        act().m66873d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m162587s0(C4319c c4319c) {
        if (NullChecker.m81303a(this.f141776b) && this.f141777c) {
            if (c4319c == C4319c.f15548i) {
                this.f141776b.m109036l();
            } else if (c4319c == C4319c.f15549j) {
                this.f141776b.m109035k();
            } else if (c4319c == C4319c.f15552m) {
                this.f141776b.m109034j();
            }
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.h4h0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105838a.m162584p0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19699y0.m110160g3(this.f141775a)).subscribe(mkd0.m154956H(new e30() { // from class: l.i4h0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111451a.m162585q0((List) obj);
            }
        }, new e30() { // from class: l.j4h0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116191a.m162586r0((Throwable) obj);
            }
        }));
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.k4h0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121095a.m162587s0((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public String m162588m0() {
        return this.f141775a;
    }

    /* JADX INFO: renamed from: n0 */
    public void m162589n0(String str) {
        this.f141775a = str;
    }

    /* JADX INFO: renamed from: o0 */
    public void m162590o0() {
        this.f141776b = new cwf0(new C18840a());
        this.f141777c = true;
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m162591t0(List list) {
        ((r4h0) this.viewModel).m177806v(list);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m162592u0(final List list) {
        ((r4h0) this.viewModel).m177805u();
        e51.m114743H(act(), new Runnable() { // from class: l.n4h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f137109a.m162591t0(list);
            }
        }, ((r4h0) this.viewModel).m177795f());
        boolean z = vwb.m200296J(list) || vwb.m200296J(((Surveys) list.get(0)).questions);
        this.f141778d = z;
        if (!z) {
            m162595z0(list, false);
            this.f141776b.m109035k();
            this.f141776b.m109036l();
        } else {
            this.f141776b.m109035k();
            this.f141776b.m109034j();
            m162590o0();
            m162594y0(false);
            this.f141776b.m109033i();
            this.f141776b.m109036l();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m162593x0(String str) {
        duringCreated(CoreModule.f17545c.f19699y0.m110161h3(str, this.f141775a)).subscribe(mkd0.m154956H(new e30() { // from class: l.l4h0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f126036a.m162592u0((List) obj);
            }
        }, new e30() { // from class: l.m4h0
            @Override // p149l.e30
            public final void call(Object obj) {
                o4h0.m162580i0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y0 */
    public void m162594y0(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            jSONObject.put("tooltips_type", "alert");
            jSONObject.put("tooltips_type_ui", "alert_self_definition_basic");
            jSONObject.put("tooltips_trigger_reason", "click");
            jSONObject.put("tooltips_trigger_module", z ? "assistant_message_link" : "feedback_question_submit_button");
            jSONObject.put("tooltips_trigger_page", z ? "assistant_page" : "feedback_question_page");
            this.f141776b.m109039o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m162595z0(List<Surveys> list, boolean z) {
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
            this.f141776b.m109039o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
