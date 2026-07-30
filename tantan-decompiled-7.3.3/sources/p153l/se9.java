package p153l;

import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.api.C4910y;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipExtensions;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class se9 extends dy6 {
    public se9(C4883c c4883c) {
        super(c4883c);
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ Boolean m185526e3(Envelope envelope) {
        return envelope.meta.code == 200 ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: f3 */
    public C22421c<Boolean> m185527f3(final String str, String str2, String str3, String str4) {
        final Relationship relationshipNew_ = Relationship.new_();
        relationshipNew_.state = RelationshipStatus.get("liked");
        relationshipNew_.status = jyb.m147507f0(MatchFrom.get("literature"));
        RelationshipExtensions relationshipExtensionsNew_ = RelationshipExtensions.new_();
        relationshipNew_.relationshipExtensions = relationshipExtensionsNew_;
        relationshipExtensionsNew_.letter = str2;
        relationshipExtensionsNew_.literatureCommentId = str3;
        relationshipExtensionsNew_.literatureId = str4;
        return this.f91137Q.scheduled("sendMsgLetter/like/" + str + "/" + str3 + "/" + str4, -1, new pcj() { // from class: l.qe9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4910y.m35908m3(str, relationshipNew_, null).compose(psd0.m173592C()).map(new qcj() { // from class: l.re9
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return se9.m185526e3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: g3 */
    public C22421c<uxj0> m185528g3(final String str) {
        return CoreModule.f18264c.scheduled("get_letters", 0, new pcj() { // from class: l.ne9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20(new pcj() { // from class: l.oe9
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return uqb0.f180376H.auth().m209043q(xi5.m211107i("/letters-verify")).m209038l(z1d0.create(Network.JSON, "{\"letter\":\"" + str + "\"}")).m209028b();
                    }
                }).compose(psd0.m173592C()).map(new qcj() { // from class: l.pe9
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                });
            }
        }, false);
    }
}
