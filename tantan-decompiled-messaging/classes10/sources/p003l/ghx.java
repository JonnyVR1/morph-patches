package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.lovebuzz.widget.MediaBuzzCallControlView;
import l.h6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ghx {
    /* JADX INFO: renamed from: a */
    public static void m6644a(MediaBuzzCallControlView mediaBuzzCallControlView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mediaBuzzCallControlView.d = viewGroup.getChildAt(0);
        mediaBuzzCallControlView.e = viewGroup.getChildAt(1);
        mediaBuzzCallControlView.f = viewGroup.getChildAt(2);
        mediaBuzzCallControlView.g = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m6645b(MediaBuzzCallControlView mediaBuzzCallControlView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.i, viewGroup, true);
        m6644a(mediaBuzzCallControlView, viewInflate);
        return viewInflate;
    }
}
