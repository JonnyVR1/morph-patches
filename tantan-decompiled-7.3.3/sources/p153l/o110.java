package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsSimpleTextAct;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class o110 {
    /* JADX INFO: renamed from: a */
    public static void m165576a(MomentsSimpleTextAct momentsSimpleTextAct, View view) {
        momentsSimpleTextAct.f44816c = (VFrame) view;
        momentsSimpleTextAct.f44817d = (VText) ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m165577b(MomentsSimpleTextAct momentsSimpleTextAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173584T4, viewGroup, false);
        m165576a(momentsSimpleTextAct, viewInflate);
        return viewInflate;
    }
}
