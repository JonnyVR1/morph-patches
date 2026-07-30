package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.page.rights.list.view.RightAvatarView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class c9d0 {
    /* JADX INFO: renamed from: a */
    public static void m108439a(RightAvatarView rightAvatarView, View view) {
        rightAvatarView.f46859a = (RightAvatarView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rightAvatarView.f46860b = (ConstraintLayout) viewGroup.getChildAt(0);
        rightAvatarView.f46861c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        rightAvatarView.f46862d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        rightAvatarView.f46863e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        rightAvatarView.f46864f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        rightAvatarView.f46865g = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        rightAvatarView.f46866h = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        rightAvatarView.f46867i = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        rightAvatarView.f46868j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6)).getChildAt(0);
        rightAvatarView.f46869k = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
    }
}
