package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.p051p1.mobile.putong.live.base.view.EmptyView;
import com.p051p1.mobile.putong.live.external.intl.voicesquare.common.VoiceRoomSquareCommonViewModel;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class nro0 {
    /* JADX INFO: renamed from: a */
    public static void m164502a(VoiceRoomSquareCommonViewModel voiceRoomSquareCommonViewModel, View view) {
        voiceRoomSquareCommonViewModel._root = (FrameLayout) view;
        voiceRoomSquareCommonViewModel._app_bar_layout = (AppBarLayout) view.findViewById(ldc0.f131561j);
        voiceRoomSquareCommonViewModel._search_tv = (VText) view.findViewById(ldc0.f131615w1);
        ViewGroup viewGroup = (ViewGroup) view;
        voiceRoomSquareCommonViewModel._recycler = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceRoomSquareCommonViewModel._view_group_no_live = (NestedScrollView) view.findViewById(ldc0.f131445C2);
        voiceRoomSquareCommonViewModel._empty_container = (EmptyView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m164503b(VoiceRoomSquareCommonViewModel voiceRoomSquareCommonViewModel, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193858e0, viewGroup, false);
        m164502a(voiceRoomSquareCommonViewModel, viewInflate);
        return viewInflate;
    }
}
