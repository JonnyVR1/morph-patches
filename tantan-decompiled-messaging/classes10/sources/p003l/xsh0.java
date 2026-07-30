package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.core.ui.settings.filter.TagBloodItem;
import l.n6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xsh0 {
    /* JADX INFO: renamed from: a */
    public static void m10952a(TagBloodItem tagBloodItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        tagBloodItem.a = (ImageView) viewGroup.getChildAt(0);
        tagBloodItem.b = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10953b(TagBloodItem tagBloodItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.a1, viewGroup, true);
        m10952a(tagBloodItem, viewInflate);
        return viewInflate;
    }
}
