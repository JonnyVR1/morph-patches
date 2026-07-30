package com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import com.p1.mobile.putong.live.livingroom.R;
import java.util.List;
import l.e30;
import l.f30;
import l.iro0;
import l.kvc0;
import l.xdl0;
import p009l.oqo0;
import p009l.yqo0;
import v.VLinear;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceSweetLimitedTimeHouseView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f7176a;

    /* JADX INFO: renamed from: b */
    public VLinear f7177b;

    /* JADX INFO: renamed from: c */
    public VText f7178c;

    /* JADX INFO: renamed from: d */
    public String f7179d;

    /* JADX INFO: renamed from: e */
    public f30<BLiveVoiceSweetLimitHouse, String> f7180e;

    /* JADX INFO: renamed from: f */
    public yqo0 f7181f;

    public VoiceSweetLimitedTimeHouseView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m8744b(View view) {
        iro0.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m8745c() {
        this.f7181f.m25507g0(new e30() { // from class: l.hro0
            public final void call(Object obj) {
                this.f14232a.m8747e((BLiveVoiceSweetLimitHouse) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m8746d() {
        this.f7176a.addItemDecoration(new oqo0.C1086a());
        this.f7176a.setLayoutManager(new GridLayoutManager(getContext(), 3));
        this.f7176a.setAdapter(this.f7181f);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m8747e(BLiveVoiceSweetLimitHouse bLiveVoiceSweetLimitHouse) {
        f30<BLiveVoiceSweetLimitHouse, String> f30Var = this.f7180e;
        if (f30Var != null) {
            f30Var.call(bLiveVoiceSweetLimitHouse, this.f7179d);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m8748f(List<BLiveVoiceSweetLimitHouse> list, String str) {
        if (list == null) {
            return;
        }
        this.f7179d = str;
        this.f7181f.m25506f0(list);
        if (TextUtils.isEmpty(str)) {
            xdl0.M(this.f7177b, true);
            this.f7178c.setText(kvc0.d(R.string.Eh));
            return;
        }
        int size = list.size();
        VLinear vLinear = this.f7177b;
        if (size != 0) {
            xdl0.M(vLinear, false);
        } else {
            xdl0.M(vLinear, true);
            this.f7178c.setText(kvc0.d(R.string.Dh));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f7181f = new yqo0();
        m8744b(this);
        m8746d();
        m8745c();
    }

    public void setHouseItemClickListener(f30<BLiveVoiceSweetLimitHouse, String> f30Var) {
        this.f7180e = f30Var;
    }

    public VoiceSweetLimitedTimeHouseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetLimitedTimeHouseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
