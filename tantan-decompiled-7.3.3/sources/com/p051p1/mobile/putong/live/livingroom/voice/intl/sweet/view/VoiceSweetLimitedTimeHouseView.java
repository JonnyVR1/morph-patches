package com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.bnl0;
import p153l.c0p0;
import p153l.m0p0;
import p153l.n3d0;
import p153l.szo0;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceSweetLimitedTimeHouseView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f54418a;

    /* JADX INFO: renamed from: b */
    public VLinear f54419b;

    /* JADX INFO: renamed from: c */
    public VText f54420c;

    /* JADX INFO: renamed from: d */
    public String f54421d;

    /* JADX INFO: renamed from: e */
    public z20<BLiveVoiceSweetLimitHouse, String> f54422e;

    /* JADX INFO: renamed from: f */
    public c0p0 f54423f;

    public VoiceSweetLimitedTimeHouseView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m79716b(View view) {
        m0p0.m156521a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m79717c() {
        this.f54423f.m107471g0(new y20() { // from class: l.l0p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129581a.m79719e((BLiveVoiceSweetLimitHouse) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m79718d() {
        this.f54418a.addItemDecoration(new szo0.C20196a());
        this.f54418a.setLayoutManager(new GridLayoutManager(getContext(), 3));
        this.f54418a.setAdapter(this.f54423f);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m79719e(BLiveVoiceSweetLimitHouse bLiveVoiceSweetLimitHouse) {
        z20<BLiveVoiceSweetLimitHouse, String> z20Var = this.f54422e;
        if (z20Var != null) {
            z20Var.call(bLiveVoiceSweetLimitHouse, this.f54421d);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m79720f(List<BLiveVoiceSweetLimitHouse> list, String str) {
        if (list == null) {
            return;
        }
        this.f54421d = str;
        this.f54423f.m107470f0(list);
        if (TextUtils.isEmpty(str)) {
            bnl0.m105524M(this.f54419b, true);
            this.f54420c.setText(n3d0.m161280d(R$string.f47510Eh));
            return;
        }
        int size = list.size();
        VLinear vLinear = this.f54419b;
        if (size != 0) {
            bnl0.m105524M(vLinear, false);
        } else {
            bnl0.m105524M(vLinear, true);
            this.f54420c.setText(n3d0.m161280d(R$string.f47488Dh));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f54423f = new c0p0();
        m79716b(this);
        m79718d();
        m79717c();
    }

    public void setHouseItemClickListener(z20<BLiveVoiceSweetLimitHouse, String> z20Var) {
        this.f54422e = z20Var;
    }

    public VoiceSweetLimitedTimeHouseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetLimitedTimeHouseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
