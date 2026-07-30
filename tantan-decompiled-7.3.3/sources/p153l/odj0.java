package p153l;

import com.p051p1.mobile.putong.app.PutongAct;

/* JADX INFO: loaded from: classes13.dex */
public class odj0 extends ar2<pdj0> {

    /* JADX INFO: renamed from: a */
    public PutongAct f146913a;

    /* JADX INFO: renamed from: b */
    public String f146914b;

    /* JADX INFO: renamed from: c */
    public String f146915c;

    /* JADX INFO: renamed from: d */
    public String f146916d;

    /* JADX INFO: renamed from: e */
    public String f146917e;

    /* JADX INFO: renamed from: f */
    public int f146918f;

    public odj0(ner nerVar) {
        super(nerVar);
        this.f146914b = "";
        this.f146915c = "";
        this.f146916d = "";
        this.f146918f = -1;
        this.f146913a = (PutongAct) nerVar;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
    }

    /* JADX INFO: renamed from: e0 */
    public String m167318e0() {
        this.f146914b = this.f146913a.getIntent().getStringExtra("topic_id");
        this.f146915c = this.f146913a.getIntent().getStringExtra("topic_owner");
        this.f146916d = this.f146913a.getIntent().getStringExtra("moment_id");
        this.f146918f = this.f146913a.getIntent().getIntExtra("vote_index", -1);
        String stringExtra = this.f146913a.getIntent().getStringExtra("from");
        this.f146917e = stringExtra;
        if ("from_topic_official".equals(stringExtra) || "from_h5_topic_aggregation".equals(this.f146917e) || "fromh5_topic_vote_aggregation".equals(this.f146917e)) {
            return "tantan_topic";
        }
        return "from_topic_nearby_header".equals(this.f146917e) ? "nearby" : "tag";
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
