package com.p000p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.mqi0;
import l.qib0;
import l.t100;
import l.xdl0;
import p007l.e1c0;
import p007l.u370;
import p007l.vqg;
import v.VDraweeView;
import v.VImage;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PhotoAlbumFallsFeedItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f2673a;

    /* JADX INFO: renamed from: b */
    public VText f2674b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f2675c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f2676d;

    /* JADX INFO: renamed from: e */
    public VText f2677e;

    /* JADX INFO: renamed from: f */
    public VText f2678f;

    /* JADX INFO: renamed from: g */
    public VImage f2679g;

    /* JADX INFO: renamed from: h */
    public VRecyclerView f2680h;

    /* JADX INFO: renamed from: i */
    public Moment f2681i;

    public PhotoAlbumFallsFeedItem(Context context) {
        super(context);
        this.f2681i = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m4648b(View view) {
        u370.m14724a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public Act m4649c() {
        return getContext();
    }

    /* JADX INFO: renamed from: d */
    public final String m4650d(Moment moment) {
        String strM15545v = vqg.m15545v(moment.location);
        String strG = mqi0.G(moment.createdTime);
        if (TextUtils.isEmpty(strG)) {
            return strM15545v;
        }
        return TextUtils.isEmpty(strM15545v) ? strG : m4649c().getString(R$string.f351E4, strM15545v, strG);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m4651e(int i, Moment moment, View view) {
        if (this.f2681i == null) {
            return;
        }
        m4649c().startActivityForResult(PhotoAlbumFeedAct.m5429X1(getContext(), FeedModule.m1139F().userId(), "from_nearby_falls_feed", i, ((DbObject) moment).id, 1), PhotoAlbumFallsFeedFrag.f2658G);
    }

    /* JADX INFO: renamed from: f */
    public boolean m4652f(final Moment moment, VRecyclerView vRecyclerView, final int i) {
        this.f2680h = vRecyclerView;
        boolean z = (NullChecker.a(this.f2681i) && !((DbObject) this.f2681i).id.equals(((DbObject) moment).id)) || this.f2681i == null;
        this.f2681i = moment;
        setOnClickListener(new View.OnClickListener() { // from class: l.t370
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13174a.m4651e(i, moment, view);
            }
        });
        this.f2673a.getHierarchy().E(new ColorDrawable(m4649c().getResources().getColor(e1c0.f7135d0)));
        User userM16628e8 = FeedModule.f316d.m16628e8(this.f2681i.owner);
        boolean zB = NullChecker.b(userM16628e8);
        VDraweeView vDraweeView = this.f2676d;
        if (zB) {
            vDraweeView.setVisibility(0);
            qib0.G.Q0(this.f2676d, userM16628e8.m1042fp().profileSmall());
        } else {
            vDraweeView.setVisibility(8);
        }
        this.f2677e.setText(m4650d(this.f2681i));
        this.f2678f.setText(this.f2681i.value);
        if (NullChecker.b(this.f2681i.media) && this.f2681i.media.size() != 0) {
            boolean z2 = this.f2681i.media.get(0) instanceof Video;
            VImage vImage = this.f2679g;
            if (z2) {
                vImage.setVisibility(0);
            } else {
                vImage.setVisibility(8);
            }
            xdl0.M(this.f2673a, true);
            xdl0.M(this.f2674b, false);
            qib0.G.J0(this.f2673a, this.f2681i.media.get(0).cover().calculatedWidth(xdl0.y0() / 2), false);
            xdl0.M(this.f2678f, true);
            return z;
        }
        xdl0.M(this.f2673a, false);
        xdl0.M(this.f2674b, !TextUtils.isEmpty(this.f2681i.value));
        xdl0.M(this.f2678f, false);
        this.f2679g.setVisibility(8);
        if (!TextUtils.isEmpty(this.f2681i.value)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f2674b.getLayoutParams();
            if (this.f2681i.value.length() <= 100) {
                layoutParams.height = xdl0.y0() / 2;
            } else {
                this.f2674b.setPadding(t100.d(28.0f), t100.d(28.0f), t100.d(28.0f), t100.d(28.0f));
            }
            this.f2674b.setLayoutParams(layoutParams);
            this.f2674b.setText(this.f2681i.value);
        }
        return z;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4648b(this);
    }

    public PhotoAlbumFallsFeedItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2681i = null;
    }

    public PhotoAlbumFallsFeedItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2681i = null;
    }
}
