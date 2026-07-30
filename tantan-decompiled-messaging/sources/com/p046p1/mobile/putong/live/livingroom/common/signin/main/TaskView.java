package com.p046p1.mobile.putong.live.livingroom.common.signin.main;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInReward;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInTask;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.base.view.MaxSizeLayout;
import com.p046p1.mobile.putong.live.base.view.RatioLayout;
import com.p046p1.mobile.putong.live.livingroom.common.signin.C12769a;
import com.p046p1.mobile.putong.live.livingroom.common.signin.main.TaskView;
import com.p046p1.mobile.putong.live.livingroom.common.signin.prize.LiveSignInProgressView;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.e30;
import p149l.hxs;
import p149l.i3c0;
import p149l.qfi0;
import p149l.t100;
import p149l.t6c0;
import p149l.vwb;
import p149l.x1e0;
import p149l.xdl0;
import p149l.ydt;

/* JADX INFO: loaded from: classes4.dex */
public class TaskView extends RatioLayout {

    /* JADX INFO: renamed from: a */
    public VImage f49324a;

    /* JADX INFO: renamed from: b */
    public RatioLayout f49325b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f49326c;

    /* JADX INFO: renamed from: d */
    public HorizontalScrollView f49327d;

    /* JADX INFO: renamed from: e */
    public MaxSizeLayout f49328e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f49329f;

    /* JADX INFO: renamed from: g */
    public VText f49330g;

    /* JADX INFO: renamed from: h */
    public LiveSignInProgressView f49331h;

    /* JADX INFO: renamed from: i */
    public VText f49332i;

    /* JADX INFO: renamed from: j */
    public VText f49333j;

    /* JADX INFO: renamed from: k */
    public VText f49334k;

    /* JADX INFO: renamed from: l */
    public AnimEffectPlayer f49335l;

    /* JADX INFO: renamed from: m */
    public boolean f49336m;

    /* JADX INFO: renamed from: n */
    public ViewGroup.MarginLayoutParams f49337n;

    public TaskView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = t100.f167231F;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, i);
        this.f49337n = marginLayoutParams;
        marginLayoutParams.setMarginEnd(t100.f167260i);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m73233d(boolean z, C12769a c12769a, BLiveSignInTask bLiveSignInTask, int i, View view) {
        if (z) {
            c12769a.m73157Z3(bLiveSignInTask.rewardId, bLiveSignInTask.rewards);
            c12769a.m73182z4(bLiveSignInTask.rewardId, bLiveSignInTask.taskId);
        }
        c12769a.m73154B4(bLiveSignInTask.taskType, bLiveSignInTask.title, i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m73235g(View view) {
        this.f49325b.performClick();
    }

    /* JADX INFO: renamed from: f */
    public final void m73236f(View view) {
        qfi0.m174335a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m73237h(BLiveSignInReward bLiveSignInReward, C12769a c12769a, String str, String str2, int i, boolean z, View view) {
        if (TextUtils.isEmpty(bLiveSignInReward.target)) {
            this.f49325b.performClick();
        } else {
            c12769a.m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(625).m206701e(bLiveSignInReward.target).m206699c());
            c12769a.m73154B4(str, str2, i, z);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m73238i(final boolean z, final C12769a c12769a, final String str, final String str2, final int i, final BLiveSignInReward bLiveSignInReward) {
        TaskRewardView taskRewardView = (TaskRewardView) View.inflate(getContext(), t6c0.f168109M5, null);
        taskRewardView.m73228b(bLiveSignInReward, z);
        this.f49329f.addView(taskRewardView, this.f49337n);
        xdl0.m208329E0(taskRewardView, new View.OnClickListener() { // from class: l.pfi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148560a.m73237h(bLiveSignInReward, c12769a, str, str2, i, z, view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m73239k(final BLiveSignInTask bLiveSignInTask, final int i, final boolean z, final C12769a c12769a) {
        this.f49336m = z;
        xdl0.m208329E0(this.f49325b, new View.OnClickListener() { // from class: l.mfi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TaskView.m73233d(z, c12769a, bLiveSignInTask, i, view);
            }
        });
        xdl0.m208329E0(this.f49328e, new View.OnClickListener() { // from class: l.nfi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138800a.m73235g(view);
            }
        });
        if (z) {
            m73240l(bLiveSignInTask, c12769a, i);
        } else {
            m73242n(bLiveSignInTask, c12769a, i);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m73240l(BLiveSignInTask bLiveSignInTask, C12769a c12769a, int i) {
        xdl0.m208344M(this.f49335l, true);
        xdl0.m208344M(this.f49324a, true);
        xdl0.m208344M(this.f49333j, true);
        xdl0.m208344M(this.f49334k, true);
        xdl0.m208344M(this.f49330g, false);
        xdl0.m208344M(this.f49331h, false);
        xdl0.m208344M(this.f49332i, false);
        hxs.m133411x(this.f49326c, i3c0.f111114o8);
        this.f49333j.setText(bLiveSignInTask.title);
        if (vwb.m200296J(bLiveSignInTask.descriptionAdditional) || bLiveSignInTask.descriptionAdditional.size() < 2) {
            this.f49334k.setText(bLiveSignInTask.description);
        } else {
            this.f49334k.setText(bLiveSignInTask.description + bLiveSignInTask.descriptionAdditional.get(0) + "/" + bLiveSignInTask.descriptionAdditional.get(1));
        }
        m73241m(bLiveSignInTask.rewards, true, c12769a, bLiveSignInTask.taskType, bLiveSignInTask.title, i);
    }

    /* JADX INFO: renamed from: m */
    public final void m73241m(List<BLiveSignInReward> list, final boolean z, final C12769a c12769a, final String str, final String str2, final int i) {
        this.f49329f.removeAllViews();
        if (vwb.m200296J(list)) {
            return;
        }
        vwb.m200354z(list, new e30() { // from class: l.ofi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143694a.m73238i(z, c12769a, str, str2, i, (BLiveSignInReward) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m73242n(BLiveSignInTask bLiveSignInTask, C12769a c12769a, int i) {
        this.f49335l.m68505o();
        xdl0.m208344M(this.f49335l, false);
        xdl0.m208344M(this.f49324a, false);
        xdl0.m208344M(this.f49333j, false);
        xdl0.m208344M(this.f49334k, false);
        xdl0.m208344M(this.f49330g, true);
        xdl0.m208344M(this.f49331h, true);
        if (vwb.m200296J(bLiveSignInTask.descriptionAdditional) || bLiveSignInTask.descriptionAdditional.size() <= 1) {
            xdl0.m208344M(this.f49331h, false);
            xdl0.m208344M(this.f49332i, true);
            this.f49332i.setText(bLiveSignInTask.description);
        } else {
            xdl0.m208344M(this.f49331h, true);
            xdl0.m208344M(this.f49332i, false);
            this.f49331h.m73266b(bLiveSignInTask.description, bLiveSignInTask.descriptionAdditional.get(0).intValue(), bLiveSignInTask.descriptionAdditional.get(1).intValue());
        }
        hxs.m133406s("context_square", this.f49326c, ydt.f197633w);
        this.f49330g.setText(bLiveSignInTask.title);
        m73241m(bLiveSignInTask.rewards, false, c12769a, bLiveSignInTask.taskType, bLiveSignInTask.title, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f49336m) {
            this.f49335l.m68500j("https://auto.tancdn.com/v1/raw/69763ee9-316b-4dc5-89ab-2c66aa2ecaad10.so", -1);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73236f(this);
    }
}
