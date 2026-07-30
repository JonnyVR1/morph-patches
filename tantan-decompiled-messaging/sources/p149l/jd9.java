package p149l;

import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.api.C4759y;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipExtensions;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class jd9 extends ax6 {
    public jd9(C4732c c4732c) {
        super(c4732c);
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ Boolean m141019e3(Envelope envelope) {
        return envelope.meta.code == 200 ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: f3 */
    public C22306c<Boolean> m141020f3(final String str, String str2, String str3, String str4) {
        final Relationship relationshipNew_ = Relationship.new_();
        relationshipNew_.state = RelationshipStatus.get("liked");
        relationshipNew_.status = vwb.m200324f0(MatchFrom.get("literature"));
        RelationshipExtensions relationshipExtensionsNew_ = RelationshipExtensions.new_();
        relationshipNew_.relationshipExtensions = relationshipExtensionsNew_;
        relationshipExtensionsNew_.letter = str2;
        relationshipExtensionsNew_.literatureCommentId = str3;
        relationshipExtensionsNew_.literatureId = str4;
        return this.f72126Q.scheduled("sendMsgLetter/like/" + str + "/" + str3 + "/" + str4, -1, new v9j() { // from class: l.hd9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4759y.m34905m3(str, relationshipNew_, null).compose(mkd0.m154951C()).map(new w9j() { // from class: l.id9
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return jd9.m141019e3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: g3 */
    public C22306c<roj0> m141021g3(final String str) {
        return CoreModule.f17545c.scheduled("get_letters", 0, new v9j() { // from class: l.ed9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20(new v9j() { // from class: l.fd9
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return qib0.f154693H.auth().m185898q(xh5.m208761i("/letters-verify")).m185893l(utc0.create(Network.JSON, "{\"letter\":\"" + str + "\"}")).m185883b();
                    }
                }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.gd9
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                });
            }
        }, false);
    }
}
