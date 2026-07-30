package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.data.Envelope;
import l.jo0;
import l.v9j;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class lr8 extends ax6 {
    public lr8(C0158c c0158c) {
        super(c0158c);
    }

    /* JADX INFO: renamed from: d3 */
    public c<String> m18960d3(final String str) {
        return (TextUtils.equals(str, "index") || TextUtils.equals(str, "faq")) ? scheduled("restapi/feedback/platform-link", 0, new v9j() { // from class: l.ir8
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.jr8
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/restapi/feedback/platform-link?source=" + str)).f().b();
                    }
                }).map(new w9j() { // from class: l.kr8
                    public final Object call(Object obj) {
                        return ((Envelope) obj).data.getModuleData(CoreData.class).link;
                    }
                }).observeOn(jo0.a());
            }
        }) : c.empty();
    }
}
