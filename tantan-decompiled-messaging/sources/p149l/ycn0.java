package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardHeaderView;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ycn0 extends dac0<BLiveVoiceHourLeaderBoardItem> {

    /* JADX INFO: renamed from: f */
    public final kjn0 f197463f;

    /* JADX INFO: renamed from: g */
    public final Context f197464g;

    /* JADX INFO: renamed from: h */
    public final String f197465h;

    /* JADX INFO: renamed from: i */
    public boolean f197466i;

    /* JADX INFO: renamed from: j */
    public final String f197467j;

    /* JADX INFO: renamed from: c */
    public final List<BLiveVoiceHourLeaderBoardItem> f197460c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final List<BLiveVoiceHourLeaderBoardItem> f197461d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final List<BLiveVoiceHourLeaderBoardItem> f197462e = new ArrayList();

    /* JADX INFO: renamed from: k */
    public final Runnable f197468k = new Runnable() { // from class: l.xcn0
        @Override // java.lang.Runnable
        public final void run() {
            this.f192245a.m214166M();
        }
    };

    public ycn0(Context context, kjn0 kjn0Var, String str, String str2) {
        this.f197464g = context;
        this.f197463f = kjn0Var;
        this.f197465h = str;
        this.f197467j = str2;
        this.f197466i = TextUtils.equals(str, "room");
    }

    /* JADX INFO: renamed from: J */
    private void m214163J() {
        this.f197462e.addAll(this.f197460c);
        this.f197462e.removeAll(this.f197461d);
    }

    /* JADX INFO: renamed from: K */
    private void m214164K() {
        this.f197461d.addAll(this.f197460c.subList(0, Math.min(this.f197460c.size(), 3)));
    }

    /* JADX INFO: renamed from: L */
    private boolean m214165L(int i) {
        return i == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m214166M() {
        m214163J();
        notifyItemRangeChanged(1, this.f197462e.size());
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f197462e.size() + 1;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return m214170I(t6c0.f168502r9, viewGroup);
        }
        return i == 3 ? m214170I(t6c0.f168391j2, viewGroup) : m214170I(t6c0.f168320d9, viewGroup);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem, int i, int i2) {
        if (i == 1) {
            ((VoiceHourBoardHeaderView) view).m77433s0(this.f197461d, this.f197463f, this.f197465h, this.f197466i, true);
        } else if (i == 2) {
            ((VoiceHourBoardItemView) view).m77435j0(bLiveVoiceHourLeaderBoardItem, this.f197463f, this.f197465h, this.f197466i, true);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m214168G() {
        e51.m114745J(this.f197468k);
        this.f197460c.clear();
        this.f197461d.clear();
        this.f197462e.clear();
        notifyDataSetChanged();
    }

    @Override // p149l.dac0
    @Nullable
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceHourLeaderBoardItem getItem(int i) {
        if (m214165L(i)) {
            return null;
        }
        return this.f197462e.get(i - 1);
    }

    /* JADX INFO: renamed from: I */
    public final View m214170I(@LayoutRes int i, ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
    }

    /* JADX INFO: renamed from: N */
    public void m214171N(List<BLiveVoiceHourLeaderBoardItem> list) {
        this.f197460c.clear();
        this.f197461d.clear();
        this.f197462e.clear();
        this.f197460c.addAll(list);
        m214164K();
        notifyDataSetChanged();
        if (list.isEmpty()) {
            return;
        }
        e51.m114745J(this.f197468k);
        e51.m114743H(this.f197464g, this.f197468k, 1000L);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return m214165L(i) ? 1 : 2;
    }
}
