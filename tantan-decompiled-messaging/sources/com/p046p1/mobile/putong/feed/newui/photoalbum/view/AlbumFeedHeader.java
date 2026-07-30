package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.data.TopicOperations;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.newui.FeedAlbumPersionTitleView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VLinear;
import p147v.VText;
import p149l.b5c0;
import p149l.d30;
import p149l.e30;
import p149l.o6c0;
import p149l.t100;
import p149l.xaj0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class AlbumFeedHeader extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f42337c;

    /* JADX INFO: renamed from: d */
    public FeedSendMomentEnterView f42338d;

    /* JADX INFO: renamed from: e */
    public String f42339e;

    /* JADX INFO: renamed from: f */
    public FeedAlbumPersionTitleView f42340f;

    public AlbumFeedHeader(Context context) {
        super(context);
        m65061S(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m65058P(e30 e30Var) {
        int i = FeedModule.m60221F().userId().equals(this.f42339e) ? 0 : 8;
        if (i != this.f42338d.getVisibility()) {
            this.f42338d.setVisibility(i);
        }
        this.f42338d.m65224g0(e30Var);
        this.f42338d.m65225h0(e30Var);
        this.f42337c.setVisibility(0);
    }

    /* JADX INFO: renamed from: Q */
    public void m65059Q() {
        if (NullChecker.m81303a(this.f42340f)) {
            this.f42340f.m64412k0();
        }
    }

    /* JADX INFO: renamed from: R */
    public void m65060R(String str) {
        this.f42339e = str;
    }

    /* JADX INFO: renamed from: S */
    public final void m65061S(Context context) {
        setOrientation(1);
        LayoutInflater.from(context).inflate(o6c0.f142320y, (ViewGroup) this, true);
        this.f42337c = (VText) findViewById(b5c0.f73505O);
        this.f42338d = (FeedSendMomentEnterView) findViewById(b5c0.f73483G1);
        this.f42340f = (FeedAlbumPersionTitleView) findViewById(b5c0.f73581k);
        TextPaint paint = this.f42337c.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        this.f42338d.setPageId("p_album");
        this.f42338d.m65220a0();
        if (User.isWisdomStar(this.f42339e)) {
            xdl0.m208344M(this.f42337c, true);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m65062T(xaj0<List<TopicOperations>, List<TopicMoment>, List<Moment>> xaj0Var, boolean z) {
        this.f42338d.m65226i0(xaj0Var, z);
    }

    /* JADX INFO: renamed from: V */
    public void m65063V(User user, d30 d30Var) {
        if (NullChecker.m81303a(this.f42340f)) {
            this.f42340f.m64415n0(user, this.f42339e, d30Var);
            if (User.isWisdomStar(this.f42339e)) {
                xdl0.m208344M(this.f42337c, true);
                xdl0.m208358V(this.f42337c, t100.f167261j);
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public void m65064W(User user, PhotoAlbumFeedAct photoAlbumFeedAct, String str, BubbleInfo bubbleInfo) {
        if (NullChecker.m81303a(this.f42340f)) {
            this.f42340f.m64416o0(user, photoAlbumFeedAct, str, bubbleInfo);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m65065X(boolean z, e30<String> e30Var) {
        if (z) {
            m65058P(e30Var);
        }
    }

    public void setUserId(String str) {
        this.f42339e = str;
    }

    public AlbumFeedHeader(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m65061S(context);
    }

    public AlbumFeedHeader(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m65061S(context);
    }
}
