package com.p000p1.mobile.putong.core.newui.newmeet.feed.user.newui.Item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import l.lh30;
import l.qib0;
import l.ura;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class NewMeetFeedUserImageItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f5069a;

    public NewMeetFeedUserImageItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7143a(View view) {
        lh30.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m7144b(Media media, boolean z) {
        if (TEnum.equals(media.status, "raw")) {
            CrashHelper.i(new IllegalStateException("not supported yet"), "core_newmeet_image_uri", CrashHelper.ReportLevel.p6, 100);
            return;
        }
        Picture.ImageUri imageUriXf = ura.e().d().Xf(media);
        if (imageUriXf == null) {
            CrashHelper.i(new IllegalStateException("not supported yet"), "core_newmeet_image_uri", CrashHelper.ReportLevel.p6, 100);
        } else if (z) {
            qib0.G.O(this.f5069a, imageUriXf.formatted(), 2, 40);
        } else {
            qib0.G.B0(this.f5069a, imageUriXf);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7143a(this);
    }

    public NewMeetFeedUserImageItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewMeetFeedUserImageItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
