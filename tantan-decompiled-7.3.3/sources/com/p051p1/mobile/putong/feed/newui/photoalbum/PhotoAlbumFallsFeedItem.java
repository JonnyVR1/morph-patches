package com.p051p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.ac70;
import p153l.bnl0;
import p153l.k9c0;
import p153l.ksg;
import p153l.pzi0;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class PhotoAlbumFallsFeedItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f42060a;

    /* JADX INFO: renamed from: b */
    public VText f42061b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f42062c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f42063d;

    /* JADX INFO: renamed from: e */
    public VText f42064e;

    /* JADX INFO: renamed from: f */
    public VText f42065f;

    /* JADX INFO: renamed from: g */
    public VImage f42066g;

    /* JADX INFO: renamed from: h */
    public VRecyclerView f42067h;

    /* JADX INFO: renamed from: i */
    public Moment f42068i;

    public PhotoAlbumFallsFeedItem(Context context) {
        super(context);
        this.f42068i = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m64809b(View view) {
        ac70.m96805a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public Act m64810c() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: d */
    public final String m64811d(Moment moment) {
        String strM151234v = ksg.m151234v(moment.location);
        String strM174442G = pzi0.m174442G(moment.createdTime);
        if (TextUtils.isEmpty(strM174442G)) {
            return strM151234v;
        }
        return TextUtils.isEmpty(strM151234v) ? strM174442G : m64810c().getString(R$string.f39738E4, strM151234v, strM174442G);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m64812e(int i, Moment moment, View view) {
        if (this.f42068i == null) {
            return;
        }
        m64810c().startActivityForResult(PhotoAlbumFeedAct.m65539Y1(getContext(), FeedModule.m61405F().userId(), "from_nearby_falls_feed", i, moment.f56859id, 1), PhotoAlbumFallsFeedFrag.f42045G);
    }

    /* JADX INFO: renamed from: f */
    public boolean m64813f(final Moment moment, VRecyclerView vRecyclerView, final int i) {
        this.f42067h = vRecyclerView;
        boolean z = (NullChecker.m82486a(this.f42068i) && !this.f42068i.f56859id.equals(moment.f56859id)) || this.f42068i == null;
        this.f42068i = moment;
        setOnClickListener(new View.OnClickListener() { // from class: l.zb70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203630a.m64812e(i, moment, view);
            }
        });
        this.f42060a.getHierarchy().m207042E(new ColorDrawable(m64810c().getResources().getColor(k9c0.f124502d0)));
        User userM145688e8 = FeedModule.f39703d.m145688e8(this.f42068i.owner);
        boolean zM82487b = NullChecker.m82487b(userM145688e8);
        VDraweeView vDraweeView = this.f42063d;
        if (zM82487b) {
            vDraweeView.setVisibility(0);
            uqb0.f180374G.m127125Q0(this.f42063d, userM145688e8.m61308fp().profileSmall());
        } else {
            vDraweeView.setVisibility(8);
        }
        this.f42064e.setText(m64811d(this.f42068i));
        this.f42065f.setText(this.f42068i.value);
        if (NullChecker.m82487b(this.f42068i.media) && this.f42068i.media.size() != 0) {
            boolean z2 = this.f42068i.media.get(0) instanceof Video;
            VImage vImage = this.f42066g;
            if (z2) {
                vImage.setVisibility(0);
            } else {
                vImage.setVisibility(8);
            }
            bnl0.m105524M(this.f42060a, true);
            bnl0.m105524M(this.f42061b, false);
            uqb0.f180374G.m127111J0(this.f42060a, this.f42068i.media.get(0).cover().calculatedWidth(bnl0.m105592y0() / 2), false);
            bnl0.m105524M(this.f42065f, true);
            return z;
        }
        bnl0.m105524M(this.f42060a, false);
        bnl0.m105524M(this.f42061b, !TextUtils.isEmpty(this.f42068i.value));
        bnl0.m105524M(this.f42065f, false);
        this.f42066g.setVisibility(8);
        if (!TextUtils.isEmpty(this.f42068i.value)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f42061b.getLayoutParams();
            if (this.f42068i.value.length() <= 100) {
                layoutParams.height = bnl0.m105592y0() / 2;
            } else {
                this.f42061b.setPadding(qa00.m175859d(28.0f), qa00.m175859d(28.0f), qa00.m175859d(28.0f), qa00.m175859d(28.0f));
            }
            this.f42061b.setLayoutParams(layoutParams);
            this.f42061b.setText(this.f42068i.value);
        }
        return z;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m64809b(this);
    }

    public PhotoAlbumFallsFeedItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42068i = null;
    }

    public PhotoAlbumFallsFeedItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42068i = null;
    }
}
