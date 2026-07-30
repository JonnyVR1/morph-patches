package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerFrag;
import l.e6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class sqx {
    /* JADX INFO: renamed from: a */
    public static void m14284a(MediaPickerFrag mediaPickerFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mediaPickerFrag.I = (RelativeLayout) viewGroup.getChildAt(0);
        mediaPickerFrag.J = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mediaPickerFrag.K = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mediaPickerFrag.L = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        mediaPickerFrag.M = viewGroup.getChildAt(1);
        mediaPickerFrag.N = (FrameLayout) viewGroup.getChildAt(2);
        mediaPickerFrag.O = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        mediaPickerFrag.P = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        mediaPickerFrag.Q = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        mediaPickerFrag.R = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        mediaPickerFrag.S = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m14285b(MediaPickerFrag mediaPickerFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(e6c0.G, viewGroup, false);
        m14284a(mediaPickerFrag, viewInflate);
        return viewInflate;
    }
}
