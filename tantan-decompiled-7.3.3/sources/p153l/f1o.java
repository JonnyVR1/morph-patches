package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VMarqueeText;

/* JADX INFO: loaded from: classes4.dex */
public class f1o {
    /* JADX INFO: renamed from: a */
    public static void m123581a(e1o e1oVar, View view) {
        e1oVar._root = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        e1oVar._head_container = (VFrame) viewGroup.getChildAt(1);
        e1oVar._avatar = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        e1oVar._svga_player = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        e1oVar._ll_text = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        e1oVar._title = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        e1oVar._content = (VMarqueeText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        e1oVar._space_view = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        e1oVar._close = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m123582b(e1o e1oVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199292w2, viewGroup, false);
        m123581a(e1oVar, viewInflate);
        return viewInflate;
    }
}
