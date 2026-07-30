package com.p046p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.e1c0;
import p149l.mqi0;
import p149l.qib0;
import p149l.t100;
import p149l.u370;
import p149l.vqg;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoAlbumFallsFeedItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f41212a;

    /* JADX INFO: renamed from: b */
    public VText f41213b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f41214c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f41215d;

    /* JADX INFO: renamed from: e */
    public VText f41216e;

    /* JADX INFO: renamed from: f */
    public VText f41217f;

    /* JADX INFO: renamed from: g */
    public VImage f41218g;

    /* JADX INFO: renamed from: h */
    public VRecyclerView f41219h;

    /* JADX INFO: renamed from: i */
    public Moment f41220i;

    public PhotoAlbumFallsFeedItem(Context context) {
        super(context);
        this.f41220i = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m63626b(View view) {
        u370.m191565a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public Act m63627c() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: d */
    public final String m63628d(Moment moment) {
        String strM199575v = vqg.m199575v(moment.location);
        String strM155932G = mqi0.m155932G(moment.createdTime);
        if (TextUtils.isEmpty(strM155932G)) {
            return strM199575v;
        }
        return TextUtils.isEmpty(strM199575v) ? strM155932G : m63627c().getString(R$string.f38890E4, strM199575v, strM155932G);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m63629e(int i, Moment moment, View view) {
        if (this.f41220i == null) {
            return;
        }
        m63627c().startActivityForResult(PhotoAlbumFeedAct.m64356X1(getContext(), FeedModule.m60221F().userId(), "from_nearby_falls_feed", i, moment.f56011id, 1), PhotoAlbumFallsFeedFrag.f41197G);
    }

    /* JADX INFO: renamed from: f */
    public boolean m63630f(final Moment moment, VRecyclerView vRecyclerView, final int i) {
        this.f41219h = vRecyclerView;
        boolean z = (NullChecker.m81303a(this.f41220i) && !this.f41220i.f56011id.equals(moment.f56011id)) || this.f41220i == null;
        this.f41220i = moment;
        setOnClickListener(new View.OnClickListener() { // from class: l.t370
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167597a.m63629e(i, moment, view);
            }
        });
        this.f41212a.getHierarchy().m112050E(new ColorDrawable(m63627c().getResources().getColor(e1c0.f88779d0)));
        User userM209447e8 = FeedModule.f38855d.m209447e8(this.f41220i.owner);
        boolean zM81304b = NullChecker.m81304b(userM209447e8);
        VDraweeView vDraweeView = this.f41215d;
        if (zM81304b) {
            vDraweeView.setVisibility(0);
            qib0.f154691G.m102341Q0(this.f41215d, userM209447e8.m60124fp().profileSmall());
        } else {
            vDraweeView.setVisibility(8);
        }
        this.f41216e.setText(m63628d(this.f41220i));
        this.f41217f.setText(this.f41220i.value);
        if (NullChecker.m81304b(this.f41220i.media) && this.f41220i.media.size() != 0) {
            boolean z2 = this.f41220i.media.get(0) instanceof Video;
            VImage vImage = this.f41218g;
            if (z2) {
                vImage.setVisibility(0);
            } else {
                vImage.setVisibility(8);
            }
            xdl0.m208344M(this.f41212a, true);
            xdl0.m208344M(this.f41213b, false);
            qib0.f154691G.m102327J0(this.f41212a, this.f41220i.media.get(0).cover().calculatedWidth(xdl0.m208412y0() / 2), false);
            xdl0.m208344M(this.f41217f, true);
            return z;
        }
        xdl0.m208344M(this.f41212a, false);
        xdl0.m208344M(this.f41213b, !TextUtils.isEmpty(this.f41220i.value));
        xdl0.m208344M(this.f41217f, false);
        this.f41218g.setVisibility(8);
        if (!TextUtils.isEmpty(this.f41220i.value)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f41213b.getLayoutParams();
            if (this.f41220i.value.length() <= 100) {
                layoutParams.height = xdl0.m208412y0() / 2;
            } else {
                this.f41213b.setPadding(t100.m186890d(28.0f), t100.m186890d(28.0f), t100.m186890d(28.0f), t100.m186890d(28.0f));
            }
            this.f41213b.setLayoutParams(layoutParams);
            this.f41213b.setText(this.f41220i.value);
        }
        return z;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m63626b(this);
    }

    public PhotoAlbumFallsFeedItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41220i = null;
    }

    public PhotoAlbumFallsFeedItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41220i = null;
    }
}
