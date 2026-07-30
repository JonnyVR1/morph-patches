package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.livingroom.virtual.board.accompany.VirtualFansHeaderItemView;
import com.p051p1.mobile.putong.live.livingroom.virtual.board.accompany.VirtualFansNormalItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class bzl0 extends jic0<BLiveVoiceHourLeaderBoardItem> {

    /* JADX INFO: renamed from: f */
    public static int f79140f = 1;

    /* JADX INFO: renamed from: g */
    public static int f79141g = 2;

    /* JADX INFO: renamed from: h */
    public static int f79142h = 3;

    /* JADX INFO: renamed from: c */
    public final List<BLiveVoiceHourLeaderBoardItem> f79143c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final List<BLiveVoiceHourLeaderBoardItem> f79144d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public osn0 f79145e;

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (this.f79144d.size() + this.f79143c.size() == 0) {
            return 2;
        }
        return this.f79144d.size() + 1;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i == f79140f) {
            return LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f198818K6, viewGroup, false);
        }
        return i == f79142h ? LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f199039c9, viewGroup, false) : LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f198830L6, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem, int i, int i2) {
        if (i == f79140f) {
            ((VirtualFansHeaderItemView) view).m78053n0(this.f79143c, this.f79145e);
        } else if (i == f79141g) {
            ((VirtualFansNormalItemView) view).m78056j0(bLiveVoiceHourLeaderBoardItem, this.f79145e);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceHourLeaderBoardItem getItem(int i) {
        if (this.f79144d.size() + this.f79143c.size() <= 0 || i <= 0) {
            return null;
        }
        return this.f79144d.get(i - 1);
    }

    /* JADX INFO: renamed from: G */
    public void m107176G(List<BLiveVoiceHourLeaderBoardItem> list) {
        this.f79144d.clear();
        this.f79143c.clear();
        if (!jyb.m147479J(list)) {
            for (int i = 0; i < list.size(); i++) {
                if (i <= 2) {
                    this.f79143c.add(list.get(i));
                } else {
                    this.f79144d.add(list.get(i));
                }
            }
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: H */
    public void m107177H(osn0 osn0Var) {
        this.f79145e = osn0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i == 0) {
            return f79140f;
        }
        return (this.f79144d.size() + this.f79143c.size() == 0 && i == 1) ? f79142h : f79141g;
    }
}
