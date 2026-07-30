package com.p051p1.mobile.putong.live.livingroom.voice.intl.giftwall.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBookInfo;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import java.util.List;
import p153l.bnl0;
import p153l.jyb;
import p153l.lkn0;
import p153l.rkn0;
import p153l.xau;
import p153l.y20;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceGiftWallListView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VoiceGiftWallListView f54022a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f54023b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f54024c;

    /* JADX INFO: renamed from: d */
    public TextView f54025d;

    /* JADX INFO: renamed from: e */
    public LiveBaseAdapter f54026e;

    /* JADX INFO: renamed from: f */
    public y20<BLiveVoiceGiftWallBookInfo> f54027f;

    public VoiceGiftWallListView(@NonNull Context context, int i) {
        super(context);
        this.f54026e = new LiveBaseAdapter();
        this.f54027f = null;
        addView(m79354b(LayoutInflater.from(context), null));
        m79355c(i);
    }

    /* JADX INFO: renamed from: b */
    public View m79354b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rkn0.m181874b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public final void m79355c(int i) {
        this.f54023b.setLayoutManager(new GridLayoutManager(getContext(), 4));
        this.f54023b.setAdapter(this.f54026e);
        m79359g(i);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m79356d(BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo, View view) {
        y20<BLiveVoiceGiftWallBookInfo> y20Var = this.f54027f;
        if (y20Var != null) {
            y20Var.call(bLiveVoiceGiftWallBookInfo);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m79357e(List<BLiveVoiceGiftWallBookInfo> list, int i) {
        if (jyb.m147479J(list)) {
            m79359g(i);
            return;
        }
        bnl0.m105524M(this.f54024c, false);
        bnl0.m105524M(this.f54023b, true);
        ArrayList arrayList = new ArrayList();
        for (final BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo : list) {
            lkn0 lkn0Var = new lkn0(bLiveVoiceGiftWallBookInfo, i);
            lkn0Var.mo113881A(new View.OnClickListener() { // from class: l.qkn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f158162a.m79356d(bLiveVoiceGiftWallBookInfo, view);
                }
            });
            arrayList.add(lkn0Var);
        }
        this.f54026e.m68554Z(arrayList);
    }

    /* JADX INFO: renamed from: f */
    public final void m79358f(int i) {
        TextView textView = this.f54025d;
        if (i == 0) {
            textView.setText(xau.m209910t(R$string.f48176jh));
        } else {
            textView.setText(xau.m209910t(R$string.f48154ih));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m79359g(int i) {
        bnl0.m105524M(this.f54023b, false);
        bnl0.m105524M(this.f54024c, true);
        m79358f(i);
    }

    public void setItemClickAction(y20<BLiveVoiceGiftWallBookInfo> y20Var) {
        this.f54027f = y20Var;
    }

    public VoiceGiftWallListView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54026e = new LiveBaseAdapter();
        this.f54027f = null;
    }

    public VoiceGiftWallListView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54026e = new LiveBaseAdapter();
        this.f54027f = null;
    }

    public VoiceGiftWallListView(@NonNull Context context) {
        super(context);
        this.f54026e = new LiveBaseAdapter();
        this.f54027f = null;
    }
}
