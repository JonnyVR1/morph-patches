package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.data.Pagination;
import com.p1.mobile.putong.live.base.data.BLiveEntrance;
import java.util.List;
import l.i5u;
import l.t9u;
import l.uvr;
import l.vb20;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class n0f0 {

    /* JADX INFO: renamed from: a */
    public final BLiveEntrance f15769a;

    /* JADX INFO: renamed from: b */
    public final String f15770b;

    public n0f0(BLiveEntrance bLiveEntrance, String str) {
        this.f15769a = bLiveEntrance;
        this.f15770b = str;
    }

    /* JADX INFO: renamed from: a */
    public c<t9u> m18342a() {
        String str;
        BLiveEntrance bLiveEntrance = this.f15769a;
        if (!bLiveEntrance.showFollow) {
            return c.error(new RuntimeException("This entrance should not request followData"));
        }
        String str2 = bLiveEntrance.source;
        if (TextUtils.isEmpty(this.f15770b)) {
            str = null;
        } else {
            str = "subSource=" + this.f15770b;
        }
        return LivingNormalApiProvider.m4875l5("following-suggested", str2, "swipe-side-bar", 100, null, false, str, false);
    }

    /* JADX INFO: renamed from: b */
    public c<t9u> m18343b() {
        String str;
        BLiveEntrance bLiveEntrance = this.f15769a;
        if (!bLiveEntrance.showHourlySuggested) {
            return c.error(new RuntimeException("This entrance should not request hourRankings"));
        }
        String str2 = bLiveEntrance.source;
        int i = LivingNormalApiProvider.f3727b;
        if (TextUtils.isEmpty(this.f15770b)) {
            str = null;
        } else {
            str = "subSource=" + this.f15770b;
        }
        return LivingNormalApiProvider.m4875l5("hour-ranking-suggested", str2, "swipe-side-bar", i, null, false, str, false);
    }

    /* JADX INFO: renamed from: c */
    public c<t9u> m18344c(t9u t9uVar) {
        String str;
        if (t9uVar == null || !t9uVar.t()) {
            return c.create(new vb20());
        }
        String str2 = this.f15769a.source;
        int i = LivingNormalApiProvider.f3727b;
        Pagination paginationR = t9uVar.r();
        if (TextUtils.isEmpty(this.f15770b)) {
            str = null;
        } else {
            str = "subSource=" + this.f15770b;
        }
        return LivingNormalApiProvider.m4992y5("suggested", str2, "swipe-side-bar", i, paginationR, str, m18346e());
    }

    /* JADX INFO: renamed from: d */
    public c<t9u> m18345d() {
        String str;
        String str2 = this.f15769a.source;
        int i = LivingNormalApiProvider.f3727b;
        if (TextUtils.isEmpty(this.f15770b)) {
            str = null;
        } else {
            str = "subSource=" + this.f15770b;
        }
        return LivingNormalApiProvider.m4875l5("suggested", str2, "swipe-side-bar", i, null, false, str, m18346e());
    }

    /* JADX INFO: renamed from: e */
    public final boolean m18346e() {
        return uvr.d().G0();
    }

    /* JADX INFO: renamed from: f */
    public c<List<i5u>> m18347f(List<String> list) {
        return LivingNormalApiProvider.m4615I6(list, m18346e());
    }
}
