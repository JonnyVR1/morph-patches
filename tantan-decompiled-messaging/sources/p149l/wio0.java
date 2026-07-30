package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class wio0 {

    /* JADX INFO: renamed from: a */
    public final String f186556a;

    /* JADX INFO: renamed from: b */
    public final String f186557b;

    /* JADX INFO: renamed from: c */
    public String f186558c;

    public wio0(String str, String str2) {
        this.f186557b = str;
        this.f186556a = str2;
    }

    /* JADX INFO: renamed from: a */
    public C22306c<g6n0> m203342a(r8d0 r8d0Var) {
        String str;
        if (r8d0Var == null) {
            return C22306c.error(new NullPointerException());
        }
        if (TextUtils.equals(this.f186557b, "room-topic") || TextUtils.equals(this.f186557b, "topic")) {
            this.f186558c = ((BLiveVoiceRoom) r8d0Var.f187609b).topics.get(0).f44514id;
        }
        String str2 = this.f186557b;
        int i = hrv.f109265a;
        if (TextUtils.isEmpty(this.f186558c)) {
            str = null;
        } else {
            str = "topicId=" + this.f186558c;
        }
        return hrv.m132764z(RelationshipStatus.suggested, str2, "swipe-in-room", i, null, false, str).map(new r0v());
    }

    /* JADX INFO: renamed from: b */
    public C22306c<g6n0> m203343b(g6n0 g6n0Var) {
        String str;
        if (g6n0Var == null || !g6n0Var.m124623j()) {
            return C22306c.create(new vb20());
        }
        String str2 = this.f186557b;
        int i = hrv.f109265a;
        Pagination paginationM124622i = g6n0Var.m124622i();
        if (TextUtils.isEmpty(this.f186558c)) {
            str = null;
        } else {
            str = "topicId=" + this.f186558c;
        }
        return hrv.m132718A(RelationshipStatus.suggested, str2, "swipe-in-room", i, paginationM124622i, str).map(new r0v());
    }
}
