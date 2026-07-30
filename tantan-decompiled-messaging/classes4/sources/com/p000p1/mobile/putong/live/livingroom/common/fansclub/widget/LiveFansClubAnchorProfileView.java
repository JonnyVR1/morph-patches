package com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import l.hxs;
import l.xdl0;
import p002l.i3c0;
import p002l.las;
import p002l.t6c0;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveFansClubAnchorProfileView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FrameLayout f5118d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f5119e;

    /* JADX INFO: renamed from: f */
    public TextView f5120f;

    /* JADX INFO: renamed from: g */
    public VText f5121g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f5122h;

    /* JADX INFO: renamed from: i */
    public VImage f5123i;

    /* JADX INFO: renamed from: j */
    public VImage f5124j;

    public LiveFansClubAnchorProfileView(Context context) {
        super(context);
        m6421i0(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    private void m6421i0(Context context) {
        LayoutInflater.from(context).inflate(t6c0.f19901k3, (ViewGroup) this, true);
        m6422h0(getChildAt(0));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m6422h0(View view) {
        las.m17119a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m6423j0(@Nullable User user, boolean z) {
        if (user == null) {
            return;
        }
        FrameLayout frameLayout = this.f5118d;
        if (z) {
            frameLayout.setBackgroundResource(i3c0.f12926r);
        } else {
            frameLayout.setBackgroundResource(i3c0.f12613Q0);
        }
        hxs.s("context_single_room", this.f5119e, ((Media) user.fp()).url);
        this.f5120f.setText(user.name);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public void m6424k0(int i) {
        this.f5121g.setText(String.format(getContext().getString(R$string.f2668D3), Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: l0 */
    public void m6425l0(boolean z) {
        xdl0.M(this.f5122h, z);
        xdl0.M(this.f5121g, z);
        xdl0.M(this.f5120f, z);
    }

    public void setSettingButtonVisibility(boolean z) {
        xdl0.M(this.f5124j, z);
    }

    public LiveFansClubAnchorProfileView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m6421i0(context);
    }

    public LiveFansClubAnchorProfileView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6421i0(context);
    }
}
