package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.likers.MeetLikersUserItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class pdy {
    /* JADX INFO: renamed from: a */
    public static void m171912a(MeetLikersUserItemView meetLikersUserItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetLikersUserItemView.f26956a = (VDraweeView) viewGroup.getChildAt(0);
        meetLikersUserItemView.f26957b = (VImage) viewGroup.getChildAt(1);
        meetLikersUserItemView.f26958c = (VText) viewGroup.getChildAt(2);
        meetLikersUserItemView.f26959d = (VRelative) viewGroup.getChildAt(3);
        meetLikersUserItemView.f26960e = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        meetLikersUserItemView.f26961f = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        meetLikersUserItemView.f26962g = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        meetLikersUserItemView.f26963h = viewGroup.getChildAt(4);
        meetLikersUserItemView.f26964i = (VImage) viewGroup.getChildAt(5);
        meetLikersUserItemView.f26965j = (VImage) viewGroup.getChildAt(6);
    }
}
