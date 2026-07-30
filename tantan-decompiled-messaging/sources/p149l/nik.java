package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.newui.group.GroupSuggestLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.emoji.VEditTextEmojiCompat;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class nik {
    /* JADX INFO: renamed from: a */
    public static void m159513a(mik mikVar, View view) {
        mikVar.f133977a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mikVar.f133978b = (RelativeLayout) viewGroup.getChildAt(0);
        mikVar.f133979c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mikVar.f133980d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mikVar.f133981e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        mikVar.f133982f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        mikVar.f133983g = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        mikVar.f133984h = (VEditTextEmojiCompat) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        mikVar.f133985i = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        mikVar.f133986j = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        mikVar.f133987k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        mikVar.f133988l = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        mikVar.f133989m = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        mikVar.f133990n = (GroupSuggestLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        mikVar.f133991o = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m159514b(mik mikVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126466f, viewGroup, false);
        m159513a(mikVar, viewInflate);
        return viewInflate;
    }
}
