package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.chatgroup.VoiceChatGroupInfoView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class dym0 {
    /* JADX INFO: renamed from: a */
    public static void m114081a(cym0 cym0Var, View view) {
        cym0Var._root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cym0Var._container = (ConstraintLayout) viewGroup.getChildAt(0);
        cym0Var._header = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cym0Var._title = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        cym0Var._chat_info_container = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        cym0Var._group_profile = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        cym0Var._group_info = (VoiceChatGroupInfoView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        cym0Var._right_arrow = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        cym0Var._body = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cym0Var._apply_name = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        cym0Var._split = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        cym0Var._indicator = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        cym0Var._apply_list_empty = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3);
        cym0Var._apply_list = (RecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m114082b(cym0 cym0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168384i8, viewGroup, false);
        m114081a(cym0Var, viewInflate);
        return viewInflate;
    }
}
