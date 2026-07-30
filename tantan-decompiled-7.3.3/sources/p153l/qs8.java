package p153l;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.data.Envelope;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class qs8 extends dy6 {
    public qs8(C4883c c4883c) {
        super(c4883c);
    }

    /* JADX INFO: renamed from: d3 */
    public C22421c<String> m177733d3(final String str) {
        return (TextUtils.equals(str, FirebaseAnalytics.Param.INDEX) || TextUtils.equals(str, "faq")) ? scheduled("restapi/feedback/platform-link", 0, new pcj() { // from class: l.ns8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.os8
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/restapi/feedback/platform-link?source=" + str)).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.ps8
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).data.getModuleData(CoreData.class)).link;
                    }
                }).observeOn(fo0.m126432a());
            }
        }) : C22421c.empty();
    }
}
