package p149l;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.data.IntlPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import p147v.VImage;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes11.dex */
public class kfn extends dac0<lfn.C18216a> {

    /* JADX INFO: renamed from: c */
    public final Act f122949c;

    /* JADX INFO: renamed from: d */
    public final List<lfn.C18216a> f122950d;

    /* JADX INFO: renamed from: e */
    public InterfaceC18004a f122951e;

    /* JADX INFO: renamed from: l.kfn$a */
    public interface InterfaceC18004a {
        /* JADX INFO: renamed from: a */
        void mo96266a(boolean z);
    }

    public kfn(Act act, List<lfn.C18216a> list) {
        this.f122949c = act;
        this.f122950d = list;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return m145867L().size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        Act act = this.f122949c;
        return i == 0 ? o7r.m163037a(act).inflate(e6c0.f89545d, viewGroup, false) : o7r.m163037a(act).inflate(e6c0.f89546e, viewGroup, false);
    }

    @Override // p149l.dac0
    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final lfn.C18216a c18216a, int i, int i2) {
        if (i == 0) {
            VImage vImage = (VImage) view.findViewById(s4c0.f162293F);
            VText_NoTopPadding vText_NoTopPadding = (VText_NoTopPadding) view.findViewById(s4c0.f162313Q);
            vImage.setImageResource(c18216a.getBigIcon());
            vText_NoTopPadding.setText(App.f15369e.getString(c18216a.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String()));
            if (c18216a.getIsSelected()) {
                view.setBackgroundResource(w2c0.f184206w);
            } else {
                view.setBackgroundResource(w2c0.f184204v);
            }
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.ifn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f113038a.m145870O(c18216a, view2);
                }
            });
            return;
        }
        VImage vImage2 = (VImage) view.findViewById(s4c0.f162354p0);
        VText_NoTopPadding vText_NoTopPadding2 = (VText_NoTopPadding) view.findViewById(s4c0.f162358r0);
        if (c18216a.getId().equals(IntlPurpose.long_but_short)) {
            vText_NoTopPadding2.setText(R$string.f17471n0);
        } else if (c18216a.getId().equals(IntlPurpose.short_but_long)) {
            vText_NoTopPadding2.setText(R$string.f17466m0);
        }
        if (c18216a.getIsSelected()) {
            vImage2.setImageResource(w2c0.f184178i);
            vText_NoTopPadding2.setTextColor(Color.parseColor(Constants.BLACK));
        } else {
            vImage2.setImageResource(w2c0.f184176h);
            vText_NoTopPadding2.setTextColor(Color.parseColor("#4D000000"));
        }
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.jfn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f117676a.m145871P(c18216a, view2);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public final List<lfn.C18216a> m145867L() {
        ArrayList arrayList = new ArrayList();
        lfn.C18216a c18216aOrElse = this.f122950d.stream().filter(new Predicate() { // from class: l.gfn
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return IntlPurpose.long_term_partner.equals(((lfn.C18216a) obj).getId());
            }
        }).findFirst().orElse(null);
        lfn.C18216a c18216aOrElse2 = this.f122950d.stream().filter(new Predicate() { // from class: l.hfn
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return IntlPurpose.short_term_fun.equals(((lfn.C18216a) obj).getId());
            }
        }).findFirst().orElse(null);
        Set setM111496a = dfn.m111496a(new Object[]{IntlPurpose.long_term_partner, IntlPurpose.short_term_fun, IntlPurpose.new_friends, IntlPurpose.not_sure_yet});
        boolean z = false;
        boolean z2 = false;
        for (lfn.C18216a c18216a : this.f122950d) {
            String strM149733c = c18216a.getId();
            if (IntlPurpose.long_but_short.equals(strM149733c) && c18216a.getIsSelected() && c18216aOrElse != null) {
                c18216aOrElse.m149737g(true);
            }
            if (IntlPurpose.short_but_long.equals(strM149733c) && c18216a.getIsSelected() && c18216aOrElse2 != null) {
                c18216aOrElse2.m149737g(true);
            }
            if (IntlPurpose.long_term_partner.equals(strM149733c) && c18216a.getIsSelected()) {
                z = true;
            }
            if (IntlPurpose.short_term_fun.equals(strM149733c) && c18216a.getIsSelected()) {
                z2 = true;
            }
            if (setM111496a.contains(strM149733c) || ((IntlPurpose.long_but_short.equals(strM149733c) && z) || (IntlPurpose.short_but_long.equals(strM149733c) && z2))) {
                arrayList.add(c18216a);
            }
        }
        return arrayList;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public lfn.C18216a getItem(int i) {
        List<lfn.C18216a> listM145867L = m145867L();
        if (i < listM145867L.size()) {
            return listM145867L.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: N */
    public String m145869N() {
        lfn.C18216a c18216a = (lfn.C18216a) vwb.m200346r(this.f122950d, new w9j() { // from class: l.efn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(IntlPurpose.long_but_short.equals(((lfn.C18216a) obj).getId()));
            }
        });
        if (c18216a.getIsSelected()) {
            return c18216a.getId();
        }
        lfn.C18216a c18216a2 = (lfn.C18216a) vwb.m200346r(this.f122950d, new w9j() { // from class: l.ffn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(IntlPurpose.short_but_long.equals(((lfn.C18216a) obj).getId()));
            }
        });
        if (c18216a2.getIsSelected()) {
            return c18216a2.getId();
        }
        for (lfn.C18216a c18216a3 : this.f122950d) {
            if (c18216a3.getIsSelected()) {
                return c18216a3.getId();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m145870O(lfn.C18216a c18216a, View view) {
        for (lfn.C18216a c18216a2 : this.f122950d) {
            if (!c18216a.getId().equals(IntlPurpose.long_term_partner) || !c18216a2.getId().equals(IntlPurpose.long_but_short)) {
                if (!c18216a.getId().equals(IntlPurpose.short_term_fun) || !c18216a2.getId().equals(IntlPurpose.short_but_long)) {
                    c18216a2.m149737g(false);
                }
            }
        }
        c18216a.m149737g(!c18216a.getIsSelected());
        notifyDataSetChanged();
        InterfaceC18004a interfaceC18004a = this.f122951e;
        if (interfaceC18004a != null) {
            interfaceC18004a.mo96266a(!TextUtils.isEmpty(m145869N()));
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m145871P(lfn.C18216a c18216a, View view) {
        c18216a.m149737g(!c18216a.getIsSelected());
        notifyDataSetChanged();
        InterfaceC18004a interfaceC18004a = this.f122951e;
        if (interfaceC18004a != null) {
            interfaceC18004a.mo96266a(!TextUtils.isEmpty(m145869N()));
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m145872Q(InterfaceC18004a interfaceC18004a) {
        this.f122951e = interfaceC18004a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        List<lfn.C18216a> listM145867L = m145867L();
        if (i >= listM145867L.size()) {
            return 0;
        }
        String strM149733c = listM145867L.get(i).getId();
        return (strM149733c.equals(IntlPurpose.long_but_short) || strM149733c.equals(IntlPurpose.short_but_long)) ? 1 : 0;
    }
}
