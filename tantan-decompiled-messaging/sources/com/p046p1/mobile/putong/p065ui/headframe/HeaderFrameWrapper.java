package com.p046p1.mobile.putong.p065ui.headframe;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.DrawableRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import p147v.VDraweeView;
import p149l.d9c0;
import p149l.e6c0;
import p149l.kxk;
import p149l.qib0;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class HeaderFrameWrapper extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f54528d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f54529e;

    /* JADX INFO: renamed from: f */
    public int f54530f;

    /* JADX INFO: renamed from: g */
    public int f54531g;

    /* JADX INFO: renamed from: h */
    public int f54532h;

    /* JADX INFO: renamed from: i */
    public boolean f54533i;

    /* JADX INFO: renamed from: j */
    public boolean f54534j;

    /* JADX INFO: renamed from: k */
    public String f54535k;

    public HeaderFrameWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54534j = true;
        this.f54535k = "";
        m79700l0(attributeSet, -1);
    }

    /* JADX INFO: renamed from: B0 */
    public void m79692B0(String str) {
        qib0.f154691G.m102331L0(this.f54528d, str);
        xdl0.m208344M(this.f54529e, false);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m79693D0(User user) {
        if (user == null || TextUtils.isEmpty(this.f54535k)) {
            return;
        }
        zvf0.m220368A("e_audio_avatar_frame", this.f54535k, vwb.m200311Y("other_user_id", user.f56011id), vwb.m200311Y("is_oneself", Boolean.valueOf(user.isMe())));
    }

    /* JADX INFO: renamed from: E0 */
    public void m79694E0(boolean z, String str) {
        this.f54533i = z;
        this.f54535k = str;
    }

    /* JADX INFO: renamed from: G0 */
    public void m79695G0(boolean z) {
        xdl0.m208344M(this.f54529e, z);
    }

    public VDraweeView get_frame() {
        return this.f54529e;
    }

    public VDraweeView get_pic() {
        return this.f54528d;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m79696h0(View view) {
        kxk.m147790a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m79697i0(String str, int i, int i2) {
        qib0.f154691G.m102336O(this.f54528d, str, i, i2);
        xdl0.m208344M(this.f54529e, false);
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m79698j0(User user) {
        return user.needShowLiveFrame() && this.f54533i;
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m79699k0(User user) {
        return user.needShowFrame();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m79700l0(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d9c0.f85056h0, i, 0);
        this.f54532h = typedArrayObtainStyledAttributes.getResourceId(d9c0.f85062j0, -1);
        this.f54531g = typedArrayObtainStyledAttributes.getResourceId(d9c0.f85059i0, -1);
        this.f54530f = typedArrayObtainStyledAttributes.getResourceId(d9c0.f85065k0, -1);
        this.f54533i = typedArrayObtainStyledAttributes.getBoolean(d9c0.f85068l0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m79701m0(User user) {
        if (xdl0.m208349O0(this)) {
            return !(m79699k0(user) && this.f54534j) && m79698j0(user) && xdl0.m208349O0(this.f54529e);
        }
        return false;
    }

    /* JADX INFO: renamed from: n0 */
    public void m79702n0(User user) {
        m79703o0(user, 0);
    }

    /* JADX INFO: renamed from: o0 */
    public void m79703o0(User user, int i) {
        if (m79699k0(user) && this.f54534j) {
            qib0.f154691G.m102331L0(this.f54529e, user.headFrameUrl());
            m79695G0(true);
        } else {
            if (!m79698j0(user)) {
                m79695G0(false);
                return;
            }
            qib0.f154691G.m102331L0(this.f54529e, user.liveHeadFrameConfig().getMediumUrl());
            m79693D0(user);
            m79695G0(true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater.from(getContext()).inflate(e6c0.f89543b, (ViewGroup) this, true);
        m79696h0(this);
        if (this.f54532h != -1) {
            this.f54528d.setForeground(getContext().getDrawable(this.f54532h));
        }
        int i = this.f54530f;
        if (i != -1) {
            setPicPlace(i);
        }
        int i2 = this.f54531g;
        if (i2 != -1) {
            setPicFailed(i2);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m79704p0(User user) {
        m79705q0(user, 0);
    }

    /* JADX INFO: renamed from: q0 */
    public void m79705q0(User user, int i) {
        m79706r0(user, i, false);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m79706r0(User user, int i, boolean z) {
        Picture.ImageUri imageUriProfileMiddle;
        if (i != 1) {
            imageUriProfileMiddle = i != 2 ? user.m60124fp().profileSmall() : user.m60124fp().profileBig();
        } else {
            imageUriProfileMiddle = user.m60124fp().profileMiddle();
        }
        m79707s0(imageUriProfileMiddle.formatted(), z);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m79707s0(String str, boolean z) {
        qib0.f154691G.m102331L0(this.f54528d, str);
        xdl0.m208344M(this.f54529e, z);
    }

    public void setPicFailed(int i) {
        this.f54528d.getHierarchy().m112079z(i);
    }

    public void setPicPercent(float f) {
        ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) this.f54528d.getLayoutParams();
        c0220a.f1226P = f;
        c0220a.f1225O = f;
        this.f54528d.setLayoutParams(c0220a);
    }

    public void setPicPlace(int i) {
        this.f54528d.getHierarchy().m112049D(i);
    }

    public void setShowSVipFrame(boolean z) {
        this.f54534j = z;
    }

    /* JADX INFO: renamed from: t0 */
    public void m79708t0(User user) {
        m79709u0(user, 0);
    }

    /* JADX INFO: renamed from: u0 */
    public void m79709u0(User user, int i) {
        m79706r0(user, i, true);
        m79703o0(user, i);
    }

    /* JADX INFO: renamed from: v0 */
    public void m79710v0(User user, Picture.ImageUri imageUri) {
        m79712y0(user, imageUri.formatted(), 0);
    }

    /* JADX INFO: renamed from: w0 */
    public void m79711w0(User user, String str) {
        m79712y0(user, str, 0);
    }

    /* JADX INFO: renamed from: y0 */
    public void m79712y0(User user, String str, int i) {
        m79707s0(str, true);
        m79703o0(user, i);
    }

    /* JADX INFO: renamed from: z0 */
    public void m79713z0(@DrawableRes int i) {
        qib0.f154691G.m102354Y0(this.f54528d, i);
        xdl0.m208344M(this.f54529e, false);
    }

    public HeaderFrameWrapper(Context context) {
        super(context);
        this.f54534j = true;
        this.f54535k = "";
    }

    public HeaderFrameWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54534j = true;
        this.f54535k = "";
        m79700l0(attributeSet, i);
    }
}
