package com.p051p1.mobile.putong.feed.newui.photoalbum.attitude.participant;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.AttitudeConfigs;
import com.p051p1.mobile.putong.feed.data.AttitudeSourceCatCount;
import com.p051p1.mobile.putong.feed.data.AttitudeSourceCounts;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p151v.VDraweeView;
import p153l.cf60;
import p153l.f41;
import p153l.fsb0;
import p153l.jyb;
import p153l.k9c0;
import p153l.lbc0;
import p153l.q8g0;
import p153l.qa00;
import p153l.tec0;
import p153l.uqb0;
import p153l.v41;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.attitude.participant.b */
/* JADX INFO: loaded from: classes13.dex */
public class C11447b extends cf60 implements C11446a.a {

    /* JADX INFO: renamed from: a */
    public Act f42292a;

    /* JADX INFO: renamed from: b */
    public List<AttitudeConfigs> f42293b;

    /* JADX INFO: renamed from: c */
    public Moment f42294c;

    /* JADX INFO: renamed from: d */
    public f41 f42295d;

    /* JADX INFO: renamed from: e */
    public Map<Integer, v41> f42296e = new HashMap();

    /* JADX INFO: renamed from: f */
    public Map<Integer, C11446a> f42297f = new HashMap();

    /* JADX INFO: renamed from: g */
    public Map<Integer, AttitudeParticipantPagerItem> f42298g = new HashMap();

    public C11447b(Act act, @Nullable List<AttitudeConfigs> list, Moment moment, f41 f41Var) {
        this.f42292a = act;
        this.f42294c = moment;
        this.f42295d = f41Var;
        if (NullChecker.m82486a(list)) {
            this.f42293b = list;
        } else {
            this.f42293b = new ArrayList();
        }
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.attitude.participant.C11446a.a
    /* JADX INFO: renamed from: c */
    public void mo65182c(AttitudeSourceCatCount attitudeSourceCatCount) {
        if (attitudeSourceCatCount == null || jyb.m147479J(attitudeSourceCatCount.sourceCounts)) {
            return;
        }
        HashMap map = new HashMap();
        for (AttitudeSourceCounts attitudeSourceCounts : attitudeSourceCatCount.sourceCounts) {
            map.put(Integer.valueOf(attitudeSourceCounts.attitudeId), Integer.valueOf(attitudeSourceCounts.total));
        }
        for (Integer num : this.f42296e.keySet()) {
            v41 v41Var = this.f42296e.get(num);
            Integer num2 = (Integer) map.get(Integer.valueOf(this.f42293b.get(num.intValue()).f40063id));
            if (NullChecker.m82486a(num2)) {
                v41Var.f182326c.setText(q8g0.m175802h0(num2.intValue()));
            }
        }
    }

    @Override // p153l.cf60
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        viewGroup.removeView((View) obj);
        this.f42298g.remove(obj);
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f42293b.size();
    }

    @Override // p153l.cf60
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        AttitudeParticipantPagerItem attitudeParticipantPagerItem = (AttitudeParticipantPagerItem) LayoutInflater.from(this.f42292a).inflate(tec0.f173501G, viewGroup, false);
        m65183j(i).m65172h(attitudeParticipantPagerItem);
        viewGroup.addView(attitudeParticipantPagerItem);
        this.f42298g.put(Integer.valueOf(i), attitudeParticipantPagerItem);
        return attitudeParticipantPagerItem;
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: j */
    public final C11446a m65183j(int i) {
        C11446a c11446a = this.f42297f.get(Integer.valueOf(i));
        if (c11446a != null) {
            return c11446a;
        }
        C11446a c11446a2 = new C11446a(this.f42292a, this.f42293b.get(i), this.f42294c, this.f42295d);
        c11446a2.m65181q(this);
        this.f42297f.put(Integer.valueOf(i), c11446a2);
        return c11446a2;
    }

    /* JADX INFO: renamed from: k */
    public RecyclerView m65184k(int i) {
        AttitudeParticipantPagerItem attitudeParticipantPagerItem = this.f42298g.get(Integer.valueOf(i));
        if (attitudeParticipantPagerItem == null) {
            return null;
        }
        return attitudeParticipantPagerItem.f42270c;
    }

    /* JADX INFO: renamed from: l */
    public View m65185l(int i) {
        v41 v41Var = new v41(this.f42292a);
        this.f42296e.put(Integer.valueOf(i), v41Var);
        TextView textView = v41Var.f182326c;
        VDraweeView vDraweeView = v41Var.f182325b;
        if (this.f42293b.size() > i) {
            AttitudeConfigs attitudeConfigs = this.f42293b.get(i);
            if (NullChecker.m82486a(attitudeConfigs)) {
                textView.getPaint().setFakeBoldText(true);
                textView.setText(attitudeConfigs.name);
                Act act = this.f42292a;
                if (i == 0) {
                    textView.setTextColor(act.getResources().getColor(k9c0.f124472D));
                } else {
                    textView.setTextColor(act.getResources().getColor(k9c0.f124528r));
                }
                if (TextUtils.isEmpty(attitudeConfigs.url)) {
                    uqb0.f180374G.m127115L0(vDraweeView, "res://" + this.f42292a.getPackageName() + "/" + lbc0.f131102o);
                } else {
                    fsb0 fsb0Var = uqb0.f180374G;
                    String str = attitudeConfigs.url;
                    int i2 = qa00.f156330q;
                    fsb0Var.m127109I0(vDraweeView, str, i2, i2);
                }
            }
        }
        return v41Var.f182324a;
    }

    /* JADX INFO: renamed from: m */
    public void m65186m(int i, boolean z) {
        v41 v41Var = this.f42296e.get(Integer.valueOf(i));
        if (NullChecker.m82486a(v41Var) && NullChecker.m82487b(v41Var.f182326c)) {
            TextView textView = v41Var.f182326c;
            Act act = this.f42292a;
            textView.setTextColor(z ? act.getResources().getColor(k9c0.f124472D) : act.getResources().getColor(k9c0.f124528r));
        }
    }
}
