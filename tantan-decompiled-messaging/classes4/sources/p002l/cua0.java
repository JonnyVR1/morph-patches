package p002l;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.data.Tag;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import l.dua0;
import l.e30;
import l.mcr;
import l.rza;
import l.vwb;
import l.w0c0;
import l.w9j;
import l.x9j;
import v.VLinear_Dividers;
import v.VText;
import v.VText_Tags;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cua0 extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f8940u;

    /* JADX INFO: renamed from: v */
    public VText f8941v;

    /* JADX INFO: renamed from: w */
    public VText_Tags f8942w;

    /* JADX INFO: renamed from: x */
    public List<Tag> f8943x;

    public cua0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f8943x = new ArrayList();
    }

    /* JADX INFO: renamed from: Y */
    private void m11358Y() {
        vwb.z(vwb.f0(new VText_Tags[]{this.f8942w}), new e30() { // from class: l.vta0
            public final void call(Object obj) {
                this.f21295a.m11363a0((VText_Tags) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ SpannableStringBuilder m11359b0(List list, List list2, Integer num, Boolean bool) {
        return m9643H(list, num, bool, list2);
    }

    /* JADX INFO: renamed from: d0 */
    private ArrayList<Tag> m11360d0() {
        return vwb.n(mo3351O().mo1517K2().profile.tags, new w9j() { // from class: l.wta0
            public final Object call(Object obj) {
                return Boolean.valueOf("personality".equals(((Tag) obj).category));
            }
        });
    }

    @Override // p002l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo3351O() {
        return (a1m) this.f12125c;
    }

    /* JADX INFO: renamed from: X */
    public View m11361X(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dua0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean m11362Z(VText_Tags vText_Tags, View view) {
        CoreDlg.b(mo3351O().act(), vText_Tags.getText() instanceof Spanned ? rza.U0((Spanned) vText_Tags.getText()) : vText_Tags.getText().toString());
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m11363a0(final VText_Tags vText_Tags) {
        if (!mo3351O().mo1570m0()) {
            vText_Tags.setBackgroundDrawable((Drawable) null);
        }
        vText_Tags.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.xta0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f22450a.m11362Z(vText_Tags, view);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public ArrayList<Tag> mo11364c0() {
        return vwb.n(mo3351O().mo2827me().profile.tags, new w9j() { // from class: l.bua0
            public final Object call(Object obj) {
                return Boolean.valueOf("personality".equals(((Tag) obj).category));
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public void m11365e0() {
        final ArrayList arrayList;
        this.f8943x.clear();
        final ArrayList<Tag> arrayListMo11364c0 = mo11364c0();
        ArrayList<Tag> arrayListM11360d0 = m11360d0();
        if (mo3351O().mo1523P1()) {
            arrayList = new ArrayList();
        } else {
            Objects.requireNonNull(arrayListMo11364c0);
            ArrayList arrayListN = vwb.n(arrayListM11360d0, new w9j() { // from class: l.yta0
                public final Object call(Object obj) {
                    return Boolean.valueOf(arrayListMo11364c0.contains((Tag) obj));
                }
            });
            arrayListMo11364c0 = vwb.n(arrayListM11360d0, new w9j() { // from class: l.zta0
                public final Object call(Object obj) {
                    return Boolean.valueOf(!arrayListMo11364c0.contains((Tag) obj));
                }
            });
            arrayList = arrayListN;
        }
        if (!vwb.J(arrayList)) {
            this.f8943x.addAll(arrayList);
        }
        if (!vwb.J(arrayListMo11364c0)) {
            this.f8943x.addAll(arrayListMo11364c0);
        }
        this.f8942w.setTags(new x9j() { // from class: l.aua0
            public final Object call(Object obj, Object obj2) {
                return this.f7885a.m11359b0(arrayList, arrayListMo11364c0, (Integer) obj, (Boolean) obj2);
            }
        });
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        this.f8941v.setTextColor(mo3351O().act().getResources().getColor(w0c0.P1));
        if (mo3351O().mo1570m0()) {
            return;
        }
        m11358Y();
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        if (mo3351O().mo1570m0() || vwb.J(m11360d0())) {
            return false;
        }
        List list = mo3351O().mo1517K2().profile.extensions.interest.tags;
        mo3351O().mo1523P1();
        return true;
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m11361X(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        m11365e0();
    }
}
