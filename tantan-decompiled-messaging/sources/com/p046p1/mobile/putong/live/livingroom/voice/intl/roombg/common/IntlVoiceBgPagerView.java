package com.p046p1.mobile.putong.live.livingroom.voice.intl.roombg.common;

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
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.List;
import p149l.d1q;
import p149l.lvn0;
import p149l.t100;
import p149l.t6c0;
import p149l.vwb;
import p149l.wpp;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class IntlVoiceBgPagerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VoiceMaxHeightRecyclerView f53376a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f53377b;

    /* JADX INFO: renamed from: c */
    public LiveBaseAdapter f53378c;

    /* JADX INFO: renamed from: d */
    public String f53379d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.roombg.common.IntlVoiceBgPagerView$a */
    public static class C13032a extends RecyclerView.AbstractC0576n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0588z c0588z) {
            int iM186890d = t100.m186890d(3.5f);
            rect.set(iM186890d, iM186890d, iM186890d, iM186890d);
        }
    }

    public IntlVoiceBgPagerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53378c = new LiveBaseAdapter();
        this.f53379d = "";
        m78407a(LayoutInflater.from(context).inflate(t6c0.f168346f9, (ViewGroup) this, true));
        m78408b();
    }

    /* JADX INFO: renamed from: a */
    public final void m78407a(View view) {
        wpp.m204933a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m78408b() {
        this.f53376a.addItemDecoration(new C13032a());
        VoiceMaxHeightRecyclerView voiceMaxHeightRecyclerView = this.f53376a;
        voiceMaxHeightRecyclerView.setLayoutManager(new GridLayoutManager(voiceMaxHeightRecyclerView.getContext(), 3));
        this.f53376a.setAdapter(this.f53378c);
    }

    /* JADX INFO: renamed from: c */
    public void m78409c() {
        this.f53378c.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: d */
    public void m78410d(List<lvn0> list) {
        boolean zM200296J = vwb.m200296J(list);
        LinearLayout linearLayout = this.f53377b;
        if (zM200296J) {
            xdl0.m208344M(linearLayout, true);
            xdl0.m208344M(this.f53376a, false);
        } else {
            xdl0.m208344M(linearLayout, false);
            xdl0.m208344M(this.f53376a, true);
        }
        this.f53378c.m67371Z(list);
    }

    public List<d1q<?>> getModels() {
        return this.f53378c.m67355J();
    }

    public String getPageName() {
        return this.f53379d;
    }

    public IntlVoiceBgPagerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlVoiceBgPagerView(@NonNull Context context, String str) {
        this(context, null, 0);
        this.f53379d = str;
    }
}
