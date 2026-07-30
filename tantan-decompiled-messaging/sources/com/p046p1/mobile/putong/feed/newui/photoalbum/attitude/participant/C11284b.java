package com.p046p1.mobile.putong.feed.newui.photoalbum.attitude.participant;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.AttitudeConfigs;
import com.p046p1.mobile.putong.feed.data.AttitudeSourceCatCount;
import com.p046p1.mobile.putong.feed.data.AttitudeSourceCounts;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p147v.VDraweeView;
import p149l.bkb0;
import p149l.e1c0;
import p149l.f3c0;
import p149l.i0g0;
import p149l.o41;
import p149l.o6c0;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.w660;
import p149l.y31;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.attitude.participant.b */
/* JADX INFO: loaded from: classes12.dex */
public class C11284b extends w660 implements C11283a.a {

    /* JADX INFO: renamed from: a */
    public Act f41444a;

    /* JADX INFO: renamed from: b */
    public List<AttitudeConfigs> f41445b;

    /* JADX INFO: renamed from: c */
    public Moment f41446c;

    /* JADX INFO: renamed from: d */
    public y31 f41447d;

    /* JADX INFO: renamed from: e */
    public Map<Integer, o41> f41448e = new HashMap();

    /* JADX INFO: renamed from: f */
    public Map<Integer, C11283a> f41449f = new HashMap();

    /* JADX INFO: renamed from: g */
    public Map<Integer, AttitudeParticipantPagerItem> f41450g = new HashMap();

    public C11284b(Act act, @Nullable List<AttitudeConfigs> list, Moment moment, y31 y31Var) {
        this.f41444a = act;
        this.f41446c = moment;
        this.f41447d = y31Var;
        if (NullChecker.m81303a(list)) {
            this.f41445b = list;
        } else {
            this.f41445b = new ArrayList();
        }
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.attitude.participant.C11283a.a
    /* JADX INFO: renamed from: c */
    public void mo63999c(AttitudeSourceCatCount attitudeSourceCatCount) {
        if (attitudeSourceCatCount == null || vwb.m200296J(attitudeSourceCatCount.sourceCounts)) {
            return;
        }
        HashMap map = new HashMap();
        for (AttitudeSourceCounts attitudeSourceCounts : attitudeSourceCatCount.sourceCounts) {
            map.put(Integer.valueOf(attitudeSourceCounts.attitudeId), Integer.valueOf(attitudeSourceCounts.total));
        }
        for (Integer num : this.f41448e.keySet()) {
            o41 o41Var = this.f41448e.get(num);
            Integer num2 = (Integer) map.get(Integer.valueOf(this.f41445b.get(num.intValue()).f39215id));
            if (NullChecker.m81303a(num2)) {
                o41Var.f141730c.setText(i0g0.m133867h0(num2.intValue()));
            }
        }
    }

    @Override // p149l.w660
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        viewGroup.removeView((View) obj);
        this.f41450g.remove(obj);
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f41445b.size();
    }

    @Override // p149l.w660
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        AttitudeParticipantPagerItem attitudeParticipantPagerItem = (AttitudeParticipantPagerItem) LayoutInflater.from(this.f41444a).inflate(o6c0.f142032G, viewGroup, false);
        m64000j(i).m63989h(attitudeParticipantPagerItem);
        viewGroup.addView(attitudeParticipantPagerItem);
        this.f41450g.put(Integer.valueOf(i), attitudeParticipantPagerItem);
        return attitudeParticipantPagerItem;
    }

    @Override // p149l.w660
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: j */
    public final C11283a m64000j(int i) {
        C11283a c11283a = this.f41449f.get(Integer.valueOf(i));
        if (c11283a != null) {
            return c11283a;
        }
        C11283a c11283a2 = new C11283a(this.f41444a, this.f41445b.get(i), this.f41446c, this.f41447d);
        c11283a2.m63998q(this);
        this.f41449f.put(Integer.valueOf(i), c11283a2);
        return c11283a2;
    }

    /* JADX INFO: renamed from: k */
    public RecyclerView m64001k(int i) {
        AttitudeParticipantPagerItem attitudeParticipantPagerItem = this.f41450g.get(Integer.valueOf(i));
        if (attitudeParticipantPagerItem == null) {
            return null;
        }
        return attitudeParticipantPagerItem.f41422c;
    }

    /* JADX INFO: renamed from: l */
    public View m64002l(int i) {
        o41 o41Var = new o41(this.f41444a);
        this.f41448e.put(Integer.valueOf(i), o41Var);
        TextView textView = o41Var.f141730c;
        VDraweeView vDraweeView = o41Var.f141729b;
        if (this.f41445b.size() > i) {
            AttitudeConfigs attitudeConfigs = this.f41445b.get(i);
            if (NullChecker.m81303a(attitudeConfigs)) {
                textView.getPaint().setFakeBoldText(true);
                textView.setText(attitudeConfigs.name);
                Act act = this.f41444a;
                if (i == 0) {
                    textView.setTextColor(act.getResources().getColor(e1c0.f88749D));
                } else {
                    textView.setTextColor(act.getResources().getColor(e1c0.f88805r));
                }
                if (TextUtils.isEmpty(attitudeConfigs.url)) {
                    qib0.f154691G.m102331L0(vDraweeView, "res://" + this.f41444a.getPackageName() + "/" + f3c0.f94584o);
                } else {
                    bkb0 bkb0Var = qib0.f154691G;
                    String str = attitudeConfigs.url;
                    int i2 = t100.f167268q;
                    bkb0Var.m102325I0(vDraweeView, str, i2, i2);
                }
            }
        }
        return o41Var.f141728a;
    }

    /* JADX INFO: renamed from: m */
    public void m64003m(int i, boolean z) {
        o41 o41Var = this.f41448e.get(Integer.valueOf(i));
        if (NullChecker.m81303a(o41Var) && NullChecker.m81304b(o41Var.f141730c)) {
            TextView textView = o41Var.f141730c;
            Act act = this.f41444a;
            textView.setTextColor(z ? act.getResources().getColor(e1c0.f88749D) : act.getResources().getColor(e1c0.f88805r));
        }
    }
}
