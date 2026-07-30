package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.camera.MusicItemView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class kq10 {
    /* JADX INFO: renamed from: a */
    public static void m146918a(MusicItemView musicItemView, View view) {
        musicItemView.f39367a = (MusicItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        musicItemView.f39368b = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        musicItemView.f39369c = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        musicItemView.f39370d = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        musicItemView.f39371e = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        musicItemView.f39372f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        musicItemView.f39373g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        musicItemView.f39374h = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        musicItemView.f39375i = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        musicItemView.f39376j = (TextView) viewGroup.getChildAt(1);
    }
}
