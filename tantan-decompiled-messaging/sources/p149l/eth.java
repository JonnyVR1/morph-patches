package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.newui.photoalbum.postguide.FeedPostGuideTwoView;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class eth {
    /* JADX INFO: renamed from: a */
    public static void m118100a(FeedPostGuideTwoView feedPostGuideTwoView, View view) {
        feedPostGuideTwoView.f42322c = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostGuideTwoView.f42323d = (VDraweeView) viewGroup.getChildAt(0);
        feedPostGuideTwoView.f42324e = (VText) viewGroup.getChildAt(1);
        feedPostGuideTwoView.f42325f = (VLinear) viewGroup.getChildAt(2);
        feedPostGuideTwoView.f42326g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        feedPostGuideTwoView.f42327h = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m118101b(FeedPostGuideTwoView feedPostGuideTwoView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f141997A2, viewGroup, false);
        m118100a(feedPostGuideTwoView, viewInflate);
        return viewInflate;
    }
}
