package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.ComboNumView;

/* JADX INFO: loaded from: classes10.dex */
public class pe5 {
    /* JADX INFO: renamed from: a */
    public static void m168502a(ComboNumView comboNumView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        comboNumView._white_bg = viewGroup.getChildAt(0);
        comboNumView._nums = (ImageView) viewGroup.getChildAt(1);
        comboNumView._digits_bg = (LinearLayout) viewGroup.getChildAt(2);
        comboNumView._digits_bg_thousands_bg = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        comboNumView._digits_bg_hundreds_bg = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        comboNumView._digits_bg_tens_bg = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        comboNumView._digits_bg_ones_bg = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        comboNumView._digits_bg_plus_bg = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        comboNumView._digits = (LinearLayout) viewGroup.getChildAt(3);
        comboNumView._digits_thousands = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        comboNumView._digits_hundreds = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        comboNumView._digits_tens = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        comboNumView._digits_ones = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
        comboNumView._digits_plus = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4);
    }
}
