package p149l;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveSummary;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class mun implements s7m<kun> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f135803a;

    /* JADX INFO: renamed from: b */
    public VText f135804b;

    /* JADX INFO: renamed from: c */
    public VText f135805c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f135806d;

    /* JADX INFO: renamed from: e */
    public VText f135807e;

    /* JADX INFO: renamed from: f */
    public VText f135808f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f135809g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f135810h;

    /* JADX INFO: renamed from: i */
    public VText f135811i;

    /* JADX INFO: renamed from: j */
    public VText f135812j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f135813k;

    /* JADX INFO: renamed from: l */
    public VText f135814l;

    /* JADX INFO: renamed from: m */
    public VText f135815m;

    /* JADX INFO: renamed from: n */
    public VLinear f135816n;

    /* JADX INFO: renamed from: o */
    public VText f135817o;

    /* JADX INFO: renamed from: p */
    public VText f135818p;

    /* JADX INFO: renamed from: q */
    public VText f135819q;

    /* JADX INFO: renamed from: r */
    public VText f135820r;

    /* JADX INFO: renamed from: s */
    public VText f135821s;

    /* JADX INFO: renamed from: t */
    public VButton f135822t;

    /* JADX INFO: renamed from: u */
    public BLiveRoom f135823u;

    /* JADX INFO: renamed from: v */
    public kun f135824v;

    /* JADX INFO: renamed from: k */
    private void m156418k(User user) {
        this.f135807e.setText(user.name);
        hxs.m133407t("context_livingAct", this.f135806d, user.m60124fp().url, t100.m186890d(80.0f));
        hxs.m133403p("context_livingAct", this.f135803a, user.m60124fp().url, 1, t100.m186890d(20.0f));
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public View m156419b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nun.m161515b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(kun kunVar) {
        this.f135824v = kunVar;
    }

    /* JADX INFO: renamed from: d */
    public final SpannableStringBuilder m156421d(String str, String str2, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        String string = ypv.f199497e.getString(R$string.f46689G0);
        String string2 = ypv.f199497e.getString(R$string.f47567ue);
        String string3 = ypv.f199497e.getString(R$string.f46564A7);
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
        return i0g0.m133864e0(str, arrayList, arrayList2, eqh0.m117752c(7), arrayList3);
    }

    /* JADX INFO: renamed from: e */
    public final void m156422e(BLiveSummary bLiveSummary) {
        this.f135805c.setText(ypv.f199497e.getString(R$string.f47036W6, jbu.m140815W(bLiveSummary.duration * 1000)));
        String strM207433c = x8u.m207433c(bLiveSummary.liveOrder);
        String string = ypv.f199497e.getString(R$string.f46820M0, strM207433c);
        int iM186892f = t100.m186892f(32);
        int iM186892f2 = t100.m186892f(14);
        this.f135811i.setText(m156421d(string, strM207433c, -1, iM186892f, iM186892f2));
        String strM207433c2 = x8u.m207433c(bLiveSummary.rewardPoint);
        String string2 = ypv.f199497e.getString(uvr.m196087d().m162715s0() ? R$string.f47121a7 : R$string.f47078Y6, strM207433c2);
        fld0<bgv> fld0Var = fld0.f98151f;
        if (((bgv) ypv.m215673l(fld0Var)).m101734n()) {
            string2 = ypv.f199497e.getString(R$string.f47099Z6, strM207433c2);
        }
        this.f135812j.setText(m156421d(string2, strM207433c2, -824242, iM186892f, iM186892f2));
        if (!w8u.m202204B()) {
            xdl0.m208344M(this.f135810h, false);
            xdl0.m208344M(this.f135813k, true);
            this.f135814l.setText(strM207433c);
            this.f135815m.setText(R$string.f46841N0);
            this.f135817o.setText(strM207433c2);
            String string3 = ypv.f199497e.getString(uvr.m196087d().m162715s0() ? R$string.f47208e6 : R$string.f47186d6);
            if (((bgv) ypv.m215673l(fld0Var)).m101734n()) {
                string3 = ypv.f199497e.getString(R$string.f46980Td);
            }
            this.f135818p.setText(string3);
        }
        this.f135819q.setText(x8u.m207433c(bLiveSummary.audienceCount));
        this.f135820r.setText(x8u.m207433c(bLiveSummary.newFollowCount));
        this.f135821s.setText(x8u.m207433c(bLiveSummary.rewarderCount));
    }

    /* JADX INFO: renamed from: f */
    public void m156423f(BLiveRoom bLiveRoom) {
        this.f135823u = bLiveRoom;
        this.f135808f.setText(bLiveRoom.sign);
    }

    /* JADX INFO: renamed from: i */
    public void m156424i(User user, BLiveSummary bLiveSummary) {
        m156418k(user);
        m156422e(bLiveSummary);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m156419b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m156425j(final Act act, String str) {
        if (!TextUtils.isEmpty(str)) {
            act.dialog().m20504F(str).m20558u0(act.getString(R$string.f47423o2)).m20568z0();
        }
        this.f135822t.setOnClickListener(new View.OnClickListener() { // from class: l.lun
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                act.m44477e2();
            }
        });
        xdl0.m208344M(this.f135809g, false);
        xdl0.m208344M(this.f135808f, false);
        xdl0.m208360X(this.f135804b, t100.f167235J);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
