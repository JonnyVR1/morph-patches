package com.p046p1.mobile.putong.live.livingroom.virtual.board;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceLeaderBoardEntranceItem;
import com.p046p1.mobile.putong.live.livingroom.virtual.board.VirtualLeadBoardEntranceView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.bii0;
import p149l.bt0;
import p149l.d30;
import p149l.g5c0;
import p149l.hxs;
import p149l.qrl0;
import p149l.s7m;
import p149l.t100;
import p149l.t6c0;
import p149l.vwb;
import p149l.w9j;
import p149l.wrl0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualLeadBoardEntranceView extends HorizontalScrollView implements s7m<qrl0> {

    /* JADX INFO: renamed from: a */
    public VLinear f52185a;

    /* JADX INFO: renamed from: b */
    public qrl0 f52186b;

    /* JADX INFO: renamed from: c */
    public LinearLayout.LayoutParams f52187c;

    /* JADX INFO: renamed from: d */
    public LayoutInflater f52188d;

    /* JADX INFO: renamed from: e */
    public List<BLiveVoiceLeaderBoardEntranceItem> f52189e;

    /* JADX INFO: renamed from: f */
    public AnimatorSet f52190f;

    public VirtualLeadBoardEntranceView(Context context) {
        super(context);
        this.f52189e = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76826a() {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m76827b(VText vText, String str, VText vText2) {
        vText.setText(str);
        vText.setAlpha(1.0f);
        vText.setTranslationY(0.0f);
        xdl0.m208344M(vText, true);
        xdl0.m208345M0(vText2, false);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m76830e(VText vText, VText vText2) {
        vText.setAlpha(1.0f);
        vText.setTranslationY(0.0f);
        vText2.setAlpha(0.0f);
        vText2.setTranslationY(12.0f);
        xdl0.m208344M(vText2, true);
        xdl0.m208344M(vText, true);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: f */
    public final void m76831f(View view) {
        wrl0.m205261a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(qrl0 qrl0Var) {
        this.f52186b = qrl0Var;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        this.f52187c = layoutParams;
        layoutParams.leftMargin = t100.f167261j;
        this.f52188d = LayoutInflater.from(getContext());
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final View m76833j(LayoutInflater layoutInflater, final BLiveVoiceLeaderBoardEntranceItem bLiveVoiceLeaderBoardEntranceItem) {
        View viewInflate = layoutInflater.inflate(t6c0.f168014E6, (ViewGroup) null);
        hxs.m133406s("context_livingAct", (VDraweeView) viewInflate.findViewById(g5c0.f100755N), bLiveVoiceLeaderBoardEntranceItem.icon);
        ((VText) viewInflate.findViewById(g5c0.f100764O)).setText(bLiveVoiceLeaderBoardEntranceItem.title);
        xdl0.m208329E0(viewInflate, new View.OnClickListener() { // from class: l.trl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171824a.m76834k(bLiveVoiceLeaderBoardEntranceItem, view);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m76834k(BLiveVoiceLeaderBoardEntranceItem bLiveVoiceLeaderBoardEntranceItem, View view) {
        this.f52186b.m176048S3(bLiveVoiceLeaderBoardEntranceItem);
    }

    /* JADX INFO: renamed from: l */
    public final void m76835l(final VText vText, final VText vText2, d30 d30Var) {
        Animator animatorM103737j = bt0.m103737j(500);
        Property property = HorizontalScrollView.TRANSLATION_Y;
        Animator animatorM103739l = bt0.m103739l(vText, property, 0L, 500L, null, 0.0f, -12.0f);
        Property property2 = HorizontalScrollView.ALPHA;
        Animator animatorM103739l2 = bt0.m103739l(vText, property2, 0L, 500L, null, 1.0f, 0.0f);
        Animator animatorM103739l3 = bt0.m103739l(vText2, property, 200L, 500L, null, 12.0f, 0.0f);
        Animator animatorM103739l4 = bt0.m103739l(vText2, property2, 200L, 500L, null, 0.0f, 1.0f);
        bt0.m103750w(animatorM103739l2, new Runnable() { // from class: l.url0
            @Override // java.lang.Runnable
            public final void run() {
                VirtualLeadBoardEntranceView.m76830e(vText, vText2);
            }
        }, new Runnable() { // from class: l.vrl0
            @Override // java.lang.Runnable
            public final void run() {
                VirtualLeadBoardEntranceView.m76826a();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f52190f = animatorSet;
        animatorSet.playSequentially(animatorM103737j, bt0.m103753z(animatorM103739l, animatorM103739l2, animatorM103739l3, animatorM103739l4));
        AnimatorSet animatorSet2 = this.f52190f;
        Objects.requireNonNull(d30Var);
        bt0.m103733f(animatorSet2, new bii0(d30Var));
        this.f52190f.start();
    }

    /* JADX INFO: renamed from: m */
    public final void m76836m(final VText vText, final VText vText2, String str, final String str2) {
        if (str.equals(str2)) {
            return;
        }
        vText2.setText(str2);
        m76835l(vText, vText2, new d30() { // from class: l.srl0
            @Override // p149l.d30
            public final void call() {
                VirtualLeadBoardEntranceView.m76827b(vText, str2, vText2);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m76837n(List<BLiveVoiceLeaderBoardEntranceItem> list) {
        int i = 0;
        xdl0.m208344M(this, (vwb.m200296J(list) && vwb.m200296J(this.f52189e)) ? false : true);
        boolean z = (vwb.m200296J(this.f52189e) || this.f52189e.size() == list.size()) ? false : true;
        if (vwb.m200296J(this.f52189e) || z) {
            this.f52185a.removeAllViews();
            while (i < list.size()) {
                this.f52185a.addView(m76833j(this.f52188d, list.get(i)), this.f52187c);
                i++;
            }
        } else {
            while (i < list.size()) {
                final BLiveVoiceLeaderBoardEntranceItem bLiveVoiceLeaderBoardEntranceItem = list.get(i);
                BLiveVoiceLeaderBoardEntranceItem bLiveVoiceLeaderBoardEntranceItem2 = (BLiveVoiceLeaderBoardEntranceItem) vwb.m200346r(this.f52189e, new w9j() { // from class: l.rrl0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(bLiveVoiceLeaderBoardEntranceItem.type.equals(((BLiveVoiceLeaderBoardEntranceItem) obj).type));
                    }
                });
                if (bLiveVoiceLeaderBoardEntranceItem2 != null && this.f52185a.getChildAt(i) != null) {
                    m76836m((VText) this.f52185a.getChildAt(i).findViewById(g5c0.f100764O), (VText) this.f52185a.getChildAt(i).findViewById(g5c0.f100773P), bLiveVoiceLeaderBoardEntranceItem2.title, list.get(i).title);
                }
                i++;
            }
        }
        this.f52189e = list;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f52190f;
        if (animatorSet == null || !animatorSet.isRunning()) {
            return;
        }
        this.f52190f.end();
        this.f52190f.cancel();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76831f(this);
    }

    public VirtualLeadBoardEntranceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52189e = new ArrayList();
    }

    public VirtualLeadBoardEntranceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52189e = new ArrayList();
    }
}
