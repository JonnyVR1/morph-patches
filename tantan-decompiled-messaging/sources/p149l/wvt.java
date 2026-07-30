package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.other.side.entry.LiveSiderEntryView;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class wvt {
    /* JADX INFO: renamed from: a */
    public static void m205759a(LiveSiderEntryView liveSiderEntryView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSiderEntryView.f51271a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveSiderEntryView.f51272b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveSiderEntryView.f51273c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        liveSiderEntryView.f51274d = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveSiderEntryView.f51275e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
