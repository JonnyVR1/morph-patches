package com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.e30;
import p149l.f30;
import p149l.iro0;
import p149l.kvc0;
import p149l.oqo0;
import p149l.xdl0;
import p149l.yqo0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceSweetLimitedTimeHouseView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f53570a;

    /* JADX INFO: renamed from: b */
    public VLinear f53571b;

    /* JADX INFO: renamed from: c */
    public VText f53572c;

    /* JADX INFO: renamed from: d */
    public String f53573d;

    /* JADX INFO: renamed from: e */
    public f30<BLiveVoiceSweetLimitHouse, String> f53574e;

    /* JADX INFO: renamed from: f */
    public yqo0 f53575f;

    public VoiceSweetLimitedTimeHouseView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m78533b(View view) {
        iro0.m137906a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m78534c() {
        this.f53575f.m215756g0(new e30() { // from class: l.hro0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109235a.m78536e((BLiveVoiceSweetLimitHouse) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m78535d() {
        this.f53570a.addItemDecoration(new oqo0.C19002a());
        this.f53570a.setLayoutManager(new GridLayoutManager(getContext(), 3));
        this.f53570a.setAdapter(this.f53575f);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m78536e(BLiveVoiceSweetLimitHouse bLiveVoiceSweetLimitHouse) {
        f30<BLiveVoiceSweetLimitHouse, String> f30Var = this.f53574e;
        if (f30Var != null) {
            f30Var.call(bLiveVoiceSweetLimitHouse, this.f53573d);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m78537f(List<BLiveVoiceSweetLimitHouse> list, String str) {
        if (list == null) {
            return;
        }
        this.f53573d = str;
        this.f53575f.m215755f0(list);
        if (TextUtils.isEmpty(str)) {
            xdl0.m208344M(this.f53571b, true);
            this.f53572c.setText(kvc0.m147355d(R$string.f46662Eh));
            return;
        }
        int size = list.size();
        VLinear vLinear = this.f53571b;
        if (size != 0) {
            xdl0.m208344M(vLinear, false);
        } else {
            xdl0.m208344M(vLinear, true);
            this.f53572c.setText(kvc0.m147355d(R$string.f46640Dh));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f53575f = new yqo0();
        m78533b(this);
        m78535d();
        m78534c();
    }

    public void setHouseItemClickListener(f30<BLiveVoiceSweetLimitHouse, String> f30Var) {
        this.f53574e = f30Var;
    }

    public VoiceSweetLimitedTimeHouseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetLimitedTimeHouseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
