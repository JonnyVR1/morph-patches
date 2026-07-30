package com.p000p1.mobile.putong.live.livingroom.voice.intl.roombg.common;

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
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.List;
import l.d1q;
import l.t100;
import l.t6c0;
import l.vwb;
import l.wpp;
import l.xdl0;
import p009l.lvn0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntlVoiceBgPagerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VoiceMaxHeightRecyclerView f6982a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f6983b;

    /* JADX INFO: renamed from: c */
    public LiveBaseAdapter f6984c;

    /* JADX INFO: renamed from: d */
    public String f6985d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.roombg.common.IntlVoiceBgPagerView$a */
    public static class C0434a extends RecyclerView.n {
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            int iD = t100.d(3.5f);
            rect.set(iD, iD, iD, iD);
        }
    }

    public IntlVoiceBgPagerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6984c = new LiveBaseAdapter();
        this.f6985d = "";
        m8608a(LayoutInflater.from(context).inflate(t6c0.f9, (ViewGroup) this, true));
        m8609b();
    }

    /* JADX INFO: renamed from: a */
    public final void m8608a(View view) {
        wpp.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m8609b() {
        this.f6982a.addItemDecoration(new C0434a());
        RecyclerView recyclerView = this.f6982a;
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 3));
        this.f6982a.setAdapter(this.f6984c);
    }

    /* JADX INFO: renamed from: c */
    public void m8610c() {
        this.f6984c.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: d */
    public void m8611d(List<lvn0> list) {
        boolean zJ = vwb.J(list);
        LinearLayout linearLayout = this.f6983b;
        if (zJ) {
            xdl0.M(linearLayout, true);
            xdl0.M(this.f6982a, false);
        } else {
            xdl0.M(linearLayout, false);
            xdl0.M(this.f6982a, true);
        }
        this.f6984c.Z(list);
    }

    public List<d1q<?>> getModels() {
        return this.f6984c.J();
    }

    public String getPageName() {
        return this.f6985d;
    }

    public IntlVoiceBgPagerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlVoiceBgPagerView(@NonNull Context context, String str) {
        this(context, null, 0);
        this.f6985d = str;
    }
}
