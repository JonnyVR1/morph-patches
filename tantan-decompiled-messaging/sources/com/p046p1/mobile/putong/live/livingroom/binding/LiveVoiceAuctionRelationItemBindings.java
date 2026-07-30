package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationlist.view.LiveVoiceAuctionRelationListItem;
import p147v.VDraweeView;
import p147v.VText;
import p149l.jfd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceAuctionRelationItemBindings extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LiveVoiceAuctionRelationListItem f48236a;

    /* JADX INFO: renamed from: b */
    public VText f48237b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f48238c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f48239d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f48240e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f48241f;

    /* JADX INFO: renamed from: g */
    public VText f48242g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f48243h;

    /* JADX INFO: renamed from: i */
    public VText f48244i;

    /* JADX INFO: renamed from: j */
    public VText f48245j;

    /* JADX INFO: renamed from: k */
    public VText f48246k;

    /* JADX INFO: renamed from: l */
    public VText f48247l;

    public LiveVoiceAuctionRelationItemBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m72059a(ViewGroup viewGroup) {
        this.f48236a = (LiveVoiceAuctionRelationListItem) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f48237b = vText;
        String str = vText == null ? "_rank" : null;
        VDraweeView vDraweeView = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f48238c = vDraweeView;
        if (vDraweeView == null) {
            str = "_avatar_view";
        }
        VDraweeView vDraweeView2 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        this.f48239d = vDraweeView2;
        if (vDraweeView2 == null) {
            str = "_avatar_view_other";
        }
        VDraweeView vDraweeView3 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        this.f48240e = vDraweeView3;
        if (vDraweeView3 == null) {
            str = "_avatar_tag_view";
        }
        VDraweeView vDraweeView4 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        this.f48241f = vDraweeView4;
        if (vDraweeView4 == null) {
            str = "_avatar_tag_view_other";
        }
        VText vText2 = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        this.f48242g = vText2;
        if (vText2 == null) {
            str = "_name";
        }
        VDraweeView vDraweeView5 = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        this.f48243h = vDraweeView5;
        if (vDraweeView5 == null) {
            str = "_relation_img";
        }
        VText vText3 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        this.f48244i = vText3;
        if (vText3 == null) {
            str = "_relation";
        }
        VText vText4 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(2);
        this.f48245j = vText4;
        if (vText4 == null) {
            str = "_user_worth";
        }
        VText vText5 = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        this.f48246k = vText5;
        if (vText5 == null) {
            str = "_level";
        }
        VText vText6 = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        this.f48247l = vText6;
        if (vText6 == null) {
            str = "_validity_period";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    public LiveVoiceAuctionRelationListItem getRoot() {
        return this.f48236a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72059a(this);
    }

    public LiveVoiceAuctionRelationItemBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionRelationItemBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
