package p153l;

import android.view.View;
import android.view.ViewGroup;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hoo {
    /* JADX INFO: renamed from: a */
    public static void m136450a(goo gooVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gooVar.f105318a = (AutoVDraweeView) viewGroup.getChildAt(0);
        gooVar.f105319b = (VImage) viewGroup.getChildAt(1);
        gooVar.f105320c = (VRelative) viewGroup.getChildAt(2);
        gooVar.f105321d = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        gooVar.f105322e = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        gooVar.f105323f = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        gooVar.f105324g = (VImage) viewGroup.getChildAt(3);
        gooVar.f105325h = (VText) viewGroup.getChildAt(4);
        gooVar.f105326i = (VText) viewGroup.getChildAt(5);
        gooVar.f105327j = (VText) viewGroup.getChildAt(6);
    }
}
