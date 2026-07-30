package com.p000p1.mobile.putong.core.p004ui.seepage.likers;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.b3c0;
import l.t100;
import l.uyf;
import l.vwb;
import l.xdl0;
import p006l.qib0;
import p006l.tae0;
import v.VDraweeView;
import v.VFrame_Shadow;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class FakeLikersItem extends VFrame_Shadow {

    /* JADX INFO: renamed from: h */
    public VDraweeView f5563h;

    /* JADX INFO: renamed from: i */
    public VText f5564i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f5565j;

    /* JADX INFO: renamed from: k */
    public TextView f5566k;

    /* JADX INFO: renamed from: l */
    public VText f5567l;

    /* JADX INFO: renamed from: m */
    public VImage f5568m;

    /* JADX INFO: renamed from: n */
    public User f5569n;

    /* JADX INFO: renamed from: o */
    public LikeLabelType f5570o;

    public enum LikeLabelType {
        HIDE("不展示"),
        VERIFY("认证邀请"),
        SUPER_LIKE("超级喜欢"),
        IMMEDIATELY_CHAT("即刻聊天"),
        NEW_LIKE("新的喜欢");

        String desc;

        LikeLabelType(String str) {
            this.desc = str;
        }
    }

    public FakeLikersItem(@NonNull Context context) {
        super(context);
        this.f5570o = LikeLabelType.HIDE;
    }

    public User getUser() {
        return this.f5569n;
    }

    /* JADX INFO: renamed from: h */
    public final void m8330h(View view) {
        uyf.a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public final void m8331i() {
        this.f5568m.setImageResource(b3c0.f2);
    }

    /* JADX INFO: renamed from: j */
    public final void m8332j(User user, long j) {
        xdl0.M0(this.f5564i, false);
        this.f5570o = LikeLabelType.HIDE;
        if (NullChecker.a(user.localRelationship) && NullChecker.a(user.localRelationship.cardInfo) && !vwb.J(user.localRelationship.cardInfo.cardTypes) && user.localRelationship.cardInfo.cardTypes.contains("newLikeAfterVerification")) {
            this.f5570o = LikeLabelType.VERIFY;
            this.f5564i.setText("来自邀请认证");
            this.f5564i.setTypeface(Typeface.DEFAULT_BOLD);
            this.f5564i.setBackgroundResource(qib0.f19804b0.f17707b.I4() ? b3c0.l2 : b3c0.k2);
            this.f5564i.setCompoundDrawablesWithIntrinsicBounds(qib0.f19804b0.f17707b.I4() ? b3c0.h2 : b3c0.g2, 0, 0, 0);
            xdl0.M0(this.f5564i, true);
            return;
        }
        if (user.superLikedMe()) {
            this.f5570o = LikeLabelType.SUPER_LIKE;
            xdl0.M0(this.f5564i, true);
            this.f5564i.setBackgroundResource(b3c0.m2);
            this.f5564i.setCompoundDrawablesWithIntrinsicBounds(b3c0.e2, 0, 0, 0);
            if (CoreModule.m1854P().m11706a().m5524sf() && NullChecker.a(user.localRelationship) && NullChecker.a(user.localRelationship.relationshipExtensions) && CoreModule.m1854P().m11706a().m5272Hl(user.localRelationship.relationshipExtensions.recvSuperLikedNum) > 1) {
                this.f5564i.setText(String.format("超级喜欢x%s", user.localRelationship.relationshipExtensions.recvSuperLikedNum));
                return;
            } else {
                this.f5564i.setText(String.format("%s超级喜欢你", user.isFemale() ? "她" : "他"));
                return;
            }
        }
        if (j == 0 || !NullChecker.a(user.localRelationship)) {
            return;
        }
        double d = user.localRelationship.updateTime;
        if (d == 0.0d || j >= d) {
            return;
        }
        this.f5570o = LikeLabelType.NEW_LIKE;
        xdl0.M0(this.f5564i, true);
        this.f5564i.setText("新喜欢");
        this.f5564i.setBackgroundResource(b3c0.k2);
        this.f5564i.setCompoundDrawablesWithIntrinsicBounds(b3c0.d2, 0, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public void m8333k(User user, long j) {
        this.f5569n = user;
        qib0.f19782G.m12749O(this.f5563h, user.fp().profileBig().formatted(), 3, 100);
        this.f5567l.setText(tae0.m24548i(user, getContext()));
        xdl0.M0(this.f5566k, tae0.m24555q(user));
        m8332j(user, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public void m8334l(User user) {
        this.f5569n = user;
        qib0.f19782G.m12749O(this.f5563h, user.fp().profileBig().formatted(), 4, 35);
        this.f5567l.setText(tae0.m24548i(user, getContext()));
        xdl0.M0(this.f5566k, tae0.m24555q(user));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8330h(this);
        m8331i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        super/*android.view.View*/.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) * 1.33f), 1073741824));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f5565j.getLayoutParams();
        int iY0 = (int) (((double) ((xdl0.y0() / 2) - t100.j)) * 1.33d * 0.3799999952316284d);
        if (layoutParams.height != iY0) {
            layoutParams.height = iY0;
            this.f5565j.setLayoutParams(layoutParams);
        }
    }

    public void setNewLikesBadgesText(String str) {
        if (this.f5570o == LikeLabelType.NEW_LIKE) {
            this.f5564i.setText(str);
        }
    }

    public FakeLikersItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5570o = LikeLabelType.HIDE;
    }

    public FakeLikersItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5570o = LikeLabelType.HIDE;
    }
}
