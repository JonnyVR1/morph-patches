package com.p000p1.mobile.putong.live.livingroom.voice.intl.medalwall.view;

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
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p1.mobile.putong.live.base.data.BLiveIntlMedalWallItem;
import com.p1.mobile.putong.live.livingroom.R;
import java.util.ArrayList;
import java.util.List;
import l.cyn0;
import l.e30;
import l.vwb;
import l.w8u;
import l.xdl0;
import p009l.zxn0;
import v.VFrame;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceMedalWallListView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VoiceMedalWallListView f6883a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f6884b;

    /* JADX INFO: renamed from: c */
    public VLinear f6885c;

    /* JADX INFO: renamed from: d */
    public TextView f6886d;

    /* JADX INFO: renamed from: e */
    public int f6887e;

    /* JADX INFO: renamed from: f */
    public e30<BLiveIntlMedalWallItem> f6888f;

    /* JADX INFO: renamed from: g */
    public LiveBaseAdapter f6889g;

    /* JADX WARN: Multi-variable type inference failed */
    public VoiceMedalWallListView(@NonNull Context context, int i) {
        this(context, null, 0);
        this.f6887e = i;
        addView(m8470s(LayoutInflater.from(context), null));
        m8468u(this.f6887e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    private void m8468u(int i) {
        this.f6884b.setLayoutManager(new GridLayoutManager(getContext(), 4));
        this.f6884b.setAdapter(this.f6889g);
        m8469B(i);
    }

    /* JADX INFO: renamed from: B */
    public final void m8469B(int i) {
        xdl0.M(this.f6884b, false);
        xdl0.M(this.f6885c, true);
        m8473z(i);
    }

    /* JADX INFO: renamed from: s */
    public View m8470s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cyn0.b(this, layoutInflater, viewGroup);
    }

    public void setItemClickAction(e30<BLiveIntlMedalWallItem> e30Var) {
        this.f6888f = e30Var;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m8471v(BLiveIntlMedalWallItem bLiveIntlMedalWallItem, View view) {
        e30<BLiveIntlMedalWallItem> e30Var = this.f6888f;
        if (e30Var != null) {
            e30Var.call(bLiveIntlMedalWallItem);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m8472w(List<BLiveIntlMedalWallItem> list) {
        if (vwb.J(list)) {
            m8469B(this.f6887e);
            return;
        }
        xdl0.M(this.f6885c, false);
        xdl0.M(this.f6884b, true);
        ArrayList arrayList = new ArrayList();
        for (final BLiveIntlMedalWallItem bLiveIntlMedalWallItem : list) {
            zxn0 zxn0Var = new zxn0(bLiveIntlMedalWallItem, this.f6887e);
            zxn0Var.A(new View.OnClickListener() { // from class: l.byn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f10360a.m8471v(bLiveIntlMedalWallItem, view);
                }
            });
            arrayList.add(zxn0Var);
        }
        this.f6889g.Z(arrayList);
    }

    /* JADX INFO: renamed from: z */
    public final void m8473z(int i) {
        TextView textView = this.f6886d;
        if (i == 0) {
            textView.setText(w8u.t(R.string.ai));
        } else {
            textView.setText(w8u.t(R.string.Yh));
        }
    }

    public VoiceMedalWallListView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoiceMedalWallListView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6889g = new LiveBaseAdapter();
    }
}
