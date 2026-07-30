package com.p000p1.mobile.putong.live.livingroom.common.signin.main;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.common.signin.C0358a;
import com.p000p1.mobile.putong.live.livingroom.common.signin.main.TaskView;
import com.p000p1.mobile.putong.live.livingroom.common.signin.prize.LiveSignInProgressView;
import com.p1.mobile.putong.live.base.data.BLiveSignInReward;
import com.p1.mobile.putong.live.base.data.BLiveSignInTask;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p1.mobile.putong.live.base.view.MaxSizeLayout;
import com.p1.mobile.putong.live.base.view.RatioLayout;
import java.util.List;
import l.e30;
import l.hxs;
import l.t100;
import l.vwb;
import l.xdl0;
import l.ydt;
import p002l.i3c0;
import p002l.qfi0;
import p002l.t6c0;
import p002l.x1e0;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class TaskView extends RatioLayout {

    /* JADX INFO: renamed from: a */
    public VImage f5366a;

    /* JADX INFO: renamed from: b */
    public RatioLayout f5367b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f5368c;

    /* JADX INFO: renamed from: d */
    public HorizontalScrollView f5369d;

    /* JADX INFO: renamed from: e */
    public MaxSizeLayout f5370e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f5371f;

    /* JADX INFO: renamed from: g */
    public VText f5372g;

    /* JADX INFO: renamed from: h */
    public LiveSignInProgressView f5373h;

    /* JADX INFO: renamed from: i */
    public VText f5374i;

    /* JADX INFO: renamed from: j */
    public VText f5375j;

    /* JADX INFO: renamed from: k */
    public VText f5376k;

    /* JADX INFO: renamed from: l */
    public AnimEffectPlayer f5377l;

    /* JADX INFO: renamed from: m */
    public boolean f5378m;

    /* JADX INFO: renamed from: n */
    public ViewGroup.MarginLayoutParams f5379n;

    public TaskView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = t100.F;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, i);
        this.f5379n = marginLayoutParams;
        marginLayoutParams.setMarginEnd(t100.i);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m6763d(boolean z, C0358a c0358a, BLiveSignInTask bLiveSignInTask, int i, View view) {
        if (z) {
            c0358a.m6685Z3(bLiveSignInTask.rewardId, bLiveSignInTask.rewards);
            c0358a.m6711z4(bLiveSignInTask.rewardId, bLiveSignInTask.taskId);
        }
        c0358a.m6682B4(bLiveSignInTask.taskType, bLiveSignInTask.title, i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m6765g(View view) {
        this.f5367b.performClick();
    }

    /* JADX INFO: renamed from: f */
    public final void m6766f(View view) {
        qfi0.m21253a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m6767h(BLiveSignInReward bLiveSignInReward, C0358a c0358a, String str, String str2, int i, boolean z, View view) {
        if (TextUtils.isEmpty(bLiveSignInReward.target)) {
            this.f5367b.performClick();
        } else {
            c0358a.m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(625).m25610e(bLiveSignInReward.target).m25608c());
            c0358a.m6682B4(str, str2, i, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m6768i(final boolean z, final C0358a c0358a, final String str, final String str2, final int i, final BLiveSignInReward bLiveSignInReward) {
        TaskRewardView taskRewardView = (TaskRewardView) View.inflate(getContext(), t6c0.f19605M5, null);
        taskRewardView.m6758b(bLiveSignInReward, z);
        this.f5371f.addView(taskRewardView, this.f5379n);
        xdl0.E0(taskRewardView, new View.OnClickListener() { // from class: l.pfi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17245a.m6767h(bLiveSignInReward, c0358a, str, str2, i, z, view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m6769k(final BLiveSignInTask bLiveSignInTask, final int i, final boolean z, final C0358a c0358a) {
        this.f5378m = z;
        xdl0.E0(this.f5367b, new View.OnClickListener() { // from class: l.mfi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TaskView.m6763d(z, c0358a, bLiveSignInTask, i, view);
            }
        });
        xdl0.E0(this.f5370e, new View.OnClickListener() { // from class: l.nfi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16012a.m6765g(view);
            }
        });
        if (z) {
            m6770l(bLiveSignInTask, c0358a, i);
        } else {
            m6772n(bLiveSignInTask, c0358a, i);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m6770l(BLiveSignInTask bLiveSignInTask, C0358a c0358a, int i) {
        xdl0.M(this.f5377l, true);
        xdl0.M(this.f5366a, true);
        xdl0.M(this.f5375j, true);
        xdl0.M(this.f5376k, true);
        xdl0.M(this.f5372g, false);
        xdl0.M(this.f5373h, false);
        xdl0.M(this.f5374i, false);
        hxs.x(this.f5368c, i3c0.f12899o8);
        this.f5375j.setText(bLiveSignInTask.title);
        if (vwb.J(bLiveSignInTask.descriptionAdditional) || bLiveSignInTask.descriptionAdditional.size() < 2) {
            this.f5376k.setText(bLiveSignInTask.description);
        } else {
            this.f5376k.setText(bLiveSignInTask.description + bLiveSignInTask.descriptionAdditional.get(0) + "/" + bLiveSignInTask.descriptionAdditional.get(1));
        }
        m6771m(bLiveSignInTask.rewards, true, c0358a, bLiveSignInTask.taskType, bLiveSignInTask.title, i);
    }

    /* JADX INFO: renamed from: m */
    public final void m6771m(List<BLiveSignInReward> list, final boolean z, final C0358a c0358a, final String str, final String str2, final int i) {
        this.f5371f.removeAllViews();
        if (vwb.J(list)) {
            return;
        }
        vwb.z(list, new e30() { // from class: l.ofi0
            public final void call(Object obj) {
                this.f16552a.m6768i(z, c0358a, str, str2, i, (BLiveSignInReward) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m6772n(BLiveSignInTask bLiveSignInTask, C0358a c0358a, int i) {
        this.f5377l.o();
        xdl0.M(this.f5377l, false);
        xdl0.M(this.f5366a, false);
        xdl0.M(this.f5375j, false);
        xdl0.M(this.f5376k, false);
        xdl0.M(this.f5372g, true);
        xdl0.M(this.f5373h, true);
        if (vwb.J(bLiveSignInTask.descriptionAdditional) || bLiveSignInTask.descriptionAdditional.size() <= 1) {
            xdl0.M(this.f5373h, false);
            xdl0.M(this.f5374i, true);
            this.f5374i.setText(bLiveSignInTask.description);
        } else {
            xdl0.M(this.f5373h, true);
            xdl0.M(this.f5374i, false);
            this.f5373h.m6801b(bLiveSignInTask.description, ((Integer) bLiveSignInTask.descriptionAdditional.get(0)).intValue(), ((Integer) bLiveSignInTask.descriptionAdditional.get(1)).intValue());
        }
        hxs.s("context_square", this.f5368c, ydt.w);
        this.f5372g.setText(bLiveSignInTask.title);
        m6771m(bLiveSignInTask.rewards, false, c0358a, bLiveSignInTask.taskType, bLiveSignInTask.title, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        if (this.f5378m) {
            this.f5377l.j("https://auto.tancdn.com/v1/raw/69763ee9-316b-4dc5-89ab-2c66aa2ecaad10.so", -1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6766f(this);
    }
}
