package com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import java.util.List;
import l.e30;
import l.f30;
import l.tqo0;
import p009l.oqo0;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceSweetHouseView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f7172a;

    /* JADX INFO: renamed from: b */
    public String f7173b;

    /* JADX INFO: renamed from: c */
    public f30<BLiveVoiceCpHouseInfo, String> f7174c;

    /* JADX INFO: renamed from: d */
    public oqo0 f7175d;

    public VoiceSweetHouseView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m8738b(View view) {
        tqo0.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m8739c() {
        this.f7175d.m20012g0(new e30() { // from class: l.sqo0
            public final void call(Object obj) {
                this.f20429a.m8741e((BLiveVoiceCpHouseInfo) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m8740d() {
        this.f7172a.addItemDecoration(new oqo0.C1086a());
        this.f7172a.setLayoutManager(new GridLayoutManager(getContext(), 3));
        this.f7172a.setAdapter(this.f7175d);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m8741e(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        f30<BLiveVoiceCpHouseInfo, String> f30Var = this.f7174c;
        if (f30Var != null) {
            f30Var.call(bLiveVoiceCpHouseInfo, this.f7173b);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m8742f(List<BLiveVoiceCpHouseInfo> list, String str) {
        if (list == null) {
            return;
        }
        this.f7173b = str;
        this.f7175d.m20011f0(list);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f7175d = new oqo0();
        m8738b(this);
        m8740d();
        m8739c();
    }

    public void setHouseItemClickListener(f30<BLiveVoiceCpHouseInfo, String> f30Var) {
        this.f7174c = f30Var;
    }

    public VoiceSweetHouseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetHouseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
