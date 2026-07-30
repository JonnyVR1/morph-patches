package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hlj0 {
    /* JADX INFO: renamed from: a */
    public static void m135757a(glj0 glj0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        glj0Var._iv_ttc_avatar = (SimpleDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        glj0Var._tv_ttc_name = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        glj0Var._tv_ttc_id = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        glj0Var._tv_ttc_match_num = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(1);
        glj0Var._tv_ttc_like_num = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1)).getChildAt(1);
        glj0Var._iv_ttt_avatar = (SimpleDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        glj0Var._tv_ttt_name = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        glj0Var._tv_ttt_id = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(2);
        glj0Var._continue_btn = (VText) viewGroup.getChildAt(1);
        glj0Var._tv_contact = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m135758b(glj0 glj0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126006pf, viewGroup, false);
        m135757a(glj0Var, viewInflate);
        return viewInflate;
    }
}
