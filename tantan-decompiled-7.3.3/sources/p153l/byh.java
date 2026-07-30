package p153l;

import android.text.TextUtils;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class byh {

    /* JADX INFO: renamed from: d */
    public static volatile byh f79019d;

    /* JADX INFO: renamed from: a */
    public Map<Integer, List<Integer>> f79020a = new HashMap();

    /* JADX INFO: renamed from: b */
    public List<pf60> f79021b;

    /* JADX INFO: renamed from: c */
    public InterfaceC16133a f79022c;

    /* JADX INFO: renamed from: l.byh$a */
    public interface InterfaceC16133a {
        /* JADX INFO: renamed from: a */
        void mo107020a(View view, String str, String str2, pf60... pf60VarArr);
    }

    /* JADX INFO: renamed from: d */
    public static byh m106997d() {
        if (f79019d == null) {
            synchronized (byh.class) {
                try {
                    if (f79019d == null) {
                        f79019d = new byh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f79019d;
    }

    /* JADX INFO: renamed from: a */
    public final void m106998a(int i, @NotNull List<pf60> list, List<Integer> list2) {
        list.addAll(m107005i());
        list.addAll(m106999b(i));
        list.add(m107004h(list2));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b9  */
    /* JADX INFO: renamed from: b */
    public final List<pf60> m106999b(int i) {
        List<pf60> list = this.f79021b;
        if (list == null) {
            this.f79021b = new ArrayList();
        } else {
            list.clear();
        }
        if (i == 1) {
            this.f79021b.add(new pf60("tooltips_trigger_module", "explore_tab"));
            this.f79021b.add(new pf60("tooltips_trigger_page", "swipe_page"));
        } else if (i == 2) {
            this.f79021b.add(new pf60("tooltips_trigger_module", "topic_tab"));
            this.f79021b.add(new pf60("tooltips_trigger_page", "nearby_page"));
        } else if (i == 3) {
            this.f79021b.add(new pf60("tooltips_trigger_module", "concern_tab"));
            this.f79021b.add(new pf60("tooltips_trigger_page", "nearby_page"));
        } else if (i == 4) {
            this.f79021b.add(new pf60("tooltips_trigger_module", "explore_tab"));
            this.f79021b.add(new pf60("tooltips_trigger_page", "swipe_page"));
        } else if (i != 15) {
            switch (i) {
                case 6:
                    this.f79021b.add(new pf60("tooltips_trigger_module", "sticker_list_tab"));
                    this.f79021b.add(new pf60("tooltips_trigger_page", "shoot_page"));
                    break;
                case 7:
                    this.f79021b.add(new pf60("tooltips_trigger_module", "sticker_tab"));
                    this.f79021b.add(new pf60("tooltips_trigger_page", "shoot_page"));
                    break;
                case 8:
                case 9:
                    this.f79021b.add(new pf60("tooltips_trigger_module", "explore_tab"));
                    this.f79021b.add(new pf60("tooltips_trigger_page", "swipe_page"));
                    break;
                case 10:
                case 11:
                    this.f79021b.add(new pf60("tooltips_trigger_module", "nearby_icon"));
                    this.f79021b.add(new pf60("tooltips_trigger_page", "explore_page"));
                    break;
            }
        } else {
            this.f79021b.add(new pf60("tooltips_trigger_module", "like_tab"));
            this.f79021b.add(new pf60("tooltips_trigger_page", "nearby_page"));
        }
        switch (i) {
            case 8:
                this.f79021b.add(new pf60("tooltips_type_ui", "red_dot_special"));
                this.f79021b.add(new pf60("tooltips_trigger_reason", "new_living"));
                break;
            case 9:
                this.f79021b.add(new pf60("tooltips_type_ui", "red_dot_figure"));
                this.f79021b.add(new pf60("tooltips_trigger_reason", "new_follow_message"));
                break;
            case 10:
            case 11:
                this.f79021b.add(new pf60("tooltips_type_ui", "red_dot_figure"));
                this.f79021b.add(new pf60("tooltips_trigger_reason", "sub_page_unread"));
                break;
            default:
                this.f79021b.add(new pf60("tooltips_type_ui", "red_dot_normal"));
                this.f79021b.add(new pf60("tooltips_trigger_reason", "guide"));
                break;
        }
        return this.f79021b;
    }

    /* JADX INFO: renamed from: c */
    public final List<Integer> m107000c(int i) {
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
    public final String m107001e(int i) {
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
    public String m107002f(int i) {
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
    public final String m107003g(int i) {
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
    public final pf60 m107004h(List<Integer> list) {
        StringBuilder sb = new StringBuilder("");
        if (NullChecker.m82486a(list)) {
            for (Integer num : list) {
                if (NullChecker.m82486a(num)) {
                    String strM107003g = m107003g(num.intValue());
                    if (!TextUtils.isEmpty(sb)) {
                        sb.append(Constants.SEPARATOR_COMMA);
                    }
                    sb.append(strM107003g);
                }
            }
        }
        return new pf60("red_dot_relation_child", sb);
    }

    /* JADX INFO: renamed from: i */
    public final List<pf60> m107005i() {
        List<pf60> list = this.f79021b;
        if (list == null) {
            this.f79021b = new ArrayList();
        } else {
            list.clear();
        }
        this.f79021b.add(new pf60("tooltips_type", "red_dot"));
        return this.f79021b;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m107006j(int i) {
        return i == 8 || i == 9 || i == 11 || i == 10;
    }

    /* JADX INFO: renamed from: k */
    public int m107007k(View view, int i, boolean z, boolean z2, String str, boolean z3) {
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
            m107014r(true, view, i2, arrayList, str);
            return i2;
        }
        m107013q(true, view, i2, arrayList);
        return i2;
    }

    /* JADX INFO: renamed from: l */
    public void m107008l(int i) {
        m107017u(i, m107001e(i), m107002f(i), this.f79020a.get(Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: m */
    public void m107009m(int i, String str) {
        m107017u(i, m107001e(i), str, this.f79020a.get(Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: n */
    public void m107010n(int i) {
        if (this.f79020a.containsKey(1)) {
            List<Integer> list = this.f79020a.get(1);
            list.add(2);
            this.f79020a.put(1, list);
        }
        m107013q(true, null, i, m107000c(i));
    }

    /* JADX INFO: renamed from: o */
    public void m107011o(View view, int i, String str) {
        m107012p(false, view, i, str);
    }

    /* JADX INFO: renamed from: p */
    public void m107012p(boolean z, View view, int i, String str) {
        List<Integer> listM107000c = m107000c(i);
        if (TextUtils.isEmpty(str)) {
            str = m107002f(i);
        }
        m107014r(z, view, i, listM107000c, str);
    }

    /* JADX INFO: renamed from: q */
    public void m107013q(boolean z, View view, int i, List<Integer> list) {
        boolean zContainsKey = this.f79020a.containsKey(Integer.valueOf(i));
        this.f79020a.put(Integer.valueOf(i), list);
        if (zContainsKey) {
            return;
        }
        m107018v(z, view, i, m107001e(i), m107002f(i), list);
    }

    /* JADX INFO: renamed from: r */
    public final void m107014r(boolean z, View view, int i, List<Integer> list, String str) {
        boolean zContainsKey = this.f79020a.containsKey(Integer.valueOf(i));
        this.f79020a.put(Integer.valueOf(i), list);
        if (zContainsKey) {
            return;
        }
        m107018v(z, view, i, m107001e(i), str, list);
    }

    /* JADX INFO: renamed from: s */
    public void m107015s(Integer num) {
        this.f79020a.remove(num);
    }

    /* JADX INFO: renamed from: t */
    public void m107016t() {
        if (NullChecker.m82486a(this.f79022c)) {
            this.f79022c = null;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m107017u(int i, String str, String str2, List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        boolean z = !jyb.m147479J(list) || m107006j(i);
        arrayList.add(new pf60("red_dot_state", z ? "on" : BLiveOperationTitleShowType.off));
        if (z) {
            m106998a(i, arrayList, list);
        }
        tfj0.m190940c(str, str2, (pf60[]) arrayList.toArray(new pf60[0]));
    }

    /* JADX INFO: renamed from: v */
    public final void m107018v(boolean z, View view, int i, String str, String str2, List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        m106998a(i, arrayList, list);
        arrayList.add(new pf60("red_dot_state", ""));
        if (!NullChecker.m82486a(this.f79022c) || z) {
            tfj0.m190942e(str, str2, (pf60[]) arrayList.toArray(new pf60[0]));
        } else {
            this.f79022c.mo107020a(view, str, str2, (pf60[]) arrayList.toArray(new pf60[0]));
        }
    }

    /* JADX INFO: renamed from: w */
    public void m107019w(InterfaceC16133a interfaceC16133a) {
        this.f79022c = interfaceC16133a;
    }
}
