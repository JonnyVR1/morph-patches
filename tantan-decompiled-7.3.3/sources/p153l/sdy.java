package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.newui.meet.likers.items.MeetLikersUserView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear_FillerMeasure;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class sdy {
    /* JADX INFO: renamed from: a */
    public static void m185510a(MeetLikersUserView meetLikersUserView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetLikersUserView._image = (VDraweeView) viewGroup.getChildAt(0);
        meetLikersUserView._verification_icon = (VImage) viewGroup.getChildAt(1);
        meetLikersUserView._tv_newlikes_badges = (VText) viewGroup.getChildAt(2);
        meetLikersUserView._tv_superlike_badges = (VText) viewGroup.getChildAt(3);
        meetLikersUserView._tv_chat_immediately = (VText) viewGroup.getChildAt(4);
        meetLikersUserView._tv_custom_tag = (VText) viewGroup.getChildAt(5);
        meetLikersUserView._tv_verification_tag = (VText) viewGroup.getChildAt(6);
        meetLikersUserView._personal_info = (ConstraintLayout) viewGroup.getChildAt(7);
        meetLikersUserView._action_btn = (ImageView) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        meetLikersUserView._active = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1)).getChildAt(0);
        meetLikersUserView._distance = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1)).getChildAt(1);
        meetLikersUserView._info = (VLinear_FillerMeasure) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1)).getChildAt(2);
        meetLikersUserView._nickname = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        meetLikersUserView._age = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        meetLikersUserView._tv_zodiac = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1)).getChildAt(3);
        meetLikersUserView._dislike = (VImage) viewGroup.getChildAt(8);
        meetLikersUserView._like = (VImage) viewGroup.getChildAt(9);
    }
}
