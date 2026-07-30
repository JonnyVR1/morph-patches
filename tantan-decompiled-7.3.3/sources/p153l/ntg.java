package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterImageView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.live.LiveTagView;
import com.p051p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ntg {
    /* JADX INFO: renamed from: a */
    public static void m164728a(mtg mtgVar, View view) {
        mtgVar.f138607a = (FeedCenterImageView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mtgVar.f138608b = viewGroup.getChildAt(0);
        mtgVar.f138609c = (VLinear) viewGroup.getChildAt(1);
        mtgVar.f138610d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        mtgVar.f138611e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        mtgVar.f138612f = (VLinear) viewGroup.getChildAt(2);
        mtgVar.f138613g = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        mtgVar.f138614h = (LiveTagView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        mtgVar.f138615i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        mtgVar.f138616j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
        mtgVar.f138617k = (VExpandableTextContainer) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        mtgVar.f138618l = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        mtgVar.f138619m = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        mtgVar.f138620n = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        mtgVar.f138621o = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(9);
        mtgVar.f138622p = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(10);
        mtgVar.f138623q = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(10)).getChildAt(1);
        mtgVar.f138624r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(10)).getChildAt(1)).getChildAt(0);
        mtgVar.f138625s = (AnimEffectPlayer) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(10)).getChildAt(1)).getChildAt(1);
        mtgVar.f138626t = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(11);
        mtgVar.f138627u = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        mtgVar.f138628v = viewGroup.getChildAt(3);
    }
}
