package com.p051p1.mobile.putong.live.livingroom.voice.intl.medalwall.view;

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
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlMedalWallItem;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import java.util.List;
import p151v.VFrame;
import p151v.VLinear;
import p153l.bnl0;
import p153l.d7o0;
import p153l.g7o0;
import p153l.jyb;
import p153l.xau;
import p153l.y20;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceMedalWallListView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VoiceMedalWallListView f54125a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f54126b;

    /* JADX INFO: renamed from: c */
    public VLinear f54127c;

    /* JADX INFO: renamed from: d */
    public TextView f54128d;

    /* JADX INFO: renamed from: e */
    public int f54129e;

    /* JADX INFO: renamed from: f */
    public y20<BLiveIntlMedalWallItem> f54130f;

    /* JADX INFO: renamed from: g */
    public LiveBaseAdapter f54131g;

    public VoiceMedalWallListView(@NonNull Context context, int i) {
        this(context, null, 0);
        this.f54129e = i;
        addView(m79464s(LayoutInflater.from(context), null));
        m79462u(this.f54129e);
    }

    /* JADX INFO: renamed from: u */
    private void m79462u(int i) {
        this.f54126b.setLayoutManager(new GridLayoutManager(getContext(), 4));
        this.f54126b.setAdapter(this.f54131g);
        m79463B(i);
    }

    /* JADX INFO: renamed from: B */
    public final void m79463B(int i) {
        bnl0.m105524M(this.f54126b, false);
        bnl0.m105524M(this.f54127c, true);
        m79467z(i);
    }

    /* JADX INFO: renamed from: s */
    public View m79464s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g7o0.m129365b(this, layoutInflater, viewGroup);
    }

    public void setItemClickAction(y20<BLiveIntlMedalWallItem> y20Var) {
        this.f54130f = y20Var;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m79465v(BLiveIntlMedalWallItem bLiveIntlMedalWallItem, View view) {
        y20<BLiveIntlMedalWallItem> y20Var = this.f54130f;
        if (y20Var != null) {
            y20Var.call(bLiveIntlMedalWallItem);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m79466w(List<BLiveIntlMedalWallItem> list) {
        if (jyb.m147479J(list)) {
            m79463B(this.f54129e);
            return;
        }
        bnl0.m105524M(this.f54127c, false);
        bnl0.m105524M(this.f54126b, true);
        ArrayList arrayList = new ArrayList();
        for (final BLiveIntlMedalWallItem bLiveIntlMedalWallItem : list) {
            d7o0 d7o0Var = new d7o0(bLiveIntlMedalWallItem, this.f54129e);
            d7o0Var.mo113881A(new View.OnClickListener() { // from class: l.f7o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f97579a.m79465v(bLiveIntlMedalWallItem, view);
                }
            });
            arrayList.add(d7o0Var);
        }
        this.f54131g.m68554Z(arrayList);
    }

    /* JADX INFO: renamed from: z */
    public final void m79467z(int i) {
        TextView textView = this.f54128d;
        if (i == 0) {
            textView.setText(xau.m209910t(R$string.f47980ai));
        } else {
            textView.setText(xau.m209910t(R$string.f47937Yh));
        }
    }

    public VoiceMedalWallListView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoiceMedalWallListView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54131g = new LiveBaseAdapter();
    }
}
