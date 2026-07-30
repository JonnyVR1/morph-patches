package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvChooseSongPageView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class v0r {
    /* JADX INFO: renamed from: a */
    public static void m196506a(KtvChooseSongPageView ktvChooseSongPageView, View view) {
        ktvChooseSongPageView._rootView = (KtvChooseSongPageView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ktvChooseSongPageView._search_edit = (EditText) viewGroup.getChildAt(0);
        ktvChooseSongPageView._cancel_icon = (ImageView) viewGroup.getChildAt(2);
        ktvChooseSongPageView._cancel_bt = (TextView) viewGroup.getChildAt(3);
        ktvChooseSongPageView._hot_music = (TextView) viewGroup.getChildAt(4);
        ktvChooseSongPageView._recommend_music = (TextView) viewGroup.getChildAt(5);
        ktvChooseSongPageView._recently_music = (TextView) viewGroup.getChildAt(6);
        ktvChooseSongPageView._recyclerView = (VRecyclerView) viewGroup.getChildAt(7);
        ktvChooseSongPageView._searchRecyclerView = (VRecyclerView) viewGroup.getChildAt(8);
        ktvChooseSongPageView._empty = (VLinear) viewGroup.getChildAt(9);
        ktvChooseSongPageView._empty_icon = (VImage) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0);
        ktvChooseSongPageView._empty_text = (VText) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(1);
    }
}
