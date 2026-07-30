package com.p051p1.mobile.putong.live.livingroom.voice.intl.roombg.common;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.List;
import p153l.bnl0;
import p153l.d3q;
import p153l.jyb;
import p153l.p4o0;
import p153l.qa00;
import p153l.wrp;
import p153l.yec0;

/* JADX INFO: loaded from: classes10.dex */
public class IntlVoiceBgPagerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VoiceMaxHeightRecyclerView f54224a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f54225b;

    /* JADX INFO: renamed from: c */
    public LiveBaseAdapter f54226c;

    /* JADX INFO: renamed from: d */
    public String f54227d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.roombg.common.IntlVoiceBgPagerView$a */
    public static class C13195a extends RecyclerView.AbstractC0578n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0) {
            int iM175859d = qa00.m175859d(3.5f);
            rect.set(iM175859d, iM175859d, iM175859d, iM175859d);
        }
    }

    public IntlVoiceBgPagerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54226c = new LiveBaseAdapter();
        this.f54227d = "";
        m79590a(LayoutInflater.from(context).inflate(yec0.f199078f9, (ViewGroup) this, true));
        m79591b();
    }

    /* JADX INFO: renamed from: a */
    public final void m79590a(View view) {
        wrp.m207608a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m79591b() {
        this.f54224a.addItemDecoration(new C13195a());
        VoiceMaxHeightRecyclerView voiceMaxHeightRecyclerView = this.f54224a;
        voiceMaxHeightRecyclerView.setLayoutManager(new GridLayoutManager(voiceMaxHeightRecyclerView.getContext(), 3));
        this.f54224a.setAdapter(this.f54226c);
    }

    /* JADX INFO: renamed from: c */
    public void m79592c() {
        this.f54226c.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: d */
    public void m79593d(List<p4o0> list) {
        boolean zM147479J = jyb.m147479J(list);
        LinearLayout linearLayout = this.f54225b;
        if (zM147479J) {
            bnl0.m105524M(linearLayout, true);
            bnl0.m105524M(this.f54224a, false);
        } else {
            bnl0.m105524M(linearLayout, false);
            bnl0.m105524M(this.f54224a, true);
        }
        this.f54226c.m68554Z(list);
    }

    public List<d3q<?>> getModels() {
        return this.f54226c.m68538J();
    }

    public String getPageName() {
        return this.f54227d;
    }

    public IntlVoiceBgPagerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlVoiceBgPagerView(@NonNull Context context, String str) {
        this(context, null, 0);
        this.f54227d = str;
    }
}
