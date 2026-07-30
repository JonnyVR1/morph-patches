package p153l;

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
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveChatJailedType;
import com.p051p1.mobile.putong.live.base.data.BLiveChatMangerSettings;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VButton;
import p151v.VEditText;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class az4 {

    /* JADX INFO: renamed from: a */
    public View f74074a;

    /* JADX INFO: renamed from: b */
    public VText f74075b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f74076c;

    /* JADX INFO: renamed from: d */
    public VText f74077d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f74078e;

    /* JADX INFO: renamed from: f */
    public VButton f74079f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f74080g;

    /* JADX INFO: renamed from: h */
    public VEditText f74081h;

    /* JADX INFO: renamed from: i */
    public DialogC12774a f74082i;

    /* JADX INFO: renamed from: j */
    public flq f74083j;

    /* JADX INFO: renamed from: k */
    public List<olq> f74084k;

    /* JADX INFO: renamed from: l */
    public t4f0 f74085l;

    /* JADX INFO: renamed from: m */
    public final mz4 f74086m;

    /* JADX INFO: renamed from: n */
    public Boolean f74087n = Boolean.FALSE;

    /* JADX INFO: renamed from: o */
    public kcg0 f74088o;

    /* JADX INFO: renamed from: p */
    public BLiveChatMangerSettings f74089p;

    public az4(mz4 mz4Var) {
        this.f74086m = mz4Var;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m100981e(BLiveChatJailedType bLiveChatJailedType, boolean[] zArr, olq olqVar) {
        if (TEnum.equals(bLiveChatJailedType, olqVar.m168158a())) {
            zArr[0] = true;
        }
        olqVar.m168160c(TEnum.equals(bLiveChatJailedType, olqVar.m168158a()));
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m100987A(Boolean bool) {
        this.f74087n = bool;
        if (bool.booleanValue()) {
            return;
        }
        bnl0.m105524M(this.f74081h, false);
    }

    /* JADX INFO: renamed from: B */
    public final void m100988B(BLiveChatMangerSettings bLiveChatMangerSettings, int i) {
        int iM100996o = m100996o(bLiveChatMangerSettings);
        this.f74077d.setText(zrv.f205803e.getString(R$string.f47866V9, Integer.valueOf(i), Integer.valueOf(iM100996o)));
        this.f74079f.setSelected(i < iM100996o);
    }

    /* JADX INFO: renamed from: C */
    public final void m100989C() {
        bnl0.m105509E0(this.f74074a, new View.OnClickListener() { // from class: l.uy4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181536a.m101002u(view);
            }
        });
        bnl0.m105509E0(this.f74075b, new View.OnClickListener() { // from class: l.vy4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186335a.m101003v(view);
            }
        });
        bnl0.m105509E0(this.f74079f, new View.OnClickListener() { // from class: l.wy4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f191570a.m101004w(view);
            }
        });
        this.f74081h.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.xy4
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f196715a.m101005x(textView, i, keyEvent);
            }
        });
        this.f74081h.setFilters(new InputFilter[]{new InputFilter() { // from class: l.yy4
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return this.f202076a.m101006y(charSequence, i, i2, spanned, i3, i4);
            }
        }});
        this.f74082i.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.zy4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f206548a.m101007z(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public final void m100990D(final BLiveChatJailedType bLiveChatJailedType) {
        final boolean[] zArr = {false};
        jyb.m147537z(this.f74084k, new y20() { // from class: l.ty4
            @Override // p153l.y20
            public final void call(Object obj) {
                az4.m100981e(bLiveChatJailedType, zArr, (olq) obj);
            }
        });
        if (!zArr[0]) {
            for (olq olqVar : this.f74084k) {
                if (TEnum.equals(olqVar.m168158a(), BLiveChatJailedType.All)) {
                    olqVar.m168160c(true);
                    break;
                }
            }
        }
        this.f74083j.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: E */
    public void m100991E(BLiveChatMangerSettings bLiveChatMangerSettings) {
        this.f74089p = bLiveChatMangerSettings;
        m100998q();
        ArrayList arrayList = new ArrayList(bLiveChatMangerSettings.shieldingWords);
        this.f74085l.m189266J(arrayList);
        m100990D(bLiveChatMangerSettings.jailedType);
        m100988B(this.f74089p, arrayList.size());
        this.f74082i.show();
        psd0.m173633z(this.f74088o);
        this.f74088o = this.f74086m.duringCreated(ynp0.m216922G(this.f74082i.m72943R())).subscribe(dhw.m115825d(new y20() { // from class: l.py4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154616a.m100987A((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public View m100992k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bz4.m107108b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public void m100993l(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(str.trim())) {
            o1j0.m165649w(R$string.f47462Cd);
            return;
        }
        int iM100996o = m100996o(this.f74089p);
        if (this.f74085l.m189264G().size() >= iM100996o) {
            o1j0.m165651y(zrv.f205803e.getString(R$string.f48298p7, String.valueOf(iM100996o)));
            return;
        }
        if (m100994m(q8g0.m175778J(str))) {
            return;
        }
        if (this.f74085l.m189264G().contains(str)) {
            o1j0.m165649w(R$string.f47758Q6);
            this.f74081h.setText("");
            return;
        }
        List<String> listM189264G = this.f74085l.m189264G();
        listM189264G.add(0, str);
        this.f74085l.m189266J(listM189264G);
        this.f74081h.setText("");
        m100988B(this.f74089p, listM189264G.size());
        if (listM189264G.size() == iM100996o) {
            m100997p();
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m100994m(int i) {
        if (i <= 10) {
            return false;
        }
        o1j0.m165649w(R$string.f47876Vj);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public void m100995n() {
        DialogC12774a dialogC12774a = this.f74082i;
        if (dialogC12774a != null) {
            dialogC12774a.dismiss();
        }
        psd0.m173633z(this.f74088o);
    }

    /* JADX INFO: renamed from: o */
    public final int m100996o(BLiveChatMangerSettings bLiveChatMangerSettings) {
        int i;
        if (bLiveChatMangerSettings == null || (i = bLiveChatMangerSettings.shieldingWordMaxCount) == 0) {
            return 5;
        }
        return i;
    }

    /* JADX INFO: renamed from: p */
    public void m100997p() {
        if (this.f74087n.booleanValue()) {
            this.f74086m.act().hideInput(this.f74081h);
            bnl0.m105524M(this.f74081h, false);
            this.f74087n = Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m100998q() {
        if (this.f74082i == null) {
            this.f74082i = new DialogC12774a(this.f74086m.act(), m100992k(this.f74086m.act().inflater(), null));
            RecyclerView recyclerView = this.f74076c;
            int i = qa00.f156323j;
            int i2 = qa00.f156326m;
            recyclerView.addItemDecoration(new guf0(i, i2, i2));
            this.f74080g.addItemDecoration(new guf0(i, 0, i2));
            m100999r();
            m100989C();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m100999r() {
        ArrayList arrayList = new ArrayList();
        this.f74084k = arrayList;
        arrayList.add(new olq(BLiveChatJailedType.get(BLiveChatJailedType.All), false));
        this.f74084k.add(new olq(BLiveChatJailedType.get(BLiveChatJailedType.FollowerAndManager), false));
        this.f74084k.add(new olq(BLiveChatJailedType.get(BLiveChatJailedType.Manager), false));
        this.f74084k.add(new olq(BLiveChatJailedType.get(BLiveChatJailedType.None), false));
        flq flqVar = new flq(this.f74084k, new y20() { // from class: l.ry4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165398a.m101000s((olq) obj);
            }
        });
        this.f74083j = flqVar;
        this.f74076c.setAdapter(flqVar);
        t4f0 t4f0Var = new t4f0();
        this.f74085l = t4f0Var;
        t4f0Var.m189267K(new y20() { // from class: l.sy4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171210a.m101001t((Integer) obj);
            }
        });
        this.f74080g.setAdapter(this.f74085l);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m101000s(olq olqVar) {
        m100990D(olqVar.m168158a());
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m101001t(Integer num) {
        List<String> listM189264G = this.f74085l.m189264G();
        listM189264G.remove(num.intValue());
        this.f74085l.m189266J(listM189264G);
        m100988B(this.f74089p, listM189264G.size());
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m101002u(View view) {
        if (this.f74087n.booleanValue()) {
            m100997p();
        } else {
            m100995n();
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m101003v(View view) {
        BLiveChatJailedType bLiveChatJailedTypeM168158a = BLiveChatJailedType.get(BLiveChatJailedType.All);
        olq olqVar = (olq) jyb.m147529r(this.f74084k, new qcj() { // from class: l.qy4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((olq) obj).m168159b());
            }
        });
        if (NullChecker.m82486a(olqVar)) {
            bLiveChatJailedTypeM168158a = olqVar.m168158a();
        }
        this.f74086m.m160893Z3(bLiveChatJailedTypeM168158a, this.f74085l.m189264G());
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m101004w(View view) {
        if (!this.f74079f.isSelected()) {
            o1j0.m165651y(zrv.f205803e.getString(R$string.f48298p7, String.valueOf(m100996o(this.f74089p))));
            return;
        }
        boolean zM105529O0 = bnl0.m105529O0(this.f74081h);
        VEditText vEditText = this.f74081h;
        if (zM105529O0) {
            m100993l(vEditText.getText().toString());
            return;
        }
        bnl0.m105524M(vEditText, true);
        bnl0.m105500A(this.f74081h);
        this.f74086m.act().showInput(this.f74081h, 0);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean m101005x(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        String string = this.f74081h.getText().toString();
        m100993l(string);
        if (!TextUtils.isEmpty(string)) {
            return true;
        }
        m100997p();
        return true;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ CharSequence m101006y(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return m100994m(q8g0.m175778J(spanned)) ? "" : charSequence;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m101007z(DialogInterface dialogInterface) {
        bnl0.m105524M(this.f74081h, false);
        this.f74081h.setText("");
    }
}
