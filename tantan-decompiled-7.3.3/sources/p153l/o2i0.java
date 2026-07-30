package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.TagNorItem;

/* JADX INFO: loaded from: classes10.dex */
public class o2i0 {
    /* JADX INFO: renamed from: a */
    public static void m165723a(TagNorItem tagNorItem, View view) {
        tagNorItem.f36912a = (TextView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m165724b(TagNorItem tagNorItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167556b1, viewGroup, true);
        m165723a(tagNorItem, viewInflate);
        return viewInflate;
    }
}
