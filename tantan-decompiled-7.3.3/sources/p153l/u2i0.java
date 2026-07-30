package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.TagZodiacsItem;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class u2i0 {
    /* JADX INFO: renamed from: a */
    public static void m194273a(TagZodiacsItem tagZodiacsItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        tagZodiacsItem.f36914a = (ImageView) viewGroup.getChildAt(0);
        tagZodiacsItem.f36915b = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m194274b(TagZodiacsItem tagZodiacsItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167559c1, viewGroup, true);
        m194273a(tagZodiacsItem, viewInflate);
        return viewInflate;
    }
}
