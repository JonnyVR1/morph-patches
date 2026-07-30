package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.feed.newui.camera.MusicRangeEditView;
import com.p046p1.mobile.putong.feed.newui.camera.widget.MusicRangeSeekView;

/* JADX INFO: loaded from: classes12.dex */
public class ns10 {
    /* JADX INFO: renamed from: a */
    public static void m160756a(MusicRangeEditView musicRangeEditView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        musicRangeEditView.f39394a = viewGroup.getChildAt(0);
        musicRangeEditView.f39395b = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        musicRangeEditView.f39396c = (MusicRangeSeekView) viewGroup.getChildAt(2);
    }
}
