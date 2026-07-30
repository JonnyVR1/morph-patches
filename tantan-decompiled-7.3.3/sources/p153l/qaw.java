package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.LoveBuzzMessageHeadView;
import com.p051p1.mobile.putong.core.p058ui.view.ImFlowTagsView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qaw {
    /* JADX INFO: renamed from: a */
    public static void m175999a(LoveBuzzMessageHeadView loveBuzzMessageHeadView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        loveBuzzMessageHeadView._content = (VLinear) viewGroup.getChildAt(0);
        loveBuzzMessageHeadView._head = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        loveBuzzMessageHeadView._user_desc1 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        loveBuzzMessageHeadView._peer_region = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        loveBuzzMessageHeadView._tags = (ImFlowTagsView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        loveBuzzMessageHeadView._love_buzz_tips = (VRelative) viewGroup.getChildAt(1);
        loveBuzzMessageHeadView._img_tips = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        loveBuzzMessageHeadView._tv_tips = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        loveBuzzMessageHeadView._tips_subtitle = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
