package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsSimpleTextAct;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ft00 {
    /* JADX INFO: renamed from: a */
    public static void m10320a(MomentsSimpleTextAct momentsSimpleTextAct, View view) {
        momentsSimpleTextAct.f5429c = (VFrame) view;
        momentsSimpleTextAct.f5430d = ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m10321b(MomentsSimpleTextAct momentsSimpleTextAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11134T4, viewGroup, false);
        m10320a(momentsSimpleTextAct, viewInflate);
        return viewInflate;
    }
}
