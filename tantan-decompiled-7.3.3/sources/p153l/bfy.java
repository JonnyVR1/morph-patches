package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.likers.MeetPromotionItemView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class bfy {
    /* JADX INFO: renamed from: a */
    public static void m104086a(MeetPromotionItemView meetPromotionItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetPromotionItemView.f26967a = (RelativeLayout) viewGroup.getChildAt(0);
        meetPromotionItemView.f26968b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        meetPromotionItemView.f26969c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        meetPromotionItemView.f26970d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m104087b(MeetPromotionItemView meetPromotionItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151897D0, viewGroup, true);
        m104086a(meetPromotionItemView, viewInflate);
        return viewInflate;
    }
}
