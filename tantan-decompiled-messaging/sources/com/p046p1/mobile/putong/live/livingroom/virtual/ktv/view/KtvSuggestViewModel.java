package com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view;

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
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKTVSong;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p149l.bt0;
import p149l.d1q;
import p149l.dt0;
import p149l.g5c0;
import p149l.hxs;
import p149l.j4r;
import p149l.lsi0;
import p149l.s7m;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.y3r;
import p149l.ydt;

/* JADX INFO: loaded from: classes5.dex */
public class KtvSuggestViewModel extends ConstraintLayout implements s7m<j4r> {

    /* JADX INFO: renamed from: d */
    public RecyclerView f52448d;

    /* JADX INFO: renamed from: e */
    public LiveBaseAdapter f52449e;

    /* JADX INFO: renamed from: f */
    public View f52450f;

    /* JADX INFO: renamed from: g */
    public j4r f52451g;

    /* JADX INFO: renamed from: h */
    public TextView f52452h;

    /* JADX INFO: renamed from: i */
    public Animator f52453i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f52454j;

    public KtvSuggestViewModel(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m77105n0(View view) {
        this.f52451g.m139774c4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m77106o0(View view) {
        this.f52451g.m206028F2().KtvDialogEvent.showKtvDialog().mo172463j(0);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(j4r j4rVar) {
        this.f52451g = j4rVar;
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m77108m0() {
        LiveBaseAdapter liveBaseAdapter = this.f52449e;
        if (liveBaseAdapter == null) {
            return false;
        }
        return vwb.m200337m(liveBaseAdapter.m67355J(), new w9j() { // from class: l.n4r
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((y3r) ((d1q) obj)).f195843b.isOrdered);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f52450f = findViewById(g5c0.f100878a5);
        this.f52448d = (RecyclerView) findViewById(g5c0.f100989l6);
        this.f52452h = (TextView) findViewById(g5c0.f100910d7);
        this.f52454j = (VDraweeView) findViewById(g5c0.f100761N5);
        this.f52448d.setLayoutManager(new GridLayoutManager(getContext(), 3));
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f52449e = liveBaseAdapter;
        this.f52448d.setAdapter(liveBaseAdapter);
        xdl0.m208329E0(this.f52450f, new View.OnClickListener() { // from class: l.k4r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121117a.m77105n0(view);
            }
        });
        xdl0.m208329E0(this.f52452h, new View.OnClickListener() { // from class: l.l4r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f126053a.m77106o0(view);
            }
        });
        hxs.m133406s("context_livingAct", this.f52454j, ydt.f197607J);
    }

    /* JADX INFO: renamed from: p0 */
    public void m77109p0(List<BLiveVoiceKTVSong> list, boolean z) {
        if (vwb.m200296J(list)) {
            lsi0.m151595y("没有更多数据了");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new y3r(this.f52451g, list.get(i), i));
        }
        this.f52449e.m67371Z(arrayList);
        dt0.m113502B(this.f52453i);
        if (z) {
            Animator animatorM103739l = bt0.m103739l(this.f52448d, View.TRANSLATION_X, 0L, 500L, bt0.f77159f, xdl0.m208412y0(), 0.0f);
            this.f52453i = animatorM103739l;
            animatorM103739l.start();
        }
    }

    public void setSongSelected(final BLiveVoiceKTVSong bLiveVoiceKTVSong) {
        d1q<?> d1qVar = (d1q) vwb.m200346r(this.f52449e.m67355J(), new w9j() { // from class: l.m4r
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((y3r) ((d1q) obj)).f195843b.songCode, bLiveVoiceKTVSong.songCode));
            }
        });
        if (d1qVar != null) {
            this.f52449e.m67360O(d1qVar);
        }
    }

    public KtvSuggestViewModel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KtvSuggestViewModel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
