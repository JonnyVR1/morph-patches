package com.p046p1.mobile.putong.live.base.arch.card.cardmodel.avatarline;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.avatarline.LiveAvatarLineCardView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p147v.VRecyclerView;
import p149l.cmf0;
import p149l.d1q;
import p149l.d5c0;
import p149l.e30;
import p149l.our;
import p149l.rur;
import p149l.t100;
import p149l.u4u;
import p149l.uvr;
import p149l.vqd0;
import p149l.vwb;
import p149l.xps;

/* JADX INFO: loaded from: classes13.dex */
public class LiveAvatarLineCardView extends FrameLayout {
    private u4u adapter;
    private VRecyclerView recyclerView;
    vqd0 savedRingSet;

    public LiveAvatarLineCardView(@NonNull Context context) {
        super(context);
        this.savedRingSet = new vqd0("live_voice_avatar_line_ring" + uvr.m196095l(), new HashSet());
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m67386b(HashSet hashSet, HashSet hashSet2, our.C19046a c19046a) {
        if (TextUtils.isEmpty(c19046a.m166120b())) {
            return;
        }
        if (!hashSet.contains(c19046a.m166120b())) {
            c19046a.m166127i(true);
        } else {
            hashSet2.add(c19046a.m166120b());
            c19046a.m166127i(false);
        }
    }

    private void setLocalRingVisible(our ourVar) {
        List<our.C19046a> listM166118a = ourVar.m166118a();
        if (vwb.m200296J(listM166118a)) {
            return;
        }
        final HashSet<String> hashSet = this.savedRingSet.get();
        final HashSet hashSet2 = new HashSet();
        vwb.m200354z(listM166118a, new e30() { // from class: l.pur
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveAvatarLineCardView.m67386b(hashSet, hashSet2, (our.C19046a) obj);
            }
        });
        this.savedRingSet.put(hashSet2);
    }

    /* JADX INFO: renamed from: c */
    public final List<d1q<?>> m67387c(our ourVar) {
        ArrayList arrayList = new ArrayList();
        if (ourVar != null && !vwb.m200296J(ourVar.m166118a())) {
            for (final our.C19046a c19046a : ourVar.m166118a()) {
                final rur rurVar = new rur(c19046a);
                rurVar.mo109662A(new View.OnClickListener() { // from class: l.qur
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f156535a.m67388d(c19046a, rurVar, view);
                    }
                });
                arrayList.add(rurVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m67388d(our.C19046a c19046a, d1q d1qVar, View view) {
        xps.m210534a(getContext(), c19046a.m166121c());
        m67390f(d1qVar, c19046a);
        LiveCardTracker.trackMc(c19046a.m166125g());
    }

    /* JADX INFO: renamed from: e */
    public void m67389e(our ourVar) {
        setLocalRingVisible(ourVar);
        this.adapter.m67371Z(m67387c(ourVar));
    }

    /* JADX INFO: renamed from: f */
    public final void m67390f(d1q<?> d1qVar, our.C19046a c19046a) {
        if (TextUtils.isEmpty(c19046a.m166120b())) {
            return;
        }
        c19046a.m166127i(false);
        HashSet<String> hashSet = this.savedRingSet.get();
        hashSet.add(c19046a.m166120b());
        this.savedRingSet.put(hashSet);
        this.adapter.m67360O(d1qVar);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.recyclerView = (VRecyclerView) findViewById(d5c0.f84523y0);
        this.adapter = new u4u();
        this.recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.recyclerView.addItemDecoration(new cmf0(0, t100.f167259h));
        this.recyclerView.setAdapter(this.adapter);
    }

    public LiveAvatarLineCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.savedRingSet = new vqd0("live_voice_avatar_line_ring" + uvr.m196095l(), new HashSet());
    }

    public LiveAvatarLineCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.savedRingSet = new vqd0("live_voice_avatar_line_ring" + uvr.m196095l(), new HashSet());
    }
}
