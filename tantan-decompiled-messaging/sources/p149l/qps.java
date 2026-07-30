package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class qps {
    /* JADX INFO: renamed from: a */
    public static void m175863a(pps ppsVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ppsVar._shadow = viewGroup.getChildAt(0);
        ppsVar._bg = viewGroup.getChildAt(1);
        ppsVar._bg_img = (VDraweeView) viewGroup.getChildAt(2);
        ppsVar._title_layout = viewGroup.getChildAt(3);
        ppsVar._title = (TextView) viewGroup.getChildAt(4);
        ppsVar._help = (VImage) viewGroup.getChildAt(5);
        ppsVar._card_bg = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(0);
        ppsVar._big_icon_img = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(1);
        ppsVar._user_icon = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(2);
        ppsVar._user_name = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(3);
        ppsVar._card_progress_bg = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(4);
        ppsVar._card_progress_layer = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(5);
        ppsVar._progress_text = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(6);
        ppsVar._medal_bg = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(7);
        ppsVar._user_medal_bg = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(7)).getChildAt(0);
        ppsVar._user_medal_icon = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(7)).getChildAt(1);
        ppsVar._user_medal_level = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(7)).getChildAt(2);
        ppsVar._gift_count_title = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(8);
        ppsVar._gift_count = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(9);
        ppsVar._divider_line_one = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(10);
        ppsVar._gift_skin_count = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(11);
        ppsVar._gift_skin_title = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(12);
        ppsVar._gift_skin_more = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(13);
        ppsVar._divider_line_two = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(14);
        ppsVar._gift_set_count = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(15);
        ppsVar._gift_set_title = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(16);
        ppsVar._gift_set_more = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(17);
        ppsVar._new_gift_title = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(18);
        ppsVar._new_gift_recycler = (RecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(19);
        ppsVar._picks_gift_title = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(20);
        ppsVar._picks_gift_recycler = (RecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(21);
        ppsVar._gift_list_recycler = (RecyclerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(22)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m175864b(pps ppsVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f167988C4, viewGroup, false);
        m175863a(ppsVar, viewInflate);
        return viewInflate;
    }
}
