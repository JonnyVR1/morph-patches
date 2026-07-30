package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.p046p1.mobile.putong.live.base.view.EmptyView;
import com.p046p1.mobile.putong.live.external.intl.voicesquare.common.VoiceRoomSquareCommonViewModel;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class jio0 {
    /* JADX INFO: renamed from: a */
    public static void m141661a(VoiceRoomSquareCommonViewModel voiceRoomSquareCommonViewModel, View view) {
        voiceRoomSquareCommonViewModel._root = (FrameLayout) view;
        voiceRoomSquareCommonViewModel._app_bar_layout = (AppBarLayout) view.findViewById(f5c0.f95104j);
        voiceRoomSquareCommonViewModel._search_tv = (VText) view.findViewById(f5c0.f95158w1);
        ViewGroup viewGroup = (ViewGroup) view;
        voiceRoomSquareCommonViewModel._recycler = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceRoomSquareCommonViewModel._view_group_no_live = (NestedScrollView) view.findViewById(f5c0.f94988C2);
        voiceRoomSquareCommonViewModel._empty_container = (EmptyView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m141662b(VoiceRoomSquareCommonViewModel voiceRoomSquareCommonViewModel, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162744e0, viewGroup, false);
        m141661a(voiceRoomSquareCommonViewModel, viewInflate);
        return viewInflate;
    }
}
