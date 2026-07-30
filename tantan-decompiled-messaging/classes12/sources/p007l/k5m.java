package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.camera.IVMusicRangeEditView;
import com.p000p1.mobile.putong.feed.newui.camera.widget.IVMusicRangeSeekView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class k5m {
    /* JADX INFO: renamed from: a */
    public static void m11391a(IVMusicRangeEditView iVMusicRangeEditView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        iVMusicRangeEditView.f718a = viewGroup.getChildAt(0);
        iVMusicRangeEditView.f719b = viewGroup.getChildAt(1);
        iVMusicRangeEditView.f720c = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        iVMusicRangeEditView.f721d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        iVMusicRangeEditView.f722e = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        iVMusicRangeEditView.f723f = (IVMusicRangeSeekView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        iVMusicRangeEditView.f724g = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        iVMusicRangeEditView.f725h = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }
}
