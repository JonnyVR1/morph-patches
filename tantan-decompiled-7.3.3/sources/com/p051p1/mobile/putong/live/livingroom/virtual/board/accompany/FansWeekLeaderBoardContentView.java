package com.p051p1.mobile.putong.live.livingroom.virtual.board.accompany;

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
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p153l.bnl0;
import p153l.x20;
import p153l.xig;
import p153l.y20;
import p153l.yec0;

/* JADX INFO: loaded from: classes5.dex */
public class FansWeekLeaderBoardContentView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FansWeekLeaderBoardContentView f53039d;

    /* JADX INFO: renamed from: e */
    public RadioGroup f53040e;

    /* JADX INFO: renamed from: f */
    public RadioButton f53041f;

    /* JADX INFO: renamed from: g */
    public RadioButton f53042g;

    /* JADX INFO: renamed from: h */
    public VImage f53043h;

    /* JADX INFO: renamed from: i */
    public SwipeRefreshLayout f53044i;

    /* JADX INFO: renamed from: j */
    public RecyclerView f53045j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f53046k;

    /* JADX INFO: renamed from: l */
    public VirtualFansBoardMeItemView f53047l;

    /* JADX INFO: renamed from: m */
    public x20 f53048m;

    /* JADX INFO: renamed from: n */
    public x20 f53049n;

    /* JADX INFO: renamed from: o */
    public View.OnClickListener f53050o;

    /* JADX INFO: renamed from: p */
    public y20<String> f53051p;

    public FansWeekLeaderBoardContentView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l0 */
    public static FansWeekLeaderBoardContentView m78024l0(LayoutInflater layoutInflater) {
        return (FansWeekLeaderBoardContentView) layoutInflater.inflate(yec0.f198842M6, (ViewGroup) null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m78025m0(RadioGroup radioGroup, int i) {
        if (NullChecker.m82486a(this.f53049n)) {
            this.f53049n.call();
        }
        this.f53044i.setEnabled(TextUtils.equals(getWeekBoardItem(), "currentWeek"));
        bnl0.m105524M(this.f53046k, TextUtils.equals(getWeekBoardItem(), "currentWeek"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m78026n0() {
        if (NullChecker.m82486a(this.f53048m)) {
            this.f53048m.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m78027o0(View view) {
        View.OnClickListener onClickListener = this.f53050o;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public String getWeekBoardItem() {
        return (!this.f53041f.isChecked() && this.f53042g.isChecked()) ? "lastWeek" : "currentWeek";
    }

    /* JADX INFO: renamed from: k0 */
    public final void m78028k0(View view) {
        xig.m211141a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78028k0(this);
        this.f53045j.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f53040e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: l.uig
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                this.f179095a.m78025m0(radioGroup, i);
            }
        });
        this.f53044i.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC0702j() { // from class: l.vig
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0702j
            /* JADX INFO: renamed from: p */
            public final void mo4096p() {
                this.f184233a.m78026n0();
            }
        });
        bnl0.m105509E0(this.f53043h, new View.OnClickListener() { // from class: l.wig
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f189356a.m78027o0(view);
            }
        });
    }

    public void setOnJumpClickListener(View.OnClickListener onClickListener) {
        this.f53050o = onClickListener;
    }

    public void setOnRefreshListener(x20 x20Var) {
        this.f53048m = x20Var;
    }

    public void setShowCardAction(y20<String> y20Var) {
        this.f53051p = y20Var;
    }

    public FansWeekLeaderBoardContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FansWeekLeaderBoardContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
