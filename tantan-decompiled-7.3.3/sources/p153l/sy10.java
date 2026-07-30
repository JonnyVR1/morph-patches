package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.camera.MusicItemView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class sy10 {
    /* JADX INFO: renamed from: a */
    public static void m188532a(MusicItemView musicItemView, View view) {
        musicItemView.f40215a = (MusicItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        musicItemView.f40216b = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        musicItemView.f40217c = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        musicItemView.f40218d = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        musicItemView.f40219e = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        musicItemView.f40220f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        musicItemView.f40221g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        musicItemView.f40222h = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        musicItemView.f40223i = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        musicItemView.f40224j = (TextView) viewGroup.getChildAt(1);
    }
}
