package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.messages.aichat.AIChatMessageAnalysisItem;
import com.p051p1.mobile.putong.core.p058ui.messages.aichat.TextTypeView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VLinear;

/* JADX INFO: renamed from: l.b0 */
/* JADX INFO: loaded from: classes10.dex */
public class C15879b0 {
    /* JADX INFO: renamed from: a */
    public static void m101237a(AIChatMessageAnalysisItem aIChatMessageAnalysisItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        aIChatMessageAnalysisItem.f32550a = (RelativeLayout) viewGroup.getChildAt(0);
        aIChatMessageAnalysisItem.f32551b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        aIChatMessageAnalysisItem.f32552c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        aIChatMessageAnalysisItem.f32553d = (TextTypeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        aIChatMessageAnalysisItem.f32554e = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        aIChatMessageAnalysisItem.f32555f = (VLinear) viewGroup.getChildAt(1);
        aIChatMessageAnalysisItem.f32556g = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        aIChatMessageAnalysisItem.f32557h = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
