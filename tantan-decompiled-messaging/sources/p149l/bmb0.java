package p149l;

import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;

/* JADX INFO: loaded from: classes12.dex */
public class bmb0 extends jq2<lmb0> {

    /* JADX INFO: renamed from: a */
    public PutongAct f76257a;

    /* JADX INFO: renamed from: b */
    public String f76258b;

    /* JADX INFO: renamed from: c */
    public String f76259c;

    /* JADX INFO: renamed from: d */
    public String f76260d;

    public bmb0(mcr mcrVar) {
        super(mcrVar);
        this.f76258b = "";
        this.f76259c = "";
        this.f76257a = (PutongAct) mcrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m102619h0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            this.f76257a.hideInput();
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.zlb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203613a.m102619h0((C4319c) obj);
            }
        }));
        creates(new e30() { // from class: l.amb0
            @Override // p149l.e30
            public final void call(Object obj) {
                oe40.m163806H();
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public String m102620g0() {
        this.f76258b = this.f76257a.getIntent().getStringExtra("topic_id");
        this.f76259c = this.f76257a.getIntent().getStringExtra("from");
        this.f76260d = this.f76257a.getIntent().getStringExtra("single_topic_moment");
        if ("from_topic_official".equals(this.f76259c) || "from_h5_topic_aggregation".equals(this.f76259c) || "fromh5_topic_vote_aggregation".equals(this.f76259c)) {
            return "tantan_topic";
        }
        return "from_topic_nearby_header".equals(this.f76259c) ? "nearby" : "tag";
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
