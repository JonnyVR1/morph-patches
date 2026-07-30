package p007l;

import com.p000p1.mobile.putong.data.LoadStrategy;
import com.p000p1.mobile.putong.data.Tag;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongAct;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class oyi0 extends jq2<pyi0> {

    /* JADX INFO: renamed from: a */
    public PutongAct f11645a;

    /* JADX INFO: renamed from: b */
    public String f11646b;

    /* JADX INFO: renamed from: c */
    public String f11647c;

    /* JADX INFO: renamed from: d */
    public String f11648d;

    /* JADX INFO: renamed from: e */
    public String f11649e;

    public oyi0(mcr mcrVar) {
        super(mcrVar);
        this.f11646b = "";
        this.f11647c = "";
        this.f11648d = "";
        this.f11645a = (PutongAct) mcrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m12871h0(c cVar) {
        if (cVar == c.i) {
            this.f11645a.hideInput();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m12872a0() {
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.nyi0
            public final void call(Object obj) {
                this.f10942a.m12871h0((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f0 */
    public String m12873f0() {
        return (!"from_all_topic_newest".equals(this.f11647c) && "FROM_ALL_TOPIC_RECOMMENDED".equals(this.f11647c)) ? "recommend" : LoadStrategy.update;
    }

    /* JADX INFO: renamed from: g0 */
    public String m12874g0() {
        this.f11646b = this.f11645a.getIntent().getStringExtra("topic_id");
        this.f11647c = this.f11645a.getIntent().getStringExtra("from");
        this.f11648d = this.f11645a.getIntent().getStringExtra("moment_type");
        this.f11649e = this.f11645a.getIntent().getStringExtra("single_topic_moment");
        if ("from_topic_official".equals(this.f11647c) || "from_h5_topic_aggregation".equals(this.f11647c)) {
            return "tantan_topic";
        }
        if ("from_topic_nearby_header".equals(this.f11647c)) {
            return "nearby";
        }
        if ("from_all_topic_newest".equals(this.f11647c)) {
            return "new_feed";
        }
        if ("FROM_ALL_TOPIC_RECOMMENDED".equals(this.f11647c)) {
            return "recommend_feed";
        }
        return "from_topic_live_group".equals(this.f11647c) ? "live_group_topic" : Tag.TYPE;
    }

    public void destroy() {
    }
}
