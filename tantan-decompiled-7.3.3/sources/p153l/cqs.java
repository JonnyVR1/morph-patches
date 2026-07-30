package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class cqs {
    /* JADX INFO: renamed from: a */
    public static void m111979a(bqs bqsVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bqsVar._shadow = viewGroup.getChildAt(0);
        bqsVar._bg = viewGroup.getChildAt(1);
        bqsVar._bg_svg = (AnimEffectPlayer) viewGroup.getChildAt(2);
        bqsVar._title_bg = (FrameLayout) viewGroup.getChildAt(3);
        bqsVar._title = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        bqsVar._sub_title = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        bqsVar._back = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        bqsVar._mini_tabs = (VLinear) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        bqsVar._tab_all = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0);
        bqsVar._tab_light = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(1);
        bqsVar._tab_dark = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(2);
        bqsVar._empty = (VLinear) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        bqsVar._empty_icon = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(0);
        bqsVar._empty_text = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(1);
        bqsVar._allRecyclerView = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        bqsVar._lightRecyclerView = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
        bqsVar._darkRecyclerView = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4);
    }
}
