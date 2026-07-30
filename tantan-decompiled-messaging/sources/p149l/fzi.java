package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Detect;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.data.DetectRequest;
import com.p046p1.mobile.putong.data.DetectText;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.MomentType;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.ThirdShareSource;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class fzi extends jq2<nzi> {

    /* JADX INFO: renamed from: a */
    public Act f99965a;

    /* JADX INFO: renamed from: b */
    public Moment f99966b;

    /* JADX INFO: renamed from: c */
    public String f99967c;

    /* JADX INFO: renamed from: d */
    public boolean f99968d;

    /* JADX INFO: renamed from: e */
    public boolean f99969e;

    /* JADX INFO: renamed from: f */
    public boolean f99970f;

    public fzi(Act act) {
        super(act);
        this.f99968d = true;
        this.f99965a = act;
    }

    /* JADX INFO: renamed from: m0 */
    private void m123855m0(String str, DetectCategoryType detectCategoryType, String str2, final String str3, final d30 d30Var) {
        this.f99969e = true;
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.category = detectCategoryType;
        DetectText detectText = new DetectText();
        detectText.key = str2;
        detectText.value = str;
        ArrayList arrayList = new ArrayList();
        detectRequest.text = arrayList;
        arrayList.add(detectText);
        this.f99965a.duringCreated(FeedModule.f38855d.m209341P6(detectRequest)).subscribe(mkd0.m154956H(new e30() { // from class: l.bzi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f78035a.m123861p0(d30Var, str3, (Envelope) obj);
            }
        }, new e30() { // from class: l.czi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f83087a.m123862q0(d30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    private void m123856n0(String str, d30 d30Var) {
        m123855m0(str, DetectCategoryType.get("moment"), "moment", null, d30Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m123857t0(Bundle bundle) {
        ((nzi) this.viewModel).m162061n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m123858u0() {
        ((nzi) this.viewModel).m162062p();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.yyi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200774a.m123857t0((Bundle) obj);
            }
        }, new d30() { // from class: l.zyi
            @Override // p149l.d30
            public final void call() {
                this.f205681a.m123858u0();
            }
        });
    }

    @Override // p149l.jq2, p149l.q0m
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void mo51532C(nzi nziVar) {
        super.mo51532C(nziVar);
    }

    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public final void m123865x0(String str) {
        Moment momentNew_ = Moment.new_();
        if (!TextUtils.isEmpty(str)) {
            momentNew_.value = str;
        }
        momentNew_.commentAtOnce = this.f99968d;
        ThirdShareSource thirdShareSource = momentNew_.thirdShareSource;
        thirdShareSource.sourceId = this.f99966b.f56011id;
        thirdShareSource.sourceType = MomentType.forwardMoment;
        momentNew_.momentType = MomentType.get(MomentType.forwardMoment);
        this.f99970f = true;
        this.f99965a.duringCreated(FeedModule.f38855d.m209397X6(momentNew_)).subscribe(mkd0.m154956H(new e30() { // from class: l.dzi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88485a.m123863r0((Envelope) obj);
            }
        }, new e30() { // from class: l.ezi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93901a.m123864s0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m123861p0(d30 d30Var, String str, Envelope envelope) {
        this.f99969e = false;
        Detect detect = ((CommonData) envelope.getModuleData(CommonData.class)).detect;
        if (vwb.m200296J(detect.text) && vwb.m200296J(detect.media)) {
            d30Var.call();
            return;
        }
        if (vqg.m199555l(detect, this.f99965a.pageId())) {
            lsi0.m151593w(R$string.f39141s);
        } else if (TextUtils.isEmpty(str)) {
            lsi0.m151593w(R$string.f38996W2);
        } else {
            lsi0.m151595y(str);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m123862q0(d30 d30Var, Throwable th) {
        this.f99969e = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m123863r0(Envelope envelope) {
        this.f99970f = false;
        lsi0.m151595y("转发成功");
        ((nzi) this.viewModel).m162060m();
        FeedModule.f38855d.m209353Qb(this.f99966b);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m123864s0(Throwable th) {
        this.f99970f = false;
        t2h.m186978i(th);
        ((nzi) this.viewModel).m162060m();
    }

    /* JADX INFO: renamed from: y0 */
    public void m123866y0(final String str) {
        if (!Network.isConnected(FeedModule.f38852a)) {
            lsi0.m151579i(R$string.f38981U, true);
            return;
        }
        if (this.f99969e || this.f99970f) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            m123865x0(str);
        } else {
            m123856n0(str, new d30() { // from class: l.azi
                @Override // p149l.d30
                public final void call() {
                    this.f72356a.m123865x0(str);
                }
            });
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
