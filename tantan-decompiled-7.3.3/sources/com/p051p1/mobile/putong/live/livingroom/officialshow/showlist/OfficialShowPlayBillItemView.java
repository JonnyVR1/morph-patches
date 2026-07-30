package com.p051p1.mobile.putong.live.livingroom.officialshow.showlist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveOfficialShowListItem;
import com.p051p1.mobile.putong.live.base.view.LiveMainlandTagView;
import p151v.VDraweeView;
import p151v.VLinear;
import p153l.afu;
import p153l.bnl0;
import p153l.he50;
import p153l.izs;
import p153l.pe50;
import p153l.qa00;
import p153l.tfs;

/* JADX INFO: loaded from: classes5.dex */
public class OfficialShowPlayBillItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f51974a;

    /* JADX INFO: renamed from: b */
    public TextView f51975b;

    /* JADX INFO: renamed from: c */
    public TextView f51976c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f51977d;

    /* JADX INFO: renamed from: e */
    public LiveMainlandTagView f51978e;

    /* JADX INFO: renamed from: f */
    public TextView f51979f;

    /* JADX INFO: renamed from: g */
    public TextView f51980g;

    public OfficialShowPlayBillItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m76585c(View view) {
        he50.m134621a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m76586d(pe50 pe50Var, BLiveOfficialShowListItem bLiveOfficialShowListItem, View view) {
        pe50Var.m171931R3(bLiveOfficialShowListItem.anchorId);
        bnl0.m105524M(this.f51976c, false);
        afu.m97554c(pe50Var.mo78457R2(), tfs.m190969k().m190972b(pe50Var.m213810E2(), false).m190975e("perform_list").m190978h(bLiveOfficialShowListItem.anchorId).m190971a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.oo2] */
    /* JADX INFO: renamed from: e */
    public void m76587e(final pe50 pe50Var, final BLiveOfficialShowListItem bLiveOfficialShowListItem) {
        this.f51979f.setText(bLiveOfficialShowListItem.anchorName);
        this.f51980g.setText(bLiveOfficialShowListItem.desc);
        izs.m142864o("context_single_room", this.f51977d, bLiveOfficialShowListItem.anchorAvatar);
        this.f51975b.setText(bLiveOfficialShowListItem.startTime + "-" + bLiveOfficialShowListItem.endTime);
        this.f51978e.m69932d(qa00.m175859d(17.0f), qa00.m175859d(15.0f));
        bnl0.m105524M(this.f51978e, bLiveOfficialShowListItem.isOnlive);
        bnl0.m105524M(this.f51976c, bLiveOfficialShowListItem.isFollowed ^ true);
        bnl0.m105509E0(this.f51976c, new View.OnClickListener() { // from class: l.fe50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98622a.m76586d(pe50Var, bLiveOfficialShowListItem, view);
            }
        });
        bnl0.m105509E0(this.f51977d, new View.OnClickListener() { // from class: l.ge50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pe50Var.m171935Y3(bLiveOfficialShowListItem.anchorId);
            }
        });
        afu.m97555d(pe50Var.mo78457R2(), tfs.m190969k().m190972b(pe50Var.m213810E2(), false).m190975e("perform_list").m190978h(bLiveOfficialShowListItem.anchorId).m190971a());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76585c(this);
        this.f51978e.m69931c(-1, -1);
    }

    public OfficialShowPlayBillItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OfficialShowPlayBillItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
