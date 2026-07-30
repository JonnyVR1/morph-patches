package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.customized.result.PrivateCustomResultUserHeaderView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hs80 {
    /* JADX INFO: renamed from: a */
    public static void m7070a(PrivateCustomResultUserHeaderView privateCustomResultUserHeaderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privateCustomResultUserHeaderView.a = (RelativeLayout) viewGroup.getChildAt(0);
        privateCustomResultUserHeaderView.b = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privateCustomResultUserHeaderView.c = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        privateCustomResultUserHeaderView.d = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        privateCustomResultUserHeaderView.e = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privateCustomResultUserHeaderView.f = viewGroup.getChildAt(1);
        privateCustomResultUserHeaderView.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
