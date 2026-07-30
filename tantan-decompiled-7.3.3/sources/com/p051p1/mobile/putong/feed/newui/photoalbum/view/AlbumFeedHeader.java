package com.p051p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.data.TopicOperations;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.newui.FeedAlbumPersionTitleView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VLinear;
import p151v.VText;
import p153l.bkj0;
import p153l.bnl0;
import p153l.hdc0;
import p153l.qa00;
import p153l.tec0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class AlbumFeedHeader extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f43185c;

    /* JADX INFO: renamed from: d */
    public FeedSendMomentEnterView f43186d;

    /* JADX INFO: renamed from: e */
    public String f43187e;

    /* JADX INFO: renamed from: f */
    public FeedAlbumPersionTitleView f43188f;

    public AlbumFeedHeader(Context context) {
        super(context);
        m66244S(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m66241P(y20 y20Var) {
        int i = FeedModule.m61405F().userId().equals(this.f43187e) ? 0 : 8;
        if (i != this.f43186d.getVisibility()) {
            this.f43186d.setVisibility(i);
        }
        this.f43186d.m66407g0(y20Var);
        this.f43186d.m66408h0(y20Var);
        this.f43185c.setVisibility(0);
    }

    /* JADX INFO: renamed from: Q */
    public void m66242Q() {
        if (NullChecker.m82486a(this.f43188f)) {
            this.f43188f.m65595k0();
        }
    }

    /* JADX INFO: renamed from: R */
    public void m66243R(String str) {
        this.f43187e = str;
    }

    /* JADX INFO: renamed from: S */
    public final void m66244S(Context context) {
        setOrientation(1);
        LayoutInflater.from(context).inflate(tec0.f173789y, (ViewGroup) this, true);
        this.f43185c = (VText) findViewById(hdc0.f108858O);
        this.f43186d = (FeedSendMomentEnterView) findViewById(hdc0.f108836G1);
        this.f43188f = (FeedAlbumPersionTitleView) findViewById(hdc0.f108934k);
        TextPaint paint = this.f43185c.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        this.f43186d.setPageId("p_album");
        this.f43186d.m66403a0();
        if (User.isWisdomStar(this.f43187e)) {
            bnl0.m105524M(this.f43185c, true);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m66245T(bkj0<List<TopicOperations>, List<TopicMoment>, List<Moment>> bkj0Var, boolean z) {
        this.f43186d.m66409i0(bkj0Var, z);
    }

    /* JADX INFO: renamed from: V */
    public void m66246V(User user, x20 x20Var) {
        if (NullChecker.m82486a(this.f43188f)) {
            this.f43188f.m65598n0(user, this.f43187e, x20Var);
            if (User.isWisdomStar(this.f43187e)) {
                bnl0.m105524M(this.f43185c, true);
                bnl0.m105538V(this.f43185c, qa00.f156323j);
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public void m66247W(User user, PhotoAlbumFeedAct photoAlbumFeedAct, String str, BubbleInfo bubbleInfo) {
        if (NullChecker.m82486a(this.f43188f)) {
            this.f43188f.m65599o0(user, photoAlbumFeedAct, str, bubbleInfo);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m66248X(boolean z, y20<String> y20Var) {
        if (z) {
            m66241P(y20Var);
        }
    }

    public void setUserId(String str) {
        this.f43187e = str;
    }

    public AlbumFeedHeader(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m66244S(context);
    }

    public AlbumFeedHeader(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m66244S(context);
    }
}
