package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.ImpressSignalConversationHeadView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class rom {
    /* JADX INFO: renamed from: a */
    public static void m182415a(ImpressSignalConversationHeadView impressSignalConversationHeadView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        impressSignalConversationHeadView._main_container = (VFrame) viewGroup.getChildAt(0);
        impressSignalConversationHeadView._title = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        impressSignalConversationHeadView._avatar_layout = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        impressSignalConversationHeadView._profile_user = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        impressSignalConversationHeadView._green = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        impressSignalConversationHeadView._text_layout = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        impressSignalConversationHeadView._name = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        impressSignalConversationHeadView._avatar_icon = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        impressSignalConversationHeadView._age = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        impressSignalConversationHeadView._say_hi = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        impressSignalConversationHeadView._image_layout = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3);
        impressSignalConversationHeadView._image_layout_image1 = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(0);
        impressSignalConversationHeadView._image_layout_image2 = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(1);
        impressSignalConversationHeadView._image_layout_image3 = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(2);
        impressSignalConversationHeadView._svga_view = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        impressSignalConversationHeadView._close = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        impressSignalConversationHeadView._tag_layout = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        impressSignalConversationHeadView._iv_hi = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(0);
        impressSignalConversationHeadView._gotochat = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(1);
        impressSignalConversationHeadView._svga_view_bg = (SVGAnimationView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m182416b(ImpressSignalConversationHeadView impressSignalConversationHeadView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126012q4, viewGroup, true);
        m182415a(impressSignalConversationHeadView, viewInflate);
        return viewInflate;
    }
}
