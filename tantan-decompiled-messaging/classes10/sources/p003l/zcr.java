package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.home.member.likeme.adapter.item.LikeMeUserNoDataItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class zcr {
    /* JADX INFO: renamed from: a */
    public static void m11387a(LikeMeUserNoDataItem likeMeUserNoDataItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likeMeUserNoDataItem._no_data_icon = (ImageView) viewGroup.getChildAt(0);
        likeMeUserNoDataItem._no_more_text = (TextView) viewGroup.getChildAt(1);
    }
}
