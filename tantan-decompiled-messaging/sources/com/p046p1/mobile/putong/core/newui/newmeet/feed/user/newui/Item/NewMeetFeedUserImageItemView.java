package com.p046p1.mobile.putong.core.newui.newmeet.feed.user.newui.Item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import p147v.VDraweeView;
import p149l.lh30;
import p149l.qib0;
import p149l.ura;

/* JADX INFO: loaded from: classes11.dex */
public class NewMeetFeedUserImageItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f26291a;

    public NewMeetFeedUserImageItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m42948a(View view) {
        lh30.m149828a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m42949b(Media media, boolean z) {
        if (TEnum.equals(media.status, "raw")) {
            CrashHelper.m81302i(new IllegalStateException("not supported yet"), "core_newmeet_image_uri", CrashHelper.ReportLevel.p6, 100);
            return;
        }
        Picture.ImageUri imageUriMo33782Xf = ura.m195053e().m195057d().mo33782Xf(media);
        if (imageUriMo33782Xf == null) {
            CrashHelper.m81302i(new IllegalStateException("not supported yet"), "core_newmeet_image_uri", CrashHelper.ReportLevel.p6, 100);
        } else if (z) {
            qib0.f154691G.m102336O(this.f26291a, imageUriMo33782Xf.formatted(), 2, 40);
        } else {
            qib0.f154691G.m102312B0(this.f26291a, imageUriMo33782Xf);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42948a(this);
    }

    public NewMeetFeedUserImageItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewMeetFeedUserImageItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
