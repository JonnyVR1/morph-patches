package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Detect;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.data.DetectRequest;
import com.p051p1.mobile.putong.data.DetectText;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.status.post.FeedPostStatusAct;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class lwh extends ar2<cxh> {

    /* JADX INFO: renamed from: a */
    public String f133812a;

    /* JADX INFO: renamed from: b */
    public String f133813b;

    /* JADX INFO: renamed from: c */
    public DoublePair f133814c;

    /* JADX INFO: renamed from: d */
    public boolean f133815d;

    /* JADX INFO: renamed from: e */
    public boolean f133816e;

    public lwh(ner nerVar) {
        super(nerVar);
        this.f133816e = false;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
    }

    /* JADX INFO: renamed from: g0 */
    public void m156047g0(String str, final x20 x20Var) {
        this.f133815d = true;
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.category = DetectCategoryType.get("moment");
        DetectText detectText = new DetectText();
        detectText.key = "myState";
        detectText.value = str;
        ArrayList arrayList = new ArrayList();
        detectRequest.text = arrayList;
        arrayList.add(detectText);
        duringCreated(FeedModule.f39703d.m145582P6(detectRequest)).subscribe(psd0.m173597H(new y20() { // from class: l.jwh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122927a.m156049i0(x20Var, (Envelope) obj);
            }
        }, new y20() { // from class: l.kwh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129068a.m156050j0(x20Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public void m156048h0(Bundle bundle) {
        try {
            this.f133812a = bundle.getString("extra_addressInfo_name");
            this.f133813b = bundle.getString("extra_addressInfo_address");
            this.f133814c = (DoublePair) bundle.getSerializable("extra_addressInfo_location");
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            App.f16087d.m21432k(e);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m156049i0(x20 x20Var, Envelope envelope) {
        this.f133815d = false;
        Detect detect = ((CommonData) envelope.getModuleData(CommonData.class)).detect;
        if (jyb.m147479J(detect.text) && jyb.m147479J(detect.media)) {
            x20Var.call();
        } else if (ksg.m151214l(detect, "p_set_my_state_post")) {
            o1j0.m165649w(R$string.f39989s);
        } else {
            o1j0.m165649w(R$string.f39844W2);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m156050j0(x20 x20Var, Throwable th) {
        this.f133815d = false;
        x20Var.call();
    }

    /* JADX INFO: renamed from: k0 */
    public void m156051k0(BubbleInfo bubbleInfo) {
        FeedModule.f39704e.m159782V0(bubbleInfo, ((FeedPostStatusAct) act()).f43814m);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
