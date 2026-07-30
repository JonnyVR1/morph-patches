package com.p051p1.mobile.putong.core.p058ui.seepage.likers;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VFrame_Shadow;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.gbc0;
import p153l.i0g;
import p153l.jyb;
import p153l.qa00;
import p153l.uqb0;
import p153l.yie0;

/* JADX INFO: loaded from: classes12.dex */
public class FakeLikersItem extends VFrame_Shadow {

    /* JADX INFO: renamed from: h */
    public VDraweeView f36630h;

    /* JADX INFO: renamed from: i */
    public VText f36631i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f36632j;

    /* JADX INFO: renamed from: k */
    public TextView f36633k;

    /* JADX INFO: renamed from: l */
    public VText f36634l;

    /* JADX INFO: renamed from: m */
    public VImage f36635m;

    /* JADX INFO: renamed from: n */
    public User f36636n;

    /* JADX INFO: renamed from: o */
    public LikeLabelType f36637o;

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
        this.f36637o = LikeLabelType.HIDE;
    }

    public User getUser() {
        return this.f36636n;
    }

    /* JADX INFO: renamed from: h */
    public final void m56148h(View view) {
        i0g.m137971a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public final void m56149i() {
        this.f36635m.setImageResource(gbc0.f103296f2);
    }

    /* JADX INFO: renamed from: j */
    public final void m56150j(User user, long j) {
        bnl0.m105525M0(this.f36631i, false);
        this.f36637o = LikeLabelType.HIDE;
        if (NullChecker.m82486a(user.localRelationship) && NullChecker.m82486a(user.localRelationship.cardInfo) && !jyb.m147479J(user.localRelationship.cardInfo.cardTypes) && user.localRelationship.cardInfo.cardTypes.contains("newLikeAfterVerification")) {
            this.f36637o = LikeLabelType.VERIFY;
            this.f36631i.setText("来自邀请认证");
            this.f36631i.setTypeface(Typeface.DEFAULT_BOLD);
            this.f36631i.setBackgroundResource(uqb0.f180396b0.f170325b.mo31695I4() ? gbc0.f103344l2 : gbc0.f103336k2);
            this.f36631i.setCompoundDrawablesWithIntrinsicBounds(uqb0.f180396b0.f170325b.mo31695I4() ? gbc0.f103312h2 : gbc0.f103304g2, 0, 0, 0);
            bnl0.m105525M0(this.f36631i, true);
            return;
        }
        if (user.superLikedMe()) {
            this.f36637o = LikeLabelType.SUPER_LIKE;
            bnl0.m105525M0(this.f36631i, true);
            this.f36631i.setBackgroundResource(gbc0.f103352m2);
            this.f36631i.setCompoundDrawablesWithIntrinsicBounds(gbc0.f103288e2, 0, 0, 0);
            if (CoreModule.m30933P().m143405a().mo34590sf() && NullChecker.m82486a(user.localRelationship) && NullChecker.m82486a(user.localRelationship.relationshipExtensions) && CoreModule.m30933P().m143405a().mo34338Hl(user.localRelationship.relationshipExtensions.recvSuperLikedNum) > 1) {
                this.f36631i.setText(String.format("超级喜欢x%s", user.localRelationship.relationshipExtensions.recvSuperLikedNum));
                return;
            } else {
                this.f36631i.setText(String.format("%s超级喜欢你", user.isFemale() ? "她" : "他"));
                return;
            }
        }
        if (j == 0 || !NullChecker.m82486a(user.localRelationship)) {
            return;
        }
        double d = user.localRelationship.updateTime;
        if (d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || j >= d) {
            return;
        }
        this.f36637o = LikeLabelType.NEW_LIKE;
        bnl0.m105525M0(this.f36631i, true);
        this.f36631i.setText("新喜欢");
        this.f36631i.setBackgroundResource(gbc0.f103336k2);
        this.f36631i.setCompoundDrawablesWithIntrinsicBounds(gbc0.f103280d2, 0, 0, 0);
    }

    /* JADX INFO: renamed from: k */
    public void m56151k(User user, long j) {
        this.f36636n = user;
        uqb0.f180374G.m127120O(this.f36630h, user.m61308fp().profileBig().formatted(), 3, 100);
        this.f36634l.setText(yie0.m216077i(user, getContext()));
        bnl0.m105525M0(this.f36633k, yie0.m216084q(user));
        m56150j(user, j);
    }

    /* JADX INFO: renamed from: l */
    public void m56152l(User user) {
        this.f36636n = user;
        uqb0.f180374G.m127120O(this.f36630h, user.m61308fp().profileBig().formatted(), 4, 35);
        this.f36634l.setText(yie0.m216077i(user, getContext()));
        bnl0.m105525M0(this.f36633k, yie0.m216084q(user));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56148h(this);
        m56149i();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) * 1.33f), 1073741824));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f36632j.getLayoutParams();
        int iM105592y0 = (int) (((double) ((bnl0.m105592y0() / 2) - qa00.f156323j)) * 1.33d * 0.3799999952316284d);
        if (layoutParams.height != iM105592y0) {
            layoutParams.height = iM105592y0;
            this.f36632j.setLayoutParams(layoutParams);
        }
    }

    public void setNewLikesBadgesText(String str) {
        if (this.f36637o == LikeLabelType.NEW_LIKE) {
            this.f36631i.setText(str);
        }
    }

    public FakeLikersItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36637o = LikeLabelType.HIDE;
    }

    public FakeLikersItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36637o = LikeLabelType.HIDE;
    }
}
