package com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view;

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
import com.p051p1.mobile.putong.live.base.data.BLiveSweetCpRankInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpLeaderBoards;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.iam;
import p153l.izs;
import p153l.jyb;
import p153l.l1p0;
import p153l.mxo0;
import p153l.p1p0;
import p153l.qa00;
import p153l.rwn0;
import p153l.t1p0;
import p153l.xau;
import p153l.y20;
import p153l.ydn0;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceSweetRankListView extends ConstraintLayout implements iam<p1p0> {

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f54424d;

    /* JADX INFO: renamed from: e */
    public TextView f54425e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f54426f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f54427g;

    /* JADX INFO: renamed from: h */
    public TextView f54428h;

    /* JADX INFO: renamed from: i */
    public TextView f54429i;

    /* JADX INFO: renamed from: j */
    public TextView f54430j;

    /* JADX INFO: renamed from: k */
    public RecyclerView f54431k;

    /* JADX INFO: renamed from: l */
    public VoiceSweetErrorView f54432l;

    /* JADX INFO: renamed from: m */
    public p1p0 f54433m;

    /* JADX INFO: renamed from: n */
    public final l1p0 f54434n;

    public VoiceSweetRankListView(Context context) {
        super(context);
        this.f54434n = new l1p0(new y20() { // from class: l.q1p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155214a.m79724n0((String) obj);
            }
        });
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m79725k0(View view) {
        t1p0.m188930a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(p1p0 p1p0Var) {
        this.f54433m = p1p0Var;
    }

    /* JADX INFO: renamed from: m0 */
    public final String m79727m0(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        int i = bLiveVoiceCpHouseInfo.rank;
        String strM160692a = mxo0.INSTANCE.m160692a(Double.parseDouble(bLiveVoiceCpHouseInfo.luxuryGap));
        if (i == 1) {
            return getContext().getString(R$string.f48395tg) + strM160692a;
        }
        if (i <= 50) {
            return getContext().getString(R$string.f48373sg) + strM160692a;
        }
        return getContext().getString(R$string.f48417ug) + strM160692a;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m79728o0(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, View view) {
        m79724n0(bLiveVoiceCpHouseInfo.userId);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79725k0(this);
        this.f54431k.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.f54431k.setAdapter(this.f54434n);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m79729p0(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, View view) {
        m79724n0(bLiveVoiceCpHouseInfo.otherUserId);
    }

    /* JADX INFO: renamed from: q0 */
    public void m79730q0(BLiveVoiceCpLeaderBoards bLiveVoiceCpLeaderBoards) {
        if (bLiveVoiceCpLeaderBoards == null) {
            bnl0.m105524M(this.f54424d, false);
            bnl0.m105524M(this.f54431k, false);
            return;
        }
        List<BLiveSweetCpRankInfo> list = bLiveVoiceCpLeaderBoards.topCpList;
        boolean zM147479J = jyb.m147479J(list);
        ConstraintLayout constraintLayout = this.f54424d;
        if (zM147479J) {
            bnl0.m105524M(constraintLayout, false);
            bnl0.m105524M(this.f54431k, false);
            m79731r0(true, R$string.f48044dg);
            return;
        }
        bnl0.m105524M(constraintLayout, true);
        bnl0.m105524M(this.f54431k, true);
        this.f54434n.m152510f0(list);
        String string = getContext().getString(R$string.f48175jg);
        final BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo = bLiveVoiceCpLeaderBoards.meMaxCpInfo;
        bnl0.m105524M(this.f54424d, !TextUtils.isEmpty(bLiveVoiceCpHouseInfo.otherUserId));
        if (!TextUtils.isEmpty(bLiveVoiceCpHouseInfo.otherUserId)) {
            this.f54428h.setText(bLiveVoiceCpHouseInfo.otherUserName + "");
            TextView textView = this.f54425e;
            int i = bLiveVoiceCpHouseInfo.rank;
            textView.setText(i > 99 ? "99+" : String.valueOf(i));
            this.f54429i.setText(string + ":" + mxo0.INSTANCE.m160692a(bLiveVoiceCpHouseInfo.cpLuxuryValue));
            this.f54430j.setText(m79727m0(bLiveVoiceCpHouseInfo));
            izs.m142868s("context_single_room", this.f54426f, bLiveVoiceCpHouseInfo.meUserAvatar);
            izs.m142868s("context_single_room", this.f54427g, bLiveVoiceCpHouseInfo.cpUserAvatar);
        }
        bnl0.m105509E0(this.f54426f, new View.OnClickListener() { // from class: l.r1p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160843a.m79728o0(bLiveVoiceCpHouseInfo, view);
            }
        });
        bnl0.m105509E0(this.f54427g, new View.OnClickListener() { // from class: l.s1p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165802a.m79729p0(bLiveVoiceCpHouseInfo, view);
            }
        });
        bnl0.m105524M(this.f54432l, false);
    }

    /* JADX INFO: renamed from: r0 */
    public void m79731r0(boolean z, int i) {
        bnl0.m105524M(this.f54432l, z);
        bnl0.m105540X(this.f54432l, qa00.m175859d(295.0f));
        this.f54432l.setStyle(true);
        this.f54432l.setSubTitle(xau.m209910t(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public void m79724n0(String str) {
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            return;
        }
        ydn0.m215258k(this.f54433m, ((rwn0) this.f54433m.m213810E2()).m168532l0().f56859id, str);
    }

    public VoiceSweetRankListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54434n = new l1p0(new y20() { // from class: l.q1p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155214a.m79724n0((String) obj);
            }
        });
    }

    public VoiceSweetRankListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54434n = new l1p0(new y20() { // from class: l.q1p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155214a.m79724n0((String) obj);
            }
        });
    }
}
