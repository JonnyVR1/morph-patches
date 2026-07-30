package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.messages.aichat.AIChatMessageAnalysisItem;
import com.p046p1.mobile.putong.core.p053ui.messages.aichat.TextTypeView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VLinear;

/* JADX INFO: renamed from: l.b0 */
/* JADX INFO: loaded from: classes10.dex */
public class C15769b0 {
    /* JADX INFO: renamed from: a */
    public static void m99732a(AIChatMessageAnalysisItem aIChatMessageAnalysisItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        aIChatMessageAnalysisItem.f31702a = (RelativeLayout) viewGroup.getChildAt(0);
        aIChatMessageAnalysisItem.f31703b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        aIChatMessageAnalysisItem.f31704c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        aIChatMessageAnalysisItem.f31705d = (TextTypeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        aIChatMessageAnalysisItem.f31706e = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        aIChatMessageAnalysisItem.f31707f = (VLinear) viewGroup.getChildAt(1);
        aIChatMessageAnalysisItem.f31708g = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        aIChatMessageAnalysisItem.f31709h = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
