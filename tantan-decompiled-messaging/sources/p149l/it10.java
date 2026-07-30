package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.camera.MusicVolumeEditView;

/* JADX INFO: loaded from: classes12.dex */
public class it10 {
    /* JADX INFO: renamed from: a */
    public static void m138097a(MusicVolumeEditView musicVolumeEditView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        musicVolumeEditView.f39405a = viewGroup.getChildAt(0);
        musicVolumeEditView.f39406b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        musicVolumeEditView.f39407c = (SeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        musicVolumeEditView.f39408d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        musicVolumeEditView.f39409e = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        musicVolumeEditView.f39410f = (SeekBar) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        musicVolumeEditView.f39411g = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }
}
