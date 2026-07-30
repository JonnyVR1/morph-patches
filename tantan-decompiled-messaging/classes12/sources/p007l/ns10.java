package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p000p1.mobile.putong.feed.newui.camera.MusicRangeEditView;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MusicRangeSeekView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ns10 {
    /* JADX INFO: renamed from: a */
    public static void m12303a(MusicRangeEditView musicRangeEditView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        musicRangeEditView.f855a = viewGroup.getChildAt(0);
        musicRangeEditView.f856b = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        musicRangeEditView.f857c = (MusicRangeSeekView) viewGroup.getChildAt(2);
    }
}
