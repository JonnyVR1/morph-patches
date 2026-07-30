package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class aso0 {

    /* JADX INFO: renamed from: a */
    public final String f73159a;

    /* JADX INFO: renamed from: b */
    public final String f73160b;

    /* JADX INFO: renamed from: c */
    public String f73161c;

    public aso0(String str, String str2) {
        this.f73160b = str;
        this.f73159a = str2;
    }

    /* JADX INFO: renamed from: a */
    public C22421c<kfn0> m99961a(ugd0 ugd0Var) {
        String str;
        if (ugd0Var == null) {
            return C22421c.error(new NullPointerException());
        }
        if (TextUtils.equals(this.f73160b, "room-topic") || TextUtils.equals(this.f73160b, "topic")) {
            this.f73161c = ((BLiveVoiceRoom) ugd0Var.f138292b).topics.get(0).f45362id;
        }
        String str2 = this.f73160b;
        int i = itv.f116876a;
        if (TextUtils.isEmpty(this.f73161c)) {
            str = null;
        } else {
            str = "topicId=" + this.f73161c;
        }
        return itv.m142123z(RelationshipStatus.suggested, str2, "swipe-in-room", i, null, false, str).map(new s2v());
    }

    /* JADX INFO: renamed from: b */
    public C22421c<kfn0> m99962b(kfn0 kfn0Var) {
        String str;
        if (kfn0Var == null || !kfn0Var.m149586j()) {
            return C22421c.create(new ek20());
        }
        String str2 = this.f73160b;
        int i = itv.f116876a;
        Pagination paginationM149585i = kfn0Var.m149585i();
        if (TextUtils.isEmpty(this.f73161c)) {
            str = null;
        } else {
            str = "topicId=" + this.f73161c;
        }
        return itv.m142077A(RelationshipStatus.suggested, str2, "swipe-in-room", i, paginationM149585i, str).map(new s2v());
    }
}
