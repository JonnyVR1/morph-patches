package com.p051p1.mobile.putong.live.livingroom.common.signin.prize;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveSignPrizes;
import com.p051p1.mobile.putong.live.base.data.BLiveSignPrizesRewards;
import com.p051p1.mobile.putong.live.base.view.DialogTitleBar;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.signin.C12932a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p153l.bnl0;
import p153l.dyt;
import p153l.gyt;
import p153l.iyt;

/* JADX INFO: loaded from: classes4.dex */
public class LiveSignPrizeListView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public DialogTitleBar f50217a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f50218b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f50219c;

    /* JADX INFO: renamed from: d */
    public LiveBaseAdapter f50220d;

    /* JADX INFO: renamed from: e */
    public C12932a f50221e;

    public LiveSignPrizeListView(Context context) {
        super(context);
        this.f50220d = new LiveBaseAdapter();
    }

    private void setDataToAdapter(List<BLiveSignPrizes> list) {
        bnl0.m105524M(this.f50218b, true);
        bnl0.m105524M(this.f50219c, false);
        ArrayList arrayList = new ArrayList();
        for (BLiveSignPrizes bLiveSignPrizes : list) {
            String str = bLiveSignPrizes.rewardId;
            arrayList.add(new dyt(bLiveSignPrizes.title));
            Iterator<BLiveSignPrizesRewards> it = bLiveSignPrizes.rewards.iterator();
            while (it.hasNext()) {
                arrayList.add(new iyt(this.f50221e, it.next(), str));
            }
        }
        this.f50220d.m68554Z(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final void m74452b(View view) {
        gyt.m133010a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m74453c(C12932a c12932a) {
        this.f50221e = c12932a;
    }

    /* JADX INFO: renamed from: d */
    public final void m74454d() {
        this.f50217a.m69896d(R$string.f47638Kd, true);
        this.f50217a.setBackListener(new View.OnClickListener() { // from class: l.fyt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101420a.m74455e(view);
            }
        });
        this.f50217a.setLeftView(1);
        this.f50217a.setDivider(true);
        m74456f();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m74455e(View view) {
        C12932a c12932a = this.f50221e;
        if (c12932a != null) {
            c12932a.m74357r4(false);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m74456f() {
        this.f50218b.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.f50218b.setAdapter(this.f50220d);
    }

    /* JADX INFO: renamed from: g */
    public final void m74457g() {
        bnl0.m105524M(this.f50218b, false);
        bnl0.m105524M(this.f50219c, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74452b(this);
        m74454d();
    }

    public void setData(List<BLiveSignPrizes> list) {
        if (list == null || list.size() == 0) {
            m74457g();
        } else {
            setDataToAdapter(list);
        }
    }

    public LiveSignPrizeListView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50220d = new LiveBaseAdapter();
    }
}
