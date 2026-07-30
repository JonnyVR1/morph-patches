package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.chatgroup.VoiceChatGroupInfoView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class z7n0 {
    /* JADX INFO: renamed from: a */
    public static void m218903a(y7n0 y7n0Var, View view) {
        y7n0Var._root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        y7n0Var._container = (ConstraintLayout) viewGroup.getChildAt(0);
        y7n0Var._title = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        y7n0Var._remind_view = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        y7n0Var._remind_group_info = (VoiceChatGroupInfoView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        y7n0Var._remind_btn = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        y7n0Var._apply_container = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        y7n0Var._group_profile = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        y7n0Var._apply_group_info = (VoiceChatGroupInfoView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        y7n0Var._apply_btn = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        y7n0Var._arrow = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m218904b(y7n0 y7n0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199155l8, viewGroup, false);
        m218903a(y7n0Var, viewInflate);
        return viewInflate;
    }
}
