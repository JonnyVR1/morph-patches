package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Detect;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.data.DetectRequest;
import com.p051p1.mobile.putong.data.DetectText;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.MomentType;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.ThirdShareSource;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class a2j extends ar2<i2j> {

    /* JADX INFO: renamed from: a */
    public Act f68000a;

    /* JADX INFO: renamed from: b */
    public Moment f68001b;

    /* JADX INFO: renamed from: c */
    public String f68002c;

    /* JADX INFO: renamed from: d */
    public boolean f68003d;

    /* JADX INFO: renamed from: e */
    public boolean f68004e;

    /* JADX INFO: renamed from: f */
    public boolean f68005f;

    public a2j(Act act) {
        super(act);
        this.f68003d = true;
        this.f68000a = act;
    }

    /* JADX INFO: renamed from: m0 */
    private void m95686m0(String str, DetectCategoryType detectCategoryType, String str2, final String str3, final x20 x20Var) {
        this.f68004e = true;
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.category = detectCategoryType;
        DetectText detectText = new DetectText();
        detectText.key = str2;
        detectText.value = str;
        ArrayList arrayList = new ArrayList();
        detectRequest.text = arrayList;
        arrayList.add(detectText);
        this.f68000a.duringCreated(FeedModule.f39703d.m145582P6(detectRequest)).subscribe(psd0.m173597H(new y20() { // from class: l.w1j
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186818a.m95692p0(x20Var, str3, (Envelope) obj);
            }
        }, new y20() { // from class: l.x1j
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192064a.m95693q0(x20Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    private void m95687n0(String str, x20 x20Var) {
        m95686m0(str, DetectCategoryType.get("moment"), "moment", null, x20Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m95688t0(Bundle bundle) {
        ((i2j) this.viewModel).m138211n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m95689u0() {
        ((i2j) this.viewModel).m138212p();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.t1j
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171674a.m95688t0((Bundle) obj);
            }
        }, new x20() { // from class: l.u1j
            @Override // p153l.x20
            public final void call() {
                this.f177005a.m95689u0();
            }
        });
    }

    @Override // p153l.ar2, p153l.k3m
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void mo52715C(i2j i2jVar) {
        super.mo52715C(i2jVar);
    }

    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public final void m95696x0(String str) {
        Moment momentNew_ = Moment.new_();
        if (!TextUtils.isEmpty(str)) {
            momentNew_.value = str;
        }
        momentNew_.commentAtOnce = this.f68003d;
        ThirdShareSource thirdShareSource = momentNew_.thirdShareSource;
        thirdShareSource.sourceId = this.f68001b.f56859id;
        thirdShareSource.sourceType = MomentType.forwardMoment;
        momentNew_.momentType = MomentType.get(MomentType.forwardMoment);
        this.f68005f = true;
        this.f68000a.duringCreated(FeedModule.f39703d.m145638X6(momentNew_)).subscribe(psd0.m173597H(new y20() { // from class: l.y1j
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197112a.m95694r0((Envelope) obj);
            }
        }, new y20() { // from class: l.z1j
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202560a.m95695s0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m95692p0(x20 x20Var, String str, Envelope envelope) {
        this.f68004e = false;
        Detect detect = ((CommonData) envelope.getModuleData(CommonData.class)).detect;
        if (jyb.m147479J(detect.text) && jyb.m147479J(detect.media)) {
            x20Var.call();
            return;
        }
        if (ksg.m151214l(detect, this.f68000a.pageId())) {
            o1j0.m165649w(R$string.f39989s);
        } else if (TextUtils.isEmpty(str)) {
            o1j0.m165649w(R$string.f39844W2);
        } else {
            o1j0.m165651y(str);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m95693q0(x20 x20Var, Throwable th) {
        this.f68004e = false;
        x20Var.call();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m95694r0(Envelope envelope) {
        this.f68005f = false;
        o1j0.m165651y("转发成功");
        ((i2j) this.viewModel).m138210m();
        FeedModule.f39703d.m145594Qb(this.f68001b);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m95695s0(Throwable th) {
        this.f68005f = false;
        i4h.m138540i(th);
        ((i2j) this.viewModel).m138210m();
    }

    /* JADX INFO: renamed from: y0 */
    public void m95697y0(final String str) {
        if (!Network.isConnected(FeedModule.f39700a)) {
            o1j0.m165635i(R$string.f39829U, true);
            return;
        }
        if (this.f68004e || this.f68005f) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            m95696x0(str);
        } else {
            m95687n0(str, new x20() { // from class: l.v1j
                @Override // p153l.x20
                public final void call() {
                    this.f181978a.m95696x0(str);
                }
            });
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
