package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.camera.MusicVolumeEditView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class it10 {
    /* JADX INFO: renamed from: a */
    public static void m11035a(MusicVolumeEditView musicVolumeEditView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        musicVolumeEditView.f866a = viewGroup.getChildAt(0);
        musicVolumeEditView.f867b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        musicVolumeEditView.f868c = (SeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        musicVolumeEditView.f869d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        musicVolumeEditView.f870e = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        musicVolumeEditView.f871f = (SeekBar) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        musicVolumeEditView.f872g = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }
}
