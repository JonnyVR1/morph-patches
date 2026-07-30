package com.p046p1.mobile.putong.live.base.arch.card.cardmodel.modeCard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTracker;
import java.util.ArrayList;
import java.util.List;
import p147v.VRecyclerView;
import p149l.cmf0;
import p149l.d1q;
import p149l.d5c0;
import p149l.fes;
import p149l.t100;
import p149l.u4u;
import p149l.vwb;
import p149l.xgt;
import p149l.xps;
import p149l.zds;

/* JADX INFO: loaded from: classes13.dex */
public class LiveRoomModeCardView extends FrameLayout {
    private u4u adapter;
    private VRecyclerView recyclerView;

    public LiveRoomModeCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final List<d1q<?>> m67508b(fes fesVar) {
        ArrayList arrayList = new ArrayList();
        if (fesVar != null && !vwb.m200296J(fesVar.m121065a())) {
            for (final zds zdsVar : fesVar.m121065a()) {
                xgt xgtVar = new xgt(zdsVar);
                xgtVar.mo109662A(new View.OnClickListener() { // from class: l.wgt
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f186217a.m67509c(zdsVar, view);
                    }
                });
                arrayList.add(xgtVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m67509c(zds zdsVar, View view) {
        xps.m210534a(getContext(), zdsVar.m218196b());
        LiveCardTracker.trackMc(zdsVar.m218198d());
    }

    /* JADX INFO: renamed from: d */
    public void m67510d(fes fesVar) {
        this.adapter.m67371Z(m67508b(fesVar));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.recyclerView = (VRecyclerView) findViewById(d5c0.f84523y0);
        this.adapter = new u4u();
        this.recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.recyclerView.addItemDecoration(new cmf0(0, t100.f167259h));
        this.recyclerView.setAdapter(this.adapter);
    }

    public LiveRoomModeCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveRoomModeCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public LiveRoomModeCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
