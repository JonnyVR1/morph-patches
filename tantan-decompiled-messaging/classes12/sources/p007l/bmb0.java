package p007l;

import com.p000p1.mobile.putong.data.Tag;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongAct;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class bmb0 extends jq2<lmb0> {

    /* JADX INFO: renamed from: a */
    public PutongAct f6372a;

    /* JADX INFO: renamed from: b */
    public String f6373b;

    /* JADX INFO: renamed from: c */
    public String f6374c;

    /* JADX INFO: renamed from: d */
    public String f6375d;

    public bmb0(mcr mcrVar) {
        super(mcrVar);
        this.f6373b = "";
        this.f6374c = "";
        this.f6372a = (PutongAct) mcrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m8942h0(c cVar) {
        if (cVar == c.i) {
            this.f6372a.hideInput();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m8943a0() {
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.zlb0
            public final void call(Object obj) {
                this.f15798a.m8942h0((c) obj);
            }
        }));
        creates(new e30() { // from class: l.amb0
            public final void call(Object obj) {
                oe40.m12543H();
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public String m8944g0() {
        this.f6373b = this.f6372a.getIntent().getStringExtra("topic_id");
        this.f6374c = this.f6372a.getIntent().getStringExtra("from");
        this.f6375d = this.f6372a.getIntent().getStringExtra("single_topic_moment");
        if ("from_topic_official".equals(this.f6374c) || "from_h5_topic_aggregation".equals(this.f6374c) || "fromh5_topic_vote_aggregation".equals(this.f6374c)) {
            return "tantan_topic";
        }
        return "from_topic_nearby_header".equals(this.f6374c) ? "nearby" : Tag.TYPE;
    }

    public void destroy() {
    }
}
