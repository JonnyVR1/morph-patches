package com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import java.util.List;
import p151v.VRecyclerView;
import p153l.szo0;
import p153l.xzo0;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceSweetHouseView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f54414a;

    /* JADX INFO: renamed from: b */
    public String f54415b;

    /* JADX INFO: renamed from: c */
    public z20<BLiveVoiceCpHouseInfo, String> f54416c;

    /* JADX INFO: renamed from: d */
    public szo0 f54417d;

    public VoiceSweetHouseView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m79710b(View view) {
        xzo0.m213784a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m79711c() {
        this.f54417d.m188663g0(new y20() { // from class: l.wzo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191814a.m79713e((BLiveVoiceCpHouseInfo) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m79712d() {
        this.f54414a.addItemDecoration(new szo0.C20196a());
        this.f54414a.setLayoutManager(new GridLayoutManager(getContext(), 3));
        this.f54414a.setAdapter(this.f54417d);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m79713e(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        z20<BLiveVoiceCpHouseInfo, String> z20Var = this.f54416c;
        if (z20Var != null) {
            z20Var.call(bLiveVoiceCpHouseInfo, this.f54415b);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m79714f(List<BLiveVoiceCpHouseInfo> list, String str) {
        if (list == null) {
            return;
        }
        this.f54415b = str;
        this.f54417d.m188662f0(list);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f54417d = new szo0();
        m79710b(this);
        m79712d();
        m79711c();
    }

    public void setHouseItemClickListener(z20<BLiveVoiceCpHouseInfo, String> z20Var) {
        this.f54416c = z20Var;
    }

    public VoiceSweetHouseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetHouseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
