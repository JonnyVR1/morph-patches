package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.messages.aichat.AIChatMessageAnalysisItem;

/* JADX INFO: renamed from: l.b0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class C3296b0 {
    /* JADX INFO: renamed from: a */
    public static void m5658a(AIChatMessageAnalysisItem aIChatMessageAnalysisItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        aIChatMessageAnalysisItem.a = (RelativeLayout) viewGroup.getChildAt(0);
        aIChatMessageAnalysisItem.b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        aIChatMessageAnalysisItem.c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        aIChatMessageAnalysisItem.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        aIChatMessageAnalysisItem.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        aIChatMessageAnalysisItem.f = viewGroup.getChildAt(1);
        aIChatMessageAnalysisItem.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        aIChatMessageAnalysisItem.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
