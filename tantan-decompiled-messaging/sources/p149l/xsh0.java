package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.TagBloodItem;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class xsh0 {
    /* JADX INFO: renamed from: a */
    public static void m210758a(TagBloodItem tagBloodItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        tagBloodItem.f36060a = (ImageView) viewGroup.getChildAt(0);
        tagBloodItem.f36061b = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m210759b(TagBloodItem tagBloodItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137339a1, viewGroup, true);
        m210758a(tagBloodItem, viewInflate);
        return viewInflate;
    }
}
