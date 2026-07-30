package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.UnScrollVPager;

/* JADX INFO: loaded from: classes4.dex */
public class v1o0 {
    /* JADX INFO: renamed from: a */
    public static void m199046a(u1o0 u1o0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        u1o0Var._empty = viewGroup.getChildAt(0);
        u1o0Var._managerDialogTitle = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        u1o0Var._voiceManagerExplain = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        u1o0Var._line = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        u1o0Var._tab_layout = (TabLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        u1o0Var._viewpager = (UnScrollVPager) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m199047b(u1o0 u1o0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199286v9, viewGroup, false);
        m199046a(u1o0Var, viewInflate);
        return viewInflate;
    }
}
