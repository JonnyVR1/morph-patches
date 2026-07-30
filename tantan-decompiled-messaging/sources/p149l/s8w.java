package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.LoveBuzzMessageHeadView;
import com.p046p1.mobile.putong.core.p053ui.view.ImFlowTagsView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class s8w {
    /* JADX INFO: renamed from: a */
    public static void m182665a(LoveBuzzMessageHeadView loveBuzzMessageHeadView, View view) {
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
