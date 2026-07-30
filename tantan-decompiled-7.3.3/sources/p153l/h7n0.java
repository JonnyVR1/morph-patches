package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.chatgroup.VoiceChatGroupInfoView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class h7n0 {
    /* JADX INFO: renamed from: a */
    public static void m133805a(g7n0 g7n0Var, View view) {
        g7n0Var._root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        g7n0Var._container = (ConstraintLayout) viewGroup.getChildAt(0);
        g7n0Var._header = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        g7n0Var._title = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        g7n0Var._chat_info_container = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        g7n0Var._group_profile = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        g7n0Var._group_info = (VoiceChatGroupInfoView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        g7n0Var._right_arrow = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        g7n0Var._body = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        g7n0Var._apply_name = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        g7n0Var._split = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        g7n0Var._indicator = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        g7n0Var._apply_list_empty = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3);
        g7n0Var._apply_list = (RecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m133806b(g7n0 g7n0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199116i8, viewGroup, false);
        m133805a(g7n0Var, viewInflate);
        return viewInflate;
    }
}
