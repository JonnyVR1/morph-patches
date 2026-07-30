package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallResultView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class s44 {
    /* JADX INFO: renamed from: a */
    public static void m22192a(CallResultView callResultView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        callResultView.a = (ImageView) viewGroup.getChildAt(0);
        callResultView.b = (TextView) viewGroup.getChildAt(1);
        callResultView.c = (TextView) viewGroup.getChildAt(2);
    }
}
