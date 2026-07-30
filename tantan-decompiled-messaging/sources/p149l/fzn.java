package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VMarqueeText;

/* JADX INFO: loaded from: classes4.dex */
public class fzn {
    /* JADX INFO: renamed from: a */
    public static void m123885a(ezn eznVar, View view) {
        eznVar._root = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        eznVar._head_container = (VFrame) viewGroup.getChildAt(1);
        eznVar._avatar = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        eznVar._svga_player = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        eznVar._ll_text = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        eznVar._title = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        eznVar._content = (VMarqueeText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        eznVar._space_view = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        eznVar._close = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m123886b(ezn eznVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168560w2, viewGroup, false);
        m123885a(eznVar, viewInflate);
        return viewInflate;
    }
}
