package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveEntrance;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class n0f0 {

    /* JADX INFO: renamed from: a */
    public final BLiveEntrance f136549a;

    /* JADX INFO: renamed from: b */
    public final String f136550b;

    public n0f0(BLiveEntrance bLiveEntrance, String str) {
        this.f136549a = bLiveEntrance;
        this.f136550b = str;
    }

    /* JADX INFO: renamed from: a */
    public C22306c<t9u> m157271a() {
        String str;
        BLiveEntrance bLiveEntrance = this.f136549a;
        if (!bLiveEntrance.showFollow) {
            return C22306c.error(new RuntimeException("This entrance should not request followData"));
        }
        String str2 = bLiveEntrance.source;
        if (TextUtils.isEmpty(this.f136550b)) {
            str = null;
        } else {
            str = "subSource=" + this.f136550b;
        }
        return LivingNormalApiProvider.m71509l5("following-suggested", str2, "swipe-side-bar", 100, null, false, str, false);
    }

    /* JADX INFO: renamed from: b */
    public C22306c<t9u> m157272b() {
        String str;
        BLiveEntrance bLiveEntrance = this.f136549a;
        if (!bLiveEntrance.showHourlySuggested) {
            return C22306c.error(new RuntimeException("This entrance should not request hourRankings"));
        }
        String str2 = bLiveEntrance.source;
        int i = LivingNormalApiProvider.f47685b;
        if (TextUtils.isEmpty(this.f136550b)) {
            str = null;
        } else {
            str = "subSource=" + this.f136550b;
        }
        return LivingNormalApiProvider.m71509l5("hour-ranking-suggested", str2, "swipe-side-bar", i, null, false, str, false);
    }

    /* JADX INFO: renamed from: c */
    public C22306c<t9u> m157273c(t9u t9uVar) {
        String str;
        if (t9uVar == null || !t9uVar.m187673t()) {
            return C22306c.create(new vb20());
        }
        String str2 = this.f136549a.source;
        int i = LivingNormalApiProvider.f47685b;
        Pagination paginationM187671r = t9uVar.m187671r();
        if (TextUtils.isEmpty(this.f136550b)) {
            str = null;
        } else {
            str = "subSource=" + this.f136550b;
        }
        return LivingNormalApiProvider.m71626y5(RelationshipStatus.suggested, str2, "swipe-side-bar", i, paginationM187671r, str, m157275e());
    }

    /* JADX INFO: renamed from: d */
    public C22306c<t9u> m157274d() {
        String str;
        String str2 = this.f136549a.source;
        int i = LivingNormalApiProvider.f47685b;
        if (TextUtils.isEmpty(this.f136550b)) {
            str = null;
        } else {
            str = "subSource=" + this.f136550b;
        }
        return LivingNormalApiProvider.m71509l5(RelationshipStatus.suggested, str2, "swipe-side-bar", i, null, false, str, m157275e());
    }

    /* JADX INFO: renamed from: e */
    public final boolean m157275e() {
        return uvr.m196087d().m162669G0();
    }

    /* JADX INFO: renamed from: f */
    public C22306c<List<i5u>> m157276f(List<String> list) {
        return LivingNormalApiProvider.m71249I6(list, m157275e());
    }
}
