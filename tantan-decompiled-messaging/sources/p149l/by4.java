package p149l;

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
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveChatJailedType;
import com.p046p1.mobile.putong.live.base.data.BLiveChatMangerSettings;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VButton;
import p147v.VEditText;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class by4 {

    /* JADX INFO: renamed from: a */
    public View f77853a;

    /* JADX INFO: renamed from: b */
    public VText f77854b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f77855c;

    /* JADX INFO: renamed from: d */
    public VText f77856d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f77857e;

    /* JADX INFO: renamed from: f */
    public VButton f77858f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f77859g;

    /* JADX INFO: renamed from: h */
    public VEditText f77860h;

    /* JADX INFO: renamed from: i */
    public DialogC12611a f77861i;

    /* JADX INFO: renamed from: j */
    public gjq f77862j;

    /* JADX INFO: renamed from: k */
    public List<pjq> f77863k;

    /* JADX INFO: renamed from: l */
    public mwe0 f77864l;

    /* JADX INFO: renamed from: m */
    public final ny4 f77865m;

    /* JADX INFO: renamed from: n */
    public Boolean f77866n = Boolean.FALSE;

    /* JADX INFO: renamed from: o */
    public c4g0 f77867o;

    /* JADX INFO: renamed from: p */
    public BLiveChatMangerSettings f77868p;

    public by4(ny4 ny4Var) {
        this.f77865m = ny4Var;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m104400e(BLiveChatJailedType bLiveChatJailedType, boolean[] zArr, pjq pjqVar) {
        if (TEnum.equals(bLiveChatJailedType, pjqVar.m169917a())) {
            zArr[0] = true;
        }
        pjqVar.m169919c(TEnum.equals(bLiveChatJailedType, pjqVar.m169917a()));
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m104406A(Boolean bool) {
        this.f77866n = bool;
        if (bool.booleanValue()) {
            return;
        }
        xdl0.m208344M(this.f77860h, false);
    }

    /* JADX INFO: renamed from: B */
    public final void m104407B(BLiveChatMangerSettings bLiveChatMangerSettings, int i) {
        int iM104415o = m104415o(bLiveChatMangerSettings);
        this.f77856d.setText(ypv.f199497e.getString(R$string.f47018V9, Integer.valueOf(i), Integer.valueOf(iM104415o)));
        this.f77858f.setSelected(i < iM104415o);
    }

    /* JADX INFO: renamed from: C */
    public final void m104408C() {
        xdl0.m208329E0(this.f77853a, new View.OnClickListener() { // from class: l.vx4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183418a.m104421u(view);
            }
        });
        xdl0.m208329E0(this.f77854b, new View.OnClickListener() { // from class: l.wx4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188430a.m104422v(view);
            }
        });
        xdl0.m208329E0(this.f77858f, new View.OnClickListener() { // from class: l.xx4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194811a.m104423w(view);
            }
        });
        this.f77860h.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.yx4
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f200566a.m104424x(textView, i, keyEvent);
            }
        });
        this.f77860h.setFilters(new InputFilter[]{new InputFilter() { // from class: l.zx4
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return this.f205376a.m104425y(charSequence, i, i2, spanned, i3, i4);
            }
        }});
        this.f77861i.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ay4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f72250a.m104426z(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public final void m104409D(final BLiveChatJailedType bLiveChatJailedType) {
        final boolean[] zArr = {false};
        vwb.m200354z(this.f77863k, new e30() { // from class: l.ux4
            @Override // p149l.e30
            public final void call(Object obj) {
                by4.m104400e(bLiveChatJailedType, zArr, (pjq) obj);
            }
        });
        if (!zArr[0]) {
            for (pjq pjqVar : this.f77863k) {
                if (TEnum.equals(pjqVar.m169917a(), BLiveChatJailedType.All)) {
                    pjqVar.m169919c(true);
                    break;
                }
            }
        }
        this.f77862j.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: E */
    public void m104410E(BLiveChatMangerSettings bLiveChatMangerSettings) {
        this.f77868p = bLiveChatMangerSettings;
        m104417q();
        ArrayList arrayList = new ArrayList(bLiveChatMangerSettings.shieldingWords);
        this.f77864l.m156619J(arrayList);
        m104409D(bLiveChatMangerSettings.jailedType);
        m104407B(this.f77868p, arrayList.size());
        this.f77861i.show();
        mkd0.m154992z(this.f77867o);
        this.f77867o = this.f77865m.duringCreated(uep0.m193312G(this.f77861i.m71760R())).subscribe(ffw.m121193d(new e30() { // from class: l.qx4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156806a.m104406A((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public View m104411k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cy4.m109130b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public void m104412l(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(str.trim())) {
            lsi0.m151593w(R$string.f46614Cd);
            return;
        }
        int iM104415o = m104415o(this.f77868p);
        if (this.f77864l.m156617G().size() >= iM104415o) {
            lsi0.m151595y(ypv.f199497e.getString(R$string.f47450p7, String.valueOf(iM104415o)));
            return;
        }
        if (m104413m(i0g0.m133843J(str))) {
            return;
        }
        if (this.f77864l.m156617G().contains(str)) {
            lsi0.m151593w(R$string.f46910Q6);
            this.f77860h.setText("");
            return;
        }
        List<String> listM156617G = this.f77864l.m156617G();
        listM156617G.add(0, str);
        this.f77864l.m156619J(listM156617G);
        this.f77860h.setText("");
        m104407B(this.f77868p, listM156617G.size());
        if (listM156617G.size() == iM104415o) {
            m104416p();
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m104413m(int i) {
        if (i <= 10) {
            return false;
        }
        lsi0.m151593w(R$string.f47028Vj);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public void m104414n() {
        DialogC12611a dialogC12611a = this.f77861i;
        if (dialogC12611a != null) {
            dialogC12611a.dismiss();
        }
        mkd0.m154992z(this.f77867o);
    }

    /* JADX INFO: renamed from: o */
    public final int m104415o(BLiveChatMangerSettings bLiveChatMangerSettings) {
        int i;
        if (bLiveChatMangerSettings == null || (i = bLiveChatMangerSettings.shieldingWordMaxCount) == 0) {
            return 5;
        }
        return i;
    }

    /* JADX INFO: renamed from: p */
    public void m104416p() {
        if (this.f77866n.booleanValue()) {
            this.f77865m.act().hideInput(this.f77860h);
            xdl0.m208344M(this.f77860h, false);
            this.f77866n = Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m104417q() {
        if (this.f77861i == null) {
            this.f77861i = new DialogC12611a(this.f77865m.act(), m104411k(this.f77865m.act().inflater(), null));
            RecyclerView recyclerView = this.f77855c;
            int i = t100.f167261j;
            int i2 = t100.f167264m;
            recyclerView.addItemDecoration(new xlf0(i, i2, i2));
            this.f77859g.addItemDecoration(new xlf0(i, 0, i2));
            m104418r();
            m104408C();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m104418r() {
        ArrayList arrayList = new ArrayList();
        this.f77863k = arrayList;
        arrayList.add(new pjq(BLiveChatJailedType.get(BLiveChatJailedType.All), false));
        this.f77863k.add(new pjq(BLiveChatJailedType.get(BLiveChatJailedType.FollowerAndManager), false));
        this.f77863k.add(new pjq(BLiveChatJailedType.get(BLiveChatJailedType.Manager), false));
        this.f77863k.add(new pjq(BLiveChatJailedType.get(BLiveChatJailedType.None), false));
        gjq gjqVar = new gjq(this.f77863k, new e30() { // from class: l.sx4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166776a.m104419s((pjq) obj);
            }
        });
        this.f77862j = gjqVar;
        this.f77855c.setAdapter(gjqVar);
        mwe0 mwe0Var = new mwe0();
        this.f77864l = mwe0Var;
        mwe0Var.m156620K(new e30() { // from class: l.tx4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172475a.m104420t((Integer) obj);
            }
        });
        this.f77859g.setAdapter(this.f77864l);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m104419s(pjq pjqVar) {
        m104409D(pjqVar.m169917a());
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m104420t(Integer num) {
        List<String> listM156617G = this.f77864l.m156617G();
        listM156617G.remove(num.intValue());
        this.f77864l.m156619J(listM156617G);
        m104407B(this.f77868p, listM156617G.size());
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m104421u(View view) {
        if (this.f77866n.booleanValue()) {
            m104416p();
        } else {
            m104414n();
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m104422v(View view) {
        BLiveChatJailedType bLiveChatJailedTypeM169917a = BLiveChatJailedType.get(BLiveChatJailedType.All);
        pjq pjqVar = (pjq) vwb.m200346r(this.f77863k, new w9j() { // from class: l.rx4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((pjq) obj).m169918b());
            }
        });
        if (NullChecker.m81303a(pjqVar)) {
            bLiveChatJailedTypeM169917a = pjqVar.m169917a();
        }
        this.f77865m.m161981Z3(bLiveChatJailedTypeM169917a, this.f77864l.m156617G());
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m104423w(View view) {
        if (!this.f77858f.isSelected()) {
            lsi0.m151595y(ypv.f199497e.getString(R$string.f47450p7, String.valueOf(m104415o(this.f77868p))));
            return;
        }
        boolean zM208349O0 = xdl0.m208349O0(this.f77860h);
        VEditText vEditText = this.f77860h;
        if (zM208349O0) {
            m104412l(vEditText.getText().toString());
            return;
        }
        xdl0.m208344M(vEditText, true);
        xdl0.m208320A(this.f77860h);
        this.f77865m.act().showInput(this.f77860h, 0);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean m104424x(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        String string = this.f77860h.getText().toString();
        m104412l(string);
        if (!TextUtils.isEmpty(string)) {
            return true;
        }
        m104416p();
        return true;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ CharSequence m104425y(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return m104413m(i0g0.m133843J(spanned)) ? "" : charSequence;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m104426z(DialogInterface dialogInterface) {
        xdl0.m208344M(this.f77860h, false);
        this.f77860h.setText("");
    }
}
