package com.p051p1.mobile.putong.live.base.arch.card.cardmodel.modeCard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTracker;
import java.util.ArrayList;
import java.util.List;
import p151v.VRecyclerView;
import p153l.ags;
import p153l.d3q;
import p153l.ggs;
import p153l.jdc0;
import p153l.jyb;
import p153l.luf0;
import p153l.qa00;
import p153l.v6u;
import p153l.yit;
import p153l.yrs;

/* JADX INFO: loaded from: classes13.dex */
public class LiveRoomModeCardView extends FrameLayout {
    private v6u adapter;
    private VRecyclerView recyclerView;

    public LiveRoomModeCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final List<d3q<?>> m68691b(ggs ggsVar) {
        ArrayList arrayList = new ArrayList();
        if (ggsVar != null && !jyb.m147479J(ggsVar.m130193a())) {
            for (final ags agsVar : ggsVar.m130193a()) {
                yit yitVar = new yit(agsVar);
                yitVar.mo113881A(new View.OnClickListener() { // from class: l.xit
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f194505a.m68692c(agsVar, view);
                    }
                });
                arrayList.add(yitVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m68692c(ags agsVar, View view) {
        yrs.m217233a(getContext(), agsVar.m97721b());
        LiveCardTracker.trackMc(agsVar.m97723d());
    }

    /* JADX INFO: renamed from: d */
    public void m68693d(ggs ggsVar) {
        this.adapter.m68554Z(m68691b(ggsVar));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.recyclerView = (VRecyclerView) findViewById(jdc0.f120241y0);
        this.adapter = new v6u();
        this.recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.recyclerView.addItemDecoration(new luf0(0, qa00.f156321h));
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
