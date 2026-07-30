package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.newui.camera.IVMusicRangeEditView;
import com.p051p1.mobile.putong.feed.newui.camera.widget.IVMusicRangeSeekView;

/* JADX INFO: loaded from: classes13.dex */
public class a8m {
    /* JADX INFO: renamed from: a */
    public static void m96480a(IVMusicRangeEditView iVMusicRangeEditView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        iVMusicRangeEditView.f40105a = viewGroup.getChildAt(0);
        iVMusicRangeEditView.f40106b = (ConstraintLayout) viewGroup.getChildAt(1);
        iVMusicRangeEditView.f40107c = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        iVMusicRangeEditView.f40108d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        iVMusicRangeEditView.f40109e = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        iVMusicRangeEditView.f40110f = (IVMusicRangeSeekView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        iVMusicRangeEditView.f40111g = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        iVMusicRangeEditView.f40112h = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }
}
