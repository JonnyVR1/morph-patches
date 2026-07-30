package com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VLinear;
import p149l.a5i;
import p149l.d30;
import p149l.e30;
import p149l.mqi0;
import p149l.vwb;
import p149l.xdl0;
import p149l.zpd0;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoAlbumInterestedHeaderView extends VLinear {

    /* JADX INFO: renamed from: c */
    public final zpd0 f42265c;

    /* JADX INFO: renamed from: d */
    public FeedAlbumInterestedEntranceView f42266d;

    /* JADX INFO: renamed from: e */
    public PhotoAlbumInterestedCardView f42267e;

    /* JADX INFO: renamed from: f */
    public d30 f42268f;

    /* JADX INFO: renamed from: g */
    public int f42269g;

    /* JADX INFO: renamed from: h */
    public String f42270h;

    /* JADX INFO: renamed from: i */
    public e30<Boolean> f42271i;

    public PhotoAlbumInterestedHeaderView(Context context) {
        super(context);
        this.f42265c = new zpd0("show_interested_card_last_time_" + FeedModule.m60221F().userId(), 0L);
        m64993S(context);
    }

    /* JADX INFO: renamed from: S */
    private void m64993S(Context context) {
        setOrientation(1);
        setPadding(0, 1, 0, 0);
        this.f42266d = new FeedAlbumInterestedEntranceView(context);
        this.f42267e = new PhotoAlbumInterestedCardView(context);
        addView(this.f42266d);
        addView(this.f42267e);
        xdl0.m208344M(this.f42266d, false);
        xdl0.m208344M(this.f42267e, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m64994T() {
        d30 d30Var = this.f42268f;
        if (d30Var != null) {
            d30Var.call();
        }
        m64997V();
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m64995Q() {
        return this.f42265c.get().longValue() == 0 || !a5i.m95032h((double) this.f42265c.get().longValue());
    }

    /* JADX INFO: renamed from: R */
    public void m64996R() {
        if (this.f42266d.getVisibility() == 0) {
            this.f42266d.m64965B();
        } else if (this.f42267e.getVisibility() == 0) {
            this.f42267e.m64983l();
        }
    }

    /* JADX INFO: renamed from: V */
    public void m64997V() {
        if (NullChecker.m81303a(this.f42271i)) {
            this.f42271i.call(Boolean.FALSE);
        }
        xdl0.m208344M(this.f42267e, false);
        xdl0.m208344M(this.f42266d, true);
        this.f42265c.put(Long.valueOf(mqi0.m155944o()));
        this.f42266d.m64966H(this.f42269g);
    }

    /* JADX INFO: renamed from: W */
    public void m64998W(List<User> list, int i) {
        if (vwb.m200296J(list) || i <= 0) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                xdl0.m208344M(getChildAt(i2), false);
            }
            return;
        }
        this.f42269g = i;
        this.f42267e.m64989u(list.get(0), i, new d30() { // from class: l.w970
            @Override // p149l.d30
            public final void call() {
                this.f185310a.m64994T();
            }
        });
        this.f42266d.m64968M(list, i);
        if (list.size() < 5 || !m64995Q()) {
            if (NullChecker.m81303a(this.f42271i)) {
                this.f42271i.call(Boolean.FALSE);
            }
            xdl0.m208344M(this.f42267e, false);
            xdl0.m208344M(this.f42266d, true);
            this.f42266d.m64966H(i);
            return;
        }
        if (NullChecker.m81303a(this.f42271i)) {
            this.f42271i.call(Boolean.TRUE);
        }
        xdl0.m208344M(this.f42267e, true);
        xdl0.m208344M(this.f42266d, false);
        this.f42267e.m64984m(i);
    }

    public void setAction(e30<Boolean> e30Var) {
        this.f42271i = e30Var;
    }

    public void setClickOuterAction(d30 d30Var) {
        this.f42268f = d30Var;
    }

    public void setInteractionType(String str) {
        this.f42270h = str;
        this.f42266d.setInteractionType(str);
        this.f42267e.setInteractionType(str);
    }

    public PhotoAlbumInterestedHeaderView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42265c = new zpd0("show_interested_card_last_time_" + FeedModule.m60221F().userId(), 0L);
        m64993S(context);
    }

    public PhotoAlbumInterestedHeaderView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42265c = new zpd0("show_interested_card_last_time_" + FeedModule.m60221F().userId(), 0L);
        m64993S(context);
    }
}
