package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.view.CoreImEmptyView;

/* JADX INFO: loaded from: classes10.dex */
public class w19 {
    /* JADX INFO: renamed from: a */
    public static void m200919a(CoreImEmptyView coreImEmptyView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        coreImEmptyView.f36726a = (ImageView) viewGroup.getChildAt(0);
        coreImEmptyView.f36727b = (TextView) viewGroup.getChildAt(1);
        coreImEmptyView.f36728c = (LinearLayout) viewGroup.getChildAt(2);
        coreImEmptyView.f36729d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        coreImEmptyView.f36730e = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        coreImEmptyView.f36731f = (TextView) viewGroup.getChildAt(3);
    }
}
