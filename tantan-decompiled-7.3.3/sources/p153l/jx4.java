package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.DanmakuToggleButton;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal.NormalDanmakuImgViewGroup;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.tag.DanmakuTagViewContainer;
import com.p051p1.mobile.putong.live.livingroom.common.chat.input.ChatInputViewGroup;
import com.p051p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatKeyboardRoot;
import p151v.VEditText;
import p151v.VPager;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class jx4 {
    /* JADX INFO: renamed from: a */
    public static void m147284a(ix4 ix4Var, View view) {
        ix4Var.f117321k = (VoiceChatKeyboardRoot) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ix4Var.f117322l = (FrameLayout) viewGroup.getChildAt(0);
        ix4Var.f117323m = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ix4Var.f117324n = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        ix4Var.f117325o = (DanmakuTagViewContainer) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        ix4Var.f117326p = (NormalDanmakuImgViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        ix4Var.f117327q = (ChatInputViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        ix4Var.f117328r = (DanmakuToggleButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        ix4Var.f117329s = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        ix4Var.f117330t = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        ix4Var.f117331u = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        ix4Var.f117332v = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        ix4Var.f117333w = (VPager) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
    }
}
