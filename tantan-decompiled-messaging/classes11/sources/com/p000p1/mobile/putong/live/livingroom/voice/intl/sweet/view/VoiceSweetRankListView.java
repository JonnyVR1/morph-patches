package com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view;

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
import com.p1.mobile.putong.live.base.data.BLiveSweetCpRankInfo;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCpLeaderBoards;
import com.p1.mobile.putong.live.livingroom.R;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.e30;
import l.hxs;
import l.pso0;
import l.s7m;
import l.t100;
import l.u4n0;
import l.vwb;
import l.w8u;
import l.xdl0;
import p009l.hso0;
import p009l.ioo0;
import p009l.lso0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceSweetRankListView extends ConstraintLayout implements s7m<lso0> {

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f7182d;

    /* JADX INFO: renamed from: e */
    public TextView f7183e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f7184f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f7185g;

    /* JADX INFO: renamed from: h */
    public TextView f7186h;

    /* JADX INFO: renamed from: i */
    public TextView f7187i;

    /* JADX INFO: renamed from: j */
    public TextView f7188j;

    /* JADX INFO: renamed from: k */
    public RecyclerView f7189k;

    /* JADX INFO: renamed from: l */
    public VoiceSweetErrorView f7190l;

    /* JADX INFO: renamed from: m */
    public lso0 f7191m;

    /* JADX INFO: renamed from: n */
    public final hso0 f7192n;

    public VoiceSweetRankListView(Context context) {
        super(context);
        this.f7192n = new hso0(new e30() { // from class: l.mso0
            public final void call(Object obj) {
                this.f17074a.m8752n0((String) obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8753C0() {
        return null;
    }

    public void destroy() {
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m8755k0(View view) {
        pso0.a(this, view);
    }

    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void m8754i1(lso0 lso0Var) {
        this.f7191m = lso0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    public final String m8757m0(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        int i = bLiveVoiceCpHouseInfo.rank;
        String strM16658a = ioo0.INSTANCE.m16658a(Double.parseDouble(bLiveVoiceCpHouseInfo.luxuryGap));
        if (i == 1) {
            return getContext().getString(R.string.tg) + strM16658a;
        }
        if (i <= 50) {
            return getContext().getString(R.string.sg) + strM16658a;
        }
        return getContext().getString(R.string.ug) + strM16658a;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m8758o0(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, View view) {
        m8752n0(bLiveVoiceCpHouseInfo.userId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8755k0(this);
        this.f7189k.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.f7189k.setAdapter(this.f7192n);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m8759p0(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, View view) {
        m8752n0(bLiveVoiceCpHouseInfo.otherUserId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    public void m8760q0(BLiveVoiceCpLeaderBoards bLiveVoiceCpLeaderBoards) {
        if (bLiveVoiceCpLeaderBoards == null) {
            xdl0.M(this.f7182d, false);
            xdl0.M(this.f7189k, false);
            return;
        }
        List<BLiveSweetCpRankInfo> list = bLiveVoiceCpLeaderBoards.topCpList;
        boolean zJ = vwb.J(list);
        ConstraintLayout constraintLayout = this.f7182d;
        if (zJ) {
            xdl0.M(constraintLayout, false);
            xdl0.M(this.f7189k, false);
            m8761r0(true, R.string.dg);
            return;
        }
        xdl0.M(constraintLayout, true);
        xdl0.M(this.f7189k, true);
        this.f7192n.m15947f0(list);
        String string = getContext().getString(R.string.jg);
        final BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo = bLiveVoiceCpLeaderBoards.meMaxCpInfo;
        xdl0.M(this.f7182d, !TextUtils.isEmpty(bLiveVoiceCpHouseInfo.otherUserId));
        if (!TextUtils.isEmpty(bLiveVoiceCpHouseInfo.otherUserId)) {
            this.f7186h.setText(bLiveVoiceCpHouseInfo.otherUserName + "");
            TextView textView = this.f7183e;
            int i = bLiveVoiceCpHouseInfo.rank;
            textView.setText(i > 99 ? "99+" : String.valueOf(i));
            this.f7187i.setText(string + ":" + ioo0.INSTANCE.m16658a(bLiveVoiceCpHouseInfo.cpLuxuryValue));
            this.f7188j.setText(m8757m0(bLiveVoiceCpHouseInfo));
            hxs.s("context_single_room", this.f7184f, bLiveVoiceCpHouseInfo.meUserAvatar);
            hxs.s("context_single_room", this.f7185g, bLiveVoiceCpHouseInfo.cpUserAvatar);
        }
        xdl0.E0(this.f7184f, new View.OnClickListener() { // from class: l.nso0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17638a.m8758o0(bLiveVoiceCpHouseInfo, view);
            }
        });
        xdl0.E0(this.f7185g, new View.OnClickListener() { // from class: l.oso0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18236a.m8759p0(bLiveVoiceCpHouseInfo, view);
            }
        });
        xdl0.M(this.f7190l, false);
    }

    /* JADX INFO: renamed from: r0 */
    public void m8761r0(boolean z, int i) {
        xdl0.M(this.f7190l, z);
        xdl0.X(this.f7190l, t100.d(295.0f));
        this.f7190l.setStyle(true);
        this.f7190l.setSubTitle(w8u.t(i));
    }

    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public void m8752n0(String str) {
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            return;
        }
        u4n0.k(this.f7191m, ((DbObject) this.f7191m.E2().l0()).id, str);
    }

    public VoiceSweetRankListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7192n = new hso0(new e30() { // from class: l.mso0
            public final void call(Object obj) {
                this.f17074a.m8752n0((String) obj);
            }
        });
    }

    public VoiceSweetRankListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7192n = new hso0(new e30() { // from class: l.mso0
            public final void call(Object obj) {
                this.f17074a.m8752n0((String) obj);
            }
        });
    }
}
