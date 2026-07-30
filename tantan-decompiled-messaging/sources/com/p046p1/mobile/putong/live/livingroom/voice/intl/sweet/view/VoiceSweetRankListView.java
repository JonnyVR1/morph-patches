package com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.data.BLiveSweetCpRankInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCpLeaderBoards;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import p147v.VDraweeView;
import p149l.e30;
import p149l.hso0;
import p149l.hxs;
import p149l.ioo0;
import p149l.lso0;
import p149l.nnn0;
import p149l.pso0;
import p149l.s7m;
import p149l.t100;
import p149l.u4n0;
import p149l.vwb;
import p149l.w8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceSweetRankListView extends ConstraintLayout implements s7m<lso0> {

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f53576d;

    /* JADX INFO: renamed from: e */
    public TextView f53577e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f53578f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f53579g;

    /* JADX INFO: renamed from: h */
    public TextView f53580h;

    /* JADX INFO: renamed from: i */
    public TextView f53581i;

    /* JADX INFO: renamed from: j */
    public TextView f53582j;

    /* JADX INFO: renamed from: k */
    public RecyclerView f53583k;

    /* JADX INFO: renamed from: l */
    public VoiceSweetErrorView f53584l;

    /* JADX INFO: renamed from: m */
    public lso0 f53585m;

    /* JADX INFO: renamed from: n */
    public final hso0 f53586n;

    public VoiceSweetRankListView(Context context) {
        super(context);
        this.f53586n = new hso0(new e30() { // from class: l.mso0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135520a.m78541n0((String) obj);
            }
        });
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m78542k0(View view) {
        pso0.m171184a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(lso0 lso0Var) {
        this.f53585m = lso0Var;
    }

    /* JADX INFO: renamed from: m0 */
    public final String m78544m0(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        int i = bLiveVoiceCpHouseInfo.rank;
        String strM137367a = ioo0.INSTANCE.m137367a(Double.parseDouble(bLiveVoiceCpHouseInfo.luxuryGap));
        if (i == 1) {
            return getContext().getString(R$string.f47547tg) + strM137367a;
        }
        if (i <= 50) {
            return getContext().getString(R$string.f47525sg) + strM137367a;
        }
        return getContext().getString(R$string.f47569ug) + strM137367a;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m78545o0(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, View view) {
        m78541n0(bLiveVoiceCpHouseInfo.userId);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78542k0(this);
        this.f53583k.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.f53583k.setAdapter(this.f53586n);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m78546p0(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, View view) {
        m78541n0(bLiveVoiceCpHouseInfo.otherUserId);
    }

    /* JADX INFO: renamed from: q0 */
    public void m78547q0(BLiveVoiceCpLeaderBoards bLiveVoiceCpLeaderBoards) {
        if (bLiveVoiceCpLeaderBoards == null) {
            xdl0.m208344M(this.f53576d, false);
            xdl0.m208344M(this.f53583k, false);
            return;
        }
        List<BLiveSweetCpRankInfo> list = bLiveVoiceCpLeaderBoards.topCpList;
        boolean zM200296J = vwb.m200296J(list);
        ConstraintLayout constraintLayout = this.f53576d;
        if (zM200296J) {
            xdl0.m208344M(constraintLayout, false);
            xdl0.m208344M(this.f53583k, false);
            m78548r0(true, R$string.f47196dg);
            return;
        }
        xdl0.m208344M(constraintLayout, true);
        xdl0.m208344M(this.f53583k, true);
        this.f53586n.m132786f0(list);
        String string = getContext().getString(R$string.f47327jg);
        final BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo = bLiveVoiceCpLeaderBoards.meMaxCpInfo;
        xdl0.m208344M(this.f53576d, !TextUtils.isEmpty(bLiveVoiceCpHouseInfo.otherUserId));
        if (!TextUtils.isEmpty(bLiveVoiceCpHouseInfo.otherUserId)) {
            this.f53580h.setText(bLiveVoiceCpHouseInfo.otherUserName + "");
            TextView textView = this.f53577e;
            int i = bLiveVoiceCpHouseInfo.rank;
            textView.setText(i > 99 ? "99+" : String.valueOf(i));
            this.f53581i.setText(string + ":" + ioo0.INSTANCE.m137367a(bLiveVoiceCpHouseInfo.cpLuxuryValue));
            this.f53582j.setText(m78544m0(bLiveVoiceCpHouseInfo));
            hxs.m133406s("context_single_room", this.f53578f, bLiveVoiceCpHouseInfo.meUserAvatar);
            hxs.m133406s("context_single_room", this.f53579g, bLiveVoiceCpHouseInfo.cpUserAvatar);
        }
        xdl0.m208329E0(this.f53578f, new View.OnClickListener() { // from class: l.nso0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140284a.m78545o0(bLiveVoiceCpHouseInfo, view);
            }
        });
        xdl0.m208329E0(this.f53579g, new View.OnClickListener() { // from class: l.oso0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145482a.m78546p0(bLiveVoiceCpHouseInfo, view);
            }
        });
        xdl0.m208344M(this.f53584l, false);
    }

    /* JADX INFO: renamed from: r0 */
    public void m78548r0(boolean z, int i) {
        xdl0.m208344M(this.f53584l, z);
        xdl0.m208360X(this.f53584l, t100.m186890d(295.0f));
        this.f53584l.setStyle(true);
        this.f53584l.setSubTitle(w8u.m202217t(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public void m78541n0(String str) {
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            return;
        }
        u4n0.m191752k(this.f53585m, ((nnn0) this.f53585m.m206027E2()).m132146l0().f56011id, str);
    }

    public VoiceSweetRankListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53586n = new hso0(new e30() { // from class: l.mso0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135520a.m78541n0((String) obj);
            }
        });
    }

    public VoiceSweetRankListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53586n = new hso0(new e30() { // from class: l.mso0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135520a.m78541n0((String) obj);
            }
        });
    }
}
