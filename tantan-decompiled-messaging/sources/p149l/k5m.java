package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.newui.camera.IVMusicRangeEditView;
import com.p046p1.mobile.putong.feed.newui.camera.widget.IVMusicRangeSeekView;

/* JADX INFO: loaded from: classes12.dex */
public class k5m {
    /* JADX INFO: renamed from: a */
    public static void m144542a(IVMusicRangeEditView iVMusicRangeEditView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        iVMusicRangeEditView.f39257a = viewGroup.getChildAt(0);
        iVMusicRangeEditView.f39258b = (ConstraintLayout) viewGroup.getChildAt(1);
        iVMusicRangeEditView.f39259c = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        iVMusicRangeEditView.f39260d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        iVMusicRangeEditView.f39261e = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        iVMusicRangeEditView.f39262f = (IVMusicRangeSeekView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        iVMusicRangeEditView.f39263g = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        iVMusicRangeEditView.f39264h = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }
}
