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

/* JADX INFO: renamed from: l.ko */
/* JADX INFO: loaded from: classes9.dex */
public class C18050ko {

    /* JADX INFO: renamed from: c */
    public static volatile C18050ko f123938c;

    /* JADX INFO: renamed from: a */
    public Map<Integer, List<Integer>> f123939a = new HashMap();

    /* JADX INFO: renamed from: b */
    public List<j760> f123940b;

    /* JADX INFO: renamed from: d */
    public static C18050ko m146640d() {
        if (f123938c == null) {
            synchronized (C18050ko.class) {
                try {
                    if (f123938c == null) {
                        f123938c = new C18050ko();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f123938c;
    }

    /* JADX INFO: renamed from: a */
    public final void m146641a(int i, @NotNull List<j760> list, List<Integer> list2) {
        list.addAll(m146648i());
        list.addAll(m146642b(i));
        list.add(m146647h(list2));
    }

    /* JADX INFO: renamed from: b */
    public final List<j760> m146642b(int i) {
        List<j760> list = this.f123940b;
        if (list == null) {
            this.f123940b = new ArrayList();
        } else {
            list.clear();
        }
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 9:
                this.f123940b.add(new j760("tooltips_trigger_module", "explore_tab"));
                this.f123940b.add(new j760("tooltips_trigger_page", "swipe_page"));
                break;
            case 2:
                this.f123940b.add(new j760("tooltips_trigger_module", "topic_tab"));
                this.f123940b.add(new j760("tooltips_trigger_page", "nearby_page"));
                break;
            case 3:
                this.f123940b.add(new j760("tooltips_trigger_module", "concern_tab"));
                this.f123940b.add(new j760("tooltips_trigger_page", "nearby_page"));
                break;
            case 6:
                this.f123940b.add(new j760("tooltips_trigger_module", "sticker_list_tab"));
                this.f123940b.add(new j760("tooltips_trigger_page", "shoot_page"));
                break;
            case 7:
                this.f123940b.add(new j760("tooltips_trigger_module", "sticker_tab"));
                this.f123940b.add(new j760("tooltips_trigger_page", "shoot_page"));
                break;
            case 10:
            case 11:
                this.f123940b.add(new j760("tooltips_trigger_module", "nearby_icon"));
                this.f123940b.add(new j760("tooltips_trigger_page", "explore_page"));
                break;
            case 14:
                this.f123940b.add(new j760("tooltips_trigger_module", "like_tab"));
                this.f123940b.add(new j760("tooltips_trigger_page", "recommend_page"));
                break;
            case 15:
                this.f123940b.add(new j760("tooltips_trigger_module", "like_tab"));
                this.f123940b.add(new j760("tooltips_trigger_page", "nearby_page"));
                break;
        }
        switch (i) {
            case 8:
                this.f123940b.add(new j760("tooltips_type_ui", "red_dot_special"));
                this.f123940b.add(new j760("tooltips_trigger_reason", "new_living"));
                break;
            case 9:
                this.f123940b.add(new j760("tooltips_type_ui", "red_dot_figure"));
                this.f123940b.add(new j760("tooltips_trigger_reason", "new_follow_message"));
                break;
            case 10:
            case 11:
                this.f123940b.add(new j760("tooltips_type_ui", "red_dot_figure"));
                this.f123940b.add(new j760("tooltips_trigger_reason", "sub_page_unread"));
                break;
            default:
                this.f123940b.add(new j760("tooltips_type_ui", "red_dot_normal"));
                this.f123940b.add(new j760("tooltips_trigger_reason", "guide"));
                break;
        }
        return this.f123940b;
    }

    /* JADX INFO: renamed from: c */
    public final List<Integer> m146643c(int i) {
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
    public final String m146644e(int i) {
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 9:
                return "e_red_dot_explore";
            case 2:
                return "e_red_dot_topic";
            case 3:
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
    public String m146645f(int i) {
        if (i == 1) {
            return "p_suggest_users_home_view";
        }
        if (i == 2 || i == 3) {
            return OMSDialogPositon.p_nearby;
        }
        if (i == 4) {
            return "p_suggest_users_home_view";
        }
        if (i == 11 || i == 15) {
            return OMSDialogPositon.p_nearby;
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
    public final String m146646g(int i) {
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
    public final j760 m146647h(List<Integer> list) {
        StringBuilder sb = new StringBuilder("");
        if (NullChecker.m81303a(list)) {
            for (Integer num : list) {
                if (NullChecker.m81303a(num)) {
                    String strM146646g = m146646g(num.intValue());
                    if (!TextUtils.isEmpty(sb)) {
                        sb.append(Constants.SEPARATOR_COMMA);
                    }
                    sb.append(strM146646g);
                }
            }
        }
        return new j760("red_dot_relation_child", sb);
    }

    /* JADX INFO: renamed from: i */
    public final List<j760> m146648i() {
        List<j760> list = this.f123940b;
        if (list == null) {
            this.f123940b = new ArrayList();
        } else {
            list.clear();
        }
        this.f123940b.add(new j760("tooltips_type", "red_dot"));
        return this.f123940b;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m146649j(int i) {
        return i == 8 || i == 9 || i == 11 || i == 10;
    }

    /* JADX INFO: renamed from: k */
    public void m146650k(int i) {
        m146654o(i, m146644e(i), m146645f(i), this.f123939a.get(Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: l */
    public void m146651l(View view, int i) {
        m146652m(false, view, i, m146643c(i));
    }

    /* JADX INFO: renamed from: m */
    public void m146652m(boolean z, View view, int i, List<Integer> list) {
        boolean zContainsKey = this.f123939a.containsKey(Integer.valueOf(i));
        this.f123939a.put(Integer.valueOf(i), list);
        if (zContainsKey) {
            return;
        }
        m146655p(z, view, i, m146644e(i), m146645f(i), list);
    }

    /* JADX INFO: renamed from: n */
    public void m146653n(Integer num) {
        this.f123939a.remove(num);
    }

    /* JADX INFO: renamed from: o */
    public final void m146654o(int i, String str, String str2, List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        boolean z = !vwb.m200296J(list) || m146649j(i);
        arrayList.add(new j760("red_dot_state", z ? "on" : BLiveOperationTitleShowType.off));
        if (z) {
            m146641a(i, arrayList, list);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m146655p(boolean z, View view, int i, String str, String str2, List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        m146641a(i, arrayList, list);
        arrayList.add(new j760("red_dot_state", ""));
        if (!NullChecker.m81303a(null) || z) {
            return;
        }
        throw null;
    }
}
