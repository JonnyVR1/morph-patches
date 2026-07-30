package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.newui.newmeet.feed.likers.MeetPromotionItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class e6y {
    /* JADX INFO: renamed from: a */
    public static void m6246a(MeetPromotionItemView meetPromotionItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetPromotionItemView.a = (RelativeLayout) viewGroup.getChildAt(0);
        meetPromotionItemView.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        meetPromotionItemView.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        meetPromotionItemView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m6247b(MeetPromotionItemView meetPromotionItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5452D0, viewGroup, true);
        m6246a(meetPromotionItemView, viewInflate);
        return viewInflate;
    }
}
