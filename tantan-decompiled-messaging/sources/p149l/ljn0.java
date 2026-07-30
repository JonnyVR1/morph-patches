package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.bean.LivingUsers;
import com.p046p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.p046p1.mobile.putong.live.livingroom.common.member.LiveMemberFooterDescView;
import com.p046p1.mobile.putong.live.livingroom.voice.member.voiceleaderboard.VoiceLiveMemberItem;

/* JADX INFO: loaded from: classes11.dex */
public class ljn0 extends dac0<mqv<BLiveLeaderBoards>> {

    /* JADX INFO: renamed from: c */
    public final e30<String> f128369c;

    /* JADX INFO: renamed from: d */
    public final Act f128370d;

    /* JADX INFO: renamed from: e */
    public LivingUsers<BLiveLeaderBoards> f128371e = new LivingUsers<>();

    /* JADX INFO: renamed from: f */
    public boolean f128372f;

    /* JADX INFO: renamed from: g */
    public gm0 f128373g;

    public ljn0(Act act, e30<String> e30Var, boolean z) {
        this.f128370d = act;
        this.f128369c = e30Var;
        this.f128372f = z;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f128371e.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f128370d.inflater().inflate(i == 1 ? t6c0.f168107M3 : t6c0.f168077J9, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, mqv<BLiveLeaderBoards> mqvVar, int i, int i2) {
        if (i == 1) {
            ((LiveMemberFooterDescView) view).m73053c(this.f128371e.size());
        } else {
            ((VoiceLiveMemberItem) view).m78618i(this.f128369c, mqvVar, this.f128373g, this.f128372f);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public mqv<BLiveLeaderBoards> getItem(int i) {
        return (mqv) this.f128371e.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m150013G(@NonNull LivingUsers<BLiveLeaderBoards> livingUsers, @Nullable gm0 gm0Var) {
        this.f128373g = gm0Var;
        this.f128371e.clear();
        this.f128371e.addAll(livingUsers);
        notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return ((BLiveLeaderBoards) this.f128371e.get(i).f135304a).isFooterDesc ? 1 : 0;
    }
}
