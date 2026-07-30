package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.seeblindbox.SeeBlindBoxItem;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class a8e0 {
    /* JADX INFO: renamed from: a */
    public static void m95343a(SeeBlindBoxItem seeBlindBoxItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        seeBlindBoxItem._image = (VDraweeView) viewGroup.getChildAt(0);
        seeBlindBoxItem._anim = (AnimEffectPlayer) viewGroup.getChildAt(1);
        seeBlindBoxItem._tag = (VImage) viewGroup.getChildAt(2);
        seeBlindBoxItem._info_container = (ConstraintLayout) viewGroup.getChildAt(3);
        seeBlindBoxItem._info_container_name = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        seeBlindBoxItem._info_container_age = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
