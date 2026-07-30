package p007l;

import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.j760;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.r5l0;
import l.rhi;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class f770 extends jq2<b870> {

    /* JADX INFO: renamed from: a */
    public PutongAct f8003a;

    /* JADX INFO: renamed from: b */
    public String f8004b;

    /* JADX INFO: renamed from: c */
    public String f8005c;

    /* JADX INFO: renamed from: d */
    public int f8006d;

    /* JADX INFO: renamed from: e */
    public String f8007e;

    /* JADX INFO: renamed from: f */
    public int f8008f;

    /* JADX INFO: renamed from: g */
    public String f8009g;

    /* JADX INFO: renamed from: h */
    public boolean f8010h;

    public f770(mcr mcrVar) {
        super(mcrVar);
        this.f8003a = (PutongAct) mcrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m10073h0(c cVar) {
        if (cVar == c.i) {
            this.f8003a.hideInput();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m10074i0(j760 j760Var) {
        if (((String) j760Var.a).equals(this.f8004b)) {
            this.f8003a.supportInvalidateOptionsMenu();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m10075a0() {
        super.a0();
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.d770
            public final void call(Object obj) {
                this.f6858a.m10073h0((c) obj);
            }
        }));
        this.f8003a.duringCreated(FeedModule.f316d.f14945P0, false).subscribe(mkd0.G(new e30() { // from class: l.e770
            public final void call(Object obj) {
                this.f7242a.m10074i0((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g0 */
    public void m10076g0() {
        this.f8004b = this.f8003a.getIntent().getStringExtra("user_id");
        this.f8005c = this.f8003a.getIntent().getStringExtra("from");
        this.f8006d = this.f8003a.getIntent().getIntExtra("selected_item_position", -1);
        this.f8007e = this.f8003a.getIntent().getStringExtra("target_moment_id");
        this.f8008f = this.f8003a.getIntent().getIntExtra("page_type", -1);
        this.f8009g = this.f8003a.getIntent().getStringExtra("source_page_id");
        this.f8010h = this.f8003a.getIntent().getBooleanExtra("start_home_card", false);
    }

    /* JADX INFO: renamed from: j0 */
    public void m10077j0(List<Media> list) {
        if (!NullChecker.b(list) || list.size() <= 0 || !(list.get(0) instanceof Video) || new r5l0(rhi.z(list.get(0).url)).b <= 60000) {
            oe40.m12579i0(this.f8003a, list instanceof ArrayList ? (ArrayList) list : new ArrayList(list), false);
        } else {
            lsi0.h(R$string.f648z3);
        }
    }

    public void destroy() {
    }
}
