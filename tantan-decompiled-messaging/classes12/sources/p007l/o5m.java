package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.camera.IVMusicVolumeEditView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class o5m {
    /* JADX INFO: renamed from: a */
    public static void m12445a(IVMusicVolumeEditView iVMusicVolumeEditView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        iVMusicVolumeEditView.f734a = viewGroup.getChildAt(0);
        iVMusicVolumeEditView.f735b = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        iVMusicVolumeEditView.f736c = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        iVMusicVolumeEditView.f737d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        iVMusicVolumeEditView.f738e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        iVMusicVolumeEditView.f739f = (SeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }
}
