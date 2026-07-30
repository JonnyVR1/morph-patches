package com.p051p1.mobile.putong.live.base.arch.card.cardmodel.avatarline;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.avatarline.LiveAvatarLineCardView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p151v.VRecyclerView;
import p153l.d3q;
import p153l.jdc0;
import p153l.jyb;
import p153l.luf0;
import p153l.pwr;
import p153l.qa00;
import p153l.swr;
import p153l.v6u;
import p153l.vxr;
import p153l.xyd0;
import p153l.y20;
import p153l.yrs;

/* JADX INFO: loaded from: classes13.dex */
public class LiveAvatarLineCardView extends FrameLayout {
    private v6u adapter;
    private VRecyclerView recyclerView;
    xyd0 savedRingSet;

    public LiveAvatarLineCardView(@NonNull Context context) {
        super(context);
        this.savedRingSet = new xyd0("live_voice_avatar_line_ring" + vxr.m203884l(), new HashSet());
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m68569b(HashSet hashSet, HashSet hashSet2, pwr.C19458a c19458a) {
        if (TextUtils.isEmpty(c19458a.m174079b())) {
            return;
        }
        if (!hashSet.contains(c19458a.m174079b())) {
            c19458a.m174086i(true);
        } else {
            hashSet2.add(c19458a.m174079b());
            c19458a.m174086i(false);
        }
    }

    private void setLocalRingVisible(pwr pwrVar) {
        List<pwr.C19458a> listM174077a = pwrVar.m174077a();
        if (jyb.m147479J(listM174077a)) {
            return;
        }
        final HashSet<String> hashSet = this.savedRingSet.get();
        final HashSet hashSet2 = new HashSet();
        jyb.m147537z(listM174077a, new y20() { // from class: l.qwr
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveAvatarLineCardView.m68569b(hashSet, hashSet2, (pwr.C19458a) obj);
            }
        });
        this.savedRingSet.put(hashSet2);
    }

    /* JADX INFO: renamed from: c */
    public final List<d3q<?>> m68570c(pwr pwrVar) {
        ArrayList arrayList = new ArrayList();
        if (pwrVar != null && !jyb.m147479J(pwrVar.m174077a())) {
            for (final pwr.C19458a c19458a : pwrVar.m174077a()) {
                final swr swrVar = new swr(c19458a);
                swrVar.mo113881A(new View.OnClickListener() { // from class: l.rwr
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f165229a.m68571d(c19458a, swrVar, view);
                    }
                });
                arrayList.add(swrVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m68571d(pwr.C19458a c19458a, d3q d3qVar, View view) {
        yrs.m217233a(getContext(), c19458a.m174080c());
        m68573f(d3qVar, c19458a);
        LiveCardTracker.trackMc(c19458a.m174084g());
    }

    /* JADX INFO: renamed from: e */
    public void m68572e(pwr pwrVar) {
        setLocalRingVisible(pwrVar);
        this.adapter.m68554Z(m68570c(pwrVar));
    }

    /* JADX INFO: renamed from: f */
    public final void m68573f(d3q<?> d3qVar, pwr.C19458a c19458a) {
        if (TextUtils.isEmpty(c19458a.m174079b())) {
            return;
        }
        c19458a.m174086i(false);
        HashSet<String> hashSet = this.savedRingSet.get();
        hashSet.add(c19458a.m174079b());
        this.savedRingSet.put(hashSet);
        this.adapter.m68543O(d3qVar);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.recyclerView = (VRecyclerView) findViewById(jdc0.f120241y0);
        this.adapter = new v6u();
        this.recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.recyclerView.addItemDecoration(new luf0(0, qa00.f156321h));
        this.recyclerView.setAdapter(this.adapter);
    }

    public LiveAvatarLineCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.savedRingSet = new xyd0("live_voice_avatar_line_ring" + vxr.m203884l(), new HashSet());
    }

    public LiveAvatarLineCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.savedRingSet = new xyd0("live_voice_avatar_line_ring" + vxr.m203884l(), new HashSet());
    }
}
