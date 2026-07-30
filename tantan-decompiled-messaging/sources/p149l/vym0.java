package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.chatgroup.VoiceChatGroupInfoView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class vym0 {
    /* JADX INFO: renamed from: a */
    public static void m200662a(uym0 uym0Var, View view) {
        uym0Var._root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        uym0Var._container = (ConstraintLayout) viewGroup.getChildAt(0);
        uym0Var._title = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        uym0Var._remind_view = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        uym0Var._remind_group_info = (VoiceChatGroupInfoView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        uym0Var._remind_btn = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        uym0Var._apply_container = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        uym0Var._group_profile = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        uym0Var._apply_group_info = (VoiceChatGroupInfoView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        uym0Var._apply_btn = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        uym0Var._arrow = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m200663b(uym0 uym0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168423l8, viewGroup, false);
        m200662a(uym0Var, viewInflate);
        return viewInflate;
    }
}
