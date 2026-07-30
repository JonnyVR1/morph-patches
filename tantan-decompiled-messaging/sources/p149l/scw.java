package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.loveletter.LoveLetterUserItem;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class scw {
    /* JADX INFO: renamed from: a */
    public static void m183430a(LoveLetterUserItem loveLetterUserItem, View view) {
        loveLetterUserItem.f24399a = (LoveLetterUserItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        loveLetterUserItem.f24400b = (VDraweeView) viewGroup.getChildAt(0);
        loveLetterUserItem.f24401c = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        loveLetterUserItem.f24402d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        loveLetterUserItem.f24403e = (FrameLayout) viewGroup.getChildAt(2);
        loveLetterUserItem.f24404f = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        loveLetterUserItem.f24405g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        loveLetterUserItem.f24406h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        loveLetterUserItem.f24407i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
    }
}
