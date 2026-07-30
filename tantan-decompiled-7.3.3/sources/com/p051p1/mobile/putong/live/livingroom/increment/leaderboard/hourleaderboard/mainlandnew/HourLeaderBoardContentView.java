package com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardBattle;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardEmptyView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardHeaderView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardMainlandMeItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p153l.bnl0;
import p153l.evl;
import p153l.fjl;
import p153l.izs;
import p153l.mdc0;
import p153l.qa00;
import p153l.skl;
import p153l.uhl;
import p153l.yec0;
import p153l.zft;

/* JADX INFO: loaded from: classes4.dex */
public class HourLeaderBoardContentView extends ConstraintLayout implements evl {

    /* JADX INFO: renamed from: d */
    public VLinear f51556d;

    /* JADX INFO: renamed from: e */
    public TextView f51557e;

    /* JADX INFO: renamed from: f */
    public VImage f51558f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f51559g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f51560h;

    /* JADX INFO: renamed from: i */
    public VImage f51561i;

    /* JADX INFO: renamed from: j */
    public TextView f51562j;

    /* JADX INFO: renamed from: k */
    public TextView f51563k;

    /* JADX INFO: renamed from: l */
    public HourLeaderBoardAssistanceGiftItemView f51564l;

    /* JADX INFO: renamed from: m */
    public HourLeaderBoardAssistanceGiftItemView f51565m;

    /* JADX INFO: renamed from: n */
    public HourLeaderBoardAssistanceGiftItemView f51566n;

    /* JADX INFO: renamed from: o */
    public HourLeaderBoardAssistanceGiftItemView f51567o;

    /* JADX INFO: renamed from: p */
    public RecyclerView f51568p;

    /* JADX INFO: renamed from: q */
    public HourBoardEmptyView f51569q;

    /* JADX INFO: renamed from: r */
    public HourBoardMainlandMeItemView f51570r;

    /* JADX INFO: renamed from: s */
    public uhl f51571s;

    /* JADX INFO: renamed from: t */
    public fjl f51572t;

    /* JADX INFO: renamed from: u */
    public BLiveHourLeaderBoard f51573u;

    public HourLeaderBoardContentView(Context context) {
        super(context);
        this.f51571s = null;
        this.f51572t = null;
    }

    /* JADX INFO: renamed from: l0 */
    public static HourLeaderBoardContentView m76078l0(LayoutInflater layoutInflater) {
        return (HourLeaderBoardContentView) layoutInflater.inflate(yec0.f199097h2, (ViewGroup) null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m76079m0(View view) {
        m76084q0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m76080n0(View view) {
        m76084q0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m76081o0(View view) {
        this.f51571s.mo76108G();
    }

    @Override // p153l.evl
    /* JADX INFO: renamed from: G */
    public void mo75932G() {
        HourBoardHeaderView hourBoardHeaderView = (HourBoardHeaderView) this.f51568p.findViewWithTag(Integer.valueOf(mdc0.f135896B3));
        if (NullChecker.m82486a(hourBoardHeaderView)) {
            hourBoardHeaderView.m76031t0();
            fjl fjlVar = this.f51572t;
            if (fjlVar == null) {
                return;
            }
            fjlVar.m125816I();
        }
    }

    @Override // p153l.evl
    /* JADX INFO: renamed from: H */
    public void mo75933H(@NonNull BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        this.f51573u = bLiveHourLeaderBoard;
        m76083p0(bLiveHourLeaderBoard.hourLeaderboardBattle);
        this.f51572t.m125821T(bLiveHourLeaderBoard);
    }

    @Override // p153l.evl
    /* JADX INFO: renamed from: I */
    public void mo75934I(boolean z) {
        this.f51572t.m125820S(z);
    }

    @Override // p153l.evl
    /* JADX INFO: renamed from: K */
    public void mo75935K(@NonNull uhl uhlVar) {
        this.f51571s = uhlVar;
        bnl0.m105509E0(this.f51561i, new View.OnClickListener() { // from class: l.pkl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152848a.m76079m0(view);
            }
        });
        bnl0.m105509E0(this.f51558f, new View.OnClickListener() { // from class: l.qkl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158146a.m76080n0(view);
            }
        });
        bnl0.m105509E0(this.f51569q, new View.OnClickListener() { // from class: l.rkl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163629a.m76081o0(view);
            }
        });
        this.f51572t = new fjl(this.f51571s);
        this.f51568p.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f51568p.setAdapter(this.f51572t);
    }

    @Override // p153l.evl
    /* JADX INFO: renamed from: Y */
    public void mo75936Y(@NonNull BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        bLiveHourLeaderBoardItem.isOwn = true;
        this.f51570r.setOnClickListener(null);
        this.f51570r.m76052M(bLiveHourLeaderBoardItem, this.f51573u);
    }

    @Override // p153l.evl
    /* JADX INFO: renamed from: b */
    public void mo75937b() {
    }

    @Override // p153l.evl
    @NonNull
    /* JADX INFO: renamed from: g */
    public View mo75938g(@NonNull Context context) {
        return this;
    }

    @Override // p153l.evl
    public int getContentHeight() {
        return bnl0.m105590x0(getContext()) - qa00.m175859d(2.0f);
    }

    @Override // p153l.evl
    public int getDialogViewHeight() {
        return bnl0.m105588w0() - qa00.m175859d(145.0f);
    }

    @Override // p153l.evl
    /* JADX INFO: renamed from: i */
    public void mo75939i() {
        this.f51568p.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m76082k0(View view) {
        skl.m186519a(this, view);
    }

    @Override // p153l.evl
    /* JADX INFO: renamed from: l */
    public void mo75941l(@NonNull List<? extends BLiveHourLeaderBoardItem> list) {
        bnl0.m105524M(this.f51569q, list.isEmpty());
        bnl0.m105524M(this.f51568p, true);
        this.f51572t.m125822U(list);
    }

    @Override // p153l.evl
    public void onDestroy() {
        fjl fjlVar = this.f51572t;
        if (fjlVar == null) {
            return;
        }
        fjlVar.m125819R();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76082k0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m76083p0(BLiveHourLeaderBoardBattle bLiveHourLeaderBoardBattle) {
        boolean z = bLiveHourLeaderBoardBattle.isOpen;
        ConstraintLayout constraintLayout = this.f51559g;
        if (!z) {
            bnl0.m105524M(constraintLayout, false);
            bnl0.m105524M(this.f51556d, false);
            return;
        }
        if (!bnl0.m105529O0(constraintLayout)) {
            bnl0.m105524M(this.f51556d, true);
        }
        this.f51557e.setText(bLiveHourLeaderBoardBattle.title);
        this.f51562j.setText(bLiveHourLeaderBoardBattle.title);
        this.f51563k.setText(bLiveHourLeaderBoardBattle.desc);
        if (bLiveHourLeaderBoardBattle.missions.size() >= 4) {
            bnl0.m105507D0((bnl0.m105592y0() - qa00.m175859d(56.0f)) / 4, this.f51564l, this.f51565m, this.f51566n, this.f51567o);
            this.f51564l.m76074i0(bLiveHourLeaderBoardBattle.missions.get(0), false);
            this.f51565m.m76074i0(bLiveHourLeaderBoardBattle.missions.get(1), false);
            this.f51566n.m76074i0(bLiveHourLeaderBoardBattle.missions.get(2), false);
            this.f51567o.m76074i0(bLiveHourLeaderBoardBattle.missions.get(3), false);
            return;
        }
        if (bLiveHourLeaderBoardBattle.missions.size() == 3) {
            bnl0.m105507D0((bnl0.m105592y0() - qa00.m175859d(52.0f)) / 3, this.f51564l, this.f51565m, this.f51566n);
            this.f51564l.m76074i0(bLiveHourLeaderBoardBattle.missions.get(0), true);
            this.f51565m.m76074i0(bLiveHourLeaderBoardBattle.missions.get(1), true);
            this.f51566n.m76074i0(bLiveHourLeaderBoardBattle.missions.get(2), true);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m76084q0(boolean z) {
        bnl0.m105524M(this.f51559g, z);
        bnl0.m105524M(this.f51556d, !z);
        if (z) {
            izs.m142853d(this.f51571s.mo76104C(), "context_livingAct", this.f51559g, zft.f204211f);
        }
    }

    public HourLeaderBoardContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51571s = null;
        this.f51572t = null;
    }

    public HourLeaderBoardContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51571s = null;
        this.f51572t = null;
    }
}
