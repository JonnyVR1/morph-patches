package p007l;

import android.os.Bundle;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.CommonData;
import com.p000p1.mobile.putong.data.Detect;
import com.p000p1.mobile.putong.data.DetectCategoryType;
import com.p000p1.mobile.putong.data.DetectRequest;
import com.p000p1.mobile.putong.data.DetectText;
import com.p000p1.mobile.putong.data.DoublePair;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import l.d30;
import l.e30;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class wuh extends jq2<nvh> {

    /* JADX INFO: renamed from: a */
    public String f14685a;

    /* JADX INFO: renamed from: b */
    public String f14686b;

    /* JADX INFO: renamed from: c */
    public DoublePair f14687c;

    /* JADX INFO: renamed from: d */
    public boolean f14688d;

    /* JADX INFO: renamed from: e */
    public boolean f14689e;

    public wuh(mcr mcrVar) {
        super(mcrVar);
        this.f14689e = false;
    }

    /* JADX INFO: renamed from: Z */
    public void m15928Z() {
        super.Z();
    }

    /* JADX INFO: renamed from: g0 */
    public void m15929g0(String str, final d30 d30Var) {
        this.f14688d = true;
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.category = DetectCategoryType.get("moment");
        DetectText detectText = new DetectText();
        detectText.key = "myState";
        detectText.value = str;
        ArrayList arrayList = new ArrayList();
        detectRequest.text = arrayList;
        arrayList.add(detectText);
        duringCreated(FeedModule.f316d.m16522P6(detectRequest)).subscribe(mkd0.H(new e30() { // from class: l.uuh
            public final void call(Object obj) {
                this.f13931a.m15931i0(d30Var, (Envelope) obj);
            }
        }, new e30() { // from class: l.vuh
            public final void call(Object obj) {
                this.f14306a.m15932j0(d30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public void m15930h0(Bundle bundle) {
        try {
            this.f14685a = bundle.getString("extra_addressInfo_name");
            this.f14686b = bundle.getString("extra_addressInfo_address");
            this.f14687c = (DoublePair) bundle.getSerializable("extra_addressInfo_location");
        } catch (Exception e) {
            CrashHelper.c(e);
            App.d.k(e);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m15931i0(d30 d30Var, Envelope envelope) {
        this.f14688d = false;
        Detect detect = ((CommonData) envelope.getModuleData(CommonData.class)).detect;
        if (vwb.J(detect.text) && vwb.J(detect.media)) {
            d30Var.call();
        } else if (vqg.m15525l(detect, "p_set_my_state_post")) {
            lsi0.w(R$string.f602s);
        } else {
            lsi0.w(R$string.f457W2);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m15932j0(d30 d30Var, Throwable th) {
        this.f14688d = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: k0 */
    public void m15933k0(BubbleInfo bubbleInfo) {
        FeedModule.f317e.m10712V0(bubbleInfo, act().f4427m);
    }

    public void destroy() {
    }
}
