package com.p051p1.mobile.putong.live.livingroom.virtual.board;

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
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceLeaderBoardEntranceItem;
import com.p051p1.mobile.putong.live.livingroom.virtual.board.VirtualLeadBoardEntranceView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.a1m0;
import p153l.bnl0;
import p153l.bri0;
import p153l.gt0;
import p153l.iam;
import p153l.izs;
import p153l.jyb;
import p153l.mdc0;
import p153l.qa00;
import p153l.qcj;
import p153l.u0m0;
import p153l.x20;
import p153l.yec0;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualLeadBoardEntranceView extends HorizontalScrollView implements iam<u0m0> {

    /* JADX INFO: renamed from: a */
    public VLinear f53033a;

    /* JADX INFO: renamed from: b */
    public u0m0 f53034b;

    /* JADX INFO: renamed from: c */
    public LinearLayout.LayoutParams f53035c;

    /* JADX INFO: renamed from: d */
    public LayoutInflater f53036d;

    /* JADX INFO: renamed from: e */
    public List<BLiveVoiceLeaderBoardEntranceItem> f53037e;

    /* JADX INFO: renamed from: f */
    public AnimatorSet f53038f;

    public VirtualLeadBoardEntranceView(Context context) {
        super(context);
        this.f53037e = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m78009a() {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m78010b(VText vText, String str, VText vText2) {
        vText.setText(str);
        vText.setAlpha(1.0f);
        vText.setTranslationY(0.0f);
        bnl0.m105524M(vText, true);
        bnl0.m105525M0(vText2, false);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m78013e(VText vText, VText vText2) {
        vText.setAlpha(1.0f);
        vText.setTranslationY(0.0f);
        vText2.setAlpha(0.0f);
        vText2.setTranslationY(12.0f);
        bnl0.m105524M(vText2, true);
        bnl0.m105524M(vText, true);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: f */
    public final void m78014f(View view) {
        a1m0.m95517a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(u0m0 u0m0Var) {
        this.f53034b = u0m0Var;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        this.f53035c = layoutParams;
        layoutParams.leftMargin = qa00.f156323j;
        this.f53036d = LayoutInflater.from(getContext());
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final View m78016j(LayoutInflater layoutInflater, final BLiveVoiceLeaderBoardEntranceItem bLiveVoiceLeaderBoardEntranceItem) {
        View viewInflate = layoutInflater.inflate(yec0.f198746E6, (ViewGroup) null);
        izs.m142868s("context_livingAct", (VDraweeView) viewInflate.findViewById(mdc0.f136000N), bLiveVoiceLeaderBoardEntranceItem.icon);
        ((VText) viewInflate.findViewById(mdc0.f136009O)).setText(bLiveVoiceLeaderBoardEntranceItem.title);
        bnl0.m105509E0(viewInflate, new View.OnClickListener() { // from class: l.x0m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f191918a.m78017k(bLiveVoiceLeaderBoardEntranceItem, view);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m78017k(BLiveVoiceLeaderBoardEntranceItem bLiveVoiceLeaderBoardEntranceItem, View view) {
        this.f53034b.m193854S3(bLiveVoiceLeaderBoardEntranceItem);
    }

    /* JADX INFO: renamed from: l */
    public final void m78018l(final VText vText, final VText vText2, x20 x20Var) {
        Animator animatorM132164j = gt0.m132164j(500);
        Property property = HorizontalScrollView.TRANSLATION_Y;
        Animator animatorM132166l = gt0.m132166l(vText, property, 0L, 500L, null, 0.0f, -12.0f);
        Property property2 = HorizontalScrollView.ALPHA;
        Animator animatorM132166l2 = gt0.m132166l(vText, property2, 0L, 500L, null, 1.0f, 0.0f);
        Animator animatorM132166l3 = gt0.m132166l(vText2, property, 200L, 500L, null, 12.0f, 0.0f);
        Animator animatorM132166l4 = gt0.m132166l(vText2, property2, 200L, 500L, null, 0.0f, 1.0f);
        gt0.m132177w(animatorM132166l2, new Runnable() { // from class: l.y0m0
            @Override // java.lang.Runnable
            public final void run() {
                VirtualLeadBoardEntranceView.m78013e(vText, vText2);
            }
        }, new Runnable() { // from class: l.z0m0
            @Override // java.lang.Runnable
            public final void run() {
                VirtualLeadBoardEntranceView.m78009a();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f53038f = animatorSet;
        animatorSet.playSequentially(animatorM132164j, gt0.m132180z(animatorM132166l, animatorM132166l2, animatorM132166l3, animatorM132166l4));
        AnimatorSet animatorSet2 = this.f53038f;
        Objects.requireNonNull(x20Var);
        gt0.m132160f(animatorSet2, new bri0(x20Var));
        this.f53038f.start();
    }

    /* JADX INFO: renamed from: m */
    public final void m78019m(final VText vText, final VText vText2, String str, final String str2) {
        if (str.equals(str2)) {
            return;
        }
        vText2.setText(str2);
        m78018l(vText, vText2, new x20() { // from class: l.w0m0
            @Override // p153l.x20
            public final void call() {
                VirtualLeadBoardEntranceView.m78010b(vText, str2, vText2);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m78020n(List<BLiveVoiceLeaderBoardEntranceItem> list) {
        int i = 0;
        bnl0.m105524M(this, (jyb.m147479J(list) && jyb.m147479J(this.f53037e)) ? false : true);
        boolean z = (jyb.m147479J(this.f53037e) || this.f53037e.size() == list.size()) ? false : true;
        if (jyb.m147479J(this.f53037e) || z) {
            this.f53033a.removeAllViews();
            while (i < list.size()) {
                this.f53033a.addView(m78016j(this.f53036d, list.get(i)), this.f53035c);
                i++;
            }
        } else {
            while (i < list.size()) {
                final BLiveVoiceLeaderBoardEntranceItem bLiveVoiceLeaderBoardEntranceItem = list.get(i);
                BLiveVoiceLeaderBoardEntranceItem bLiveVoiceLeaderBoardEntranceItem2 = (BLiveVoiceLeaderBoardEntranceItem) jyb.m147529r(this.f53037e, new qcj() { // from class: l.v0m0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(bLiveVoiceLeaderBoardEntranceItem.type.equals(((BLiveVoiceLeaderBoardEntranceItem) obj).type));
                    }
                });
                if (bLiveVoiceLeaderBoardEntranceItem2 != null && this.f53033a.getChildAt(i) != null) {
                    m78019m((VText) this.f53033a.getChildAt(i).findViewById(mdc0.f136009O), (VText) this.f53033a.getChildAt(i).findViewById(mdc0.f136018P), bLiveVoiceLeaderBoardEntranceItem2.title, list.get(i).title);
                }
                i++;
            }
        }
        this.f53037e = list;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f53038f;
        if (animatorSet == null || !animatorSet.isRunning()) {
            return;
        }
        this.f53038f.end();
        this.f53038f.cancel();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78014f(this);
    }

    public VirtualLeadBoardEntranceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53037e = new ArrayList();
    }

    public VirtualLeadBoardEntranceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53037e = new ArrayList();
    }
}
