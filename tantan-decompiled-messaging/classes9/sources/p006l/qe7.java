package p006l;

import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.TacitTestProfileCard;
import com.p1.mobile.putong.data.Envelope;
import l.v9j;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class qe7 extends ax6 {
    public qe7(C0158c c0158c) {
        super(c0158c);
    }

    /* JADX INFO: renamed from: d3 */
    public c<TacitTestProfileCard> m22015d3(String str, String str2) {
        final String str3 = "/tacitTest/bothSidesState?userId=" + str + "&otherUserId=" + str2;
        return this.f8580Q.scheduled(str3, 0, new v9j() { // from class: l.ne7
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.oe7
                    public final Object call() {
                        return C0154a.f3483P.auth().q(xh5.m27250i(str)).f().b();
                    }
                }).map(new w9j() { // from class: l.pe7
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class).tacitTest;
                    }
                });
            }
        });
    }
}
