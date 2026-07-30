package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Guideline;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.scrap.widget.ScrapTargetShowView;
import p151v.VButton;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class fce0 {
    /* JADX INFO: renamed from: a */
    public static void m125007a(ece0 ece0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ece0Var._blank_space = viewGroup.getChildAt(0);
        ece0Var._bg_view = viewGroup.getChildAt(1);
        ece0Var._star_bg_view = (AnimEffectPlayer) viewGroup.getChildAt(2);
        ece0Var._scrap_gift_title_view = (AppCompatImageView) viewGroup.getChildAt(3);
        ece0Var._scrap_right_title_view = (AppCompatImageView) viewGroup.getChildAt(4);
        ece0Var._scrap_help_view = viewGroup.getChildAt(5);
        ece0Var._scrap_number_desc_bg = viewGroup.getChildAt(6);
        ece0Var._hold_scrap_number_text = (VText) viewGroup.getChildAt(7);
        ece0Var._scrap_number = (VText) viewGroup.getChildAt(8);
        ece0Var._scrap_craft_text1 = (VText) viewGroup.getChildAt(9);
        ece0Var._scrap_result_number = (VText) viewGroup.getChildAt(10);
        ece0Var._scrap_target_name_layout_bg = viewGroup.getChildAt(11);
        ece0Var._target_level = (VText) viewGroup.getChildAt(12);
        ece0Var._target_name = (VText) viewGroup.getChildAt(13);
        ece0Var._target_right_desc = (VText) viewGroup.getChildAt(14);
        ece0Var._scrap_target_layout = (ScrapTargetShowView) viewGroup.getChildAt(15);
        ece0Var._scrap_list_recycler = (VRecyclerView) viewGroup.getChildAt(16);
        ece0Var._target_craft_button = (VButton) viewGroup.getChildAt(17);
        ece0Var._scrap_event_button = (VButton) viewGroup.getChildAt(18);
        ece0Var._guide_desc = (Guideline) viewGroup.getChildAt(19);
        ece0Var._scrap_acquire_desc = (VText) viewGroup.getChildAt(20);
        ece0Var._no_data_view = viewGroup.getChildAt(21);
        ece0Var._no_data_text = (VText) viewGroup.getChildAt(22);
    }
}
