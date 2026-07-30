package p002l;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveRoom;
import com.p1.mobile.putong.live.base.data.BLiveSummary;
import java.util.ArrayList;
import l.bgv;
import l.eqh0;
import l.fld0;
import l.hxs;
import l.i0g0;
import l.jbu;
import l.s7m;
import l.t100;
import l.uvr;
import l.w8u;
import l.x8u;
import l.xdl0;
import l.ypv;
import v.VButton;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mun implements s7m<kun> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f15641a;

    /* JADX INFO: renamed from: b */
    public VText f15642b;

    /* JADX INFO: renamed from: c */
    public VText f15643c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f15644d;

    /* JADX INFO: renamed from: e */
    public VText f15645e;

    /* JADX INFO: renamed from: f */
    public VText f15646f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f15647g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f15648h;

    /* JADX INFO: renamed from: i */
    public VText f15649i;

    /* JADX INFO: renamed from: j */
    public VText f15650j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f15651k;

    /* JADX INFO: renamed from: l */
    public VText f15652l;

    /* JADX INFO: renamed from: m */
    public VText f15653m;

    /* JADX INFO: renamed from: n */
    public VLinear f15654n;

    /* JADX INFO: renamed from: o */
    public VText f15655o;

    /* JADX INFO: renamed from: p */
    public VText f15656p;

    /* JADX INFO: renamed from: q */
    public VText f15657q;

    /* JADX INFO: renamed from: r */
    public VText f15658r;

    /* JADX INFO: renamed from: s */
    public VText f15659s;

    /* JADX INFO: renamed from: t */
    public VButton f15660t;

    /* JADX INFO: renamed from: u */
    public BLiveRoom f15661u;

    /* JADX INFO: renamed from: v */
    public kun f15662v;

    /* JADX INFO: renamed from: k */
    private void m18193k(User user) {
        this.f15645e.setText(user.name);
        hxs.t("context_livingAct", this.f15644d, ((Media) user.fp()).url, t100.d(80.0f));
        hxs.p("context_livingAct", this.f15641a, ((Media) user.fp()).url, 1, t100.d(20.0f));
    }

    /* JADX INFO: renamed from: C0 */
    public Context m18194C0() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public View m18195b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nun.m19019b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m18201i1(kun kunVar) {
        this.f15662v = kunVar;
    }

    /* JADX INFO: renamed from: d */
    public final SpannableStringBuilder m18197d(String str, String str2, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        String string = ypv.e.getString(R$string.f2731G0);
        String string2 = ypv.e.getString(R$string.f3609ue);
        String string3 = ypv.e.getString(R$string.f2606A7);
        if (str2.contains(string)) {
            arrayList.add(str2.substring(0, str2.indexOf(string)));
            arrayList2.add(Integer.valueOf(i));
            arrayList3.add(Integer.valueOf(i2));
            arrayList.add(string);
            arrayList2.add(Integer.valueOf(i));
            arrayList3.add(Integer.valueOf(i3));
        } else if (str2.contains(string2)) {
            arrayList.add(str2.substring(0, str2.indexOf(string2)));
            arrayList2.add(Integer.valueOf(i));
            arrayList3.add(Integer.valueOf(i2));
            arrayList.add(string2);
            arrayList2.add(Integer.valueOf(i));
            arrayList3.add(Integer.valueOf(i3));
        } else if (str2.contains(string3)) {
            arrayList.add(str2.substring(0, str2.indexOf(string3)));
            arrayList2.add(Integer.valueOf(i));
            arrayList3.add(Integer.valueOf(i2));
            arrayList.add(string3);
            arrayList2.add(Integer.valueOf(i));
            arrayList3.add(Integer.valueOf(i3));
        } else {
            arrayList.add(str2);
            arrayList2.add(Integer.valueOf(i));
            arrayList3.add(Integer.valueOf(i2));
        }
        return i0g0.e0(str, arrayList, arrayList2, eqh0.c(7), arrayList3);
    }

    /* JADX INFO: renamed from: e */
    public final void m18198e(BLiveSummary bLiveSummary) {
        this.f15643c.setText(ypv.e.getString(R$string.f3078W6, jbu.W(bLiveSummary.duration * 1000)));
        String strC = x8u.c(bLiveSummary.liveOrder);
        String string = ypv.e.getString(R$string.f2862M0, strC);
        int iF = t100.f(32);
        int iF2 = t100.f(14);
        this.f15649i.setText(m18197d(string, strC, -1, iF, iF2));
        String strC2 = x8u.c(bLiveSummary.rewardPoint);
        String string2 = ypv.e.getString(uvr.d().s0() ? R$string.f3163a7 : R$string.f3120Y6, strC2);
        fld0 fld0Var = fld0.f;
        if (((bgv) ypv.l(fld0Var)).n()) {
            string2 = ypv.e.getString(R$string.f3141Z6, strC2);
        }
        this.f15650j.setText(m18197d(string2, strC2, -824242, iF, iF2));
        if (!w8u.B()) {
            xdl0.M(this.f15648h, false);
            xdl0.M(this.f15651k, true);
            this.f15652l.setText(strC);
            this.f15653m.setText(R$string.f2883N0);
            this.f15655o.setText(strC2);
            String string3 = ypv.e.getString(uvr.d().s0() ? R$string.f3250e6 : R$string.f3228d6);
            if (((bgv) ypv.l(fld0Var)).n()) {
                string3 = ypv.e.getString(R$string.f3022Td);
            }
            this.f15656p.setText(string3);
        }
        this.f15657q.setText(x8u.c(bLiveSummary.audienceCount));
        this.f15658r.setText(x8u.c(bLiveSummary.newFollowCount));
        this.f15659s.setText(x8u.c(bLiveSummary.rewarderCount));
    }

    /* JADX INFO: renamed from: f */
    public void m18199f(BLiveRoom bLiveRoom) {
        this.f15661u = bLiveRoom;
        this.f15646f.setText(bLiveRoom.sign);
    }

    /* JADX INFO: renamed from: i */
    public void m18200i(User user, BLiveSummary bLiveSummary) {
        m18193k(user);
        m18198e(bLiveSummary);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m18195b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m18202j(final Act act, String str) {
        if (!TextUtils.isEmpty(str)) {
            act.dialog().F(str).u0(act.getString(R$string.f3465o2)).z0();
        }
        this.f15660t.setOnClickListener(new View.OnClickListener() { // from class: l.lun
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                act.finish();
            }
        });
        xdl0.M(this.f15647g, false);
        xdl0.M(this.f15646f, false);
        xdl0.X(this.f15642b, t100.J);
    }

    public void destroy() {
    }
}
