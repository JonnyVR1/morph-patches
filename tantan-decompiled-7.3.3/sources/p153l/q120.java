package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.camera.MusicVolumeEditView;

/* JADX INFO: loaded from: classes13.dex */
public class q120 {
    /* JADX INFO: renamed from: a */
    public static void m174811a(MusicVolumeEditView musicVolumeEditView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        musicVolumeEditView.f40253a = viewGroup.getChildAt(0);
        musicVolumeEditView.f40254b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        musicVolumeEditView.f40255c = (SeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        musicVolumeEditView.f40256d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        musicVolumeEditView.f40257e = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        musicVolumeEditView.f40258f = (SeekBar) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        musicVolumeEditView.f40259g = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }
}
