package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerPickView;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class z5u {
    /* JADX INFO: renamed from: a */
    public static void m217376a(LiveStickerPickView liveStickerPickView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveStickerPickView.f48701a = viewGroup.getChildAt(0);
        liveStickerPickView.f48702b = (ConstraintLayout) viewGroup.getChildAt(1);
        liveStickerPickView.f48703c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveStickerPickView.f48704d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveStickerPickView.f48705e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        liveStickerPickView.f48706f = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        liveStickerPickView.f48707g = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        liveStickerPickView.f48708h = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        liveStickerPickView.f48709i = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        liveStickerPickView.f48710j = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
    }
}
