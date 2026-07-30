package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.camera.IVMusicVolumeEditView;

/* JADX INFO: loaded from: classes13.dex */
public class e8m {
    /* JADX INFO: renamed from: a */
    public static void m119829a(IVMusicVolumeEditView iVMusicVolumeEditView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        iVMusicVolumeEditView.f40121a = viewGroup.getChildAt(0);
        iVMusicVolumeEditView.f40122b = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        iVMusicVolumeEditView.f40123c = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        iVMusicVolumeEditView.f40124d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        iVMusicVolumeEditView.f40125e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        iVMusicVolumeEditView.f40126f = (SeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }
}
