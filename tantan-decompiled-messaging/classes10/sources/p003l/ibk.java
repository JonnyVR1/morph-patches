package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.messages.group.at.GroupAtItemViewContent;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ibk {
    /* JADX INFO: renamed from: a */
    public static void m7147a(GroupAtItemViewContent groupAtItemViewContent, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        groupAtItemViewContent.a = (LinearLayout) viewGroup.getChildAt(0);
        groupAtItemViewContent.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        groupAtItemViewContent.c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        groupAtItemViewContent.d = (TextView) viewGroup.getChildAt(1);
    }
}
