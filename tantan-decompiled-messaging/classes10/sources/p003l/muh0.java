package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.core.ui.settings.filter.TagZodiacsItem;
import l.n6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class muh0 {
    /* JADX INFO: renamed from: a */
    public static void m8266a(TagZodiacsItem tagZodiacsItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        tagZodiacsItem.a = (ImageView) viewGroup.getChildAt(0);
        tagZodiacsItem.b = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8267b(TagZodiacsItem tagZodiacsItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.c1, viewGroup, true);
        m8266a(tagZodiacsItem, viewInflate);
        return viewInflate;
    }
}
