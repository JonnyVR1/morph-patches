package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.vip.widget.LetterSendPanel;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class obr {
    /* JADX INFO: renamed from: a */
    public static void m163461a(LetterSendPanel letterSendPanel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        letterSendPanel.f38006a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        letterSendPanel.f38007b = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        letterSendPanel.f38008c = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        letterSendPanel.f38009d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        letterSendPanel.f38010e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        letterSendPanel.f38011f = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        letterSendPanel.f38012g = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        letterSendPanel.f38013h = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        letterSendPanel.f38014i = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        letterSendPanel.f38015j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        letterSendPanel.f38016k = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        letterSendPanel.f38017l = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(0);
        letterSendPanel.f38018m = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m163462b(LetterSendPanel letterSendPanel, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95865kd, viewGroup, true);
        m163461a(letterSendPanel, viewInflate);
        return viewInflate;
    }
}
