package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.likers.MeetLikersUserItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class s4y {
    /* JADX INFO: renamed from: a */
    public static void m182317a(MeetLikersUserItemView meetLikersUserItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetLikersUserItemView.f26214a = (VDraweeView) viewGroup.getChildAt(0);
        meetLikersUserItemView.f26215b = (VImage) viewGroup.getChildAt(1);
        meetLikersUserItemView.f26216c = (VText) viewGroup.getChildAt(2);
        meetLikersUserItemView.f26217d = (VRelative) viewGroup.getChildAt(3);
        meetLikersUserItemView.f26218e = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        meetLikersUserItemView.f26219f = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        meetLikersUserItemView.f26220g = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        meetLikersUserItemView.f26221h = viewGroup.getChildAt(4);
        meetLikersUserItemView.f26222i = (VImage) viewGroup.getChildAt(5);
        meetLikersUserItemView.f26223j = (VImage) viewGroup.getChildAt(6);
    }
}
