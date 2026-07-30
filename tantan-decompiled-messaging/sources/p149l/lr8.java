package p149l;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.data.Envelope;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class lr8 extends ax6 {
    public lr8(C4732c c4732c) {
        super(c4732c);
    }

    /* JADX INFO: renamed from: d3 */
    public C22306c<String> m151139d3(final String str) {
        return (TextUtils.equals(str, FirebaseAnalytics.Param.INDEX) || TextUtils.equals(str, "faq")) ? scheduled("restapi/feedback/platform-link", 0, new v9j() { // from class: l.ir8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.jr8
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/restapi/feedback/platform-link?source=" + str)).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.kr8
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).data.getModuleData(CoreData.class)).link;
                    }
                }).observeOn(jo0.m142408a());
            }
        }) : C22306c.empty();
    }
}
