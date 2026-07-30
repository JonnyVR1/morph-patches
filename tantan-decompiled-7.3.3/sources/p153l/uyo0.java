package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpHouseRankAwardInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoicehouseReward;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class uyo0 extends c0s {

    /* JADX INFO: renamed from: A */
    public VRecyclerView f181649A;

    /* JADX INFO: renamed from: B */
    public TextView f181650B;

    /* JADX INFO: renamed from: C */
    public ImageView f181651C;

    /* JADX INFO: renamed from: D */
    public z2p0 f181652D;

    /* JADX INFO: renamed from: x */
    public LinearLayout f181653x;

    /* JADX INFO: renamed from: y */
    public TextView f181654y;

    /* JADX INFO: renamed from: z */
    public TextView f181655z;

    public uyo0(xzs xzsVar, Context context) {
        super(xzsVar, LayoutInflater.from(context).inflate(yec0.f198762Fa, (ViewGroup) null));
        this.f181652D = new z2p0();
        m198684o0(m72943R());
        setCanceledOnTouchOutside(false);
        VRecyclerView vRecyclerView = this.f181649A;
        if (vRecyclerView != null) {
            vRecyclerView.addItemDecoration(new z2p0.C21751a());
            this.f181649A.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            this.f181649A.setAdapter(this.f181652D);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m198682r0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m198683s0(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m198684o0(View view) {
        vyo0.m204033a(this, view);
    }

    /* JADX INFO: renamed from: p0 */
    public final List<VoiceSweet.VoiceCpHouseReward> m198685p0(List<BLiveVoicehouseReward> list) {
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
    public final String m198686q0(String str) {
        try {
            return mxo0.INSTANCE.m160692a(Double.parseDouble(str));
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return str;
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m198687t0(BLiveVoiceCpHouseRankAwardInfo bLiveVoiceCpHouseRankAwardInfo, String str) {
        super.show();
        this.f181652D.m218455f0(m198685p0(bLiveVoiceCpHouseRankAwardInfo.houseRewardList));
        if (!jyb.m147479J(bLiveVoiceCpHouseRankAwardInfo.houseRewardList)) {
            this.f181649A.smoothScrollToPosition(0);
        }
        this.f181654y.setText(xau.m209911u(R$string.f48153ig, Integer.valueOf(bLiveVoiceCpHouseRankAwardInfo.houseRank)));
        if (TextUtils.isEmpty(str) || bLiveVoiceCpHouseRankAwardInfo.isUnLock) {
            bnl0.m105524M(this.f181655z, false);
        } else {
            bnl0.m105524M(this.f181655z, true);
            this.f181655z.setText(xau.m209911u(R$string.f48022cg, m198686q0(bLiveVoiceCpHouseRankAwardInfo.upgradeGap)));
        }
        this.f181651C.setOnClickListener(new View.OnClickListener() { // from class: l.syo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171281a.m198682r0(view);
            }
        });
        this.f181650B.setOnClickListener(new View.OnClickListener() { // from class: l.tyo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176692a.m198683s0(view);
            }
        });
    }
}
