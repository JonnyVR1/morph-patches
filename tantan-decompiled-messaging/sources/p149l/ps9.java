package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.StickerBundle;
import com.p046p1.mobile.putong.core.data.StickerPackage;
import com.p046p1.mobile.putong.core.p053ui.messages.Keyboard;
import com.p046p1.mobile.putong.core.p053ui.messages.helper.MessageWarmingUpHelper;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes3.dex */
public class ps9 extends wp1<j760<StickerBundle, StickerPackage>> implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: c */
    public List<j760<StickerBundle, StickerPackage>> f150980c;

    /* JADX INFO: renamed from: d */
    public Keyboard f150981d;

    /* JADX INFO: renamed from: e */
    public final int f150982e;

    /* JADX INFO: renamed from: f */
    public String[] f150983f;

    public ps9(Keyboard keyboard) {
        this.f150982e = CoreModule.m29935P().m94658i().mo158431q() ? 2 : 3;
        this.f150983f = new String[]{"😊", "🐶", "🍔"};
        this.f150981d = keyboard;
        this.f150980c = new ArrayList();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f150980c.size() + 3;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        return o7r.m163037a(this.f150981d.getContext()).inflate(l6c0.f126521m5, viewGroup, false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (i >= 3 && this.f150981d.getCurrentPackage().get().intValue() == i) {
            zvf0.m220399u("e_stickers_type", OMSDialogPositon.p_chat_view, vwb.m200311Y("stickers_id", this.f150980c.get(i - 3).f116565b.f20506id));
        } else if (NullChecker.m81303a(getItem(i)) && NullChecker.m81303a(getItem(i).f116565b) && TextUtils.equals(getItem(i).f116565b.f20506id, MessageWarmingUpHelper.m49174d())) {
            zvf0.m220396r("e_friends_emoji_entrance", OMSDialogPositon.p_chat_view);
        } else if (NullChecker.m81303a(getItem(i)) && NullChecker.m81303a(getItem(i).f116565b) && TextUtils.equals(getItem(i).f116565b.f20506id, MessageWarmingUpHelper.m49184n())) {
            zvf0.m220396r("e_chuochuo_emoji_entrance", OMSDialogPositon.p_chat_view);
        }
        if (CoreModule.m29935P().m94658i().mo158431q() && i == 1 && this.f150981d.getCurrentPackage().get().intValue() == i) {
            CoreModule.f17545c.f19624Z.f20143T.m121236q();
        }
        m171114y(i);
        this.f150981d.getCurrentPackage().put(Integer.valueOf(i));
        View viewFindViewById = view.findViewById(y4c0.f195995K3);
        if (i <= this.f150982e || viewFindViewById.getVisibility() != 0) {
            return;
        }
        m171112t(getItem(i).f116565b.f20506id, false).put(Boolean.FALSE);
        xdl0.m208344M(viewFindViewById, false);
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, j760<StickerBundle, StickerPackage> j760Var, int i, int i2) {
        view.findViewById(y4c0.f195969G1).setBackgroundResource(c3c0.f78664W3);
        VDraweeView vDraweeView = (VDraweeView) view.findViewById(y4c0.f196187o1);
        if (i2 >= this.f150981d.f31568n.size()) {
            qib0.f154691G.m102341Q0(vDraweeView, j760Var.f116565b.pictures.get(0).stickerPackage());
        } else if (i2 == 0) {
            qib0.f154691G.m102354Y0(vDraweeView, c3c0.f78691Z6);
        } else {
            vDraweeView.setImageDrawable(new fxe(vDraweeView.getContext(), this.f150983f[i2], 16.0f, t100.m186890d(24.0f)));
        }
        View viewFindViewById = view.findViewById(y4c0.f195995K3);
        xdl0.m208344M(viewFindViewById, false);
        if (i2 > this.f150982e) {
            hpd0 hpd0VarM171112t = m171112t(j760Var.f116565b.f20506id, true);
            if (this.f150981d.getCurrentPackage().get().intValue() == i2) {
                hpd0VarM171112t.put(Boolean.FALSE);
            } else if (hpd0VarM171112t.get().booleanValue()) {
                xdl0.m208344M(viewFindViewById, true);
            }
        }
        if (NullChecker.m81303a(j760Var) && NullChecker.m81303a(j760Var.f116565b) && TextUtils.equals(j760Var.f116565b.f20506id, MessageWarmingUpHelper.m49174d())) {
            xdl0.m208344M(viewFindViewById, false);
            zvf0.m220402x("e_friends_emoji_entrance", OMSDialogPositon.p_chat_view);
        } else if (NullChecker.m81303a(j760Var) && NullChecker.m81303a(j760Var.f116565b) && TextUtils.equals(j760Var.f116565b.f20506id, MessageWarmingUpHelper.m49184n())) {
            xdl0.m208344M(viewFindViewById, false);
            zvf0.m220402x("e_chuochuo_emoji_entrance", OMSDialogPositon.p_chat_view);
        }
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public j760<StickerBundle, StickerPackage> getItem(int i) {
        if (i > 2) {
            return this.f150980c.get(i - 3);
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public hpd0 m171112t(String str, boolean z) {
        return new hpd0(CoreModule.m29931H().userId() + "emoji_opti_red_dot" + str, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: w */
    public void m171113w(List<j760<StickerBundle, StickerPackage>> list) {
        if (!vwb.m200296J(list)) {
            this.f150980c.clear();
            this.f150980c.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: y */
    public void m171114y(int i) {
        this.f150981d.f31564j.setSelection(i);
        this.f150981d.f31560f.m4176T(i, false);
    }
}
