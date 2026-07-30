package p153l;

import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;

/* JADX INFO: loaded from: classes13.dex */
public class s7j0 extends ar2<t7j0> {

    /* JADX INFO: renamed from: a */
    public PutongAct f166693a;

    /* JADX INFO: renamed from: b */
    public String f166694b;

    /* JADX INFO: renamed from: c */
    public String f166695c;

    /* JADX INFO: renamed from: d */
    public String f166696d;

    /* JADX INFO: renamed from: e */
    public String f166697e;

    public s7j0(ner nerVar) {
        super(nerVar);
        this.f166694b = "";
        this.f166695c = "";
        this.f166696d = "";
        this.f166693a = (PutongAct) nerVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m185011h0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            this.f166693a.hideInput();
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.r7j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161620a.m185011h0((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f0 */
    public String m185012f0() {
        return (!"from_all_topic_newest".equals(this.f166695c) && "FROM_ALL_TOPIC_RECOMMENDED".equals(this.f166695c)) ? "recommend" : "update";
    }

    /* JADX INFO: renamed from: g0 */
    public String m185013g0() {
        this.f166694b = this.f166693a.getIntent().getStringExtra("topic_id");
        this.f166695c = this.f166693a.getIntent().getStringExtra("from");
        this.f166696d = this.f166693a.getIntent().getStringExtra("moment_type");
        this.f166697e = this.f166693a.getIntent().getStringExtra("single_topic_moment");
        if ("from_topic_official".equals(this.f166695c) || "from_h5_topic_aggregation".equals(this.f166695c)) {
            return "tantan_topic";
        }
        if ("from_topic_nearby_header".equals(this.f166695c)) {
            return "nearby";
        }
        if ("from_all_topic_newest".equals(this.f166695c)) {
            return "new_feed";
        }
        if ("FROM_ALL_TOPIC_RECOMMENDED".equals(this.f166695c)) {
            return "recommend_feed";
        }
        return "from_topic_live_group".equals(this.f166695c) ? "live_group_topic" : "tag";
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
