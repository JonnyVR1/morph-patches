package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class lf70 extends ar2<hg70> {

    /* JADX INFO: renamed from: a */
    public PutongAct f131821a;

    /* JADX INFO: renamed from: b */
    public String f131822b;

    /* JADX INFO: renamed from: c */
    public String f131823c;

    /* JADX INFO: renamed from: d */
    public int f131824d;

    /* JADX INFO: renamed from: e */
    public String f131825e;

    /* JADX INFO: renamed from: f */
    public int f131826f;

    /* JADX INFO: renamed from: g */
    public String f131827g;

    /* JADX INFO: renamed from: h */
    public boolean f131828h;

    public lf70(ner nerVar) {
        super(nerVar);
        this.f131821a = (PutongAct) nerVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m153993h0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            this.f131821a.hideInput();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m153994i0(pf60 pf60Var) {
        if (((String) pf60Var.f152156a).equals(this.f131822b)) {
            this.f131821a.supportInvalidateOptionsMenu();
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.jf70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120569a.m153993h0((C4470c) obj);
            }
        }));
        this.f131821a.duringCreated((C22421c) FeedModule.f39703d.f121320P0, false).subscribe(psd0.m173596G(new y20() { // from class: l.kf70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f126254a.m153994i0((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g0 */
    public void m153995g0() {
        this.f131822b = this.f131821a.getIntent().getStringExtra("user_id");
        this.f131823c = this.f131821a.getIntent().getStringExtra("from");
        this.f131824d = this.f131821a.getIntent().getIntExtra("selected_item_position", -1);
        this.f131825e = this.f131821a.getIntent().getStringExtra("target_moment_id");
        this.f131826f = this.f131821a.getIntent().getIntExtra("page_type", -1);
        this.f131827g = this.f131821a.getIntent().getStringExtra("source_page_id");
        this.f131828h = this.f131821a.getIntent().getBooleanExtra("start_home_card", false);
    }

    /* JADX INFO: renamed from: j0 */
    public void m153996j0(List<Media> list) {
        if (!NullChecker.m82487b(list) || list.size() <= 0 || !(list.get(0) instanceof Video) || new vel0(oki.m168038z(list.get(0).url)).f183806b <= Constants.ONE_MIN_IN_MILLIS) {
            cn40.m111392i0(this.f131821a, list instanceof ArrayList ? (ArrayList) list : new ArrayList(list), false);
        } else {
            o1j0.m165634h(R$string.f40035z3);
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
