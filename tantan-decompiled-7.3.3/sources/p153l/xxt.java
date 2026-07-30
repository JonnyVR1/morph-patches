package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.other.side.entry.LiveSiderEntryView;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class xxt {
    /* JADX INFO: renamed from: a */
    public static void m213557a(LiveSiderEntryView liveSiderEntryView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSiderEntryView.f52119a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveSiderEntryView.f52120b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveSiderEntryView.f52121c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        liveSiderEntryView.f52122d = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveSiderEntryView.f52123e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
