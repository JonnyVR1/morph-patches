package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.external.internal.live.square.activities.LiveSuggestPopAct;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class iau {
    /* JADX INFO: renamed from: a */
    public static void m135199a(LiveSuggestPopAct liveSuggestPopAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSuggestPopAct._close = (VImage) viewGroup.getChildAt(0);
        liveSuggestPopAct._welcome = (VText) viewGroup.getChildAt(1);
        liveSuggestPopAct._content = (TextView) viewGroup.getChildAt(2);
        liveSuggestPopAct._recycle = (VRecyclerView) viewGroup.getChildAt(3);
        liveSuggestPopAct._follow = (VText) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m135200b(LiveSuggestPopAct liveSuggestPopAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162729a1, viewGroup, false);
        m135199a(liveSuggestPopAct, viewInflate);
        return viewInflate;
    }
}
