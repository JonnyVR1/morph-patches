package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.messages.group.p061at.GroupAtItemViewContent;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class ydk {
    /* JADX INFO: renamed from: a */
    public static void m215247a(GroupAtItemViewContent groupAtItemViewContent, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        groupAtItemViewContent.f32655a = (LinearLayout) viewGroup.getChildAt(0);
        groupAtItemViewContent.f32656b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        groupAtItemViewContent.f32657c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        groupAtItemViewContent.f32658d = (TextView) viewGroup.getChildAt(1);
    }
}
