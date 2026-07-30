package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.external.internal.live.square.activities.LiveSuggestPopAct;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class jcu {
    /* JADX INFO: renamed from: a */
    public static void m144376a(LiveSuggestPopAct liveSuggestPopAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSuggestPopAct._close = (VImage) viewGroup.getChildAt(0);
        liveSuggestPopAct._welcome = (VText) viewGroup.getChildAt(1);
        liveSuggestPopAct._content = (TextView) viewGroup.getChildAt(2);
        liveSuggestPopAct._recycle = (VRecyclerView) viewGroup.getChildAt(3);
        liveSuggestPopAct._follow = (VText) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m144377b(LiveSuggestPopAct liveSuggestPopAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193843a1, viewGroup, false);
        m144376a(liveSuggestPopAct, viewInflate);
        return viewInflate;
    }
}
