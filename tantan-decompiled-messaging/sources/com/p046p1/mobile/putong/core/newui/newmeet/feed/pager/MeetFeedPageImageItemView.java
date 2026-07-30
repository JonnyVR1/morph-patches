package com.p046p1.mobile.putong.core.newui.newmeet.feed.pager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import p147v.VDraweeView;
import p149l.a1y;
import p149l.e30;
import p149l.qib0;
import p149l.ura;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class MeetFeedPageImageItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f26274a;

    /* JADX INFO: renamed from: b */
    public View f26275b;

    /* JADX INFO: renamed from: c */
    public View f26276c;

    /* JADX INFO: renamed from: d */
    public View f26277d;

    public MeetFeedPageImageItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m42939c(View view) {
        a1y.m94583a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m42940d(Media media, final e30<Boolean> e30Var) {
        Picture.ImageUri imageUriMo33782Xf;
        if (TEnum.equals(media.status, "raw") || (imageUriMo33782Xf = ura.m195053e().m195057d().mo33782Xf(media)) == null) {
            CrashHelper.m81302i(new IllegalStateException("not supported yet"), "core_newmeet_image_uri", CrashHelper.ReportLevel.p6, 100);
        } else {
            qib0.f154691G.m102312B0(this.f26274a, imageUriMo33782Xf);
        }
        xdl0.m208329E0(this.f26276c, new View.OnClickListener() { // from class: l.y0y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(Boolean.TRUE);
            }
        });
        xdl0.m208329E0(this.f26277d, new View.OnClickListener() { // from class: l.z0y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(Boolean.FALSE);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42939c(this);
    }

    public MeetFeedPageImageItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MeetFeedPageImageItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
