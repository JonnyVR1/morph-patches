package p006l;

import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.ComplimentFromOther;
import com.p1.mobile.putong.core.data.ComplimentMessage;
import com.p1.mobile.putong.core.data.ComplimentText;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Media;
import java.util.Collections;
import java.util.List;
import l.e30;
import l.mkd0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class o59 extends ax6 {

    /* JADX INFO: renamed from: R */
    public List<ComplimentText> f18019R;

    /* JADX INFO: renamed from: S */
    public c<List<ComplimentText>> f18020S;

    public o59(C0158c c0158c) {
        super(c0158c);
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ List m20333e3(Envelope envelope) {
        CoreData moduleData = envelope.getModuleData(CoreData.class);
        return (moduleData == null || vwb.J(moduleData.complimentTexts)) ? Collections.EMPTY_LIST : moduleData.complimentTexts;
    }

    /* JADX INFO: renamed from: k3 */
    public static ComplimentMessage m20339k3(String str, List<Media> list, boolean z, String str2) {
        return ComplimentMessage.fromMedia(str, list, z, str2);
    }

    /* JADX INFO: renamed from: l3 */
    public c<ComplimentFromOther> m20340l3(final String str) {
        return this.f8580Q.scheduled("compliment_from_other", 0, new v9j() { // from class: l.e59
            public final Object call() {
                return this.f10768a.m20344p3(str);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: m3 */
    public c<List<ComplimentText>> m20341m3() {
        if (!vwb.J(this.f18019R)) {
            return c.just(this.f18019R);
        }
        if (this.f18020S == null) {
            this.f18020S = this.f8580Q.scheduled("compliment_texts", 0, new v9j() { // from class: l.h59
                public final Object call() {
                    return ia20.m16571e(new v9j() { // from class: l.m59
                        public final Object call() {
                            return C0154a.f3483P.auth().q(C0154a.m3130G("/compliment-texts")).f().b();
                        }
                    }).map(new w9j() { // from class: l.n59
                        public final Object call(Object obj) {
                            return o59.m20333e3((Envelope) obj);
                        }
                    });
                }
            }).doOnNext(new e30() { // from class: l.i59
                public final void call(Object obj) {
                    this.f14229a.m20345q3((List) obj);
                }
            }).compose(mkd0.C());
        }
        return this.f18020S;
    }

    /* JADX INFO: renamed from: n3 */
    public List<ComplimentText> m20342n3() {
        return this.f18019R;
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ ComplimentFromOther m20343o3(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        CoreData moduleData = envelope.getModuleData(CoreData.class);
        if (moduleData != null) {
            return moduleData.compliment;
        }
        return null;
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ c m20344p3(final String str) {
        return ia20.m16571e(new v9j() { // from class: l.f59
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/compliment/" + str)).f().b();
            }
        }).map(new w9j() { // from class: l.g59
            public final Object call(Object obj) {
                return this.f13059a.m20343o3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ void m20345q3(List list) {
        this.f18019R = list;
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ void m20346r3(Envelope envelope) {
        if (envelope != null) {
            this.f8580Q.m3422w3(envelope, null);
        }
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ c m20347s3(final String str, final String str2) {
        return ia20.m16571e(new v9j() { // from class: l.k59
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3141I2("/compliment/" + str) + "?with=relationships").l(utc0.create(Network.JSON, str2)).b();
            }
        }).doOnNext(new e30() { // from class: l.l59
            public final void call(Object obj) {
                this.f16232a.m20346r3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t3 */
    public c<Envelope> m20348t3(final String str, final String str2) {
        return this.f8580Q.scheduled("send_compliment", -1, new v9j() { // from class: l.j59
            public final Object call() {
                return this.f15000a.m20347s3(str, str2);
            }
        }).compose(mkd0.C());
    }
}
