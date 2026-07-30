package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardHeaderView;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.VoiceHourBoardItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class cmn0 extends jic0<BLiveVoiceHourLeaderBoardItem> {

    /* JADX INFO: renamed from: f */
    public final osn0 f82631f;

    /* JADX INFO: renamed from: g */
    public final Context f82632g;

    /* JADX INFO: renamed from: h */
    public final String f82633h;

    /* JADX INFO: renamed from: i */
    public boolean f82634i;

    /* JADX INFO: renamed from: j */
    public final String f82635j;

    /* JADX INFO: renamed from: c */
    public final List<BLiveVoiceHourLeaderBoardItem> f82628c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final List<BLiveVoiceHourLeaderBoardItem> f82629d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final List<BLiveVoiceHourLeaderBoardItem> f82630e = new ArrayList();

    /* JADX INFO: renamed from: k */
    public final Runnable f82636k = new Runnable() { // from class: l.bmn0
        @Override // java.lang.Runnable
        public final void run() {
            this.f77355a.m111291M();
        }
    };

    public cmn0(Context context, osn0 osn0Var, String str, String str2) {
        this.f82632g = context;
        this.f82631f = osn0Var;
        this.f82633h = str;
        this.f82635j = str2;
        this.f82634i = TextUtils.equals(str, "room");
    }

    /* JADX INFO: renamed from: J */
    private void m111288J() {
        this.f82630e.addAll(this.f82628c);
        this.f82630e.removeAll(this.f82629d);
    }

    /* JADX INFO: renamed from: K */
    private void m111289K() {
        this.f82629d.addAll(this.f82628c.subList(0, Math.min(this.f82628c.size(), 3)));
    }

    /* JADX INFO: renamed from: L */
    private boolean m111290L(int i) {
        return i == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m111291M() {
        m111288J();
        notifyItemRangeChanged(1, this.f82630e.size());
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f82630e.size() + 1;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return m111295I(yec0.f199234r9, viewGroup);
        }
        return i == 3 ? m111295I(yec0.f199123j2, viewGroup) : m111295I(yec0.f199052d9, viewGroup);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem, int i, int i2) {
        if (i == 1) {
            ((VoiceHourBoardHeaderView) view).m78616s0(this.f82629d, this.f82631f, this.f82633h, this.f82634i, true);
        } else if (i == 2) {
            ((VoiceHourBoardItemView) view).m78618j0(bLiveVoiceHourLeaderBoardItem, this.f82631f, this.f82633h, this.f82634i, true);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m111293G() {
        l51.m152890J(this.f82636k);
        this.f82628c.clear();
        this.f82629d.clear();
        this.f82630e.clear();
        notifyDataSetChanged();
    }

    @Override // p153l.jic0
    @Nullable
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceHourLeaderBoardItem getItem(int i) {
        if (m111290L(i)) {
            return null;
        }
        return this.f82630e.get(i - 1);
    }

    /* JADX INFO: renamed from: I */
    public final View m111295I(@LayoutRes int i, ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
    }

    /* JADX INFO: renamed from: N */
    public void m111296N(List<BLiveVoiceHourLeaderBoardItem> list) {
        this.f82628c.clear();
        this.f82629d.clear();
        this.f82630e.clear();
        this.f82628c.addAll(list);
        m111289K();
        notifyDataSetChanged();
        if (list.isEmpty()) {
            return;
        }
        l51.m152890J(this.f82636k);
        l51.m152888H(this.f82632g, this.f82636k, 1000L);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return m111290L(i) ? 1 : 2;
    }
}
