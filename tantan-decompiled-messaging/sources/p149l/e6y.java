package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.likers.MeetPromotionItemView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class e6y {
    /* JADX INFO: renamed from: a */
    public static void m115120a(MeetPromotionItemView meetPromotionItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetPromotionItemView.f26225a = (RelativeLayout) viewGroup.getChildAt(0);
        meetPromotionItemView.f26226b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        meetPromotionItemView.f26227c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        meetPromotionItemView.f26228d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m115121b(MeetPromotionItemView meetPromotionItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121289D0, viewGroup, true);
        m115120a(meetPromotionItemView, viewInflate);
        return viewInflate;
    }
}
