package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.photo.AvatarCard;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VFrame_Anim;
import p151v.VImage;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VText;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class al1 {
    /* JADX INFO: renamed from: a */
    public static void m98636a(AvatarCard avatarCard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        avatarCard.f34439r = (VFrame) viewGroup.getChildAt(0);
        avatarCard.f34440s = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        avatarCard.f34441t = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        avatarCard.f34442u = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        avatarCard.f34443v = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        avatarCard.f34444w = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        avatarCard.f34445x = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        avatarCard.f34446y = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        avatarCard.f34447z = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        avatarCard.f34423A = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        avatarCard.f34424B = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        avatarCard.f34425C = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        avatarCard.f34426D = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        avatarCard.f34427E = (VFrame_Anim) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9);
        avatarCard.f34428F = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9)).getChildAt(0);
        avatarCard.f34429G = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9)).getChildAt(1);
        avatarCard.f34430H = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9)).getChildAt(2);
        avatarCard.f34431I = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10);
    }
}
