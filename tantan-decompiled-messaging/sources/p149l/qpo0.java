package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCpHouseRankAwardInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoicehouseReward;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class qpo0 extends byr {

    /* JADX INFO: renamed from: A */
    public VRecyclerView f155784A;

    /* JADX INFO: renamed from: B */
    public TextView f155785B;

    /* JADX INFO: renamed from: C */
    public ImageView f155786C;

    /* JADX INFO: renamed from: D */
    public vto0 f155787D;

    /* JADX INFO: renamed from: x */
    public LinearLayout f155788x;

    /* JADX INFO: renamed from: y */
    public TextView f155789y;

    /* JADX INFO: renamed from: z */
    public TextView f155790z;

    public qpo0(wxs wxsVar, Context context) {
        super(wxsVar, LayoutInflater.from(context).inflate(t6c0.f168030Fa, (ViewGroup) null));
        this.f155787D = new vto0();
        m175858o0(m71760R());
        setCanceledOnTouchOutside(false);
        VRecyclerView vRecyclerView = this.f155784A;
        if (vRecyclerView != null) {
            vRecyclerView.addItemDecoration(new vto0.C20729a());
            this.f155784A.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            this.f155784A.setAdapter(this.f155787D);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m175856r0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m175857s0(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m175858o0(View view) {
        rpo0.m180372a(this, view);
    }

    /* JADX INFO: renamed from: p0 */
    public final List<VoiceSweet.VoiceCpHouseReward> m175859p0(List<BLiveVoicehouseReward> list) {
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
    public final String m175860q0(String str) {
        try {
            return ioo0.INSTANCE.m137367a(Double.parseDouble(str));
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return str;
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m175861t0(BLiveVoiceCpHouseRankAwardInfo bLiveVoiceCpHouseRankAwardInfo, String str) {
        super.show();
        this.f155787D.m200050f0(m175859p0(bLiveVoiceCpHouseRankAwardInfo.houseRewardList));
        if (!vwb.m200296J(bLiveVoiceCpHouseRankAwardInfo.houseRewardList)) {
            this.f155784A.smoothScrollToPosition(0);
        }
        this.f155789y.setText(w8u.m202218u(R$string.f47305ig, Integer.valueOf(bLiveVoiceCpHouseRankAwardInfo.houseRank)));
        if (TextUtils.isEmpty(str) || bLiveVoiceCpHouseRankAwardInfo.isUnLock) {
            xdl0.m208344M(this.f155790z, false);
        } else {
            xdl0.m208344M(this.f155790z, true);
            this.f155790z.setText(w8u.m202218u(R$string.f47174cg, m175860q0(bLiveVoiceCpHouseRankAwardInfo.upgradeGap)));
        }
        this.f155786C.setOnClickListener(new View.OnClickListener() { // from class: l.opo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145021a.m175856r0(view);
            }
        });
        this.f155785B.setOnClickListener(new View.OnClickListener() { // from class: l.ppo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150672a.m175857s0(view);
            }
        });
    }
}
