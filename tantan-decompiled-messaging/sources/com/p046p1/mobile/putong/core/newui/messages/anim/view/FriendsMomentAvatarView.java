package com.p046p1.mobile.putong.core.newui.messages.anim.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p149l.d30;
import p149l.ftd0;
import p149l.qib0;
import p149l.t100;

/* JADX INFO: loaded from: classes11.dex */
public class FriendsMomentAvatarView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f25420a;

    public FriendsMomentAvatarView(@NonNull Context context) {
        super(context);
        m41920a();
    }

    /* JADX INFO: renamed from: a */
    public void m41920a() {
        VDraweeView vDraweeView = new VDraweeView(getContext());
        this.f25420a = vDraweeView;
        m41921b(vDraweeView);
        addView(this.f25420a, new FrameLayout.LayoutParams(t100.m186890d(23.0f), t100.m186890d(23.0f)));
    }

    /* JADX INFO: renamed from: b */
    public final void m41921b(VDraweeView vDraweeView) {
        vDraweeView.getHierarchy().m112076w(ftd0.f99177a);
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8268v(true);
        vDraweeView.getHierarchy().m112053H(roundingParams);
    }

    /* JADX INFO: renamed from: c */
    public void m41922c(User user, d30 d30Var) {
        if (NullChecker.m81303a(user)) {
            qib0.f154691G.m102341Q0(this.f25420a, user.m60124fp().profileSmall());
        }
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m41923d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        qib0.f154691G.m102331L0(this.f25420a, str);
    }

    public FriendsMomentAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m41920a();
    }

    public FriendsMomentAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m41920a();
    }
}
