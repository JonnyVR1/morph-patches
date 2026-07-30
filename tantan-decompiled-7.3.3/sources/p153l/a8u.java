package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerPickView;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class a8u {
    /* JADX INFO: renamed from: a */
    public static void m96498a(LiveStickerPickView liveStickerPickView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveStickerPickView.f49549a = viewGroup.getChildAt(0);
        liveStickerPickView.f49550b = (ConstraintLayout) viewGroup.getChildAt(1);
        liveStickerPickView.f49551c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveStickerPickView.f49552d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveStickerPickView.f49553e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        liveStickerPickView.f49554f = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        liveStickerPickView.f49555g = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        liveStickerPickView.f49556h = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        liveStickerPickView.f49557i = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        liveStickerPickView.f49558j = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
    }
}
