package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.feed.newui.mediapicker.InstaMediaItemView;
import com.p051p1.mobile.putong.feed.newui.mediapicker.MarkView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class wwm {
    /* JADX INFO: renamed from: a */
    public static void m208261a(InstaMediaItemView instaMediaItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        instaMediaItemView.f41200a = (VDraweeView) viewGroup.getChildAt(0);
        instaMediaItemView.f41201b = (ImageView) viewGroup.getChildAt(1);
        instaMediaItemView.f41202c = (VText) viewGroup.getChildAt(2);
        instaMediaItemView.f41203d = viewGroup.getChildAt(3);
        instaMediaItemView.f41204e = (MarkView) viewGroup.getChildAt(4);
    }
}
