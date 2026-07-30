package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.view.CoreEmptyView;

/* JADX INFO: loaded from: classes10.dex */
public class uo8 {
    /* JADX INFO: renamed from: a */
    public static void m194543a(CoreEmptyView coreEmptyView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        coreEmptyView.f26887a = (ImageView) viewGroup.getChildAt(0);
        coreEmptyView.f26888b = (TextView) viewGroup.getChildAt(1);
        coreEmptyView.f26889c = (LinearLayout) viewGroup.getChildAt(2);
        coreEmptyView.f26890d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        coreEmptyView.f26891e = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        coreEmptyView.f26892f = (TextView) viewGroup.getChildAt(3);
    }
}
