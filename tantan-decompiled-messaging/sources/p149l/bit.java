package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class bit {

    /* JADX INFO: renamed from: a */
    public final String f75834a;

    /* JADX INFO: renamed from: b */
    public final String f75835b;

    public bit(String str, String str2) {
        this.f75835b = str;
        this.f75834a = str2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m102120a() {
        return uvr.m196087d().m162669G0();
    }

    /* JADX INFO: renamed from: b */
    public C22306c<t9u> m102121b() {
        String str;
        String str2 = this.f75835b;
        int i = LivingNormalApiProvider.f47685b;
        if (TextUtils.isEmpty(this.f75834a)) {
            str = null;
        } else {
            str = "subSource=" + this.f75834a;
        }
        return LivingNormalApiProvider.m71509l5(RelationshipStatus.suggested, str2, "swipe-in-room", i, null, false, str, m102120a());
    }

    /* JADX INFO: renamed from: c */
    public C22306c<t9u> m102122c(t9u t9uVar) {
        String str;
        if (t9uVar == null || !t9uVar.m187673t()) {
            return C22306c.create(new vb20());
        }
        String str2 = this.f75835b;
        int i = LivingNormalApiProvider.f47685b;
        Pagination paginationM187671r = t9uVar.m187671r();
        if (TextUtils.isEmpty(this.f75834a)) {
            str = null;
        } else {
            str = "subSource=" + this.f75834a;
        }
        return LivingNormalApiProvider.m71626y5(RelationshipStatus.suggested, str2, "swipe-in-room", i, paginationM187671r, str, m102120a());
    }
}
