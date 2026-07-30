package p003l;

import com.p1.mobile.putong.newui.main.base.TabName;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class sp8 {

    /* JADX INFO: renamed from: a */
    public static String f7431a = "swipe_page";

    /* JADX INFO: renamed from: a */
    public static void m9474a(TabName tabName) {
        if (TabName.Moment.equals(tabName)) {
            f7431a = "explore_page";
            return;
        }
        if (TabName.Me.equals(tabName)) {
            f7431a = "mine_page";
        } else if (TabName.Msg.equals(tabName)) {
            f7431a = "message_list_page";
        } else {
            f7431a = "swipe_page";
        }
    }
}
