package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationlist.view.LiveVoiceAuctionRelationListItem;
import p151v.VDraweeView;
import p151v.VText;
import p153l.mnd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceAuctionRelationItemBindings extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LiveVoiceAuctionRelationListItem f49084a;

    /* JADX INFO: renamed from: b */
    public VText f49085b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f49086c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f49087d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f49088e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f49089f;

    /* JADX INFO: renamed from: g */
    public VText f49090g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f49091h;

    /* JADX INFO: renamed from: i */
    public VText f49092i;

    /* JADX INFO: renamed from: j */
    public VText f49093j;

    /* JADX INFO: renamed from: k */
    public VText f49094k;

    /* JADX INFO: renamed from: l */
    public VText f49095l;

    public LiveVoiceAuctionRelationItemBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m73242a(ViewGroup viewGroup) {
        this.f49084a = (LiveVoiceAuctionRelationListItem) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f49085b = vText;
        String str = vText == null ? "_rank" : null;
        VDraweeView vDraweeView = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f49086c = vDraweeView;
        if (vDraweeView == null) {
            str = "_avatar_view";
        }
        VDraweeView vDraweeView2 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        this.f49087d = vDraweeView2;
        if (vDraweeView2 == null) {
            str = "_avatar_view_other";
        }
        VDraweeView vDraweeView3 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        this.f49088e = vDraweeView3;
        if (vDraweeView3 == null) {
            str = "_avatar_tag_view";
        }
        VDraweeView vDraweeView4 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        this.f49089f = vDraweeView4;
        if (vDraweeView4 == null) {
            str = "_avatar_tag_view_other";
        }
        VText vText2 = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        this.f49090g = vText2;
        if (vText2 == null) {
            str = "_name";
        }
        VDraweeView vDraweeView5 = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        this.f49091h = vDraweeView5;
        if (vDraweeView5 == null) {
            str = "_relation_img";
        }
        VText vText3 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        this.f49092i = vText3;
        if (vText3 == null) {
            str = "_relation";
        }
        VText vText4 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(2);
        this.f49093j = vText4;
        if (vText4 == null) {
            str = "_user_worth";
        }
        VText vText5 = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        this.f49094k = vText5;
        if (vText5 == null) {
            str = "_level";
        }
        VText vText6 = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        this.f49095l = vText6;
        if (vText6 == null) {
            str = "_validity_period";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    public LiveVoiceAuctionRelationListItem getRoot() {
        return this.f49084a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73242a(this);
    }

    public LiveVoiceAuctionRelationItemBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionRelationItemBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
