package com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew;

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
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardEmptyView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardHeaderView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardMainlandMeItemView;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoardBattle;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoardBattleGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.hxs;
import l.t100;
import l.xdl0;
import l.ydt;
import p002l.bil;
import p002l.dfl;
import p002l.g5c0;
import p002l.ogl;
import p002l.rsl;
import p002l.t6c0;
import v.VDraweeView;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class HourLeaderBoardContentView extends ConstraintLayout implements rsl {

    /* JADX INFO: renamed from: d */
    public VLinear f6750d;

    /* JADX INFO: renamed from: e */
    public TextView f6751e;

    /* JADX INFO: renamed from: f */
    public VImage f6752f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f6753g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f6754h;

    /* JADX INFO: renamed from: i */
    public VImage f6755i;

    /* JADX INFO: renamed from: j */
    public TextView f6756j;

    /* JADX INFO: renamed from: k */
    public TextView f6757k;

    /* JADX INFO: renamed from: l */
    public HourLeaderBoardAssistanceGiftItemView f6758l;

    /* JADX INFO: renamed from: m */
    public HourLeaderBoardAssistanceGiftItemView f6759m;

    /* JADX INFO: renamed from: n */
    public HourLeaderBoardAssistanceGiftItemView f6760n;

    /* JADX INFO: renamed from: o */
    public HourLeaderBoardAssistanceGiftItemView f6761o;

    /* JADX INFO: renamed from: p */
    public RecyclerView f6762p;

    /* JADX INFO: renamed from: q */
    public HourBoardEmptyView f6763q;

    /* JADX INFO: renamed from: r */
    public HourBoardMainlandMeItemView f6764r;

    /* JADX INFO: renamed from: s */
    public dfl f6765s;

    /* JADX INFO: renamed from: t */
    public ogl f6766t;

    /* JADX INFO: renamed from: u */
    public BLiveHourLeaderBoard f6767u;

    public HourLeaderBoardContentView(Context context) {
        super(context);
        this.f6765s = null;
        this.f6766t = null;
    }

    /* JADX INFO: renamed from: l0 */
    public static HourLeaderBoardContentView m8497l0(LayoutInflater layoutInflater) {
        return (HourLeaderBoardContentView) layoutInflater.inflate(t6c0.f19861h2, (ViewGroup) null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m8498m0(View view) {
        m8503q0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m8499n0(View view) {
        m8503q0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m8500o0(View view) {
        this.f6765s.mo8527G();
    }

    @Override // p002l.rsl
    /* JADX INFO: renamed from: G */
    public void mo8347G() {
        HourBoardHeaderView hourBoardHeaderView = (HourBoardHeaderView) this.f6762p.findViewWithTag(Integer.valueOf(g5c0.f10801B3));
        if (NullChecker.a(hourBoardHeaderView)) {
            hourBoardHeaderView.m8448t0();
            ogl oglVar = this.f6766t;
            if (oglVar == null) {
                return;
            }
            oglVar.m19486I();
        }
    }

    @Override // p002l.rsl
    /* JADX INFO: renamed from: H */
    public void mo8348H(@NonNull BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        this.f6767u = bLiveHourLeaderBoard;
        m8502p0(bLiveHourLeaderBoard.hourLeaderboardBattle);
        this.f6766t.m19491T(bLiveHourLeaderBoard);
    }

    @Override // p002l.rsl
    /* JADX INFO: renamed from: I */
    public void mo8349I(boolean z) {
        this.f6766t.m19490S(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.rsl
    /* JADX INFO: renamed from: K */
    public void mo8350K(@NonNull dfl dflVar) {
        this.f6765s = dflVar;
        xdl0.E0(this.f6755i, new View.OnClickListener() { // from class: l.yhl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22887a.m8498m0(view);
            }
        });
        xdl0.E0(this.f6752f, new View.OnClickListener() { // from class: l.zhl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23427a.m8499n0(view);
            }
        });
        xdl0.E0(this.f6763q, new View.OnClickListener() { // from class: l.ail
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7643a.m8500o0(view);
            }
        });
        this.f6766t = new ogl(this.f6765s);
        this.f6762p.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f6762p.setAdapter(this.f6766t);
    }

    @Override // p002l.rsl
    /* JADX INFO: renamed from: Y */
    public void mo8351Y(@NonNull BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        bLiveHourLeaderBoardItem.isOwn = true;
        this.f6764r.setOnClickListener((View.OnClickListener) null);
        this.f6764r.m8469M(bLiveHourLeaderBoardItem, this.f6767u);
    }

    @Override // p002l.rsl
    /* JADX INFO: renamed from: b */
    public void mo8352b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.rsl
    @NonNull
    /* JADX INFO: renamed from: g */
    public View mo8353g(@NonNull Context context) {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.rsl
    public int getContentHeight() {
        return xdl0.x0(getContext()) - t100.d(2.0f);
    }

    @Override // p002l.rsl
    public int getDialogViewHeight() {
        return xdl0.w0() - t100.d(145.0f);
    }

    @Override // p002l.rsl
    /* JADX INFO: renamed from: i */
    public void mo8354i() {
        this.f6762p.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m8501k0(View view) {
        bil.m10373a(this, view);
    }

    @Override // p002l.rsl
    /* JADX INFO: renamed from: l */
    public void mo8356l(@NonNull List<? extends BLiveHourLeaderBoardItem> list) {
        xdl0.M(this.f6763q, list.isEmpty());
        xdl0.M(this.f6762p, true);
        this.f6766t.m19492U(list);
    }

    @Override // p002l.rsl
    public void onDestroy() {
        ogl oglVar = this.f6766t;
        if (oglVar == null) {
            return;
        }
        oglVar.m19489R();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8501k0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    public final void m8502p0(BLiveHourLeaderBoardBattle bLiveHourLeaderBoardBattle) {
        boolean z = bLiveHourLeaderBoardBattle.isOpen;
        ConstraintLayout constraintLayout = this.f6753g;
        if (!z) {
            xdl0.M(constraintLayout, false);
            xdl0.M(this.f6750d, false);
            return;
        }
        if (!xdl0.O0(constraintLayout)) {
            xdl0.M(this.f6750d, true);
        }
        this.f6751e.setText(bLiveHourLeaderBoardBattle.title);
        this.f6756j.setText(bLiveHourLeaderBoardBattle.title);
        this.f6757k.setText(bLiveHourLeaderBoardBattle.desc);
        if (bLiveHourLeaderBoardBattle.missions.size() >= 4) {
            xdl0.D0((xdl0.y0() - t100.d(56.0f)) / 4, new View[]{this.f6758l, this.f6759m, this.f6760n, this.f6761o});
            this.f6758l.m8493i0((BLiveHourLeaderBoardBattleGiftItem) bLiveHourLeaderBoardBattle.missions.get(0), false);
            this.f6759m.m8493i0((BLiveHourLeaderBoardBattleGiftItem) bLiveHourLeaderBoardBattle.missions.get(1), false);
            this.f6760n.m8493i0((BLiveHourLeaderBoardBattleGiftItem) bLiveHourLeaderBoardBattle.missions.get(2), false);
            this.f6761o.m8493i0((BLiveHourLeaderBoardBattleGiftItem) bLiveHourLeaderBoardBattle.missions.get(3), false);
            return;
        }
        if (bLiveHourLeaderBoardBattle.missions.size() == 3) {
            xdl0.D0((xdl0.y0() - t100.d(52.0f)) / 3, new View[]{this.f6758l, this.f6759m, this.f6760n});
            this.f6758l.m8493i0((BLiveHourLeaderBoardBattleGiftItem) bLiveHourLeaderBoardBattle.missions.get(0), true);
            this.f6759m.m8493i0((BLiveHourLeaderBoardBattleGiftItem) bLiveHourLeaderBoardBattle.missions.get(1), true);
            this.f6760n.m8493i0((BLiveHourLeaderBoardBattleGiftItem) bLiveHourLeaderBoardBattle.missions.get(2), true);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m8503q0(boolean z) {
        xdl0.M(this.f6753g, z);
        xdl0.M(this.f6750d, !z);
        if (z) {
            hxs.d(this.f6765s.mo8523C(), "context_livingAct", this.f6753g, ydt.f);
        }
    }

    public HourLeaderBoardContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6765s = null;
        this.f6766t = null;
    }

    public HourLeaderBoardContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6765s = null;
        this.f6766t = null;
    }
}
