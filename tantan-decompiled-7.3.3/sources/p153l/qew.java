package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.loveletter.LoveLetterUserItem;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qew {
    /* JADX INFO: renamed from: a */
    public static void m176276a(LoveLetterUserItem loveLetterUserItem, View view) {
        loveLetterUserItem.f25141a = (LoveLetterUserItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        loveLetterUserItem.f25142b = (VDraweeView) viewGroup.getChildAt(0);
        loveLetterUserItem.f25143c = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        loveLetterUserItem.f25144d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        loveLetterUserItem.f25145e = (FrameLayout) viewGroup.getChildAt(2);
        loveLetterUserItem.f25146f = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        loveLetterUserItem.f25147g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        loveLetterUserItem.f25148h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        loveLetterUserItem.f25149i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
    }
}
