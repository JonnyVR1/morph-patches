package com.p051p1.mobile.putong.core.p058ui.likedusers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LikedUser;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.gbc0;
import p153l.ghr;
import p153l.lyh0;
import p153l.pzi0;
import p153l.qa00;
import p153l.uqb0;
import p153l.wj90;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class LikedUserItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f30821a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f30822b;

    /* JADX INFO: renamed from: c */
    public VText f30823c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f30824d;

    /* JADX INFO: renamed from: e */
    public VText f30825e;

    /* JADX INFO: renamed from: f */
    public View f30826f;

    /* JADX INFO: renamed from: g */
    public VText f30827g;

    /* JADX INFO: renamed from: h */
    public VImage f30828h;

    /* JADX INFO: renamed from: i */
    public VImage f30829i;

    /* JADX INFO: renamed from: j */
    public VText f30830j;

    /* JADX INFO: renamed from: k */
    public VText f30831k;

    /* JADX INFO: renamed from: l */
    public VText f30832l;

    /* JADX INFO: renamed from: m */
    public VText f30833m;

    /* JADX INFO: renamed from: n */
    public View f30834n;

    /* JADX INFO: renamed from: o */
    public LikedUser f30835o;

    public LikedUserItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public static String m47977e(int i) {
        if (i <= 100 || i < 1000) {
            return "1km";
        }
        if (i >= 100000) {
            return "99+km";
        }
        return (i / 1000) + "km";
    }

    /* JADX INFO: renamed from: c */
    public final void m47978c(View view) {
        ghr.m130260a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m47979d() {
        return (Act) bnl0.m105506D(getContext());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m47980f(y20 y20Var, LikedUser likedUser, View view) {
        if (m47979d().lifecycle_() == C4470c.f16267i && NullChecker.m82486a(y20Var)) {
            y20Var.call(likedUser);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m47981g(y20 y20Var, LikedUser likedUser, View view) {
        if (m47979d().lifecycle_() != C4470c.f16267i) {
            return;
        }
        y20Var.call(Boolean.valueOf(TEnum.equals(likedUser.status, "superliked")));
    }

    /* JADX INFO: renamed from: h */
    public void m47982h(final LikedUser likedUser, User user, boolean z, final y20<LikedUser> y20Var, final y20<Boolean> y20Var2) {
        this.f30835o = likedUser;
        bnl0.m105522L(this, new View.OnClickListener() { // from class: l.ehr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f94065a.m47980f(y20Var, likedUser, view);
            }
        });
        bnl0.m105522L(this.f30828h, new View.OnClickListener() { // from class: l.fhr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99102a.m47981g(y20Var2, likedUser, view);
            }
        });
        if (wj90.m206620c(user)) {
            uqb0.f180374G.m127120O(this.f30821a, user.m61308fp().profileMiddle().formatted(), 3, 100);
        } else {
            uqb0.f180374G.m127119N0(this.f30821a, user.m61308fp().profileMiddle().formatted(), false);
        }
        bnl0.m105524M(this.f30834n, z);
        bnl0.m105524M(this.f30829i, false);
        ConstraintLayout constraintLayout = this.f30822b;
        if (z) {
            bnl0.m105524M(constraintLayout, false);
            bnl0.m105524M(this.f30831k, false);
            bnl0.m105524M(this.f30833m, false);
            bnl0.m105524M(this.f30830j, false);
            return;
        }
        bnl0.m105524M(constraintLayout, true);
        bnl0.m105524M(this.f30833m, true);
        this.f30833m.setText(TEnum.equals(likedUser.otherStatus, RelationshipStatus.disliked) ? R$string.f21441y : R$string.f21444z);
        this.f30825e.setText(String.valueOf(user.age));
        bnl0.m105524M(this.f30826f, true);
        bnl0.m105524M(this.f30827g, true);
        this.f30827g.setText(m47977e(user.location.distance));
        boolean zEquals = TEnum.equals(likedUser.status, "superliked");
        VText vText = this.f30833m;
        if (zEquals) {
            bnl0.m105524M(vText, true);
            bnl0.m105524M(this.f30831k, true);
            if (!CoreModule.m30933P().m143405a().mo34590sf() || CoreModule.m30933P().m143405a().mo34338Hl(likedUser.relationshipExt.sendSuperLikedNum) <= 1) {
                this.f30831k.setText(CoreModule.f18263b.getString(R$string.f21305A));
                this.f30831k.setTypeface(lyh0.m156283c(2), 1);
            } else {
                this.f30831k.setTypeface(lyh0.m156283c(2), 1);
                this.f30831k.setText(String.format("超级喜欢x%s", likedUser.relationshipExt.sendSuperLikedNum));
            }
            bnl0.m105525M0(this.f30823c, false);
            bnl0.m105524M(this.f30828h, !CoreModule.m30932N().mo61451Co());
            bnl0.m105524M(this.f30832l, false);
            this.f30828h.setImageResource(gbc0.f103390r0);
        } else {
            bnl0.m105524M(vText, true);
            bnl0.m105524M(this.f30832l, false);
            bnl0.m105524M(this.f30828h, true);
            if (user.isHideActiveFromSVip() || pzi0.m174454o() - Math.round(user.location.updatedTime) > 180000) {
                bnl0.m105525M0(this.f30823c, false);
            } else {
                bnl0.m105525M0(this.f30823c, true);
            }
            bnl0.m105524M(this.f30831k, false);
            this.f30828h.setImageResource(gbc0.f103398s0);
        }
        this.f30822b.setBackground(getResources().getDrawable(gbc0.f103382q0));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47978c(this);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f30822b.getLayoutParams();
        int iM105592y0 = (int) (((double) ((bnl0.m105592y0() / 2) - qa00.f156323j)) * 1.33d * 0.3799999952316284d);
        if (layoutParams.height != iM105592y0) {
            layoutParams.height = iM105592y0;
            this.f30822b.setLayoutParams(layoutParams);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (((double) View.MeasureSpec.getSize(i)) * 1.33d), View.MeasureSpec.getMode(i2)));
    }

    public LikedUserItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LikedUserItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
