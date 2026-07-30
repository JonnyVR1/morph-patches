package p149l;

import com.p046p1.mobile.putong.app.PutongAct;

/* JADX INFO: loaded from: classes12.dex */
public class k4j0 extends jq2<l4j0> {

    /* JADX INFO: renamed from: a */
    public PutongAct f121098a;

    /* JADX INFO: renamed from: b */
    public String f121099b;

    /* JADX INFO: renamed from: c */
    public String f121100c;

    /* JADX INFO: renamed from: d */
    public String f121101d;

    /* JADX INFO: renamed from: e */
    public String f121102e;

    /* JADX INFO: renamed from: f */
    public int f121103f;

    public k4j0(mcr mcrVar) {
        super(mcrVar);
        this.f121099b = "";
        this.f121100c = "";
        this.f121101d = "";
        this.f121103f = -1;
        this.f121098a = (PutongAct) mcrVar;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
    }

    /* JADX INFO: renamed from: e0 */
    public String m144488e0() {
        this.f121099b = this.f121098a.getIntent().getStringExtra("topic_id");
        this.f121100c = this.f121098a.getIntent().getStringExtra("topic_owner");
        this.f121101d = this.f121098a.getIntent().getStringExtra("moment_id");
        this.f121103f = this.f121098a.getIntent().getIntExtra("vote_index", -1);
        String stringExtra = this.f121098a.getIntent().getStringExtra("from");
        this.f121102e = stringExtra;
        if ("from_topic_official".equals(stringExtra) || "from_h5_topic_aggregation".equals(this.f121102e) || "fromh5_topic_vote_aggregation".equals(this.f121102e)) {
            return "tantan_topic";
        }
        return "from_topic_nearby_header".equals(this.f121102e) ? "nearby" : "tag";
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
