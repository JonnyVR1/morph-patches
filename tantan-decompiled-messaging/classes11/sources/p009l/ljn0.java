package p009l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.voice.member.voiceleaderboard.VoiceLiveMemberItem;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.bean.LivingUsers;
import com.p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.p1.mobile.putong.live.livingroom.common.member.LiveMemberFooterDescView;
import l.dac0;
import l.e30;
import l.gm0;
import l.mqv;
import l.t6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ljn0 extends dac0<mqv<BLiveLeaderBoards>> {

    /* JADX INFO: renamed from: c */
    public final e30<String> f16193c;

    /* JADX INFO: renamed from: d */
    public final Act f16194d;

    /* JADX INFO: renamed from: e */
    public LivingUsers<BLiveLeaderBoards> f16195e = new LivingUsers<>();

    /* JADX INFO: renamed from: f */
    public boolean f16196f;

    /* JADX INFO: renamed from: g */
    public gm0 f16197g;

    public ljn0(Act act, e30<String> e30Var, boolean z) {
        this.f16194d = act;
        this.f16193c = e30Var;
        this.f16196f = z;
    }

    /* JADX INFO: renamed from: C */
    public int m17897C() {
        return this.f16195e.size();
    }

    /* JADX INFO: renamed from: D */
    public View m17898D(ViewGroup viewGroup, int i) {
        return this.f16194d.inflater().inflate(i == 1 ? t6c0.M3 : t6c0.J9, viewGroup, false);
    }

    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m17896A(View view, mqv<BLiveLeaderBoards> mqvVar, int i, int i2) {
        if (i == 1) {
            ((LiveMemberFooterDescView) view).c(this.f16195e.size());
        } else {
            ((VoiceLiveMemberItem) view).m8834i(this.f16193c, mqvVar, this.f16197g, this.f16196f);
        }
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public mqv<BLiveLeaderBoards> getItem(int i) {
        return (mqv) this.f16195e.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m17901G(@NonNull LivingUsers<BLiveLeaderBoards> livingUsers, @Nullable gm0 gm0Var) {
        this.f16197g = gm0Var;
        this.f16195e.clear();
        this.f16195e.addAll(livingUsers);
        notifyDataSetChanged();
    }

    public int getItemViewType(int i) {
        return ((BLiveLeaderBoards) ((mqv) this.f16195e.get(i)).a).isFooterDesc ? 1 : 0;
    }
}
