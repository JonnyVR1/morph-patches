package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Guideline;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.scrap.widget.ScrapTargetShowView;
import p147v.VButton;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class b4e0 {
    /* JADX INFO: renamed from: a */
    public static void m100249a(a4e0 a4e0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        a4e0Var._blank_space = viewGroup.getChildAt(0);
        a4e0Var._bg_view = viewGroup.getChildAt(1);
        a4e0Var._star_bg_view = (AnimEffectPlayer) viewGroup.getChildAt(2);
        a4e0Var._scrap_gift_title_view = (AppCompatImageView) viewGroup.getChildAt(3);
        a4e0Var._scrap_right_title_view = (AppCompatImageView) viewGroup.getChildAt(4);
        a4e0Var._scrap_help_view = viewGroup.getChildAt(5);
        a4e0Var._scrap_number_desc_bg = viewGroup.getChildAt(6);
        a4e0Var._hold_scrap_number_text = (VText) viewGroup.getChildAt(7);
        a4e0Var._scrap_number = (VText) viewGroup.getChildAt(8);
        a4e0Var._scrap_craft_text1 = (VText) viewGroup.getChildAt(9);
        a4e0Var._scrap_result_number = (VText) viewGroup.getChildAt(10);
        a4e0Var._scrap_target_name_layout_bg = viewGroup.getChildAt(11);
        a4e0Var._target_level = (VText) viewGroup.getChildAt(12);
        a4e0Var._target_name = (VText) viewGroup.getChildAt(13);
        a4e0Var._target_right_desc = (VText) viewGroup.getChildAt(14);
        a4e0Var._scrap_target_layout = (ScrapTargetShowView) viewGroup.getChildAt(15);
        a4e0Var._scrap_list_recycler = (VRecyclerView) viewGroup.getChildAt(16);
        a4e0Var._target_craft_button = (VButton) viewGroup.getChildAt(17);
        a4e0Var._scrap_event_button = (VButton) viewGroup.getChildAt(18);
        a4e0Var._guide_desc = (Guideline) viewGroup.getChildAt(19);
        a4e0Var._scrap_acquire_desc = (VText) viewGroup.getChildAt(20);
        a4e0Var._no_data_view = viewGroup.getChildAt(21);
        a4e0Var._no_data_text = (VText) viewGroup.getChildAt(22);
    }
}
