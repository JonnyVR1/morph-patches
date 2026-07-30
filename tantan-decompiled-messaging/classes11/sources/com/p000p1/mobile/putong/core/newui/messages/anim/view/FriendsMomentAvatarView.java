package com.p000p1.mobile.putong.core.newui.messages.anim.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.ftd0;
import l.qib0;
import l.t100;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class FriendsMomentAvatarView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f4198a;

    public FriendsMomentAvatarView(@NonNull Context context) {
        super(context);
        m6062a();
    }

    /* JADX INFO: renamed from: a */
    public void m6062a() {
        VDraweeView vDraweeView = new VDraweeView(getContext());
        this.f4198a = vDraweeView;
        m6063b(vDraweeView);
        addView((View) this.f4198a, (ViewGroup.LayoutParams) new FrameLayout.LayoutParams(t100.d(23.0f), t100.d(23.0f)));
    }

    /* JADX INFO: renamed from: b */
    public final void m6063b(VDraweeView vDraweeView) {
        vDraweeView.getHierarchy().w(ftd0.a);
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.v(true);
        vDraweeView.getHierarchy().H(roundingParams);
    }

    /* JADX INFO: renamed from: c */
    public void m6064c(User user, d30 d30Var) {
        if (NullChecker.a(user)) {
            qib0.G.Q0(this.f4198a, user.fp().profileSmall());
        }
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m6065d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        qib0.G.L0(this.f4198a, str);
    }

    public FriendsMomentAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m6062a();
    }

    public FriendsMomentAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6062a();
    }
}
