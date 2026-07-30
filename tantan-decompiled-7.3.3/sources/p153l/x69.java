package p153l;

import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.ComplimentFromOther;
import com.p051p1.mobile.putong.core.data.ComplimentMessage;
import com.p051p1.mobile.putong.core.data.ComplimentText;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Media;
import java.util.Collections;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class x69 extends dy6 {

    /* JADX INFO: renamed from: R */
    public List<ComplimentText> f192562R;

    /* JADX INFO: renamed from: S */
    public C22421c<List<ComplimentText>> f192563S;

    public x69(C4883c c4883c) {
        super(c4883c);
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ List m209443e3(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        return (coreData == null || jyb.m147479J(coreData.complimentTexts)) ? Collections.EMPTY_LIST : coreData.complimentTexts;
    }

    /* JADX INFO: renamed from: k3 */
    public static ComplimentMessage m209449k3(String str, List<Media> list, boolean z, String str2) {
        return ComplimentMessage.fromMedia(str, list, z, str2);
    }

    /* JADX INFO: renamed from: l3 */
    public C22421c<ComplimentFromOther> m209450l3(final String str) {
        return this.f91137Q.scheduled("compliment_from_other", 0, new pcj() { // from class: l.n69
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f140436a.m209454p3(str);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: m3 */
    public C22421c<List<ComplimentText>> m209451m3() {
        if (!jyb.m147479J(this.f192562R)) {
            return C22421c.just(this.f192562R);
        }
        if (this.f192563S == null) {
            this.f192563S = this.f91137Q.scheduled("compliment_texts", 0, new pcj() { // from class: l.q69
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return qi20.m176658e(new pcj() { // from class: l.v69
                        @Override // p153l.pcj, java.util.concurrent.Callable
                        public final Object call() {
                            return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/compliment-texts")).m209032f().m209028b();
                        }
                    }).map(new qcj() { // from class: l.w69
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return x69.m209443e3((Envelope) obj);
                        }
                    });
                }
            }).doOnNext(new y20() { // from class: l.r69
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f161458a.m209455q3((List) obj);
                }
            }).compose(psd0.m173592C());
        }
        return this.f192563S;
    }

    /* JADX INFO: renamed from: n3 */
    public List<ComplimentText> m209452n3() {
        return this.f192562R;
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ ComplimentFromOther m209453o3(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (coreData != null) {
            return coreData.compliment;
        }
        return null;
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ C22421c m209454p3(final String str) {
        return qi20.m176658e(new pcj() { // from class: l.o69
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/compliment/" + str)).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.p69
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f150752a.m209453o3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ void m209455q3(List list) {
        this.f192562R = list;
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ void m209456r3(Envelope envelope) {
        if (envelope != null) {
            this.f91137Q.m32495w3(envelope, null);
        }
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ C22421c m209457s3(final String str, final String str2) {
        return qi20.m176658e(new pcj() { // from class: l.t69
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32214I2("/compliment/" + str) + "?with=relationships").m209038l(z1d0.create(Network.JSON, str2)).m209028b();
            }
        }).doOnNext(new y20() { // from class: l.u69
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f177742a.m209456r3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t3 */
    public C22421c<Envelope> m209458t3(final String str, final String str2) {
        return this.f91137Q.scheduled("send_compliment", -1, new pcj() { // from class: l.s69
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f166551a.m209457s3(str, str2);
            }
        }).compose(psd0.m173592C());
    }
}
