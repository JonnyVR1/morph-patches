package p149l;

import com.p046p1.mobile.putong.newui.main.base.TabName;

/* JADX INFO: loaded from: classes10.dex */
public class sp8 {

    /* JADX INFO: renamed from: a */
    public static String f165754a = "swipe_page";

    /* JADX INFO: renamed from: a */
    public static void m185329a(TabName tabName) {
        if (TabName.Moment.equals(tabName)) {
            f165754a = "explore_page";
            return;
        }
        if (TabName.Me.equals(tabName)) {
            f165754a = "mine_page";
        } else if (TabName.Msg.equals(tabName)) {
            f165754a = "message_list_page";
        } else {
            f165754a = "swipe_page";
        }
    }
}
