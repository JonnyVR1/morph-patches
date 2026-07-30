package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.home.member.likeme.adapter.item.LikeMeUserNoDataItem;

/* JADX INFO: loaded from: classes10.dex */
public class zcr {
    /* JADX INFO: renamed from: a */
    public static void m218084a(LikeMeUserNoDataItem likeMeUserNoDataItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likeMeUserNoDataItem._no_data_icon = (ImageView) viewGroup.getChildAt(0);
        likeMeUserNoDataItem._no_more_text = (TextView) viewGroup.getChildAt(1);
    }
}
