package p007l;

import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p006ss.bytertc.audio.device.router.AudioRouteDeviceManager;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.j760;
import l.vwb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class mwh {

    /* JADX INFO: renamed from: d */
    public static volatile mwh f10589d;

    /* JADX INFO: renamed from: a */
    public Map<Integer, List<Integer>> f10590a = new HashMap();

    /* JADX INFO: renamed from: b */
    public List<j760> f10591b;

    /* JADX INFO: renamed from: c */
    public InterfaceC2432a f10592c;

    /* JADX INFO: renamed from: l.mwh$a */
    public interface InterfaceC2432a {
        /* JADX INFO: renamed from: a */
        void mo11060a(View view, String str, String str2, j760... j760VarArr);
    }

    /* JADX INFO: renamed from: d */
    public static mwh m12038d() {
        if (f10589d == null) {
            synchronized (mwh.class) {
                try {
                    if (f10589d == null) {
                        f10589d = new mwh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f10589d;
    }

    /* JADX INFO: renamed from: a */
    public final void m12039a(int i, @NotNull List<j760> list, List<Integer> list2) {
        list.addAll(m12046i());
        list.addAll(m12040b(i));
        list.add(m12045h(list2));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b9  */
    /* JADX INFO: renamed from: b */
    public final List<j760> m12040b(int i) {
        List<j760> list = this.f10591b;
        if (list == null) {
            this.f10591b = new ArrayList();
        } else {
            list.clear();
        }
        if (i == 1) {
            this.f10591b.add(new j760("tooltips_trigger_module", "explore_tab"));
            this.f10591b.add(new j760("tooltips_trigger_page", "swipe_page"));
        } else if (i == 2) {
            this.f10591b.add(new j760("tooltips_trigger_module", "topic_tab"));
            this.f10591b.add(new j760("tooltips_trigger_page", "nearby_page"));
        } else if (i == 3) {
            this.f10591b.add(new j760("tooltips_trigger_module", "concern_tab"));
            this.f10591b.add(new j760("tooltips_trigger_page", "nearby_page"));
        } else if (i == 4) {
            this.f10591b.add(new j760("tooltips_trigger_module", "explore_tab"));
            this.f10591b.add(new j760("tooltips_trigger_page", "swipe_page"));
        } else if (i != 15) {
            switch (i) {
                case 6:
                    this.f10591b.add(new j760("tooltips_trigger_module", "sticker_list_tab"));
                    this.f10591b.add(new j760("tooltips_trigger_page", "shoot_page"));
                    break;
                case 7:
                    this.f10591b.add(new j760("tooltips_trigger_module", "sticker_tab"));
                    this.f10591b.add(new j760("tooltips_trigger_page", "shoot_page"));
                    break;
                case 8:
                case 9:
                    this.f10591b.add(new j760("tooltips_trigger_module", "explore_tab"));
                    this.f10591b.add(new j760("tooltips_trigger_page", "swipe_page"));
                    break;
                case 10:
                case 11:
                    this.f10591b.add(new j760("tooltips_trigger_module", "nearby_icon"));
                    this.f10591b.add(new j760("tooltips_trigger_page", "explore_page"));
                    break;
            }
        } else {
            this.f10591b.add(new j760("tooltips_trigger_module", "like_tab"));
            this.f10591b.add(new j760("tooltips_trigger_page", "nearby_page"));
        }
        switch (i) {
            case 8:
                this.f10591b.add(new j760("tooltips_type_ui", "red_dot_special"));
                this.f10591b.add(new j760("tooltips_trigger_reason", "new_living"));
                break;
            case 9:
                this.f10591b.add(new j760("tooltips_type_ui", "red_dot_figure"));
                this.f10591b.add(new j760("tooltips_trigger_reason", "new_follow_message"));
                break;
            case 10:
            case 11:
                this.f10591b.add(new j760("tooltips_type_ui", "red_dot_figure"));
                this.f10591b.add(new j760("tooltips_trigger_reason", "sub_page_unread"));
                break;
            default:
                this.f10591b.add(new j760("tooltips_type_ui", "red_dot_normal"));
                this.f10591b.add(new j760("tooltips_trigger_reason", "guide"));
                break;
        }
        return this.f10591b;
    }

    /* JADX INFO: renamed from: c */
    public final List<Integer> m12041c(int i) {
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
    public final String m12042e(int i) {
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 9:
                return "e_red_dot_explore";
            case 2:
                return "e_red_dot_topic";
            case 3:
            case AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP /* 16 */:
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
    public String m12043f(int i) {
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
            case AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP /* 16 */:
                return "p_discover_dating";
            case 17:
                return "p_follow";
            case 18:
                return "p_discover_discussion";
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m12044g(int i) {
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
    public final j760 m12045h(List<Integer> list) {
        StringBuilder sb = new StringBuilder("");
        if (NullChecker.a(list)) {
            for (Integer num : list) {
                if (NullChecker.a(num)) {
                    String strM12044g = m12044g(num.intValue());
                    if (!TextUtils.isEmpty(sb)) {
                        sb.append(",");
                    }
                    sb.append(strM12044g);
                }
            }
        }
        return new j760("red_dot_relation_child", sb);
    }

    /* JADX INFO: renamed from: i */
    public final List<j760> m12046i() {
        List<j760> list = this.f10591b;
        if (list == null) {
            this.f10591b = new ArrayList();
        } else {
            list.clear();
        }
        this.f10591b.add(new j760("tooltips_type", "red_dot"));
        return this.f10591b;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m12047j(int i) {
        return i == 8 || i == 9 || i == 11 || i == 10;
    }

    /* JADX INFO: renamed from: k */
    public int m12048k(View view, int i, boolean z, boolean z2, String str, boolean z3) {
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
            m12055r(true, view, i2, arrayList, str);
            return i2;
        }
        m12054q(true, view, i2, arrayList);
        return i2;
    }

    /* JADX INFO: renamed from: l */
    public void m12049l(int i) {
        m12058u(i, m12042e(i), m12043f(i), this.f10590a.get(Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: m */
    public void m12050m(int i, String str) {
        m12058u(i, m12042e(i), str, this.f10590a.get(Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: n */
    public void m12051n(int i) {
        if (this.f10590a.containsKey(1)) {
            List<Integer> list = this.f10590a.get(1);
            list.add(2);
            this.f10590a.put(1, list);
        }
        m12054q(true, null, i, m12041c(i));
    }

    /* JADX INFO: renamed from: o */
    public void m12052o(View view, int i, String str) {
        m12053p(false, view, i, str);
    }

    /* JADX INFO: renamed from: p */
    public void m12053p(boolean z, View view, int i, String str) {
        List<Integer> listM12041c = m12041c(i);
        if (TextUtils.isEmpty(str)) {
            str = m12043f(i);
        }
        m12055r(z, view, i, listM12041c, str);
    }

    /* JADX INFO: renamed from: q */
    public void m12054q(boolean z, View view, int i, List<Integer> list) {
        boolean zContainsKey = this.f10590a.containsKey(Integer.valueOf(i));
        this.f10590a.put(Integer.valueOf(i), list);
        if (zContainsKey) {
            return;
        }
        m12059v(z, view, i, m12042e(i), m12043f(i), list);
    }

    /* JADX INFO: renamed from: r */
    public final void m12055r(boolean z, View view, int i, List<Integer> list, String str) {
        boolean zContainsKey = this.f10590a.containsKey(Integer.valueOf(i));
        this.f10590a.put(Integer.valueOf(i), list);
        if (zContainsKey) {
            return;
        }
        m12059v(z, view, i, m12042e(i), str, list);
    }

    /* JADX INFO: renamed from: s */
    public void m12056s(Integer num) {
        this.f10590a.remove(num);
    }

    /* JADX INFO: renamed from: t */
    public void m12057t() {
        if (NullChecker.a(this.f10592c)) {
            this.f10592c = null;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m12058u(int i, String str, String str2, List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        boolean z = !vwb.J(list) || m12047j(i);
        arrayList.add(new j760("red_dot_state", z ? "on" : "off"));
        if (z) {
            m12039a(i, arrayList, list);
        }
        p6j0.m12913c(str, str2, (j760[]) arrayList.toArray(new j760[0]));
    }

    /* JADX INFO: renamed from: v */
    public final void m12059v(boolean z, View view, int i, String str, String str2, List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        m12039a(i, arrayList, list);
        arrayList.add(new j760("red_dot_state", ""));
        if (!NullChecker.a(this.f10592c) || z) {
            p6j0.m12915e(str, str2, (j760[]) arrayList.toArray(new j760[0]));
        } else {
            this.f10592c.mo11060a(view, str, str2, (j760[]) arrayList.toArray(new j760[0]));
        }
    }

    /* JADX INFO: renamed from: w */
    public void m12060w(InterfaceC2432a interfaceC2432a) {
        this.f10592c = interfaceC2432a;
    }
}
