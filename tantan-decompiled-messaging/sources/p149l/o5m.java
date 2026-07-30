package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.camera.IVMusicVolumeEditView;

/* JADX INFO: loaded from: classes12.dex */
public class o5m {
    /* JADX INFO: renamed from: a */
    public static void m162797a(IVMusicVolumeEditView iVMusicVolumeEditView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        iVMusicVolumeEditView.f39273a = viewGroup.getChildAt(0);
        iVMusicVolumeEditView.f39274b = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        iVMusicVolumeEditView.f39275c = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        iVMusicVolumeEditView.f39276d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        iVMusicVolumeEditView.f39277e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        iVMusicVolumeEditView.f39278f = (SeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }
}
