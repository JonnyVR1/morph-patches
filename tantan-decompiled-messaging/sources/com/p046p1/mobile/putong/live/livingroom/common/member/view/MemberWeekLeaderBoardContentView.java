package com.p046p1.mobile.putong.live.livingroom.common.member.view;

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
import com.p046p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.p046p1.mobile.putong.live.livingroom.common.member.LiveMemberItem;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p149l.d30;
import p149l.e30;
import p149l.gm0;
import p149l.mqv;
import p149l.sey;
import p149l.t6c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class MemberWeekLeaderBoardContentView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public MemberWeekLeaderBoardContentView f49241d;

    /* JADX INFO: renamed from: e */
    public RadioGroup f49242e;

    /* JADX INFO: renamed from: f */
    public RadioButton f49243f;

    /* JADX INFO: renamed from: g */
    public RadioButton f49244g;

    /* JADX INFO: renamed from: h */
    public VImage f49245h;

    /* JADX INFO: renamed from: i */
    public SwipeRefreshLayout f49246i;

    /* JADX INFO: renamed from: j */
    public RecyclerView f49247j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f49248k;

    /* JADX INFO: renamed from: l */
    public LiveMemberItem f49249l;

    /* JADX INFO: renamed from: m */
    public d30 f49250m;

    /* JADX INFO: renamed from: n */
    public d30 f49251n;

    /* JADX INFO: renamed from: o */
    public View.OnClickListener f49252o;

    /* JADX INFO: renamed from: p */
    public e30<String> f49253p;

    public MemberWeekLeaderBoardContentView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l0 */
    public static MemberWeekLeaderBoardContentView m73094l0(LayoutInflater layoutInflater) {
        return (MemberWeekLeaderBoardContentView) layoutInflater.inflate(t6c0.f168227W3, (ViewGroup) null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m73095o0(View view) {
        View.OnClickListener onClickListener = this.f49252o;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public String getWeekBoardItem() {
        return (!this.f49243f.isChecked() && this.f49244g.isChecked()) ? "lastWeek" : "currentWeek";
    }

    /* JADX INFO: renamed from: k0 */
    public final void m73096k0(View view) {
        sey.m183774a(this, view);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m73097m0(RadioGroup radioGroup, int i) {
        if (NullChecker.m81303a(this.f49251n)) {
            this.f49251n.call();
        }
        this.f49246i.setEnabled(TextUtils.equals(getWeekBoardItem(), "currentWeek"));
        xdl0.m208344M(this.f49248k, TextUtils.equals(getWeekBoardItem(), "currentWeek"));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m73098n0() {
        if (NullChecker.m81303a(this.f49250m)) {
            this.f49250m.call();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73096k0(this);
        this.f49247j.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f49242e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: l.pey
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                this.f148505a.m73097m0(radioGroup, i);
            }
        });
        this.f49246i.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC0700j() { // from class: l.qey
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0700j
            /* JADX INFO: renamed from: q */
            public final void mo4094q() {
                this.f154071a.m73098n0();
            }
        });
        xdl0.m208329E0(this.f49245h, new View.OnClickListener() { // from class: l.rey
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159096a.m73095o0(view);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public void m73099p0(mqv<BLiveLeaderBoards> mqvVar, gm0 gm0Var) {
        if (NullChecker.m81303a(mqvVar)) {
            if (!TextUtils.equals(getWeekBoardItem(), "currentWeek") || !NullChecker.m81303a(mqvVar.f135304a.user)) {
                xdl0.m208344M(this.f49248k, false);
            } else {
                xdl0.m208344M(this.f49248k, true);
                this.f49249l.m73070p(this.f49253p, mqvVar, gm0Var, "currentWeek", true);
            }
        }
    }

    public void setOnCheckedChangeListener(d30 d30Var) {
        this.f49251n = d30Var;
    }

    public void setOnJumpClickListener(View.OnClickListener onClickListener) {
        this.f49252o = onClickListener;
    }

    public void setOnRefreshListener(d30 d30Var) {
        this.f49250m = d30Var;
    }

    public void setShowCardAction(e30<String> e30Var) {
        this.f49253p = e30Var;
    }

    public MemberWeekLeaderBoardContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MemberWeekLeaderBoardContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
