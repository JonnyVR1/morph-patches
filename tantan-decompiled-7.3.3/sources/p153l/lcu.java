package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveSuggestPopItemView;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes9.dex */
public class lcu {
    /* JADX INFO: renamed from: a */
    public static void m153692a(LiveSuggestPopItemView liveSuggestPopItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSuggestPopItemView._image = (VDraweeView) viewGroup.getChildAt(0);
        liveSuggestPopItemView._check = (VImage) viewGroup.getChildAt(1);
        liveSuggestPopItemView._name = (TextView) viewGroup.getChildAt(2);
        liveSuggestPopItemView._number = (TextView) viewGroup.getChildAt(3);
    }
}
