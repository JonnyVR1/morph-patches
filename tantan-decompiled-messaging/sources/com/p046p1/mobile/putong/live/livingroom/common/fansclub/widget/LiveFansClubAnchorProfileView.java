package com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget;

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
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.hxs;
import p149l.i3c0;
import p149l.las;
import p149l.t6c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveFansClubAnchorProfileView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FrameLayout f49076d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f49077e;

    /* JADX INFO: renamed from: f */
    public TextView f49078f;

    /* JADX INFO: renamed from: g */
    public VText f49079g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f49080h;

    /* JADX INFO: renamed from: i */
    public VImage f49081i;

    /* JADX INFO: renamed from: j */
    public VImage f49082j;

    public LiveFansClubAnchorProfileView(Context context) {
        super(context);
        m72902i0(context);
    }

    /* JADX INFO: renamed from: i0 */
    private void m72902i0(Context context) {
        LayoutInflater.from(context).inflate(t6c0.f168405k3, (ViewGroup) this, true);
        m72903h0(getChildAt(0));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m72903h0(View view) {
        las.m149176a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m72904j0(@Nullable User user, boolean z) {
        if (user == null) {
            return;
        }
        FrameLayout frameLayout = this.f49076d;
        if (z) {
            frameLayout.setBackgroundResource(i3c0.f111141r);
        } else {
            frameLayout.setBackgroundResource(i3c0.f110828Q0);
        }
        hxs.m133406s("context_single_room", this.f49077e, user.m60124fp().url);
        this.f49078f.setText(user.name);
    }

    /* JADX INFO: renamed from: k0 */
    public void m72905k0(int i) {
        this.f49079g.setText(String.format(getContext().getString(R$string.f46626D3), Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: l0 */
    public void m72906l0(boolean z) {
        xdl0.m208344M(this.f49080h, z);
        xdl0.m208344M(this.f49079g, z);
        xdl0.m208344M(this.f49078f, z);
    }

    public void setSettingButtonVisibility(boolean z) {
        xdl0.m208344M(this.f49082j, z);
    }

    public LiveFansClubAnchorProfileView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m72902i0(context);
    }

    public LiveFansClubAnchorProfileView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m72902i0(context);
    }
}
