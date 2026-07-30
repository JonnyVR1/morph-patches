package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveSuggestPopItemView;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes13.dex */
public class kau {
    /* JADX INFO: renamed from: a */
    public static void m145181a(LiveSuggestPopItemView liveSuggestPopItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSuggestPopItemView._image = (VDraweeView) viewGroup.getChildAt(0);
        liveSuggestPopItemView._check = (VImage) viewGroup.getChildAt(1);
        liveSuggestPopItemView._name = (TextView) viewGroup.getChildAt(2);
        liveSuggestPopItemView._number = (TextView) viewGroup.getChildAt(3);
    }
}
