package p009l;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.common.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import l.dac0;
import l.e6c0;
import l.s4c0;
import l.vwb;
import l.w2c0;
import l.w9j;
import l.xdl0;
import v.VImage;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class kfn extends dac0<lfn.C1015a> {

    /* JADX INFO: renamed from: c */
    public final Act f15647c;

    /* JADX INFO: renamed from: d */
    public final List<lfn.C1015a> f15648d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0996a f15649e;

    /* JADX INFO: renamed from: l.kfn$a */
    public interface InterfaceC0996a {
        /* JADX INFO: renamed from: a */
        void m17498a(boolean z);
    }

    public kfn(Act act, List<lfn.C1015a> list) {
        this.f15647c = act;
        this.f15648d = list;
    }

    /* JADX INFO: renamed from: C */
    public int m17489C() {
        return m17492L().size();
    }

    /* JADX INFO: renamed from: D */
    public View m17490D(ViewGroup viewGroup, int i) {
        Act act = this.f15647c;
        return i == 0 ? o7r.m19649a(act).inflate(e6c0.d, viewGroup, false) : o7r.m19649a(act).inflate(e6c0.e, viewGroup, false);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void m17488A(View view, final lfn.C1015a c1015a, int i, int i2) {
        if (i == 0) {
            VImage vImageFindViewById = view.findViewById(s4c0.F);
            VText_NoTopPadding vText_NoTopPaddingFindViewById = view.findViewById(s4c0.Q);
            vImageFindViewById.setImageResource(c1015a.getBigIcon());
            vText_NoTopPaddingFindViewById.setText(App.e.getString(c1015a.getName()));
            if (c1015a.getIsSelected()) {
                view.setBackgroundResource(w2c0.w);
            } else {
                view.setBackgroundResource(w2c0.v);
            }
            xdl0.E0(view, new View.OnClickListener() { // from class: l.ifn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f14604a.m17495O(c1015a, view2);
                }
            });
            return;
        }
        VImage vImageFindViewById2 = view.findViewById(s4c0.p0);
        VText_NoTopPadding vText_NoTopPaddingFindViewById2 = view.findViewById(s4c0.r0);
        if (c1015a.getId().equals("long-but-short")) {
            vText_NoTopPaddingFindViewById2.setText(R.string.n0);
        } else if (c1015a.getId().equals("short-but-long")) {
            vText_NoTopPaddingFindViewById2.setText(R.string.m0);
        }
        if (c1015a.getIsSelected()) {
            vImageFindViewById2.setImageResource(w2c0.i);
            vText_NoTopPaddingFindViewById2.setTextColor(Color.parseColor("#000000"));
        } else {
            vImageFindViewById2.setImageResource(w2c0.h);
            vText_NoTopPaddingFindViewById2.setTextColor(Color.parseColor("#4D000000"));
        }
        xdl0.E0(view, new View.OnClickListener() { // from class: l.jfn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f15101a.m17496P(c1015a, view2);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public final List<lfn.C1015a> m17492L() {
        ArrayList arrayList = new ArrayList();
        lfn.C1015a c1015aOrElse = this.f15648d.stream().filter(new Predicate() { // from class: l.gfn
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return "long-term-partner".equals(((lfn.C1015a) obj).getId());
            }
        }).findFirst().orElse(null);
        lfn.C1015a c1015aOrElse2 = this.f15648d.stream().filter(new Predicate() { // from class: l.hfn
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return "short-term-fun".equals(((lfn.C1015a) obj).getId());
            }
        }).findFirst().orElse(null);
        Set setM13315a = dfn.m13315a(new Object[]{"long-term-partner", "short-term-fun", "new-friends", "not-sure-yet"});
        boolean z = false;
        boolean z2 = false;
        for (lfn.C1015a c1015a : this.f15648d) {
            String id = c1015a.getId();
            if ("long-but-short".equals(id) && c1015a.getIsSelected() && c1015aOrElse != null) {
                c1015aOrElse.m17888g(true);
            }
            if ("short-but-long".equals(id) && c1015a.getIsSelected() && c1015aOrElse2 != null) {
                c1015aOrElse2.m17888g(true);
            }
            if ("long-term-partner".equals(id) && c1015a.getIsSelected()) {
                z = true;
            }
            if ("short-term-fun".equals(id) && c1015a.getIsSelected()) {
                z2 = true;
            }
            if (setM13315a.contains(id) || (("long-but-short".equals(id) && z) || ("short-but-long".equals(id) && z2))) {
                arrayList.add(c1015a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public lfn.C1015a getItem(int i) {
        List<lfn.C1015a> listM17492L = m17492L();
        if (i < listM17492L.size()) {
            return listM17492L.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: N */
    public String m17494N() {
        lfn.C1015a c1015a = (lfn.C1015a) vwb.r(this.f15648d, new w9j() { // from class: l.efn
            public final Object call(Object obj) {
                return Boolean.valueOf("long-but-short".equals(((lfn.C1015a) obj).getId()));
            }
        });
        if (c1015a.getIsSelected()) {
            return c1015a.getId();
        }
        lfn.C1015a c1015a2 = (lfn.C1015a) vwb.r(this.f15648d, new w9j() { // from class: l.ffn
            public final Object call(Object obj) {
                return Boolean.valueOf("short-but-long".equals(((lfn.C1015a) obj).getId()));
            }
        });
        if (c1015a2.getIsSelected()) {
            return c1015a2.getId();
        }
        for (lfn.C1015a c1015a3 : this.f15648d) {
            if (c1015a3.getIsSelected()) {
                return c1015a3.getId();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m17495O(lfn.C1015a c1015a, View view) {
        for (lfn.C1015a c1015a2 : this.f15648d) {
            if (!c1015a.getId().equals("long-term-partner") || !c1015a2.getId().equals("long-but-short")) {
                if (!c1015a.getId().equals("short-term-fun") || !c1015a2.getId().equals("short-but-long")) {
                    c1015a2.m17888g(false);
                }
            }
        }
        c1015a.m17888g(!c1015a.getIsSelected());
        notifyDataSetChanged();
        InterfaceC0996a interfaceC0996a = this.f15649e;
        if (interfaceC0996a != null) {
            interfaceC0996a.m17498a(!TextUtils.isEmpty(m17494N()));
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m17496P(lfn.C1015a c1015a, View view) {
        c1015a.m17888g(!c1015a.getIsSelected());
        notifyDataSetChanged();
        InterfaceC0996a interfaceC0996a = this.f15649e;
        if (interfaceC0996a != null) {
            interfaceC0996a.m17498a(!TextUtils.isEmpty(m17494N()));
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m17497Q(InterfaceC0996a interfaceC0996a) {
        this.f15649e = interfaceC0996a;
    }

    public int getItemViewType(int i) {
        List<lfn.C1015a> listM17492L = m17492L();
        if (i >= listM17492L.size()) {
            return 0;
        }
        String id = listM17492L.get(i).getId();
        return (id.equals("long-but-short") || id.equals("short-but-long")) ? 1 : 0;
    }
}
