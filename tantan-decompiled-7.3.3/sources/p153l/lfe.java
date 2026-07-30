package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.view.DropDownBgView;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.view.DropDownRadarView;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.view.TouchPullViewLayout;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class lfe {
    /* JADX INFO: renamed from: a */
    public static void m153997a(kfe kfeVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        kfeVar._content_layout = (TouchPullViewLayout) viewGroup.getChildAt(0);
        kfeVar._dropdown_bg = (DropDownBgView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        kfeVar._header_img = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        kfeVar._ll_scene_entry = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        kfeVar._tv_scene_con = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        kfeVar._img_scene_con = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        kfeVar._loading_view = (DropDownRadarView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        kfeVar._loading_img = (DropDownRadarView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        kfeVar._loading_tips = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        kfeVar._ll_top_hey = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6)).getChildAt(0);
        kfeVar._ll_top_hey_tv = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6)).getChildAt(0)).getChildAt(1);
        kfeVar._tv_hey_loading = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6)).getChildAt(1);
        kfeVar._close = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        kfeVar._ll_btns = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        kfeVar._ll_btns_online = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8)).getChildAt(0);
        kfeVar._tv_online = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8)).getChildAt(0)).getChildAt(1);
        kfeVar._tv_online_tips = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8)).getChildAt(0)).getChildAt(2);
        kfeVar._ll_btns_audio = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8)).getChildAt(1);
        kfeVar._tv_quick = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8)).getChildAt(1)).getChildAt(1);
        kfeVar._tv_quick_tips = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8)).getChildAt(1)).getChildAt(2);
        kfeVar._ll_btns_heartbeat = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8)).getChildAt(2);
        kfeVar._tv_heartbeat = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8)).getChildAt(2)).getChildAt(1);
        kfeVar._tv_heartbeat_tips = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8)).getChildAt(2)).getChildAt(2);
        kfeVar._ll_to_top = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9);
        kfeVar._tv_to_top = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9)).getChildAt(1);
        kfeVar._ll_scene = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10);
        kfeVar._scene_ic = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        kfeVar._scene_title = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10)).getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        kfeVar._scene_content = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10)).getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        kfeVar._scene_go = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10)).getChildAt(1)).getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m153998b(kfe kfeVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126053sb, viewGroup, false);
        m153997a(kfeVar, viewInflate);
        return viewInflate;
    }
}
