package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerFrag;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.folder.FolderSelectView;
import p147v.VButton;
import p147v.VLinear;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public class sqx {
    /* JADX INFO: renamed from: a */
    public static void m185616a(MediaPickerFrag mediaPickerFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mediaPickerFrag.f54014I = (RelativeLayout) viewGroup.getChildAt(0);
        mediaPickerFrag.f54015J = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mediaPickerFrag.f54016K = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mediaPickerFrag.f54017L = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        mediaPickerFrag.f54018M = (VLinear) viewGroup.getChildAt(1);
        mediaPickerFrag.f54019N = (FrameLayout) viewGroup.getChildAt(2);
        mediaPickerFrag.f54020O = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        mediaPickerFrag.f54021P = (FolderSelectView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        mediaPickerFrag.f54022Q = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        mediaPickerFrag.f54023R = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        mediaPickerFrag.f54024S = (VButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m185617b(MediaPickerFrag mediaPickerFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(e6c0.f89525G, viewGroup, false);
        m185616a(mediaPickerFrag, viewInflate);
        return viewInflate;
    }
}
