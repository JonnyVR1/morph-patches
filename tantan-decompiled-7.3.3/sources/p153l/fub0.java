package p153l;

import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;

/* JADX INFO: loaded from: classes13.dex */
public class fub0 extends ar2<pub0> {

    /* JADX INFO: renamed from: a */
    public PutongAct f100896a;

    /* JADX INFO: renamed from: b */
    public String f100897b;

    /* JADX INFO: renamed from: c */
    public String f100898c;

    /* JADX INFO: renamed from: d */
    public String f100899d;

    public fub0(ner nerVar) {
        super(nerVar);
        this.f100897b = "";
        this.f100898c = "";
        this.f100896a = (PutongAct) nerVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m127452h0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            this.f100896a.hideInput();
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.dub0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90782a.m127452h0((C4470c) obj);
            }
        }));
        creates(new y20() { // from class: l.eub0
            @Override // p153l.y20
            public final void call(Object obj) {
                cn40.m111356H();
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public String m127453g0() {
        this.f100897b = this.f100896a.getIntent().getStringExtra("topic_id");
        this.f100898c = this.f100896a.getIntent().getStringExtra("from");
        this.f100899d = this.f100896a.getIntent().getStringExtra("single_topic_moment");
        if ("from_topic_official".equals(this.f100898c) || "from_h5_topic_aggregation".equals(this.f100898c) || "fromh5_topic_vote_aggregation".equals(this.f100898c)) {
            return "tantan_topic";
        }
        return "from_topic_nearby_header".equals(this.f100898c) ? "nearby" : "tag";
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
