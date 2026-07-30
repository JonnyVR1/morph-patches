package com.p046p1.mobile.putong.live.livingroom.virtual.board.accompany;

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
import p147v.VImage;
import p149l.d30;
import p149l.e30;
import p149l.jhg;
import p149l.t6c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class FansWeekLeaderBoardContentView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FansWeekLeaderBoardContentView f52191d;

    /* JADX INFO: renamed from: e */
    public RadioGroup f52192e;

    /* JADX INFO: renamed from: f */
    public RadioButton f52193f;

    /* JADX INFO: renamed from: g */
    public RadioButton f52194g;

    /* JADX INFO: renamed from: h */
    public VImage f52195h;

    /* JADX INFO: renamed from: i */
    public SwipeRefreshLayout f52196i;

    /* JADX INFO: renamed from: j */
    public RecyclerView f52197j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f52198k;

    /* JADX INFO: renamed from: l */
    public VirtualFansBoardMeItemView f52199l;

    /* JADX INFO: renamed from: m */
    public d30 f52200m;

    /* JADX INFO: renamed from: n */
    public d30 f52201n;

    /* JADX INFO: renamed from: o */
    public View.OnClickListener f52202o;

    /* JADX INFO: renamed from: p */
    public e30<String> f52203p;

    public FansWeekLeaderBoardContentView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l0 */
    public static FansWeekLeaderBoardContentView m76841l0(LayoutInflater layoutInflater) {
        return (FansWeekLeaderBoardContentView) layoutInflater.inflate(t6c0.f168110M6, (ViewGroup) null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m76842m0(RadioGroup radioGroup, int i) {
        if (NullChecker.m81303a(this.f52201n)) {
            this.f52201n.call();
        }
        this.f52196i.setEnabled(TextUtils.equals(getWeekBoardItem(), "currentWeek"));
        xdl0.m208344M(this.f52198k, TextUtils.equals(getWeekBoardItem(), "currentWeek"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m76843n0() {
        if (NullChecker.m81303a(this.f52200m)) {
            this.f52200m.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m76844o0(View view) {
        View.OnClickListener onClickListener = this.f52202o;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public String getWeekBoardItem() {
        return (!this.f52193f.isChecked() && this.f52194g.isChecked()) ? "lastWeek" : "currentWeek";
    }

    /* JADX INFO: renamed from: k0 */
    public final void m76845k0(View view) {
        jhg.m141523a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76845k0(this);
        this.f52197j.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f52192e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: l.ghg
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                this.f102658a.m76842m0(radioGroup, i);
            }
        });
        this.f52196i.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC0700j() { // from class: l.hhg
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0700j
            /* JADX INFO: renamed from: q */
            public final void mo4094q() {
                this.f107718a.m76843n0();
            }
        });
        xdl0.m208329E0(this.f52195h, new View.OnClickListener() { // from class: l.ihg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113249a.m76844o0(view);
            }
        });
    }

    public void setOnJumpClickListener(View.OnClickListener onClickListener) {
        this.f52202o = onClickListener;
    }

    public void setOnRefreshListener(d30 d30Var) {
        this.f52200m = d30Var;
    }

    public void setShowCardAction(e30<String> e30Var) {
        this.f52203p = e30Var;
    }

    public FansWeekLeaderBoardContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FansWeekLeaderBoardContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
