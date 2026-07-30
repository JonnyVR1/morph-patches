package com.p046p1.mobile.putong.live.livingroom.voice.intl.giftwall.view;

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
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBookInfo;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import java.util.List;
import p149l.e30;
import p149l.hbn0;
import p149l.nbn0;
import p149l.vwb;
import p149l.w8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceGiftWallListView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VoiceGiftWallListView f53174a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f53175b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f53176c;

    /* JADX INFO: renamed from: d */
    public TextView f53177d;

    /* JADX INFO: renamed from: e */
    public LiveBaseAdapter f53178e;

    /* JADX INFO: renamed from: f */
    public e30<BLiveVoiceGiftWallBookInfo> f53179f;

    public VoiceGiftWallListView(@NonNull Context context, int i) {
        super(context);
        this.f53178e = new LiveBaseAdapter();
        this.f53179f = null;
        addView(m78171b(LayoutInflater.from(context), null));
        m78172c(i);
    }

    /* JADX INFO: renamed from: b */
    public View m78171b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nbn0.m158817b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public final void m78172c(int i) {
        this.f53175b.setLayoutManager(new GridLayoutManager(getContext(), 4));
        this.f53175b.setAdapter(this.f53178e);
        m78176g(i);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m78173d(BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo, View view) {
        e30<BLiveVoiceGiftWallBookInfo> e30Var = this.f53179f;
        if (e30Var != null) {
            e30Var.call(bLiveVoiceGiftWallBookInfo);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m78174e(List<BLiveVoiceGiftWallBookInfo> list, int i) {
        if (vwb.m200296J(list)) {
            m78176g(i);
            return;
        }
        xdl0.m208344M(this.f53176c, false);
        xdl0.m208344M(this.f53175b, true);
        ArrayList arrayList = new ArrayList();
        for (final BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo : list) {
            hbn0 hbn0Var = new hbn0(bLiveVoiceGiftWallBookInfo, i);
            hbn0Var.mo109662A(new View.OnClickListener() { // from class: l.mbn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f133044a.m78173d(bLiveVoiceGiftWallBookInfo, view);
                }
            });
            arrayList.add(hbn0Var);
        }
        this.f53178e.m67371Z(arrayList);
    }

    /* JADX INFO: renamed from: f */
    public final void m78175f(int i) {
        TextView textView = this.f53177d;
        if (i == 0) {
            textView.setText(w8u.m202217t(R$string.f47328jh));
        } else {
            textView.setText(w8u.m202217t(R$string.f47306ih));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m78176g(int i) {
        xdl0.m208344M(this.f53175b, false);
        xdl0.m208344M(this.f53176c, true);
        m78175f(i);
    }

    public void setItemClickAction(e30<BLiveVoiceGiftWallBookInfo> e30Var) {
        this.f53179f = e30Var;
    }

    public VoiceGiftWallListView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53178e = new LiveBaseAdapter();
        this.f53179f = null;
    }

    public VoiceGiftWallListView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53178e = new LiveBaseAdapter();
        this.f53179f = null;
    }

    public VoiceGiftWallListView(@NonNull Context context) {
        super(context);
        this.f53178e = new LiveBaseAdapter();
        this.f53179f = null;
    }
}
