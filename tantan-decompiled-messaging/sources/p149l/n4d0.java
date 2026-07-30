package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.page.rights.niceNumber.view.RightNiceNumberItemView;
import com.p046p1.mobile.putong.live.external.page.rights.niceNumber.view.RightNiceNumberView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class n4d0 {
    /* JADX INFO: renamed from: a */
    public static void m157839a(RightNiceNumberView rightNiceNumberView, View view) {
        rightNiceNumberView._root = (RightNiceNumberView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rightNiceNumberView._title = (VText) viewGroup.getChildAt(0);
        rightNiceNumberView._current_num = (VText) viewGroup.getChildAt(1);
        rightNiceNumberView._arrow = (VImage) viewGroup.getChildAt(2);
        rightNiceNumberView._next_num = (VText) viewGroup.getChildAt(3);
        rightNiceNumberView._refresh = (VImage) viewGroup.getChildAt(4);
        rightNiceNumberView._number_one = (RightNiceNumberItemView) viewGroup.getChildAt(5);
        rightNiceNumberView._number_two = (RightNiceNumberItemView) viewGroup.getChildAt(6);
        rightNiceNumberView._number_three = (RightNiceNumberItemView) viewGroup.getChildAt(7);
        rightNiceNumberView._number_four = (RightNiceNumberItemView) viewGroup.getChildAt(8);
        rightNiceNumberView._number_five = (RightNiceNumberItemView) viewGroup.getChildAt(9);
        rightNiceNumberView._number_six = (RightNiceNumberItemView) viewGroup.getChildAt(10);
    }
}
