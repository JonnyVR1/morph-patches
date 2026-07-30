package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.feed.newui.mediapicker.InstaMediaItemView;
import com.p046p1.mobile.putong.feed.newui.mediapicker.MarkView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class vum {
    /* JADX INFO: renamed from: a */
    public static void m200085a(InstaMediaItemView instaMediaItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        instaMediaItemView.f40352a = (VDraweeView) viewGroup.getChildAt(0);
        instaMediaItemView.f40353b = (ImageView) viewGroup.getChildAt(1);
        instaMediaItemView.f40354c = (VText) viewGroup.getChildAt(2);
        instaMediaItemView.f40355d = viewGroup.getChildAt(3);
        instaMediaItemView.f40356e = (MarkView) viewGroup.getChildAt(4);
    }
}
