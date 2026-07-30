package com.p046p1.mobile.putong.live.livingroom.officialshow.showlist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveOfficialShowListItem;
import com.p046p1.mobile.putong.live.base.view.LiveMainlandTagView;
import p147v.VDraweeView;
import p147v.VLinear;
import p149l.a650;
import p149l.hxs;
import p149l.s550;
import p149l.sds;
import p149l.t100;
import p149l.xdl0;
import p149l.zcu;

/* JADX INFO: loaded from: classes4.dex */
public class OfficialShowPlayBillItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f51126a;

    /* JADX INFO: renamed from: b */
    public TextView f51127b;

    /* JADX INFO: renamed from: c */
    public TextView f51128c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f51129d;

    /* JADX INFO: renamed from: e */
    public LiveMainlandTagView f51130e;

    /* JADX INFO: renamed from: f */
    public TextView f51131f;

    /* JADX INFO: renamed from: g */
    public TextView f51132g;

    public OfficialShowPlayBillItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m75402c(View view) {
        s550.m182318a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m75403d(a650 a650Var, BLiveOfficialShowListItem bLiveOfficialShowListItem, View view) {
        a650Var.m95119R3(bLiveOfficialShowListItem.anchorId);
        xdl0.m208344M(this.f51128c, false);
        zcu.m218088c(a650Var.mo77274R2(), sds.m183540k().m183543b(a650Var.m206027E2(), false).m183546e("perform_list").m183549h(bLiveOfficialShowListItem.anchorId).m183542a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.ho2] */
    /* JADX INFO: renamed from: e */
    public void m75404e(final a650 a650Var, final BLiveOfficialShowListItem bLiveOfficialShowListItem) {
        this.f51131f.setText(bLiveOfficialShowListItem.anchorName);
        this.f51132g.setText(bLiveOfficialShowListItem.desc);
        hxs.m133402o("context_single_room", this.f51129d, bLiveOfficialShowListItem.anchorAvatar);
        this.f51127b.setText(bLiveOfficialShowListItem.startTime + "-" + bLiveOfficialShowListItem.endTime);
        this.f51130e.m68749d(t100.m186890d(17.0f), t100.m186890d(15.0f));
        xdl0.m208344M(this.f51130e, bLiveOfficialShowListItem.isOnlive);
        xdl0.m208344M(this.f51128c, bLiveOfficialShowListItem.isFollowed ^ true);
        xdl0.m208329E0(this.f51128c, new View.OnClickListener() { // from class: l.q550
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152728a.m75403d(a650Var, bLiveOfficialShowListItem, view);
            }
        });
        xdl0.m208329E0(this.f51129d, new View.OnClickListener() { // from class: l.r550
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a650Var.m95123Y3(bLiveOfficialShowListItem.anchorId);
            }
        });
        zcu.m218089d(a650Var.mo77274R2(), sds.m183540k().m183543b(a650Var.m206027E2(), false).m183546e("perform_list").m183549h(bLiveOfficialShowListItem.anchorId).m183542a());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75402c(this);
        this.f51130e.m68748c(-1, -1);
    }

    public OfficialShowPlayBillItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OfficialShowPlayBillItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
