package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.settings.filter.TagNorItem;
import l.n6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class guh0 {
    /* JADX INFO: renamed from: a */
    public static void m6811a(TagNorItem tagNorItem, View view) {
        tagNorItem.a = (TextView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m6812b(TagNorItem tagNorItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.b1, viewGroup, true);
        m6811a(tagNorItem, viewInflate);
        return viewInflate;
    }
}
