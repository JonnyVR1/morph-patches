package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsSimpleTextAct;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class ft00 {
    /* JADX INFO: renamed from: a */
    public static void m122985a(MomentsSimpleTextAct momentsSimpleTextAct, View view) {
        momentsSimpleTextAct.f43968c = (VFrame) view;
        momentsSimpleTextAct.f43969d = (VText) ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m122986b(MomentsSimpleTextAct momentsSimpleTextAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142115T4, viewGroup, false);
        m122985a(momentsSimpleTextAct, viewInflate);
        return viewInflate;
    }
}
