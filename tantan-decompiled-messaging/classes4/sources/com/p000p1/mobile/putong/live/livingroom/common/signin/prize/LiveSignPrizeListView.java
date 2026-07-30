package com.p000p1.mobile.putong.live.livingroom.common.signin.prize;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.signin.C0358a;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p1.mobile.putong.live.base.data.BLiveSignPrizes;
import com.p1.mobile.putong.live.base.data.BLiveSignPrizesRewards;
import com.p1.mobile.putong.live.base.view.DialogTitleBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.xdl0;
import p002l.cwt;
import p002l.fwt;
import p002l.hwt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveSignPrizeListView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public DialogTitleBar f5411a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f5412b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f5413c;

    /* JADX INFO: renamed from: d */
    public LiveBaseAdapter f5414d;

    /* JADX INFO: renamed from: e */
    public C0358a f5415e;

    public LiveSignPrizeListView(Context context) {
        super(context);
        this.f5414d = new LiveBaseAdapter();
    }

    private void setDataToAdapter(List<BLiveSignPrizes> list) {
        xdl0.M(this.f5412b, true);
        xdl0.M(this.f5413c, false);
        ArrayList arrayList = new ArrayList();
        for (BLiveSignPrizes bLiveSignPrizes : list) {
            String str = bLiveSignPrizes.rewardId;
            arrayList.add(new cwt(bLiveSignPrizes.title));
            Iterator it = bLiveSignPrizes.rewards.iterator();
            while (it.hasNext()) {
                arrayList.add(new hwt(this.f5415e, (BLiveSignPrizesRewards) it.next(), str));
            }
        }
        this.f5414d.Z(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final void m6804b(View view) {
        fwt.m13506a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m6805c(C0358a c0358a) {
        this.f5415e = c0358a;
    }

    /* JADX INFO: renamed from: d */
    public final void m6806d() {
        this.f5411a.d(R$string.f2832Kd, true);
        this.f5411a.setBackListener(new View.OnClickListener() { // from class: l.ewt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10034a.m6807e(view);
            }
        });
        this.f5411a.setLeftView(1);
        this.f5411a.setDivider(true);
        m6808f();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m6807e(View view) {
        C0358a c0358a = this.f5415e;
        if (c0358a != null) {
            c0358a.m6702r4(false);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m6808f() {
        this.f5412b.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.f5412b.setAdapter(this.f5414d);
    }

    /* JADX INFO: renamed from: g */
    public final void m6809g() {
        xdl0.M(this.f5412b, false);
        xdl0.M(this.f5413c, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6804b(this);
        m6806d();
    }

    public void setData(List<BLiveSignPrizes> list) {
        if (list == null || list.size() == 0) {
            m6809g();
        } else {
            setDataToAdapter(list);
        }
    }

    public LiveSignPrizeListView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5414d = new LiveBaseAdapter();
    }
}
