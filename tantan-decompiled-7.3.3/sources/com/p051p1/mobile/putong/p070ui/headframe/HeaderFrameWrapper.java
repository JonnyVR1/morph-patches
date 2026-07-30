package com.p051p1.mobile.putong.p070ui.headframe;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.DrawableRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import p151v.VDraweeView;
import p153l.a0l;
import p153l.bnl0;
import p153l.i4g0;
import p153l.jec0;
import p153l.jhc0;
import p153l.jyb;
import p153l.uqb0;

/* JADX INFO: loaded from: classes10.dex */
public class HeaderFrameWrapper extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f55376d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f55377e;

    /* JADX INFO: renamed from: f */
    public int f55378f;

    /* JADX INFO: renamed from: g */
    public int f55379g;

    /* JADX INFO: renamed from: h */
    public int f55380h;

    /* JADX INFO: renamed from: i */
    public boolean f55381i;

    /* JADX INFO: renamed from: j */
    public boolean f55382j;

    /* JADX INFO: renamed from: k */
    public String f55383k;

    public HeaderFrameWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55382j = true;
        this.f55383k = "";
        m80883l0(attributeSet, -1);
    }

    /* JADX INFO: renamed from: B0 */
    public void m80875B0(String str) {
        uqb0.f180374G.m127115L0(this.f55376d, str);
        bnl0.m105524M(this.f55377e, false);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m80876D0(User user) {
        if (user == null || TextUtils.isEmpty(this.f55383k)) {
            return;
        }
        i4g0.m138492A("e_audio_avatar_frame", this.f55383k, jyb.m147494Y("other_user_id", user.f56859id), jyb.m147494Y("is_oneself", Boolean.valueOf(user.isMe())));
    }

    /* JADX INFO: renamed from: E0 */
    public void m80877E0(boolean z, String str) {
        this.f55381i = z;
        this.f55383k = str;
    }

    /* JADX INFO: renamed from: G0 */
    public void m80878G0(boolean z) {
        bnl0.m105524M(this.f55377e, z);
    }

    public VDraweeView get_frame() {
        return this.f55377e;
    }

    public VDraweeView get_pic() {
        return this.f55376d;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m80879h0(View view) {
        a0l.m95403a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m80880i0(String str, int i, int i2) {
        uqb0.f180374G.m127120O(this.f55376d, str, i, i2);
        bnl0.m105524M(this.f55377e, false);
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m80881j0(User user) {
        return user.needShowLiveFrame() && this.f55381i;
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m80882k0(User user) {
        return user.needShowFrame();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m80883l0(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, jhc0.f120910h0, i, 0);
        this.f55380h = typedArrayObtainStyledAttributes.getResourceId(jhc0.f120916j0, -1);
        this.f55379g = typedArrayObtainStyledAttributes.getResourceId(jhc0.f120913i0, -1);
        this.f55378f = typedArrayObtainStyledAttributes.getResourceId(jhc0.f120919k0, -1);
        this.f55381i = typedArrayObtainStyledAttributes.getBoolean(jhc0.f120922l0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m80884m0(User user) {
        if (bnl0.m105529O0(this)) {
            return !(m80882k0(user) && this.f55382j) && m80881j0(user) && bnl0.m105529O0(this.f55377e);
        }
        return false;
    }

    /* JADX INFO: renamed from: n0 */
    public void m80885n0(User user) {
        m80886o0(user, 0);
    }

    /* JADX INFO: renamed from: o0 */
    public void m80886o0(User user, int i) {
        if (m80882k0(user) && this.f55382j) {
            uqb0.f180374G.m127115L0(this.f55377e, user.headFrameUrl());
            m80878G0(true);
        } else {
            if (!m80881j0(user)) {
                m80878G0(false);
                return;
            }
            uqb0.f180374G.m127115L0(this.f55377e, user.liveHeadFrameConfig().getMediumUrl());
            m80876D0(user);
            m80878G0(true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater.from(getContext()).inflate(jec0.f120456b, (ViewGroup) this, true);
        m80879h0(this);
        if (this.f55380h != -1) {
            this.f55376d.setForeground(getContext().getDrawable(this.f55380h));
        }
        int i = this.f55378f;
        if (i != -1) {
            setPicPlace(i);
        }
        int i2 = this.f55379g;
        if (i2 != -1) {
            setPicFailed(i2);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m80887p0(User user) {
        m80888q0(user, 0);
    }

    /* JADX INFO: renamed from: q0 */
    public void m80888q0(User user, int i) {
        m80889r0(user, i, false);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m80889r0(User user, int i, boolean z) {
        Picture.ImageUri imageUriProfileMiddle;
        if (i != 1) {
            imageUriProfileMiddle = i != 2 ? user.m61308fp().profileSmall() : user.m61308fp().profileBig();
        } else {
            imageUriProfileMiddle = user.m61308fp().profileMiddle();
        }
        m80890s0(imageUriProfileMiddle.formatted(), z);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m80890s0(String str, boolean z) {
        uqb0.f180374G.m127115L0(this.f55376d, str);
        bnl0.m105524M(this.f55377e, z);
    }

    public void setPicFailed(int i) {
        this.f55376d.getHierarchy().m207065z(i);
    }

    public void setPicPercent(float f) {
        ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) this.f55376d.getLayoutParams();
        c0221a.f1226P = f;
        c0221a.f1225O = f;
        this.f55376d.setLayoutParams(c0221a);
    }

    public void setPicPlace(int i) {
        this.f55376d.getHierarchy().m207041D(i);
    }

    public void setShowSVipFrame(boolean z) {
        this.f55382j = z;
    }

    /* JADX INFO: renamed from: t0 */
    public void m80891t0(User user) {
        m80892u0(user, 0);
    }

    /* JADX INFO: renamed from: u0 */
    public void m80892u0(User user, int i) {
        m80889r0(user, i, true);
        m80886o0(user, i);
    }

    /* JADX INFO: renamed from: v0 */
    public void m80893v0(User user, Picture.ImageUri imageUri) {
        m80895y0(user, imageUri.formatted(), 0);
    }

    /* JADX INFO: renamed from: w0 */
    public void m80894w0(User user, String str) {
        m80895y0(user, str, 0);
    }

    /* JADX INFO: renamed from: y0 */
    public void m80895y0(User user, String str, int i) {
        m80890s0(str, true);
        m80886o0(user, i);
    }

    /* JADX INFO: renamed from: z0 */
    public void m80896z0(@DrawableRes int i) {
        uqb0.f180374G.m127138Y0(this.f55376d, i);
        bnl0.m105524M(this.f55377e, false);
    }

    public HeaderFrameWrapper(Context context) {
        super(context);
        this.f55382j = true;
        this.f55383k = "";
    }

    public HeaderFrameWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55382j = true;
        this.f55383k = "";
        m80883l0(attributeSet, i);
    }
}
