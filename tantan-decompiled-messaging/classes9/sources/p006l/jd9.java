package p006l;

import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p000p1.mobile.putong.core.api.C0185y;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.RelationshipExtensions;
import com.p1.mobile.putong.data.RelationshipStatus;
import l.mkd0;
import l.roj0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class jd9 extends ax6 {
    public jd9(C0158c c0158c) {
        super(c0158c);
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ Boolean m17429e3(Envelope envelope) {
        return envelope.meta.code == 200 ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: f3 */
    public c<Boolean> m17430f3(final String str, String str2, String str3, String str4) {
        final Relationship relationshipNew_ = Relationship.new_();
        relationshipNew_.state = RelationshipStatus.get("liked");
        relationshipNew_.status = vwb.f0(new MatchFrom[]{MatchFrom.get("literature")});
        RelationshipExtensions relationshipExtensionsNew_ = RelationshipExtensions.new_();
        relationshipNew_.relationshipExtensions = relationshipExtensionsNew_;
        relationshipExtensionsNew_.letter = str2;
        relationshipExtensionsNew_.literatureCommentId = str3;
        relationshipExtensionsNew_.literatureId = str4;
        return this.f8580Q.scheduled("sendMsgLetter/like/" + str + "/" + str3 + "/" + str4, -1, new v9j() { // from class: l.hd9
            public final Object call() {
                return C0185y.m6842m3(str, relationshipNew_, null).compose(mkd0.C()).map(new w9j() { // from class: l.id9
                    public final Object call(Object obj) {
                        return jd9.m17429e3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: g3 */
    public c<roj0> m17431g3(final String str) {
        return CoreModule.f1534c.scheduled("get_letters", 0, new v9j() { // from class: l.ed9
            public final Object call() {
                return new la20(new v9j() { // from class: l.fd9
                    public final Object call() {
                        return qib0.f19784H.auth().q(xh5.m27250i("/letters-verify")).l(utc0.create(Network.JSON, "{\"letter\":\"" + str + "\"}")).b();
                    }
                }).compose(mkd0.C()).map(new w9j() { // from class: l.gd9
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                });
            }
        }, false);
    }
}
