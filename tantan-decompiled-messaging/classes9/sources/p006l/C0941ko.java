package p006l;

import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.j760;
import l.vwb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: l.ko */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0941ko {

    /* JADX INFO: renamed from: c */
    public static volatile C0941ko f15919c;

    /* JADX INFO: renamed from: a */
    public Map<Integer, List<Integer>> f15920a = new HashMap();

    /* JADX INFO: renamed from: b */
    public List<j760> f15921b;

    /* JADX INFO: renamed from: d */
    public static C0941ko m18214d() {
        if (f15919c == null) {
            synchronized (C0941ko.class) {
                try {
                    if (f15919c == null) {
                        f15919c = new C0941ko();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f15919c;
    }

    /* JADX INFO: renamed from: a */
    public final void m18215a(int i, @NotNull List<j760> list, List<Integer> list2) {
        list.addAll(m18222i());
        list.addAll(m18216b(i));
        list.add(m18221h(list2));
    }

    /* JADX INFO: renamed from: b */
    public final List<j760> m18216b(int i) {
        List<j760> list = this.f15921b;
        if (list == null) {
            this.f15921b = new ArrayList();
        } else {
            list.clear();
        }
        switch (i) {
            case 1:
            case CameraSticker.STATE_ERROR /* 4 */:
            case 8:
            case 9:
                this.f15921b.add(new j760("tooltips_trigger_module", "explore_tab"));
                this.f15921b.add(new j760("tooltips_trigger_page", "swipe_page"));
                break;
            case 2:
                this.f15921b.add(new j760("tooltips_trigger_module", "topic_tab"));
                this.f15921b.add(new j760("tooltips_trigger_page", "nearby_page"));
                break;
            case CameraSticker.STATE_COMPLETE /* 3 */:
                this.f15921b.add(new j760("tooltips_trigger_module", "concern_tab"));
                this.f15921b.add(new j760("tooltips_trigger_page", "nearby_page"));
                break;
            case 6:
                this.f15921b.add(new j760("tooltips_trigger_module", "sticker_list_tab"));
                this.f15921b.add(new j760("tooltips_trigger_page", "shoot_page"));
                break;
            case 7:
                this.f15921b.add(new j760("tooltips_trigger_module", "sticker_tab"));
                this.f15921b.add(new j760("tooltips_trigger_page", "shoot_page"));
                break;
            case 10:
            case 11:
                this.f15921b.add(new j760("tooltips_trigger_module", "nearby_icon"));
                this.f15921b.add(new j760("tooltips_trigger_page", "explore_page"));
                break;
            case 14:
                this.f15921b.add(new j760("tooltips_trigger_module", "like_tab"));
                this.f15921b.add(new j760("tooltips_trigger_page", "recommend_page"));
                break;
            case 15:
                this.f15921b.add(new j760("tooltips_trigger_module", "like_tab"));
                this.f15921b.add(new j760("tooltips_trigger_page", "nearby_page"));
                break;
        }
        switch (i) {
            case 8:
                this.f15921b.add(new j760("tooltips_type_ui", "red_dot_special"));
                this.f15921b.add(new j760("tooltips_trigger_reason", "new_living"));
                break;
            case 9:
                this.f15921b.add(new j760("tooltips_type_ui", "red_dot_figure"));
                this.f15921b.add(new j760("tooltips_trigger_reason", "new_follow_message"));
                break;
            case 10:
            case 11:
                this.f15921b.add(new j760("tooltips_type_ui", "red_dot_figure"));
                this.f15921b.add(new j760("tooltips_trigger_reason", "sub_page_unread"));
                break;
            default:
                this.f15921b.add(new j760("tooltips_type_ui", "red_dot_normal"));
                this.f15921b.add(new j760("tooltips_trigger_reason", "guide"));
                break;
        }
        return this.f15921b;
    }

    /* JADX INFO: renamed from: c */
    public final List<Integer> m18217c(int i) {
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
            if (i == 7) {
                arrayList.add(null);
                return arrayList;
            }
            if (i != 14 && i != 15) {
                return arrayList;
            }
        }
        arrayList.add(null);
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final String m18218e(int i) {
        switch (i) {
            case 1:
            case CameraSticker.STATE_ERROR /* 4 */:
            case 8:
            case 9:
                return "e_red_dot_explore";
            case 2:
                return "e_red_dot_topic";
            case CameraSticker.STATE_COMPLETE /* 3 */:
                return "e_red_dot_concern";
            case 5:
            case 12:
            case 13:
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
            case 14:
            case 15:
                return "e_red_dot_like";
        }
    }

    /* JADX INFO: renamed from: f */
    public String m18219f(int i) {
        if (i == 1) {
            return "p_suggest_users_home_view";
        }
        if (i == 2 || i == 3) {
            return "p_nearby";
        }
        if (i == 4) {
            return "p_suggest_users_home_view";
        }
        if (i == 11 || i == 15) {
            return "p_nearby";
        }
        switch (i) {
            case 6:
            case 7:
                return "p_camera";
            case 8:
            case 9:
                return "p_suggest_users_home_view";
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m18220g(int i) {
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
            return (i == 14 || i == 15) ? "red_dot_like" : "";
        }
        return "red_dot_sticker";
    }

    /* JADX INFO: renamed from: h */
    public final j760 m18221h(List<Integer> list) {
        StringBuilder sb = new StringBuilder("");
        if (NullChecker.a(list)) {
            for (Integer num : list) {
                if (NullChecker.a(num)) {
                    String strM18220g = m18220g(num.intValue());
                    if (!TextUtils.isEmpty(sb)) {
                        sb.append(",");
                    }
                    sb.append(strM18220g);
                }
            }
        }
        return new j760("red_dot_relation_child", sb);
    }

    /* JADX INFO: renamed from: i */
    public final List<j760> m18222i() {
        List<j760> list = this.f15921b;
        if (list == null) {
            this.f15921b = new ArrayList();
        } else {
            list.clear();
        }
        this.f15921b.add(new j760("tooltips_type", "red_dot"));
        return this.f15921b;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m18223j(int i) {
        return i == 8 || i == 9 || i == 11 || i == 10;
    }

    /* JADX INFO: renamed from: k */
    public void m18224k(int i) {
        m18228o(i, m18218e(i), m18219f(i), this.f15920a.get(Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: l */
    public void m18225l(View view, int i) {
        m18226m(false, view, i, m18217c(i));
    }

    /* JADX INFO: renamed from: m */
    public void m18226m(boolean z, View view, int i, List<Integer> list) {
        boolean zContainsKey = this.f15920a.containsKey(Integer.valueOf(i));
        this.f15920a.put(Integer.valueOf(i), list);
        if (zContainsKey) {
            return;
        }
        m18229p(z, view, i, m18218e(i), m18219f(i), list);
    }

    /* JADX INFO: renamed from: n */
    public void m18227n(Integer num) {
        this.f15920a.remove(num);
    }

    /* JADX INFO: renamed from: o */
    public final void m18228o(int i, String str, String str2, List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        boolean z = !vwb.J(list) || m18223j(i);
        arrayList.add(new j760("red_dot_state", z ? "on" : "off"));
        if (z) {
            m18215a(i, arrayList, list);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m18229p(boolean z, View view, int i, String str, String str2, List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        m18215a(i, arrayList, list);
        arrayList.add(new j760("red_dot_state", ""));
        if (!NullChecker.a((Object) null) || z) {
            return;
        }
        throw null;
    }
}
