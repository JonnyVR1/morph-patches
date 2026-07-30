package com.p000p1.mobile.putong.live.livingroom.common.member.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p000p1.mobile.putong.live.livingroom.common.member.LiveMemberItem;
import com.p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.mqv;
import l.xdl0;
import p002l.gm0;
import p002l.sey;
import p002l.t6c0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MemberWeekLeaderBoardContentView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public MemberWeekLeaderBoardContentView f5283d;

    /* JADX INFO: renamed from: e */
    public RadioGroup f5284e;

    /* JADX INFO: renamed from: f */
    public RadioButton f5285f;

    /* JADX INFO: renamed from: g */
    public RadioButton f5286g;

    /* JADX INFO: renamed from: h */
    public VImage f5287h;

    /* JADX INFO: renamed from: i */
    public SwipeRefreshLayout f5288i;

    /* JADX INFO: renamed from: j */
    public RecyclerView f5289j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f5290k;

    /* JADX INFO: renamed from: l */
    public LiveMemberItem f5291l;

    /* JADX INFO: renamed from: m */
    public d30 f5292m;

    /* JADX INFO: renamed from: n */
    public d30 f5293n;

    /* JADX INFO: renamed from: o */
    public View.OnClickListener f5294o;

    /* JADX INFO: renamed from: p */
    public e30<String> f5295p;

    public MemberWeekLeaderBoardContentView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l0 */
    public static MemberWeekLeaderBoardContentView m6620l0(LayoutInflater layoutInflater) {
        return (MemberWeekLeaderBoardContentView) layoutInflater.inflate(t6c0.f19723W3, (ViewGroup) null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m6621o0(View view) {
        View.OnClickListener onClickListener = this.f5294o;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public String getWeekBoardItem() {
        return (!this.f5285f.isChecked() && this.f5286g.isChecked()) ? "lastWeek" : "currentWeek";
    }

    /* JADX INFO: renamed from: k0 */
    public final void m6622k0(View view) {
        sey.m22410a(this, view);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m6623m0(RadioGroup radioGroup, int i) {
        if (NullChecker.a(this.f5293n)) {
            this.f5293n.call();
        }
        this.f5288i.setEnabled(TextUtils.equals(getWeekBoardItem(), "currentWeek"));
        xdl0.M(this.f5290k, TextUtils.equals(getWeekBoardItem(), "currentWeek"));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m6624n0() {
        if (NullChecker.a(this.f5292m)) {
            this.f5292m.call();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6622k0(this);
        this.f5289j.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f5284e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: l.pey
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                this.f17232a.m6623m0(radioGroup, i);
            }
        });
        this.f5288i.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: l.qey
            /* JADX INFO: renamed from: q */
            public final void m21244q() {
                this.f17964a.m6624n0();
            }
        });
        xdl0.E0(this.f5287h, new View.OnClickListener() { // from class: l.rey
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18488a.m6621o0(view);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public void m6625p0(mqv<BLiveLeaderBoards> mqvVar, gm0 gm0Var) {
        if (NullChecker.a(mqvVar)) {
            if (!TextUtils.equals(getWeekBoardItem(), "currentWeek") || !NullChecker.a(((BLiveLeaderBoards) mqvVar.a).user)) {
                xdl0.M(this.f5290k, false);
            } else {
                xdl0.M(this.f5290k, true);
                this.f5291l.m6596p(this.f5295p, mqvVar, gm0Var, "currentWeek", true);
            }
        }
    }

    public void setOnCheckedChangeListener(d30 d30Var) {
        this.f5293n = d30Var;
    }

    public void setOnJumpClickListener(View.OnClickListener onClickListener) {
        this.f5294o = onClickListener;
    }

    public void setOnRefreshListener(d30 d30Var) {
        this.f5292m = d30Var;
    }

    public void setShowCardAction(e30<String> e30Var) {
        this.f5295p = e30Var;
    }

    public MemberWeekLeaderBoardContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MemberWeekLeaderBoardContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
