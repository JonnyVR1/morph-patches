package com.p051p1.mobile.putong.live.livingroom.common.signin.main;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInReward;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInTask;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.base.view.MaxSizeLayout;
import com.p051p1.mobile.putong.live.base.view.RatioLayout;
import com.p051p1.mobile.putong.live.livingroom.common.signin.C12932a;
import com.p051p1.mobile.putong.live.livingroom.common.signin.main.TaskView;
import com.p051p1.mobile.putong.live.livingroom.common.signin.prize.LiveSignInProgressView;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bae0;
import p153l.bnl0;
import p153l.izs;
import p153l.jyb;
import p153l.obc0;
import p153l.qa00;
import p153l.qoi0;
import p153l.y20;
import p153l.yec0;
import p153l.zft;

/* JADX INFO: loaded from: classes4.dex */
public class TaskView extends RatioLayout {

    /* JADX INFO: renamed from: a */
    public VImage f50172a;

    /* JADX INFO: renamed from: b */
    public RatioLayout f50173b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f50174c;

    /* JADX INFO: renamed from: d */
    public HorizontalScrollView f50175d;

    /* JADX INFO: renamed from: e */
    public MaxSizeLayout f50176e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f50177f;

    /* JADX INFO: renamed from: g */
    public VText f50178g;

    /* JADX INFO: renamed from: h */
    public LiveSignInProgressView f50179h;

    /* JADX INFO: renamed from: i */
    public VText f50180i;

    /* JADX INFO: renamed from: j */
    public VText f50181j;

    /* JADX INFO: renamed from: k */
    public VText f50182k;

    /* JADX INFO: renamed from: l */
    public AnimEffectPlayer f50183l;

    /* JADX INFO: renamed from: m */
    public boolean f50184m;

    /* JADX INFO: renamed from: n */
    public ViewGroup.MarginLayoutParams f50185n;

    public TaskView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = qa00.f156293F;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, i);
        this.f50185n = marginLayoutParams;
        marginLayoutParams.setMarginEnd(qa00.f156322i);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m74416d(boolean z, C12932a c12932a, BLiveSignInTask bLiveSignInTask, int i, View view) {
        if (z) {
            c12932a.m74340Z3(bLiveSignInTask.rewardId, bLiveSignInTask.rewards);
            c12932a.m74365z4(bLiveSignInTask.rewardId, bLiveSignInTask.taskId);
        }
        c12932a.m74337B4(bLiveSignInTask.taskType, bLiveSignInTask.title, i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m74418g(View view) {
        this.f50173b.performClick();
    }

    /* JADX INFO: renamed from: f */
    public final void m74419f(View view) {
        qoi0.m177305a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m74420h(BLiveSignInReward bLiveSignInReward, C12932a c12932a, String str, String str2, int i, boolean z, View view) {
        if (TextUtils.isEmpty(bLiveSignInReward.target)) {
            this.f50173b.performClick();
        } else {
            c12932a.m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(625).m103154e(bLiveSignInReward.target).m103152c());
            c12932a.m74337B4(str, str2, i, z);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m74421i(final boolean z, final C12932a c12932a, final String str, final String str2, final int i, final BLiveSignInReward bLiveSignInReward) {
        TaskRewardView taskRewardView = (TaskRewardView) View.inflate(getContext(), yec0.f198841M5, null);
        taskRewardView.m74411b(bLiveSignInReward, z);
        this.f50177f.addView(taskRewardView, this.f50185n);
        bnl0.m105509E0(taskRewardView, new View.OnClickListener() { // from class: l.poi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f153405a.m74420h(bLiveSignInReward, c12932a, str, str2, i, z, view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m74422k(final BLiveSignInTask bLiveSignInTask, final int i, final boolean z, final C12932a c12932a) {
        this.f50184m = z;
        bnl0.m105509E0(this.f50173b, new View.OnClickListener() { // from class: l.moi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TaskView.m74416d(z, c12932a, bLiveSignInTask, i, view);
            }
        });
        bnl0.m105509E0(this.f50176e, new View.OnClickListener() { // from class: l.noi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142987a.m74418g(view);
            }
        });
        if (z) {
            m74423l(bLiveSignInTask, c12932a, i);
        } else {
            m74425n(bLiveSignInTask, c12932a, i);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m74423l(BLiveSignInTask bLiveSignInTask, C12932a c12932a, int i) {
        bnl0.m105524M(this.f50183l, true);
        bnl0.m105524M(this.f50172a, true);
        bnl0.m105524M(this.f50181j, true);
        bnl0.m105524M(this.f50182k, true);
        bnl0.m105524M(this.f50178g, false);
        bnl0.m105524M(this.f50179h, false);
        bnl0.m105524M(this.f50180i, false);
        izs.m142873x(this.f50174c, obc0.f146442o8);
        this.f50181j.setText(bLiveSignInTask.title);
        if (jyb.m147479J(bLiveSignInTask.descriptionAdditional) || bLiveSignInTask.descriptionAdditional.size() < 2) {
            this.f50182k.setText(bLiveSignInTask.description);
        } else {
            this.f50182k.setText(bLiveSignInTask.description + bLiveSignInTask.descriptionAdditional.get(0) + "/" + bLiveSignInTask.descriptionAdditional.get(1));
        }
        m74424m(bLiveSignInTask.rewards, true, c12932a, bLiveSignInTask.taskType, bLiveSignInTask.title, i);
    }

    /* JADX INFO: renamed from: m */
    public final void m74424m(List<BLiveSignInReward> list, final boolean z, final C12932a c12932a, final String str, final String str2, final int i) {
        this.f50177f.removeAllViews();
        if (jyb.m147479J(list)) {
            return;
        }
        jyb.m147537z(list, new y20() { // from class: l.ooi0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148366a.m74421i(z, c12932a, str, str2, i, (BLiveSignInReward) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m74425n(BLiveSignInTask bLiveSignInTask, C12932a c12932a, int i) {
        this.f50183l.m69688o();
        bnl0.m105524M(this.f50183l, false);
        bnl0.m105524M(this.f50172a, false);
        bnl0.m105524M(this.f50181j, false);
        bnl0.m105524M(this.f50182k, false);
        bnl0.m105524M(this.f50178g, true);
        bnl0.m105524M(this.f50179h, true);
        if (jyb.m147479J(bLiveSignInTask.descriptionAdditional) || bLiveSignInTask.descriptionAdditional.size() <= 1) {
            bnl0.m105524M(this.f50179h, false);
            bnl0.m105524M(this.f50180i, true);
            this.f50180i.setText(bLiveSignInTask.description);
        } else {
            bnl0.m105524M(this.f50179h, true);
            bnl0.m105524M(this.f50180i, false);
            this.f50179h.m74449b(bLiveSignInTask.description, bLiveSignInTask.descriptionAdditional.get(0).intValue(), bLiveSignInTask.descriptionAdditional.get(1).intValue());
        }
        izs.m142868s("context_square", this.f50174c, zft.f204228w);
        this.f50178g.setText(bLiveSignInTask.title);
        m74424m(bLiveSignInTask.rewards, false, c12932a, bLiveSignInTask.taskType, bLiveSignInTask.title, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f50184m) {
            this.f50183l.m69683j("https://auto.tancdn.com/v1/raw/69763ee9-316b-4dc5-89ab-2c66aa2ecaad10.so", -1);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74419f(this);
    }
}
