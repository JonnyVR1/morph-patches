package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.newui.group.GroupSuggestLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.emoji.VEditTextEmojiCompat;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class dlk {
    /* JADX INFO: renamed from: a */
    public static void m116768a(clk clkVar, View view) {
        clkVar.f82386a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        clkVar.f82387b = (RelativeLayout) viewGroup.getChildAt(0);
        clkVar.f82388c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        clkVar.f82389d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        clkVar.f82390e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        clkVar.f82391f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        clkVar.f82392g = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        clkVar.f82393h = (VEditTextEmojiCompat) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        clkVar.f82394i = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        clkVar.f82395j = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        clkVar.f82396k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        clkVar.f82397l = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        clkVar.f82398m = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        clkVar.f82399n = (GroupSuggestLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        clkVar.f82400o = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m116769b(clk clkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f157022f, viewGroup, false);
        m116768a(clkVar, viewInflate);
        return viewInflate;
    }
}
