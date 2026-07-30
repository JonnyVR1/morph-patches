package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.home.member.likeme.adapter.item.LikeMeUserNoDataItem;

/* JADX INFO: loaded from: classes10.dex */
public class afr {
    /* JADX INFO: renamed from: a */
    public static void m97548a(LikeMeUserNoDataItem likeMeUserNoDataItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likeMeUserNoDataItem._no_data_icon = (ImageView) viewGroup.getChildAt(0);
        likeMeUserNoDataItem._no_more_text = (TextView) viewGroup.getChildAt(1);
    }
}
