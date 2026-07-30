package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.livingroom.virtual.board.accompany.VirtualFansHeaderItemView;
import com.p046p1.mobile.putong.live.livingroom.virtual.board.accompany.VirtualFansNormalItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class xpl0 extends dac0<BLiveVoiceHourLeaderBoardItem> {

    /* JADX INFO: renamed from: f */
    public static int f193927f = 1;

    /* JADX INFO: renamed from: g */
    public static int f193928g = 2;

    /* JADX INFO: renamed from: h */
    public static int f193929h = 3;

    /* JADX INFO: renamed from: c */
    public final List<BLiveVoiceHourLeaderBoardItem> f193930c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final List<BLiveVoiceHourLeaderBoardItem> f193931d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public kjn0 f193932e;

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (this.f193931d.size() + this.f193930c.size() == 0) {
            return 2;
        }
        return this.f193931d.size() + 1;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i == f193927f) {
            return LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168086K6, viewGroup, false);
        }
        return i == f193929h ? LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168307c9, viewGroup, false) : LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168098L6, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem, int i, int i2) {
        if (i == f193927f) {
            ((VirtualFansHeaderItemView) view).m76870n0(this.f193930c, this.f193932e);
        } else if (i == f193928g) {
            ((VirtualFansNormalItemView) view).m76873j0(bLiveVoiceHourLeaderBoardItem, this.f193932e);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceHourLeaderBoardItem getItem(int i) {
        if (this.f193931d.size() + this.f193930c.size() <= 0 || i <= 0) {
            return null;
        }
        return this.f193931d.get(i - 1);
    }

    /* JADX INFO: renamed from: G */
    public void m210505G(List<BLiveVoiceHourLeaderBoardItem> list) {
        this.f193931d.clear();
        this.f193930c.clear();
        if (!vwb.m200296J(list)) {
            for (int i = 0; i < list.size(); i++) {
                if (i <= 2) {
                    this.f193930c.add(list.get(i));
                } else {
                    this.f193931d.add(list.get(i));
                }
            }
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: H */
    public void m210506H(kjn0 kjn0Var) {
        this.f193932e = kjn0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i == 0) {
            return f193927f;
        }
        return (this.f193931d.size() + this.f193930c.size() == 0 && i == 1) ? f193929h : f193928g;
    }
}
