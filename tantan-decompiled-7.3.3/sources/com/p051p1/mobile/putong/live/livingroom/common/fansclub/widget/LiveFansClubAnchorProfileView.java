package com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget;

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
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.mcs;
import p153l.obc0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveFansClubAnchorProfileView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FrameLayout f49924d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f49925e;

    /* JADX INFO: renamed from: f */
    public TextView f49926f;

    /* JADX INFO: renamed from: g */
    public VText f49927g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f49928h;

    /* JADX INFO: renamed from: i */
    public VImage f49929i;

    /* JADX INFO: renamed from: j */
    public VImage f49930j;

    public LiveFansClubAnchorProfileView(Context context) {
        super(context);
        m74085i0(context);
    }

    /* JADX INFO: renamed from: i0 */
    private void m74085i0(Context context) {
        LayoutInflater.from(context).inflate(yec0.f199137k3, (ViewGroup) this, true);
        m74086h0(getChildAt(0));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m74086h0(View view) {
        mcs.m157934a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m74087j0(@Nullable User user, boolean z) {
        if (user == null) {
            return;
        }
        FrameLayout frameLayout = this.f49924d;
        if (z) {
            frameLayout.setBackgroundResource(obc0.f146469r);
        } else {
            frameLayout.setBackgroundResource(obc0.f146156Q0);
        }
        izs.m142868s("context_single_room", this.f49925e, user.m61308fp().url);
        this.f49926f.setText(user.name);
    }

    /* JADX INFO: renamed from: k0 */
    public void m74088k0(int i) {
        this.f49927g.setText(String.format(getContext().getString(R$string.f47474D3), Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: l0 */
    public void m74089l0(boolean z) {
        bnl0.m105524M(this.f49928h, z);
        bnl0.m105524M(this.f49927g, z);
        bnl0.m105524M(this.f49926f, z);
    }

    public void setSettingButtonVisibility(boolean z) {
        bnl0.m105524M(this.f49930j, z);
    }

    public LiveFansClubAnchorProfileView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m74085i0(context);
    }

    public LiveFansClubAnchorProfileView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m74085i0(context);
    }
}
