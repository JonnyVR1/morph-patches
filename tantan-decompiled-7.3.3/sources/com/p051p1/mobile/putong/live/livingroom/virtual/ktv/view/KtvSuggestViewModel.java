package com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKTVSong;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.d3q;
import p153l.gt0;
import p153l.iam;
import p153l.it0;
import p153l.izs;
import p153l.jyb;
import p153l.k6r;
import p153l.mdc0;
import p153l.o1j0;
import p153l.qcj;
import p153l.z5r;
import p153l.zft;

/* JADX INFO: loaded from: classes5.dex */
public class KtvSuggestViewModel extends ConstraintLayout implements iam<k6r> {

    /* JADX INFO: renamed from: d */
    public RecyclerView f53296d;

    /* JADX INFO: renamed from: e */
    public LiveBaseAdapter f53297e;

    /* JADX INFO: renamed from: f */
    public View f53298f;

    /* JADX INFO: renamed from: g */
    public k6r f53299g;

    /* JADX INFO: renamed from: h */
    public TextView f53300h;

    /* JADX INFO: renamed from: i */
    public Animator f53301i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f53302j;

    public KtvSuggestViewModel(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m78288n0(View view) {
        this.f53299g.m148558c4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m78289o0(View view) {
        this.f53299g.m213811F2().KtvDialogEvent.showKtvDialog().mo199273j(0);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(k6r k6rVar) {
        this.f53299g = k6rVar;
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m78291m0() {
        LiveBaseAdapter liveBaseAdapter = this.f53297e;
        if (liveBaseAdapter == null) {
            return false;
        }
        return jyb.m147520m(liveBaseAdapter.m68538J(), new qcj() { // from class: l.o6r
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((z5r) ((d3q) obj)).f203078b.isOrdered);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f53298f = findViewById(mdc0.f136123a5);
        this.f53296d = (RecyclerView) findViewById(mdc0.f136234l6);
        this.f53300h = (TextView) findViewById(mdc0.f136155d7);
        this.f53302j = (VDraweeView) findViewById(mdc0.f136006N5);
        this.f53296d.setLayoutManager(new GridLayoutManager(getContext(), 3));
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f53297e = liveBaseAdapter;
        this.f53296d.setAdapter(liveBaseAdapter);
        bnl0.m105509E0(this.f53298f, new View.OnClickListener() { // from class: l.l6r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130282a.m78288n0(view);
            }
        });
        bnl0.m105509E0(this.f53300h, new View.OnClickListener() { // from class: l.m6r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135023a.m78289o0(view);
            }
        });
        izs.m142868s("context_livingAct", this.f53302j, zft.f204202J);
    }

    /* JADX INFO: renamed from: p0 */
    public void m78292p0(List<BLiveVoiceKTVSong> list, boolean z) {
        if (jyb.m147479J(list)) {
            o1j0.m165651y("没有更多数据了");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new z5r(this.f53299g, list.get(i), i));
        }
        this.f53297e.m68554Z(arrayList);
        it0.m142008B(this.f53301i);
        if (z) {
            Animator animatorM132166l = gt0.m132166l(this.f53296d, View.TRANSLATION_X, 0L, 500L, gt0.f106351f, bnl0.m105592y0(), 0.0f);
            this.f53301i = animatorM132166l;
            animatorM132166l.start();
        }
    }

    public void setSongSelected(final BLiveVoiceKTVSong bLiveVoiceKTVSong) {
        d3q<?> d3qVar = (d3q) jyb.m147529r(this.f53297e.m68538J(), new qcj() { // from class: l.n6r
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((z5r) ((d3q) obj)).f203078b.songCode, bLiveVoiceKTVSong.songCode));
            }
        });
        if (d3qVar != null) {
            this.f53297e.m68543O(d3qVar);
        }
    }

    public KtvSuggestViewModel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KtvSuggestViewModel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
