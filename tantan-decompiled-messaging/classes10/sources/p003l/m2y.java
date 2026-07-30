package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.newmeet.feed.likers.MeetItemLikerHeadView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class m2y {
    /* JADX INFO: renamed from: a */
    public static void m7949a(MeetItemLikerHeadView meetItemLikerHeadView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetItemLikerHeadView.a = viewGroup.getChildAt(0);
        meetItemLikerHeadView.b = viewGroup.getChildAt(1);
        meetItemLikerHeadView.c = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m7950b(MeetItemLikerHeadView meetItemLikerHeadView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5611y0, viewGroup, true);
        m7949a(meetItemLikerHeadView, viewInflate);
        return viewInflate;
    }
}
