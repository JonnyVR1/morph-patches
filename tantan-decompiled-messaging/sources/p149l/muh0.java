package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.TagZodiacsItem;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class muh0 {
    /* JADX INFO: renamed from: a */
    public static void m156404a(TagZodiacsItem tagZodiacsItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        tagZodiacsItem.f36066a = (ImageView) viewGroup.getChildAt(0);
        tagZodiacsItem.f36067b = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m156405b(TagZodiacsItem tagZodiacsItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137345c1, viewGroup, true);
        m156404a(tagZodiacsItem, viewInflate);
        return viewInflate;
    }
}
