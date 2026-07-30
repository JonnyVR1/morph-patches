package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fzn {
    /* JADX INFO: renamed from: a */
    public static void m13515a(ezn eznVar, View view) {
        eznVar._root = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        eznVar._head_container = viewGroup.getChildAt(1);
        eznVar._avatar = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        eznVar._svga_player = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        eznVar._ll_text = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        eznVar._title = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        eznVar._content = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        eznVar._space_view = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        eznVar._close = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m13516b(ezn eznVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f20056w2, viewGroup, false);
        m13515a(eznVar, viewInflate);
        return viewInflate;
    }
}
