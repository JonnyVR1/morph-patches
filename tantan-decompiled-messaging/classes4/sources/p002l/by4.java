package p002l;

import android.content.DialogInterface;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveChatJailedType;
import com.p1.mobile.putong.live.base.data.BLiveChatMangerSettings;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.c4g0;
import l.e30;
import l.ffw;
import l.i0g0;
import l.lsi0;
import l.mkd0;
import l.t100;
import l.uep0;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.xlf0;
import l.ypv;
import v.VButton;
import v.VEditText;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class by4 {

    /* JADX INFO: renamed from: a */
    public View f8406a;

    /* JADX INFO: renamed from: b */
    public VText f8407b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f8408c;

    /* JADX INFO: renamed from: d */
    public VText f8409d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f8410e;

    /* JADX INFO: renamed from: f */
    public VButton f8411f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f8412g;

    /* JADX INFO: renamed from: h */
    public VEditText f8413h;

    /* JADX INFO: renamed from: i */
    public C0200a f8414i;

    /* JADX INFO: renamed from: j */
    public gjq f8415j;

    /* JADX INFO: renamed from: k */
    public List<pjq> f8416k;

    /* JADX INFO: renamed from: l */
    public mwe0 f8417l;

    /* JADX INFO: renamed from: m */
    public final ny4 f8418m;

    /* JADX INFO: renamed from: n */
    public Boolean f8419n = Boolean.FALSE;

    /* JADX INFO: renamed from: o */
    public c4g0 f8420o;

    /* JADX INFO: renamed from: p */
    public BLiveChatMangerSettings f8421p;

    public by4(ny4 ny4Var) {
        this.f8418m = ny4Var;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m10657e(BLiveChatJailedType bLiveChatJailedType, boolean[] zArr, pjq pjqVar) {
        if (TEnum.equals(bLiveChatJailedType, pjqVar.m20376a())) {
            zArr[0] = true;
        }
        pjqVar.m20378c(TEnum.equals(bLiveChatJailedType, pjqVar.m20376a()));
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m10663A(Boolean bool) {
        this.f8419n = bool;
        if (bool.booleanValue()) {
            return;
        }
        xdl0.M(this.f8413h, false);
    }

    /* JADX INFO: renamed from: B */
    public final void m10664B(BLiveChatMangerSettings bLiveChatMangerSettings, int i) {
        int iM10672o = m10672o(bLiveChatMangerSettings);
        this.f8409d.setText(ypv.e.getString(R$string.f3060V9, Integer.valueOf(i), Integer.valueOf(iM10672o)));
        this.f8411f.setSelected(i < iM10672o);
    }

    /* JADX INFO: renamed from: C */
    public final void m10665C() {
        xdl0.E0(this.f8406a, new View.OnClickListener() { // from class: l.vx4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21368a.m10678u(view);
            }
        });
        xdl0.E0(this.f8407b, new View.OnClickListener() { // from class: l.wx4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22030a.m10679v(view);
            }
        });
        xdl0.E0(this.f8411f, new View.OnClickListener() { // from class: l.xx4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22496a.m10680w(view);
            }
        });
        this.f8413h.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.yx4
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f23137a.m10681x(textView, i, keyEvent);
            }
        });
        this.f8413h.setFilters(new InputFilter[]{new InputFilter() { // from class: l.zx4
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return this.f23659a.m10682y(charSequence, i, i2, spanned, i3, i4);
            }
        }});
        this.f8414i.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ay4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f7922a.m10683z(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public final void m10666D(final BLiveChatJailedType bLiveChatJailedType) {
        final boolean[] zArr = {false};
        vwb.z(this.f8416k, new e30() { // from class: l.ux4
            public final void call(Object obj) {
                by4.m10657e(bLiveChatJailedType, zArr, (pjq) obj);
            }
        });
        if (!zArr[0]) {
            for (pjq pjqVar : this.f8416k) {
                if (TEnum.equals(pjqVar.m20376a(), "All")) {
                    pjqVar.m20378c(true);
                    break;
                }
            }
        }
        this.f8415j.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: E */
    public void m10667E(BLiveChatMangerSettings bLiveChatMangerSettings) {
        this.f8421p = bLiveChatMangerSettings;
        m10674q();
        ArrayList arrayList = new ArrayList(bLiveChatMangerSettings.shieldingWords);
        this.f8417l.m18302J(arrayList);
        m10666D(bLiveChatMangerSettings.jailedType);
        m10664B(this.f8421p, arrayList.size());
        this.f8414i.show();
        mkd0.z(this.f8420o);
        this.f8420o = this.f8418m.duringCreated(uep0.G(this.f8414i.m5128R())).subscribe(ffw.d(new e30() { // from class: l.qx4
            public final void call(Object obj) {
                this.f18265a.m10663A((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public View m10668k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cy4.m11407b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public void m10669l(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(str.trim())) {
            lsi0.w(R$string.f2656Cd);
            return;
        }
        int iM10672o = m10672o(this.f8421p);
        if (this.f8417l.m18300G().size() >= iM10672o) {
            lsi0.y(ypv.e.getString(R$string.f3492p7, String.valueOf(iM10672o)));
            return;
        }
        if (m10670m(i0g0.J(str))) {
            return;
        }
        if (this.f8417l.m18300G().contains(str)) {
            lsi0.w(R$string.f2952Q6);
            this.f8413h.setText("");
            return;
        }
        List<String> listM18300G = this.f8417l.m18300G();
        listM18300G.add(0, str);
        this.f8417l.m18302J(listM18300G);
        this.f8413h.setText("");
        m10664B(this.f8421p, listM18300G.size());
        if (listM18300G.size() == iM10672o) {
            m10673p();
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m10670m(int i) {
        if (i <= 10) {
            return false;
        }
        lsi0.w(R$string.f3070Vj);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public void m10671n() {
        C0200a c0200a = this.f8414i;
        if (c0200a != null) {
            c0200a.dismiss();
        }
        mkd0.z(this.f8420o);
    }

    /* JADX INFO: renamed from: o */
    public final int m10672o(BLiveChatMangerSettings bLiveChatMangerSettings) {
        int i;
        if (bLiveChatMangerSettings == null || (i = bLiveChatMangerSettings.shieldingWordMaxCount) == 0) {
            return 5;
        }
        return i;
    }

    /* JADX INFO: renamed from: p */
    public void m10673p() {
        if (this.f8419n.booleanValue()) {
            this.f8418m.act().hideInput(this.f8413h);
            xdl0.M(this.f8413h, false);
            this.f8419n = Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m10674q() {
        if (this.f8414i == null) {
            this.f8414i = new C0200a(this.f8418m.act(), m10668k(this.f8418m.act().inflater(), null));
            RecyclerView recyclerView = this.f8408c;
            int i = t100.j;
            int i2 = t100.m;
            recyclerView.addItemDecoration(new xlf0(i, i2, i2));
            this.f8412g.addItemDecoration(new xlf0(i, 0, i2));
            m10675r();
            m10665C();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m10675r() {
        ArrayList arrayList = new ArrayList();
        this.f8416k = arrayList;
        arrayList.add(new pjq(BLiveChatJailedType.get("All"), false));
        this.f8416k.add(new pjq(BLiveChatJailedType.get("FollowerAndManager"), false));
        this.f8416k.add(new pjq(BLiveChatJailedType.get("Manager"), false));
        this.f8416k.add(new pjq(BLiveChatJailedType.get("None"), false));
        gjq gjqVar = new gjq(this.f8416k, new e30() { // from class: l.sx4
            public final void call(Object obj) {
                this.f19318a.m10676s((pjq) obj);
            }
        });
        this.f8415j = gjqVar;
        this.f8408c.setAdapter(gjqVar);
        mwe0 mwe0Var = new mwe0();
        this.f8417l = mwe0Var;
        mwe0Var.m18303K(new e30() { // from class: l.tx4
            public final void call(Object obj) {
                this.f20416a.m10677t((Integer) obj);
            }
        });
        this.f8412g.setAdapter(this.f8417l);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m10676s(pjq pjqVar) {
        m10666D(pjqVar.m20376a());
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m10677t(Integer num) {
        List<String> listM18300G = this.f8417l.m18300G();
        listM18300G.remove(num.intValue());
        this.f8417l.m18302J(listM18300G);
        m10664B(this.f8421p, listM18300G.size());
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m10678u(View view) {
        if (this.f8419n.booleanValue()) {
            m10673p();
        } else {
            m10671n();
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m10679v(View view) {
        BLiveChatJailedType bLiveChatJailedTypeM20376a = BLiveChatJailedType.get("All");
        pjq pjqVar = (pjq) vwb.r(this.f8416k, new w9j() { // from class: l.rx4
            public final Object call(Object obj) {
                return Boolean.valueOf(((pjq) obj).m20377b());
            }
        });
        if (NullChecker.a(pjqVar)) {
            bLiveChatJailedTypeM20376a = pjqVar.m20376a();
        }
        this.f8418m.m19164Z3(bLiveChatJailedTypeM20376a, this.f8417l.m18300G());
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m10680w(View view) {
        if (!this.f8411f.isSelected()) {
            lsi0.y(ypv.e.getString(R$string.f3492p7, String.valueOf(m10672o(this.f8421p))));
            return;
        }
        boolean zO0 = xdl0.O0(this.f8413h);
        VEditText vEditText = this.f8413h;
        if (zO0) {
            m10669l(vEditText.getText().toString());
            return;
        }
        xdl0.M(vEditText, true);
        xdl0.A(this.f8413h);
        this.f8418m.act().showInput(this.f8413h, 0);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean m10681x(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        String string = this.f8413h.getText().toString();
        m10669l(string);
        if (!TextUtils.isEmpty(string)) {
            return true;
        }
        m10673p();
        return true;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ CharSequence m10682y(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return m10670m(i0g0.J(spanned)) ? "" : charSequence;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m10683z(DialogInterface dialogInterface) {
        xdl0.M(this.f8413h, false);
        this.f8413h.setText("");
    }
}
