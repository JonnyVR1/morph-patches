package p149l;

import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.ComplimentFromOther;
import com.p046p1.mobile.putong.core.data.ComplimentMessage;
import com.p046p1.mobile.putong.core.data.ComplimentText;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Media;
import java.util.Collections;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class o59 extends ax6 {

    /* JADX INFO: renamed from: R */
    public List<ComplimentText> f141882R;

    /* JADX INFO: renamed from: S */
    public C22306c<List<ComplimentText>> f141883S;

    public o59(C4732c c4732c) {
        super(c4732c);
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ List m162762e3(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        return (coreData == null || vwb.m200296J(coreData.complimentTexts)) ? Collections.EMPTY_LIST : coreData.complimentTexts;
    }

    /* JADX INFO: renamed from: k3 */
    public static ComplimentMessage m162768k3(String str, List<Media> list, boolean z, String str2) {
        return ComplimentMessage.fromMedia(str, list, z, str2);
    }

    /* JADX INFO: renamed from: l3 */
    public C22306c<ComplimentFromOther> m162769l3(final String str) {
        return this.f72126Q.scheduled("compliment_from_other", 0, new v9j() { // from class: l.e59
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f89355a.m162773p3(str);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: m3 */
    public C22306c<List<ComplimentText>> m162770m3() {
        if (!vwb.m200296J(this.f141882R)) {
            return C22306c.just(this.f141882R);
        }
        if (this.f141883S == null) {
            this.f141883S = this.f72126Q.scheduled("compliment_texts", 0, new v9j() { // from class: l.h59
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return ia20.m135121e(new v9j() { // from class: l.m59
                        @Override // p149l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/compliment-texts")).m185887f().m185883b();
                        }
                    }).map(new w9j() { // from class: l.n59
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return o59.m162762e3((Envelope) obj);
                        }
                    });
                }
            }).doOnNext(new e30() { // from class: l.i59
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f111536a.m162774q3((List) obj);
                }
            }).compose(mkd0.m154951C());
        }
        return this.f141883S;
    }

    /* JADX INFO: renamed from: n3 */
    public List<ComplimentText> m162771n3() {
        return this.f141882R;
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ ComplimentFromOther m162772o3(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (coreData != null) {
            return coreData.compliment;
        }
        return null;
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ C22306c m162773p3(final String str) {
        return ia20.m135121e(new v9j() { // from class: l.f59
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/compliment/" + str)).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.g59
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f100634a.m162772o3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ void m162774q3(List list) {
        this.f141882R = list;
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ void m162775r3(Envelope envelope) {
        if (envelope != null) {
            this.f72126Q.m31492w3(envelope, null);
        }
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ C22306c m162776s3(final String str, final String str2) {
        return ia20.m135121e(new v9j() { // from class: l.k59
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31211I2("/compliment/" + str) + "?with=relationships").m185893l(utc0.create(Network.JSON, str2)).m185883b();
            }
        }).doOnNext(new e30() { // from class: l.l59
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f126096a.m162775r3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t3 */
    public C22306c<Envelope> m162777t3(final String str, final String str2) {
        return this.f72126Q.scheduled("send_compliment", -1, new v9j() { // from class: l.j59
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f116277a.m162776s3(str, str2);
            }
        }).compose(mkd0.m154951C());
    }
}
