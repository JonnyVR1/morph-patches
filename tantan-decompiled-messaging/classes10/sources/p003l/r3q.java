package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.messages.ItemFriendActiveRemindFemale;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class r3q {
    /* JADX INFO: renamed from: a */
    public static void m9083a(ItemFriendActiveRemindFemale itemFriendActiveRemindFemale, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        itemFriendActiveRemindFemale.a = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemFriendActiveRemindFemale.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
