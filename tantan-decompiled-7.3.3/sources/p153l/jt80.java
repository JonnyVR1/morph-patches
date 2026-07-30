package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.base.preview.PreviewView;
import com.p051p1.mobile.putong.live.livingroom.view.LivePreviewBottomView;
import com.p051p1.mobile.putong.live.livingroom.view.LivePreviewCampaignView;
import com.p051p1.mobile.putong.live.livingroom.view.LivePreviewTopView;

/* JADX INFO: loaded from: classes4.dex */
public class jt80 {
    /* JADX INFO: renamed from: a */
    public static void m146889a(PreviewView previewView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        previewView.f48713d = (LivePreviewTopView) viewGroup.getChildAt(0);
        previewView.f48714e = (LivePreviewCampaignView) viewGroup.getChildAt(1);
        previewView.f48715f = (LivePreviewBottomView) viewGroup.getChildAt(3);
    }
}
