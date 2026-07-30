package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.photo.AvatarCard;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VFrame_Anim;
import p147v.VImage;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VText;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class tk1 {
    /* JADX INFO: renamed from: a */
    public static void m189421a(AvatarCard avatarCard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        avatarCard.f33591r = (VFrame) viewGroup.getChildAt(0);
        avatarCard.f33592s = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        avatarCard.f33593t = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        avatarCard.f33594u = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        avatarCard.f33595v = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        avatarCard.f33596w = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        avatarCard.f33597x = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        avatarCard.f33598y = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        avatarCard.f33599z = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        avatarCard.f33575A = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        avatarCard.f33576B = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        avatarCard.f33577C = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        avatarCard.f33578D = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        avatarCard.f33579E = (VFrame_Anim) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9);
        avatarCard.f33580F = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9)).getChildAt(0);
        avatarCard.f33581G = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9)).getChildAt(1);
        avatarCard.f33582H = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9)).getChildAt(2);
        avatarCard.f33583I = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10);
    }
}
