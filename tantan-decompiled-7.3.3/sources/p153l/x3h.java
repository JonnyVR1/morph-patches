package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedDraftView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class x3h {
    /* JADX INFO: renamed from: a */
    public static void m209212a(FeedDraftView feedDraftView, View view) {
        feedDraftView.f43212d = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedDraftView.f43213e = (VFrame) viewGroup.getChildAt(0);
        feedDraftView.f43214f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedDraftView.f43215g = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedDraftView.f43216h = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedDraftView.f43217i = (VImage) viewGroup.getChildAt(1);
        feedDraftView.f43218j = (VLinear) viewGroup.getChildAt(2);
        feedDraftView.f43219k = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        feedDraftView.f43220l = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m209213b(FeedDraftView feedDraftView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173741r0, viewGroup, false);
        m209212a(feedDraftView, viewInflate);
        return viewInflate;
    }
}
