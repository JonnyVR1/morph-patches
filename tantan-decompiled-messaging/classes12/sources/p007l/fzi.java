package p007l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.data.CommonData;
import com.p000p1.mobile.putong.data.Detect;
import com.p000p1.mobile.putong.data.DetectCategoryType;
import com.p000p1.mobile.putong.data.DetectRequest;
import com.p000p1.mobile.putong.data.DetectText;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.MomentType;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.ThirdShareSource;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.Network;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import l.d30;
import l.e30;
import l.jq2;
import l.lsi0;
import l.mkd0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class fzi extends jq2<nzi> {

    /* JADX INFO: renamed from: a */
    public Act f8282a;

    /* JADX INFO: renamed from: b */
    public Moment f8283b;

    /* JADX INFO: renamed from: c */
    public String f8284c;

    /* JADX INFO: renamed from: d */
    public boolean f8285d;

    /* JADX INFO: renamed from: e */
    public boolean f8286e;

    /* JADX INFO: renamed from: f */
    public boolean f8287f;

    public fzi(Act act) {
        super(act);
        this.f8285d = true;
        this.f8282a = act;
    }

    /* JADX INFO: renamed from: m0 */
    private void m10348m0(String str, DetectCategoryType detectCategoryType, String str2, final String str3, final d30 d30Var) {
        this.f8286e = true;
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.category = detectCategoryType;
        DetectText detectText = new DetectText();
        detectText.key = str2;
        detectText.value = str;
        ArrayList arrayList = new ArrayList();
        detectRequest.text = arrayList;
        arrayList.add(detectText);
        this.f8282a.duringCreated(FeedModule.f316d.m16522P6(detectRequest)).subscribe(mkd0.H(new e30() { // from class: l.bzi
            public final void call(Object obj) {
                this.f6474a.m10356p0(d30Var, str3, (Envelope) obj);
            }
        }, new e30() { // from class: l.czi
            public final void call(Object obj) {
                this.f6758a.m10357q0(d30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    private void m10349n0(String str, d30 d30Var) {
        m10348m0(str, DetectCategoryType.get("moment"), "moment", null, d30Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m10350t0(Bundle bundle) {
        ((nzi) ((jq2) this).viewModel).m12405n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m10351u0() {
        ((nzi) ((jq2) this).viewModel).m12406p();
    }

    /* JADX INFO: renamed from: a0 */
    public void m10353a0() {
        creates(new e30() { // from class: l.yyi
            public final void call(Object obj) {
                this.f15531a.m10350t0((Bundle) obj);
            }
        }, new d30() { // from class: l.zyi
            public final void call() {
                this.f15956a.m10351u0();
            }
        });
    }

    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void m10352C(nzi nziVar) {
        super.C(nziVar);
    }

    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public final void m10360x0(String str) {
        Moment momentNew_ = Moment.new_();
        if (!TextUtils.isEmpty(str)) {
            momentNew_.value = str;
        }
        momentNew_.commentAtOnce = this.f8285d;
        ThirdShareSource thirdShareSource = momentNew_.thirdShareSource;
        thirdShareSource.sourceId = ((DbObject) this.f8283b).id;
        thirdShareSource.sourceType = MomentType.forwardMoment;
        momentNew_.momentType = MomentType.get(MomentType.forwardMoment);
        this.f8287f = true;
        this.f8282a.duringCreated(FeedModule.f316d.m16578X6(momentNew_)).subscribe(mkd0.H(new e30() { // from class: l.dzi
            public final void call(Object obj) {
                this.f7092a.m10358r0((Envelope) obj);
            }
        }, new e30() { // from class: l.ezi
            public final void call(Object obj) {
                this.f7505a.m10359s0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m10356p0(d30 d30Var, String str, Envelope envelope) {
        this.f8286e = false;
        Detect detect = ((CommonData) envelope.getModuleData(CommonData.class)).detect;
        if (vwb.J(detect.text) && vwb.J(detect.media)) {
            d30Var.call();
            return;
        }
        if (vqg.m15525l(detect, this.f8282a.pageId())) {
            lsi0.w(R$string.f602s);
        } else if (TextUtils.isEmpty(str)) {
            lsi0.w(R$string.f457W2);
        } else {
            lsi0.y(str);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m10357q0(d30 d30Var, Throwable th) {
        this.f8286e = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m10358r0(Envelope envelope) {
        this.f8287f = false;
        lsi0.y("转发成功");
        ((nzi) ((jq2) this).viewModel).m12404m();
        FeedModule.f316d.m16534Qb(this.f8283b);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m10359s0(Throwable th) {
        this.f8287f = false;
        t2h.m14429i(th);
        ((nzi) ((jq2) this).viewModel).m12404m();
    }

    /* JADX INFO: renamed from: y0 */
    public void m10361y0(final String str) {
        if (!Network.isConnected(FeedModule.f313a)) {
            lsi0.i(R$string.f442U, true);
            return;
        }
        if (this.f8286e || this.f8287f) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            m10360x0(str);
        } else {
            m10349n0(str, new d30() { // from class: l.azi
                public final void call() {
                    this.f5875a.m10360x0(str);
                }
            });
        }
    }

    public void destroy() {
    }
}
