package p153l;

import com.p051p1.mobile.putong.newui.main.base.TabName;

/* JADX INFO: loaded from: classes2.dex */
public class xq8 {

    /* JADX INFO: renamed from: a */
    public static String f195787a = "swipe_page";

    /* JADX INFO: renamed from: a */
    public static void m212718a(TabName tabName) {
        if (TabName.Moment.equals(tabName)) {
            f195787a = "explore_page";
            return;
        }
        if (TabName.Me.equals(tabName)) {
            f195787a = "mine_page";
        } else if (TabName.Msg.equals(tabName)) {
            f195787a = "message_list_page";
        } else {
            f195787a = "swipe_page";
        }
    }
}
