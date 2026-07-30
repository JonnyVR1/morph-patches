package com.p000p1.mobile.putong.core.newui.newmeet.feed.pager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import l.a1y;
import l.e30;
import l.qib0;
import l.ura;
import l.xdl0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MeetFeedPageImageItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f5052a;

    /* JADX INFO: renamed from: b */
    public View f5053b;

    /* JADX INFO: renamed from: c */
    public View f5054c;

    /* JADX INFO: renamed from: d */
    public View f5055d;

    public MeetFeedPageImageItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m7134c(View view) {
        a1y.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m7135d(Media media, final e30<Boolean> e30Var) {
        Picture.ImageUri imageUriXf;
        if (TEnum.equals(media.status, "raw") || (imageUriXf = ura.e().d().Xf(media)) == null) {
            CrashHelper.i(new IllegalStateException("not supported yet"), "core_newmeet_image_uri", CrashHelper.ReportLevel.p6, 100);
        } else {
            qib0.G.B0(this.f5052a, imageUriXf);
        }
        xdl0.E0(this.f5054c, new View.OnClickListener() { // from class: l.y0y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(Boolean.TRUE);
            }
        });
        xdl0.E0(this.f5055d, new View.OnClickListener() { // from class: l.z0y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(Boolean.FALSE);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7134c(this);
    }

    public MeetFeedPageImageItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MeetFeedPageImageItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
