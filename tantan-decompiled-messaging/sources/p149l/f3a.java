package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class f3a {

    /* JADX INFO: renamed from: a */
    public uqd0 f94256a = new uqd0("oms_swipe_time" + qib0.f154714c0.userId(), "");

    /* JADX INFO: renamed from: b */
    public zpd0 f94257b = new zpd0("oms_total_swipe_count" + qib0.f154714c0.userId(), 0L);

    /* JADX INFO: renamed from: c */
    public zpd0 f94258c = new zpd0("oms_day_swipe_count" + qib0.f154714c0.userId(), 0L);

    /* JADX INFO: renamed from: d */
    public zpd0 f94259d = new zpd0("oms_day_right_swipe_count" + qib0.f154714c0.userId(), 0L);

    /* JADX INFO: renamed from: e */
    public zpd0 f94260e = new zpd0("oms_day_left_swipe_count" + qib0.f154714c0.userId(), 0L);

    /* JADX INFO: renamed from: f */
    public zpd0 f94261f = new zpd0("oms_day_right_continue_swipe_count" + qib0.f154714c0.userId(), 0L);

    /* JADX INFO: renamed from: g */
    public zpd0 f94262g = new zpd0("oms_day_left_continue_swipe_count" + qib0.f154714c0.userId(), 0L);

    /* JADX INFO: renamed from: h */
    public hpd0 f94263h = new hpd0("oms_day_has_swipe_match_" + qib0.f154714c0.userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: i */
    public zpd0 f94264i = new zpd0("oms_day_swipe_count_card_swipe_result_pass" + qib0.f154714c0.userId(), 0L);

    /* JADX INFO: renamed from: j */
    public Map<String, Integer> f94265j = new HashMap();

    /* JADX INFO: renamed from: k */
    public boolean f94266k;

    /* JADX INFO: renamed from: l */
    public int f94267l;

    /* JADX INFO: renamed from: m */
    public int f94268m;

    /* JADX INFO: renamed from: n */
    public int f94269n;

    /* JADX INFO: renamed from: o */
    public int f94270o;

    /* JADX INFO: renamed from: p */
    public int f94271p;

    /* JADX INFO: renamed from: q */
    public int f94272q;

    /* JADX INFO: renamed from: r */
    public int f94273r;

    /* JADX INFO: renamed from: s */
    public int f94274s;

    /* JADX INFO: renamed from: t */
    public int f94275t;

    /* JADX INFO: renamed from: u */
    public int f94276u;

    /* JADX INFO: renamed from: v */
    public int f94277v;

    /* JADX INFO: renamed from: w */
    public Relationship f94278w;

    /* JADX INFO: renamed from: a */
    public boolean m119251a() {
        Relationship relationship = this.f94278w;
        if (relationship == null) {
            return false;
        }
        return TEnum.equals(relationship.state, "matched");
    }

    /* JADX INFO: renamed from: b */
    public int m119252b() {
        Integer num = this.f94265j.get(CoreModule.m29931H().userId());
        if (!NullChecker.m81303a(num) || num.intValue() < 0) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: c */
    public void m119253c(boolean z, Relationship relationship) {
        this.f94278w = relationship;
        if (z) {
            if (!TEnum.equals(relationship.state, "matched")) {
                this.f94275t++;
            } else {
                this.f94275t = 0;
                this.f94263h.put(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m119254d() {
        Date date = new Date();
        date.setTime(mqi0.m155944o());
        String str = mqi0.f135252d.format(date);
        if (TextUtils.equals(str, this.f94256a.get())) {
            return;
        }
        this.f94256a.put(str);
        this.f94258c.put(0L);
        this.f94264i.put(0L);
        this.f94260e.put(0L);
        this.f94259d.put(0L);
        this.f94262g.put(0L);
        this.f94261f.put(0L);
        this.f94263h.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: e */
    public void m119255e(boolean z) {
        zpd0 zpd0Var = this.f94257b;
        zpd0Var.put(Long.valueOf(zpd0Var.get().longValue() + 1));
        zpd0 zpd0Var2 = this.f94258c;
        zpd0Var2.put(Long.valueOf(zpd0Var2.get().longValue() + 1));
        this.f94267l++;
        this.f94268m++;
        if (z) {
            this.f94277v = 0;
            if (this.f94258c.get().longValue() > 20) {
                this.f94276u++;
            }
            zpd0 zpd0Var3 = this.f94259d;
            zpd0Var3.put(Long.valueOf(zpd0Var3.get().longValue() + 1));
            zpd0 zpd0Var4 = this.f94261f;
            zpd0Var4.put(Long.valueOf(zpd0Var4.get().longValue() + 1));
            this.f94262g.put(0L);
            this.f94273r = 0;
            this.f94274s = 0;
            this.f94271p++;
            this.f94272q++;
            this.f94269n++;
            return;
        }
        this.f94276u = 0;
        if (this.f94258c.get().longValue() > 20) {
            this.f94277v++;
        }
        zpd0 zpd0Var5 = this.f94260e;
        zpd0Var5.put(Long.valueOf(zpd0Var5.get().longValue() + 1));
        zpd0 zpd0Var6 = this.f94262g;
        zpd0Var6.put(Long.valueOf(zpd0Var6.get().longValue() + 1));
        this.f94261f.put(0L);
        this.f94271p = 0;
        this.f94272q = 0;
        this.f94273r++;
        this.f94274s++;
        this.f94270o++;
    }

    /* JADX INFO: renamed from: f */
    public void m119256f() {
        zpd0 zpd0Var = this.f94264i;
        zpd0Var.put(Long.valueOf(zpd0Var.get().longValue() + 1));
        String strUserId = CoreModule.m29931H().userId();
        Integer num = this.f94265j.get(strUserId);
        if (!NullChecker.m81303a(num) || num.intValue() < 0) {
            this.f94265j.put(strUserId, 1);
        } else {
            this.f94265j.put(strUserId, Integer.valueOf(num.intValue() + 1));
        }
    }
}
