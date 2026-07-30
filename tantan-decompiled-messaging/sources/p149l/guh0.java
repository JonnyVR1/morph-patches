package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.TagNorItem;

/* JADX INFO: loaded from: classes10.dex */
public class guh0 {
    /* JADX INFO: renamed from: a */
    public static void m128032a(TagNorItem tagNorItem, View view) {
        tagNorItem.f36064a = (TextView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m128033b(TagNorItem tagNorItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137342b1, viewGroup, true);
        m128032a(tagNorItem, viewInflate);
        return viewInflate;
    }
}
