package com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VLinear;
import p153l.bnl0;
import p153l.byd0;
import p153l.jyb;
import p153l.p6i;
import p153l.pzi0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class PhotoAlbumInterestedHeaderView extends VLinear {

    /* JADX INFO: renamed from: c */
    public final byd0 f43113c;

    /* JADX INFO: renamed from: d */
    public FeedAlbumInterestedEntranceView f43114d;

    /* JADX INFO: renamed from: e */
    public PhotoAlbumInterestedCardView f43115e;

    /* JADX INFO: renamed from: f */
    public x20 f43116f;

    /* JADX INFO: renamed from: g */
    public int f43117g;

    /* JADX INFO: renamed from: h */
    public String f43118h;

    /* JADX INFO: renamed from: i */
    public y20<Boolean> f43119i;

    public PhotoAlbumInterestedHeaderView(Context context) {
        super(context);
        this.f43113c = new byd0("show_interested_card_last_time_" + FeedModule.m61405F().userId(), 0L);
        m66176S(context);
    }

    /* JADX INFO: renamed from: S */
    private void m66176S(Context context) {
        setOrientation(1);
        setPadding(0, 1, 0, 0);
        this.f43114d = new FeedAlbumInterestedEntranceView(context);
        this.f43115e = new PhotoAlbumInterestedCardView(context);
        addView(this.f43114d);
        addView(this.f43115e);
        bnl0.m105524M(this.f43114d, false);
        bnl0.m105524M(this.f43115e, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m66177T() {
        x20 x20Var = this.f43116f;
        if (x20Var != null) {
            x20Var.call();
        }
        m66180V();
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m66178Q() {
        return this.f43113c.get().longValue() == 0 || !p6i.m170899h((double) this.f43113c.get().longValue());
    }

    /* JADX INFO: renamed from: R */
    public void m66179R() {
        if (this.f43114d.getVisibility() == 0) {
            this.f43114d.m66148B();
        } else if (this.f43115e.getVisibility() == 0) {
            this.f43115e.m66166l();
        }
    }

    /* JADX INFO: renamed from: V */
    public void m66180V() {
        if (NullChecker.m82486a(this.f43119i)) {
            this.f43119i.call(Boolean.FALSE);
        }
        bnl0.m105524M(this.f43115e, false);
        bnl0.m105524M(this.f43114d, true);
        this.f43113c.put(Long.valueOf(pzi0.m174454o()));
        this.f43114d.m66149H(this.f43117g);
    }

    /* JADX INFO: renamed from: W */
    public void m66181W(List<User> list, int i) {
        if (jyb.m147479J(list) || i <= 0) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                bnl0.m105524M(getChildAt(i2), false);
            }
            return;
        }
        this.f43117g = i;
        this.f43115e.m66172u(list.get(0), i, new x20() { // from class: l.ci70
            @Override // p153l.x20
            public final void call() {
                this.f81903a.m66177T();
            }
        });
        this.f43114d.m66151M(list, i);
        if (list.size() < 5 || !m66178Q()) {
            if (NullChecker.m82486a(this.f43119i)) {
                this.f43119i.call(Boolean.FALSE);
            }
            bnl0.m105524M(this.f43115e, false);
            bnl0.m105524M(this.f43114d, true);
            this.f43114d.m66149H(i);
            return;
        }
        if (NullChecker.m82486a(this.f43119i)) {
            this.f43119i.call(Boolean.TRUE);
        }
        bnl0.m105524M(this.f43115e, true);
        bnl0.m105524M(this.f43114d, false);
        this.f43115e.m66167m(i);
    }

    public void setAction(y20<Boolean> y20Var) {
        this.f43119i = y20Var;
    }

    public void setClickOuterAction(x20 x20Var) {
        this.f43116f = x20Var;
    }

    public void setInteractionType(String str) {
        this.f43118h = str;
        this.f43114d.setInteractionType(str);
        this.f43115e.setInteractionType(str);
    }

    public PhotoAlbumInterestedHeaderView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43113c = new byd0("show_interested_card_last_time_" + FeedModule.m61405F().userId(), 0L);
        m66176S(context);
    }

    public PhotoAlbumInterestedHeaderView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43113c = new byd0("show_interested_card_last_time_" + FeedModule.m61405F().userId(), 0L);
        m66176S(context);
    }
}
