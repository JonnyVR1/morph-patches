package com.p046p1.mobile.putong.core.p053ui.likedusers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LikedUser;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.b3c0;
import p149l.e30;
import p149l.eqh0;
import p149l.ffr;
import p149l.mqi0;
import p149l.qib0;
import p149l.sb90;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class LikedUserItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f29973a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f29974b;

    /* JADX INFO: renamed from: c */
    public VText f29975c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f29976d;

    /* JADX INFO: renamed from: e */
    public VText f29977e;

    /* JADX INFO: renamed from: f */
    public View f29978f;

    /* JADX INFO: renamed from: g */
    public VText f29979g;

    /* JADX INFO: renamed from: h */
    public VImage f29980h;

    /* JADX INFO: renamed from: i */
    public VImage f29981i;

    /* JADX INFO: renamed from: j */
    public VText f29982j;

    /* JADX INFO: renamed from: k */
    public VText f29983k;

    /* JADX INFO: renamed from: l */
    public VText f29984l;

    /* JADX INFO: renamed from: m */
    public VText f29985m;

    /* JADX INFO: renamed from: n */
    public View f29986n;

    /* JADX INFO: renamed from: o */
    public LikedUser f29987o;

    public LikedUserItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public static String m46794e(int i) {
        if (i <= 100 || i < 1000) {
            return "1km";
        }
        if (i >= 100000) {
            return "99+km";
        }
        return (i / 1000) + "km";
    }

    /* JADX INFO: renamed from: c */
    public final void m46795c(View view) {
        ffr.m121182a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m46796d() {
        return (Act) xdl0.m208326D(getContext());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m46797f(e30 e30Var, LikedUser likedUser, View view) {
        if (m46796d().lifecycle_() == C4319c.f15548i && NullChecker.m81303a(e30Var)) {
            e30Var.call(likedUser);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m46798g(e30 e30Var, LikedUser likedUser, View view) {
        if (m46796d().lifecycle_() != C4319c.f15548i) {
            return;
        }
        e30Var.call(Boolean.valueOf(TEnum.equals(likedUser.status, "superliked")));
    }

    /* JADX INFO: renamed from: h */
    public void m46799h(final LikedUser likedUser, User user, boolean z, final e30<LikedUser> e30Var, final e30<Boolean> e30Var2) {
        this.f29987o = likedUser;
        xdl0.m208342L(this, new View.OnClickListener() { // from class: l.dfr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85972a.m46797f(e30Var, likedUser, view);
            }
        });
        xdl0.m208342L(this.f29980h, new View.OnClickListener() { // from class: l.efr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90854a.m46798g(e30Var2, likedUser, view);
            }
        });
        if (sb90.m183207c(user)) {
            qib0.f154691G.m102336O(this.f29973a, user.m60124fp().profileMiddle().formatted(), 3, 100);
        } else {
            qib0.f154691G.m102335N0(this.f29973a, user.m60124fp().profileMiddle().formatted(), false);
        }
        xdl0.m208344M(this.f29986n, z);
        xdl0.m208344M(this.f29981i, false);
        ConstraintLayout constraintLayout = this.f29974b;
        if (z) {
            xdl0.m208344M(constraintLayout, false);
            xdl0.m208344M(this.f29983k, false);
            xdl0.m208344M(this.f29985m, false);
            xdl0.m208344M(this.f29982j, false);
            return;
        }
        xdl0.m208344M(constraintLayout, true);
        xdl0.m208344M(this.f29985m, true);
        this.f29985m.setText(TEnum.equals(likedUser.otherStatus, RelationshipStatus.disliked) ? R$string.f20699y : R$string.f20702z);
        this.f29977e.setText(String.valueOf(user.age));
        xdl0.m208344M(this.f29978f, true);
        xdl0.m208344M(this.f29979g, true);
        this.f29979g.setText(m46794e(user.location.distance));
        boolean zEquals = TEnum.equals(likedUser.status, "superliked");
        VText vText = this.f29985m;
        if (zEquals) {
            xdl0.m208344M(vText, true);
            xdl0.m208344M(this.f29983k, true);
            if (!CoreModule.m29935P().m94651a().mo33587sf() || CoreModule.m29935P().m94651a().mo33335Hl(likedUser.relationshipExt.sendSuperLikedNum) <= 1) {
                this.f29983k.setText(CoreModule.f17544b.getString(R$string.f20563A));
                this.f29983k.setTypeface(eqh0.m117752c(2), 1);
            } else {
                this.f29983k.setTypeface(eqh0.m117752c(2), 1);
                this.f29983k.setText(String.format("超级喜欢x%s", likedUser.relationshipExt.sendSuperLikedNum));
            }
            xdl0.m208345M0(this.f29975c, false);
            xdl0.m208344M(this.f29980h, !CoreModule.m29934N().mo60267Co());
            xdl0.m208344M(this.f29984l, false);
            this.f29980h.setImageResource(b3c0.f73139r0);
        } else {
            xdl0.m208344M(vText, true);
            xdl0.m208344M(this.f29984l, false);
            xdl0.m208344M(this.f29980h, true);
            if (user.isHideActiveFromSVip() || mqi0.m155944o() - Math.round(user.location.updatedTime) > 180000) {
                xdl0.m208345M0(this.f29975c, false);
            } else {
                xdl0.m208345M0(this.f29975c, true);
            }
            xdl0.m208344M(this.f29983k, false);
            this.f29980h.setImageResource(b3c0.f73147s0);
        }
        this.f29974b.setBackground(getResources().getDrawable(b3c0.f73131q0));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46795c(this);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f29974b.getLayoutParams();
        int iM208412y0 = (int) (((double) ((xdl0.m208412y0() / 2) - t100.f167261j)) * 1.33d * 0.3799999952316284d);
        if (layoutParams.height != iM208412y0) {
            layoutParams.height = iM208412y0;
            this.f29974b.setLayoutParams(layoutParams);
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
