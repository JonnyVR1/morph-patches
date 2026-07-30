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

/* JADX INFO: renamed from: l.fo */
/* JADX INFO: loaded from: classes9.dex */
public class C17022fo {

    /* JADX INFO: renamed from: c */
    public static volatile C17022fo f99992c;

    /* JADX INFO: renamed from: a */
    public Map<Integer, List<Integer>> f99993a = new HashMap();

    /* JADX INFO: renamed from: b */
    public List<pf60> f99994b;

    /* JADX INFO: renamed from: d */
    public static C17022fo m126416d() {
        if (f99992c == null) {
            synchronized (C17022fo.class) {
                try {
                    if (f99992c == null) {
                        f99992c = new C17022fo();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f99992c;
    }

    /* JADX INFO: renamed from: a */
    public final void m126417a(int i, @NotNull List<pf60> list, List<Integer> list2) {
        list.addAll(m126424i());
        list.addAll(m126418b(i));
        list.add(m126423h(list2));
    }

    /* JADX INFO: renamed from: b */
    public final List<pf60> m126418b(int i) {
        List<pf60> list = this.f99994b;
        if (list == null) {
            this.f99994b = new ArrayList();
        } else {
            list.clear();
        }
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 9:
                this.f99994b.add(new pf60("tooltips_trigger_module", "explore_tab"));
                this.f99994b.add(new pf60("tooltips_trigger_page", "swipe_page"));
                break;
            case 2:
                this.f99994b.add(new pf60("tooltips_trigger_module", "topic_tab"));
                this.f99994b.add(new pf60("tooltips_trigger_page", "nearby_page"));
                break;
            case 3:
                this.f99994b.add(new pf60("tooltips_trigger_module", "concern_tab"));
                this.f99994b.add(new pf60("tooltips_trigger_page", "nearby_page"));
                break;
            case 6:
                this.f99994b.add(new pf60("tooltips_trigger_module", "sticker_list_tab"));
                this.f99994b.add(new pf60("tooltips_trigger_page", "shoot_page"));
                break;
            case 7:
                this.f99994b.add(new pf60("tooltips_trigger_module", "sticker_tab"));
                this.f99994b.add(new pf60("tooltips_trigger_page", "shoot_page"));
                break;
            case 10:
            case 11:
                this.f99994b.add(new pf60("tooltips_trigger_module", "nearby_icon"));
                this.f99994b.add(new pf60("tooltips_trigger_page", "explore_page"));
                break;
            case 14:
                this.f99994b.add(new pf60("tooltips_trigger_module", "like_tab"));
                this.f99994b.add(new pf60("tooltips_trigger_page", "recommend_page"));
                break;
            case 15:
                this.f99994b.add(new pf60("tooltips_trigger_module", "like_tab"));
                this.f99994b.add(new pf60("tooltips_trigger_page", "nearby_page"));
                break;
        }
        switch (i) {
            case 8:
                this.f99994b.add(new pf60("tooltips_type_ui", "red_dot_special"));
                this.f99994b.add(new pf60("tooltips_trigger_reason", "new_living"));
                break;
            case 9:
                this.f99994b.add(new pf60("tooltips_type_ui", "red_dot_figure"));
                this.f99994b.add(new pf60("tooltips_trigger_reason", "new_follow_message"));
                break;
            case 10:
            case 11:
                this.f99994b.add(new pf60("tooltips_type_ui", "red_dot_figure"));
                this.f99994b.add(new pf60("tooltips_trigger_reason", "sub_page_unread"));
                break;
            default:
                this.f99994b.add(new pf60("tooltips_type_ui", "red_dot_normal"));
                this.f99994b.add(new pf60("tooltips_trigger_reason", "guide"));
                break;
        }
        return this.f99994b;
    }

    /* JADX INFO: renamed from: c */
    public final List<Integer> m126419c(int i) {
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
    public final String m126420e(int i) {
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
    public String m126421f(int i) {
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
    public final String m126422g(int i) {
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
    public final pf60 m126423h(List<Integer> list) {
        StringBuilder sb = new StringBuilder("");
        if (NullChecker.m82486a(list)) {
            for (Integer num : list) {
                if (NullChecker.m82486a(num)) {
                    String strM126422g = m126422g(num.intValue());
                    if (!TextUtils.isEmpty(sb)) {
                        sb.append(Constants.SEPARATOR_COMMA);
                    }
                    sb.append(strM126422g);
                }
            }
        }
        return new pf60("red_dot_relation_child", sb);
    }

    /* JADX INFO: renamed from: i */
    public final List<pf60> m126424i() {
        List<pf60> list = this.f99994b;
        if (list == null) {
            this.f99994b = new ArrayList();
        } else {
            list.clear();
        }
        this.f99994b.add(new pf60("tooltips_type", "red_dot"));
        return this.f99994b;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m126425j(int i) {
        return i == 8 || i == 9 || i == 11 || i == 10;
    }

    /* JADX INFO: renamed from: k */
    public void m126426k(int i) {
        m126430o(i, m126420e(i), m126421f(i), this.f99993a.get(Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: l */
    public void m126427l(View view, int i) {
        m126428m(false, view, i, m126419c(i));
    }

    /* JADX INFO: renamed from: m */
    public void m126428m(boolean z, View view, int i, List<Integer> list) {
        boolean zContainsKey = this.f99993a.containsKey(Integer.valueOf(i));
        this.f99993a.put(Integer.valueOf(i), list);
        if (zContainsKey) {
            return;
        }
        m126431p(z, view, i, m126420e(i), m126421f(i), list);
    }

    /* JADX INFO: renamed from: n */
    public void m126429n(Integer num) {
        this.f99993a.remove(num);
    }

    /* JADX INFO: renamed from: o */
    public final void m126430o(int i, String str, String str2, List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        boolean z = !jyb.m147479J(list) || m126425j(i);
        arrayList.add(new pf60("red_dot_state", z ? "on" : BLiveOperationTitleShowType.off));
        if (z) {
            m126417a(i, arrayList, list);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m126431p(boolean z, View view, int i, String str, String str2, List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        m126417a(i, arrayList, list);
        arrayList.add(new pf60("red_dot_state", ""));
        if (!NullChecker.m82486a(null) || z) {
            return;
        }
        throw null;
    }
}
