package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.mytab.biz4.container.NewMyTabBiz4TabItem;
import p151v.RedPointView;

/* JADX INFO: loaded from: classes10.dex */
public class rs30 {
    /* JADX INFO: renamed from: a */
    public static void m182851a(NewMyTabBiz4TabItem newMyTabBiz4TabItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newMyTabBiz4TabItem._icon = (ImageView) viewGroup.getChildAt(0);
        newMyTabBiz4TabItem._badge = (RedPointView) viewGroup.getChildAt(1);
        newMyTabBiz4TabItem._num = (TextView) viewGroup.getChildAt(2);
        newMyTabBiz4TabItem._name = (TextView) viewGroup.getChildAt(3);
        newMyTabBiz4TabItem._indicator = viewGroup.getChildAt(4);
    }
}
