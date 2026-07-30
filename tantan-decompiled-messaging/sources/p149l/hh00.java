package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.messages.emoji.VEditTextEmojiCompat;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hh00 {
    /* JADX INFO: renamed from: a */
    public static void m130930a(gh00 gh00Var, View view) {
        gh00Var.f102591a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gh00Var.f102592b = (RelativeLayout) viewGroup.getChildAt(0);
        gh00Var.f102593c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        gh00Var.f102594d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        gh00Var.f102595e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        gh00Var.f102596f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        gh00Var.f102597g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        gh00Var.f102598h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3);
        gh00Var.f102599i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4);
        gh00Var.f102600j = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        gh00Var.f102601k = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        gh00Var.f102602l = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        gh00Var.f102603m = (VEditTextEmojiCompat) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        gh00Var.f102604n = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m130931b(gh00 gh00Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96113z7, viewGroup, false);
        m130930a(gh00Var, viewInflate);
        return viewInflate;
    }
}
