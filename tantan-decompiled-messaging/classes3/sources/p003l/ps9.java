package p003l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.p001ui.messages.Keyboard;
import com.p000p1.mobile.putong.core.p001ui.messages.helper.MessageWarmingUpHelper;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.StickerBundle;
import com.p1.mobile.putong.core.data.StickerPackage;
import com.p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.c3c0;
import l.hpd0;
import l.j760;
import l.l6c0;
import l.o7r;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.y4c0;
import l.zvf0;
import p028v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ps9 extends wp1<j760<StickerBundle, StickerPackage>> implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: c */
    public List<j760<StickerBundle, StickerPackage>> f6501c;

    /* JADX INFO: renamed from: d */
    public Keyboard f6502d;

    /* JADX INFO: renamed from: e */
    public final int f6503e;

    /* JADX INFO: renamed from: f */
    public String[] f6504f;

    public ps9(Keyboard keyboard) {
        this.f6503e = CoreModule.P().i().q() ? 2 : 3;
        this.f6504f = new String[]{"😊", "🐶", "🍔"};
        this.f6502d = keyboard;
        this.f6501c = new ArrayList();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f6501c.size() + 3;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // p003l.wp1
    /* JADX INFO: renamed from: m */
    public View mo1006m(ViewGroup viewGroup, int i) {
        return o7r.a(this.f6502d.getContext()).inflate(l6c0.m5, viewGroup, false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (i >= 3 && ((Integer) this.f6502d.getCurrentPackage().get()).intValue() == i) {
            zvf0.u("e_stickers_type", "p_chat_view", new j760[]{vwb.Y("stickers_id", ((StickerPackage) this.f6501c.get(i - 3).b).id)});
        } else if (NullChecker.a(getItem(i)) && NullChecker.a(getItem(i).b) && TextUtils.equals(((StickerPackage) getItem(i).b).id, MessageWarmingUpHelper.m2293d())) {
            zvf0.r("e_friends_emoji_entrance", "p_chat_view");
        } else if (NullChecker.a(getItem(i)) && NullChecker.a(getItem(i).b) && TextUtils.equals(((StickerPackage) getItem(i).b).id, MessageWarmingUpHelper.m2303n())) {
            zvf0.r("e_chuochuo_emoji_entrance", "p_chat_view");
        }
        if (CoreModule.P().i().q() && i == 1 && ((Integer) this.f6502d.getCurrentPackage().get()).intValue() == i) {
            CoreModule.c.Z.T.z();
        }
        m6911y(i);
        this.f6502d.getCurrentPackage().put(Integer.valueOf(i));
        View viewFindViewById = view.findViewById(y4c0.K3);
        if (i <= this.f6503e || viewFindViewById.getVisibility() != 0) {
            return;
        }
        m6909t(((StickerPackage) getItem(i).b).id, false).put(Boolean.FALSE);
        xdl0.M(viewFindViewById, false);
    }

    @Override // p003l.wp1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo1005j(View view, j760<StickerBundle, StickerPackage> j760Var, int i, int i2) {
        view.findViewById(y4c0.G1).setBackgroundResource(c3c0.W3);
        SimpleDraweeView simpleDraweeView = (VDraweeView) view.findViewById(y4c0.o1);
        if (i2 >= this.f6502d.f1459n.size()) {
            qib0.G.Q0(simpleDraweeView, ((Picture) ((StickerPackage) j760Var.b).pictures.get(0)).stickerPackage());
        } else if (i2 == 0) {
            qib0.G.Y0(simpleDraweeView, c3c0.Z6);
        } else {
            simpleDraweeView.setImageDrawable(new fxe(simpleDraweeView.getContext(), this.f6504f[i2], 16.0f, t100.d(24.0f)));
        }
        View viewFindViewById = view.findViewById(y4c0.K3);
        xdl0.M(viewFindViewById, false);
        if (i2 > this.f6503e) {
            hpd0 hpd0VarM6909t = m6909t(((StickerPackage) j760Var.b).id, true);
            if (((Integer) this.f6502d.getCurrentPackage().get()).intValue() == i2) {
                hpd0VarM6909t.put(Boolean.FALSE);
            } else if (((Boolean) hpd0VarM6909t.get()).booleanValue()) {
                xdl0.M(viewFindViewById, true);
            }
        }
        if (NullChecker.a(j760Var) && NullChecker.a(j760Var.b) && TextUtils.equals(((StickerPackage) j760Var.b).id, MessageWarmingUpHelper.m2293d())) {
            xdl0.M(viewFindViewById, false);
            zvf0.x("e_friends_emoji_entrance", "p_chat_view");
        } else if (NullChecker.a(j760Var) && NullChecker.a(j760Var.b) && TextUtils.equals(((StickerPackage) j760Var.b).id, MessageWarmingUpHelper.m2303n())) {
            xdl0.M(viewFindViewById, false);
            zvf0.x("e_chuochuo_emoji_entrance", "p_chat_view");
        }
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public j760<StickerBundle, StickerPackage> getItem(int i) {
        if (i > 2) {
            return this.f6501c.get(i - 3);
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public hpd0 m6909t(String str, boolean z) {
        return new hpd0(CoreModule.H().userId() + "emoji_opti_red_dot" + str, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: w */
    public void m6910w(List<j760<StickerBundle, StickerPackage>> list) {
        if (!vwb.J(list)) {
            this.f6501c.clear();
            this.f6501c.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: y */
    public void m6911y(int i) {
        this.f6502d.f1455j.setSelection(i);
        this.f6502d.f1451f.T(i, false);
    }
}
