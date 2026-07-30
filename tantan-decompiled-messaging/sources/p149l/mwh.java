package p149l;

import android.text.TextUtils;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public class mwh {

    /* JADX INFO: renamed from: d */
    public static volatile mwh f136050d;

    /* JADX INFO: renamed from: a */
    public Map<Integer, List<Integer>> f136051a = new HashMap();

    /* JADX INFO: renamed from: b */
    public List<j760> f136052b;

    /* JADX INFO: renamed from: c */
    public InterfaceC18577a f136053c;

    /* JADX INFO: renamed from: l.mwh$a */
    public interface InterfaceC18577a {
        /* JADX INFO: renamed from: a */
        void mo139123a(View view, String str, String str2, j760... j760VarArr);
    }

    /* JADX INFO: renamed from: d */
    public static mwh m156632d() {
        if (f136050d == null) {
            synchronized (mwh.class) {
                try {
                    if (f136050d == null) {
                        f136050d = new mwh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f136050d;
    }

    /* JADX INFO: renamed from: a */
    public final void m156633a(int i, @NotNull List<j760> list, List<Integer> list2) {
        list.addAll(m156640i());
        list.addAll(m156634b(i));
        list.add(m156639h(list2));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b9  */
    /* JADX INFO: renamed from: b */
    public final List<j760> m156634b(int i) {
        List<j760> list = this.f136052b;
        if (list == null) {
            this.f136052b = new ArrayList();
        } else {
            list.clear();
        }
        if (i == 1) {
            this.f136052b.add(new j760("tooltips_trigger_module", "explore_tab"));
            this.f136052b.add(new j760("tooltips_trigger_page", "swipe_page"));
        } else if (i == 2) {
            this.f136052b.add(new j760("tooltips_trigger_module", "topic_tab"));
            this.f136052b.add(new j760("tooltips_trigger_page", "nearby_page"));
        } else if (i == 3) {
            this.f136052b.add(new j760("tooltips_trigger_module", "concern_tab"));
            this.f136052b.add(new j760("tooltips_trigger_page", "nearby_page"));
        } else if (i == 4) {
            this.f136052b.add(new j760("tooltips_trigger_module", "explore_tab"));
            this.f136052b.add(new j760("tooltips_trigger_page", "swipe_page"));
        } else if (i != 15) {
            switch (i) {
                case 6:
                    this.f136052b.add(new j760("tooltips_trigger_module", "sticker_list_tab"));
                    this.f136052b.add(new j760("tooltips_trigger_page", "shoot_page"));
                    break;
                case 7:
                    this.f136052b.add(new j760("tooltips_trigger_module", "sticker_tab"));
                    this.f136052b.add(new j760("tooltips_trigger_page", "shoot_page"));
                    break;
                case 8:
                case 9:
                    this.f136052b.add(new j760("tooltips_trigger_module", "explore_tab"));
                    this.f136052b.add(new j760("tooltips_trigger_page", "swipe_page"));
                    break;
                case 10:
                case 11:
                    this.f136052b.add(new j760("tooltips_trigger_module", "nearby_icon"));
                    this.f136052b.add(new j760("tooltips_trigger_page", "explore_page"));
                    break;
            }
        } else {
            this.f136052b.add(new j760("tooltips_trigger_module", "like_tab"));
            this.f136052b.add(new j760("tooltips_trigger_page", "nearby_page"));
        }
        switch (i) {
            case 8:
                this.f136052b.add(new j760("tooltips_type_ui", "red_dot_special"));
                this.f136052b.add(new j760("tooltips_trigger_reason", "new_living"));
                break;
            case 9:
                this.f136052b.add(new j760("tooltips_type_ui", "red_dot_figure"));
                this.f136052b.add(new j760("tooltips_trigger_reason", "new_follow_message"));
                break;
            case 10:
            case 11:
                this.f136052b.add(new j760("tooltips_type_ui", "red_dot_figure"));
                this.f136052b.add(new j760("tooltips_trigger_reason", "sub_page_unread"));
                break;
            default:
                this.f136052b.add(new j760("tooltips_type_ui", "red_dot_normal"));
                this.f136052b.add(new j760("tooltips_trigger_reason", "guide"));
                break;
        }
        return this.f136052b;
    }

    /* JADX INFO: renamed from: c */
    public final List<Integer> m156635c(int i) {
        ArrayList arrayList = new ArrayList();
        if (i == 2) {
            arrayList.add(null);
            return arrayList;
        }
        if (i != 3) {
            if (i == 4) {
                arrayList.add(2);
                return arrayList;
            }
            if (i == 6) {
                arrayList.add(7);
                return arrayList;
            }
            if (i != 7) {
                switch (i) {
                }
                return arrayList;
            }
            arrayList.add(null);
            return arrayList;
        }
        arrayList.add(null);
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final String m156636e(int i) {
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 9:
                return "e_red_dot_explore";
            case 2:
                return "e_red_dot_topic";
            case 3:
            case 16:
            case 17:
            case 18:
                return "e_red_dot_concern";
            case 5:
            case 12:
            case 13:
            case 14:
            default:
                return "";
            case 6:
                return "e_red_dot_sticker_list";
            case 7:
                return "e_red_dot_sticker";
            case 10:
                return "e_explore_red_dot_bubble";
            case 11:
                return "e_nearby_red_dot_bubble";
            case 15:
                return "e_red_dot_like";
        }
    }

    /* JADX INFO: renamed from: f */
    public String m156637f(int i) {
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 9:
                return "p_suggest_users_home_view";
            case 2:
            case 3:
            case 11:
                return OMSDialogPositon.p_nearby;
            case 5:
            case 10:
            case 12:
            case 13:
            case 14:
            default:
                return "";
            case 6:
            case 7:
                return "p_camera";
            case 15:
                return "p_like";
            case 16:
                return "p_discover_dating";
            case 17:
                return "p_follow";
            case 18:
                return "p_discover_discussion";
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m156638g(int i) {
        if (i == 2) {
            return "red_dot_topic";
        }
        if (i == 3) {
            return "red_dot_concern";
        }
        if (i == 6) {
            return "red_dot_sticker_list";
        }
        if (i != 7) {
            return i != 15 ? "" : "red_dot_like";
        }
        return "red_dot_sticker";
    }

    /* JADX INFO: renamed from: h */
    public final j760 m156639h(List<Integer> list) {
        StringBuilder sb = new StringBuilder("");
        if (NullChecker.m81303a(list)) {
            for (Integer num : list) {
                if (NullChecker.m81303a(num)) {
                    String strM156638g = m156638g(num.intValue());
                    if (!TextUtils.isEmpty(sb)) {
                        sb.append(Constants.SEPARATOR_COMMA);
                    }
                    sb.append(strM156638g);
                }
            }
        }
        return new j760("red_dot_relation_child", sb);
    }

    /* JADX INFO: renamed from: i */
    public final List<j760> m156640i() {
        List<j760> list = this.f136052b;
        if (list == null) {
            this.f136052b = new ArrayList();
        } else {
            list.clear();
        }
        this.f136052b.add(new j760("tooltips_type", "red_dot"));
        return this.f136052b;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m156641j(int i) {
        return i == 8 || i == 9 || i == 11 || i == 10;
    }

    /* JADX INFO: renamed from: k */
    public int m156642k(View view, int i, boolean z, boolean z2, String str, boolean z3) {
        int i2;
        ArrayList arrayList = new ArrayList();
        if (i > 0) {
            arrayList.add(Integer.valueOf(z3 ? 3 : 15));
        }
        if (z) {
            arrayList.add(2);
        }
        if (z2) {
            arrayList.clear();
            i2 = 10;
        } else {
            i2 = 1;
        }
        if (z2) {
            m156649r(true, view, i2, arrayList, str);
            return i2;
        }
        m156648q(true, view, i2, arrayList);
        return i2;
    }

    /* JADX INFO: renamed from: l */
    public void m156643l(int i) {
        m156652u(i, m156636e(i), m156637f(i), this.f136051a.get(Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: m */
    public void m156644m(int i, String str) {
        m156652u(i, m156636e(i), str, this.f136051a.get(Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: n */
    public void m156645n(int i) {
        if (this.f136051a.containsKey(1)) {
            List<Integer> list = this.f136051a.get(1);
            list.add(2);
            this.f136051a.put(1, list);
        }
        m156648q(true, null, i, m156635c(i));
    }

    /* JADX INFO: renamed from: o */
    public void m156646o(View view, int i, String str) {
        m156647p(false, view, i, str);
    }

    /* JADX INFO: renamed from: p */
    public void m156647p(boolean z, View view, int i, String str) {
        List<Integer> listM156635c = m156635c(i);
        if (TextUtils.isEmpty(str)) {
            str = m156637f(i);
        }
        m156649r(z, view, i, listM156635c, str);
    }

    /* JADX INFO: renamed from: q */
    public void m156648q(boolean z, View view, int i, List<Integer> list) {
        boolean zContainsKey = this.f136051a.containsKey(Integer.valueOf(i));
        this.f136051a.put(Integer.valueOf(i), list);
        if (zContainsKey) {
            return;
        }
        m156653v(z, view, i, m156636e(i), m156637f(i), list);
    }

    /* JADX INFO: renamed from: r */
    public final void m156649r(boolean z, View view, int i, List<Integer> list, String str) {
        boolean zContainsKey = this.f136051a.containsKey(Integer.valueOf(i));
        this.f136051a.put(Integer.valueOf(i), list);
        if (zContainsKey) {
            return;
        }
        m156653v(z, view, i, m156636e(i), str, list);
    }

    /* JADX INFO: renamed from: s */
    public void m156650s(Integer num) {
        this.f136051a.remove(num);
    }

    /* JADX INFO: renamed from: t */
    public void m156651t() {
        if (NullChecker.m81303a(this.f136053c)) {
            this.f136053c = null;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m156652u(int i, String str, String str2, List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        boolean z = !vwb.m200296J(list) || m156641j(i);
        arrayList.add(new j760("red_dot_state", z ? "on" : BLiveOperationTitleShowType.off));
        if (z) {
            m156633a(i, arrayList, list);
        }
        p6j0.m167669c(str, str2, (j760[]) arrayList.toArray(new j760[0]));
    }

    /* JADX INFO: renamed from: v */
    public final void m156653v(boolean z, View view, int i, String str, String str2, List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        m156633a(i, arrayList, list);
        arrayList.add(new j760("red_dot_state", ""));
        if (!NullChecker.m81303a(this.f136053c) || z) {
            p6j0.m167671e(str, str2, (j760[]) arrayList.toArray(new j760[0]));
        } else {
            this.f136053c.mo139123a(view, str, str2, (j760[]) arrayList.toArray(new j760[0]));
        }
    }

    /* JADX INFO: renamed from: w */
    public void m156654w(InterfaceC18577a interfaceC18577a) {
        this.f136053c = interfaceC18577a;
    }
}
