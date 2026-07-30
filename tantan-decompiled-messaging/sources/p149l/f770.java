package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class f770 extends jq2<b870> {

    /* JADX INFO: renamed from: a */
    public PutongAct f96212a;

    /* JADX INFO: renamed from: b */
    public String f96213b;

    /* JADX INFO: renamed from: c */
    public String f96214c;

    /* JADX INFO: renamed from: d */
    public int f96215d;

    /* JADX INFO: renamed from: e */
    public String f96216e;

    /* JADX INFO: renamed from: f */
    public int f96217f;

    /* JADX INFO: renamed from: g */
    public String f96218g;

    /* JADX INFO: renamed from: h */
    public boolean f96219h;

    public f770(mcr mcrVar) {
        super(mcrVar);
        this.f96212a = (PutongAct) mcrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m119780h0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            this.f96212a.hideInput();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m119781i0(j760 j760Var) {
        if (((String) j760Var.f116564a).equals(this.f96213b)) {
            this.f96212a.supportInvalidateOptionsMenu();
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.d770
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84710a.m119780h0((C4319c) obj);
            }
        }));
        this.f96212a.duringCreated((C22306c) FeedModule.f38855d.f193010P0, false).subscribe(mkd0.m154955G(new e30() { // from class: l.e770
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89673a.m119781i0((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g0 */
    public void m119782g0() {
        this.f96213b = this.f96212a.getIntent().getStringExtra("user_id");
        this.f96214c = this.f96212a.getIntent().getStringExtra("from");
        this.f96215d = this.f96212a.getIntent().getIntExtra("selected_item_position", -1);
        this.f96216e = this.f96212a.getIntent().getStringExtra("target_moment_id");
        this.f96217f = this.f96212a.getIntent().getIntExtra("page_type", -1);
        this.f96218g = this.f96212a.getIntent().getStringExtra("source_page_id");
        this.f96219h = this.f96212a.getIntent().getBooleanExtra("start_home_card", false);
    }

    /* JADX INFO: renamed from: j0 */
    public void m119783j0(List<Media> list) {
        if (!NullChecker.m81304b(list) || list.size() <= 0 || !(list.get(0) instanceof Video) || new r5l0(rhi.m179382z(list.get(0).url)).f157831b <= Constants.ONE_MIN_IN_MILLIS) {
            oe40.m163842i0(this.f96212a, list instanceof ArrayList ? (ArrayList) list : new ArrayList(list), false);
        } else {
            lsi0.m151578h(R$string.f39187z3);
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
