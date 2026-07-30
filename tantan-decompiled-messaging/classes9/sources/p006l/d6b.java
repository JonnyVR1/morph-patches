package p006l;

import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Surveys;
import com.p1.mobile.putong.data.Envelope;
import java.util.List;
import l.mkd0;
import l.utc0;
import l.v9j;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class d6b extends ax6 {
    public d6b(C0158c c0158c) {
        super(c0158c);
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ c m13799d3(String str, final String str2) {
        final utc0 utc0VarCreate = utc0.create(Network.JSON, str);
        return new la20(new v9j() { // from class: l.b6b
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3299x1("/" + str2)).l(utc0VarCreate).b();
            }
        }).map(new w9j() { // from class: l.c6b
            public final Object call(Object obj) {
                return ((Envelope) obj).getModuleData(CoreData.class).surveys;
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: g3 */
    public c<List<Surveys>> m13802g3(final String str) {
        return this.f8580Q.scheduled("loadSurveysData", 0, new v9j() { // from class: l.x5b
            public final Object call() {
                return new la20(new v9j() { // from class: l.y5b
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3276r2("/" + str)).b();
                    }
                }).map(new w9j() { // from class: l.z5b
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class).surveys;
                    }
                }).compose(mkd0.C());
            }
        }, false);
    }

    /* JADX INFO: renamed from: h3 */
    public c<List<Surveys>> m13803h3(final String str, final String str2) {
        return this.f8580Q.scheduled("postSurveys", -1, new v9j() { // from class: l.a6b
            public final Object call() {
                return d6b.m13799d3(str, str2);
            }
        });
    }
}
