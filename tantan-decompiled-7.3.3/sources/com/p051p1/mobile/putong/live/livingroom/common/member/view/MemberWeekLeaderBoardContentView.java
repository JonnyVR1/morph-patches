package com.p051p1.mobile.putong.live.livingroom.common.member.view;

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
import com.p051p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.p051p1.mobile.putong.live.livingroom.common.member.LiveMemberItem;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p153l.bnl0;
import p153l.cm0;
import p153l.nsv;
import p153l.pny;
import p153l.x20;
import p153l.y20;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class MemberWeekLeaderBoardContentView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public MemberWeekLeaderBoardContentView f50089d;

    /* JADX INFO: renamed from: e */
    public RadioGroup f50090e;

    /* JADX INFO: renamed from: f */
    public RadioButton f50091f;

    /* JADX INFO: renamed from: g */
    public RadioButton f50092g;

    /* JADX INFO: renamed from: h */
    public VImage f50093h;

    /* JADX INFO: renamed from: i */
    public SwipeRefreshLayout f50094i;

    /* JADX INFO: renamed from: j */
    public RecyclerView f50095j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f50096k;

    /* JADX INFO: renamed from: l */
    public LiveMemberItem f50097l;

    /* JADX INFO: renamed from: m */
    public x20 f50098m;

    /* JADX INFO: renamed from: n */
    public x20 f50099n;

    /* JADX INFO: renamed from: o */
    public View.OnClickListener f50100o;

    /* JADX INFO: renamed from: p */
    public y20<String> f50101p;

    public MemberWeekLeaderBoardContentView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l0 */
    public static MemberWeekLeaderBoardContentView m74277l0(LayoutInflater layoutInflater) {
        return (MemberWeekLeaderBoardContentView) layoutInflater.inflate(yec0.f198959W3, (ViewGroup) null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m74278o0(View view) {
        View.OnClickListener onClickListener = this.f50100o;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public String getWeekBoardItem() {
        return (!this.f50091f.isChecked() && this.f50092g.isChecked()) ? "lastWeek" : "currentWeek";
    }

    /* JADX INFO: renamed from: k0 */
    public final void m74279k0(View view) {
        pny.m173083a(this, view);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m74280m0(RadioGroup radioGroup, int i) {
        if (NullChecker.m82486a(this.f50099n)) {
            this.f50099n.call();
        }
        this.f50094i.setEnabled(TextUtils.equals(getWeekBoardItem(), "currentWeek"));
        bnl0.m105524M(this.f50096k, TextUtils.equals(getWeekBoardItem(), "currentWeek"));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m74281n0() {
        if (NullChecker.m82486a(this.f50098m)) {
            this.f50098m.call();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74279k0(this);
        this.f50095j.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f50090e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: l.mny
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                this.f137742a.m74280m0(radioGroup, i);
            }
        });
        this.f50094i.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC0702j() { // from class: l.nny
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0702j
            /* JADX INFO: renamed from: p */
            public final void mo4096p() {
                this.f142899a.m74281n0();
            }
        });
        bnl0.m105509E0(this.f50093h, new View.OnClickListener() { // from class: l.ony
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148238a.m74278o0(view);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public void m74282p0(nsv<BLiveLeaderBoards> nsvVar, cm0 cm0Var) {
        if (NullChecker.m82486a(nsvVar)) {
            if (!TextUtils.equals(getWeekBoardItem(), "currentWeek") || !NullChecker.m82486a(nsvVar.f143542a.user)) {
                bnl0.m105524M(this.f50096k, false);
            } else {
                bnl0.m105524M(this.f50096k, true);
                this.f50097l.m74253p(this.f50101p, nsvVar, cm0Var, "currentWeek", true);
            }
        }
    }

    public void setOnCheckedChangeListener(x20 x20Var) {
        this.f50099n = x20Var;
    }

    public void setOnJumpClickListener(View.OnClickListener onClickListener) {
        this.f50100o = onClickListener;
    }

    public void setOnRefreshListener(x20 x20Var) {
        this.f50098m = x20Var;
    }

    public void setShowCardAction(y20<String> y20Var) {
        this.f50101p = y20Var;
    }

    public MemberWeekLeaderBoardContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MemberWeekLeaderBoardContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
