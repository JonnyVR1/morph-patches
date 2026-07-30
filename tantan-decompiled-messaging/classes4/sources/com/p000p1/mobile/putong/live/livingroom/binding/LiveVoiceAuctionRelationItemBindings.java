package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationlist.view.LiveVoiceAuctionRelationListItem;
import l.jfd0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVoiceAuctionRelationItemBindings extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LiveVoiceAuctionRelationListItem f4278a;

    /* JADX INFO: renamed from: b */
    public VText f4279b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f4280c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f4281d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f4282e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f4283f;

    /* JADX INFO: renamed from: g */
    public VText f4284g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f4285h;

    /* JADX INFO: renamed from: i */
    public VText f4286i;

    /* JADX INFO: renamed from: j */
    public VText f4287j;

    /* JADX INFO: renamed from: k */
    public VText f4288k;

    /* JADX INFO: renamed from: l */
    public VText f4289l;

    public LiveVoiceAuctionRelationItemBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m5520a(ViewGroup viewGroup) {
        this.f4278a = (LiveVoiceAuctionRelationListItem) viewGroup;
        VText childAt = viewGroup.getChildAt(0);
        this.f4279b = childAt;
        String str = childAt == null ? "_rank" : null;
        VDraweeView childAt2 = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f4280c = childAt2;
        if (childAt2 == null) {
            str = "_avatar_view";
        }
        VDraweeView childAt3 = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        this.f4281d = childAt3;
        if (childAt3 == null) {
            str = "_avatar_view_other";
        }
        VDraweeView childAt4 = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        this.f4282e = childAt4;
        if (childAt4 == null) {
            str = "_avatar_tag_view";
        }
        VDraweeView childAt5 = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        this.f4283f = childAt5;
        if (childAt5 == null) {
            str = "_avatar_tag_view_other";
        }
        VText childAt6 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        this.f4284g = childAt6;
        if (childAt6 == null) {
            str = "_name";
        }
        VDraweeView childAt7 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        this.f4285h = childAt7;
        if (childAt7 == null) {
            str = "_relation_img";
        }
        VText childAt8 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        this.f4286i = childAt8;
        if (childAt8 == null) {
            str = "_relation";
        }
        VText childAt9 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(2);
        this.f4287j = childAt9;
        if (childAt9 == null) {
            str = "_user_worth";
        }
        VText childAt10 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        this.f4288k = childAt10;
        if (childAt10 == null) {
            str = "_level";
        }
        VText childAt11 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        this.f4289l = childAt11;
        if (childAt11 == null) {
            str = "_validity_period";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public LiveVoiceAuctionRelationListItem getRoot() {
        return this.f4278a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5520a(this);
    }

    public LiveVoiceAuctionRelationItemBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionRelationItemBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
