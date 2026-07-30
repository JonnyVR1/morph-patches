package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.TagBloodItem;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class f1i0 {
    /* JADX INFO: renamed from: a */
    public static void m123575a(TagBloodItem tagBloodItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        tagBloodItem.f36908a = (ImageView) viewGroup.getChildAt(0);
        tagBloodItem.f36909b = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m123576b(TagBloodItem tagBloodItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167553a1, viewGroup, true);
        m123575a(tagBloodItem, viewInflate);
        return viewInflate;
    }
}
