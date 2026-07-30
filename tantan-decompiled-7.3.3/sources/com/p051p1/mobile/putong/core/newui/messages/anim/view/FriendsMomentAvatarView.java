package com.p051p1.mobile.putong.core.newui.messages.anim.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p153l.h1e0;
import p153l.qa00;
import p153l.uqb0;
import p153l.x20;

/* JADX INFO: loaded from: classes11.dex */
public class FriendsMomentAvatarView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f26162a;

    public FriendsMomentAvatarView(@NonNull Context context) {
        super(context);
        m42931a();
    }

    /* JADX INFO: renamed from: a */
    public void m42931a() {
        VDraweeView vDraweeView = new VDraweeView(getContext());
        this.f26162a = vDraweeView;
        m42932b(vDraweeView);
        addView(this.f26162a, new FrameLayout.LayoutParams(qa00.m175859d(23.0f), qa00.m175859d(23.0f)));
    }

    /* JADX INFO: renamed from: b */
    public final void m42932b(VDraweeView vDraweeView) {
        vDraweeView.getHierarchy().m207062w(h1e0.f107444a);
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8322v(true);
        vDraweeView.getHierarchy().m207045H(roundingParams);
    }

    /* JADX INFO: renamed from: c */
    public void m42933c(User user, x20 x20Var) {
        if (NullChecker.m82486a(user)) {
            uqb0.f180374G.m127125Q0(this.f26162a, user.m61308fp().profileSmall());
        }
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m42934d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        uqb0.f180374G.m127115L0(this.f26162a, str);
    }

    public FriendsMomentAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m42931a();
    }

    public FriendsMomentAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m42931a();
    }
}
