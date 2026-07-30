package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import l.hpd0;
import l.mqi0;
import l.uqd0;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class f3a {

    /* JADX INFO: renamed from: a */
    public uqd0 f11577a = new uqd0("oms_swipe_time" + qib0.f19805c0.userId(), "");

    /* JADX INFO: renamed from: b */
    public zpd0 f11578b = new zpd0("oms_total_swipe_count" + qib0.f19805c0.userId(), 0L);

    /* JADX INFO: renamed from: c */
    public zpd0 f11579c = new zpd0("oms_day_swipe_count" + qib0.f19805c0.userId(), 0L);

    /* JADX INFO: renamed from: d */
    public zpd0 f11580d = new zpd0("oms_day_right_swipe_count" + qib0.f19805c0.userId(), 0L);

    /* JADX INFO: renamed from: e */
    public zpd0 f11581e = new zpd0("oms_day_left_swipe_count" + qib0.f19805c0.userId(), 0L);

    /* JADX INFO: renamed from: f */
    public zpd0 f11582f = new zpd0("oms_day_right_continue_swipe_count" + qib0.f19805c0.userId(), 0L);

    /* JADX INFO: renamed from: g */
    public zpd0 f11583g = new zpd0("oms_day_left_continue_swipe_count" + qib0.f19805c0.userId(), 0L);

    /* JADX INFO: renamed from: h */
    public hpd0 f11584h = new hpd0("oms_day_has_swipe_match_" + qib0.f19805c0.userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: i */
    public zpd0 f11585i = new zpd0("oms_day_swipe_count_card_swipe_result_pass" + qib0.f19805c0.userId(), 0L);

    /* JADX INFO: renamed from: j */
    public Map<String, Integer> f11586j = new HashMap();

    /* JADX INFO: renamed from: k */
    public boolean f11587k;

    /* JADX INFO: renamed from: l */
    public int f11588l;

    /* JADX INFO: renamed from: m */
    public int f11589m;

    /* JADX INFO: renamed from: n */
    public int f11590n;

    /* JADX INFO: renamed from: o */
    public int f11591o;

    /* JADX INFO: renamed from: p */
    public int f11592p;

    /* JADX INFO: renamed from: q */
    public int f11593q;

    /* JADX INFO: renamed from: r */
    public int f11594r;

    /* JADX INFO: renamed from: s */
    public int f11595s;

    /* JADX INFO: renamed from: t */
    public int f11596t;

    /* JADX INFO: renamed from: u */
    public int f11597u;

    /* JADX INFO: renamed from: v */
    public int f11598v;

    /* JADX INFO: renamed from: w */
    public Relationship f11599w;

    /* JADX INFO: renamed from: a */
    public boolean m15009a() {
        Relationship relationship = this.f11599w;
        if (relationship == null) {
            return false;
        }
        return TEnum.equals(relationship.state, "matched");
    }

    /* JADX INFO: renamed from: b */
    public int m15010b() {
        Integer num = this.f11586j.get(CoreModule.m1850H().userId());
        if (!NullChecker.a(num) || num.intValue() < 0) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: c */
    public void m15011c(boolean z, Relationship relationship) {
        this.f11599w = relationship;
        if (z) {
            if (!TEnum.equals(relationship.state, "matched")) {
                this.f11596t++;
            } else {
                this.f11596t = 0;
                this.f11584h.put(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m15012d() {
        Date date = new Date();
        date.setTime(mqi0.o());
        String str = mqi0.d.format(date);
        if (TextUtils.equals(str, (CharSequence) this.f11577a.get())) {
            return;
        }
        this.f11577a.put(str);
        this.f11579c.put(0L);
        this.f11585i.put(0L);
        this.f11581e.put(0L);
        this.f11580d.put(0L);
        this.f11583g.put(0L);
        this.f11582f.put(0L);
        this.f11584h.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: e */
    public void m15013e(boolean z) {
        zpd0 zpd0Var = this.f11578b;
        zpd0Var.put(Long.valueOf(((Long) zpd0Var.get()).longValue() + 1));
        zpd0 zpd0Var2 = this.f11579c;
        zpd0Var2.put(Long.valueOf(((Long) zpd0Var2.get()).longValue() + 1));
        this.f11588l++;
        this.f11589m++;
        if (z) {
            this.f11598v = 0;
            if (((Long) this.f11579c.get()).longValue() > 20) {
                this.f11597u++;
            }
            zpd0 zpd0Var3 = this.f11580d;
            zpd0Var3.put(Long.valueOf(((Long) zpd0Var3.get()).longValue() + 1));
            zpd0 zpd0Var4 = this.f11582f;
            zpd0Var4.put(Long.valueOf(((Long) zpd0Var4.get()).longValue() + 1));
            this.f11583g.put(0L);
            this.f11594r = 0;
            this.f11595s = 0;
            this.f11592p++;
            this.f11593q++;
            this.f11590n++;
            return;
        }
        this.f11597u = 0;
        if (((Long) this.f11579c.get()).longValue() > 20) {
            this.f11598v++;
        }
        zpd0 zpd0Var5 = this.f11581e;
        zpd0Var5.put(Long.valueOf(((Long) zpd0Var5.get()).longValue() + 1));
        zpd0 zpd0Var6 = this.f11583g;
        zpd0Var6.put(Long.valueOf(((Long) zpd0Var6.get()).longValue() + 1));
        this.f11582f.put(0L);
        this.f11592p = 0;
        this.f11593q = 0;
        this.f11594r++;
        this.f11595s++;
        this.f11591o++;
    }

    /* JADX INFO: renamed from: f */
    public void m15014f() {
        zpd0 zpd0Var = this.f11585i;
        zpd0Var.put(Long.valueOf(((Long) zpd0Var.get()).longValue() + 1));
        String strUserId = CoreModule.m1850H().userId();
        Integer num = this.f11586j.get(strUserId);
        if (!NullChecker.a(num) || num.intValue() < 0) {
            this.f11586j.put(strUserId, 1);
        } else {
            this.f11586j.put(strUserId, Integer.valueOf(num.intValue() + 1));
        }
    }
}
