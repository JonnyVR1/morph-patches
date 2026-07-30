package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class r4a {

    /* JADX INFO: renamed from: a */
    public wyd0 f161159a = new wyd0("oms_swipe_time" + uqb0.f180397c0.userId(), "");

    /* JADX INFO: renamed from: b */
    public byd0 f161160b = new byd0("oms_total_swipe_count" + uqb0.f180397c0.userId(), 0L);

    /* JADX INFO: renamed from: c */
    public byd0 f161161c = new byd0("oms_day_swipe_count" + uqb0.f180397c0.userId(), 0L);

    /* JADX INFO: renamed from: d */
    public byd0 f161162d = new byd0("oms_day_right_swipe_count" + uqb0.f180397c0.userId(), 0L);

    /* JADX INFO: renamed from: e */
    public byd0 f161163e = new byd0("oms_day_left_swipe_count" + uqb0.f180397c0.userId(), 0L);

    /* JADX INFO: renamed from: f */
    public byd0 f161164f = new byd0("oms_day_right_continue_swipe_count" + uqb0.f180397c0.userId(), 0L);

    /* JADX INFO: renamed from: g */
    public byd0 f161165g = new byd0("oms_day_left_continue_swipe_count" + uqb0.f180397c0.userId(), 0L);

    /* JADX INFO: renamed from: h */
    public jxd0 f161166h = new jxd0("oms_day_has_swipe_match_" + uqb0.f180397c0.userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: i */
    public byd0 f161167i = new byd0("oms_day_swipe_count_card_swipe_result_pass" + uqb0.f180397c0.userId(), 0L);

    /* JADX INFO: renamed from: j */
    public Map<String, Integer> f161168j = new HashMap();

    /* JADX INFO: renamed from: k */
    public boolean f161169k;

    /* JADX INFO: renamed from: l */
    public int f161170l;

    /* JADX INFO: renamed from: m */
    public int f161171m;

    /* JADX INFO: renamed from: n */
    public int f161172n;

    /* JADX INFO: renamed from: o */
    public int f161173o;

    /* JADX INFO: renamed from: p */
    public int f161174p;

    /* JADX INFO: renamed from: q */
    public int f161175q;

    /* JADX INFO: renamed from: r */
    public int f161176r;

    /* JADX INFO: renamed from: s */
    public int f161177s;

    /* JADX INFO: renamed from: t */
    public int f161178t;

    /* JADX INFO: renamed from: u */
    public int f161179u;

    /* JADX INFO: renamed from: v */
    public int f161180v;

    /* JADX INFO: renamed from: w */
    public Relationship f161181w;

    /* JADX INFO: renamed from: a */
    public boolean m179742a() {
        Relationship relationship = this.f161181w;
        if (relationship == null) {
            return false;
        }
        return TEnum.equals(relationship.state, "matched");
    }

    /* JADX INFO: renamed from: b */
    public int m179743b() {
        Integer num = this.f161168j.get(CoreModule.m30929H().userId());
        if (!NullChecker.m82486a(num) || num.intValue() < 0) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: c */
    public void m179744c(boolean z, Relationship relationship) {
        this.f161181w = relationship;
        if (z) {
            if (!TEnum.equals(relationship.state, "matched")) {
                this.f161178t++;
            } else {
                this.f161178t = 0;
                this.f161166h.put(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m179745d() {
        Date date = new Date();
        date.setTime(pzi0.m174454o());
        String str = pzi0.f154857d.format(date);
        if (TextUtils.equals(str, this.f161159a.get())) {
            return;
        }
        this.f161159a.put(str);
        this.f161161c.put(0L);
        this.f161167i.put(0L);
        this.f161163e.put(0L);
        this.f161162d.put(0L);
        this.f161165g.put(0L);
        this.f161164f.put(0L);
        this.f161166h.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: e */
    public void m179746e(boolean z) {
        byd0 byd0Var = this.f161160b;
        byd0Var.put(Long.valueOf(byd0Var.get().longValue() + 1));
        byd0 byd0Var2 = this.f161161c;
        byd0Var2.put(Long.valueOf(byd0Var2.get().longValue() + 1));
        this.f161170l++;
        this.f161171m++;
        if (z) {
            this.f161180v = 0;
            if (this.f161161c.get().longValue() > 20) {
                this.f161179u++;
            }
            byd0 byd0Var3 = this.f161162d;
            byd0Var3.put(Long.valueOf(byd0Var3.get().longValue() + 1));
            byd0 byd0Var4 = this.f161164f;
            byd0Var4.put(Long.valueOf(byd0Var4.get().longValue() + 1));
            this.f161165g.put(0L);
            this.f161176r = 0;
            this.f161177s = 0;
            this.f161174p++;
            this.f161175q++;
            this.f161172n++;
            return;
        }
        this.f161179u = 0;
        if (this.f161161c.get().longValue() > 20) {
            this.f161180v++;
        }
        byd0 byd0Var5 = this.f161163e;
        byd0Var5.put(Long.valueOf(byd0Var5.get().longValue() + 1));
        byd0 byd0Var6 = this.f161165g;
        byd0Var6.put(Long.valueOf(byd0Var6.get().longValue() + 1));
        this.f161164f.put(0L);
        this.f161174p = 0;
        this.f161175q = 0;
        this.f161176r++;
        this.f161177s++;
        this.f161173o++;
    }

    /* JADX INFO: renamed from: f */
    public void m179747f() {
        byd0 byd0Var = this.f161167i;
        byd0Var.put(Long.valueOf(byd0Var.get().longValue() + 1));
        String strUserId = CoreModule.m30929H().userId();
        Integer num = this.f161168j.get(strUserId);
        if (!NullChecker.m82486a(num) || num.intValue() < 0) {
            this.f161168j.put(strUserId, 1);
        } else {
            this.f161168j.put(strUserId, Integer.valueOf(num.intValue() + 1));
        }
    }
}
