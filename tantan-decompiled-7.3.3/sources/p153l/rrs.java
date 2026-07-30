package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class rrs {
    /* JADX INFO: renamed from: a */
    public static void m182828a(qrs qrsVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qrsVar._shadow = viewGroup.getChildAt(0);
        qrsVar._bg = viewGroup.getChildAt(1);
        qrsVar._bg_img = (VDraweeView) viewGroup.getChildAt(2);
        qrsVar._title_layout = viewGroup.getChildAt(3);
        qrsVar._title = (TextView) viewGroup.getChildAt(4);
        qrsVar._help = (VImage) viewGroup.getChildAt(5);
        qrsVar._card_bg = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(0);
        qrsVar._big_icon_img = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(1);
        qrsVar._user_icon = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(2);
        qrsVar._user_name = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(3);
        qrsVar._card_progress_bg = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(4);
        qrsVar._card_progress_layer = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(5);
        qrsVar._progress_text = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(6);
        qrsVar._medal_bg = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(7);
        qrsVar._user_medal_bg = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(7)).getChildAt(0);
        qrsVar._user_medal_icon = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(7)).getChildAt(1);
        qrsVar._user_medal_level = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(7)).getChildAt(2);
        qrsVar._gift_count_title = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(8);
        qrsVar._gift_count = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(9);
        qrsVar._divider_line_one = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(10);
        qrsVar._gift_skin_count = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(11);
        qrsVar._gift_skin_title = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(12);
        qrsVar._gift_skin_more = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(13);
        qrsVar._divider_line_two = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(14);
        qrsVar._gift_set_count = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(15);
        qrsVar._gift_set_title = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(16);
        qrsVar._gift_set_more = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(17);
        qrsVar._new_gift_title = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(18);
        qrsVar._new_gift_recycler = (RecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(19);
        qrsVar._picks_gift_title = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(20);
        qrsVar._picks_gift_recycler = (RecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(21);
        qrsVar._gift_list_recycler = (RecyclerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(22)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m182829b(qrs qrsVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198720C4, viewGroup, false);
        m182828a(qrsVar, viewInflate);
        return viewInflate;
    }
}
