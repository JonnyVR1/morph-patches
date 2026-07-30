package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerFrag;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.folder.FolderSelectView;
import p151v.VButton;
import p151v.VLinear;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class pzx {
    /* JADX INFO: renamed from: a */
    public static void m174625a(MediaPickerFrag mediaPickerFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mediaPickerFrag.f54862I = (RelativeLayout) viewGroup.getChildAt(0);
        mediaPickerFrag.f54863J = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mediaPickerFrag.f54864K = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mediaPickerFrag.f54865L = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        mediaPickerFrag.f54866M = (VLinear) viewGroup.getChildAt(1);
        mediaPickerFrag.f54867N = (FrameLayout) viewGroup.getChildAt(2);
        mediaPickerFrag.f54868O = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        mediaPickerFrag.f54869P = (FolderSelectView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        mediaPickerFrag.f54870Q = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        mediaPickerFrag.f54871R = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        mediaPickerFrag.f54872S = (VButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m174626b(MediaPickerFrag mediaPickerFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(jec0.f120438G, viewGroup, false);
        m174625a(mediaPickerFrag, viewInflate);
        return viewInflate;
    }
}
