package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class bos {
    /* JADX INFO: renamed from: a */
    public static void m102982a(aos aosVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        aosVar._shadow = viewGroup.getChildAt(0);
        aosVar._bg = viewGroup.getChildAt(1);
        aosVar._bg_svg = (AnimEffectPlayer) viewGroup.getChildAt(2);
        aosVar._title_bg = (FrameLayout) viewGroup.getChildAt(3);
        aosVar._title = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        aosVar._sub_title = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        aosVar._back = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        aosVar._mini_tabs = (VLinear) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        aosVar._tab_all = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0);
        aosVar._tab_light = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(1);
        aosVar._tab_dark = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(2);
        aosVar._empty = (VLinear) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        aosVar._empty_icon = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(0);
        aosVar._empty_text = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(1);
        aosVar._allRecyclerView = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        aosVar._lightRecyclerView = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
        aosVar._darkRecyclerView = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4);
    }
}
