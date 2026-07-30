package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.messages.group.p056at.GroupAtItemViewContent;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class ibk {
    /* JADX INFO: renamed from: a */
    public static void m135259a(GroupAtItemViewContent groupAtItemViewContent, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        groupAtItemViewContent.f31807a = (LinearLayout) viewGroup.getChildAt(0);
        groupAtItemViewContent.f31808b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        groupAtItemViewContent.f31809c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        groupAtItemViewContent.f31810d = (TextView) viewGroup.getChildAt(1);
    }
}
