package p007l;

import com.p000p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.app.PutongAct;
import l.jq2;
import l.mcr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class k4j0 extends jq2<l4j0> {

    /* JADX INFO: renamed from: a */
    public PutongAct f9604a;

    /* JADX INFO: renamed from: b */
    public String f9605b;

    /* JADX INFO: renamed from: c */
    public String f9606c;

    /* JADX INFO: renamed from: d */
    public String f9607d;

    /* JADX INFO: renamed from: e */
    public String f9608e;

    /* JADX INFO: renamed from: f */
    public int f9609f;

    public k4j0(mcr mcrVar) {
        super(mcrVar);
        this.f9605b = "";
        this.f9606c = "";
        this.f9607d = "";
        this.f9609f = -1;
        this.f9604a = (PutongAct) mcrVar;
    }

    /* JADX INFO: renamed from: a0 */
    public void m11389a0() {
        super.a0();
    }

    /* JADX INFO: renamed from: e0 */
    public String m11390e0() {
        this.f9605b = this.f9604a.getIntent().getStringExtra("topic_id");
        this.f9606c = this.f9604a.getIntent().getStringExtra("topic_owner");
        this.f9607d = this.f9604a.getIntent().getStringExtra("moment_id");
        this.f9609f = this.f9604a.getIntent().getIntExtra("vote_index", -1);
        String stringExtra = this.f9604a.getIntent().getStringExtra("from");
        this.f9608e = stringExtra;
        if ("from_topic_official".equals(stringExtra) || "from_h5_topic_aggregation".equals(this.f9608e) || "fromh5_topic_vote_aggregation".equals(this.f9608e)) {
            return "tantan_topic";
        }
        return "from_topic_nearby_header".equals(this.f9608e) ? "nearby" : Tag.TYPE;
    }

    public void destroy() {
    }
}
