package com.p046p1.mobile.putong.live.livingroom.common.signin.prize;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveSignPrizes;
import com.p046p1.mobile.putong.live.base.data.BLiveSignPrizesRewards;
import com.p046p1.mobile.putong.live.base.view.DialogTitleBar;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.signin.C12769a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p149l.cwt;
import p149l.fwt;
import p149l.hwt;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveSignPrizeListView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public DialogTitleBar f49369a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f49370b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f49371c;

    /* JADX INFO: renamed from: d */
    public LiveBaseAdapter f49372d;

    /* JADX INFO: renamed from: e */
    public C12769a f49373e;

    public LiveSignPrizeListView(Context context) {
        super(context);
        this.f49372d = new LiveBaseAdapter();
    }

    private void setDataToAdapter(List<BLiveSignPrizes> list) {
        xdl0.m208344M(this.f49370b, true);
        xdl0.m208344M(this.f49371c, false);
        ArrayList arrayList = new ArrayList();
        for (BLiveSignPrizes bLiveSignPrizes : list) {
            String str = bLiveSignPrizes.rewardId;
            arrayList.add(new cwt(bLiveSignPrizes.title));
            Iterator<BLiveSignPrizesRewards> it = bLiveSignPrizes.rewards.iterator();
            while (it.hasNext()) {
                arrayList.add(new hwt(this.f49373e, it.next(), str));
            }
        }
        this.f49372d.m67371Z(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final void m73269b(View view) {
        fwt.m123556a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m73270c(C12769a c12769a) {
        this.f49373e = c12769a;
    }

    /* JADX INFO: renamed from: d */
    public final void m73271d() {
        this.f49369a.m68713d(R$string.f46790Kd, true);
        this.f49369a.setBackListener(new View.OnClickListener() { // from class: l.ewt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93540a.m73272e(view);
            }
        });
        this.f49369a.setLeftView(1);
        this.f49369a.setDivider(true);
        m73273f();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m73272e(View view) {
        C12769a c12769a = this.f49373e;
        if (c12769a != null) {
            c12769a.m73174r4(false);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m73273f() {
        this.f49370b.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.f49370b.setAdapter(this.f49372d);
    }

    /* JADX INFO: renamed from: g */
    public final void m73274g() {
        xdl0.m208344M(this.f49370b, false);
        xdl0.m208344M(this.f49371c, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73269b(this);
        m73271d();
    }

    public void setData(List<BLiveSignPrizes> list) {
        if (list == null || list.size() == 0) {
            m73274g();
        } else {
            setDataToAdapter(list);
        }
    }

    public LiveSignPrizeListView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49372d = new LiveBaseAdapter();
    }
}
