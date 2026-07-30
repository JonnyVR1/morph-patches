package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.base.preview.PreviewView;
import com.p046p1.mobile.putong.live.livingroom.view.LivePreviewBottomView;
import com.p046p1.mobile.putong.live.livingroom.view.LivePreviewCampaignView;
import com.p046p1.mobile.putong.live.livingroom.view.LivePreviewTopView;

/* JADX INFO: loaded from: classes4.dex */
public class fl80 {
    /* JADX INFO: renamed from: a */
    public static void m121964a(PreviewView previewView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        previewView.f47865d = (LivePreviewTopView) viewGroup.getChildAt(0);
        previewView.f47866e = (LivePreviewCampaignView) viewGroup.getChildAt(1);
        previewView.f47867f = (LivePreviewBottomView) viewGroup.getChildAt(3);
    }
}
