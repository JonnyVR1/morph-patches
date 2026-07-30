package com.p000p1.mobile.putong.feed.newui.photoalbum.attitude.participant;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.feed.data.AttitudeConfigs;
import com.p000p1.mobile.putong.feed.data.AttitudeSourceCatCount;
import com.p000p1.mobile.putong.feed.data.AttitudeSourceCounts;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.bkb0;
import l.i0g0;
import l.qib0;
import l.t100;
import l.vwb;
import l.w660;
import p007l.e1c0;
import p007l.f3c0;
import p007l.o41;
import p007l.o6c0;
import p007l.y31;
import v.VDraweeView;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.attitude.participant.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C2128b extends w660 implements C2127a.a {

    /* JADX INFO: renamed from: a */
    public Act f2905a;

    /* JADX INFO: renamed from: b */
    public List<AttitudeConfigs> f2906b;

    /* JADX INFO: renamed from: c */
    public Moment f2907c;

    /* JADX INFO: renamed from: d */
    public y31 f2908d;

    /* JADX INFO: renamed from: e */
    public Map<Integer, o41> f2909e = new HashMap();

    /* JADX INFO: renamed from: f */
    public Map<Integer, C2127a> f2910f = new HashMap();

    /* JADX INFO: renamed from: g */
    public Map<Integer, AttitudeParticipantPagerItem> f2911g = new HashMap();

    public C2128b(Act act, @Nullable List<AttitudeConfigs> list, Moment moment, y31 y31Var) {
        this.f2905a = act;
        this.f2907c = moment;
        this.f2908d = y31Var;
        if (NullChecker.a(list)) {
            this.f2906b = list;
        } else {
            this.f2906b = new ArrayList();
        }
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.attitude.participant.C2127a.a
    /* JADX INFO: renamed from: c */
    public void mo5042c(AttitudeSourceCatCount attitudeSourceCatCount) {
        if (attitudeSourceCatCount == null || vwb.J(attitudeSourceCatCount.sourceCounts)) {
            return;
        }
        HashMap map = new HashMap();
        for (AttitudeSourceCounts attitudeSourceCounts : attitudeSourceCatCount.sourceCounts) {
            map.put(Integer.valueOf(attitudeSourceCounts.attitudeId), Integer.valueOf(attitudeSourceCounts.total));
        }
        for (Integer num : this.f2909e.keySet()) {
            o41 o41Var = this.f2909e.get(num);
            Integer num2 = (Integer) map.get(Integer.valueOf(this.f2906b.get(num.intValue()).f676id));
            if (NullChecker.a(num2)) {
                o41Var.f10998c.setText(i0g0.h0(num2.intValue()));
            }
        }
    }

    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        viewGroup.removeView((View) obj);
        this.f2911g.remove(obj);
    }

    public int getCount() {
        return this.f2906b.size();
    }

    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        AttitudeParticipantPagerItem attitudeParticipantPagerItem = (AttitudeParticipantPagerItem) LayoutInflater.from(this.f2905a).inflate(o6c0.f11051G, viewGroup, false);
        m5043j(i).m5032h(attitudeParticipantPagerItem);
        viewGroup.addView(attitudeParticipantPagerItem);
        this.f2911g.put(Integer.valueOf(i), attitudeParticipantPagerItem);
        return attitudeParticipantPagerItem;
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: j */
    public final C2127a m5043j(int i) {
        C2127a c2127a = this.f2910f.get(Integer.valueOf(i));
        if (c2127a != null) {
            return c2127a;
        }
        C2127a c2127a2 = new C2127a(this.f2905a, this.f2906b.get(i), this.f2907c, this.f2908d);
        c2127a2.m5041q(this);
        this.f2910f.put(Integer.valueOf(i), c2127a2);
        return c2127a2;
    }

    /* JADX INFO: renamed from: k */
    public RecyclerView m5044k(int i) {
        AttitudeParticipantPagerItem attitudeParticipantPagerItem = this.f2911g.get(Integer.valueOf(i));
        if (attitudeParticipantPagerItem == null) {
            return null;
        }
        return attitudeParticipantPagerItem.f2883c;
    }

    /* JADX INFO: renamed from: l */
    public View m5045l(int i) {
        o41 o41Var = new o41(this.f2905a);
        this.f2909e.put(Integer.valueOf(i), o41Var);
        TextView textView = o41Var.f10998c;
        VDraweeView vDraweeView = o41Var.f10997b;
        if (this.f2906b.size() > i) {
            AttitudeConfigs attitudeConfigs = this.f2906b.get(i);
            if (NullChecker.a(attitudeConfigs)) {
                textView.getPaint().setFakeBoldText(true);
                textView.setText(attitudeConfigs.name);
                Act act = this.f2905a;
                if (i == 0) {
                    textView.setTextColor(act.getResources().getColor(e1c0.f7105D));
                } else {
                    textView.setTextColor(act.getResources().getColor(e1c0.f7161r));
                }
                if (TextUtils.isEmpty(attitudeConfigs.url)) {
                    qib0.G.L0(vDraweeView, "res://" + this.f2905a.getPackageName() + "/" + f3c0.f7867o);
                } else {
                    bkb0 bkb0Var = qib0.G;
                    String str = attitudeConfigs.url;
                    int i2 = t100.q;
                    bkb0Var.I0(vDraweeView, str, i2, i2);
                }
            }
        }
        return o41Var.f10996a;
    }

    /* JADX INFO: renamed from: m */
    public void m5046m(int i, boolean z) {
        o41 o41Var = this.f2909e.get(Integer.valueOf(i));
        if (NullChecker.a(o41Var) && NullChecker.b(o41Var.f10998c)) {
            TextView textView = o41Var.f10998c;
            Act act = this.f2905a;
            textView.setTextColor(z ? act.getResources().getColor(e1c0.f7105D) : act.getResources().getColor(e1c0.f7161r));
        }
    }
}
