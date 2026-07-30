package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.newui.loveletter.LoveLetterUserItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class scw {
    /* JADX INFO: renamed from: a */
    public static void m9334a(LoveLetterUserItem loveLetterUserItem, View view) {
        loveLetterUserItem.a = (LoveLetterUserItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        loveLetterUserItem.b = viewGroup.getChildAt(0);
        loveLetterUserItem.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        loveLetterUserItem.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        loveLetterUserItem.e = (FrameLayout) viewGroup.getChildAt(2);
        loveLetterUserItem.f = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        loveLetterUserItem.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        loveLetterUserItem.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        loveLetterUserItem.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
    }
}
