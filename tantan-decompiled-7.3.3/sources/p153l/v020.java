package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.feed.newui.camera.MusicRangeEditView;
import com.p051p1.mobile.putong.feed.newui.camera.widget.MusicRangeSeekView;

/* JADX INFO: loaded from: classes13.dex */
public class v020 {
    /* JADX INFO: renamed from: a */
    public static void m198879a(MusicRangeEditView musicRangeEditView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        musicRangeEditView.f40242a = viewGroup.getChildAt(0);
        musicRangeEditView.f40243b = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        musicRangeEditView.f40244c = (MusicRangeSeekView) viewGroup.getChildAt(2);
    }
}
