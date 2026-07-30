package com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew;

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
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardBattle;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardEmptyView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardHeaderView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardMainlandMeItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p149l.bil;
import p149l.dfl;
import p149l.g5c0;
import p149l.hxs;
import p149l.ogl;
import p149l.rsl;
import p149l.t100;
import p149l.t6c0;
import p149l.xdl0;
import p149l.ydt;

/* JADX INFO: loaded from: classes4.dex */
public class HourLeaderBoardContentView extends ConstraintLayout implements rsl {

    /* JADX INFO: renamed from: d */
    public VLinear f50708d;

    /* JADX INFO: renamed from: e */
    public TextView f50709e;

    /* JADX INFO: renamed from: f */
    public VImage f50710f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f50711g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f50712h;

    /* JADX INFO: renamed from: i */
    public VImage f50713i;

    /* JADX INFO: renamed from: j */
    public TextView f50714j;

    /* JADX INFO: renamed from: k */
    public TextView f50715k;

    /* JADX INFO: renamed from: l */
    public HourLeaderBoardAssistanceGiftItemView f50716l;

    /* JADX INFO: renamed from: m */
    public HourLeaderBoardAssistanceGiftItemView f50717m;

    /* JADX INFO: renamed from: n */
    public HourLeaderBoardAssistanceGiftItemView f50718n;

    /* JADX INFO: renamed from: o */
    public HourLeaderBoardAssistanceGiftItemView f50719o;

    /* JADX INFO: renamed from: p */
    public RecyclerView f50720p;

    /* JADX INFO: renamed from: q */
    public HourBoardEmptyView f50721q;

    /* JADX INFO: renamed from: r */
    public HourBoardMainlandMeItemView f50722r;

    /* JADX INFO: renamed from: s */
    public dfl f50723s;

    /* JADX INFO: renamed from: t */
    public ogl f50724t;

    /* JADX INFO: renamed from: u */
    public BLiveHourLeaderBoard f50725u;

    public HourLeaderBoardContentView(Context context) {
        super(context);
        this.f50723s = null;
        this.f50724t = null;
    }

    /* JADX INFO: renamed from: l0 */
    public static HourLeaderBoardContentView m74895l0(LayoutInflater layoutInflater) {
        return (HourLeaderBoardContentView) layoutInflater.inflate(t6c0.f168365h2, (ViewGroup) null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m74896m0(View view) {
        m74901q0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m74897n0(View view) {
        m74901q0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m74898o0(View view) {
        this.f50723s.mo74925G();
    }

    @Override // p149l.rsl
    /* JADX INFO: renamed from: G */
    public void mo74749G() {
        HourBoardHeaderView hourBoardHeaderView = (HourBoardHeaderView) this.f50720p.findViewWithTag(Integer.valueOf(g5c0.f100651B3));
        if (NullChecker.m81303a(hourBoardHeaderView)) {
            hourBoardHeaderView.m74848t0();
            ogl oglVar = this.f50724t;
            if (oglVar == null) {
                return;
            }
            oglVar.m164215I();
        }
    }

    @Override // p149l.rsl
    /* JADX INFO: renamed from: H */
    public void mo74750H(@NonNull BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        this.f50725u = bLiveHourLeaderBoard;
        m74900p0(bLiveHourLeaderBoard.hourLeaderboardBattle);
        this.f50724t.m164220T(bLiveHourLeaderBoard);
    }

    @Override // p149l.rsl
    /* JADX INFO: renamed from: I */
    public void mo74751I(boolean z) {
        this.f50724t.m164219S(z);
    }

    @Override // p149l.rsl
    /* JADX INFO: renamed from: K */
    public void mo74752K(@NonNull dfl dflVar) {
        this.f50723s = dflVar;
        xdl0.m208329E0(this.f50713i, new View.OnClickListener() { // from class: l.yhl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198356a.m74896m0(view);
            }
        });
        xdl0.m208329E0(this.f50710f, new View.OnClickListener() { // from class: l.zhl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203192a.m74897n0(view);
            }
        });
        xdl0.m208329E0(this.f50721q, new View.OnClickListener() { // from class: l.ail
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70009a.m74898o0(view);
            }
        });
        this.f50724t = new ogl(this.f50723s);
        this.f50720p.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f50720p.setAdapter(this.f50724t);
    }

    @Override // p149l.rsl
    /* JADX INFO: renamed from: Y */
    public void mo74753Y(@NonNull BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        bLiveHourLeaderBoardItem.isOwn = true;
        this.f50722r.setOnClickListener(null);
        this.f50722r.m74869M(bLiveHourLeaderBoardItem, this.f50725u);
    }

    @Override // p149l.rsl
    /* JADX INFO: renamed from: b */
    public void mo74754b() {
    }

    @Override // p149l.rsl
    @NonNull
    /* JADX INFO: renamed from: g */
    public View mo74755g(@NonNull Context context) {
        return this;
    }

    @Override // p149l.rsl
    public int getContentHeight() {
        return xdl0.m208410x0(getContext()) - t100.m186890d(2.0f);
    }

    @Override // p149l.rsl
    public int getDialogViewHeight() {
        return xdl0.m208408w0() - t100.m186890d(145.0f);
    }

    @Override // p149l.rsl
    /* JADX INFO: renamed from: i */
    public void mo74756i() {
        this.f50720p.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m74899k0(View view) {
        bil.m102085a(this, view);
    }

    @Override // p149l.rsl
    /* JADX INFO: renamed from: l */
    public void mo74758l(@NonNull List<? extends BLiveHourLeaderBoardItem> list) {
        xdl0.m208344M(this.f50721q, list.isEmpty());
        xdl0.m208344M(this.f50720p, true);
        this.f50724t.m164221U(list);
    }

    @Override // p149l.rsl
    public void onDestroy() {
        ogl oglVar = this.f50724t;
        if (oglVar == null) {
            return;
        }
        oglVar.m164218R();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74899k0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m74900p0(BLiveHourLeaderBoardBattle bLiveHourLeaderBoardBattle) {
        boolean z = bLiveHourLeaderBoardBattle.isOpen;
        ConstraintLayout constraintLayout = this.f50711g;
        if (!z) {
            xdl0.m208344M(constraintLayout, false);
            xdl0.m208344M(this.f50708d, false);
            return;
        }
        if (!xdl0.m208349O0(constraintLayout)) {
            xdl0.m208344M(this.f50708d, true);
        }
        this.f50709e.setText(bLiveHourLeaderBoardBattle.title);
        this.f50714j.setText(bLiveHourLeaderBoardBattle.title);
        this.f50715k.setText(bLiveHourLeaderBoardBattle.desc);
        if (bLiveHourLeaderBoardBattle.missions.size() >= 4) {
            xdl0.m208327D0((xdl0.m208412y0() - t100.m186890d(56.0f)) / 4, this.f50716l, this.f50717m, this.f50718n, this.f50719o);
            this.f50716l.m74891i0(bLiveHourLeaderBoardBattle.missions.get(0), false);
            this.f50717m.m74891i0(bLiveHourLeaderBoardBattle.missions.get(1), false);
            this.f50718n.m74891i0(bLiveHourLeaderBoardBattle.missions.get(2), false);
            this.f50719o.m74891i0(bLiveHourLeaderBoardBattle.missions.get(3), false);
            return;
        }
        if (bLiveHourLeaderBoardBattle.missions.size() == 3) {
            xdl0.m208327D0((xdl0.m208412y0() - t100.m186890d(52.0f)) / 3, this.f50716l, this.f50717m, this.f50718n);
            this.f50716l.m74891i0(bLiveHourLeaderBoardBattle.missions.get(0), true);
            this.f50717m.m74891i0(bLiveHourLeaderBoardBattle.missions.get(1), true);
            this.f50718n.m74891i0(bLiveHourLeaderBoardBattle.missions.get(2), true);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m74901q0(boolean z) {
        xdl0.m208344M(this.f50711g, z);
        xdl0.m208344M(this.f50708d, !z);
        if (z) {
            hxs.m133391d(this.f50723s.mo74921C(), "context_livingAct", this.f50711g, ydt.f197616f);
        }
    }

    public HourLeaderBoardContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50723s = null;
        this.f50724t = null;
    }

    public HourLeaderBoardContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50723s = null;
        this.f50724t = null;
    }
}
