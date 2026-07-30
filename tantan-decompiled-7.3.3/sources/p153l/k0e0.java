package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.p058ui.sayHi.view.SayHiDialogContainer;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VEditText;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class k0e0 {
    /* JADX INFO: renamed from: a */
    public static void m147783a(SayHiDialogContainer sayHiDialogContainer, View view) {
        sayHiDialogContainer._root_view = (SayHiDialogContainer) view;
        ViewGroup viewGroup = (ViewGroup) view;
        sayHiDialogContainer._shadow = viewGroup.getChildAt(0);
        sayHiDialogContainer._say_hi_anim_rl = (RelativeLayout) viewGroup.getChildAt(1);
        sayHiDialogContainer._say_hi_anim = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        sayHiDialogContainer._dialog_rl = (RelativeLayout) viewGroup.getChildAt(2);
        sayHiDialogContainer._right_close = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        sayHiDialogContainer._head_anim = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        sayHiDialogContainer._title = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        sayHiDialogContainer._sub_title = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        sayHiDialogContainer._item_value_one = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        sayHiDialogContainer._item_value_one_ic = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(0);
        sayHiDialogContainer._item_value_one_txt = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(1);
        sayHiDialogContainer._item_value_two = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        sayHiDialogContainer._item_value_two_ic = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5)).getChildAt(0);
        sayHiDialogContainer._item_value_two_txt = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5)).getChildAt(1);
        sayHiDialogContainer._item_value_three = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6);
        sayHiDialogContainer._item_value_three_ic = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6)).getChildAt(0);
        sayHiDialogContainer._item_value_three_txt = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6)).getChildAt(1);
        sayHiDialogContainer._input_content = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(7);
        sayHiDialogContainer._input_content_input_edit = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(7)).getChildAt(0);
        sayHiDialogContainer._input_content_send = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(7)).getChildAt(1);
    }
}
