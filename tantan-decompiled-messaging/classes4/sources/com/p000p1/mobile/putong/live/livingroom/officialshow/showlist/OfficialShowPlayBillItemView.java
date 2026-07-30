package com.p000p1.mobile.putong.live.livingroom.officialshow.showlist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopWheelTypeData;
import com.p1.mobile.putong.live.base.data.BLiveOfficialShowListItem;
import com.p1.mobile.putong.live.base.view.LiveMainlandTagView;
import l.hxs;
import l.sds;
import l.t100;
import l.xdl0;
import l.zcu;
import p002l.a650;
import p002l.ho2;
import p002l.s550;
import v.VDraweeView;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class OfficialShowPlayBillItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f7168a;

    /* JADX INFO: renamed from: b */
    public TextView f7169b;

    /* JADX INFO: renamed from: c */
    public TextView f7170c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f7171d;

    /* JADX INFO: renamed from: e */
    public LiveMainlandTagView f7172e;

    /* JADX INFO: renamed from: f */
    public TextView f7173f;

    /* JADX INFO: renamed from: g */
    public TextView f7174g;

    public OfficialShowPlayBillItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m9031c(View view) {
        s550.m22207a(this, view);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m9032d(a650 a650Var, BLiveOfficialShowListItem bLiveOfficialShowListItem, View view) {
        a650Var.m9437R3(bLiveOfficialShowListItem.anchorId);
        xdl0.M(this.f7170c, false);
        zcu.c(a650Var.mo21430R2(), sds.k().b((ho2) a650Var.m25547E2(), false).e("perform_list").h(bLiveOfficialShowListItem.anchorId).a());
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [l.ho2] */
    /* JADX INFO: renamed from: e */
    public void m9033e(final a650 a650Var, final BLiveOfficialShowListItem bLiveOfficialShowListItem) {
        this.f7173f.setText(bLiveOfficialShowListItem.anchorName);
        this.f7174g.setText(bLiveOfficialShowListItem.desc);
        hxs.o("context_single_room", this.f7171d, bLiveOfficialShowListItem.anchorAvatar);
        this.f7169b.setText(bLiveOfficialShowListItem.startTime + ExpProfileLoopWheelTypeData.NONE_STR + bLiveOfficialShowListItem.endTime);
        this.f7172e.d(t100.d(17.0f), t100.d(15.0f));
        xdl0.M(this.f7172e, bLiveOfficialShowListItem.isOnlive);
        xdl0.M(this.f7170c, bLiveOfficialShowListItem.isFollowed ^ true);
        xdl0.E0(this.f7170c, new View.OnClickListener() { // from class: l.q550
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17812a.m9032d(a650Var, bLiveOfficialShowListItem, view);
            }
        });
        xdl0.E0(this.f7171d, new View.OnClickListener() { // from class: l.r550
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a650Var.m9442Y3(bLiveOfficialShowListItem.anchorId);
            }
        });
        zcu.d(a650Var.mo21430R2(), sds.k().b((ho2) a650Var.m25547E2(), false).e("perform_list").h(bLiveOfficialShowListItem.anchorId).a());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9031c(this);
        this.f7172e.c(-1, -1);
    }

    public OfficialShowPlayBillItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OfficialShowPlayBillItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
