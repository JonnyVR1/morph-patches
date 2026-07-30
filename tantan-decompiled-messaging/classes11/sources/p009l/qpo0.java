package p009l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCpHouseRankAwardInfo;
import com.p1.mobile.putong.live.base.data.BLiveVoicehouseReward;
import com.p1.mobile.putong.live.livingroom.R;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import l.byr;
import l.rpo0;
import l.t6c0;
import l.vwb;
import l.w8u;
import l.wxs;
import l.xdl0;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qpo0 extends byr {

    /* JADX INFO: renamed from: A */
    public VRecyclerView f19434A;

    /* JADX INFO: renamed from: B */
    public TextView f19435B;

    /* JADX INFO: renamed from: C */
    public ImageView f19436C;

    /* JADX INFO: renamed from: D */
    public vto0 f19437D;

    /* JADX INFO: renamed from: x */
    public LinearLayout f19438x;

    /* JADX INFO: renamed from: y */
    public TextView f19439y;

    /* JADX INFO: renamed from: z */
    public TextView f19440z;

    /* JADX WARN: Multi-variable type inference failed */
    public qpo0(wxs wxsVar, Context context) {
        super(wxsVar, LayoutInflater.from(context).inflate(t6c0.Fa, (ViewGroup) null));
        this.f19437D = new vto0();
        m21138o0(R());
        setCanceledOnTouchOutside(false);
        VRecyclerView vRecyclerView = this.f19434A;
        if (vRecyclerView != null) {
            vRecyclerView.addItemDecoration(new vto0.C1276a());
            this.f19434A.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            this.f19434A.setAdapter(this.f19437D);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m21136r0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m21137s0(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m21138o0(View view) {
        rpo0.a(this, view);
    }

    /* JADX INFO: renamed from: p0 */
    public final List<VoiceSweet.VoiceCpHouseReward> m21139p0(List<BLiveVoicehouseReward> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                VoiceSweet.VoiceCpHouseReward.Builder builderNewBuilder = VoiceSweet.VoiceCpHouseReward.newBuilder();
                builderNewBuilder.setImage(list.get(i).image);
                builderNewBuilder.setTitle(list.get(i).title);
                arrayList.add(builderNewBuilder.build());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q0 */
    public final String m21140q0(String str) {
        try {
            return ioo0.INSTANCE.m16658a(Double.parseDouble(str));
        } catch (Exception e) {
            CrashHelper.c(e);
            return str;
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m21141t0(BLiveVoiceCpHouseRankAwardInfo bLiveVoiceCpHouseRankAwardInfo, String str) {
        super/*com.p1.mobile.putong.live.livingroom.archi.dialogcenter.a*/.show();
        this.f19437D.m23731f0(m21139p0(bLiveVoiceCpHouseRankAwardInfo.houseRewardList));
        if (!vwb.J(bLiveVoiceCpHouseRankAwardInfo.houseRewardList)) {
            this.f19434A.smoothScrollToPosition(0);
        }
        this.f19439y.setText(w8u.u(R.string.ig, Integer.valueOf(bLiveVoiceCpHouseRankAwardInfo.houseRank)));
        if (TextUtils.isEmpty(str) || bLiveVoiceCpHouseRankAwardInfo.isUnLock) {
            xdl0.M(this.f19440z, false);
        } else {
            xdl0.M(this.f19440z, true);
            this.f19440z.setText(w8u.u(R.string.cg, m21140q0(bLiveVoiceCpHouseRankAwardInfo.upgradeGap)));
        }
        this.f19436C.setOnClickListener(new View.OnClickListener() { // from class: l.opo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18201a.m21136r0(view);
            }
        });
        this.f19435B.setOnClickListener(new View.OnClickListener() { // from class: l.ppo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18836a.m21137s0(view);
            }
        });
    }
}
