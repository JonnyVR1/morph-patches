package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.other.side.entry.LiveSiderEntryView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wvt {
    /* JADX INFO: renamed from: a */
    public static void m25518a(LiveSiderEntryView liveSiderEntryView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSiderEntryView.f7313a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveSiderEntryView.f7314b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveSiderEntryView.f7315c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        liveSiderEntryView.f7316d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveSiderEntryView.f7317e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
