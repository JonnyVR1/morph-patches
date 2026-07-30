package com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.d30;
import l.e30;
import l.mqi0;
import l.vwb;
import l.xdl0;
import l.zpd0;
import p007l.a5i;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PhotoAlbumInterestedHeaderView extends VLinear {

    /* JADX INFO: renamed from: c */
    public final zpd0 f3726c;

    /* JADX INFO: renamed from: d */
    public FeedAlbumInterestedEntranceView f3727d;

    /* JADX INFO: renamed from: e */
    public PhotoAlbumInterestedCardView f3728e;

    /* JADX INFO: renamed from: f */
    public d30 f3729f;

    /* JADX INFO: renamed from: g */
    public int f3730g;

    /* JADX INFO: renamed from: h */
    public String f3731h;

    /* JADX INFO: renamed from: i */
    public e30<Boolean> f3732i;

    public PhotoAlbumInterestedHeaderView(Context context) {
        super(context);
        this.f3726c = new zpd0("show_interested_card_last_time_" + FeedModule.m1139F().userId(), 0L);
        m6093S(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    private void m6093S(Context context) {
        setOrientation(1);
        setPadding(0, 1, 0, 0);
        this.f3727d = new FeedAlbumInterestedEntranceView(context);
        this.f3728e = new PhotoAlbumInterestedCardView(context);
        addView(this.f3727d);
        addView(this.f3728e);
        xdl0.M(this.f3727d, false);
        xdl0.M(this.f3728e, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m6094T() {
        d30 d30Var = this.f3729f;
        if (d30Var != null) {
            d30Var.call();
        }
        m6097V();
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m6095Q() {
        return ((Long) this.f3726c.get()).longValue() == 0 || !a5i.m8408h((double) ((Long) this.f3726c.get()).longValue());
    }

    /* JADX INFO: renamed from: R */
    public void m6096R() {
        if (this.f3727d.getVisibility() == 0) {
            this.f3727d.m6065B();
        } else if (this.f3728e.getVisibility() == 0) {
            this.f3728e.m6083l();
        }
    }

    /* JADX INFO: renamed from: V */
    public void m6097V() {
        if (NullChecker.a(this.f3732i)) {
            this.f3732i.call(Boolean.FALSE);
        }
        xdl0.M(this.f3728e, false);
        xdl0.M(this.f3727d, true);
        this.f3726c.put(Long.valueOf(mqi0.o()));
        this.f3727d.m6066H(this.f3730g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W */
    public void m6098W(List<User> list, int i) {
        if (vwb.J(list) || i <= 0) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                xdl0.M(getChildAt(i2), false);
            }
            return;
        }
        this.f3730g = i;
        this.f3728e.m6089u(list.get(0), i, new d30() { // from class: l.w970
            public final void call() {
                this.f14474a.m6094T();
            }
        });
        this.f3727d.m6068M(list, i);
        if (list.size() < 5 || !m6095Q()) {
            if (NullChecker.a(this.f3732i)) {
                this.f3732i.call(Boolean.FALSE);
            }
            xdl0.M(this.f3728e, false);
            xdl0.M(this.f3727d, true);
            this.f3727d.m6066H(i);
            return;
        }
        if (NullChecker.a(this.f3732i)) {
            this.f3732i.call(Boolean.TRUE);
        }
        xdl0.M(this.f3728e, true);
        xdl0.M(this.f3727d, false);
        this.f3728e.m6084m(i);
    }

    public void setAction(e30<Boolean> e30Var) {
        this.f3732i = e30Var;
    }

    public void setClickOuterAction(d30 d30Var) {
        this.f3729f = d30Var;
    }

    public void setInteractionType(String str) {
        this.f3731h = str;
        this.f3727d.setInteractionType(str);
        this.f3728e.setInteractionType(str);
    }

    public PhotoAlbumInterestedHeaderView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3726c = new zpd0("show_interested_card_last_time_" + FeedModule.m1139F().userId(), 0L);
        m6093S(context);
    }

    public PhotoAlbumInterestedHeaderView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3726c = new zpd0("show_interested_card_last_time_" + FeedModule.m1139F().userId(), 0L);
        m6093S(context);
    }
}
