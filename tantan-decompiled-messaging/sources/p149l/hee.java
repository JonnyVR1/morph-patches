package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.view.DropDownBgView;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.view.DropDownRadarView;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.view.TouchPullViewLayout;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hee {
    /* JADX INFO: renamed from: a */
    public static void m130628a(gee geeVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        geeVar._content_layout = (TouchPullViewLayout) viewGroup.getChildAt(0);
        geeVar._dropdown_bg = (DropDownBgView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        geeVar._header_img = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        geeVar._ll_scene_entry = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        geeVar._tv_scene_con = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        geeVar._img_scene_con = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        geeVar._loading_view = (DropDownRadarView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        geeVar._loading_img = (DropDownRadarView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        geeVar._loading_tips = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        geeVar._ll_top_hey = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6)).getChildAt(0);
        geeVar._ll_top_hey_tv = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6)).getChildAt(0)).getChildAt(1);
        geeVar._tv_hey_loading = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6)).getChildAt(1);
        geeVar._close = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        geeVar._ll_btns = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        geeVar._ll_btns_online = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8)).getChildAt(0);
        geeVar._tv_online = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8)).getChildAt(0)).getChildAt(1);
        geeVar._tv_online_tips = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8)).getChildAt(0)).getChildAt(2);
        geeVar._ll_btns_audio = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8)).getChildAt(1);
        geeVar._tv_quick = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8)).getChildAt(1)).getChildAt(1);
        geeVar._tv_quick_tips = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8)).getChildAt(1)).getChildAt(2);
        geeVar._ll_btns_heartbeat = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8)).getChildAt(2);
        geeVar._tv_heartbeat = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8)).getChildAt(2)).getChildAt(1);
        geeVar._tv_heartbeat_tips = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8)).getChildAt(2)).getChildAt(2);
        geeVar._ll_to_top = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9);
        geeVar._tv_to_top = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9)).getChildAt(1);
        geeVar._ll_scene = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10);
        geeVar._scene_ic = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        geeVar._scene_title = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10)).getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        geeVar._scene_content = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10)).getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        geeVar._scene_go = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10)).getChildAt(1)).getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m130629b(gee geeVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95880lb, viewGroup, false);
        m130628a(geeVar, viewInflate);
        return viewInflate;
    }
}
