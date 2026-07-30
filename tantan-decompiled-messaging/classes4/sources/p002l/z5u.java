package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerPickView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class z5u {
    /* JADX INFO: renamed from: a */
    public static void m27099a(LiveStickerPickView liveStickerPickView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveStickerPickView.f4743a = viewGroup.getChildAt(0);
        liveStickerPickView.f4744b = viewGroup.getChildAt(1);
        liveStickerPickView.f4745c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveStickerPickView.f4746d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveStickerPickView.f4747e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        liveStickerPickView.f4748f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        liveStickerPickView.f4749g = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        liveStickerPickView.f4750h = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        liveStickerPickView.f4751i = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        liveStickerPickView.f4752j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
    }
}
