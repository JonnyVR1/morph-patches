package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.page.rights.list.view.RightAvatarView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class z0d0 {
    /* JADX INFO: renamed from: a */
    public static void m216733a(RightAvatarView rightAvatarView, View view) {
        rightAvatarView.f46011a = (RightAvatarView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rightAvatarView.f46012b = (ConstraintLayout) viewGroup.getChildAt(0);
        rightAvatarView.f46013c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        rightAvatarView.f46014d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        rightAvatarView.f46015e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        rightAvatarView.f46016f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        rightAvatarView.f46017g = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        rightAvatarView.f46018h = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        rightAvatarView.f46019i = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        rightAvatarView.f46020j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6)).getChildAt(0);
        rightAvatarView.f46021k = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
    }
}
