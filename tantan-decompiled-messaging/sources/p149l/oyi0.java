package p149l;

import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;

/* JADX INFO: loaded from: classes12.dex */
public class oyi0 extends jq2<pyi0> {

    /* JADX INFO: renamed from: a */
    public PutongAct f146327a;

    /* JADX INFO: renamed from: b */
    public String f146328b;

    /* JADX INFO: renamed from: c */
    public String f146329c;

    /* JADX INFO: renamed from: d */
    public String f146330d;

    /* JADX INFO: renamed from: e */
    public String f146331e;

    public oyi0(mcr mcrVar) {
        super(mcrVar);
        this.f146328b = "";
        this.f146329c = "";
        this.f146330d = "";
        this.f146327a = (PutongAct) mcrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m166667h0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            this.f146327a.hideInput();
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.nyi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141123a.m166667h0((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f0 */
    public String m166668f0() {
        return (!"from_all_topic_newest".equals(this.f146329c) && "FROM_ALL_TOPIC_RECOMMENDED".equals(this.f146329c)) ? "recommend" : "update";
    }

    /* JADX INFO: renamed from: g0 */
    public String m166669g0() {
        this.f146328b = this.f146327a.getIntent().getStringExtra("topic_id");
        this.f146329c = this.f146327a.getIntent().getStringExtra("from");
        this.f146330d = this.f146327a.getIntent().getStringExtra("moment_type");
        this.f146331e = this.f146327a.getIntent().getStringExtra("single_topic_moment");
        if ("from_topic_official".equals(this.f146329c) || "from_h5_topic_aggregation".equals(this.f146329c)) {
            return "tantan_topic";
        }
        if ("from_topic_nearby_header".equals(this.f146329c)) {
            return "nearby";
        }
        if ("from_all_topic_newest".equals(this.f146329c)) {
            return "new_feed";
        }
        if ("FROM_ALL_TOPIC_RECOMMENDED".equals(this.f146329c)) {
            return "recommend_feed";
        }
        return "from_topic_live_group".equals(this.f146329c) ? "live_group_topic" : "tag";
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
