package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetLikedItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ceo {
    /* JADX INFO: renamed from: a */
    public static void m5935a(IntlMeetLikedItemView intlMeetLikedItemView, View view) {
        intlMeetLikedItemView.a = (IntlMeetLikedItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intlMeetLikedItemView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlMeetLikedItemView.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        intlMeetLikedItemView.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        intlMeetLikedItemView.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        intlMeetLikedItemView.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        intlMeetLikedItemView.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        intlMeetLikedItemView.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        intlMeetLikedItemView.i = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        intlMeetLikedItemView.j = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        intlMeetLikedItemView.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        intlMeetLikedItemView.l = view.findViewById(x4c0.f8343m);
        ViewGroup viewGroup2 = (ViewGroup) view;
        intlMeetLikedItemView.p = viewGroup2.getChildAt(1);
        intlMeetLikedItemView.m = viewGroup2.getChildAt(2);
        intlMeetLikedItemView.n = ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(0);
        intlMeetLikedItemView.o = ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(1);
    }
}
