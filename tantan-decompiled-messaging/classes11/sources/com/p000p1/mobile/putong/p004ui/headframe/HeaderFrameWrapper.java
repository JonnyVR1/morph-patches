package com.p000p1.mobile.putong.p004ui.headframe;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.DrawableRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.d9c0;
import l.e6c0;
import l.j760;
import l.kxk;
import l.qib0;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class HeaderFrameWrapper extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f8134d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f8135e;

    /* JADX INFO: renamed from: f */
    public int f8136f;

    /* JADX INFO: renamed from: g */
    public int f8137g;

    /* JADX INFO: renamed from: h */
    public int f8138h;

    /* JADX INFO: renamed from: i */
    public boolean f8139i;

    /* JADX INFO: renamed from: j */
    public boolean f8140j;

    /* JADX INFO: renamed from: k */
    public String f8141k;

    public HeaderFrameWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8140j = true;
        this.f8141k = "";
        m10021l0(attributeSet, -1);
    }

    /* JADX INFO: renamed from: B0 */
    public void m10013B0(String str) {
        qib0.G.L0(this.f8134d, str);
        xdl0.M(this.f8135e, false);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m10014D0(User user) {
        if (user == null || TextUtils.isEmpty(this.f8141k)) {
            return;
        }
        zvf0.A("e_audio_avatar_frame", this.f8141k, new j760[]{vwb.Y("other_user_id", ((DbObject) user).id), vwb.Y("is_oneself", Boolean.valueOf(user.isMe()))});
    }

    /* JADX INFO: renamed from: E0 */
    public void m10015E0(boolean z, String str) {
        this.f8139i = z;
        this.f8141k = str;
    }

    /* JADX INFO: renamed from: G0 */
    public void m10016G0(boolean z) {
        xdl0.M(this.f8135e, z);
    }

    public VDraweeView get_frame() {
        return this.f8135e;
    }

    public VDraweeView get_pic() {
        return this.f8134d;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m10017h0(View view) {
        kxk.a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m10018i0(String str, int i, int i2) {
        qib0.G.O(this.f8134d, str, i, i2);
        xdl0.M(this.f8135e, false);
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m10019j0(User user) {
        return user.needShowLiveFrame() && this.f8139i;
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m10020k0(User user) {
        return user.needShowFrame();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public final void m10021l0(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d9c0.h0, i, 0);
        this.f8138h = typedArrayObtainStyledAttributes.getResourceId(d9c0.j0, -1);
        this.f8137g = typedArrayObtainStyledAttributes.getResourceId(d9c0.i0, -1);
        this.f8136f = typedArrayObtainStyledAttributes.getResourceId(d9c0.k0, -1);
        this.f8139i = typedArrayObtainStyledAttributes.getBoolean(d9c0.l0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    public boolean m10022m0(User user) {
        if (xdl0.O0(this)) {
            return !(m10020k0(user) && this.f8140j) && m10019j0(user) && xdl0.O0(this.f8135e);
        }
        return false;
    }

    /* JADX INFO: renamed from: n0 */
    public void m10023n0(User user) {
        m10024o0(user, 0);
    }

    /* JADX INFO: renamed from: o0 */
    public void m10024o0(User user, int i) {
        if (m10020k0(user) && this.f8140j) {
            qib0.G.L0(this.f8135e, user.headFrameUrl());
            m10016G0(true);
        } else {
            if (!m10019j0(user)) {
                m10016G0(false);
                return;
            }
            qib0.G.L0(this.f8135e, user.liveHeadFrameConfig().getMediumUrl());
            m10014D0(user);
            m10016G0(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        LayoutInflater.from(getContext()).inflate(e6c0.b, (ViewGroup) this, true);
        m10017h0(this);
        if (this.f8138h != -1) {
            this.f8134d.setForeground(getContext().getDrawable(this.f8138h));
        }
        int i = this.f8136f;
        if (i != -1) {
            setPicPlace(i);
        }
        int i2 = this.f8137g;
        if (i2 != -1) {
            setPicFailed(i2);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m10025p0(User user) {
        m10026q0(user, 0);
    }

    /* JADX INFO: renamed from: q0 */
    public void m10026q0(User user, int i) {
        m10027r0(user, i, false);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m10027r0(User user, int i, boolean z) {
        Picture.ImageUri imageUriProfileMiddle;
        if (i != 1) {
            imageUriProfileMiddle = i != 2 ? user.fp().profileSmall() : user.fp().profileBig();
        } else {
            imageUriProfileMiddle = user.fp().profileMiddle();
        }
        m10028s0(imageUriProfileMiddle.formatted(), z);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m10028s0(String str, boolean z) {
        qib0.G.L0(this.f8134d, str);
        xdl0.M(this.f8135e, z);
    }

    public void setPicFailed(int i) {
        this.f8134d.getHierarchy().z(i);
    }

    public void setPicPercent(float f) {
        ViewGroup.LayoutParams layoutParams = (ConstraintLayout.a) this.f8134d.getLayoutParams();
        ((ConstraintLayout.a) layoutParams).P = f;
        ((ConstraintLayout.a) layoutParams).O = f;
        this.f8134d.setLayoutParams(layoutParams);
    }

    public void setPicPlace(int i) {
        this.f8134d.getHierarchy().D(i);
    }

    public void setShowSVipFrame(boolean z) {
        this.f8140j = z;
    }

    /* JADX INFO: renamed from: t0 */
    public void m10029t0(User user) {
        m10030u0(user, 0);
    }

    /* JADX INFO: renamed from: u0 */
    public void m10030u0(User user, int i) {
        m10027r0(user, i, true);
        m10024o0(user, i);
    }

    /* JADX INFO: renamed from: v0 */
    public void m10031v0(User user, Picture.ImageUri imageUri) {
        m10033y0(user, imageUri.formatted(), 0);
    }

    /* JADX INFO: renamed from: w0 */
    public void m10032w0(User user, String str) {
        m10033y0(user, str, 0);
    }

    /* JADX INFO: renamed from: y0 */
    public void m10033y0(User user, String str, int i) {
        m10028s0(str, true);
        m10024o0(user, i);
    }

    /* JADX INFO: renamed from: z0 */
    public void m10034z0(@DrawableRes int i) {
        qib0.G.Y0(this.f8134d, i);
        xdl0.M(this.f8135e, false);
    }

    public HeaderFrameWrapper(Context context) {
        super(context);
        this.f8140j = true;
        this.f8141k = "";
    }

    public HeaderFrameWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8140j = true;
        this.f8141k = "";
        m10021l0(attributeSet, i);
    }
}
