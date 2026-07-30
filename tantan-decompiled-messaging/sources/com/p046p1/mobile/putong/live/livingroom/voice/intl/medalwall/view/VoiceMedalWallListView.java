package com.p046p1.mobile.putong.live.livingroom.voice.intl.medalwall.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlMedalWallItem;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import java.util.List;
import p147v.VFrame;
import p147v.VLinear;
import p149l.cyn0;
import p149l.e30;
import p149l.vwb;
import p149l.w8u;
import p149l.xdl0;
import p149l.zxn0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceMedalWallListView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VoiceMedalWallListView f53277a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f53278b;

    /* JADX INFO: renamed from: c */
    public VLinear f53279c;

    /* JADX INFO: renamed from: d */
    public TextView f53280d;

    /* JADX INFO: renamed from: e */
    public int f53281e;

    /* JADX INFO: renamed from: f */
    public e30<BLiveIntlMedalWallItem> f53282f;

    /* JADX INFO: renamed from: g */
    public LiveBaseAdapter f53283g;

    public VoiceMedalWallListView(@NonNull Context context, int i) {
        this(context, null, 0);
        this.f53281e = i;
        addView(m78281s(LayoutInflater.from(context), null));
        m78279u(this.f53281e);
    }

    /* JADX INFO: renamed from: u */
    private void m78279u(int i) {
        this.f53278b.setLayoutManager(new GridLayoutManager(getContext(), 4));
        this.f53278b.setAdapter(this.f53283g);
        m78280B(i);
    }

    /* JADX INFO: renamed from: B */
    public final void m78280B(int i) {
        xdl0.m208344M(this.f53278b, false);
        xdl0.m208344M(this.f53279c, true);
        m78284z(i);
    }

    /* JADX INFO: renamed from: s */
    public View m78281s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cyn0.m109387b(this, layoutInflater, viewGroup);
    }

    public void setItemClickAction(e30<BLiveIntlMedalWallItem> e30Var) {
        this.f53282f = e30Var;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m78282v(BLiveIntlMedalWallItem bLiveIntlMedalWallItem, View view) {
        e30<BLiveIntlMedalWallItem> e30Var = this.f53282f;
        if (e30Var != null) {
            e30Var.call(bLiveIntlMedalWallItem);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m78283w(List<BLiveIntlMedalWallItem> list) {
        if (vwb.m200296J(list)) {
            m78280B(this.f53281e);
            return;
        }
        xdl0.m208344M(this.f53279c, false);
        xdl0.m208344M(this.f53278b, true);
        ArrayList arrayList = new ArrayList();
        for (final BLiveIntlMedalWallItem bLiveIntlMedalWallItem : list) {
            zxn0 zxn0Var = new zxn0(bLiveIntlMedalWallItem, this.f53281e);
            zxn0Var.mo109662A(new View.OnClickListener() { // from class: l.byn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f77946a.m78282v(bLiveIntlMedalWallItem, view);
                }
            });
            arrayList.add(zxn0Var);
        }
        this.f53283g.m67371Z(arrayList);
    }

    /* JADX INFO: renamed from: z */
    public final void m78284z(int i) {
        TextView textView = this.f53280d;
        if (i == 0) {
            textView.setText(w8u.m202217t(R$string.f47132ai));
        } else {
            textView.setText(w8u.m202217t(R$string.f47089Yh));
        }
    }

    public VoiceMedalWallListView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoiceMedalWallListView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53283g = new LiveBaseAdapter();
    }
}
