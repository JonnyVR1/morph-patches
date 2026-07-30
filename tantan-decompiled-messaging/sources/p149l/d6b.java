package p149l;

import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.Surveys;
import com.p046p1.mobile.putong.data.Envelope;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class d6b extends ax6 {
    public d6b(C4732c c4732c) {
        super(c4732c);
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ C22306c m110157d3(String str, final String str2) {
        final utc0 utc0VarCreate = utc0.create(Network.JSON, str);
        return new la20(new v9j() { // from class: l.b6b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31369x1("/" + str2)).m185893l(utc0VarCreate).m185883b();
            }
        }).map(new w9j() { // from class: l.c6b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).surveys;
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: g3 */
    public C22306c<List<Surveys>> m110160g3(final String str) {
        return this.f72126Q.scheduled("loadSurveysData", 0, new v9j() { // from class: l.x5b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20(new v9j() { // from class: l.y5b
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31346r2("/" + str)).m185883b();
                    }
                }).map(new w9j() { // from class: l.z5b
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).surveys;
                    }
                }).compose(mkd0.m154951C());
            }
        }, false);
    }

    /* JADX INFO: renamed from: h3 */
    public C22306c<List<Surveys>> m110161h3(final String str, final String str2) {
        return this.f72126Q.scheduled("postSurveys", -1, new v9j() { // from class: l.a6b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return d6b.m110157d3(str, str2);
            }
        });
    }
}
