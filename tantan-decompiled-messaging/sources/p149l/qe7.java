package p149l;

import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.TacitTestProfileCard;
import com.p046p1.mobile.putong.data.Envelope;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class qe7 extends ax6 {
    public qe7(C4732c c4732c) {
        super(c4732c);
    }

    /* JADX INFO: renamed from: d3 */
    public C22306c<TacitTestProfileCard> m174184d3(String str, String str2) {
        final String str3 = "/tacitTest/bothSidesState?userId=" + str + "&otherUserId=" + str2;
        return this.f72126Q.scheduled(str3, 0, new v9j() { // from class: l.ne7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.oe7
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(xh5.m208761i(str)).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.pe7
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).tacitTest;
                    }
                });
            }
        });
    }
}
