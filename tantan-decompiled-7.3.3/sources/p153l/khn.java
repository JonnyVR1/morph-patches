package p153l;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.data.IntlPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import p151v.VImage;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class khn extends jic0<lhn.C18395a> {

    /* JADX INFO: renamed from: c */
    public final Act f126887c;

    /* JADX INFO: renamed from: d */
    public final List<lhn.C18395a> f126888d;

    /* JADX INFO: renamed from: e */
    public InterfaceC18165a f126889e;

    /* JADX INFO: renamed from: l.khn$a */
    public interface InterfaceC18165a {
        /* JADX INFO: renamed from: a */
        void mo97883a(boolean z);
    }

    public khn(Act act, List<lhn.C18395a> list) {
        this.f126887c = act;
        this.f126888d = list;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return m149800L().size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        Act act = this.f126887c;
        return i == 0 ? p9r.m171370a(act).inflate(jec0.f120458d, viewGroup, false) : p9r.m171370a(act).inflate(jec0.f120459e, viewGroup, false);
    }

    @Override // p153l.jic0
    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final lhn.C18395a c18395a, int i, int i2) {
        if (i == 0) {
            VImage vImage = (VImage) view.findViewById(ycc0.f198414F);
            VText_NoTopPadding vText_NoTopPadding = (VText_NoTopPadding) view.findViewById(ycc0.f198434Q);
            vImage.setImageResource(c18395a.getBigIcon());
            vText_NoTopPadding.setText(App.f16088e.getString(c18395a.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String()));
            if (c18395a.getIsSelected()) {
                view.setBackgroundResource(cbc0.f80802w);
            } else {
                view.setBackgroundResource(cbc0.f80800v);
            }
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.ihn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f114986a.m149803O(c18395a, view2);
                }
            });
            return;
        }
        VImage vImage2 = (VImage) view.findViewById(ycc0.f198475p0);
        VText_NoTopPadding vText_NoTopPadding2 = (VText_NoTopPadding) view.findViewById(ycc0.f198479r0);
        if (c18395a.getId().equals(IntlPurpose.long_but_short)) {
            vText_NoTopPadding2.setText(R$string.f18190n0);
        } else if (c18395a.getId().equals(IntlPurpose.short_but_long)) {
            vText_NoTopPadding2.setText(R$string.f18185m0);
        }
        if (c18395a.getIsSelected()) {
            vImage2.setImageResource(cbc0.f80774i);
            vText_NoTopPadding2.setTextColor(Color.parseColor(Constants.BLACK));
        } else {
            vImage2.setImageResource(cbc0.f80772h);
            vText_NoTopPadding2.setTextColor(Color.parseColor("#4D000000"));
        }
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.jhn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f120986a.m149804P(c18395a, view2);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public final List<lhn.C18395a> m149800L() {
        ArrayList arrayList = new ArrayList();
        lhn.C18395a c18395aOrElse = this.f126888d.stream().filter(new Predicate() { // from class: l.ghn
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return IntlPurpose.long_term_partner.equals(((lhn.C18395a) obj).getId());
            }
        }).findFirst().orElse(null);
        lhn.C18395a c18395aOrElse2 = this.f126888d.stream().filter(new Predicate() { // from class: l.hhn
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return IntlPurpose.short_term_fun.equals(((lhn.C18395a) obj).getId());
            }
        }).findFirst().orElse(null);
        Set setM115804a = dhn.m115804a(new Object[]{IntlPurpose.long_term_partner, IntlPurpose.short_term_fun, IntlPurpose.new_friends, IntlPurpose.not_sure_yet});
        boolean z = false;
        boolean z2 = false;
        for (lhn.C18395a c18395a : this.f126888d) {
            String strM154237c = c18395a.getId();
            if (IntlPurpose.long_but_short.equals(strM154237c) && c18395a.getIsSelected() && c18395aOrElse != null) {
                c18395aOrElse.m154241g(true);
            }
            if (IntlPurpose.short_but_long.equals(strM154237c) && c18395a.getIsSelected() && c18395aOrElse2 != null) {
                c18395aOrElse2.m154241g(true);
            }
            if (IntlPurpose.long_term_partner.equals(strM154237c) && c18395a.getIsSelected()) {
                z = true;
            }
            if (IntlPurpose.short_term_fun.equals(strM154237c) && c18395a.getIsSelected()) {
                z2 = true;
            }
            if (setM115804a.contains(strM154237c) || ((IntlPurpose.long_but_short.equals(strM154237c) && z) || (IntlPurpose.short_but_long.equals(strM154237c) && z2))) {
                arrayList.add(c18395a);
            }
        }
        return arrayList;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public lhn.C18395a getItem(int i) {
        List<lhn.C18395a> listM149800L = m149800L();
        if (i < listM149800L.size()) {
            return listM149800L.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: N */
    public String m149802N() {
        lhn.C18395a c18395a = (lhn.C18395a) jyb.m147529r(this.f126888d, new qcj() { // from class: l.ehn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(IntlPurpose.long_but_short.equals(((lhn.C18395a) obj).getId()));
            }
        });
        if (c18395a.getIsSelected()) {
            return c18395a.getId();
        }
        lhn.C18395a c18395a2 = (lhn.C18395a) jyb.m147529r(this.f126888d, new qcj() { // from class: l.fhn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(IntlPurpose.short_but_long.equals(((lhn.C18395a) obj).getId()));
            }
        });
        if (c18395a2.getIsSelected()) {
            return c18395a2.getId();
        }
        for (lhn.C18395a c18395a3 : this.f126888d) {
            if (c18395a3.getIsSelected()) {
                return c18395a3.getId();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m149803O(lhn.C18395a c18395a, View view) {
        for (lhn.C18395a c18395a2 : this.f126888d) {
            if (!c18395a.getId().equals(IntlPurpose.long_term_partner) || !c18395a2.getId().equals(IntlPurpose.long_but_short)) {
                if (!c18395a.getId().equals(IntlPurpose.short_term_fun) || !c18395a2.getId().equals(IntlPurpose.short_but_long)) {
                    c18395a2.m154241g(false);
                }
            }
        }
        c18395a.m154241g(!c18395a.getIsSelected());
        notifyDataSetChanged();
        InterfaceC18165a interfaceC18165a = this.f126889e;
        if (interfaceC18165a != null) {
            interfaceC18165a.mo97883a(!TextUtils.isEmpty(m149802N()));
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m149804P(lhn.C18395a c18395a, View view) {
        c18395a.m154241g(!c18395a.getIsSelected());
        notifyDataSetChanged();
        InterfaceC18165a interfaceC18165a = this.f126889e;
        if (interfaceC18165a != null) {
            interfaceC18165a.mo97883a(!TextUtils.isEmpty(m149802N()));
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m149805Q(InterfaceC18165a interfaceC18165a) {
        this.f126889e = interfaceC18165a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        List<lhn.C18395a> listM149800L = m149800L();
        if (i >= listM149800L.size()) {
            return 0;
        }
        String strM154237c = listM149800L.get(i).getId();
        return (strM154237c.equals(IntlPurpose.long_but_short) || strM154237c.equals(IntlPurpose.short_but_long)) ? 1 : 0;
    }
}
