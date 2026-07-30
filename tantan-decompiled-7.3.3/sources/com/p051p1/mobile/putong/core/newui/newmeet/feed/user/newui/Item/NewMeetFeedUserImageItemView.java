package com.p051p1.mobile.putong.core.newui.newmeet.feed.user.newui.Item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import p151v.VDraweeView;
import p153l.gta;
import p153l.uqb0;
import p153l.zp30;

/* JADX INFO: loaded from: classes11.dex */
public class NewMeetFeedUserImageItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f27033a;

    public NewMeetFeedUserImageItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m43959a(View view) {
        zp30.m220811a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m43960b(Media media, boolean z) {
        if (TEnum.equals(media.status, "raw")) {
            CrashHelper.m82485i(new IllegalStateException("not supported yet"), "core_newmeet_image_uri", CrashHelper.ReportLevel.p6, 100);
            return;
        }
        Picture.ImageUri imageUriMo34785Xf = gta.m132210e().m132214d().mo34785Xf(media);
        if (imageUriMo34785Xf == null) {
            CrashHelper.m82485i(new IllegalStateException("not supported yet"), "core_newmeet_image_uri", CrashHelper.ReportLevel.p6, 100);
        } else if (z) {
            uqb0.f180374G.m127120O(this.f27033a, imageUriMo34785Xf.formatted(), 2, 40);
        } else {
            uqb0.f180374G.m127096B0(this.f27033a, imageUriMo34785Xf);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43959a(this);
    }

    public NewMeetFeedUserImageItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewMeetFeedUserImageItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
