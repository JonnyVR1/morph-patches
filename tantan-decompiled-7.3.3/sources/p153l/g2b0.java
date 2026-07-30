package p153l;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.data.Tag;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p151v.VLinear_Dividers;
import p151v.VText;
import p151v.VText_Tags;

/* JADX INFO: loaded from: classes4.dex */
public class g2b0 extends ep90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f101819u;

    /* JADX INFO: renamed from: v */
    public VText f101820v;

    /* JADX INFO: renamed from: w */
    public VText_Tags f101821w;

    /* JADX INFO: renamed from: x */
    public List<Tag> f101822x;

    public g2b0(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
        this.f101822x = new ArrayList();
    }

    /* JADX INFO: renamed from: Y */
    private void m128602Y() {
        jyb.m147537z(jyb.m147507f0(this.f101821w), new y20() { // from class: l.z1b0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202500a.m128607a0((VText_Tags) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ SpannableStringBuilder m128603b0(List list, List list2, Integer num, Boolean bool) {
        return m121837H(list, num, bool, list2);
    }

    /* JADX INFO: renamed from: d0 */
    private ArrayList<Tag> m128604d0() {
        return jyb.m147522n(mo53983O().mo52252K2().profile.tags, new qcj() { // from class: l.a2b0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf("personality".equals(((Tag) obj).category));
            }
        });
    }

    @Override // p153l.ep90
    /* JADX INFO: renamed from: O */
    public t3m mo53983O() {
        return (t3m) this.f148056c;
    }

    /* JADX INFO: renamed from: X */
    public View m128605X(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return h2b0.m133373b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean m128606Z(VText_Tags vText_Tags, View view) {
        CoreDlg.m46231b(mo53983O().act(), vText_Tags.getText() instanceof Spanned ? e1b.m118963U0((Spanned) vText_Tags.getText()) : vText_Tags.getText().toString());
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m128607a0(final VText_Tags vText_Tags) {
        if (!mo53983O().mo52302m0()) {
            vText_Tags.setBackgroundDrawable(null);
        }
        vText_Tags.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.b2b0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f74599a.m128606Z(vText_Tags, view);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public ArrayList<Tag> mo128608c0() {
        return jyb.m147522n(mo53983O().mo53478me().profile.tags, new qcj() { // from class: l.f2b0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf("personality".equals(((Tag) obj).category));
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public void m128609e0() {
        final ArrayList arrayList;
        this.f101822x.clear();
        final ArrayList<Tag> arrayListMo128608c0 = mo128608c0();
        ArrayList<Tag> arrayListM128604d0 = m128604d0();
        if (mo53983O().mo52258P1()) {
            arrayList = new ArrayList();
        } else {
            Objects.requireNonNull(arrayListMo128608c0);
            ArrayList arrayListM147522n = jyb.m147522n(arrayListM128604d0, new c2b0(arrayListMo128608c0));
            arrayListMo128608c0 = jyb.m147522n(arrayListM128604d0, new qcj() { // from class: l.d2b0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!arrayListMo128608c0.contains((Tag) obj));
                }
            });
            arrayList = arrayListM147522n;
        }
        if (!jyb.m147479J(arrayList)) {
            this.f101822x.addAll(arrayList);
        }
        if (!jyb.m147479J(arrayListMo128608c0)) {
            this.f101822x.addAll(arrayListMo128608c0);
        }
        this.f101821w.setTags(new rcj() { // from class: l.e2b0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f91731a.m128603b0(arrayList, arrayListMo128608c0, (Integer) obj, (Boolean) obj2);
            }
        });
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        this.f101820v.setTextColor(mo53983O().act().getResources().getColor(c9c0.f80368Q1));
        if (mo53983O().mo52302m0()) {
            return;
        }
        m128602Y();
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        if (mo53983O().mo52302m0() || jyb.m147479J(m128604d0())) {
            return false;
        }
        List<String> list = mo53983O().mo52252K2().profile.extensions.interest.tags;
        mo53983O().mo52258P1();
        return true;
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m128605X(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        m128609e0();
    }
}
