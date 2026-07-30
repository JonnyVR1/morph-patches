package com.p051p1.mobile.putong.core.newui.newmeet.feed.pager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.gta;
import p153l.uqb0;
import p153l.x9y;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class MeetFeedPageImageItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f27016a;

    /* JADX INFO: renamed from: b */
    public View f27017b;

    /* JADX INFO: renamed from: c */
    public View f27018c;

    /* JADX INFO: renamed from: d */
    public View f27019d;

    public MeetFeedPageImageItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m43950c(View view) {
        x9y.m209823a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m43951d(Media media, final y20<Boolean> y20Var) {
        Picture.ImageUri imageUriMo34785Xf;
        if (TEnum.equals(media.status, "raw") || (imageUriMo34785Xf = gta.m132210e().m132214d().mo34785Xf(media)) == null) {
            CrashHelper.m82485i(new IllegalStateException("not supported yet"), "core_newmeet_image_uri", CrashHelper.ReportLevel.p6, 100);
        } else {
            uqb0.f180374G.m127096B0(this.f27016a, imageUriMo34785Xf);
        }
        bnl0.m105509E0(this.f27018c, new View.OnClickListener() { // from class: l.v9y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(Boolean.TRUE);
            }
        });
        bnl0.m105509E0(this.f27019d, new View.OnClickListener() { // from class: l.w9y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(Boolean.FALSE);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43950c(this);
    }

    public MeetFeedPageImageItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MeetFeedPageImageItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
