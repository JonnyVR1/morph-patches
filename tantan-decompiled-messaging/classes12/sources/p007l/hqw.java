package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class hqw {
    /* JADX INFO: renamed from: a */
    public static void m10683a(MakeUpMenuView makeUpMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        makeUpMenuView.f1197a = viewGroup.getChildAt(0);
        makeUpMenuView.f1198b = viewGroup.getChildAt(1);
        makeUpMenuView.f1199c = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        makeUpMenuView.f1200d = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        makeUpMenuView.f1201e = viewGroup.getChildAt(3);
    }
}
