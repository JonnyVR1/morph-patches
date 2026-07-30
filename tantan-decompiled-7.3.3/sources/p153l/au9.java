package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.StickerBundle;
import com.p051p1.mobile.putong.core.data.StickerPackage;
import com.p051p1.mobile.putong.core.p058ui.messages.Keyboard;
import com.p051p1.mobile.putong.core.p058ui.messages.helper.MessageWarmingUpHelper;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes3.dex */
public class au9 extends dq1<pf60<StickerBundle, StickerPackage>> implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: c */
    public List<pf60<StickerBundle, StickerPackage>> f73475c;

    /* JADX INFO: renamed from: d */
    public Keyboard f73476d;

    /* JADX INFO: renamed from: e */
    public final int f73477e;

    /* JADX INFO: renamed from: f */
    public String[] f73478f;

    public au9(Keyboard keyboard) {
        this.f73477e = CoreModule.m30933P().m143412i().mo180523q() ? 2 : 3;
        this.f73478f = new String[]{"😊", "🐶", "🍔"};
        this.f73476d = keyboard;
        this.f73475c = new ArrayList();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f73475c.size() + 3;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: m */
    public View mo21402m(ViewGroup viewGroup, int i) {
        return p9r.m171370a(this.f73476d.getContext()).inflate(qec0.f157077m5, viewGroup, false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (i >= 3 && this.f73476d.getCurrentPackage().get().intValue() == i) {
            i4g0.m138523u("e_stickers_type", OMSDialogPositon.p_chat_view, jyb.m147494Y("stickers_id", this.f73475c.get(i - 3).f152157b.f21248id));
        } else if (NullChecker.m82486a(getItem(i)) && NullChecker.m82486a(getItem(i).f152157b) && TextUtils.equals(getItem(i).f152157b.f21248id, MessageWarmingUpHelper.m50357d())) {
            i4g0.m138520r("e_friends_emoji_entrance", OMSDialogPositon.p_chat_view);
        } else if (NullChecker.m82486a(getItem(i)) && NullChecker.m82486a(getItem(i).f152157b) && TextUtils.equals(getItem(i).f152157b.f21248id, MessageWarmingUpHelper.m50367n())) {
            i4g0.m138520r("e_chuochuo_emoji_entrance", OMSDialogPositon.p_chat_view);
        }
        if (CoreModule.m30933P().m143412i().mo180523q() && i == 1 && this.f73476d.getCurrentPackage().get().intValue() == i) {
            CoreModule.f18264c.f20366Z.f20885T.m159280q();
        }
        m100368y(i);
        this.f73476d.getCurrentPackage().put(Integer.valueOf(i));
        View viewFindViewById = view.findViewById(edc0.f93230K3);
        if (i <= this.f73477e || viewFindViewById.getVisibility() != 0) {
            return;
        }
        m100366t(getItem(i).f152157b.f21248id, false).put(Boolean.FALSE);
        bnl0.m105524M(viewFindViewById, false);
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, pf60<StickerBundle, StickerPackage> pf60Var, int i, int i2) {
        view.findViewById(edc0.f93204G1).setBackgroundResource(ibc0.f113939W3);
        VDraweeView vDraweeView = (VDraweeView) view.findViewById(edc0.f93422o1);
        if (i2 >= this.f73476d.f32416n.size()) {
            uqb0.f180374G.m127125Q0(vDraweeView, pf60Var.f152157b.pictures.get(0).stickerPackage());
        } else if (i2 == 0) {
            uqb0.f180374G.m127138Y0(vDraweeView, ibc0.f113966Z6);
        } else {
            vDraweeView.setImageDrawable(new jye(vDraweeView.getContext(), this.f73478f[i2], 16.0f, qa00.m175859d(24.0f)));
        }
        View viewFindViewById = view.findViewById(edc0.f93230K3);
        bnl0.m105524M(viewFindViewById, false);
        if (i2 > this.f73477e) {
            jxd0 jxd0VarM100366t = m100366t(pf60Var.f152157b.f21248id, true);
            if (this.f73476d.getCurrentPackage().get().intValue() == i2) {
                jxd0VarM100366t.put(Boolean.FALSE);
            } else if (jxd0VarM100366t.get().booleanValue()) {
                bnl0.m105524M(viewFindViewById, true);
            }
        }
        if (NullChecker.m82486a(pf60Var) && NullChecker.m82486a(pf60Var.f152157b) && TextUtils.equals(pf60Var.f152157b.f21248id, MessageWarmingUpHelper.m50357d())) {
            bnl0.m105524M(viewFindViewById, false);
            i4g0.m138526x("e_friends_emoji_entrance", OMSDialogPositon.p_chat_view);
        } else if (NullChecker.m82486a(pf60Var) && NullChecker.m82486a(pf60Var.f152157b) && TextUtils.equals(pf60Var.f152157b.f21248id, MessageWarmingUpHelper.m50367n())) {
            bnl0.m105524M(viewFindViewById, false);
            i4g0.m138526x("e_chuochuo_emoji_entrance", OMSDialogPositon.p_chat_view);
        }
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public pf60<StickerBundle, StickerPackage> getItem(int i) {
        if (i > 2) {
            return this.f73475c.get(i - 3);
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public jxd0 m100366t(String str, boolean z) {
        return new jxd0(CoreModule.m30929H().userId() + "emoji_opti_red_dot" + str, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: w */
    public void m100367w(List<pf60<StickerBundle, StickerPackage>> list) {
        if (!jyb.m147479J(list)) {
            this.f73475c.clear();
            this.f73475c.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: y */
    public void m100368y(int i) {
        this.f73476d.f32412j.setSelection(i);
        this.f73476d.f32408f.m4178T(i, false);
    }
}
