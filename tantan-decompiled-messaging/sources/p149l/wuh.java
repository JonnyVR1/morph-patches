package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Detect;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.data.DetectRequest;
import com.p046p1.mobile.putong.data.DetectText;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.status.post.FeedPostStatusAct;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class wuh extends jq2<nvh> {

    /* JADX INFO: renamed from: a */
    public String f188114a;

    /* JADX INFO: renamed from: b */
    public String f188115b;

    /* JADX INFO: renamed from: c */
    public DoublePair f188116c;

    /* JADX INFO: renamed from: d */
    public boolean f188117d;

    /* JADX INFO: renamed from: e */
    public boolean f188118e;

    public wuh(mcr mcrVar) {
        super(mcrVar);
        this.f188118e = false;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
    }

    /* JADX INFO: renamed from: g0 */
    public void m205630g0(String str, final d30 d30Var) {
        this.f188117d = true;
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.category = DetectCategoryType.get("moment");
        DetectText detectText = new DetectText();
        detectText.key = "myState";
        detectText.value = str;
        ArrayList arrayList = new ArrayList();
        detectRequest.text = arrayList;
        arrayList.add(detectText);
        duringCreated(FeedModule.f38855d.m209341P6(detectRequest)).subscribe(mkd0.m154956H(new e30() { // from class: l.uuh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178385a.m205632i0(d30Var, (Envelope) obj);
            }
        }, new e30() { // from class: l.vuh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183067a.m205633j0(d30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public void m205631h0(Bundle bundle) {
        try {
            this.f188114a = bundle.getString("extra_addressInfo_name");
            this.f188115b = bundle.getString("extra_addressInfo_address");
            this.f188116c = (DoublePair) bundle.getSerializable("extra_addressInfo_location");
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            App.f15368d.m20433k(e);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m205632i0(d30 d30Var, Envelope envelope) {
        this.f188117d = false;
        Detect detect = ((CommonData) envelope.getModuleData(CommonData.class)).detect;
        if (vwb.m200296J(detect.text) && vwb.m200296J(detect.media)) {
            d30Var.call();
        } else if (vqg.m199555l(detect, "p_set_my_state_post")) {
            lsi0.m151593w(R$string.f39141s);
        } else {
            lsi0.m151593w(R$string.f38996W2);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m205633j0(d30 d30Var, Throwable th) {
        this.f188117d = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: k0 */
    public void m205634k0(BubbleInfo bubbleInfo) {
        FeedModule.f38856e.m132649V0(bubbleInfo, ((FeedPostStatusAct) act()).f42966m);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
