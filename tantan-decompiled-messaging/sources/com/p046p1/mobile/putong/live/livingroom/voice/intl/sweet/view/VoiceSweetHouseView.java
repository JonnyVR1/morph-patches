package com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import java.util.List;
import p147v.VRecyclerView;
import p149l.e30;
import p149l.f30;
import p149l.oqo0;
import p149l.tqo0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceSweetHouseView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f53566a;

    /* JADX INFO: renamed from: b */
    public String f53567b;

    /* JADX INFO: renamed from: c */
    public f30<BLiveVoiceCpHouseInfo, String> f53568c;

    /* JADX INFO: renamed from: d */
    public oqo0 f53569d;

    public VoiceSweetHouseView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m78527b(View view) {
        tqo0.m190154a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m78528c() {
        this.f53569d.m165475g0(new e30() { // from class: l.sqo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166009a.m78530e((BLiveVoiceCpHouseInfo) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m78529d() {
        this.f53566a.addItemDecoration(new oqo0.C19002a());
        this.f53566a.setLayoutManager(new GridLayoutManager(getContext(), 3));
        this.f53566a.setAdapter(this.f53569d);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m78530e(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        f30<BLiveVoiceCpHouseInfo, String> f30Var = this.f53568c;
        if (f30Var != null) {
            f30Var.call(bLiveVoiceCpHouseInfo, this.f53567b);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m78531f(List<BLiveVoiceCpHouseInfo> list, String str) {
        if (list == null) {
            return;
        }
        this.f53567b = str;
        this.f53569d.m165474f0(list);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f53569d = new oqo0();
        m78527b(this);
        m78529d();
        m78528c();
    }

    public void setHouseItemClickListener(f30<BLiveVoiceCpHouseInfo, String> f30Var) {
        this.f53568c = f30Var;
    }

    public VoiceSweetHouseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetHouseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
